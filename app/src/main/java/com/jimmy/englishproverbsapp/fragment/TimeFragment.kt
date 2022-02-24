package com.jimmy.englishproverbsapp.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.jimmy.englishproverbsapp.R
import com.jimmy.englishproverbsapp.adapter.ItemAdapterTime
import com.jimmy.englishproverbsapp.data.Datasource3
import com.jimmy.englishproverbsapp.databinding.FragmentTimeBinding

//This class creates the binding object, inflates the
//layout and uses recycler view and an adapter for the images and strings
class TimeFragment : Fragment() {

    private lateinit var binding: FragmentTimeBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       binding = DataBindingUtil.inflate(inflater, R.layout.fragment_time,
           container, false)

        val myDataset = Datasource3().loadTime()

        val recyclerView = binding.recyclerViewSix
        recyclerView.adapter = ItemAdapterTime(this, myDataset)

        recyclerView.setHasFixedSize(true)

        return binding.root
    }


}