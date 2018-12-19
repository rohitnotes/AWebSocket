package cn.itsite.awebsoket;

import okhttp3.WebSocket;
import okio.ByteString;

/**
 * @author: leguang
 * @e-mail: langmanleguang@qq.com
 * @version: v0.0.0
 * @blog: https://github.com/leguang
 * @time: 2018/7/13 0013 10:41
 * @description:
 */
public class WebSocketInfo {
    private WebSocket webSocket;
    private String text;
    private ByteString byteString;
    private boolean onOpen;
    private boolean onClosing;
    private boolean onReconnect;

    private WebSocketInfo() {
    }

    WebSocketInfo(WebSocket webSocket) {
        this.webSocket = webSocket;
    }

    WebSocketInfo(WebSocket webSocket, boolean onOpen) {
        this.webSocket = webSocket;
        this.onOpen = onOpen;
    }

    WebSocketInfo(WebSocket webSocket, String text) {
        this.webSocket = webSocket;
        this.text = text;
    }

    WebSocketInfo(WebSocket webSocket, ByteString byteString) {
        this.webSocket = webSocket;
        this.byteString = byteString;
    }

    static WebSocketInfo createReconnect() {
        WebSocketInfo socketInfo = new WebSocketInfo();
        socketInfo.onReconnect = true;
        return socketInfo;
    }

    public WebSocket getWebSocket() {
        return this.webSocket;
    }

    public void setWebSocket(WebSocket webSocket) {
        this.webSocket = webSocket;
    }

    public String getString() {
        return text;
    }

    public void setString(String string) {
        this.text = string;
    }

    public ByteString getByteString() {
        return byteString;
    }

    public void setByteString(ByteString byteString) {
        this.byteString = byteString;
    }

    public boolean isOnOpen() {
        return onOpen;
    }

    public void setOnOpen(boolean onOpen) {
        this.onOpen = onOpen;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isOnReconnect() {
        return onReconnect;
    }

    public void setOnReconnect(boolean onReconnect) {
        this.onReconnect = onReconnect;
    }

    public boolean isOnClosing() {
        return onClosing;
    }

    public void setOnClosing(boolean onClosing) {
        this.onClosing = onClosing;
    }
}
