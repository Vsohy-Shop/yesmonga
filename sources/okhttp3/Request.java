package okhttp3;

import com.carrefour.fid.android.shared.constant.C28607x;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.installations.remote.C33122c;
import com.urbanairship.wallet.C9700d;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.C11076d0;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.DeprecationLevel;
import kotlin.Pair;
import kotlin.collections.C10977s0;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.C11314h;
import kotlin.jvm.C11315i;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11622t;
import kotlinx.serialization.json.internal.C12361b;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.internal.Util;
import okhttp3.internal.http.HttpMethod;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22514bv = {1, 0, 3}, mo22515d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001*BA\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0016\u0010\n\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f\u0012\u0004\u0012\u00020\u00010\u000b¢\u0006\u0002\u0010\rJ\u000f\u0010\b\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0002\b\u001bJ\r\u0010\u000f\u001a\u00020\u0010H\u0007¢\u0006\u0002\b\u001cJ\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001e\u001a\u00020\u0005J\r\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\b\u001fJ\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050 2\u0006\u0010\u001e\u001a\u00020\u0005J\r\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\b!J\u0006\u0010\"\u001a\u00020#J\b\u0010$\u001a\u0004\u0018\u00010\u0001J#\u0010$\u001a\u0004\u0018\u0001H%\"\u0004\b\u0000\u0010%2\u000e\u0010&\u001a\n\u0012\u0006\b\u0001\u0012\u0002H%0\f¢\u0006\u0002\u0010'J\b\u0010(\u001a\u00020\u0005H\u0016J\r\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\b)R\u0015\u0010\b\u001a\u0004\u0018\u00010\t8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u00108G¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0011R\u0013\u0010\u0006\u001a\u00020\u00078\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0015R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u0013\u0010\u0004\u001a\u00020\u00058\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0017R$\u0010\n\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f\u0012\u0004\u0012\u00020\u00010\u000bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0002\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u001a¨\u0006+"}, mo22516d2 = {"Lokhttp3/Request;", "", "url", "Lokhttp3/HttpUrl;", "method", "", "headers", "Lokhttp3/Headers;", "body", "Lokhttp3/RequestBody;", "tags", "", "Ljava/lang/Class;", "(Lokhttp3/HttpUrl;Ljava/lang/String;Lokhttp3/Headers;Lokhttp3/RequestBody;Ljava/util/Map;)V", "()Lokhttp3/RequestBody;", "cacheControl", "Lokhttp3/CacheControl;", "()Lokhttp3/CacheControl;", "()Lokhttp3/Headers;", "isHttps", "", "()Z", "lazyCacheControl", "()Ljava/lang/String;", "getTags$okhttp", "()Ljava/util/Map;", "()Lokhttp3/HttpUrl;", "-deprecated_body", "-deprecated_cacheControl", "header", "name", "-deprecated_headers", "", "-deprecated_method", "newBuilder", "Lokhttp3/Request$Builder;", "tag", "T", "type", "(Ljava/lang/Class;)Ljava/lang/Object;", "toString", "-deprecated_url", "Builder", "okhttp"}, mo22517k = 1, mo22518mv = {1, 4, 0})
public final class Request {
    @C12580l
    private final RequestBody body;
    @C12579k
    private final Headers headers;
    private CacheControl lazyCacheControl;
    @C12579k
    private final String method;
    @C12579k
    private final Map<Class<?>, Object> tags;
    @C12579k
    private final HttpUrl url;

