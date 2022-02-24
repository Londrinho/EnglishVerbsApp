package com.jimmy.englishproverbsapp.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.jimmy.englishproverbsapp.R
import com.jimmy.englishproverbsapp.databinding.FragmentTitleBinding

//This class creates the binding object, inflates the
//layout and uses recycler view and an adapter for the images and strings
class TitleFragment : Fragment() {

    private lateinit var binding: FragmentTitleBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_title,
            container, false)

        return binding.root
    }


}