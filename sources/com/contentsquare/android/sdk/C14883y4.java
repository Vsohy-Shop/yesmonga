package com.contentsquare.android.sdk;

import com.carrefour.fid.android.core.extension.C36306e;
import com.contentsquare.android.sdk.C14439j3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: com.contentsquare.android.sdk.y4 */
public final class C14883y4 extends C14439j3 {

    /* renamed from: m */
    public final String f36919m;

    /* renamed from: n */
    public final String f36920n;

    /* renamed from: o */
    public final long f36921o;

    /* renamed from: p */
    public final long f36922p;

    /* renamed from: q */
    public final int f36923q;

    /* renamed from: com.contentsquare.android.sdk.y4$a */
    public static final class C14884a extends C14439j3.C14440a<C14883y4> {

        /* renamed from: k */
        public String f36924k;

        /* renamed from: l */
        public String f36925l;

        /* renamed from: m */
        public long f36926m;

        /* renamed from: n */
        public long f36927n;

        /* renamed from: o */
        public int f36928o;

        public C14884a() {
            mo35603i(21);
        }

        /* renamed from: A */
        public C14883y4 mo34709e() {
            return new C14883y4(this, (DefaultConstructorMarker) null);
        }

        /* renamed from: B */
        public final String mo36919B() {
            return this.f36925l;
        }

        /* renamed from: C */
        public final long mo36920C() {
            return this.f36926m;
        }

        /* renamed from: D */
        public final String mo36921D() {
            return this.f36924k;
        }

        /* renamed from: E */
        public final long mo36922E() {
            return this.f36927n;
        }

        /* renamed from: F */
        public final int mo36923F() {
            return this.f36928o;
        }

        /* renamed from: v */
        public final void mo36924v(long j) {
            this.f36926m = j;
        }

        /* renamed from: w */
        public final void mo36925w(String str) {
            this.f36925l = str;
        }

        /* renamed from: x */
        public final void mo36926x(long j) {
            this.f36927n = j;
        }

        /* renamed from: y */
        public final void mo36927y(String str) {
            this.f36924k = str;
        }

        /* renamed from: z */
        public final void mo36928z(int i) {
            this.f36928o = i;
        }
    }

    public C14883y4(C14884a aVar) {
        super(aVar);
        String D = aVar.mo36921D();
        String str = "";
        this.f36919m = D == null ? str : D;
        String B = aVar.mo36919B();
        this.f36920n = B != null ? B : str;
        this.f36921o = aVar.mo36920C();
        this.f36922p = aVar.mo36922E();
        this.f36923q = aVar.mo36923F();
    }

    /* renamed from: l */
    public void mo34706l() {
        C14453jf jfVar = C14439j3.f35661l;
        String str = this.f36920n;
        String str2 = this.f36919m;
        int i = this.f36923q;
        long j = this.f36921o;
        long j2 = this.f36922p;
        jfVar.mo35679i("NetworkRequestMetricEvent " + str + " " + str2 + C36306e.f89637a + i + "), start: " + j + ", end: " + j2, new Object[0]);
    }

    /* renamed from: m */
    public final String mo36913m() {
        return this.f36920n;
    }

    /* renamed from: n */
    public final long mo36914n() {
        return this.f36921o;
    }

    /* renamed from: o */
    public final String mo36915o() {
        return this.f36919m;
    }

    /* renamed from: p */
    public final long mo36916p() {
        return this.f36922p;
    }

    /* renamed from: q */
    public final int mo36917q() {
        return this.f36923q;
    }

    public /* synthetic */ C14883y4(C14884a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar);
    }
}
