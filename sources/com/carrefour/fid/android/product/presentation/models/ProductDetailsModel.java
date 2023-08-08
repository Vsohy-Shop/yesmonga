package com.carrefour.fid.android.product.presentation.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.carrefour.fid.android.product.presentation.p039ui.details.adapter.ProductDetailsComponent;
import java.util.ArrayList;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b#\u0010$J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J/\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0014\u001a\u00020\u000fHÖ\u0001J\u0019\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u000fHÖ\u0001R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b!\u0010\"¨\u0006%"}, mo22516d2 = {"Lcom/carrefour/fid/android/product/presentation/models/ProductDetailsModel;", "Landroid/os/Parcelable;", "", "a", "", "Lcom/carrefour/fid/android/product/presentation/ui/details/adapter/ProductDetailsComponent;", "b", "Lcom/carrefour/fid/android/product/presentation/models/ProductEcoScore;", "c", "isAllergoBox", "componentList", "ecoscore", "d", "", "toString", "", "hashCode", "", "other", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Z", "h", "()Z", "Ljava/util/List;", "f", "()Ljava/util/List;", "Lcom/carrefour/fid/android/product/presentation/models/ProductEcoScore;", "g", "()Lcom/carrefour/fid/android/product/presentation/models/ProductEcoScore;", "<init>", "(ZLjava/util/List;Lcom/carrefour/fid/android/product/presentation/models/ProductEcoScore;)V", "product_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12187d
public final class ProductDetailsModel implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<ProductDetailsModel> CREATOR = new C27644a();

    /* renamed from: a */
    public final boolean f67156a;
    @C12579k

    /* renamed from: b */
    public final List<ProductDetailsComponent> f67157b;
    @C12580l

    /* renamed from: c */
    public final ProductEcoScore f67158c;

    /* renamed from: com.carrefour.fid.android.product.presentation.models.ProductDetailsModel$a */
    public static final class C27644a implements Parcelable.Creator<ProductDetailsModel> {
        @C12579k
        /* renamed from: a */
        public final ProductDetailsModel createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            boolean z = parcel.readInt() != 0;
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(ProductDetailsComponent.CREATOR.createFromParcel(parcel));
            }
            return new ProductDetailsModel(z, arrayList, parcel.readInt() == 0 ? null : ProductEcoScore.valueOf(parcel.readString()));
        }

        @C12579k
        /* renamed from: b */
        public final ProductDetailsModel[] newArray(int i) {
            return new ProductDetailsModel[i];
        }
    }

    public ProductDetailsModel(boolean z, @C12579k List<ProductDetailsComponent> list, @C12580l ProductEcoScore productEcoScore) {
        Intrinsics.checkNotNullParameter(list, "componentList");
        this.f67156a = z;
        this.f67157b = list;
        this.f67158c = productEcoScore;
    }

    /* renamed from: e */
    public static /* synthetic */ ProductDetailsModel m116312e(ProductDetailsModel productDetailsModel, boolean z, List<ProductDetailsComponent> list, ProductEcoScore productEcoScore, int i, Object obj) {
        if ((i & 1) != 0) {
            z = productDetailsModel.f67156a;
        }
        if ((i & 2) != 0) {
            list = productDetailsModel.f67157b;
        }
        if ((i & 4) != 0) {
            productEcoScore = productDetailsModel.f67158c;
        }
        return productDetailsModel.mo80304d(z, list, productEcoScore);
    }

    /* renamed from: a */
    public final boolean mo80301a() {
        return this.f67156a;
    }

    @C12579k
    /* renamed from: b */
    public final List<ProductDetailsComponent> mo80302b() {
        return this.f67157b;
    }

    @C12580l
    /* renamed from: c */
    public final ProductEcoScore mo80303c() {
        return this.f67158c;
    }

    @C12579k
    /* renamed from: d */
    public final ProductDetailsModel mo80304d(boolean z, @C12579k List<ProductDetailsComponent> list, @C12580l ProductEcoScore productEcoScore) {
        Intrinsics.checkNotNullParameter(list, "componentList");
        return new ProductDetailsModel(z, list, productEcoScore);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductDetailsModel)) {
            return false;
        }
        ProductDetailsModel productDetailsModel = (ProductDetailsModel) obj;
        return this.f67156a == productDetailsModel.f67156a && Intrinsics.areEqual((Object) this.f67157b, (Object) productDetailsModel.f67157b) && this.f67158c == productDetailsModel.f67158c;
    }

    @C12579k
    /* renamed from: f */
    public final List<ProductDetailsComponent> mo80307f() {
        return this.f67157b;
    }

    @C12580l
    /* renamed from: g */
    public final ProductEcoScore mo80308g() {
        return this.f67158c;
    }

    /* renamed from: h */
    public final boolean mo80309h() {
        return this.f67156a;
    }

    public int hashCode() {
        boolean z = this.f67156a;
        if (z) {
            z = true;
        }
        int hashCode = (((z ? 1 : 0) * true) + this.f67157b.hashCode()) * 31;
        ProductEcoScore productEcoScore = this.f67158c;
        return hashCode + (productEcoScore == null ? 0 : productEcoScore.hashCode());
    }

    @C12579k
    public String toString() {
        boolean z = this.f67156a;
        List<ProductDetailsComponent> list = this.f67157b;
        ProductEcoScore productEcoScore = this.f67158c;
        return "ProductDetailsModel(isAllergoBox=" + z + ", componentList=" + list + ", ecoscore=" + productEcoScore + ")";
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeInt(this.f67156a ? 1 : 0);
        List<ProductDetailsComponent> list = this.f67157b;
        parcel.writeInt(list.size());
        for (ProductDetailsComponent writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, i);
        }
        ProductEcoScore productEcoScore = this.f67158c;
        if (productEcoScore == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeString(productEcoScore.name());
    }
}
