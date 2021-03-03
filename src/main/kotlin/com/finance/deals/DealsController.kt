package com.finance.deals

import com.finance.deals.repository.FixedIncomeDealsRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/")

class DealsController (private val repository: FixedIncomeDealsRepository) {
    @GetMapping("deals")
    fun getDeals() = repository.findAll()
}