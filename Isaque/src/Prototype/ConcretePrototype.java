
package Prototype;



public class ConcretePrototype implements Prototype {
    private String name;

    public ConcretePrototype(String name) {
        this.name = name;
    }

    @Override
    public Prototype clone() {
        return new ConcretePrototype(this.name);
    }

    public void exibirInfo() {
        System.out.println("Nome: " + this.name);
    }
}