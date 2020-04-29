package mn.pricing.controller

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import org.slf4j.LoggerFactory

@Controller("/pricing")
class PricingController {

  private val LOG = LoggerFactory.getLogger(this::class.java)

  @Get
  fun get(): String {
    LOG.info("Getting Pricing..")
    return "Pricing"
  }
}