package com.carrefour.fid.android.domain.models;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.data.entities.coupons.CouponStatus;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.domain.models.d */
public final class C38015d {

    /* renamed from: x */
    public static final int f95786x = 8;

    /* renamed from: a */
    public final long f95787a;
    @C12579k

    /* renamed from: b */
    public final String f95788b;
    @C12579k

    /* renamed from: c */
    public final String f95789c;
    @C12579k

    /* renamed from: d */
    public final String f95790d;
    @C12580l

    /* renamed from: e */
    public final Double f95791e;
    @C12579k

    /* renamed from: f */
    public final DiscountType f95792f;
    @C12579k

    /* renamed from: g */
    public final String f95793g;
    @C12579k

    /* renamed from: h */
    public final String f95794h;

    /* renamed from: i */
    public final long f95795i;
    @C12580l

    /* renamed from: j */
    public final String f95796j;
    @C12579k

    /* renamed from: k */
    public final String f95797k;
    @C12579k

    /* renamed from: l */
    public final List<String> f95798l;
    @C12579k

    /* renamed from: m */
    public final String f95799m;
    @C12579k

    /* renamed from: n */
    public final String f95800n;
    @C12579k

    /* renamed from: o */
    public final CouponStatus f95801o;
    @C12580l

    /* renamed from: p */
    public final C38029f f95802p;
    @C12579k

    /* renamed from: q */
    public final String f95803q;
    @C12579k

    /* renamed from: r */
    public final List<String> f95804r;
    @C12579k

    /* renamed from: s */
    public final String f95805s;
    @C12580l

    /* renamed from: t */
    public final C38041k f95806t;
    @C12579k

    /* renamed from: u */
    public final String f95807u;
    @C12580l

    /* renamed from: v */
    public final String f95808v;
    @C12579k

    /* renamed from: w */
    public final String f95809w;

    public C38015d(long j, @C12579k String str, @C12579k String str2, @C12579k String str3, @C12580l Double d, @C12579k DiscountType discountType, @C12579k String str4, @C12579k String str5, long j2, @C12580l String str6, @C12579k String str7, @C12579k List<String> list, @C12579k String str8, @C12579k String str9, @C12579k CouponStatus couponStatus, @C12580l C38029f fVar, @C12579k String str10, @C12579k List<String> list2, @C12579k String str11, @C12580l C38041k kVar, @C12579k String str12, @C12580l String str13, @C12579k String str14) {
        String str15 = str;
        String str16 = str2;
        String str17 = str3;
        DiscountType discountType2 = discountType;
        String str18 = str4;
        String str19 = str5;
        String str20 = str7;
        List<String> list3 = list;
        String str21 = str8;
        String str22 = str9;
        CouponStatus couponStatus2 = couponStatus;
        String str23 = str10;
        List<String> list4 = list2;
        Intrinsics.checkNotNullParameter(str15, "description");
        Intrinsics.checkNotNullParameter(str16, "descriptionField");
        Intrinsics.checkNotNullParameter(str17, "category");
        Intrinsics.checkNotNullParameter(discountType2, "discountType");
        Intrinsics.checkNotNullParameter(str18, "validityStartDate");
        Intrinsics.checkNotNullParameter(str19, "validityEndDate");
        Intrinsics.checkNotNullParameter(str20, "couponSubType");
        Intrinsics.checkNotNullParameter(list3, "stores");
        Intrinsics.checkNotNullParameter(str21, "storeType");
        Intrinsics.checkNotNullParameter(str22, "reimbursementType");
        Intrinsics.checkNotNullParameter(couponStatus2, "status");
        Intrinsics.checkNotNullParameter(str23, "couponType");
        Intrinsics.checkNotNullParameter(list4, "articles");
        Intrinsics.checkNotNullParameter(str11, "requirements");
        Intrinsics.checkNotNullParameter(str12, "promotionChannel");
        Intrinsics.checkNotNullParameter(str14, "emissionDate");
        this.f95787a = j;
        this.f95788b = str15;
        this.f95789c = str16;
        this.f95790d = str17;
        this.f95791e = d;
        this.f95792f = discountType2;
        this.f95793g = str18;
        this.f95794h = str19;
        this.f95795i = j2;
        this.f95796j = str6;
        this.f95797k = str20;
        this.f95798l = list3;
        this.f95799m = str21;
        this.f95800n = str22;
        this.f95801o = couponStatus2;
        this.f95802p = fVar;
        this.f95803q = str23;
        this.f95804r = list4;
        this.f95805s = str11;
        this.f95806t = kVar;
        this.f95807u = str12;
        this.f95808v = str13;
        this.f95809w = str14;
    }

