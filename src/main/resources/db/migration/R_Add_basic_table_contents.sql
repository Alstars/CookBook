Create table if not exists ingredient(

        ingredient_id integer NOT NULL,
        ingredient_name text NOT NULL,
        ingredient_image bytea



);

Create table if not exists recipe_tag(
                                         recipe_tag_id integer NOT NULL,
                                         recipe_tag_name text NOT NULL,
                                         recipe_tag_group text NOT NULL

);

Create table if not exists recipe(
                                     recipe_id integer NOT NULL,
                                     recipe_name text NOT NULL,
                                     recipe_description text,
                                     recipe_image bytea
);

Create table if not exists recipe_step(
                                          recipe_step_id integer NOT NULL,
                                          recipe_step_number integer NOT NULL,
                                          recipe_step_instructions text NOT NULL,
                                          recipe_step_image bytea,
                                          recipe_id integer
);

Create table if not exists recipes_recipe_tags(
                                          recipe_tag_id integer,
                                          recipe_id integer
);

Create table if not exists recipe_steps_ingred/qients(
                                                  recipe_step_id integer NOT NULL,
                                                  recipe_step_number integer NOT NULL,
                                                  recipe_step_instructions text NOT NULL,
                                                  recipe_step_image bytea,
                                                  recipe_step integer,
                                                  ingredient integer
);