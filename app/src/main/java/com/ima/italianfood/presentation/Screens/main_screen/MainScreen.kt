package com.ima.italianfood.presentation


import android.annotation.SuppressLint
import android.content.res.Configuration
import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.BoxWithConstraints
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedFilterChip
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FilterChipDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SearchBar
import androidx.compose.material3.SearchBarDefaults
import androidx.compose.material3.SelectableChipElevation
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalMapOf
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.ima.italianfood.R
import com.ima.italianfood.model.RecipeDataClass
import com.ima.italianfood.presentation.Screens.main_screen.MainScreenViewModel


@SuppressLint("UnrememberedMutableState")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(
    viewModel: MainScreenViewModel = hiltViewModel(),
    toOneRecipeScreen: (String) -> Unit,
    configuration: Configuration
) {
    val state = viewModel.state

    val number = 1

    val queryState = rememberSaveable { mutableStateOf("") }
    Log.d("queryState", "${queryState.value}")

    val selectedCategory = rememberSaveable { mutableStateOf("") }
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
            .fillMaxSize(),
        topBar = {},
        bottomBar = {},
    ) { paddingValues ->

        Column(
            modifier = Modifier
                .padding(paddingValues)
                .fillMaxSize()
                .padding(top = 0.dp, bottom = 0.dp, start = 8.dp, end = 8.dp)

//
        ) {
            SearchBar(
                query = queryState.value,
                onQueryChange = { query -> queryState.value = query },
                onSearch = {},
                active = false,
                onActiveChange = { },
                placeholder = { Text(text = "Search...") },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 24.dp),
                colors = SearchBarDefaults.colors(containerColor = Color(0xFFECEFFB)),
                leadingIcon = {
                    Icon(
                        painter = painterResource(id = R.drawable.search_leading_icon),
                        contentDescription = "search circle"
                    )
                },
                trailingIcon = {
                    if (queryState.value.isNotEmpty()) {
                        Icon(
                            Icons.Default.Clear, contentDescription = null,
                            modifier = Modifier
                                .clickable {
                                    queryState.value = ""
                                }
                                .padding(12.dp)
                        )
                    }
                },

                //.border(1.dp, color = Color.LightGray),

            ) {}
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = "What will you cook?",
                style = TextStyle(
                    fontSize = 14.sp,
                    lineHeight = 16.sp,
                    fontFamily = FontFamily(Font(R.font.montserrat_bold)),
                    fontWeight = FontWeight(700),
                    color = Color(0xFF000000),
                    letterSpacing = 0.4.sp,
                )

            )


            Row(modifier = Modifier.horizontalScroll(rememberScrollState())) {
                categoriesOfFood.forEach { category ->
                    val isSelected = category == selectedCategory.value
                    val myElevation: SelectableChipElevation? = if (isSelected) {
                        FilterChipDefaults.filterChipElevation(8.dp)
                    } else {
                        FilterChipDefaults.filterChipElevation(0.dp)
                    }

                    ElevatedFilterChip(
                        selected = isSelected,
                        onClick = {
                            selectedCategory.value = if (isSelected) "" else category
                        },
                        elevation = myElevation,

                        label = {
                            Text(
                                text = category,
                                style = TextStyle(
                                    fontSize = 12.sp,
                                    lineHeight = 20.sp,
                                    fontFamily = FontFamily(Font(R.font.montserrat_semi_bold)),
                                    fontWeight = FontWeight(500),
                                    color = Color(0xFF3F486C),
                                    textAlign = TextAlign.Center,
                                    letterSpacing = 0.1.sp,
                                )
                            )
                        },


                        border = FilterChipDefaults.filterChipBorder(
                            borderColor = Color(0xFF848EB2),
                            selectedBorderColor = Color(0xFF848EB2), selectedBorderWidth = 1.dp
                        ),
                        colors = FilterChipDefaults.filterChipColors(
                            selectedContainerColor = Color(0xFFECEFFB)
                        ),


//                        leadingIcon = {
//                            if (isSelected) {
//                                Icon(
//                                    imageVector = Icons.Default.Clear,
//                                    contentDescription = null,
//                                    modifier = Modifier
//                                        .background(color = Color(0xFFECEFFB))
//                                        .clip(MaterialTheme.shapes.small)
//                                )
//                            }
//                        }
                    )
                    Spacer(modifier = Modifier.padding(end = 4.dp))

                }
            }

