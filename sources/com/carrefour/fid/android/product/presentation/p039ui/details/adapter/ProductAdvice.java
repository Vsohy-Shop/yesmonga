package com.carrefour.fid.android.product.presentation.p039ui.details.adapter;

import android.os.Parcel;
import android.os.Parcelable;
import com.carrefour.fid.android.product.presentation.models.Advice;
import java.util.ArrayList;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\u0019\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002HÖ\u0001R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u0011"}, mo22516d2 = {"Lcom/carrefour/fid/android/product/presentation/ui/details/adapter/ProductAdvice;", "Lcom/carrefour/fid/android/product/presentation/ui/details/adapter/ProductDetailsSubComponent;", "", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "", "Lcom/carrefour/fid/android/product/presentation/models/Advice;", "a", "Ljava/util/List;", "()Ljava/util/List;", "advicesData", "<init>", "(Ljava/util/List;)V", "product_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12187d
/* renamed from: com.carrefour.fid.android.product.presentation.ui.details.adapter.ProductAdvice */
public final class ProductAdvice extends ProductDetailsSubComponent {
    @C12579k
    public static final Parcelable.Creator<ProductAdvice> CREATOR = new C27763a();
    @C12579k

    /* renamed from: a */
    public final List<Advice> f67326a;

    /* renamed from: com.carrefour.fid.android.product.presentation.ui.details.adapter.ProductAdvice$a */
    public static final class C27763a implements Parcelable.Creator<ProductAdvice> {
        @C12579k
        /* renamed from: a */
        public final ProductAdvice createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(Advice.CREATOR.createFromParcel(parcel));
            }
            return new ProductAdvice(arrayList);
        }

        @C12579k
        /* renamed from: b */
        public final ProductAdvice[] newArray(int i) {
            return new ProductAdvice[i];
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProductAdvice(@C12579k List<Advice> list) {
        super((DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(list, "advicesData");
        this.f67326a = list;
    }

    @C12579k
    /* renamed from: a */
    public final List<Advice> mo80639a() {
        return this.f67326a;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        List<Advice> list = this.f67326a;
        parcel.writeInt(list.size());
        for (Advice writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, i);
        }
    }
}
