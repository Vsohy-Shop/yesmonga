package com.carrefour.fid.android.domain.models.catalog.productdetails;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\u000f\u001a\u00020\tHÖ\u0001J\u0019\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\tHÖ\u0001R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017¨\u0006\u001b"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/catalog/productdetails/CatalogProductPicto;", "Landroid/os/Parcelable;", "", "a", "b", "pictoID", "pictoURL", "c", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "f", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "domain-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12187d
public final class CatalogProductPicto implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<CatalogProductPicto> CREATOR = new C37989a();
    @C12579k

    /* renamed from: a */
    public final String f95613a;
    @C12579k

    /* renamed from: b */
    public final String f95614b;

    /* renamed from: com.carrefour.fid.android.domain.models.catalog.productdetails.CatalogProductPicto$a */
    public static final class C37989a implements Parcelable.Creator<CatalogProductPicto> {
        @C12579k
        /* renamed from: a */
        public final CatalogProductPicto createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CatalogProductPicto(parcel.readString(), parcel.readString());
        }

        @C12579k
        /* renamed from: b */
        public final CatalogProductPicto[] newArray(int i) {
            return new CatalogProductPicto[i];
        }
    }

    public CatalogProductPicto() {
        this((String) null, (String) null, 3, (DefaultConstructorMarker) null);
    }

    /* renamed from: d */
    public static /* synthetic */ CatalogProductPicto m156361d(CatalogProductPicto catalogProductPicto, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = catalogProductPicto.f95613a;
        }
        if ((i & 2) != 0) {
            str2 = catalogProductPicto.f95614b;
        }
        return catalogProductPicto.mo117266c(str, str2);
    }

    @C12579k
    /* renamed from: a */
    public final String mo117264a() {
        return this.f95613a;
    }

    @C12579k
    /* renamed from: b */
    public final String mo117265b() {
        return this.f95614b;
    }

    @C12579k
    /* renamed from: c */
    public final CatalogProductPicto mo117266c(@C12579k String str, @C12579k String str2) {
        Intrinsics.checkNotNullParameter(str, "pictoID");
        Intrinsics.checkNotNullParameter(str2, "pictoURL");
        return new CatalogProductPicto(str, str2);
    }

    public int describeContents() {
        return 0;
    }

    @C12579k
    /* renamed from: e */
    public final String mo117268e() {
        return this.f95613a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogProductPicto)) {
            return false;
        }
        CatalogProductPicto catalogProductPicto = (CatalogProductPicto) obj;
        return Intrinsics.areEqual((Object) this.f95613a, (Object) catalogProductPicto.f95613a) && Intrinsics.areEqual((Object) this.f95614b, (Object) catalogProductPicto.f95614b);
    }

    @C12579k
    /* renamed from: f */
    public final String mo117270f() {
        return this.f95614b;
    }

    public int hashCode() {
        return (this.f95613a.hashCode() * 31) + this.f95614b.hashCode();
    }

    @C12579k
    public String toString() {
        String str = this.f95613a;
        String str2 = this.f95614b;
        return "CatalogProductPicto(pictoID=" + str + ", pictoURL=" + str2 + ")";
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.f95613a);
        parcel.writeString(this.f95614b);
    }

    public CatalogProductPicto(@C12579k String str, @C12579k String str2) {
        Intrinsics.checkNotNullParameter(str, "pictoID");
        Intrinsics.checkNotNullParameter(str2, "pictoURL");
        this.f95613a = str;
        this.f95614b = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CatalogProductPicto(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new String() : str, (i & 2) != 0 ? new String() : str2);
    }
}
