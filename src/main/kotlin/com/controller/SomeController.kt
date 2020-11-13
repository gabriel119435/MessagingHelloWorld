package com.controller

import com.entity.SomeEntity
import com.repo.SomeRepo
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("someEntity")
class SomeController(
    val someRepo: SomeRepo
) {
    @GetMapping
    fun findAll(): List<SomeEntity> = someRepo.findAll()
}