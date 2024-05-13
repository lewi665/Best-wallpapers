package com.example.wazitoecommerce.ui.theme.screens.love

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.wazitoecommerce.R
import com.example.wazitoecommerce.navigation.CAR10_URL
import com.example.wazitoecommerce.navigation.CAR11_URL
import com.example.wazitoecommerce.navigation.CAR12_URL
import com.example.wazitoecommerce.navigation.CAR13_URL
import com.example.wazitoecommerce.navigation.CAR14_URL
import com.example.wazitoecommerce.navigation.CAR15_URL
import com.example.wazitoecommerce.navigation.CAR16_URL
import com.example.wazitoecommerce.navigation.CAR1_URL
import com.example.wazitoecommerce.navigation.CAR2_URL
import com.example.wazitoecommerce.navigation.CAR3_URL
import com.example.wazitoecommerce.navigation.CAR4_URL
import com.example.wazitoecommerce.navigation.CAR5_URL
import com.example.wazitoecommerce.navigation.CAR6_URL
import com.example.wazitoecommerce.navigation.CAR7_URL
import com.example.wazitoecommerce.navigation.CAR8_URL
import com.example.wazitoecommerce.navigation.CAR9_URL
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
fun cars(navController: NavHostController) {

    Column(modifier = Modifier

        .verticalScroll(rememberScrollState())




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
                            painter = painterResource(id = R.drawable.car1),
                            contentDescription = "",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .clickable {
                                    navController.navigate(CAR1_URL)
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
                            painter = painterResource(id = R.drawable.car2),
                            contentDescription = "",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .clickable {
                                    navController.navigate(CAR2_URL)
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
                            painter = painterResource(id = R.drawable.car3),
                            contentDescription = "",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .clickable {
                                    navController.navigate(CAR3_URL)
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
                            painter = painterResource(id = R.drawable.car4),
                            contentDescription = "",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .clickable {
                                    navController.navigate(CAR4_URL)
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
                            painter = painterResource(id = R.drawable.car5),
                            contentDescription = "",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .clickable {
                                    navController.navigate(CAR5_URL)
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
                            painter = painterResource(id = R.drawable.car6),
                            contentDescription = "",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .clickable {
                                    navController.navigate(CAR6_URL)
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
                            painter = painterResource(id = R.drawable.car7),
                            contentDescription = "",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .clickable {
                                    navController.navigate(CAR7_URL)
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
                            painter = painterResource(id = R.drawable.car8),
                            contentDescription = "",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .clickable {
                                    navController.navigate(CAR8_URL)
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
                            painter = painterResource(id = R.drawable.car9),
                            contentDescription = "",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .clickable {
                                    navController.navigate(CAR9_URL)
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
                            painter = painterResource(id = R.drawable.car10),
                            contentDescription = "",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .clickable {
                                    navController.navigate(CAR10_URL)
                                }
                                .fillMaxHeight()
                                .fillMaxWidth()
                                .size(400.dp)

                        )

                    }


                }

            }

        }
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
                            painter = painterResource(id = R.drawable.car11),
                            contentDescription = "",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .clickable {
                                    navController.navigate(CAR11_URL)
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
                            painter = painterResource(id = R.drawable.car12),
                            contentDescription = "",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .clickable {
                                    navController.navigate(CAR12_URL)
                                }
                                .fillMaxHeight()
                                .fillMaxWidth()
                                .size(400.dp)

                        )

                    }


                }

            }

        }
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
                            painter = painterResource(id = R.drawable.car13),
                            contentDescription = "",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier .clickable {
                                navController.navigate(CAR13_URL)
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
                            painter = painterResource(id = R.drawable.car14),
                            contentDescription = "",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .clickable {
                                    navController.navigate(CAR14_URL)
                                }
                                .fillMaxHeight()
                                .fillMaxWidth()
                                .size(400.dp)

                        )

                    }


                }

            }

        }
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
                            painter = painterResource(id = R.drawable.car15),
                            contentDescription = "",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .clickable {
                                    navController.navigate(CAR15_URL)
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
                            painter = painterResource(id = R.drawable.poche8),
                            contentDescription = "",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .clickable {
                                    navController.navigate(CAR16_URL)
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
fun carsScreenPreview() {
    cars(rememberNavController())
}