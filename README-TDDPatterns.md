# Test Driven Development (TDD)
## What is a unit test?
* A `unit test` is a practice by which `small units of code` are tested.
* The purpose of a unit test is to determine if a feature being tested is fit for use in other parts of an application.
* It is considered best practice to test every method in an application with at least 2 sets of arguments.
* Tests are typically expressed as a combination of three clauses:
	* `Given` some context
	* `When` some action is carried out
	* `Then` consequences should be observable

### Example

```java
// Given
String name = "Leon";
Integer age = 25;
Person leon = new Person(name, age);

// When
String getNameResult = leon.getName();
Integer getAgeResult = leon.getAge();

// Then
Assert.assertEquals(name, getNameResult);
Assert.assertEquals(age, getAgeResult);
```


## What are the three clauses of a test?
### Given (some context)
* `Given` is the section of a unit test method that
	* initializes, instantiates, or sets the value of data to pass to test method.

* **Example**

```java
// Given
String name = "Leon";
Integer age = 25;
Person leon = new Person(name, age);
```

### When (some action is carried out)
* `When` is the section of a unit test method that
	* invokes the method with the previously arranged parameters

```java
// When
String getNameResult = leon.getName();
Integer getAgeResult = leon.getAge(); 
```


### Then (consequences should be observable)
* `Then` is the section of a unit test method that
	* verifies that the method to be tested behaves as expected

```java
// Then
Assert.assertEquals(name, getNameResult);
Assert.assertEquals(age, getAgeResult);
```
