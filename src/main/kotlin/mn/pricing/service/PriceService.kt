package mn.pricing.service

import mn.pricing.domain.model.Price

interface PriceService {

  fun get ():Price
}