    /* renamed from: y */
    public static /* synthetic */ C38015d m156658y(C38015d dVar, long j, String str, String str2, String str3, Double d, DiscountType discountType, String str4, String str5, long j2, String str6, String str7, List list, String str8, String str9, CouponStatus couponStatus, C38029f fVar, String str10, List list2, String str11, C38041k kVar, String str12, String str13, String str14, int i, Object obj) {
        C38015d dVar2 = dVar;
        int i2 = i;
        return dVar.mo117623x((i2 & 1) != 0 ? dVar2.f95787a : j, (i2 & 2) != 0 ? dVar2.f95788b : str, (i2 & 4) != 0 ? dVar2.f95789c : str2, (i2 & 8) != 0 ? dVar2.f95790d : str3, (i2 & 16) != 0 ? dVar2.f95791e : d, (i2 & 32) != 0 ? dVar2.f95792f : discountType, (i2 & 64) != 0 ? dVar2.f95793g : str4, (i2 & 128) != 0 ? dVar2.f95794h : str5, (i2 & 256) != 0 ? dVar2.f95795i : j2, (i2 & 512) != 0 ? dVar2.f95796j : str6, (i2 & 1024) != 0 ? dVar2.f95797k : str7, (i2 & 2048) != 0 ? dVar2.f95798l : list, (i2 & 4096) != 0 ? dVar2.f95799m : str8, (i2 & 8192) != 0 ? dVar2.f95800n : str9, (i2 & 16384) != 0 ? dVar2.f95801o : couponStatus, (i2 & 32768) != 0 ? dVar2.f95802p : fVar, (i2 & 65536) != 0 ? dVar2.f95803q : str10, (i2 & 131072) != 0 ? dVar2.f95804r : list2, (i2 & 262144) != 0 ? dVar2.f95805s : str11, (i2 & 524288) != 0 ? dVar2.f95806t : kVar, (i2 & 1048576) != 0 ? dVar2.f95807u : str12, (i2 & 2097152) != 0 ? dVar2.f95808v : str13, (i2 & 4194304) != 0 ? dVar2.f95809w : str14);
    }

    @C12580l
    /* renamed from: A */
    public final Double mo117575A() {
        return this.f95791e;
    }

    @C12580l
    /* renamed from: B */
    public final String mo117576B() {
        return this.f95808v;
    }

    @C12579k
    /* renamed from: C */
    public final String mo117577C() {
        return this.f95790d;
    }

    @C12579k
    /* renamed from: D */
    public final String mo117578D() {
        return this.f95797k;
    }

    @C12579k
    /* renamed from: E */
    public final String mo117579E() {
        return this.f95803q;
    }

    @C12579k
    /* renamed from: F */
    public final String mo117580F() {
        return this.f95788b;
    }

    @C12579k
    /* renamed from: G */
    public final String mo117581G() {
        return this.f95789c;
    }

    @C12579k
    /* renamed from: H */
    public final DiscountType mo117582H() {
        return this.f95792f;
    }

    /* renamed from: I */
    public final long mo117583I() {
        return this.f95787a;
    }

    @C12579k
    /* renamed from: J */
    public final String mo117584J() {
        return this.f95809w;
    }

    @C12580l
    /* renamed from: K */
    public final C38041k mo117585K() {
        return this.f95806t;
    }

    @C12580l
    /* renamed from: L */
    public final C38029f mo117586L() {
        return this.f95802p;
    }

    /* renamed from: M */
    public final long mo117587M() {
        return this.f95795i;
    }

    @C12579k
    /* renamed from: N */
    public final String mo117588N() {
        return this.f95807u;
    }

    @C12579k
    /* renamed from: O */
    public final String mo117589O() {
        return this.f95800n;
    }

    @C12579k
    /* renamed from: P */
    public final String mo117590P() {
        return this.f95805s;
    }

    @C12579k
    /* renamed from: Q */
    public final CouponStatus mo117591Q() {
        return this.f95801o;
    }

    @C12579k
    /* renamed from: R */
    public final String mo117592R() {
        return this.f95799m;
    }

