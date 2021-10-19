package TD2.Components;

public interface Composant {

    String getName();
    Owner getOwner();
    void setOwner(Owner owner, boolean recursive);
    void appendContent(String name);
    boolean isComposite();

}
