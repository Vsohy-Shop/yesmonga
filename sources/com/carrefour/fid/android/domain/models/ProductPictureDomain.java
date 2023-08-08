package com.carrefour.fid.android.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u001b\u0010\u001cJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/ProductPictureDomain;", "Landroid/os/Parcelable;", "", "a", "", "b", "path", "order", "c", "toString", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "I", "getOrder", "()I", "<init>", "(Ljava/lang/String;I)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C12187d
public final class ProductPictureDomain implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<ProductPictureDomain> CREATOR = new C37937a();

    /* renamed from: c */
    public static final int f95378c = 0;
    @C12579k

    /* renamed from: a */
    public final String f95379a;

    /* renamed from: b */
    public final int f95380b;

    /* renamed from: com.carrefour.fid.android.domain.models.ProductPictureDomain$a */
    public static final class C37937a implements Parcelable.Creator<ProductPictureDomain> {
        @C12579k
        /* renamed from: a */
        public final ProductPictureDomain createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ProductPictureDomain(parcel.readString(), parcel.readInt());
        }

        @C12579k
        /* renamed from: b */
        public final ProductPictureDomain[] newArray(int i) {
            return new ProductPictureDomain[i];
        }
    }

    public ProductPictureDomain(@C12579k String str, int i) {
        Intrinsics.checkNotNullParameter(str, "path");
        this.f95379a = str;
        this.f95380b = i;
    }

    /* renamed from: d */
    public static /* synthetic */ ProductPictureDomain m155809d(ProductPictureDomain productPictureDomain, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = productPictureDomain.f95379a;
        }
        if ((i2 & 2) != 0) {
            i = productPictureDomain.f95380b;
        }
        return productPictureDomain.mo116583c(str, i);
    }

    @C12579k
    /* renamed from: a */
    public final String mo116581a() {
        return this.f95379a;
    }

    /* renamed from: b */
    public final int mo116582b() {
        return this.f95380b;
    }

    @C12579k
    /* renamed from: c */
    public final ProductPictureDomain mo116583c(@C12579k String str, int i) {
        Intrinsics.checkNotNullParameter(str, "path");
        return new ProductPictureDomain(str, i);
    }

    public int describeContents() {
        return 0;
    }

    @C12579k
    /* renamed from: e */
    public final String mo116585e() {
        return this.f95379a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductPictureDomain)) {
            return false;
        }
        ProductPictureDomain productPictureDomain = (ProductPictureDomain) obj;
        return Intrinsics.areEqual((Object) this.f95379a, (Object) productPictureDomain.f95379a) && this.f95380b == productPictureDomain.f95380b;
    }

    public final int getOrder() {
        return this.f95380b;
    }

    public int hashCode() {
        return (this.f95379a.hashCode() * 31) + Integer.hashCode(this.f95380b);
    }

    @C12579k
    public String toString() {
        String str = this.f95379a;
        int i = this.f95380b;
        return "ProductPictureDomain(path=" + str + ", order=" + i + ")";
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.f95379a);
        parcel.writeInt(this.f95380b);
    }
}
