package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.internal.C40808s;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.C40812a(creator = "StreetViewPanoramaOrientationCreator")
@SafeParcelable.C40818g({1})
public class StreetViewPanoramaOrientation extends AbstractSafeParcelable {
    @C0359n0
    public static final Parcelable.Creator<StreetViewPanoramaOrientation> CREATOR = new C30580d0();
    @SafeParcelable.C40814c(mo134489id = 2)

    /* renamed from: a */
    public final float f73092a;
    @SafeParcelable.C40814c(mo134489id = 3)

    /* renamed from: b */
    public final float f73093b;

    /* renamed from: com.google.android.gms.maps.model.StreetViewPanoramaOrientation$a */
    public static final class C30572a {

        /* renamed from: a */
        public float f73094a;

        /* renamed from: b */
        public float f73095b;

        public C30572a() {
        }

        @C0359n0
        /* renamed from: a */
        public C30572a mo86456a(float f) {
            this.f73094a = f;
            return this;
        }

        @C0359n0
        /* renamed from: b */
        public StreetViewPanoramaOrientation mo86457b() {
            return new StreetViewPanoramaOrientation(this.f73095b, this.f73094a);
        }

        @C0359n0
        /* renamed from: c */
        public C30572a mo86458c(float f) {
            this.f73095b = f;
            return this;
        }

        public C30572a(@C0359n0 StreetViewPanoramaOrientation streetViewPanoramaOrientation) {
            C40843u.m166203m(streetViewPanoramaOrientation, "StreetViewPanoramaOrientation must not be null.");
            this.f73094a = streetViewPanoramaOrientation.f73093b;
            this.f73095b = streetViewPanoramaOrientation.f73092a;
        }
    }

    @SafeParcelable.C40813b
    public StreetViewPanoramaOrientation(@SafeParcelable.C40816e(mo134492id = 2) float f, @SafeParcelable.C40816e(mo134492id = 3) float f2) {
        boolean z = false;
        if (f >= -90.0f && f <= 90.0f) {
            z = true;
        }
        StringBuilder sb = new StringBuilder(62);
        sb.append("Tilt needs to be between -90 and 90 inclusive: ");
        sb.append(f);
        C40843u.m166192b(z, sb.toString());
        this.f73092a = f + 0.0f;
        this.f73093b = (((double) f2) <= 0.0d ? (f2 % 360.0f) + 360.0f : f2) % 360.0f;
    }

    @C0359n0
    /* renamed from: M */
    public static C30572a m123138M() {
        return new C30572a();
    }

    @C0359n0
    /* renamed from: Q */
    public static C30572a m123139Q(@C0359n0 StreetViewPanoramaOrientation streetViewPanoramaOrientation) {
        return new C30572a(streetViewPanoramaOrientation);
    }

    public boolean equals(@C0363p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreetViewPanoramaOrientation)) {
            return false;
        }
        StreetViewPanoramaOrientation streetViewPanoramaOrientation = (StreetViewPanoramaOrientation) obj;
        if (Float.floatToIntBits(this.f73092a) == Float.floatToIntBits(streetViewPanoramaOrientation.f73092a) && Float.floatToIntBits(this.f73093b) == Float.floatToIntBits(streetViewPanoramaOrientation.f73093b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return C40808s.m166011c(Float.valueOf(this.f73092a), Float.valueOf(this.f73093b));
    }

    @C0359n0
    public String toString() {
        return C40808s.m166012d(this).mo134475a("tilt", Float.valueOf(this.f73092a)).mo134475a("bearing", Float.valueOf(this.f73093b)).toString();
    }

    public void writeToParcel(@C0359n0 Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166141w(parcel, 2, this.f73092a);
        C40820a.m166141w(parcel, 3, this.f73093b);
        C40820a.m166112b(parcel, a);
    }
}
