package com.carrefour.fid.android.domain.models.basket;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0002HÖ\u0001J\u0019\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/basket/BasketReturnableBags;", "Landroid/os/Parcelable;", "", "a", "", "b", "quantity", "unitPrice", "c", "", "toString", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "I", "e", "()I", "D", "f", "()D", "<init>", "(ID)V", "domain-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12187d
public final class BasketReturnableBags implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<BasketReturnableBags> CREATOR = new C37962a();

    /* renamed from: a */
    public final int f95506a;

    /* renamed from: b */
    public final double f95507b;

    /* renamed from: com.carrefour.fid.android.domain.models.basket.BasketReturnableBags$a */
    public static final class C37962a implements Parcelable.Creator<BasketReturnableBags> {
        @C12579k
        /* renamed from: a */
        public final BasketReturnableBags createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BasketReturnableBags(parcel.readInt(), parcel.readDouble());
        }

        @C12579k
        /* renamed from: b */
        public final BasketReturnableBags[] newArray(int i) {
            return new BasketReturnableBags[i];
        }
    }

    public BasketReturnableBags(int i, double d) {
        this.f95506a = i;
        this.f95507b = d;
    }

    /* renamed from: d */
    public static /* synthetic */ BasketReturnableBags m156105d(BasketReturnableBags basketReturnableBags, int i, double d, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = basketReturnableBags.f95506a;
        }
        if ((i2 & 2) != 0) {
            d = basketReturnableBags.f95507b;
        }
        return basketReturnableBags.mo116960c(i, d);
    }

    /* renamed from: a */
    public final int mo116958a() {
        return this.f95506a;
    }

    /* renamed from: b */
    public final double mo116959b() {
        return this.f95507b;
    }

    @C12579k
    /* renamed from: c */
    public final BasketReturnableBags mo116960c(int i, double d) {
        return new BasketReturnableBags(i, d);
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final int mo116962e() {
        return this.f95506a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BasketReturnableBags)) {
            return false;
        }
        BasketReturnableBags basketReturnableBags = (BasketReturnableBags) obj;
        return this.f95506a == basketReturnableBags.f95506a && Double.compare(this.f95507b, basketReturnableBags.f95507b) == 0;
    }

    /* renamed from: f */
    public final double mo116964f() {
        return this.f95507b;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f95506a) * 31) + Double.hashCode(this.f95507b);
    }

    @C12579k
    public String toString() {
        int i = this.f95506a;
        double d = this.f95507b;
        return "BasketReturnableBags(quantity=" + i + ", unitPrice=" + d + ")";
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeInt(this.f95506a);
        parcel.writeDouble(this.f95507b);
    }
}
