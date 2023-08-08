package okhttp3.internal.http;

import com.urbanairship.wallet.C9700d;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.C11076d0;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.DeprecationLevel;
import kotlin.collections.C10977s0;
import kotlin.jvm.C11314h;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11622t;
import okhttp3.C12451Response;
import okhttp3.Challenge;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.internal.Util;
import okhttp3.internal.platform.Platform;
import okio.ByteString;
import okio.C12500m;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u001a\u0010\n\u001a\u00020\t*\u00020\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007H\u0002\u001a\f\u0010\f\u001a\u00020\u000b*\u00020\u0006H\u0002\u001a\u0014\u0010\u000f\u001a\u00020\u000b*\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0002\u001a\u000e\u0010\u0010\u001a\u0004\u0018\u00010\u0001*\u00020\u0006H\u0002\u001a\u000e\u0010\u0011\u001a\u0004\u0018\u00010\u0001*\u00020\u0006H\u0002\u001a\u001a\u0010\u0016\u001a\u00020\t*\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0000\u001a\n\u0010\u0018\u001a\u00020\u000b*\u00020\u0017\u001a\u0010\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u0017H\u0007\"\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d\"\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001d¨\u0006\u001f"}, mo22516d2 = {"Lokhttp3/Headers;", "", "headerName", "", "Lokhttp3/Challenge;", "parseChallenges", "Lokio/m;", "", "result", "Lkotlin/d2;", "readChallengeHeader", "", "skipCommasAndWhitespace", "", "prefix", "startsWith", "readQuotedString", "readToken", "Lokhttp3/CookieJar;", "Lokhttp3/HttpUrl;", "url", "headers", "receiveHeaders", "Lokhttp3/Response;", "promisesBody", "response", "hasBody", "Lokio/ByteString;", "QUOTED_STRING_DELIMITERS", "Lokio/ByteString;", "TOKEN_DELIMITERS", "okhttp"}, mo22517k = 2, mo22518mv = {1, 4, 0})
@C11314h(name = "HttpHeaders")
public final class HttpHeaders {
    private static final ByteString QUOTED_STRING_DELIMITERS;
    private static final ByteString TOKEN_DELIMITERS;

    static {
        ByteString.C12459a aVar = ByteString.f30388d;
        QUOTED_STRING_DELIMITERS = aVar.mo27167l("\"\\");
        TOKEN_DELIMITERS = aVar.mo27167l("\t ,=");
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "No longer supported", replaceWith = @C11587t0(expression = "response.promisesBody()", imports = {}))
    public static final boolean hasBody(@C12579k C12451Response response) {
        Intrinsics.checkNotNullParameter(response, "response");
        return promisesBody(response);
    }

    @C12579k
    public static final List<Challenge> parseChallenges(@C12579k Headers headers, @C12579k String str) {
        Intrinsics.checkNotNullParameter(headers, "$this$parseChallenges");
        Intrinsics.checkNotNullParameter(str, "headerName");
        ArrayList arrayList = new ArrayList();
        int size = headers.size();
        for (int i = 0; i < size; i++) {
            if (C11622t.equals(str, headers.name(i), true)) {
                try {
                    readChallengeHeader(new C12500m().mo27236l1(headers.value(i)), arrayList);
                } catch (EOFException e) {
                    Platform.Companion.get().log("Unable to parse challenge", 5, e);
                }
            }
        }
        return arrayList;
    }

    public static final boolean promisesBody(@C12579k C12451Response response) {
        Intrinsics.checkNotNullParameter(response, "$this$promisesBody");
        if (Intrinsics.areEqual((Object) response.request().method(), (Object) "HEAD")) {
            return false;
        }
        int code = response.code();
        if (((code >= 100 && code < 200) || code == 204 || code == 304) && Util.headersContentLength(response) == -1 && !C11622t.equals("chunked", C12451Response.header$default(response, "Transfer-Encoding", (String) null, 2, (Object) null), true)) {
            return false;
        }
        return true;
    }

