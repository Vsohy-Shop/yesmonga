package okhttp3;

import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import kotlin.C11076d0;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.DeprecationLevel;
import kotlin.collections.C10930d1;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.C11314h;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.C11368t0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11622t;
import kotlin.text.StringsKt__StringsKt;
import okhttp3.C12451Response;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.internal.Util;
import okhttp3.internal.cache.CacheRequest;
import okhttp3.internal.cache.CacheStrategy;
import okhttp3.internal.cache.DiskLruCache;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.http.HttpMethod;
import okhttp3.internal.http.StatusLine;
import okhttp3.internal.p012io.FileSystem;
import okhttp3.internal.platform.Platform;
import okio.ByteString;
import okio.C12465c0;
import okio.C12500m;
import okio.C12505n;
import okio.C12506n0;
import okio.C12507o;
import okio.C12510p0;
import okio.C12521t;
import okio.C12522u;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010)\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 K2\u00020\u00012\u00020\u0002:\u0004LKMNB!\b\u0000\u0012\u0006\u0010,\u001a\u00020)\u0012\u0006\u0010&\u001a\u00020$\u0012\u0006\u0010G\u001a\u00020F¢\u0006\u0004\bH\u0010IB\u0019\b\u0016\u0012\u0006\u0010,\u001a\u00020)\u0012\u0006\u0010&\u001a\u00020$¢\u0006\u0004\bH\u0010JJ\u0016\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0018\u00010\u0003R\u00020\u0004H\u0002J\u0019\u0010\r\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0006\u0010\u001b\u001a\u00020\u0006J\u0006\u0010\u001c\u001a\u00020\u0006J\u0006\u0010\u001d\u001a\u00020\u0006J\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eJ\u0006\u0010\"\u001a\u00020!J\u0006\u0010#\u001a\u00020!J\u0006\u0010%\u001a\u00020$J\u0006\u0010&\u001a\u00020$J\b\u0010'\u001a\u00020\u0006H\u0016J\b\u0010(\u001a\u00020\u0006H\u0016J\u000f\u0010,\u001a\u00020)H\u0007¢\u0006\u0004\b*\u0010+J\u0017\u00101\u001a\u00020\u00062\u0006\u0010.\u001a\u00020-H\u0000¢\u0006\u0004\b/\u00100J\u000f\u00104\u001a\u00020\u0006H\u0000¢\u0006\u0004\b2\u00103J\u0006\u00105\u001a\u00020!J\u0006\u00106\u001a\u00020!J\u0006\u00107\u001a\u00020!R\u001a\u00108\u001a\u00020\u00048\u0000X\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\"\u0010#\u001a\u00020!8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b#\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\"\u0010\"\u001a\u00020!8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\"\u0010<\u001a\u0004\bA\u0010>\"\u0004\bB\u0010@R\u0016\u00105\u001a\u00020!8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b5\u0010<R\u0016\u00106\u001a\u00020!8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b6\u0010<R\u0016\u00107\u001a\u00020!8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b7\u0010<R\u0011\u0010D\u001a\u00020C8F¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0011\u0010,\u001a\u00020)8G¢\u0006\u0006\u001a\u0004\b,\u0010+¨\u0006O"}, mo22516d2 = {"Lokhttp3/Cache;", "Ljava/io/Closeable;", "Ljava/io/Flushable;", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "Lokhttp3/internal/cache/DiskLruCache;", "editor", "Lkotlin/d2;", "abortQuietly", "Lokhttp3/Request;", "request", "Lokhttp3/Response;", "get$okhttp", "(Lokhttp3/Request;)Lokhttp3/Response;", "get", "response", "Lokhttp3/internal/cache/CacheRequest;", "put$okhttp", "(Lokhttp3/Response;)Lokhttp3/internal/cache/CacheRequest;", "put", "remove$okhttp", "(Lokhttp3/Request;)V", "remove", "cached", "network", "update$okhttp", "(Lokhttp3/Response;Lokhttp3/Response;)V", "update", "initialize", "delete", "evictAll", "", "", "urls", "", "writeAbortCount", "writeSuccessCount", "", "size", "maxSize", "flush", "close", "Ljava/io/File;", "-deprecated_directory", "()Ljava/io/File;", "directory", "Lokhttp3/internal/cache/CacheStrategy;", "cacheStrategy", "trackResponse$okhttp", "(Lokhttp3/internal/cache/CacheStrategy;)V", "trackResponse", "trackConditionalCacheHit$okhttp", "()V", "trackConditionalCacheHit", "networkCount", "hitCount", "requestCount", "cache", "Lokhttp3/internal/cache/DiskLruCache;", "getCache$okhttp", "()Lokhttp3/internal/cache/DiskLruCache;", "I", "getWriteSuccessCount$okhttp", "()I", "setWriteSuccessCount$okhttp", "(I)V", "getWriteAbortCount$okhttp", "setWriteAbortCount$okhttp", "", "isClosed", "()Z", "Lokhttp3/internal/io/FileSystem;", "fileSystem", "<init>", "(Ljava/io/File;JLokhttp3/internal/io/FileSystem;)V", "(Ljava/io/File;J)V", "Companion", "CacheResponseBody", "Entry", "RealCacheRequest", "okhttp"}, mo22517k = 1, mo22518mv = {1, 4, 0})
public final class Cache implements Closeable, Flushable {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final int ENTRY_BODY = 1;
    private static final int ENTRY_COUNT = 2;
    private static final int ENTRY_METADATA = 0;
    private static final int VERSION = 201105;
    @C12579k
    private final DiskLruCache cache;
    private int hitCount;
    private int networkCount;
    private int requestCount;
    private int writeAbortCount;
    private int writeSuccessCount;

