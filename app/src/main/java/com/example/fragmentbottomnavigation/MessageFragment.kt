package com.example.fragmentbottomnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fragmentbottomnavigation.databinding.FragmentMessageBinding


class MessageFragment : Fragment() {
    private var binding: FragmentMessageBinding? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMessageBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()
    }

    private fun init() {
        binding?.toolBar?.ivBack?.setOnClickListener {
            requireActivity().onBackPressed()
        }
        binding?.toolBar?.tvTitle?.text = "Message Fragment"

    }
}