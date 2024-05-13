package com.example.wazitoecommerce.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.wazitoecommerce.ui.theme.screens.animatonsinglepics.anime1
import com.example.wazitoecommerce.ui.theme.screens.animatonsinglepics.anime10
import com.example.wazitoecommerce.ui.theme.screens.animatonsinglepics.anime11
import com.example.wazitoecommerce.ui.theme.screens.animatonsinglepics.anime12
import com.example.wazitoecommerce.ui.theme.screens.animatonsinglepics.anime13
import com.example.wazitoecommerce.ui.theme.screens.animatonsinglepics.anime14
import com.example.wazitoecommerce.ui.theme.screens.animatonsinglepics.anime15
import com.example.wazitoecommerce.ui.theme.screens.animatonsinglepics.anime16
import com.example.wazitoecommerce.ui.theme.screens.animatonsinglepics.anime17
import com.example.wazitoecommerce.ui.theme.screens.animatonsinglepics.anime18
import com.example.wazitoecommerce.ui.theme.screens.animatonsinglepics.anime2
import com.example.wazitoecommerce.ui.theme.screens.animatonsinglepics.anime3
import com.example.wazitoecommerce.ui.theme.screens.animatonsinglepics.anime4
import com.example.wazitoecommerce.ui.theme.screens.animatonsinglepics.anime5
import com.example.wazitoecommerce.ui.theme.screens.animatonsinglepics.anime6
import com.example.wazitoecommerce.ui.theme.screens.animatonsinglepics.anime7
import com.example.wazitoecommerce.ui.theme.screens.animatonsinglepics.anime8
 import com.example.wazitoecommerce.ui.theme.screens.animatonsinglepics.anime90
