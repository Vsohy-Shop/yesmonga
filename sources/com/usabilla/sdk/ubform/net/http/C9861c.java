package com.usabilla.sdk.ubform.net.http;

import com.android.volley.C21762l;
import com.android.volley.C21771p;
import com.android.volley.Request;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.C21812m;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11602d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.usabilla.sdk.ubform.net.http.c */
public class C9861c extends Request<C9873j> {
    @C12579k

    /* renamed from: I0 */
    public static final C9862a f27015I0 = new C9862a((DefaultConstructorMarker) null);
    @Deprecated

    /* renamed from: J0 */
    public static final int f27016J0 = 400;
    @Deprecated

    /* renamed from: K0 */
    public static final int f27017K0 = 599;
    @C12580l

    /* renamed from: H0 */
    public C21771p.C21773b<C9873j> f27018H0;

    /* renamed from: com.usabilla.sdk.ubform.net.http.c$a */
    public static final class C9862a {
        public /* synthetic */ C9862a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C9862a() {
        }
    }

    /* renamed from: com.usabilla.sdk.ubform.net.http.c$b */
    public static final class C9863b implements C9873j {

        /* renamed from: a */
        public final int f27019a;
        @C12580l

        /* renamed from: b */
        public final Map<String, String> f27020b;
        @C12579k

        /* renamed from: c */
        public final String f27021c;
        @C12580l

        /* renamed from: d */
        public final String f27022d;

        /* renamed from: e */
        public final /* synthetic */ C21762l f27023e;

        public C9863b(C21762l lVar) {
            this.f27023e = lVar;
            this.f27019a = lVar.f56297a;
            this.f27020b = lVar.f56299c;
            byte[] bArr = lVar.f56298b;
            Intrinsics.checkNotNullExpressionValue(bArr, "networkResponse.data");
            this.f27021c = new String(bArr, C11602d.f28868b);
        }

        @C12579k
        /* renamed from: a */
        public Integer mo20307a() {
            return Integer.valueOf(this.f27019a);
        }

        @C12579k
        public String getBody() {
            return this.f27021c;
        }

        @C12580l
        public String getError() {
            return this.f27022d;
        }

        @C12580l
        public Map<String, String> getHeaders() {
            return this.f27020b;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9861c(int i, @C12579k String str, @C12580l C21771p.C21773b<C9873j> bVar, @C12579k C21771p.C21772a aVar) {
        super(i, str, aVar);
        Intrinsics.checkNotNullParameter(str, "url");
        Intrinsics.checkNotNullParameter(aVar, "errorListener");
        this.f27018H0 = bVar;
    }

    /* renamed from: M1 */
    public void mo20306y(@C12579k C9873j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "response");
        C21771p.C21773b<C9873j> bVar = this.f27018H0;
        if (bVar != null) {
            bVar.mo20311b(jVar);
        }
    }

    @C12580l
    /* renamed from: N1 */
    public final C21771p.C21773b<C9873j> mo20303N1() {
        return this.f27018H0;
    }

    /* renamed from: Q1 */
    public final void mo20304Q1(@C12580l C21771p.C21773b<C9873j> bVar) {
        this.f27018H0 = bVar;
    }

    @C12579k
    /* renamed from: k1 */
    public C21771p<C9873j> mo20305k1(@C12579k C21762l lVar) {
        Intrinsics.checkNotNullParameter(lVar, "networkResponse");
        int i = lVar.f56297a;
        boolean z = false;
        if (400 <= i && i <= 599) {
            z = true;
        }
        if (z) {
            C21771p<C9873j> a = C21771p.m100086a(new VolleyError(lVar));
            Intrinsics.checkNotNullExpressionValue(a, "error<UsabillaHttpResponse>(VolleyError(networkResponse))");
            return a;
        }
        C21771p<C9873j> c = C21771p.m100087c(new C9863b(lVar), C21812m.m100215e(lVar));
        Intrinsics.checkNotNullExpressionValue(c, "success(parsed, HttpHeaderParser.parseCacheHeaders(networkResponse))");
        return c;
    }
}
