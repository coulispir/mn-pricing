package mn.pricing.service

import mn.pricing.domain.enum.Currency
import mn.pricing.domain.model.Price
import org.slf4j.LoggerFactory
import java.math.BigDecimal
import javax.inject.Singleton

@Singleton
class PriceServiceImpl : PriceService {

  private val LOG = LoggerFactory.getLogger(this::class.java)

  override fun get(): Price {
    LOG.info("Getting Price from Service..")
    return Price(
        amount = BigDecimal.ONE,
        currency = Currency.EUR
    )
  }
}