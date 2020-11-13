package com.repo

import com.entity.SomeEntity
import org.springframework.data.jpa.repository.JpaRepository

interface SomeRepo : JpaRepository<SomeEntity, Int>