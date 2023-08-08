package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import androidx.annotation.C0363p0;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.C40808s;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import kotlinx.serialization.json.internal.C12361b;

@SafeParcelable.C40812a(creator = "LocationRequestCreator")
@SafeParcelable.C40818g({1000})
public final class LocationRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<LocationRequest> CREATOR = new C30313a1();

    /* renamed from: X */
    public static final int f72711X = 105;

    /* renamed from: x */
    public static final int f72712x = 100;

    /* renamed from: y */
    public static final int f72713y = 102;

    /* renamed from: z */
    public static final int f72714z = 104;
    @SafeParcelable.C40814c(defaultValueUnchecked = "LocationRequest.DEFAULT_PRIORITY", mo134489id = 1)

    /* renamed from: a */
    public int f72715a;
    @SafeParcelable.C40814c(defaultValueUnchecked = "LocationRequest.DEFAULT_INTERVAL", mo134489id = 2)

    /* renamed from: b */
    public long f72716b;
    @SafeParcelable.C40814c(defaultValueUnchecked = "LocationRequest.DEFAULT_FASTEST_INTERVAL", mo134489id = 3)

    /* renamed from: c */
    public long f72717c;
    @SafeParcelable.C40814c(defaultValueUnchecked = "LocationRequest.DEFAULT_EXPLICIT_FASTEST_INTERVAL", mo134489id = 4)

    /* renamed from: d */
    public boolean f72718d;
    @SafeParcelable.C40814c(defaultValueUnchecked = "LocationRequest.DEFAULT_EXPIRE_AT", mo134489id = 5)

    /* renamed from: e */
    public long f72719e;
    @SafeParcelable.C40814c(defaultValueUnchecked = "LocationRequest.DEFAULT_NUM_UPDATES", mo134489id = 6)

    /* renamed from: f */
    public int f72720f;
    @SafeParcelable.C40814c(defaultValueUnchecked = "LocationRequest.DEFAULT_SMALLEST_DISPLACEMENT", mo134489id = 7)

    /* renamed from: g */
    public float f72721g;
    @SafeParcelable.C40814c(defaultValueUnchecked = "LocationRequest.DEFAULT_MAX_WAIT_TIME", mo134489id = 8)

    /* renamed from: v */
    public long f72722v;
    @SafeParcelable.C40814c(defaultValue = "false", mo134489id = 9)

    /* renamed from: w */
    public boolean f72723w;

    @Deprecated
    public LocationRequest() {
        this.f72715a = 102;
        this.f72716b = 3600000;
        this.f72717c = 600000;
        this.f72718d = false;
        this.f72719e = Long.MAX_VALUE;
        this.f72720f = Integer.MAX_VALUE;
        this.f72721g = 0.0f;
        this.f72722v = 0;
        this.f72723w = false;
    }

    @RecentlyNonNull
    /* renamed from: M */
    public static LocationRequest m122055M() {
        LocationRequest locationRequest = new LocationRequest();
        locationRequest.mo85577M1(true);
        return locationRequest;
    }

    /* renamed from: X1 */
    public static void m122056X1(long j) {
        if (j < 0) {
            StringBuilder sb = new StringBuilder(38);
            sb.append("invalid interval: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: A0 */
    public boolean mo85571A0() {
        return this.f72723w;
    }

    @RecentlyNonNull
    /* renamed from: A1 */
    public LocationRequest mo85572A1(int i) {
        if (i > 0) {
            this.f72720f = i;
            return this;
        }
        StringBuilder sb = new StringBuilder(31);
        sb.append("invalid numUpdates: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    @RecentlyNonNull
    /* renamed from: C0 */
    public LocationRequest mo85573C0(long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = Long.MAX_VALUE;
        if (j <= Long.MAX_VALUE - elapsedRealtime) {
            j2 = j + elapsedRealtime;
        }
        this.f72719e = j2;
        if (j2 < 0) {
            this.f72719e = 0;
        }
        return this;
    }

    @RecentlyNonNull
    /* renamed from: G1 */
    public LocationRequest mo85574G1(int i) {
        if (i == 100 || i == 102 || i == 104 || i == 105) {
            this.f72715a = i;
            return this;
        }
        StringBuilder sb = new StringBuilder(28);
        sb.append("invalid quality: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    @RecentlyNonNull
    /* renamed from: K0 */
    public LocationRequest mo85575K0(long j) {
        this.f72719e = j;
        if (j < 0) {
            this.f72719e = 0;
        }
        return this;
    }

    @RecentlyNonNull
    /* renamed from: L1 */
    public LocationRequest mo85576L1(float f) {
        if (f >= 0.0f) {
            this.f72721g = f;
            return this;
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("invalid displacement: ");
        sb.append(f);
        throw new IllegalArgumentException(sb.toString());
    }

    @RecentlyNonNull
    /* renamed from: M1 */
    public LocationRequest mo85577M1(boolean z) {
        this.f72723w = z;
        return this;
    }

    @RecentlyNonNull
    /* renamed from: N0 */
    public LocationRequest mo85578N0(long j) {
        m122056X1(j);
        this.f72718d = true;
        this.f72717c = j;
        return this;
    }

    /* renamed from: Q */
    public long mo85579Q() {
        return this.f72719e;
    }

    /* renamed from: W */
    public long mo85580W() {
        return this.f72717c;
    }

    /* renamed from: X */
    public long mo85581X() {
        return this.f72716b;
    }

    /* renamed from: e0 */
    public long mo85582e0() {
        long j = this.f72722v;
        long j2 = this.f72716b;
        return j < j2 ? j2 : j;
    }

    public boolean equals(@C0363p0 Object obj) {
        if (obj instanceof LocationRequest) {
            LocationRequest locationRequest = (LocationRequest) obj;
            if (this.f72715a == locationRequest.f72715a && this.f72716b == locationRequest.f72716b && this.f72717c == locationRequest.f72717c && this.f72718d == locationRequest.f72718d && this.f72719e == locationRequest.f72719e && this.f72720f == locationRequest.f72720f && this.f72721g == locationRequest.f72721g && mo85582e0() == locationRequest.mo85582e0() && this.f72723w == locationRequest.f72723w) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: f0 */
    public int mo85584f0() {
        return this.f72720f;
    }

    public int hashCode() {
        return C40808s.m166011c(Integer.valueOf(this.f72715a), Long.valueOf(this.f72716b), Float.valueOf(this.f72721g), Long.valueOf(this.f72722v));
    }

    @RecentlyNonNull
    /* renamed from: j1 */
    public LocationRequest mo85586j1(long j) {
        m122056X1(j);
        this.f72716b = j;
        if (!this.f72718d) {
            this.f72717c = (long) (((double) j) / 6.0d);
        }
        return this;
    }

    @RecentlyNonNull
    /* renamed from: k1 */
    public LocationRequest mo85587k1(long j) {
        m122056X1(j);
        this.f72722v = j;
        return this;
    }

    /* renamed from: n0 */
    public int mo85588n0() {
        return this.f72715a;
    }

    /* renamed from: p0 */
    public float mo85589p0() {
        return this.f72721g;
    }

    /* renamed from: t0 */
    public boolean mo85590t0() {
        return this.f72718d;
    }

    @RecentlyNonNull
    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("Request[");
        int i = this.f72715a;
        if (i == 100) {
            str = "PRIORITY_HIGH_ACCURACY";
        } else if (i == 102) {
            str = "PRIORITY_BALANCED_POWER_ACCURACY";
        } else if (i == 104) {
            str = "PRIORITY_LOW_POWER";
        } else if (i != 105) {
            str = "???";
        } else {
            str = "PRIORITY_NO_POWER";
        }
        sb.append(str);
        if (this.f72715a != 105) {
            sb.append(" requested=");
            sb.append(this.f72716b);
            sb.append("ms");
        }
        sb.append(" fastest=");
        sb.append(this.f72717c);
        sb.append("ms");
        if (this.f72722v > this.f72716b) {
            sb.append(" maxWait=");
            sb.append(this.f72722v);
            sb.append("ms");
        }
        if (this.f72721g > 0.0f) {
            sb.append(" smallestDisplacement=");
            sb.append(this.f72721g);
            sb.append("m");
        }
        long j = this.f72719e;
        if (j != Long.MAX_VALUE) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            sb.append(" expireIn=");
            sb.append(j - elapsedRealtime);
            sb.append("ms");
        }
        if (this.f72720f != Integer.MAX_VALUE) {
            sb.append(" num=");
            sb.append(this.f72720f);
        }
        sb.append(C12361b.f30261l);
        return sb.toString();
    }

    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166089F(parcel, 1, this.f72715a);
        C40820a.m166094K(parcel, 2, this.f72716b);
        C40820a.m166094K(parcel, 3, this.f72717c);
        C40820a.m166122g(parcel, 4, this.f72718d);
        C40820a.m166094K(parcel, 5, this.f72719e);
        C40820a.m166089F(parcel, 6, this.f72720f);
        C40820a.m166141w(parcel, 7, this.f72721g);
        C40820a.m166094K(parcel, 8, this.f72722v);
        C40820a.m166122g(parcel, 9, this.f72723w);
        C40820a.m166112b(parcel, a);
    }

    @SafeParcelable.C40813b
    public LocationRequest(@SafeParcelable.C40816e(mo134492id = 1) int i, @SafeParcelable.C40816e(mo134492id = 2) long j, @SafeParcelable.C40816e(mo134492id = 3) long j2, @SafeParcelable.C40816e(mo134492id = 4) boolean z, @SafeParcelable.C40816e(mo134492id = 5) long j3, @SafeParcelable.C40816e(mo134492id = 6) int i2, @SafeParcelable.C40816e(mo134492id = 7) float f, @SafeParcelable.C40816e(mo134492id = 8) long j4, @SafeParcelable.C40816e(mo134492id = 9) boolean z2) {
        this.f72715a = i;
        this.f72716b = j;
        this.f72717c = j2;
        this.f72718d = z;
        this.f72719e = j3;
        this.f72720f = i2;
        this.f72721g = f;
        this.f72722v = j4;
        this.f72723w = z2;
    }
}
