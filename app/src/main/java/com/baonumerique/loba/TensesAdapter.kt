package com.baonumerique.loba

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView

class TensesAdapter(private val sectionList : ArrayList<Tenses>) : RecyclerView.Adapter<TensesAdapter.MyViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_item,
        parent, false)
        return MyViewHolder(itemView)

    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = sectionList[position]
        holder.sectionImage.setImageResource(currentItem.sectionImage)
        holder.tvHeading.text = currentItem.sectionHeading
        holder.itemView.setOnClickListener(object :View.OnClickListener{
            override fun onClick(v: View?) {

                val activity = v!!.context as AppCompatActivity
                val presentTenseFragment = PresentTenseFragment()
                activity.supportFragmentManager.beginTransaction().replace(R.id.drawerLayout,presentTenseFragment).addToBackStack(null).commit()

            }

        })

    }

    override fun getItemCount(): Int {
        return sectionList.size
    }

    class MyViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        val sectionImage : ImageView = itemView.findViewById(R.id.sectionImage)
        val tvHeading : TextView = itemView.findViewById(R.id.sectionHeading)


    }

}