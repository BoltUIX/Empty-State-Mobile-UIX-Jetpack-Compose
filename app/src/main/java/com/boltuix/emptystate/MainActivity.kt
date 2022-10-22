package com.boltuix.emptystate

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.boltuix.emptystate.screens.NoResultSearch
import com.boltuix.emptystate.screens.NoWallet
import com.boltuix.emptystate.screens.NoInternet
import com.boltuix.emptystate.screens.CameraPermission
import com.boltuix.emptystate.screens.LocationPermission
import com.boltuix.emptystate.screens.NotificationPermission
import com.boltuix.emptystate.screens.NoResult
import com.boltuix.emptystate.screens.NoUpcomingTrips
import com.boltuix.emptystate.screens.NoChat
import com.boltuix.emptystate.screens.NotificationUnRead
import com.boltuix.emptystate.screens.NoMessage
import com.boltuix.emptystate.screens.NoPurchase
import com.boltuix.emptystate.screens.OhNo
import com.boltuix.emptystate.screens.PaymentFailed
import com.boltuix.emptystate.screens.BuySomeItems
import com.boltuix.emptystate.ui.theme.EmptyStateTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EmptyStateTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    //  OhNo()
                    //  PaymentFailed()
                    //  NoResultSearch()
                    //  NoInternet()
                    //  CameraPermission()
                    //  LocationPermission()
                    //  NotificationPermission()
                    //  NoChat()
                    //  NoMessage()
                    //  NoResult()
                    //  NoUpcomingTrips()
                    //  NoWallet()
                    //  NotificationUnRead()
                    //  NoPurchase()
                        BuySomeItems()
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    EmptyStateTheme {
        BuySomeItems()
    }
}