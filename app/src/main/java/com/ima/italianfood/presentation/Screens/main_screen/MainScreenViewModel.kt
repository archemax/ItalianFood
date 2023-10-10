package com.ima.italianfood.presentation.Screens.main_screen

import androidx.lifecycle.ViewModel
import com.ima.italianfood.data.Repository
import com.ima.italianfood.model.RecipeDataClass
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel

class MainScreenViewModel @Inject constructor() : ViewModel() {
    private val repository = Repository
    private val _state = MutableStateFlow<List<RecipeDataClass>>(emptyList())
    val state: StateFlow<List<RecipeDataClass>> = _state
    init {
        _state.value = repository.recipes
    }

    fun performSearch (query: String, category: String)
    {

        // Update the filtered recipes based on query and category
        val filteredRecipes = getFilteredRecipes(query)
        val filteredRecipesByCategory = getRecipesByCategory(category)

        // Update the list of recipes based on the combination of query and category
        if (query.isNotEmpty() && category.isNotEmpty()) {
            _state.value = filteredRecipes.filter { it in filteredRecipesByCategory }
        } else if (query.isNotEmpty()) {
            _state.value = filteredRecipes
        } else if (category.isNotEmpty()) {
            _state.value = filteredRecipesByCategory
        } else {
            _state.value = repository.recipes
        }
    }

    fun getFilteredRecipes(query: String): List<RecipeDataClass> {
        val filteredList = _state.value.filter { oneRecipe ->

            oneRecipe.dishTitle.contains(query, ignoreCase = true)
                    || oneRecipe.description.contains(query, ignoreCase = true)
        }
        return filteredList

    }
    fun getRecipesByCategory(myCategory: String): List<RecipeDataClass> {
        val fitleredByCategory = _state.value.filter { oneRecipe ->
            oneRecipe.category.contains(myCategory, ignoreCase = true)

        }
        return fitleredByCategory
    }

    fun myFilter (query: String, category: String) : List<RecipeDataClass>{
        val filteredRecipes = _state.value.filter {oneRecipe->
            oneRecipe.category.contains(category, ignoreCase = true)
                    &&
                    (oneRecipe.dishTitle.contains(query, ignoreCase = true)
                            || oneRecipe.description.contains(query,ignoreCase = true))
        }
        return filteredRecipes
    }




    //extention function
    fun String.containsAnyCategory(
        strings: List<String>,
        ignoreCase: Boolean = false
    ): Boolean {
        return strings.any {
            this.contains(it, ignoreCase)
        }
    }


    // get selected recipes from Main screen
//    fun toggleCategorySelection(category: String): List<String> {
//        selectedCategories.value = if (category in selectedCategories.value) {
//            selectedCategories.value - category
//        } else {
//            selectedCategories.value + category
//        }
//        return selectedCategories.value
//    }


}

