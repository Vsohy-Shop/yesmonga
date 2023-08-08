package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.C40974d0;
import com.google.android.gms.location.C30331f;
import java.util.Locale;

@SafeParcelable.C40812a(creator = "ParcelableGeofenceCreator")
@SafeParcelable.C40818g({1000})
@C40974d0
public final class zzbe extends AbstractSafeParcelable implements C30331f {
    public static final Parcelable.Creator<zzbe> CREATOR = new C41759d0();
    @SafeParcelable.C40814c(getter = "getRequestId", mo134489id = 1)

    /* renamed from: a */
    public final String f105955a;
    @SafeParcelable.C40814c(getter = "getExpirationTime", mo134489id = 2)

    /* renamed from: b */
    public final long f105956b;
    @SafeParcelable.C40814c(getter = "getType", mo134489id = 3)

    /* renamed from: c */
    public final short f105957c;
    @SafeParcelable.C40814c(getter = "getLatitude", mo134489id = 4)

    /* renamed from: d */
    public final double f105958d;
    @SafeParcelable.C40814c(getter = "getLongitude", mo134489id = 5)

    /* renamed from: e */
    public final double f105959e;
    @SafeParcelable.C40814c(getter = "getRadius", mo134489id = 6)

    /* renamed from: f */
    public final float f105960f;
    @SafeParcelable.C40814c(getter = "getTransitionTypes", mo134489id = 7)

    /* renamed from: g */
    public final int f105961g;
    @SafeParcelable.C40814c(defaultValue = "0", getter = "getNotificationResponsiveness", mo134489id = 8)

    /* renamed from: v */
    public final int f105962v;
    @SafeParcelable.C40814c(defaultValue = "-1", getter = "getLoiteringDelay", mo134489id = 9)

    /* renamed from: w */
    public final int f105963w;

    @SafeParcelable.C40813b
    public zzbe(@SafeParcelable.C40816e(mo134492id = 1) String str, @SafeParcelable.C40816e(mo134492id = 7) int i, @SafeParcelable.C40816e(mo134492id = 3) short s, @SafeParcelable.C40816e(mo134492id = 4) double d, @SafeParcelable.C40816e(mo134492id = 5) double d2, @SafeParcelable.C40816e(mo134492id = 6) float f, @SafeParcelable.C40816e(mo134492id = 2) long j, @SafeParcelable.C40816e(mo134492id = 8) int i2, @SafeParcelable.C40816e(mo134492id = 9) int i3) {
        String str2;
        if (str == null || str.length() > 100) {
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2 = "requestId is null or too long: ".concat(valueOf);
            } else {
                str2 = new String("requestId is null or too long: ");
            }
            throw new IllegalArgumentException(str2);
        } else if (f <= 0.0f) {
            StringBuilder sb = new StringBuilder(31);
            sb.append("invalid radius: ");
            sb.append(f);
            throw new IllegalArgumentException(sb.toString());
        } else if (d > 90.0d || d < -90.0d) {
            StringBuilder sb2 = new StringBuilder(42);
            sb2.append("invalid latitude: ");
            sb2.append(d);
            throw new IllegalArgumentException(sb2.toString());
        } else if (d2 > 180.0d || d2 < -180.0d) {
            StringBuilder sb3 = new StringBuilder(43);
            sb3.append("invalid longitude: ");
            sb3.append(d2);
            throw new IllegalArgumentException(sb3.toString());
        } else {
            int i4 = i & 7;
            if (i4 != 0) {
                this.f105957c = s;
                this.f105955a = str;
                this.f105958d = d;
                this.f105959e = d2;
                this.f105960f = f;
                this.f105956b = j;
                this.f105961g = i4;
                this.f105962v = i2;
                this.f105963w = i3;
                return;
            }
            StringBuilder sb4 = new StringBuilder(46);
            sb4.append("No supported transition specified: ");
            sb4.append(i);
            throw new IllegalArgumentException(sb4.toString());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzbe) {
            zzbe zzbe = (zzbe) obj;
            if (this.f105960f == zzbe.f105960f && this.f105958d == zzbe.f105958d && this.f105959e == zzbe.f105959e && this.f105957c == zzbe.f105957c) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final String getRequestId() {
        return this.f105955a;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f105958d);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f105959e);
        return ((((((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + 31) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + Float.floatToIntBits(this.f105960f)) * 31) + this.f105957c) * 31) + this.f105961g;
    }

    public final String toString() {
        String str;
        Locale locale = Locale.US;
        Object[] objArr = new Object[9];
        short s = this.f105957c;
        if (s == -1) {
            str = "INVALID";
        } else if (s != 1) {
            str = "UNKNOWN";
        } else {
            str = "CIRCLE";
        }
        objArr[0] = str;
        objArr[1] = this.f105955a.replaceAll("\\p{C}", "?");
        objArr[2] = Integer.valueOf(this.f105961g);
        objArr[3] = Double.valueOf(this.f105958d);
        objArr[4] = Double.valueOf(this.f105959e);
        objArr[5] = Float.valueOf(this.f105960f);
        objArr[6] = Integer.valueOf(this.f105962v / 1000);
        objArr[7] = Integer.valueOf(this.f105963w);
        objArr[8] = Long.valueOf(this.f105956b);
        return String.format(locale, "Geofence[%s id:%s transitions:%d %.6f, %.6f %.0fm, resp=%ds, dwell=%dms, @%d]", objArr);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166108Y(parcel, 1, this.f105955a, false);
        C40820a.m166094K(parcel, 2, this.f105956b);
        C40820a.m166104U(parcel, 3, this.f105957c);
        C40820a.m166136r(parcel, 4, this.f105958d);
        C40820a.m166136r(parcel, 5, this.f105959e);
        C40820a.m166141w(parcel, 6, this.f105960f);
        C40820a.m166089F(parcel, 7, this.f105961g);
        C40820a.m166089F(parcel, 8, this.f105962v);
        C40820a.m166089F(parcel, 9, this.f105963w);
        C40820a.m166112b(parcel, a);
    }
}