import com.example.wazitoecommerce.ui.theme.screens.animatonsinglepics.oth1
import com.example.wazitoecommerce.ui.theme.screens.animatonsinglepics.oth10
import com.example.wazitoecommerce.ui.theme.screens.animatonsinglepics.oth11
import com.example.wazitoecommerce.ui.theme.screens.animatonsinglepics.oth12
import com.example.wazitoecommerce.ui.theme.screens.animatonsinglepics.oth13
import com.example.wazitoecommerce.ui.theme.screens.animatonsinglepics.oth14
import com.example.wazitoecommerce.ui.theme.screens.animatonsinglepics.oth15
import com.example.wazitoecommerce.ui.theme.screens.animatonsinglepics.oth16
import com.example.wazitoecommerce.ui.theme.screens.animatonsinglepics.oth18
import com.example.wazitoecommerce.ui.theme.screens.animatonsinglepics.oth19
import com.example.wazitoecommerce.ui.theme.screens.animatonsinglepics.oth2
import com.example.wazitoecommerce.ui.theme.screens.animatonsinglepics.oth20
import com.example.wazitoecommerce.ui.theme.screens.animatonsinglepics.oth21
import com.example.wazitoecommerce.ui.theme.screens.animatonsinglepics.oth22
import com.example.wazitoecommerce.ui.theme.screens.animatonsinglepics.oth23
import com.example.wazitoecommerce.ui.theme.screens.animatonsinglepics.oth24
import com.example.wazitoecommerce.ui.theme.screens.animatonsinglepics.oth25
import com.example.wazitoecommerce.ui.theme.screens.animatonsinglepics.oth26
import com.example.wazitoecommerce.ui.theme.screens.animatonsinglepics.oth27
import com.example.wazitoecommerce.ui.theme.screens.animatonsinglepics.oth28
import com.example.wazitoecommerce.ui.theme.screens.animatonsinglepics.oth29
import com.example.wazitoecommerce.ui.theme.screens.animatonsinglepics.oth3
import com.example.wazitoecommerce.ui.theme.screens.animatonsinglepics.oth30
import com.example.wazitoecommerce.ui.theme.screens.animatonsinglepics.oth31
import com.example.wazitoecommerce.ui.theme.screens.animatonsinglepics.oth32
import com.example.wazitoecommerce.ui.theme.screens.animatonsinglepics.oth33
import com.example.wazitoecommerce.ui.theme.screens.animatonsinglepics.oth34
import com.example.wazitoecommerce.ui.theme.screens.animatonsinglepics.oth35
import com.example.wazitoecommerce.ui.theme.screens.animatonsinglepics.oth36
import com.example.wazitoecommerce.ui.theme.screens.animatonsinglepics.oth37
import com.example.wazitoecommerce.ui.theme.screens.animatonsinglepics.oth38
import com.example.wazitoecommerce.ui.theme.screens.animatonsinglepics.oth39
import com.example.wazitoecommerce.ui.theme.screens.animatonsinglepics.oth4
import com.example.wazitoecommerce.ui.theme.screens.animatonsinglepics.oth40
import com.example.wazitoecommerce.ui.theme.screens.animatonsinglepics.oth41
import com.example.wazitoecommerce.ui.theme.screens.animatonsinglepics.oth42
import com.example.wazitoecommerce.ui.theme.screens.animatonsinglepics.oth43
import com.example.wazitoecommerce.ui.theme.screens.animatonsinglepics.oth44
import com.example.wazitoecommerce.ui.theme.screens.animatonsinglepics.oth45
import com.example.wazitoecommerce.ui.theme.screens.animatonsinglepics.oth46
import com.example.wazitoecommerce.ui.theme.screens.animatonsinglepics.oth47
import com.example.wazitoecommerce.ui.theme.screens.animatonsinglepics.oth48
import com.example.wazitoecommerce.ui.theme.screens.animatonsinglepics.oth49
import com.example.wazitoecommerce.ui.theme.screens.animatonsinglepics.oth5
import com.example.wazitoecommerce.ui.theme.screens.animatonsinglepics.oth50
import com.example.wazitoecommerce.ui.theme.screens.animatonsinglepics.oth51
import com.example.wazitoecommerce.ui.theme.screens.animatonsinglepics.oth52
import com.example.wazitoecommerce.ui.theme.screens.animatonsinglepics.oth53
import com.example.wazitoecommerce.ui.theme.screens.animatonsinglepics.oth54
import com.example.wazitoecommerce.ui.theme.screens.animatonsinglepics.oth6
import com.example.wazitoecommerce.ui.theme.screens.animatonsinglepics.oth7
import com.example.wazitoecommerce.ui.theme.screens.animatonsinglepics.oth8
import com.example.wazitoecommerce.ui.theme.screens.animatonsinglepics.oth9
import com.example.wazitoecommerce.ui.theme.screens.carssinglepics.car1
import com.example.wazitoecommerce.ui.theme.screens.carssinglepics.car10
import com.example.wazitoecommerce.ui.theme.screens.carssinglepics.car11
import com.example.wazitoecommerce.ui.theme.screens.carssinglepics.car12
import com.example.wazitoecommerce.ui.theme.screens.carssinglepics.car13
import com.example.wazitoecommerce.ui.theme.screens.carssinglepics.car14
import com.example.wazitoecommerce.ui.theme.screens.carssinglepics.car15
import com.example.wazitoecommerce.ui.theme.screens.carssinglepics.car16
import com.example.wazitoecommerce.ui.theme.screens.carssinglepics.car2
import com.example.wazitoecommerce.ui.theme.screens.carssinglepics.car3
import com.example.wazitoecommerce.ui.theme.screens.carssinglepics.car4
import com.example.wazitoecommerce.ui.theme.screens.carssinglepics.car5
import com.example.wazitoecommerce.ui.theme.screens.carssinglepics.car6
import com.example.wazitoecommerce.ui.theme.screens.carssinglepics.car7
import com.example.wazitoecommerce.ui.theme.screens.carssinglepics.car8
import com.example.wazitoecommerce.ui.theme.screens.carssinglepics.car9
import com.example.wazitoecommerce.ui.theme.screens.love.anime
import com.example.wazitoecommerce.ui.theme.screens.love.cars
import com.example.wazitoecommerce.ui.theme.screens.love.loveScreen
import com.example.wazitoecommerce.ui.theme.screens.love.nature
import com.example.wazitoecommerce.ui.theme.screens.love.ntr17
import com.example.wazitoecommerce.ui.theme.screens.love.others
 import com.example.wazitoecommerce.ui.theme.screens.love.pic10
