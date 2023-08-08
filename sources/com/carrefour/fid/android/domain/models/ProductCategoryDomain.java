package com.carrefour.fid.android.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b&\u0010'J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0000HÆ\u0003J=\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0000HÆ\u0001J\t\u0010\u000f\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\u0019\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u0017\u0010\u000b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\"\u0010\u001dR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00008\u0006¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b$\u0010%¨\u0006("}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/ProductCategoryDomain;", "Landroid/os/Parcelable;", "", "a", "b", "", "c", "d", "e", "id", "name", "level", "path", "subNode", "f", "toString", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Ljava/lang/String;", "h", "()Ljava/lang/String;", "j", "I", "i", "()I", "k", "Lcom/carrefour/fid/android/domain/models/ProductCategoryDomain;", "l", "()Lcom/carrefour/fid/android/domain/models/ProductCategoryDomain;", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lcom/carrefour/fid/android/domain/models/ProductCategoryDomain;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C12187d
public final class ProductCategoryDomain implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<ProductCategoryDomain> CREATOR = new C37934a();

    /* renamed from: f */
    public static final int f95349f = 8;
    @C12579k

    /* renamed from: a */
    public final String f95350a;
    @C12579k

    /* renamed from: b */
    public final String f95351b;

    /* renamed from: c */
    public final int f95352c;
    @C12579k

    /* renamed from: d */
    public final String f95353d;
    @C12580l

    /* renamed from: e */
    public final ProductCategoryDomain f95354e;

    /* renamed from: com.carrefour.fid.android.domain.models.ProductCategoryDomain$a */
    public static final class C37934a implements Parcelable.Creator<ProductCategoryDomain> {
        @C12579k
        /* renamed from: a */
        public final ProductCategoryDomain createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ProductCategoryDomain(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readInt() == 0 ? null : ProductCategoryDomain.CREATOR.createFromParcel(parcel));
        }

        @C12579k
        /* renamed from: b */
        public final ProductCategoryDomain[] newArray(int i) {
            return new ProductCategoryDomain[i];
        }
    }

    public ProductCategoryDomain(@C12579k String str, @C12579k String str2, int i, @C12579k String str3, @C12580l ProductCategoryDomain productCategoryDomain) {
        Intrinsics.checkNotNullParameter(str, "id");
        Intrinsics.checkNotNullParameter(str2, "name");
        Intrinsics.checkNotNullParameter(str3, "path");
        this.f95350a = str;
        this.f95351b = str2;
        this.f95352c = i;
        this.f95353d = str3;
        this.f95354e = productCategoryDomain;
    }

    /* renamed from: g */
    public static /* synthetic */ ProductCategoryDomain m155747g(ProductCategoryDomain productCategoryDomain, String str, String str2, int i, String str3, ProductCategoryDomain productCategoryDomain2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = productCategoryDomain.f95350a;
        }
        if ((i2 & 2) != 0) {
            str2 = productCategoryDomain.f95351b;
        }
        String str4 = str2;
        if ((i2 & 4) != 0) {
            i = productCategoryDomain.f95352c;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            str3 = productCategoryDomain.f95353d;
        }
        String str5 = str3;
        if ((i2 & 16) != 0) {
            productCategoryDomain2 = productCategoryDomain.f95354e;
        }
        return productCategoryDomain.mo116509f(str, str4, i3, str5, productCategoryDomain2);
    }

    @C12579k
    /* renamed from: a */
    public final String mo116502a() {
        return this.f95350a;
    }

    @C12579k
    /* renamed from: b */
    public final String mo116503b() {
        return this.f95351b;
    }

    /* renamed from: c */
    public final int mo116504c() {
        return this.f95352c;
    }

    @C12579k
    /* renamed from: d */
    public final String mo116505d() {
        return this.f95353d;
    }

    public int describeContents() {
        return 0;
    }

    @C12580l
    /* renamed from: e */
    public final ProductCategoryDomain mo116507e() {
        return this.f95354e;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductCategoryDomain)) {
            return false;
        }
        ProductCategoryDomain productCategoryDomain = (ProductCategoryDomain) obj;
        return Intrinsics.areEqual((Object) this.f95350a, (Object) productCategoryDomain.f95350a) && Intrinsics.areEqual((Object) this.f95351b, (Object) productCategoryDomain.f95351b) && this.f95352c == productCategoryDomain.f95352c && Intrinsics.areEqual((Object) this.f95353d, (Object) productCategoryDomain.f95353d) && Intrinsics.areEqual((Object) this.f95354e, (Object) productCategoryDomain.f95354e);
    }

    @C12579k
    /* renamed from: f */
    public final ProductCategoryDomain mo116509f(@C12579k String str, @C12579k String str2, int i, @C12579k String str3, @C12580l ProductCategoryDomain productCategoryDomain) {
        Intrinsics.checkNotNullParameter(str, "id");
        Intrinsics.checkNotNullParameter(str2, "name");
        Intrinsics.checkNotNullParameter(str3, "path");
        return new ProductCategoryDomain(str, str2, i, str3, productCategoryDomain);
    }

    @C12579k
    /* renamed from: h */
    public final String mo116510h() {
        return this.f95350a;
    }

    public int hashCode() {
        int hashCode = ((((((this.f95350a.hashCode() * 31) + this.f95351b.hashCode()) * 31) + Integer.hashCode(this.f95352c)) * 31) + this.f95353d.hashCode()) * 31;
        ProductCategoryDomain productCategoryDomain = this.f95354e;
        return hashCode + (productCategoryDomain == null ? 0 : productCategoryDomain.hashCode());
    }

    /* renamed from: i */
    public final int mo116512i() {
        return this.f95352c;
    }

    @C12579k
    /* renamed from: j */
    public final String mo116513j() {
        return this.f95351b;
    }

    @C12579k
    /* renamed from: k */
    public final String mo116514k() {
        return this.f95353d;
    }

    @C12580l
    /* renamed from: l */
    public final ProductCategoryDomain mo116515l() {
        return this.f95354e;
    }

    @C12579k
    public String toString() {
        String str = this.f95350a;
        String str2 = this.f95351b;
        int i = this.f95352c;
        String str3 = this.f95353d;
        ProductCategoryDomain productCategoryDomain = this.f95354e;
        return "ProductCategoryDomain(id=" + str + ", name=" + str2 + ", level=" + i + ", path=" + str3 + ", subNode=" + productCategoryDomain + ")";
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.f95350a);
        parcel.writeString(this.f95351b);
        parcel.writeInt(this.f95352c);
        parcel.writeString(this.f95353d);
        ProductCategoryDomain productCategoryDomain = this.f95354e;
        if (productCategoryDomain == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        productCategoryDomain.writeToParcel(parcel, i);
    }
}