    private static final void readChallengeHeader(C12500m mVar, List<Challenge> list) throws EOFException {
        String readToken;
        int skipAll;
        String str;
        while (true) {
            String str2 = null;
            while (true) {
                if (str2 == null) {
                    skipCommasAndWhitespace(mVar);
                    str2 = readToken(mVar);
                    if (str2 == null) {
                        return;
                    }
                }
                boolean skipCommasAndWhitespace = skipCommasAndWhitespace(mVar);
                readToken = readToken(mVar);
                if (readToken != null) {
                    byte b = (byte) 61;
                    skipAll = Util.skipAll(mVar, b);
                    boolean skipCommasAndWhitespace2 = skipCommasAndWhitespace(mVar);
                    if (skipCommasAndWhitespace || (!skipCommasAndWhitespace2 && !mVar.mo27275J2())) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        int skipAll2 = skipAll + Util.skipAll(mVar, b);
                        while (true) {
                            if (readToken == null) {
                                readToken = readToken(mVar);
                                if (skipCommasAndWhitespace(mVar)) {
                                    continue;
                                    break;
                                }
                                skipAll2 = Util.skipAll(mVar, b);
                            }
                            if (skipAll2 == 0) {
                                continue;
                                break;
                            } else if (skipAll2 <= 1 && !skipCommasAndWhitespace(mVar)) {
                                if (startsWith(mVar, (byte) 34)) {
                                    str = readQuotedString(mVar);
                                } else {
                                    str = readToken(mVar);
                                }
                                if (str != null && ((String) linkedHashMap.put(readToken, str)) == null) {
                                    if (skipCommasAndWhitespace(mVar) || mVar.mo27275J2()) {
                                        readToken = null;
                                    } else {
                                        return;
                                    }
                                } else {
                                    return;
                                }
                            } else {
                                return;
                            }
                        }
                        list.add(new Challenge(str2, (Map<String, String>) linkedHashMap));
                        str2 = readToken;
                    }
                } else if (mVar.mo27275J2()) {
                    list.add(new Challenge(str2, (Map<String, String>) C10977s0.m41492z()));
                    return;
                } else {
                    return;
                }
            }
            Map singletonMap = Collections.singletonMap((Object) null, readToken + C11622t.repeat("=", skipAll));
            Intrinsics.checkNotNullExpressionValue(singletonMap, "Collections.singletonMap…ek + \"=\".repeat(eqCount))");
            list.add(new Challenge(str2, (Map<String, String>) singletonMap));
        }
    }

    private static final String readQuotedString(C12500m mVar) throws EOFException {
        boolean z;
        byte b = (byte) 34;
        if (mVar.readByte() == b) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C12500m mVar2 = new C12500m();
            while (true) {
                long W0 = mVar.mo27286W0(QUOTED_STRING_DELIMITERS);
                if (W0 == -1) {
                    return null;
                }
                if (mVar.mo27330D(W0) == b) {
                    mVar2.write(mVar, W0);
                    mVar.readByte();
                    return mVar2.mo27268B3();
                } else if (mVar.mo27362c0() == W0 + 1) {
                    return null;
                } else {
                    mVar2.write(mVar, W0);
                    mVar.readByte();
                    mVar2.write(mVar, 1);
                }
            }
        } else {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    private static final String readToken(C12500m mVar) {
        long W0 = mVar.mo27286W0(TOKEN_DELIMITERS);
        if (W0 == -1) {
            W0 = mVar.mo27362c0();
        }
        if (W0 != 0) {
            return mVar.mo27300n2(W0);
        }
        return null;
    }

    public static final void receiveHeaders(@C12579k CookieJar cookieJar, @C12579k HttpUrl httpUrl, @C12579k Headers headers) {
        Intrinsics.checkNotNullParameter(cookieJar, "$this$receiveHeaders");
        Intrinsics.checkNotNullParameter(httpUrl, "url");
        Intrinsics.checkNotNullParameter(headers, C9700d.f26570q);
        if (cookieJar != CookieJar.NO_COOKIES) {
            List<Cookie> parseAll = Cookie.Companion.parseAll(httpUrl, headers);
            if (!parseAll.isEmpty()) {
                cookieJar.saveFromResponse(httpUrl, parseAll);
            }
        }
    }

    private static final boolean skipCommasAndWhitespace(C12500m mVar) {
        boolean z = false;
        while (!mVar.mo27275J2()) {
            byte D = mVar.mo27330D(0);
            if (D == 9 || D == 32) {
                mVar.readByte();
            } else if (D != 44) {
                break;
            } else {
                mVar.readByte();
                z = true;
            }
        }
        return z;
    }

    private static final boolean startsWith(C12500m mVar, byte b) {
        return !mVar.mo27275J2() && mVar.mo27330D(0) == b;
    }
}
