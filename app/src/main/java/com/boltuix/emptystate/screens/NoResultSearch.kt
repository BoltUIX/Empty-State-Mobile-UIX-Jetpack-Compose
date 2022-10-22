package com.boltuix.emptystate.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.boltuix.emptystate.R

@Composable
fun NoResultSearch() {

    Surface(modifier = Modifier
        .fillMaxSize()
        .background(Color.Blue)) {





        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFF646584)),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.Start
        ) {

            Box( ){


                Image(
                    painter = painterResource(id = R.drawable.wall),
                    contentDescription = null,
                    contentScale = ContentScale.Fit,
                    modifier = Modifier
                        .fillMaxWidth()
                        .align(Alignment.TopCenter)


                    )

                Image(
                    painter = painterResource(id = R.drawable.person),
                    contentDescription = null,
                    contentScale = ContentScale.Fit ,
                    modifier = Modifier
                        .width(400.dp)
                        .align(Alignment.BottomStart)
                        .offset(y = 75.dp, x = (-100).dp)

                )

            }
            Spacer(modifier = Modifier.height(80.dp))
            //.........................Text: title
            Text(
                text = "No Result",
                textAlign = TextAlign.Left,
                modifier = Modifier
                    .padding(top = 20.dp, start = 25.dp, end = 25.dp)
                    .fillMaxWidth(),
                letterSpacing = 2.sp,
                fontWeight = FontWeight.Bold,
                style = MaterialTheme.typography.titleLarge,
                color = Color.White,
            )
            Spacer(modifier = Modifier.height(8.dp))

            //.........................Text : description
            Text(
                text = "Sorry, there are no results for this search. Please try another phrase",
                textAlign = TextAlign.Left,
                modifier = Modifier
                    .padding(top = 10.dp, start = 25.dp, end = 25.dp)
                    .fillMaxWidth(),
                letterSpacing = 1.sp,
                style = MaterialTheme.typography.bodyLarge,
                color = Color.White,
            )
            //.........................Spacer
            Spacer(modifier = Modifier.height(24.dp))

            var text by remember { mutableStateOf(TextFieldValue("")) }
            OutlinedTextField(
                value = text,
                onValueChange = { text = it },
                placeholder = { Text("Search") },
                colors = TextFieldDefaults.textFieldColors(
                    containerColor = Color(0xFFFFFFFF)
                ),
                shape = RoundedCornerShape(30.dp),
               // leadingIcon = { Icon(Icons.Filled.Favorite, contentDescription = "Localized description") },
                trailingIcon = { Icon(Icons.Filled.Search, contentDescription = "Localized description") },
                modifier = Modifier.padding(top = 10.dp, start = 25.dp, end = 25.dp)
            )

     }
    }



}

@Preview(showBackground = true)
@Composable
fun PreviewNoResultVI() {
    NoResultSearch()
    }
