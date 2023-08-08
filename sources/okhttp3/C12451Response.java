package okhttp3;

import com.urbanairship.wallet.C9700d;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.DeprecationLevel;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.C11314h;
import kotlin.jvm.C11315i;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.C12361b;
import okhttp3.Headers;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.http.HttpHeaders;
import okio.C12500m;
import okio.C12507o;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001RB}\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\r\u001a\u00020\n\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0018\u001a\u00020\u001b\u0012\b\u0010%\u001a\u0004\u0018\u00010!\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0000\u0012\b\u0010,\u001a\u0004\u0018\u00010\u0000\u0012\b\u0010.\u001a\u0004\u0018\u00010\u0000\u0012\u0006\u00107\u001a\u00020\u001f\u0012\u0006\u00109\u001a\u00020\u001f\u0012\b\u0010I\u001a\u0004\u0018\u00010H¢\u0006\u0004\bP\u0010QJ\u000f\u0010\u0005\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0011\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0011\u0010\u0015\u001a\u0004\u0018\u00010\u0012H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00172\u0006\u0010\u0016\u001a\u00020\u000eJ\u001e\u0010\u001a\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0016\u001a\u00020\u000e2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u000eH\u0007J\u000f\u0010\u0018\u001a\u00020\u001bH\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0006\u0010\u001e\u001a\u00020\u001bJ\u000e\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020\u001fJ\u0011\u0010%\u001a\u0004\u0018\u00010!H\u0007¢\u0006\u0004\b#\u0010$J\u0006\u0010'\u001a\u00020&J\u0011\u0010*\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b(\u0010)J\u0011\u0010,\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b+\u0010)J\u0011\u0010.\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b-\u0010)J\f\u00100\u001a\b\u0012\u0004\u0012\u00020/0\u0017J\u000f\u00104\u001a\u000201H\u0007¢\u0006\u0004\b2\u00103J\u000f\u00107\u001a\u00020\u001fH\u0007¢\u0006\u0004\b5\u00106J\u000f\u00109\u001a\u00020\u001fH\u0007¢\u0006\u0004\b8\u00106J\b\u0010;\u001a\u00020:H\u0016J\b\u0010<\u001a\u00020\u000eH\u0016R\u0018\u0010=\u001a\u0004\u0018\u0001018\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0017\u0010\u0005\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0005\u0010?\u001a\u0004\b\u0005\u0010\u0004R\u0017\u0010\t\u001a\u00020\u00068\u0007¢\u0006\f\n\u0004\b\t\u0010@\u001a\u0004\b\t\u0010\bR\u0017\u0010\u0011\u001a\u00020\u000e8\u0007¢\u0006\f\n\u0004\b\u0011\u0010A\u001a\u0004\b\u0011\u0010\u0010R\u0017\u0010\r\u001a\u00020\n8\u0007¢\u0006\f\n\u0004\b\r\u0010B\u001a\u0004\b\r\u0010\fR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0007¢\u0006\f\n\u0004\b\u0015\u0010C\u001a\u0004\b\u0015\u0010\u0014R\u0017\u0010\u0018\u001a\u00020\u001b8\u0007¢\u0006\f\n\u0004\b\u0018\u0010D\u001a\u0004\b\u0018\u0010\u001dR\u0019\u0010%\u001a\u0004\u0018\u00010!8\u0007¢\u0006\f\n\u0004\b%\u0010E\u001a\u0004\b%\u0010$R\u0019\u0010*\u001a\u0004\u0018\u00010\u00008\u0007¢\u0006\f\n\u0004\b*\u0010F\u001a\u0004\b*\u0010)R\u0019\u0010,\u001a\u0004\u0018\u00010\u00008\u0007¢\u0006\f\n\u0004\b,\u0010F\u001a\u0004\b,\u0010)R\u0019\u0010.\u001a\u0004\u0018\u00010\u00008\u0007¢\u0006\f\n\u0004\b.\u0010F\u001a\u0004\b.\u0010)R\u0017\u00107\u001a\u00020\u001f8\u0007¢\u0006\f\n\u0004\b7\u0010G\u001a\u0004\b7\u00106R\u0017\u00109\u001a\u00020\u001f8\u0007¢\u0006\f\n\u0004\b9\u0010G\u001a\u0004\b9\u00106R\u001c\u0010I\u001a\u0004\u0018\u00010H8\u0001X\u0004¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bI\u0010KR\u0011\u0010M\u001a\u00020L8F¢\u0006\u0006\u001a\u0004\bM\u0010NR\u0011\u0010O\u001a\u00020L8F¢\u0006\u0006\u001a\u0004\bO\u0010NR\u0011\u00104\u001a\u0002018G¢\u0006\u0006\u001a\u0004\b4\u00103¨\u0006S"}, mo22516d2 = {"Lokhttp3/Response;", "Ljava/io/Closeable;", "Lokhttp3/Request;", "-deprecated_request", "()Lokhttp3/Request;", "request", "Lokhttp3/Protocol;", "-deprecated_protocol", "()Lokhttp3/Protocol;", "protocol", "", "-deprecated_code", "()I", "code", "", "-deprecated_message", "()Ljava/lang/String;", "message", "Lokhttp3/Handshake;", "-deprecated_handshake", "()Lokhttp3/Handshake;", "handshake", "name", "", "headers", "defaultValue", "header", "Lokhttp3/Headers;", "-deprecated_headers", "()Lokhttp3/Headers;", "trailers", "", "byteCount", "Lokhttp3/ResponseBody;", "peekBody", "-deprecated_body", "()Lokhttp3/ResponseBody;", "body", "Lokhttp3/Response$Builder;", "newBuilder", "-deprecated_networkResponse", "()Lokhttp3/Response;", "networkResponse", "-deprecated_cacheResponse", "cacheResponse", "-deprecated_priorResponse", "priorResponse", "Lokhttp3/Challenge;", "challenges", "Lokhttp3/CacheControl;", "-deprecated_cacheControl", "()Lokhttp3/CacheControl;", "cacheControl", "-deprecated_sentRequestAtMillis", "()J", "sentRequestAtMillis", "-deprecated_receivedResponseAtMillis", "receivedResponseAtMillis", "Lkotlin/d2;", "close", "toString", "lazyCacheControl", "Lokhttp3/CacheControl;", "Lokhttp3/Request;", "Lokhttp3/Protocol;", "Ljava/lang/String;", "I", "Lokhttp3/Handshake;", "Lokhttp3/Headers;", "Lokhttp3/ResponseBody;", "Lokhttp3/Response;", "J", "Lokhttp3/internal/connection/Exchange;", "exchange", "Lokhttp3/internal/connection/Exchange;", "()Lokhttp3/internal/connection/Exchange;", "", "isSuccessful", "()Z", "isRedirect", "<init>", "(Lokhttp3/Request;Lokhttp3/Protocol;Ljava/lang/String;ILokhttp3/Handshake;Lokhttp3/Headers;Lokhttp3/ResponseBody;Lokhttp3/Response;Lokhttp3/Response;Lokhttp3/Response;JJLokhttp3/internal/connection/Exchange;)V", "Builder", "okhttp"}, mo22517k = 1, mo22518mv = {1, 4, 0})
/* renamed from: okhttp3.Response */
public final class C12451Response implements Closeable {
    @C12580l
    private final ResponseBody body;
    @C12580l
    private final C12451Response cacheResponse;
    private final int code;
    @C12580l
    private final Exchange exchange;
    @C12580l
    private final Handshake handshake;
    @C12579k
    private final Headers headers;
    private CacheControl lazyCacheControl;
    @C12579k
    private final String message;
    @C12580l
    private final C12451Response networkResponse;
    @C12580l
    private final C12451Response priorResponse;
    @C12579k
    private final Protocol protocol;
    private final long receivedResponseAtMillis;
    @C12579k
    private final Request request;
    private final long sentRequestAtMillis;

