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
import java.util.Comparator;
import kotlinx.coroutines.debug.internal.C11788d;

@SafeParcelable.C40812a(creator = "DetectedActivityCreator")
@SafeParcelable.C40818g({1000})
public class DetectedActivity extends AbstractSafeParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<DetectedActivity> CREATOR = new C30337f2();

    /* renamed from: c */
    public static final int f72685c = 0;

    /* renamed from: d */
    public static final int f72686d = 1;

    /* renamed from: e */
    public static final int f72687e = 2;

    /* renamed from: f */
    public static final int f72688f = 3;

    /* renamed from: g */
    public static final int f72689g = 4;

    /* renamed from: v */
    public static final int f72690v = 5;

    /* renamed from: w */
    public static final int f72691w = 7;

    /* renamed from: x */
    public static final int f72692x = 8;
    @RecentlyNonNull

    /* renamed from: y */
    public static final Comparator<DetectedActivity> f72693y = new C30330e2();
    @SafeParcelable.C40814c(mo134489id = 1)

    /* renamed from: a */
    public int f72694a;
    @SafeParcelable.C40814c(mo134489id = 2)

    /* renamed from: b */
    public int f72695b;

    @SafeParcelable.C40813b
    public DetectedActivity(@SafeParcelable.C40816e(mo134492id = 1) int i, @SafeParcelable.C40816e(mo134492id = 2) int i2) {
        this.f72694a = i;
        this.f72695b = i2;
    }

    /* renamed from: M */
    public int mo85551M() {
        return this.f72695b;
    }

    /* renamed from: Q */
    public int mo85552Q() {
        int i = this.f72694a;
        if (i > 22 || i < 0) {
            return 4;
        }
        return i;
    }

    @C40858y
    public final boolean equals(@C0363p0 Object obj) {
        if (obj instanceof DetectedActivity) {
            DetectedActivity detectedActivity = (DetectedActivity) obj;
            if (this.f72694a == detectedActivity.f72694a && this.f72695b == detectedActivity.f72695b) {
                return true;
            }
            return false;
        }
        return false;
    }

    @C40858y
    public final int hashCode() {
        return C40808s.m166011c(Integer.valueOf(this.f72694a), Integer.valueOf(this.f72695b));
    }

    @RecentlyNonNull
    public String toString() {
        String str;
        int Q = mo85552Q();
        if (Q == 0) {
            str = "IN_VEHICLE";
        } else if (Q == 1) {
            str = "ON_BICYCLE";
        } else if (Q == 2) {
            str = "ON_FOOT";
        } else if (Q == 3) {
            str = "STILL";
        } else if (Q == 4) {
            str = "UNKNOWN";
        } else if (Q == 5) {
            str = "TILTING";
        } else if (Q == 7) {
            str = "WALKING";
        } else if (Q == 8) {
            str = C11788d.f29252b;
        } else if (Q == 16) {
            str = "IN_ROAD_VEHICLE";
        } else if (Q != 17) {
            str = Integer.toString(Q);
        } else {
            str = "IN_RAIL_VEHICLE";
        }
        int i = this.f72695b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 48);
        sb.append("DetectedActivity [type=");
        sb.append(str);
        sb.append(", confidence=");
        sb.append(i);
        sb.append("]");
        return sb.toString();
    }

    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        C40843u.m166202l(parcel);
        int a = C40820a.m166110a(parcel);
        C40820a.m166089F(parcel, 1, this.f72694a);
        C40820a.m166089F(parcel, 2, this.f72695b);
        C40820a.m166112b(parcel, a);
    }
}
