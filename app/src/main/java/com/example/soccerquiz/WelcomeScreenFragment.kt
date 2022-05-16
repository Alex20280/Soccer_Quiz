package com.example.soccerquiz

import android.app.Activity
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.soccerquiz.databinding.FragmentWelcomeScreenBinding

class WelcomeScreenFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding : FragmentWelcomeScreenBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_welcome_screen, container,false)

        binding.letsPlayButton.setOnClickListener({
            Navigation.findNavController(it).navigate(R.id.action_welcomeScreenFragment2_to_quizFragment)
        })

        //setup fragment lable
        (activity as AppCompatActivity).supportActionBar?.title = "Soccer Quiz"

        return binding.root
    }

}