    public C12451Response(@C12579k Request request2, @C12579k Protocol protocol2, @C12579k String str, int i, @C12580l Handshake handshake2, @C12579k Headers headers2, @C12580l ResponseBody responseBody, @C12580l C12451Response response, @C12580l C12451Response response2, @C12580l C12451Response response3, long j, long j2, @C12580l Exchange exchange2) {
        Intrinsics.checkNotNullParameter(request2, "request");
        Intrinsics.checkNotNullParameter(protocol2, "protocol");
        Intrinsics.checkNotNullParameter(str, "message");
        Intrinsics.checkNotNullParameter(headers2, C9700d.f26570q);
        this.request = request2;
        this.protocol = protocol2;
        this.message = str;
        this.code = i;
        this.handshake = handshake2;
        this.headers = headers2;
        this.body = responseBody;
        this.networkResponse = response;
        this.cacheResponse = response2;
        this.priorResponse = response3;
        this.sentRequestAtMillis = j;
        this.receivedResponseAtMillis = j2;
        this.exchange = exchange2;
    }

    public static /* synthetic */ String header$default(C12451Response response, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return response.header(str, str2);
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @C11587t0(expression = "body", imports = {}))
    @C12580l
    @C11314h(name = "-deprecated_body")
    /* renamed from: -deprecated_body  reason: not valid java name */
    public final ResponseBody m172706deprecated_body() {
        return this.body;
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @C11587t0(expression = "cacheControl", imports = {}))
    @C11314h(name = "-deprecated_cacheControl")
    @C12579k
    /* renamed from: -deprecated_cacheControl  reason: not valid java name */
    public final CacheControl m172707deprecated_cacheControl() {
        return cacheControl();
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @C11587t0(expression = "cacheResponse", imports = {}))
    @C12580l
    @C11314h(name = "-deprecated_cacheResponse")
    /* renamed from: -deprecated_cacheResponse  reason: not valid java name */
    public final C12451Response m172708deprecated_cacheResponse() {
        return this.cacheResponse;
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @C11587t0(expression = "code", imports = {}))
    @C11314h(name = "-deprecated_code")
    /* renamed from: -deprecated_code  reason: not valid java name */
    public final int m172709deprecated_code() {
        return this.code;
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @C11587t0(expression = "handshake", imports = {}))
    @C12580l
    @C11314h(name = "-deprecated_handshake")
    /* renamed from: -deprecated_handshake  reason: not valid java name */
    public final Handshake m172710deprecated_handshake() {
        return this.handshake;
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @C11587t0(expression = "headers", imports = {}))
    @C11314h(name = "-deprecated_headers")
    @C12579k
    /* renamed from: -deprecated_headers  reason: not valid java name */
    public final Headers m172711deprecated_headers() {
        return this.headers;
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @C11587t0(expression = "message", imports = {}))
    @C11314h(name = "-deprecated_message")
    @C12579k
    /* renamed from: -deprecated_message  reason: not valid java name */
    public final String m172712deprecated_message() {
        return this.message;
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @C11587t0(expression = "networkResponse", imports = {}))
    @C12580l
    @C11314h(name = "-deprecated_networkResponse")
    /* renamed from: -deprecated_networkResponse  reason: not valid java name */
    public final C12451Response m172713deprecated_networkResponse() {
        return this.networkResponse;
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @C11587t0(expression = "priorResponse", imports = {}))
    @C12580l
    @C11314h(name = "-deprecated_priorResponse")
    /* renamed from: -deprecated_priorResponse  reason: not valid java name */
    public final C12451Response m172714deprecated_priorResponse() {
        return this.priorResponse;
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @C11587t0(expression = "protocol", imports = {}))
    @C11314h(name = "-deprecated_protocol")
    @C12579k
    /* renamed from: -deprecated_protocol  reason: not valid java name */
    public final Protocol m172715deprecated_protocol() {
        return this.protocol;
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @C11587t0(expression = "receivedResponseAtMillis", imports = {}))
    @C11314h(name = "-deprecated_receivedResponseAtMillis")
    /* renamed from: -deprecated_receivedResponseAtMillis  reason: not valid java name */
    public final long m172716deprecated_receivedResponseAtMillis() {
        return this.receivedResponseAtMillis;
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @C11587t0(expression = "request", imports = {}))
    @C11314h(name = "-deprecated_request")
    @C12579k
    /* renamed from: -deprecated_request  reason: not valid java name */
    public final Request m172717deprecated_request() {
        return this.request;
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @C11587t0(expression = "sentRequestAtMillis", imports = {}))
    @C11314h(name = "-deprecated_sentRequestAtMillis")
    /* renamed from: -deprecated_sentRequestAtMillis  reason: not valid java name */
    public final long m172718deprecated_sentRequestAtMillis() {
        return this.sentRequestAtMillis;
    }