    @C12579k
    /* renamed from: S */
    public final List<String> mo117593S() {
        return this.f95798l;
    }

    @C12580l
    /* renamed from: T */
    public final String mo117594T() {
        return this.f95796j;
    }

    @C12579k
    /* renamed from: U */
    public final String mo117595U() {
        return this.f95794h;
    }

    @C12579k
    /* renamed from: V */
    public final String mo117596V() {
        return this.f95793g;
    }

    /* renamed from: a */
    public final long mo117597a() {
        return this.f95787a;
    }

    @C12580l
    /* renamed from: b */
    public final String mo117598b() {
        return this.f95796j;
    }

    @C12579k
    /* renamed from: c */
    public final String mo117599c() {
        return this.f95797k;
    }

    @C12579k
    /* renamed from: d */
    public final List<String> mo117600d() {
        return this.f95798l;
    }

    @C12579k
    /* renamed from: e */
    public final String mo117601e() {
        return this.f95799m;
    }

    public boolean equals(@C12580l Object obj) {
        if (!(obj instanceof C38015d)) {
            return false;
        }
        C38015d dVar = (C38015d) obj;
        if (this.f95787a == dVar.f95787a && Intrinsics.areEqual((Object) this.f95803q, (Object) dVar.f95803q) && this.f95801o == dVar.f95801o) {
            return true;
        }
        return false;
    }

    @C12579k
    /* renamed from: f */
    public final String mo117603f() {
        return this.f95800n;
    }

    @C12579k
    /* renamed from: g */
    public final CouponStatus mo117604g() {
        return this.f95801o;
    }

    @C12580l
    /* renamed from: h */
    public final C38029f mo117605h() {
        return this.f95802p;
    }

    public int hashCode() {
        return (((Long.hashCode(this.f95787a) * 31) + this.f95803q.hashCode()) * 31) + this.f95801o.hashCode();
    }

    @C12579k
    /* renamed from: i */
    public final String mo117607i() {
        return this.f95803q;
    }

    @C12579k
    /* renamed from: j */
    public final List<String> mo117608j() {
        return this.f95804r;
    }

    @C12579k
    /* renamed from: k */
    public final String mo117609k() {
        return this.f95805s;
    }

    @C12579k
    /* renamed from: l */
    public final String mo117610l() {
        return this.f95788b;
    }

    @C12580l
    /* renamed from: m */
    public final C38041k mo117611m() {
        return this.f95806t;
    }

    @C12579k
    /* renamed from: n */
    public final String mo117612n() {
        return this.f95807u;
    }

    @C12580l
    /* renamed from: o */
    public final String mo117613o() {
        return this.f95808v;
    }

    @C12579k
    /* renamed from: p */
    public final String mo117614p() {
        return this.f95809w;
    }

    @C12579k
    /* renamed from: q */
    public final String mo117615q() {
        return this.f95789c;
    }

    @C12579k
    /* renamed from: r */
    public final String mo117616r() {
        return this.f95790d;
    }

    @C12580l
    /* renamed from: s */
    public final Double mo117617s() {
        return this.f95791e;
    }

    @C12579k
    /* renamed from: t */
    public final DiscountType mo117618t() {
        return this.f95792f;
    }

    @C12579k
    public String toString() {
        long j = this.f95787a;
        String str = this.f95788b;
        String str2 = this.f95789c;
        String str3 = this.f95790d;
        Double d = this.f95791e;
        DiscountType discountType = this.f95792f;
        String str4 = this.f95793g;
        String str5 = this.f95794h;
        long j2 = this.f95795i;
        String str6 = this.f95796j;
        String str7 = this.f95797k;
        List<String> list = this.f95798l;
        String str8 = this.f95799m;
        String str9 = this.f95800n;
        CouponStatus couponStatus = this.f95801o;
        C38029f fVar = this.f95802p;
        String str10 = this.f95803q;
        List<String> list2 = this.f95804r;
        String str11 = this.f95805s;
        C38041k kVar = this.f95806t;
        String str12 = this.f95807u;
        String str13 = this.f95808v;
        String str14 = this.f95809w;
        return "CouponDomain(ean13=" + j + ", description=" + str + ", descriptionField=" + str2 + ", category=" + str3 + ", benefitsValue=" + d + ", discountType=" + discountType + ", validityStartDate=" + str4 + ", validityEndDate=" + str5 + ", priority=" + j2 + ", transmitterId=" + str6 + ", couponSubType=" + str7 + ", stores=" + list + ", storeType=" + str8 + ", reimbursementType=" + str9 + ", status=" + couponStatus + ", image=" + fVar + ", couponType=" + str10 + ", articles=" + list2 + ", requirements=" + str11 + ", facility=" + kVar + ", promotionChannel=" + str12 + ", burnedDate=" + str13 + ", emissionDate=" + str14 + ")";
    }

