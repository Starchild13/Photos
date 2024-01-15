
package com.starchild13.photos

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.foundation.lazy.staggeredgrid.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FilterChip
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

// Main Activity class, entry point of the Android application
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Setting the content of this activity to the GridExample composable
        setContent {
            GridExample()
        }
    }
}

// Annotation to use experimental API for Foundation layout
@OptIn(ExperimentalFoundationApi::class)
@Composable
fun GridExample() {
    // Creating a LazyVerticalStaggeredGrid with fixed 3 columns
    LazyVerticalStaggeredGrid(
        columns = StaggeredGridCells.Fixed(3),
        modifier = Modifier.padding(8.dp) // Adding padding around the entire grid
    ) {
        // Iterating over items returned by getItems() function
        items(getItems()) { drawable ->
            // Displaying each item as an Image
            Image(
                painter = painterResource(id = drawable),
                contentDescription = "",
                modifier = Modifier.padding(4.dp) // Adding padding around each image
            )
        }
    }
}

// Function returning a list of drawable resource IDs
fun getItems(): List<Int> {
    return listOf(
        // List of drawable resources (images)
        R.drawable.garfield1, R.drawable.garfield2, R.drawable.garfield3,
        R.drawable.garfield4, R.drawable.garfield5, R.drawable.garfield6,
        R.drawable.garfield10, R.drawable.garfield11, R.drawable.garfield16,
        R.drawable.garfield7, R.drawable.garfield18, R.drawable.garfield1,
        R.drawable.garfield16, R.drawable.garfield9
    )
}

// Annotation to use experimental API for Material3 components
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ChipItem(text: String, selected: MutableState<String>) {
    // Defining a FilterChip composable
    FilterChip(
        modifier = Modifier.padding(end = 16.dp), // Adding padding to the end of the chip
        selected = selected.value === text, // Chip is selected if its text matches the selected value
        onClick = { selected.value = text }, // On click, set the chip's text as the selected value
        label = { Text(text) } // Displaying the given text on the chip
    )
}
