package com.revature.eval.java.core;

import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.time.LocalDateTime;
import java.time.LocalDate;

public class EvaluationService {

	/**
	 * 1. Without using the StringBuilder or StringBuffer class, write a method that
	 * reverses a String. Example: reverse("example"); -> "elpmaxe"
	 * 
	 * @param string
	 * @return
	 */
	public String reverse(String string) {
		char[] reversed = new char[string.length()];
		
		for (int i = reversed.length - 1, j=0; i >= 0; i--, j++) {
			reversed[j] = string.charAt(i);
		}
		return new String(reversed);
	}

	/**
	 * 2. Convert a phrase to its acronym. Techies love their TLA (Three Letter
	 * Acronyms)! Help generate some jargon by writing a program that converts a
	 * long name like Portable Network Graphics to its acronym (PNG).
	 * 
	 * @param phrase
	 * @return
	 */
	public String acronym(String phrase) {
		// TODO Write an implementation for this method declaration
		String clean = phrase.replaceAll("\\W", " ");
		//System.out.println(clean);
		String[] arr = clean.split("\\s");
		String acronym = "";
		char firstLetter;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].isEmpty()) {
			
			}else {
				firstLetter = arr[i].charAt(0);
				acronym = acronym + String.valueOf(firstLetter);
				acronym = acronym.toUpperCase();
			}
		}
		return acronym;
	}

	/**
	 * 3. Determine if a triangle is equilateral, isosceles, or scalene. An
	 * equilateral triangle has all three sides the same length. An isosceles
	 * triangle has at least two sides the same length. (It is sometimes specified
	 * as having exactly two sides the same length, but for the purposes of this
	 * exercise we'll say at least two.) A scalene triangle has all sides of
	 * different lengths.
	 *
	 */
	static class Triangle {
		private double sideOne;
		private double sideTwo;
		private double sideThree;

		public Triangle() {
			super();
		}

		public Triangle(double sideOne, double sideTwo, double sideThree) {
			this();
			this.sideOne = sideOne;
			this.sideTwo = sideTwo;
			this.sideThree = sideThree;
		}

		public double getSideOne() {
			return sideOne;
		}

		public void setSideOne(double sideOne) {
			this.sideOne = sideOne;
		}

		public double getSideTwo() {
			return sideTwo;
		}

		public void setSideTwo(double sideTwo) {
			this.sideTwo = sideTwo;
		}

		public double getSideThree() {
			return sideThree;
		}

		public void setSideThree(double sideThree) {
			this.sideThree = sideThree;
		}

		public boolean isEquilateral() {
			double sideOne = getSideOne();
			double sideTwo = getSideTwo();
			double sideThree = getSideThree();
			if(sideOne==sideTwo && sideOne == sideThree) {
				return true;
			}else {
			return false;
			}
		}

		public boolean isIsosceles() {
			double sideOne = getSideOne();
			double sideTwo = getSideTwo();
			double sideThree = getSideThree();
			if(sideOne==sideTwo & sideOne != sideThree) {
				return true;
			}else if  (sideOne==sideThree && sideOne != sideTwo){
			return true;
			}else if (sideTwo==sideThree && sideTwo != sideOne){
				return true;
			}else {
			return false;	
			}
		}

		public boolean isScalene() {
			double sideOne = getSideOne();
			double sideTwo = getSideTwo();
			double sideThree = getSideThree();
			if(sideOne != sideTwo && sideOne != sideThree && sideTwo != sideThree) {
				return true;
			}else {
			return false;
			}
		}
	}

	/**
	 * 4. Given a word, compute the scrabble score for that word.
	 * 
	 * --Letter Values-- Letter Value A, E, I, O, U, L, N, R, S, T = 1; D, G = 2; B,
	 * C, M, P = 3; F, H, V, W, Y = 4; K = 5; J, X = 8; Q, Z = 10; Examples
	 * "cabbage" should be scored as worth 14 points:
	 * 
	 * 3 points for C, 1 point for A, twice 3 points for B, twice 2 points for G, 1
	 * point for E And to total:
	 * 
	 * 3 + 2*1 + 2*3 + 2 + 1 = 3 + 2 + 6 + 3 = 5 + 9 = 14
	 * 
	 * @param string
	 * @return
	 */
	public int getScrabbleScore(String string) {
		String temp;
		int result =0;
		for(int i = 0; i< string.length();i++) {
			temp = String.valueOf(string.charAt(i));
			temp = temp.toUpperCase();
			switch(temp){
			case ("A"):
				result = result + 1;
				break;
			case "B":
				result = result + 3;
				break;
			case "C":
				result = result + 3;
				break;
			case "D":
				result = result + 2;
				break;
			case "E":
				result = result + 1;
				break;
			case "F":
				result = result + 4;
				break;
			case "G":
				result = result + 2;
				break;
			case "H":
				result = result + 4;
				break;
			case "I":
				result = result + 1;
				break;
			case "J":
				result = result + 8;
				break;
			case "K":
				result = result + 5;
				break;
			case "L":
				result = result + 1;
				break;
			case "M":
				result = result + 3;
				break;
			case "N":
				result = result + 1;
				break;
			case "O":
				result = result + 1;
				break;
			case "P":
				result = result + 3;
				break;
			case "Q":
				result = result + 10;
				break;
			case "R":
				result = result + 1;
				break;
			case "S":
				result = result + 1;
				break;
			case "T":
				result = result + 1;
				break;
			case "U":
				result = result + 1;
				break;
			case "V":
				result = result + 4;
				break;
			case "W":
				result = result + 4;
				break;
			case "X":
				result = result + 8;
				break;
			case "Y":
				result = result + 4;
				break;
			case "Z":
				result = result + 10;
				break;
			default: 
				result = result + 0;
				break;
		}
		}
		return result;
	}

	/**
	 * 5. Clean up user-entered phone numbers so that they can be sent SMS messages.
	 * 
	 * The North American Numbering Plan (NANP) is a telephone numbering system used
	 * by many countries in North America like the United States, Canada or Bermuda.
	 * All NANP-countries share the same international country code: 1.
	 * 
	 * NANP numbers are ten-digit numbers consisting of a three-digit Numbering Plan
	 * Area code, commonly known as area code, followed by a seven-digit local
	 * number. The first three digits of the local number represent the exchange
	 * code, followed by the unique four-digit number which is the subscriber
	 * number.
	 * 
	 * The format is usually represented as
	 * 
	 * 1 (NXX)-NXX-XXXX where N is any digit from 2 through 9 and X is any digit
	 * from 0 through 9.
	 * 
	 * Your task is to clean up differently formatted telephone numbers by removing
	 * punctuation and the country code (1) if present.
	 * 
	 * For example, the inputs
	 * 
	 * +1 (613)-995-0253 613-995-0253 1 613 995 0253 613.995.0253 should all produce
	 * the output
	 * 
	 * 6139950253
	 * 
	 * Note: As this exercise only deals with telephone numbers used in
	 * NANP-countries, only 1 is considered a valid country code.
	 */
	public String cleanPhoneNumber(String string) {
		// TODO Write an implementation for this method declaration
		String clean = string.replaceAll("\\W", "");
		clean = clean.replaceAll("[A-z]", "");
		
		if ( clean.length() > 10 || clean.length() < 9) {
			throw new IllegalArgumentException();
		}else {
			return clean;
		}
		
	}

	/**
	 * 6. Given a phrase, count the occurrences of each word in that phrase.
	 * 
	 * For example for the input "olly olly in come free" olly: 2 in: 1 come: 1
	 * free: 1
	 * 
	 * @param string
	 * @return
	 */
	public Map<String, Integer> wordCount(String string) {
		// TODO Write an implementation for this method declaration
		Map<String, Integer> result = new HashMap<String, Integer>();
		string = string.replaceAll(",\\s", " ");
		string = string.replaceAll(",", " ");
		String[] arr = string.split("\\s");
		int ite = arr.length;
		String current;
		String compare;
		int counter = 1;
		if (1 == arr.length ) { 
			result.put(arr[0], 1);
		}else {
			for (int i = 0; i < ite; i++) { 
				for (int j = 0; j < ite; j++){
					if (i != j) {
						current = arr[i].toString();
						compare = arr[j].toString();
						if (current.equals(compare)) {
							counter++;
						}
					}
					result.put(arr[i], counter); 
					} 
				counter = 1;
			}
			result.forEach((key, value) -> System.out.println(key + ":" + value));
		}
		return result;
	}

	/**
	 * 7. Implement a binary search algorithm.
	 * 
	 * Searching a sorted collection is a common task. A dictionary is a sorted list
	 * of word definitions. Given a word, one can find its definition. A telephone
	 * book is a sorted list of people's names, addresses, and telephone numbers.
	 * Knowing someone's name allows one to quickly find their telephone number and
	 * address.
	 * 
	 * If the list to be searched contains more than a few items (a dozen, say) a
	 * binary search will require far fewer comparisons than a linear search, but it
	 * imposes the requirement that the list be sorted.
	 * 
	 * In computer science, a binary search or half-interval search algorithm finds
	 * the position of a specified input value (the search "key") within an array
	 * sorted by key value.
	 * 
	 * In each step, the algorithm compares the search key value with the key value
	 * of the middle element of the array.
	 * 
	 * If the keys match, then a matching element has been found and its index, or
	 * position, is returned.
	 * 
	 * Otherwise, if the search key is less than the middle element's key, then the
	 * algorithm repeats its action on the sub-array to the left of the middle
	 * element or, if the search key is greater, on the sub-array to the right.
	 * 
	 * If the remaining array to be searched is empty, then the key cannot be found
	 * in the array and a special "not found" indication is returned.
	 * 
	 * A binary search halves the number of items to check with each iteration, so
	 * locating an item (or determining its absence) takes logarithmic time. A
	 * binary search is a dichotomic divide and conquer search algorithm.
	 * 
	 */
	static class BinarySearch<T> {
		private List<T> sortedList;

		public int indexOf(T t) {
			  return Arrays.binarySearch(sortedList.toArray(), t);
		}

		public BinarySearch(List<T> sortedList) {
			super();
			this.sortedList = sortedList;
		}

		public List<T> getSortedList() {
			return sortedList;
		}

		public void setSortedList(List<T> sortedList) {
			this.sortedList = sortedList;
		}

	}

	/**
	 * 8. Implement a program that translates from English to Pig Latin.
	 * 
	 * Pig Latin is a made-up children's language that's intended to be confusing.
	 * It obeys a few simple rules (below), but when it's spoken quickly it's really
	 * difficult for non-children (and non-native speakers) to understand.
	 * 
	 * Rule 1: If a word begins with a vowel sound, add an "ay" sound to the end of
	 * the word. Rule 2: If a word begins with a consonant sound, move it to the end
	 * of the word, and then add an "ay" sound to the end of the word. There are a
	 * few more rules for edge cases, and there are regional variants too.
	 * 
	 * See http://en.wikipedia.org/wiki/Pig_latin for more details.
	 * 
	 * @param string
	 * @return
	 */
	public String toPigLatin(String string) {
		// TODO Write an implementation for this method declaration
		String pig="";
		string = string.toLowerCase();
		String[] arr = string.split("\\s");
		String[] pigArray = new String[arr.length];
		char firstLetter;
		char secondLetter;
		String compare = "";
		String compareSecond = "";
		String compareThree = "";
		for(int i = 0; i < arr.length;i++) {
			firstLetter = arr[i].charAt(0);
			secondLetter = string.charAt(1);
			compare = String.valueOf(firstLetter);
			compareSecond = String.valueOf(secondLetter);

			if (arr[i].length() > 4) {
				compareThree = arr[i].substring(0, 3);
			}
			
			if (compareThree.equals("sch") || compareThree.equals("scr") || compareThree.equals("shr") ||compareThree.equals("sph")||
					compareThree.equals("spl") || compareThree.equals("spr") || compareThree.equals("squ") || compareThree.equals("str")||
					compareThree.equals("thr") ) {
					pig = arr[i].substring(3) + compareThree + "ay";
				
			}else if (compare.equals("b") || compare.equals("c") || compare.equals("d") || compare.equals("f") || compare.equals("g") ||
					compare.equals("h") || compare.equals("j") ||compare.equals("k") || compare.equals("l") || compare.equals("m") ||
					compare.equals("n") || compare.equals("p") || compare.equals("q") || compare.equals("r") || compare.equals("s") ||
					compare.equals("t") || compare.equals("v") || compare.equals("x") || compare.equals("z") || compare.equals("w") ||
					compare.equals("y")) {
						if(compareSecond.equals("b") || compareSecond.equals("c") || compareSecond.equals("d") || compareSecond.equals("f") || compareSecond.equals("g") ||
								compareSecond.equals("h") || compareSecond.equals("j") ||compareSecond.equals("k") || compareSecond.equals("l") || compareSecond.equals("m") ||
								compareSecond.equals("n") || compareSecond.equals("p") || compareSecond.equals("q") || compareSecond.equals("r") || compareSecond.equals("s") ||
								compareSecond.equals("t") || compareSecond.equals("v") || compareSecond.equals("x") || compareSecond.equals("z") || compareSecond.equals("w") ||
								compareSecond.equals("y")) {
							pig = arr[i].substring(2) + compare + compareSecond + "ay";
						}else if(compare.equals("q") && compareSecond.equals("u")){
							pig = arr[i].substring(2) + compare + compareSecond + "ay";
						}else {
							pig = arr[i].substring(1) + compare + "ay";
						}
			}else if (compare.equals("a") || compare.equals("e") || compare.equals("i") || compare.equals("o") || compare.equals("u")) {
				pig = arr[i] + "ay";
			}
			if (arr.length > 1) {
				pigArray[i]=pig;
			}
		}
		if (arr.length > 1) {
			String result = "";
			for(int j = 0; j<pigArray.length;j++) {
				if(result.equals("")){
					result = pigArray[j];
				}else {
				result = result + " " + pigArray[j];
				}
			}
			pig = result;
		}
		System.out.println(pig);
			return pig;
	}

	/**
	 * 9. An Armstrong number is a number that is the sum of its own digits each
	 * raised to the power of the number of digits.
	 * 
	 * For example:
	 * 
	 * 9 is an Armstrong number, because 9 = 9^1 = 9 10 is not an Armstrong number,
	 * because 10 != 1^2 + 0^2 = 2 153 is an Armstrong number, because: 153 = 1^3 +
	 * 5^3 + 3^3 = 1 + 125 + 27 = 153 154 is not an Armstrong number, because: 154
	 * != 1^3 + 5^3 + 4^3 = 1 + 125 + 64 = 190 Write some code to determine whether
	 * a number is an Armstrong number.
	 * 
	 * @param input
	 * @return
	 */
	public boolean isArmstrongNumber(int input) {
		int length = String.valueOf(input).length();
		int[] inputArray = new int[length];
		double result = 0.0;
		String temp = Integer.toString(input);
		for(int j = 0; j<length;j++) {
			inputArray[j] = temp.charAt(j) - '0';
		}
		//System.out.println(input + "=" + Arrays.toString(inputArray));
		if (length == 1) {
			result = Math.pow(input, length);
			//System.out.println(input + "=" + result);
			if (result == input) {
				return true;
			}else {
				return false;
			}
		}else {
			for(int i = 0; i<length;i++) {
				result = result + (Math.pow(inputArray[i], length));
			}
			//System.out.println(input + "=" + result);
			if (result == input) {
				return true;
			}else {
				return false;
			}
		}
	}
	/**
	 * 10. Compute the prime factors of a given natural number.
	 * 
	 * A prime number is only evenly divisible by itself and 1.
	 * 
	 * Note that 1 is not a prime number.
	 * 
	 * @param l
	 * @return
	 */
	public List<Long> calculatePrimeFactorsOf(long l) {
		 long number = l;
	        List <Long> primeFactors = new ArrayList <>();
	        for (int i=2; i<= number/i; i++) {
	            while (number % i == 0) {
	                primeFactors.add((long) i);
	                number = number/i;
	                }
	            }
	        if (number > 1) {
	            primeFactors.add(number);
	        }
	        return primeFactors;
	}

	/**
	 * 11. Create an implementation of the rotational cipher, also sometimes called
	 * the Caesar cipher.
	 * 
	 * The Caesar cipher is a simple shift cipher that relies on transposing all the
	 * letters in the alphabet using an integer key between 0 and 26. Using a key of
	 * 0 or 26 will always yield the same output due to modular arithmetic. The
	 * letter is shifted for as many values as the value of the key.
	 * 
	 * The general notation for rotational ciphers is ROT + <key>. The most commonly
	 * used rotational cipher is ROT13.
	 * 
	 * A ROT13 on the Latin alphabet would be as follows:
	 * 
	 * Plain: abcdefghijklmnopqrstuvwxyz Cipher: nopqrstuvwxyzabcdefghijklm It is
	 * stronger than the Atbash cipher because it has 27 possible keys, and 25
	 * usable keys.
	 * 
	 * Ciphertext is written out in the same formatting as the input including
	 * spaces and punctuation.
	 * 
	 * Examples: ROT5 omg gives trl ROT0 c gives c ROT26 Cool gives Cool ROT13 The
	 * quick brown fox jumps over the lazy dog. gives Gur dhvpx oebja sbk whzcf bire
	 * gur ynml qbt. ROT13 Gur dhvpx oebja sbk whzcf bire gur ynml qbt. gives The
	 * quick brown fox jumps over the lazy dog.
	 */
	static class RotationalCipher {
		private int key;

		public RotationalCipher(int key) {
			super();
			this.key = key;
		}

		public String rotate(String string) {
			char[] cipher = new char[string.length()];
			String result="";
			 for (int i=0; i<string.length(); i++) 
		        { 
				 if (Character.isLetter(string.charAt(i))) {
					 	if (Character.isUpperCase(string.charAt(i))) 
					 	{ 
					 		char ch = (char)(((int)string.charAt(i) + key - 65) % 26 + 65); 
					 		cipher[i] = ch; 
					 	} 
					 	else
					 	{ 
					 		char ch = (char)(((int)string.charAt(i) + key - 97) % 26 + 97); 
					 		cipher[i] = ch;  
					 	} 
			        }else {
			        	char ch = (char)(((int)string.charAt(i)));
			        	cipher[i] = ch;  
			        }
			
		        }
			 for(int j = 0; j<cipher.length;j++) {
				 result = result + cipher[j];
				 }
			 System.out.println(result);
			 return result;
		}
	}

	/**
	 * 12. Given a number n, determine what the nth prime is.
	 * 
	 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see
	 * that the 6th prime is 13.
	 * 
	 * If your language provides methods in the standard library to deal with prime
	 * numbers, pretend they don't exist and implement them yourself.
	 * 
	 * @param i
	 * @return
	 */
	public int calculateNthPrime(int i) {
        int number = 1;
        int count = 0;
        int z;
            if (i <= 0) {
                throw new IllegalArgumentException();
            } else {
                    while (count < i) {
                        number = number + 1;
                            for (z = 2; z <= number; z++) {
                                if (number % z == 0) {
                                    break;
                                }
                            }
                            if (z == number) {
                                count = count + 1;
                            }
                    }
                    return number;
            }
        }

	/**
	 * 13 & 14. Create an implementation of the atbash cipher, an ancient encryption
	 * system created in the Middle East.
	 * 
	 * The Atbash cipher is a simple substitution cipher that relies on transposing
	 * all the letters in the alphabet such that the resulting alphabet is
	 * backwards. The first letter is replaced with the last letter, the second with
	 * the second-last, and so on.
	 * 
	 * An Atbash cipher for the Latin alphabet would be as follows:
	 * 
	 * Plain: abcdefghijklmnopqrstuvwxyz Cipher: zyxwvutsrqponmlkjihgfedcba It is a
	 * very weak cipher because it only has one possible key, and it is a simple
	 * monoalphabetic substitution cipher. However, this may not have been an issue
	 * in the cipher's time.
	 * 
	 * Ciphertext is written out in groups of fixed length, the traditional group
	 * size being 5 letters, and punctuation is excluded. This is to make it harder
	 * to guess things based on word boundaries.
	 * 
	 * Examples Encoding test gives gvhg Decoding gvhg gives test Decoding gsvjf
	 * rxpyi ldmul cqfnk hlevi gsvoz abwlt gives thequickbrownfoxjumpsoverthelazydog
	 *
	 */
	static class AtbashCipher {
		/**
		 * Question 13
		 * 
		 * @param string
		 * @return
		 */
		public static String encode(String string) {
			Dictionary<String, String> cipher = new Hashtable<String, String> ();
			char[] temp = new char[string.length()];
			cipher.put("a", "z"); 
			cipher.put("b", "y"); 
			cipher.put("c", "x"); 
			cipher.put("d", "w"); 
			cipher.put("e", "v"); 
			cipher.put("f", "u"); 
			cipher.put("g", "t"); 
			cipher.put("h", "s"); 
			cipher.put("i", "r"); 
			cipher.put("j", "q"); 
			cipher.put("k", "p"); 
			cipher.put("l", "o"); 
			cipher.put("m", "n");
			cipher.put("n", "m"); 
			cipher.put("o", "l"); 
			cipher.put("p", "k"); 
			cipher.put("q", "j"); 
			cipher.put("r", "i"); 
			cipher.put("s", "h"); 
			cipher.put("t", "g"); 
			cipher.put("u", "f"); 
			cipher.put("v", "e"); 
			cipher.put("w", "d"); 
			cipher.put("x", "c"); 
			cipher.put("y", "b"); 
			cipher.put("z", "a"); 
			String result="";
			string = string.toLowerCase();
			string = string.replaceAll("\\W", "");
			 for (int i=0; i<string.length(); i++) 
		        { 
				 if (Character.isLetter(string.charAt(i))) {
							String s = String.valueOf(string.charAt(i));
							s = cipher.get(s);
					 		char ch = s.charAt(0);
					 		temp[i] = ch; 	
			        }else {
			        	char ch = (char)(((int)string.charAt(i)));
			        	temp[i] = ch;  
			        }
			
		        }
			 for(int j = 0; j<temp.length;j++) {
				 result = result + temp[j];
				 }
			 String[] splited = result.split("(?<=\\G.{5})");
			 if(result.length() > 5) {
				 String resultTwo = splited[0];
			 for(int j = 1; j<splited.length;j++) {
				 resultTwo = resultTwo + " " + splited[j];
				 }
			 result = resultTwo;
			 System.out.println(result);
			 return result.trim();
			}else {
				System.out.println(result);
				return result.trim();
				}
			}
		
		/**
		 * Question 14
		 * 
		 * @param string
		 * @return
		 */
		public static String decode(String string) {
			Dictionary<String, String> cipher = new Hashtable<String, String> ();
			char[] temp = new char[string.length()];
			cipher.put("z", "a"); 
			cipher.put("y", "b"); 
			cipher.put("x", "c"); 
			cipher.put("w", "d"); 
			cipher.put("v", "e"); 
			cipher.put("u", "f"); 
			cipher.put("t", "g"); 
			cipher.put("s", "h"); 
			cipher.put("r", "i"); 
			cipher.put("q", "j"); 
			cipher.put("p", "k"); 
			cipher.put("o", "l"); 
			cipher.put("n", "m");
			cipher.put("m", "n"); 
			cipher.put("l", "o"); 
			cipher.put("k", "p"); 
			cipher.put("j", "q"); 
			cipher.put("i", "r"); 
			cipher.put("h", "s"); 
			cipher.put("g", "t"); 
			cipher.put("f", "u"); 
			cipher.put("e", "v"); 
			cipher.put("d", "w"); 
			cipher.put("c", "x"); 
			cipher.put("b", "y"); 
			cipher.put("a", "z"); 
			String result="";
			string = string.toLowerCase();
			string = string.replaceAll("\\W", "");
			 for (int i=0; i<string.length(); i++) 
		        { 
				 if (Character.isLetter(string.charAt(i))) {
							String s = String.valueOf(string.charAt(i));
							s = cipher.get(s);
					 		char ch = s.charAt(0);
					 		temp[i] = ch; 	
			        }else {
			        	char ch = (char)(((int)string.charAt(i)));
			        	temp[i] = ch;  
			        }
			
		        }
			 for(int j = 0; j<temp.length;j++) {
				 result = result + temp[j];
				 }
			 System.out.println(result);
			 return result.trim();
			}
	}
	/**
	 * 15. The ISBN-10 verification process is used to validate book identification
	 * numbers. These normally contain dashes and look like: 3-598-21508-8
	 * 
	 * ISBN The ISBN-10 format is 9 digits (0 to 9) plus one check character (either
	 * a digit or an X only). In the case the check character is an X, this
	 * represents the value '10'. These may be communicated with or without hyphens,
	 * and can be checked for their validity by the following formula:
	 * 
	 * (x1 * 10 + x2 * 9 + x3 * 8 + x4 * 7 + x5 * 6 + x6 * 5 + x7 * 4 + x8 * 3 + x9
	 * * 2 + x10 * 1) mod 11 == 0 If the result is 0, then it is a valid ISBN-10,
	 * otherwise it is invalid.
	 * 
	 * Example Let's take the ISBN-10 3-598-21508-8. We plug it in to the formula,
	 * and get:
	 * 
	 * (3 * 10 + 5 * 9 + 9 * 8 + 8 * 7 + 2 * 6 + 1 * 5 + 5 * 4 + 0 * 3 + 8 * 2 + 8 *
	 * 1) mod 11 == 0 Since the result is 0, this proves that our ISBN is valid.
	 * 
	 * @param string
	 * @return
	 */
	public boolean isValidIsbn(String string) {
	
		string = string.replaceAll("\\W", "");
		int[] formula = new int[string.length()];
		int result =0;
		 for (int i=0; i<string.length(); i++) {
			 if(Character.isLetter(string.charAt(i))) {
				char ch = string.charAt(i);
				 if(ch =='X'){
					 formula[i] = 10; 
				 }else {
					 return false;
				 }
			 }else {
			 char ch = string.charAt(i);
			 formula[i] = Character.getNumericValue(ch); 
			 }
		 }
		 
		 if(formula.length < 11) {
			 result = (formula[0]* 10) + (formula[1]*9) + (formula[2]*8) + (formula[3]*7) + (formula[4]*6) + (formula[5]*5) + (formula[6]*4) + (formula[7]*3) + (formula[8]*2) + (formula[9]*1);
			 System.out.println(result%11);
			 if(result%11==0) {
				 return true;
			 }else {
				 return false;
			 }
		 }else {
			 return false; 
		 }
		
	}

	/**
	 * 16. Determine if a sentence is a pangram. A pangram (Greek: παν γράμμα, pan
	 * gramma, "every letter") is a sentence using every letter of the alphabet at
	 * least once. The best known English pangram is:
	 * 
	 * The quick brown fox jumps over the lazy dog.
	 * 
	 * The alphabet used consists of ASCII letters a to z, inclusive, and is case
	 * insensitive. Input will not contain non-ASCII symbols.
	 * 
	 * @param string
	 * @return
	 */
	public boolean isPangram(String string) {
		string = string.replaceAll("\\W", "");
		Set<Integer> alphabet = new HashSet<>(26);
		int counter = 0;
		 for (char c : string.toCharArray()) {
		        int n = c - 'a';
		        if (n >= 0 && n < 26) {
		            if (alphabet.add(n)) {
		                counter = counter + 1;
		                
		            }
		          }
		        }
		 if (counter == 26) {
             return true;
          }else {
          	return false;
          }
	}
		

	/**
	 * 17. Calculate the moment when someone has lived for 10^9 seconds.
	 * 
	 * A gigasecond is 109 (1,000,000,000) seconds.
	 * 
	 * @param given
	 * @return
	 */
	public Temporal getGigasecondDate(Temporal given) {
		 LocalDateTime localDateTimeGiven = null;
         long gigaSecond = 1000000000;
         try
         {
             localDateTimeGiven = LocalDateTime.from(given);
         }
         catch (Exception e)
         {
             localDateTimeGiven = ((LocalDate)given).atStartOfDay();
         }
     
         return localDateTimeGiven.plus(gigaSecond, ChronoUnit.SECONDS);
	}

	/**
	 * 18. Given a number, find the sum of all the unique multiples of particular
	 * numbers up to but not including that number.
	 * 
	 * If we list all the natural numbers below 20 that are multiples of 3 or 5, we
	 * get 3, 5, 6, 9, 10, 12, 15, and 18.
	 * 
	 * The sum of these multiples is 78.
	 * 
	 * @param i
	 * @param set
	 * @return
	 */
	public int getSumOfMultiples(int i, int[] set) {
		   int result = 0;
           
           for (int count = 1; count < i; count++) {
               for (int multi : set) {
                   if (multi != 0 && count % multi == 0) {
                       result += count;
                       break;
                   }
               }
           }

           return result;
	}

	/**
	 * 19. Given a number determine whether or not it is valid per the Luhn formula.
	 * 
	 * The Luhn algorithm is a simple checksum formula used to validate a variety of
	 * identification numbers, such as credit card numbers and Canadian Social
	 * Insurance Numbers.
	 * 
	 * The task is to check if a given string is valid.
	 * 
	 * Validating a Number Strings of length 1 or less are not valid. Spaces are
	 * allowed in the input, but they should be stripped before checking. All other
	 * non-digit characters are disallowed.
	 * 
	 * Example 1: valid credit card number 1 4539 1488 0343 6467 The first step of
	 * the Luhn algorithm is to double every second digit, starting from the right.
	 * We will be doubling
	 * 
	 * 4_3_ 1_8_ 0_4_ 6_6_ If doubling the number results in a number greater than 9
	 * then subtract 9 from the product. The results of our doubling:
	 * 
	 * 8569 2478 0383 3437 Then sum all of the digits:
	 * 
	 * 8+5+6+9+2+4+7+8+0+3+8+3+3+4+3+7 = 80 If the sum is evenly divisible by 10,
	 * then the number is valid. This number is valid!
	 * 
	 * Example 2: invalid credit card number 1 8273 1232 7352 0569 Double the second
	 * digits, starting from the right
	 * 
	 * 7253 2262 5312 0539 Sum the digits
	 * 
	 * 7+2+5+3+2+2+6+2+5+3+1+2+0+5+3+9 = 57 57 is not evenly divisible by 10, so
	 * this number is not valid.
	 * 
	 * @param string
	 * @return
	 */
	public boolean isLuhnValid(String string) {
		string = string.replace("\\W","");
		if (string.matches("[0-9]+")){
			String clean = string.replaceAll("\\D+", "");
	        StringBuilder newString = new StringBuilder(clean);
	        System.out.println(newString);
			if (string.length() < 1) {
				return false;
				} else {
					int valueToMulti;
					int sum = 0;
					int sum2 = 0;
					for (int i = 1; i < newString.length(); i += 2) { 
						valueToMulti = Character.getNumericValue(newString.charAt(i));
						int product = valueToMulti * 2;
						if (product > 9) {
							product -= 9;
						}
						sum += product;
					}
					for (int i = 0; i < newString.length(); i += 2) {
						valueToMulti = Character.getNumericValue(newString.charAt(i));
						sum2 += valueToMulti;
					}
					return (sum + sum2) % 10 == 0;
				}
		}else {
		        return false;
					}
	}

	/**
	 * 20. Parse and evaluate simple math word problems returning the answer as an
	 * integer.
	 * 
	 * Add two numbers together.
	 * 
	 * What is 5 plus 13?
	 * 
	 * 18
	 * 
	 * Now, perform the other three operations.
	 * 
	 * What is 7 minus 5?
	 * 
	 * 2
	 * 
	 * What is 6 multiplied by 4?
	 * 
	 * 24
	 * 
	 * What is 25 divided by 5?
	 * 
	 * 5
	 * 
	 * @param string
	 * @return
	 */
	public int solveWordProblem(String string) {
		string = string.toLowerCase();
		String clean = string.replaceAll("what is", "");
		clean = clean.replaceAll("by ", "");
		clean = clean.replaceAll("\\?", "");
		String[] arr = clean.split("\\s");
		//System.out.println(Arrays.toString(arr));
		int result=0;
		int numOne;
		int numTwo;
	
		if(arr[2].equals("plus")) {
			numOne = Integer.valueOf(arr[1]);
			numTwo = Integer.valueOf(arr[3]);
			result =  numOne + numTwo;
		}else if(arr[2].equals("minus")) {
			numOne = Integer.valueOf(arr[1]);
			numTwo = Integer.valueOf(arr[3]);
			result =  numOne - numTwo;
		}else if(arr[2].equals("multiplied")) {
			numOne = Integer.valueOf(arr[1]);
			numTwo = Integer.valueOf(arr[3]);
			result =  numOne * numTwo;
		}else if(arr[2].equals("divided")){
			numOne = Integer.valueOf(arr[1]);
			numTwo = Integer.valueOf(arr[3]);
			result =  numOne / numTwo;
		}else {
			System.out.println("Invalid Operations");
		}
		
		return result;
	}
}
	
