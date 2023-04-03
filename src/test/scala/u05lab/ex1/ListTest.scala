package u05lab.ex1

import org.junit.Assert.assertEquals
import org.junit.{Assert, Test}

class ListTest {

  /** todo */
  @Test
  def testZipRight(): Unit =
    val l = List(1, 2, 3, 4, 5)
    assertEquals(List((1, 0), (2, 1), (3, 2), (4, 3), (5, 4)), l.zipRight)
    assertEquals(List.Nil(), List.Nil().zipRight)
    assertEquals(List((1, 0)), List(1).zipRight)



}
