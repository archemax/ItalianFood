package com.ima.italianfood.data


import com.ima.italianfood.R
import com.ima.italianfood.model.RecipeDataClass


object Repository {
    val recipes = listOf(


        RecipeDataClass(
            id = 65,
            category = "Desserts",
            dishTitle = "Amaretto Semifreddo",
            imageResId = R.drawable.amaretto_semifreddo_65,
            description = "Amaretto Semifreddo is a delightful Italian frozen dessert with amaretto liqueur and almond flavors. It's rich and creamy, similar to ice cream, but lighter in texture. There are no specific dietary restrictions for this dessert. Dessert. The calorie count may vary depending on the recipe, but it's approximately 250300 calories per serving. Amaretto Semifreddo is a semi frozen dessert that combines amaretto nutty taste with amaretti cookies' sweetness. It's a delightful treat with a creamy texture, perfect for a sweet ending to an Italian meal. The recipe typically serves 6.   ",
            ingredients = listOf(
                "Ingredients:\n " ,
                        "3 large egg yolks \n" +
                        "1/2 cup granulated sugar \n" +
                        "2 tablespoons amaretto liqueur \n" +
                        "1 1/4 cups heavy cream \n" +
                        "1/2 cup crushed amaretti cookies \n" +
                        "Sliced almonds and additional cookies for garnish (optional)"
            ),
            instructions = listOf(
                "Cooking Process: " ,
                        "In a heatproof bowl, whisk together egg yolks and sugar. " +
                        "Place the bowl over a pot of simmering water (double boiler) and whisk until the mixture thickens. " +
                        "Remove from heat and stir in amaretto liqueur. " +
                        "Let it cool to room temperature. Whip the heavy cream until stiff peaks form. " +
                        "Gently fold the egg mixture into the whipped cream. Fold in the crushed amaretti cookies. " +
                        "Pour the mixture into a loaf pan lined with plastic wrap. Freeze for at least 4 hours or until set. " +
                        "Serve slices of semifreddo garnished with sliced almonds and additional amaretti cookies, if desired."
            )
        ),


        RecipeDataClass(
            id = 84,
            category = "Antipasti",
            dishTitle = "Burrata with stewed tomatoes",
            imageResId = R.drawable.burrata_84,
            description = "Burrata with stewed tomatoes is a delectable Italian appetizer. It features creamy burrata cheese, known for its delicate texture, served alongside slow-cooked, aromatic stewed tomatoes. The creamy richness of the burrata perfectly complements the savory sweetness of the tomatoes, creating a harmonious and indulgent flavor combination.",
            ingredients = listOf(
                "Ingredients:\n" ,
                        "700 g of tomatoes (e.g., beef hearts), cut in half\n" +
                        "2 tablespoons of olive oil\n" +
                        "½ teaspoon of salt\n" +
                        "2 tablespoons of sugar\n" +
                        "2 tablespoons of water\n" +
                        "2 tablespoons of fennel seeds\n" +
                        "300g of burrata\n" +
                        "2 tablespoons of red wine vinegar\n" +
                        "2 tablespoons of olive oil\n" +
                        "2 cloves of garlic\n" +
                        "½ teaspoons of salt, a little pepper"
            ),
            instructions = listOf(
                "Cooking Process:\n" ,
                        "Put the tomatoes on a baking sheet lined with baking paper, drizzle with oil, and season with salt.\n" +
                        "Bake for about 20 minutes in the upper part of the oven, preheated to 220°C. Remove and let cool.\n" +
                        "Bring the water and sugar to a boil without stirring in a small saucepan. Reduce the heat and cook for 3 minutes until bubbles form on the surface. Add the fennel seeds and simmer, stirring, until the water evaporates and the fennel seeds are dry and white. Remove the pan from the heat and continue stirring briefly. Spread the fennel seeds on a sheet of baking paper let cool.\n" +
                        "Drain the burrata, collect 3 tablespoons of liquid, and pour into a blender. Mix and season the vinegar, oil, garlic, and 2 stewed tomato halves (about 150 g).\n" +
                        "Pour the dressing onto a dish. Top with burrata and tomatoes. Sprinkle with fennel seeds."
            )

        ),
        /////////////////////////////////////////////////////////////////////////////////////////////////////////


        RecipeDataClass(
            id = 85,
            category = "Antipasti",
            dishTitle = "Burrata with lemon and basil",
            imageResId = R.drawable.burrata_with_lemons,
            description = "Burrata with lemon and basil is a delightful Italian appetizer. It features creamy burrata cheese paired with the zesty brightness of fresh lemon and the aromatic freshness of basil leaves. This combination creates a harmonious contrast of flavors and textures, making it a refreshing and indulgent dish.",
            ingredients = listOf(
                "Ingredients:\n" +
                        "1 clove of garlic\n" ,
                        "300 g of burrata\n" +
                        "2 tablespoons of white balsamic vinegar\n" +
                        "3 tablespoons of lemon olive oil\n" +
                        "1/4 teaspoon of salt a little pepper\n" +
                        "2 peeled lemons, cut into slices\n" +
                        "½ bunch of basil leaves\n" +
                        "a little fleur de sel"
            ),
            instructions = listOf(
                "Cooking Process:\n" ,
                        "1. Bread: Place the slices of bread on a plate.\n" +
                        "2. Toast: Toast the slices of bread for approx. 10 minutes in the upper part of the oven, preheated to 220°C. Remove and let cool. Rub the bread slices with garlic.\n" +
                        "3. Burrata: chop the burrata put it in a salad bowl. Mix vinegar and oil, season, and pour over the burrata. Garnish with lemon and basil, sprinkle with fleur de sel. Serve the burrata with toasted bread."
            )

        ),
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////

        RecipeDataClass(
            id = 11,
            category = "Pasta",
            dishTitle = "Spaghetti Carbonara",
            imageResId = R.drawable.carbonara_new11,
            description = "Spaghetti Carbonara is a classic Italian pasta dish. It's not suitable for vegetarians as it contains eggs, cheese, and pancetta. The dish is creamy, savory, and rich, with approximately 400450 calories per serving.",
            ingredients = listOf(
                "Ingredients (for 4 servings):\n" ,
                        "400g spaghetti\n" +
                        "150g pancetta or guanciale, diced\n" +
                        "3 large eggs\n" +
                        "100g Pecorino Romano cheese, grated\n" +
                        "50g Parmesan cheese, grated\n" +
                        "2 cloves garlic, minced (optional)\n" +
                        "Salt and black pepper to taste\n" +
                        "Fresh parsley, chopped (for garnish)"
            ),
            instructions = listOf(
                "Cooking Process:\n" ,
                        "Cook the spaghetti in salted boiling water until al dente. Reserve about 1/2 cup of pasta cooking water before draining.\n" +
                        "In a separate bowl, whisk together the eggs, grated Pecorino Romano, and grated Parmesan. Season with black pepper.\n" +
                        "In a pan, sauté the diced pancetta or guanciale until crispy. If desired, add minced garlic for extra flavor.\n" +
                        "Remove the pan from heat and let it cool slightly.\n" +
                        "Combine the cooked pasta with the pancetta/guanciale and mix well.\n" +
                        "Quickly pour the egg and cheese mixture over the pasta. Toss to coat the pasta evenly. If it seems dry, add a bit of reserved pasta cooking water.\n" +
                        "Serve immediately, garnished with fresh parsley and extra cheese if desired.\n" +
                        "Enjoy this creamy and indulgent Italian classic!"
            )
        ),
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        RecipeDataClass(
            id = 12,
            category = "Pasta",
            dishTitle = "Fettuccine Alfredo",
            imageResId = R.drawable.fetticine_alfredo_12,
            description = "Fettuccine Alfredo is a classic Italian pasta dish known for its creamy, indulgent sauce. Traditional Fettuccine Alfredo is unsuitable for a vegan or dairy free diet due to its rich butter and cream based sauce. It is a creamy pasta dish featuring fettuccine noodles, butter, heavy cream, and Parmesan cheese",

            ingredients = listOf(
                "Ingredients:\n" ,
                        "8 ounces (about 2 cups) of fettuccine pasta\n" +
                        "1/2 cup unsalted butter\n" +
                        "1 cup heavy cream\n" +
                        "1 1/2 cups grated Parmesan cheese\n" +
                        "Salt and pepper to taste\n" +
                        "Optional: minced garlic, parsley for garnish\n"
            ),
            instructions = listOf(
                "Cooking Process:\n" ,
                        "Cook the fettuccine pasta according to package instructions until al dente, then drain.\n" +
                        "In a large skillet, melt the butter over medium heat. If desired, add minced garlic and sauté briefly for flavor.\n" +
                        "Stir in the heavy cream and bring it to a simmer.\n" +
                        "Reduce heat and gradually whisk in the grated Parmesan cheese until the sauce is smooth and thickened.\n" +
                        "Season with salt and pepper to taste.\n" +
                        "Add the cooked fettuccine to the sauce, tossing to coat the noodles thoroughly.\n" +
                        "Serve hot, garnished with parsley if desired.\n" +
                        "For visual reference, you can view an image of this dish on the provided recipe websites."
            )
        ),
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


        RecipeDataClass(
            id = 40,
            category = "Pizza",
            dishTitle = "Margherita Pizza",
            imageResId = R.drawable.pizza_margerita,
            description = "Margherita Pizza is a classic Italian pizza known for its simplicity and delicious flavors. It features a thin crust topped with fresh ingredients. There are no specific dietary restrictions for Margherita Pizza.  Margherita Pizza consists of a thin pizza crust spread with tomato sauce, fresh mozzarella cheese, fresh basil leaves, a drizzle of olive oil, and a sprinkle of salt. It's a delightful blend of flavors, with the basil providing a fresh aroma. Approximately 250300 calories per slice (depending on the thickness of the crust and the amount of cheese used). Most Margherita Pizza recipes are designed to make one 12 inch pitch typically serves 24 people.",

            ingredients = listOf(
                "Ingredients:\n" ,
                        "1 pizza dough (store bought or homemade)\n" +
                        "1/2 cup tomato sauce or crushed tomatoes\n" +
                        "8 ounces fresh mozzarella cheese, sliced\n" +
                        "Fresh basil leaves\n" +
                        "Olive oil\n" +
                        "Salt"
            ),
            instructions = listOf(
                "Cooking Process:\n" ,
                        "Preheat your oven to the highest temperature (usually around 500°F or 260°C).\n" +
                        "Roll out the pizza dough on a floured surface to your desired thickness.\n" +
                        "Transfer the dough to a pizza stone or a baking sheet.\n" +
                        "Spread tomato sauce evenly over the dough, leaving a border around the edges for the crust.\n" +
                        "Arrange the slices of fresh mozzarella cheese on top of the sauce.\n" +
                        "Tear the fresh basil leaves and scatter them over the pizza.\n" +
                        "Drizzle olive oil over the pizza, and sprinkle a pinch of salt.\n" +
                        "Bake in the preheated oven for about 1012 minutes or until the crust is golden and the cheese is bubbly.\n" +
                        "Remove from the oven, let it cool slightly, slice, and serve hot. Enjoy your homemade Margherita Pizza!"
            )
        ),
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


        RecipeDataClass(
            id = 13,
            category = "Pasta",
            dishTitle = "Lasagna",
            imageResId = R.drawable.lasagna_13,
            description = "Lasagna is a beloved Italian dish known for its layers of pasta, rich sauce, and melted cheese.  Lasagna typically contains meat, dairy (cheese and béchamel sauce), and wheat based pasta, making it unsuitable for vegetarians and those with lactose or gluten intolerance. It's a layered pasta dish consisting of sheets of lasagna noodles, meat sauce, ricotta or béchamel sauce, mozzarella, and Parmesan cheese.",


            ingredients = listOf(
                "Ingredients (quantities vary by recipe):\n" ,
                        "Lasagna noodles\n" +
                        "Ground meat (usually beef, pork, or a combination)\n" +
                        "Tomato sauce\n" +
                        "Ricotta or béchamel sauce\n" +
                        "Mozzarella cheese\n" +
                        "Parmesan cheese\n" +
                        "Onion, garlic, and herbs (for flavor)\n" +
                        "Olive oil\n" +
                        "Salt and pepper"
            ),
            instructions = listOf(
                "Cooking Process:\n" ,
                        "Cook lasagna noodles according to package instructions.\n" +
                        "Brown ground meat with onions and garlic, add tomato sauce and season.\n" +
                        "Layer noodles, meat sauce, ricotta or béchamel, and cheeses in a baking dish.\n" +
                        "Repeat layers, ending with cheese on top.\n" +
                        "Bake until bubbly and golden.\n" +
                        "Let it rest before serving.\n" +
                        "For visual reference, you can view images of this dish on the provided recipe websites."
            )
        ),
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        RecipeDataClass(
            id = 14,
            category = "Pasta",
            dishTitle = "Ravioli",
            imageResId = R.drawable.ravioli_14,
            description = "Ravioli is a classic Italian pasta dish consisting of stuffed pasta pockets. Ravioli recipes can vary widely. Typical fillings include cheese, meat, or vegetables, so dietary restrictions depend on the recipe. Ravioli is a pasta dish made of small squares or circles of pasta dough, stuffed with various fillings, and typically served with sauce.",


            ingredients = listOf(
                "Ingredients (quantities may vary):\n" ,
                        "2 cups all purpose flour\n" +
                        "2 large eggs\n" +
                        "1/2 teaspoon salt\n" +
                        "1/3 cup water\n" +
                        "Filling: ricotta cheese, mozzarella cheese, Parmesan cheese, provolone cheese\n" +
                        "Sauce: tomato sauce, butter, garlic, basil, salt, and pepper"
            ),
            instructions = listOf(
                "Cooking Process:\n" ,
                        "Make pasta dough by mixing flour, eggs, salt, and water. Knead, then roll out thinly.\n" +
                        "Mix ricotta, mozzarella, Parmesan, and provolone cheeses to prepare the cheese filling.\n" +
                        "Place spoonfuls of filling on the pasta sheet, leaving space between.\n" +
                        "Fold the pasta over to cover the filling, press to seal, and cut into individual ravioli.\n" +
                        "Cook the ravioli in boiling water until they float to the surface.\n" +
                        "Meanwhile, prepare a sauce by heating butter, garlic, basil, salt, and pepper with tomato sauce.\n" +
                        "Serve the cooked ravioli with the tomato sauce.\n" +
                        "For a visual reference, you can find images of ravioli dishes on various recipe websites, such as the one provided by Allrecipes."
            )
        ),
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


        RecipeDataClass(
            id = 97,
            category = "Pasta",
            dishTitle = "Pasta with seafood (Scialatielli allo Scoglio)",
            imageResId = R.drawable.pasta_with_seaffos_97,
            description = "Pasta with seafood, known as Scialatielli allo Scoglio, is an exquisite Italian coastal dish that showcases the bounties of the sea. This flavorful pasta typically features a medley of fresh seafood like mussels, clams, shrimp, and sometimes calamari, all cooked to perfection. The seafood is combined with a fragrant tomato-based sauce infused with garlic, chili flakes, and fresh herbs like parsley. This vibrant sauce envelops the al dente pasta, creating a harmonious blend of textures and flavors. The dish offers a delightful contrast between the sweetness of the seafood and the tanginess of the tomato sauce, making it a favorite in Italian cuisine. Scialatielli allo Scoglio captures the essence of coastal living, bringing the taste of the Mediterranean to your plate.",


            ingredients = listOf(
                "Ingredients:\n" ,
                        "300 g of white flour\n" +
                        "½ teaspoon of salt\n" +
                        "1 dl of milk\n" +
                        "1½ tablespoons of olive oil \n" +
                        "1 egg\n" +
                        "50 g of finely grated pecorino cheese\n" +
                        "½ bunch of chopped basil\n" +
                        "a little white flour\n" +
                        "2 tablespoons of olive oil \n" +
                        "2 cloves of garlic, finely chopped\n" +
                        "1 red pepper, chopped\n" +
                        "300 g of cherry tomatoes, cut in half\n" +
                        "1 dl of white wine\n" +
                        "3/4 teaspoon of salt\n" +
                        "400 g of frozen seafood mixture, thawed \n" +
                        "1 coarsely chopped bunch of parsley\n" +
                        "½ bunch of flat-leaf parsley, coarsely chopped"
            ),
            instructions = listOf(
                "Cooking Process:\n" ,
                        "1. Make the noodle dough: mix the flour and salt in a bowl flour and salt in a bowl. Add the milk, oil and egg, mix and knead for for about 10 minutes to make a soft and smooth dough. Add the cheese and basil, knead and shape into a ball. Cover the dough with a bowl of with hot water and cover with parsley. Keep at room temperature for approx. 30 minutes.\n" +
                        "2. Scialatiellis: cut the dough into four pieces of dough. On a well-floured floured work surface, roll out roll them out to about 2 mm thick (approx. 12×60 cm), regularly removing the dough from the work surface. roll out the dough regularly. Roll out the pieces of dough lengthwise loosely, cut into strips about 4 mm wide, place them on a kitchen towel. \n" +
                        "3. Sauce: Heat the oil in a large in a large saucepan. Fry the garlic and chilli briefly. the garlic and chili. Add the tomatoes and wine, simmer for about 5 minutes, add salt. Add the seafood, cover with a cover and simmer for 2 minutes. Add parsley and stir. \n" +
                        "4. Pasta: dip the cialiatellis in boiling salted water and cook al dente for 3 minutes. Take them out with a slotted spoon and dry them, add to the sauce and mix. Arrange the pasta and sprinkle with cheese.\n" +
                        "\n"
            )
        ),
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        RecipeDataClass(
            id = 1,
            category = "Antipasti",
            dishTitle = "Bruschetta",
            imageResId = R.drawable.bruschetta_1,
            description = "Bruschetta is a classic Italian antipasto dish. It's a flavorful mix of toasted bread, fresh tomatoes, basil, garlic, and olive oil. There are no specific dietary restrictions for this dish, making it a versatile choice. Each serving typically contains around 70100 calories.",


            ingredients = listOf(
                "Ingredients (for 4 servings):\n" ,
                        "\n" +
                        "4 large ripe tomatoes\n" +
                        "1/4 cup fresh basil leaves\n" +
                        "2 cloves garlic\n" +
                        "1/4 cup extra virgin olive oil\n" +
                        "Salt and pepper to taste\n" +
                        "1 baguette of Italian bread"
            ),
            instructions = listOf(
                "Cooking Process:\n" ,
                        "1. Dice the tomatoes, chop the basil, and mince the garlic.\n" +
                        "2. Combine the tomatoes, basil, and garlic in a bowl. Add olive oil, salt, and pepper. Mix well.\n" +
                        "3. Slice the bread into 1 inch thick slices and toast until golden brown.\n" +
                        "4. Rub the toasted bread with a garlic clove for extra flavor.\n" +
                        "5. Spoon the tomato mixture onto the toasted bread slices.\n" +
                        "6. Drizzle with a bit more olive oil and garnish with extra basil.\n" +
                        "7. Serve immediately and enjoy your delicious Bruschetta!"
            )
        ),
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        RecipeDataClass(
            id = 2,
            category = "Antipasti",
            dishTitle = "Caprese Salad",
            imageResId = R.drawable.caprese_salad_2,
            description = "Caprese Salad is a delightful Italian dish that requires no cooking, making it a perfect summer appetizer. It has no specific dietary restrictions and is a type of salad. On average, it contains around 150 calories per serving.",


            ingredients = listOf(
                "Ingredients (for 4 servings):\n" ,
                        "4 ripe tomatoes\n" +
                        "200g fresh mozzarella cheese\n" +
                        "Fresh basil leaves\n" +
                        "Extra Virgin olive oil\n" +
                        "Balsamic vinegar (optional)\n" +
                        "Salt and pepper to taste"
            ),
            instructions = listOf(
                "Cooking Process:\n" ,
                        "1. Slice the tomatoes and mozzarella into 1/4 inch thick rounds.\n" +
                        "2. Arrange them on a serving platter, alternating tomato and mozzarella slices.\n" +
                        "3. Tuck fresh basil leaves between the tomato and mozzarella.\n" +
                        "4. Drizzle with olive oil (and balsamic vinegar if desired).\n" +
                        "5. Season with salt and pepper.\n" +
                        "6. Garnish with more fresh basil.\n" +
                        "7. Serve immediately, and enjoy this simple, refreshing Caprese Salad!"
            )
        ),
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


        RecipeDataClass(
            id = 3,
            category = "Antipasti",
            dishTitle = "Prosciutto and Melon",
            imageResId = R.drawable.prosciutto_and_melon_3,
            description = "Prosciutto and Melon is a classic Italian appetizer that combines the sweetness of ripe melon with the savory, salty flavor of prosciutto. There are no specific dietary restrictions for this dish. It's a cold appetizer, and each serving contains approximately 6080 calories.",


            ingredients = listOf(
                "Ingredients (for 4 servings):\n" ,
                        "1 ripe cantaloupe or honeydew melon\n" +
                        "8 slices of prosciutto"
            ),
            instructions = listOf(
                "Cooking Process: \n" ,
                        "1. Cut the melon in half, remove the seeds, and slice it into thin wedges or cubes. \n" +
                        "2. Carefully wrap each slice of melon with a slice of prosciutto. \n" +
                        "3. Arrange the prosciutto wrapped melon on a platter. \n" +
                        "4. You can serve it as is or garnish it with fresh mint leaves for extra freshness. \n" +
                        "5. Enjoy this delightful, no cook appetizer that balances sweet and savory flavors perfectly."
            )
        ),
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


        RecipeDataClass(
            id = 4,
            category = "Antipasti",
            dishTitle = "Fried Calamari",
            imageResId = R.drawable.fried_calamari_4,
            description = "Fried Calamari is a classic Italian dish known for its crispy, tender, and flavorful fried squid. It's typically served as an appetizer or side dish. There are no specific dietary restrictions, making it suitable for most people. Each serving of fried calamari contains approximately 200250 calories",


            ingredients = listOf(
                "Ingredients (for 4 servings):\n" ,
                        "1 pound (450g) fresh squid (cleaned and cut into rings)\n" +
                        "1 cup all purpose flour\n" +
                        "1/2 cup cornstarch\n" +
                        "1 teaspoon salt\n" +
                        "1/2 teaspoon black pepper\n" +
                        "1/2 teaspoon paprika\n" +
                        "Vegetable oil (for frying)\n" +
                        "Lemon wedges (for garnish)"
            ),
            instructions = listOf(
                "Cooking Process:\n" ,
                        "1. Сombine the flour, cornstarch, salt, pepper, and paprika in a bowl.\n" +
                        "2. Heat the vegetable oil in a deep fryer or a large pot to 350°F (180°C).\n" +
                        "3. Coat the squid rings in the flour mixture, shaking off any excess.\n" +
                        "4. Carefully drop the coated squid into the hot oil and fry until golden brown (about 23 minutes).\n" +
                        "5. Use a slotted spoon to remove the calamari and place them on paper towels to drain excess oil.\n" +
                        "6. Serve hot with lemon wedges, and enjoy your crispy Fried Calamari!"
            )
        ),
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


        RecipeDataClass(
            id = 5,
            category = "Antipasti",
            dishTitle = "Arancini (Stuffed Rice Balls)",
            imageResId = R.drawable.arancini_stuffed_rice_balls_5,
            description = "Arancini are delicious Italian stuffed rice balls. There are no specific dietary restrictions, but they are typically not suitable for gluten free diets due to the use of breadcrumbs. They are a type of appetizer or snack. Each arancini ball contains around 150200 calories.",


            ingredients = listOf(
                "Ingredients (for 12 arancini balls):\n" ,
                        "2 cups Arborio rice\n" +
                        "4 cups chicken or vegetable broth\n" +
                        "1/2 cup grated Parmesan cheese\n" +
                        "2 large eggs\n" +
                        "1/2 cup mozzarella cheese (cubed)\n" +
                        "1/2 cup cooked ground beef or sausage (optional)\n" +
                        "1/4 cup fresh parsley (chopped)\n" +
                        "Salt and pepper to taste\n" +
                        "1 cup breadcrumbs\n" +
                        "Vegetable oil for frying"
            ),
            instructions = listOf(
                "Cooking Process:\n" ,
                        "Cook the Arborio rice in broth until tender, then let it cool.\n" +
                        "Mix in Parmesan, eggs, parsley, salt, and pepper.\n" +
                        "Take a handful of rice mixture, flatten it, add a cube of mozzarella and a spoonful of meat (if using), then form it into a ball.\n" +
                        "Roll the ball in breadcrumbs.\n" +
                        "Heat oil to 350°F (175°C) and fry the arancini until golden.\n" +
                        "Drain on paper towels, serve hot, and enjoy your tasty Arancini!"
            )
        ),
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        RecipeDataClass(
            id = 6,
            category = "Antipasti",
            dishTitle = "Mozzarella in Carrozza",
            imageResId = R.drawable.mozzarella_carrozza_6,
            description = "Mozzarella in Carrozza is a delectable Italian dish, consisting of fried mozzarella cheese sandwiched between slices of bread. It's not suitable for those with gluten or lactose restrictions due to bread and cheese use. Each serving contains around 300350 calories.",


            ingredients = listOf(
                "Ingredients (for 4 servings):\n" ,
                        "8 slices of white bread\n" +
                        "8 slices of fresh mozzarella cheese\n" +
                        "2 large eggs\n" +
                        "1/2 cup milk\n" +
                        "Salt and pepper to taste\n" +
                        "Flour (for dredging)\n" +
                        "Olive oil (for frying)\n" +
                        "Fresh basil leaves (optional)\n" +
                        "Marinara sauce (for dipping, optional)"
            ),
            instructions = listOf(
                "Cooking Process:\n" ,
                        "Place mozzarella slices between two bread slices to form sandwiches.\n" +
                        "Whisk eggs, milk, salt, and pepper in a bowl.\n" +
                        "Dredge sandwiches in flour, then dip them into the egg mixture.\n" +
                        "Heat olive oil in a pan over medium heat.\n" +
                        "Fry sandwiches until golden brown on both sides.\n" +
                        "Remove, drain on paper towels, and garnish with basil.\n" +
                        "Serve hot, optionally, with marinara sauce for dipping. Enjoy your crispy Mozzarella in Carrozza!"
            )
        ),
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        RecipeDataClass(
            id = 7,
            category = "Antipasti",
            dishTitle = "Panzanella",
            imageResId = R.drawable.panzanella_7,
            description = "Panzanella is a classic Italian bread salad, perfect for summer. It has no specific dietary restrictions. This salad typically includes stale bread, tomatoes, onions, basil, and a simple vinaigrette. It's a refreshing dish with about 150250 calories per serving, depending on portions and additional ingredients.",


            ingredients = listOf(
                "Ingredients (for 4 servings):\n" ,
                        "4 cups of stale Italian bread torn into chunks\n" +
                        "4 large ripe tomatoes, cut into chunks\n" +
                        "1 red onion, thinly sliced\n" +
                        "1/2 cup fresh basil leaves, torn\n" +
                        "1/4 cup extra virgin olive oil\n" +
                        "3 tablespoons red wine vinegar\n" +
                        "Salt and black pepper to taste\n" +
                        "Optional: cucumber, bell peppers, olives, or capers"
            ),
            instructions = listOf(
                "Cooking Process:\n" ,
                        "In a large bowl, combine bread, tomatoes, onion, and basil.\n" +
                        "In a small bowl, whisk together olive oil, red wine vinegar, salt, and pepper.\n" +
                        "Drizzle the dressing over the salad and toss to combine.\n" +
                        "Allow the salad to sit for about 30 minutes to let the flavors meld.\n" +
                        "Adjust seasoning if needed and serve. Enjoy your refreshing Panzanella!"
            )
        ),
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        RecipeDataClass(
            id = 8,
            category = "Antipasti",
            dishTitle = "Insalata di Mare (Seafood Salad)",
            imageResId = R.drawable.insalata_di_mare_8,
            description = "Insalata di Mare, an Italian Seafood Salad, is a delightful dish. It doesn't have specific dietary restrictions and is known for its freshness. This cold salad is made with various seafood like shrimp, calamari, and mussels, mixed with fresh vegetables, olive oil, and lemon juice. It's a light and flavorful appetizer or main course with approximately 200250 calories per serving.",


            ingredients = listOf(
                "Ingredients (for 4 servings):\n" ,
                        "1/2 pound (225g) shrimp, cooked and peeled\n" +
                        "1/2 pound (225g) calamari, cooked and sliced into rings\n" +
                        "1/2 pound (225g) mussels, cooked and shelled\n" +
                        "1 cup cherry tomatoes, halved\n" +
                        "1/2 red onion, thinly sliced\n" +
                        "1/4 cup fresh parsley, chopped\n" +
                        "1/4 cup extra virgin olive oil\n" +
                        "Juice of 1 lemon\n" +
                        "Salt and black pepper to taste"
            ),
            instructions = listOf(
                "Cooking Process:\n" ,
                        "In a large bowl, combine the seafood, cherry tomatoes, red onion, and parsley.\n" +
                        "Drizzle with olive oil and lemon juice. Season with salt and pepper.\n" +
                        "Gently toss all ingredients together until well mixed.\n" +
                        "Cover and refrigerate for at least 30 minutes to let the flavors meld.\n" +
                        "Serve chilled and enjoy your refreshing Insalata di Mare!"
            )
        ),
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        RecipeDataClass(
            id = 9,
            category = "Antipasti",
            dishTitle = "Frittata",
            imageResId = R.drawable.frittata_9,
            description = "Frittata is an Italian dish made with beaten eggs and various ingredients, similar to an omelet. It is a versatile dish with no strict dietary restrictions. Frittatas can be customized with ingredients like vegetables, cheese, and meats. They are typically low in calories, around 150200 calories per serving. Frittatas are easy to prepare, and the number of servings depends on the number of eggs used. Here's a basic recipe.",


            ingredients = listOf(
                "Ingredients (for 4 servings):\n" ,
                        "8 large eggs\n" +
                        "1/2 cup grated Parmesan cheese\n" +
                        "1/2 cup diced vegetables (e.g., bell peppers, onions, spinach)\n" +
                        "Salt and black pepper to taste\n" +
                        "2 tablespoons olive oil"
            ),
            instructions = listOf(
                "Cooking Process:\n" ,
                        "Preheat your oven's broiler.\n" +
                        "In a bowl, whisk the eggs, then add the grated Parmesan cheese and diced vegetables. Season with salt and pepper.\n" +
                        "Heat olive oil in an ovenproof skillet over medium heat. Pour in the egg mixture.\n" +
                        "Cook for a few minutes until the edges start to set.\n" +
                        "Transfer the skillet to the broiler and cook for about 23 minutes until the top is set and slightly browned.\n" +
                        "Carefully remove from the oven, slice, and serve your delicious Frittata.\n" +
                        "Feel free to customize your Frittata with ingredients you prefer, such as mushrooms, ham, or herbs, for a delightful Italian dish."
            )
        ),
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        RecipeDataClass(
            id = 10,
            category = "Antipasti",
            dishTitle = "Vitello Tonnato (Veal with Tuna Sauce)",
            imageResId = R.drawable.vitello_tonnato_10,
            description = "Vitello Tonnato is an Italian cold dish consisting of thinly sliced veal served with a creamy tuna and anchovy sauce. There are no strict dietary restrictions, but it's not suitable for vegetarians. It's a type of antipasto with approximately 200250 calories per serving.",


            ingredients = listOf(
                "Ingredients (for 6 servings):\n" ,
                        "500g thinly sliced veal\n" +
                        "150g canned tuna in oil, drained\n" +
                        "45 anchovy fillets\n" +
                        "2 egg yolks\n" +
                        "2 tbsp capers\n" +
                        "2 tbsp lemon juice\n" +
                        "150ml mayonnaise\n" +
                        "Salt and pepper to taste"
            ),
            instructions = listOf(
                "Cooking Process:\n" ,
                        "Blend the drained tuna, anchovies, egg yolks, capers, and lemon juice in a food processor until smooth.\n" +
                        "Gradually add the mayonnaise and blend until the sauce is creamy.\n" +
                        "Season with salt and pepper to taste.\n" +
                        "Arrange the veal slices on a serving plate.\n" +
                        "Pour the tuna sauce over the veal slices, covering them entirely.\n" +
                        "Refrigerate for a few hours before serving to allow the flavors to meld.\n" +
                        "Serve chilled and garnish with additional capers and lemon slices if desired.\n" +
                        "Enjoy this classic Italian dish as an appetizer or light main course."
            )
        ),
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


        RecipeDataClass(
            id = 98,
            category = "Pasta",
            dishTitle = "Gnocchi alla Sorrentina",
            imageResId = R.drawable.gnocchi_alla_sorrentina_98,
            description = "Gnocchi alla Sorrentina is a beloved Italian pasta dish that originates from the beautiful Sorrento Peninsula in Southern Italy. This dish features soft and pillowy potato gnocchi, typically homemade, although store-bought versions can be used. The gnocchi are smothered in a luscious tomato sauce, made with ripe San Marzano tomatoes, garlic, fresh basil leaves, and mozzarella cheese. After layering the cooked gnocchi with this flavorful sauce and adding generous amounts of fresh mozzarella, it's baked until bubbly and golden.",


            ingredients = listOf(
                "Ingredients:\n" +
                        "700 g of potatoes\n" ,
                        "175 g of white flour\n" +
                        "50 g of grated Parmesan cheese\n" +
                        "1 fresh beaten egg\n" +
                        "1½ teaspoons of salt\n" +
                        "1 tablespoon of olive oil\n" +
                        "1 finely chopped onion\n" +
                        "1 can of cherry tomatoes (approx. 400 g)\n" +
                        "250 g of cherry tomatoes\n" +
                        "1/2 teaspoon of sugar\n" +
                        "2 teaspoons of salt\n" +
                        "a little pepper\n" +
                        "150 g of mozzarella, cut into pieces \n" +
                        "½ a bunch of chopped basil\n" +
                        "50 g of grated Parmesan cheese"
            ),
            instructions = listOf(
                "Cooking Process:\n" ,
                        "1. For the gnocchi mixture: Cook the potatoes in boiling water for about 20 minutes. Peel them while still hot and mash them in a bowl, let them cool. Add the flour, Parmesan, egg and salt and mix. The mass should be moist, not stick to your hands. Add a little more flour if necessary. \n" +
                        "2. Forming: sprinkle the mass with a little flour and form 4 rolls of 2 cm each. Cut them into 2 cm pieces and wrap your thumb around the tines of a fork to make grooves. Place the gnocchi on a floured cloth.\n" +
                        "3. Tomato sauce: heat the oil in a saucepan and fry the onion. \n" +
                        "Add cherry tomatoes and sugar, bring to a boil. Cover and simmer for about 10 minutes, season.\n" +
                        "4. Gnocchi: Cook the gnocchi several times in boiling salted water for 4 minutes until they rise to the surface.\n" +
                        "Remove them with a slotted spoon, drain and add to the tomato sauce.\n" +
                        "5. Filling: put the gnocchi in the ramekins, top with mozzarella and basil, sprinkle with Parmesan cheese.\n" +
                        "6. Cooking: cook for about 30 minutes in a 200°C oven."
            )
        ),
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


        RecipeDataClass(
            id = 15,
            category = "Pasta",
            dishTitle = "Penne alla Vodka",
            imageResId = R.drawable.penne_alla_vodka_15,
            description = "Penne alla Vodka is an Italian pasta dish known for its creamy tomato vodka sauce. Penne alla Vodka typically contains alcohol (vodka) and dairy (cream), making it unsuitable for individuals with alcohol or lactose intolerance. It's a pasta dish featuring penne pasta with a creamy tomato sauce infused with vodka",


            ingredients = listOf(
                "Ingredients (quantities may vary):\n" ,
                        "12 oz penne pasta\n" +
                        "2 tbsp olive oil\n" +
                        "1/4 cup vodka\n" +
                        "1 cup tomato sauce\n" +
                        "1/2 cup heavy cream\n" +
                        "Salt and pepper to taste\n" +
                        "Red pepper flakes (optional)\n" +
                        "Fresh basil and grated Parmesan cheese for garnish"
            ),
            instructions = listOf(
                "Cooking Process:\n" ,
                        "Cook the penne pasta until al dente. Drain and set aside.\n" +
                        "Heat olive oil over medium heat in a skillet, add vodka and let it simmer to reduce by half.\n" +
                        "Stir in tomato sauce and heavy cream. Simmer for a few minutes.\n" +
                        "Season with salt, pepper, and red pepper flakes if desired.\n" +
                        "Add cooked penne pasta to the sauce and toss to coat.\n" +
                        "Garnish with fresh basil and grated Parmesan cheese.\n" +
                        "Serve hot, and enjoy your Penne alla Vodka!\n" +
                        "You can view images of this dish on various recipe websites for visual reference."
            )
        ),
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        RecipeDataClass(
            id = 16,
            category = "Pasta",
            dishTitle = "Gnocchi",
            imageResId = R.drawable.gnocchi_16,
            description = "Gnocchi is a classic Italian dish known for its soft potato dumplings. Gnocchi is generally suitable for vegetarians, but some recipes may contain eggs. It is not gluten free due to the use of wheat flour. Gnocchi are soft, pillowy potato dumplings served with various sauces, often tomato or pesto. On average, a serving of potato gnocchi contains around 130150 calories. Gnocchi are delightful Italian dumplings made from mashed potatoes and flour, creating a delicate, comforting pasta alternative. Making gnocchi involves preparing the potato dough, shaping the dumplings, boiling them, and serving with your favorite sauce. Recipes vary, but a typical recipe serves 4",


            ingredients = listOf(
                "Ingredients:\n" ,
                        "2 large russet potatoes (about 1 lb)\n" +
                        "1 cup all purpose flour\n" +
                        "1 egg (optional)\n" +
                        "Salt"
            ),
            instructions = listOf(
                "Cooking Process:\n" ,
                        "Boil or bake the potatoes until tender, then peel and mash them.\n" +
                        "Mix in the flour, egg (if using), and a pinch of salt, forming a dough.\n" +
                        "Divide the dough into small portions, rolling each into a rope, and cut into bite size pieces.\n" +
                        "Create ridges on each gnocchi using a fork.\n" +
                        "Boil in salted water until they float to the surface (about 23 minutes).\n" +
                        "Serve with your preferred sauce, like tomato or pesto.\n" +
                        "You can find images of this dish on various recipe websites for visual reference."
            )
        ),
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


        RecipeDataClass(
            id = 17,
            category = "Pasta",
            dishTitle = "Pasta Primavera",
            imageResId = R.drawable.pasta_primavera_17,
            description = "Pasta Primavera is an Italian pasta dish featuring fresh vegetables. Here's the requested information: Pasta Primavera is generally vegetarian and can be adapted to vegan diets by omitting cheese. It is suitable for most dietary preferences. It's a pasta dish featuring a medley of fresh, sautéed vegetables typically served with fettuccine or spaghetti. A typical serving of Pasta Primavera contains around 250350 calories. Pasta Primavera is a vibrant Italian dish, celebrating the flavors of spring. It combines seasonal vegetables with pasta and a light sauce, creating a fresh and colorful meal. Making Pasta Primavera involves cooking the pasta, sautéing vegetables, and preparing a light sauce. Recipes vary, but a typical recipe serves 4.",


            ingredients = listOf(
                "Ingredients:\n" ,
                        "8 oz fettuccine or spaghetti\n" +
                        "Assorted vegetables like bell peppers, cherry tomatoes, zucchini, and peas\n" +
                        "Olive oil\n" +
                        "Garlic\n" +
                        "Parmesan cheese (optional)\n" +
                        "Fresh basil\n" +
                        "Salt and pepper"
            ),
            instructions = listOf(
                "Cooking Process:\n" ,
                        "Cook the pasta according to package instructions.\n" +
                        "In a skillet, sauté garlic in olive oil, add vegetables and cook until tender.\n" +
                        "Toss the cooked pasta with the sautéed vegetables.\n" +
                        "Garnish with fresh basil, Parmesan cheese, salt, and pepper.\n" +
                        "Serve hot, and enjoy your Pasta Primavera!\n" +
                        "For a visual reference, you can find images of this dish on various recipe websites."
            )
        ),
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        RecipeDataClass(
            id = 18,
            category = "Pasta",
            dishTitle = "Orecchiette with Broccoli Rabe",
            imageResId = R.drawable.orecchiette_with_broccoli_rabe_18,
            description = "Orecchiette with Broccoli Rabe is an Italian dish known for its unique ear shaped pasta and the delicious bitterness of broccoli rabe. This dish has no specific dietary restrictions, but you can adapt it to your preferences, including vegetarian or vegan variations. Orecchiette with Broccoli Rabe is a classic Italian pasta dish. The calorie count can vary based on ingredients and serving size but is typically around 350400 calories per serving. This dish features Orecchiette pasta tossed with sautéed broccoli rabe, garlic, and chili flakes and often includes sausage or cheese for added flavor. It offers a delightful balance of flavors and textures. Cooking Orecchiette with Broccoli Rabe involves preparing the pasta, sautéing broccoli rabe with garlic and chili flakes, and adding cooked sausage or cheese. Recipes typically serve 4",


            ingredients = listOf(
                "Ingredients:\n" ,
                        "12 oz orecchiette pasta\n" +
                        "1 bunch broccoli rabe\n" +
                        "2 cloves garlic\n" +
                        "Red pepper flakes (to taste)\n" +
                        "Olive oil\n" +
                        "Salt and pepper\n" +
                        "Grated Pecorino Romano cheese (optional)"
            ),
            instructions = listOf(
                "Cooking Process:\n" ,
                        "Cook the orecchiette pasta until al dente. Drain and set aside.\n" +
                        "In a large skillet, sauté garlic and red pepper flakes in olive oil.\n" +
                        "Add chopped broccoli rabe and cook until tender.\n" +
                        "Toss the cooked pasta with the broccoli rabe mixture.\n" +
                        "Season with salt and pepper. Optionally, top with grated Pecorino Romano cheese.\n" +
                        "Serve hot, and enjoy your Orecchiette with Broccoli Rabe!\n" +
                        "For images and detailed instructions, you can refer to the provided sources."
            )
        ),
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


        RecipeDataClass(
            id = 19,
            category = "Pasta",
            dishTitle = "Cacio e Pepe",
            imageResId = R.drawable.cacio_e_pepe_19,
            description = "Cacio e Pepe is a classic Roman pasta dish famous for its simplicity and bold flavors. It's essentially pasta with cheese and black pepper. This dish is generally unsuitable for vegetarians, containing Pecorino Romano cheese made from sheep's milk. It's also not suitable for those with lactose intolerance or dairy allergies. Cacio e Pepe is a traditional Italian pasta dish. The calorie count varies, but it's approximately 400500 calories per serving. Cacio e Pepe features spaghetti or other pasta tossed with a creamy sauce made from Pecorino Romano cheese, pasta cooking water, and a generous amount of freshly ground black pepper. It has a rich, savory, and slightly spicy flavor. This dish involves cooking pasta, preparing the sauce by melting cheese and pepper in pasta water, and then tossing the cooked pasta into this creamy mixture.  Most recipes serve 4",


            ingredients = listOf(
                "Ingredients:\n" ,
                        "12 oz spaghetti\n" +
                        "1 cup grated Pecorino Romano cheese\n" +
                        "Freshly ground black pepper\n" +
                        "Salt"
            ),
            instructions = listOf(
                "Cooking Process:\n" ,
                        "Cook the spaghetti in salted water until al dente.\n" +
                        "Reserve some pasta cooking water, then drain the pasta.\n" +
                        "In a skillet, toast black pepper until fragrant.\n" +
                        "Add pasta water and bring to a simmer.\n" +
                        "Add cooked pasta and cheese, toss until creamy.\n" +
                        "Serve immediately, garnished with more cheese and pepper.\n" +
                        "For images and detailed instructions, you can refer to the provided sources."
            )
        ),
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


        RecipeDataClass(
            id = 20,
            category = "Pasta",
            dishTitle = "Pappardelle with Wild Boar Ragu",
            imageResId = R.drawable.pappardelle_with_wild_boar_ragu_20,
            description = "Pappardelle with Wild Boar Ragu is a flavorful Italian dish with a rich, hearty sauce.  This dish is not suitable for vegetarians or vegans due to the use of wild boar meat. It may also not be suitable for individuals with pork allergies. Pappardelle with Wild Boar Ragu is a traditional Italian pasta dish. The calorie count varies but is approximately 500600 calories per serving. This dish features wide, flat pappardelle pasta served with a slow cooked ragu made from tender wild boar meat, tomatoes, aromatic herbs, and red wine. It has a robust and savory flavor. This recipe involves preparing the ragu by browning the boar meat, then simmering it with other ingredients, and finally serving it over cooked pappardelle pasta. Most recipes serve 4.",


            ingredients = listOf(
                "Ingredients:\n" ,
                        "12 oz pappardelle pasta\n" +
                        "1 lb wild boar meat\n" +
                        "1 can crushed tomatoes\n" +
                        "Red wine\n" +
                        "Onion, carrot, celery, garlic\n" +
                        "Olive oil\n" +
                        "Fresh herbs (e.g., rosemary, thyme)\n" +
                        "Salt and black pepper"
            ),
            instructions = listOf(
                "Cooking Process:\n" ,
                        "Brown the wild boar meat in olive oil.\n" +
                        "Add chopped onion, carrot, celery, and garlic; cook until softened.\n" +
                        "Pour in red wine and allow it to reduce.\n" +
                        "Add crushed tomatoes, herbs, salt, and pepper; simmer until the ragu thickens.\n" +
                        "Cook pappardelle pasta, then toss with the ragu.\n" +
                        "Serve hot, garnished with grated cheese if desired.\n" +
                        "For detailed instructions and images, you can refer to the provided sources."
            )
        ),
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        RecipeDataClass(
            id = 33,
            category = "Pasta",
            dishTitle = "Pasta e Fagioli",
            imageResId = R.drawable.pasta_e_fagioli_33,
            description = "Pasta e Fagioli is an Italian pasta and bean soup that is typically unsuitable for vegetarians due to the use of bacon or pancetta. The dish doesn't have other specific dietary restrictions. It's a hearty and flavorful soup containing approximately 200250 calories per serving. Pasta e Fagioli is a comforting Italian soup made with pasta and beans in a flavorful broth, often featuring tomatoes, herbs, and bacon or pancetta. The recipes vary in servings, suitable for single or family sized portions",


            ingredients = listOf(
                "Ingredients (quantities may vary based on the recipe):\n" ,
                        "Bacon or pancetta\n" +
                        "Onion\n" +
                        "Garlic\n" +
                        "Tomatoes (canned or fresh)\n" +
                        "Cannellini beans\n" +
                        "Chicken or vegetable broth\n" +
                        "Ditalini or other small pasta\n" +
                        "Olive oil\n" +
                        "Salt and pepper\n" +
                        "Italian herbs (e.g., oregano, basil)\n" +
                        "Grated Parmesan cheese (optional)"
            ),
            instructions = listOf(
                "Cooking Process:\n" ,
                        "In a large pot, cook bacon or pancetta until crispy. Remove and set aside.\n" +
                        "In the same pot, sauté onions and garlic until softened.\n" +
                        "Add tomatoes, beans, broth, and herbs. Simmer until flavors meld.\n" +
                        "Cook pasta separately and add it to the soup.\n" +
                        "Season with salt and pepper.\n" +
                        "Serve hot, garnished with crispy bacon and grated Parmesan cheese if desired.\n" +
                        "Refer to the provided recipe sources for detailed instructions. Enjoy this delicious Italian soup!"
            )
        ),
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        RecipeDataClass(
            id = 86,
            category = "Pasta",
            dishTitle = "Lemon Paste (Pasta Al Limone)",
            imageResId = R.drawable.lemon_paste_pasta_al_limone_86,
            description = "Pasta al Limone, or Lemon Pasta, is a classic Italian dish known for its simplicity and delightful flavors. This pasta dish typically features long pasta noodles, such as spaghetti or fettuccine, cooked to al dente perfection. What sets it apart is the creamy lemon sauce. The sauce is made with a combination of fresh lemon juice, lemon zest, butter, cream, and Parmesan cheese, creating a velvety and tangy coating for the pasta.",


            ingredients = listOf(
                "Ingredients:\n" ,
                        "500 g of pasta (e.g. pikis) \n" +
                        "1 dl full cream\n" +
                        "50 g of butter\n" +
                        "2 organic lemons, grated zest and all the juice\n" +
                        "½ teaspoon of salt\n" +
                        "a little pepper"
            ),
            instructions = listOf(
                "Cooking Process:\n" ,
                        "1. Pasta: cook the pasta al dente in boiling salted water. salted water. Reserve 1 liter of cooking water, drain the pasta.\n" +
                        "2. Sauce: in the same saucepan, bring the reserved cooking water to a boil, cream, butter, lemon zest, and juice (about 1.5 dl). Reduce heat, and simmer for approx.5 min. Add pasta, stir, simmer for 2 minutes, season"
            )
        ),
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        RecipeDataClass(
            id = 87,
            category = "Pasta",
            dishTitle = "Gnocchi with pistachio pesto pesto",
            imageResId = R.drawable.gnocchi_with_pistachio_pesto_pesto_87,
            description = "Gnocchi with pistachio pesto is a delectable Italian dish that combines the pillowy softness of gnocchi with the rich and nutty flavors of pistachio pesto. Gnocchi, small potato dumplings, are boiled until they become tender and then tossed with a creamy pistachio pesto sauce. This sauce typically consists of ground pistachios, fresh basil, Parmesan cheese, olive oil, garlic, and a hint of lemon juice, creating a harmonious blend of textures and flavors",


            ingredients = listOf(
                "Ingredients:\n" ,
                        "700 g of floury potatoes, cut in half\n" +
                        " 200g of white flour\n" +
                        "1 egg\n" +
                        "1½ teaspoons of salt\n" +
                        "a little pepper\n" +
                        "Corn starch for sprinkling\n" +
                        "180 g of pistachios\n" +
                        "½ bunch of basil\n" +
                        "3 tbsp of water\n" +
                        "1 organic lime, zest grate,d and 1 tbsp of juice\n" +
                        "100 g of ricotta\n" +
                        "salt and pepper to taste"
            ),
            instructions = listOf(
                "Cooking Process:\n" ,
                        "Forming the gnocchi: Add the flour, egg, salt and pepper to the potatoes and mix quickly.Divide the dough into 4 parts, form rolls of approx. 1.5 cm in diameter each into a small Meisen. Cut them into pieces about 1 cm long.\n" +
                        "Pesto: coarsely chop 2 tablespoons of pistachios, set aside. Place the remaining pistachios into a chopper. Add basil and water with the zest and juice of lime zest and juice, and mix everything. Add the the ricotta and stir.\n" +
                        "Bring the gnocchi to a boil: several times in salt water for about 5 minutes until they rise to the surface.\n" +
                        "Remove them, drain and, and add to the pesto. Add 2 dl. water, mix and season. Arrange the gnocchi, and sprinkle with with the reserved pistachios."
            )
        ),
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        RecipeDataClass(
            id = 89,
            category = "Pasta",
            dishTitle = "Spaghetti in Salerno style",
            imageResId = R.drawable.spaghetti_in_salerno_style_89,
            description = "Spaghetti in Salerno style, or \"Spaghetti alla Salernitana,\" is a delectable Italian pasta dish hailing from the coastal town of Salerno in the Campania region. This dish captures the essence of southern Italian cuisine, known for its use of fresh and vibrant ingredients.",


            ingredients = listOf(
                "Ingredients:\n" ,
                        " 3 tbsp of breadcrumbs\n" +
                        "½ bunch of chopped parsley\n" +
                        "160 g of parmesan cheese\n" +
                        "3 tablespoons of olive oil\n" +
                        "chopped garlic cloves\n" +
                        "½ teaspoon of chili flakes\n" +
                        "500g of spaghetti\n" +
                        " 4 eggs\n" +
                        "salt and pepper to taste"
            ),
            instructions = listOf(
                "Cooking Process:\n" ,
                        "Spaghetti: cook the spaghetti al dente in salted water.\n" +
                        "Sauce: add 1 tablespoon of olive oil to the spaghetti\n" +
                        "Here's how to make Frisure: toast the breadcrumbs in a nonstick frying pan \n" +
                        "in a nonstick frying pan and pour it into a bowl. Add the parsley and 3 tablespoons of grated cheese and mix.\n" +
                        "Garlic oil: heat the oil in the same skillet, add the garlic and \n" +
                        "chili flakes, fry them for 4 minutes, set aside on the \n" +
                        "the stove. Add water for the pasta with the garlic oil and the rest of the grated cheese. Slowly heat the the spaghetti, stirring until the sauce becomes creamy.\n" +
                        "Scrambled eggs: to make Heat the oil in the same same frying pan, break the kufas one by one \n" +
                        "one by one, place them into the pan and cook over a low for approx. 3 minutes. \n" +
                        "Serve with the spaghetti with the eggs, sprinkle with fries, season."
            )
        ),
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


        RecipeDataClass(
            id = 68,
            category = "Breads",
            dishTitle = "Ciabatta",
            imageResId = R.drawable.ciabatta_68,
            description = "Ciabatta is a classic Italian bread known for its rustic appearance and chewy texture. It's suitable for most dietary preferences as it contains essential bread ingredients. One serving typically has around 150200 calories. It's perfect for sandwiches or served with olive oil and balsamic vinegar. Specify the part of cooking. For how many people the recipe is designed? Specify what ingredients are needed and their quantity. Make a step by step description of the cooking process. The recipe on BBC Good Food doesn't specify the number of servings, but you can typically make 1 large loaf or multiple smaller ones",


            ingredients = listOf(
                "Ingredients:\n" ,
                        "500g strong white bread flour\n" +
                        "10g salt\n" +
                        "7g fast action yeast\n" +
                        "2 tbsp olive oil\n" +
                        "300ml water"
            ),
            instructions = listOf(
                "Cooking Process:\n" ,
                        "Mix the flour, salt, and yeast in a large bowl.\n" +
                        "Add the olive oil and water, then mix to form a soft dough.\n" +
                        "Knead the dough on a floured surface for about 10 mins until it's smooth and elastic.\n" +
                        "Place the dough in an oiled bowl, cover, and leave it to rise for 12 hours until doubled in size.\n" +
                        "Heat your oven to 220°C (200°C fan).\n" +
                        "Shape the dough into a rough rectangle and place it on a baking tray.\n" +
                        "Bake for 2530 mins until the bread is golden brown and sounds hollow when tapped on the bottom.\n" +
                        "Cool on a wire rack before slicing and serving."
            )
        ),
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        RecipeDataClass(
            id = 69,
            category = "Breads",
            dishTitle = "Grissini",
            imageResId = R.drawable.grissini_69,
            description = "Grissini are thin Italian breadsticks, known for their crispness and simplicity. They are suitable for most dietary restrictions. Per serving, they contain approximately 3050 calories. Grissini are versatile and can be served as an appetizer, snack, or alongside dishes. This recipe yields about 20 breadsticks.",


            ingredients = listOf(
                "Ingredients:\n" ,
                        "2 cups all purpose flour\n" +
                        "1 teaspoon salt\n" +
                        "1/2 teaspoon sugar\n" +
                        "1 packet active dry yeast (about 2 1/4 teaspoons)\n" +
                        "2/3 cup warm water\n" +
                        "2 tablespoons olive oil\n" +
                        "Optional: sesame seeds, poppy seeds, or other toppings"
            ),
            instructions = listOf(
                "Cooking Process:\n" ,
                        "In a bowl, combine warm water, sugar, and yeast. Let it sit for about 10 minutes until frothy.\n" +
                        "Add flour, salt, and olive oil to the yeast mixture. Mix to form a dough.\n" +
                        "Knead the dough on a floured surface for about 5 minutes until smooth.\n" +
                        "Divide the dough into 20 equal portions.\n" +
                        "Roll each portion into a thin, pencillike shape (about 12 inches long) and place them on a baking sheet.\n" +
                        "Brush with water and sprinkle optional toppings.\n" +
                        "Bake at 400°F (200°C) for 1520 minutes until golden brown.\n" +
                        "Let them cool and serve as a delightful appetizer or snack.\n" +
                        "Enjoy your homemade Grissini!"
            )
        ),
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


        RecipeDataClass(
            id = 70,
            category = "Breads",
            dishTitle = "Taralli",
            imageResId = R.drawable.taralli_70,
            description = "Taralli are traditional Italian crackers hailing from the Puglia region. They are versatile and suitable for various dietary restrictions. These crunchy snacks are typically enjoyed with wine or as appetizers. While calorie count varies, they roughly contain 4060 calories per serving. This recipe yields about 4050 Taralli.",


            ingredients = listOf(
                "Ingredients:\n" ,
                        "2 cups all purpose flour\n" +
                        "1/2 cup white wine (dry)\n" +
                        "1/2 cup extra virgin olive oil\n" +
                        "1 teaspoon salt\n" +
                        "Optional: fennel seeds, black pepper, or other seasonings"
            ),
            instructions = listOf(
                "Cooking Process:\n" ,
                        "Preheat your oven to 375°F (190°C).\n" +
                        "In a bowl, combine flour, salt, and optional seasonings.\n" +
                        "Add white wine and olive oil, and mix until a dough forms.\n" +
                        "Knead the dough until smooth.\n" +
                        "Divide the dough into small pieces and roll each into a rope, about 5 inches long.\n" +
                        "Form each rope into a ring shape, pressing the ends together to seal.\n" +
                        "Place the Taralli on a baking sheet.\n" +
                        "Bake for about 2530 minutes or until they turn golden.\n" +
                        "Let them cool and enjoy your homemade Taralli!\n" +
                        "These Taralli make a delightful and crunchy addition to your Italian Inspired snacks or appetizers."
            )
        ),
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        RecipeDataClass(
            id = 41,
            category = "Pizza",
            dishTitle = "Quattro Formaggi (Four Cheese Pizza)",
            imageResId = R.drawable.quattro_formaggi_four_cheese_pizza_41,
            description = "Quattro Formaggi, or Four Cheese Pizza, is a delightful Italian pizza topped with a combination of four cheeses. This dish has no specific dietary restrictions unless you have cheese allergies or lactose intolerance. Quattro Formaggi features a thin pizza crust generously topped with a blend of four kinds of cheese: mozzarella, gorgonzola, parmesan, and provolone. The result is a rich, cheesy, and flavorful pizza. A typical slice of Quattro Formaggi pizza contains around 250350 calories, depending on the size and thickness of the crust. Most recipes make one 12 inch pizza, which serves 24 people.",


            ingredients = listOf(
                "Ingredients:\n" ,
                        "1 pizza dough (store bought or homemade)\n" +
                        "1/2 cup mozzarella cheese, shredded\n" +
                        "1/4 cup gorgonzola cheese, crumbled\n" +
                        "1/4 cup parmesan cheese, grated\n" +
                        "1/4 cup provolone cheese, shredded"
            ),
            instructions = listOf(
                "Cooking Process:\n" ,
                        "Preheat your oven to the highest temperature (usually around 500°F or 260°C).\n" +
                        "Roll out the pizza dough on a floured surface to your desired thickness.\n" +
                        "Transfer the dough to a pizza stone or a baking sheet.\n" +
                        "Spread mozzarella cheese evenly over the dough, leaving a border for the crust.\n" +
                        "Add gorgonzola, parmesan, and provolone cheeses, distributing them evenly.\n" +
                        "Bake in the preheated oven for about 1012 minutes or until the crust is golden and the cheese is bubbly.\n" +
                        "Remove from the oven, let it cool slightly, slice, and enjoy your delicious homemade Quattro Formaggi pizza!"
            )
        ),
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


        RecipeDataClass(
            id = 42,
            category = "Pizza",
            dishTitle = "Pizza Napoletana",
            imageResId = R.drawable.pizza_napoletana_42,
            description = "Pizza Napoletana, or Neapolitan Pizza, is a classic Italian pizza known for its thin, soft, and slightly chewy crust. It's typically topped with simple ingredients such as San Marzano tomatoes, mozzarella cheese, basil, olive oil, and salt. This dish has no specific dietary restrictions unless you have allergies to these ingredients.   Neapolitan Pizza has a thin crust, a soft, airy interior, and a slightly crisp exterior. It's known for its simplicity, with a focus on high quality ingredients.  A typical Neapolitan pizza has around 200300 calories per slice, which can vary based on toppings and the pizza size.  Most recipes make one 12 inch pizza, which serves 24 people.",


            ingredients = listOf(
                "Ingredients:\n" ,
                        "Pizza dough (store bought or homemade)\n" +
                        "San Marzano tomatoes or tomato sauce\n" +
                        "Fresh mozzarella cheese\n" +
                        "Fresh basil leaves\n" +
                        "Extra Virgin olive oil\n" +
                        "Salt"
            ),
            instructions = listOf(
                "Cooking Process:\n" ,
                        "Preheat your pizza stone or oven to the highest temperature (usually around 500°F or 260°C).\n" +
                        "Roll out the pizza dough on a floured surface to your desired thickness.\n" +
                        "Transfer the dough to a pizza peel or baking sheet dusted with cornmeal.\n" +
                        "Spread a thin layer of tomato sauce on the dough.\n" +
                        "Add slices of fresh mozzarella and fresh basil leaves.\n" +
                        "Drizzle with olive oil and sprinkle with a pinch of salt.\n" +
                        "Carefully transfer the pizza to the hot oven or pizza stone.\n" +
                        "Bake for about 90 seconds to 2 minutes until the crust is puffed and charred.\n" +
                        "Remove from the oven, let it cool for a moment, slice, and enjoy your authentic Neapolitan pizza!"
            )
        ),
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


        RecipeDataClass(
            id = 43,
            category = "Pizza",
            dishTitle = "Calzone",
            imageResId = R.drawable.calzone_pizza_43,
            description = "Calzone is a delicious Italian dish with a folded pizza dough filled with various ingredients, similar to a turnover. There are no specific dietary restrictions for calzones, but ingredients can vary. On average, a calzone contains around 500700 calories per serving. Calzones are dough pockets filled with cheese, tomato sauce, vegetables, and meats. They are typically folded in a half moon shape and baked until golden brown. Most recipes make 24 calzones, depending on your preferred sizer.",


            ingredients = listOf(
                "Ingredients:\n" ,
                        "Pizza dough (store bought or homemade)\n" +
                        "Tomato sauce or marinara\n" +
                        "Mozzarella cheese\n" +
                        "Your choice of fillings (e.g., pepperoni, sausage, vegetables)\n" +
                        "Olive oil (for brushing)\n" +
                        "Salt and pepper (to taste)"
            ),
            instructions = listOf(
                "Cooking Process:\n" ,
                        "Preheat your oven to 475°F (245°C) or as directed by your recipe.\n" +
                        "Divide the pizza dough into equal portions.\n" +
                        "Roll each portion into a circle or oval shape on a floured surface.\n" +
                        "Spread a layer of tomato sauce on one half of each dough round.\n" +
                        "Add your desired fillings, leaving some space around the edges.\n" +
                        "Fold the other half of the dough over the fillings, creating a halfmoon shape.\n" +
                        "Press the edges firmly to seal.\n" +
                        "Brush the tops of the calzones with olive oil and season with salt and pepper.\n" +
                        "Place the calzones on a baking sheet or pizza stone.\n" +
                        "Bake in the preheated oven for about 1215 minutes or until golden brown.\n" +
                        "Remove from the oven, let them cool for a moment, and enjoy your freshly baked calzones!"
            )
        ),
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


        RecipeDataClass(
            id = 44,
            category = "Pizza",
            dishTitle = "Pizza Bianca",
            imageResId = R.drawable.pizza_bianca_44,
            description = "Pizza Bianca, or White Pizza, is an Italian pizza known for its simplicity. It typically doesn't have tomato sauce and features a combination of creamy cheeses, garlic, and herbs. There are no specific dietary restrictions. On average, a slice of White Pizza contains about 250300 calories. Pizza Bianca is a pizza without tomato sauce, featuring ingredients like mozzarella, ricotta, Parmesan, garlic, olive oil, and fresh herbs. It's known for its rich and creamy flavor. Most recipes make 1 large pizza or 2 smaller ones, serving 24 people.",


            ingredients = listOf(
                "Ingredients:\n" ,
                        "Pizza dough (store bought or homemade)\n" +
                        "Olive oil\n" +
                        "Minced garlic\n" +
                        "Mozzarella cheese\n" +
                        "Ricotta cheese\n" +
                        "Parmesan cheese\n" +
                        "Fresh herbs (e.g., basil, oregano)\n" +
                        "Salt and pepper"
            ),
            instructions = listOf(
                "Cooking Process:\n" ,
                        "Preheat your oven to the recommended temperature (usually around 475°F or 245°C).\n" +
                        "Roll out the pizza dough on a floured surface to your desired thickness.\n" +
                        "Transfer the dough to a baking sheet or pizza stone.\n" +
                        "Brush the dough with olive oil and minced garlic.\n" +
                        "Sprinkle mozzarella cheese evenly over the dough.\n" +
                        "Add dollops of ricotta cheese and grated Parmesan.\n" +
                        "Season with salt, pepper, and fresh herbs.\n" +
                        "Bake in the preheated oven for 1012 minutes or until the crust is golden and the cheese is bubbly and lightly browned.\n" +
                        "Remove from the oven, let it cool, slice, and enjoy your delicious Pizza Bianca!"
            )
        ),
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


        RecipeDataClass(
            id = 45,
            category = "Pizza",
            dishTitle = "Sicilian Pizza",
            imageResId = R.drawable.sicilian_pizza_45,
            description = "Sicilian Pizza is a thick, rectangular pizza with a crispy crust characterized by its fluffy interior. There are no specific dietary restrictions unless you have particular ingredient preferences. It typically includes cheese, tomato sauce, and various toppings. One serving of Sicilian Pizza contains approximately 285300 calories. Sicilian Pizza is known for its thick, airy crust that's crispy on the outside and soft inside. It's usually topped with tomato sauce, mozzarella cheese, and toppings like pepperoni or vegetables. Most recipes yield a 12x18 inch pizza, serving 68 people.",


            ingredients = listOf(
                "Ingredients:\n" ,
                        "Pizza dough (homemade or store bought)\n" +
                        "Olive oil\n" +
                        "Tomato sauce\n" +
                        "Mozzarella cheese\n" +
                        "Toppings of your choice (e.g., pepperoni, bell peppers, onions)\n" +
                        "Salt and pepper\n" +
                        "Fresh basil (optional)\n" +
                        "Grated Parmesan cheese (optional)"
            ),
            instructions = listOf(
                "Cooking Process:\n" ,
                        "Preheat your oven to 475°F (245°C).\n" +
                        "Grease a baking sheet or rectangular pizza pan with olive oil.\n" +
                        "Stretch and press the pizza dough evenly into the pan, ensuring it reaches the edges.\n" +
                        "Brush the dough with olive oil.\n" +
                        "Spread a layer of tomato sauce over the dough.\n" +
                        "Add a generous layer of mozzarella cheese.\n" +
                        "Arrange your chosen toppings evenly.\n" +
                        "Season with salt and pepper.\n" +
                        "Bake in the oven for 1520 minutes or until the crust is golden and the cheese is bubbly.\n" +
                        "Optional: Garnish with fresh basil and grated Parmesan before serving. Slice and enjoy your Sicilian Pizza!"
            )
        ),
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        RecipeDataClass(
            id = 46,
            category = "Pizza",
            dishTitle = "Focaccia",
            imageResId = R.drawable.focaccia_pizza_46,
            description = "Focaccia is a versatile Italian flatbread, often seasoned with herbs and olive oil. There are no specific dietary restrictions. It's a soft, chewy bread, perfect for dipping in olive oil or serving as a side. One serving typically contains around 100120 calories. Focaccia is a flavorful, olive oil rich bread topped with herbs, sometimes vegetables, or even cheese. It's a simple yet delicious bread that can be enjoyed in various ways. Most recipes yield a standard rectangular focaccia that can be sliced into 812 servings",


            ingredients = listOf(
                "Ingredients:\n" ,
                        "2 1/4 tsp active dry yeast\n" +
                        "1 tsp sugar\n" +
                        "1 cup warm water\n" +
                        "3 cups all purpose flour\n" +
                        "1 1/4 tsp salt\n" +
                        "1/4 cup extra virgin olive oil\n" +
                        "Fresh or dried herbs (e.g., rosemary, thyme)\n" +
                        "Coarse salt\n" +
                        "Optional toppings (e.g., cherry tomatoes, olives)"
            ),
            instructions = listOf(
                "Cooking Process:\n" ,
                        "In a bowl, combine yeast, sugar, and warm water. Let it sit for about 5 minutes until foamy.\n" +
                        "Add flour and salt to the yeast mixture. Mix until it forms a dough.\n" +
                        "Knead the dough on a floured surface for about 5 minutes.\n" +
                        "Place the dough in an oiled bowl, cover, and let it rise for 12 hours until doubled in size.\n" +
                        "Preheat your oven to 425°F (220°C).\n" +
                        "Punch down the dough and press it into an oiled baking pan.\n" +
                        "Cover with a cloth and let it rest for 2030 minutes.\n" +
                        "Use your fingers to make dimples in the dough's surface.\n" +
                        "Drizzle with olive oil, sprinkle with herbs and coarse salt.\n" +
                        "Add optional toppings if desired.\n" +
                        "Bake for 2025 minutes until golden brown.\n" +
                        "Slice and serve your delicious Focaccia!"
            )
        ),
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        RecipeDataClass(
            id = 47,
            category = "Pizza",
            dishTitle = "Pizza Marinara",
            imageResId = R.drawable.pizza_marinara_47,
            description = "Pizza Marinara is a classic Italian pizza known for its simplicity and rich flavors. It's suitable for vegetarians and typically has no dietary restrictions. This pizza features a thin crust with tomato sauce, garlic, oregano, and olive oil. One serving contains approximately 150200 calories. Pizza Marinara is an Italian pizza renowned for its minimalist approach. It consists of a thin crust adorned with a vibrant tomato sauce, aromatic garlic, fragrant oregano, and a drizzle of olive oil. Most recipes yield a single pizza that can be sliced into 24 servings.",


            ingredients = listOf(
                "Ingredients:\n" ,
                        "Pizza dough (store bought or homemade)\n" +
                        "Tomato sauce\n" +
                        "Fresh garlic cloves\n" +
                        "Dried oregano\n" +
                        "Extra virgin olive oil\n" +
                        "Salt and pepper to taste"
            ),
            instructions = listOf(
                "Cooking Process:\n" ,
                        "Preheat your oven to the highest temperature it can reach (usually around 500°F or 260°C). Place a pizza stone or baking sheet in the oven to heat.\n" +
                        "Roll out the pizza dough into a thin round shape on a floured surface.\n" +
                        "Transfer the dough to parchment paper for easy transfer to the hot oven.\n" +
                        "Spread a thin layer of tomato sauce evenly over the dough, leaving a small border around the edges.\n" +
                        "Mince the garlic cloves and distribute them over the sauce.\n" +
                        "Sprinkle dried oregano generously over the pizza.\n" +
                        "Drizzle extra virgin olive oil over the top.\n" +
                        "Season with salt and pepper to taste.\n" +
                        "Carefully slide the parchment paper with the pizza onto the hot baking stone or sheet.\n" +
                        "Bake for about 1012 minutes until the crust is crisp and the edges are slightly golden.\n" +
                        "Remove from the oven, let it cool briefly, slice, and enjoy your delicious Pizza Marinara!"
            )
        ),
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        RecipeDataClass(
            id = 91,
            category = "Pizza",
            dishTitle = "Pizza Bianca With Lemon",
            imageResId = R.drawable.pizza_bianca_with_lemon_91,
            description = "Pizza Bianca with Lemon is a delightful variation of traditional pizza that offers a fresh and tangy twist. This pizza is characterized by a white base, typically made with creamy ricotta cheese or mozzarella, and is adorned with the zesty brightness of lemon. The lemon zest and juice infuse the pizza with a citrusy flavor that beautifully complements the richness of the cheese. Toppings may include ingredients like pistachio-lemon pesto, herbs, and sometimes even arugula for a peppery bite. The result is a harmonious blend of creamy, cheesy, and citrusy notes that create a unique and appetizing pizza experience, perfect for those looking to explore new and exciting flavors in the world of pizza.",


            ingredients = listOf(
                "Ingredients:\n" ,
                        " 500 g of pizza flour\n" +
                        "2 teaspoons of salt\n" +
                        "a cube of yeast (about 10 g), crushed\n" +
                        "3 dl of water\n" +
                        "2 tablespoons of olive oil\n" +
                        "3 tablespoons of pizza flour\n" +
                        "150 g of chopped mozzarella\n" +
                        "220 g of cheese with blue veins (e.g., gorgonzola), shredded\n" +
                        "cut 1 organic lemon in half and then thinly slice\n" +
                        "½ teaspoon of chili flakes"
            ),
            instructions = listOf(
                "Cooking Process:\n" ,
                        "1. Pizza dough: mix the flour, salt and yeast. " +
                        "Add the water and olive oil and knead for approx. 10 minutes until the dough is soft and smooth. dough. " +
                        "Cover and let rise for approx. for approx. 1 hour at room until the dough has doubled in volume. in volume.\n" +
                        "2. Filling: put the baking sheet in a cold oven and preheat it to 240°C. Cut the dough in half, form two balls, flatten them slightly with your hand and stretch them out on a small amount of flour until you have thin disks of dough. of dough. Place each of them on a sheet of of baking paper. Spread the mozzarella, gorgonzola and lemon on the dough disks.\n" +
                        "3. To prepare: place one of the two pizzas on the hot stove without removing the the baking paper on the hot stove. Bake for approx. 20 minutes in the lower part of the preheated in the lower part of the preheated oven. Remove the pizza from the oven and sprinkle with half of the chili flakes. Immediately prepare a second pizza of the same type"
            )
        ),
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


        RecipeDataClass(
            id = 92,
            category = "Pizza",
            dishTitle = "Pizza With Mascarpone And Ham",
            imageResId = R.drawable.pizza_with_mascarpone_and_ham_92,
            description = "Pizza with Mascarpone and Ham is a gourmet delight that combines the creamy richness of mascarpone cheese with the savory goodness of ham. This pizza typically features a thin, crispy crust as the base, which is spread with a layer of luscious mascarpone cheese. Slices of high-quality ham, often Italian or similar, are generously scattered on top. Complementing ingredients may include earthy mushrooms for added depth of flavor. When baked to perfection, the pizza emerges with a delightful blend of creamy, salty, and umami flavors. It's a sophisticated twist on the classic pizza, offering a harmonious balance of textures and tastes that make it a favorite among those who appreciate gourmet Italian cuisine.",


            ingredients = listOf(
                "Ingredients:\n" ,
                        " 475 g of white flour\n" +
                        "100 g of durum wheat semolina\n" +
                        "2 teaspoons of salt\n" +
                        "½ cube of yeast (about 20 g), crushed\n" +
                        "3½ liters of water\n" +
                        "3 tablespoons of olive oil\n" +
                        "some durum wheat semolina\n" +
                        "2 dl of tomato coulis\n" +
                        "1 tablespoon of olive oil\n" +
                        "1 clove of garlic, crushed\n" +
                        "1 tablespoon of chopped basil\n" +
                        "4 teaspoons of salt and a little pepper\n" +
                        "300 g of chopped mozzarella\n" +
                        "150 g of cherry tomatoes, cut in half\n" +
                        "150 g of mascarpone\n" +
                        "50 g of chopped raw ham\n" +
                        "40 g of arugula"
            ),
            instructions = listOf(
                "Cooking Process:\n" ,
                        "1. For the pizza dough: in a bowl, combine the flour, semolina, salt and yeast. Add the water and oil, mix for about 10 minutes with the minimum power of the food processor until you get a soft and smooth dough. \n" +
                        "dough. Cover and let rise for about 2 hours at room temperature until the dough has doubled in volume.\n" +
                        "2. Filling: divide the dough in half, shape into balls, flatten them slightly. Slowly roll them on the semolina to form two disks (about 30 cm in diameter). Place each pizza base on a baking sheet lined with baking paper. Mix the tomato coulis, oil, garlic and basil, and season. Spread this sauce over the two pizza bases, leaving a  1½ cm border. Top with mozzarella, cherry tomatoes and mascarpone.\n" +
                        "3. Cooking: Cook for about 25 minutes in the lower part of the oven, preheated to 240°C. Take the pizza out of the oven, \n" +
                        "put half of the raw ham and arugula on it, season it. Bake and garnish the second pizza in the same way. To get a crispier dough, preheat a baking sheet in the oven or use a pizza stone."

            )
        ),
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        RecipeDataClass(
            id = 48,
            category = "Pizza",
            dishTitle = "Pizza Capricciosa",
            imageResId = R.drawable.pizza_capricciosa_48,
            description = "Pizza Capricciosa is a delightful Italian pizza. It typically contains ham, mushrooms, artichokes, tomato sauce, mozzarella cheese, olives, olive oil, and basil. There are no specific dietary restrictions for this dish. One serving is approximately 250300 calories. Pizza Capricciosa is a classic Italian pizza known for its balanced and flavorful toppings. It combines the richness of ham and cheese with the earthiness of mushrooms and artichokes, complemented by the freshness of olives and basil. Most recipes yield one pizza designed for 24 servings.",


            ingredients = listOf(
                "Ingredients:\n" ,
                        "Pizza dough (store bought or homemade)\n" +
                        "Tomato sauce\n" +
                        "Mozzarella cheese\n" +
                        "Ham slices\n" +
                        "Canned artichoke hearts, drained and sliced\n" +
                        "Button mushrooms, thinly sliced\n" +
                        "Black olives, pitted and halved\n" +
                        "Fresh basil leaves\n" +
                        "Olive oil\n" +
                        "Salt and pepper to taste"
            ),
            instructions = listOf(
                "Cooking Process:\n" ,
                        "Preheat your oven to the highest temperature it can reach (usually around 500°F or 260°C). Place a pizza stone or baking sheet in the oven to heat.\n" +
                        "Roll out the pizza dough into a thin round shape on a floured surface.\n" +
                        "Transfer the dough to parchment paper for easy transfer to the hot oven.\n" +
                        "Spread a thin layer of tomato sauce evenly over the dough, leaving a small border around the edges.\n" +
                        "Sprinkle mozzarella cheese over the sauce.\n" +
                        "Arrange ham slices, sliced artichokes, mushroom slices, and olive halves on top.\n" +
                        "Season with salt and pepper to taste.\n" +
                        "Carefully slide the parchment paper with the pizza onto the hot baking stone or sheet.\n" +
                        "Bake for about 1012 minutes until the crust is crisp and the cheese is bubbly and golden.\n" +
                        "Remove from the oven, top with fresh basil leaves, drizzle with olive oil, slice, and enjoy your delicious Pizza Capricciosa!"

            )
        ),
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        RecipeDataClass(
            id = 49,
            category = "Pizza",
            dishTitle = "Pizza Diavola",
            imageResId = R.drawable.pizza_diavola_49,
            description = "Pizza Diavola is an Italian pizza known for its spicy flavors. It typically includes tomato sauce, mozzarella cheese, spicy salami, and sometimes chili flakes. There are no specific dietary restrictions. Each serving contains approximately 250300 calories. Pizza Diavola, meaning \"Devil's Pizza,\" packs a punch with spicy salami and chili flakes. It's a flavorful and fiery pizza that balances heat with the richness of cheese and tomato sauce. Most recipes are designed to serve 24 people.",


            ingredients = listOf(
                "Ingredients:\n" ,
                        "Pizza dough (store bought or homemade)\n" +
                        "Tomato sauce\n" +
                        "Mozzarella cheese\n" +
                        "Spicy salami or pepperoni\n" +
                        "Chili flakes (optional)\n" +
                        "Olive oil\n" +
                        "Salt and pepper to taste"
            ),
            instructions = listOf(
                "Cooking Process:\n" ,
                        "Preheat your oven to its highest temperature (usually around 500°F or 260°C) with a pizza stone or baking sheet inside.\n" +
                        "Roll out the pizza dough into a thin round shape on a floured surface.\n" +
                        "Transfer the dough to parchment paper for easy transfer to the hot oven.\n" +
                        "Spread a thin layer of tomato sauce evenly over the dough, leaving a small border.\n" +
                        "Sprinkle mozzarella cheese over the sauce.\n" +
                        "Add slices of spicy salami or pepperoni.\n" +
                        "Optionally, sprinkle chili flakes for extra heat.\n" +
                        "Season with salt and pepper.\n" +
                        "Carefully slide the parchment paper with the pizza onto the hot baking stone or sheet.\n" +
                        "Bake for 1012 minutes until the crust is crisp and the cheese is golden.\n" +
                        "Remove from the oven, slice, and savor your spicy Pizza Diavola!"

            )
        ),
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        RecipeDataClass(
            id = 76,
            category = "Pizza",
            dishTitle = "Pizza Pepperoni",
            imageResId = R.drawable.pizza_pepperoni_76,
            description = "Pizza Pepperoni is a beloved classic with a crispy crust, zesty tomato sauce, gooey mozzarella cheese, and spicy pepperoni.",


            ingredients = listOf(
                "Ingredients:\n" ,
                        "Pizza dough\n" +
                        "1/2 cup tomato sauce\n" +
                        "1 1/2 cups shredded mozzarella cheese\n" +
                        "3.5 oz (about 24 slices) pepperoni\n" +
                        "1 tablespoon olive oil"
            ),
            instructions = listOf(
                "Cooking Process:\n" ,
                        "Preheat your oven to 475°F (245°C).\n" +
                        "Roll out the pizza dough on a floured surface.\n" +
                        "Transfer the dough to a pizza stone or baking sheet.\n" +
                        "Spread the tomato sauce evenly over the dough.\n" +
                        "Sprinkle mozzarella cheese generously.\n" +
                        "Arrange the pepperoni slices over the cheese.\n" +
                        "Drizzle olive oil on top.\n" +
                        "Bake for 12-15 minutes until the crust is golden and the cheese is bubbly.\n" +
                        "Slice and savor your homemade Pepperoni Pizza."

            )
        ),
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        RecipeDataClass(
            id = 77,
            category = "Pizza",
            dishTitle = "Pizza Prosciutto e Funghi",
            imageResId = R.drawable.pizza_prosciutto_e_funghi_77,
            description = "Pizza Prosciutto e Funghi is a delectable Italian pizza topped with savory prosciutto and earthy mushrooms.",


            ingredients = listOf(
                "Ingredients:\n" ,
                        "Pizza dough\n" +
                        "1/2 cup tomato sauce\n" +
                        "1 1/2 cups mozzarella cheese\n" +
                        "4-6 slices of prosciutto\n" +
                        "1 cup sliced mushrooms\n" +
                        "Olive oil\n" +
                        "Fresh basil leaves (optional)"
            ),
            instructions = listOf(
                "Cooking Process:\n" ,
                        "Preheat your oven to 475°F (245°C).\n" +
                        "Roll out the pizza dough on a floured surface.\n" +
                        "Transfer the dough to a pizza stone or baking sheet.\n" +
                        "Spread a thin layer of tomato sauce over the dough.\n" +
                        "Sprinkle mozzarella cheese evenly.\n" +
                        "Distribute prosciutto slices and mushroom slices.\n" +
                        "Drizzle olive oil over the toppings.\n" +
                        "Bake for 12-15 minutes or until the crust is golden and the cheese is bubbly.\n" +
                        "Garnish with fresh basil if desired.\n" +
                        "Slice and enjoy this flavorful Prosciutto e Funghi pizza."

            )
        ),
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


        RecipeDataClass(
            id = 78,
            category = "Pizza",
            dishTitle = "Pizza Margherita con Bufala (Margherita with Buffalo Mozzarella)",
            imageResId = R.drawable.pizza_margherita_con_bufala_78,
            description = "Pizza Margherita con Bufala is a classic Italian pizza that combines simplicity and richness. ",


            ingredients = listOf(
                "Ingredients:\n" ,
                        "Pizza dough\n" +
                        "1/2 cup tomato sauce\n" +
                        "1 1/2 cups buffalo mozzarella cheese\n" +
                        "Fresh basil leaves\n" +
                        "Olive oil\n" +
                        "Salt and pepper"
            ),
            instructions = listOf(
                "Cooking Process:\n" ,
                        "Preheat your oven to the highest temperature (usually around 500°F or 260°C) with a pizza stone inside.\n" +
                        "Roll out the pizza dough thinly on a floured surface.\n" +
                        "Transfer the dough to parchment paper.\n" +
                        "Spread tomato sauce evenly, leaving a border for the crust.\n" +
                        "Add buffalo mozzarella slices and sprinkle with salt and pepper.\n" +
                        "Slide the pizza (with parchment) onto the hot pizza stone.\n" +
                        "Bake for about 10-12 minutes or until the crust is golden and cheese is bubbly.\n" +
                        "Remove from the oven, top with fresh basil leaves, drizzle with olive oil, and enjoy your Margherita con Bufala, a perfect blend of flavors and textures."

            )
        ),
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        RecipeDataClass(
            id = 79,
            category = "Pizza",
            dishTitle = "Pizza Romana",
            imageResId = R.drawable.pizza_romana_79,
            description = "Pizza Romana, also known as Roman Pan Pizza, is a delicious Italian dish characterized by its rectangular shape and crispy, airy crust.  ",


            ingredients = listOf(
                "Ingredients:\n" ,
                        "Pizza dough (400g)\n" +
                        "Tomato sauce (200g)\n" +
                        "Mozzarella cheese (200g)\n" +
                        "Olive oil\n" +
                        "Fresh basil leaves\n" +
                        "Salt and pepper to taste"
            ),
            instructions = listOf(
                "Cooking Process:\n" ,
                        "Preheat your oven to 220°C (430°F).\n" +
                        "Roll out the pizza dough to fit a rectangular baking pan, ensuring it's thin and evenly spread.\n" +
                        "Transfer the dough to the pan and press it into the corners.\n" +
                        "Drizzle olive oil over the dough.\n" +
                        "Spread tomato sauce evenly, leaving a small border for the crust.\n" +
                        "Sprinkle shredded mozzarella on top.\n" +
                        "Season with salt and pepper.\n" +
                        "Bake for about 20-25 minutes or until the crust is golden and the cheese is bubbly.\n" +
                        "Remove from the oven, top with fresh basil leaves, and serve this delightful Roman-style pizza."

            )
        ),
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        RecipeDataClass(
            id = 80,
            category = "Pizza",
            dishTitle = "Pizza Salsiccia e Friarielli",
            imageResId = R.drawable.pizza_salsiccia_e_friarielli_80,
            description = "Pizza Salsiccia e Friarielli is a flavorful Neapolitan-style pizza featuring sausages and broccoli rabe.",


            ingredients = listOf(
                "Ingredients:\n" ,
                        "Pizza dough (enough for one pizza)\n" +
                        "200g sausage, preferably Italian sausage\n" +
                        "150g broccoli rabe (friarielli)\n" +
                        "Tomato sauce\n" +
                        "Mozzarella cheese\n" +
                        "Olive oil\n" +
                        "Salt and pepper to taste"
            ),
            instructions = listOf(
                "Cooking Process:\n" ,
                        "Preheat your oven to the highest temperature (typically around 475-500°F or 245-260°C) or use a pizza oven if available.\n" +
                        "Roll out the pizza dough into a round or rectangular shape, depending on your preference.\n" +
                        "Spread a thin layer of tomato sauce over the dough, leaving a small border for the crust.\n" +
                        "Add shredded mozzarella cheese evenly.\n" +
                        "Cook the sausage and friarielli separately. Slice the cooked sausage.\n" +
                        "Place the sausage and friarielli on the pizza.\n" +
                        "Drizzle olive oil over the top and season with salt and pepper.\n" +
                        "Bake the pizza for about 10-12 minutes or until the crust is golden and the cheese is bubbly.\n" +
                        "Remove from the oven, let it cool for a moment, then slice and enjoy your Salsiccia e Friarielli pizza."

            )
        ),
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        RecipeDataClass(
            id = 81,
            category = "Pizza",
            dishTitle = "Pizza Frutti di Mare",
            imageResId = R.drawable.pizza_frutti_di_mare_81,
            description = "Pizza Frutti di Mare is a delightful Italian seafood pizza known for its abundance of fresh seafood flavors. ",


            ingredients = listOf(
                "Ingredients:\n" ,
                        "Pizza dough (enough for one pizza)\n" +
                        "Tomato sauce or passata\n" +
                        "200g mixed seafood (such as shrimp, mussels, squid, and clams)\n" +
                        "1/2 cup mozzarella cheese\n" +
                        "Fresh basil leaves\n" +
                        "Olive oil\n" +
                        "Salt and pepper to taste\n" +
                        "Red pepper flakes (optional for added heat)"
            ),
            instructions = listOf(
                "Cooking Process:\n" ,
                        "Preheat your oven to the highest temperature (typically around 475-500°F or 245-260°C) or use a pizza oven if available.\n" +
                        "Roll out the pizza dough into a round or rectangular shape.\n" +
                        "Spread a thin layer of tomato sauce or passata evenly over the dough.\n" +
                        "Add the mixed seafood and mozzarella cheese evenly.\n" +
                        "Season with salt, pepper, and red pepper flakes (if desired).\n" +
                        "Drizzle olive oil over the top.\n" +
                        "Bake the pizza for about 10-12 minutes or until the crust is golden and the seafood is cooked.\n" +
                        "Remove from the oven, garnish with fresh basil leaves, slice, and enjoy your Frutti di Mare pizza, brimming with oceanic flavors."

            )
        ),
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        RecipeDataClass(
            id = 82,
            category = "Pizza",
            dishTitle = "Pizza Funghi e Tartufo",
            imageResId = R.drawable.pizza_funghi_e_tartufo_82,
            description = "Pizza Funghi e Tartufo is a delectable Italian pizza combining the earthy flavors of mushrooms and the luxurious essence of truffles.",

            ingredients = listOf(
                "Ingredients:\n" ,
                        "Pizza dough (enough for one pizza)\n" +
                        "Tomato sauce or passata\n" +
                        "200g fresh mushrooms, thinly sliced (e.g., cremini or button mushrooms)\n" +
                        "Truffle cream or truffle oil\n" +
                        "Mozzarella cheese, shredded\n" +
                        "Parmesan cheese, grated\n" +
                        "Fresh thyme leaves\n" +
                        "Olive oil\n" +
                        "Salt and pepper to taste"
            ),
            instructions = listOf(
                "Cooking Process:\n" ,
                        "Preheat your oven to its highest temperature (typically around 475-500°F or 245-260°C).\n" +
                        "Roll out the pizza dough into a round shape.\n" +
                        "Spread a thin layer of tomato sauce or passata over the dough.\n" +
                        "Evenly distribute the sliced mushrooms on the sauce.\n" +
                        "Drizzle truffle cream or oil over the mushrooms.\n" +
                        "Sprinkle mozzarella cheese and a bit of Parmesan on top.\n" +
                        "Season with salt and pepper, then add fresh thyme leaves.\n" +
                        "Drizzle olive oil over the pizza.\n" +
                        "Bake for approximately 10-12 minutes until the crust is golden and the cheese is bubbly.\n" +
                        "Slice and savor this gourmet Pizza Funghi e Tartufo, a harmonious blend of forest and truffle flavors."
            )
        ),
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        RecipeDataClass(
            id = 50,
            category = "Side Dishes",
            dishTitle = "Risotto alla Milanese",
            imageResId = R.drawable.risotto_alla_milanese_50,
            description = "Risotto alla Milanese is a creamy Italian rice dish with saffron, giving it a vibrant yellow color. There are no specific dietary restrictions. It's a classic, comforting dish with around 300 calories per serving. Risotto alla Milanese is a rich and velvety risotto known for its golden hue, achieved by saffron infusion. It's a sumptuous, comforting Italian dish. Most recipes serve 4 people.",

            ingredients = listOf(
                "Ingredients:\n" ,
                        "1 1/2 cups Arborio rice\n" +
                        "4 cups chicken or vegetable broth\n" +
                        "1 small onion, finely chopped\n" +
                        "2 tablespoons butter\n" +
                        "2 tablespoons olive oil\n" +
                        "1/2 cup dry white wine\n" +
                        "1/4 teaspoon saffron threads\n" +
                        "1/2 cup grated Parmesan cheese\n" +
                        "Salt and pepper to taste"
            ),
            instructions = listOf(
                "Cooking Process:\n" ,
                        "Heat the broth in a saucepan and add saffron threads to infuse the liquid with color and flavor.\n" +
                        "In a separate pan, heat the butter and olive oil. Sauté the finely chopped onion until translucent.\n" +
                        "Add Arborio rice and cook for a couple of minutes until it turns translucent at the edges.\n" +
                        "Pour in the white wine and stir until it's mostly absorbed.\n" +
                        "Begin adding the saffron infused broth one ladle at a time, stirring frequently and allowing the liquid to be absorbed before adding more.\n" +
                        "Continue this process until the rice is creamy and cooked but still slightly al dente (usually about 1820 minutes).\n" +
                        "Remove from heat, stir in grated Parmesan cheese, and season with salt and pepper.\n" +
                        "Serve your creamy Risotto alla Milanese hot, garnished with extra Parmesan if desired. Enjoy!"
            )
        ),
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        RecipeDataClass(
            id = 51,
            category = "Side Dishes",
            dishTitle = "Polenta",
            imageResId = R.drawable.polenta_51,
            description = "Polenta is a versatile Italian dish made from cornmeal. It's naturally gluten free, making it suitable for those with dietary restrictions. Polenta can be served creamy or solid; its calories vary based on preparation. Generally, it's about 150 calories per 100g. Polenta is a cornmeal dish that can be creamy or firm, depending on how it's prepared. It's a staple in northern Italian cuisine, often as a side or base for various toppings. The recipe can be adjusted for the number of servings needed.",

            ingredients = listOf(
                "Ingredients:\n" ,
                        "1 cup of coarse cornmeal\n" +
                        "4 cups of water or broth\n" +
                        "Salt to taste\n" +
                        "Butter or olive oil (optional)\n" +
                        "Grated cheese (Parmesan or other) (optional)"
            ),
            instructions = listOf(
                "Cooking Process:\n" ,
                        "Boil water or broth in a large pot and add salt.\n" +
                        "Gradually pour the cornmeal into the boiling liquid while whisking continuously to avoid lumps.\n" +
                        "Reduce heat to low and cook, stirring often, until the polenta thickens (usually about 30 minutes). Add more liquid if needed.\n" +
                        "If desired, stir in butter or olive oil and grated cheese for extra flavor and creaminess.\n" +
                        "Once the polenta is thick and creamy, remove it from heat.\n" +
                        "You can serve it hot and soft or pour it into a pan to cool and solidify for later slicing and grilling.\n" +
                        "Enjoy your polenta with various toppings like ragù, mushrooms, or cheese."
            )
        ),
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        RecipeDataClass(
            id = 52,
            category = "Side Dishes",
            dishTitle = "Caponata",
            imageResId = R.drawable.caponata_52,
            description = "Caponata is a Sicilian dish known for its sweet and sour flavor. It's suitable for various dietary preferences, including vegetarian and vegan. This dish features eggplants, tomatoes, onions, and capers, creating a delightful Mediterranean taste. It typically contains around 150 calories per 1 cup serving.",

            ingredients = listOf(
                "Ingredients:\n" ,
                        "2 large eggplants, diced\n" +
                        "1 onion, finely chopped\n" +
                        "3 celery stalks, chopped\n" +
                        "1 can (14 oz) diced tomatoes\n" +
                        "1/4 cup red wine vinegar\n" +
                        "1/4 cup olive oil\n" +
                        "3 tbsp sugar\n" +
                        "2 tbsp capers\n" +
                        "2 tbsp chopped fresh basil\n" +
                        "Salt and pepper to taste"
            ),
            instructions = listOf(
                "Cooking Process:\n" ,
                        "In a large skillet, heat olive oil over medium heat. Add the diced eggplants and sauté until they become tender and golden, then remove and set aside.\n" +
                        "Add more olive oil if needed in the same skillet, and sauté the onions and celery until softened.\n" +
                        "Add the diced tomatoes, vinegar vinegar, and sugar to the skillet. Cook for about 10 minutes, allowing the flavors to meld.\n" +
                        "Stir in the sautéed eggplants, capers, and chopped basil. Cook for an additional 5 minutes.\n" +
                        "Season the caponata with salt and pepper to taste.\n" +
                        "Remove from heat, let it cool to room temperature, and refrigerate for at least a few hours before serving. Caponata is best served cold or at room temperature as a side dish or appetizer.\n" +
                        "Enjoy your homemade Caponata with its rich flavors and versatility in Italian cuisine."
            )
        ),
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        RecipeDataClass(
            id = 53,
            category = "Side Dishes",
            dishTitle = "Roasted Peppers",
            imageResId = R.drawable.roasted_peppers_53,
            description = "Roasted Peppers is a classic Italian dish that can be enjoyed as an appetizer or a side. It's typically not associated with specific dietary restrictions, making it a versatile choice. Roasted Peppers are sweet, smoky, and vibrant. Each serving contains approximately 4050 calories",

            ingredients = listOf(
                "Ingredients:\n" ,
                        "4 red bell peppers\n" +
                        "2 tablespoons olive oil\n" +
                        "Salt and pepper to taste\n" +
                        "Optional: garlic, herbs, or vinegar for extra flavor"
            ),
            instructions = listOf(
                "Cooking Process:\n" ,
                        "Preheat your oven to 450°F (232°C).\n" +
                        "Wash and dry the peppers. Place them on a baking sheet.\n" +
                        "Roast the peppers in the oven for about 3040 minutes, turning them occasionally until the skin is charred and blistered.\n" +
                        "Remove the peppers from the oven and place them in a sealed plastic bag or covered bowl to steam for 1015 minutes. This makes it easier to peel off the skin.\n" +
                        "After steaming, peel off the skin, remove the seeds, and slice the peppers into strips.\n" +
                        "Drizzle with olive oil, season with salt and pepper, and add any optional ingredients for extra flavor.\n" +
                        "Serve the Roasted Peppers as a side dish, in salads, sandwiches, or antipasto platters."
            )
        ),
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        RecipeDataClass(
            id = 54,
            category = "Side Dishes",
            dishTitle = "Fried Zucchini Flowers",
            imageResId = R.drawable.fried_zucchini_flowers_54,
            description = "Fried Zucchini Flowers, a delectable Italian appetizer, are often served without specific dietary restrictions. These delicate blossoms are crispy on the outside, tender on the inside, and bursting with flavor. Each serving typically contains about 100150 calories.",

            ingredients = listOf(
                "Ingredients:\n" ,
                        "12 zucchini flowers\n" +
                        "1 cup all purpose flour\n" +
                        "1 cup sparkling water or beer\n" +
                        "Salt and pepper to taste\n" +
                        "Vegetable oil for frying\n" +
                        "Optional: mozzarella cheese, anchovies, or herbs for stuffing"
            ),
            instructions = listOf(
                "Cooking Process:\n" ,
                        "Gently wash the zucchini flowers and remove the pistil from inside.\n" +
                        "If desired, stuff each flower with a small piece of mozzarella cheese, anchovies, or herbs.\n" +
                        "In a bowl, mix the flour, sparkling water or beer, salt, and pepper until you have a smooth batter.\n" +
                        "Heat vegetable oil in a deep pan or skillet.\n" +
                        "Dip each zucchini flower into the batter, coating it evenly.\n" +
                        "Fry the flowers in the hot oil until golden brown and crispy, usually for about 23 minutes per side.\n" +
                        "Remove with a slotted spoon and place them on paper towels to remove excess oil.\n" +
                        "Serve the Fried Zucchini Flowers hot, as a delightful appetizer or side dish."
            )
        ),
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


        RecipeDataClass(
            id = 55,
            category = "Side Dishes",
            dishTitle = "Farro Salad",
            imageResId = R.drawable.farro_salad_55,
            description = "Italian Farro Salad is a wholesome and nutritious dish typically without specific dietary restrictions. This salad features chewy farro grains, fresh vegetables, and sometimes cheese. It's a versatile side or main course option. A serving contains around 250300 calories",

            ingredients = listOf(
                "Ingredients (for approximately 4 servings):\n" ,
                        "1 cup farro\n" +
                        "2 cups water or broth\n" +
                        "1 cup cherry tomatoes, halved\n" +
                        "1/2 cup cucumber, diced\n" +
                        "1/4 cup red onion, finely chopped\n" +
                        "1/4 cup fresh basil leaves, chopped\n" +
                        "1/4 cup feta cheese (optional)\n" +
                        "Olive oil, lemon juice, salt, and pepper for dressing"
            ),
            instructions = listOf(
                "Cooking Process:\n" ,
                        "Rinse the farro under cold water. In a saucepan, combine farro and water or broth. Bring to a boil, then reduce to a simmer and cook for about 2025 minutes until tender but still chewy. Drain any excess liquid.\n" +
                        "In a large bowl, combine cooked farro, cherry tomatoes, cucumber, red onion, and basil.\n" +
                        "If desired, add feta cheese for extra flavor.\n" +
                        "Drizzle with olive oil and lemon juice, and season with salt and pepper. Toss to combine.\n" +
                        "Refrigerate for at least 30 minutes before serving to allow flavors to meld.\n" +
                        "Serve Italian Farro Salad as a refreshing side or light meal, perfect for warm days."
            )
        ),
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        RecipeDataClass(
            id = 56,
            category = "Side Dishes",
            dishTitle = "Rapini with Garlic and Olive Oil",
            imageResId = R.drawable.papini_with_garlic_and_olive_oil_56,
            description = "Rapini with Garlic and Olive Oil, a classic Italian dish, is typically suitable for various dietary preferences. This dish features tender rapini sautéed with garlic and olive oil, creating a flavorful and slightly bitter side or topping. A serving contains approximately 100150 calories",

            ingredients = listOf(
                "Ingredients (for 4 servings):\n" ,
                        "1 bunch rapini (broccoli rabe)\n" +
                        "23 cloves garlic, thinly sliced\n" +
                        "3 tablespoons olive oil\n" +
                        "Salt and red pepper flakes (optional)\n" +
                        "Grated Pecorino Romano cheese (optional)"
            ),
            instructions = listOf(
                "Cooking Process:\n" ,
                        "Wash the rapini and trim the tough ends.\n" +
                        "In a large pot, bring salted water to a boil. Blanch the rapini for about 23 minutes until tender but still vibrant green. Drain and set aside.\n" +
                        "In a large skillet, heat olive oil over medium heat. Add sliced garlic and red pepper flakes if desired. Sauté until the garlic is fragrant but not browned.\n" +
                        "Add the blanched rapini to the skillet and sauté for another 23 minutes, tossing to coat with the garlic infused oil.\n" +
                        "Season with salt to taste and remove from heat.\n" +
                        "Optionally, sprinkle with grated Pecorino Romano cheese.\n" +
                        "Serve Rapini with Garlic and Olive Oil as a side dish or over pasta."
            )
        ),
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        RecipeDataClass(
            id = 57,
            category = "Side Dishes",
            dishTitle = "Grilled Polenta",
            imageResId = R.drawable.grilled_polenta_57,
            description = "Grilled Polenta is a delicious Italian dish made from cornmeal. It is typically gluten free and suitable for vegetarian diets. A serving of grilled polenta contains about 150 calories",

            ingredients = listOf(
                "Ingredients (for 4 servings):\n" ,
                        "1 cup of polenta (cornmeal)\n" +
                        "4 cups of water\n" +
                        "Salt and pepper to taste\n" +
                        "Olive oil for grilling"
            ),
            instructions = listOf(
                "Cooking Process:\n" ,
                        "In a saucepan, bring 4 cups of water to a boil. Add a pinch of salt.\n" +
                        "Gradually whisk in 1 cup of polenta, stirring constantly to avoid lumps.\n" +
                        "Reduce heat to low and continue stirring for about 1520 minutes until the mixture thickens and pulls away from the sides of the pan.\n" +
                        "Pour the cooked polenta onto a baking sheet or dish and spread it evenly to about 1/2 inch thickness. Allow it to cool and set for at least 30 minutes.\n" +
                        "Once set, cut the polenta into desired shapes (squares or rounds).\n" +
                        "Preheat a grill or grill pan over medium high heat. Brush the polenta slices with olive oil.\n" +
                        "Grill the polenta on each side for 45 minutes, or until it develops grill marks and turns golden.\n" +
                        "Serve hot with your favorite toppings, such as grilled vegetables, tomato sauce, or cheese."
            )
        ),
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        RecipeDataClass(
            id = 90,
            category = "Side Dishes",
            dishTitle = "Risotto with apricots and scallops",
            imageResId = R.drawable.risotto_with_apricots_and_scallops_90,
            description = "Risotto with apricots and scallops is a delightful culinary creation that combines the creamy comfort of risotto with the sweet and savory notes of apricots and succulent scallops. The dish typically starts with Arborio or Carnaroli rice cooked to a creamy consistency by gradually adding hot broth and stirring to release its starches.",

            ingredients = listOf(
                "Ingredients:\n" ,
                        " 1 tbsp of butter\n" +
                        "2 finely chopped shallots \n" +
                        "1 sprig of rosemary\n" +
                        "300g of risotto rice (Arborio, for example)\n" +
                        "2 dl of white wine\n" +
                        "9 dl of hot chicken broth\n" +
                        "80 g of grated Parmesan cheese \n" +
                        "salt and pepper to taste\n" +
                        "400 g apricots, cut into quarters\n" +
                        " 2 tbsp of water \n" +
                        "1 sprig of chopped rosemary\n" +
                        "1 tsp. chili flakes\n" +
                        "4 tsp of salt\n" +
                        "1 tbsp of olive oil\n" +
                        "12 scallops \n" +
                        "1 tsp of salt"
            ),
            instructions = listOf(
                "Cooking Process:\n" ,
                        "Risotto: melt the butter in a saucepan. Make it a dream Finish the shallots and rosemary. Add the rice and cook, stirring, until it becomes transparent. Moisten with wine, let it steam almost completely. Pour in the stock while it is cooking, stirring frequently and making sure the rice is still covered with liquid. Let it simmer over low heat. 20 minutes, until the rice is creamy and al dente. Stir in the cheese and butter, season with\n" +
                        "Apricots: mix the apricots. with water, romaine and chili in a in a saucepan, cover with a lid and simmer for about 3 minutes, salt.\n" +
                        "Scallops: to make heat the oil in a nonstick frying in a nonstick frying pan. Add the scallops for about 2 minutes on each each side, searing. Spread out the risotto, distribute scallops and apricots.\n"
            )
        ),
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        RecipeDataClass(
            id = 94,
            category = "Cocktail",
            dishTitle = "Limoncello spritz",
            imageResId = R.drawable.limoncello_spritz_94,
            description = "Limoncello Spritz is a delightful and refreshing Italian cocktail that captures the essence of the Amalfi Coast. This invigorating drink is made by combining Limoncello liqueur, known for its bright lemon flavor, with sparkling water and sometimes a splash of prosecco. It's typically served over ice and garnished with lemon slices and fresh mint leaves for added aroma and aesthetics.",

            ingredients = listOf(
                "Ingredients:\n" ,
                        "Lemon liqueur 20 ml.\n" +
                        "Prosecco 150 ml.\n" +
                        "Carbonated mineral water  50 ml.\n" +
                        "Slices of lemons 2 pcs.\n" +
                        "Sprig of rosemary  1 pc.\n" +
                        "Ice 3-4 cubes."
            ),
            instructions = listOf(
                "Cooking Process:\n" ,
                        "1. Put the ice cubes in a glass. Add the lemon liqueur, water and prosecco and stir lightly.\n" +
                        "2. Garnish with lemon and rosemary wedges."
            )
        ),
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        RecipeDataClass(
            id = 95,
            category = "Cocktail",
            dishTitle = "Magenta",
            imageResId = R.drawable.magenta_95,
            description = "Magenta",

            ingredients = listOf(
                "Ingredients:\n" ,
                        "3 tablespoons of ginger syrup\n" +
                        "4 dl almond drink\n" +
                        "1 dl of beet juice"
            ),
            instructions = listOf(
                "Cooking Process:\n" ,
                        "Mix the three ingredients vigorously the three ingredients. Garnish with with almond drink mousse and fresh mint."
            )
        ),
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


        RecipeDataClass(
            id = 66,
            category = "Dessert",
            dishTitle = "Affogato",
            imageResId = R.drawable.affogato_66,
            description = "Affogato is a classic Italian dessert that consists of a scoop of vanilla ice cream or gelato \"drowned\" in a shot of hot espresso. There are no specific dietary restrictions for this dessert. Dessert. Approximately 100150 calories per 1 serving. Affogato is a simple yet indulgent dessert where the hot espresso melts the cold, creamy ice cream, creating a delightful blend of flavors and temperatures. It's a quick and easy dessert to satisfy your sweet cravings. The recipe is typically for one serving but can be multiplied for more",

            ingredients = listOf(
                "Ingredients:\n" ,
                        "1 scoop of vanilla ice cream or gelato\n" +
                        "1 shot of hot espresso\n" +
                        "Optional: chocolate shavings, chopped nuts, or a drizzle of liqueur like Amaretto (for variations)"
            ),
            instructions = listOf(
                "Cooking Process:\n" ,
                        "Place a scoop of vanilla ice cream or gelato in a serving glass or cup.\n" +
                        "Brew a shot of hot espresso using an espresso machine or a Moka pot.\n" +
                        "Pour the hot espresso over the ice cream.\n" +
                        "Optionally, garnish with chocolate shavings, chopped nuts, or a drizzle of liqueur like Amaretto.\n" +
                        "Serve immediately, and enjoy while the ice cream melts into the coffee."
            )
        ),
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        RecipeDataClass(
            id = 75,
            category = "Dessert",
            dishTitle = "Flambéed tart with apricots",
            imageResId = R.drawable.flambeed_tart_with_apricots_75,
            description = "A flambéed tart with apricots is a delightful dessert that combines the sweetness of ripe apricots with the rich and slightly caramelized flavors of a flambéed glaze. The base of this tart typically consists of a buttery and flaky pastry crust. It's then filled with a luscious mixture of fresh apricots and almond cream, known as frangipane. The unique element of flambéing involves igniting a liqueur (often apricot brandy or similar) over the tart just before serving. This process not only adds a dramatic flair but also imparts a warm, boozy aroma and flavor to the dessert. The result is a beautifully browned, fragrant tart with tender apricots that have absorbed the delightful essence of the flambéed liqueur. It's a wonderful combination of textures and flavors that's sure to impress dessert enthusiasts.",

            ingredients = listOf(
                "Ingredients:\n" ,
                        "300 g of white flour\n" +
                        "1 teaspoon of salt\n" +
                        "diced yeast (approx. 10 g), crushed\n" +
                        "1½ dl of water\n" +
                        "½ dl olive oil\n" +
                        "1 tbsp of honey\n" +
                        "100 g of sour cream\n" +
                        "100 g of cheese with blue veins (e.g. Gorgonzola), cut into pieces\n" +
                        "200 g of chopped apricots a bunch of peeled thyme\n" +
                        "50 g of arugula\n" +
                        "½ tablespoon of liquid honey\n" +
                        "14 teaspoons of fleur de sel\n" +
                        "little pepper"
            ),
            instructions = listOf(
                "Cooking Process:\n" ,
                        "Dough: Mix the flour, salt and yeast. Add water, oil and honey, mix with a small spatula until a soft dough is formed. soft dough, \n" +
                        "knead briefly, cover cover and leave for approx. 10 minutes.\n" +
                        "Forming: cutting the dough into into 4 pieces. On a small amount of flour, roll out the pieces of of dough to approx. 2 mm thick to form oval shapes and place them on two baking sheets lined with paper for baking.\n" +
                        "Tarte flambée: brush the the pasta with sour cream with the sour cream. Garnish with gorgonzola, apricots and thyme.\n" +
                        "Cooking time: cook for approx. 20 minutes in a preheated preheated to 220°C in an oven (with a fan). Remove them out of the oven, put the arugula on the arugula, drizzle with honey, and season.\n" +
                        "Option: use gorgonzola instead of gorgonzola, use mascarpone or cream cheese instead."
            )
        ),
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


        RecipeDataClass(
            id = 73,
            category = "Dessert",
            dishTitle = "Lemon Cake (Torta Al Limone)",
            imageResId = R.drawable.lemon_cacke_torla_al_limone_73,
            description = "Lemon Cake, known as Torta al Limone in Italian, is a delectable dessert that showcases the bright and zesty flavors of lemons. This cake is characterized by its moist and tender crumb, infused with the refreshing citrusy aroma and tangy taste of lemons. Typically, it is made by incorporating lemon zest and juice into the batter, creating a delightful balance between sweetness and tartness.",

            ingredients = listOf(
                "Ingredients:\n" ,
                        "200 g of white flour\n" +
                        "50 g of sugar\n" +
                        "4 teaspoons of salt\n" +
                        "80 g of cold butter cut into small pieces\n" +
                        "3 dl of water\n" +
                        "80 g of butter\n" +
                        "3 tablespoons of corn starch\n" +
                        "3 tablespoons of cold water\n" +
                        "120 g of sugar\n" +
                        "4 fresh egg yolks\n" +
                        "3 organic lemons, a little grated zest and all the juice 1 organic lemon, " +
                        "cut into slices For a pie pan approx. 28 cm in in diameter, with the bottom lined with baking paper greased edges"
            ),
            instructions = listOf(
                "Cooking Process:\n" ,
                        "1. Dough: mix the flour, sugar and salt. Add the butter, rub everything with your hands until you get a homogeneous crumbly mass. Add the water and \n" +
                        "quickly mix everything together, to get a soft dough without overmixing. Flatten the dough, cover and chill for about 30 minutes.\n" +
                        "2. For the base: roll out the dough between two sheets of baking paper  (approx. 32 cm in diameter) and place it on the baking sheet, keeping the bottom sheet on. Prick the bottom with a fork.\n" +
                        "3. Cooking: Cook for approx. 20 minutes in the in the lower part of a preheated 200°C oven. Remove the pie plate from the oven, let it cool, then place it \n" +
                        "cool, then place it on a wire rack and allow to cool.\n" +
                        "4. For the filling: in a saucepan, bring the water and butter in a saucepan until it comes to a boil. Dissolve the corn flour dissolve in water, add sugar and egg yolks, mix. Add \n" +
                        "this mixture to the boiling liquid, stirring with a whisk. While stirring, bring to a boil, set aside. Add lemon zest and juice (approx. 2 dl). Pour the still hot mixture into the the bottom of the pie and let it cool. Cover the the pie and put it in the refrigerator for at least 3 hours.\n" +
                        "5. Garnish: decorate the tart with lemon slices."
            )
        ),
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


        RecipeDataClass(
            id = 58,
            category = "Dessert",
            dishTitle = "Tiramisu",
            imageResId = R.drawable.tiramisu_58,
            description = "Tiramisu is a classic Italian dessert known for its creamy and coffee infused layers. It typically contains caffeine from coffee and raw eggs, so it's not suitable for those with dietary restrictions related to caffeine or raw eggs. A single serving of Tiramisu contains approximately 300 calories",

            ingredients = listOf(
                "Ingredients (for 6 servings):\n" ,
                        "6 egg yolks\n" +
                        "3/4 cup granulated sugar\n" +
                        "1 cup mascarpone cheese\n" +
                        "1 1/2 cups heavy cream\n" +
                        "2 cups brewed espresso, cooled\n" +
                        "1/4 cup coffee liqueur (optional)\n" +
                        "1 package of ladyfingers (about 24)\n" +
                        "Cocoa powder for dusting\n" +
                        "Dark chocolate shavings for garnish"
            ),
            instructions = listOf(
                "Cooking Process:\n" ,
                        "In a heatproof bowl, whisk together egg yolks and 1/2 cup of sugar over a double boiler until pale and creamy.\n" +
                        "Remove from heat and add mascarpone cheese, mixing until well combined.\n" +
                        "In a separate bowl, whip the heavy cream until stiff peaks form.\n" +
                        "Gently fold the whipped cream into the mascarpone mixture.\n" +
                        "Combine brewed espresso and coffee liqueur in a shallow dish.\n" +
                        "Quickly dip each ladyfinger into the espresso mixture, ensuring they are soaked but not soggy.\n" +
                        "Arrange a layer of dipped ladyfingers in a serving dish.\n" +
                        "Spread half of the mascarpone mixture over the ladyfingers.\n" +
                        "Repeat with another layer of dipped ladyfingers and the remaining mascarpone mixture.\n" +
                        "Refrigerate for at least 4 hours or overnight.\n" +
                        "Before serving, dust the top with cocoa powder and garnish with dark chocolate shavings.\n" +
                        "Serve chilled and enjoy the luscious Tiramisu!"
            )
        ),
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


        RecipeDataClass(
            id = 59,
            category = "Dessert",
            dishTitle = "Cannoli",
            imageResId = R.drawable.cannoli_59,
            description = "Cannoli is a delightful Italian dessert known for its crispy pastry shells and creamy ricotta filling. It's a rich and indulgent treat, so it may not be suitable for those with dietary restrictions on dairy or sugar. A typical Cannoli contains about 100150 calories per serving",

            ingredients = listOf(
                "Ingredients (for 12 Cannoli):\n" ,
                        "2 cups ricotta cheese\n" +
                        "1/2 cup powdered sugar\n" +
                        "1/2 teaspoon vanilla extract\n" +
                        "1/4 cup mini chocolate chips\n" +
                        "12 Cannoli shells (store bought or homemade)"
            ),
            instructions = listOf(
                "Cooking Process:\n" ,
                        "In a bowl, mix ricotta cheese, powdered sugar, and vanilla extract until well combined.\n" +
                        "Gently fold in the mini chocolate chips.\n" +
                        "Fill each Cannoli shell with the ricotta mixture using a piping bag or spoon.\n" +
                        "Dust the ends with powdered sugar or dip them in chopped pistachios or chocolate chips for added flavor and texture.\n" +
                        "Serve Cannoli immediately to enjoy the perfect blend of crispy and creamy textures."
            )
        ),
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        RecipeDataClass(
            id = 60,
            category = "Dessert",
            dishTitle = "Panna Cotta",
            imageResId = R.drawable.panna_cotta_60,
            description = "Panna Cotta is a classic Italian dessert known for its creamy, custard like texture. It's generally not suitable for those with dietary restrictions on dairy. A typical serving of vanilla Panna Cotta contains about 250300 calories. It's a simple yet elegant dessert.",

            ingredients = listOf(
                "Ingredients (for 4 servings):\n" ,
                        "2 cups heavy cream\n" +
                        "1/2 cup granulated sugar\n" +
                        "1 vanilla bean or 2 teaspoons of vanilla extract\n" +
                        "2 1/4 teaspoons of gelatin\n" +
                        "3 tablespoons cold water"
            ),
            instructions = listOf(
                "Cooking Process:\n" ,
                        "In a saucepan, mix heavy cream and sugar. If using a vanilla bean, scrape the seeds into the mixture; otherwise, add vanilla extract.\n" +
                        "Sprinkle gelatin over cold water in a separate bowl and let it bloom for a few minutes.\n" +
                        "Heat the cream mixture over medium heat until it's hot but not boiling.\n" +
                        "Remove from heat and stir in the gelatin mixture until it's dissolved.\n" +
                        "Pour the mixture into serving glasses or ramekins.\n" +
                        "Refrigerate for at least 4 hours or until set.\n" +
                        "Serve Panna Cotta chilled, garnished with fresh berries or a drizzle of caramel sauce."
            )
        ),
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


        RecipeDataClass(
            id = 61,
            category = "Dessert",
            dishTitle = "Gelato",
            imageResId = R.drawable.gelato_61,
            description = "Gelato is a delightful Italian frozen dessert, similar to ice cream but creamier and denser. It's typically not suitable for those with dairy restrictions. A serving of gelato contains about 100130 calories, depending on the flavor.",

            ingredients = listOf(
                "Ingredients (for 4 servings):\n" ,
                        "2 cups whole milk\n" +
                        "1 cup heavy cream\n" +
                        "3/4 cup granulated sugar\n" +
                        "1 vanilla bean or 1 teaspoon of vanilla extract\n" +
                        "Flavoring ingredients like fruit, chocolate, or nuts (as desired)"
            ),
            instructions = listOf(
                "Cooking Process:\n" ,
                        "Combine milk and cream in a saucepan. If using a vanilla bean, split it and scrape the seeds into the mixture; otherwise, add vanilla extract.\n" +
                        "Heat the mixture over medium heat until it's hot but not boiling.\n" +
                        "Remove from heat and let it cool slightly.\n" +
                        "In a separate bowl, whisk sugar until it's dissolved.\n" +
                        "Gradually whisk the sugar into the milk mixture until well combined.\n" +
                        "Transfer the mixture to an ice cream maker and churn according to the manufacturer's instructions.\n" +
                        "During the last few minutes of churning, add your chosen flavoring ingredients.\n" +
                        "Once done, transfer the gelato to an airtight container and freeze for a few hours until firm.\n" +
                        "Serve the gelato in bowls or cones, garnished with fresh fruit or nuts."
            )
        ),
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


        RecipeDataClass(
            id = 62,
            category = "Dessert",
            dishTitle = "Zeppole",
            imageResId = R.drawable.zeppole_62,
            description = "Zeppole are traditional Italian pastries, particularly popular on St. Joseph's Day. They are deep fried dough balls, similar to donuts but with a unique texture. Zeppole is not suitable for those on strict dietary restrictions due to their frying process. Dessert. Approximately 150 calories per serving Zeppole are light, airy, and slightly crispy on the outside. They are typically served with powdered sugar and sometimes a cherry on top, making them a sweet delight.",

            ingredients = listOf(
                "Ingredients:\n" ,
                        "1 cup water\n" +
                        "1/2 cup unsalted butter\n" +
                        "1 cup all purpose flour\n" +
                        "A pinch of salt\n" +
                        "4 large eggs\n" +
                        "Vegetable oil for frying\n" +
                        "Powdered sugar for dusting\n" +
                        "Maraschino cherries (optional)"
            ),
            instructions = listOf(
                "Cooking Process:\n" ,
                        "In a saucepan, combine water and butter. Bring to a boil.\n" +
                        "Add flour and a pinch of salt all at once. Stir vigorously until the mixture forms a ball.\n" +
                        "Remove from heat and let it cool for a few minutes.\n" +
                        "Beat in eggs one at a time until the dough is smooth.\n" +
                        "Heat oil in a deep fryer or heavy pot to 375°F (190°C).\n" +
                        "Drop spoonfuls of dough into the hot oil. Fry until golden brown, about 4 minutes.\n" +
                        "Remove with a slotted spoon and drain on paper towels.\n" +
                        "Dust with powdered sugar and top with maraschino cherries if desired.\n" +
                        "Enjoy your homemade Zeppole, a delightful Italian treat!"
            )
        ),
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        RecipeDataClass(
            id = 63,
            category = "Dessert",
            dishTitle = "Biscotti",
            imageResId = R.drawable.biscotti_63,
            description = "Biscotti are traditional Italian almond cookies. They're not suitable for those with nut allergies due to the almonds. Biscotti are a twice baked cookie, resulting in a crunchy texture, perfect for dipping in coffee or wine. They have around 110 calories per serving. Dessert. Approximately 110 calories per serving, Biscotti are oblong shaped cookies with a delightful crunch. They are often flavored with almonds and have a subtle sweetness. Biscotti are typically served with coffee or dessert wine and can be dipped to soften their texture. The recipe is designed to yield about 20 biscotti",

            ingredients = listOf(
                "Ingredients:\n" ,
                        "2 cups all purpose flour\n" +
                        "1 1/2 teaspoons baking powder\n" +
                        "1/4 teaspoon salt\n" +
                        "1/2 cup unsalted butter, at room temperature\n" +
                        "1 cup granulated sugar\n" +
                        "2 large eggs\n" +
                        "1 teaspoon vanilla extract\n" +
                        "1 cup whole almonds"
            ),
            instructions = listOf(
                "Cooking Process:\n" ,
                        "Preheat your oven to 350°F (175°C).\n" +
                        "In a bowl, whisk together the flour, baking powder, and salt.\n" +
                        "In a separate bowl, cream together the butter and sugar until light and fluffy.\n" +
                        "Beat in the eggs one at a time, then stir in the vanilla.\n" +
                        "Gradually blend in the dry ingredients and fold in the almonds.\n" +
                        "Divide the dough in half and shape each half into a log about 12 inches long and 2 inches wide.\n" +
                        "Place the logs on a baking sheet and bake for 2530 minutes, or until they are light brown.\n" +
                        "Remove from the oven and let cool for a few minutes. Then, slice the logs into 1/2 inch slices.\n" +
                        "Lay the slices on their sides on the baking sheet and bake for an additional 610 minutes, or until they are golden brown and crisp.\n" +
                        "Allow them to cool before serving. Enjoy your homemade biscotti!"
            )
        ),
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        RecipeDataClass(
            id = 64,
            category = "Dessert",
            dishTitle = "Zabaione",
            imageResId = R.drawable.zabaione_64,
            description = "Zabaione, also known as Zabaglione, is an Italian custard dessert with a creamy, frothy texture. It's made from egg yolks, sugar, and a sweet wine, often Marsala. There are no specific dietary restrictions unless you have concerns about consuming raw eggs. Dessert. Approximately 220 calories per serving, Zabaione is a luscious Italian dessert known for its rich, velvety texture and sweet, wine infused flavor. It's often served as a standalone dessert or over fresh berries or cake. The recipe typically serves 4.",

            ingredients = listOf(
                "Ingredients:\n" ,
                        "4 large egg yolks\n" +
                        "1/4 cup granulated sugar\n" +
                        "1/2 cup sweet Marsala wine\n" +
                        "Fresh berries or other toppings (optional)"
            ),
            instructions = listOf(
                "Cooking Process:\n" ,
                        "In a heatproof bowl, whisk together the egg yolks and sugar until well combined.\n" +
                        "Place the bowl over a pot of simmering water (double boiler) and add the Marsala wine.\n" +
                        "Whisk continuously for about 810 minutes until the mixture becomes thick, frothy, and triples in volume. It should be heated but not boiling.\n" +
                        "Remove from heat and continue whisking for a minute as it cools slightly.\n" +
                        "Serve warm in dessert glasses, garnished with fresh berries or any desired toppings if you like. Enjoy your homemade Zabaione!"
            )
        ),
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        RecipeDataClass(
            id = 65,
            category = "Dessert",
            dishTitle = "Amaretto Semifreddo",
            imageResId = R.drawable.amaretto_semifreddo_65,
            description = "Amaretto Semifreddo is a delightful Italian frozen dessert with amaretto liqueur and almond flavors. It's rich and creamy, similar to ice cream, but lighter in texture. There are no specific dietary restrictions for this dessert. Dessert. The calorie count may vary depending on the recipe, but it's approximately 250300 calories per serving. Amaretto Semifreddo is a semi frozen dessert that combines amaretto nutty taste with amaretti cookies' sweetness. It's a delightful treat with a creamy texture, perfect for a sweet ending to an Italian meal. The recipe typically serves 6.",

            ingredients = listOf(
                "Ingredients:\n" ,
                        "3 large egg yolks\n" +
                        "1/2 cup granulated sugar\n" +
                        "2 tablespoons amaretto liqueur\n" +
                        "1 1/4 cups heavy cream\n" +
                        "1/2 cup crushed amaretti cookies\n" +
                        "Sliced almonds and additional cookies for garnish (optional)"
            ),
            instructions = listOf(
                "Cooking Process:\n" ,
                        "In a heatproof bowl, whisk together egg yolks and sugar. Place the bowl over a pot of simmering water (double boiler) and whisk until the mixture thickens.\n" +
                        "Remove from heat and stir in amaretto liqueur. Let it cool to room temperature.\n" +
                        "Whip the heavy cream until stiff peaks form.\n" +
                        "Gently fold the egg mixture into the whipped cream.\n" +
                        "Fold in the crushed amaretti cookies.\n" +
                        "Pour the mixture into a loaf pan lined with plastic wrap.\n" +
                        "Freeze for at least 4 hours or until set.\n" +
                        "Serve slices of semifreddo garnished with sliced almonds and additional amaretti cookies, if desired."
            )
        ),
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


        RecipeDataClass(
            id = 83,
            category = "Cocktail",
            dishTitle = "Red cabbage cream",
            imageResId = R.drawable.red_cabbage_cream_83,
            description = "Red cabbage cream is a vibrant and flavorful dish that showcases the earthy and slightly sweet taste of red cabbage. This recipe typically involves finely shredding red cabbage and cooking it until tender. The cabbage is then combined with various ingredients to create a creamy and rich texture. While the exact recipe can vary, it often includes ingredients like cream, butter, onions, and seasonings such as nutmeg. The result is a velvety, purplish-red cream with a unique taste profile that balances the cabbage's natural sweetness with the richness of the cream. Red cabbage cream is a delightful side dish that complements a wide range of main courses, adding both color and flavor to the plate",

            ingredients = listOf(
                "Ingredients:\n" ,
                        "600 g of red cabbage\n" +
                        "1 tbsp of melted butter\n" +
                        "2 chopped onions\n" +
                        "3 floury potatoes, cut into cubes\n" +
                        "½ dl red wine vinegar\n" +
                        "11 vegetable broth\n" +
                        "1 dl of apple juice"
            ),
            instructions = listOf(
                "Cooking Process:\n" ,
                        "Cut the red cabbage into into strips, fry in butter together with onions and potatoes and brush with vinegar. \n" +
                        "Pour in the broth and simmer over low heat for about 30 minutes. \n" +
                        "Add the apple juice and whisk. \n" +
                        "Serve and garnish with radishes."
            )
        ),
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        RecipeDataClass(
            id = 67,
            category = "Breads",
            dishTitle = "Focaccia Bread",
            imageResId = R.drawable.focaccia_bread_67,
            description = "Focaccia Bread is an Italian classic known for its soft, chewy texture and delightful olive oil flavor. It is versatile and perfect for various occasions. Generally, there are no specific dietary restrictions, but you can adapt the toppings to your preference. Focaccia is a flat oven baked Italian bread. A typical serving of Focaccia has around 150200 calories. Focaccia is a savory, herbed bread, often topped with rosemary, olives, or cherry tomatoes, making it a flavorful and aromatic treat. This recipe typically serves 68 people",

            ingredients = listOf(
                "Ingredients:\n" +
                        "4 cups all purpose flour\n" +
                        "1 packet (2 1/4 tsp) active dry yeast\n" +
                        "1 1/2 cups warm water\n" +
                        "2 tsp salt\n" +
                        "1/4 cup olive oil\n" +
                        "Toppings of your choice (rosemary, olives, cherry tomatoes, etc.)"
            ),
            instructions = listOf(
                "Cooking Process:\n" ,
                        "In a bowl, dissolve yeast in warm water. Let it sit for 510 minutes until frothy.\n" +
                        "In a large mixing bowl, combine flour and salt. Pour in the yeast mixture and olive oil. Mix until a dough forms.\n" +
                        "Knead the dough for 57 minutes until smooth and elastic.\n" +
                        "Place the dough in an oiled bowl, cover with a damp cloth, and let it rise for about 1 hour.\n" +
                        "Preheat your oven to 475°F (245°C).\n" +
                        "Roll out the dough into a rectangle, transfer it to a baking sheet, and let it rest for 15 minutes.\n" +
                        "Create dimples in the dough with your fingers, drizzle with olive oil, and add your chosen toppings.\n" +
                        "Bake for 1520 minutes until golden brown.\n" +
                        "Let it cool slightly, then slice and serve.\n" +
                        "\n" +
                        "Enjoy your homemade Focaccia Bread!"
            )
        ),
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    )


}















