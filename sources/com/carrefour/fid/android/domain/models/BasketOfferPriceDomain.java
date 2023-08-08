package com.carrefour.fid.android.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b)\u0010*J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0004J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0004J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\u0004J\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u0004JX\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0013\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0014HÖ\u0001J\u0013\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0014HÖ\u0001J\u0019\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0014HÖ\u0001R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0004R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b\"\u0010\u0004R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b#\u0010\u0004R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b'\u0010\u0004R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b(\u0010\u0004¨\u0006+"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/BasketOfferPriceDomain;", "Landroid/os/Parcelable;", "", "a", "()Ljava/lang/Double;", "b", "c", "", "d", "e", "f", "startingPrice", "salePrice", "unitPrice", "pricePerUnit", "discountAmount", "loyaltyAmount", "g", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;)Lcom/carrefour/fid/android/domain/models/BasketOfferPriceDomain;", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Ljava/lang/Double;", "m", "l", "n", "Ljava/lang/String;", "k", "()Ljava/lang/String;", "i", "j", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C12187d
public final class BasketOfferPriceDomain implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<BasketOfferPriceDomain> CREATOR = new C37899a();

    /* renamed from: g */
    public static final int f95073g = 0;
    @C12580l

    /* renamed from: a */
    public final Double f95074a;
    @C12580l

    /* renamed from: b */
    public final Double f95075b;
    @C12580l

    /* renamed from: c */
    public final Double f95076c;
    @C12580l

    /* renamed from: d */
    public final String f95077d;
    @C12580l

    /* renamed from: e */
    public final Double f95078e;
    @C12580l

    /* renamed from: f */
    public final Double f95079f;

    /* renamed from: com.carrefour.fid.android.domain.models.BasketOfferPriceDomain$a */
    public static final class C37899a implements Parcelable.Creator<BasketOfferPriceDomain> {
        @C12579k
        /* renamed from: a */
        public final BasketOfferPriceDomain createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BasketOfferPriceDomain(parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readString(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()));
        }

        @C12579k
        /* renamed from: b */
        public final BasketOfferPriceDomain[] newArray(int i) {
            return new BasketOfferPriceDomain[i];
        }
    }

    public BasketOfferPriceDomain(@C12580l Double d, @C12580l Double d2, @C12580l Double d3, @C12580l String str, @C12580l Double d4, @C12580l Double d5) {
        this.f95074a = d;
        this.f95075b = d2;
        this.f95076c = d3;
        this.f95077d = str;
        this.f95078e = d4;
        this.f95079f = d5;
    }

    /* renamed from: h */
    public static /* synthetic */ BasketOfferPriceDomain m155296h(BasketOfferPriceDomain basketOfferPriceDomain, Double d, Double d2, Double d3, String str, Double d4, Double d5, int i, Object obj) {
        if ((i & 1) != 0) {
            d = basketOfferPriceDomain.f95074a;
        }
        if ((i & 2) != 0) {
            d2 = basketOfferPriceDomain.f95075b;
        }
        Double d6 = d2;
        if ((i & 4) != 0) {
            d3 = basketOfferPriceDomain.f95076c;
        }
        Double d7 = d3;
        if ((i & 8) != 0) {
            str = basketOfferPriceDomain.f95077d;
        }
        String str2 = str;
        if ((i & 16) != 0) {
            d4 = basketOfferPriceDomain.f95078e;
        }
        Double d8 = d4;
        if ((i & 32) != 0) {
            d5 = basketOfferPriceDomain.f95079f;
        }
        return basketOfferPriceDomain.mo115603g(d, d6, d7, str2, d8, d5);
    }

    @C12580l
    /* renamed from: a */
    public final Double mo115595a() {
        return this.f95074a;
    }

    @C12580l
    /* renamed from: b */
    public final Double mo115596b() {
        return this.f95075b;
    }

    @C12580l
    /* renamed from: c */
    public final Double mo115597c() {
        return this.f95076c;
    }

    @C12580l
    /* renamed from: d */
    public final String mo115598d() {
        return this.f95077d;
    }

    public int describeContents() {
        return 0;
    }

    @C12580l
    /* renamed from: e */
    public final Double mo115600e() {
        return this.f95078e;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BasketOfferPriceDomain)) {
            return false;
        }
        BasketOfferPriceDomain basketOfferPriceDomain = (BasketOfferPriceDomain) obj;
        return Intrinsics.areEqual((Object) this.f95074a, (Object) basketOfferPriceDomain.f95074a) && Intrinsics.areEqual((Object) this.f95075b, (Object) basketOfferPriceDomain.f95075b) && Intrinsics.areEqual((Object) this.f95076c, (Object) basketOfferPriceDomain.f95076c) && Intrinsics.areEqual((Object) this.f95077d, (Object) basketOfferPriceDomain.f95077d) && Intrinsics.areEqual((Object) this.f95078e, (Object) basketOfferPriceDomain.f95078e) && Intrinsics.areEqual((Object) this.f95079f, (Object) basketOfferPriceDomain.f95079f);
    }

    @C12580l
    /* renamed from: f */
    public final Double mo115602f() {
        return this.f95079f;
    }

    @C12579k
    /* renamed from: g */
    public final BasketOfferPriceDomain mo115603g(@C12580l Double d, @C12580l Double d2, @C12580l Double d3, @C12580l String str, @C12580l Double d4, @C12580l Double d5) {
        return new BasketOfferPriceDomain(d, d2, d3, str, d4, d5);
    }

    public int hashCode() {
        Double d = this.f95074a;
        int i = 0;
        int hashCode = (d == null ? 0 : d.hashCode()) * 31;
        Double d2 = this.f95075b;
        int hashCode2 = (hashCode + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.f95076c;
        int hashCode3 = (hashCode2 + (d3 == null ? 0 : d3.hashCode())) * 31;
        String str = this.f95077d;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Double d4 = this.f95078e;
        int hashCode5 = (hashCode4 + (d4 == null ? 0 : d4.hashCode())) * 31;
        Double d5 = this.f95079f;
        if (d5 != null) {
            i = d5.hashCode();
        }
        return hashCode5 + i;
    }

    @C12580l
    /* renamed from: i */
    public final Double mo115605i() {
        return this.f95078e;
    }

    @C12580l
    /* renamed from: j */
    public final Double mo115606j() {
        return this.f95079f;
    }

    @C12580l
    /* renamed from: k */
    public final String mo115607k() {
        return this.f95077d;
    }

    @C12580l
    /* renamed from: l */
    public final Double mo115608l() {
        return this.f95075b;
    }

    @C12580l
    /* renamed from: m */
    public final Double mo115609m() {
        return this.f95074a;
    }

    @C12580l
    /* renamed from: n */
    public final Double mo115610n() {
        return this.f95076c;
    }

    @C12579k
    public String toString() {
        Double d = this.f95074a;
        Double d2 = this.f95075b;
        Double d3 = this.f95076c;
        String str = this.f95077d;
        Double d4 = this.f95078e;
        Double d5 = this.f95079f;
        return "BasketOfferPriceDomain(startingPrice=" + d + ", salePrice=" + d2 + ", unitPrice=" + d3 + ", pricePerUnit=" + str + ", discountAmount=" + d4 + ", loyaltyAmount=" + d5 + ")";
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        Double d = this.f95074a;
        if (d == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d.doubleValue());
        }
        Double d2 = this.f95075b;
        if (d2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d2.doubleValue());
        }
        Double d3 = this.f95076c;
        if (d3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d3.doubleValue());
        }
        parcel.writeString(this.f95077d);
        Double d4 = this.f95078e;
        if (d4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d4.doubleValue());
        }
        Double d5 = this.f95079f;
        if (d5 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeDouble(d5.doubleValue());
    }
}
