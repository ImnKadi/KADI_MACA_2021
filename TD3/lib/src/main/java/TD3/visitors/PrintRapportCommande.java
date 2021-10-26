package TD3.visitors;

import TD3.commandes.Client;
import TD3.commandes.Commande;
import TD3.commandes.GroupeClient;
import TD3.commandes.Ligne;

public class PrintRapportCommande implements Visitor {
    @Override
    public void visit(GroupeClient gc) {

    }

    @Override
    public void visit(Client c) {

    }

    @Override
    public void visit(Commande cm) {

    }

    @Override
    public void visit(Ligne l) {

    }
}