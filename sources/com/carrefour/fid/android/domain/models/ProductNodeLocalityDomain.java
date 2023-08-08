package com.carrefour.fid.android.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b%\u0010&J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003JE\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\u000e\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0015\u001a\u00020\u000fHÖ\u0001J\u0019\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000fHÖ\u0001R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR$\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001f\u0010\u001d\"\u0004\b \u0010!R$\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\"\u0010\u001d\"\u0004\b#\u0010!R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b$\u0010\u001d¨\u0006'"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/ProductNodeLocalityDomain;", "Landroid/os/Parcelable;", "", "a", "b", "c", "d", "e", "parentId", "masterCategoryRef", "masterCategoryName", "masterCategoryNumber", "refCat1", "f", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Ljava/lang/String;", "k", "()Ljava/lang/String;", "j", "h", "m", "(Ljava/lang/String;)V", "i", "n", "l", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C12187d
public final class ProductNodeLocalityDomain implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<ProductNodeLocalityDomain> CREATOR = new C37936a();

    /* renamed from: f */
    public static final int f95372f = 8;
    @C12580l

    /* renamed from: a */
    public final String f95373a;
    @C12580l

    /* renamed from: b */
    public final String f95374b;
    @C12580l

    /* renamed from: c */
    public String f95375c;
    @C12580l

    /* renamed from: d */
    public String f95376d;
    @C12580l

    /* renamed from: e */
    public final String f95377e;

    /* renamed from: com.carrefour.fid.android.domain.models.ProductNodeLocalityDomain$a */
    public static final class C37936a implements Parcelable.Creator<ProductNodeLocalityDomain> {
        @C12579k
        /* renamed from: a */
        public final ProductNodeLocalityDomain createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ProductNodeLocalityDomain(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @C12579k
        /* renamed from: b */
        public final ProductNodeLocalityDomain[] newArray(int i) {
            return new ProductNodeLocalityDomain[i];
        }
    }

    public ProductNodeLocalityDomain(@C12580l String str, @C12580l String str2, @C12580l String str3, @C12580l String str4, @C12580l String str5) {
        this.f95373a = str;
        this.f95374b = str2;
        this.f95375c = str3;
        this.f95376d = str4;
        this.f95377e = str5;
    }

    /* renamed from: g */
    public static /* synthetic */ ProductNodeLocalityDomain m155793g(ProductNodeLocalityDomain productNodeLocalityDomain, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = productNodeLocalityDomain.f95373a;
        }
        if ((i & 2) != 0) {
            str2 = productNodeLocalityDomain.f95374b;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = productNodeLocalityDomain.f95375c;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = productNodeLocalityDomain.f95376d;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = productNodeLocalityDomain.f95377e;
        }
        return productNodeLocalityDomain.mo116566f(str, str6, str7, str8, str5);
    }

    @C12580l
    /* renamed from: a */
    public final String mo116559a() {
        return this.f95373a;
    }

    @C12580l
    /* renamed from: b */
    public final String mo116560b() {
        return this.f95374b;
    }

    @C12580l
    /* renamed from: c */
    public final String mo116561c() {
        return this.f95375c;
    }

    @C12580l
    /* renamed from: d */
    public final String mo116562d() {
        return this.f95376d;
    }

    public int describeContents() {
        return 0;
    }

    @C12580l
    /* renamed from: e */
    public final String mo116564e() {
        return this.f95377e;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductNodeLocalityDomain)) {
            return false;
        }
        ProductNodeLocalityDomain productNodeLocalityDomain = (ProductNodeLocalityDomain) obj;
        return Intrinsics.areEqual((Object) this.f95373a, (Object) productNodeLocalityDomain.f95373a) && Intrinsics.areEqual((Object) this.f95374b, (Object) productNodeLocalityDomain.f95374b) && Intrinsics.areEqual((Object) this.f95375c, (Object) productNodeLocalityDomain.f95375c) && Intrinsics.areEqual((Object) this.f95376d, (Object) productNodeLocalityDomain.f95376d) && Intrinsics.areEqual((Object) this.f95377e, (Object) productNodeLocalityDomain.f95377e);
    }

    @C12579k
    /* renamed from: f */
    public final ProductNodeLocalityDomain mo116566f(@C12580l String str, @C12580l String str2, @C12580l String str3, @C12580l String str4, @C12580l String str5) {
        return new ProductNodeLocalityDomain(str, str2, str3, str4, str5);
    }

    @C12580l
    /* renamed from: h */
    public final String mo116567h() {
        return this.f95375c;
    }

    public int hashCode() {
        String str = this.f95373a;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f95374b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f95375c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f95376d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f95377e;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode4 + i;
    }

    @C12580l
    /* renamed from: i */
    public final String mo116569i() {
        return this.f95376d;
    }

    @C12580l
    /* renamed from: j */
    public final String mo116570j() {
        return this.f95374b;
    }

    @C12580l
    /* renamed from: k */
    public final String mo116571k() {
        return this.f95373a;
    }

    @C12580l
    /* renamed from: l */
    public final String mo116572l() {
        return this.f95377e;
    }

    /* renamed from: m */
    public final void mo116573m(@C12580l String str) {
        this.f95375c = str;
    }

    /* renamed from: n */
    public final void mo116574n(@C12580l String str) {
        this.f95376d = str;
    }

    @C12579k
    public String toString() {
        String str = this.f95373a;
        String str2 = this.f95374b;
        String str3 = this.f95375c;
        String str4 = this.f95376d;
        String str5 = this.f95377e;
        return "ProductNodeLocalityDomain(parentId=" + str + ", masterCategoryRef=" + str2 + ", masterCategoryName=" + str3 + ", masterCategoryNumber=" + str4 + ", refCat1=" + str5 + ")";
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.f95373a);
        parcel.writeString(this.f95374b);
        parcel.writeString(this.f95375c);
        parcel.writeString(this.f95376d);
        parcel.writeString(this.f95377e);
    }
}
