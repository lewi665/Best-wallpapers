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
import com.example.wazitoecommerce.navigation.ANIME10_URL
import com.example.wazitoecommerce.navigation.ANIME11_URL
import com.example.wazitoecommerce.navigation.ANIME12_URL
import com.example.wazitoecommerce.navigation.ANIME13_URL
import com.example.wazitoecommerce.navigation.ANIME14_URL
import com.example.wazitoecommerce.navigation.ANIME15_URL
import com.example.wazitoecommerce.navigation.ANIME16_URL
import com.example.wazitoecommerce.navigation.ANIME17_URL
import com.example.wazitoecommerce.navigation.ANIME18_URL
import com.example.wazitoecommerce.navigation.ANIME1_URL
import com.example.wazitoecommerce.navigation.ANIME2_URL
import com.example.wazitoecommerce.navigation.ANIME3_URL
import com.example.wazitoecommerce.navigation.ANIME4_URL
import com.example.wazitoecommerce.navigation.ANIME5_URL
import com.example.wazitoecommerce.navigation.ANIME6_URL
import com.example.wazitoecommerce.navigation.ANIME7_URL
import com.example.wazitoecommerce.navigation.ANIME8_URL
import com.example.wazitoecommerce.navigation.ANIME9_URL

@Composable
fun others(navController: NavHostController) {

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
                            painter = painterResource(id = R.drawable.an1),
                            contentDescription = "",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .clickable {
                                    navController.navigate(ANIME1_URL)
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
                            painter = painterResource(id = R.drawable.ani2),
                            contentDescription = "",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .clickable {
                                    navController.navigate(ANIME2_URL)
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
                            painter = painterResource(id = R.drawable.ani3),
                            contentDescription = "",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .clickable {
                                    navController.navigate(ANIME3_URL)
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
                            painter = painterResource(id = R.drawable.ani4),
                            contentDescription = "",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .clickable {
                                    navController.navigate(ANIME4_URL)
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
                            painter = painterResource(id = R.drawable.ani5),
                            contentDescription = "",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .clickable {
                                    navController.navigate(ANIME5_URL)
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
                            painter = painterResource(id = R.drawable.ani6),
                            contentDescription = "",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .clickable {
                                    navController.navigate(ANIME6_URL)
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
                            painter = painterResource(id = R.drawable.ani7),
                            contentDescription = "",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .clickable {
                                    navController.navigate(ANIME7_URL)
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
                            painter = painterResource(id = R.drawable.ani8),
                            contentDescription = "",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .clickable {
                                    navController.navigate(ANIME8_URL)
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
                            painter = painterResource(id = R.drawable.ani9),
                            contentDescription = "",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .clickable {
                                    navController.navigate(ANIME9_URL)
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
                            painter = painterResource(id = R.drawable.ani10),
                            contentDescription = "",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .clickable {
                                    navController.navigate(ANIME10_URL)
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
                            painter = painterResource(id = R.drawable.ani11),
                            contentDescription = "",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .clickable {
                                    navController.navigate(ANIME11_URL)
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
                            painter = painterResource(id = R.drawable.ani12),
                            contentDescription = "",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .clickable {
                                    navController.navigate(ANIME12_URL)
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
                            painter = painterResource(id = R.drawable.ani13),
                            contentDescription = "",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier .clickable {
                                navController.navigate(ANIME13_URL)
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
                            painter = painterResource(id = R.drawable.ani14),
                            contentDescription = "",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .clickable {
                                    navController.navigate(ANIME14_URL)
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
                            painter = painterResource(id = R.drawable.ani14),
                            contentDescription = "",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .clickable {
                                    navController.navigate(ANIME15_URL)
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
                            painter = painterResource(id = R.drawable.ani16),
                            contentDescription = "",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .clickable {
                                    navController.navigate(ANIME16_URL)
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
                            painter = painterResource(id = R.drawable.ani17),
                            contentDescription = "",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .clickable {
                                    navController.navigate(ANIME17_URL)
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
                            painter = painterResource(id = R.drawable.ani18),
                            contentDescription = "",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .clickable {
                                    navController.navigate(ANIME18_URL)
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
                            painter = painterResource(id = R.drawable.an1),
                            contentDescription = "",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .clickable {
                                    navController.navigate(ANIME1_URL)
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
                            painter = painterResource(id = R.drawable.ani2),
                            contentDescription = "",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .clickable {
                                    navController.navigate(ANIME2_URL)
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
                            painter = painterResource(id = R.drawable.ani3),
                            contentDescription = "",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .clickable {
                                    navController.navigate(ANIME3_URL)
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
                            painter = painterResource(id = R.drawable.ani4),
                            contentDescription = "",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .clickable {
                                    navController.navigate(ANIME4_URL)
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
                            painter = painterResource(id = R.drawable.ani5),
                            contentDescription = "",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .clickable {
                                    navController.navigate(ANIME5_URL)
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
                            painter = painterResource(id = R.drawable.ani6),
                            contentDescription = "",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .clickable {
                                    navController.navigate(ANIME6_URL)
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
                            painter = painterResource(id = R.drawable.ani7),
                            contentDescription = "",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .clickable {
                                    navController.navigate(ANIME7_URL)
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
                            painter = painterResource(id = R.drawable.ani8),
                            contentDescription = "",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .clickable {
                                    navController.navigate(ANIME8_URL)
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
                            painter = painterResource(id = R.drawable.ani9),
                            contentDescription = "",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .clickable {
                                    navController.navigate(ANIME9_URL)
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
                            painter = painterResource(id = R.drawable.ani10),
                            contentDescription = "",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .clickable {
                                    navController.navigate(ANIME10_URL)
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
                            painter = painterResource(id = R.drawable.ani11),
                            contentDescription = "",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .clickable {
                                    navController.navigate(ANIME11_URL)
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
                            painter = painterResource(id = R.drawable.ani12),
                            contentDescription = "",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .clickable {
                                    navController.navigate(ANIME12_URL)
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
                            painter = painterResource(id = R.drawable.ani13),
                            contentDescription = "",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier .clickable {
                                navController.navigate(ANIME13_URL)
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
                            painter = painterResource(id = R.drawable.ani14),
                            contentDescription = "",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .clickable {
                                    navController.navigate(ANIME14_URL)
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
                            painter = painterResource(id = R.drawable.ani14),
                            contentDescription = "",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .clickable {
                                    navController.navigate(ANIME15_URL)
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
                            painter = painterResource(id = R.drawable.ani16),
                            contentDescription = "",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .clickable {
                                    navController.navigate(ANIME16_URL)
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
                            painter = painterResource(id = R.drawable.ani17),
                            contentDescription = "",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .clickable {
                                    navController.navigate(ANIME17_URL)
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
                            painter = painterResource(id = R.drawable.ani18),
                            contentDescription = "",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .clickable {
                                    navController.navigate(ANIME18_URL)
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
                            painter = painterResource(id = R.drawable.an1),
                            contentDescription = "",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .clickable {
                                    navController.navigate(ANIME1_URL)
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
                            painter = painterResource(id = R.drawable.ani2),
                            contentDescription = "",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .clickable {
                                    navController.navigate(ANIME2_URL)
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
                            painter = painterResource(id = R.drawable.ani3),
                            contentDescription = "",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .clickable {
                                    navController.navigate(ANIME3_URL)
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
                            painter = painterResource(id = R.drawable.ani4),
                            contentDescription = "",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .clickable {
                                    navController.navigate(ANIME4_URL)
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
                            painter = painterResource(id = R.drawable.ani5),
                            contentDescription = "",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .clickable {
                                    navController.navigate(ANIME5_URL)
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
                            painter = painterResource(id = R.drawable.ani6),
                            contentDescription = "",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .clickable {
                                    navController.navigate(ANIME6_URL)
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
                            painter = painterResource(id = R.drawable.ani7),
                            contentDescription = "",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .clickable {
                                    navController.navigate(ANIME7_URL)
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
                            painter = painterResource(id = R.drawable.ani8),
                            contentDescription = "",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .clickable {
                                    navController.navigate(ANIME8_URL)
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
                            painter = painterResource(id = R.drawable.ani9),
                            contentDescription = "",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .clickable {
                                    navController.navigate(ANIME9_URL)
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
                            painter = painterResource(id = R.drawable.ani10),
                            contentDescription = "",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .clickable {
                                    navController.navigate(ANIME10_URL)
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
                            painter = painterResource(id = R.drawable.ani11),
                            contentDescription = "",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .clickable {
                                    navController.navigate(ANIME11_URL)
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
                            painter = painterResource(id = R.drawable.ani12),
                            contentDescription = "",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .clickable {
                                    navController.navigate(ANIME12_URL)
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
                            painter = painterResource(id = R.drawable.ani13),
                            contentDescription = "",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier .clickable {
                                navController.navigate(ANIME13_URL)
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
                            painter = painterResource(id = R.drawable.ani14),
                            contentDescription = "",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .clickable {
                                    navController.navigate(ANIME14_URL)
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
                            painter = painterResource(id = R.drawable.ani14),
                            contentDescription = "",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .clickable {
                                    navController.navigate(ANIME15_URL)
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
                            painter = painterResource(id = R.drawable.ani16),
                            contentDescription = "",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .clickable {
                                    navController.navigate(ANIME16_URL)
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
                            painter = painterResource(id = R.drawable.ani17),
                            contentDescription = "",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .clickable {
                                    navController.navigate(ANIME17_URL)
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
                            painter = painterResource(id = R.drawable.ani18),
                            contentDescription = "",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .clickable {
                                    navController.navigate(ANIME18_URL)
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
fun othersScreenPreview() {
    others(rememberNavController())
}