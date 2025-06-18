package com.example.trocabem.model

data class Item(
    val id: Int,
    val nome: String,
    val descricao: String,
    val categoria: String,
    val fotos: List<String>,
    val estadoConservacao: String,
    val dataCadastro: Long,
    val disponivel: Boolean,
    val nomeUsuario: String,
    val idadeUsuario: Int,
    val localizacao: String,
    val distancia: String
)