package com.carrefour.fid.android.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0003J(\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u000b\u001a\u00020\u0005HÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u0012\u001a\u00020\fHÖ\u0001J\u0019\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\fHÖ\u0001R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u0004R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/OfferDiscountPromoCodeDomain;", "Landroid/os/Parcelable;", "", "a", "()Ljava/lang/Double;", "", "b", "promoCodeDiscount", "promoCode", "c", "(Ljava/lang/Double;Ljava/lang/String;)Lcom/carrefour/fid/android/domain/models/OfferDiscountPromoCodeDomain;", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Ljava/lang/Double;", "f", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "<init>", "(Ljava/lang/Double;Ljava/lang/String;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C12187d
public final class OfferDiscountPromoCodeDomain implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<OfferDiscountPromoCodeDomain> CREATOR = new C37918a();

    /* renamed from: c */
    public static final int f95187c = 0;
    @C12580l

    /* renamed from: a */
    public final Double f95188a;
    @C12580l

    /* renamed from: b */
    public final String f95189b;

    /* renamed from: com.carrefour.fid.android.domain.models.OfferDiscountPromoCodeDomain$a */
    public static final class C37918a implements Parcelable.Creator<OfferDiscountPromoCodeDomain> {
        @C12579k
        /* renamed from: a */
        public final OfferDiscountPromoCodeDomain createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OfferDiscountPromoCodeDomain(parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readString());
        }

        @C12579k
        /* renamed from: b */
        public final OfferDiscountPromoCodeDomain[] newArray(int i) {
            return new OfferDiscountPromoCodeDomain[i];
        }
    }

    public OfferDiscountPromoCodeDomain(@C12580l Double d, @C12580l String str) {
        this.f95188a = d;
        this.f95189b = str;
    }

    /* renamed from: d */
    public static /* synthetic */ OfferDiscountPromoCodeDomain m155503d(OfferDiscountPromoCodeDomain offerDiscountPromoCodeDomain, Double d, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            d = offerDiscountPromoCodeDomain.f95188a;
        }
        if ((i & 2) != 0) {
            str = offerDiscountPromoCodeDomain.f95189b;
        }
        return offerDiscountPromoCodeDomain.mo115968c(d, str);
    }

    @C12580l
    /* renamed from: a */
    public final Double mo115966a() {
        return this.f95188a;
    }

    @C12580l
    /* renamed from: b */
    public final String mo115967b() {
        return this.f95189b;
    }

    @C12579k
    /* renamed from: c */
    public final OfferDiscountPromoCodeDomain mo115968c(@C12580l Double d, @C12580l String str) {
        return new OfferDiscountPromoCodeDomain(d, str);
    }

    public int describeContents() {
        return 0;
    }

    @C12580l
    /* renamed from: e */
    public final String mo115970e() {
        return this.f95189b;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OfferDiscountPromoCodeDomain)) {
            return false;
        }
        OfferDiscountPromoCodeDomain offerDiscountPromoCodeDomain = (OfferDiscountPromoCodeDomain) obj;
        return Intrinsics.areEqual((Object) this.f95188a, (Object) offerDiscountPromoCodeDomain.f95188a) && Intrinsics.areEqual((Object) this.f95189b, (Object) offerDiscountPromoCodeDomain.f95189b);
    }

    @C12580l
    /* renamed from: f */
    public final Double mo115972f() {
        return this.f95188a;
    }

    public int hashCode() {
        Double d = this.f95188a;
        int i = 0;
        int hashCode = (d == null ? 0 : d.hashCode()) * 31;
        String str = this.f95189b;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    @C12579k
    public String toString() {
        Double d = this.f95188a;
        String str = this.f95189b;
        return "OfferDiscountPromoCodeDomain(promoCodeDiscount=" + d + ", promoCode=" + str + ")";
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        Double d = this.f95188a;
        if (d == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d.doubleValue());
        }
        parcel.writeString(this.f95189b);
    }
}
