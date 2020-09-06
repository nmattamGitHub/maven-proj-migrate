## Update for migrating from BB to GH

package ut.com.atlassian.example;

import org.junit.Test;
import com.atlassian.example.MyPluginComponent;
import com.atlassian.example.MyPluginComponentImpl;

import static org.junit.Assert.assertEquals;

public class MyComponentUnitTest
{
    @Test
    public void testMyName()
    {
        MyPluginComponent component = new MyPluginComponentImpl(null);
        assertEquals("names do not match!", "myComponent",component.getName());
    }
}
