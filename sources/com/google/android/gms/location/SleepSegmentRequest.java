package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.C0363p0;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.C40808s;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.common.internal.C40858y;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

@SafeParcelable.C40812a(creator = "SleepSegmentRequestCreator")
@SafeParcelable.C40818g({1000})
public class SleepSegmentRequest extends AbstractSafeParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<SleepSegmentRequest> CREATOR = new C30371o1();

    /* renamed from: c */
    public static final int f72758c = 0;

    /* renamed from: d */
    public static final int f72759d = 1;

    /* renamed from: e */
    public static final int f72760e = 2;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getUserPreferredSleepWindow", mo134489id = 1)

    /* renamed from: a */
    public final List<zzbx> f72761a;
    @SafeParcelable.C40814c(defaultValue = "0", getter = "getRequestedDataType", mo134489id = 2)

    /* renamed from: b */
    public final int f72762b;

    public SleepSegmentRequest(int i) {
        this((List<zzbx>) null, i);
    }

    @RecentlyNonNull
    /* renamed from: M */
    public static SleepSegmentRequest m122107M() {
        return new SleepSegmentRequest((List<zzbx>) null, 0);
    }

    /* renamed from: Q */
    public int mo85633Q() {
        return this.f72762b;
    }

    public boolean equals(@C0363p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SleepSegmentRequest)) {
            return false;
        }
        SleepSegmentRequest sleepSegmentRequest = (SleepSegmentRequest) obj;
        if (!C40808s.m166010b(this.f72761a, sleepSegmentRequest.f72761a) || this.f72762b != sleepSegmentRequest.f72762b) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C40808s.m166011c(this.f72761a, Integer.valueOf(this.f72762b));
    }

    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        C40843u.m166202l(parcel);
        int a = C40820a.m166110a(parcel);
        C40820a.m166117d0(parcel, 1, this.f72761a, false);
        C40820a.m166089F(parcel, 2, mo85633Q());
        C40820a.m166112b(parcel, a);
    }

    @C40858y
    @SafeParcelable.C40813b
    public SleepSegmentRequest(@C0363p0 @SafeParcelable.C40816e(mo134492id = 1) List<zzbx> list, @SafeParcelable.C40816e(mo134492id = 2) int i) {
        this.f72761a = list;
        this.f72762b = i;
    }
}