////Recommended for you//////////////////////////////////////////////////////////////////////////////////

            Text(
                text = "Recommended for you",
                style = TextStyle(
                    fontSize = 14.sp,
                    lineHeight = 16.sp,
                    fontFamily = FontFamily(Font(R.font.montserrat_bold)),
                    fontWeight = FontWeight(700),
                    color = Color(0xFF000000),
                    letterSpacing = 0.4.sp,
                )

            )
            Spacer(modifier = Modifier.height(12.dp))
//////Recommended for you//////////////////////////////////////////////////////////////////////////////////


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
        shape = RoundedCornerShape(8.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 0.dp),
        colors = CardDefaults.cardColors(containerColor = Color(0xFFECEFFB)),
    ) {
        BoxWithConstraints {
            if (maxWidth < 450.dp) {
                Row(modifier = Modifier.fillMaxWidth()) {
                    Image(
                        modifier = Modifier
                            .fillMaxHeight()
                            .fillMaxWidth(0.4F)
                            .clip(RoundedCornerShape(8.dp)),
                        contentScale = ContentScale.FillHeight,
                        painter = painterResource(id = oneRecipe.imageResId),
                        contentDescription = null,
                    )
                    Column(
                        modifier = Modifier
                            .fillMaxHeight()
                            .padding(start = 16.dp, end = 16.dp, top = 11.dp)
                        //.height(100.dp)
                    ) {
                        Text(
                            text = "${oneRecipe.dishTitle}",
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis,
                            style = TextStyle(
                                fontSize = 14.sp,
                                lineHeight = 16.sp,
                                fontFamily = FontFamily(Font(R.font.montserrat_semi_bold)),
                                fontWeight = FontWeight(600),
                                color = Color(0xFF3F486C),
                                letterSpacing = 0.4.sp,
                            )

                        )
                        Spacer(modifier = Modifier.size(8.dp))
                        ////////////////////////description in card//////////////////////////////////////////////
                        Text(
                            text = "${oneRecipe.description}",
                            maxLines = 5,
                            overflow = TextOverflow.Ellipsis,
                            style = TextStyle(
                                fontSize = 10.sp,
                                lineHeight = 16.sp,
                                fontFamily = FontFamily(Font(R.font.montserrat_medium)),
                                fontWeight = FontWeight(400),
                                color = Color(0xFF6B6A6A),
                                letterSpacing = 0.4.sp,
                            ),
                            modifier = Modifier.fillMaxWidth()

                        )
                        Spacer(modifier = Modifier.size(8.dp))
//INGREDIENTS//////////////////////////                //

                        // Iterate through ingredients and display each item
                        val listOfIngredients = oneRecipe.ingredients
                        Log.d("listOfIngredients", "${listOfIngredients}")


                        val toMutList = listOfIngredients.toMutableList()
                        Log.d("toMutList", "${toMutList}")

                        val noFirstElRemoved = toMutList.drop(1)
                        Log.d("noFirstElRemoved", "${noFirstElRemoved}")


                        val joinedToString = noFirstElRemoved.joinToString("")
                        Log.d("joinedToString", "${joinedToString}")

                        val stringNon = joinedToString.replace("\n", " ")
                        Log.d("StringNon", "${stringNon}")

                        val trimmed = stringNon.trim()
                        Log.d("trimmed", "${trimmed}")


//                Text(
//                    text = stringNon,
//                    maxLines = 3,
//                    overflow = TextOverflow.Ellipsis,
//                    style = TextStyle(
//                        fontSize = 10.sp,
//                        lineHeight = 16.sp,
//                        fontFamily = FontFamily(Font(R.font.montserrat_medium)),
//                        fontWeight = FontWeight(400),
//                        color = Color(0xFF6B6A6A),
//                        letterSpacing = 0.4.sp,
//                    )
//                )


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
                            modifier = Modifier.padding(bottom = 10.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Icon(
                                painter = painterResource(id = R.drawable.category_icon),
                                contentDescription = "",
                                tint = Color(0xFF3F486C)
                            )
                            Text(
                                text = "  ${oneRecipe.category}",
                                maxLines = 1,
                                style = TextStyle(
                                    fontSize = 8.sp,
                                    lineHeight = 16.sp,
                                    fontFamily = FontFamily(Font(R.font.montserrat_medium)),
                                    fontWeight = FontWeight(400),
                                    color = Color(0xFF3F486C),
                                    letterSpacing = 0.4.sp,
                                )
                            )
                        }

                    }
                }
            } else {
/////////show this when the screen is wider than 400.dp ///////////////////////

                Row(modifier = Modifier.fillMaxWidth()) {
                    Image(
                        modifier = Modifier
                            .fillMaxHeight()
                            .fillMaxWidth(0.4F)
                            .clip(RoundedCornerShape(8.dp)),
                        contentScale = ContentScale.FillHeight,
                        painter = painterResource(id = oneRecipe.imageResId),
                        contentDescription = null,
                    )
                    Column(
                        modifier = Modifier
                            .fillMaxHeight()
                            .padding(start = 16.dp, end = 16.dp, top = 16.dp),
                        verticalArrangement = Arrangement.SpaceBetween
                        //.height(100.dp)
                    ) {
                        Text(
                            text = "${oneRecipe.dishTitle}",
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis,
                            style = TextStyle(
                                fontSize = 20.sp,
                                lineHeight = 22.sp,
                                fontFamily = FontFamily(Font(R.font.montserrat_semi_bold)),
                                fontWeight = FontWeight(600),
                                color = Color(0xFF3F486C),
                                letterSpacing = 0.4.sp,
                            )

                        )
                        Spacer(modifier = Modifier.size(12.dp))
                        ////////////////////////description in card//////////////////////////////////////////////
                        Text(
                            text = "${oneRecipe.description}",
                            maxLines = 5,
                            overflow = TextOverflow.Ellipsis,
                            style = TextStyle(
                                fontSize = 16.sp,
                                lineHeight = 22.sp,
                                fontFamily = FontFamily(Font(R.font.montserrat_medium)),
                                fontWeight = FontWeight(400),
                                color = Color(0xFF6B6A6A),
                                letterSpacing = 0.4.sp,
                            ),
                            modifier = Modifier.fillMaxWidth()

                        )
                        Spacer(modifier = Modifier.size(12.dp))
//INGREDIENTS//////////////////////////                //

                        // Iterate through ingredients and display each item
                        val listOfIngredients = oneRecipe.ingredients
                        Log.d("listOfIngredients", "${listOfIngredients}")
                        val toMutList = listOfIngredients.toMutableList()
                        Log.d("toMutList", "${toMutList}")

                        val noFirstElRemoved = toMutList.drop(1)
                        Log.d("noFirstElRemoved", "${noFirstElRemoved}")


                        val joinedToString = noFirstElRemoved.joinToString("")
                        Log.d("joinedToString", "${joinedToString}")

                        val stringNon = joinedToString.replace("\n", " ")
                        Log.d("StringNon", "${stringNon}")

                        val trimmed = stringNon.trim()
                        Log.d("trimmed", "${trimmed}")


                        Text(
                            text = stringNon,
                            maxLines = 5,
                            overflow = TextOverflow.Ellipsis,
                            style = TextStyle(
                                fontSize = 16.sp,
                                lineHeight = 22.sp,
                                fontFamily = FontFamily(Font(R.font.montserrat_medium)),
                                fontWeight = FontWeight(400),
                                color = Color(0xFF6B6A6A),
                                letterSpacing = 0.4.sp,
                            )
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
                            modifier = Modifier.padding(bottom = 10.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Icon(
                                painter = painterResource(id = R.drawable.category_icon),
                                contentDescription = "",
                                tint = Color(0xFF3F486C)
                            )
                            Text(
                                text = "  ${oneRecipe.category}",
                                maxLines = 1,
                                style = TextStyle(
                                    fontSize = 14.sp,
                                    lineHeight = 22.sp,
                                    fontFamily = FontFamily(Font(R.font.montserrat_medium)),
                                    fontWeight = FontWeight(400),
                                    color = Color(0xFF3F486C),
                                    letterSpacing = 0.4.sp,
                                )
                            )
                        }

                    }
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
        "Ingredients:\n",
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




