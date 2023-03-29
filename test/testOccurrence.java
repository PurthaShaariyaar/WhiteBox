package test;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import src.Occurrence;
 
public class testOccurrence {

  // 100% Node Coverage
  @Test
  public void testNode1Coverage() {
    char[] charArray = {'a'};
    char character = 'a';
    assertEquals(1, Occurrence.numOccurrence(charArray, character));
  }

  @Test
  public void testNode2Coverage() {
    char[] charArray = {'a', 'b'};
    char character = 'a';
    assertEquals(1, Occurrence.numOccurrence(charArray, character));
  }

  @Test
  public void testNode3Coverage() {
    char[] charArray = {'a', 'b', 'c'};
    char character = 'a';
    assertEquals(1, Occurrence.numOccurrence(charArray, character));
  }

  @Test
  public void testNode4Coverage() {
    char[] charArray = {'a', 'b', 'c', 'd'};
    char character = 'a';
    assertEquals(1, Occurrence.numOccurrence(charArray, character));
  }

  @Test
  public void testNode5Coverage() {
    char[] charArray = {'a', 'b', 'c', 'd', 'e'};
    char character = 'a';
    assertEquals(1, Occurrence.numOccurrence(charArray, character));
  }

  // 100% Edge Coverage
  @Test
  public void testEdgeCoverage() {
    char[] charArray = {'a', 'b', 'a', 'c', 'a'};
    char character = 'a';
    assertEquals(3, Occurrence.numOccurrence(charArray, character));
  }

  // 100% Edge-Pair Coverage
  @Test
  public void testEdgePairCoverage1() {
    char[] charArray = {'a', 'a'};
    char character = 'a';
    assertEquals(2, Occurrence.numOccurrence(charArray, character));
  }

  @Test
  public void testEdgePairCoverage2() {
    char[] charArray = {'b', 'a', 'a'};
    char character = 'a';
    assertEquals(2, Occurrence.numOccurrence(charArray, character));
  }

  @Test
  public void testEdgePairCoverage3() {
    char[] charArray = {'a', 'b', 'a', 'c', 'a'};
    char character = 'a';
    assertEquals(3, Occurrence.numOccurrence(charArray, character));
  }

  @Test
  public void testEdgePairCoverage4() {
    char[] charArray = {'a', 'b', 'c', 'a'};
    char character = 'a';
    assertEquals(2, Occurrence.numOccurrence(charArray, character));
  }

  @Test
  public void testEdgePairCoverage5() {
    char[] charArray = {'a', 'b', 'a', 'c', 'd', 'a'};
    char character = 'a';
    assertEquals(3, Occurrence.numOccurrence(charArray, character));
  }

  // Prime Paths
  @Test
  public void testPrimePath1() {
    char[] charArray = {'a', 'b', 'c', 'd', 'e'};
    char character = 'a';
    assertEquals(1, Occurrence.numOccurrence(charArray, character));
  }

  @Test
  public void testPrimePath2() {
    char[] charArray = {'a', 'b', 'a', 'c', 'd', 'e'};
    char character = 'a';
    assertEquals(2, Occurrence.numOccurrence(charArray, character)); 
  }

  @Test 
  public void testPrimePath3() {
    char[] charArray = {'a', 'b', 'c', 'a', 'c', 'd', 'e'};
    char character = 'a';
    assertEquals(2, Occurrence.numOccurrence(charArray, character));
  }
}