    @C12580l
    @C11314h(name = "body")
    public final ResponseBody body() {
        return this.body;
    }

    @C11314h(name = "cacheControl")
    @C12579k
    public final CacheControl cacheControl() {
        CacheControl cacheControl = this.lazyCacheControl;
        if (cacheControl != null) {
            return cacheControl;
        }
        CacheControl parse = CacheControl.Companion.parse(this.headers);
        this.lazyCacheControl = parse;
        return parse;
    }

    @C12580l
    @C11314h(name = "cacheResponse")
    public final C12451Response cacheResponse() {
        return this.cacheResponse;
    }

    @C12579k
    public final List<Challenge> challenges() {
        String str;
        Headers headers2 = this.headers;
        int i = this.code;
        if (i == 401) {
            str = "WWW-Authenticate";
        } else if (i != 407) {
            return CollectionsKt__CollectionsKt.m40441E();
        } else {
            str = "Proxy-Authenticate";
        }
        return HttpHeaders.parseChallenges(headers2, str);
    }

    public void close() {
        ResponseBody responseBody = this.body;
        if (responseBody != null) {
            responseBody.close();
            return;
        }
        throw new IllegalStateException("response is not eligible for a body and must not be closed".toString());
    }

    @C11314h(name = "code")
    public final int code() {
        return this.code;
    }

