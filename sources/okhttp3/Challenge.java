package okhttp3;

import com.urbanairship.AirshipConfigOptions;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.C11076d0;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.DeprecationLevel;
import kotlin.collections.C10977s0;
import kotlin.jvm.C11314h;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22514bv = {1, 0, 3}, mo22515d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0002\u0010\bJ\u001b\u0010\u0006\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00030\u0007H\u0007¢\u0006\u0002\b\u000eJ\r\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0002\b\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u000f\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0002\b\u0015J\r\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u0016J\b\u0010\u0017\u001a\u00020\u0003H\u0016J\u000e\u0010\u0018\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bR!\u0010\u0006\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00030\u00078G¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\tR\u0011\u0010\n\u001a\u00020\u000b8G¢\u0006\u0006\u001a\u0004\b\n\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u00038G¢\u0006\u0006\u001a\u0004\b\u0004\u0010\rR\u0013\u0010\u0002\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\r¨\u0006\u0019"}, mo22516d2 = {"Lokhttp3/Challenge;", "", "scheme", "", "realm", "(Ljava/lang/String;Ljava/lang/String;)V", "authParams", "", "(Ljava/lang/String;Ljava/util/Map;)V", "()Ljava/util/Map;", "charset", "Ljava/nio/charset/Charset;", "()Ljava/nio/charset/Charset;", "()Ljava/lang/String;", "-deprecated_authParams", "-deprecated_charset", "equals", "", "other", "hashCode", "", "-deprecated_realm", "-deprecated_scheme", "toString", "withCharset", "okhttp"}, mo22517k = 1, mo22518mv = {1, 4, 0})
public final class Challenge {
    @C12579k
    private final Map<String, String> authParams;
    @C12579k
    private final String scheme;

    public Challenge(@C12579k String str, @C12579k Map<String, String> map) {
        String str2;
        Intrinsics.checkNotNullParameter(str, "scheme");
        Intrinsics.checkNotNullParameter(map, "authParams");
        this.scheme = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry next : map.entrySet()) {
            String str3 = (String) next.getKey();
            String str4 = (String) next.getValue();
            if (str3 != null) {
                Locale locale = Locale.US;
                Intrinsics.checkNotNullExpressionValue(locale, AirshipConfigOptions.f87117e0);
                str2 = str3.toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(str2, "(this as java.lang.String).toLowerCase(locale)");
            } else {
                str2 = null;
            }
            linkedHashMap.put(str2, str4);
        }
        Map<String, String> unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        Intrinsics.checkNotNullExpressionValue(unmodifiableMap, "unmodifiableMap<String?, String>(newAuthParams)");
        this.authParams = unmodifiableMap;
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @C11587t0(expression = "authParams", imports = {}))
    @C11314h(name = "-deprecated_authParams")
    @C12579k
    /* renamed from: -deprecated_authParams  reason: not valid java name */
    public final Map<String, String> m172611deprecated_authParams() {
        return this.authParams;
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @C11587t0(expression = "charset", imports = {}))
    @C11314h(name = "-deprecated_charset")
    @C12579k
    /* renamed from: -deprecated_charset  reason: not valid java name */
    public final Charset m172612deprecated_charset() {
        return charset();
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @C11587t0(expression = "realm", imports = {}))
    @C12580l
    @C11314h(name = "-deprecated_realm")
    /* renamed from: -deprecated_realm  reason: not valid java name */
    public final String m172613deprecated_realm() {
        return realm();
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @C11587t0(expression = "scheme", imports = {}))
    @C11314h(name = "-deprecated_scheme")
    @C12579k
    /* renamed from: -deprecated_scheme  reason: not valid java name */
    public final String m172614deprecated_scheme() {
        return this.scheme;
    }

    @C11314h(name = "authParams")
    @C12579k
    public final Map<String, String> authParams() {
        return this.authParams;
    }

    @C11314h(name = "charset")
    @C12579k
    public final Charset charset() {
        String str = this.authParams.get("charset");
        if (str != null) {
            try {
                Charset forName = Charset.forName(str);
                Intrinsics.checkNotNullExpressionValue(forName, "Charset.forName(charset)");
                return forName;
            } catch (Exception unused) {
            }
        }
        Charset charset = StandardCharsets.ISO_8859_1;
        Intrinsics.checkNotNullExpressionValue(charset, "ISO_8859_1");
        return charset;
    }

    public boolean equals(@C12580l Object obj) {
        if (obj instanceof Challenge) {
            Challenge challenge = (Challenge) obj;
            return Intrinsics.areEqual((Object) challenge.scheme, (Object) this.scheme) && Intrinsics.areEqual((Object) challenge.authParams, (Object) this.authParams);
        }
    }

    public int hashCode() {
        return ((899 + this.scheme.hashCode()) * 31) + this.authParams.hashCode();
    }

    @C12580l
    @C11314h(name = "realm")
    public final String realm() {
        return this.authParams.get("realm");
    }

    @C11314h(name = "scheme")
    @C12579k
    public final String scheme() {
        return this.scheme;
    }

    @C12579k
    public String toString() {
        return this.scheme + " authParams=" + this.authParams;
    }

    @C12579k
    public final Challenge withCharset(@C12579k Charset charset) {
        Intrinsics.checkNotNullParameter(charset, "charset");
        Map<String, String> J0 = C10977s0.m41442J0(this.authParams);
        String name = charset.name();
        Intrinsics.checkNotNullExpressionValue(name, "charset.name()");
        J0.put("charset", name);
        return new Challenge(this.scheme, J0);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Challenge(@org.jetbrains.annotations.C12579k java.lang.String r2, @org.jetbrains.annotations.C12579k java.lang.String r3) {
        /*
            r1 = this;
            java.lang.String r0 = "scheme"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "realm"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.util.Map r3 = java.util.Collections.singletonMap(r0, r3)
            java.lang.String r0 = "singletonMap(\"realm\", realm)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r0)
            r1.<init>((java.lang.String) r2, (java.util.Map<java.lang.String, java.lang.String>) r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.Challenge.<init>(java.lang.String, java.lang.String):void");
    }
}
