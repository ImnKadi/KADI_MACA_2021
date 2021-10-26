package TD3.commandes;

import TD3.visitors.PrePostVisitor;
import TD3.visitors.Visitor;

import java.util.Collection;
import java.util.Map;

public class GroupeClient implements PrePostVisitable, Visitable {

    private String name;

    private Map<String,Client> clients;

    public String getName(){
        return name;
    }

    public Collection<Client> getClient(){
        return clients.values();
    }

    public void addClient(Client c){
        this.clients.put(c.getName(), c);
    }

    public void addCommande(Commande com, String commande){
        Client c = clients.get(com);

    }
    public void addCommande(String name, Commande c){
    }
    @Override
    public void accept(PrePostVisitor ppv) {
        for (Client c : clients.values()){
            c.accept(ppv);
            ppv.visit(this);
        }
    }


    @Override
    public void accept(Visitor v) {
        for (Client c : clients.values()) {
            c.accept(v);
            v.visit(this);
        }
    }
}
