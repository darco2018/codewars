package com.ust.string20common;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

public class ByteArrToString {

    /* While reading a String from input sources like XML files, HTTP requests, network port, or database,
    you must pay attention to which character encoding (e.g. UTF-8, UTF-16, and ISO 8859-1) they are encoded.
    If you will not use the same character encoding while converting bytes to String, you would end up with
    a corrupt String that may contain totally incorrect values.

    We mostly deal with encoding like UTF-8, Cp1252, and Windows-1252, which displays ASCII characters
    (mostly alphabets and numbers) without fail, even if you use different encoding schemes.
    The real issue comes when your text contains special characters e.g. 'é', which is often used in French names.

    In Java, things are a little bit more tricky because many IO classes like InputStreamReader
    by default use the platform's character encoding. What this means is that,
    if you run your program in different machines, you will likely get different outputs
    because of the different character encoding used on that machine.

    There are multiple ways to change byte array to String in Java, you can either use methods from JDK,
    or you can use open-source complementary APIs like Apache commons and Google Guava.
    These API provides at least two sets of methods to create String from byte array;
    one, which uses default platform encoding, and the other which takes character encoding.
    You should always use a later one, don't rely on platform encoding. I know, it could be the same or
    you might not have faced any problem so far, but it's better to be safe than sorry.
    It's also one of the best practices to specify character encoding while converting bytes
    to the character in any programming language.

*/
    public static String byteArrToString(byte[] bytes) {


        //String.copyValueOf() - nie ma dla byte[]. Jest dla char[]

        // Constructs a new String by decoding the specified array of bytes using the platform's default charset.
        String s1 = null;
        try {

            s1 = new String(bytes, StandardCharsets.UTF_8); // é
            String s2 = new String(bytes, "UTF-8");// é
            String s3 = new String(bytes, "UTF-16");// 쎩

            System.out.println(bytes); // // [B@30c15d8b
            System.out.println(s1); // é
            System.out.println(s2); // é
            System.out.println(s3); // é

        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return s1;
    }

    /* In order to correctly convert those byte arrays into String, you must first discover correct character encoding
    by reading metadata like Content-Type, <?xml encoding="…">, etc, depending on the format/protocol of the data you
    are reading. This is one of the reasons I recommend using XML parsers like SAX or DOM parsers to read XML files,
    they take care of character encoding by themselves.

    Some programmers, also recommend using Charset over String for specifying character encoding,  e.g.
    instead of "UTF-8" use StandardCharsets.UTF_8 mainly to avoid UnsupportedEncodingException in the worst case.
    There are six standard Charset implementations guaranteed to be supported by all Java platform implementations.
    You can use them instead of specifying the encoding scheme in String. In short, always prefer
    StandardCharsets.ISO_8859_1 over "ISO_8859_1", as shown below :
    String str = IOUtils.toString(fis,StandardCharsets.UTF_8);

Other standard charsets supported by Java platform are :
StandardCharsets.ISO_8859_1
StandardCharsets.US_ASCII
StandardCharsets.UTF_16
StandardCharsets.UTF_16BE
StandardCharsets.UTF_16LE


Read more: https://javarevisited.blogspot.com/2014/08/2-examples-to-convert-byte-array-to-String-in-Java.html#ixzz7Dt2vJWl9

*/

    /* Here is our sample XML snippet to demonstrate issues with using default character encoding.
    This file contains the letter 'é', which is not correctly displayed in Eclipse because
    its default character encoding is Cp1252.

Read more: https://javarevisited.blogspot.com/2014/08/2-examples-to-convert-byte-array-to-String-in-Java.html#ixzz7Dt41vbtN
*/

    public static boolean practice() {
        String str = "a";
        System.out.println("" + str.getBytes(StandardCharsets.UTF_8)); // [B@6771beb3  form byte[]
        System.out.println(new String(str.getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8)); // a
        Character a = str.charAt(0);
        System.out.println(a); // a
        System.out.println((int) a); // 97
        System.out.println();
        //

        int codepoint1 = Character.codePointOf("lATIN CAPITAL LETTER a"); // 65
        int codepoint2 = (int) "A".charAt(0); // 65
        System.out.println(codepoint1 + "  " + codepoint2);

        String hexA = Integer.toHexString('A'); //toBinaryString(int i),  toOctalString
        System.out.println(hexA); // hex 41 -> decimal (4*16) + (1*1) = 64 + 1 = 65

        System.out.println("Platform Encoding : "
                + System.getProperty("file.encoding"));

        return true;
    }

    /*
    You could add a <meta charset="ISO-8859-1"> tag in the <head> of the HTML to tell the browser that you are
     using the western Europe latin character set. If that tag is missing, the browser will look at the
     response headers from the web server and may find an additional charset declaration in the Content-Type header.
     The HTML document can also override the Content-Type sent by the web server by adding a
     <meta http-equiv="content-type"> tag.
    * */

}
