package com.carrefour.fid.android.domain.models.offer;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b(\u0010)J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\b\u001a\u00020\u0002HÆ\u0003J\t\u0010\t\u001a\u00020\u0002HÆ\u0003JE\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0011\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0012HÖ\u0001J\u0019\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0012HÖ\u0001R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b!\u0010 R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\"\u0010 R\u0017\u0010\r\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b&\u0010 R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b'\u0010 ¨\u0006*"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/offer/Prices;", "Landroid/os/Parcelable;", "", "a", "b", "c", "", "d", "e", "f", "startingPrice", "salePrice", "unitPrice", "pricePerUnit", "discountAmount", "loyaltyAmount", "g", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "D", "m", "()D", "l", "n", "Ljava/lang/String;", "k", "()Ljava/lang/String;", "i", "j", "<init>", "(DDDLjava/lang/String;DD)V", "domain-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12187d
public final class Prices implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<Prices> CREATOR = new C38061a();

    /* renamed from: a */
    public final double f96103a;

    /* renamed from: b */
    public final double f96104b;

    /* renamed from: c */
    public final double f96105c;
    @C12579k

    /* renamed from: d */
    public final String f96106d;

    /* renamed from: e */
    public final double f96107e;

    /* renamed from: f */
    public final double f96108f;

    /* renamed from: com.carrefour.fid.android.domain.models.offer.Prices$a */
    public static final class C38061a implements Parcelable.Creator<Prices> {
        @C12579k
        /* renamed from: a */
        public final Prices createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Prices(parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readString(), parcel.readDouble(), parcel.readDouble());
        }

        @C12579k
        /* renamed from: b */
        public final Prices[] newArray(int i) {
            return new Prices[i];
        }
    }

    public Prices(double d, double d2, double d3, @C12579k String str, double d4, double d5) {
        Intrinsics.checkNotNullParameter(str, "pricePerUnit");
        this.f96103a = d;
        this.f96104b = d2;
        this.f96105c = d3;
        this.f96106d = str;
        this.f96107e = d4;
        this.f96108f = d5;
    }

    /* renamed from: h */
    public static /* synthetic */ Prices m157132h(Prices prices, double d, double d2, double d3, String str, double d4, double d5, int i, Object obj) {
        Prices prices2 = prices;
        return prices.mo118166g((i & 1) != 0 ? prices2.f96103a : d, (i & 2) != 0 ? prices2.f96104b : d2, (i & 4) != 0 ? prices2.f96105c : d3, (i & 8) != 0 ? prices2.f96106d : str, (i & 16) != 0 ? prices2.f96107e : d4, (i & 32) != 0 ? prices2.f96108f : d5);
    }

    /* renamed from: a */
    public final double mo118158a() {
        return this.f96103a;
    }

    /* renamed from: b */
    public final double mo118159b() {
        return this.f96104b;
    }

    /* renamed from: c */
    public final double mo118160c() {
        return this.f96105c;
    }

    @C12579k
    /* renamed from: d */
    public final String mo118161d() {
        return this.f96106d;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final double mo118163e() {
        return this.f96107e;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Prices)) {
            return false;
        }
        Prices prices = (Prices) obj;
        return Double.compare(this.f96103a, prices.f96103a) == 0 && Double.compare(this.f96104b, prices.f96104b) == 0 && Double.compare(this.f96105c, prices.f96105c) == 0 && Intrinsics.areEqual((Object) this.f96106d, (Object) prices.f96106d) && Double.compare(this.f96107e, prices.f96107e) == 0 && Double.compare(this.f96108f, prices.f96108f) == 0;
    }

    /* renamed from: f */
    public final double mo118165f() {
        return this.f96108f;
    }

    @C12579k
    /* renamed from: g */
    public final Prices mo118166g(double d, double d2, double d3, @C12579k String str, double d4, double d5) {
        String str2 = str;
        Intrinsics.checkNotNullParameter(str2, "pricePerUnit");
        return new Prices(d, d2, d3, str2, d4, d5);
    }

    public int hashCode() {
        return (((((((((Double.hashCode(this.f96103a) * 31) + Double.hashCode(this.f96104b)) * 31) + Double.hashCode(this.f96105c)) * 31) + this.f96106d.hashCode()) * 31) + Double.hashCode(this.f96107e)) * 31) + Double.hashCode(this.f96108f);
    }

    /* renamed from: i */
    public final double mo118168i() {
        return this.f96107e;
    }

    /* renamed from: j */
    public final double mo118169j() {
        return this.f96108f;
    }

    @C12579k
    /* renamed from: k */
    public final String mo118170k() {
        return this.f96106d;
    }

    /* renamed from: l */
    public final double mo118171l() {
        return this.f96104b;
    }

    /* renamed from: m */
    public final double mo118172m() {
        return this.f96103a;
    }

    /* renamed from: n */
    public final double mo118173n() {
        return this.f96105c;
    }

    @C12579k
    public String toString() {
        double d = this.f96103a;
        double d2 = this.f96104b;
        double d3 = this.f96105c;
        String str = this.f96106d;
        double d4 = this.f96107e;
        double d5 = this.f96108f;
        return "Prices(startingPrice=" + d + ", salePrice=" + d2 + ", unitPrice=" + d3 + ", pricePerUnit=" + str + ", discountAmount=" + d4 + ", loyaltyAmount=" + d5 + ")";
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeDouble(this.f96103a);
        parcel.writeDouble(this.f96104b);
        parcel.writeDouble(this.f96105c);
        parcel.writeString(this.f96106d);
        parcel.writeDouble(this.f96107e);
        parcel.writeDouble(this.f96108f);
    }
}
