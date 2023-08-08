package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.internal.C40808s;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.common.internal.C40858y;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import kotlinx.serialization.json.internal.C12361b;

@C40858y
@SafeParcelable.C40812a(creator = "UserPreferredSleepWindowCreator")
@SafeParcelable.C40818g({1000})
public final class zzbx extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbx> CREATOR = new C30374p1();
    @SafeParcelable.C40814c(getter = "getStartHour", mo134489id = 1)

    /* renamed from: a */
    public final int f72883a;
    @SafeParcelable.C40814c(getter = "getStartMinute", mo134489id = 2)

    /* renamed from: b */
    public final int f72884b;
    @SafeParcelable.C40814c(getter = "getEndHour", mo134489id = 3)

    /* renamed from: c */
    public final int f72885c;
    @SafeParcelable.C40814c(getter = "getEndMinute", mo134489id = 4)

    /* renamed from: d */
    public final int f72886d;

    @SafeParcelable.C40813b
    public zzbx(@SafeParcelable.C40816e(mo134492id = 1) int i, @SafeParcelable.C40816e(mo134492id = 2) int i2, @SafeParcelable.C40816e(mo134492id = 3) int i3, @SafeParcelable.C40816e(mo134492id = 4) int i4) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5 = true;
        if (i < 0 || i > 23) {
            z = false;
        } else {
            z = true;
        }
        C40843u.m166209s(z, "Start hour must be in range [0, 23].");
        if (i2 < 0 || i2 > 59) {
            z2 = false;
        } else {
            z2 = true;
        }
        C40843u.m166209s(z2, "Start minute must be in range [0, 59].");
        if (i3 < 0 || i3 > 23) {
            z3 = false;
        } else {
            z3 = true;
        }
        C40843u.m166209s(z3, "End hour must be in range [0, 23].");
        if (i4 < 0 || i4 > 59) {
            z4 = false;
        } else {
            z4 = true;
        }
        C40843u.m166209s(z4, "End minute must be in range [0, 59].");
        C40843u.m166209s(((i + i2) + i3) + i4 <= 0 ? false : z5, "Parameters can't be all 0.");
        this.f72883a = i;
        this.f72884b = i2;
        this.f72885c = i3;
        this.f72886d = i4;
    }

    public final boolean equals(@C0363p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzbx)) {
            return false;
        }
        zzbx zzbx = (zzbx) obj;
        if (this.f72883a == zzbx.f72883a && this.f72884b == zzbx.f72884b && this.f72885c == zzbx.f72885c && this.f72886d == zzbx.f72886d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return C40808s.m166011c(Integer.valueOf(this.f72883a), Integer.valueOf(this.f72884b), Integer.valueOf(this.f72885c), Integer.valueOf(this.f72886d));
    }

    public final String toString() {
        int i = this.f72883a;
        int i2 = this.f72884b;
        int i3 = this.f72885c;
        int i4 = this.f72886d;
        StringBuilder sb = new StringBuilder(117);
        sb.append("UserPreferredSleepWindow [startHour=");
        sb.append(i);
        sb.append(", startMinute=");
        sb.append(i2);
        sb.append(", endHour=");
        sb.append(i3);
        sb.append(", endMinute=");
        sb.append(i4);
        sb.append(C12361b.f30261l);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C40843u.m166202l(parcel);
        int a = C40820a.m166110a(parcel);
        C40820a.m166089F(parcel, 1, this.f72883a);
        C40820a.m166089F(parcel, 2, this.f72884b);
        C40820a.m166089F(parcel, 3, this.f72885c);
        C40820a.m166089F(parcel, 4, this.f72886d);
        C40820a.m166112b(parcel, a);
    }
}
