package okhttp3.internal.connection;

import kotlin.C11076d0;
import okhttp3.internal.p013ws.RealWebSocket;
import okio.C12505n;
import okio.C12507o;

@C11076d0(mo22515d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, mo22516d2 = {"okhttp3/internal/connection/RealConnection$newWebSocketStreams$1", "Lokhttp3/internal/ws/RealWebSocket$Streams;", "Lkotlin/d2;", "close", "okhttp"}, mo22517k = 1, mo22518mv = {1, 4, 0})
public final class RealConnection$newWebSocketStreams$1 extends RealWebSocket.Streams {
    final /* synthetic */ Exchange $exchange;
    final /* synthetic */ C12505n $sink;
    final /* synthetic */ C12507o $source;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RealConnection$newWebSocketStreams$1(Exchange exchange, C12507o oVar, C12505n nVar, boolean z, C12507o oVar2, C12505n nVar2) {
        super(z, oVar2, nVar2);
        this.$exchange = exchange;
        this.$source = oVar;
        this.$sink = nVar;
    }

    public void close() {
        this.$exchange.bodyComplete(-1, true, true, null);
    }
}
