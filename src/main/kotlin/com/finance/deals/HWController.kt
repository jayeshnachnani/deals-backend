package com.finance.deals

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/hello")


class HWController {

    @GetMapping("springboot")
    fun HW():String = "Hello howdy, REST Endpoint"
}