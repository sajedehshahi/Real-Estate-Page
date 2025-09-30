package com.example.feature.splash

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
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
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.project2.R

@Composable
@Preview
fun SplashScreen(onStartClick: () -> Unit ={}){
    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .verticalScroll(state = rememberScrollState())
    ){
        Image(
            painterResource(id=R.drawable.splash),
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )
        Text(
            text = stringResource(id= R.string.title),
            fontSize = 40.sp,
            fontWeight = FontWeight.Bold,
            color = colorResource(R.color.black),
            modifier = Modifier
                .padding(top =16.dp)
                .padding(horizontal = 24.dp)
                .fillMaxWidth()
        )
        Text(
            text = stringResource(id=R.string.lorem),
            fontSize = 16.sp,
            color = colorResource(id=R.color.black),
            modifier = Modifier
                .padding(all=24.dp)
                .fillMaxWidth()
        )
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 24.dp),
            verticalAlignment = Alignment.CenterVertically
        ){
            Button(onClick = onStartClick,
                shape = RoundedCornerShape(size = 50.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = colorResource(id=R.color.blue),
                    contentColor = colorResource(id=R.color.white)
                ),
                modifier = Modifier
                    .weight(1f)
                    .height(50.dp)
                ) {
                Text(
                    text = "Get Started",
                    fontSize = 20.sp,
                    color = Color.White
                )
            }
            Spacer(modifier = Modifier.width(16.dp))

            Image(painter = painterResource(R.drawable.google),
                contentDescription = null,
                modifier = Modifier.size(size = 50.dp)
            )
        }
        Spacer(Modifier.height(24.dp))

    }
}