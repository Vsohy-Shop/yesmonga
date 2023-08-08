package okhttp3.internal;

import android.support.p002v4.media.session.PlaybackStateCompat;
import androidx.compose.p004ui.graphics.vector.C15369g;
import com.carrefour.fid.android.shared.constant.C28534f;
import com.carrefour.fid.android.shared.util.C28932h;
import com.google.firebase.installations.C33124s;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.Field;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11414o;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.C10953k0;
import kotlin.collections.C10977s0;
import kotlin.collections.C10978t;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.C11287e;
import kotlin.jvm.C11314h;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11322b0;
import kotlin.jvm.internal.C11368t0;
import kotlin.jvm.internal.C11370u0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11466l;
import kotlin.ranges.C11479u;
import kotlin.text.C11602d;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.json.internal.C12361b;
import okhttp3.C12451Response;
import okhttp3.EventListener;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.internal.http2.Header;
import okio.ByteString;
import okio.C12471f0;
import okio.C12500m;
import okio.C12505n;
import okio.C12507o;
import okio.C12510p0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import p073j$.util.DesugarTimeZone;

@C11076d0(mo22515d1 = {"\u0000´\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\f\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u001e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000\u001a\u0016\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b\u001a;\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\f*\b\u0012\u0004\u0012\u00020\u00060\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\f2\u000e\u0010\u000f\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00060\u000e¢\u0006\u0004\b\u0010\u0010\u0011\u001a7\u0010\u0012\u001a\u00020\b*\b\u0012\u0004\u0012\u00020\u00060\f2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\f2\u000e\u0010\u000f\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00060\u000e¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0014\u0010\u0016\u001a\u00020\u0006*\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\b\u001a-\u0010\u0019\u001a\u00020\u0018*\b\u0012\u0004\u0012\u00020\u00060\f2\u0006\u0010\u0017\u001a\u00020\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e¢\u0006\u0004\b\u0019\u0010\u001a\u001a%\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\f*\b\u0012\u0004\u0012\u00020\u00060\f2\u0006\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u001e\u0010\u001f\u001a\u00020\u0018*\u00020\u00062\b\b\u0002\u0010\u001d\u001a\u00020\u00182\b\b\u0002\u0010\u001e\u001a\u00020\u0018\u001a\u001e\u0010 \u001a\u00020\u0018*\u00020\u00062\b\b\u0002\u0010\u001d\u001a\u00020\u00182\b\b\u0002\u0010\u001e\u001a\u00020\u0018\u001a\u001e\u0010!\u001a\u00020\u0006*\u00020\u00062\b\b\u0002\u0010\u001d\u001a\u00020\u00182\b\b\u0002\u0010\u001e\u001a\u00020\u0018\u001a&\u0010#\u001a\u00020\u0018*\u00020\u00062\u0006\u0010\"\u001a\u00020\u00062\b\b\u0002\u0010\u001d\u001a\u00020\u00182\b\b\u0002\u0010\u001e\u001a\u00020\u0018\u001a&\u0010#\u001a\u00020\u0018*\u00020\u00062\u0006\u0010%\u001a\u00020$2\b\b\u0002\u0010\u001d\u001a\u00020\u00182\b\b\u0002\u0010\u001e\u001a\u00020\u0018\u001a\n\u0010&\u001a\u00020\u0018*\u00020\u0006\u001a\n\u0010'\u001a\u00020\b*\u00020\u0006\u001a)\u0010(\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u00062\u0012\u0010*\u001a\n\u0012\u0006\b\u0001\u0012\u00020)0\f\"\u00020)¢\u0006\u0004\b(\u0010+\u001a\u0012\u0010/\u001a\u00020-*\u00020,2\u0006\u0010.\u001a\u00020-\u001a \u00103\u001a\u00020\u00182\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u00100\u001a\u00020\u00002\b\u00102\u001a\u0004\u0018\u000101\u001a\n\u00104\u001a\u00020\u0018*\u00020$\u001a\u0010\u00108\u001a\u000207*\b\u0012\u0004\u0012\u00020605\u001a\u0010\u00109\u001a\b\u0012\u0004\u0012\u00020605*\u000207\u001a\u0012\u0010:\u001a\u00020\b*\u00020\u00142\u0006\u0010\r\u001a\u00020\u0014\u001a\n\u0010=\u001a\u00020<*\u00020;\u001a\u0015\u0010@\u001a\u00020\u0018*\u00020>2\u0006\u0010?\u001a\u00020\u0018H\u0004\u001a\u0015\u0010@\u001a\u00020\u0018*\u00020A2\u0006\u0010?\u001a\u00020\u0018H\u0004\u001a\u0015\u0010@\u001a\u00020\u0000*\u00020\u00182\u0006\u0010?\u001a\u00020\u0000H\u0004\u001a\u0012\u0010D\u001a\u00020\u0004*\u00020B2\u0006\u0010C\u001a\u00020\u0018\u001a\n\u0010E\u001a\u00020\u0018*\u00020,\u001a\u001a\u0010H\u001a\u00020\b*\u00020F2\u0006\u00100\u001a\u00020\u00182\u0006\u0010G\u001a\u000201\u001a\u001a\u0010J\u001a\u00020\b*\u00020F2\u0006\u0010I\u001a\u00020\u00182\u0006\u0010G\u001a\u000201\u001a\n\u0010L\u001a\u00020\u0006*\u00020K\u001a\u0012\u0010N\u001a\u00020\b*\u00020K2\u0006\u0010M\u001a\u00020,\u001a\u001a\u0010Q\u001a\u00020\u00042\f\u0010P\u001a\b\u0012\u0004\u0012\u00020\u00040OH\bø\u0001\u0000\u001a\"\u0010R\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010P\u001a\b\u0012\u0004\u0012\u00020\u00040OH\bø\u0001\u0000\u001a\u0012\u0010H\u001a\u00020\u0018*\u00020S2\u0006\u0010T\u001a\u00020>\u001a\u0014\u0010U\u001a\u00020\u0018*\u00020\u00062\b\b\u0002\u0010\u001d\u001a\u00020\u0018\u001a\n\u0010W\u001a\u00020\u0000*\u00020V\u001a\u0012\u0010Y\u001a\u00020\u0000*\u00020\u00062\u0006\u0010X\u001a\u00020\u0000\u001a\u0014\u0010Z\u001a\u00020\u0018*\u0004\u0018\u00010\u00062\u0006\u0010X\u001a\u00020\u0018\u001a\u001c\u0010\\\u001a\b\u0012\u0004\u0012\u00028\u000005\"\u0004\b\u0000\u0010[*\b\u0012\u0004\u0012\u00028\u000005\u001a/\u0010^\u001a\b\u0012\u0004\u0012\u00028\u000005\"\u0004\b\u0000\u0010[2\u0012\u0010]\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\f\"\u00028\u0000H\u0007¢\u0006\u0004\b^\u0010_\u001a.\u0010c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010b\"\u0004\b\u0000\u0010`\"\u0004\b\u0001\u0010a*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010b\u001a\n\u0010e\u001a\u00020\u0004*\u00020d\u001a\n\u0010e\u001a\u00020\u0004*\u00020K\u001a\n\u0010e\u001a\u00020\u0004*\u00020f\u001a\u0012\u0010j\u001a\u00020\b*\u00020g2\u0006\u0010i\u001a\u00020h\u001a\n\u0010k\u001a\u00020\u0006*\u00020\u0000\u001a\n\u0010k\u001a\u00020\u0006*\u00020\u0018\u001a\r\u0010l\u001a\u00020\u0004*\u00020)H\b\u001a\r\u0010m\u001a\u00020\u0004*\u00020)H\b\u001a\r\u0010n\u001a\u00020\u0004*\u00020)H\b\u001a3\u0010s\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010[2\u0006\u0010o\u001a\u00020)2\f\u0010q\u001a\b\u0012\u0004\u0012\u00028\u00000p2\u0006\u0010r\u001a\u00020\u0006¢\u0006\u0004\bs\u0010t\u001a'\u0010x\u001a\u00020\u0004\"\u0004\b\u0000\u0010u*\b\u0012\u0004\u0012\u00028\u00000v2\u0006\u0010w\u001a\u00028\u0000H\u0000¢\u0006\u0004\bx\u0010y\u001a\r\u0010z\u001a\u00020\u0004*\u00020)H\b\u001a\r\u0010{\u001a\u00020\u0004*\u00020)H\b\u001a!\u0010\u0001\u001a\u00020*\u00060|j\u0002`}2\u0010\u0010~\u001a\f\u0012\b\u0012\u00060|j\u0002`}05\u001a@\u0010\u0001\u001a\b\u0012\u0004\u0012\u00028\u000005\"\u0004\b\u0000\u0010[*\t\u0012\u0004\u0012\u00028\u00000\u00012\u001a\u0010\u0001\u001a\u0015\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u0001¢\u0006\u0003\b\u0001H\bø\u0001\u0000\"\u0018\u0010\u0001\u001a\u00030\u00018\u0006X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001\"\u0017\u0010\u0001\u001a\u0002078\u0006X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001\"\u0018\u0010\u0001\u001a\u00030\u00018\u0006X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001\"\u0018\u0010\u0001\u001a\u00030\u00018\u0006X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001\"\u0018\u0010\u0001\u001a\u00030\u00018\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001\"\u0018\u0010\u0001\u001a\u00030\u00018\u0006X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001\"\u0018\u0010\u0001\u001a\u00030\u00018\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001\"\u0017\u0010\u0001\u001a\u00020\b8\u0000X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001\"\u0017\u0010\u0001\u001a\u00020\u00068\u0000X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001\"\u0017\u0010\u0001\u001a\u00020\u00068\u0006XT¢\u0006\b\n\u0006\b\u0001\u0010\u0001\u0002\u0007\n\u0005\b20\u0001¨\u0006\u0001"}, mo22516d2 = {"", "arrayLength", "offset", "count", "Lkotlin/d2;", "checkOffsetAndCount", "", "name", "", "daemon", "Ljava/util/concurrent/ThreadFactory;", "threadFactory", "", "other", "Ljava/util/Comparator;", "comparator", "intersect", "([Ljava/lang/String;[Ljava/lang/String;Ljava/util/Comparator;)[Ljava/lang/String;", "hasIntersection", "([Ljava/lang/String;[Ljava/lang/String;Ljava/util/Comparator;)Z", "Lokhttp3/HttpUrl;", "includeDefaultPort", "toHostHeader", "value", "", "indexOf", "([Ljava/lang/String;Ljava/lang/String;Ljava/util/Comparator;)I", "concat", "([Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;", "startIndex", "endIndex", "indexOfFirstNonAsciiWhitespace", "indexOfLastNonAsciiWhitespace", "trimSubstring", "delimiters", "delimiterOffset", "", "delimiter", "indexOfControlOrNonAscii", "canParseAsIpAddress", "format", "", "args", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "Lokio/o;", "Ljava/nio/charset/Charset;", "default", "readBomAsCharset", "duration", "Ljava/util/concurrent/TimeUnit;", "unit", "checkDuration", "parseHexDigit", "", "Lokhttp3/internal/http2/Header;", "Lokhttp3/Headers;", "toHeaders", "toHeaderList", "canReuseConnectionFor", "Lokhttp3/EventListener;", "Lokhttp3/EventListener$Factory;", "asFactory", "", "mask", "and", "", "Lokio/n;", "medium", "writeMedium", "readMedium", "Lokio/p0;", "timeUnit", "skipAll", "timeout", "discard", "Ljava/net/Socket;", "peerName", "source", "isHealthy", "Lkotlin/Function0;", "block", "ignoreIoExceptions", "threadName", "Lokio/m;", "b", "indexOfNonWhitespace", "Lokhttp3/Response;", "headersContentLength", "defaultValue", "toLongOrDefault", "toNonNegativeInt", "T", "toImmutableList", "elements", "immutableListOf", "([Ljava/lang/Object;)Ljava/util/List;", "K", "V", "", "toImmutableMap", "Ljava/io/Closeable;", "closeQuietly", "Ljava/net/ServerSocket;", "Lokhttp3/internal/io/FileSystem;", "Ljava/io/File;", "file", "isCivilized", "toHexString", "wait", "notify", "notifyAll", "instance", "Ljava/lang/Class;", "fieldType", "fieldName", "readFieldOrNull", "(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;", "E", "", "element", "addIfAbsent", "(Ljava/util/List;Ljava/lang/Object;)V", "assertThreadHoldsLock", "assertThreadDoesntHoldLock", "Ljava/lang/Exception;", "Lkotlin/Exception;", "suppressed", "", "withSuppressed", "", "Lkotlin/Function1;", "Lkotlin/t;", "predicate", "filterList", "", "EMPTY_BYTE_ARRAY", "[B", "EMPTY_HEADERS", "Lokhttp3/Headers;", "Lokhttp3/ResponseBody;", "EMPTY_RESPONSE", "Lokhttp3/ResponseBody;", "Lokhttp3/RequestBody;", "EMPTY_REQUEST", "Lokhttp3/RequestBody;", "Lokio/f0;", "UNICODE_BOMS", "Lokio/f0;", "Ljava/util/TimeZone;", "UTC", "Ljava/util/TimeZone;", "Lkotlin/text/Regex;", "VERIFY_AS_IP_ADDRESS", "Lkotlin/text/Regex;", "assertionsEnabled", "Z", "okHttpName", "Ljava/lang/String;", "userAgent", "okhttp"}, mo22517k = 2, mo22518mv = {1, 4, 0})
@C11314h(name = "Util")
public final class Util {
    @C12579k
    @C11287e
    public static final byte[] EMPTY_BYTE_ARRAY;
    @C12579k
    @C11287e
    public static final Headers EMPTY_HEADERS = Headers.Companion.mo25940of(new String[0]);
    @C12579k
    @C11287e
    public static final RequestBody EMPTY_REQUEST;
    @C12579k
    @C11287e
    public static final ResponseBody EMPTY_RESPONSE;
    private static final C12471f0 UNICODE_BOMS;
    @C12579k
    @C11287e
    public static final TimeZone UTC;
    private static final Regex VERIFY_AS_IP_ADDRESS = new Regex("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
    @C11287e
    public static final boolean assertionsEnabled = false;
    @C12579k
    @C11287e
    public static final String okHttpName;
    @C12579k
    public static final String userAgent = "okhttp/4.9.1";

    static {
        byte[] bArr = new byte[0];
        EMPTY_BYTE_ARRAY = bArr;
        EMPTY_RESPONSE = ResponseBody.Companion.create$default(ResponseBody.Companion, bArr, (MediaType) null, 1, (Object) null);
        EMPTY_REQUEST = RequestBody.Companion.create$default(RequestBody.Companion, bArr, (MediaType) null, 0, 0, 7, (Object) null);
        C12471f0.C12472a aVar = C12471f0.f30406d;
        ByteString.C12459a aVar2 = ByteString.f30388d;
        UNICODE_BOMS = aVar.mo27201d(aVar2.mo27165i("efbbbf"), aVar2.mo27165i("feff"), aVar2.mo27165i("fffe"), aVar2.mo27165i("0000ffff"), aVar2.mo27165i("ffff0000"));
        TimeZone timeZone = DesugarTimeZone.getTimeZone(C28932h.f70913W);
        Intrinsics.checkNotNull(timeZone);
        UTC = timeZone;
        String name = OkHttpClient.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "OkHttpClient::class.java.name");
        okHttpName = StringsKt__StringsKt.removeSuffix(StringsKt__StringsKt.removePrefix(name, (CharSequence) "okhttp3."), (CharSequence) "Client");
    }

