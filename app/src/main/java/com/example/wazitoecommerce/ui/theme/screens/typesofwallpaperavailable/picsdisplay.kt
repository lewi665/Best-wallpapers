package com.example.wazitoecommerce.ui.theme.screens.typesofwallpaperavailable

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily.Companion.Monospace
import androidx.compose.ui.text.font.FontFamily.Companion.Serif
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.wazitoecommerce.R
import com.example.wazitoecommerce.navigation.ANIMATIONS_URL
import com.example.wazitoecommerce.navigation.CARS_URL
import com.example.wazitoecommerce.navigation.LOVE_URL
import com.example.wazitoecommerce.navigation.NATURE_URL
import com.example.wazitoecommerce.navigation.OTHERS_URL
import com.example.wazitoecommerce.navigation.PIC1_URL
import com.example.wazitoecommerce.ui.theme.WazitoECommerceTheme

@Composable
fun mainscreen(navController: NavHostController){
    Column(
        modifier = Modifier
            .fillMaxSize( )
            .paint(painterResource(id = R.drawable.main)))







            {

                Column(modifier = Modifier.verticalScroll(rememberScrollState())
                    .padding(top = 160.dp)

                ) {
            //Row1
            Row(modifier = Modifier.padding(start = 50.dp)) {

                //Card1
                Card() {

                    Column() {
                        Box(
                            modifier = Modifier
                                .height(150.dp)
                                .width(180.dp),
                            contentAlignment = Alignment.Center

                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.l1),
                                contentDescription = "",
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .fillMaxHeight()
                                    .fillMaxWidth()
                                    .size(400.dp)
                                    .clickable {
                                        navController.navigate(LOVE_URL)
                                    }
                            )

                        }
                        Text(
                            text = "    love wallpapers",
                            textAlign = TextAlign.Center,
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Black,

                        )

                    }

                }
                Spacer(modifier = Modifier.width(10.dp))
                //Card2
                Card() {
                    Column() {
                        Box(
                            modifier = Modifier
                                .height(150.dp)
                                .width(180.dp),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.an1),
                                contentDescription = "",
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .fillMaxHeight()
                                    .fillMaxWidth()
                                    .size(400.dp)
                                    .clickable {
                                        navController.navigate(ANIMATIONS_URL)
                                    }
                            )

                        }
                        Text(
                            text = "      Anime wallpapers",
                            textAlign = TextAlign.Center,
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Black
                        )

                    }

                }

            }
            Spacer(modifier = Modifier.height(10.dp))


            //Row2
            Row(modifier = Modifier.padding(start = 50.dp)) {

                //Card1
                Card() {
                    Column() {
                        Box(
                            modifier = Modifier
                                .height(150.dp)
                                .width(180.dp),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.car1),
                                contentDescription = "",
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .fillMaxHeight()
                                    .fillMaxWidth()
                                    .size(400.dp)
                                    .clickable {
                                        navController.navigate(CARS_URL)
                                    }
                            )

                        }
                        Text(
                            text = "    cars wallpaper",
                            textAlign = TextAlign.Center,
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Black
                        )

                    }

                }
                Spacer(modifier = Modifier.width(30.dp))
                //Card2
                Card() {
                    Column() {
                        Box(
                            modifier = Modifier
                                .height(150.dp)
                                .width(180.dp),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.na1),
                                contentDescription = "",
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .fillMaxHeight()
                                    .fillMaxWidth()
                                    .size(400.dp)
                                    .clickable {
                                        navController.navigate(NATURE_URL)
                                    }
                            )

                        }
                        Text(
                            text = "    Nature wallpapers",
                            textAlign = TextAlign.Center,
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Black
                        )

                    }

                }

            }
            Spacer(modifier = Modifier.height(20.dp))
            Box(
                modifier = Modifier
                    .padding(start = 150.dp)



                    .height(150.dp)
                    .width(180.dp),
                contentAlignment = Alignment.Center,



                ) {
                Image(
                    painter = painterResource(id = R.drawable.ot1),
                    contentDescription = "",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier

                        .fillMaxSize()

                        .size(80.dp,80.dp)
                        .clickable {
                            navController.navigate(OTHERS_URL)
                        }


                )

                Text(
                    text = "   OTHERS",
                    textAlign = TextAlign.Center,
                    fontSize = 25.sp,
                    fontWeight = FontWeight.ExtraLight,
                    color = Color.Blue
                    , fontFamily = Serif


                )

            }


            Spacer(modifier = Modifier.height(30.dp))


        }

    }
}
@Composable
@Preview(showBackground = true)
fun mainscreenPreview() = WazitoECommerceTheme {
    mainscreen(navController = rememberNavController())
}