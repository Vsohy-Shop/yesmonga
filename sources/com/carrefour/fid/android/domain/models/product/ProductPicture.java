package com.carrefour.fid.android.domain.models.product;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u001b\u0010\u001cJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/product/ProductPicture;", "Landroid/os/Parcelable;", "", "a", "", "b", "path", "order", "c", "toString", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "I", "getOrder", "()I", "<init>", "(Ljava/lang/String;I)V", "domain-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12187d
public final class ProductPicture implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<ProductPicture> CREATOR = new C38096a();
    @C12579k

    /* renamed from: a */
    public final String f96309a;

    /* renamed from: b */
    public final int f96310b;

    /* renamed from: com.carrefour.fid.android.domain.models.product.ProductPicture$a */
    public static final class C38096a implements Parcelable.Creator<ProductPicture> {
        @C12579k
        /* renamed from: a */
        public final ProductPicture createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ProductPicture(parcel.readString(), parcel.readInt());
        }

        @C12579k
        /* renamed from: b */
        public final ProductPicture[] newArray(int i) {
            return new ProductPicture[i];
        }
    }

    public ProductPicture(@C12579k String str, int i) {
        Intrinsics.checkNotNullParameter(str, "path");
        this.f96309a = str;
        this.f96310b = i;
    }

    /* renamed from: d */
    public static /* synthetic */ ProductPicture m157458d(ProductPicture productPicture, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = productPicture.f96309a;
        }
        if ((i2 & 2) != 0) {
            i = productPicture.f96310b;
        }
        return productPicture.mo118571c(str, i);
    }

    @C12579k
    /* renamed from: a */
    public final String mo118569a() {
        return this.f96309a;
    }

    /* renamed from: b */
    public final int mo118570b() {
        return this.f96310b;
    }

    @C12579k
    /* renamed from: c */
    public final ProductPicture mo118571c(@C12579k String str, int i) {
        Intrinsics.checkNotNullParameter(str, "path");
        return new ProductPicture(str, i);
    }

    public int describeContents() {
        return 0;
    }

    @C12579k
    /* renamed from: e */
    public final String mo118573e() {
        return this.f96309a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductPicture)) {
            return false;
        }
        ProductPicture productPicture = (ProductPicture) obj;
        return Intrinsics.areEqual((Object) this.f96309a, (Object) productPicture.f96309a) && this.f96310b == productPicture.f96310b;
    }

    public final int getOrder() {
        return this.f96310b;
    }

    public int hashCode() {
        return (this.f96309a.hashCode() * 31) + Integer.hashCode(this.f96310b);
    }

    @C12579k
    public String toString() {
        String str = this.f96309a;
        int i = this.f96310b;
        return "ProductPicture(path=" + str + ", order=" + i + ")";
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.f96309a);
        parcel.writeInt(this.f96310b);
    }
}
