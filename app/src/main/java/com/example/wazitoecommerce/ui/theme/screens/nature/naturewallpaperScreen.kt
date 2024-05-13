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
import com.example.wazitoecommerce.navigation.NTR10_URL
import com.example.wazitoecommerce.navigation.NTR11_URL
import com.example.wazitoecommerce.navigation.NTR12_URL
import com.example.wazitoecommerce.navigation.NTR13_URL
import com.example.wazitoecommerce.navigation.NTR14_URL
import com.example.wazitoecommerce.navigation.NTR15_URL
import com.example.wazitoecommerce.navigation.NTR16_URL
import com.example.wazitoecommerce.navigation.NTR17_URL
import com.example.wazitoecommerce.navigation.NTR18_URL
import com.example.wazitoecommerce.navigation.NTR1_URL
import com.example.wazitoecommerce.navigation.NTR2_URL
import com.example.wazitoecommerce.navigation.NTR3_URL
import com.example.wazitoecommerce.navigation.NTR4_URL
import com.example.wazitoecommerce.navigation.NTR5_URL
import com.example.wazitoecommerce.navigation.NTR6_URL
import com.example.wazitoecommerce.navigation.NTR7_URL
import com.example.wazitoecommerce.navigation.NTR8_URL
import com.example.wazitoecommerce.navigation.NTR9_URL

@Composable
fun nature(navController: NavHostController) {

    Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
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
                            painter = painterResource(id = R.drawable.ntr1),
                            contentDescription = "",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .clickable {
                                    navController.navigate(NTR1_URL)
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
                            painter = painterResource(id = R.drawable.ntr2),
                            contentDescription = "",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .clickable {
                                    navController.navigate(NTR2_URL)
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
                            painter = painterResource(id = R.drawable.ntr3),
                            contentDescription = "",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .clickable {
                                    navController.navigate(NTR3_URL)
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
                            painter = painterResource(id = R.drawable.ntr4),
                            contentDescription = "",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .clickable {
                                    navController.navigate(NTR4_URL)
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
                            painter = painterResource(id = R.drawable.ntr5),
                            contentDescription = "",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .clickable {
                                    navController.navigate(NTR5_URL)
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
                            painter = painterResource(id = R.drawable.ntr6),
                            contentDescription = "",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .clickable {
                                    navController.navigate(NTR6_URL)
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
                            painter = painterResource(id = R.drawable.ntr7),
                            contentDescription = "",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .clickable {
                                    navController.navigate(NTR7_URL)
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
                            painter = painterResource(id = R.drawable.ntr8),
                            contentDescription = "",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .clickable {
                                    navController.navigate(NTR8_URL)
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
                            painter = painterResource(id = R.drawable.ntr9),
                            contentDescription = "",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .clickable {
                                    navController.navigate(NTR9_URL)
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
                            painter = painterResource(id = R.drawable.ntr10),
                            contentDescription = "",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .clickable {
                                    navController.navigate(NTR10_URL)
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
                            painter = painterResource(id = R.drawable.ntr11),
                            contentDescription = "",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .clickable {
                                    navController.navigate(NTR11_URL)
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
                            painter = painterResource(id = R.drawable.ntr12),
                            contentDescription = "",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .clickable {
                                    navController.navigate(NTR12_URL)
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
                            painter = painterResource(id = R.drawable.ntr13),
                            contentDescription = "",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier .clickable {
                                navController.navigate(NTR13_URL)
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
                            painter = painterResource(id = R.drawable.ntr14),
                            contentDescription = "",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .clickable {
                                    navController.navigate(NTR14_URL)
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
                            painter = painterResource(id = R.drawable.ntr15),
                            contentDescription = "",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .clickable {
                                    navController.navigate(NTR15_URL)
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
                            painter = painterResource(id = R.drawable.ntr16),
                            contentDescription = "",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .clickable {
                                    navController.navigate(NTR16_URL)
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
                            painter = painterResource(id = R.drawable.ntr17),
                            contentDescription = "",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .clickable {
                                    navController.navigate(NTR17_URL)
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
                            painter = painterResource(id = R.drawable.ntr18),
                            contentDescription = "",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .clickable {
                                    navController.navigate(NTR18_URL)
                                }
                                .fillMaxHeight()
                                .fillMaxWidth()
                                .size(400.dp)

                        )

                    }


                }

            }

        }




        Spacer(modifier = Modifier.height(30.dp))


    }

}

@Preview
@Composable
fun natureScreenPreview() {
    nature(rememberNavController())
}