    public static final <E> void addIfAbsent(@C12579k List<E> list, E e) {
        Intrinsics.checkNotNullParameter(list, "$this$addIfAbsent");
        if (!list.contains(e)) {
            list.add(e);
        }
    }

    public static final int and(byte b, int i) {
        return b & i;
    }

    @C12579k
    public static final EventListener.Factory asFactory(@C12579k EventListener eventListener) {
        Intrinsics.checkNotNullParameter(eventListener, "$this$asFactory");
        return new Util$asFactory$1(eventListener);
    }

    public static final void assertThreadDoesntHoldLock(@C12579k Object obj) {
        Intrinsics.checkNotNullParameter(obj, "$this$assertThreadDoesntHoldLock");
        if (assertionsEnabled && Thread.holdsLock(obj)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread currentThread = Thread.currentThread();
            Intrinsics.checkNotNullExpressionValue(currentThread, "Thread.currentThread()");
            sb.append(currentThread.getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(obj);
            throw new AssertionError(sb.toString());
        }
    }

    public static final void assertThreadHoldsLock(@C12579k Object obj) {
        Intrinsics.checkNotNullParameter(obj, "$this$assertThreadHoldsLock");
        if (assertionsEnabled && !Thread.holdsLock(obj)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread currentThread = Thread.currentThread();
            Intrinsics.checkNotNullExpressionValue(currentThread, "Thread.currentThread()");
            sb.append(currentThread.getName());
            sb.append(" MUST hold lock on ");
            sb.append(obj);
            throw new AssertionError(sb.toString());
        }
    }

    public static final boolean canParseAsIpAddress(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "$this$canParseAsIpAddress");
        return VERIFY_AS_IP_ADDRESS.mo23334k(str);
    }

