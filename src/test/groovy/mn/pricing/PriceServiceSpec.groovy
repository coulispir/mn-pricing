package mn.pricing

import io.micronaut.test.annotation.MicronautTest
import io.micronaut.test.annotation.MockBean
import mn.pricing.domain.exception.PriceException
import mn.pricing.domain.model.Price
import mn.pricing.repository.PriceRepository
import mn.pricing.service.PriceService
import mn.pricing.service.PriceServiceImpl
import spock.lang.Specification
import spock.lang.Unroll

@MicronautTest()
class PriceServiceSpec extends Specification {

  private static final NULL = null
  private static final Price price = new Price(NULL, BigDecimal.ZERO, mn.pricing.domain.enum.Currency.EUR)
  private static final ERROR = "Error"

  PriceRepository priceRepository = Mock()
  PriceService priceService

  void setup() {
    priceService = new PriceServiceImpl(priceRepository)
  }

  @Unroll
  void "should throw an exception when price is negative or zero"() {
    when:
      priceService.save(price)
    then:
      PriceException exception = thrown(PriceException)
      assert exception.message == ERROR
  }

  @MockBean(PriceServiceImpl)
  PriceService priceService() {
    Mock(PriceService)
  }
}