    @C12579k
    /* renamed from: u */
    public final String mo117620u() {
        return this.f95793g;
    }

    @C12579k
    /* renamed from: v */
    public final String mo117621v() {
        return this.f95794h;
    }

    /* renamed from: w */
    public final long mo117622w() {
        return this.f95795i;
    }

    @C12579k
    /* renamed from: x */
    public final C38015d mo117623x(long j, @C12579k String str, @C12579k String str2, @C12579k String str3, @C12580l Double d, @C12579k DiscountType discountType, @C12579k String str4, @C12579k String str5, long j2, @C12580l String str6, @C12579k String str7, @C12579k List<String> list, @C12579k String str8, @C12579k String str9, @C12579k CouponStatus couponStatus, @C12580l C38029f fVar, @C12579k String str10, @C12579k List<String> list2, @C12579k String str11, @C12580l C38041k kVar, @C12579k String str12, @C12580l String str13, @C12579k String str14) {
        long j3 = j;
        Intrinsics.checkNotNullParameter(str, "description");
        Intrinsics.checkNotNullParameter(str2, "descriptionField");
        Intrinsics.checkNotNullParameter(str3, "category");
        Intrinsics.checkNotNullParameter(discountType, "discountType");
        Intrinsics.checkNotNullParameter(str4, "validityStartDate");
        Intrinsics.checkNotNullParameter(str5, "validityEndDate");
        Intrinsics.checkNotNullParameter(str7, "couponSubType");
        Intrinsics.checkNotNullParameter(list, "stores");
        Intrinsics.checkNotNullParameter(str8, "storeType");
        Intrinsics.checkNotNullParameter(str9, "reimbursementType");
        Intrinsics.checkNotNullParameter(couponStatus, "status");
        Intrinsics.checkNotNullParameter(str10, "couponType");
        Intrinsics.checkNotNullParameter(list2, "articles");
        Intrinsics.checkNotNullParameter(str11, "requirements");
        Intrinsics.checkNotNullParameter(str12, "promotionChannel");
        Intrinsics.checkNotNullParameter(str14, "emissionDate");
        return new C38015d(j, str, str2, str3, d, discountType, str4, str5, j2, str6, str7, list, str8, str9, couponStatus, fVar, str10, list2, str11, kVar, str12, str13, str14);
    }