    public static final boolean canReuseConnectionFor(@C12579k HttpUrl httpUrl, @C12579k HttpUrl httpUrl2) {
        Intrinsics.checkNotNullParameter(httpUrl, "$this$canReuseConnectionFor");
        Intrinsics.checkNotNullParameter(httpUrl2, "other");
        if (!Intrinsics.areEqual((Object) httpUrl.host(), (Object) httpUrl2.host()) || httpUrl.port() != httpUrl2.port() || !Intrinsics.areEqual((Object) httpUrl.scheme(), (Object) httpUrl2.scheme())) {
            return false;
        }
        return true;
    }

    public static final int checkDuration(@C12579k String str, long j, @C12580l TimeUnit timeUnit) {
        boolean z;
        boolean z2;
        boolean z3;
        Intrinsics.checkNotNullParameter(str, "name");
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        boolean z4 = true;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (timeUnit != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                long millis = timeUnit.toMillis(j);
                if (millis <= ((long) Integer.MAX_VALUE)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    if (millis == 0 && i > 0) {
                        z4 = false;
                    }
                    if (z4) {
                        return (int) millis;
                    }
                    throw new IllegalArgumentException((str + " too small.").toString());
                }
                throw new IllegalArgumentException((str + " too large.").toString());
            }
            throw new IllegalStateException("unit == null".toString());
        }
        throw new IllegalStateException((str + " < 0").toString());
    }

    public static final void checkOffsetAndCount(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static final void closeQuietly(@C12579k Closeable closeable) {
        Intrinsics.checkNotNullParameter(closeable, "$this$closeQuietly");
        try {
            closeable.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    @C12579k
    public static final String[] concat(@C12579k String[] strArr, @C12579k String str) {
        Intrinsics.checkNotNullParameter(strArr, "$this$concat");
        Intrinsics.checkNotNullParameter(str, "value");
        Object[] copyOf = Arrays.copyOf(strArr, strArr.length + 1);
        Intrinsics.checkNotNullExpressionValue(copyOf, "java.util.Arrays.copyOf(this, newSize)");
        String[] strArr2 = (String[]) copyOf;
        strArr2[ArraysKt___ArraysKt.m39523Xe(strArr2)] = str;
        return strArr2;
    }

    public static final int delimiterOffset(@C12579k String str, @C12579k String str2, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "$this$delimiterOffset");
        Intrinsics.checkNotNullParameter(str2, "delimiters");
        while (i < i2) {
            if (StringsKt__StringsKt.contains$default((CharSequence) str2, str.charAt(i), false, 2, (Object) null)) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static /* synthetic */ int delimiterOffset$default(String str, String str2, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = str.length();
        }
        return delimiterOffset(str, str2, i, i2);
    }

    public static final boolean discard(@C12579k C12510p0 p0Var, int i, @C12579k TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(p0Var, "$this$discard");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        try {
            return skipAll(p0Var, i, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    @C12579k
    public static final <T> List<T> filterList(@C12579k Iterable<? extends T> iterable, @C12579k C11300l<? super T, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(iterable, "$this$filterList");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        List<T> E = CollectionsKt__CollectionsKt.m40441E();
        for (Object next : iterable) {
            if (lVar.invoke(next).booleanValue()) {
                if (E.isEmpty()) {
                    E = new ArrayList<>();
                }
                C11370u0.m43691g(E).add(next);
            }
        }
        return E;
    }

    @C12579k
    public static final String format(@C12579k String str, @C12579k Object... objArr) {
        Intrinsics.checkNotNullParameter(str, "format");
        Intrinsics.checkNotNullParameter(objArr, "args");
        C11368t0 t0Var = C11368t0.f28504a;
        Locale locale = Locale.US;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        String format = String.format(locale, str, Arrays.copyOf(copyOf, copyOf.length));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
        return format;
    }

    public static final boolean hasIntersection(@C12579k String[] strArr, @C12580l String[] strArr2, @C12579k Comparator<? super String> comparator) {
        boolean z;
        boolean z2;
        Intrinsics.checkNotNullParameter(strArr, "$this$hasIntersection");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (strArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z && strArr2 != null) {
            if (strArr2.length == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                for (String str : strArr) {
                    for (String compare : strArr2) {
                        if (comparator.compare(str, compare) == 0) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final long headersContentLength(@C12579k C12451Response response) {
        Intrinsics.checkNotNullParameter(response, "$this$headersContentLength");
        String str = response.headers().get("Content-Length");
        if (str != null) {
            return toLongOrDefault(str, -1);
        }
        return -1;
    }

    public static final void ignoreIoExceptions(@C12579k C11289a<C11079d2> aVar) {
        Intrinsics.checkNotNullParameter(aVar, C28534f.f69159i0);
        try {
            aVar.invoke();
        } catch (IOException unused) {
        }
    }

    @SafeVarargs
    @C12579k
    public static final <T> List<T> immutableListOf(@C12579k T... tArr) {
        Intrinsics.checkNotNullParameter(tArr, "elements");
        Object[] objArr = (Object[]) tArr.clone();
        List<T> unmodifiableList = Collections.unmodifiableList(CollectionsKt__CollectionsKt.m40448L(Arrays.copyOf(objArr, objArr.length)));
        Intrinsics.checkNotNullExpressionValue(unmodifiableList, "Collections.unmodifiable…istOf(*elements.clone()))");
        return unmodifiableList;
    }

    public static final int indexOf(@C12579k String[] strArr, @C12579k String str, @C12579k Comparator<String> comparator) {
        boolean z;
        Intrinsics.checkNotNullParameter(strArr, "$this$indexOf");
        Intrinsics.checkNotNullParameter(str, "value");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            if (comparator.compare(strArr[i], str) == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return i;
            }
        }
        return -1;
    }

    public static final int indexOfControlOrNonAscii(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "$this$indexOfControlOrNonAscii");
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (Intrinsics.compare((int) charAt, 31) <= 0 || Intrinsics.compare((int) charAt, 127) >= 0) {
                return i;
            }
        }
        return -1;
    }

    public static final int indexOfFirstNonAsciiWhitespace(@C12579k String str, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "$this$indexOfFirstNonAsciiWhitespace");
        while (i < i2) {
            char charAt = str.charAt(i);
            if (charAt != 9 && charAt != 10 && charAt != 12 && charAt != 13 && charAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static /* synthetic */ int indexOfFirstNonAsciiWhitespace$default(String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return indexOfFirstNonAsciiWhitespace(str, i, i2);
    }

    public static final int indexOfLastNonAsciiWhitespace(@C12579k String str, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "$this$indexOfLastNonAsciiWhitespace");
        int i3 = i2 - 1;
        if (i3 >= i) {
            while (true) {
                char charAt = str.charAt(i3);
                if (charAt == 9 || charAt == 10 || charAt == 12 || charAt == 13 || charAt == ' ') {
                    if (i3 == i) {
                        break;
                    }
                    i3--;
                } else {
                    return i3 + 1;
                }
            }
        }
        return i;
    }

    public static /* synthetic */ int indexOfLastNonAsciiWhitespace$default(String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return indexOfLastNonAsciiWhitespace(str, i, i2);
    }

    public static final int indexOfNonWhitespace(@C12579k String str, int i) {
        Intrinsics.checkNotNullParameter(str, "$this$indexOfNonWhitespace");
        int length = str.length();
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt != ' ' && charAt != 9) {
                return i;
            }
            i++;
        }
        return str.length();
    }

    public static /* synthetic */ int indexOfNonWhitespace$default(String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return indexOfNonWhitespace(str, i);
    }

    @C12579k
    public static final String[] intersect(@C12579k String[] strArr, @C12579k String[] strArr2, @C12579k Comparator<? super String> comparator) {
        Intrinsics.checkNotNullParameter(strArr, "$this$intersect");
        Intrinsics.checkNotNullParameter(strArr2, "other");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (comparator.compare(str, strArr2[i]) == 0) {
                    arrayList.add(str);
                    break;
                } else {
                    i++;
                }
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return (String[]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0025, code lost:
        kotlin.p010io.C11133b.m42950a(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0028, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
        r2 = kotlin.C11079d2.f28267a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001b, code lost:
        kotlin.p010io.C11133b.m42950a(r0, (java.lang.Throwable) null);
        r3.delete(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0022, code lost:
        return false;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0019 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean isCivilized(@org.jetbrains.annotations.C12579k okhttp3.internal.p012io.FileSystem r3, @org.jetbrains.annotations.C12579k java.io.File r4) {
        /*
            java.lang.String r0 = "$this$isCivilized"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "file"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            okio.n0 r0 = r3.sink(r4)
            r1 = 0
            r3.delete(r4)     // Catch:{ IOException -> 0x0019 }
            kotlin.p010io.C11133b.m42950a(r0, r1)
            r3 = 1
            return r3
        L_0x0017:
            r3 = move-exception
            goto L_0x0023
        L_0x0019:
            kotlin.d2 r2 = kotlin.C11079d2.f28267a     // Catch:{ all -> 0x0017 }
            kotlin.p010io.C11133b.m42950a(r0, r1)
            r3.delete(r4)
            r3 = 0
            return r3
        L_0x0023:
            throw r3     // Catch:{ all -> 0x0024 }
        L_0x0024:
            r4 = move-exception
            kotlin.p010io.C11133b.m42950a(r0, r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.Util.isCivilized(okhttp3.internal.io.FileSystem, java.io.File):boolean");
    }

    public static final boolean isHealthy(@C12579k Socket socket, @C12579k C12507o oVar) {
        int soTimeout;
        Intrinsics.checkNotNullParameter(socket, "$this$isHealthy");
        Intrinsics.checkNotNullParameter(oVar, "source");
        try {
            soTimeout = socket.getSoTimeout();
            socket.setSoTimeout(1);
            boolean z = !oVar.mo27275J2();
            socket.setSoTimeout(soTimeout);
            return z;
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        } catch (Throwable th) {
            socket.setSoTimeout(soTimeout);
            throw th;
        }
    }

    public static final void notify(@C12579k Object obj) {
        Intrinsics.checkNotNullParameter(obj, "$this$notify");
        obj.notify();
    }

    public static final void notifyAll(@C12579k Object obj) {
        Intrinsics.checkNotNullParameter(obj, "$this$notifyAll");
        obj.notifyAll();
    }

    public static final int parseHexDigit(char c) {
        if ('0' <= c && '9' >= c) {
            return c - '0';
        }
        char c2 = C15369g.f37993s;
        if ('a' > c || 'f' < c) {
            c2 = C15369g.f37994t;
            if ('A' > c || 'F' < c) {
                return -1;
            }
        }
        return (c - c2) + 10;
    }

    @C12579k
    public static final String peerName(@C12579k Socket socket) {
        Intrinsics.checkNotNullParameter(socket, "$this$peerName");
        SocketAddress remoteSocketAddress = socket.getRemoteSocketAddress();
        if (!(remoteSocketAddress instanceof InetSocketAddress)) {
            return remoteSocketAddress.toString();
        }
        String hostName = ((InetSocketAddress) remoteSocketAddress).getHostName();
        Intrinsics.checkNotNullExpressionValue(hostName, "address.hostName");
        return hostName;
    }

    @C12579k
    public static final Charset readBomAsCharset(@C12579k C12507o oVar, @C12579k Charset charset) throws IOException {
        Intrinsics.checkNotNullParameter(oVar, "$this$readBomAsCharset");
        Intrinsics.checkNotNullParameter(charset, "default");
        int Y3 = oVar.mo27289Y3(UNICODE_BOMS);
        if (Y3 == -1) {
            return charset;
        }
        if (Y3 == 0) {
            Charset charset2 = StandardCharsets.UTF_8;
            Intrinsics.checkNotNullExpressionValue(charset2, "UTF_8");
            return charset2;
        } else if (Y3 == 1) {
            Charset charset3 = StandardCharsets.UTF_16BE;
            Intrinsics.checkNotNullExpressionValue(charset3, "UTF_16BE");
            return charset3;
        } else if (Y3 == 2) {
            Charset charset4 = StandardCharsets.UTF_16LE;
            Intrinsics.checkNotNullExpressionValue(charset4, "UTF_16LE");
            return charset4;
        } else if (Y3 == 3) {
            return C11602d.f28867a.mo23372b();
        } else {
            if (Y3 == 4) {
                return C11602d.f28867a.mo23373c();
            }
            throw new AssertionError();
        }
    }

    @C12580l
    public static final <T> T readFieldOrNull(@C12579k Object obj, @C12579k Class<T> cls, @C12579k String str) {
        Object readFieldOrNull;
        Intrinsics.checkNotNullParameter(obj, "instance");
        Intrinsics.checkNotNullParameter(cls, "fieldType");
        Intrinsics.checkNotNullParameter(str, "fieldName");
        Class cls2 = obj.getClass();
        while (true) {
            Class<Object> cls3 = Object.class;
            if (!Intrinsics.areEqual((Object) cls2, (Object) cls3)) {
                try {
                    Field declaredField = cls2.getDeclaredField(str);
                    Intrinsics.checkNotNullExpressionValue(declaredField, "field");
                    declaredField.setAccessible(true);
                    Object obj2 = declaredField.get(obj);
                    if (!cls.isInstance(obj2)) {
                        return null;
                    }
                    return cls.cast(obj2);
                } catch (NoSuchFieldException unused) {
                    cls2 = cls2.getSuperclass();
                    Intrinsics.checkNotNullExpressionValue(cls2, "c.superclass");
                }
            } else if (!(!Intrinsics.areEqual((Object) str, (Object) "delegate")) || (readFieldOrNull = readFieldOrNull(obj, cls3, "delegate")) == null) {
                return null;
            } else {
                return readFieldOrNull(readFieldOrNull, cls, str);
            }
        }
    }

    public static final int readMedium(@C12579k C12507o oVar) throws IOException {
        Intrinsics.checkNotNullParameter(oVar, "$this$readMedium");
        return and(oVar.readByte(), 255) | (and(oVar.readByte(), 255) << 16) | (and(oVar.readByte(), 255) << 8);
    }

    public static final boolean skipAll(@C12579k C12510p0 p0Var, int i, @C12579k TimeUnit timeUnit) throws IOException {
        Intrinsics.checkNotNullParameter(p0Var, "$this$skipAll");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        long nanoTime = System.nanoTime();
        long deadlineNanoTime = p0Var.timeout().hasDeadline() ? p0Var.timeout().deadlineNanoTime() - nanoTime : Long.MAX_VALUE;
        p0Var.timeout().deadlineNanoTime(Math.min(deadlineNanoTime, timeUnit.toNanos((long) i)) + nanoTime);
        try {
            C12500m mVar = new C12500m();
            while (p0Var.read(mVar, PlaybackStateCompat.f473O0) != -1) {
                mVar.mo27367f();
            }
            if (deadlineNanoTime == Long.MAX_VALUE) {
                p0Var.timeout().clearDeadline();
            } else {
                p0Var.timeout().deadlineNanoTime(nanoTime + deadlineNanoTime);
            }
            return true;
        } catch (InterruptedIOException unused) {
            if (deadlineNanoTime == Long.MAX_VALUE) {
                p0Var.timeout().clearDeadline();
            } else {
                p0Var.timeout().deadlineNanoTime(nanoTime + deadlineNanoTime);
            }
            return false;
        } catch (Throwable th) {
            if (deadlineNanoTime == Long.MAX_VALUE) {
                p0Var.timeout().clearDeadline();
            } else {
                p0Var.timeout().deadlineNanoTime(nanoTime + deadlineNanoTime);
            }
            throw th;
        }
    }

    @C12579k
    public static final ThreadFactory threadFactory(@C12579k String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "name");
        return new Util$threadFactory$1(str, z);
    }

    public static final void threadName(@C12579k String str, @C12579k C11289a<C11079d2> aVar) {
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(aVar, C28534f.f69159i0);
        Thread currentThread = Thread.currentThread();
        Intrinsics.checkNotNullExpressionValue(currentThread, "currentThread");
        String name = currentThread.getName();
        currentThread.setName(str);
        try {
            aVar.invoke();
        } finally {
            C11322b0.m43481d(1);
            currentThread.setName(name);
            C11322b0.m43480c(1);
        }
    }

    @C12579k
    public static final List<Header> toHeaderList(@C12579k Headers headers) {
        Intrinsics.checkNotNullParameter(headers, "$this$toHeaderList");
        C11466l W1 = C11479u.m44378W1(0, headers.size());
        ArrayList arrayList = new ArrayList(C10978t.m41495Y(W1, 10));
        Iterator it = W1.iterator();
        while (it.hasNext()) {
            int c = ((C10953k0) it).mo6374c();
            arrayList.add(new Header(headers.name(c), headers.value(c)));
        }
        return arrayList;
    }

    @C12579k
    public static final Headers toHeaders(@C12579k List<Header> list) {
        Intrinsics.checkNotNullParameter(list, "$this$toHeaders");
        Headers.Builder builder = new Headers.Builder();
        for (Header next : list) {
            builder.addLenient$okhttp(next.component1().mo27148s2(), next.component2().mo27148s2());
        }
        return builder.build();
    }

    @C12579k
    public static final String toHexString(long j) {
        String hexString = Long.toHexString(j);
        Intrinsics.checkNotNullExpressionValue(hexString, "java.lang.Long.toHexString(this)");
        return hexString;
    }

    @C12579k
    public static final String toHostHeader(@C12579k HttpUrl httpUrl, boolean z) {
        String str;
        Intrinsics.checkNotNullParameter(httpUrl, "$this$toHostHeader");
        if (StringsKt__StringsKt.contains$default((CharSequence) httpUrl.host(), (CharSequence) C33124s.f80355c, false, 2, (Object) null)) {
            str = C12361b.f30260k + httpUrl.host() + C12361b.f30261l;
        } else {
            str = httpUrl.host();
        }
        if (!z && httpUrl.port() == HttpUrl.Companion.defaultPort(httpUrl.scheme())) {
            return str;
        }
        return str + C12361b.f30257h + httpUrl.port();
    }

    public static /* synthetic */ String toHostHeader$default(HttpUrl httpUrl, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return toHostHeader(httpUrl, z);
    }

    @C12579k
    public static final <T> List<T> toImmutableList(@C12579k List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "$this$toImmutableList");
        List<T> unmodifiableList = Collections.unmodifiableList(CollectionsKt___CollectionsKt.m40572T5(list));
        Intrinsics.checkNotNullExpressionValue(unmodifiableList, "Collections.unmodifiableList(toMutableList())");
        return unmodifiableList;
    }

    @C12579k
    public static final <K, V> Map<K, V> toImmutableMap(@C12579k Map<K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(map, "$this$toImmutableMap");
        if (map.isEmpty()) {
            return C10977s0.m41492z();
        }
        Map<K, V> unmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(map));
        Intrinsics.checkNotNullExpressionValue(unmodifiableMap, "Collections.unmodifiableMap(LinkedHashMap(this))");
        return unmodifiableMap;
    }

    public static final long toLongOrDefault(@C12579k String str, long j) {
        Intrinsics.checkNotNullParameter(str, "$this$toLongOrDefault");
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j;
        }
    }

    public static final int toNonNegativeInt(@C12580l String str, int i) {
        if (str != null) {
            try {
                long parseLong = Long.parseLong(str);
                if (parseLong > ((long) Integer.MAX_VALUE)) {
                    return Integer.MAX_VALUE;
                }
                if (parseLong < 0) {
                    return 0;
                }
                return (int) parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        return i;
    }

    @C12579k
    public static final String trimSubstring(@C12579k String str, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "$this$trimSubstring");
        int indexOfFirstNonAsciiWhitespace = indexOfFirstNonAsciiWhitespace(str, i, i2);
        String substring = str.substring(indexOfFirstNonAsciiWhitespace, indexOfLastNonAsciiWhitespace(str, indexOfFirstNonAsciiWhitespace, i2));
        Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public static /* synthetic */ String trimSubstring$default(String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return trimSubstring(str, i, i2);
    }

    public static final void wait(@C12579k Object obj) {
        Intrinsics.checkNotNullParameter(obj, "$this$wait");
        obj.wait();
    }

    @C12579k
    public static final Throwable withSuppressed(@C12579k Exception exc, @C12579k List<? extends Exception> list) {
        Intrinsics.checkNotNullParameter(exc, "$this$withSuppressed");
        Intrinsics.checkNotNullParameter(list, "suppressed");
        if (list.size() > 1) {
            System.out.println(list);
        }
        for (Exception a : list) {
            C11414o.m43942a(exc, a);
        }
        return exc;
    }

    public static final void writeMedium(@C12579k C12505n nVar, int i) throws IOException {
        Intrinsics.checkNotNullParameter(nVar, "$this$writeMedium");
        nVar.mo27225K2((i >>> 16) & 255);
        nVar.mo27225K2((i >>> 8) & 255);
        nVar.mo27225K2(i & 255);
    }

    public static final int and(short s, int i) {
        return s & i;
    }

    public static final int delimiterOffset(@C12579k String str, char c, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "$this$delimiterOffset");
        while (i < i2) {
            if (str.charAt(i) == c) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static /* synthetic */ int delimiterOffset$default(String str, char c, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = str.length();
        }
        return delimiterOffset(str, c, i, i2);
    }

    @C12579k
    public static final String toHexString(int i) {
        String hexString = Integer.toHexString(i);
        Intrinsics.checkNotNullExpressionValue(hexString, "Integer.toHexString(this)");
        return hexString;
    }

    public static final long and(int i, long j) {
        return ((long) i) & j;
    }

    public static final void closeQuietly(@C12579k Socket socket) {
        Intrinsics.checkNotNullParameter(socket, "$this$closeQuietly");
        try {
            socket.close();
        } catch (AssertionError e) {
            throw e;
        } catch (RuntimeException e2) {
            if (!Intrinsics.areEqual((Object) e2.getMessage(), (Object) "bio == null")) {
                throw e2;
            }
        } catch (Exception unused) {
        }
    }

    public static final void closeQuietly(@C12579k ServerSocket serverSocket) {
        Intrinsics.checkNotNullParameter(serverSocket, "$this$closeQuietly");
        try {
            serverSocket.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    public static final int skipAll(@C12579k C12500m mVar, byte b) {
        Intrinsics.checkNotNullParameter(mVar, "$this$skipAll");
        int i = 0;
        while (!mVar.mo27275J2() && mVar.mo27330D(0) == b) {
            i++;
            mVar.readByte();
        }
        return i;
    }
}
