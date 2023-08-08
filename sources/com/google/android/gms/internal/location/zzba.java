package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.internal.C40808s;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.location.LocationRequest;
import java.util.Collections;
import java.util.List;

@SafeParcelable.C40812a(creator = "LocationRequestInternalCreator")
@SafeParcelable.C40818g({1000, 2, 3, 4})
public final class zzba extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzba> CREATOR = new C41753b0();

    /* renamed from: z */
    public static final List<ClientIdentity> f105937z = Collections.emptyList();
    @SafeParcelable.C40814c(defaultValueUnchecked = "null", mo134489id = 1)

    /* renamed from: a */
    public final LocationRequest f105938a;
    @SafeParcelable.C40814c(defaultValueUnchecked = "LocationRequestInternal.DEFAULT_CLIENTS", mo134489id = 5)

    /* renamed from: b */
    public final List<ClientIdentity> f105939b;
    @C0363p0
    @SafeParcelable.C40814c(defaultValueUnchecked = "null", mo134489id = 6)

    /* renamed from: c */
    public final String f105940c;
    @SafeParcelable.C40814c(defaultValueUnchecked = "LocationRequestInternal.DEFAULT_HIDE_FROM_APP_OPS", mo134489id = 7)

    /* renamed from: d */
    public final boolean f105941d;
    @SafeParcelable.C40814c(defaultValueUnchecked = "LocationRequestInternal.DEFAULT_FORCE_COARSE_LOCATION", mo134489id = 8)

    /* renamed from: e */
    public final boolean f105942e;
    @SafeParcelable.C40814c(defaultValueUnchecked = "LocationRequestInternal.DEFAULT_EXEMPT_FROM_THROTTLE", mo134489id = 9)

    /* renamed from: f */
    public final boolean f105943f;
    @C0363p0
    @SafeParcelable.C40814c(defaultValueUnchecked = "null", mo134489id = 10)

    /* renamed from: g */
    public final String f105944g;
    @SafeParcelable.C40814c(defaultValueUnchecked = "false", mo134489id = 11)

    /* renamed from: v */
    public final boolean f105945v;
    @SafeParcelable.C40814c(defaultValueUnchecked = "false", mo134489id = 12)

    /* renamed from: w */
    public boolean f105946w;
    @C0363p0
    @SafeParcelable.C40814c(defaultValueUnchecked = "null", mo134489id = 13)

    /* renamed from: x */
    public String f105947x;
    @SafeParcelable.C40814c(defaultValueUnchecked = "LocationRequestInternal.DEFAULT_MAX_LOCATION_AGE_MILLIS", mo134489id = 14)

    /* renamed from: y */
    public long f105948y;

    @SafeParcelable.C40813b
    public zzba(@SafeParcelable.C40816e(mo134492id = 1) LocationRequest locationRequest, @SafeParcelable.C40816e(mo134492id = 5) List<ClientIdentity> list, @C0363p0 @SafeParcelable.C40816e(mo134492id = 6) String str, @SafeParcelable.C40816e(mo134492id = 7) boolean z, @SafeParcelable.C40816e(mo134492id = 8) boolean z2, @SafeParcelable.C40816e(mo134492id = 9) boolean z3, @C0363p0 @SafeParcelable.C40816e(mo134492id = 10) String str2, @SafeParcelable.C40816e(mo134492id = 11) boolean z4, @SafeParcelable.C40816e(mo134492id = 12) boolean z5, @C0363p0 @SafeParcelable.C40816e(mo134492id = 13) String str3, @SafeParcelable.C40816e(mo134492id = 14) long j) {
        this.f105938a = locationRequest;
        this.f105939b = list;
        this.f105940c = str;
        this.f105941d = z;
        this.f105942e = z2;
        this.f105943f = z3;
        this.f105944g = str2;
        this.f105945v = z4;
        this.f105946w = z5;
        this.f105947x = str3;
        this.f105948y = j;
    }

    /* renamed from: M */
    public static zzba m169191M(@C0363p0 String str, LocationRequest locationRequest) {
        return new zzba(locationRequest, f105937z, (String) null, false, false, false, (String) null, false, false, (String) null, Long.MAX_VALUE);
    }

    /* renamed from: Q */
    public final zzba mo136271Q(long j) {
        if (this.f105938a.mo85582e0() <= this.f105938a.mo85581X()) {
            this.f105948y = 10000;
            return this;
        }
        long X = this.f105938a.mo85581X();
        long e0 = this.f105938a.mo85582e0();
        StringBuilder sb = new StringBuilder(120);
        sb.append("could not set max age when location batching is requested, interval=");
        sb.append(X);
        sb.append("maxWaitTime=");
        sb.append(e0);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: W */
    public final zzba mo136272W(@C0363p0 String str) {
        this.f105947x = str;
        return this;
    }

    /* renamed from: X */
    public final zzba mo136273X(boolean z) {
        this.f105946w = true;
        return this;
    }

    public final boolean equals(@C0363p0 Object obj) {
        if (obj instanceof zzba) {
            zzba zzba = (zzba) obj;
            if (!C40808s.m166010b(this.f105938a, zzba.f105938a) || !C40808s.m166010b(this.f105939b, zzba.f105939b) || !C40808s.m166010b(this.f105940c, zzba.f105940c) || this.f105941d != zzba.f105941d || this.f105942e != zzba.f105942e || this.f105943f != zzba.f105943f || !C40808s.m166010b(this.f105944g, zzba.f105944g) || this.f105945v != zzba.f105945v || this.f105946w != zzba.f105946w || !C40808s.m166010b(this.f105947x, zzba.f105947x)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f105938a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f105938a);
        if (this.f105940c != null) {
            sb.append(" tag=");
            sb.append(this.f105940c);
        }
        if (this.f105944g != null) {
            sb.append(" moduleId=");
            sb.append(this.f105944g);
        }
        if (this.f105947x != null) {
            sb.append(" contextAttributionTag=");
            sb.append(this.f105947x);
        }
        sb.append(" hideAppOps=");
        sb.append(this.f105941d);
        sb.append(" clients=");
        sb.append(this.f105939b);
        sb.append(" forceCoarseLocation=");
        sb.append(this.f105942e);
        if (this.f105943f) {
            sb.append(" exemptFromBackgroundThrottle");
        }
        if (this.f105945v) {
            sb.append(" locationSettingsIgnored");
        }
        if (this.f105946w) {
            sb.append(" inaccurateLocationsDelayed");
        }
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166102S(parcel, 1, this.f105938a, i, false);
        C40820a.m166117d0(parcel, 5, this.f105939b, false);
        C40820a.m166108Y(parcel, 6, this.f105940c, false);
        C40820a.m166122g(parcel, 7, this.f105941d);
        C40820a.m166122g(parcel, 8, this.f105942e);
        C40820a.m166122g(parcel, 9, this.f105943f);
        C40820a.m166108Y(parcel, 10, this.f105944g, false);
        C40820a.m166122g(parcel, 11, this.f105945v);
        C40820a.m166122g(parcel, 12, this.f105946w);
        C40820a.m166108Y(parcel, 13, this.f105947x, false);
        C40820a.m166094K(parcel, 14, this.f105948y);
        C40820a.m166112b(parcel, a);
    }
}
