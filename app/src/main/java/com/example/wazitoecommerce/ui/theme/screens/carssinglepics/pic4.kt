package com.example.wazitoecommerce.ui.theme.screens.carssinglepics

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.wazitoecommerce.R

@Composable
fun car4(navController: NavHostController) {
    Column(
    ) {




        Image(
            painter = painterResource(id = R.drawable.car4),
            contentDescription = "",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxSize()



        )
    }

}

@Preview
@Composable
fun car4ScreenPreview() {
    car4(rememberNavController())
}
