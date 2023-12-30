// The package declaration. It is a way to organize files in Kotlin (or Java).
package com.starchild13.photos

// Import necessary modules from the Android framework and Jetpack Compose UI toolkit.
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

// Define the main activity. This is the entry point of the app.
class MainActivity : ComponentActivity() {
    // Override the onCreate method. This method gets called when the activity is first created.
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Set the content of this activity to the FlowRowExample composable.
        setContent {
            FlowRowExample()
        }
    }
}

// Preview annotation to provide a preview of the FlowRowExample in the IDE.
@Preview(showBackground = true)
@Composable
fun PreviewFlowRow() {
    FlowRowExample()
}

// Opt-in to using the ExperimentalLayoutApi to allow usage of FlowRow.
// Define the FlowRowExample composable. It shows a row of filter chips.
@OptIn(ExperimentalLayoutApi::class)
@Composable
private fun FlowRowExample() {


        FlowRow(
            Modifier.padding(8.dp),
        ) {

            getitems().forEach { drawable ->
                Image(
                    painter = painterResource(id = drawable),
                    contentDescription = "",

                )

            }

        }
    }

fun getitems():List<Int>{
    return listOf(R.drawable.garfield1,R.drawable.garfield2,R.drawable.garfield3,R.drawable.garfield4,R.drawable.garfield5,R.drawable.garfield6,R.drawable.garfield10,R.drawable.garfield11,R.drawable.garfield16,R.drawable.garfield7,
        R.drawable.garfield18,R.drawable.garfield1,R.drawable.garfield16,R.drawable.garfield9)

}
@OptIn(ExperimentalFoundationApi::class)
@Composable
fun Gridexample() {
    LazyVerticalStaggeredGrid(
        columns = StaggeredGridCells.Fixed(3)
    ) {
        items(getitems()) { drawable ->
            Image(
                painter = painterResource(id = drawable),
                contentDescription = ""
            )
        }

        }
    }




// Opt-in to using the ExperimentalMaterial3Api to allow usage of FilterChip.
// Define the ChipItem composable. It shows a single chip.
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ChipItem(text: String,selected:MutableState<String>) {
    // Define a filter chip.
    FilterChip(
        // Add padding to the end of the chip.
        modifier = Modifier.padding(end = 16.dp),
        // Set the chip as selected if its text matches the remembered value.
        selected = selected.value === text ,
        // When the chip is clicked, set its text as the remembered value.
        onClick = {selected.value = text },
        // Set the chip's label as the given text.
        label = { Text(text) }
    )
}