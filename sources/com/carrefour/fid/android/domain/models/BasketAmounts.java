package com.carrefour.fid.android.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.p004ui.unit.C16476b;
import androidx.compose.runtime.internal.C8567o;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u001b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\b\b\u0018\u00002\u00020\u0001B\u0001\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0002¢\u0006\u0004\b<\u0010=J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0002HÆ\u0003J\t\u0010\b\u001a\u00020\u0002HÆ\u0003J\t\u0010\t\u001a\u00020\u0002HÆ\u0003J\t\u0010\n\u001a\u00020\u0002HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0002HÆ\u0003J\t\u0010\f\u001a\u00020\u0002HÆ\u0003J\t\u0010\r\u001a\u00020\u0002HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0002HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0002HÆ\u0003J\u0001\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u00022\b\b\u0002\u0010\u0019\u001a\u00020\u00022\b\b\u0002\u0010\u001a\u001a\u00020\u00022\b\b\u0002\u0010\u001b\u001a\u00020\u00022\b\b\u0002\u0010\u001c\u001a\u00020\u0002HÆ\u0001J\t\u0010\u001f\u001a\u00020\u001eHÖ\u0001J\t\u0010!\u001a\u00020 HÖ\u0001J\u0013\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010&\u001a\u00020 HÖ\u0001J\u0019\u0010+\u001a\u00020*2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020 HÖ\u0001R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010,\u001a\u0004\b/\u0010.R\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010,\u001a\u0004\b0\u0010.R\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010,\u001a\u0004\b1\u0010.R\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010,\u001a\u0004\b2\u0010.R\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010,\u001a\u0004\b3\u0010.R\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b4\u0010.R\u0017\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b5\u0010,\u001a\u0004\b6\u0010.R\u0017\u0010\u0018\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b7\u0010,\u001a\u0004\b5\u0010.R\u0017\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b8\u0010,\u001a\u0004\b8\u0010.R\u0017\u0010\u001a\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b3\u0010,\u001a\u0004\b9\u0010.R\u0017\u0010\u001b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b-\u0010,\u001a\u0004\b7\u0010.R\u0017\u0010\u001c\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b:\u0010,\u001a\u0004\b;\u0010.¨\u0006>"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/BasketAmounts;", "Landroid/os/Parcelable;", "", "a", "f", "g", "h", "i", "j", "k", "l", "m", "b", "c", "d", "e", "totalAmountMin", "discountTotalAmount", "bundleDiscountTotalAmount", "itemTotalAmount", "feesPreparationAmount", "totalAmount", "loyaltyTotalAmount", "amountToNextDeliveryThreshold", "nextThresholdDeliveryAmount", "storeRemainAmount", "totalCouponAmount", "serviceAmount", "totalInflatedMonetaryAmount", "n", "", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "D", "z", "()D", "r", "q", "t", "s", "y", "u", "v", "p", "w", "x", "A", "X", "B", "<init>", "(DDDDDDDDDDDDD)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C12187d
public final class BasketAmounts implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<BasketAmounts> CREATOR = new C37892a();

    /* renamed from: Y */
    public static final int f95007Y = 0;

    /* renamed from: X */
    public final double f95008X;

    /* renamed from: a */
    public final double f95009a;

    /* renamed from: b */
    public final double f95010b;

    /* renamed from: c */
    public final double f95011c;

    /* renamed from: d */
    public final double f95012d;

    /* renamed from: e */
    public final double f95013e;

    /* renamed from: f */
    public final double f95014f;

    /* renamed from: g */
    public final double f95015g;

    /* renamed from: v */
    public final double f95016v;

    /* renamed from: w */
    public final double f95017w;

    /* renamed from: x */
    public final double f95018x;

    /* renamed from: y */
    public final double f95019y;

    /* renamed from: z */
    public final double f95020z;

    /* renamed from: com.carrefour.fid.android.domain.models.BasketAmounts$a */
    public static final class C37892a implements Parcelable.Creator<BasketAmounts> {
        @C12579k
        /* renamed from: a */
        public final BasketAmounts createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BasketAmounts(parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble());
        }

        @C12579k
        /* renamed from: b */
        public final BasketAmounts[] newArray(int i) {
            return new BasketAmounts[i];
        }
    }

    public BasketAmounts() {
        this(0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, C16476b.f40864p, (DefaultConstructorMarker) null);
    }

    /* renamed from: o */
    public static /* synthetic */ BasketAmounts m155156o(BasketAmounts basketAmounts, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10, double d11, double d12, double d13, int i, Object obj) {
        BasketAmounts basketAmounts2 = basketAmounts;
        int i2 = i;
        return basketAmounts.mo115440n((i2 & 1) != 0 ? basketAmounts2.f95009a : d, (i2 & 2) != 0 ? basketAmounts2.f95010b : d2, (i2 & 4) != 0 ? basketAmounts2.f95011c : d3, (i2 & 8) != 0 ? basketAmounts2.f95012d : d4, (i2 & 16) != 0 ? basketAmounts2.f95013e : d5, (i2 & 32) != 0 ? basketAmounts2.f95014f : d6, (i2 & 64) != 0 ? basketAmounts2.f95015g : d7, (i2 & 128) != 0 ? basketAmounts2.f95016v : d8, (i2 & 256) != 0 ? basketAmounts2.f95017w : d9, (i2 & 512) != 0 ? basketAmounts2.f95018x : d10, (i2 & 1024) != 0 ? basketAmounts2.f95019y : d11, (i2 & 2048) != 0 ? basketAmounts2.f95020z : d12, (i2 & 4096) != 0 ? basketAmounts2.f95008X : d13);
    }

    /* renamed from: A */
    public final double mo115422A() {
        return this.f95019y;
    }

    /* renamed from: B */
    public final double mo115423B() {
        return this.f95008X;
    }

    /* renamed from: a */
    public final double mo115424a() {
        return this.f95009a;
    }

    /* renamed from: b */
    public final double mo115425b() {
        return this.f95018x;
    }

    /* renamed from: c */
    public final double mo115426c() {
        return this.f95019y;
    }

    /* renamed from: d */
    public final double mo115427d() {
        return this.f95020z;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final double mo115429e() {
        return this.f95008X;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BasketAmounts)) {
            return false;
        }
        BasketAmounts basketAmounts = (BasketAmounts) obj;
        return Double.compare(this.f95009a, basketAmounts.f95009a) == 0 && Double.compare(this.f95010b, basketAmounts.f95010b) == 0 && Double.compare(this.f95011c, basketAmounts.f95011c) == 0 && Double.compare(this.f95012d, basketAmounts.f95012d) == 0 && Double.compare(this.f95013e, basketAmounts.f95013e) == 0 && Double.compare(this.f95014f, basketAmounts.f95014f) == 0 && Double.compare(this.f95015g, basketAmounts.f95015g) == 0 && Double.compare(this.f95016v, basketAmounts.f95016v) == 0 && Double.compare(this.f95017w, basketAmounts.f95017w) == 0 && Double.compare(this.f95018x, basketAmounts.f95018x) == 0 && Double.compare(this.f95019y, basketAmounts.f95019y) == 0 && Double.compare(this.f95020z, basketAmounts.f95020z) == 0 && Double.compare(this.f95008X, basketAmounts.f95008X) == 0;
    }

    /* renamed from: f */
    public final double mo115431f() {
        return this.f95010b;
    }

    /* renamed from: g */
    public final double mo115432g() {
        return this.f95011c;
    }

    /* renamed from: h */
    public final double mo115433h() {
        return this.f95012d;
    }

    public int hashCode() {
        return (((((((((((((((((((((((Double.hashCode(this.f95009a) * 31) + Double.hashCode(this.f95010b)) * 31) + Double.hashCode(this.f95011c)) * 31) + Double.hashCode(this.f95012d)) * 31) + Double.hashCode(this.f95013e)) * 31) + Double.hashCode(this.f95014f)) * 31) + Double.hashCode(this.f95015g)) * 31) + Double.hashCode(this.f95016v)) * 31) + Double.hashCode(this.f95017w)) * 31) + Double.hashCode(this.f95018x)) * 31) + Double.hashCode(this.f95019y)) * 31) + Double.hashCode(this.f95020z)) * 31) + Double.hashCode(this.f95008X);
    }

    /* renamed from: i */
    public final double mo115435i() {
        return this.f95013e;
    }

    /* renamed from: j */
    public final double mo115436j() {
        return this.f95014f;
    }

    /* renamed from: k */
    public final double mo115437k() {
        return this.f95015g;
    }

    /* renamed from: l */
    public final double mo115438l() {
        return this.f95016v;
    }

    /* renamed from: m */
    public final double mo115439m() {
        return this.f95017w;
    }

    @C12579k
    /* renamed from: n */
    public final BasketAmounts mo115440n(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10, double d11, double d12, double d13) {
        return new BasketAmounts(d, d2, d3, d4, d5, d6, d7, d8, d9, d10, d11, d12, d13);
    }

    /* renamed from: p */
    public final double mo115441p() {
        return this.f95016v;
    }

    /* renamed from: q */
    public final double mo115442q() {
        return this.f95011c;
    }

    /* renamed from: r */
    public final double mo115443r() {
        return this.f95010b;
    }

    /* renamed from: s */
    public final double mo115444s() {
        return this.f95013e;
    }

    /* renamed from: t */
    public final double mo115445t() {
        return this.f95012d;
    }

    @C12579k
    public String toString() {
        double d = this.f95009a;
        double d2 = this.f95010b;
        double d3 = this.f95011c;
        double d4 = this.f95012d;
        double d5 = this.f95013e;
        double d6 = this.f95014f;
        double d7 = this.f95015g;
        double d8 = this.f95016v;
        double d9 = this.f95017w;
        double d10 = this.f95018x;
        double d11 = this.f95019y;
        double d12 = this.f95020z;
        double d13 = this.f95008X;
        return "BasketAmounts(totalAmountMin=" + d + ", discountTotalAmount=" + d2 + ", bundleDiscountTotalAmount=" + d3 + ", itemTotalAmount=" + d4 + ", feesPreparationAmount=" + d5 + ", totalAmount=" + d6 + ", loyaltyTotalAmount=" + d7 + ", amountToNextDeliveryThreshold=" + d8 + ", nextThresholdDeliveryAmount=" + d9 + ", storeRemainAmount=" + d10 + ", totalCouponAmount=" + d11 + ", serviceAmount=" + d12 + ", totalInflatedMonetaryAmount=" + d13 + ")";
    }

    /* renamed from: u */
    public final double mo115447u() {
        return this.f95015g;
    }

    /* renamed from: v */
    public final double mo115448v() {
        return this.f95017w;
    }

    /* renamed from: w */
    public final double mo115449w() {
        return this.f95020z;
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeDouble(this.f95009a);
        parcel.writeDouble(this.f95010b);
        parcel.writeDouble(this.f95011c);
        parcel.writeDouble(this.f95012d);
        parcel.writeDouble(this.f95013e);
        parcel.writeDouble(this.f95014f);
        parcel.writeDouble(this.f95015g);
        parcel.writeDouble(this.f95016v);
        parcel.writeDouble(this.f95017w);
        parcel.writeDouble(this.f95018x);
        parcel.writeDouble(this.f95019y);
        parcel.writeDouble(this.f95020z);
        parcel.writeDouble(this.f95008X);
    }

    /* renamed from: x */
    public final double mo115451x() {
        return this.f95018x;
    }

    /* renamed from: y */
    public final double mo115452y() {
        return this.f95014f;
    }

    /* renamed from: z */
    public final double mo115453z() {
        return this.f95009a;
    }

    public BasketAmounts(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10, double d11, double d12, double d13) {
        this.f95009a = d;
        this.f95010b = d2;
        this.f95011c = d3;
        this.f95012d = d4;
        this.f95013e = d5;
        this.f95014f = d6;
        this.f95015g = d7;
        this.f95016v = d8;
        this.f95017w = d9;
        this.f95018x = d10;
        this.f95019y = d11;
        this.f95020z = d12;
        this.f95008X = d13;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ BasketAmounts(double r29, double r31, double r33, double r35, double r37, double r39, double r41, double r43, double r45, double r47, double r49, double r51, double r53, int r55, kotlin.jvm.internal.DefaultConstructorMarker r56) {
        /*
            r28 = this;
            r0 = r55
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x000a
            r4 = r2
            goto L_0x000c
        L_0x000a:
            r4 = r29
        L_0x000c:
            r1 = r0 & 2
            if (r1 == 0) goto L_0x0012
            r6 = r2
            goto L_0x0014
        L_0x0012:
            r6 = r31
        L_0x0014:
            r1 = r0 & 4
            if (r1 == 0) goto L_0x001a
            r8 = r2
            goto L_0x001c
        L_0x001a:
            r8 = r33
        L_0x001c:
            r1 = r0 & 8
            if (r1 == 0) goto L_0x0022
            r10 = r2
            goto L_0x0024
        L_0x0022:
            r10 = r35
        L_0x0024:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x002a
            r12 = r2
            goto L_0x002c
        L_0x002a:
            r12 = r37
        L_0x002c:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0032
            r14 = r2
            goto L_0x0034
        L_0x0032:
            r14 = r39
        L_0x0034:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x003b
            r16 = r2
            goto L_0x003d
        L_0x003b:
            r16 = r41
        L_0x003d:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0044
            r18 = r2
            goto L_0x0046
        L_0x0044:
            r18 = r43
        L_0x0046:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x004d
            r20 = r2
            goto L_0x004f
        L_0x004d:
            r20 = r45
        L_0x004f:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0056
            r22 = r2
            goto L_0x0058
        L_0x0056:
            r22 = r47
        L_0x0058:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x005f
            r24 = r2
            goto L_0x0061
        L_0x005f:
            r24 = r49
        L_0x0061:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x0068
            r26 = r2
            goto L_0x006a
        L_0x0068:
            r26 = r51
        L_0x006a:
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x006f
            goto L_0x0071
        L_0x006f:
            r2 = r53
        L_0x0071:
            r29 = r28
            r30 = r4
            r32 = r6
            r34 = r8
            r36 = r10
            r38 = r12
            r40 = r14
            r42 = r16
            r44 = r18
            r46 = r20
            r48 = r22
            r50 = r24
            r52 = r26
            r54 = r2
            r29.<init>(r30, r32, r34, r36, r38, r40, r42, r44, r46, r48, r50, r52, r54)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.models.BasketAmounts.<init>(double, double, double, double, double, double, double, double, double, double, double, double, double, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
