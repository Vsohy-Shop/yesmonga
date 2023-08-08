package com.google.android.gms.location;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.location.zzbs;
import java.util.List;

@SafeParcelable.C40812a(creator = "RemoveGeofencingRequestCreator")
@SafeParcelable.C40818g({1000})
public final class zzbq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbq> CREATOR = new C30352j1();
    @SafeParcelable.C40814c(getter = "getGeofenceIds", mo134489id = 1)

    /* renamed from: a */
    public final List<String> f72880a;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getPendingIntent", mo134489id = 2)

    /* renamed from: b */
    public final PendingIntent f72881b;
    @SafeParcelable.C40814c(defaultValue = "", getter = "getTag", mo134489id = 3)

    /* renamed from: c */
    public final String f72882c;

    @SafeParcelable.C40813b
    public zzbq(@C0363p0 @SafeParcelable.C40816e(mo134492id = 1) List<String> list, @C0363p0 @SafeParcelable.C40816e(mo134492id = 2) PendingIntent pendingIntent, @SafeParcelable.C40816e(mo134492id = 3) String str) {
        zzbs<String> zzbs;
        if (list == null) {
            zzbs = zzbs.m169210A();
        } else {
            zzbs = zzbs.m169211H(list);
        }
        this.f72880a = zzbs;
        this.f72881b = pendingIntent;
        this.f72882c = str;
    }

    /* renamed from: M */
    public static zzbq m122234M(List<String> list) {
        C40843u.m166203m(list, "geofence can't be null.");
        C40843u.m166192b(!list.isEmpty(), "Geofences must contains at least one id.");
        return new zzbq(list, (PendingIntent) null, "");
    }

    /* renamed from: Q */
    public static zzbq m122235Q(PendingIntent pendingIntent) {
        C40843u.m166203m(pendingIntent, "PendingIntent can not be null.");
        return new zzbq((List<String>) null, pendingIntent, "");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166111a0(parcel, 1, this.f72880a, false);
        C40820a.m166102S(parcel, 2, this.f72881b, i, false);
        C40820a.m166108Y(parcel, 3, this.f72882c, false);
        C40820a.m166112b(parcel, a);
    }
}
