package com.finance.deals.repository

import org.springframework.data.repository.CrudRepository
import com.finance.deals.model.FixedIncomeDeals
import org.springframework.data.rest.core.annotation.RepositoryRestResource
@RepositoryRestResource(collectionResourceRel = "deals", path = "deals")
interface FixedIncomeDealsRepository : CrudRepository <FixedIncomeDeals, Long >{
}
