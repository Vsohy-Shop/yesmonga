package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.C41016d;

@SafeParcelable.C40812a(creator = "GroundOverlayOptionsCreator")
@SafeParcelable.C40818g({1})
public final class GroundOverlayOptions extends AbstractSafeParcelable {
    @C0359n0
    public static final Parcelable.Creator<GroundOverlayOptions> CREATOR = new C30599q();

    /* renamed from: X */
    public static final float f73015X = -1.0f;
    @SafeParcelable.C40814c(getter = "getWrappedImageDescriptorImplBinder", mo134489id = 2, type = "android.os.IBinder")

    /* renamed from: a */
    public C30573a f73016a;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getLocation", mo134489id = 3)

    /* renamed from: b */
    public LatLng f73017b;
    @SafeParcelable.C40814c(getter = "getWidth", mo134489id = 4)

    /* renamed from: c */
    public float f73018c;
    @SafeParcelable.C40814c(getter = "getHeight", mo134489id = 5)

    /* renamed from: d */
    public float f73019d;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getBounds", mo134489id = 6)

    /* renamed from: e */
    public LatLngBounds f73020e;
    @SafeParcelable.C40814c(getter = "getBearing", mo134489id = 7)

    /* renamed from: f */
    public float f73021f;
    @SafeParcelable.C40814c(getter = "getZIndex", mo134489id = 8)

    /* renamed from: g */
    public float f73022g;
    @SafeParcelable.C40814c(getter = "isVisible", mo134489id = 9)

    /* renamed from: v */
    public boolean f73023v = true;
    @SafeParcelable.C40814c(getter = "getTransparency", mo134489id = 10)

    /* renamed from: w */
    public float f73024w = 0.0f;
    @SafeParcelable.C40814c(getter = "getAnchorU", mo134489id = 11)

    /* renamed from: x */
    public float f73025x = 0.5f;
    @SafeParcelable.C40814c(getter = "getAnchorV", mo134489id = 12)

    /* renamed from: y */
    public float f73026y = 0.5f;
    @SafeParcelable.C40814c(getter = "isClickable", mo134489id = 13)

    /* renamed from: z */
    public boolean f73027z = false;

    public GroundOverlayOptions() {
    }

    @C0363p0
    /* renamed from: A0 */
    public LatLng mo86314A0() {
        return this.f73017b;
    }

    /* renamed from: A1 */
    public boolean mo86315A1() {
        return this.f73023v;
    }

    /* renamed from: C0 */
    public float mo86316C0() {
        return this.f73024w;
    }

    @C0359n0
    /* renamed from: G1 */
    public GroundOverlayOptions mo86317G1(@C0359n0 LatLng latLng, float f) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        if (this.f73020e == null) {
            z = true;
        } else {
            z = false;
        }
        C40843u.m166209s(z, "Position has already been set using positionFromBounds");
        if (latLng != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        C40843u.m166192b(z2, "Location must be specified");
        if (f < 0.0f) {
            z3 = false;
        }
        C40843u.m166192b(z3, "Width must be non-negative");
        mo86330e2(latLng, f, -1.0f);
        return this;
    }

    /* renamed from: K0 */
    public float mo86318K0() {
        return this.f73018c;
    }

    @C0359n0
    /* renamed from: L1 */
    public GroundOverlayOptions mo86319L1(@C0359n0 LatLng latLng, float f, float f2) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4 = true;
        if (this.f73020e == null) {
            z = true;
        } else {
            z = false;
        }
        C40843u.m166209s(z, "Position has already been set using positionFromBounds");
        if (latLng != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        C40843u.m166192b(z2, "Location must be specified");
        if (f >= 0.0f) {
            z3 = true;
        } else {
            z3 = false;
        }
        C40843u.m166192b(z3, "Width must be non-negative");
        if (f2 < 0.0f) {
            z4 = false;
        }
        C40843u.m166192b(z4, "Height must be non-negative");
        mo86330e2(latLng, f, f2);
        return this;
    }

    @C0359n0
    /* renamed from: M */
    public GroundOverlayOptions mo86320M(float f, float f2) {
        this.f73025x = f;
        this.f73026y = f2;
        return this;
    }

    @C0359n0
    /* renamed from: M1 */
    public GroundOverlayOptions mo86321M1(@C0359n0 LatLngBounds latLngBounds) {
        LatLng latLng = this.f73017b;
        C40843u.m166209s(latLng == null, "Position has already been set using position: ".concat(String.valueOf(latLng)));
        this.f73020e = latLngBounds;
        return this;
    }

    /* renamed from: N0 */
    public float mo86322N0() {
        return this.f73022g;
    }

