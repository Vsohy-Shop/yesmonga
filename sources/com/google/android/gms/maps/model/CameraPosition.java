package com.google.android.gms.maps.model;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.internal.C40808s;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.GoogleMapOptions;

@SafeParcelable.C40812a(creator = "CameraPositionCreator")
@SafeParcelable.C40818g({1})
public final class CameraPosition extends AbstractSafeParcelable implements ReflectedParcelable {
    @C0359n0
    public static final Parcelable.Creator<CameraPosition> CREATOR = new C30596n();
    @C0359n0
    @SafeParcelable.C40814c(mo134489id = 2)

    /* renamed from: a */
    public final LatLng f72990a;
    @SafeParcelable.C40814c(mo134489id = 3)

    /* renamed from: b */
    public final float f72991b;
    @SafeParcelable.C40814c(mo134489id = 4)

    /* renamed from: c */
    public final float f72992c;
    @SafeParcelable.C40814c(mo134489id = 5)

    /* renamed from: d */
    public final float f72993d;

    /* renamed from: com.google.android.gms.maps.model.CameraPosition$a */
    public static final class C30569a {

        /* renamed from: a */
        public LatLng f72994a;

        /* renamed from: b */
        public float f72995b;

        /* renamed from: c */
        public float f72996c;

        /* renamed from: d */
        public float f72997d;

        public C30569a() {
        }

        @C0359n0
        /* renamed from: a */
        public C30569a mo86285a(float f) {
            this.f72997d = f;
            return this;
        }

        @C0359n0
        /* renamed from: b */
        public CameraPosition mo86286b() {
            return new CameraPosition(this.f72994a, this.f72995b, this.f72996c, this.f72997d);
        }

        @C0359n0
        /* renamed from: c */
        public C30569a mo86287c(@C0359n0 LatLng latLng) {
            this.f72994a = (LatLng) C40843u.m166203m(latLng, "location must not be null.");
            return this;
        }

        @C0359n0
        /* renamed from: d */
        public C30569a mo86288d(float f) {
            this.f72996c = f;
            return this;
        }

        @C0359n0
        /* renamed from: e */
        public C30569a mo86289e(float f) {
            this.f72995b = f;
            return this;
        }

        public C30569a(@C0359n0 CameraPosition cameraPosition) {
            CameraPosition cameraPosition2 = (CameraPosition) C40843u.m166203m(cameraPosition, "previous must not be null.");
            this.f72994a = cameraPosition2.f72990a;
            this.f72995b = cameraPosition2.f72991b;
            this.f72996c = cameraPosition2.f72992c;
            this.f72997d = cameraPosition2.f72993d;
        }
    }

    @SafeParcelable.C40813b
    public CameraPosition(@SafeParcelable.C40816e(mo134492id = 2) @C0359n0 LatLng latLng, @SafeParcelable.C40816e(mo134492id = 3) float f, @SafeParcelable.C40816e(mo134492id = 4) float f2, @SafeParcelable.C40816e(mo134492id = 5) float f3) {
        boolean z;
        C40843u.m166203m(latLng, "camera target must not be null.");
        if (f2 < 0.0f || f2 > 90.0f) {
            z = false;
        } else {
            z = true;
        }
        C40843u.m166193c(z, "Tilt needs to be between 0 and 90 inclusive: %s", Float.valueOf(f2));
        this.f72990a = latLng;
        this.f72991b = f;
        this.f72992c = f2 + 0.0f;
        this.f72993d = (((double) f3) <= 0.0d ? (f3 % 360.0f) + 360.0f : f3) % 360.0f;
    }

    @C0359n0
    /* renamed from: M */
    public static C30569a m122995M() {
        return new C30569a();
    }

    @C0359n0
    /* renamed from: Q */
    public static C30569a m122996Q(@C0359n0 CameraPosition cameraPosition) {
        return new C30569a(cameraPosition);
    }

    @C0363p0
    /* renamed from: W */
    public static CameraPosition m122997W(@C0363p0 Context context, @C0363p0 AttributeSet attributeSet) {
        return GoogleMapOptions.m122237f4(context, attributeSet);
    }

    @C0359n0
    /* renamed from: X */
    public static final CameraPosition m122998X(@C0359n0 LatLng latLng, float f) {
        return new CameraPosition(latLng, f, 0.0f, 0.0f);
    }

    public boolean equals(@C0363p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CameraPosition)) {
            return false;
        }
        CameraPosition cameraPosition = (CameraPosition) obj;
        if (this.f72990a.equals(cameraPosition.f72990a) && Float.floatToIntBits(this.f72991b) == Float.floatToIntBits(cameraPosition.f72991b) && Float.floatToIntBits(this.f72992c) == Float.floatToIntBits(cameraPosition.f72992c) && Float.floatToIntBits(this.f72993d) == Float.floatToIntBits(cameraPosition.f72993d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return C40808s.m166011c(this.f72990a, Float.valueOf(this.f72991b), Float.valueOf(this.f72992c), Float.valueOf(this.f72993d));
    }

    @C0359n0
    public String toString() {
        return C40808s.m166012d(this).mo134475a("target", this.f72990a).mo134475a("zoom", Float.valueOf(this.f72991b)).mo134475a("tilt", Float.valueOf(this.f72992c)).mo134475a("bearing", Float.valueOf(this.f72993d)).toString();
    }

    public void writeToParcel(@C0359n0 Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166102S(parcel, 2, this.f72990a, i, false);
        C40820a.m166141w(parcel, 3, this.f72991b);
        C40820a.m166141w(parcel, 4, this.f72992c);
        C40820a.m166141w(parcel, 5, this.f72993d);
        C40820a.m166112b(parcel, a);
    }
}
