package com.carrefour.fid.android.domain.models.offer;

import android.os.Parcel;
import android.os.Parcelable;
import com.carrefour.fid.android.domain.models.product.Gtin;
import com.carrefour.fid.android.domain.models.product.ProductReference;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u001a\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0005ø\u0001\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u0003\u001a\u00020\u0002HÆ\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0006\u001a\u00020\u0005HÆ\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0006\u0010\u0004J*\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\t\u0010\nJ\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0013\u001a\u00020\rHÖ\u0001J\u0019\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\rHÖ\u0001R \u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u0004R \u0010\b\u001a\u00020\u00058\u0006ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001b\u0010\u0004\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001e"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/offer/OfferIdentifier;", "Landroid/os/Parcelable;", "Lcom/carrefour/fid/android/domain/models/product/Gtin;", "a", "()Ljava/lang/String;", "Lcom/carrefour/fid/android/domain/models/product/ProductReference;", "b", "gtin", "cdbase", "c", "(Ljava/lang/String;Ljava/lang/String;)Lcom/carrefour/fid/android/domain/models/offer/OfferIdentifier;", "", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Ljava/lang/String;", "f", "e", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "domain-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12187d
public final class OfferIdentifier implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<OfferIdentifier> CREATOR = new C38059a();
    @C12579k

    /* renamed from: a */
    public final String f96099a;
    @C12579k

    /* renamed from: b */
    public final String f96100b;

    /* renamed from: com.carrefour.fid.android.domain.models.offer.OfferIdentifier$a */
    public static final class C38059a implements Parcelable.Creator<OfferIdentifier> {
        @C12579k
        /* renamed from: a */
        public final OfferIdentifier createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OfferIdentifier(Gtin.CREATOR.createFromParcel(parcel).mo118380i(), ProductReference.CREATOR.createFromParcel(parcel).mo118587i(), (DefaultConstructorMarker) null);
        }

        @C12579k
        /* renamed from: b */
        public final OfferIdentifier[] newArray(int i) {
            return new OfferIdentifier[i];
        }
    }

    public /* synthetic */ OfferIdentifier(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2);
    }

    /* renamed from: d */
    public static /* synthetic */ OfferIdentifier m157116d(OfferIdentifier offerIdentifier, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = offerIdentifier.f96099a;
        }
        if ((i & 2) != 0) {
            str2 = offerIdentifier.f96100b;
        }
        return offerIdentifier.mo118132c(str, str2);
    }

    @C12579k
    /* renamed from: a */
    public final String mo118130a() {
        return this.f96099a;
    }

    @C12579k
    /* renamed from: b */
    public final String mo118131b() {
        return this.f96100b;
    }

    @C12579k
    /* renamed from: c */
    public final OfferIdentifier mo118132c(@C12579k String str, @C12579k String str2) {
        Intrinsics.checkNotNullParameter(str, "gtin");
        Intrinsics.checkNotNullParameter(str2, "cdbase");
        return new OfferIdentifier(str, str2, (DefaultConstructorMarker) null);
    }

    public int describeContents() {
        return 0;
    }

    @C12579k
    /* renamed from: e */
    public final String mo118134e() {
        return this.f96100b;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OfferIdentifier)) {
            return false;
        }
        OfferIdentifier offerIdentifier = (OfferIdentifier) obj;
        return Gtin.m157311e(this.f96099a, offerIdentifier.f96099a) && ProductReference.m157469e(this.f96100b, offerIdentifier.f96100b);
    }

    @C12579k
    /* renamed from: f */
    public final String mo118136f() {
        return this.f96099a;
    }

    public int hashCode() {
        return (Gtin.m157312g(this.f96099a) * 31) + ProductReference.m157470g(this.f96100b);
    }

    @C12579k
    public String toString() {
        String h = Gtin.m157313h(this.f96099a);
        String h2 = ProductReference.m157471h(this.f96100b);
        return "OfferIdentifier(gtin=" + h + ", cdbase=" + h2 + ")";
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        Gtin.m157314j(this.f96099a, parcel, i);
        ProductReference.m157472j(this.f96100b, parcel, i);
    }

    public OfferIdentifier(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "gtin");
        Intrinsics.checkNotNullParameter(str2, "cdbase");
        this.f96099a = str;
        this.f96100b = str2;
    }
}
