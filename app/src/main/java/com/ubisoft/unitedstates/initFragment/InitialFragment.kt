package com.ubisoft.unitedstates.initFragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.ubisoft.unitedstates.R

class InitialFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_start, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val nextButton = view.findViewById<Button>(R.id.button_1)
        nextButton.setOnClickListener {
            val navHost = findNavController()
            navHost.navigate(R.id.action_initialFragment_to_obamaFragment)
        }
    }
}
