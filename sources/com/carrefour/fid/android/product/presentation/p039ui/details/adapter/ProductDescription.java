package com.carrefour.fid.android.product.presentation.p039ui.details.adapter;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\u0019\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002HÖ\u0001R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f¨\u0006\u0010"}, mo22516d2 = {"Lcom/carrefour/fid/android/product/presentation/ui/details/adapter/ProductDescription;", "Lcom/carrefour/fid/android/product/presentation/ui/details/adapter/ProductDetailsSubComponent;", "", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "information", "<init>", "(Ljava/lang/String;)V", "product_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12187d
/* renamed from: com.carrefour.fid.android.product.presentation.ui.details.adapter.ProductDescription */
public final class ProductDescription extends ProductDetailsSubComponent {
    @C12579k
    public static final Parcelable.Creator<ProductDescription> CREATOR = new C27766a();
    @C12579k

    /* renamed from: a */
    public final String f67337a;

    /* renamed from: com.carrefour.fid.android.product.presentation.ui.details.adapter.ProductDescription$a */
    public static final class C27766a implements Parcelable.Creator<ProductDescription> {
        @C12579k
        /* renamed from: a */
        public final ProductDescription createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ProductDescription(parcel.readString());
        }

        @C12579k
        /* renamed from: b */
        public final ProductDescription[] newArray(int i) {
            return new ProductDescription[i];
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProductDescription(@C12579k String str) {
        super((DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(str, "information");
        this.f67337a = str;
    }

    @C12579k
    /* renamed from: a */
    public final String mo80668a() {
        return this.f67337a;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.f67337a);
    }
}
