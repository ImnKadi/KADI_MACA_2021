package TD2.Components;

public class Fichier extends ComposantImpl implements Composant{

    private StringBuilder content;



    public Fichier(String name, Owner owner) {
        super(name, owner);
    }

     public int getSize(){
        return this.content.length();
     }

     private String getContent(){
        return this.content.toString();
     }

    @Override
    public void appendContent(String name) {
        this.content.append(content);
    }

    @Override
    public boolean isComposite() {
        return false;
    }
}
