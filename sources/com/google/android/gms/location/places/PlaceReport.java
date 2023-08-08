package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C40808s;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.C40974d0;

@SafeParcelable.C40812a(creator = "PlaceReportCreator")
public class PlaceReport extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<PlaceReport> CREATOR = new C30375a();
    @SafeParcelable.C40819h(mo134498id = 1)

    /* renamed from: a */
    public final int f72841a;
    @SafeParcelable.C40814c(getter = "getPlaceId", mo134489id = 2)

    /* renamed from: b */
    public final String f72842b;
    @SafeParcelable.C40814c(getter = "getTag", mo134489id = 3)

    /* renamed from: c */
    public final String f72843c;
    @SafeParcelable.C40814c(getter = "getSource", mo134489id = 4)

    /* renamed from: d */
    public final String f72844d;

    @SafeParcelable.C40813b
    public PlaceReport(@SafeParcelable.C40816e(mo134492id = 1) int i, @SafeParcelable.C40816e(mo134492id = 2) String str, @SafeParcelable.C40816e(mo134492id = 3) String str2, @SafeParcelable.C40816e(mo134492id = 4) String str3) {
        this.f72841a = i;
        this.f72842b = str;
        this.f72843c = str2;
        this.f72844d = str3;
    }

    @C40974d0
    /* renamed from: M */
    public static PlaceReport m122200M(String str, String str2) {
        C40843u.m166202l(str);
        C40843u.m166198h(str2);
        C40843u.m166198h("unknown");
        C40843u.m166192b(true, "Invalid source");
        return new PlaceReport(1, str, str2, "unknown");
    }

    /* renamed from: Q */
    public String mo85743Q() {
        return this.f72842b;
    }

    /* renamed from: W */
    public String mo85744W() {
        return this.f72843c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PlaceReport)) {
            return false;
        }
        PlaceReport placeReport = (PlaceReport) obj;
        return C40808s.m166010b(this.f72842b, placeReport.f72842b) && C40808s.m166010b(this.f72843c, placeReport.f72843c) && C40808s.m166010b(this.f72844d, placeReport.f72844d);
    }

    public int hashCode() {
        return C40808s.m166011c(this.f72842b, this.f72843c, this.f72844d);
    }

    public String toString() {
        C40808s.C40809a d = C40808s.m166012d(this);
        d.mo134475a("placeId", this.f72842b);
        d.mo134475a("tag", this.f72843c);
        if (!"unknown".equals(this.f72844d)) {
            d.mo134475a("source", this.f72844d);
        }
        return d.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166089F(parcel, 1, this.f72841a);
        C40820a.m166108Y(parcel, 2, mo85743Q(), false);
        C40820a.m166108Y(parcel, 3, mo85744W(), false);
        C40820a.m166108Y(parcel, 4, this.f72844d, false);
        C40820a.m166112b(parcel, a);
    }
}
