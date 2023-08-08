package okhttp3.internal.p013ws;

import androidx.core.app.C17075f2;
import androidx.core.view.C18124b2;
import com.google.zxing.client.android.C34651e;
import java.io.Closeable;
import java.io.IOException;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.C12451Response;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Request;
import okhttp3.internal.Util;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.p013ws.RealWebSocket;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\u000b"}, mo22516d2 = {"okhttp3/internal/ws/RealWebSocket$connect$1", "Lokhttp3/Callback;", "Lokhttp3/Call;", "call", "Lokhttp3/Response;", "response", "Lkotlin/d2;", "onResponse", "Ljava/io/IOException;", "e", "onFailure", "okhttp"}, mo22517k = 1, mo22518mv = {1, 4, 0})
/* renamed from: okhttp3.internal.ws.RealWebSocket$connect$1 */
public final class RealWebSocket$connect$1 implements Callback {
    final /* synthetic */ Request $request;
    final /* synthetic */ RealWebSocket this$0;

    public RealWebSocket$connect$1(RealWebSocket realWebSocket, Request request) {
        this.this$0 = realWebSocket;
        this.$request = request;
    }

    public void onFailure(@C12579k Call call, @C12579k IOException iOException) {
        Intrinsics.checkNotNullParameter(call, C17075f2.f45104q0);
        Intrinsics.checkNotNullParameter(iOException, C34651e.f83829d);
        this.this$0.failWebSocket(iOException, (C12451Response) null);
    }

    public void onResponse(@C12579k Call call, @C12579k C12451Response response) {
        Intrinsics.checkNotNullParameter(call, C17075f2.f45104q0);
        Intrinsics.checkNotNullParameter(response, "response");
        Exchange exchange = response.exchange();
        try {
            this.this$0.checkUpgradeSuccess$okhttp(response, exchange);
            Intrinsics.checkNotNull(exchange);
            RealWebSocket.Streams newWebSocketStreams = exchange.newWebSocketStreams();
            WebSocketExtensions parse = WebSocketExtensions.Companion.parse(response.headers());
            this.this$0.extensions = parse;
            if (!this.this$0.isValid(parse)) {
                synchronized (this.this$0) {
                    this.this$0.messageAndCloseQueue.clear();
                    this.this$0.close(C18124b2.f46733l, "unexpected Sec-WebSocket-Extensions in response header");
                }
            }
            try {
                this.this$0.initReaderAndWriter(Util.okHttpName + " WebSocket " + this.$request.url().redact(), newWebSocketStreams);
                this.this$0.getListener$okhttp().onOpen(this.this$0, response);
                this.this$0.loopReader();
            } catch (Exception e) {
                this.this$0.failWebSocket(e, (C12451Response) null);
            }
        } catch (IOException e2) {
            if (exchange != null) {
                exchange.webSocketUpgradeFailed();
            }
            this.this$0.failWebSocket(e2, response);
            Util.closeQuietly((Closeable) response);
        }
    }
}
