
package Bridge;


public class DesktopInterface extends UserInterface {
    public DesktopInterface(Renderer renderer) {
        super(renderer);
    }

    @Override
    public void draw() {
        renderer.render("Desktop Interface");
    }
}
