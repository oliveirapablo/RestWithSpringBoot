package br.com.erudio.converters;

public class NumberConverter {

	public static Double convertToDouble(String strNumber) {
		if (strNumber == null)
			return 0D;
		String number = strNumber.replaceAll(",", ".");
		if (isNumeric(number))
			return Double.parseDouble(number);
		return 0D;
	}

	public static boolean isNumeric(String strnumber) {
		if (strnumber == null)
			return false;
		String number = strnumber.replaceAll(",", ".");

		return number.matches("[-+]?[0-9]*\\.?[0-9]+");
	}
}
