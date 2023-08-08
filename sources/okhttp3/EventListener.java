package okhttp3;

import androidx.core.app.C17075f2;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.C11287e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\b&\u0018\u0000 @2\u00020\u0001:\u0002@AB\u0007¢\u0006\u0004\b>\u0010?J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J+\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0011\u0010\f\u001a\r\u0012\t\u0012\u00070\n¢\u0006\u0002\b\u000b0\tH\u0016J\u0018\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J+\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0011\u0010\u0012\u001a\r\u0012\t\u0012\u00070\u0011¢\u0006\u0002\b\u000b0\tH\u0016J \u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\nH\u0016J\u0010\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001a\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016J*\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\n2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016J2\u0010!\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\n2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010 \u001a\u00020\u001fH\u0016J\u0018\u0010$\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"H\u0016J\u0018\u0010%\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"H\u0016J\u0010\u0010&\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010)\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010(\u001a\u00020'H\u0016J\u0010\u0010*\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010-\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010,\u001a\u00020+H\u0016J\u0018\u0010.\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001fH\u0016J\u0010\u0010/\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u00102\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00101\u001a\u000200H\u0016J\u0010\u00103\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u00104\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010,\u001a\u00020+H\u0016J\u0018\u00105\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001fH\u0016J\u0010\u00106\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u00107\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001fH\u0016J\u0010\u00108\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u00109\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00101\u001a\u000200H\u0016J\u0018\u0010:\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00101\u001a\u000200H\u0016J\u0010\u0010;\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010=\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010<\u001a\u000200H\u0016¨\u0006B"}, mo22516d2 = {"Lokhttp3/EventListener;", "", "Lokhttp3/Call;", "call", "Lkotlin/d2;", "callStart", "Lokhttp3/HttpUrl;", "url", "proxySelectStart", "", "Ljava/net/Proxy;", "Lkotlin/jvm/n;", "proxies", "proxySelectEnd", "", "domainName", "dnsStart", "Ljava/net/InetAddress;", "inetAddressList", "dnsEnd", "Ljava/net/InetSocketAddress;", "inetSocketAddress", "proxy", "connectStart", "secureConnectStart", "Lokhttp3/Handshake;", "handshake", "secureConnectEnd", "Lokhttp3/Protocol;", "protocol", "connectEnd", "Ljava/io/IOException;", "ioe", "connectFailed", "Lokhttp3/Connection;", "connection", "connectionAcquired", "connectionReleased", "requestHeadersStart", "Lokhttp3/Request;", "request", "requestHeadersEnd", "requestBodyStart", "", "byteCount", "requestBodyEnd", "requestFailed", "responseHeadersStart", "Lokhttp3/Response;", "response", "responseHeadersEnd", "responseBodyStart", "responseBodyEnd", "responseFailed", "callEnd", "callFailed", "canceled", "satisfactionFailure", "cacheHit", "cacheMiss", "cachedResponse", "cacheConditionalHit", "<init>", "()V", "Companion", "Factory", "okhttp"}, mo22517k = 1, mo22518mv = {1, 4, 0})
public abstract class EventListener {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @C12579k
    @C11287e
    public static final EventListener NONE = new EventListener$Companion$NONE$1();

    @C11076d0(mo22514bv = {1, 0, 3}, mo22515d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, mo22516d2 = {"Lokhttp3/EventListener$Companion;", "", "()V", "NONE", "Lokhttp3/EventListener;", "okhttp"}, mo22517k = 1, mo22518mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @C11076d0(mo22514bv = {1, 0, 3}, mo22515d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, mo22516d2 = {"Lokhttp3/EventListener$Factory;", "", "create", "Lokhttp3/EventListener;", "call", "Lokhttp3/Call;", "okhttp"}, mo22517k = 1, mo22518mv = {1, 4, 0})
    public interface Factory {
        @C12579k
        EventListener create(@C12579k Call call);
    }

    public void cacheConditionalHit(@C12579k Call call, @C12579k C12451Response response) {
        Intrinsics.checkNotNullParameter(call, C17075f2.f45104q0);
        Intrinsics.checkNotNullParameter(response, "cachedResponse");
    }

    public void cacheHit(@C12579k Call call, @C12579k C12451Response response) {
        Intrinsics.checkNotNullParameter(call, C17075f2.f45104q0);
        Intrinsics.checkNotNullParameter(response, "response");
    }

    public void cacheMiss(@C12579k Call call) {
        Intrinsics.checkNotNullParameter(call, C17075f2.f45104q0);
    }

    public void callEnd(@C12579k Call call) {
        Intrinsics.checkNotNullParameter(call, C17075f2.f45104q0);
    }

    public void callFailed(@C12579k Call call, @C12579k IOException iOException) {
        Intrinsics.checkNotNullParameter(call, C17075f2.f45104q0);
        Intrinsics.checkNotNullParameter(iOException, "ioe");
    }

    public void callStart(@C12579k Call call) {
        Intrinsics.checkNotNullParameter(call, C17075f2.f45104q0);
    }

    public void canceled(@C12579k Call call) {
        Intrinsics.checkNotNullParameter(call, C17075f2.f45104q0);
    }

    public void connectEnd(@C12579k Call call, @C12579k InetSocketAddress inetSocketAddress, @C12579k Proxy proxy, @C12580l Protocol protocol) {
        Intrinsics.checkNotNullParameter(call, C17075f2.f45104q0);
        Intrinsics.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
    }

    public void connectFailed(@C12579k Call call, @C12579k InetSocketAddress inetSocketAddress, @C12579k Proxy proxy, @C12580l Protocol protocol, @C12579k IOException iOException) {
        Intrinsics.checkNotNullParameter(call, C17075f2.f45104q0);
        Intrinsics.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
        Intrinsics.checkNotNullParameter(iOException, "ioe");
    }

    public void connectStart(@C12579k Call call, @C12579k InetSocketAddress inetSocketAddress, @C12579k Proxy proxy) {
        Intrinsics.checkNotNullParameter(call, C17075f2.f45104q0);
        Intrinsics.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
    }

    public void connectionAcquired(@C12579k Call call, @C12579k Connection connection) {
        Intrinsics.checkNotNullParameter(call, C17075f2.f45104q0);
        Intrinsics.checkNotNullParameter(connection, "connection");
    }

    public void connectionReleased(@C12579k Call call, @C12579k Connection connection) {
        Intrinsics.checkNotNullParameter(call, C17075f2.f45104q0);
        Intrinsics.checkNotNullParameter(connection, "connection");
    }

    public void dnsEnd(@C12579k Call call, @C12579k String str, @C12579k List<InetAddress> list) {
        Intrinsics.checkNotNullParameter(call, C17075f2.f45104q0);
        Intrinsics.checkNotNullParameter(str, "domainName");
        Intrinsics.checkNotNullParameter(list, "inetAddressList");
    }

    public void dnsStart(@C12579k Call call, @C12579k String str) {
        Intrinsics.checkNotNullParameter(call, C17075f2.f45104q0);
        Intrinsics.checkNotNullParameter(str, "domainName");
    }

    public void proxySelectEnd(@C12579k Call call, @C12579k HttpUrl httpUrl, @C12579k List<Proxy> list) {
        Intrinsics.checkNotNullParameter(call, C17075f2.f45104q0);
        Intrinsics.checkNotNullParameter(httpUrl, "url");
        Intrinsics.checkNotNullParameter(list, "proxies");
    }

    public void proxySelectStart(@C12579k Call call, @C12579k HttpUrl httpUrl) {
        Intrinsics.checkNotNullParameter(call, C17075f2.f45104q0);
        Intrinsics.checkNotNullParameter(httpUrl, "url");
    }

    public void requestBodyEnd(@C12579k Call call, long j) {
        Intrinsics.checkNotNullParameter(call, C17075f2.f45104q0);
    }

    public void requestBodyStart(@C12579k Call call) {
        Intrinsics.checkNotNullParameter(call, C17075f2.f45104q0);
    }

    public void requestFailed(@C12579k Call call, @C12579k IOException iOException) {
        Intrinsics.checkNotNullParameter(call, C17075f2.f45104q0);
        Intrinsics.checkNotNullParameter(iOException, "ioe");
    }

    public void requestHeadersEnd(@C12579k Call call, @C12579k Request request) {
        Intrinsics.checkNotNullParameter(call, C17075f2.f45104q0);
        Intrinsics.checkNotNullParameter(request, "request");
    }

    public void requestHeadersStart(@C12579k Call call) {
        Intrinsics.checkNotNullParameter(call, C17075f2.f45104q0);
    }

    public void responseBodyEnd(@C12579k Call call, long j) {
        Intrinsics.checkNotNullParameter(call, C17075f2.f45104q0);
    }

    public void responseBodyStart(@C12579k Call call) {
        Intrinsics.checkNotNullParameter(call, C17075f2.f45104q0);
    }

    public void responseFailed(@C12579k Call call, @C12579k IOException iOException) {
        Intrinsics.checkNotNullParameter(call, C17075f2.f45104q0);
        Intrinsics.checkNotNullParameter(iOException, "ioe");
    }

    public void responseHeadersEnd(@C12579k Call call, @C12579k C12451Response response) {
        Intrinsics.checkNotNullParameter(call, C17075f2.f45104q0);
        Intrinsics.checkNotNullParameter(response, "response");
    }

    public void responseHeadersStart(@C12579k Call call) {
        Intrinsics.checkNotNullParameter(call, C17075f2.f45104q0);
    }

    public void satisfactionFailure(@C12579k Call call, @C12579k C12451Response response) {
        Intrinsics.checkNotNullParameter(call, C17075f2.f45104q0);
        Intrinsics.checkNotNullParameter(response, "response");
    }

    public void secureConnectEnd(@C12579k Call call, @C12580l Handshake handshake) {
        Intrinsics.checkNotNullParameter(call, C17075f2.f45104q0);
    }

    public void secureConnectStart(@C12579k Call call) {
        Intrinsics.checkNotNullParameter(call, C17075f2.f45104q0);
    }
}
