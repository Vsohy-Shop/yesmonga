package okhttp3;

import kotlin.C11076d0;
import okio.ByteString;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\u0012J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0004H&J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H&J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH&J\u001a\u0010\u000f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006H&J\b\u0010\u0011\u001a\u00020\u0010H&¨\u0006\u0013"}, mo22516d2 = {"Lokhttp3/WebSocket;", "", "Lokhttp3/Request;", "request", "", "queueSize", "", "text", "", "send", "Lokio/ByteString;", "bytes", "", "code", "reason", "close", "Lkotlin/d2;", "cancel", "Factory", "okhttp"}, mo22517k = 1, mo22518mv = {1, 4, 0})
public interface WebSocket {

    @C11076d0(mo22514bv = {1, 0, 3}, mo22515d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0001\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, mo22516d2 = {"Lokhttp3/WebSocket$Factory;", "", "newWebSocket", "Lokhttp3/WebSocket;", "request", "Lokhttp3/Request;", "listener", "Lokhttp3/WebSocketListener;", "okhttp"}, mo22517k = 1, mo22518mv = {1, 4, 0})
    public interface Factory {
        @C12579k
        WebSocket newWebSocket(@C12579k Request request, @C12579k WebSocketListener webSocketListener);
    }

    void cancel();

    boolean close(int i, @C12580l String str);

    long queueSize();

    @C12579k
    Request request();

    boolean send(@C12579k String str);

    boolean send(@C12579k ByteString byteString);
}
