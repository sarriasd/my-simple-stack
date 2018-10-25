package deqo.dsar.mysimplestack;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class ItemStack implements SimpleStack {

    private List<Item> stack = new ArrayList<>();

    @Override
    public boolean isEmpty() {
        return (stack.size() == 0);
    }

    @Override
    public int getSize() {
        return stack.size();
    }

    @Override
    public void push(Item item) {
        stack.add(item);
    }

    @Override
    public Item peek() throws EmptyStackException {
        return stack.get(getSize() - 1);
    }

    @Override
    public Item pop() throws EmptyStackException {
        Item top = stack.remove(getSize() - 1);
        return top;
    }
}
