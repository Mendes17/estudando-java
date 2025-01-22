package services;

import java.util.ArrayList;
import java.util.List;

public class PrintService<Generic> { // Após o nome da classe deve ser adicionado o "<>" e um nome de parâmetro, pode ser qualquer nome

    private List<Generic> list = new ArrayList<>(); // cria um array com tipo do parâmetro que vai ser fornecido la no (main)

    public void addValue(Generic value) {
       list.add(value); // método para adicionar os valores no array
    }

    public Generic first() { // método para pegar o primeiro valor no array
        if(list.isEmpty()) {
            throw new IllegalStateException("List is empty"); // caso o array esteja vazio
        }
        return list.get(0);
    }

    public void print() {
        System.out.print("[");
        if(!list.isEmpty()) { // caso o array não esteja vazio
            System.out.print(list.get(0));
        }
        for(int i = 1; i < list.size(); i++) {
            System.out.print(", " + list.get(i));
        }
        System.out.println("]");
    }

}
