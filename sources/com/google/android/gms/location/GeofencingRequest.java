package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.C0363p0;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.location.zzbe;
import java.util.ArrayList;
import java.util.List;

@SafeParcelable.C40812a(creator = "GeofencingRequestCreator")
@SafeParcelable.C40818g({1000})
public class GeofencingRequest extends AbstractSafeParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<GeofencingRequest> CREATOR = new C30370o0();

    /* renamed from: e */
    public static final int f72696e = 1;

    /* renamed from: f */
    public static final int f72697f = 2;

    /* renamed from: g */
    public static final int f72698g = 4;
    @SafeParcelable.C40814c(getter = "getParcelableGeofences", mo134489id = 1)

    /* renamed from: a */
    public final List<zzbe> f72699a;
    @SafeParcelable.C40814c(getter = "getInitialTrigger", mo134489id = 2)
    @C30309b

    /* renamed from: b */
    public final int f72700b;
    @SafeParcelable.C40814c(defaultValue = "", getter = "getTag", mo134489id = 3)

    /* renamed from: c */
    public final String f72701c;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getContextAttributionTag", mo134489id = 4)

    /* renamed from: d */
    public final String f72702d;

    /* renamed from: com.google.android.gms.location.GeofencingRequest$a */
    public static final class C30308a {

        /* renamed from: a */
        public final List<zzbe> f72703a = new ArrayList();
        @C30309b

        /* renamed from: b */
        public int f72704b = 5;

        /* renamed from: c */
        public String f72705c = "";

        @RecentlyNonNull
        /* renamed from: a */
        public C30308a mo85562a(@RecentlyNonNull C30331f fVar) {
            C40843u.m166203m(fVar, "geofence can't be null.");
            C40843u.m166192b(fVar instanceof zzbe, "Geofence must be created using Geofence.Builder.");
            this.f72703a.add((zzbe) fVar);
            return this;
        }

        @RecentlyNonNull
        /* renamed from: b */
        public C30308a mo85563b(@RecentlyNonNull List<C30331f> list) {
            if (list != null && !list.isEmpty()) {
                for (C30331f next : list) {
                    if (next != null) {
                        mo85562a(next);
                    }
                }
            }
            return this;
        }

        @RecentlyNonNull
        /* renamed from: c */
        public GeofencingRequest mo85564c() {
            C40843u.m166192b(!this.f72703a.isEmpty(), "No geofence has been added to this request.");
            return new GeofencingRequest(this.f72703a, this.f72704b, this.f72705c, (String) null);
        }

        @RecentlyNonNull
        /* renamed from: d */
        public C30308a mo85565d(@C30309b int i) {
            this.f72704b = i & 7;
            return this;
        }
    }

    /* renamed from: com.google.android.gms.location.GeofencingRequest$b */
    public @interface C30309b {
    }

    @SafeParcelable.C40813b
    public GeofencingRequest(@SafeParcelable.C40816e(mo134492id = 1) List<zzbe> list, @SafeParcelable.C40816e(mo134492id = 2) @C30309b int i, @SafeParcelable.C40816e(mo134492id = 3) String str, @C0363p0 @SafeParcelable.C40816e(mo134492id = 4) String str2) {
        this.f72699a = list;
        this.f72700b = i;
        this.f72701c = str;
        this.f72702d = str2;
    }

    @RecentlyNonNull
    /* renamed from: M */
    public List<C30331f> mo85557M() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f72699a);
        return arrayList;
    }

    @C30309b
    /* renamed from: Q */
    public int mo85558Q() {
        return this.f72700b;
    }

    @RecentlyNonNull
    /* renamed from: W */
    public final GeofencingRequest mo85559W(@C0363p0 String str) {
        return new GeofencingRequest(this.f72699a, this.f72700b, this.f72701c, str);
    }

    @RecentlyNonNull
    public String toString() {
        return "GeofencingRequest[geofences=" + this.f72699a + ", initialTrigger=" + this.f72700b + ", tag=" + this.f72701c + ", attributionTag=" + this.f72702d + "]";
    }

    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166117d0(parcel, 1, this.f72699a, false);
        C40820a.m166089F(parcel, 2, mo85558Q());
        C40820a.m166108Y(parcel, 3, this.f72701c, false);
        C40820a.m166108Y(parcel, 4, this.f72702d, false);
        C40820a.m166112b(parcel, a);
    }
}
