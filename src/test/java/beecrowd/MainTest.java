package beecrowd;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

import org.junit.Test;

public class MainTest {

  @Test
  public void testeMedia() {
    int[] numeros = {2, 6, -2};
    assertNotEquals(Main.inicio(numeros), 2);////
  }

}