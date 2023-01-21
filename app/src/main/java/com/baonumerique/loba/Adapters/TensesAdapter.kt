package com.baonumerique.loba

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import fragments.*

class TensesAdapter(private val sectionList : ArrayList<Tenses>) : RecyclerView.Adapter<TensesAdapter.MyViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_item,
        parent, false)
        return MyViewHolder(itemView)

    }

    override fun onBindViewHolder(holder: MyViewHolder, @SuppressLint("RecyclerView") position: Int) {
        val currentItem = sectionList[position]
        holder.sectionImage.setImageResource(currentItem.sectionImage)
        holder.tvHeading.text = currentItem.sectionHeading
        holder.itemView.setOnClickListener(object :View.OnClickListener{
            override fun onClick(v: View?) {

                if (position == 0) {

                    val activity = v!!.context as AppCompatActivity
                    val presentTenseFragment = PresentTenseFragment()
                    activity.supportFragmentManager.beginTransaction()
                        .replace(R.id.tensesFragment, presentTenseFragment).addToBackStack(null)
                        .commit()
                }

                else if (position == 1) {
                    val activity = v!!.context as AppCompatActivity
                    val presentContinuousFragment = PresentContinuousFragment()
                    activity.supportFragmentManager.beginTransaction()
                        .replace(R.id.tensesFragment, presentContinuousFragment).addToBackStack(null)
                        .commit()

                }

                else if (position == 2) {
                    val activity = v!!.context as AppCompatActivity
                    val presentPerfectFragment = PresentPerfectFragment()
                    activity.supportFragmentManager.beginTransaction()
                        .replace(R.id.tensesFragment, presentPerfectFragment)
                        .addToBackStack(null)
                        .commit()
                }

                else if (position == 3) {
                    val activity = v!!.context as AppCompatActivity
                    val simplePastFragment = SimplePastFragment()
                    activity.supportFragmentManager.beginTransaction()
                        .replace(R.id.tensesFragment, simplePastFragment)
                        .addToBackStack(null)
                        .commit()
                }

                else if (position == 4) {
                    val activity = v!!.context as AppCompatActivity
                    val pastPerfectFragment = PastPerfectFragment()
                    activity.supportFragmentManager.beginTransaction()
                        .replace(R.id.tensesFragment, pastPerfectFragment)
                        .addToBackStack(null)
                        .commit()
                }

                else if (position == 5) {
                    val activity = v!!.context as AppCompatActivity
                    val pastPerfectContinuous = PastPerfectContinuousFragment()
                    activity.supportFragmentManager.beginTransaction()
                        .replace(R.id.tensesFragment, pastPerfectContinuous)
                        .addToBackStack(null)
                        .commit()
                }

                else if (position == 6) {
                    val activity = v!!.context as AppCompatActivity
                    val immediatePast = ImmediatePastFragment()
                    activity.supportFragmentManager.beginTransaction()
                        .replace(R.id.tensesFragment, immediatePast)
                        .addToBackStack(null)
                        .commit()
                }

                else if (position == 7) {
                    val activity = v!!.context as AppCompatActivity
                    val pastContinuous = PastContinuousFragment()
                    activity.supportFragmentManager.beginTransaction()
                        .replace(R.id.tensesFragment, pastContinuous)
                        .addToBackStack(null)
                        .commit()
                }

                else if (position == 8) {
                    val activity = v!!.context as AppCompatActivity
                    val future = FutureFragment()
                    activity.supportFragmentManager.beginTransaction()
                        .replace(R.id.tensesFragment, future)
                        .addToBackStack(null)
                        .commit()
                }

                else if (position == 9) {
                    val activity = v!!.context as AppCompatActivity
                    val imperative = ImperativeFragment()
                    activity.supportFragmentManager.beginTransaction()
                        .replace(R.id.tensesFragment, imperative)
                        .addToBackStack(null)
                        .commit()
                }

                else if (position == 10) {
                    val activity = v!!.context as AppCompatActivity
                    val subjunctive = SubjunctiveFragment()
                    activity.supportFragmentManager.beginTransaction()
                        .replace(R.id.tensesFragment, subjunctive)
                        .addToBackStack(null)
                        .commit()
                }

                else if (position == 11) {
                    val activity = v!!.context as AppCompatActivity
                    val passive = PassiveFragment()
                    activity.supportFragmentManager.beginTransaction()
                        .replace(R.id.tensesFragment, passive)
                        .addToBackStack(null)
                        .commit()
                }

                else if (position == 12) {
                    val activity = v!!.context as AppCompatActivity
                    val reflexive = ReflexiveFragment()
                    activity.supportFragmentManager.beginTransaction()
                        .replace(R.id.tensesFragment, reflexive)
                        .addToBackStack(null)
                        .commit()
                }

                else if (position == 13) {
                    val activity = v!!.context as AppCompatActivity
                    val irregularVerbs = IrregularVerbsFragment()
                    activity.supportFragmentManager.beginTransaction()
                        .replace(R.id.tensesFragment, irregularVerbs)
                        .addToBackStack(null)
                        .commit()
                }






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