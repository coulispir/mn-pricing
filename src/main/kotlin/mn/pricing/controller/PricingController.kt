package mn.pricing.controller

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Post
import mn.pricing.domain.enum.Currency
import mn.pricing.domain.model.Price
import mn.pricing.service.PriceService
import org.slf4j.LoggerFactory
import java.math.BigDecimal
import javax.inject.Inject

@Controller("/pricing")
class PricingController(@Inject val priceService: PriceService) {

  private val LOG = LoggerFactory.getLogger(this::class.java)

  @Get
  fun get(): String {
    LOG.info("Getting Price from Controller..")
    priceService.get()
    return "Pricing"
  }

  @Post
  fun save(): Price {
    val price = Price(
        amount = BigDecimal.ONE,
        currency = Currency.EUR
    )
    LOG.info("Posting Price from Controller..")
    return priceService.save(price)
  }
}