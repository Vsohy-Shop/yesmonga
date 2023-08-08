package com.carrefour.fid.android.design.components.widgets;

import androidx.annotation.C0375v;
import androidx.compose.runtime.internal.C8567o;
import com.urbanairship.iam.C9127a0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.design.components.widgets.n */
public final class C37283n {

    /* renamed from: o */
    public static final int f93511o = 0;
    @C12579k

    /* renamed from: a */
    public final String f93512a;
    @C12579k

    /* renamed from: b */
    public final String f93513b;
    @C12579k

    /* renamed from: c */
    public final String f93514c;
    @C12579k

    /* renamed from: d */
    public final String f93515d;
    @C12579k

    /* renamed from: e */
    public final String f93516e;

    /* renamed from: f */
    public final boolean f93517f;
    @C12579k

    /* renamed from: g */
    public final String f93518g;
    @C12580l

    /* renamed from: h */
    public final Integer f93519h;

    /* renamed from: i */
    public final boolean f93520i;

    /* renamed from: j */
    public final boolean f93521j;

    /* renamed from: k */
    public final boolean f93522k;
    @C12579k

    /* renamed from: l */
    public final String f93523l;

    /* renamed from: m */
    public final boolean f93524m;
    @C12579k

    /* renamed from: n */
    public final CouponType f93525n;

    public C37283n(@C12579k String str, @C12579k String str2, @C12579k String str3, @C12579k String str4, @C12579k String str5, boolean z, @C12579k String str6, @C0375v @C12580l Integer num, boolean z2, boolean z3, boolean z4, @C12579k String str7, boolean z5, @C12579k CouponType couponType) {
        Intrinsics.checkNotNullParameter(str, "promo");
        Intrinsics.checkNotNullParameter(str2, "text");
        Intrinsics.checkNotNullParameter(str3, "date");
        Intrinsics.checkNotNullParameter(str4, "price");
        Intrinsics.checkNotNullParameter(str5, C9127a0.f24709d);
        Intrinsics.checkNotNullParameter(str6, "facility");
        Intrinsics.checkNotNullParameter(str7, "promotionChannel");
        Intrinsics.checkNotNullParameter(couponType, "couponType");
        this.f93512a = str;
        this.f93513b = str2;
        this.f93514c = str3;
        this.f93515d = str4;
        this.f93516e = str5;
        this.f93517f = z;
        this.f93518g = str6;
        this.f93519h = num;
        this.f93520i = z2;
        this.f93521j = z3;
        this.f93522k = z4;
        this.f93523l = str7;
        this.f93524m = z5;
        this.f93525n = couponType;
    }

    /* renamed from: p */
    public static /* synthetic */ C37283n m152996p(C37283n nVar, String str, String str2, String str3, String str4, String str5, boolean z, String str6, Integer num, boolean z2, boolean z3, boolean z4, String str7, boolean z5, CouponType couponType, int i, Object obj) {
        C37283n nVar2 = nVar;
        int i2 = i;
        return nVar.mo113569o((i2 & 1) != 0 ? nVar2.f93512a : str, (i2 & 2) != 0 ? nVar2.f93513b : str2, (i2 & 4) != 0 ? nVar2.f93514c : str3, (i2 & 8) != 0 ? nVar2.f93515d : str4, (i2 & 16) != 0 ? nVar2.f93516e : str5, (i2 & 32) != 0 ? nVar2.f93517f : z, (i2 & 64) != 0 ? nVar2.f93518g : str6, (i2 & 128) != 0 ? nVar2.f93519h : num, (i2 & 256) != 0 ? nVar2.f93520i : z2, (i2 & 512) != 0 ? nVar2.f93521j : z3, (i2 & 1024) != 0 ? nVar2.f93522k : z4, (i2 & 2048) != 0 ? nVar2.f93523l : str7, (i2 & 4096) != 0 ? nVar2.f93524m : z5, (i2 & 8192) != 0 ? nVar2.f93525n : couponType);
    }

    @C12579k
    /* renamed from: A */
    public final String mo113549A() {
        return this.f93513b;
    }

    /* renamed from: B */
    public final boolean mo113550B() {
        return this.f93517f;
    }

    /* renamed from: C */
    public final boolean mo113551C() {
        return this.f93524m;
    }

    /* renamed from: D */
    public final boolean mo113552D() {
        return this.f93521j;
    }

