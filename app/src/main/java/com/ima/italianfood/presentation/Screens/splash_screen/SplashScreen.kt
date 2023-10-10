package com.ima.italianfood.presentation.Screens

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import com.ima.italianfood.R
import kotlinx.coroutines.delay

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun SplashScreen(
    //viewModel: SplashScreenViewModel,
    onNavigationNext: () -> Unit
) {
    LaunchedEffect(true) {
        delay(2000) // Delay for 1 second (1000 milliseconds)
        onNavigationNext.invoke()
    }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xFFFAC819)),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(painter = painterResource(id = R.drawable.splash_logo,
        ),
            contentDescription = null)
//        Text(
//            "Italian Recipe book",
//            fontWeight = FontWeight.Bold,
//            fontSize = 32.sp,
//            maxLines = 1,
//            overflow = TextOverflow.Ellipsis
//        )


    }
}