    @C12579k
    /* renamed from: z */
    public final List<String> mo117624z() {
        return this.f95804r;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C38015d(long r31, java.lang.String r33, java.lang.String r34, java.lang.String r35, java.lang.Double r36, com.carrefour.fid.android.domain.models.DiscountType r37, java.lang.String r38, java.lang.String r39, long r40, java.lang.String r42, java.lang.String r43, java.util.List r44, java.lang.String r45, java.lang.String r46, com.carrefour.fid.android.data.entities.coupons.CouponStatus r47, com.carrefour.fid.android.domain.models.C38029f r48, java.lang.String r49, java.util.List r50, java.lang.String r51, com.carrefour.fid.android.domain.models.C38041k r52, java.lang.String r53, java.lang.String r54, java.lang.String r55, int r56, kotlin.jvm.internal.DefaultConstructorMarker r57) {
        /*
            r30 = this;
            r0 = r56
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x000a
            r5 = r2
            goto L_0x000c
        L_0x000a:
            r5 = r31
        L_0x000c:
            r1 = r0 & 2
            if (r1 == 0) goto L_0x0017
            java.lang.String r1 = new java.lang.String
            r1.<init>()
            r7 = r1
            goto L_0x0019
        L_0x0017:
            r7 = r33
        L_0x0019:
            r1 = r0 & 4
            if (r1 == 0) goto L_0x0024
            java.lang.String r1 = new java.lang.String
            r1.<init>()
            r8 = r1
            goto L_0x0026
        L_0x0024:
            r8 = r34
        L_0x0026:
            r1 = r0 & 8
            if (r1 == 0) goto L_0x0031
            java.lang.String r1 = new java.lang.String
            r1.<init>()
            r9 = r1
            goto L_0x0033
        L_0x0031:
            r9 = r35
        L_0x0033:
            r1 = r0 & 16
            r4 = 0
            if (r1 == 0) goto L_0x003a
            r10 = r4
            goto L_0x003c
        L_0x003a:
            r10 = r36
        L_0x003c:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0044
            com.carrefour.fid.android.domain.models.DiscountType r1 = com.carrefour.fid.android.domain.models.DiscountType.UNKNOWN
            r11 = r1
            goto L_0x0046
        L_0x0044:
            r11 = r37
        L_0x0046:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0051
            java.lang.String r1 = new java.lang.String
            r1.<init>()
            r12 = r1
            goto L_0x0053
        L_0x0051:
            r12 = r38
        L_0x0053:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x005e
            java.lang.String r1 = new java.lang.String
            r1.<init>()
            r13 = r1
            goto L_0x0060
        L_0x005e:
            r13 = r39
        L_0x0060:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0066
            r14 = r2
            goto L_0x0068
        L_0x0066:
            r14 = r40
        L_0x0068:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x006f
            r16 = r4
            goto L_0x0071
        L_0x006f:
            r16 = r42
        L_0x0071:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x007d
            java.lang.String r1 = new java.lang.String
            r1.<init>()
            r17 = r1
            goto L_0x007f
        L_0x007d:
            r17 = r43
        L_0x007f:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x008a
            java.util.List r1 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
            r18 = r1
            goto L_0x008c
        L_0x008a:
            r18 = r44
        L_0x008c:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L_0x0098
            java.lang.String r1 = new java.lang.String
            r1.<init>()
            r19 = r1
            goto L_0x009a
        L_0x0098:
            r19 = r45
        L_0x009a:
            r1 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L_0x00a6
            java.lang.String r1 = new java.lang.String
            r1.<init>()
            r20 = r1
            goto L_0x00a8
        L_0x00a6:
            r20 = r46
        L_0x00a8:
            r1 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x00b1
            r22 = r4
            goto L_0x00b3
        L_0x00b1:
            r22 = r48
        L_0x00b3:
            r1 = 65536(0x10000, float:9.18355E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x00c0
            java.lang.String r1 = new java.lang.String
            r1.<init>()
            r23 = r1
            goto L_0x00c2
        L_0x00c0:
            r23 = r49
        L_0x00c2:
            r1 = 131072(0x20000, float:1.83671E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x00ce
            java.util.List r1 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
            r24 = r1
            goto L_0x00d0
        L_0x00ce:
            r24 = r50
        L_0x00d0:
            r1 = 262144(0x40000, float:3.67342E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x00dd
            java.lang.String r1 = new java.lang.String
            r1.<init>()
            r25 = r1
            goto L_0x00df
        L_0x00dd:
            r25 = r51
        L_0x00df:
            r1 = 524288(0x80000, float:7.34684E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x00e7
            r26 = r4
            goto L_0x00e9
        L_0x00e7:
            r26 = r52
        L_0x00e9:
            r1 = 1048576(0x100000, float:1.469368E-39)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x00f6
            java.lang.String r1 = new java.lang.String
            r1.<init>()
            r27 = r1
            goto L_0x00f8
        L_0x00f6:
            r27 = r53
        L_0x00f8:
            r1 = 2097152(0x200000, float:2.938736E-39)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0100
            r28 = r4
            goto L_0x0102
        L_0x0100:
            r28 = r54
        L_0x0102:
            r1 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x010f
            java.lang.String r0 = new java.lang.String
            r0.<init>()
            r29 = r0
            goto L_0x0111
        L_0x010f:
            r29 = r55
        L_0x0111:
            r4 = r30
            r21 = r47
            r4.<init>(r5, r7, r8, r9, r10, r11, r12, r13, r14, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.models.C38015d.<init>(long, java.lang.String, java.lang.String, java.lang.String, java.lang.Double, com.carrefour.fid.android.domain.models.DiscountType, java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String, com.carrefour.fid.android.data.entities.coupons.CouponStatus, com.carrefour.fid.android.domain.models.f, java.lang.String, java.util.List, java.lang.String, com.carrefour.fid.android.domain.models.k, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
