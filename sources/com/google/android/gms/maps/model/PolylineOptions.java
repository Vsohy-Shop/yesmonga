package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SafeParcelable.C40812a(creator = "PolylineOptionsCreator")
@SafeParcelable.C40818g({1})
public final class PolylineOptions extends AbstractSafeParcelable {
    @C0359n0
    public static final Parcelable.Creator<PolylineOptions> CREATOR = new C30608z();
    @SafeParcelable.C40814c(getter = "getPoints", mo134489id = 2)

    /* renamed from: a */
    public final List<LatLng> f73069a;
    @SafeParcelable.C40814c(getter = "getWidth", mo134489id = 3)

    /* renamed from: b */
    public float f73070b;
    @SafeParcelable.C40814c(getter = "getColor", mo134489id = 4)

    /* renamed from: c */
    public int f73071c;
    @SafeParcelable.C40814c(getter = "getZIndex", mo134489id = 5)

    /* renamed from: d */
    public float f73072d;
    @SafeParcelable.C40814c(getter = "isVisible", mo134489id = 6)

    /* renamed from: e */
    public boolean f73073e;
    @SafeParcelable.C40814c(getter = "isGeodesic", mo134489id = 7)

    /* renamed from: f */
    public boolean f73074f;
    @SafeParcelable.C40814c(getter = "isClickable", mo134489id = 8)

    /* renamed from: g */
    public boolean f73075g;
    @SafeParcelable.C40814c(getter = "getStartCap", mo134489id = 9)

    /* renamed from: v */
    public Cap f73076v;
    @SafeParcelable.C40814c(getter = "getEndCap", mo134489id = 10)

    /* renamed from: w */
    public Cap f73077w;
    @SafeParcelable.C40814c(getter = "getJointType", mo134489id = 11)

    /* renamed from: x */
    public int f73078x;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getPattern", mo134489id = 12)

    /* renamed from: y */
    public List<PatternItem> f73079y;

    public PolylineOptions() {
        this.f73070b = 10.0f;
        this.f73071c = -16777216;
        this.f73072d = 0.0f;
        this.f73073e = true;
        this.f73074f = false;
        this.f73075g = false;
        this.f73076v = new ButtCap();
        this.f73077w = new ButtCap();
        this.f73078x = 0;
        this.f73079y = null;
        this.f73069a = new ArrayList();
    }

    /* renamed from: A0 */
    public int mo86409A0() {
        return this.f73078x;
    }

    /* renamed from: A1 */
    public boolean mo86410A1() {
        return this.f73075g;
    }

    @C0363p0
    /* renamed from: C0 */
    public List<PatternItem> mo86411C0() {
        return this.f73079y;
    }

    /* renamed from: G1 */
    public boolean mo86412G1() {
        return this.f73074f;
    }

    @C0359n0
    /* renamed from: K0 */
    public List<LatLng> mo86413K0() {
        return this.f73069a;
    }

    /* renamed from: L1 */
    public boolean mo86414L1() {
        return this.f73073e;
    }

    @C0359n0
    /* renamed from: M */
    public PolylineOptions mo86415M(@C0359n0 LatLng latLng) {
        C40843u.m166203m(this.f73069a, "point must not be null.");
        this.f73069a.add(latLng);
        return this;
    }

    @C0359n0
    /* renamed from: M1 */
    public PolylineOptions mo86416M1(int i) {
        this.f73078x = i;
        return this;
    }

    @C0359n0
    /* renamed from: N0 */
    public Cap mo86417N0() {
        return this.f73076v;
    }

    @C0359n0
    /* renamed from: Q */
    public PolylineOptions mo86418Q(@C0359n0 LatLng... latLngArr) {
        C40843u.m166203m(latLngArr, "points must not be null.");
        this.f73069a.addAll(Arrays.asList(latLngArr));
        return this;
    }

    @C0359n0
    /* renamed from: W */
    public PolylineOptions mo86419W(@C0359n0 Iterable<LatLng> iterable) {
        C40843u.m166203m(iterable, "points must not be null.");
        for (LatLng add : iterable) {
            this.f73069a.add(add);
        }
        return this;
    }

    @C0359n0
    /* renamed from: X */
    public PolylineOptions mo86420X(boolean z) {
        this.f73075g = z;
        return this;
    }

