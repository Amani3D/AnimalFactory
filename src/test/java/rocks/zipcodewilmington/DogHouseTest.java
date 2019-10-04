package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    @Test
    public void addTest() {
        Dog dog = new Dog(null, null, 6);

        DogHouse.add(dog);

        Dog actual = DogHouse.getDogById(6);

        Assert.assertEquals(dog, actual);
    }
    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void removeTest() {
        Dog dog = new Dog(null, null, 6);

        DogHouse.add(dog);

        DogHouse.remove(6);

        Dog actual = DogHouse.getDogById(6);

        Assert.assertNull(actual);
    }
    // TODO - Create tests for `void remove(Dog dog)`
    @Test
    public void removeTest1() {
        Dog dog = new Dog(null, null, 6);

        DogHouse.add(dog);

        DogHouse.remove(6);

        Dog actual = DogHouse.getDogById(6);

        Assert.assertNull(actual);
    }
    // TODO - Create tests for `Dog getDogById(Integer id)`
    @Test
    public void getCatByIdTest() {
        Dog dog = new Dog(null, null, 6);

        DogHouse.add(dog);

        Dog actual = DogHouse.getDogById(6);

        Assert.assertEquals(dog, actual);
    }
    // TODO - Create tests for `Integer getNumberOfDogs()`
    @Test
    public void getNumberOfCatsTest() {
        Dog dog = new Dog(null, null, null);

        int getNumOfDogs = DogHouse.getNumberOfDogs();

        DogHouse.add(dog);

        int expected = getNumOfDogs + 1;

        int actual = DogHouse.getNumberOfDogs();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }
}
