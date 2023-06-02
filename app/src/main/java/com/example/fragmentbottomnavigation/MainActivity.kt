package com.example.fragmentbottomnavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView


class MainActivity : AppCompatActivity() {
    private lateinit var bottomNav: BottomNavigationView
    private var navController: NavController? = null
    private var navHostFragment: NavHostFragment? = null
    private var graph: NavGraph? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        loadFragment(HomeFragment())
        bottomNav = findViewById<BottomNavigationView>(R.id.bottomNav) as BottomNavigationView
        bottomNav.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.home -> {
                    loadFragment(HomeFragment())
                    true
                }
                R.id.message -> {
                    loadFragment((MessageFragment()))
                    true
                }
                R.id.settings -> {
                    loadFragment(SettingFragment())
                    true
                }
                else -> {
                    false

                }
            }
        }
    }

    private fun loadFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container, fragment)
        transaction.commit()
    }

    override fun onBackPressed() {

        super.onBackPressed()
        val currentId = bottomNav.selectedItemId
        when (currentId) {
            R.id.home -> {

            }
            R.id.message -> {
                loadFragment((HomeFragment()))

            }
            R.id.settings -> {
                loadFragment(HomeFragment())

            }
            else -> {


            }
        }
    }

}