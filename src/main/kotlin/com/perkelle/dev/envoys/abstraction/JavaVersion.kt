package com.perkelle.dev.envoys.abstraction

@Deprecated("No longer used by Envoys")
object JavaVersion {
    val version: Int by lazy {
        // Old versions were 1.8
        // New versions are 11, 16, etc
        System.getProperty("java.specification.version").toIntOrNull() ?: 8
    }
}