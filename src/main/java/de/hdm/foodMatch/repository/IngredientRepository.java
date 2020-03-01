package de.hdm.foodMatch.repository;

import de.hdm.foodMatch.data.model.Ingredient;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IngredientRepository extends CrudRepository<Ingredient,Long> {
}
