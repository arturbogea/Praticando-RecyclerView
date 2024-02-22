package com.arturbogea.entendendorecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class MensagemAdapter(private val lista: List<Mensagem>) : Adapter<MensagemAdapter.MensagemViewHolder>() {
    // O adapter precisa que seja falado qual é a classe que vai guardar/armazenar/manipular, o item_lista criado. A classe obrigatoriamente deverá herdar de viewHolder. E o viewHolder exige que passe qual a view que será utilizada

    //Vou criar uma inner class, que será uma ViewHolder. Onde armazenará a view criei no item_lista.
    //Como o item_lista não está vinculado a nenhum codigo. Ele ficará associado a inner class criada

    //Criei um atributo itemview do tipo View, e passei como parametro para o viewHolder, pois ele espera um view
    inner class MensagemViewHolder(val itemView: View) : ViewHolder(itemView){
        // Aqui vou passar os ids do item_lista.

        val textNome: TextView = itemView.findViewById(R.id.text_nome) // Criei esse atributo aqui, pois fica mais facil e já configurado, de eu acessar nos metodos abaixo.
        val textUltima: TextView = itemView.findViewById(R.id.text_ultima)
        val textHorario: TextView = itemView.findViewById(R.id.text_horario)

    }

    //Para que o MensagemAdapter seja considerado um do tipo adapter, ele precisa implementar 3 metodos. São os metodos abaixo. Cada um metodo, tem uma função especifica do que irá realizar

    //Esse metodo signifca, ao criar o View Holder. Ele vai criar a visualização
    //Como ele retorna o MensagemViewHolder, ele precisa que retorne um itemView. Para isso, irei converter o xml do item_lista
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MensagemViewHolder { // Como não tem um LayoutInflater, irei precisar construir um

        var layoutInflater = LayoutInflater.from(parent.context)

        val itemView = layoutInflater.inflate(R.layout.item_lista, parent, false)

        //Apos converter o xml em um objeto view, irei passar abaixo
        return MensagemViewHolder(itemView)
    }

    //Esse metodo significa ao vincular os dados para view holder/para a visualização. Ele pega os dados e vincula os dados em cada item da lista.
    override fun onBindViewHolder(holder: MensagemViewHolder, position: Int) {
        val mensagem = lista[position] //aqui criei uma variavel nome, que recebe a lista na position. A position está sendo passada como parametro
        //Como os atributos já foram iniciados lá na inner class, posso puxar eles aqui.
        holder.textNome.text = mensagem.nome
        holder.textUltima.text = mensagem.ultima
        holder.textHorario.text = mensagem.horario


    }

    //Esse metodo é para recuperar a quantidade de itens.
    //Na Activity RecyclerView, ele vai precisar dessa informação, de quantos itens são criados para montar a quantidade de layouts
    override fun getItemCount(): Int {
        return lista.size
    }

}