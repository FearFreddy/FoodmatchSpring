package de.hdm.foodMatch;

public class Constants {
    public static final int MAX_MISSING_INGEDRIENTS = 2;
    public static final int MAX_NEEDING_INGEDRIENTS = 2;

    static final String userJSON = "{\n" +
            "    \"id\":1223321,\n" +
            "  \"firstname\": \"Miro\",\n" +
            "   \"surname\": \"Bilge\",\n" +
            "   \"male\": true,\n" +
            "   \"favoriteRecipe\":[696667,538169],\n" +
            "   \"savedIngredients\":[1125,2045,1016],\n" +
            "   \"neededIngredients\":[11353,2045,11291]\n" +
            "}";

    static final String recipesJSON = "{\n" +
            "    \"recipes\": [\n" +
            "        {\n" +
            "            \"vegetarian\": true,\n" +
            "            \"vegan\": false,\n" +
            "            \"glutenFree\": true,\n" +
            "            \"dairyFree\": false,\n" +
            "            \"veryHealthy\": false,\n" +
            "            \"extendedIngredients\": [\n" +
            "                {\n" +
            "                    \"id\": 1125,\n" +
            "                    \"aisle\": \"Milk, Eggs, Other Dairy\",\n" +
            "                    \"name\": \"egg yolk\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 2045,\n" +
            "                    \"aisle\": \"Spices and Seasonings\",\n" +
            "                    \"name\": \"fresh dill\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 1016,\n" +
            "                    \"aisle\": \"Cheese\",\n" +
            "                    \"name\": \"low fat cottage cheese\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 1002030,\n" +
            "                    \"aisle\": \"Spices and Seasonings\",\n" +
            "                    \"name\": \"pepper\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 11353,\n" +
            "                    \"aisle\": \"Produce\",\n" +
            "                    \"name\": \"russet potatoes\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 2047,\n" +
            "                    \"aisle\": \"Spices and Seasonings\",\n" +
            "                    \"name\": \"salt\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 11291,\n" +
            "                    \"aisle\": \"Produce\",\n" +
            "                    \"name\": \"scallions\"\n" +
            "                }\n" +
            "            ],\n" +
            "            \"id\": 696667,\n" +
            "            \"title\": \"Twice-Baked Potatoes\",\n" +
            "            \"readyInMinutes\": 75,\n" +
            "            \"servings\": 4,\n" +
            "            \"image\": \"https://spoonacular.com/recipeImages/696667-556x370.jpg\",\n" +
            "            \"instructions\": \"Preheat oven to 400F.Bake potatoes. Halve lengthwise and scoop out flesh, leaving a 1/4-inch shell.Puree cottage cheese and egg yolk in a food processor. Add potato flesh, scallions, dill, salt and pepper; pulse until just blended. Mound filling into potato skins and place in a baking dish. Bake until heated through, 20 to 30 minutes.\"\n" +
            "\n" +
            "        },\n" +
            "        {\n" +
            "            \"vegetarian\": false,\n" +
            "            \"vegan\": false,\n" +
            "            \"glutenFree\": false,\n" +
            "            \"dairyFree\": true,\n" +
            "            \"veryHealthy\": false,\n" +
            "            \"extendedIngredients\": [\n" +
            "                {\n" +
            "                    \"id\": 18064,\n" +
            "                    \"aisle\": \"Bakery/Bread\",\n" +
            "                    \"name\": \"bread\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 11215,\n" +
            "                    \"aisle\": \"Produce\",\n" +
            "                    \"name\": \"garlic\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 15152,\n" +
            "                    \"aisle\": \"Seafood\",\n" +
            "                    \"name\": \"shrimp\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 4053,\n" +
            "                    \"aisle\": \"Oil, Vinegar, Salad Dressing\",\n" +
            "                    \"name\": \"olive oil\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 11819,\n" +
            "                    \"aisle\": \"Produce\",\n" +
            "                    \"name\": \"red chiles\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 2047,\n" +
            "                    \"aisle\": \"Spices and Seasonings\",\n" +
            "                    \"name\": \"salt\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 1002068,\n" +
            "                    \"aisle\": \"Oil, Vinegar, Salad Dressing\",\n" +
            "                    \"name\": \"white wine vinegar\"\n" +
            "                }\n" +
            "            ],\n" +
            "            \"id\": 597585,\n" +
            "            \"title\": \"Portuguese Grilled Shrimp with Hot Sauce\",\n" +
            "            \"readyInMinutes\": 270,\n" +
            "            \"servings\": 4,\n" +
            "            \"image\": \"https://spoonacular.com/recipeImages/597585-556x370.jpg\",\n" +
            "            \"instructions\": \"1. In a jar with a tight-fitting lid, combine the chiles, garlic, salt, olive oil, and vinegar. Cover, shake well, and refrigerate for about 1 week before using. You should have about 1 1/2 cups piri-piri sauce. (You will not use it all; store the remainder for up to 2 months.) Shake the piri-piri sauce well before using.2. In a mortar, grind together the garlic and chiles or cayenne pepper to make a paste. Stir in the olive oil. Rub this mixture over the shrimp, place them in a bowl, cover, and refrigerate for 4 hours.3. Preheat a broiler (or grill pan), or prepare a fire in a grill. Remove the shrimp from the marinade, reserving the marinade. Thread the shrimp onto skewers, piercing the shrimp twice, once near the tail and again near the head. Sprinkle with salt. Broil or grill, turning once and basting with the marinade, until opaque throughout, 5 to 6 minutes total.4. Arrange the skewers on a serving platter and garnish with the lemon wedges. Serve the bread and piri-piri sauce for dipping on the side.\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"vegetarian\": true,\n" +
            "            \"vegan\": false,\n" +
            "            \"glutenFree\": false,\n" +
            "            \"dairyFree\": false,\n" +
            "            \"veryHealthy\": false,\n" +
            "            \"extendedIngredients\": [\n" +
            "                {\n" +
            "                    \"id\": 1123,\n" +
            "                    \"aisle\": \"Milk, Eggs, Other Dairy\",\n" +
            "                    \"name\": \"eggs\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 20081,\n" +
            "                    \"aisle\": \"Baking\",\n" +
            "                    \"name\": \"flour\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 20081,\n" +
            "                    \"aisle\": \"Baking\",\n" +
            "                    \"name\": \"flour\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 19335,\n" +
            "                    \"aisle\": \"Baking\",\n" +
            "                    \"name\": \"granulated sugar\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 19334,\n" +
            "                    \"aisle\": \"Baking\",\n" +
            "                    \"name\": \"light brown sugar\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 2047,\n" +
            "                    \"aisle\": \"Spices and Seasonings\",\n" +
            "                    \"name\": \"salt\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 12109,\n" +
            "                    \"aisle\": \"Baking\",\n" +
            "                    \"name\": \"sweetened coconut\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 1145,\n" +
            "                    \"aisle\": \"Milk, Eggs, Other Dairy\",\n" +
            "                    \"name\": \"unsalted butter\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 19165,\n" +
            "                    \"aisle\": \"Baking\",\n" +
            "                    \"name\": \"unsweetened cocoa powder\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 2050,\n" +
            "                    \"aisle\": \"Baking\",\n" +
            "                    \"name\": \"vanilla extract\"\n" +
            "                }\n" +
            "            ],\n" +
            "            \"id\": 538169,\n" +
            "            \"title\": \"Coconut Bars with Chocolate Shortbread Crust\",\n" +
            "            \"readyInMinutes\": 65,\n" +
            "            \"servings\": 16,\n" +
            "            \"image\": \"https://spoonacular.com/recipeImages/538169-556x370.jpg\",\n" +
            "            \"instructions\": \"To make the crust:Preheat oven to 350. Grease an 8-inch square baking pan.Whisk together flour, brown sugar, cocoa powder, and salt in a medium bowl. Add butter, and mix with a pastry blender or fork until combined. Dough will be crumbly but should hold together when pinched.Press dough into bottom of prepared pan. Bake 10 minutes. Allow to cool slightly.To make the topping:Place eggs in a large bowl and beat lightly. Add sugar and vanilla, and mix well. Mix in flour until combined. Stir in 1 cup coconut.Pour topping over partially baked crust and spread evenly. Sprinkle remaining 1/2 cup coconut over filling.Bake 30-35 minutes, or until topping has set and coconut is lightly toasted. Cool in pan before cutting into bars.\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"vegetarian\": true,\n" +
            "            \"vegan\": false,\n" +
            "            \"glutenFree\": false,\n" +
            "            \"dairyFree\": false,\n" +
            "            \"veryHealthy\": false,\n" +
            "            \"extendedIngredients\": [\n" +
            "                {\n" +
            "                    \"id\": 11284,\n" +
            "                    \"aisle\": \"Spices and Seasonings\",\n" +
            "                    \"name\": \"dried onion\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 1002055,\n" +
            "                    \"aisle\": \"Produce\",\n" +
            "                    \"name\": \"horseradish\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 4025,\n" +
            "                    \"aisle\": \"Condiments\",\n" +
            "                    \"name\": \"mayonnaise\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 2046,\n" +
            "                    \"aisle\": \"Condiments\",\n" +
            "                    \"name\": \"mustard\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 99155,\n" +
            "                    \"aisle\": \"Savory Snacks\",\n" +
            "                    \"name\": \"pretzel nuggets\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 93733,\n" +
            "                    \"aisle\": \"Oil, Vinegar, Salad Dressing\",\n" +
            "                    \"name\": \"ranch salad dressing mix\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 1056,\n" +
            "                    \"aisle\": \"Milk, Eggs, Other Dairy\",\n" +
            "                    \"name\": \"sour cream\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 19335,\n" +
            "                    \"aisle\": \"Baking\",\n" +
            "                    \"name\": \"sugar\"\n" +
            "                }\n" +
            "            ],\n" +
            "            \"id\": 464603,\n" +
            "            \"title\": \"Mustard Pretzel Dip\",\n" +
            "            \"readyInMinutes\": 10,\n" +
            "            \"servings\": 28,\n" +
            "            \"image\": \"https://spoonacular.com/recipeImages/464603-556x370.jpg\",\n" +
            "            \"instructions\": \"In a large bowl, combine the first seven ingredients. Cover and refrigerate for at least 30 minutes. Serve with pretzels. Refrigerate leftovers.\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"vegetarian\": false,\n" +
            "            \"vegan\": false,\n" +
            "            \"glutenFree\": true,\n" +
            "            \"dairyFree\": false,\n" +
            "            \"veryHealthy\": false,\n" +
            "            \"extendedIngredients\": [\n" +
            "                {\n" +
            "                    \"id\": 10011693,\n" +
            "                    \"aisle\": \"Canned and Jarred\",\n" +
            "                    \"name\": \"canned tomatoes\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 11215,\n" +
            "                    \"aisle\": \"Produce\",\n" +
            "                    \"name\": \"garlic\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 7927,\n" +
            "                    \"aisle\": \"Meat\",\n" +
            "                    \"name\": \"italian turkey sausage\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 1082047,\n" +
            "                    \"aisle\": \"Spices and Seasonings\",\n" +
            "                    \"name\": \"kosher salt\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 11260,\n" +
            "                    \"aisle\": \"Produce\",\n" +
            "                    \"name\": \"mushrooms\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 4053,\n" +
            "                    \"aisle\": \"Oil, Vinegar, Salad Dressing\",\n" +
            "                    \"name\": \"olive oil\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 11282,\n" +
            "                    \"aisle\": \"Produce\",\n" +
            "                    \"name\": \"onion\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 1033,\n" +
            "                    \"aisle\": \"Cheese\",\n" +
            "                    \"name\": \"parmesan cheese\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 1036,\n" +
            "                    \"aisle\": \"Cheese\",\n" +
            "                    \"name\": \"ricotta cheese\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 1001026,\n" +
            "                    \"aisle\": \"Cheese\",\n" +
            "                    \"name\": \"shredded mozzarella cheese\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 11492,\n" +
            "                    \"aisle\": \"Produce\",\n" +
            "                    \"name\": \"spaghetti squash\"\n" +
            "                }\n" +
            "            ],\n" +
            "            \"id\": 493211,\n" +
            "            \"title\": \"Turkey Sausage & Mushroom Spaghetti Squash Casserole\",\n" +
            "            \"readyInMinutes\": 85,\n" +
            "            \"servings\": 8,\n" +
            "            \"image\": \"https://spoonacular.com/recipeImages/493211-556x370.jpg\",\n" +
            "            \"instructions\": \"Prepare the spaghetti squash by following these instructions or these instructions for cooking in the oven or these instructions for cooking in the microwave.Scrape out the “noodles” into a large bowl using a fork and set aside.Preheat oven to 400°F.Meanwhile, heat the olive oil in a large saucepan over medium heat.Add the onion, season with salt and pepper, and cook for about 3-4 minutes, or until onion starts to soften and become translucent.Add the garlic and cook for another minute or two.Add the turkey sausage to the skillet, and cook until nearly cooked through, crumbling it as it cooks.Then add the mushrooms and cook for another 3-5 minutes.Add the crushed tomatoes and heat through for a minute or two.Combine the sauce and the spaghetti squash, and transfer to a 9/13 casserole or glass baking dish.Place dollops of ricotta over the top of the spaghetti squash mixture and stir in partially.Top with shredded mozzarella and parmesan and bake for 25-20 minutes, or until cheese is melted and lightly browned, and casserole is heated through.Let sit for 5 minutes or so before serving.\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"vegetarian\": false,\n" +
            "            \"vegan\": false,\n" +
            "            \"glutenFree\": false,\n" +
            "            \"dairyFree\": true,\n" +
            "            \"veryHealthy\": false,\n" +
            "            \"extendedIngredients\": [\n" +
            "                {\n" +
            "                    \"id\": 93607,\n" +
            "                    \"aisle\": \"Milk, Eggs, Other Dairy\",\n" +
            "                    \"name\": \"almond milk\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 4673,\n" +
            "                    \"aisle\": \"Milk, Eggs, Other Dairy\",\n" +
            "                    \"name\": \"dairy free margarine\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 19297,\n" +
            "                    \"aisle\": \"Nut butters, Jams, and Honey\",\n" +
            "                    \"name\": \"jelly\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 16098,\n" +
            "                    \"aisle\": \"Nut butters, Jams, and Honey\",\n" +
            "                    \"name\": \"peanut butter\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 18069,\n" +
            "                    \"aisle\": \"Gluten Free\",\n" +
            "                    \"name\": \"white sandwich bread\"\n" +
            "                }\n" +
            "            ],\n" +
            "            \"id\": 248384,\n" +
            "            \"title\": \"Pan-Fried Peanut Butter Jelly Sandwich\",\n" +
            "            \"readyInMinutes\": 12,\n" +
            "            \"servings\": 2,\n" +
            "            \"image\": \"https://spoonacular.com/recipeImages/248384-556x370.jpg\",\n" +
            "            \"instructions\": \"Melt 1 teaspoon of the margarine in a skillet over medium heat.While that is warming up, slather one side of each bread slice with some dairy-free margarine – just lightly, no need to use too much.On the opposite side of two slices, spread on some peanut butter, and on the opposite side of the remaining two slices, spread on as much jelly as you like. Match them up to make two peanut butter jelly sandwiches with margarine on the outsides.Once hot, place one sandwich in the skillet, and cook until it is lightly browned, about 3 minutes. Flip and lightly brown the other side. Serve to the hungry person next to you, and repeat the process with the second sandwich for you.Serve the sandwiches with some almond milk goodness to wash it down.\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"vegetarian\": true,\n" +
            "            \"vegan\": false,\n" +
            "            \"glutenFree\": false,\n" +
            "            \"dairyFree\": false,\n" +
            "            \"veryHealthy\": false,\n" +
            "            \"extendedIngredients\": [\n" +
            "                {\n" +
            "                    \"id\": 1145,\n" +
            "                    \"aisle\": \"Milk, Eggs, Other Dairy\",\n" +
            "                    \"name\": \"unsalted butter\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 1017,\n" +
            "                    \"aisle\": \"Cheese\",\n" +
            "                    \"name\": \"cream cheese\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 9156,\n" +
            "                    \"aisle\": \"Produce\",\n" +
            "                    \"name\": \"lemon zest\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 12311111,\n" +
            "                    \"aisle\": \"Baking\",\n" +
            "                    \"name\": \"lemon extract\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 2050,\n" +
            "                    \"aisle\": \"Baking\",\n" +
            "                    \"name\": \"vanilla extract\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 19335,\n" +
            "                    \"aisle\": \"Baking\",\n" +
            "                    \"name\": \"granulated sugar\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 19334,\n" +
            "                    \"aisle\": \"Baking\",\n" +
            "                    \"name\": \"light brown sugar\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 1082047,\n" +
            "                    \"aisle\": \"Spices and Seasonings\",\n" +
            "                    \"name\": \"kosher salt\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 1123,\n" +
            "                    \"aisle\": \"Milk, Eggs, Other Dairy\",\n" +
            "                    \"name\": \"egg\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 9152,\n" +
            "                    \"aisle\": \"Produce\",\n" +
            "                    \"name\": \"lemon juice\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 20081,\n" +
            "                    \"aisle\": \"Baking\",\n" +
            "                    \"name\": \"flour\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 18372,\n" +
            "                    \"aisle\": \"Baking\",\n" +
            "                    \"name\": \"baking soda\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 19335,\n" +
            "                    \"aisle\": \"Baking\",\n" +
            "                    \"name\": \"granulated sugar\"\n" +
            "                }\n" +
            "            ],\n" +
            "            \"id\": 795298,\n" +
            "            \"title\": \"Soft and Chewy Lemon Cookies\",\n" +
            "            \"readyInMinutes\": 82,\n" +
            "            \"servings\": 30,\n" +
            "            \"image\": \"https://spoonacular.com/recipeImages/795298-556x370.jpg\",\n" +
            "            \"instructions\": \"Beat the butter and sugar together: Place the softened butter, cream cheese, lemon zest, lemon extract, vanilla extract, both sugars and salt in the bowl of a stand mixer fit with a paddle attachment. Beat the ingredients together until the butter is light, fluffy, and clings to the side of the bowl.\\n\\nBeat in the egg and lemon juice: Add the egg and beat to incorporate. Scrape down the sides of the bowl with a spatula. Add the lemon juice and mix to incorporate, about a minute. The batter may look “broken” but don’t worry about that. Again scrape down the sides of the bowl.\\n\\nMix in the flour: Add the flour and baking soda. Mix on low speed until the dry ingredients are mostly absorbed, then increase the speed for a few seconds until fully incorporated.\\n\\nCover the bowl and chill the dough in the fridge for at least 1 hour, or overnight. This makes the sticky, soft dough easier to roll out.\\n\\nHeat the oven to 375°F: Line a baking sheet with a silicon baking mat or parchment.\\n\\nRoll the cookies: Use a cookie scoop or a tablespoon measure to scoop up a heaping tablespoon dough. Lightly roll the dough in the palms of your hands to form a ball roughly 1 1/2 inches in diameter, about the size of a ping-pong ball. If the dough is too sticky to work with even after chilling, wet your hands, dry them slightly with a paper towel, and try rolling again with damp hands.\\nRoll the dough in the granulated white sugar and place on the baking sheet. Repeat, leaving about 2 inches between each ball.\\n\\nUsing the flat bottom of a glass, press down and form thick disks, about 2 inches wide. If the dough starts sticking to the bottom of the glass, dip the glass in the sugar before continuing. Sprinkle some extra sugar over each cookie.\\n\\nBake 12 to 15 minutes, or until the edges of the cookie are starting to turn golden brown. Let cool for 10 minutes on the baking sheet, then use a very thin spatula (like a fish spatula) to transfer the cookies to a wire rack to cool completely.\\nStore in an airtight container for up to 3 days at room temperature.\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"vegetarian\": true,\n" +
            "            \"vegan\": true,\n" +
            "            \"glutenFree\": true,\n" +
            "            \"dairyFree\": true,\n" +
            "            \"veryHealthy\": false,\n" +
            "            \"extendedIngredients\": [\n" +
            "                {\n" +
            "                    \"id\": 12061,\n" +
            "                    \"aisle\": \"Nuts\",\n" +
            "                    \"name\": \"almonds\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 10011135,\n" +
            "                    \"aisle\": \"Produce\",\n" +
            "                    \"name\": \"cauliflower florets\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 10111297,\n" +
            "                    \"aisle\": \"Produce\",\n" +
            "                    \"name\": \"fresh herbs\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 11215,\n" +
            "                    \"aisle\": \"Produce\",\n" +
            "                    \"name\": \"garlic\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 9156,\n" +
            "                    \"aisle\": \"Produce\",\n" +
            "                    \"name\": \"lemon zest\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 4053,\n" +
            "                    \"aisle\": \"Oil, Vinegar, Salad Dressing\",\n" +
            "                    \"name\": \"olive oil\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 2047,\n" +
            "                    \"aisle\": \"Spices and Seasonings\",\n" +
            "                    \"name\": \"salt\"\n" +
            "                }\n" +
            "            ],\n" +
            "            \"id\": 857326,\n" +
            "            \"title\": \"Cauliflower Rice Pilaf\",\n" +
            "            \"readyInMinutes\": 20,\n" +
            "            \"servings\": 6,\n" +
            "            \"image\": \"https://spoonacular.com/recipeImages/857326-556x370.jpg\",\n" +
            "            \"instructions\": \"Pulse cauliflower florets 2 cups at a time in a food processor until chopped into rice-size pieces.                        Heat oil in a large skillet over medium-high heat. Add garlic and cook until fragrant, about 30 seconds. Add the cauliflower rice, sprinkle with salt and cook, stirring, until softened, 3 to 5 minutes. Remove from heat. Stir in almonds, herbs and lemon zest.\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"vegetarian\": false,\n" +
            "            \"vegan\": false,\n" +
            "            \"glutenFree\": false,\n" +
            "            \"dairyFree\": false,\n" +
            "            \"veryHealthy\": false,\n" +
            "            \"extendedIngredients\": [\n" +
            "                {\n" +
            "                    \"id\": 19184,\n" +
            "                    \"aisle\": \"Baking\",\n" +
            "                    \"name\": \"instant chocolate pudding mix\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 1077,\n" +
            "                    \"aisle\": \"Milk, Eggs, Other Dairy\",\n" +
            "                    \"name\": \"milk\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 10018166,\n" +
            "                    \"aisle\": \"Sweet Snacks\",\n" +
            "                    \"name\": \"oreo cookies\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 18210,\n" +
            "                    \"aisle\": \"Sweet Snacks\",\n" +
            "                    \"name\": \"vanilla cream filled sandwich style cookies\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 42135,\n" +
            "                    \"aisle\": \"Milk, Eggs, Other Dairy\",\n" +
            "                    \"name\": \"whipped topping\"\n" +
            "                }\n" +
            "            ],\n" +
            "            \"id\": 545190,\n" +
            "            \"title\": \"Ghosts in the Graveyard\",\n" +
            "            \"readyInMinutes\": 75,\n" +
            "            \"servings\": 18,\n" +
            "            \"image\": \"https://spoonacular.com/recipeImages/545190-556x370.jpg\",\n" +
            "            \"instructions\": \"Beat pudding mixes and milk in large bowl with whisk 2 min.  Let stand 5 min.  Stir in 3 cups COOL WHIP and half the cookie crumbs.  Spread into 13x9-inch dish; sprinkle with remaining crumbs.                                            Refrigerate 1 hour.  Meanwhile, decorate sandwich cookies with decorating gel to resemble tombstones.                                            Insert decorated cookies into top of dessert just before serving.   Add candies.  Drop large spoonfuls of remaining COOL WHIP onto dessert to resemble ghosts.\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"vegetarian\": false,\n" +
            "            \"vegan\": false,\n" +
            "            \"glutenFree\": false,\n" +
            "            \"dairyFree\": false,\n" +
            "            \"veryHealthy\": false,\n" +
            "            \"extendedIngredients\": [\n" +
            "                {\n" +
            "                    \"id\": 2031,\n" +
            "                    \"aisle\": \"Spices and Seasonings\",\n" +
            "                    \"name\": \"cayenne pepper\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 1062047,\n" +
            "                    \"aisle\": \"Spices and Seasonings\",\n" +
            "                    \"name\": \"garlic salt\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 4053,\n" +
            "                    \"aisle\": \"Oil, Vinegar, Salad Dressing\",\n" +
            "                    \"name\": \"olive oil\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 2026,\n" +
            "                    \"aisle\": \"Spices and Seasonings\",\n" +
            "                    \"name\": \"onion powder\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 1033,\n" +
            "                    \"aisle\": \"Cheese\",\n" +
            "                    \"name\": \"parmesan cheese\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 1002030,\n" +
            "                    \"aisle\": \"Spices and Seasonings\",\n" +
            "                    \"name\": \"pepper\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 19047,\n" +
            "                    \"aisle\": \"Savory Snacks\",\n" +
            "                    \"name\": \"pretzels\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 8064,\n" +
            "                    \"aisle\": \"Cereal\",\n" +
            "                    \"name\": \"rice chex\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 6971,\n" +
            "                    \"aisle\": \"Condiments\",\n" +
            "                    \"name\": \"worcestershire sauce\"\n" +
            "                }\n" +
            "            ],\n" +
            "            \"id\": 695234,\n" +
            "            \"title\": \"Jojo's Party Mix\",\n" +
            "            \"readyInMinutes\": 45,\n" +
            "            \"servings\": 6,\n" +
            "            \"image\": \"https://spoonacular.com/recipeImages/695234-556x370.jpg\",\n" +
            "            \"instructions\": \"Preheat oven to 350F.Mix cereals, pretzels, Parmesan, garlic salt, onion powder, pepper and cayenne in a large bowl. Toss with oil and Worcestershire. Spread on a lightly oiled baking sheet.Bake, stirring often, until toasted, 40 minutes.\"\n" +
            "        }\n" +
            "    ]\n" +
            "}";
}