package com.finance.deals.model
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name="FIXED_INCOME_DEALS")
data class FixedIncomeDeals (

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        var fixedIncomeDealId: Long = -1,

        @Column(name = "dealName")
        var dealName: String = "",

        @Column(name = "interestRate")
        var interestRate: Long = -1,

){  }





/*@Entity
@Table(name="PARK_RUNNER")
data class ParkRunner (

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        var parkRunId: Long = -1,

        @Column(name = "firstName")
        var firstName: String = "",

        @Column(name = "lastName")
        var lastName: String = "",

        @Column(name = "gender")
        var gender: String = "",

        @Column(name = "runningClub")
        var runningClub: String = "",

        @Column(name = "totalRuns")
        var totalRuns: String = "0"

){  }*/