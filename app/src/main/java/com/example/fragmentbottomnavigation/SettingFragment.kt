package com.example.fragmentbottomnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fragmentbottomnavigation.databinding.FragmentHomeBinding
import com.example.fragmentbottomnavigation.databinding.FragmentSettingBinding


class SettingFragment : Fragment() {
    private var binding: FragmentSettingBinding? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSettingBinding.inflate(inflater,container,false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()
    }
    private fun init() {
        binding?.toolBar?.ivBack?.setOnClickListener {
            requireActivity().onBackPressed()
            binding?.toolBar?.tvTitle?.text="Setting Fragment"
        }
    }

}