    @C12579k
    /* renamed from: a */
    public final String mo113553a() {
        return this.f93512a;
    }

    /* renamed from: b */
    public final boolean mo113554b() {
        return this.f93521j;
    }

    /* renamed from: c */
    public final boolean mo113555c() {
        return this.f93522k;
    }

    @C12579k
    /* renamed from: d */
    public final String mo113556d() {
        return this.f93523l;
    }

    /* renamed from: e */
    public final boolean mo113557e() {
        return this.f93524m;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37283n)) {
            return false;
        }
        C37283n nVar = (C37283n) obj;
        return Intrinsics.areEqual((Object) this.f93512a, (Object) nVar.f93512a) && Intrinsics.areEqual((Object) this.f93513b, (Object) nVar.f93513b) && Intrinsics.areEqual((Object) this.f93514c, (Object) nVar.f93514c) && Intrinsics.areEqual((Object) this.f93515d, (Object) nVar.f93515d) && Intrinsics.areEqual((Object) this.f93516e, (Object) nVar.f93516e) && this.f93517f == nVar.f93517f && Intrinsics.areEqual((Object) this.f93518g, (Object) nVar.f93518g) && Intrinsics.areEqual((Object) this.f93519h, (Object) nVar.f93519h) && this.f93520i == nVar.f93520i && this.f93521j == nVar.f93521j && this.f93522k == nVar.f93522k && Intrinsics.areEqual((Object) this.f93523l, (Object) nVar.f93523l) && this.f93524m == nVar.f93524m && this.f93525n == nVar.f93525n;
    }

    @C12579k
    /* renamed from: f */
    public final CouponType mo113559f() {
        return this.f93525n;
    }

    @C12579k
    /* renamed from: g */
    public final String mo113560g() {
        return this.f93513b;
    }

    @C12579k
    /* renamed from: h */
    public final String mo113561h() {
        return this.f93514c;
    }

    public int hashCode() {
        int hashCode = ((((((((this.f93512a.hashCode() * 31) + this.f93513b.hashCode()) * 31) + this.f93514c.hashCode()) * 31) + this.f93515d.hashCode()) * 31) + this.f93516e.hashCode()) * 31;
        boolean z = this.f93517f;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int hashCode2 = (((hashCode + (z ? 1 : 0)) * 31) + this.f93518g.hashCode()) * 31;
        Integer num = this.f93519h;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        boolean z3 = this.f93520i;
        if (z3) {
            z3 = true;
        }
        int i = (hashCode3 + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.f93521j;
        if (z4) {
            z4 = true;
        }
        int i2 = (i + (z4 ? 1 : 0)) * 31;
        boolean z5 = this.f93522k;
        if (z5) {
            z5 = true;
        }
        int hashCode4 = (((i2 + (z5 ? 1 : 0)) * 31) + this.f93523l.hashCode()) * 31;
        boolean z6 = this.f93524m;
        if (!z6) {
            z2 = z6;
        }
        return ((hashCode4 + (z2 ? 1 : 0)) * 31) + this.f93525n.hashCode();
    }

    @C12579k
    /* renamed from: i */
    public final String mo113563i() {
        return this.f93515d;
    }

    @C12579k
    /* renamed from: j */
    public final String mo113564j() {
        return this.f93516e;
    }

    /* renamed from: k */
    public final boolean mo113565k() {
        return this.f93517f;
    }

    @C12579k
    /* renamed from: l */
    public final String mo113566l() {
        return this.f93518g;
    }

    @C12580l
    /* renamed from: m */
    public final Integer mo113567m() {
        return this.f93519h;
    }

    /* renamed from: n */
    public final boolean mo113568n() {
        return this.f93520i;
    }

    @C12579k
    /* renamed from: o */
    public final C37283n mo113569o(@C12579k String str, @C12579k String str2, @C12579k String str3, @C12579k String str4, @C12579k String str5, boolean z, @C12579k String str6, @C0375v @C12580l Integer num, boolean z2, boolean z3, boolean z4, @C12579k String str7, boolean z5, @C12579k CouponType couponType) {
        String str8 = str;
        Intrinsics.checkNotNullParameter(str8, "promo");
        String str9 = str2;
        Intrinsics.checkNotNullParameter(str9, "text");
        String str10 = str3;
        Intrinsics.checkNotNullParameter(str10, "date");
        String str11 = str4;
        Intrinsics.checkNotNullParameter(str11, "price");
        String str12 = str5;
        Intrinsics.checkNotNullParameter(str12, C9127a0.f24709d);
        String str13 = str6;
        Intrinsics.checkNotNullParameter(str13, "facility");
        String str14 = str7;
        Intrinsics.checkNotNullParameter(str14, "promotionChannel");
        CouponType couponType2 = couponType;
        Intrinsics.checkNotNullParameter(couponType2, "couponType");
        return new C37283n(str8, str9, str10, str11, str12, z, str13, num, z2, z3, z4, str14, z5, couponType2);
    }

    /* renamed from: q */
    public final boolean mo113570q() {
        return this.f93520i;
    }

    @C12579k
    /* renamed from: r */
    public final CouponType mo113571r() {
        return this.f93525n;
    }

    @C12579k
    /* renamed from: s */
    public final String mo113572s() {
        return this.f93514c;
    }

    @C12579k
    /* renamed from: t */
    public final String mo113573t() {
        return this.f93518g;
    }

    @C12579k
    public String toString() {
        String str = this.f93512a;
        String str2 = this.f93513b;
        String str3 = this.f93514c;
        String str4 = this.f93515d;
        String str5 = this.f93516e;
        boolean z = this.f93517f;
        String str6 = this.f93518g;
        Integer num = this.f93519h;
        boolean z2 = this.f93520i;
        boolean z3 = this.f93521j;
        boolean z4 = this.f93522k;
        String str7 = this.f93523l;
        boolean z5 = this.f93524m;
        CouponType couponType = this.f93525n;
        return "CouponInfo(promo=" + str + ", text=" + str2 + ", date=" + str3 + ", price=" + str4 + ", image=" + str5 + ", isAnImmediateReimbursement=" + z + ", facility=" + str6 + ", facilityIcon=" + num + ", buttonEnabled=" + z2 + ", isSelected=" + z3 + ", overlayEnabled=" + z4 + ", promotionChannel=" + str7 + ", isButtonLoading=" + z5 + ", couponType=" + couponType + ")";
    }

    @C12580l
    /* renamed from: u */
    public final Integer mo113575u() {
        return this.f93519h;
    }

    @C12579k
    /* renamed from: v */
    public final String mo113576v() {
        return this.f93516e;
    }

    /* renamed from: w */
    public final boolean mo113577w() {
        return this.f93522k;
    }

    @C12579k
    /* renamed from: x */
    public final String mo113578x() {
        return this.f93515d;
    }

    @C12579k
    /* renamed from: y */
    public final String mo113579y() {
        return this.f93512a;
    }

    @C12579k
    /* renamed from: z */
    public final String mo113580z() {
        return this.f93523l;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C37283n(java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, boolean r24, java.lang.String r25, java.lang.Integer r26, boolean r27, boolean r28, boolean r29, java.lang.String r30, boolean r31, com.carrefour.fid.android.design.components.widgets.CouponType r32, int r33, kotlin.jvm.internal.DefaultConstructorMarker r34) {
        /*
            r18 = this;
            r0 = r33
            r1 = r0 & 64
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x000a
            r10 = r2
            goto L_0x000c
        L_0x000a:
            r10 = r25
        L_0x000c:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0013
            r1 = 0
            r11 = r1
            goto L_0x0015
        L_0x0013:
            r11 = r26
        L_0x0015:
            r1 = r0 & 256(0x100, float:3.59E-43)
            r3 = 0
            if (r1 == 0) goto L_0x001c
            r12 = r3
            goto L_0x001e
        L_0x001c:
            r12 = r27
        L_0x001e:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0024
            r13 = r3
            goto L_0x0026
        L_0x0024:
            r13 = r28
        L_0x0026:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x002d
            r1 = 1
            r14 = r1
            goto L_0x002f
        L_0x002d:
            r14 = r29
        L_0x002f:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x0035
            r15 = r2
            goto L_0x0037
        L_0x0035:
            r15 = r30
        L_0x0037:
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x003e
            r16 = r3
            goto L_0x0040
        L_0x003e:
            r16 = r31
        L_0x0040:
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r21
            r7 = r22
            r8 = r23
            r9 = r24
            r17 = r32
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.design.components.widgets.C37283n.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.Integer, boolean, boolean, boolean, java.lang.String, boolean, com.carrefour.fid.android.design.components.widgets.CouponType, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
