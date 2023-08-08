package com.carrefour.fid.android.product.presentation.p039ui.details.adapter;

import android.os.Parcel;
import android.os.Parcelable;
import com.carrefour.fid.android.product.presentation.p039ui.details.ProductDetailsComponentType;
import com.carrefour.fid.android.shared.base.components.BaseExpandableRecyclerView;
import java.util.ArrayList;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u001d\u0012\u0006\u0010\u0016\u001a\u00020\u0011\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u001b\u0010\u001cJ\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\u0016J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0019\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\nHÖ\u0001R\u0017\u0010\u0016\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001d"}, mo22516d2 = {"Lcom/carrefour/fid/android/product/presentation/ui/details/adapter/ProductDetailsComponent;", "Lcom/carrefour/fid/android/shared/base/components/BaseExpandableRecyclerView$b;", "Lcom/carrefour/fid/android/product/presentation/ui/details/adapter/ProductDetailsSubComponent;", "Landroid/os/Parcelable;", "", "a", "", "other", "", "equals", "", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Lcom/carrefour/fid/android/product/presentation/ui/details/ProductDetailsComponentType;", "c", "Lcom/carrefour/fid/android/product/presentation/ui/details/ProductDetailsComponentType;", "e", "()Lcom/carrefour/fid/android/product/presentation/ui/details/ProductDetailsComponentType;", "type", "d", "Ljava/util/List;", "()Ljava/util/List;", "subComponent", "<init>", "(Lcom/carrefour/fid/android/product/presentation/ui/details/ProductDetailsComponentType;Ljava/util/List;)V", "product_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12187d
/* renamed from: com.carrefour.fid.android.product.presentation.ui.details.adapter.ProductDetailsComponent */
public final class ProductDetailsComponent extends BaseExpandableRecyclerView.C28472b<ProductDetailsSubComponent> implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<ProductDetailsComponent> CREATOR = new C27767a();
    @C12579k

    /* renamed from: c */
    public final ProductDetailsComponentType f67338c;
    @C12579k

    /* renamed from: d */
    public final List<ProductDetailsSubComponent> f67339d;

    /* renamed from: com.carrefour.fid.android.product.presentation.ui.details.adapter.ProductDetailsComponent$a */
    public static final class C27767a implements Parcelable.Creator<ProductDetailsComponent> {
        @C12579k
        /* renamed from: a */
        public final ProductDetailsComponent createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            ProductDetailsComponentType valueOf = ProductDetailsComponentType.valueOf(parcel.readString());
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(parcel.readParcelable(ProductDetailsComponent.class.getClassLoader()));
            }
            return new ProductDetailsComponent(valueOf, arrayList);
        }

        @C12579k
        /* renamed from: b */
        public final ProductDetailsComponent[] newArray(int i) {
            return new ProductDetailsComponent[i];
        }
    }

    public ProductDetailsComponent(@C12579k ProductDetailsComponentType productDetailsComponentType, @C12579k List<? extends ProductDetailsSubComponent> list) {
        Intrinsics.checkNotNullParameter(productDetailsComponentType, "type");
        Intrinsics.checkNotNullParameter(list, "subComponent");
        this.f67338c = productDetailsComponentType;
        this.f67339d = list;
    }

    @C12579k
    /* renamed from: a */
    public List<ProductDetailsSubComponent> mo80675a() {
        return this.f67339d;
    }

    @C12579k
    /* renamed from: d */
    public final List<ProductDetailsSubComponent> mo80676d() {
        return this.f67339d;
    }

    public int describeContents() {
        return 0;
    }

    @C12579k
    /* renamed from: e */
    public final ProductDetailsComponentType mo80678e() {
        return this.f67338c;
    }

    public boolean equals(@C12580l Object obj) {
        if (!(obj instanceof ProductDetailsComponent)) {
            return false;
        }
        ProductDetailsComponent productDetailsComponent = (ProductDetailsComponent) obj;
        if (productDetailsComponent.f67338c == this.f67338c && productDetailsComponent.mo83380b() == mo83380b() && Intrinsics.areEqual((Object) productDetailsComponent.f67339d, (Object) this.f67339d)) {
            return true;
        }
        return false;
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.f67338c.name());
        List<ProductDetailsSubComponent> list = this.f67339d;
        parcel.writeInt(list.size());
        for (ProductDetailsSubComponent writeParcelable : list) {
            parcel.writeParcelable(writeParcelable, i);
        }
    }
}
