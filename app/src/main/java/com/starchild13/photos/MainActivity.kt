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
import com.starchild13.photos.ui.theme.PhotosTheme

/**
 * MainActivity serves as the primary entry point for the Photos application.
 * It initializes the Jetpack Compose user interface containing the staggered photo grid.
 */
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Set the content of the activity using Jetpack Compose with the app theme
        setContent {
            PhotosTheme {
                GridExample()
            }
        }
    }
}

/**
 * A Composable function that displays a staggered grid of photo items.
 * Uses LazyVerticalStaggeredGrid to arrange images in a responsive 3-column layout.
 */
@OptIn(ExperimentalFoundationApi::class)
@Composable
fun GridExample() {
    // Render a vertical staggered grid with 3 fixed columns and padding
    LazyVerticalStaggeredGrid(
        columns = StaggeredGridCells.Fixed(3),
        modifier = Modifier.padding(8.dp) // Outer padding around the entire grid container
    ) {
        // Iterate over the list of image resource IDs provided by getItems()
        items(getItems()) { drawable ->
            // Display each image item with consistent padding
            Image(
                painter = painterResource(id = drawable),
                contentDescription = "Garfield Photo Item",
                modifier = Modifier.padding(4.dp) // Spacing between individual grid cells
            )
        }
    }
}

/**
 * Provides a curated list of drawable resource IDs representing photos in the gallery.
 *
 * @return A [List] of integer resource references for local image drawables.
 */
fun getItems(): List<Int> {
    return listOf(
        R.drawable.garfield1, R.drawable.garfield2, R.drawable.garfield3,
        R.drawable.garfield4, R.drawable.garfield5, R.drawable.garfield6,
        R.drawable.garfield10, R.drawable.garfield11, R.drawable.garfield16,
        R.drawable.garfield7, R.drawable.garfield18, R.drawable.garfield1,
        R.drawable.garfield16, R.drawable.garfield9
    )
}

/**
 * A reusable FilterChip component for category or tag filtering in the photo gallery UI.
 *
 * @param text The display label for the filter chip.
 * @param selected State holder representing whether the chip is currently selected.
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ChipItem(text: String, selected: MutableState<String>) {
    FilterChip(
        modifier = Modifier.padding(end = 16.dp), // Right margin separating filter chips
        selected = selected.value === text,       // Evaluates selection state based on matching text
        onClick = { selected.value = text },      // Updates the selected state value when clicked
        label = { Text(text) }                    // Label text content inside the chip
    )
}
