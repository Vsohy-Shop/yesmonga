package com.usabilla.sdk.ubform.net.http;

import com.android.volley.C21762l;
import com.android.volley.C21771p;
import com.android.volley.VolleyError;
import com.google.android.gms.common.internal.C40852x;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.C11370u0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.usabilla.sdk.ubform.net.http.f */
public final class C9866f {
    @C12579k

    /* renamed from: a */
    public static final C9867a f27026a = new C9867a((DefaultConstructorMarker) null);
    @Deprecated

    /* renamed from: b */
    public static final int f27027b = 0;
    @Deprecated

    /* renamed from: c */
    public static final int f27028c = 1;
    @Deprecated

    /* renamed from: d */
    public static final int f27029d = 2;
    @Deprecated

    /* renamed from: e */
    public static final int f27030e = 3;
    @Deprecated

    /* renamed from: f */
    public static final int f27031f = 4;
    @Deprecated

    /* renamed from: g */
    public static final int f27032g = 5;
    @Deprecated

    /* renamed from: h */
    public static final int f27033h = 6;
    @Deprecated

    /* renamed from: i */
    public static final int f27034i = 7;

    /* renamed from: com.usabilla.sdk.ubform.net.http.f$a */
    public static final class C9867a {
        public /* synthetic */ C9867a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C9867a() {
        }
    }

    /* renamed from: com.usabilla.sdk.ubform.net.http.f$b */
    public static final class C9868b extends C9861c {

        /* renamed from: L0 */
        public final /* synthetic */ C9872i f27035L0;

        /* renamed from: M0 */
        public final /* synthetic */ int f27036M0;

        /* renamed from: N0 */
        public final /* synthetic */ C21771p.C21773b<C9873j> f27037N0;

        /* renamed from: O0 */
        public final /* synthetic */ C21771p.C21772a f27038O0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9868b(C9872i iVar, int i, C21771p.C21773b<C9873j> bVar, C21771p.C21772a aVar, String str) {
            super(i, str, bVar, aVar);
            this.f27035L0 = iVar;
            this.f27036M0 = i;
            this.f27037N0 = bVar;
            this.f27038O0 = aVar;
        }

        @C12580l
        /* renamed from: W */
        public byte[] mo20315W() {
            String body = this.f27035L0.getBody();
            if (body == null) {
                return null;
            }
            Charset forName = Charset.forName("utf-8");
            Intrinsics.checkNotNullExpressionValue(forName, "Charset.forName(charsetName)");
            byte[] bytes = body.getBytes(forName);
            Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
            return bytes;
        }

        @C12579k
        /* renamed from: h0 */
        public Map<String, String> mo20316h0() {
            Map<String, String> k = C11370u0.m43695k(this.f27035L0.getHeaders());
            if (k != null) {
                return k;
            }
            Map<String, String> emptyMap = Collections.emptyMap();
            Intrinsics.checkNotNullExpressionValue(emptyMap, "emptyMap()");
            return emptyMap;
        }
    }

    /* renamed from: com.usabilla.sdk.ubform.net.http.f$c */
    public static final class C9869c implements C9873j {
        @C12580l

        /* renamed from: a */
        public final Integer f27039a;
        @C12580l

        /* renamed from: b */
        public final HashMap<String, String> f27040b;
        @C12580l

        /* renamed from: c */
        public final String f27041c;

        /* renamed from: d */
        public final String f27042d;

        /* renamed from: e */
        public final /* synthetic */ VolleyError f27043e;

        public C9869c(VolleyError volleyError) {
            Integer num;
            this.f27043e = volleyError;
            C21762l lVar = volleyError.networkResponse;
            if (lVar == null) {
                num = null;
            } else {
                num = Integer.valueOf(lVar.f56297a);
            }
            this.f27039a = num;
            this.f27042d = volleyError.getLocalizedMessage();
        }

        @C12580l
        /* renamed from: a */
        public Integer mo20307a() {
            return this.f27039a;
        }

        @C12580l
        /* renamed from: b */
        public HashMap<String, String> getHeaders() {
            return this.f27040b;
        }

        @C12580l
        public String getBody() {
            return this.f27041c;
        }

        public String getError() {
            return this.f27042d;
        }
    }

    /* renamed from: e */
    public static final void m36978e(C9871h hVar, C9873j jVar) {
        Intrinsics.checkNotNullParameter(hVar, "$listener");
        Intrinsics.checkNotNullExpressionValue(jVar, "response");
        hVar.mo20318a(jVar);
    }

    /* renamed from: f */
    public static final void m36979f(C9871h hVar, VolleyError volleyError) {
        Intrinsics.checkNotNullParameter(hVar, "$listener");
        hVar.mo20319b(new C9869c(volleyError));
    }

    /* renamed from: c */
    public final int mo20313c(String str) {
        switch (str.hashCode()) {
            case -531492226:
                if (str.equals("OPTIONS")) {
                    return 5;
                }
                break;
            case 70454:
                if (str.equals("GET")) {
                    return 0;
                }
                break;
            case 79599:
                if (str.equals("PUT")) {
                    return 2;
                }
                break;
            case 2213344:
                if (str.equals("HEAD")) {
                    return 4;
                }
                break;
            case 2461856:
                if (str.equals("POST")) {
                    return 1;
                }
                break;
            case 75900968:
                if (str.equals("PATCH")) {
                    return 7;
                }
                break;
            case 80083237:
                if (str.equals("TRACE")) {
                    return 6;
                }
                break;
            case 2012838315:
                if (str.equals("DELETE")) {
                    return 3;
                }
                break;
        }
        throw new CannotConvertRequestException("Could not convert method");
    }

    @C12579k
    /* renamed from: d */
    public final C9861c mo20314d(@C12579k C9872i iVar, @C12579k C9871h hVar) {
        Intrinsics.checkNotNullParameter(iVar, "request");
        Intrinsics.checkNotNullParameter(hVar, C40852x.C40853a.f103958a);
        return new C9868b(iVar, mo20313c(iVar.getMethod()), new C9864d(hVar), new C9865e(hVar), iVar.getUrl());
    }
}
