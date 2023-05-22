package com.dersarco.petpalplaces.core.extensions

fun Int.formatNumber(): String {
    val suffixes = listOf("", "k", "M", "G", "T", "P", "E", "Z", "Y")
    val base = 1000

    if (this < base) {
        return this.toString()
    }

    val exp = (Math.log10(this.toDouble()) / Math.log10(base.toDouble())).toInt()
    val value = this / Math.pow(base.toDouble(), exp.toDouble())

    return when {
        value % 1 == 0.0 -> "${value.toInt()}${suffixes[exp]}"
        else -> "${"%.1f".format(value)}${suffixes[exp]}"
    }
}

fun Int.formatWithCommas(): String {
    return String.format("%,d", this)
}