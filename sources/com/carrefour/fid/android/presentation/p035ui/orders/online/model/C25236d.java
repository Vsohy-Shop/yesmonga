package com.carrefour.fid.android.presentation.p035ui.orders.online.model;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.domain.models.OrdersOnlineDetailsProductPriceDomain;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.model.d */
public final class C25236d implements C25234b {

    /* renamed from: y */
    public static final int f62218y = 8;
    @C12579k

    /* renamed from: a */
    public final String f62219a;
    @C12579k

    /* renamed from: b */
    public final String f62220b;

    /* renamed from: c */
    public double f62221c;

    /* renamed from: d */
    public double f62222d;
    @C12580l

    /* renamed from: e */
    public final String f62223e;
    @C12579k

    /* renamed from: f */
    public final String f62224f;
    @C12579k

    /* renamed from: g */
    public final String f62225g;
    @C12580l

    /* renamed from: v */
    public final Integer f62226v;
    @C12579k

    /* renamed from: w */
    public final OrdersOnlineDetailsProductPriceDomain f62227w;

    /* renamed from: x */
    public final int f62228x;

    public C25236d() {
        this((String) null, (String) null, 0.0d, 0.0d, (String) null, (String) null, (String) null, (Integer) null, (OrdersOnlineDetailsProductPriceDomain) null, 0, 1023, (DefaultConstructorMarker) null);
    }

    /* renamed from: a */
    public final double mo73549a() {
        return this.f62221c;
    }

    /* renamed from: b */
    public final double mo73550b() {
        return this.f62222d;
    }

    @C12579k
    /* renamed from: c */
    public String mo73434c() {
        return this.f62225g;
    }

    @C12580l
    /* renamed from: d */
    public final String mo73551d() {
        return this.f62223e;
    }

    @C12579k
    /* renamed from: e */
    public final String mo73552e() {
        return this.f62224f;
    }

    @C12580l
    /* renamed from: f */
    public final Integer mo73553f() {
        return this.f62226v;
    }

    @C12579k
    /* renamed from: g */
    public final OrdersOnlineDetailsProductPriceDomain mo73554g() {
        return this.f62227w;
    }

    @C12579k
    public String getCategory() {
        return this.f62219a;
    }

    @C12579k
    public String getName() {
        return this.f62220b;
    }

    /* renamed from: h */
    public final int mo73555h() {
        return this.f62228x;
    }

    /* renamed from: i */
    public final void mo73556i(double d) {
        this.f62221c = d;
    }

    /* renamed from: j */
    public final void mo73557j(double d) {
        this.f62222d = d;
    }

    public C25236d(@C12579k String str, @C12579k String str2, double d, double d2, @C12580l String str3, @C12579k String str4, @C12579k String str5, @C12580l Integer num, @C12579k OrdersOnlineDetailsProductPriceDomain ordersOnlineDetailsProductPriceDomain, int i) {
        Intrinsics.checkNotNullParameter(str, "category");
        Intrinsics.checkNotNullParameter(str2, "name");
        Intrinsics.checkNotNullParameter(str4, "packaging");
        Intrinsics.checkNotNullParameter(str5, "picturePath");
        Intrinsics.checkNotNullParameter(ordersOnlineDetailsProductPriceDomain, "prices");
        this.f62219a = str;
        this.f62220b = str2;
        this.f62221c = d;
        this.f62222d = d2;
        this.f62223e = str3;
        this.f62224f = str4;
        this.f62225g = str5;
        this.f62226v = num;
        this.f62227w = ordersOnlineDetailsProductPriceDomain;
        this.f62228x = i;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C25236d(java.lang.String r19, java.lang.String r20, double r21, double r23, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.Integer r28, com.carrefour.fid.android.domain.models.OrdersOnlineDetailsProductPriceDomain r29, int r30, int r31, kotlin.jvm.internal.DefaultConstructorMarker r32) {
        /*
            r18 = this;
            r0 = r31
            r1 = r0 & 1
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x000a
            r1 = r2
            goto L_0x000c
        L_0x000a:
            r1 = r19
        L_0x000c:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0012
            r3 = r2
            goto L_0x0014
        L_0x0012:
            r3 = r20
        L_0x0014:
            r4 = r0 & 4
            r5 = 0
            if (r4 == 0) goto L_0x001c
            r7 = r5
            goto L_0x001e
        L_0x001c:
            r7 = r21
        L_0x001e:
            r4 = r0 & 8
            if (r4 == 0) goto L_0x0023
            goto L_0x0025
        L_0x0023:
            r5 = r23
        L_0x0025:
            r4 = r0 & 16
            r9 = 0
            if (r4 == 0) goto L_0x002c
            r4 = r9
            goto L_0x002e
        L_0x002c:
            r4 = r25
        L_0x002e:
            r10 = r0 & 32
            if (r10 == 0) goto L_0x0034
            r10 = r2
            goto L_0x0036
        L_0x0034:
            r10 = r26
        L_0x0036:
            r11 = r0 & 64
            if (r11 == 0) goto L_0x003b
            goto L_0x003d
        L_0x003b:
            r2 = r27
        L_0x003d:
            r11 = r0 & 128(0x80, float:1.794E-43)
            if (r11 == 0) goto L_0x0042
            goto L_0x0044
        L_0x0042:
            r9 = r28
        L_0x0044:
            r11 = r0 & 256(0x100, float:3.59E-43)
            if (r11 == 0) goto L_0x0060
            com.carrefour.fid.android.domain.models.OrdersOnlineDetailsProductPriceDomain r11 = new com.carrefour.fid.android.domain.models.OrdersOnlineDetailsProductPriceDomain
            r12 = 0
            r14 = 0
            r16 = 3
            r17 = 0
            r19 = r11
            r20 = r12
            r22 = r14
            r24 = r16
            r25 = r17
            r19.<init>(r20, r22, r24, r25)
            goto L_0x0062
        L_0x0060:
            r11 = r29
        L_0x0062:
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0068
            r0 = -1
            goto L_0x006a
        L_0x0068:
            r0 = r30
        L_0x006a:
            r19 = r18
            r20 = r1
            r21 = r3
            r22 = r7
            r24 = r5
            r26 = r4
            r27 = r10
            r28 = r2
            r29 = r9
            r30 = r11
            r31 = r0
            r19.<init>(r20, r21, r22, r24, r26, r27, r28, r29, r30, r31)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.orders.online.model.C25236d.<init>(java.lang.String, java.lang.String, double, double, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, com.carrefour.fid.android.domain.models.OrdersOnlineDetailsProductPriceDomain, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
