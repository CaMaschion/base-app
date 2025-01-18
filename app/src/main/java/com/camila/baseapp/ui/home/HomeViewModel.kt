package com.camila.baseapp.ui.home

import androidx.lifecycle.ViewModel
import com.camila.baseapp.service.SampleService
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val sampleService: SampleService
) : ViewModel() {

    fun getExample(): String {
        return sampleService.getSample()
    }

}
