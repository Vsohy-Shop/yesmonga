package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.internal.C40808s;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.C40974d0;
import com.google.android.gms.location.zzs;
import java.util.Collections;
import java.util.List;

@SafeParcelable.C40812a(creator = "DeviceOrientationRequestInternalCreator")
public final class zzj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzj> CREATOR = new C41808x0();
    @C40974d0

    /* renamed from: d */
    public static final List<ClientIdentity> f105971d = Collections.emptyList();

    /* renamed from: e */
    public static final zzs f105972e = new zzs();
    @SafeParcelable.C40814c(defaultValueUnchecked = "DeviceOrientationRequestInternal.DEFAULT_DEVICE_ORIENTATION_REQUEST", mo134489id = 1)

    /* renamed from: a */
    public final zzs f105973a;
    @SafeParcelable.C40814c(defaultValueUnchecked = "DeviceOrientationRequestInternal.DEFAULT_CLIENTS", mo134489id = 2)

    /* renamed from: b */
    public final List<ClientIdentity> f105974b;
    @C0363p0
    @SafeParcelable.C40814c(defaultValueUnchecked = "null", mo134489id = 3)

    /* renamed from: c */
    public final String f105975c;

    @SafeParcelable.C40813b
    public zzj(@SafeParcelable.C40816e(mo134492id = 1) zzs zzs, @SafeParcelable.C40816e(mo134492id = 2) List<ClientIdentity> list, @SafeParcelable.C40816e(mo134492id = 3) String str) {
        this.f105973a = zzs;
        this.f105974b = list;
        this.f105975c = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzj)) {
            return false;
        }
        zzj zzj = (zzj) obj;
        if (!C40808s.m166010b(this.f105973a, zzj.f105973a) || !C40808s.m166010b(this.f105974b, zzj.f105974b) || !C40808s.m166010b(this.f105975c, zzj.f105975c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f105973a.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f105973a);
        String valueOf2 = String.valueOf(this.f105974b);
        String str = this.f105975c;
        int length = valueOf.length();
        StringBuilder sb = new StringBuilder(length + 77 + valueOf2.length() + String.valueOf(str).length());
        sb.append("DeviceOrientationRequestInternal{deviceOrientationRequest=");
        sb.append(valueOf);
        sb.append(", clients=");
        sb.append(valueOf2);
        sb.append(", tag='");
        sb.append(str);
        sb.append("'}");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166102S(parcel, 1, this.f105973a, i, false);
        C40820a.m166117d0(parcel, 2, this.f105974b, false);
        C40820a.m166108Y(parcel, 3, this.f105975c, false);
        C40820a.m166112b(parcel, a);
    }
}
