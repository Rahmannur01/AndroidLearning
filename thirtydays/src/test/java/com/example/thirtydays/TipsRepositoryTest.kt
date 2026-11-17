package com.example.thirtydays

import com.example.thirtydays.data.TipsRepository
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test

class TipsRepositoryTest {
    @Test
    fun repositoryContainsThirtySequentialDays() {
        val tips = TipsRepository.tips

        assertEquals(30, tips.size)
        assertEquals((1..30).toList(), tips.map { it.day })
        assertTrue(tips.all { it.titleRes != 0 && it.descriptionRes != 0 && it.imageRes != 0 })
    }
}

