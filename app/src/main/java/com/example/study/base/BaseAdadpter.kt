package com.example.study.base

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

/**
 * @author Pardeep Singh
 * @since 11/10/19
 * <h1>BaseAdadpter</h1>
 *  <p>Description of class</p>
 */
abstract class BaseAdadpter<T>(var list: ArrayList<T>, val item: Int) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return setViewHolder(parent)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        onBindData(holder, list[position])
    }

    fun updateAdapter(list: ArrayList<T>) {
        this.list = list
        notifyDataSetChanged()
    }

    fun clearAdapter() {
        list.clear()
        notifyDataSetChanged()
    }

    fun removeItemAdapter(position: Int) {
        list.removeAt(position)
        notifyItemRemoved(position)
    }

    fun updateItemAdapter(item: T, position: Int) {
        list[position] = item
        notifyItemChanged(position)
    }

    fun setViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(item, parent, false)
        return GenericViewHolder(view)
    }

    abstract fun onBindData(holder: RecyclerView.ViewHolder, position: T)

    inner class GenericViewHolder(item: View) : RecyclerView.ViewHolder(item)
}