    @C0359n0
    /* renamed from: X1 */
    public PolylineOptions mo86421X1(@C0363p0 List<PatternItem> list) {
        this.f73079y = list;
        return this;
    }

    @C0359n0
    /* renamed from: Y1 */
    public PolylineOptions mo86422Y1(@C0359n0 Cap cap) {
        this.f73076v = (Cap) C40843u.m166203m(cap, "startCap must not be null");
        return this;
    }

    @C0359n0
    /* renamed from: c2 */
    public PolylineOptions mo86423c2(boolean z) {
        this.f73073e = z;
        return this;
    }

    @C0359n0
    /* renamed from: e0 */
    public PolylineOptions mo86424e0(int i) {
        this.f73071c = i;
        return this;
    }

    @C0359n0
    /* renamed from: e2 */
    public PolylineOptions mo86425e2(float f) {
        this.f73070b = f;
        return this;
    }

    @C0359n0
    /* renamed from: f0 */
    public PolylineOptions mo86426f0(@C0359n0 Cap cap) {
        this.f73077w = (Cap) C40843u.m166203m(cap, "endCap must not be null");
        return this;
    }

    /* renamed from: j1 */
    public float mo86427j1() {
        return this.f73070b;
    }

    /* renamed from: k1 */
    public float mo86428k1() {
        return this.f73072d;
    }

    @C0359n0
    /* renamed from: l2 */
    public PolylineOptions mo86429l2(float f) {
        this.f73072d = f;
        return this;
    }

    @C0359n0
    /* renamed from: n0 */
    public PolylineOptions mo86430n0(boolean z) {
        this.f73074f = z;
        return this;
    }

    /* renamed from: p0 */
    public int mo86431p0() {
        return this.f73071c;
    }

    @C0359n0
    /* renamed from: t0 */
    public Cap mo86432t0() {
        return this.f73077w;
    }

    public void writeToParcel(@C0359n0 Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166117d0(parcel, 2, mo86413K0(), false);
        C40820a.m166141w(parcel, 3, mo86427j1());
        C40820a.m166089F(parcel, 4, mo86431p0());
        C40820a.m166141w(parcel, 5, mo86428k1());
        C40820a.m166122g(parcel, 6, mo86414L1());
        C40820a.m166122g(parcel, 7, mo86412G1());
        C40820a.m166122g(parcel, 8, mo86410A1());
        C40820a.m166102S(parcel, 9, mo86417N0(), i, false);
        C40820a.m166102S(parcel, 10, mo86432t0(), i, false);
        C40820a.m166089F(parcel, 11, mo86409A0());
        C40820a.m166117d0(parcel, 12, mo86411C0(), false);
        C40820a.m166112b(parcel, a);
    }

    @SafeParcelable.C40813b
    public PolylineOptions(@SafeParcelable.C40816e(mo134492id = 2) List list, @SafeParcelable.C40816e(mo134492id = 3) float f, @SafeParcelable.C40816e(mo134492id = 4) int i, @SafeParcelable.C40816e(mo134492id = 5) float f2, @SafeParcelable.C40816e(mo134492id = 6) boolean z, @SafeParcelable.C40816e(mo134492id = 7) boolean z2, @SafeParcelable.C40816e(mo134492id = 8) boolean z3, @C0363p0 @SafeParcelable.C40816e(mo134492id = 9) Cap cap, @C0363p0 @SafeParcelable.C40816e(mo134492id = 10) Cap cap2, @SafeParcelable.C40816e(mo134492id = 11) int i2, @C0363p0 @SafeParcelable.C40816e(mo134492id = 12) List<PatternItem> list2) {
        this.f73070b = 10.0f;
        this.f73071c = -16777216;
        this.f73072d = 0.0f;
        this.f73073e = true;
        this.f73074f = false;
        this.f73075g = false;
        this.f73076v = new ButtCap();
        this.f73077w = new ButtCap();
        this.f73069a = list;
        this.f73070b = f;
        this.f73071c = i;
        this.f73072d = f2;
        this.f73073e = z;
        this.f73074f = z2;
        this.f73075g = z3;
        if (cap != null) {
            this.f73076v = cap;
        }
        if (cap2 != null) {
            this.f73077w = cap2;
        }
        this.f73078x = i2;
        this.f73079y = list2;
    }
}
