package com.google.android.gms.location;

import android.content.Intent;
import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

@SafeParcelable.C40812a(creator = "LocationResultCreator")
@SafeParcelable.C40818g({1000})
public final class LocationResult extends AbstractSafeParcelable implements ReflectedParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<LocationResult> CREATOR = new C30317b1();

    /* renamed from: b */
    public static final List<Location> f72724b = Collections.emptyList();
    @SafeParcelable.C40814c(defaultValueUnchecked = "LocationResult.DEFAULT_LOCATIONS", getter = "getLocations", mo134489id = 1)

    /* renamed from: a */
    public final List<Location> f72725a;

    @SafeParcelable.C40813b
    public LocationResult(@SafeParcelable.C40816e(mo134492id = 1) List<Location> list) {
        this.f72725a = list;
    }

    @RecentlyNonNull
    /* renamed from: M */
    public static LocationResult m122075M(@RecentlyNonNull List<Location> list) {
        if (list == null) {
            list = f72724b;
        }
        return new LocationResult(list);
    }

    @RecentlyNonNull
    /* renamed from: Q */
    public static LocationResult m122076Q(@RecentlyNonNull Intent intent) {
        if (!m122077e0(intent)) {
            return null;
        }
        return (LocationResult) intent.getParcelableExtra("com.google.android.gms.location.EXTRA_LOCATION_RESULT");
    }

    /* renamed from: e0 */
    public static boolean m122077e0(@RecentlyNonNull Intent intent) {
        if (intent == null) {
            return false;
        }
        return intent.hasExtra("com.google.android.gms.location.EXTRA_LOCATION_RESULT");
    }

    @RecentlyNonNull
    /* renamed from: W */
    public Location mo85593W() {
        int size = this.f72725a.size();
        if (size == 0) {
            return null;
        }
        return this.f72725a.get(size - 1);
    }

    @RecentlyNonNull
    /* renamed from: X */
    public List<Location> mo85594X() {
        return this.f72725a;
    }

    public boolean equals(@RecentlyNonNull Object obj) {
        if (!(obj instanceof LocationResult)) {
            return false;
        }
        LocationResult locationResult = (LocationResult) obj;
        if (locationResult.f72725a.size() != this.f72725a.size()) {
            return false;
        }
        Iterator<Location> it = this.f72725a.iterator();
        for (Location time : locationResult.f72725a) {
            if (it.next().getTime() != time.getTime()) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 17;
        for (Location time : this.f72725a) {
            long time2 = time.getTime();
            i = (i * 31) + ((int) (time2 ^ (time2 >>> 32)));
        }
        return i;
    }

    @RecentlyNonNull
    public String toString() {
        String valueOf = String.valueOf(this.f72725a);
        StringBuilder sb = new StringBuilder(valueOf.length() + 27);
        sb.append("LocationResult[locations: ");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }

    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166117d0(parcel, 1, mo85594X(), false);
        C40820a.m166112b(parcel, a);
    }
}
