# TDD-AnimalFactory
* **Objective:**
    * To create tests that ensure expected behavior of each class:
        * Cat
        * Dog
        * AnimalFactory
        * CatHouse
        * DogHouse
* **Purpose:**
    * To establish familiarity with Test-Driven-Development (TDD) practices.
* **Getting context:**
	* Click [here](./README-TDDPatterns.md) to gain more familiarity with TDD-structured programming.

## Getting Started
* Begin by opening the `test.java.rocks.zipcodewilmington` package and completing each of the `TODO`s.

### CatTest
* Create tests for `void setName(String name)`
* Create tests for `setBirthDate(Date birthDate)`
* Create tests for `void eat(Food food)`
* Create tests for `Integer getId()`
* Create test to check Animal inheritance; google search `java instanceof keyword`
* Create test to check Mammal inheritance; google search `java instanceof keyword`

### DogTest
* Create tests for `void setName(String name)`
* Create tests for `setBirthDate(Date birthDate)`
* Create tests for `void eat(Food food)`
* Create tests for `Integer getId()`
* Create test to check Animal inheritance; google search `java instanceof keyword`
* Create test to check Mammal inheritance; google search `java instanceof keyword` 

### AnimalFactoryTest
* Create Test for `Animal createDog(String name, Date birthDate)`
* Create Test for `Animal createCat(String name, Date birthDate)`

### CatHouseTest
* Create tests for `void add(Cat cat)`
* Create tests for `void remove(Integer id)`
* Create tests for `void remove(Cat cat)`
* Create tests for `Cat getCatById(Integer id)`
* Create tests for `Integer getNumberOfCats()`
 
### DogHouseTest
* Create tests for `new Dog(String name, Date birthDate, Integer id)`
* Create tests for `setBirthDate(Date birthDate)`
* Create tests for `void eat(Food food)`
* Create tests for `Integer getId()`
* Create test to check Animal inheritance; google search `java instanceof keyword`
* Create test to check Mammal inheritance; google search `java instanceof keyword`