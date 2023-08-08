package com.carrefour.fid.android.domain.models;

import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.domain.models.p */
public final class C38079p {

    /* renamed from: g */
    public static final int f96197g = 0;

    /* renamed from: a */
    public final double f96198a;
    @C12580l

    /* renamed from: b */
    public final String f96199b;
    @C12580l

    /* renamed from: c */
    public final String f96200c;
    @C12580l

    /* renamed from: d */
    public final String f96201d;
    @C12580l

    /* renamed from: e */
    public final String f96202e;
    @C12580l

    /* renamed from: f */
    public final String f96203f;

    public C38079p() {
        this(0.0d, (String) null, (String) null, (String) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null);
    }

    /* renamed from: h */
    public static /* synthetic */ C38079p m157208h(C38079p pVar, double d, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        C38079p pVar2 = pVar;
        return pVar.mo118263g((i & 1) != 0 ? pVar2.f96198a : d, (i & 2) != 0 ? pVar2.f96199b : str, (i & 4) != 0 ? pVar2.f96200c : str2, (i & 8) != 0 ? pVar2.f96201d : str3, (i & 16) != 0 ? pVar2.f96202e : str4, (i & 32) != 0 ? pVar2.f96203f : str5);
    }

    /* renamed from: a */
    public final double mo118256a() {
        return this.f96198a;
    }

    @C12580l
    /* renamed from: b */
    public final String mo118257b() {
        return this.f96199b;
    }

    @C12580l
    /* renamed from: c */
    public final String mo118258c() {
        return this.f96200c;
    }

    @C12580l
    /* renamed from: d */
    public final String mo118259d() {
        return this.f96201d;
    }

    @C12580l
    /* renamed from: e */
    public final String mo118260e() {
        return this.f96202e;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38079p)) {
            return false;
        }
        C38079p pVar = (C38079p) obj;
        return Double.compare(this.f96198a, pVar.f96198a) == 0 && Intrinsics.areEqual((Object) this.f96199b, (Object) pVar.f96199b) && Intrinsics.areEqual((Object) this.f96200c, (Object) pVar.f96200c) && Intrinsics.areEqual((Object) this.f96201d, (Object) pVar.f96201d) && Intrinsics.areEqual((Object) this.f96202e, (Object) pVar.f96202e) && Intrinsics.areEqual((Object) this.f96203f, (Object) pVar.f96203f);
    }

    @C12580l
    /* renamed from: f */
    public final String mo118262f() {
        return this.f96203f;
    }

    @C12579k
    /* renamed from: g */
    public final C38079p mo118263g(double d, @C12580l String str, @C12580l String str2, @C12580l String str3, @C12580l String str4, @C12580l String str5) {
        return new C38079p(d, str, str2, str3, str4, str5);
    }

    public int hashCode() {
        int hashCode = Double.hashCode(this.f96198a) * 31;
        String str = this.f96199b;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f96200c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f96201d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f96202e;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f96203f;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode5 + i;
    }

    /* renamed from: i */
    public final double mo118265i() {
        return this.f96198a;
    }

    @C12580l
    /* renamed from: j */
    public final String mo118266j() {
        return this.f96201d;
    }

    @C12580l
    /* renamed from: k */
    public final String mo118267k() {
        return this.f96199b;
    }

    @C12580l
    /* renamed from: l */
    public final String mo118268l() {
        return this.f96200c;
    }

    @C12580l
    /* renamed from: m */
    public final String mo118269m() {
        return this.f96203f;
    }

    @C12580l
    /* renamed from: n */
    public final String mo118270n() {
        return this.f96202e;
    }

    @C12579k
    public String toString() {
        double d = this.f96198a;
        String str = this.f96199b;
        String str2 = this.f96200c;
        String str3 = this.f96201d;
        String str4 = this.f96202e;
        String str5 = this.f96203f;
        return "OrdersOnlineDetailsAllowanceDomain(allowanceChargeAmount=" + d + ", allowanceChargeType=" + str + ", allowanceOrChargeType=" + str2 + ", allowanceChargeDescription=" + str3 + ", promotionType=" + str4 + ", bracketIdentifier=" + str5 + ")";
    }

    public C38079p(double d, @C12580l String str, @C12580l String str2, @C12580l String str3, @C12580l String str4, @C12580l String str5) {
        this.f96198a = d;
        this.f96199b = str;
        this.f96200c = str2;
        this.f96201d = str3;
        this.f96202e = str4;
        this.f96203f = str5;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C38079p(double r9, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, int r16, kotlin.jvm.internal.DefaultConstructorMarker r17) {
        /*
            r8 = this;
            r0 = r16 & 1
            if (r0 == 0) goto L_0x0007
            r0 = 0
            goto L_0x0008
        L_0x0007:
            r0 = r9
        L_0x0008:
            r2 = r16 & 2
            r3 = 0
            if (r2 == 0) goto L_0x000f
            r2 = r3
            goto L_0x0010
        L_0x000f:
            r2 = r11
        L_0x0010:
            r4 = r16 & 4
            if (r4 == 0) goto L_0x0016
            r4 = r3
            goto L_0x0017
        L_0x0016:
            r4 = r12
        L_0x0017:
            r5 = r16 & 8
            if (r5 == 0) goto L_0x001d
            r5 = r3
            goto L_0x001e
        L_0x001d:
            r5 = r13
        L_0x001e:
            r6 = r16 & 16
            if (r6 == 0) goto L_0x0024
            r6 = r3
            goto L_0x0025
        L_0x0024:
            r6 = r14
        L_0x0025:
            r7 = r16 & 32
            if (r7 == 0) goto L_0x002a
            goto L_0x002b
        L_0x002a:
            r3 = r15
        L_0x002b:
            r9 = r8
            r10 = r0
            r12 = r2
            r13 = r4
            r14 = r5
            r15 = r6
            r16 = r3
            r9.<init>(r10, r12, r13, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.models.C38079p.<init>(double, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
