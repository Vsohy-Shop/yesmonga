package com.carrefour.fid.android.domain.models.basket;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u001c\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\b\b\u0018\u00002\u00020\u0001B\u0001\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0004¢\u0006\u0004\bA\u0010BJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0004HÆ\u0003J\t\u0010\b\u001a\u00020\u0004HÆ\u0003J\t\u0010\t\u001a\u00020\u0004HÆ\u0003J\t\u0010\n\u001a\u00020\u0004HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0004HÆ\u0003J\t\u0010\f\u001a\u00020\u0004HÆ\u0003J\t\u0010\r\u001a\u00020\u0004HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0004HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0004HÆ\u0003J\u0001\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u00042\b\b\u0002\u0010\u0015\u001a\u00020\u00042\b\b\u0002\u0010\u0016\u001a\u00020\u00042\b\b\u0002\u0010\u0017\u001a\u00020\u00042\b\b\u0002\u0010\u0018\u001a\u00020\u00042\b\b\u0002\u0010\u0019\u001a\u00020\u00042\b\b\u0002\u0010\u001a\u001a\u00020\u00042\b\b\u0002\u0010\u001b\u001a\u00020\u00042\b\b\u0002\u0010\u001c\u001a\u00020\u00042\b\b\u0002\u0010\u001d\u001a\u00020\u00042\b\b\u0002\u0010\u001e\u001a\u00020\u00042\b\b\u0002\u0010\u001f\u001a\u00020\u0004HÆ\u0001J\t\u0010\"\u001a\u00020!HÖ\u0001J\t\u0010#\u001a\u00020\u0002HÖ\u0001J\u0013\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003J\t\u0010(\u001a\u00020\u0002HÖ\u0001J\u0019\u0010-\u001a\u00020,2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020\u0002HÖ\u0001R\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\u0013\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u00101\u001a\u0004\b2\u00103R\u0017\u0010\u0014\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u00101\u001a\u0004\b4\u00103R\u0017\u0010\u0015\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u00101\u001a\u0004\b5\u00103R\u0017\u0010\u0016\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u00101\u001a\u0004\b6\u00103R\u0017\u0010\u0017\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u00101\u001a\u0004\b7\u00103R\u0017\u0010\u0018\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00101\u001a\u0004\b8\u00103R\u0017\u0010\u0019\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b8\u00101\u001a\u0004\b9\u00103R\u0017\u0010\u001a\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b9\u00101\u001a\u0004\b:\u00103R\u0017\u0010\u001b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b/\u00101\u001a\u0004\b;\u00103R\u0017\u0010\u001c\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b:\u00101\u001a\u0004\b1\u00103R\u0017\u0010\u001d\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b;\u00101\u001a\u0004\b<\u00103R\u0017\u0010\u001e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b=\u00101\u001a\u0004\b>\u00103R\u0017\u0010\u001f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b?\u00101\u001a\u0004\b@\u00103¨\u0006C"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/basket/BasketAmounts;", "Landroid/os/Parcelable;", "", "a", "", "g", "h", "i", "j", "k", "l", "m", "n", "b", "c", "d", "e", "f", "nextThresholdDeliveryLevel", "amountToNextDeliveryThreshold", "bundleDiscountTotalAmount", "discountTotalAmount", "feesPreparationAmount", "itemTotalAmount", "loyaltyTotalAmount", "nextThresholdDeliveryAmount", "serviceAmount", "storeRemainAmount", "totalMonetaryAmountIncludingTaxes", "totalInflatedMonetaryAmount", "totalAmountMin", "totalCouponAmount", "o", "", "toString", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "I", "x", "()I", "D", "q", "()D", "r", "s", "t", "u", "v", "w", "y", "z", "C", "X", "A", "Y", "B", "<init>", "(IDDDDDDDDDDDDD)V", "domain-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12187d
public final class BasketAmounts implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<BasketAmounts> CREATOR = new C37957a();

    /* renamed from: X */
    public final double f95484X;

    /* renamed from: Y */
    public final double f95485Y;

    /* renamed from: a */
    public final int f95486a;

    /* renamed from: b */
    public final double f95487b;

    /* renamed from: c */
    public final double f95488c;

    /* renamed from: d */
    public final double f95489d;

    /* renamed from: e */
    public final double f95490e;

    /* renamed from: f */
    public final double f95491f;

    /* renamed from: g */
    public final double f95492g;

    /* renamed from: v */
    public final double f95493v;

    /* renamed from: w */
    public final double f95494w;

    /* renamed from: x */
    public final double f95495x;

    /* renamed from: y */
    public final double f95496y;

    /* renamed from: z */
    public final double f95497z;

    /* renamed from: com.carrefour.fid.android.domain.models.basket.BasketAmounts$a */
    public static final class C37957a implements Parcelable.Creator<BasketAmounts> {
        @C12579k
        /* renamed from: a */
        public final BasketAmounts createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BasketAmounts(parcel.readInt(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble());
        }

        @C12579k
        /* renamed from: b */
        public final BasketAmounts[] newArray(int i) {
            return new BasketAmounts[i];
        }
    }

    public BasketAmounts() {
        this(0, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 16383, (DefaultConstructorMarker) null);
    }

    /* renamed from: p */
    public static /* synthetic */ BasketAmounts m156034p(BasketAmounts basketAmounts, int i, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10, double d11, double d12, double d13, int i2, Object obj) {
        BasketAmounts basketAmounts2 = basketAmounts;
        int i3 = i2;
        return basketAmounts.mo116886o((i3 & 1) != 0 ? basketAmounts2.f95486a : i, (i3 & 2) != 0 ? basketAmounts2.f95487b : d, (i3 & 4) != 0 ? basketAmounts2.f95488c : d2, (i3 & 8) != 0 ? basketAmounts2.f95489d : d3, (i3 & 16) != 0 ? basketAmounts2.f95490e : d4, (i3 & 32) != 0 ? basketAmounts2.f95491f : d5, (i3 & 64) != 0 ? basketAmounts2.f95492g : d6, (i3 & 128) != 0 ? basketAmounts2.f95493v : d7, (i3 & 256) != 0 ? basketAmounts2.f95494w : d8, (i3 & 512) != 0 ? basketAmounts2.f95495x : d9, (i3 & 1024) != 0 ? basketAmounts2.f95496y : d10, (i3 & 2048) != 0 ? basketAmounts2.f95497z : d11, (i3 & 4096) != 0 ? basketAmounts2.f95484X : d12, (i3 & 8192) != 0 ? basketAmounts2.f95485Y : d13);
    }

    /* renamed from: A */
    public final double mo116865A() {
        return this.f95484X;
    }

    /* renamed from: B */
    public final double mo116866B() {
        return this.f95485Y;
    }

    /* renamed from: C */
    public final double mo116867C() {
        return this.f95497z;
    }

    /* renamed from: D */
    public final double mo116868D() {
        return this.f95496y;
    }

    /* renamed from: a */
    public final int mo116869a() {
        return this.f95486a;
    }

    /* renamed from: b */
    public final double mo116870b() {
        return this.f95495x;
    }

    /* renamed from: c */
    public final double mo116871c() {
        return this.f95496y;
    }

    /* renamed from: d */
    public final double mo116872d() {
        return this.f95497z;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final double mo116874e() {
        return this.f95484X;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BasketAmounts)) {
            return false;
        }
        BasketAmounts basketAmounts = (BasketAmounts) obj;
        return this.f95486a == basketAmounts.f95486a && Double.compare(this.f95487b, basketAmounts.f95487b) == 0 && Double.compare(this.f95488c, basketAmounts.f95488c) == 0 && Double.compare(this.f95489d, basketAmounts.f95489d) == 0 && Double.compare(this.f95490e, basketAmounts.f95490e) == 0 && Double.compare(this.f95491f, basketAmounts.f95491f) == 0 && Double.compare(this.f95492g, basketAmounts.f95492g) == 0 && Double.compare(this.f95493v, basketAmounts.f95493v) == 0 && Double.compare(this.f95494w, basketAmounts.f95494w) == 0 && Double.compare(this.f95495x, basketAmounts.f95495x) == 0 && Double.compare(this.f95496y, basketAmounts.f95496y) == 0 && Double.compare(this.f95497z, basketAmounts.f95497z) == 0 && Double.compare(this.f95484X, basketAmounts.f95484X) == 0 && Double.compare(this.f95485Y, basketAmounts.f95485Y) == 0;
    }

    /* renamed from: f */
    public final double mo116876f() {
        return this.f95485Y;
    }

    /* renamed from: g */
    public final double mo116877g() {
        return this.f95487b;
    }

    /* renamed from: h */
    public final double mo116878h() {
        return this.f95488c;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((Integer.hashCode(this.f95486a) * 31) + Double.hashCode(this.f95487b)) * 31) + Double.hashCode(this.f95488c)) * 31) + Double.hashCode(this.f95489d)) * 31) + Double.hashCode(this.f95490e)) * 31) + Double.hashCode(this.f95491f)) * 31) + Double.hashCode(this.f95492g)) * 31) + Double.hashCode(this.f95493v)) * 31) + Double.hashCode(this.f95494w)) * 31) + Double.hashCode(this.f95495x)) * 31) + Double.hashCode(this.f95496y)) * 31) + Double.hashCode(this.f95497z)) * 31) + Double.hashCode(this.f95484X)) * 31) + Double.hashCode(this.f95485Y);
    }

    /* renamed from: i */
    public final double mo116880i() {
        return this.f95489d;
    }

    /* renamed from: j */
    public final double mo116881j() {
        return this.f95490e;
    }

    /* renamed from: k */
    public final double mo116882k() {
        return this.f95491f;
    }

    /* renamed from: l */
    public final double mo116883l() {
        return this.f95492g;
    }

    /* renamed from: m */
    public final double mo116884m() {
        return this.f95493v;
    }

    /* renamed from: n */
    public final double mo116885n() {
        return this.f95494w;
    }

    @C12579k
    /* renamed from: o */
    public final BasketAmounts mo116886o(int i, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10, double d11, double d12, double d13) {
        return new BasketAmounts(i, d, d2, d3, d4, d5, d6, d7, d8, d9, d10, d11, d12, d13);
    }

    /* renamed from: q */
    public final double mo116887q() {
        return this.f95487b;
    }

    /* renamed from: r */
    public final double mo116888r() {
        return this.f95488c;
    }

    /* renamed from: s */
    public final double mo116889s() {
        return this.f95489d;
    }

    /* renamed from: t */
    public final double mo116890t() {
        return this.f95490e;
    }

    @C12579k
    public String toString() {
        int i = this.f95486a;
        double d = this.f95487b;
        double d2 = this.f95488c;
        double d3 = this.f95489d;
        double d4 = this.f95490e;
        double d5 = this.f95491f;
        double d6 = this.f95492g;
        double d7 = this.f95493v;
        double d8 = this.f95494w;
        double d9 = this.f95495x;
        double d10 = this.f95496y;
        double d11 = this.f95497z;
        double d12 = this.f95484X;
        double d13 = this.f95485Y;
        return "BasketAmounts(nextThresholdDeliveryLevel=" + i + ", amountToNextDeliveryThreshold=" + d + ", bundleDiscountTotalAmount=" + d2 + ", discountTotalAmount=" + d3 + ", feesPreparationAmount=" + d4 + ", itemTotalAmount=" + d5 + ", loyaltyTotalAmount=" + d6 + ", nextThresholdDeliveryAmount=" + d7 + ", serviceAmount=" + d8 + ", storeRemainAmount=" + d9 + ", totalMonetaryAmountIncludingTaxes=" + d10 + ", totalInflatedMonetaryAmount=" + d11 + ", totalAmountMin=" + d12 + ", totalCouponAmount=" + d13 + ")";
    }

    /* renamed from: u */
    public final double mo116892u() {
        return this.f95491f;
    }

    /* renamed from: v */
    public final double mo116893v() {
        return this.f95492g;
    }

    /* renamed from: w */
    public final double mo116894w() {
        return this.f95493v;
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeInt(this.f95486a);
        parcel.writeDouble(this.f95487b);
        parcel.writeDouble(this.f95488c);
        parcel.writeDouble(this.f95489d);
        parcel.writeDouble(this.f95490e);
        parcel.writeDouble(this.f95491f);
        parcel.writeDouble(this.f95492g);
        parcel.writeDouble(this.f95493v);
        parcel.writeDouble(this.f95494w);
        parcel.writeDouble(this.f95495x);
        parcel.writeDouble(this.f95496y);
        parcel.writeDouble(this.f95497z);
        parcel.writeDouble(this.f95484X);
        parcel.writeDouble(this.f95485Y);
    }

    /* renamed from: x */
    public final int mo116896x() {
        return this.f95486a;
    }

    /* renamed from: y */
    public final double mo116897y() {
        return this.f95494w;
    }

    /* renamed from: z */
    public final double mo116898z() {
        return this.f95495x;
    }

    public BasketAmounts(int i, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10, double d11, double d12, double d13) {
        this.f95486a = i;
        this.f95487b = d;
        this.f95488c = d2;
        this.f95489d = d3;
        this.f95490e = d4;
        this.f95491f = d5;
        this.f95492g = d6;
        this.f95493v = d7;
        this.f95494w = d8;
        this.f95495x = d9;
        this.f95496y = d10;
        this.f95497z = d11;
        this.f95484X = d12;
        this.f95485Y = d13;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ BasketAmounts(int r30, double r31, double r33, double r35, double r37, double r39, double r41, double r43, double r45, double r47, double r49, double r51, double r53, double r55, int r57, kotlin.jvm.internal.DefaultConstructorMarker r58) {
        /*
            r29 = this;
            r0 = r57
            r1 = r0 & 1
            if (r1 == 0) goto L_0x0008
            r1 = 0
            goto L_0x000a
        L_0x0008:
            r1 = r30
        L_0x000a:
            r2 = r0 & 2
            r3 = 0
            if (r2 == 0) goto L_0x0012
            r5 = r3
            goto L_0x0014
        L_0x0012:
            r5 = r31
        L_0x0014:
            r2 = r0 & 4
            if (r2 == 0) goto L_0x001a
            r7 = r3
            goto L_0x001c
        L_0x001a:
            r7 = r33
        L_0x001c:
            r2 = r0 & 8
            if (r2 == 0) goto L_0x0022
            r9 = r3
            goto L_0x0024
        L_0x0022:
            r9 = r35
        L_0x0024:
            r2 = r0 & 16
            if (r2 == 0) goto L_0x002a
            r11 = r3
            goto L_0x002c
        L_0x002a:
            r11 = r37
        L_0x002c:
            r2 = r0 & 32
            if (r2 == 0) goto L_0x0032
            r13 = r3
            goto L_0x0034
        L_0x0032:
            r13 = r39
        L_0x0034:
            r2 = r0 & 64
            if (r2 == 0) goto L_0x003a
            r15 = r3
            goto L_0x003c
        L_0x003a:
            r15 = r41
        L_0x003c:
            r2 = r0 & 128(0x80, float:1.794E-43)
            if (r2 == 0) goto L_0x0043
            r17 = r3
            goto L_0x0045
        L_0x0043:
            r17 = r43
        L_0x0045:
            r2 = r0 & 256(0x100, float:3.59E-43)
            if (r2 == 0) goto L_0x004c
            r19 = r3
            goto L_0x004e
        L_0x004c:
            r19 = r45
        L_0x004e:
            r2 = r0 & 512(0x200, float:7.175E-43)
            if (r2 == 0) goto L_0x0055
            r21 = r3
            goto L_0x0057
        L_0x0055:
            r21 = r47
        L_0x0057:
            r2 = r0 & 1024(0x400, float:1.435E-42)
            if (r2 == 0) goto L_0x005e
            r23 = r3
            goto L_0x0060
        L_0x005e:
            r23 = r49
        L_0x0060:
            r2 = r0 & 2048(0x800, float:2.87E-42)
            if (r2 == 0) goto L_0x0067
            r25 = r3
            goto L_0x0069
        L_0x0067:
            r25 = r51
        L_0x0069:
            r2 = r0 & 4096(0x1000, float:5.74E-42)
            if (r2 == 0) goto L_0x0070
            r27 = r3
            goto L_0x0072
        L_0x0070:
            r27 = r53
        L_0x0072:
            r0 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r0 == 0) goto L_0x0077
            goto L_0x0079
        L_0x0077:
            r3 = r55
        L_0x0079:
            r30 = r29
            r31 = r1
            r32 = r5
            r34 = r7
            r36 = r9
            r38 = r11
            r40 = r13
            r42 = r15
            r44 = r17
            r46 = r19
            r48 = r21
            r50 = r23
            r52 = r25
            r54 = r27
            r56 = r3
            r30.<init>(r31, r32, r34, r36, r38, r40, r42, r44, r46, r48, r50, r52, r54, r56)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.models.basket.BasketAmounts.<init>(int, double, double, double, double, double, double, double, double, double, double, double, double, double, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
