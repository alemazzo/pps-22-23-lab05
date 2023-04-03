package u05lab.ex1

import org.junit.Assert.assertEquals
import org.junit.{Assert, Test}

class ListTest {

  /** todo */
  @Test
  def testZipRight(): Unit =
    val l = List(1, 2, 3, 4, 5)
    assertEquals(List((1, 0), (2, 1), (3, 2), (4, 3), (5, 4)), l.zipRight)
    assertEquals(List((1, 0), (2, 1), (3, 2), (4, 3)), List(1, 2, 3, 4).zipRight)
    assertEquals(List((1, 0), (2, 1), (3, 2)), List(1, 2, 3).zipRight)
    assertEquals(List.Nil(), List.Nil().zipRight)
    assertEquals(List((1, 0)), List(1).zipRight)

  @Test
  def testPartition(): Unit =
    val l = List(1, 2, 3, 4, 5)
    assertEquals((List(1, 3, 5), List(2, 4)), l.partition(_ % 2 == 1))
    assertEquals((List(1), List.Nil()), List(1).partition(_ % 2 == 1))

  @Test
  def testSpan(): Unit =
    val l = List(1, 2, 3, 4, 5)
    assertEquals((List(1, 2), List(3, 4, 5)), l.span(_ < 3))
    assertEquals((List(1, 2, 3, 4, 5), List.Nil()), l.span(_ < 10))
    assertEquals((List.Nil(), List(1, 2, 3, 4, 5)), l.span(_ < 0))
    assertEquals((List.Nil(), List.Nil()), List.Nil[Int]().span(_ < 0))

  @Test
  def testReduce(): Unit =
    assertEquals(15, List(1, 2, 3, 4, 5).reduce(_ + _))
    assertEquals(120, List(1, 2, 3, 4, 5).reduce(_ * _))
    assertEquals(1, List(1).reduce(_ * _))
    Assert.assertThrows(classOf[UnsupportedOperationException], () => List.Nil[Int]().reduce(_ + _))




}
