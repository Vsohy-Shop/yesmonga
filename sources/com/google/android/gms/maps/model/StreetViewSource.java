package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.internal.C40808s;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.C40812a(creator = "StreetViewSourceCreator")
@SafeParcelable.C40818g({1})
public final class StreetViewSource extends AbstractSafeParcelable {
    @C0359n0
    public static final Parcelable.Creator<StreetViewSource> CREATOR = new C30582e0();
    @C0359n0

    /* renamed from: b */
    public static final StreetViewSource f73096b = new StreetViewSource(0);
    @C0359n0

    /* renamed from: c */
    public static final StreetViewSource f73097c = new StreetViewSource(1);

    /* renamed from: d */
    public static final String f73098d = "StreetViewSource";
    @SafeParcelable.C40814c(getter = "getType", mo134489id = 2)

    /* renamed from: a */
    public final int f73099a;

    @SafeParcelable.C40813b
    public StreetViewSource(@SafeParcelable.C40816e(mo134492id = 2) int i) {
        this.f73099a = i;
    }

    public boolean equals(@C0363p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof StreetViewSource) && this.f73099a == ((StreetViewSource) obj).f73099a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return C40808s.m166011c(Integer.valueOf(this.f73099a));
    }

    @C0359n0
    public String toString() {
        String str;
        int i = this.f73099a;
        if (i == 0) {
            str = "DEFAULT";
        } else if (i != 1) {
            str = String.format("UNKNOWN(%s)", new Object[]{Integer.valueOf(i)});
        } else {
            str = "OUTDOOR";
        }
        return String.format("StreetViewSource:%s", new Object[]{str});
    }

    public void writeToParcel(@C0359n0 Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166089F(parcel, 2, this.f73099a);
        C40820a.m166112b(parcel, a);
    }
}
