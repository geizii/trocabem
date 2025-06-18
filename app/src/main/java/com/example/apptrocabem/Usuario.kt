package com.example.trocabem.model

data class Usuario(
    val id: Int,
    val nome: String,
    val email: String,
    val telefone: String,
    val senha: String,
    val localizacao: String,
    val foto: String
)
