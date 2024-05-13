package com.example.wazitoecommerce.ui.theme.screens.animatonsinglepics

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
fun oth20(navController: NavHostController) {
    Column(
    ) {




        Image(
            painter = painterResource(id = R.drawable.oth9),
            contentDescription = "",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxSize()



        )
    }

}

@Preview
@Composable
fun oth20ScreenPreview() {
    oth20(rememberNavController())
}