    @C11076d0(mo22514bv = {1, 0, 3}, mo22515d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u000f\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0018\u0010%\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\u00132\u0006\u0010'\u001a\u00020\u0013H\u0016J\b\u0010(\u001a\u00020\u0004H\u0016J\u0010\u0010)\u001a\u00020\u00002\u0006\u0010)\u001a\u00020*H\u0016J\u0014\u0010+\u001a\u00020\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0017J\b\u0010,\u001a\u00020\u0000H\u0016J\b\u0010-\u001a\u00020\u0000H\u0016J\u0018\u0010.\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\u00132\u0006\u0010'\u001a\u00020\u0013H\u0016J\u0010\u0010\f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020/H\u0016J\u001a\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0010\u00100\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u00101\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u00102\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u00103\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\u0013H\u0016J-\u00104\u001a\u00020\u0000\"\u0004\b\u0000\u001052\u000e\u00106\u001a\n\u0012\u0006\b\u0000\u0012\u0002H50\u001a2\b\u00104\u001a\u0004\u0018\u0001H5H\u0016¢\u0006\u0002\u00107J\u0012\u00104\u001a\u00020\u00002\b\u00104\u001a\u0004\u0018\u00010\u0001H\u0016J\u0010\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u000208H\u0016J\u0010\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u0013H\u0016J\u0010\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020 H\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R*\u0010\u0018\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001a\u0012\u0004\u0012\u00020\u00010\u0019X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001c\u0010\u001f\u001a\u0004\u0018\u00010 X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u00069"}, mo22516d2 = {"Lokhttp3/Request$Builder;", "", "()V", "request", "Lokhttp3/Request;", "(Lokhttp3/Request;)V", "body", "Lokhttp3/RequestBody;", "getBody$okhttp", "()Lokhttp3/RequestBody;", "setBody$okhttp", "(Lokhttp3/RequestBody;)V", "headers", "Lokhttp3/Headers$Builder;", "getHeaders$okhttp", "()Lokhttp3/Headers$Builder;", "setHeaders$okhttp", "(Lokhttp3/Headers$Builder;)V", "method", "", "getMethod$okhttp", "()Ljava/lang/String;", "setMethod$okhttp", "(Ljava/lang/String;)V", "tags", "", "Ljava/lang/Class;", "getTags$okhttp", "()Ljava/util/Map;", "setTags$okhttp", "(Ljava/util/Map;)V", "url", "Lokhttp3/HttpUrl;", "getUrl$okhttp", "()Lokhttp3/HttpUrl;", "setUrl$okhttp", "(Lokhttp3/HttpUrl;)V", "addHeader", "name", "value", "build", "cacheControl", "Lokhttp3/CacheControl;", "delete", "get", "head", "header", "Lokhttp3/Headers;", "patch", "post", "put", "removeHeader", "tag", "T", "type", "(Ljava/lang/Class;Ljava/lang/Object;)Lokhttp3/Request$Builder;", "Ljava/net/URL;", "okhttp"}, mo22517k = 1, mo22518mv = {1, 4, 0})
    public static class Builder {
        @C12580l
        private RequestBody body;
        @C12579k
        private Headers.Builder headers;
        @C12579k
        private String method;
        @C12579k
        private Map<Class<?>, Object> tags;
        @C12580l
        private HttpUrl url;

        public Builder() {
            this.tags = new LinkedHashMap();
            this.method = "GET";
            this.headers = new Headers.Builder();
        }

        public static /* synthetic */ Builder delete$default(Builder builder, RequestBody requestBody, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    requestBody = Util.EMPTY_REQUEST;
                }
                return builder.delete(requestBody);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: delete");
        }

        @C12579k
        public Builder addHeader(@C12579k String str, @C12579k String str2) {
            Intrinsics.checkNotNullParameter(str, "name");
            Intrinsics.checkNotNullParameter(str2, "value");
            this.headers.add(str, str2);
            return this;
        }

        @C12579k
        public Request build() {
            HttpUrl httpUrl = this.url;
            if (httpUrl != null) {
                return new Request(httpUrl, this.method, this.headers.build(), this.body, Util.toImmutableMap(this.tags));
            }
            throw new IllegalStateException("url == null".toString());
        }

        @C12579k
        public Builder cacheControl(@C12579k CacheControl cacheControl) {
            boolean z;
            Intrinsics.checkNotNullParameter(cacheControl, "cacheControl");
            String cacheControl2 = cacheControl.toString();
            if (cacheControl2.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return removeHeader(C33122c.f80338t);
            }
            return header(C33122c.f80338t, cacheControl2);
        }

        @C12579k
        @C11315i
        public final Builder delete() {
            return delete$default(this, (RequestBody) null, 1, (Object) null);
        }

        @C12579k
        public Builder get() {
            return method("GET", (RequestBody) null);
        }

        @C12580l
        public final RequestBody getBody$okhttp() {
            return this.body;
        }

        @C12579k
        public final Headers.Builder getHeaders$okhttp() {
            return this.headers;
        }

        @C12579k
        public final String getMethod$okhttp() {
            return this.method;
        }

        @C12579k
        public final Map<Class<?>, Object> getTags$okhttp() {
            return this.tags;
        }

        @C12580l
        public final HttpUrl getUrl$okhttp() {
            return this.url;
        }

        @C12579k
        public Builder head() {
            return method("HEAD", (RequestBody) null);
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

        @C12579k
        public Builder method(@C12579k String str, @C12580l RequestBody requestBody) {
            boolean z;
            Intrinsics.checkNotNullParameter(str, FirebaseAnalytics.C32532b.f78973v);
            if (str.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (requestBody == null) {
                    if (!(true ^ HttpMethod.requiresRequestBody(str))) {
                        throw new IllegalArgumentException(("method " + str + " must have a request body.").toString());
                    }
                } else if (!HttpMethod.permitsRequestBody(str)) {
                    throw new IllegalArgumentException(("method " + str + " must not have a request body.").toString());
                }
                this.method = str;
                this.body = requestBody;
                return this;
            }
            throw new IllegalArgumentException("method.isEmpty() == true".toString());
        }

        @C12579k
        public Builder patch(@C12579k RequestBody requestBody) {
            Intrinsics.checkNotNullParameter(requestBody, "body");
            return method("PATCH", requestBody);
        }

        @C12579k
        public Builder post(@C12579k RequestBody requestBody) {
            Intrinsics.checkNotNullParameter(requestBody, "body");
            return method("POST", requestBody);
        }

        @C12579k
        public Builder put(@C12579k RequestBody requestBody) {
            Intrinsics.checkNotNullParameter(requestBody, "body");
            return method("PUT", requestBody);
        }

        @C12579k
        public Builder removeHeader(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "name");
            this.headers.removeAll(str);
            return this;
        }

        public final void setBody$okhttp(@C12580l RequestBody requestBody) {
            this.body = requestBody;
        }

        public final void setHeaders$okhttp(@C12579k Headers.Builder builder) {
            Intrinsics.checkNotNullParameter(builder, "<set-?>");
            this.headers = builder;
        }

        public final void setMethod$okhttp(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.method = str;
        }

        public final void setTags$okhttp(@C12579k Map<Class<?>, Object> map) {
            Intrinsics.checkNotNullParameter(map, "<set-?>");
            this.tags = map;
        }

        public final void setUrl$okhttp(@C12580l HttpUrl httpUrl) {
            this.url = httpUrl;
        }

        @C12579k
        public Builder tag(@C12580l Object obj) {
            return tag(Object.class, obj);
        }

        @C12579k
        public Builder url(@C12579k HttpUrl httpUrl) {
            Intrinsics.checkNotNullParameter(httpUrl, "url");
            this.url = httpUrl;
            return this;
        }

        @C12579k
        @C11315i
        public Builder delete(@C12580l RequestBody requestBody) {
            return method("DELETE", requestBody);
        }

        @C12579k
        public <T> Builder tag(@C12579k Class<? super T> cls, @C12580l T t) {
            Intrinsics.checkNotNullParameter(cls, "type");
            if (t == null) {
                this.tags.remove(cls);
            } else {
                if (this.tags.isEmpty()) {
                    this.tags = new LinkedHashMap();
                }
                Map<Class<?>, Object> map = this.tags;
                Object cast = cls.cast(t);
                Intrinsics.checkNotNull(cast);
                map.put(cls, cast);
            }
            return this;
        }

        @C12579k
        public Builder url(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "url");
            if (C11622t.startsWith(str, "ws:", true)) {
                StringBuilder sb = new StringBuilder();
                sb.append("http:");
                String substring = str.substring(3);
                Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.String).substring(startIndex)");
                sb.append(substring);
                str = sb.toString();
            } else if (C11622t.startsWith(str, "wss:", true)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(C28607x.f70006z);
                String substring2 = str.substring(4);
                Intrinsics.checkNotNullExpressionValue(substring2, "(this as java.lang.String).substring(startIndex)");
                sb2.append(substring2);
                str = sb2.toString();
            }
            return url(HttpUrl.Companion.get(str));
        }

        public Builder(@C12579k Request request) {
            Map<Class<?>, Object> map;
            Intrinsics.checkNotNullParameter(request, "request");
            this.tags = new LinkedHashMap();
            this.url = request.url();
            this.method = request.method();
            this.body = request.body();
            if (request.getTags$okhttp().isEmpty()) {
                map = new LinkedHashMap<>();
            } else {
                map = C10977s0.m41442J0(request.getTags$okhttp());
            }
            this.tags = map;
            this.headers = request.headers().newBuilder();
        }

        @C12579k
        public Builder url(@C12579k URL url2) {
            Intrinsics.checkNotNullParameter(url2, "url");
            HttpUrl.Companion companion = HttpUrl.Companion;
            String url3 = url2.toString();
            Intrinsics.checkNotNullExpressionValue(url3, "url.toString()");
            return url(companion.get(url3));
        }
    }

    public Request(@C12579k HttpUrl httpUrl, @C12579k String str, @C12579k Headers headers2, @C12580l RequestBody requestBody, @C12579k Map<Class<?>, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(httpUrl, "url");
        Intrinsics.checkNotNullParameter(str, FirebaseAnalytics.C32532b.f78973v);
        Intrinsics.checkNotNullParameter(headers2, C9700d.f26570q);
        Intrinsics.checkNotNullParameter(map, "tags");
        this.url = httpUrl;
        this.method = str;
        this.headers = headers2;
        this.body = requestBody;
        this.tags = map;
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @C11587t0(expression = "body", imports = {}))
    @C12580l
    @C11314h(name = "-deprecated_body")
    /* renamed from: -deprecated_body  reason: not valid java name */
    public final RequestBody m172701deprecated_body() {
        return this.body;
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @C11587t0(expression = "cacheControl", imports = {}))
    @C11314h(name = "-deprecated_cacheControl")
    @C12579k
    /* renamed from: -deprecated_cacheControl  reason: not valid java name */
    public final CacheControl m172702deprecated_cacheControl() {
        return cacheControl();
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @C11587t0(expression = "headers", imports = {}))
    @C11314h(name = "-deprecated_headers")
    @C12579k
    /* renamed from: -deprecated_headers  reason: not valid java name */
    public final Headers m172703deprecated_headers() {
        return this.headers;
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @C11587t0(expression = "method", imports = {}))
    @C11314h(name = "-deprecated_method")
    @C12579k
    /* renamed from: -deprecated_method  reason: not valid java name */
    public final String m172704deprecated_method() {
        return this.method;
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @C11587t0(expression = "url", imports = {}))
    @C11314h(name = "-deprecated_url")
    @C12579k
    /* renamed from: -deprecated_url  reason: not valid java name */
    public final HttpUrl m172705deprecated_url() {
        return this.url;
    }

    @C12580l
    @C11314h(name = "body")
    public final RequestBody body() {
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

    @C12579k
    public final Map<Class<?>, Object> getTags$okhttp() {
        return this.tags;
    }

    @C12580l
    public final String header(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "name");
        return this.headers.get(str);
    }

    @C11314h(name = "headers")
    @C12579k
    public final Headers headers() {
        return this.headers;
    }

    public final boolean isHttps() {
        return this.url.isHttps();
    }

    @C11314h(name = "method")
    @C12579k
    public final String method() {
        return this.method;
    }

    @C12579k
    public final Builder newBuilder() {
        return new Builder(this);
    }

    @C12580l
    public final Object tag() {
        return tag(Object.class);
    }

    @C12579k
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Request{method=");
        sb.append(this.method);
        sb.append(", url=");
        sb.append(this.url);
        if (this.headers.size() != 0) {
            sb.append(", headers=[");
            int i = 0;
            for (Object next : this.headers) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt__CollectionsKt.m40459W();
                }
                Pair pair = (Pair) next;
                String str = (String) pair.mo21846a();
                String str2 = (String) pair.mo21847b();
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(str);
                sb.append(C12361b.f30257h);
                sb.append(str2);
                i = i2;
            }
            sb.append(C12361b.f30261l);
        }
        if (!this.tags.isEmpty()) {
            sb.append(", tags=");
            sb.append(this.tags);
        }
        sb.append(C12361b.f30259j);
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    @C11314h(name = "url")
    @C12579k
    public final HttpUrl url() {
        return this.url;
    }

    @C12579k
    public final List<String> headers(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "name");
        return this.headers.values(str);
    }

    @C12580l
    public final <T> T tag(@C12579k Class<? extends T> cls) {
        Intrinsics.checkNotNullParameter(cls, "type");
        return cls.cast(this.tags.get(cls));
    }
}
