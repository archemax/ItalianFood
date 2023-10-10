package com.ima.italianfood.presentation.Screens

import android.annotation.SuppressLint
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Divider
import androidx.compose.material3.ElevatedFilterChip
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FilterChipDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
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
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.ima.italianfood.R
import com.ima.italianfood.model.RecipeDataClass
import com.ima.italianfood.presentation.Screens.one_recipe_screen.OneRecipeScreenViewModel
import com.ima.italianfood.ui.theme.*

@SuppressLint("SuspiciousIndentation")
@Composable
fun OneRecipeScreen(
    navController: NavController,
    routeId: String
) {
    val oneRecipeScreenViewModel: OneRecipeScreenViewModel = hiltViewModel()
    val id = routeId.toIntOrNull()
    if (id != null) {
        val recipe = oneRecipeScreenViewModel.getOneRecipe(id)

        /////////////////////////////////////////////////////////////////////////////////////////////////

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 0.dp, bottom = 0.dp, start = 0.dp, end = 0.dp)
                .background(Color.White)
//                .paint(
//                    painterResource(id = R.drawable.background_jpg),
//                    contentScale = ContentScale.FillHeight),
        )
        {


            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.White),
                contentAlignment = Alignment.BottomCenter

            ) {
                if (recipe != null)
                    Image(
                        // image of the recipe
                        modifier = Modifier
                            //.size(450.dp)
                            .clip(RoundedCornerShape(0.dp))
                            .height(350.dp)
                            .fillMaxWidth(),
                        contentScale = ContentScale.Crop,
                        painter = painterResource(id = recipe.imageResId),
                        contentDescription = "recipe Image",
                    )
                Box(
                    modifier = Modifier.align(Alignment.TopStart)
                ) {
                    Image(painter = painterResource(id = R.drawable.arrow_narrow_left),
                        contentDescription = "arrow back",
                        modifier = Modifier
                            .clickable { navController.popBackStack() }
                            .padding(12.dp))
                }

                Row(
                    // row with the title of dish
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(
                            color = Color.White,
                            shape = RoundedCornerShape(topStart = 30.dp, topEnd = 30.dp)
                        )
                        .padding(top = 8.dp),
                    horizontalArrangement = Arrangement.Center,

                    ) {
                    if (recipe != null)
                        Text(
                            modifier = Modifier.padding(start = 8.dp, end = 8.dp,top=4.dp),
                            text = "${recipe.dishTitle}",
                            maxLines = 2,
                            style = TextStyle(

                                fontSize = 16.sp,
                                lineHeight = 16.sp,
                                fontFamily = FontFamily(Font(R.font.montserrat_medium)),
                                fontWeight = FontWeight(700),
                                color = Color(0xFF000000),
                                letterSpacing = 0.4.sp,
                            )
                        )
                }
            }
            Spacer(modifier = Modifier.height(14.dp))

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(start = 0.dp, end = 0.dp)
                    .verticalScroll(rememberScrollState())
                    .background(color = Color.White),

                ) {

                /////////////////expandible descriprion of dish///////////////////////////////////////////////////////

                var showMore = remember { mutableStateOf(false) }
                val text = "${recipe?.description}"



                Column(modifier = Modifier.padding(start=28.dp, end = 28.dp)) {
                    //MyCategoryBadge(category = "${recipe?.category}")


//
                    Column(modifier = Modifier
                        .animateContentSize(animationSpec = tween(100))

                        .clickable(
                            interactionSource = remember { MutableInteractionSource() },
                            indication = null
                        ) { showMore.value = !showMore.value }) {
                        if (showMore.value) {
                            Text(
                                text = text,
                                style = TextStyle(
                                    fontSize = 12.sp,
                                    lineHeight = 16.sp,
                                    fontWeight = FontWeight(400),
                                    color = Color(0xFF444444),
                                    letterSpacing = 0.4.sp,
                                    fontFamily = FontFamily(Font(R.font.montserrat_medium))
                                )
                            )
                        } else {
                            Text(
                                text = text,
                                maxLines = 3,
                                overflow = TextOverflow.Ellipsis,
                                style = TextStyle(
                                    fontSize = 12.sp,
                                    lineHeight = 16.sp,
                                    fontWeight = FontWeight(400),
                                    color = Color(0xFF444444),
                                    letterSpacing = 0.4.sp,
                                    fontFamily = FontFamily(Font(R.font.montserrat_medium))
                                )
                            )
                        }
                    }
                }
//                if (recipe != null)
//                    Text(
//                        text = " ${recipe.description}",
//                        maxLines = 3,
//                        fontSize = 24.sp
//                    )

                ///////////////////////////////////////////////////////////
                Spacer(modifier = Modifier.height(16.dp))
                Column(
                    modifier = Modifier.padding(start = 28.dp),
                    horizontalAlignment = Alignment.Start
                ) {
                    Text(
                        text = "Ingredients",
                        modifier = Modifier.padding(bottom = 8.dp),
                        style = TextStyle(
                            fontSize = 14.sp,
                            lineHeight = 16.sp,
                            fontFamily = FontFamily(Font(R.font.montserrat_semi_bold)),
                            fontWeight = FontWeight(400),
                            color = Color(0xFF000000),
                            letterSpacing = 0.4.sp,

                        )
                    )
                    val editedIgredients = recipe?.ingredients?.toMutableList()
                    val dropFirstElement = editedIgredients?.drop(1)?.joinToString()

                    if (recipe != null)

                        Text(
                            text = "$dropFirstElement",
                            style = TextStyle(
                                fontSize = 12.sp,
                                lineHeight = 18.sp,
                                fontFamily = FontFamily(Font(R.font.montserrat_medium)),
                                fontWeight = FontWeight(400),
                                color = Color(0xFF444444),
                                letterSpacing = 0.8.sp,
                            )
                        )
                }
                Spacer(modifier = Modifier.size(16.dp))


                ///////Step by step guide/////////////////////////////////////////////////////////////////////////////////////
                Column(
                    modifier = Modifier.padding(start = 28.dp, end = 16.dp),
                    horizontalAlignment = Alignment.Start
                ) {
                    Text(
                        text = "Step by step guide",
                        modifier = Modifier.padding(bottom = 8.dp),
                        style = TextStyle(
                            fontSize = 14.sp,
                            lineHeight = 16.sp,
                            fontFamily = FontFamily(Font(R.font.montserrat_semi_bold)),
                            fontWeight = FontWeight(400),
                            color = Color(0xFF000000),
                            letterSpacing = 0.4.sp,
                        )
                    )

                    val mutableListRecipe = recipe?.instructions?.toMutableList()
                    val firstElementRemoved = mutableListRecipe?.drop(1)?.joinToString()
                    if (recipe != null)
                        Text(
                            text = "${firstElementRemoved}",

                            modifier = Modifier.padding(start = 0.dp, end = 0.dp),
                            style = TextStyle (
                                fontSize = 12.sp,
                                lineHeight = 16.sp,
                                fontFamily = FontFamily(Font(R.font.montserrat_medium)),
                                fontWeight = FontWeight(400),
                                color = Color(0xFF444444),
                                letterSpacing = 0.4.sp,
                            ),



                        )
                }


                Spacer(modifier = Modifier.weight(0.5f))


//////////////////////CATEGORY///////////////////////////////////////////////
                Column(
                    modifier = Modifier.padding(start = 28.dp, top = 24.dp, bottom = 24.dp),
                    horizontalAlignment = Alignment.CenterHorizontally

                ) {
                    Row(
                        modifier = Modifier.padding(bottom = 8.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.category_icon),
                            contentDescription = null,
                            tint = Color(0xFF3F486C)
                        )
                        Text(
                            text = "  ${recipe?.category}",
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
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyCategoryBadge(category: String) {
    ElevatedFilterChip(
        selected = true,
        onClick = { /*TODO*/ },
        label = {
            Text(
                text = "$category",
                style = TextStyle(
                    fontSize = 14.sp,
                    lineHeight = 20.sp,
                    fontFamily = FontFamily(Font(R.font.montserrat_medium)),
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
        elevation = FilterChipDefaults.filterChipElevation(8.dp)
    )


}


@Composable
fun MyDivider() {
    Divider(modifier = Modifier.padding(16.dp), thickness = 3.dp, color = Color.DarkGray)
}

@Preview(showSystemUi = true)
@Composable
fun ShowOneRecipeScreen() {

    // Create sample data for testing
    val sampleRecipe = RecipeDataClass(
        id = 87,
        category = "Sample Category",
        dishTitle = "Sample Dish Title",
        imageResId = 88,
        description = "description",
        ingredients = listOf(
            "Ingredients:\n ",
            "3 large egg yolks \n" +
                    "1/2 cup granulated sugar \n" +
                    "2 tablespoons amaretto liqueur \n" +
                    "1 1/4 cups heavy cream \n" +
                    "1/2 cup crushed amaretti cookies \n" +
                    "Sliced almonds and additional cookies for garnish (optional)"
        ),
        instructions = emptyList()
    )

    // Display your composable using the sample data
    OneRecipeScreen(navController = rememberNavController(), routeId = "1")
}