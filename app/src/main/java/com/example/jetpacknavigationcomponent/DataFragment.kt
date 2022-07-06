package com.example.jetpacknavigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_data.*


class DataFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_data, container, false)
        val button=view.findViewById<Button>(R.id.button)
        val textview=view.findViewById<TextView>(R.id.textView2)

        button.setOnClickListener{
            findNavController().navigate(R.id.action_dataFragment_to_homeFragment)
        }

        textview.text = arguments?.getString("message")

        return view
    }

}