import com.example.wazitoecommerce.ui.theme.screens.love.pic11
import com.example.wazitoecommerce.ui.theme.screens.love.pic12
import com.example.wazitoecommerce.ui.theme.screens.love.pic13
import com.example.wazitoecommerce.ui.theme.screens.love.pic14
import com.example.wazitoecommerce.ui.theme.screens.love.pic15
import com.example.wazitoecommerce.ui.theme.screens.love.pic16
import com.example.wazitoecommerce.ui.theme.screens.love.pic2
import com.example.wazitoecommerce.ui.theme.screens.love.pic3
import com.example.wazitoecommerce.ui.theme.screens.love.pic4
import com.example.wazitoecommerce.ui.theme.screens.love.pic5
import com.example.wazitoecommerce.ui.theme.screens.love.pic6
import com.example.wazitoecommerce.ui.theme.screens.love.pic7
import com.example.wazitoecommerce.ui.theme.screens.love.pic8
import com.example.wazitoecommerce.ui.theme.screens.love.pic9
import com.example.wazitoecommerce.ui.theme.screens.naturesinglepics.ntr1
import com.example.wazitoecommerce.ui.theme.screens.naturesinglepics.ntr10
import com.example.wazitoecommerce.ui.theme.screens.naturesinglepics.ntr11
import com.example.wazitoecommerce.ui.theme.screens.naturesinglepics.ntr12
import com.example.wazitoecommerce.ui.theme.screens.naturesinglepics.ntr13
import com.example.wazitoecommerce.ui.theme.screens.naturesinglepics.ntr14
import com.example.wazitoecommerce.ui.theme.screens.naturesinglepics.ntr15
import com.example.wazitoecommerce.ui.theme.screens.naturesinglepics.ntr16
import com.example.wazitoecommerce.ui.theme.screens.naturesinglepics.ntr18
import com.example.wazitoecommerce.ui.theme.screens.naturesinglepics.ntr2
import com.example.wazitoecommerce.ui.theme.screens.naturesinglepics.ntr3
import com.example.wazitoecommerce.ui.theme.screens.naturesinglepics.ntr4
import com.example.wazitoecommerce.ui.theme.screens.naturesinglepics.ntr6
import com.example.wazitoecommerce.ui.theme.screens.naturesinglepics.ntr7
import com.example.wazitoecommerce.ui.theme.screens.naturesinglepics.ntr8
import com.example.wazitoecommerce.ui.theme.screens.naturesinglepics.ntr9
import com.example.wazitoecommerce.ui.theme.screens.typesofwallpaperavailable.mainscreen

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController:NavHostController = rememberNavController(),
    startDestination:String = MAINPICS_URL
){
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier) {
        composable(MAINPICS_URL) {
            mainscreen(navController = navController)
        }

        composable(NATURE_URL) {
            nature(navController = navController)
        }
        composable(LOVE_URL) {
            loveScreen(navController = navController)
        }
        composable(CARS_URL) {
            cars(navController = navController)
        }

        composable(ANIMATIONS_URL) {
            anime(navController = navController)
        }
        composable(OTHERS_URL) {
            others(navController = navController)


        }
// love pics
        composable(PIC2_URL) {
            pic2(navController = navController)
        }
        composable(PIC3_URL) {
            pic3(navController = navController)
        }
        composable(PIC4_URL) {
            pic4(navController = navController)
        }
        composable(PIC5_URL) {
            pic5(navController = navController)
        }
        composable(PIC6_URL) {
            pic6(navController = navController)
        }
        composable(PIC7_URL) {
            pic7(navController = navController)
        }
        composable(PIC8_URL) {
            pic8(navController = navController)
        }
        composable(PIC9_URL) {
            pic9(navController = navController)
        }
        composable(PIC10_URL) {
            pic10(navController = navController)
        }
        composable(PIC11_URL) {
            pic11(navController = navController)
        }
        composable(PIC12_URL) {
            pic12(navController = navController)
        }
        composable(PIC13_URL) {
            pic13(navController = navController)
        }
        composable(PIC14_URL) {
            pic14(navController = navController)
        }
        composable(PIC15_URL) {
            pic15(navController = navController)
        }
        composable(PIC16_URL) {
            pic16(navController = navController)
        }



        //love pics




        // car pics
        composable(CAR1_URL) {
            car1(navController = navController)
        }
        composable(CAR2_URL) {
            car2(navController = navController)
        }
        composable(CAR3_URL) {
            car3(navController = navController)
        }
        composable(CAR4_URL) {
            car4(navController = navController)
        }
        composable(CAR5_URL) {
            car5(navController = navController)
        }
        composable(CAR6_URL) {
            car6(navController = navController)
        }
        composable(CAR7_URL) {
            car7(navController = navController)
        }
        composable(CAR8_URL) {
            car8(navController = navController)
        }
        composable(CAR9_URL) {
            car9(navController = navController)
        }
        composable(CAR10_URL) {
           car10(navController = navController)
        }
        composable(CAR11_URL) {
            car11(navController = navController)
        }
        composable(CAR12_URL) {
            car12(navController = navController)
        }
        composable(CAR13_URL) {
            car13(navController = navController)
        }
        composable(CAR14_URL) {
            car14(navController = navController)
        }
        composable(CAR15_URL) {
            car15(navController = navController)
        }
        composable(CAR16_URL) {
            car16(navController = navController)
        }
    //car pics

        // ntr pics
        composable(NTR1_URL) {
            ntr1(navController = navController)
        }
        composable(NTR2_URL) {
            ntr2(navController = navController)
        }
        composable(NTR3_URL) {
            ntr3(navController = navController)
        }
        composable(NTR4_URL) {
            ntr4(navController = navController)
        }
        composable(NTR5_URL) {
            ntr1(navController = navController)
        }
        composable(NTR6_URL) {
            ntr6(navController = navController)
        }
        composable(NTR7_URL) {
            ntr7(navController = navController)
        }
        composable(NTR8_URL) {
            ntr8(navController = navController)
        }
        composable(NTR9_URL) {
            ntr9(navController = navController)
        }
        composable(NTR10_URL) {
            ntr10(navController = navController)
        }
        composable(NTR11_URL) {
            ntr11(navController = navController)
        }
        composable(NTR12_URL) {
            ntr12(navController = navController)
        }
        composable(NTR13_URL) {
            ntr13(navController = navController)
        }
        composable(NTR14_URL) {
            ntr14(navController = navController)
        }
        composable(NTR15_URL) {
            ntr15(navController = navController)
        }
        composable(NTR16_URL) {
            ntr16(navController = navController)
        }
        composable(NTR17_URL) {
            ntr17(navController = navController)
        }
        composable(NTR18_URL) {
            ntr18(navController = navController)
        }

        //ntr pics

        // anime pics
        composable(ANIME1_URL) {
            anime1(navController = navController)
        }
        composable(ANIME2_URL) {
            anime2(navController = navController)
        }
        composable(ANIME3_URL) {
            anime3(navController = navController)
        }
        composable(ANIME4_URL) {
            anime4(navController = navController)
        }
        composable(ANIME5_URL) {
            anime5(navController = navController)
        }
        composable(ANIME6_URL) {
            anime6(navController = navController)
        }
        composable(ANIME7_URL) {
            anime7(navController = navController)
        }
        composable(ANIME8_URL) {
            anime8(navController = navController)
        }
        composable(ANIME9_URL) {
            anime90(navController = navController)
        }
        composable(ANIME10_URL) {
            anime10(navController = navController)
        }
        composable(ANIME11_URL) {
            anime11(navController = navController)
        }
        composable(ANIME12_URL) {
            anime12(navController = navController)
        }
        composable(ANIME13_URL) {
            anime13(navController = navController)
        }
        composable(ANIME14_URL) {
            anime14(navController = navController)
        }
        composable(ANIME15_URL) {
            anime15(navController = navController)
        }
        composable(ANIME16_URL) {
            anime16(navController = navController)
        }
        composable(ANIME17_URL) {
            anime17(navController = navController)
        }
        composable(ANIME18_URL) {
            anime18(navController = navController)
        }

        //Anime pics


        // other pics
        composable(OTHER1_URL) {
            oth1(navController = navController)
        }
        composable(OTHER2_URL) {
            oth2(navController = navController)
        }
        composable(OTHER3_URL) {
            oth3(navController = navController)
        }
        composable(OTHER4_URL) {
            oth4(navController = navController)
        }
        composable(OTHER5_URL) {
            anime5(navController = navController)
        }
        composable(OTHER6_URL) {
            oth6(navController = navController)
        }
        composable(OTHER7_URL) {
            oth7(navController = navController)
        }
        composable(OTHER8_URL) {
            oth8(navController = navController)
        }
        composable(OTHER9_URL) {
            oth9(navController = navController)
        }
        composable(OTHER10_URL) {
            oth10(navController = navController)
        }
        composable(OTHER11_URL) {
            oth11(navController = navController)
        }
        composable(OTHER12_URL) {
            oth12(navController = navController)
        }
        composable(OTHER13_URL) {
            oth13(navController = navController)
        }
        composable(OTHER14_URL) {
            oth14(navController = navController)
        }
        composable(OTHER15_URL) {
            oth15(navController = navController)
        }
        composable(OTHER16_URL) {
            oth16(navController = navController)
        }
        composable(OTHER17_URL) {
            anime17(navController = navController)
        }
        composable(OTHER18_URL) {
            oth18(navController = navController)
        }

        composable(OTHER19_URL) {
            oth19(navController = navController)
        }
        composable(OTHER20_URL) {
            oth20(navController = navController)
        }
        composable(OTHER21_URL) {
            oth21(navController = navController)
        }
        composable(OTHER22_URL) {
            oth22(navController = navController)
        }
        composable(OTHER23_URL) {
            oth23(navController = navController)
        }
        composable(OTHER24_URL) {
            oth24(navController = navController)
        }
        composable(OTHER25_URL) {
            oth25(navController = navController)
        }
        composable(OTHER26_URL) {
            oth26(navController = navController)
        }
        composable(OTHER27_URL) {
            oth27(navController = navController)
        }
        composable(OTHER28_URL) {
            oth28(navController = navController)
        }
        composable(OTHER29_URL) {
            oth29(navController = navController)
        }
        composable(OTHER30_URL) {
            oth30(navController = navController)
        }
        composable(OTHER31_URL) {
            oth31(navController = navController)
        }
        composable(OTHER32_URL) {
            oth32(navController = navController)
        }
        composable(OTHER33_URL) {
            oth33(navController = navController)
        }
        composable(OTHER34_URL) {
            oth34(navController = navController)
        }
        composable(OTHER35_URL) {
            oth35(navController = navController)
        }
        composable(OTHER36_URL) {
            oth36(navController = navController)
        }

        composable(OTHER37_URL) {
            oth37(navController = navController)
        }
        composable(OTHER38_URL) {
            oth38(navController = navController)
        }
        composable(OTHER39_URL) {
            oth39(navController = navController)
        }
        composable(OTHER40_URL) {
            oth40(navController = navController)
        }
        composable(OTHER41_URL) {
            oth41 (navController = navController)
        }
        composable(OTHER42_URL) {
            oth42(navController = navController)
        }
        composable(OTHER43_URL) {
            oth43(navController = navController)
        }
        composable(OTHER44_URL) {
            oth44(navController = navController)
        }
        composable(OTHER45_URL) {
            oth45(navController = navController)
        }
        composable(OTHER46_URL) {
            oth46(navController = navController)
        }
        composable(OTHER47_URL) {
            oth47(navController = navController)
        }
        composable(OTHER48_URL) {
            oth48(navController = navController)
        }
        composable(OTHER49_URL) {
            oth49(navController = navController)
        }
        composable(OTHER50_URL) {
            oth50(navController = navController)
        }
        composable(OTHER51_URL) {
            oth51(navController = navController)
        }
        composable(OTHER52_URL) {
            oth52(navController = navController)
        }
        composable(OTHER53_URL) {
            oth53(navController = navController)
        }
        composable(OTHER54_URL) {
            oth54(navController = navController)
        }

        //other pics











    }
}






















