package TD3.commandes;

import TD3.visitors.PrePostVisitor;
import TD3.visitors.Visitor;

public class Commande  implements Visitable, PrePostVisitable{

    private String name;

    public String getName(){
        return name;
    }

    public void addLigne(Ligne l){

    }

    @Override
    public void accept(PrePostVisitor ppv) {

    }

    @Override
    public void accept(Visitor v) {

    }
}
