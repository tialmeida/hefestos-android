package io.hefestos.UIs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.widget.Toolbar
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import com.google.android.material.navigation.NavigationView
import io.hefestos.R
import io.hefestos.UIs.Fragments.FreelasFragment

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {
    private lateinit var drawer: DrawerLayout
    private lateinit var toggle: ActionBarDrawerToggle
    private lateinit var toolbar: Toolbar
    private lateinit var navView: NavigationView
    private val contentMain = R.id.content_main
    private val fragments = mutableMapOf<String, Fragment>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        createFragments()
        navigationView()
    }

    private fun navigationView(){
        toolbar = findViewById(R.id.toolbar_main)
        drawer = findViewById(R.id.drawer_layout)
        navView = findViewById(R.id.nav_view)

        setSupportActionBar(toolbar)
        toolbar.title = "Bicos"
        val transction = supportFragmentManager.beginTransaction()
        transction.replace(contentMain, fragments["freela"]!!)
            .commitAllowingStateLoss()

        toggle = ActionBarDrawerToggle(this, drawer, toolbar, 0, 0)
        drawer.addDrawerListener(toggle)

        navView.setNavigationItemSelectedListener(this)
        navView.menu.getItem(0).isChecked = true

        toggle.syncState()
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        val transction = supportFragmentManager.beginTransaction()
        when(item.itemId){
            R.id.nav_freela -> {
                toolbar.title = "Bicos"
                transction.replace(contentMain, fragments["freela"]!!)
                    .commitAllowingStateLoss()
            }
            R.id.nav_hire_freela -> {}
            R.id.nav_courses -> {}
            R.id.nav_jobs -> {}
            R.id.nav_curriculum -> {}
            R.id.nav_person -> {}
            R.id.nav_setings -> {}
            R.id.nav_logout -> {}
        }
        return true
    }

    private fun createFragments(){
        fragments["freela"] = FreelasFragment()
    }
}