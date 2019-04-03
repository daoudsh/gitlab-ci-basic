package de.shiyar.gitlabci;

import org.junit.Test;

import java.io.IOException;


/**
 * Unit test for simple App.
 */
public class AppTest extends App {

    @Test
    public void testMain() throws IOException {
        System.out.println("main");
        String[] args = {"a"};
        main(args);
    }

}
