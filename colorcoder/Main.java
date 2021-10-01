package colorcoder;

public class Main {

  public static void main(String[] args) {
    TestColorPair.testPrintManual();

    TestColorPair.testNumberToPair(4, MajorColor.WHITE, MinorColor.BROWN);
    TestColorPair.testNumberToPair(5, MajorColor.WHITE, MinorColor.SLATE);

    TestColorPair.testPairToNumber(MajorColor.BLACK, MinorColor.ORANGE, 12);
    TestColorPair.testPairToNumber(MajorColor.VIOLET, MinorColor.SLATE, 25);
  }
}
