package mn.pricing.domain.model

import mn.pricing.domain.enum.Currency
import java.math.BigDecimal
import java.util.*
import javax.persistence.*

@Entity
@Table(name = "price")
data class Price(

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: UUID? = null,
    var amount: BigDecimal,
    var currency: Currency
)