package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.gms.common.internal.C40808s;
import com.google.android.gms.common.internal.C40858y;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import kotlinx.serialization.json.internal.C12361b;

@C40858y
@SafeParcelable.C40812a(creator = "DeviceOrientationRequestCreator")
public final class zzs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzs> CREATOR = new C30341g2();
    @SafeParcelable.C40814c(defaultValueUnchecked = "DeviceOrientationRequest.DEFAULT_SHOULD_USE_MAG", mo134489id = 1)

    /* renamed from: a */
    public boolean f72887a;
    @SafeParcelable.C40814c(defaultValueUnchecked = "DeviceOrientationRequest.DEFAULT_MINIMUM_SAMPLING_PERIOD_MS", mo134489id = 2)

    /* renamed from: b */
    public long f72888b;
    @SafeParcelable.C40814c(defaultValueUnchecked = "DeviceOrientationRequest.DEFAULT_SMALLEST_ANGLE_CHANGE_RADIANS", mo134489id = 3)

    /* renamed from: c */
    public float f72889c;
    @SafeParcelable.C40814c(defaultValueUnchecked = "DeviceOrientationRequest.DEFAULT_EXPIRE_AT_MS", mo134489id = 4)

    /* renamed from: d */
    public long f72890d;
    @SafeParcelable.C40814c(defaultValueUnchecked = "DeviceOrientationRequest.DEFAULT_NUM_UPDATES", mo134489id = 5)

    /* renamed from: e */
    public int f72891e;

    public zzs() {
        this(true, 50, 0.0f, Long.MAX_VALUE, Integer.MAX_VALUE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzs)) {
            return false;
        }
        zzs zzs = (zzs) obj;
        if (this.f72887a == zzs.f72887a && this.f72888b == zzs.f72888b && Float.compare(this.f72889c, zzs.f72889c) == 0 && this.f72890d == zzs.f72890d && this.f72891e == zzs.f72891e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return C40808s.m166011c(Boolean.valueOf(this.f72887a), Long.valueOf(this.f72888b), Float.valueOf(this.f72889c), Long.valueOf(this.f72890d), Integer.valueOf(this.f72891e));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DeviceOrientationRequest[mShouldUseMag=");
        sb.append(this.f72887a);
        sb.append(" mMinimumSamplingPeriodMs=");
        sb.append(this.f72888b);
        sb.append(" mSmallestAngleChangeRadians=");
        sb.append(this.f72889c);
        long j = this.f72890d;
        if (j != Long.MAX_VALUE) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            sb.append(" expireIn=");
            sb.append(j - elapsedRealtime);
            sb.append("ms");
        }
        if (this.f72891e != Integer.MAX_VALUE) {
            sb.append(" num=");
            sb.append(this.f72891e);
        }
        sb.append(C12361b.f30261l);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166122g(parcel, 1, this.f72887a);
        C40820a.m166094K(parcel, 2, this.f72888b);
        C40820a.m166141w(parcel, 3, this.f72889c);
        C40820a.m166094K(parcel, 4, this.f72890d);
        C40820a.m166089F(parcel, 5, this.f72891e);
        C40820a.m166112b(parcel, a);
    }

    @SafeParcelable.C40813b
    public zzs(@SafeParcelable.C40816e(mo134492id = 1) boolean z, @SafeParcelable.C40816e(mo134492id = 2) long j, @SafeParcelable.C40816e(mo134492id = 3) float f, @SafeParcelable.C40816e(mo134492id = 4) long j2, @SafeParcelable.C40816e(mo134492id = 5) int i) {
        this.f72887a = z;
        this.f72888b = j;
        this.f72889c = f;
        this.f72890d = j2;
        this.f72891e = i;
    }
}
