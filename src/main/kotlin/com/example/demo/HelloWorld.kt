package com.example.demo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloWorld {
    @GetMapping ("/add/{leftNumber}/{rightNumber}")
    fun add(@PathVariable("leftNumber") leftNumber: Long, @PathVariable("rightNumber") rightNumber: Long): Long {
        return leftNumber + rightNumber
    }
    @GetMapping ("/minus/{leftNumber}/{rightNumber}")
    fun minus(@PathVariable("leftNumber")leftNumber: Long, @PathVariable("rightNumber") rightNumber: Long) : Long {
        return leftNumber - rightNumber
    }
    @GetMapping ("/multiply/{leftNumber}/{rightNumber}")
    fun multiply(@PathVariable("leftNumber")leftNumber: Long, @PathVariable("rightNumber") rightNumber: Long) : Long{
        return leftNumber * rightNumber
    }
    @GetMapping("/divide/{leftNumber}/{rightNumber}")
    fun divide(@PathVariable("leftNumber")leftNumber: Long, @PathVariable("rightNumber") rightNumber: Long) : Long{
        return leftNumber / rightNumber
    }
    @GetMapping("/square/{leftNumber}/{rightNumber}")
    fun squared(@PathVariable("leftNumber")leftNumber: Long, @PathVariable("rightNumber")rightNumber: Long) : Long{
        var result: Long = leftNumber
        for (i in 1 until rightNumber) {
            result *= leftNumber
        }

        val conditionNum: Long = 0
        if (rightNumber == conditionNum)
            return 1

        return result
    }

}