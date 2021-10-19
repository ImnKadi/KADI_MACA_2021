package TD2.Components;

import java.util.ArrayList;
import java.util.List;

public class Repertoire extends ComposantImpl implements Composant, Composite<Composant>{

    private List<Composant> getChildren;

    public Repertoire(String name, Owner owner) {
        super(name, owner);
        getChildren = new ArrayList<>();
    }


    @Override
    public void appendContent(String name) {
    }

    @Override
    public boolean isComposite() {
        return false;
    }

    @Override
    public List<Composant> getChildren() {
        return null;
    }

    @Override
    public void addChild(Composant composant) {
        this.getChildren.add(composant);
    }

    @Override
    public boolean removechild(Composant composant) {
        return false;
    }

    @Override
    public boolean removeChildren(List<Composant> t) {
        return false;
    }
}
