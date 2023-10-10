package com.ima.italianfood.model

class RecipeDataClass(
    val id: Int, // Unique ID for the recipe
    val category: String,
    val dishTitle: String,
    val imageResId: Int,
    val description: String,
    val ingredients: List<String>,
    val instructions: List<String>
)
