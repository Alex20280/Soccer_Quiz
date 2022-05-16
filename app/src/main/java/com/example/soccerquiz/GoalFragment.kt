package com.example.soccerquiz

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.soccerquiz.databinding.FragmentGoalBinding
import com.example.soccerquiz.databinding.FragmentQuizBinding

class GoalFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentGoalBinding>(
            inflater,
            R.layout.fragment_goal,
            container,
            false
        )

        binding.oneMoreTimeButton.setOnClickListener {
            view?.findNavController()?.navigate(R.id.action_goalFragment_to_quizFragment)
        }

        //setup fragment lable
        (activity as AppCompatActivity).supportActionBar?.title = "Soccer Quiz"

        return binding.root
    }

}