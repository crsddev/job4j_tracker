package ru.job4j.tracker;

public class DeleteItem implements UserAction {

    private final Output out;

    public DeleteItem(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Delete item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("== Delete item ==");
        int id = input.askInt("Enter id: ");
        boolean rsl = tracker.delete(id);
        if (rsl) {
            out.println("Заявка удалена.");
        } else {
            out.println("Ошибка удаления заявки.");
        }
        return true;
    }
}