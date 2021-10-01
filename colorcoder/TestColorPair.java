package colorcoder;

import java.util.List;
import java.util.stream.Collectors;

public class TestColorPair {

  static void testNumberToPair(int pairNumber,
                               MajorColor expectedMajor,
                               MinorColor expectedMinor) {
    ColorPair colorPair = ColorPairUtility.getColorFromPairNumber(pairNumber);
    System.out.println("Got pair " + colorPair);
    assert (colorPair.getMajor() == expectedMajor);
    assert (colorPair.getMinor() == expectedMinor);
  }

  static void testPairToNumber(
          MajorColor major,
          MinorColor minor,
          int expectedPairNumber) {
    int pairNumber = ColorPairUtility.getPairNumberFromColor(major, minor);
    System.out.println("Got pair number " + pairNumber);
    assert (pairNumber == expectedPairNumber);
  }

  static void testPrintManual() {
    List<ColorPair> manual = ColorPairUtility.printManual();
    System.out.println(manual.stream().map(colorPair -> colorPair.toString()).collect(Collectors.joining("\r\n")));
  }
}
