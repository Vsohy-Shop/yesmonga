package com.carrefour.fid.android.presentation.p035ui.orders.online.model;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.domain.models.OrdersOnlineDetailsProductPriceDomain;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.model.i */
public final class C25241i implements C25234b {

    /* renamed from: G0 */
    public static final int f62236G0 = 8;
    @C12580l

    /* renamed from: E0 */
    public final Double f62237E0;
    @C12579k

    /* renamed from: F0 */
    public final C25239g f62238F0;
    @C12579k

    /* renamed from: X */
    public final String f62239X;
    @C12580l

    /* renamed from: Y */
    public final String f62240Y;
    @C12580l

    /* renamed from: Z */
    public final Double f62241Z;
    @C12579k

    /* renamed from: a */
    public final String f62242a;
    @C12579k

    /* renamed from: b */
    public final String f62243b;
    @C12579k

    /* renamed from: c */
    public final String f62244c;

    /* renamed from: d */
    public double f62245d;

    /* renamed from: e */
    public double f62246e;
    @C12580l

    /* renamed from: f */
    public final String f62247f;
    @C12579k

    /* renamed from: g */
    public final String f62248g;
    @C12579k

    /* renamed from: v */
    public final String f62249v;
    @C12580l

    /* renamed from: w */
    public final Integer f62250w;
    @C12580l

    /* renamed from: x */
    public final String f62251x;
    @C12579k

    /* renamed from: y */
    public final OrdersOnlineDetailsProductPriceDomain f62252y;

    /* renamed from: z */
    public final int f62253z;

    public C25241i(@C12579k String str, @C12579k String str2, @C12579k String str3, double d, double d2, @C12580l String str4, @C12579k String str5, @C12579k String str6, @C12580l Integer num, @C12580l String str7, @C12579k OrdersOnlineDetailsProductPriceDomain ordersOnlineDetailsProductPriceDomain, int i, @C12579k String str8, @C12580l String str9, @C12580l Double d3, @C12580l Double d4, @C12579k C25239g gVar) {
        String str10 = str5;
        String str11 = str6;
        OrdersOnlineDetailsProductPriceDomain ordersOnlineDetailsProductPriceDomain2 = ordersOnlineDetailsProductPriceDomain;
        String str12 = str8;
        C25239g gVar2 = gVar;
        Intrinsics.checkNotNullParameter(str, "category");
        Intrinsics.checkNotNullParameter(str2, "name");
        Intrinsics.checkNotNullParameter(str3, "cdBase");
        Intrinsics.checkNotNullParameter(str10, "packaging");
        Intrinsics.checkNotNullParameter(str11, "picturePath");
        Intrinsics.checkNotNullParameter(ordersOnlineDetailsProductPriceDomain2, "prices");
        Intrinsics.checkNotNullParameter(str12, "holderPosition");
        Intrinsics.checkNotNullParameter(gVar2, "replacedProductModel");
        this.f62242a = str;
        this.f62243b = str2;
        this.f62244c = str3;
        this.f62245d = d;
        this.f62246e = d2;
        this.f62247f = str4;
        this.f62248g = str10;
        this.f62249v = str11;
        this.f62250w = num;
        this.f62251x = str7;
        this.f62252y = ordersOnlineDetailsProductPriceDomain2;
        this.f62253z = i;
        this.f62239X = str12;
        this.f62240Y = str9;
        this.f62241Z = d3;
        this.f62237E0 = d4;
        this.f62238F0 = gVar2;
    }

    @C12579k
    /* renamed from: a */
    public final String mo73564a() {
        return this.f62244c;
    }

    @C12579k
    /* renamed from: b */
    public final String mo73565b() {
        return this.f62239X;
    }

    @C12579k
    /* renamed from: c */
    public String mo73434c() {
        return this.f62249v;
    }

    /* renamed from: d */
    public final double mo73566d() {
        return this.f62245d;
    }

    /* renamed from: e */
    public final double mo73567e() {
        return this.f62246e;
    }

    @C12580l
    /* renamed from: f */
    public final String mo73568f() {
        return this.f62247f;
    }

    @C12580l
    /* renamed from: g */
    public final String mo73569g() {
        return this.f62251x;
    }

    @C12579k
    public String getCategory() {
        return this.f62242a;
    }

    @C12579k
    public String getName() {
        return this.f62243b;
    }

    @C12579k
    /* renamed from: h */
    public final String mo73570h() {
        return this.f62248g;
    }

    @C12580l
    /* renamed from: i */
    public final Integer mo73571i() {
        return this.f62250w;
    }

    @C12579k
    /* renamed from: j */
    public final OrdersOnlineDetailsProductPriceDomain mo73572j() {
        return this.f62252y;
    }

    @C12580l
    /* renamed from: k */
    public final Double mo73573k() {
        return this.f62241Z;
    }

    @C12580l
    /* renamed from: l */
    public final String mo73574l() {
        return this.f62240Y;
    }

    @C12580l
    /* renamed from: m */
    public final Double mo73575m() {
        return this.f62237E0;
    }

    /* renamed from: n */
    public final int mo73576n() {
        return this.f62253z;
    }

