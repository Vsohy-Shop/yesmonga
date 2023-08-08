package com.carrefour.fid.android.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.core.type.BasketService;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0015\u0010\u0005\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003J\t\u0010\u000e\u001a\u00020\bHÖ\u0001J\u0019\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\bHÖ\u0001R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/BasketServiceType;", "Landroid/os/Parcelable;", "Lcom/carrefour/fid/android/core/type/BasketService;", "a", "serviceType", "b", "", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Lcom/carrefour/fid/android/core/type/BasketService;", "d", "()Lcom/carrefour/fid/android/core/type/BasketService;", "<init>", "(Lcom/carrefour/fid/android/core/type/BasketService;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C12187d
public final class BasketServiceType implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<BasketServiceType> CREATOR = new C37901a();

    /* renamed from: b */
    public static final int f95083b = 0;
    @C12580l

    /* renamed from: a */
    public final BasketService f95084a;

    /* renamed from: com.carrefour.fid.android.domain.models.BasketServiceType$a */
    public static final class C37901a implements Parcelable.Creator<BasketServiceType> {
        @C12579k
        /* renamed from: a */
        public final BasketServiceType createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BasketServiceType(parcel.readInt() == 0 ? null : BasketService.valueOf(parcel.readString()));
        }

        @C12579k
        /* renamed from: b */
        public final BasketServiceType[] newArray(int i) {
            return new BasketServiceType[i];
        }
    }

    public BasketServiceType(@C12580l BasketService basketService) {
        this.f95084a = basketService;
    }

    /* renamed from: c */
    public static /* synthetic */ BasketServiceType m155320c(BasketServiceType basketServiceType, BasketService basketService, int i, Object obj) {
        if ((i & 1) != 0) {
            basketService = basketServiceType.f95084a;
        }
        return basketServiceType.mo115632b(basketService);
    }

    @C12580l
    /* renamed from: a */
    public final BasketService mo115631a() {
        return this.f95084a;
    }

    @C12579k
    /* renamed from: b */
    public final BasketServiceType mo115632b(@C12580l BasketService basketService) {
        return new BasketServiceType(basketService);
    }

    @C12580l
    /* renamed from: d */
    public final BasketService mo115633d() {
        return this.f95084a;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BasketServiceType) && this.f95084a == ((BasketServiceType) obj).f95084a;
    }

    public int hashCode() {
        BasketService basketService = this.f95084a;
        if (basketService == null) {
            return 0;
        }
        return basketService.hashCode();
    }

    @C12579k
    public String toString() {
        BasketService basketService = this.f95084a;
        return "BasketServiceType(serviceType=" + basketService + ")";
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        BasketService basketService = this.f95084a;
        if (basketService == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeString(basketService.name());
    }
}
