package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

@SafeParcelable.C40812a(creator = "CircleOptionsCreator")
@SafeParcelable.C40818g({1})
public final class CircleOptions extends AbstractSafeParcelable {
    @C0359n0
    public static final Parcelable.Creator<CircleOptions> CREATOR = new C30598p();
    @C0363p0
    @SafeParcelable.C40814c(getter = "getCenter", mo134489id = 2)

    /* renamed from: a */
    public LatLng f73002a;
    @SafeParcelable.C40814c(getter = "getRadius", mo134489id = 3)

    /* renamed from: b */
    public double f73003b;
    @SafeParcelable.C40814c(getter = "getStrokeWidth", mo134489id = 4)

    /* renamed from: c */
    public float f73004c;
    @SafeParcelable.C40814c(getter = "getStrokeColor", mo134489id = 5)

    /* renamed from: d */
    public int f73005d;
    @SafeParcelable.C40814c(getter = "getFillColor", mo134489id = 6)

    /* renamed from: e */
    public int f73006e;
    @SafeParcelable.C40814c(getter = "getZIndex", mo134489id = 7)

    /* renamed from: f */
    public float f73007f;
    @SafeParcelable.C40814c(getter = "isVisible", mo134489id = 8)

    /* renamed from: g */
    public boolean f73008g;
    @SafeParcelable.C40814c(getter = "isClickable", mo134489id = 9)

    /* renamed from: v */
    public boolean f73009v;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getStrokePattern", mo134489id = 10)

    /* renamed from: w */
    public List<PatternItem> f73010w;

    public CircleOptions() {
        this.f73002a = null;
        this.f73003b = 0.0d;
        this.f73004c = 10.0f;
        this.f73005d = -16777216;
        this.f73006e = 0;
        this.f73007f = 0.0f;
        this.f73008g = true;
        this.f73009v = false;
        this.f73010w = null;
    }

    /* renamed from: A0 */
    public float mo86294A0() {
        return this.f73007f;
    }

    @C0359n0
    /* renamed from: A1 */
    public CircleOptions mo86295A1(float f) {
        this.f73004c = f;
        return this;
    }

    /* renamed from: C0 */
    public boolean mo86296C0() {
        return this.f73009v;
    }

    @C0359n0
    /* renamed from: G1 */
    public CircleOptions mo86297G1(boolean z) {
        this.f73008g = z;
        return this;
    }

    /* renamed from: K0 */
    public boolean mo86298K0() {
        return this.f73008g;
    }

    @C0359n0
    /* renamed from: L1 */
    public CircleOptions mo86299L1(float f) {
        this.f73007f = f;
        return this;
    }

    @C0359n0
    /* renamed from: M */
    public CircleOptions mo86300M(@C0359n0 LatLng latLng) {
        C40843u.m166203m(latLng, "center must not be null.");
        this.f73002a = latLng;
        return this;
    }

    @C0359n0
    /* renamed from: N0 */
    public CircleOptions mo86301N0(double d) {
        this.f73003b = d;
        return this;
    }

    @C0359n0
    /* renamed from: Q */
    public CircleOptions mo86302Q(boolean z) {
        this.f73009v = z;
        return this;
    }

    @C0359n0
    /* renamed from: W */
    public CircleOptions mo86303W(int i) {
        this.f73006e = i;
        return this;
    }

    @C0363p0
    /* renamed from: X */
    public LatLng mo86304X() {
        return this.f73002a;
    }

    /* renamed from: e0 */
    public int mo86305e0() {
        return this.f73006e;
    }

    /* renamed from: f0 */
    public double mo86306f0() {
        return this.f73003b;
    }

    @C0359n0
    /* renamed from: j1 */
    public CircleOptions mo86307j1(int i) {
        this.f73005d = i;
        return this;
    }

    @C0359n0
    /* renamed from: k1 */
    public CircleOptions mo86308k1(@C0363p0 List<PatternItem> list) {
        this.f73010w = list;
        return this;
    }

    /* renamed from: n0 */
    public int mo86309n0() {
        return this.f73005d;
    }

    @C0363p0
    /* renamed from: p0 */
    public List<PatternItem> mo86310p0() {
        return this.f73010w;
    }

    /* renamed from: t0 */
    public float mo86311t0() {
        return this.f73004c;
    }

    public final void writeToParcel(@C0359n0 Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166102S(parcel, 2, mo86304X(), i, false);
        C40820a.m166136r(parcel, 3, mo86306f0());
        C40820a.m166141w(parcel, 4, mo86311t0());
        C40820a.m166089F(parcel, 5, mo86309n0());
        C40820a.m166089F(parcel, 6, mo86305e0());
        C40820a.m166141w(parcel, 7, mo86294A0());
        C40820a.m166122g(parcel, 8, mo86298K0());
        C40820a.m166122g(parcel, 9, mo86296C0());
        C40820a.m166117d0(parcel, 10, mo86310p0(), false);
        C40820a.m166112b(parcel, a);
    }

    @SafeParcelable.C40813b
    public CircleOptions(@SafeParcelable.C40816e(mo134492id = 2) LatLng latLng, @SafeParcelable.C40816e(mo134492id = 3) double d, @SafeParcelable.C40816e(mo134492id = 4) float f, @SafeParcelable.C40816e(mo134492id = 5) int i, @SafeParcelable.C40816e(mo134492id = 6) int i2, @SafeParcelable.C40816e(mo134492id = 7) float f2, @SafeParcelable.C40816e(mo134492id = 8) boolean z, @SafeParcelable.C40816e(mo134492id = 9) boolean z2, @C0363p0 @SafeParcelable.C40816e(mo134492id = 10) List<PatternItem> list) {
        this.f73002a = latLng;
        this.f73003b = d;
        this.f73004c = f;
        this.f73005d = i;
        this.f73006e = i2;
        this.f73007f = f2;
        this.f73008g = z;
        this.f73009v = z2;
        this.f73010w = list;
    }
}
