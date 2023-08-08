package com.carrefour.fid.android.domain.models.product;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\"\u0010#J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0002HÆ\u0003J;\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u0002HÆ\u0001J\t\u0010\u000e\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0015\u001a\u00020\u000fHÖ\u0001J\u0019\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000fHÖ\u0001R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b \u0010\u001dR\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b!\u0010\u001d¨\u0006$"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/product/ProductNodeLocality;", "Landroid/os/Parcelable;", "", "a", "b", "c", "d", "e", "parentId", "masterCategoryRef", "masterCategoryName", "masterCategoryNumber", "refCat1", "f", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Ljava/lang/String;", "k", "()Ljava/lang/String;", "j", "h", "i", "l", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "domain-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12187d
public final class ProductNodeLocality implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<ProductNodeLocality> CREATOR = new C38095a();
    @C12579k

    /* renamed from: a */
    public final String f96304a;
    @C12579k

    /* renamed from: b */
    public final String f96305b;
    @C12579k

    /* renamed from: c */
    public final String f96306c;
    @C12579k

    /* renamed from: d */
    public final String f96307d;
    @C12579k

    /* renamed from: e */
    public final String f96308e;

    /* renamed from: com.carrefour.fid.android.domain.models.product.ProductNodeLocality$a */
    public static final class C38095a implements Parcelable.Creator<ProductNodeLocality> {
        @C12579k
        /* renamed from: a */
        public final ProductNodeLocality createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ProductNodeLocality(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @C12579k
        /* renamed from: b */
        public final ProductNodeLocality[] newArray(int i) {
            return new ProductNodeLocality[i];
        }
    }

    public ProductNodeLocality(@C12579k String str, @C12579k String str2, @C12579k String str3, @C12579k String str4, @C12579k String str5) {
        Intrinsics.checkNotNullParameter(str, "parentId");
        Intrinsics.checkNotNullParameter(str2, "masterCategoryRef");
        Intrinsics.checkNotNullParameter(str3, "masterCategoryName");
        Intrinsics.checkNotNullParameter(str4, "masterCategoryNumber");
        Intrinsics.checkNotNullParameter(str5, "refCat1");
        this.f96304a = str;
        this.f96305b = str2;
        this.f96306c = str3;
        this.f96307d = str4;
        this.f96308e = str5;
    }

    /* renamed from: g */
    public static /* synthetic */ ProductNodeLocality m157444g(ProductNodeLocality productNodeLocality, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = productNodeLocality.f96304a;
        }
        if ((i & 2) != 0) {
            str2 = productNodeLocality.f96305b;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = productNodeLocality.f96306c;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = productNodeLocality.f96307d;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = productNodeLocality.f96308e;
        }
        return productNodeLocality.mo118556f(str, str6, str7, str8, str5);
    }

    @C12579k
    /* renamed from: a */
    public final String mo118549a() {
        return this.f96304a;
    }

    @C12579k
    /* renamed from: b */
    public final String mo118550b() {
        return this.f96305b;
    }

    @C12579k
    /* renamed from: c */
    public final String mo118551c() {
        return this.f96306c;
    }

    @C12579k
    /* renamed from: d */
    public final String mo118552d() {
        return this.f96307d;
    }

    public int describeContents() {
        return 0;
    }

    @C12579k
    /* renamed from: e */
    public final String mo118554e() {
        return this.f96308e;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductNodeLocality)) {
            return false;
        }
        ProductNodeLocality productNodeLocality = (ProductNodeLocality) obj;
        return Intrinsics.areEqual((Object) this.f96304a, (Object) productNodeLocality.f96304a) && Intrinsics.areEqual((Object) this.f96305b, (Object) productNodeLocality.f96305b) && Intrinsics.areEqual((Object) this.f96306c, (Object) productNodeLocality.f96306c) && Intrinsics.areEqual((Object) this.f96307d, (Object) productNodeLocality.f96307d) && Intrinsics.areEqual((Object) this.f96308e, (Object) productNodeLocality.f96308e);
    }

    @C12579k
    /* renamed from: f */
    public final ProductNodeLocality mo118556f(@C12579k String str, @C12579k String str2, @C12579k String str3, @C12579k String str4, @C12579k String str5) {
        Intrinsics.checkNotNullParameter(str, "parentId");
        Intrinsics.checkNotNullParameter(str2, "masterCategoryRef");
        Intrinsics.checkNotNullParameter(str3, "masterCategoryName");
        Intrinsics.checkNotNullParameter(str4, "masterCategoryNumber");
        Intrinsics.checkNotNullParameter(str5, "refCat1");
        return new ProductNodeLocality(str, str2, str3, str4, str5);
    }

    @C12579k
    /* renamed from: h */
    public final String mo118557h() {
        return this.f96306c;
    }

    public int hashCode() {
        return (((((((this.f96304a.hashCode() * 31) + this.f96305b.hashCode()) * 31) + this.f96306c.hashCode()) * 31) + this.f96307d.hashCode()) * 31) + this.f96308e.hashCode();
    }

    @C12579k
    /* renamed from: i */
    public final String mo118559i() {
        return this.f96307d;
    }

    @C12579k
    /* renamed from: j */
    public final String mo118560j() {
        return this.f96305b;
    }

    @C12579k
    /* renamed from: k */
    public final String mo118561k() {
        return this.f96304a;
    }

    @C12579k
    /* renamed from: l */
    public final String mo118562l() {
        return this.f96308e;
    }

    @C12579k
    public String toString() {
        String str = this.f96304a;
        String str2 = this.f96305b;
        String str3 = this.f96306c;
        String str4 = this.f96307d;
        String str5 = this.f96308e;
        return "ProductNodeLocality(parentId=" + str + ", masterCategoryRef=" + str2 + ", masterCategoryName=" + str3 + ", masterCategoryNumber=" + str4 + ", refCat1=" + str5 + ")";
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.f96304a);
        parcel.writeString(this.f96305b);
        parcel.writeString(this.f96306c);
        parcel.writeString(this.f96307d);
        parcel.writeString(this.f96308e);
    }
}
