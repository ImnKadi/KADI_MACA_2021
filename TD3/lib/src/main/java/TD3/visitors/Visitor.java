package TD3.visitors;

import TD3.commandes.Client;
import TD3.commandes.Commande;
import TD3.commandes.GroupeClient;
import TD3.commandes.Ligne;

public interface Visitor extends AbstractVisitor{

    public void visit(GroupeClient gc);

    public void visit(Ligne c);

    public void visit(Client co);

    public void visitt(Ligne l);


}
