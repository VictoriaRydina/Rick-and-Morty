package com.example.rickandmorty.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.rickandmorty.R
import com.example.rickandmorty.databinding.ActivityMainBinding
import com.example.rickandmorty.ui.character.CharactersFragment
import com.example.rickandmorty.ui.episodes.EpisodesFragment
import com.example.rickandmorty.ui.location.LocationFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        val charactersFragment = CharactersFragment()
        val episodesFragment = EpisodesFragment()
        val locationFragment = LocationFragment()

        supportFragmentManager.beginTransaction().run {
            replace(R.id.fragment_container, CharactersFragment())
            commit()
        }
        setContentView(binding.root)

        binding.navView.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.nav_characters -> setCurrentFragment(charactersFragment)
                R.id.nav_episodes -> setCurrentFragment(episodesFragment)
                R.id.nav_location -> setCurrentFragment(locationFragment)
            }
            true
        }
    }

    private fun setCurrentFragment(fragment: Fragment) =
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragment_container, fragment)
                .addToBackStack(null)
            commit()
        }
}