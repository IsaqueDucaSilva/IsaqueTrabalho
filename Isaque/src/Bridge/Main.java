
package Bridge;


public class Main {
    public static void main(String[] args) {
        Renderer opengl = new OpenGLRenderer();
        Renderer directx = new DirectXRenderer();

        UserInterface mobileUI = new MobileInterface(opengl);
        UserInterface desktopUI = new DesktopInterface(directx);

        mobileUI.draw();
        desktopUI.draw();
    }
}
