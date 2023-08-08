package com.carrefour.fid.android.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001c\u0010\u001dJ\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0006J(\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u0011\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0004HÖ\u0001R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u0006¨\u0006\u001e"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/OfferDiscountArticle;", "Landroid/os/Parcelable;", "", "a", "", "b", "()Ljava/lang/Integer;", "gtin", "quantity", "c", "(Ljava/lang/String;Ljava/lang/Integer;)Lcom/carrefour/fid/android/domain/models/OfferDiscountArticle;", "toString", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "Ljava/lang/Integer;", "f", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C12187d
public final class OfferDiscountArticle implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<OfferDiscountArticle> CREATOR = new C37916a();

    /* renamed from: c */
    public static final int f95171c = 0;
    @C12580l

    /* renamed from: a */
    public final String f95172a;
    @C12580l

    /* renamed from: b */
    public final Integer f95173b;

    /* renamed from: com.carrefour.fid.android.domain.models.OfferDiscountArticle$a */
    public static final class C37916a implements Parcelable.Creator<OfferDiscountArticle> {
        @C12579k
        /* renamed from: a */
        public final OfferDiscountArticle createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OfferDiscountArticle(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @C12579k
        /* renamed from: b */
        public final OfferDiscountArticle[] newArray(int i) {
            return new OfferDiscountArticle[i];
        }
    }

    public OfferDiscountArticle(@C12580l String str, @C12580l Integer num) {
        this.f95172a = str;
        this.f95173b = num;
    }

    /* renamed from: d */
    public static /* synthetic */ OfferDiscountArticle m155467d(OfferDiscountArticle offerDiscountArticle, String str, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = offerDiscountArticle.f95172a;
        }
        if ((i & 2) != 0) {
            num = offerDiscountArticle.f95173b;
        }
        return offerDiscountArticle.mo115920c(str, num);
    }

    @C12580l
    /* renamed from: a */
    public final String mo115918a() {
        return this.f95172a;
    }

    @C12580l
    /* renamed from: b */
    public final Integer mo115919b() {
        return this.f95173b;
    }

    @C12579k
    /* renamed from: c */
    public final OfferDiscountArticle mo115920c(@C12580l String str, @C12580l Integer num) {
        return new OfferDiscountArticle(str, num);
    }

    public int describeContents() {
        return 0;
    }

    @C12580l
    /* renamed from: e */
    public final String mo115922e() {
        return this.f95172a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OfferDiscountArticle)) {
            return false;
        }
        OfferDiscountArticle offerDiscountArticle = (OfferDiscountArticle) obj;
        return Intrinsics.areEqual((Object) this.f95172a, (Object) offerDiscountArticle.f95172a) && Intrinsics.areEqual((Object) this.f95173b, (Object) offerDiscountArticle.f95173b);
    }

    @C12580l
    /* renamed from: f */
    public final Integer mo115924f() {
        return this.f95173b;
    }

    public int hashCode() {
        String str = this.f95172a;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f95173b;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode + i;
    }

    @C12579k
    public String toString() {
        String str = this.f95172a;
        Integer num = this.f95173b;
        return "OfferDiscountArticle(gtin=" + str + ", quantity=" + num + ")";
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.f95172a);
        Integer num = this.f95173b;
        if (num == null) {
            i2 = 0;
        } else {
            parcel.writeInt(1);
            i2 = num.intValue();
        }
        parcel.writeInt(i2);
    }
}
