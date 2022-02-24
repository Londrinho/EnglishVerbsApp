package com.jimmy.englishproverbsapp.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.jimmy.englishproverbsapp.R
import com.jimmy.englishproverbsapp.adapter.ItemAdapterGeneral
import com.jimmy.englishproverbsapp.data.Datasource5
import com.jimmy.englishproverbsapp.databinding.FragmentGeneralBinding

//This class creates the binding object, inflates the
//layout and uses recycler view and an adapter for the images and strings
class GeneralFragment : Fragment() {

    private lateinit var binding: FragmentGeneralBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_general,
            container, false)

        val myDataset = Datasource5().loadGeneral()

        val recyclerView = binding.recyclerViewOne
        recyclerView.adapter = ItemAdapterGeneral(this, myDataset)

        recyclerView.setHasFixedSize(true)

        return binding.root
    }


}