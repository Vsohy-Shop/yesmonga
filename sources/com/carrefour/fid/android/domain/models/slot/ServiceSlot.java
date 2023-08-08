package com.carrefour.fid.android.domain.models.slot;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.C11076d0;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J#\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u0011\u001a\u00020\fHÖ\u0001J\u0019\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\fHÖ\u0001R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/slot/ServiceSlot;", "Landroid/os/Parcelable;", "", "Lcom/carrefour/fid/android/domain/models/slot/Slot;", "a", "", "b", "slots", "isProductThresholdExceeded", "c", "", "toString", "", "hashCode", "", "other", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Ljava/util/List;", "e", "()Ljava/util/List;", "Z", "f", "()Z", "<init>", "(Ljava/util/List;Z)V", "domain-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12187d
public final class ServiceSlot implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<ServiceSlot> CREATOR = new C38175a();
    @C12579k

    /* renamed from: a */
    public final List<Slot> f96703a;

    /* renamed from: b */
    public final boolean f96704b;

    /* renamed from: com.carrefour.fid.android.domain.models.slot.ServiceSlot$a */
    public static final class C38175a implements Parcelable.Creator<ServiceSlot> {
        @C12579k
        /* renamed from: a */
        public final ServiceSlot createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            boolean z = false;
            for (int i = 0; i != readInt; i++) {
                arrayList.add(Slot.CREATOR.createFromParcel(parcel));
            }
            if (parcel.readInt() != 0) {
                z = true;
            }
            return new ServiceSlot(arrayList, z);
        }

        @C12579k
        /* renamed from: b */
        public final ServiceSlot[] newArray(int i) {
            return new ServiceSlot[i];
        }
    }

    public ServiceSlot(@C12579k List<Slot> list, boolean z) {
        Intrinsics.checkNotNullParameter(list, "slots");
        this.f96703a = list;
        this.f96704b = z;
    }

    /* renamed from: d */
    public static /* synthetic */ ServiceSlot m158261d(ServiceSlot serviceSlot, List<Slot> list, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            list = serviceSlot.f96703a;
        }
        if ((i & 2) != 0) {
            z = serviceSlot.f96704b;
        }
        return serviceSlot.mo119476c(list, z);
    }

    @C12579k
    /* renamed from: a */
    public final List<Slot> mo119474a() {
        return this.f96703a;
    }

    /* renamed from: b */
    public final boolean mo119475b() {
        return this.f96704b;
    }

    @C12579k
    /* renamed from: c */
    public final ServiceSlot mo119476c(@C12579k List<Slot> list, boolean z) {
        Intrinsics.checkNotNullParameter(list, "slots");
        return new ServiceSlot(list, z);
    }

    public int describeContents() {
        return 0;
    }

    @C12579k
    /* renamed from: e */
    public final List<Slot> mo119478e() {
        return this.f96703a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServiceSlot)) {
            return false;
        }
        ServiceSlot serviceSlot = (ServiceSlot) obj;
        return Intrinsics.areEqual((Object) this.f96703a, (Object) serviceSlot.f96703a) && this.f96704b == serviceSlot.f96704b;
    }

    /* renamed from: f */
    public final boolean mo119480f() {
        return this.f96704b;
    }

    public int hashCode() {
        int hashCode = this.f96703a.hashCode() * 31;
        boolean z = this.f96704b;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    @C12579k
    public String toString() {
        List<Slot> list = this.f96703a;
        boolean z = this.f96704b;
        return "ServiceSlot(slots=" + list + ", isProductThresholdExceeded=" + z + ")";
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        List<Slot> list = this.f96703a;
        parcel.writeInt(list.size());
        for (Slot writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.f96704b ? 1 : 0);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ServiceSlot(List list, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt__CollectionsKt.m40441E() : list, z);
    }
}
