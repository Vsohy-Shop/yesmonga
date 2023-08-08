package com.carrefour.fid.android.product.presentation.p039ui.details.adapter;

import android.os.Parcel;
import android.os.Parcelable;
import com.carrefour.fid.android.domain.models.product.Traceability;
import java.util.ArrayList;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\u0019\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002HÖ\u0001R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u0011"}, mo22516d2 = {"Lcom/carrefour/fid/android/product/presentation/ui/details/adapter/ProductTraceability;", "Lcom/carrefour/fid/android/product/presentation/ui/details/adapter/ProductDetailsSubComponent;", "", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "", "Lcom/carrefour/fid/android/domain/models/product/Traceability;", "a", "Ljava/util/List;", "()Ljava/util/List;", "traceabilitiesData", "<init>", "(Ljava/util/List;)V", "product_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12187d
/* renamed from: com.carrefour.fid.android.product.presentation.ui.details.adapter.ProductTraceability */
public final class ProductTraceability extends ProductDetailsSubComponent {
    @C12579k
    public static final Parcelable.Creator<ProductTraceability> CREATOR = new C27768a();
    @C12579k

    /* renamed from: a */
    public final List<Traceability> f67340a;

    /* renamed from: com.carrefour.fid.android.product.presentation.ui.details.adapter.ProductTraceability$a */
    public static final class C27768a implements Parcelable.Creator<ProductTraceability> {
        @C12579k
        /* renamed from: a */
        public final ProductTraceability createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(parcel.readParcelable(ProductTraceability.class.getClassLoader()));
            }
            return new ProductTraceability(arrayList);
        }

        @C12579k
        /* renamed from: b */
        public final ProductTraceability[] newArray(int i) {
            return new ProductTraceability[i];
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProductTraceability(@C12579k List<Traceability> list) {
        super((DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(list, "traceabilitiesData");
        this.f67340a = list;
    }

    @C12579k
    /* renamed from: a */
    public final List<Traceability> mo80686a() {
        return this.f67340a;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        List<Traceability> list = this.f67340a;
        parcel.writeInt(list.size());
        for (Traceability writeParcelable : list) {
            parcel.writeParcelable(writeParcelable, i);
        }
    }
}
