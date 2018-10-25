package deqo.dsar.mysimplestack;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ItemStackTest {
    private SimpleStack s;
    @Before
    public void setUp(){
    s = new ItemStack();
    }

    @Test
    public void isEmpty() {
        assertTrue("La pile doit être vide", s.isEmpty()) ;
    }

    @Test
    public void getSize() {
        assertEquals("La pile a une taille égale à 0",0, s.getSize());
    }

    @Test
    public void push() {
        Item i = new Item(1);
        s.push(i);
        assertTrue("La pile ne doit plus être vide", !s.isEmpty());
    }

    @Test
    public void peek() {
        Item i = new Item(1);
        s.push(i);
        assertEquals("Le peek de la pile doit être égal à Item(1)", i, s.peek());
    }

    @Test
    public void pop() {
        Item i = new Item(1);
        s.push(i);
        s.pop();
        assertTrue("La pile doit être vide", s.isEmpty());
    }
}