package com.entity

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "some_table")
data class SomeEntity(
    @Id val someNumber: Int,
    val someText: String,
    val someBool: Boolean
)