    @C11076d0(mo22515d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B'\u0012\n\u0010\f\u001a\u00060\nR\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\u00060\nR\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011¨\u0006\u0014"}, mo22516d2 = {"Lokhttp3/Cache$CacheResponseBody;", "Lokhttp3/ResponseBody;", "Lokhttp3/MediaType;", "contentType", "", "contentLength", "Lokio/o;", "source", "bodySource", "Lokio/o;", "Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "Lokhttp3/internal/cache/DiskLruCache;", "snapshot", "Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "getSnapshot", "()Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "", "Ljava/lang/String;", "<init>", "(Lokhttp3/internal/cache/DiskLruCache$Snapshot;Ljava/lang/String;Ljava/lang/String;)V", "okhttp"}, mo22517k = 1, mo22518mv = {1, 4, 0})
    public static final class CacheResponseBody extends ResponseBody {
        private final C12507o bodySource;
        private final String contentLength;
        private final String contentType;
        @C12579k
        private final DiskLruCache.Snapshot snapshot;

        public CacheResponseBody(@C12579k DiskLruCache.Snapshot snapshot2, @C12580l String str, @C12580l String str2) {
            Intrinsics.checkNotNullParameter(snapshot2, "snapshot");
            this.snapshot = snapshot2;
            this.contentType = str;
            this.contentLength = str2;
            C12510p0 source = snapshot2.getSource(1);
            this.bodySource = C12465c0.m50481d(new C12522u(this, source, source) {
                final /* synthetic */ C12510p0 $source;
                final /* synthetic */ CacheResponseBody this$0;

                {
                    this.this$0 = r1;
                    this.$source = r2;
                }

                public void close() throws IOException {
                    this.this$0.getSnapshot().close();
                    super.close();
                }
            });
        }

        public long contentLength() {
            String str = this.contentLength;
            if (str != null) {
                return Util.toLongOrDefault(str, -1);
            }
            return -1;
        }

        @C12580l
        public MediaType contentType() {
            String str = this.contentType;
            if (str != null) {
                return MediaType.Companion.parse(str);
            }
            return null;
        }

        @C12579k
        public final DiskLruCache.Snapshot getSnapshot() {
            return this.snapshot;
        }

        @C12579k
        public C12507o source() {
            return this.bodySource;
        }
    }

    @C11076d0(mo22515d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u0002H\u0002J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0002J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0007J\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001e\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015J\n\u0010\u0019\u001a\u00020\u0017*\u00020\u0012J\n\u0010\b\u001a\u00020\u0002*\u00020\u0012R\u0014\u0010\u001a\u001a\u00020\u000e8\u0002XT¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u000e8\u0002XT¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u000e8\u0002XT¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u000e8\u0002XT¢\u0006\u0006\n\u0004\b\u001e\u0010\u001b¨\u0006!"}, mo22516d2 = {"Lokhttp3/Cache$Companion;", "", "Lokhttp3/Headers;", "", "", "varyFields", "requestHeaders", "responseHeaders", "varyHeaders", "Lokhttp3/HttpUrl;", "url", "key", "Lokio/o;", "source", "", "readInt$okhttp", "(Lokio/o;)I", "readInt", "Lokhttp3/Response;", "cachedResponse", "cachedRequest", "Lokhttp3/Request;", "newRequest", "", "varyMatches", "hasVaryAll", "ENTRY_BODY", "I", "ENTRY_COUNT", "ENTRY_METADATA", "VERSION", "<init>", "()V", "okhttp"}, mo22517k = 1, mo22518mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        private final Set<String> varyFields(Headers headers) {
            int size = headers.size();
            TreeSet treeSet = null;
            for (int i = 0; i < size; i++) {
                if (C11622t.equals("Vary", headers.name(i), true)) {
                    String value = headers.value(i);
                    if (treeSet == null) {
                        treeSet = new TreeSet(C11622t.getCASE_INSENSITIVE_ORDER(C11368t0.f28504a));
                    }
                    for (String str : StringsKt__StringsKt.split$default((CharSequence) value, new char[]{','}, false, 0, 6, (Object) null)) {
                        if (str != null) {
                            treeSet.add(StringsKt__StringsKt.trim(str).toString());
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                        }
                    }
                    continue;
                }
            }
            if (treeSet != null) {
                return treeSet;
            }
            return C10930d1.m40892k();
        }

        public final boolean hasVaryAll(@C12579k C12451Response response) {
            Intrinsics.checkNotNullParameter(response, "$this$hasVaryAll");
            return varyFields(response.headers()).contains("*");
        }

        @C12579k
        @C11384m
        public final String key(@C12579k HttpUrl httpUrl) {
            Intrinsics.checkNotNullParameter(httpUrl, "url");
            return ByteString.f30388d.mo27167l(httpUrl.toString()).mo27104A1().mo27150t0();
        }

        public final int readInt$okhttp(@C12579k C12507o oVar) throws IOException {
            boolean z;
            Intrinsics.checkNotNullParameter(oVar, "source");
            try {
                long O2 = oVar.mo27279O2();
                String J1 = oVar.mo27274J1();
                if (O2 >= 0 && O2 <= ((long) Integer.MAX_VALUE)) {
                    if (J1.length() > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        return (int) O2;
                    }
                }
                throw new IOException("expected an int but was \"" + O2 + J1 + '\"');
            } catch (NumberFormatException e) {
                throw new IOException(e.getMessage());
            }
        }

        @C12579k
        public final Headers varyHeaders(@C12579k C12451Response response) {
            Intrinsics.checkNotNullParameter(response, "$this$varyHeaders");
            C12451Response networkResponse = response.networkResponse();
            Intrinsics.checkNotNull(networkResponse);
            return varyHeaders(networkResponse.request().headers(), response.headers());
        }

        public final boolean varyMatches(@C12579k C12451Response response, @C12579k Headers headers, @C12579k Request request) {
            Intrinsics.checkNotNullParameter(response, "cachedResponse");
            Intrinsics.checkNotNullParameter(headers, "cachedRequest");
            Intrinsics.checkNotNullParameter(request, "newRequest");
            Iterable<String> varyFields = varyFields(response.headers());
            if ((varyFields instanceof Collection) && ((Collection) varyFields).isEmpty()) {
                return true;
            }
            for (String str : varyFields) {
                if (!Intrinsics.areEqual((Object) headers.values(str), (Object) request.headers(str))) {
                    return false;
                }
            }
            return true;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Headers varyHeaders(Headers headers, Headers headers2) {
            Set<String> varyFields = varyFields(headers2);
            if (varyFields.isEmpty()) {
                return Util.EMPTY_HEADERS;
            }
            Headers.Builder builder = new Headers.Builder();
            int size = headers.size();
            for (int i = 0; i < size; i++) {
                String name = headers.name(i);
                if (varyFields.contains(name)) {
                    builder.add(name, headers.value(i));
                }
            }
            return builder.build();
        }
    }

    @C11076d0(mo22515d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0011\u001a\u00060\u000fR\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0018\u0010\u0011\u001a\u00060\u000fR\u00020\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, mo22516d2 = {"Lokhttp3/Cache$RealCacheRequest;", "Lokhttp3/internal/cache/CacheRequest;", "Lkotlin/d2;", "abort", "Lokio/n0;", "body", "cacheOut", "Lokio/n0;", "", "done", "Z", "getDone", "()Z", "setDone", "(Z)V", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "Lokhttp3/internal/cache/DiskLruCache;", "editor", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "<init>", "(Lokhttp3/Cache;Lokhttp3/internal/cache/DiskLruCache$Editor;)V", "okhttp"}, mo22517k = 1, mo22518mv = {1, 4, 0})
    public final class RealCacheRequest implements CacheRequest {
        private final C12506n0 body;
        private final C12506n0 cacheOut;
        private boolean done;
        /* access modifiers changed from: private */
        public final DiskLruCache.Editor editor;
        final /* synthetic */ Cache this$0;

        public RealCacheRequest(@C12579k Cache cache, DiskLruCache.Editor editor2) {
            Intrinsics.checkNotNullParameter(editor2, "editor");
            this.this$0 = cache;
            this.editor = editor2;
            C12506n0 newSink = editor2.newSink(1);
            this.cacheOut = newSink;
            this.body = new C12521t(this, newSink) {
                final /* synthetic */ RealCacheRequest this$0;

                {
                    this.this$0 = r1;
                }

                public void close() throws IOException {
                    synchronized (this.this$0.this$0) {
                        if (!this.this$0.getDone()) {
                            this.this$0.setDone(true);
                            Cache cache = this.this$0.this$0;
                            cache.setWriteSuccessCount$okhttp(cache.getWriteSuccessCount$okhttp() + 1);
                            super.close();
                            this.this$0.editor.commit();
                        }
                    }
                }
            };
        }

        public void abort() {
            synchronized (this.this$0) {
                if (!this.done) {
                    this.done = true;
                    Cache cache = this.this$0;
                    cache.setWriteAbortCount$okhttp(cache.getWriteAbortCount$okhttp() + 1);
                    Util.closeQuietly((Closeable) this.cacheOut);
                    try {
                        this.editor.abort();
                    } catch (IOException unused) {
                    }
                }
            }
        }

        @C12579k
        public C12506n0 body() {
            return this.body;
        }

        public final boolean getDone() {
            return this.done;
        }

        public final void setDone(boolean z) {
            this.done = z;
        }
    }

    public Cache(@C12579k File file, long j, @C12579k FileSystem fileSystem) {
        Intrinsics.checkNotNullParameter(file, "directory");
        Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
        this.cache = new DiskLruCache(fileSystem, file, VERSION, 2, j, TaskRunner.INSTANCE);
    }

    private final void abortQuietly(DiskLruCache.Editor editor) {
        if (editor != null) {
            try {
                editor.abort();
            } catch (IOException unused) {
            }
        }
    }

    @C12579k
    @C11384m
    public static final String key(@C12579k HttpUrl httpUrl) {
        return Companion.key(httpUrl);
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @C11587t0(expression = "directory", imports = {}))
    @C11314h(name = "-deprecated_directory")
    @C12579k
    /* renamed from: -deprecated_directory  reason: not valid java name */
    public final File m172600deprecated_directory() {
        return this.cache.getDirectory();
    }

    public void close() throws IOException {
        this.cache.close();
    }

    public final void delete() throws IOException {
        this.cache.delete();
    }

    @C11314h(name = "directory")
    @C12579k
    public final File directory() {
        return this.cache.getDirectory();
    }

    public final void evictAll() throws IOException {
        this.cache.evictAll();
    }

    public void flush() throws IOException {
        this.cache.flush();
    }

    @C12580l
    public final C12451Response get$okhttp(@C12579k Request request) {
        Intrinsics.checkNotNullParameter(request, "request");
        try {
            DiskLruCache.Snapshot snapshot = this.cache.get(Companion.key(request.url()));
            if (snapshot != null) {
                try {
                    Entry entry = new Entry(snapshot.getSource(0));
                    C12451Response response = entry.response(snapshot);
                    if (entry.matches(request, response)) {
                        return response;
                    }
                    ResponseBody body = response.body();
                    if (body != null) {
                        Util.closeQuietly((Closeable) body);
                    }
                    return null;
                } catch (IOException unused) {
                    Util.closeQuietly((Closeable) snapshot);
                }
            }
        } catch (IOException unused2) {
        }
        return null;
    }

    @C12579k
    public final DiskLruCache getCache$okhttp() {
        return this.cache;
    }

    public final int getWriteAbortCount$okhttp() {
        return this.writeAbortCount;
    }

    public final int getWriteSuccessCount$okhttp() {
        return this.writeSuccessCount;
    }

    public final synchronized int hitCount() {
        return this.hitCount;
    }

    public final void initialize() throws IOException {
        this.cache.initialize();
    }

    public final boolean isClosed() {
        return this.cache.isClosed();
    }

    public final long maxSize() {
        return this.cache.getMaxSize();
    }

    public final synchronized int networkCount() {
        return this.networkCount;
    }

    @C12580l
    public final CacheRequest put$okhttp(@C12579k C12451Response response) {
        DiskLruCache.Editor editor;
        Intrinsics.checkNotNullParameter(response, "response");
        String method = response.request().method();
        if (HttpMethod.INSTANCE.invalidatesCache(response.request().method())) {
            try {
                remove$okhttp(response.request());
            } catch (IOException unused) {
            }
            return null;
        } else if (!Intrinsics.areEqual((Object) method, (Object) "GET")) {
            return null;
        } else {
            Companion companion = Companion;
            if (companion.hasVaryAll(response)) {
                return null;
            }
            Entry entry = new Entry(response);
            try {
                editor = DiskLruCache.edit$default(this.cache, companion.key(response.request().url()), 0, 2, (Object) null);
                if (editor == null) {
                    return null;
                }
                try {
                    entry.writeTo(editor);
                    return new RealCacheRequest(this, editor);
                } catch (IOException unused2) {
                    abortQuietly(editor);
                    return null;
                }
            } catch (IOException unused3) {
                editor = null;
                abortQuietly(editor);
                return null;
            }
        }
    }

    public final void remove$okhttp(@C12579k Request request) throws IOException {
        Intrinsics.checkNotNullParameter(request, "request");
        this.cache.remove(Companion.key(request.url()));
    }

    public final synchronized int requestCount() {
        return this.requestCount;
    }

    public final void setWriteAbortCount$okhttp(int i) {
        this.writeAbortCount = i;
    }

    public final void setWriteSuccessCount$okhttp(int i) {
        this.writeSuccessCount = i;
    }

    public final long size() throws IOException {
        return this.cache.size();
    }

    public final synchronized void trackConditionalCacheHit$okhttp() {
        this.hitCount++;
    }

    public final synchronized void trackResponse$okhttp(@C12579k CacheStrategy cacheStrategy) {
        Intrinsics.checkNotNullParameter(cacheStrategy, "cacheStrategy");
        this.requestCount++;
        if (cacheStrategy.getNetworkRequest() != null) {
            this.networkCount++;
        } else if (cacheStrategy.getCacheResponse() != null) {
            this.hitCount++;
        }
    }

    public final void update$okhttp(@C12579k C12451Response response, @C12579k C12451Response response2) {
        DiskLruCache.Editor editor;
        Intrinsics.checkNotNullParameter(response, "cached");
        Intrinsics.checkNotNullParameter(response2, "network");
        Entry entry = new Entry(response2);
        ResponseBody body = response.body();
        if (body != null) {
            try {
                editor = ((CacheResponseBody) body).getSnapshot().edit();
                if (editor != null) {
                    try {
                        entry.writeTo(editor);
                        editor.commit();
                    } catch (IOException unused) {
                    }
                }
            } catch (IOException unused2) {
                editor = null;
                abortQuietly(editor);
            }
        } else {
            throw new NullPointerException("null cannot be cast to non-null type okhttp3.Cache.CacheResponseBody");
        }
    }

    @C12579k
    public final Iterator<String> urls() throws IOException {
        return new Cache$urls$1(this);
    }

    public final synchronized int writeAbortCount() {
        return this.writeAbortCount;
    }

    public final synchronized int writeSuccessCount() {
        return this.writeSuccessCount;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public Cache(@C12579k File file, long j) {
        this(file, j, FileSystem.SYSTEM);
        Intrinsics.checkNotNullParameter(file, "directory");
    }

    @C11076d0(mo22515d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000 52\u00020\u0001:\u00015B\u0011\b\u0016\u0012\u0006\u00101\u001a\u000200¢\u0006\u0004\b2\u00103B\u0011\b\u0016\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b2\u00104J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001e\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002J\u0012\u0010\u000f\u001a\u00020\n2\n\u0010\u000e\u001a\u00060\fR\u00020\rJ\u0016\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012J\u0012\u0010\u0013\u001a\u00020\u00122\n\u0010\u0017\u001a\u00060\u0016R\u00020\rR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u00188\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001aR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\u00188\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010\u001aR\u0014\u0010&\u001a\u00020\u001b8\u0002X\u0004¢\u0006\u0006\n\u0004\b&\u0010\u001dR\u0016\u0010(\u001a\u0004\u0018\u00010'8\u0002X\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010-\u001a\u00020*8\u0002X\u0004¢\u0006\u0006\n\u0004\b-\u0010,R\u0014\u0010.\u001a\u00020\u00148BX\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u00066"}, mo22516d2 = {"Lokhttp3/Cache$Entry;", "", "Lokio/o;", "source", "", "Ljava/security/cert/Certificate;", "readCertificateList", "Lokio/n;", "sink", "certificates", "Lkotlin/d2;", "writeCertList", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "Lokhttp3/internal/cache/DiskLruCache;", "editor", "writeTo", "Lokhttp3/Request;", "request", "Lokhttp3/Response;", "response", "", "matches", "Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "snapshot", "", "url", "Ljava/lang/String;", "Lokhttp3/Headers;", "varyHeaders", "Lokhttp3/Headers;", "requestMethod", "Lokhttp3/Protocol;", "protocol", "Lokhttp3/Protocol;", "", "code", "I", "message", "responseHeaders", "Lokhttp3/Handshake;", "handshake", "Lokhttp3/Handshake;", "", "sentRequestMillis", "J", "receivedResponseMillis", "isHttps", "()Z", "Lokio/p0;", "rawSource", "<init>", "(Lokio/p0;)V", "(Lokhttp3/Response;)V", "Companion", "okhttp"}, mo22517k = 1, mo22518mv = {1, 4, 0})
    public static final class Entry {
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        private static final String RECEIVED_MILLIS;
        private static final String SENT_MILLIS;
        private final int code;
        private final Handshake handshake;
        private final String message;
        private final Protocol protocol;
        private final long receivedResponseMillis;
        private final String requestMethod;
        private final Headers responseHeaders;
        private final long sentRequestMillis;
        private final String url;
        private final Headers varyHeaders;

        @C11076d0(mo22514bv = {1, 0, 3}, mo22515d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, mo22516d2 = {"Lokhttp3/Cache$Entry$Companion;", "", "()V", "RECEIVED_MILLIS", "", "SENT_MILLIS", "okhttp"}, mo22517k = 1, mo22518mv = {1, 4, 0})
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        static {
            StringBuilder sb = new StringBuilder();
            Platform.Companion companion = Platform.Companion;
            sb.append(companion.get().getPrefix());
            sb.append("-Sent-Millis");
            SENT_MILLIS = sb.toString();
            RECEIVED_MILLIS = companion.get().getPrefix() + "-Received-Millis";
        }

        public Entry(@C12579k C12510p0 p0Var) throws IOException {
            TlsVersion tlsVersion;
            Intrinsics.checkNotNullParameter(p0Var, "rawSource");
            try {
                C12507o d = C12465c0.m50481d(p0Var);
                this.url = d.mo27274J1();
                this.requestMethod = d.mo27274J1();
                Headers.Builder builder = new Headers.Builder();
                int readInt$okhttp = Cache.Companion.readInt$okhttp(d);
                boolean z = false;
                for (int i = 0; i < readInt$okhttp; i++) {
                    builder.addLenient$okhttp(d.mo27274J1());
                }
                this.varyHeaders = builder.build();
                StatusLine parse = StatusLine.Companion.parse(d.mo27274J1());
                this.protocol = parse.protocol;
                this.code = parse.code;
                this.message = parse.message;
                Headers.Builder builder2 = new Headers.Builder();
                int readInt$okhttp2 = Cache.Companion.readInt$okhttp(d);
                for (int i2 = 0; i2 < readInt$okhttp2; i2++) {
                    builder2.addLenient$okhttp(d.mo27274J1());
                }
                String str = SENT_MILLIS;
                String str2 = builder2.get(str);
                String str3 = RECEIVED_MILLIS;
                String str4 = builder2.get(str3);
                builder2.removeAll(str);
                builder2.removeAll(str3);
                long j = 0;
                this.sentRequestMillis = str2 != null ? Long.parseLong(str2) : 0;
                this.receivedResponseMillis = str4 != null ? Long.parseLong(str4) : j;
                this.responseHeaders = builder2.build();
                if (isHttps()) {
                    String J1 = d.mo27274J1();
                    if (!(J1.length() > 0 ? true : z)) {
                        CipherSuite forJavaName = CipherSuite.Companion.forJavaName(d.mo27274J1());
                        List<Certificate> readCertificateList = readCertificateList(d);
                        List<Certificate> readCertificateList2 = readCertificateList(d);
                        if (!d.mo27275J2()) {
                            tlsVersion = TlsVersion.Companion.forJavaName(d.mo27274J1());
                        } else {
                            tlsVersion = TlsVersion.SSL_3_0;
                        }
                        this.handshake = Handshake.Companion.get(tlsVersion, forJavaName, readCertificateList, readCertificateList2);
                    } else {
                        throw new IOException("expected \"\" but was \"" + J1 + '\"');
                    }
                } else {
                    this.handshake = null;
                }
            } finally {
                p0Var.close();
            }
        }

        private final boolean isHttps() {
            return C11622t.startsWith$default(this.url, "https://", false, 2, (Object) null);
        }

        private final List<Certificate> readCertificateList(C12507o oVar) throws IOException {
            int readInt$okhttp = Cache.Companion.readInt$okhttp(oVar);
            if (readInt$okhttp == -1) {
                return CollectionsKt__CollectionsKt.m40441E();
            }
            try {
                CertificateFactory instance = CertificateFactory.getInstance("X.509");
                ArrayList arrayList = new ArrayList(readInt$okhttp);
                for (int i = 0; i < readInt$okhttp; i++) {
                    String J1 = oVar.mo27274J1();
                    C12500m mVar = new C12500m();
                    ByteString h = ByteString.f30388d.mo27164h(J1);
                    Intrinsics.checkNotNull(h);
                    mVar.mo27222G3(h);
                    arrayList.add(instance.generateCertificate(mVar.mo27294h0()));
                }
                return arrayList;
            } catch (CertificateException e) {
                throw new IOException(e.getMessage());
            }
        }

        private final void writeCertList(C12505n nVar, List<? extends Certificate> list) throws IOException {
            try {
                nVar.mo27233g2((long) list.size()).mo27225K2(10);
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    byte[] encoded = ((Certificate) list.get(i)).getEncoded();
                    ByteString.C12459a aVar = ByteString.f30388d;
                    Intrinsics.checkNotNullExpressionValue(encoded, "bytes");
                    nVar.mo27236l1(ByteString.C12459a.m50417p(aVar, encoded, 0, 0, 3, (Object) null).mo27146r()).mo27225K2(10);
                }
            } catch (CertificateEncodingException e) {
                throw new IOException(e.getMessage());
            }
        }

        public final boolean matches(@C12579k Request request, @C12579k C12451Response response) {
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(response, "response");
            if (!Intrinsics.areEqual((Object) this.url, (Object) request.url().toString()) || !Intrinsics.areEqual((Object) this.requestMethod, (Object) request.method()) || !Cache.Companion.varyMatches(response, this.varyHeaders, request)) {
                return false;
            }
            return true;
        }

        @C12579k
        public final C12451Response response(@C12579k DiskLruCache.Snapshot snapshot) {
            Intrinsics.checkNotNullParameter(snapshot, "snapshot");
            String str = this.responseHeaders.get("Content-Type");
            String str2 = this.responseHeaders.get("Content-Length");
            return new C12451Response.Builder().request(new Request.Builder().url(this.url).method(this.requestMethod, (RequestBody) null).headers(this.varyHeaders).build()).protocol(this.protocol).code(this.code).message(this.message).headers(this.responseHeaders).body(new CacheResponseBody(snapshot, str, str2)).handshake(this.handshake).sentRequestAtMillis(this.sentRequestMillis).receivedResponseAtMillis(this.receivedResponseMillis).build();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0114, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0115, code lost:
            kotlin.p010io.C11133b.m42950a(r8, r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0118, code lost:
            throw r1;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void writeTo(@org.jetbrains.annotations.C12579k okhttp3.internal.cache.DiskLruCache.Editor r8) throws java.io.IOException {
            /*
                r7 = this;
                java.lang.String r0 = "editor"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
                r0 = 0
                okio.n0 r8 = r8.newSink(r0)
                okio.n r8 = okio.C12465c0.m50480c(r8)
                java.lang.String r1 = r7.url     // Catch:{ all -> 0x0112 }
                okio.n r1 = r8.mo27236l1(r1)     // Catch:{ all -> 0x0112 }
                r2 = 10
                r1.mo27225K2(r2)     // Catch:{ all -> 0x0112 }
                java.lang.String r1 = r7.requestMethod     // Catch:{ all -> 0x0112 }
                okio.n r1 = r8.mo27236l1(r1)     // Catch:{ all -> 0x0112 }
                r1.mo27225K2(r2)     // Catch:{ all -> 0x0112 }
                okhttp3.Headers r1 = r7.varyHeaders     // Catch:{ all -> 0x0112 }
                int r1 = r1.size()     // Catch:{ all -> 0x0112 }
                long r3 = (long) r1     // Catch:{ all -> 0x0112 }
                okio.n r1 = r8.mo27233g2(r3)     // Catch:{ all -> 0x0112 }
                r1.mo27225K2(r2)     // Catch:{ all -> 0x0112 }
                okhttp3.Headers r1 = r7.varyHeaders     // Catch:{ all -> 0x0112 }
                int r1 = r1.size()     // Catch:{ all -> 0x0112 }
                r3 = r0
            L_0x0037:
                java.lang.String r4 = ": "
                if (r3 >= r1) goto L_0x0059
                okhttp3.Headers r5 = r7.varyHeaders     // Catch:{ all -> 0x0112 }
                java.lang.String r5 = r5.name(r3)     // Catch:{ all -> 0x0112 }
                okio.n r5 = r8.mo27236l1(r5)     // Catch:{ all -> 0x0112 }
                okio.n r4 = r5.mo27236l1(r4)     // Catch:{ all -> 0x0112 }
                okhttp3.Headers r5 = r7.varyHeaders     // Catch:{ all -> 0x0112 }
                java.lang.String r5 = r5.value(r3)     // Catch:{ all -> 0x0112 }
                okio.n r4 = r4.mo27236l1(r5)     // Catch:{ all -> 0x0112 }
                r4.mo27225K2(r2)     // Catch:{ all -> 0x0112 }
                int r3 = r3 + 1
                goto L_0x0037
            L_0x0059:
                okhttp3.internal.http.StatusLine r1 = new okhttp3.internal.http.StatusLine     // Catch:{ all -> 0x0112 }
                okhttp3.Protocol r3 = r7.protocol     // Catch:{ all -> 0x0112 }
                int r5 = r7.code     // Catch:{ all -> 0x0112 }
                java.lang.String r6 = r7.message     // Catch:{ all -> 0x0112 }
                r1.<init>(r3, r5, r6)     // Catch:{ all -> 0x0112 }
                java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0112 }
                okio.n r1 = r8.mo27236l1(r1)     // Catch:{ all -> 0x0112 }
                r1.mo27225K2(r2)     // Catch:{ all -> 0x0112 }
                okhttp3.Headers r1 = r7.responseHeaders     // Catch:{ all -> 0x0112 }
                int r1 = r1.size()     // Catch:{ all -> 0x0112 }
                int r1 = r1 + 2
                long r5 = (long) r1     // Catch:{ all -> 0x0112 }
                okio.n r1 = r8.mo27233g2(r5)     // Catch:{ all -> 0x0112 }
                r1.mo27225K2(r2)     // Catch:{ all -> 0x0112 }
                okhttp3.Headers r1 = r7.responseHeaders     // Catch:{ all -> 0x0112 }
                int r1 = r1.size()     // Catch:{ all -> 0x0112 }
            L_0x0085:
                if (r0 >= r1) goto L_0x00a5
                okhttp3.Headers r3 = r7.responseHeaders     // Catch:{ all -> 0x0112 }
                java.lang.String r3 = r3.name(r0)     // Catch:{ all -> 0x0112 }
                okio.n r3 = r8.mo27236l1(r3)     // Catch:{ all -> 0x0112 }
                okio.n r3 = r3.mo27236l1(r4)     // Catch:{ all -> 0x0112 }
                okhttp3.Headers r5 = r7.responseHeaders     // Catch:{ all -> 0x0112 }
                java.lang.String r5 = r5.value(r0)     // Catch:{ all -> 0x0112 }
                okio.n r3 = r3.mo27236l1(r5)     // Catch:{ all -> 0x0112 }
                r3.mo27225K2(r2)     // Catch:{ all -> 0x0112 }
                int r0 = r0 + 1
                goto L_0x0085
            L_0x00a5:
                java.lang.String r0 = SENT_MILLIS     // Catch:{ all -> 0x0112 }
                okio.n r0 = r8.mo27236l1(r0)     // Catch:{ all -> 0x0112 }
                okio.n r0 = r0.mo27236l1(r4)     // Catch:{ all -> 0x0112 }
                long r5 = r7.sentRequestMillis     // Catch:{ all -> 0x0112 }
                okio.n r0 = r0.mo27233g2(r5)     // Catch:{ all -> 0x0112 }
                r0.mo27225K2(r2)     // Catch:{ all -> 0x0112 }
                java.lang.String r0 = RECEIVED_MILLIS     // Catch:{ all -> 0x0112 }
                okio.n r0 = r8.mo27236l1(r0)     // Catch:{ all -> 0x0112 }
                okio.n r0 = r0.mo27236l1(r4)     // Catch:{ all -> 0x0112 }
                long r3 = r7.receivedResponseMillis     // Catch:{ all -> 0x0112 }
                okio.n r0 = r0.mo27233g2(r3)     // Catch:{ all -> 0x0112 }
                r0.mo27225K2(r2)     // Catch:{ all -> 0x0112 }
                boolean r0 = r7.isHttps()     // Catch:{ all -> 0x0112 }
                if (r0 == 0) goto L_0x010b
                r8.mo27225K2(r2)     // Catch:{ all -> 0x0112 }
                okhttp3.Handshake r0 = r7.handshake     // Catch:{ all -> 0x0112 }
                kotlin.jvm.internal.Intrinsics.checkNotNull(r0)     // Catch:{ all -> 0x0112 }
                okhttp3.CipherSuite r0 = r0.cipherSuite()     // Catch:{ all -> 0x0112 }
                java.lang.String r0 = r0.javaName()     // Catch:{ all -> 0x0112 }
                okio.n r0 = r8.mo27236l1(r0)     // Catch:{ all -> 0x0112 }
                r0.mo27225K2(r2)     // Catch:{ all -> 0x0112 }
                okhttp3.Handshake r0 = r7.handshake     // Catch:{ all -> 0x0112 }
                java.util.List r0 = r0.peerCertificates()     // Catch:{ all -> 0x0112 }
                r7.writeCertList(r8, r0)     // Catch:{ all -> 0x0112 }
                okhttp3.Handshake r0 = r7.handshake     // Catch:{ all -> 0x0112 }
                java.util.List r0 = r0.localCertificates()     // Catch:{ all -> 0x0112 }
                r7.writeCertList(r8, r0)     // Catch:{ all -> 0x0112 }
                okhttp3.Handshake r0 = r7.handshake     // Catch:{ all -> 0x0112 }
                okhttp3.TlsVersion r0 = r0.tlsVersion()     // Catch:{ all -> 0x0112 }
                java.lang.String r0 = r0.javaName()     // Catch:{ all -> 0x0112 }
                okio.n r0 = r8.mo27236l1(r0)     // Catch:{ all -> 0x0112 }
                r0.mo27225K2(r2)     // Catch:{ all -> 0x0112 }
            L_0x010b:
                kotlin.d2 r0 = kotlin.C11079d2.f28267a     // Catch:{ all -> 0x0112 }
                r0 = 0
                kotlin.p010io.C11133b.m42950a(r8, r0)
                return
            L_0x0112:
                r0 = move-exception
                throw r0     // Catch:{ all -> 0x0114 }
            L_0x0114:
                r1 = move-exception
                kotlin.p010io.C11133b.m42950a(r8, r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.Cache.Entry.writeTo(okhttp3.internal.cache.DiskLruCache$Editor):void");
        }

        public Entry(@C12579k C12451Response response) {
            Intrinsics.checkNotNullParameter(response, "response");
            this.url = response.request().url().toString();
            this.varyHeaders = Cache.Companion.varyHeaders(response);
            this.requestMethod = response.request().method();
            this.protocol = response.protocol();
            this.code = response.code();
            this.message = response.message();
            this.responseHeaders = response.headers();
            this.handshake = response.handshake();
            this.sentRequestMillis = response.sentRequestAtMillis();
            this.receivedResponseMillis = response.receivedResponseAtMillis();
        }
    }
}
