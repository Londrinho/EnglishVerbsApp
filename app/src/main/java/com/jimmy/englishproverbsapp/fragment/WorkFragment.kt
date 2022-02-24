package com.jimmy.englishproverbsapp.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.jimmy.englishproverbsapp.R
import com.jimmy.englishproverbsapp.adapter.ItemAdapterWork
import com.jimmy.englishproverbsapp.data.Datasource2
import com.jimmy.englishproverbsapp.databinding.FragmentWorkBinding

//This class creates the binding object, inflates the
//layout and uses recycler view and an adapter for the images and strings
class WorkFragment : Fragment() {

    private lateinit var binding: FragmentWorkBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       binding = DataBindingUtil.inflate(inflater, R.layout.fragment_work,
           container, false)

        val myDataset = Datasource2().loadWork()

        val recyclerView = binding.recyclerViewTwo
        recyclerView.adapter = ItemAdapterWork(this, myDataset)

        recyclerView.setHasFixedSize(true)

        return binding.root
    }

}