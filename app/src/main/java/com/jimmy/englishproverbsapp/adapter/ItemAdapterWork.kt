package com.jimmy.englishproverbsapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.jimmy.englishproverbsapp.R
import com.jimmy.englishproverbsapp.fragment.WorkFragment
import com.jimmy.englishproverbsapp.model.Work

//The adapter takes a Work instance from the list returned by
// loadWork(), and turns it into a list item view,
// so that it can be displayed in the RecyclerView.
class ItemAdapterWork (private val context: WorkFragment, private val dataset: List<Work>) : RecyclerView.Adapter<ItemAdapterWork.ItemViewHolder>() {

    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.item_title)
        val imageView: ImageView = view.findViewById(R.id.item_image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)

        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.textView.text =  context.resources.getString(item.stringResourceId)
        holder.imageView.setImageResource(item.imageResourceId)
    }

    override fun getItemCount() = dataset.size
}