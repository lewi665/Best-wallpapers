package com.example.wazitoecommerce.ui.theme.screens.love

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
fun ntr17(navController: NavHostController) {
    Column(
    ) {




        Image(
            painter = painterResource(id = R.drawable.ntr17),
            contentDescription = "",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxSize()



        )
    }

}

@Preview
@Composable
fun ntr17ScreenPreview() {
    ntr17(rememberNavController())
}