    @C12580l
    @C11314h(name = "exchange")
    public final Exchange exchange() {
        return this.exchange;
    }

    @C12580l
    @C11314h(name = "handshake")
    public final Handshake handshake() {
        return this.handshake;
    }

    @C12580l
    @C11315i
    public final String header(@C12579k String str) {
        return header$default(this, str, (String) null, 2, (Object) null);
    }

    @C11314h(name = "headers")
    @C12579k
    public final Headers headers() {
        return this.headers;
    }

    public final boolean isRedirect() {
        int i = this.code;
        if (!(i == 307 || i == 308)) {
            switch (i) {
                case 300:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    public final boolean isSuccessful() {
        int i = this.code;
        return 200 <= i && 299 >= i;
    }

    @C11314h(name = "message")
    @C12579k
    public final String message() {
        return this.message;
    }

    @C12580l
    @C11314h(name = "networkResponse")
    public final C12451Response networkResponse() {
        return this.networkResponse;
    }

    @C12579k
    public final Builder newBuilder() {
        return new Builder(this);
    }

    @C12579k
    public final ResponseBody peekBody(long j) throws IOException {
        ResponseBody responseBody = this.body;
        Intrinsics.checkNotNull(responseBody);
        C12507o R3 = responseBody.source().mo27281R3();
        C12500m mVar = new C12500m();
        R3.mo27269E1(j);
        mVar.mo27239s3(R3, Math.min(j, R3.mo27292e().mo27362c0()));
        return ResponseBody.Companion.create((C12507o) mVar, this.body.contentType(), mVar.mo27362c0());
    }

    @C12580l
    @C11314h(name = "priorResponse")
    public final C12451Response priorResponse() {
        return this.priorResponse;
    }

    @C11314h(name = "protocol")
    @C12579k
    public final Protocol protocol() {
        return this.protocol;
    }

    @C11314h(name = "receivedResponseAtMillis")
    public final long receivedResponseAtMillis() {
        return this.receivedResponseAtMillis;
    }

    @C11314h(name = "request")
    @C12579k
    public final Request request() {
        return this.request;
    }

    @C11314h(name = "sentRequestAtMillis")
    public final long sentRequestAtMillis() {
        return this.sentRequestAtMillis;
    }

    @C12579k
    public String toString() {
        return "Response{protocol=" + this.protocol + ", code=" + this.code + ", message=" + this.message + ", url=" + this.request.url() + C12361b.f30259j;
    }

    @C12579k
    public final Headers trailers() throws IOException {
        Exchange exchange2 = this.exchange;
        if (exchange2 != null) {
            return exchange2.trailers();
        }
        throw new IllegalStateException("trailers not available".toString());
    }

    @C12580l
    @C11315i
    public final String header(@C12579k String str, @C12580l String str2) {
        Intrinsics.checkNotNullParameter(str, "name");
        String str3 = this.headers.get(str);
        return str3 != null ? str3 : str2;
    }

    @C12579k
    public final List<String> headers(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "name");
        return this.headers.values(str);
    }

    @C11076d0(mo22515d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\"\b\u0016\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b_\u0010`B\u0011\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b_\u0010NJ\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u0012\u0010\b\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u0010\u0010\n\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0012\u0010\u0011\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016J\u0018\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0002H\u0016J\u0018\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0002H\u0016J\u0010\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J\u0012\u0010\u0019\u001a\u00020\u00002\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016J\u0012\u0010\u001a\u001a\u00020\u00002\b\u0010\u001a\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010\u001b\u001a\u00020\u00002\b\u0010\u001b\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010\u001c\u001a\u00020\u00002\b\u0010\u001c\u001a\u0004\u0018\u00010\u0004H\u0016J\u0010\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001dH\u0016J\u0010\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001dH\u0016J\u0017\u0010$\u001a\u00020\u00062\u0006\u0010!\u001a\u00020 H\u0000¢\u0006\u0004\b\"\u0010#J\b\u0010%\u001a\u00020\u0004H\u0016R$\u0010\n\u001a\u0004\u0018\u00010\t8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\n\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R$\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\f\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u0010\u000e\u001a\u00020\r8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u000e\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R$\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u000f\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R$\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010\u0017\u001a\u00020?8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR$\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR$\u0010\u001a\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR$\u0010\u001b\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010J\u001a\u0004\bO\u0010L\"\u0004\bP\u0010NR$\u0010\u001c\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010J\u001a\u0004\bQ\u0010L\"\u0004\bR\u0010NR\"\u0010\u001e\u001a\u00020\u001d8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\"\u0010\u001f\u001a\u00020\u001d8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010S\u001a\u0004\bX\u0010U\"\u0004\bY\u0010WR$\u0010Z\u001a\u0004\u0018\u00010 8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010#¨\u0006a"}, mo22516d2 = {"Lokhttp3/Response$Builder;", "", "", "name", "Lokhttp3/Response;", "response", "Lkotlin/d2;", "checkSupportResponse", "checkPriorResponse", "Lokhttp3/Request;", "request", "Lokhttp3/Protocol;", "protocol", "", "code", "message", "Lokhttp3/Handshake;", "handshake", "value", "header", "addHeader", "removeHeader", "Lokhttp3/Headers;", "headers", "Lokhttp3/ResponseBody;", "body", "networkResponse", "cacheResponse", "priorResponse", "", "sentRequestAtMillis", "receivedResponseAtMillis", "Lokhttp3/internal/connection/Exchange;", "deferredTrailers", "initExchange$okhttp", "(Lokhttp3/internal/connection/Exchange;)V", "initExchange", "build", "Lokhttp3/Request;", "getRequest$okhttp", "()Lokhttp3/Request;", "setRequest$okhttp", "(Lokhttp3/Request;)V", "Lokhttp3/Protocol;", "getProtocol$okhttp", "()Lokhttp3/Protocol;", "setProtocol$okhttp", "(Lokhttp3/Protocol;)V", "I", "getCode$okhttp", "()I", "setCode$okhttp", "(I)V", "Ljava/lang/String;", "getMessage$okhttp", "()Ljava/lang/String;", "setMessage$okhttp", "(Ljava/lang/String;)V", "Lokhttp3/Handshake;", "getHandshake$okhttp", "()Lokhttp3/Handshake;", "setHandshake$okhttp", "(Lokhttp3/Handshake;)V", "Lokhttp3/Headers$Builder;", "Lokhttp3/Headers$Builder;", "getHeaders$okhttp", "()Lokhttp3/Headers$Builder;", "setHeaders$okhttp", "(Lokhttp3/Headers$Builder;)V", "Lokhttp3/ResponseBody;", "getBody$okhttp", "()Lokhttp3/ResponseBody;", "setBody$okhttp", "(Lokhttp3/ResponseBody;)V", "Lokhttp3/Response;", "getNetworkResponse$okhttp", "()Lokhttp3/Response;", "setNetworkResponse$okhttp", "(Lokhttp3/Response;)V", "getCacheResponse$okhttp", "setCacheResponse$okhttp", "getPriorResponse$okhttp", "setPriorResponse$okhttp", "J", "getSentRequestAtMillis$okhttp", "()J", "setSentRequestAtMillis$okhttp", "(J)V", "getReceivedResponseAtMillis$okhttp", "setReceivedResponseAtMillis$okhttp", "exchange", "Lokhttp3/internal/connection/Exchange;", "getExchange$okhttp", "()Lokhttp3/internal/connection/Exchange;", "setExchange$okhttp", "<init>", "()V", "okhttp"}, mo22517k = 1, mo22518mv = {1, 4, 0})
    /* renamed from: okhttp3.Response$Builder */
    public static class Builder {
        @C12580l
        private ResponseBody body;
        @C12580l
        private C12451Response cacheResponse;
        private int code;
        @C12580l
        private Exchange exchange;
        @C12580l
        private Handshake handshake;
        @C12579k
        private Headers.Builder headers;
        @C12580l
        private String message;
        @C12580l
        private C12451Response networkResponse;
        @C12580l
        private C12451Response priorResponse;
        @C12580l
        private Protocol protocol;
        private long receivedResponseAtMillis;
        @C12580l
        private Request request;
        private long sentRequestAtMillis;

        public Builder() {
            this.code = -1;
            this.headers = new Headers.Builder();
        }

        private final void checkPriorResponse(C12451Response response) {
            if (response != null) {
                if (!(response.body() == null)) {
                    throw new IllegalArgumentException("priorResponse.body != null".toString());
                }
            }
        }

        private final void checkSupportResponse(String str, C12451Response response) {
            boolean z;
            boolean z2;
            boolean z3;
            if (response != null) {
                boolean z4 = true;
                if (response.body() == null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    if (response.networkResponse() == null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        if (response.cacheResponse() == null) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z3) {
                            if (response.priorResponse() != null) {
                                z4 = false;
                            }
                            if (!z4) {
                                throw new IllegalArgumentException((str + ".priorResponse != null").toString());
                            }
                            return;
                        }
                        throw new IllegalArgumentException((str + ".cacheResponse != null").toString());
                    }
                    throw new IllegalArgumentException((str + ".networkResponse != null").toString());
                }
                throw new IllegalArgumentException((str + ".body != null").toString());
            }
        }

        @C12579k
        public Builder addHeader(@C12579k String str, @C12579k String str2) {
            Intrinsics.checkNotNullParameter(str, "name");
            Intrinsics.checkNotNullParameter(str2, "value");
            this.headers.add(str, str2);
            return this;
        }

        @C12579k
        public Builder body(@C12580l ResponseBody responseBody) {
            this.body = responseBody;
            return this;
        }

        @C12579k
        public C12451Response build() {
            boolean z;
            int i = this.code;
            if (i >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                Request request2 = this.request;
                if (request2 != null) {
                    Protocol protocol2 = this.protocol;
                    if (protocol2 != null) {
                        String str = this.message;
                        if (str != null) {
                            return new C12451Response(request2, protocol2, str, i, this.handshake, this.headers.build(), this.body, this.networkResponse, this.cacheResponse, this.priorResponse, this.sentRequestAtMillis, this.receivedResponseAtMillis, this.exchange);
                        }
                        throw new IllegalStateException("message == null".toString());
                    }
                    throw new IllegalStateException("protocol == null".toString());
                }
                throw new IllegalStateException("request == null".toString());
            }
            throw new IllegalStateException(("code < 0: " + this.code).toString());
        }

        @C12579k
        public Builder cacheResponse(@C12580l C12451Response response) {
            checkSupportResponse("cacheResponse", response);
            this.cacheResponse = response;
            return this;
        }

        @C12579k
        public Builder code(int i) {
            this.code = i;
            return this;
        }

        @C12580l
        public final ResponseBody getBody$okhttp() {
            return this.body;
        }

        @C12580l
        public final C12451Response getCacheResponse$okhttp() {
            return this.cacheResponse;
        }

        public final int getCode$okhttp() {
            return this.code;
        }

        @C12580l
        public final Exchange getExchange$okhttp() {
            return this.exchange;
        }

        @C12580l
        public final Handshake getHandshake$okhttp() {
            return this.handshake;
        }

        @C12579k
        public final Headers.Builder getHeaders$okhttp() {
            return this.headers;
        }

        @C12580l
        public final String getMessage$okhttp() {
            return this.message;
        }

        @C12580l
        public final C12451Response getNetworkResponse$okhttp() {
            return this.networkResponse;
        }

        @C12580l
        public final C12451Response getPriorResponse$okhttp() {
            return this.priorResponse;
        }

        @C12580l
        public final Protocol getProtocol$okhttp() {
            return this.protocol;
        }

        public final long getReceivedResponseAtMillis$okhttp() {
            return this.receivedResponseAtMillis;
        }

        @C12580l
        public final Request getRequest$okhttp() {
            return this.request;
        }

        public final long getSentRequestAtMillis$okhttp() {
            return this.sentRequestAtMillis;
        }

        @C12579k
        public Builder handshake(@C12580l Handshake handshake2) {
            this.handshake = handshake2;
            return this;
        }

        @C12579k
        public Builder header(@C12579k String str, @C12579k String str2) {
            Intrinsics.checkNotNullParameter(str, "name");
            Intrinsics.checkNotNullParameter(str2, "value");
            this.headers.set(str, str2);
            return this;
        }

        @C12579k
        public Builder headers(@C12579k Headers headers2) {
            Intrinsics.checkNotNullParameter(headers2, C9700d.f26570q);
            this.headers = headers2.newBuilder();
            return this;
        }

        public final void initExchange$okhttp(@C12579k Exchange exchange2) {
            Intrinsics.checkNotNullParameter(exchange2, "deferredTrailers");
            this.exchange = exchange2;
        }

        @C12579k
        public Builder message(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "message");
            this.message = str;
            return this;
        }