    @C12579k
    /* renamed from: o */
    public final C25239g mo73577o() {
        return this.f62238F0;
    }

    /* renamed from: p */
    public final void mo73578p(double d) {
        this.f62245d = d;
    }

    /* renamed from: q */
    public final void mo73579q(double d) {
        this.f62246e = d;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C25241i(java.lang.String r24, java.lang.String r25, java.lang.String r26, double r27, double r29, java.lang.String r31, java.lang.String r32, java.lang.String r33, java.lang.Integer r34, java.lang.String r35, com.carrefour.fid.android.domain.models.OrdersOnlineDetailsProductPriceDomain r36, int r37, java.lang.String r38, java.lang.String r39, java.lang.Double r40, java.lang.Double r41, com.carrefour.fid.android.presentation.p035ui.orders.online.model.C25239g r42, int r43, kotlin.jvm.internal.DefaultConstructorMarker r44) {
        /*
            r23 = this;
            r0 = r43
            r1 = r0 & 1
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x000a
            r4 = r2
            goto L_0x000c
        L_0x000a:
            r4 = r24
        L_0x000c:
            r1 = r0 & 2
            if (r1 == 0) goto L_0x0012
            r5 = r2
            goto L_0x0014
        L_0x0012:
            r5 = r25
        L_0x0014:
            r1 = r0 & 4
            if (r1 == 0) goto L_0x001a
            r6 = r2
            goto L_0x001c
        L_0x001a:
            r6 = r26
        L_0x001c:
            r1 = r0 & 8
            r7 = 0
            if (r1 == 0) goto L_0x0024
            r9 = r7
            goto L_0x0026
        L_0x0024:
            r9 = r27
        L_0x0026:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x002c
            r11 = r7
            goto L_0x002e
        L_0x002c:
            r11 = r29
        L_0x002e:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0034
            r1 = 0
            goto L_0x0036
        L_0x0034:
            r1 = r31
        L_0x0036:
            r13 = r0 & 64
            if (r13 == 0) goto L_0x003c
            r13 = r2
            goto L_0x003e
        L_0x003c:
            r13 = r32
        L_0x003e:
            r14 = r0 & 128(0x80, float:1.794E-43)
            if (r14 == 0) goto L_0x0044
            r14 = r2
            goto L_0x0046
        L_0x0044:
            r14 = r33
        L_0x0046:
            r15 = r0 & 256(0x100, float:3.59E-43)
            if (r15 == 0) goto L_0x004c
            r15 = 0
            goto L_0x004e
        L_0x004c:
            r15 = r34
        L_0x004e:
            r3 = r0 & 512(0x200, float:7.175E-43)
            if (r3 == 0) goto L_0x0055
            r16 = 0
            goto L_0x0057
        L_0x0055:
            r16 = r35
        L_0x0057:
            r3 = r0 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto L_0x0075
            com.carrefour.fid.android.domain.models.OrdersOnlineDetailsProductPriceDomain r3 = new com.carrefour.fid.android.domain.models.OrdersOnlineDetailsProductPriceDomain
            r17 = 0
            r19 = 0
            r21 = 3
            r22 = 0
            r24 = r3
            r25 = r17
            r27 = r19
            r29 = r21
            r30 = r22
            r24.<init>(r25, r27, r29, r30)
            r17 = r3
            goto L_0x0077
        L_0x0075:
            r17 = r36
        L_0x0077:
            r3 = r0 & 2048(0x800, float:2.87E-42)
            if (r3 == 0) goto L_0x007f
            r3 = -1
            r18 = r3
            goto L_0x0081
        L_0x007f:
            r18 = r37
        L_0x0081:
            r3 = r0 & 4096(0x1000, float:5.74E-42)
            if (r3 == 0) goto L_0x0088
            r19 = r2
            goto L_0x008a
        L_0x0088:
            r19 = r38
        L_0x008a:
            r3 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r3 == 0) goto L_0x008f
            goto L_0x0091
        L_0x008f:
            r2 = r39
        L_0x0091:
            r3 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r3 == 0) goto L_0x009c
            java.lang.Double r3 = java.lang.Double.valueOf(r7)
            r20 = r3
            goto L_0x009e
        L_0x009c:
            r20 = r40
        L_0x009e:
            r3 = 32768(0x8000, float:4.5918E-41)
            r0 = r0 & r3
            if (r0 == 0) goto L_0x00ab
            java.lang.Double r0 = java.lang.Double.valueOf(r7)
            r21 = r0
            goto L_0x00ad
        L_0x00ab:
            r21 = r41
        L_0x00ad:
            r3 = r23
            r7 = r9
            r9 = r11
            r11 = r1
            r12 = r13
            r13 = r14
            r14 = r15
            r15 = r16
            r16 = r17
            r17 = r18
            r18 = r19
            r19 = r2
            r22 = r42
            r3.<init>(r4, r5, r6, r7, r9, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.orders.online.model.C25241i.<init>(java.lang.String, java.lang.String, java.lang.String, double, double, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, com.carrefour.fid.android.domain.models.OrdersOnlineDetailsProductPriceDomain, int, java.lang.String, java.lang.String, java.lang.Double, java.lang.Double, com.carrefour.fid.android.presentation.ui.orders.online.model.g, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
