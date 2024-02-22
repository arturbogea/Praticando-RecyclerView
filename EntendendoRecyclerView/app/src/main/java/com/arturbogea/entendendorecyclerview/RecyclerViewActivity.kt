package com.arturbogea.entendendorecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewActivity : AppCompatActivity() {

    private lateinit var rvLista: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)

        val lista = listOf(Mensagem("Artur", "Amor, o que você quer que eu leve para célula?", "18:35"),
                           Mensagem("Lia", "Amor, tras refrigerante e aqui pedimos pizza. Ta?", "19:02"),
                           Mensagem("Enrico", "Não esquece dos meus petiscos rsrs", "19:12"),
                           Mensagem("Clarice", "Paizinho, tras Toddy para mim, por favor??", "19:15"),
                            Mensagem("Lorenzo", "Pai, a mamãe pediu para trazer suco", "19:25")
        )


        rvLista = findViewById(R.id.rv_lista)

        //Vou configurar o adapter
        // Vou instanciar a classe Mensagem Adapter. Onde irei realizar toda a configuração do adapter
        rvLista.adapter = MensagemAdapter(lista) // O MensagemAdapter atualmente é do tipo MensagemAdapter, mas ele tem que ser do tipo Adapter. No MensagemAdapter, irei realizar toda a configuração

        //Definir o LayoutManager
        rvLista.layoutManager = LinearLayoutManager(this)
    }
}