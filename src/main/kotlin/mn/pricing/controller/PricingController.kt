package mn.pricing.controller

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import mn.pricing.service.PriceService
import org.slf4j.LoggerFactory
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
}