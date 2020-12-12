@file:Suppress("DEPRECATION")

package com.whitezone.whitezone.ui.habits

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.whitezone.whitezone.R

class HabitsFragment : Fragment() {

    private lateinit var habitsViewModel: HabitsViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        habitsViewModel =
                ViewModelProviders.of(this).get(HabitsViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_habits, container, false)

        return root
    }
}