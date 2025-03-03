package com.camila.baseapp.ui.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel

@Composable
fun HomeScreen() {

    val homeViewModel: HomeViewModel = hiltViewModel()
    val hiltProvideExample = homeViewModel.getExample()

    Column (
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Home Screen")
        Text(text = hiltProvideExample)
    }

}
