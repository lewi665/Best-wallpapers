package com.example.wazitoecommerce.ui.theme.screens.love

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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.wazitoecommerce.R
import com.example.wazitoecommerce.navigation.LOVE_URL
import com.example.wazitoecommerce.navigation.MAINPICS_URL
import com.example.wazitoecommerce.navigation.NATURE_URL
import com.example.wazitoecommerce.navigation.PIC10_URL
import com.example.wazitoecommerce.navigation.PIC11_URL
import com.example.wazitoecommerce.navigation.PIC12_URL
import com.example.wazitoecommerce.navigation.PIC13_URL
import com.example.wazitoecommerce.navigation.PIC14_URL
import com.example.wazitoecommerce.navigation.PIC15_URL
import com.example.wazitoecommerce.navigation.PIC16_URL
import com.example.wazitoecommerce.navigation.PIC1_URL
import com.example.wazitoecommerce.navigation.PIC2_URL
import com.example.wazitoecommerce.navigation.PIC3_URL
import com.example.wazitoecommerce.navigation.PIC4_URL
import com.example.wazitoecommerce.navigation.PIC5_URL
import com.example.wazitoecommerce.navigation.PIC6_URL
import com.example.wazitoecommerce.navigation.PIC7_URL
import com.example.wazitoecommerce.navigation.PIC8_URL
import com.example.wazitoecommerce.navigation.PIC9_URL

@Composable
fun loveScreen(navController: NavHostController) {

    Column(modifier = Modifier
        .verticalScroll(rememberScrollState())
        .fillMaxSize()




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
                            painter = painterResource(id = R.drawable.love),
                            contentDescription = "",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .clickable {
                                    navController.navigate(PIC1_URL)
                                }
                                .fillMaxHeight()
                                .fillMaxWidth()
                                .size(400.dp)

                        )

                    }


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
                            painter = painterResource(id = R.drawable.love1),
                            contentDescription = "",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .clickable {
                                    navController.navigate(PIC2_URL)
                                }
                                .fillMaxHeight()
                                .fillMaxWidth()
                                .size(400.dp)

                        )

                    }


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
                            painter = painterResource(id = R.drawable.love2),
                            contentDescription = "",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .clickable {
                                    navController.navigate(PIC3_URL)
                                }
                                .fillMaxHeight()
                                .fillMaxWidth()
                                .size(400.dp)

                        )

                    }


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
                            painter = painterResource(id = R.drawable.love3),
                            contentDescription = "",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .clickable {
                                    navController.navigate(PIC4_URL)
                                }
                                .fillMaxHeight()
                                .fillMaxWidth()
                                .size(400.dp)

                        )

                    }


                }

            }

        }
        Spacer(modifier = Modifier.height(10.dp))


        //Row3
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
                            painter = painterResource(id = R.drawable.love4),
                            contentDescription = "",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .clickable {
                                    navController.navigate(PIC5_URL)
                                }
                                .fillMaxHeight()
                                .fillMaxWidth()
                                .size(400.dp)

                        )

                    }


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
                            painter = painterResource(id = R.drawable.love5),
                            contentDescription = "",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .clickable {
                                    navController.navigate(PIC6_URL)
                                }
                                .fillMaxHeight()
                                .fillMaxWidth()
                                .size(400.dp)

                        )

                    }


                }

            }

        }
        Spacer(modifier = Modifier.height(10.dp))


        //Row4
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
                            painter = painterResource(id = R.drawable.love6),
                            contentDescription = "",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .clickable {
                                    navController.navigate(PIC7_URL)
                                }
                                .fillMaxHeight()
                                .fillMaxWidth()
                                .size(400.dp)

                        )

                    }


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
                            painter = painterResource(id = R.drawable.love7),
                            contentDescription = "",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .clickable {
                                    navController.navigate(PIC8_URL)
                                }
                                .fillMaxHeight()
                                .fillMaxWidth()
                                .size(400.dp)

                        )

                    }


                }

            }

        }
        Spacer(modifier = Modifier.height(10.dp))


        //Row5
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
                            painter = painterResource(id = R.drawable.love8),
                            contentDescription = "",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .clickable {
                                    navController.navigate(PIC9_URL)
                                }
                                .fillMaxHeight()
                                .fillMaxWidth()
                                .size(400.dp)

                        )

                    }


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
                            painter = painterResource(id = R.drawable.l1),
                            contentDescription = "",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .clickable {
                                    navController.navigate(PIC10_URL)
                                }
                                .fillMaxHeight()
                                .fillMaxWidth()
                                .size(400.dp)

                        )

                    }


                }

            }

        }
        Spacer(modifier = Modifier.height(10.dp))

        //Row5
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
                            painter = painterResource(id = R.drawable.love9),
                            contentDescription = "",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .clickable {
                                    navController.navigate(PIC11_URL)
                                }
                                .fillMaxHeight()
                                .fillMaxWidth()
                                .size(400.dp)

                        )

                    }


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
                            painter = painterResource(id = R.drawable.love10),
                            contentDescription = "",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .clickable {
                                    navController.navigate(PIC12_URL)
                                }
                                .fillMaxHeight()
                                .fillMaxWidth()
                                .size(400.dp)

                        )

                    }


                }

            }

        }
        Spacer(modifier = Modifier.height(10.dp))

        //Row5
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
                            painter = painterResource(id = R.drawable.love11),
                            contentDescription = "",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .clickable {
                                    navController.navigate(PIC13_URL)
                                }
                                .fillMaxHeight()
                                .fillMaxWidth()
                                .size(400.dp)

                        )

                    }


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
                            painter = painterResource(id = R.drawable.love12),
                            contentDescription = "",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .clickable {
                                    navController.navigate(PIC14_URL)
                                }
                                .fillMaxHeight()
                                .fillMaxWidth()
                                .size(400.dp)

                        )

                    }


                }

            }

        }
        Spacer(modifier = Modifier.height(10.dp))

        //Row5
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
                            painter = painterResource(id = R.drawable.love13),
                            contentDescription = "",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .clickable {
                                    navController.navigate(PIC15_URL)
                                }
                                .fillMaxHeight()
                                .fillMaxWidth()
                                .size(400.dp)

                        )

                    }


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
                            painter = painterResource(id = R.drawable.love14),
                            contentDescription = "",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .clickable {
                                    navController.navigate(PIC16_URL)
                                }
                                .fillMaxHeight()
                                .fillMaxWidth()
                                .size(400.dp)

                         )

                    }


                }

            }

        }
        Spacer(modifier = Modifier.height(10.dp))




        Spacer(modifier = Modifier.height(30.dp))


    }

}

@Preview
@Composable
fun loveScreenPreview() {
    loveScreen(rememberNavController())
}