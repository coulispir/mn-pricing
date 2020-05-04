package mn.pricing.service

import mn.pricing.domain.enum.Currency
import mn.pricing.domain.model.Price
import mn.pricing.repository.PriceRepository
import org.slf4j.LoggerFactory
import java.math.BigDecimal
import javax.inject.Singleton

@Singleton
class PriceServiceImpl(val priceRepository: PriceRepository) : PriceService {

  private val LOG = LoggerFactory.getLogger(this::class.java)

  override fun get(): Price {
    LOG.info("Getting Price from Service..")
    return Price(
        amount = BigDecimal.ONE,
        currency = Currency.EUR
    )
  }

  override fun save(price: Price): Price {
    LOG.info("Saving Price at Service..")
    return priceRepository.save(price)
  }
}