package com.jimmy.englishproverbsapp.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.jimmy.englishproverbsapp.R
import com.jimmy.englishproverbsapp.adapter.ItemAdapterRelationships
import com.jimmy.englishproverbsapp.data.Datasource6
import com.jimmy.englishproverbsapp.databinding.FragmentRelationshipBinding

//This class creates the binding object, inflates the
//layout and uses recycler view and an adapter for the images and strings
class RelationshipFragment : Fragment() {

    private lateinit var binding: FragmentRelationshipBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_relationship,
            container, false)

        val myDataset = Datasource6().loadRelationship()

        val recyclerView = binding.recyclerViewThree
        recyclerView.adapter = ItemAdapterRelationships(this, myDataset)

        recyclerView.setHasFixedSize(true)

        return binding.root
    }


}