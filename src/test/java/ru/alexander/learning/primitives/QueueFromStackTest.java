package ru.alexander.learning.primitives;

import org.junit.Test;
import ru.alexander.learning.homework.QueueFromStacks;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class QueueFromStackTest {

    @Test
    public void test() {
        QueueFromStacks queue = new QueueFromStacks();
        queue.add(1);
        queue.add(2);
        assertEquals(queue.poll(), Integer.valueOf(1));
        queue.add(3);
        assertEquals(queue.poll(), Integer.valueOf(2));
        assertEquals(queue.poll(), Integer.valueOf(3));
        assertNull(queue.poll());
    }

}
