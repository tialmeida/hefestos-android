package io.hefestos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.widget.Toolbar
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {
    private lateinit var drawer: DrawerLayout
    private lateinit var toggle: ActionBarDrawerToggle
    private lateinit var toolbar: Toolbar
    private lateinit var navView: NavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navigationView()
    }

    private fun navigationView(){
        toolbar = findViewById(R.id.toolbar_main)
        drawer = findViewById(R.id.drawer_layout)
        navView = findViewById(R.id.nav_view)

        setSupportActionBar(toolbar)
        toolbar.title = "Bicos"

        toggle = ActionBarDrawerToggle(this, drawer, toolbar, 0, 0)
        drawer.addDrawerListener(toggle)

        navView.setNavigationItemSelectedListener(this)
        navView.menu.getItem(0).isChecked = true

        toggle.syncState()
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.nav_freela -> {
                Toast.makeText(this, "Clicked item one", Toast.LENGTH_SHORT).show()
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
}