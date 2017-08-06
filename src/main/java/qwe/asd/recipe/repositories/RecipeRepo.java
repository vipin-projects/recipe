package qwe.asd.recipe.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import qwe.asd.recipe.domains.Recipe;

@Repository
public interface RecipeRepo extends CrudRepository<Recipe,Long> {
}
