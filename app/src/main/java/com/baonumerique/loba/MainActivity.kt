package com.baonumerique.loba

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import com.google.android.material.navigation.NavigationView
import fragments.*

class MainActivity : AppCompatActivity() {

    lateinit var toggle : ActionBarDrawerToggle
    lateinit var drawerLayout: DrawerLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




        fun replaceFragment(tensesFragment : Fragment) {
            val fragmentManager = supportFragmentManager

            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.frameLayout, tensesFragment)
        }

        replaceFragment(TensesFragment())



        drawerLayout = findViewById(R.id.drawerLayout)
        val navView : NavigationView = findViewById(R.id.nav_view)

        toggle = ActionBarDrawerToggle(this, drawerLayout, R.string.open,R.string.close)
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        navView.setNavigationItemSelectedListener {

            it.isChecked = true

            when(it.itemId) {
                R.id.nav_home -> replaceFragment(HomeFragment(), it.title.toString())
                R.id.nav_tenses -> replaceFragment(TensesFragment(), it.title.toString())
                R.id.nav_vocabulary -> replaceFragment(VocabularyFragment(), it.title.toString())
                R.id.nav_verbs -> replaceFragment(VerbsFragment(), it.title.toString())
                R.id.nav_nouns_and_articles -> replaceFragment(NounsArticlesFragment(), it.title.toString())
                R.id.nav_pronouns-> replaceFragment(PronounsFragment(), it.title.toString())
                R.id.nav_adjectives-> replaceFragment(AdjectivesFragment(), it.title.toString())
                R.id.nav_adverbs-> replaceFragment(AdverbsFragment(), it.title.toString())
                R.id.nav_prepositions-> replaceFragment(PrepostionsFragment(), it.title.toString())
                R.id.nav_sentence_structure-> replaceFragment(SentenceStructureFragment(), it.title.toString())
                R.id.nav_others-> replaceFragment(OthersFragment(), it.title.toString())

            }

            true

        }




    }

    private fun replaceFragment(fragment: Fragment, title: String) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frameLayout,fragment)
        fragmentTransaction.commit()
        drawerLayout.closeDrawers()
        setTitle(title)

    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        if (toggle.onOptionsItemSelected(item)){

            return true
        }

        return true

    }
}