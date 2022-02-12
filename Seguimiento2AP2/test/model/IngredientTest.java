package model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import exception.NegativeNumberException;

class IngredientTest {
	
	//Estado
	
	private Ingredient ingredient;
	
	//Escenarios
	public void setupStage1() {
		
		ingredient = new Ingredient("Tomate",245);

	}
	
	//caso de prueba
	@Test
	void firstTest() throws NegativeNumberException {
		
		//poner el escenario
		setupStage1();
		
		ingredient.addWeight(54);
		
		
		//asserts
		
		assertEquals(299, ingredient.getWeight());
	}
	@Test
	void secondTest() {
		setupStage1();
		boolean exception = false;
		try {
			ingredient.addWeight(-100);
		}catch (NegativeNumberException e) {
			e.printStackTrace();
			exception=true;
		}
		assertTrue(exception);
		
	}
	@Test
	void thirdTest() {
		setupStage1();
		try {
			ingredient.removeWeight(45);
		} catch (NegativeNumberException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		assertEquals(200, ingredient.getWeight());
	}
	@Test
	void fourthTest() {
		setupStage1();
		
		boolean exception = false;
		try {
			
			ingredient.removeWeight(-100);
			
		}catch (NegativeNumberException e) {
			e.printStackTrace();
			exception = true;
		}
		
		assertFalse(exception);
	}
	
	

}
