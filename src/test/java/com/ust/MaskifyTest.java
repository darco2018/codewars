package com.ust;

import org.junit.Test;
        import static org.junit.Assert.assertEquals;
        import org.junit.runners.JUnit4;

        import java.util.Arrays;
        import java.util.Random;
        import java.util.function.Consumer;
        import java.util.stream.Stream;
        import java.util.stream.IntStream;

public class MaskifyTest {
    private static final Random random = new Random();

    @Test
    public void testEmpty() {
        assertEquals("", Maskify.maskify(""));
    }

    @Test
    public void testSingle() {
        rndstr(1).limit(31).forEach(
                str -> assertEquals(Maskify.maskify(str), Maskify.maskify(str)));
    }

    @Test
    public void testShort() {
        rndstr(2).limit(31).forEach(
                str -> assertEquals(Maskify.maskify(str), Maskify.maskify(str)));
        rndstr(3).limit(31).forEach(
                str -> assertEquals(Maskify.maskify(str), Maskify.maskify(str)));
    }

    @Test
    public void testEdge() {
        rndstr(4).limit(31).forEach(
                str -> assertEquals(Maskify.maskify(str), Maskify.maskify(str)));
        rndstr(5).limit(31).forEach(
                str -> assertEquals(Maskify.maskify(str), Maskify.maskify(str)));
    }

    @Test
    public void testLong() {
        rndstr(10).limit(31).forEach(
                str -> assertEquals(Maskify.maskify(str), Maskify.maskify(str)));
        rndstr(20).limit(31).forEach(
                str -> assertEquals(Maskify.maskify(str), Maskify.maskify(str)));
    }

    private static Stream<String> rndstr(int length) {
        return Stream.generate(() -> rndcp().limit(length)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append))
                .map(StringBuilder::toString);
    }

    private static IntStream rndcp() {
        return rndcp(' ', '~');
    }

    private static IntStream rndcp(int fcp, int lcp) {
        return random.ints(fcp, lcp);
    }
}
