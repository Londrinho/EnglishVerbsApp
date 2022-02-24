package com.jimmy.englishproverbsapp.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.jimmy.englishproverbsapp.R
import com.jimmy.englishproverbsapp.adapter.ItemAdapterProblems
import com.jimmy.englishproverbsapp.data.Datasource4
import com.jimmy.englishproverbsapp.databinding.FragmentProblemsBinding

//This class creates the binding object, inflates the
//layout and uses recycler view and an adapter for the images and strings
class ProblemsFragment : Fragment() {

    private lateinit var binding: FragmentProblemsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       binding = DataBindingUtil.inflate(inflater, R.layout.fragment_problems,
           container, false)

        val myDataset = Datasource4().loadProblems()

        val recyclerView = binding.recyclerViewFour
        recyclerView.adapter = ItemAdapterProblems(this, myDataset)

        recyclerView.setHasFixedSize(true)

        return binding.root
    }


}