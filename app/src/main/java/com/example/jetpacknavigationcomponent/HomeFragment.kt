package com.example.jetpacknavigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_home.*


class HomeFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view= inflater.inflate(R.layout.fragment_home, container, false)
        val button=view.findViewById<Button>(R.id.buttonNext)
        val button2=view.findViewById<Button>(R.id.btnActivity)
        val editText=view.findViewById<EditText>(R.id.etMessage)

        val bundle=Bundle()


        button.setOnClickListener{
            bundle.putString("message",editText.text.toString())
            Navigation.findNavController(view).navigate(R.id.action_homeFragment_to_dataFragment, bundle)
        }

        button2.setOnClickListener{
            bundle.putString("message2",editText.text.toString())
            Navigation.findNavController(view).navigate(R.id.action_homeFragment_to_mainActivity22, bundle)
        }

        return view
    }


}