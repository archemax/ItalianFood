package com.example.italianfood.presentation


import android.annotation.SuppressLint
import android.content.res.Configuration
import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.Done
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FilterChip
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SearchBar
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.italianfood.R
import com.example.italianfood.model.RecipeDataClass
import com.example.italianfood.presentation.Screens.main_screen.MainScreenViewModel


@SuppressLint("UnrememberedMutableState")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(
    viewModel: MainScreenViewModel = hiltViewModel(),
    toOneRecipeScreen: (String) -> Unit,
    configuration: Configuration
) {
    val state = viewModel.state

    val queryState = remember { mutableStateOf("") }
    Log.d("queryState", "${queryState.value}")

    val selectedCategory = remember { mutableStateOf("") }
    Log.d("selectedCategory", "${selectedCategory.value}")


    val filteredRecipesBySearch = viewModel.getFilteredRecipes(queryState.value)
    Log.d("filteredRecipesBySearch", "${filteredRecipesBySearch}")

    val filteredRecipesByCategory =
        viewModel.getRecipesByCategory(selectedCategory.value)
    val doubleSearchFilterList = filteredRecipesByCategory + filteredRecipesBySearch

    val finalFilteredList =
        viewModel.myFilter(query = queryState.value, category = selectedCategory.value)


    val categoriesOfFood = listOf("Pasta", "Pizza", "Antipasti", "Dessert", "Breads", "Cocktail")
    Scaffold(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 0.dp, bottom = 0.dp, start = 8.dp, end = 8.dp)
            .paint(
                painterResource(id = R.drawable.background_jpg),
                contentScale = ContentScale.FillHeight
            ),
        topBar = {},
        bottomBar = { },

        ) { paddingValues ->
        Column(
            modifier = Modifier
                .padding(paddingValues)
                .fillMaxSize()
                .paint(
                    painterResource(id = R.drawable.background_jpg),
                    contentScale = ContentScale.FillHeight
                )
        ) {
            SearchBar(
                query = queryState.value,
                onQueryChange = { query -> queryState.value = query },
                onSearch = {},
                active = false,
                onActiveChange = { },
                placeholder = { Text(text = "Search") },
                trailingIcon = {
                    if (queryState.value.isNotEmpty()) {
                        Icon(
                            Icons.Default.Clear, contentDescription = null,
                            modifier = Modifier.clickable {
                                queryState.value = ""
                            }
                        )
                    }
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(0.dp)
                    .border(1.dp, color = Color.LightGray),

                ) {}

            Row(modifier = Modifier.horizontalScroll(rememberScrollState())) {
                categoriesOfFood.forEach { category ->
                    val isSelected = category == selectedCategory.value

                    FilterChip(
                        selected = isSelected,
                        onClick = {
                            selectedCategory.value = if (isSelected) "" else category
                        },
                        label = { Text(text = category) },
                        leadingIcon = {
                            if (isSelected) {
                                Icon(
                                    imageVector = Icons.Default.Done,
                                    contentDescription = null,
                                )
                            }
                        }
                    )
                    Spacer(modifier = Modifier.padding(end = 4.dp))

                }
            }

//////LAZY COLUMN//////////////////////////////////////////////////////////////////////////////////////////////////
            Column(modifier = Modifier.fillMaxSize()) {
                LazyColumn(modifier = Modifier.fillMaxSize()) {
                    items(
                        if (selectedCategory.value.isNotEmpty() || queryState.value.isNotEmpty()) {
                            finalFilteredList
                            //filteredRecipesByCategory

                        } else if (queryState.value.isNotEmpty()) {
                            filteredRecipesBySearch

                        } else if (queryState.value.isNotEmpty() && selectedCategory.value.isNotEmpty()) {
                            doubleSearchFilterList

                        } else {
                            state.value
                        }
                    ) { recipe ->
                        OneRecipeItem(
                            oneRecipe = recipe,
                            onClick = {
                                toOneRecipeScreen(recipe.id.toString())
                            }

                        )
                        Spacer(modifier = Modifier.height(16.dp))
                    }
                }
            }
        }
    }
}

@Composable
fun OneRecipeItem(
    oneRecipe: RecipeDataClass,
    onClick: (RecipeDataClass) -> Unit
) {
//create
    Card(
        modifier = Modifier
            .aspectRatio(2.5f)
            .clickable { onClick(oneRecipe) },
        elevation = CardDefaults.cardElevation(defaultElevation = 10.dp)
    ) {

        Row(modifier = Modifier.fillMaxHeight()) {
            Image(
                modifier = Modifier.size(158.dp),
                contentScale = ContentScale.FillHeight,
                painter = painterResource(id = oneRecipe.imageResId),
                contentDescription = null,
            )
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(start = 16.dp, end = 16.dp, top = 11.dp)
                    .height(100.dp)
            ) {
                Text(
                    text = "${oneRecipe.dishTitle}",
                    maxLines = 2,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold
                )
                //Text(text = "${oneRecipe.description}", maxLines = 1, fontSize = 8.sp)
                Spacer(modifier = Modifier.size(8.dp))

                // Iterate through ingredients and display each item
                val listOfIngredients = oneRecipe.ingredients
                Log.d("listOfIngredients", "${listOfIngredients}")

                val joinedToString = listOfIngredients.joinToString("")
                Log.d("removedJoined", "${joinedToString}")

                val replacedBackn = joinedToString.replace("\n", " ")
                Log.d("replacedBackn", "${replacedBackn}")

                val trimmed = replacedBackn.trim()
                Log.d("trimmed", "${trimmed}")


                Text(
                    text = trimmed,
                    maxLines = 2,
                    fontSize = 8.sp,
                    lineHeight = 16.sp
                )


//////////////////////////////////////
//                val listOfInstructions = oneRecipe.instructions
//                val oneStringInstructions = listOfInstructions.joinToString()
//                val finalInstructions = oneStringInstructions.replace("\n", " /")
//                Text(
//                    text = "$finalInstructions",
//                    maxLines = 1,
//                    fontSize = 8.sp,
//                )
//                Log.d("instructions", finalInstructions)


                //Divider()
                Spacer(modifier = Modifier.weight(0.5f))
                Row(
                    modifier = Modifier.padding(bottom = 8.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.category_icon),
                        contentDescription = null
                    )
                    Text(
                        text = "  ${oneRecipe.category}",
                        maxLines = 1,
                        fontSize = 8.sp
                    )
                }

            }
        }
    }
}

//// for preview only
val sampleRecipe = RecipeDataClass(
    id = 999,
    dishTitle = "Sample Dish",
    description = "Sample description",
    ingredients = listOf(
        "Ingredients:\n" +
                "1 clove of garlic\n" +
                "300 g of burrata\n" +
                "2 tablespoons of white balsamic vinegar\n" +
                "3 tablespoons of lemon olive oil\n" +
                "1/4 teaspoon of salt a little pepper\n" +
                "2 peeled lemons, cut into slices\n" +
                "½ bunch of basil leaves\n" +
                "a little fleur de sel"
    ),
    instructions = listOf("Step 1", "Step 2"),
    category = "Sample Category",
    imageResId = R.drawable.panna_cotta_60 // Replace with your actual image resource
)

@Preview(showSystemUi = true)
@Composable
fun OneRecipeItemPreview() {
    OneRecipeItem(oneRecipe = sampleRecipe, onClick = {})
}




