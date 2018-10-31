package com.dr.designpatterns.behavioral.observer;

//observes objects of type T
public interface Observer<T> {
	void handle(PropertyChangedEventArgs<T> args);
}
