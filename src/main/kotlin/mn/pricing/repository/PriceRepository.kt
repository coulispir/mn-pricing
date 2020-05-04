package mn.pricing.repository

import io.micronaut.data.annotation.Repository
import io.micronaut.data.repository.CrudRepository
import mn.pricing.domain.model.Price

@Repository
interface PriceRepository : CrudRepository<Price, Long> {
}