package com.dr.solidDesignPrinciples.openClosedPrinciples;

public interface Specification<T> {
	boolean isSatisfied(T item);
}
