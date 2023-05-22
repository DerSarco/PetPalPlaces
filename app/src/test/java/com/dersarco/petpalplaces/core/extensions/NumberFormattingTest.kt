package com.dersarco.petpalplaces.core.extensions

import junit.framework.Assert.assertEquals
import org.junit.Test


internal class NumberFormattingTest {

    @Test
    fun testFormatNumber() {
        assertEquals("0", 0.formatNumber())
        assertEquals("500", 500.formatNumber())
        assertEquals("999", 999.formatNumber())

        assertEquals("1k", 1000.formatNumber())
        assertEquals("1.5k", 1500.formatNumber())
        assertEquals("10k", 10000.formatNumber())
        assertEquals("999.9k", 999900.formatNumber())

        assertEquals("1M", 1000000.formatNumber())
        assertEquals("1G", 1000000000.formatNumber())

    }

    @Test
    fun testFormatWithCommas() {
        assertEquals("0", 0.formatWithCommas())
        assertEquals("500", 500.formatWithCommas())
        assertEquals("999", 999.formatWithCommas())
        assertEquals("1,000", 1000.formatWithCommas())
        assertEquals("1,500", 1500.formatWithCommas())
        assertEquals("10,000", 10000.formatWithCommas())
        assertEquals("999,900", 999900.formatWithCommas())
        assertEquals("1,000,000", 1000000.formatWithCommas())
        assertEquals("1,000,000,000", 1000000000.formatWithCommas())
    }
}