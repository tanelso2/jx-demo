package com.tanelso2.demo

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class PingController {
    @RequestMapping("/ping")
    fun ping(): String = "pong!"
}