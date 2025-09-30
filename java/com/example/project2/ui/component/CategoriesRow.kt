package com.example.project2.ui.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.project2.R

@Composable
fun CategoriesRow(){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 16.dp),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        CategoryItem(R.drawable.cat_1, "House", Modifier.weight(1f))
        CategoryItem(R.drawable.cat_2, "Apartment", Modifier.weight(1f))
        CategoryItem(R.drawable.cat_3, "Villa", Modifier.weight(1f))
        CategoryItem(R.drawable.cat_4, "Bangola", Modifier.weight(1f))
        CategoryItem(R.drawable.cat_5, "Empty land", Modifier.weight(1f))
    }
}
