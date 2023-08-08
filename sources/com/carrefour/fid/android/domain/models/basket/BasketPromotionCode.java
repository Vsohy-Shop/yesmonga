package com.carrefour.fid.android.domain.models.basket;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0004HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\u0010\u001a\u00020\nHÖ\u0001J\u0019\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\nHÖ\u0001R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/basket/BasketPromotionCode;", "Landroid/os/Parcelable;", "", "a", "", "b", "amount", "name", "c", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "D", "e", "()D", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "<init>", "(DLjava/lang/String;)V", "domain-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12187d
public final class BasketPromotionCode implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<BasketPromotionCode> CREATOR = new C37960a();

    /* renamed from: a */
    public final double f95503a;
    @C12579k

    /* renamed from: b */
    public final String f95504b;

    /* renamed from: com.carrefour.fid.android.domain.models.basket.BasketPromotionCode$a */
    public static final class C37960a implements Parcelable.Creator<BasketPromotionCode> {
        @C12579k
        /* renamed from: a */
        public final BasketPromotionCode createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BasketPromotionCode(parcel.readDouble(), parcel.readString());
        }

        @C12579k
        /* renamed from: b */
        public final BasketPromotionCode[] newArray(int i) {
            return new BasketPromotionCode[i];
        }
    }

    public BasketPromotionCode(double d, @C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "name");
        this.f95503a = d;
        this.f95504b = str;
    }

    /* renamed from: d */
    public static /* synthetic */ BasketPromotionCode m156084d(BasketPromotionCode basketPromotionCode, double d, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            d = basketPromotionCode.f95503a;
        }
        if ((i & 2) != 0) {
            str = basketPromotionCode.f95504b;
        }
        return basketPromotionCode.mo116935c(d, str);
    }

    /* renamed from: a */
    public final double mo116933a() {
        return this.f95503a;
    }

    @C12579k
    /* renamed from: b */
    public final String mo116934b() {
        return this.f95504b;
    }

    @C12579k
    /* renamed from: c */
    public final BasketPromotionCode mo116935c(double d, @C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "name");
        return new BasketPromotionCode(d, str);
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final double mo116937e() {
        return this.f95503a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BasketPromotionCode)) {
            return false;
        }
        BasketPromotionCode basketPromotionCode = (BasketPromotionCode) obj;
        return Double.compare(this.f95503a, basketPromotionCode.f95503a) == 0 && Intrinsics.areEqual((Object) this.f95504b, (Object) basketPromotionCode.f95504b);
    }

    @C12579k
    /* renamed from: f */
    public final String mo116939f() {
        return this.f95504b;
    }

    public int hashCode() {
        return (Double.hashCode(this.f95503a) * 31) + this.f95504b.hashCode();
    }

    @C12579k
    public String toString() {
        double d = this.f95503a;
        String str = this.f95504b;
        return "BasketPromotionCode(amount=" + d + ", name=" + str + ")";
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeDouble(this.f95503a);
        parcel.writeString(this.f95504b);
    }
}
