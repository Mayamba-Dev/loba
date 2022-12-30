package com.baonumerique.loba

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"




class TensesFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    private lateinit var adapter : TensesAdapter
    private lateinit var recyclerView: RecyclerView
    private lateinit var sectionArraylist : ArrayList<Tenses>

    lateinit var imageid : Array<Int>
    lateinit var heading : Array<String>
    lateinit var sections : Array<String>



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tenses, container, false)
    }



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        dataInitialize()
        val layoutManager = LinearLayoutManager(context)
        recyclerView = view.findViewById(R.id.tenses_recyclerview)
        recyclerView.layoutManager = layoutManager
        recyclerView.setHasFixedSize(true)
        adapter = TensesAdapter(sectionArraylist)
        recyclerView.adapter = adapter
    }


    private fun dataInitialize(){

        sectionArraylist = arrayListOf<Tenses>()

        imageid = arrayOf(
            R.drawable.ic_baseline_library_books_24,
            R.drawable.ic_baseline_menu_book_24,
            R.drawable.ic_baseline_collections_bookmark_24

        )

        heading = arrayOf(
            getString(R.string.present_perfect),
            getString(R.string.present_tense),
            getString(R.string.past_tense)

        )

        for (i in imageid.indices) {
            val section = Tenses(imageid[i],heading [i])
            sectionArraylist.add(section)

        }



    }
}