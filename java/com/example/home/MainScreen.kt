package com.example.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.project2.R
import com.example.project2.ui.component.CategoriesRow
import com.example.project2.ui.component.HeaderSection
import com.example.project2.ui.component.PropertyCard
import com.example.project2.ui.component.SearchRow

@Composable
@Preview
fun  MainScreen(){
    val items = remember { sampleProperties() }
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .statusBarsPadding()
            .background(colorResource(R.color.lightgrey)),
        contentPadding = PaddingValues(bottom = 100.dp)
    ) {
        item { HeaderSection() }
        item { Spacer(Modifier.height(16.dp)) }
        item { SearchRow() }
        item { Spacer(Modifier.height(16.dp)) }
        item { CategoriesRow() }
        item { Spacer(Modifier.height(8.dp)) }
        items(items){property-> PropertyCard(property) }
        item{Spacer(Modifier.height(16.dp))}


    }
}