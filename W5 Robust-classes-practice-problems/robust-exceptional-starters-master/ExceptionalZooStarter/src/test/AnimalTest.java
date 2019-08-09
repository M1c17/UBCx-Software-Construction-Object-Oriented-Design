package test;

import exceptions.AllergicException;
import exceptions.NotHungry;
import model.Animal;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static junit.framework.TestCase.fail;

public class AnimalTest {

  @Test
  public void eatisHungryNotAllergic() {
    //expecting eatTimes == 1 no exceptions to be thrown
    Animal animal = new Animal(true, false);
    int eatenTimes = 0;

    try {
      eatenTimes = animal.eat();
    } catch (AllergicException e) {
      fail("Got allergic when shouldn't have");
    } catch (NotHungry notHungry) {
      fail("Got notHungry when shouldn't have" );
    }

    assertTrue(eatenTimes == 1);
  }

  @Test
  public void notEatNotAllergic() {
    //expection eatTimes = 0 not hungry exception thrown
    Animal animal = new Animal(false, false);
    int eatenTimes = 0;

    try{
      eatenTimes = animal.eat();
    } catch (AllergicException e) {
      fail("Got allergic when shouldn't have");
    } catch (NotHungry notHungry) {
      //don't fail.
    }

    assertTrue(eatenTimes == 0);

  }

  @Test
  public void notEatIsAllergic() {
    //exception eatTimes = 0  hungry exception thrown
    Animal animal = new Animal(false, true);
    int eatTimes = 0;

    try{
      eatTimes = animal.eat();
    } catch (AllergicException e) {
      // Dont fail
    } catch (NotHungry notHungry) {
      //Dont fail
    }
    assertTrue( eatTimes == 0);
  }

  @Test
  public void IsHungryIsAllergic() {
    Animal animal = new Animal(true, true);
    int eatTimes = 1;

    try {
      eatTimes = animal.eat();
    } catch (AllergicException e) {
      //Dont fail
    } catch (NotHungry notHungry) {
      fail("Got hungry when shouldn't have");
    }

    assertTrue(eatTimes == 1);
  }
}
