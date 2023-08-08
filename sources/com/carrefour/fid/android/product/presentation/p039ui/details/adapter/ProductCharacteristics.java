package com.carrefour.fid.android.product.presentation.p039ui.details.adapter;

import android.os.Parcel;
import android.os.Parcelable;
import com.carrefour.fid.android.domain.models.offer.OfferFlag;
import java.util.ArrayList;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\u0019\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002HÖ\u0001R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u0011"}, mo22516d2 = {"Lcom/carrefour/fid/android/product/presentation/ui/details/adapter/ProductCharacteristics;", "Lcom/carrefour/fid/android/product/presentation/ui/details/adapter/ProductDetailsSubComponent;", "", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "", "Lcom/carrefour/fid/android/domain/models/offer/OfferFlag;", "a", "Ljava/util/List;", "()Ljava/util/List;", "characteristicsData", "<init>", "(Ljava/util/List;)V", "product_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12187d
/* renamed from: com.carrefour.fid.android.product.presentation.ui.details.adapter.ProductCharacteristics */
public final class ProductCharacteristics extends ProductDetailsSubComponent {
    @C12579k
    public static final Parcelable.Creator<ProductCharacteristics> CREATOR = new C27764a();
    @C12579k

    /* renamed from: a */
    public final List<OfferFlag> f67327a;

    /* renamed from: com.carrefour.fid.android.product.presentation.ui.details.adapter.ProductCharacteristics$a */
    public static final class C27764a implements Parcelable.Creator<ProductCharacteristics> {
        @C12579k
        /* renamed from: a */
        public final ProductCharacteristics createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(OfferFlag.valueOf(parcel.readString()));
            }
            return new ProductCharacteristics(arrayList);
        }

        @C12579k
        /* renamed from: b */
        public final ProductCharacteristics[] newArray(int i) {
            return new ProductCharacteristics[i];
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProductCharacteristics(@C12579k List<? extends OfferFlag> list) {
        super((DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(list, "characteristicsData");
        this.f67327a = list;
    }

    @C12579k
    /* renamed from: a */
    public final List<OfferFlag> mo80646a() {
        return this.f67327a;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        List<OfferFlag> list = this.f67327a;
        parcel.writeInt(list.size());
        for (OfferFlag name : list) {
            parcel.writeString(name.name());
        }
    }
}
