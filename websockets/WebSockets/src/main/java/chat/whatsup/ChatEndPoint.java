package chat.whatsup;

import jakarta.websocket.OnOpen;
import jakarta.websocket.server.ServerEndpoint;

@ServerEndpoint("/chat/{username}")
public class ChatEndPoint{
    @OnOpen
    public void onOpen() {

    }

}
