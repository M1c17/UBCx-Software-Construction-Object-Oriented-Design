package filters.test;

import filters.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test the parser.
 */
public class TestParser {
    @Test
    public void testBasic() throws SyntaxError {
        Filter f = new Parser("trump").parse();
        assertTrue(f instanceof BasicFilter);
        assertTrue(((BasicFilter)f).getWord().equals("trump"));
    }

    @Test
    public void testHairy() throws SyntaxError {
        Filter x = new Parser("trump and (evil or blue) and red or green and not not purple").parse();
        assertTrue(x.toString().equals("(((trump and (evil or blue)) and red) or (green and not not purple))"));
    }

    @Test
    public void testAnd() throws SyntaxError {
        Filter x = new Parser("pink and roses").parse();
        System.out.println(x.toString());
        assertTrue(x.toString().equals("(pink and roses)"));
    }

    @Test
    public void testOr() throws SyntaxError {
        Filter x = new Parser("grey or black").parse();
        System.out.println(x.toString());
        assertTrue(x.toString().equals("(grey or black)"));
    }
}
