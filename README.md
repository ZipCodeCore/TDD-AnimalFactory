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
#### `void setName(String name)`

* ensure when `.setName` is invoked on an instance of `Cat`, the `name` field is being set to the respective value.

#### `String speak()`
* ensure when `.speak` is invoked on an instance of `Cat`, the value `"meow!"` is returned.

#### `setBirthDate(Date birthDate)`
* ensure when `.setBirthDate` is invoked on an instance of `Cat`, the `name` field is being set to the respective value.

#### `void eat(Food food)`
* ensure when `.eat` is invoked on an instance of `Cat`, the `numberOfMealsEaten` is increased by 1.

#### `Integer getId()`
* ensure when `.getId` is invoked on an instance of `Cat`, the respective `id` value is returned.

#### Check Animal inheritance; google search `java instanceof keyword`
* ensure that a `Cat` is an `instanceof` an Animal
 
#### Check Mammal inheritance; google search `java instanceof keyword`
* ensure that a `Cat` is an `instanceof` a Mammal

### DogTest
#### `void setName(String name)`
* ensure when `.setName` is invoked on an instance of `Dog`, the `name` field is being set to the respective value.
#### `String speak()`
* ensure when `.speak` is invoked on an instance of `Dog`, the value `"bark!"` is returned.
#### `setBirthDate(Date birthDate)`
* ensure when `.setBirthDate` is invoked on an instance of `Dog`, the `name` field is being set to the respective value.
#### `void eat(Food food)`
* ensure when `.eat` is invoked on an instance of `Dog`, the `numberOfMealsEaten` is increased by 1.
#### `Integer getId()`
* ensure when `.getId` is invoked on an instance of `Dog`, the respective `id` value is returned.
#### Check Animal inheritance; google search `java instanceof keyword`
* ensure that a `Dog` is an `instanceof` an Animal 
* #### Check Mammal inheritance; google search `java instanceof keyword` test to check Mammal inheritance; google search `java instanceof keyword`
* ensure that a `Dog` is an `instanceof` an Mammal
 

### AnimalFactoryTest
#### `Animal createDog(String name, Date birthDate)`
* ensure when `.createDog` is invoked on `AnimalFactoryTest` a `Dog` is created with the respective `name` and `birthDate` value.
#### `Animal createCat(String name, Date birthDate)`
* ensure when `.createCat` is invoked on `AnimalFactoryTest` a `Dog` is created with the respective `name` and `birthDate` value.

### CatHouseTest
#### `void add(Cat cat)`
* ensure when `.add` is invoked on the `CatHouse`, a respective `Cat` object can be retrieved from the house.

#### `void remove(Cat cat)`
* ensure when `.remove` is invoked on the `CatHouse`, a respective `Cat` object can no longer be retrieved from the house.

#### `void remove(Integer id)`
* ensure when `.remove` is invoked on the `CatHouse`, a `Cat` object with the respective `id` can no longer be retrieved from the house.

#### `Cat getCatById(Integer id)`
* ensure when `.getCatById` is invoked on the `CatHouse`, a `Cat` with the respective `id` is returned.

#### `Integer getNumberOfCats()`
* ensure when `.getNumberOfCats()` is invoked on the `CatHouse`, the respective number of `Cat` objects is returned.

### DogHouseTest
#### `void add(Dog dog)`
* ensure when `.add` is invoked on the `DogHouse`, a respective `Dog` object can be retrieved from the house.
  
#### `void remove(Integer id)`
* ensure when `.remove` is invoked on the `DogHouse`, a respective `Dog` object can no longer be retrieved from the house.

#### `void remove(Dog dog)`
* ensure when `.remove` is invoked on the `DogHouse`, a `Dog` object with the respective `id` can no longer be retrieved from the house.

#### `Dog getDogById(Integer id)`
* ensure when `.getCatById` is invoked on the `DogHouse`, a `Dog` with the respective `id` is returned.

#### `Integer getNumberOfCats()`
* ensure when `.getNumberOfCats()` is invoked on the `DogHouse`, the respective number of `Dog` objects is returned.


