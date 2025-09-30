package com.example.project2.ui.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.project2.R

@Composable
fun TopBar(onBack:() -> Unit = {}){
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 24.dp)
    ){
        Image(painter = painterResource(R.drawable.back),
            contentDescription = null,
            modifier = Modifier
                .align(Alignment.CenterStart)
                .size(48.dp)
            )
        Text(
            text = "Profile",
            modifier = Modifier
                .align(Alignment.Center),
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = colorResource(R.color.black)
        )
    }

}
@Preview(showBackground = true)
@Composable
fun TopBarPreview() {
    TopBar(onBack = {})
}
