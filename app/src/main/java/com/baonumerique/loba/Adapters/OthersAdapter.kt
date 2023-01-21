package com.baonumerique.loba.Adapters

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.baonumerique.loba.R
import com.baonumerique.loba.dataClasses.Others
import fragments.DaysMonthsYearsFragment
import fragments.OthersFragment


class OthersAdapter(private val imageList : Array<Int>, private val sectionList : Array<String>) : RecyclerView.Adapter<OthersAdapter.MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        val itemView = LayoutInflater.from(parent.context).inflate(
            R.layout.others_list_item,
            parent, false)
        return MyViewHolder(itemView)

    }

    override fun onBindViewHolder(holder: MyViewHolder, @SuppressLint("RecyclerView") position: Int) {
        val currentItem = sectionList[position]
        holder.ivImage.setImageResource(imageList[position])
        holder.tvsection.text = sectionList[position].toString()
        holder.itemView.setOnClickListener(object :View.OnClickListener {
            override fun onClick(v: View?) {

                if (position == 0) {
                    val activity = v!!.context as AppCompatActivity
                    val daysMonthsYearsFragment = DaysMonthsYearsFragment()
                    activity.supportFragmentManager.beginTransaction()
                        .replace(R.id.othersFragment, daysMonthsYearsFragment).addToBackStack(null).commit()



                }


            }

        })

    }

    override fun getItemCount(): Int {
        return sectionList.size
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val ivImage = itemView.findViewById<ImageView>(R.id.othersImage)
        val tvsection = itemView.findViewById<TextView>(R.id.othersHeading)

    }
}