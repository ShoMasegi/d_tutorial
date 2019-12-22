package com.sho.masegi.tutorial.ui.events

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import com.sho.masegi.tutorial.MainApplication

import com.sho.masegi.tutorial.R
import com.sho.masegi.tutorial.databinding.EventsFragmentBinding
import javax.inject.Inject

class EventsFragment : Fragment() {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory
    private lateinit var binding: EventsFragmentBinding
    private val viewModel: EventsViewModel by viewModels { viewModelFactory }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.events_fragment, container, false)
        return binding.root
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        (activity!!.application as MainApplication).appComponent()
            .eventsComponent()
            .create()
            .inject(this)

        Log.d("Debug","ViewModel: $viewModel")
        Log.d("Debug","ViewModel.GithubAPI: ${viewModel.githubApi}")
    }
}
