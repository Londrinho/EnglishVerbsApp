package com.jimmy.englishproverbsapp.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.jimmy.englishproverbsapp.R
import com.jimmy.englishproverbsapp.adapter.ItemAdapter
import com.jimmy.englishproverbsapp.data.Datasource1
import com.jimmy.englishproverbsapp.databinding.FragmentPeopleBinding


//This class creates the binding object, inflates the
//layout and uses recycler view and an adapter for the images and strings
class PeopleFragment : Fragment() {

    private lateinit var binding: FragmentPeopleBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_people,
            container, false)

        val myDataset = Datasource1().loadPeople()

        val recyclerView = binding.recyclerViewFive
        recyclerView.adapter = ItemAdapter(this, myDataset)

        recyclerView.setHasFixedSize(true)

        return binding.root
    }


}