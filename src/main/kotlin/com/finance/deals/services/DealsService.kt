package com.finance.deals.services
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service
import java.util.*




import com.finance.deals.model.FixedIncomeDeals
import org.springframework.data.repository.CrudRepository

class DealsService{}

/*@Service//declare this class as a Service "Component specialization"
/*injects DAO objects by constructor & implements BasicCrud interface*/
class DealsService(val bookDAO: BookDAO):DealsRepository {

    override fun findAll(pageable: Pageable): Page<FixedIncomeDeals> = findAll(pageable)
}

interface DealsRepository : CrudRepository<FixedIncomeDeals, Long>{}*/