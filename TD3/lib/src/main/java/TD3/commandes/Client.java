package TD3.commandes;

import TD3.visitors.PrePostVisitor;
import TD3.visitors.Visitor;

public class Client implements Visitable, PrePostVisitable{

    private String name;

    public String getName(){
        return name;
    }

    public void addCommande(Commande co){

    }

    public void addLigne(Ligne l, String name){

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
