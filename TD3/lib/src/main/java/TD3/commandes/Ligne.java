package TD3.commandes;

import TD3.visitors.PrePostVisitor;
import TD3.visitors.Visitor;

public class Ligne implements PrePostVisitable, Visitable {

    private String name;
    private int sum;

    public String getName(){
        return name;
    }

    public int getSum(){
        return sum;
    }

    public void Ligne(String name){

        this.name = name;
    }

    public void Ligne(int sum, String name){
        this.name = name;
        this.sum = sum;
    }

    @Override
    public void accept(PrePostVisitor ppv) {

        ppv.preVisit(this);
        ppv.postVisit(this);
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
