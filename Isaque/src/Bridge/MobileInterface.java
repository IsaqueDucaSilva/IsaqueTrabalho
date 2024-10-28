
package Bridge;


public class MobileInterface extends UserInterface {
    public MobileInterface(Renderer renderer) {
        super(renderer);
    }

    @Override
    public void draw() {
        renderer.render("Mobile Interface");
    }
}
