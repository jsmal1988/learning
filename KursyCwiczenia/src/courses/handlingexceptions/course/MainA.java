package courses.handlingexceptions.course;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MainA {
	private static final String PATH_TO_FILE = "C:/Users/jsmal/eclipse-workspace/Nauka/KursyCwiczenia/src/courses/handlingexceptions/democalculations.txt";

	public static void main(String[] args) {

		try (BufferedReader reader = new BufferedReader(new FileReader(PATH_TO_FILE))) {
			processFile(reader);
		} catch (FileNotFoundException e) {
			System.out.println("File not found - " + e.getMessage());
		} catch (IOException e) {
			System.out.println("Error reading file- " + e.getMessage());
		}
		/*
		 * catch (InvalidStatementException ex){
		 * System.out.println("Error invalid statement - " + ex.getMessage()); if
		 * (ex.getCause() != null) { System.out.println(" caused by:"+ex.getCause()); }
		 * }
		 */
		catch (Exception e) {
			System.out.println("Error occured - " + e.getMessage());
		}
	}

	private static void processFile(BufferedReader reader) throws IOException {
		String inputLine = null;
		while ((inputLine = reader.readLine()) != null)
			try {
				performOperation(inputLine);	
			}catch (InvalidStatementException ex){
				System.out.println("Error invalid statement - " + ex.getMessage());
				if (ex.getCause() != null) {
					System.out.println(" caused by:"+ex.getCause());
				}
			}
			
	}

	private static void performOperation(String inputLine) throws InvalidStatementException {
		try {
			String[] parts = inputLine.split(" ");
			if (parts.length != 3) {
				throw new InvalidStatementException("Parts are not 3 values");
			}
			MathOperation operation = MathOperation.valueOf(parts[0].toUpperCase());
			int leftVal = valueFromWord(parts[1]);
			int rightVal = valueFromWord(parts[2]);

			int result = execute(operation, leftVal, rightVal);

			System.out.println(inputLine + " = " + result);
		} catch (InvalidStatementException ex) {
			throw ex;
		} catch (Exception ex) {
			throw new InvalidStatementException("Error processing statement", ex);
		}

	}

	static int execute(MathOperation operation, int leftVal, int rightVal) {
		int result = 0;
		switch (operation) {
		case ADD:
			result = leftVal + rightVal;
			break;
		case SUBTRACT:
			result = leftVal - rightVal;
			break;
		case MULTIPLY:
			result = leftVal * rightVal;
			break;
		case DIVIDE:
			if (rightVal == 0) {
				throw new IllegalArgumentException("Zero not permitted with divide operatioan");
			}
			result = leftVal / rightVal;
			break;
		}
		return result;
	}

	static int valueFromWord(String word) {
		String[] numberWords = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
		int value = -1;
		for (int index = 0; index < numberWords.length; index++) {
			if (word.equals(numberWords[index])) {
				value = index;
				break;
			}
		}
		if (value == -1)
			value = Integer.parseInt(word);

		return value;
	}

}
