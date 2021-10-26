package TD3.visitors;

import TD3.commandes.Client;
import TD3.commandes.Commande;
import TD3.commandes.GroupeClient;
import TD3.commandes.Ligne;

public class XMLRapportCommandes implements PrePostVisitor{
    @Override
    public void preVisit(GroupeClient gc) {

    }

    @Override
    public void preVisit(Client c) {

    }

    @Override
    public void preVisit(Commande cm) {

    }

    @Override
    public void preVisit(Ligne l) {

    }

    @Override
    public void postVisit(Client c) {

    }

    @Override
    public void postVisit(Commande cm) {

    }

    @Override
    public void postVisit(Ligne l) {

    }

    @Override
    public void visit(GroupeClient groupeClient) {

    }
}
