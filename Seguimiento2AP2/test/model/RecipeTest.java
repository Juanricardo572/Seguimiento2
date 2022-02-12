package model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import exception.NegativeNumberException;

class RecipeTest {
	
	//estado
	
	private Recipe recipe;
	
	//escenarios
	
	public void setupStage1() {
		recipe = new Recipe();
	}

	public void setupStage2() throws NegativeNumberException{
		
		recipe = new Recipe();
		recipe.addIngredient("cebolla", 315);
		recipe.addIngredient("ajo", 58);
		recipe.addIngredient( "arroz", 520);
		
	}
	
	//casos de prueba
	@Test
	void firstTest() throws NegativeNumberException {
		setupStage1();
		recipe.addIngredient("sal", 12);
		
		//asserts
		assertEquals(1, recipe.getIngredients().size());
		assertEquals(recipe.getIngredients().get(0).getName(),"sal");
		assertEquals(recipe.getIngredients().get(0).getWeight(), 12);
	}
	
	@Test
	void secondTest() throws NegativeNumberException {
		setupStage2();
		recipe.addIngredient("pimienta", 6);
		int ingredientsNum = recipe.getIngredients().size();
		
		//asserts
		assertEquals(4, recipe.getIngredients().size());
		assertEquals(recipe.getIngredients().get(ingredientsNum-1).getName(),"pimienta");
		assertEquals(recipe.getIngredients().get(ingredientsNum-1).getWeight(),6);
		
		}
	
	@Test
	void thirdTest() throws NegativeNumberException {
		setupStage2();
		recipe.addIngredient("ajo",21);
		
		//asserts
		assertEquals(recipe.getIngredients().size(),3);
		assertEquals(recipe.getIngredients().get(1).getWeight(),79);
		
	}
	
	@Test
	void fourthTest() throws NegativeNumberException {
		setupStage2();
		recipe.removeIngredient("Ajo");
		
		//asserts
		assertEquals(recipe.getIngredients().size(),2);
		assertEquals(recipe.getIngredients().get(0).getName(), "cebolla");
		assertEquals(recipe.getIngredients().get(1).getName(),"arroz");
	}

}
