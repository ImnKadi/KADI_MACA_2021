package TD3.commandes;

import TD3.visitors.PrePostVisitor;
import TD3.visitors.Visitor;

import java.util.Map;

public class Commande  implements Visitable, PrePostVisitable{

    private String name;

    private Map<String,Commande> commande;

    public String getName(){
        return name;
    }

    public void addCommande(Commande co){
        this.commande.put(co.getName(),co);

    }

    @Override
    public void accept(PrePostVisitor ppv) {

    }

    @Override
    public void accept(Visitor v) {

    }
}
