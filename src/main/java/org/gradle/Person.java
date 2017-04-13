package org.gradle;

import lombok.Getter;

public class Person {
	@Getter
    private final String name;

    public Person(String name) {
        this.name = name;
    }

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
}
