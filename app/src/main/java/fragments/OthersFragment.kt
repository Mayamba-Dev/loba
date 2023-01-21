package fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.baonumerique.loba.Adapters.OthersAdapter
import com.baonumerique.loba.R
import com.baonumerique.loba.dataClasses.Others


class OthersFragment : Fragment() {


    private lateinit var adapter : OthersAdapter
    private lateinit var recyclerView : RecyclerView
    private lateinit var othersArraylist : ArrayList<Others>

    lateinit var imageid : Array<Int>
    lateinit var othersheading : Array<String>



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_others, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        dataInitialize()
        val layoutManager = LinearLayoutManager(context)
        recyclerView = view.findViewById(R.id.others_recyclerview)
        recyclerView.layoutManager = layoutManager
        recyclerView.setHasFixedSize(true)
        adapter = OthersAdapter(imageid, othersheading)

        recyclerView.adapter = adapter

    }

    private fun dataInitialize(){

        othersArraylist = arrayListOf<Others>()

        imageid = arrayOf(R.drawable.ic_baseline_menu_book_24)
        othersheading = arrayOf(getString(R.string.days_months_years))

        for (i in imageid.indices) {
            val section = Others(imageid[i], othersheading [i] )

        }
    }






}