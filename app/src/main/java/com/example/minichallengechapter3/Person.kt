package com.example.minichallengechapter3

import java.io.Serializable

data class Person (
    val nama_lengkap: String?,
    val nama_panggilan: String?,
    val usia: Int?,
    val alamat: String?
        ) : Serializable