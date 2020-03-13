package qoutes.obj.services;

import qoutes.obj.Qoutes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class QoutesServices {

    private List<Qoutes> qoutesFromPeople = new ArrayList<Qoutes>();
    public QoutesServices() { }

    public Qoutes getQoutes() {
        int select = 0;
        try {
            Random rn = new Random();
             select = rn.nextInt(this.qoutesFromPeople.size());
        }catch (Exception w){
            w.getLocalizedMessage();
            this.qoutesFromPeople.add(new Qoutes("waka waka waka", "shakira"));
        }
        return this.qoutesFromPeople.get(select);
    }

    public void addQoute(Qoutes qoutes){
        this.qoutesFromPeople.add(qoutes);
    }

}
