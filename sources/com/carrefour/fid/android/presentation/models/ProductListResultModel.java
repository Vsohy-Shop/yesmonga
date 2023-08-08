package com.carrefour.fid.android.presentation.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.shared.constant.C28565n;
import java.util.ArrayList;
import java.util.List;
import kotlin.C11076d0;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b#\u0010$J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J3\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00022\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0010HÖ\u0001J\u0019\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0010HÖ\u0001R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010!R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b\"\u0010!¨\u0006%"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/models/ProductListResultModel;", "Landroid/os/Parcelable;", "Lcom/carrefour/fid/android/presentation/models/PageModel;", "a", "", "Lcom/carrefour/fid/android/presentation/models/FacetModel;", "b", "", "Lcom/carrefour/fid/android/presentation/models/OfferModel;", "c", "page", "facets", "offerList", "d", "", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Lcom/carrefour/fid/android/presentation/models/PageModel;", "h", "()Lcom/carrefour/fid/android/presentation/models/PageModel;", "Ljava/util/List;", "f", "()Ljava/util/List;", "g", "<init>", "(Lcom/carrefour/fid/android/presentation/models/PageModel;Ljava/util/List;Ljava/util/List;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C12187d
public final class ProductListResultModel implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<ProductListResultModel> CREATOR = new C38444a();

    /* renamed from: d */
    public static final int f97493d = 8;
    @C12579k

    /* renamed from: a */
    public final PageModel f97494a;
    @C12579k

    /* renamed from: b */
    public final List<FacetModel> f97495b;
    @C12579k

    /* renamed from: c */
    public final List<OfferModel> f97496c;

    /* renamed from: com.carrefour.fid.android.presentation.models.ProductListResultModel$a */
    public static final class C38444a implements Parcelable.Creator<ProductListResultModel> {
        @C12579k
        /* renamed from: a */
        public final ProductListResultModel createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            PageModel createFromParcel = PageModel.CREATOR.createFromParcel(parcel);
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(FacetModel.CREATOR.createFromParcel(parcel));
            }
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            for (int i2 = 0; i2 != readInt2; i2++) {
                arrayList2.add(parcel.readParcelable(ProductListResultModel.class.getClassLoader()));
            }
            return new ProductListResultModel(createFromParcel, arrayList, arrayList2);
        }

        @C12579k
        /* renamed from: b */
        public final ProductListResultModel[] newArray(int i) {
            return new ProductListResultModel[i];
        }
    }

    public ProductListResultModel() {
        this((PageModel) null, (List) null, (List) null, 7, (DefaultConstructorMarker) null);
    }

    /* renamed from: e */
    public static /* synthetic */ ProductListResultModel m159370e(ProductListResultModel productListResultModel, PageModel pageModel, List<FacetModel> list, List<OfferModel> list2, int i, Object obj) {
        if ((i & 1) != 0) {
            pageModel = productListResultModel.f97494a;
        }
        if ((i & 2) != 0) {
            list = productListResultModel.f97495b;
        }
        if ((i & 4) != 0) {
            list2 = productListResultModel.f97496c;
        }
        return productListResultModel.mo121812d(pageModel, list, list2);
    }

    @C12579k
    /* renamed from: a */
    public final PageModel mo121809a() {
        return this.f97494a;
    }

    @C12579k
    /* renamed from: b */
    public final List<FacetModel> mo121810b() {
        return this.f97495b;
    }

    @C12579k
    /* renamed from: c */
    public final List<OfferModel> mo121811c() {
        return this.f97496c;
    }

    @C12579k
    /* renamed from: d */
    public final ProductListResultModel mo121812d(@C12579k PageModel pageModel, @C12579k List<FacetModel> list, @C12579k List<OfferModel> list2) {
        Intrinsics.checkNotNullParameter(pageModel, C28565n.C28566a.f69613b);
        Intrinsics.checkNotNullParameter(list, "facets");
        Intrinsics.checkNotNullParameter(list2, "offerList");
        return new ProductListResultModel(pageModel, list, list2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductListResultModel)) {
            return false;
        }
        ProductListResultModel productListResultModel = (ProductListResultModel) obj;
        return Intrinsics.areEqual((Object) this.f97494a, (Object) productListResultModel.f97494a) && Intrinsics.areEqual((Object) this.f97495b, (Object) productListResultModel.f97495b) && Intrinsics.areEqual((Object) this.f97496c, (Object) productListResultModel.f97496c);
    }

    @C12579k
    /* renamed from: f */
    public final List<FacetModel> mo121815f() {
        return this.f97495b;
    }

    @C12579k
    /* renamed from: g */
    public final List<OfferModel> mo121816g() {
        return this.f97496c;
    }

    @C12579k
    /* renamed from: h */
    public final PageModel mo121817h() {
        return this.f97494a;
    }

    public int hashCode() {
        return (((this.f97494a.hashCode() * 31) + this.f97495b.hashCode()) * 31) + this.f97496c.hashCode();
    }

    @C12579k
    public String toString() {
        PageModel pageModel = this.f97494a;
        List<FacetModel> list = this.f97495b;
        List<OfferModel> list2 = this.f97496c;
        return "ProductListResultModel(page=" + pageModel + ", facets=" + list + ", offerList=" + list2 + ")";
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        this.f97494a.writeToParcel(parcel, i);
        List<FacetModel> list = this.f97495b;
        parcel.writeInt(list.size());
        for (FacetModel writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, i);
        }
        List<OfferModel> list2 = this.f97496c;
        parcel.writeInt(list2.size());
        for (OfferModel writeParcelable : list2) {
            parcel.writeParcelable(writeParcelable, i);
        }
    }

    public ProductListResultModel(@C12579k PageModel pageModel, @C12579k List<FacetModel> list, @C12579k List<OfferModel> list2) {
        Intrinsics.checkNotNullParameter(pageModel, C28565n.C28566a.f69613b);
        Intrinsics.checkNotNullParameter(list, "facets");
        Intrinsics.checkNotNullParameter(list2, "offerList");
        this.f97494a = pageModel;
        this.f97495b = list;
        this.f97496c = list2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ProductListResultModel(PageModel pageModel, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new PageModel(0, 0) : pageModel, (i & 2) != 0 ? CollectionsKt__CollectionsKt.m40441E() : list, (i & 4) != 0 ? new ArrayList() : list2);
    }
}