        @C12579k
        public Builder networkResponse(@C12580l C12451Response response) {
            checkSupportResponse("networkResponse", response);
            this.networkResponse = response;
            return this;
        }

        @C12579k
        public Builder priorResponse(@C12580l C12451Response response) {
            checkPriorResponse(response);
            this.priorResponse = response;
            return this;
        }

        @C12579k
        public Builder protocol(@C12579k Protocol protocol2) {
            Intrinsics.checkNotNullParameter(protocol2, "protocol");
            this.protocol = protocol2;
            return this;
        }

        @C12579k
        public Builder receivedResponseAtMillis(long j) {
            this.receivedResponseAtMillis = j;
            return this;
        }

        @C12579k
        public Builder removeHeader(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "name");
            this.headers.removeAll(str);
            return this;
        }

        @C12579k
        public Builder request(@C12579k Request request2) {
            Intrinsics.checkNotNullParameter(request2, "request");
            this.request = request2;
            return this;
        }

        @C12579k
        public Builder sentRequestAtMillis(long j) {
            this.sentRequestAtMillis = j;
            return this;
        }

        public final void setBody$okhttp(@C12580l ResponseBody responseBody) {
            this.body = responseBody;
        }

        public final void setCacheResponse$okhttp(@C12580l C12451Response response) {
            this.cacheResponse = response;
        }

        public final void setCode$okhttp(int i) {
            this.code = i;
        }

        public final void setExchange$okhttp(@C12580l Exchange exchange2) {
            this.exchange = exchange2;
        }

        public final void setHandshake$okhttp(@C12580l Handshake handshake2) {
            this.handshake = handshake2;
        }

        public final void setHeaders$okhttp(@C12579k Headers.Builder builder) {
            Intrinsics.checkNotNullParameter(builder, "<set-?>");
            this.headers = builder;
        }

        public final void setMessage$okhttp(@C12580l String str) {
            this.message = str;
        }

        public final void setNetworkResponse$okhttp(@C12580l C12451Response response) {
            this.networkResponse = response;
        }

        public final void setPriorResponse$okhttp(@C12580l C12451Response response) {
            this.priorResponse = response;
        }

        public final void setProtocol$okhttp(@C12580l Protocol protocol2) {
            this.protocol = protocol2;
        }

        public final void setReceivedResponseAtMillis$okhttp(long j) {
            this.receivedResponseAtMillis = j;
        }

        public final void setRequest$okhttp(@C12580l Request request2) {
            this.request = request2;
        }

        public final void setSentRequestAtMillis$okhttp(long j) {
            this.sentRequestAtMillis = j;
        }

        public Builder(@C12579k C12451Response response) {
            Intrinsics.checkNotNullParameter(response, "response");
            this.code = -1;
            this.request = response.request();
            this.protocol = response.protocol();
            this.code = response.code();
            this.message = response.message();
            this.handshake = response.handshake();
            this.headers = response.headers().newBuilder();
            this.body = response.body();
            this.networkResponse = response.networkResponse();
            this.cacheResponse = response.cacheResponse();
            this.priorResponse = response.priorResponse();
            this.sentRequestAtMillis = response.sentRequestAtMillis();
            this.receivedResponseAtMillis = response.receivedResponseAtMillis();
            this.exchange = response.exchange();
        }
    }
}
