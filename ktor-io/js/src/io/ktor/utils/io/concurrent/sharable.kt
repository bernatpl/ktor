/*
 * Copyright 2014-2020 JetBrains s.r.o and contributors. Use of this source code is governed by the Apache 2.0 license.
 */

package io.ktor.utils.io.concurrent

import kotlin.properties.*
import kotlin.reflect.*

actual inline fun <T> sharable(value: T): ReadWriteProperty<Any, T> = object : ReadWriteProperty<Any, T> {
    private var value: T = value

    override fun getValue(thisRef: Any, property: KProperty<*>): T {
        return this.value
    }

    override fun setValue(thisRef: Any, property: KProperty<*>, value: T) {
        this.value = value
    }
}
