package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.internal.C40808s;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.model.StreetViewPanoramaOrientation;

@SafeParcelable.C40812a(creator = "StreetViewPanoramaCameraCreator")
@SafeParcelable.C40818g({1})
public class StreetViewPanoramaCamera extends AbstractSafeParcelable implements ReflectedParcelable {
    @C0359n0
    public static final Parcelable.Creator<StreetViewPanoramaCamera> CREATOR = new C30574a0();
    @SafeParcelable.C40814c(mo134489id = 2)

    /* renamed from: a */
    public final float f73080a;
    @SafeParcelable.C40814c(mo134489id = 3)

    /* renamed from: b */
    public final float f73081b;
    @SafeParcelable.C40814c(mo134489id = 4)

    /* renamed from: c */
    public final float f73082c;

    /* renamed from: d */
    public final StreetViewPanoramaOrientation f73083d;

    /* renamed from: com.google.android.gms.maps.model.StreetViewPanoramaCamera$a */
    public static final class C30571a {

        /* renamed from: a */
        public float f73084a;

        /* renamed from: b */
        public float f73085b;

        /* renamed from: c */
        public float f73086c;

        public C30571a() {
        }

        @C0359n0
        /* renamed from: a */
        public C30571a mo86439a(float f) {
            this.f73084a = f;
            return this;
        }

        @C0359n0
        /* renamed from: b */
        public StreetViewPanoramaCamera mo86440b() {
            return new StreetViewPanoramaCamera(this.f73086c, this.f73085b, this.f73084a);
        }

        @C0359n0
        /* renamed from: c */
        public C30571a mo86441c(@C0359n0 StreetViewPanoramaOrientation streetViewPanoramaOrientation) {
            C40843u.m166203m(streetViewPanoramaOrientation, "orientation must not be null.");
            this.f73085b = streetViewPanoramaOrientation.f73092a;
            this.f73084a = streetViewPanoramaOrientation.f73093b;
            return this;
        }

        @C0359n0
        /* renamed from: d */
        public C30571a mo86442d(float f) {
            this.f73085b = f;
            return this;
        }

        @C0359n0
        /* renamed from: e */
        public C30571a mo86443e(float f) {
            this.f73086c = f;
            return this;
        }

        public C30571a(@C0359n0 StreetViewPanoramaCamera streetViewPanoramaCamera) {
            C40843u.m166203m(streetViewPanoramaCamera, "StreetViewPanoramaCamera must not be null.");
            this.f73086c = streetViewPanoramaCamera.f73080a;
            this.f73084a = streetViewPanoramaCamera.f73082c;
            this.f73085b = streetViewPanoramaCamera.f73081b;
        }
    }

    @SafeParcelable.C40813b
    public StreetViewPanoramaCamera(@SafeParcelable.C40816e(mo134492id = 2) float f, @SafeParcelable.C40816e(mo134492id = 3) float f2, @SafeParcelable.C40816e(mo134492id = 4) float f3) {
        float f4;
        boolean z = false;
        if (f2 >= -90.0f && f2 <= 90.0f) {
            z = true;
        }
        StringBuilder sb = new StringBuilder(62);
        sb.append("Tilt needs to be between -90 and 90 inclusive: ");
        sb.append(f2);
        C40843u.m166192b(z, sb.toString());
        this.f73080a = ((double) f) <= 0.0d ? 0.0f : f;
        this.f73081b = 0.0f + f2;
        if (((double) f3) <= 0.0d) {
            f4 = (f3 % 360.0f) + 360.0f;
        } else {
            f4 = f3;
        }
        this.f73082c = f4 % 360.0f;
        StreetViewPanoramaOrientation.C30572a aVar = new StreetViewPanoramaOrientation.C30572a();
        aVar.mo86458c(f2);
        aVar.mo86456a(f3);
        this.f73083d = aVar.mo86457b();
    }

    @C0359n0
    /* renamed from: M */
    public static C30571a m123130M() {
        return new C30571a();
    }

    @C0359n0
    /* renamed from: Q */
    public static C30571a m123131Q(@C0359n0 StreetViewPanoramaCamera streetViewPanoramaCamera) {
        return new C30571a(streetViewPanoramaCamera);
    }

    @C0359n0
    /* renamed from: W */
    public StreetViewPanoramaOrientation mo86434W() {
        return this.f73083d;
    }

    public boolean equals(@C0363p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreetViewPanoramaCamera)) {
            return false;
        }
        StreetViewPanoramaCamera streetViewPanoramaCamera = (StreetViewPanoramaCamera) obj;
        if (Float.floatToIntBits(this.f73080a) == Float.floatToIntBits(streetViewPanoramaCamera.f73080a) && Float.floatToIntBits(this.f73081b) == Float.floatToIntBits(streetViewPanoramaCamera.f73081b) && Float.floatToIntBits(this.f73082c) == Float.floatToIntBits(streetViewPanoramaCamera.f73082c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return C40808s.m166011c(Float.valueOf(this.f73080a), Float.valueOf(this.f73081b), Float.valueOf(this.f73082c));
    }

    @C0359n0
    public String toString() {
        return C40808s.m166012d(this).mo134475a("zoom", Float.valueOf(this.f73080a)).mo134475a("tilt", Float.valueOf(this.f73081b)).mo134475a("bearing", Float.valueOf(this.f73082c)).toString();
    }

    public void writeToParcel(@C0359n0 Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166141w(parcel, 2, this.f73080a);
        C40820a.m166141w(parcel, 3, this.f73081b);
        C40820a.m166141w(parcel, 4, this.f73082c);
        C40820a.m166112b(parcel, a);
    }
}
