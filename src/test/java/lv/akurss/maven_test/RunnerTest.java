package lv.akurss.maven_test;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by dmitlavr on 20.01.2018.
 */
public class RunnerTest {

    @Test

    public void testFormat(){

        String input = "Test  &nbsp;&lt;&gt;";
        String formatted = Runner.format(input);
        Assert.assertEquals("\n\n=====================\nTest   <>\n====================\n", formatted);
    }

}