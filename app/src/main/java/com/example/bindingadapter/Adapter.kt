package com.example.bindingadapter


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.bindingadapter.databinding.CardBinding

class Adapter(var list:ArrayList<DataModel>):RecyclerView.Adapter<Adapter.ViewHolder>() {
    inner class ViewHolder(val  cardBinding: CardBinding):RecyclerView.ViewHolder(cardBinding.root){
fun bind(dataModel: DataModel){
    cardBinding.datamodel=dataModel
}
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(CardBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
    val out=list[position]
        holder.bind(out)
    }

    override fun getItemCount(): Int {
        return list.size
    }
}