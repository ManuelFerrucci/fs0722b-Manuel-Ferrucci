package com.Ese_1_secretCode.configurations;

import jakarta.persistence.AttributeConverter;

public class ConverterCode implements AttributeConverter<String, String> {

	Character[] array = { '2', 'E', 'X', '9', 'W', 'C', '4', 'P', 'Q', '3', 'R' };

	@Override
	public String convertToDatabaseColumn(String attribute) {
		String result = "";
		if (attribute == null) {
			return result;
		}
		for (char c : attribute.toCharArray()) {
			String sc = c + "";
			int num = Integer.parseInt(sc);
			result += array[num];
		}
		return result;
	}

	@Override
	public String convertToEntityAttribute(String dbData) {
		String result = "";
		if (dbData == null) {
			return result;
		}
		for (char c : dbData.toCharArray()) {
			for (int i = 0; i < array.length; i++) {
				if (array[i].equals(c)) {
					result += i;
				}
			}
		}
		return result;
	}

}
