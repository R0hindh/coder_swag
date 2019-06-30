package com.rohindh.coderswag.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.rohindh.coderswag.R
import com.rohindh.coderswag.model.Product
import org.w3c.dom.Text

class ProductRecyclerAdapter(val context: Context,val products: List<Product>) : RecyclerView.Adapter<ProductRecyclerAdapter.Holder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(context).inflate(R.layout.product_list_view,parent,false)
        return Holder(view)
    }

    override fun getItemCount(): Int {
        return products.count()
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        return holder.bindHolder(products[position],context)
    }

    inner class Holder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val productImage = itemView.findViewById<ImageView>(R.id.productImage)
        val productName = itemView.findViewById<TextView>(R.id.productName)
        val productPrice = itemView.findViewById<TextView>(R.id.productPrice)
        fun bindHolder (product: Product,context: Context){
            val resourceId = context.resources.getIdentifier(product.image,"drawable", context.packageName)
            productImage.setImageResource(resourceId)
            productName.text = product.title
            productPrice.text = product.Price
        }
    }

}