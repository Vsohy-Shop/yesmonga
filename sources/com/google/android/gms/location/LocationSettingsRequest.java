package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.C0363p0;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@SafeParcelable.C40812a(creator = "LocationSettingsRequestCreator")
@SafeParcelable.C40818g({1000})
public final class LocationSettingsRequest extends AbstractSafeParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<LocationSettingsRequest> CREATOR = new C30336f1();
    @SafeParcelable.C40814c(getter = "getLocationRequests", mo134489id = 1)

    /* renamed from: a */
    public final List<LocationRequest> f72726a;
    @SafeParcelable.C40814c(defaultValue = "false", getter = "alwaysShow", mo134489id = 2)

    /* renamed from: b */
    public final boolean f72727b;
    @SafeParcelable.C40814c(getter = "needBle", mo134489id = 3)

    /* renamed from: c */
    public final boolean f72728c;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getConfiguration", mo134489id = 5)

    /* renamed from: d */
    public zzbj f72729d;

    /* renamed from: com.google.android.gms.location.LocationSettingsRequest$a */
    public static final class C30310a {

        /* renamed from: a */
        public final ArrayList<LocationRequest> f72730a = new ArrayList<>();

        /* renamed from: b */
        public boolean f72731b = false;

        /* renamed from: c */
        public boolean f72732c = false;

        @RecentlyNonNull
        /* renamed from: a */
        public C30310a mo85600a(@RecentlyNonNull Collection<LocationRequest> collection) {
            for (LocationRequest next : collection) {
                if (next != null) {
                    this.f72730a.add(next);
                }
            }
            return this;
        }

        @RecentlyNonNull
        /* renamed from: b */
        public C30310a mo85601b(@RecentlyNonNull LocationRequest locationRequest) {
            if (locationRequest != null) {
                this.f72730a.add(locationRequest);
            }
            return this;
        }

        @RecentlyNonNull
        /* renamed from: c */
        public LocationSettingsRequest mo85602c() {
            return new LocationSettingsRequest(this.f72730a, this.f72731b, this.f72732c, (zzbj) null);
        }

        @RecentlyNonNull
        /* renamed from: d */
        public C30310a mo85603d(boolean z) {
            this.f72731b = z;
            return this;
        }

        @RecentlyNonNull
        /* renamed from: e */
        public C30310a mo85604e(boolean z) {
            this.f72732c = z;
            return this;
        }
    }

    @SafeParcelable.C40813b
    public LocationSettingsRequest(@SafeParcelable.C40816e(mo134492id = 1) List<LocationRequest> list, @SafeParcelable.C40816e(mo134492id = 2) boolean z, @SafeParcelable.C40816e(mo134492id = 3) boolean z2, @C0363p0 @SafeParcelable.C40816e(mo134492id = 5) zzbj zzbj) {
        this.f72726a = list;
        this.f72727b = z;
        this.f72728c = z2;
        this.f72729d = zzbj;
    }

    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166117d0(parcel, 1, Collections.unmodifiableList(this.f72726a), false);
        C40820a.m166122g(parcel, 2, this.f72727b);
        C40820a.m166122g(parcel, 3, this.f72728c);
        C40820a.m166102S(parcel, 5, this.f72729d, i, false);
        C40820a.m166112b(parcel, a);
    }
}
