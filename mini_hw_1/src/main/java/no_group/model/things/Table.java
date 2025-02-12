package no_group.model.things;

public class Table extends Thing {
    @Override
    public int Number() {
        //я пока не понял, зачем именно этот метод вообще нужен. Есть ощущение, что он должен будет в итоге возвращать какое-то приватное поле
        return 15;
    }
}