    @C0359n0
    /* renamed from: Q */
    public GroundOverlayOptions mo86323Q(float f) {
        this.f73021f = ((f % 360.0f) + 360.0f) % 360.0f;
        return this;
    }

    @C0359n0
    /* renamed from: W */
    public GroundOverlayOptions mo86324W(boolean z) {
        this.f73027z = z;
        return this;
    }

    /* renamed from: X */
    public float mo86325X() {
        return this.f73025x;
    }

    @C0359n0
    /* renamed from: X1 */
    public GroundOverlayOptions mo86326X1(float f) {
        boolean z = false;
        if (f >= 0.0f && f <= 1.0f) {
            z = true;
        }
        C40843u.m166192b(z, "Transparency must be in the range [0..1]");
        this.f73024w = f;
        return this;
    }

    @C0359n0
    /* renamed from: Y1 */
    public GroundOverlayOptions mo86327Y1(boolean z) {
        this.f73023v = z;
        return this;
    }

    @C0359n0
    /* renamed from: c2 */
    public GroundOverlayOptions mo86328c2(float f) {
        this.f73022g = f;
        return this;
    }

    /* renamed from: e0 */
    public float mo86329e0() {
        return this.f73026y;
    }

    /* renamed from: e2 */
    public final GroundOverlayOptions mo86330e2(LatLng latLng, float f, float f2) {
        this.f73017b = latLng;
        this.f73018c = f;
        this.f73019d = f2;
        return this;
    }

    /* renamed from: f0 */
    public float mo86331f0() {
        return this.f73021f;
    }

    @C0359n0
    /* renamed from: j1 */
    public GroundOverlayOptions mo86332j1(@C0359n0 C30573a aVar) {
        C40843u.m166203m(aVar, "imageDescriptor must not be null");
        this.f73016a = aVar;
        return this;
    }

    /* renamed from: k1 */
    public boolean mo86333k1() {
        return this.f73027z;
    }

    @C0363p0
    /* renamed from: n0 */
    public LatLngBounds mo86334n0() {
        return this.f73020e;
    }

    /* renamed from: p0 */
    public float mo86335p0() {
        return this.f73019d;
    }

    @C0359n0
    /* renamed from: t0 */
    public C30573a mo86336t0() {
        return this.f73016a;
    }

    public void writeToParcel(@C0359n0 Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166085B(parcel, 2, this.f73016a.mo86479a().asBinder(), false);
        C40820a.m166102S(parcel, 3, mo86314A0(), i, false);
        C40820a.m166141w(parcel, 4, mo86318K0());
        C40820a.m166141w(parcel, 5, mo86335p0());
        C40820a.m166102S(parcel, 6, mo86334n0(), i, false);
        C40820a.m166141w(parcel, 7, mo86331f0());
        C40820a.m166141w(parcel, 8, mo86322N0());
        C40820a.m166122g(parcel, 9, mo86315A1());
        C40820a.m166141w(parcel, 10, mo86316C0());
        C40820a.m166141w(parcel, 11, mo86325X());
        C40820a.m166141w(parcel, 12, mo86329e0());
        C40820a.m166122g(parcel, 13, mo86333k1());
        C40820a.m166112b(parcel, a);
    }

    @SafeParcelable.C40813b
    public GroundOverlayOptions(@SafeParcelable.C40816e(mo134492id = 2) IBinder iBinder, @SafeParcelable.C40816e(mo134492id = 3) LatLng latLng, @SafeParcelable.C40816e(mo134492id = 4) float f, @SafeParcelable.C40816e(mo134492id = 5) float f2, @SafeParcelable.C40816e(mo134492id = 6) LatLngBounds latLngBounds, @SafeParcelable.C40816e(mo134492id = 7) float f3, @SafeParcelable.C40816e(mo134492id = 8) float f4, @SafeParcelable.C40816e(mo134492id = 9) boolean z, @SafeParcelable.C40816e(mo134492id = 10) float f5, @SafeParcelable.C40816e(mo134492id = 11) float f6, @SafeParcelable.C40816e(mo134492id = 12) float f7, @SafeParcelable.C40816e(mo134492id = 13) boolean z2) {
        this.f73016a = new C30573a(C41016d.C41017a.m166799H0(iBinder));
        this.f73017b = latLng;
        this.f73018c = f;
        this.f73019d = f2;
        this.f73020e = latLngBounds;
        this.f73021f = f3;
        this.f73022g = f4;
        this.f73023v = z;
        this.f73024w = f5;
        this.f73025x = f6;
        this.f73026y = f7;
        this.f73027z = z2;
    }
}
