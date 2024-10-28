
package Bridge;


public abstract class UserInterface {
    protected Renderer renderer;

    protected UserInterface(Renderer renderer) {
        this.renderer = renderer;
    }

    public abstract void draw();
}
