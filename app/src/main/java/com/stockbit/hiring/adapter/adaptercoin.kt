package com.stockbit.hiring.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.stockbit.hiring.R
import com.stockbit.hiring.model.Base

class AdapterCoin(private val listDataCoins: List<Base.Data1444312029>) : RecyclerView.Adapter<AdapterCoin.ListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_coin, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        holder.bind(listDataCoins[position])

    }

    override fun getItemCount(): Int = listDataCoins.size

    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(itemsItem: Base.Data1444312029) {
            with(itemView){
                val tvName = findViewById<TextView>(R.id.tvName)
                val tvNameLengkap = findViewById<TextView>(R.id.tvNameLengkap)
                val tvPrice = findViewById<TextView>(R.id.tvPrice)
                val tvChange = findViewById<TextView>(R.id.tvChange)
                tvName.text = itemsItem.CoinInfo!!.Name
                tvNameLengkap.text = itemsItem.CoinInfo!!.FullName
                //tvPrice.text = itemsItem?.DISPLAY!!.IDR!!.PRICE.toString()
               // tvChange.text = itemsItem?.DISPLAY!!.IDR!!.CHANGEPCTHOUR.toString()+" %"

            }
        }
    }
}