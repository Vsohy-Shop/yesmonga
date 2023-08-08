package com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.domain.models.LatLon;
import com.carrefour.fid.android.domain.models.service.models.StoreServiceType;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u001d\u0010\u001eJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u0011\u001a\u00020\u000bHÖ\u0001J\u0019\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000bHÖ\u0001R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, mo22516d2 = {"Lcom/carrefour/fid/android/checkout/presentation/viewmodels/slot/mvi/SlotArgsHome;", "Landroid/os/Parcelable;", "Lcom/carrefour/fid/android/domain/models/LatLon;", "a", "Lcom/carrefour/fid/android/domain/models/service/models/StoreServiceType;", "b", "latLon", "serviceType", "c", "", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Lcom/carrefour/fid/android/domain/models/LatLon;", "e", "()Lcom/carrefour/fid/android/domain/models/LatLon;", "Lcom/carrefour/fid/android/domain/models/service/models/StoreServiceType;", "f", "()Lcom/carrefour/fid/android/domain/models/service/models/StoreServiceType;", "<init>", "(Lcom/carrefour/fid/android/domain/models/LatLon;Lcom/carrefour/fid/android/domain/models/service/models/StoreServiceType;)V", "checkout_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C12187d
public final class SlotArgsHome implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<SlotArgsHome> CREATOR = new C39963a();

    /* renamed from: c */
    public static final int f101935c = 8;
    @C12579k

    /* renamed from: a */
    public final LatLon f101936a;
    @C12579k

    /* renamed from: b */
    public final StoreServiceType f101937b;

    /* renamed from: com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.SlotArgsHome$a */
    public static final class C39963a implements Parcelable.Creator<SlotArgsHome> {
        @C12579k
        /* renamed from: a */
        public final SlotArgsHome createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Class<SlotArgsHome> cls = SlotArgsHome.class;
            return new SlotArgsHome((LatLon) parcel.readParcelable(cls.getClassLoader()), (StoreServiceType) parcel.readParcelable(cls.getClassLoader()));
        }

        @C12579k
        /* renamed from: b */
        public final SlotArgsHome[] newArray(int i) {
            return new SlotArgsHome[i];
        }
    }

    public SlotArgsHome(@C12579k LatLon latLon, @C12579k StoreServiceType storeServiceType) {
        Intrinsics.checkNotNullParameter(latLon, "latLon");
        Intrinsics.checkNotNullParameter(storeServiceType, "serviceType");
        this.f101936a = latLon;
        this.f101937b = storeServiceType;
    }

    /* renamed from: d */
    public static /* synthetic */ SlotArgsHome m162867d(SlotArgsHome slotArgsHome, LatLon latLon, StoreServiceType storeServiceType, int i, Object obj) {
        if ((i & 1) != 0) {
            latLon = slotArgsHome.f101936a;
        }
        if ((i & 2) != 0) {
            storeServiceType = slotArgsHome.f101937b;
        }
        return slotArgsHome.mo131770c(latLon, storeServiceType);
    }

    @C12579k
    /* renamed from: a */
    public final LatLon mo131768a() {
        return this.f101936a;
    }

    @C12579k
    /* renamed from: b */
    public final StoreServiceType mo131769b() {
        return this.f101937b;
    }

    @C12579k
    /* renamed from: c */
    public final SlotArgsHome mo131770c(@C12579k LatLon latLon, @C12579k StoreServiceType storeServiceType) {
        Intrinsics.checkNotNullParameter(latLon, "latLon");
        Intrinsics.checkNotNullParameter(storeServiceType, "serviceType");
        return new SlotArgsHome(latLon, storeServiceType);
    }

    public int describeContents() {
        return 0;
    }

    @C12579k
    /* renamed from: e */
    public final LatLon mo131772e() {
        return this.f101936a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SlotArgsHome)) {
            return false;
        }
        SlotArgsHome slotArgsHome = (SlotArgsHome) obj;
        return Intrinsics.areEqual((Object) this.f101936a, (Object) slotArgsHome.f101936a) && Intrinsics.areEqual((Object) this.f101937b, (Object) slotArgsHome.f101937b);
    }

    @C12579k
    /* renamed from: f */
    public final StoreServiceType mo131774f() {
        return this.f101937b;
    }

    public int hashCode() {
        return (this.f101936a.hashCode() * 31) + this.f101937b.hashCode();
    }

    @C12579k
    public String toString() {
        LatLon latLon = this.f101936a;
        StoreServiceType storeServiceType = this.f101937b;
        return "SlotArgsHome(latLon=" + latLon + ", serviceType=" + storeServiceType + ")";
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeParcelable(this.f101936a, i);
        parcel.writeParcelable(this.f101937b, i);
    }
}
