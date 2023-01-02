package fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.baonumerique.loba.Adapters.vocabularyAdapter
import com.baonumerique.loba.R
import com.baonumerique.loba.Tenses
import com.baonumerique.loba.dataClasses.Vocabulary

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class VocabularyFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    private lateinit var adapter: vocabularyAdapter
    private lateinit var recyclerView: RecyclerView
    private lateinit var vocabularyArraylist: ArrayList<Vocabulary>

    lateinit var sourceWordid: Array<String>
    lateinit var lingalaid: Array<String>
    lateinit var soundid: Array<Int>



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
        return inflater.inflate(R.layout.fragment_vocabulary, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        dataInitialize()
        val layoutManager = LinearLayoutManager(context)
        recyclerView = view.findViewById(R.id.vocabulary_recyclerview)
        recyclerView.layoutManager = layoutManager
        recyclerView.setHasFixedSize(true)
        adapter = vocabularyAdapter(sourceWordid, lingalaid, soundid)
        recyclerView.adapter = adapter



    }

    private fun dataInitialize() {

        vocabularyArraylist = arrayListOf<Vocabulary>()

        sourceWordid = arrayOf("Apple", "Banana", "Homme")


        lingalaid = arrayOf("pomme", "banane", "Man")

        soundid = arrayOf(R.raw.lionsmp3, R.raw.lionsmp3, R.raw.lionsmp3)



    }

}