package com.carrefour.fid.android.product.presentation.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import java.util.List;
import kotlin.C11076d0;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B!\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J#\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\t\u0010\n\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000b\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÖ\u0001J\u0019\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, mo22516d2 = {"Lcom/carrefour/fid/android/product/presentation/models/ProductImagesModel;", "Landroid/os/Parcelable;", "", "", "a", "", "b", "images", "position", "c", "toString", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Ljava/util/List;", "e", "()Ljava/util/List;", "I", "f", "()I", "<init>", "(Ljava/util/List;I)V", "product_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C12187d
public final class ProductImagesModel implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<ProductImagesModel> CREATOR = new C27646a();

    /* renamed from: c */
    public static final int f67167c = 8;
    @C12579k

    /* renamed from: a */
    public final List<String> f67168a;

    /* renamed from: b */
    public final int f67169b;

    /* renamed from: com.carrefour.fid.android.product.presentation.models.ProductImagesModel$a */
    public static final class C27646a implements Parcelable.Creator<ProductImagesModel> {
        @C12579k
        /* renamed from: a */
        public final ProductImagesModel createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ProductImagesModel(parcel.createStringArrayList(), parcel.readInt());
        }

        @C12579k
        /* renamed from: b */
        public final ProductImagesModel[] newArray(int i) {
            return new ProductImagesModel[i];
        }
    }

    public ProductImagesModel() {
        this((List) null, 0, 3, (DefaultConstructorMarker) null);
    }

    /* renamed from: d */
    public static /* synthetic */ ProductImagesModel m116326d(ProductImagesModel productImagesModel, List<String> list, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = productImagesModel.f67168a;
        }
        if ((i2 & 2) != 0) {
            i = productImagesModel.f67169b;
        }
        return productImagesModel.mo80322c(list, i);
    }

    @C12579k
    /* renamed from: a */
    public final List<String> mo80320a() {
        return this.f67168a;
    }

    /* renamed from: b */
    public final int mo80321b() {
        return this.f67169b;
    }

    @C12579k
    /* renamed from: c */
    public final ProductImagesModel mo80322c(@C12579k List<String> list, int i) {
        Intrinsics.checkNotNullParameter(list, "images");
        return new ProductImagesModel(list, i);
    }

    public int describeContents() {
        return 0;
    }

    @C12579k
    /* renamed from: e */
    public final List<String> mo80324e() {
        return this.f67168a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductImagesModel)) {
            return false;
        }
        ProductImagesModel productImagesModel = (ProductImagesModel) obj;
        return Intrinsics.areEqual((Object) this.f67168a, (Object) productImagesModel.f67168a) && this.f67169b == productImagesModel.f67169b;
    }

    /* renamed from: f */
    public final int mo80326f() {
        return this.f67169b;
    }

    public int hashCode() {
        return (this.f67168a.hashCode() * 31) + Integer.hashCode(this.f67169b);
    }

    @C12579k
    public String toString() {
        List<String> list = this.f67168a;
        int i = this.f67169b;
        return "ProductImagesModel(images=" + list + ", position=" + i + ")";
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeStringList(this.f67168a);
        parcel.writeInt(this.f67169b);
    }

    public ProductImagesModel(@C12579k List<String> list, int i) {
        Intrinsics.checkNotNullParameter(list, "images");
        this.f67168a = list;
        this.f67169b = i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ProductImagesModel(List list, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? CollectionsKt__CollectionsKt.m40441E() : list, (i2 & 2) != 0 ? 0 : i);
    }
}
