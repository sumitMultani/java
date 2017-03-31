package com.java.codeSchool;


public class MyClassOverrideMethod {

	private final String importantField;

	private final String anotherField;

	public MyClassOverrideMethod(final String equalField,
			final String anotherField) {

		this.importantField = equalField;
		this.anotherField = anotherField;
	}

	public String getEqualField() {

		return importantField;
	}

	public String getAnotherField() {

		return anotherField;
	}

	@Override
	public int hashCode() {

		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((importantField == null) ? 0 : importantField.hashCode());
		return result;
	}

	@Override
	public boolean equals(final Object obj) {

		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		final MyClassOverrideMethod other = (MyClassOverrideMethod) obj;

		if (importantField == null) {
			if (other.importantField != null)
				return false;
		} else if (!importantField.equals(other.importantField))
			return false;
		return true;
	}

	public static void main(String[] args) {

		MyClassOverrideMethod first = new MyClassOverrideMethod("a", "first");
		MyClassOverrideMethod second = new MyClassOverrideMethod("a", "first");
		// HashMap map = new HashMap();
		// map.put(first, "1");
		// map.put(second, "2");
		// System.out.println("map :" + map);
		System.out.println(first.hashCode());
		System.out.println(second.hashCode());
		System.out.println(first == second);
		// System.out.println(first.equals(second));

	}

}
