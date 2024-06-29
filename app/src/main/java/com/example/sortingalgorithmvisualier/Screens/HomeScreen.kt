package com.example.sortingalgorithmvisualier.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
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
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.sortingalgorithmvisualier.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavController) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        "Algorithm Visualiser",
                        color = Color.Black,
                        fontSize = 28.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.padding(start = 40.dp)
                    )
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = colorResource(id = R.color.bgcolor)
                ),
                modifier = Modifier.fillMaxWidth()
            )
        },
        containerColor = Color.White // Set the scaffold background color to white
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .verticalScroll(rememberScrollState())
                .fillMaxSize()
                .padding(innerPadding)
                .padding(top = 8.dp, bottom = 24.dp)
                .background(Color.White),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.height(16.dp))
            SortOption(navController = navController, algorithmName = "Bubble", screenname = "bubbleSort", complexity = "n\u00B2")
            SortOption(navController = navController, algorithmName = "Insertion", screenname = "insertionSort", complexity = "n\u00B2")
            SortOption(navController = navController, algorithmName = "Merge", screenname = "mergeSort", complexity = "nlogn")
            SortOption(navController = navController, algorithmName = "Quick", screenname = "quickSort", complexity = "nlogn")
            SortOption(navController = navController, algorithmName = "Selection", screenname = "selectionSort", complexity = "n\u00B2")
        }
    }
}

@Composable
fun SortOption(
    navController: NavController,
    algorithmName: String,
    complexity:String,
    screenname: String
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(200.dp) // Match the height to the increased image size
            .clickable {
                navController.navigate("$screenname")
            }
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Start
    ) {
        Image(
            painter = painterResource(id = R.drawable.dummy),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .size(200.dp) // Slightly larger image size
                .background(color = Color.Transparent)
        )
        Spacer(modifier = Modifier.width(8.dp))
        Column(
            modifier = Modifier
                .fillMaxHeight()
                .padding(top = 22.dp),

            verticalArrangement = Arrangement.Top, // Center contents vertically within the Column
            horizontalAlignment = Alignment.CenterHorizontally // Center contents horizontally within the Column
        ) {
            Text(
                text = algorithmName,
                modifier = Modifier.fillMaxWidth(),
                fontSize = 26.sp,
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.height(16.dp)) // Adjusted spacing
            Text(
                text = "O($complexity)",
                modifier = Modifier.fillMaxWidth(),
                fontSize = 24.sp,
                textAlign = TextAlign.Center
            )
        }
       Divider(
            color = colorResource(id = R.color.topicon), // This is a tan color, adjust as needed
            thickness = 2.dp,
            modifier = Modifier
                .fillMaxWidth()
                .padding(6.dp)
        )
    }
}
