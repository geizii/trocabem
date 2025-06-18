package com.example.trocabem

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.trocabem.adapter.ItemAdapter
import com.example.trocabem.databinding.ActivityItemsListBinding
import com.example.trocabem.model.Item

class ItemsListActivity : AppCompatActivity() {
    private lateinit var binding: ActivityItemsListBinding
    private lateinit var itemAdapter: ItemAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityItemsListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupRecyclerView()
        loadItems()
    }

    private fun setupRecyclerView() {
        itemAdapter = ItemAdapter { item ->
            // Handle item click
        }
        binding.recyclerViewItems.apply {
            adapter = itemAdapter
            layoutManager = LinearLayoutManager(this@ItemsListActivity)
        }
    }

    private fun loadItems() {
        // Dados de exemplo baseados na imagem
        val items = listOf(
            Item(
                id = 1,
                nome = "Poncho de Crochê",
                descricao = "Poncho artesanal em crochê, cor bege",
                categoria = "Roupas",
                fotos = listOf("poncho_image"),
                estadoConservacao = "Muito Bom",
                dataCadastro = System.currentTimeMillis(),
                disponivel = true,
                nomeUsuario = "Carla",
                idadeUsuario = 29,
                localizacao = "Tijuca",
                distancia = "2 kilometers away"
            )
        )
        itemAdapter.submitList(items)
    }
}