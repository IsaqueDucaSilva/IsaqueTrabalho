
package Bridge;


public class OpenGLRenderer implements Renderer {
    @Override
    public void render(String content) {
        System.out.println("Renderizando com OpenGL: " + content);
    }
}
