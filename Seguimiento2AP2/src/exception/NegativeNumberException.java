package exception;

//RuntimeException para no usar try catch
public class NegativeNumberException extends Exception {
	
	public NegativeNumberException(String ingredient, double weight) {
		super("Esta intentando usar un numero negativo " +weight+" para el ingrediente " + ingredient);
		
		
		
	}

}
