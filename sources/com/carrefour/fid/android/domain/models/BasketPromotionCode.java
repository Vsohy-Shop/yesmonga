package com.carrefour.fid.android.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\u0010\u001a\u00020\nHÖ\u0001J\u0019\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\nHÖ\u0001R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/BasketPromotionCode;", "Landroid/os/Parcelable;", "", "a", "", "b", "name", "amount", "c", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "D", "e", "()D", "<init>", "(Ljava/lang/String;D)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C12187d
public final class BasketPromotionCode implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<BasketPromotionCode> CREATOR = new C37900a();

    /* renamed from: c */
    public static final int f95080c = 0;
    @C12579k

    /* renamed from: a */
    public final String f95081a;

    /* renamed from: b */
    public final double f95082b;

    /* renamed from: com.carrefour.fid.android.domain.models.BasketPromotionCode$a */
    public static final class C37900a implements Parcelable.Creator<BasketPromotionCode> {
        @C12579k
        /* renamed from: a */
        public final BasketPromotionCode createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BasketPromotionCode(parcel.readString(), parcel.readDouble());
        }

        @C12579k
        /* renamed from: b */
        public final BasketPromotionCode[] newArray(int i) {
            return new BasketPromotionCode[i];
        }
    }

    public BasketPromotionCode(@C12579k String str, double d) {
        Intrinsics.checkNotNullParameter(str, "name");
        this.f95081a = str;
        this.f95082b = d;
    }

    /* renamed from: d */
    public static /* synthetic */ BasketPromotionCode m155312d(BasketPromotionCode basketPromotionCode, String str, double d, int i, Object obj) {
        if ((i & 1) != 0) {
            str = basketPromotionCode.f95081a;
        }
        if ((i & 2) != 0) {
            d = basketPromotionCode.f95082b;
        }
        return basketPromotionCode.mo115619c(str, d);
    }

    @C12579k
    /* renamed from: a */
    public final String mo115617a() {
        return this.f95081a;
    }

    /* renamed from: b */
    public final double mo115618b() {
        return this.f95082b;
    }

    @C12579k
    /* renamed from: c */
    public final BasketPromotionCode mo115619c(@C12579k String str, double d) {
        Intrinsics.checkNotNullParameter(str, "name");
        return new BasketPromotionCode(str, d);
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final double mo115621e() {
        return this.f95082b;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BasketPromotionCode)) {
            return false;
        }
        BasketPromotionCode basketPromotionCode = (BasketPromotionCode) obj;
        return Intrinsics.areEqual((Object) this.f95081a, (Object) basketPromotionCode.f95081a) && Double.compare(this.f95082b, basketPromotionCode.f95082b) == 0;
    }

    @C12579k
    /* renamed from: f */
    public final String mo115623f() {
        return this.f95081a;
    }

    public int hashCode() {
        return (this.f95081a.hashCode() * 31) + Double.hashCode(this.f95082b);
    }

    @C12579k
    public String toString() {
        String str = this.f95081a;
        double d = this.f95082b;
        return "BasketPromotionCode(name=" + str + ", amount=" + d + ")";
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.f95081a);
        parcel.writeDouble(this.f95082b);
    }
}
