package com.baonumerique.loba.Adapters

import android.annotation.SuppressLint
import android.media.MediaPlayer
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.baonumerique.loba.R
import com.baonumerique.loba.dataClasses.Vocabulary
import fragments.VocabularyFragment

class vocabularyAdapter(val sourceWord: Array<String>, val targetWord: Array<String>, val sound : Array<Int> ) : RecyclerView.Adapter<vocabularyAdapter.MyViewHolder>() {

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvSourceWord = itemView.findViewById<TextView>(R.id.inEnglishOrFrench)
        val tvLingala = itemView.findViewById<TextView>(R.id.inLingala)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.vocabulary_item, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, @SuppressLint("RecyclerView") position: Int) {
        holder.tvSourceWord.text = sourceWord[position].toString()
        holder.tvLingala.text = targetWord[position]
        holder.itemView.setOnClickListener(object :View.OnClickListener {

            override fun onClick(v: View?) {
                if (position == 0) {
                    val mediaPlayer = MediaPlayer.create(holder.itemView.context, sound[position])
                    mediaPlayer.start()
                }

                else if (position == 1) {
                    val mediaPlayer = MediaPlayer.create(holder.itemView.context, sound[position])
                    mediaPlayer.start()
                }


                else if (position == 2) {
                    val mediaPlayer = MediaPlayer.create(holder.itemView.context, sound[position])
                    mediaPlayer.start()
                }



            }





        })

    }




    override fun getItemCount(): Int {
        return sourceWord.size

    }


}



