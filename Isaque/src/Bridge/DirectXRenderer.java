
package Bridge;


public class DirectXRenderer implements Renderer {
    @Override
    public void render(String content) {
        System.out.println("Renderizando com DirectX: " + content);
    }
}
