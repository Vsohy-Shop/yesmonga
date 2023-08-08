package com.carrefour.fid.android.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001Ba\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010$\u001a\u0004\u0018\u00010 \u0012\b\u0010'\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b(\u0010)J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\u0019\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002HÖ\u0001R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\n\u0010\rR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u000b\u001a\u0004\b\u0011\u0010\rR\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\f\u0010\u0018\u001a\u0004\b\u001c\u0010\u0019R\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001e\u0010\u0019R\u0019\u0010$\u001a\u0004\u0018\u00010 8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u000f\u0010#R\u0019\u0010'\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b%\u0010\u0018\u001a\u0004\b&\u0010\u0019¨\u0006*"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/BasketOffer;", "Landroid/os/Parcelable;", "", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "", "a", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "ref", "b", "category", "c", "Ljava/lang/Integer;", "e", "()Ljava/lang/Integer;", "quantity", "", "d", "Ljava/lang/Double;", "()Ljava/lang/Double;", "incrementQuantity", "ean", "g", "salePrice", "h", "stdPrice", "Lcom/carrefour/fid/android/domain/models/DiscountDomain;", "v", "Lcom/carrefour/fid/android/domain/models/DiscountDomain;", "()Lcom/carrefour/fid/android/domain/models/DiscountDomain;", "discount", "w", "i", "unitPrice", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Lcom/carrefour/fid/android/domain/models/DiscountDomain;Ljava/lang/Double;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C12187d
public final class BasketOffer implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<BasketOffer> CREATOR = new C37896a();

    /* renamed from: x */
    public static final int f95046x = 0;
    @C12580l

    /* renamed from: a */
    public final String f95047a;
    @C12580l

    /* renamed from: b */
    public final String f95048b;
    @C12580l

    /* renamed from: c */
    public final Integer f95049c;
    @C12580l

    /* renamed from: d */
    public final Double f95050d;
    @C12580l

    /* renamed from: e */
    public final String f95051e;
    @C12580l

    /* renamed from: f */
    public final Double f95052f;
    @C12580l

    /* renamed from: g */
    public final Double f95053g;
    @C12580l

    /* renamed from: v */
    public final DiscountDomain f95054v;
    @C12580l

    /* renamed from: w */
    public final Double f95055w;

    /* renamed from: com.carrefour.fid.android.domain.models.BasketOffer$a */
    public static final class C37896a implements Parcelable.Creator<BasketOffer> {
        @C12579k
        /* renamed from: a */
        public final BasketOffer createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BasketOffer(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readString(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : DiscountDomain.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()));
        }

        @C12579k
        /* renamed from: b */
        public final BasketOffer[] newArray(int i) {
            return new BasketOffer[i];
        }
    }

    public BasketOffer(@C12580l String str, @C12580l String str2, @C12580l Integer num, @C12580l Double d, @C12580l String str3, @C12580l Double d2, @C12580l Double d3, @C12580l DiscountDomain discountDomain, @C12580l Double d4) {
        this.f95047a = str;
        this.f95048b = str2;
        this.f95049c = num;
        this.f95050d = d;
        this.f95051e = str3;
        this.f95052f = d2;
        this.f95053g = d3;
        this.f95054v = discountDomain;
        this.f95055w = d4;
    }

    @C12580l
    /* renamed from: a */
    public final String mo115525a() {
        return this.f95048b;
    }

    @C12580l
    /* renamed from: b */
    public final DiscountDomain mo115526b() {
        return this.f95054v;
    }

    @C12580l
    /* renamed from: c */
    public final String mo115527c() {
        return this.f95051e;
    }

    @C12580l
    /* renamed from: d */
    public final Double mo115528d() {
        return this.f95050d;
    }

    public int describeContents() {
        return 0;
    }

    @C12580l
    /* renamed from: e */
    public final Integer mo115530e() {
        return this.f95049c;
    }

    @C12580l
    /* renamed from: f */
    public final String mo115531f() {
        return this.f95047a;
    }

    @C12580l
    /* renamed from: g */
    public final Double mo115532g() {
        return this.f95052f;
    }

    @C12580l
    /* renamed from: h */
    public final Double mo115533h() {
        return this.f95053g;
    }

    @C12580l
    /* renamed from: i */
    public final Double mo115534i() {
        return this.f95055w;
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.f95047a);
        parcel.writeString(this.f95048b);
        Integer num = this.f95049c;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Double d = this.f95050d;
        if (d == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d.doubleValue());
        }
        parcel.writeString(this.f95051e);
        Double d2 = this.f95052f;
        if (d2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d2.doubleValue());
        }
        Double d3 = this.f95053g;
        if (d3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d3.doubleValue());
        }
        DiscountDomain discountDomain = this.f95054v;
        if (discountDomain == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            discountDomain.writeToParcel(parcel, i);
        }
        Double d4 = this.f95055w;
        if (d4 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeDouble(d4.doubleValue());
    }
}
