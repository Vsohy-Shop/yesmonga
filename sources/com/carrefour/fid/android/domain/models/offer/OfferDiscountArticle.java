package com.carrefour.fid.android.domain.models.offer;

import android.os.Parcel;
import android.os.Parcelable;
import com.carrefour.fid.android.domain.models.product.Gtin;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u001a\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0005ø\u0001\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010\u0003\u001a\u00020\u0002HÆ\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J*\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\t\u0010\nJ\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\t\u0010\r\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\u0019\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0005HÖ\u0001R \u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u0004R\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001f"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/offer/OfferDiscountArticle;", "Landroid/os/Parcelable;", "Lcom/carrefour/fid/android/domain/models/product/Gtin;", "a", "()Ljava/lang/String;", "", "b", "gtin", "quantity", "c", "(Ljava/lang/String;I)Lcom/carrefour/fid/android/domain/models/offer/OfferDiscountArticle;", "", "toString", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Ljava/lang/String;", "e", "I", "f", "()I", "<init>", "(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "domain-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12187d
public final class OfferDiscountArticle implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<OfferDiscountArticle> CREATOR = new C38056a();
    @C12579k

    /* renamed from: a */
    public final String f96005a;

    /* renamed from: b */
    public final int f96006b;

    /* renamed from: com.carrefour.fid.android.domain.models.offer.OfferDiscountArticle$a */
    public static final class C38056a implements Parcelable.Creator<OfferDiscountArticle> {
        @C12579k
        /* renamed from: a */
        public final OfferDiscountArticle createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OfferDiscountArticle(Gtin.CREATOR.createFromParcel(parcel).mo118380i(), parcel.readInt(), (DefaultConstructorMarker) null);
        }

        @C12579k
        /* renamed from: b */
        public final OfferDiscountArticle[] newArray(int i) {
            return new OfferDiscountArticle[i];
        }
    }

    public /* synthetic */ OfferDiscountArticle(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i);
    }

    /* renamed from: d */
    public static /* synthetic */ OfferDiscountArticle m157088d(OfferDiscountArticle offerDiscountArticle, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = offerDiscountArticle.f96005a;
        }
        if ((i2 & 2) != 0) {
            i = offerDiscountArticle.f96006b;
        }
        return offerDiscountArticle.mo118094c(str, i);
    }

    @C12579k
    /* renamed from: a */
    public final String mo118092a() {
        return this.f96005a;
    }

    /* renamed from: b */
    public final int mo118093b() {
        return this.f96006b;
    }

    @C12579k
    /* renamed from: c */
    public final OfferDiscountArticle mo118094c(@C12579k String str, int i) {
        Intrinsics.checkNotNullParameter(str, "gtin");
        return new OfferDiscountArticle(str, i, (DefaultConstructorMarker) null);
    }

    public int describeContents() {
        return 0;
    }

    @C12579k
    /* renamed from: e */
    public final String mo118096e() {
        return this.f96005a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OfferDiscountArticle)) {
            return false;
        }
        OfferDiscountArticle offerDiscountArticle = (OfferDiscountArticle) obj;
        return Gtin.m157311e(this.f96005a, offerDiscountArticle.f96005a) && this.f96006b == offerDiscountArticle.f96006b;
    }

    /* renamed from: f */
    public final int mo118098f() {
        return this.f96006b;
    }

    public int hashCode() {
        return (Gtin.m157312g(this.f96005a) * 31) + Integer.hashCode(this.f96006b);
    }

    @C12579k
    public String toString() {
        String h = Gtin.m157313h(this.f96005a);
        int i = this.f96006b;
        return "OfferDiscountArticle(gtin=" + h + ", quantity=" + i + ")";
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        Gtin.m157314j(this.f96005a, parcel, i);
        parcel.writeInt(this.f96006b);
    }

    public OfferDiscountArticle(String str, int i) {
        Intrinsics.checkNotNullParameter(str, "gtin");
        this.f96005a = str;
        this.f96006b = i;
    }
}
