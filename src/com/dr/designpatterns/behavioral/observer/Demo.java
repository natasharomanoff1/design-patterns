package com.dr.designpatterns.behavioral.observer;

public class Demo implements Observer<Person>
// Observer<Foo>
{
	public void ObserverInfrastructureDemo() {
		Person person = new Person();
		person.subscribe(this);
		for (int i = 20; i < 24; ++i)
			person.setAge(i);
	}

	public static void main(String[] args) {
		new Demo();
	}

	@Override
	public void handle(PropertyChangedEventArgs<Person> args) {
		System.out.println("Person's " + args.propertyName + " has been changed to " + args.newValue);
	}
}
