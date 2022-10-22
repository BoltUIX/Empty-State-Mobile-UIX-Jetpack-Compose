package com.boltuix.emptystate.screens

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.boltuix.emptystate.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NotificationUnRead() {

    Surface(modifier = Modifier.fillMaxSize()) {



        // on the below line we are specifying the theme as the scaffold.
        Scaffold(

            // in scaffold we are specifying the top bar.
            topBar = {
                // inside top bar we are specifying background color.
            }) {
            Modifier.padding(it)

            Column(
                modifier = Modifier.fillMaxSize().background(Color(0xFFECEEEE)),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {



                Image(
                    painter = painterResource(id = R.drawable.notification_no_message),
                    contentDescription = null,
                    contentScale = ContentScale.Fit,
                    modifier = Modifier
                        .height(200.dp)
                        .fillMaxWidth(),

                    )

                Spacer(modifier = Modifier.height(20.dp))
                //.........................Text: title
                Text(
                    text = "No Notifications",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(top = 20.dp)
                        .fillMaxWidth(),
                    letterSpacing = 2.sp,
                    fontWeight = FontWeight.Bold,
                    style = MaterialTheme.typography.titleLarge,
                    color = MaterialTheme.colorScheme.primary,
                )
                Spacer(modifier = Modifier.height(8.dp))

                //.........................Text : description
                Text(
                    text = "When you have notification, you 'll see them here",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(top = 10.dp, start = 25.dp, end = 25.dp)
                        .fillMaxWidth(),
                    letterSpacing = 1.sp,
                    style = MaterialTheme.typography.bodyLarge,
                    color = MaterialTheme.colorScheme.primary,
                )
                //.........................Spacer
                Spacer(modifier = Modifier.height(24.dp))


            }

            FloatingActionButtons()


        }



    }



}

@Composable
fun FloatingActionButtons() {

    val ctx = LocalContext.current

    // on the below line we are creating a column.
    Column(
        // on below line we are adding a modifier to it
        // and setting max size, max height and max width
        modifier = Modifier
            .fillMaxSize()
            .fillMaxHeight()
            .fillMaxWidth()
            .padding(30.dp)
        ,

        // on below line we are adding vertical
        // arrangement and horizontal alignment.
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.End,
    ) {


        // on below line we are creating
        // a simple floating action button
        FloatingActionButton(
            // on below line we are adding on click for our fab
            onClick = {
                Toast.makeText(ctx, "Simple Floating Action Button", Toast.LENGTH_SHORT).show()
            },
            // on below line we are adding
            // background color for our button
            //backgroundColor = greenColor,
            // on below line we are adding
            // color for our content of fab.
           // contentColor = Color.White,
            containerColor = Color(0xFF6af7b3),
            contentColor = Color.Black,

            ) {
            // on below line we are
            // adding icon for button.
            Icon(Icons.Filled.Add, "")
        }


    }
}
