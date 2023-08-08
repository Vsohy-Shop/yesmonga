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

@SafeParcelable.C40812a(creator = "PolygonOptionsCreator")
@SafeParcelable.C40818g({1})
public final class PolygonOptions extends AbstractSafeParcelable {
    @C0359n0
    public static final Parcelable.Creator<PolygonOptions> CREATOR = new C30607y();
    @SafeParcelable.C40814c(getter = "getPoints", mo134489id = 2)

    /* renamed from: a */
    public final List<LatLng> f73058a;
    @SafeParcelable.C40814c(getter = "getHolesForParcel", mo134489id = 3, type = "java.util.List")

    /* renamed from: b */
    public final List<List<LatLng>> f73059b;
    @SafeParcelable.C40814c(getter = "getStrokeWidth", mo134489id = 4)

    /* renamed from: c */
    public float f73060c;
    @SafeParcelable.C40814c(getter = "getStrokeColor", mo134489id = 5)

    /* renamed from: d */
    public int f73061d;
    @SafeParcelable.C40814c(getter = "getFillColor", mo134489id = 6)

    /* renamed from: e */
    public int f73062e;
    @SafeParcelable.C40814c(getter = "getZIndex", mo134489id = 7)

    /* renamed from: f */
    public float f73063f;
    @SafeParcelable.C40814c(getter = "isVisible", mo134489id = 8)

    /* renamed from: g */
    public boolean f73064g;
    @SafeParcelable.C40814c(getter = "isGeodesic", mo134489id = 9)

    /* renamed from: v */
    public boolean f73065v;
    @SafeParcelable.C40814c(getter = "isClickable", mo134489id = 10)

    /* renamed from: w */
    public boolean f73066w;
    @SafeParcelable.C40814c(getter = "getStrokeJointType", mo134489id = 11)

    /* renamed from: x */
    public int f73067x;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getStrokePattern", mo134489id = 12)

    /* renamed from: y */
    public List<PatternItem> f73068y;

    public PolygonOptions() {
        this.f73060c = 10.0f;
        this.f73061d = -16777216;
        this.f73062e = 0;
        this.f73063f = 0.0f;
        this.f73064g = true;
        this.f73065v = false;
        this.f73066w = false;
        this.f73067x = 0;
        this.f73068y = null;
        this.f73058a = new ArrayList();
        this.f73059b = new ArrayList();
    }

    @C0359n0
    /* renamed from: A0 */
    public List<LatLng> mo86384A0() {
        return this.f73058a;
    }

    /* renamed from: A1 */
    public boolean mo86385A1() {
        return this.f73066w;
    }

    /* renamed from: C0 */
    public int mo86386C0() {
        return this.f73061d;
    }

    /* renamed from: G1 */
    public boolean mo86387G1() {
        return this.f73065v;
    }

    /* renamed from: K0 */
    public int mo86388K0() {
        return this.f73067x;
    }

    /* renamed from: L1 */
    public boolean mo86389L1() {
        return this.f73064g;
    }

    @C0359n0
    /* renamed from: M */
    public PolygonOptions mo86390M(@C0359n0 LatLng latLng) {
        C40843u.m166203m(latLng, "point must not be null.");
        this.f73058a.add(latLng);
        return this;
    }

    @C0359n0
    /* renamed from: M1 */
    public PolygonOptions mo86391M1(int i) {
        this.f73061d = i;
        return this;
    }

    @C0363p0
    /* renamed from: N0 */
    public List<PatternItem> mo86392N0() {
        return this.f73068y;
    }

    @C0359n0
    /* renamed from: Q */
    public PolygonOptions mo86393Q(@C0359n0 LatLng... latLngArr) {
        C40843u.m166203m(latLngArr, "points must not be null.");
        this.f73058a.addAll(Arrays.asList(latLngArr));
        return this;
    }

    @C0359n0
    /* renamed from: W */
    public PolygonOptions mo86394W(@C0359n0 Iterable<LatLng> iterable) {
        C40843u.m166203m(iterable, "points must not be null.");
        for (LatLng add : iterable) {
            this.f73058a.add(add);
        }
        return this;
    }

    @C0359n0
    /* renamed from: X */
    public PolygonOptions mo86395X(@C0359n0 Iterable<LatLng> iterable) {
        C40843u.m166203m(iterable, "points must not be null.");
        ArrayList arrayList = new ArrayList();
        for (LatLng add : iterable) {
            arrayList.add(add);
        }
        this.f73059b.add(arrayList);
        return this;
    }

    @C0359n0
    /* renamed from: X1 */
    public PolygonOptions mo86396X1(int i) {
        this.f73067x = i;
        return this;
    }

    @C0359n0
    /* renamed from: Y1 */
    public PolygonOptions mo86397Y1(@C0363p0 List<PatternItem> list) {
        this.f73068y = list;
        return this;
    }

    @C0359n0
    /* renamed from: c2 */
    public PolygonOptions mo86398c2(float f) {
        this.f73060c = f;
        return this;
    }

    @C0359n0
    /* renamed from: e0 */
    public PolygonOptions mo86399e0(boolean z) {
        this.f73066w = z;
        return this;
    }

    @C0359n0
    /* renamed from: e2 */
    public PolygonOptions mo86400e2(boolean z) {
        this.f73064g = z;
        return this;
    }

    @C0359n0
    /* renamed from: f0 */
    public PolygonOptions mo86401f0(int i) {
        this.f73062e = i;
        return this;
    }

    /* renamed from: j1 */
    public float mo86402j1() {
        return this.f73060c;
    }

    /* renamed from: k1 */
    public float mo86403k1() {
        return this.f73063f;
    }

    @C0359n0
    /* renamed from: l2 */
    public PolygonOptions mo86404l2(float f) {
        this.f73063f = f;
        return this;
    }

    @C0359n0
    /* renamed from: n0 */
    public PolygonOptions mo86405n0(boolean z) {
        this.f73065v = z;
        return this;
    }

    /* renamed from: p0 */
    public int mo86406p0() {
        return this.f73062e;
    }

    @C0359n0
    /* renamed from: t0 */
    public List<List<LatLng>> mo86407t0() {
        return this.f73059b;
    }

    public void writeToParcel(@C0359n0 Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166117d0(parcel, 2, mo86384A0(), false);
        C40820a.m166093J(parcel, 3, this.f73059b, false);
        C40820a.m166141w(parcel, 4, mo86402j1());
        C40820a.m166089F(parcel, 5, mo86386C0());
        C40820a.m166089F(parcel, 6, mo86406p0());
        C40820a.m166141w(parcel, 7, mo86403k1());
        C40820a.m166122g(parcel, 8, mo86389L1());
        C40820a.m166122g(parcel, 9, mo86387G1());
        C40820a.m166122g(parcel, 10, mo86385A1());
        C40820a.m166089F(parcel, 11, mo86388K0());
        C40820a.m166117d0(parcel, 12, mo86392N0(), false);
        C40820a.m166112b(parcel, a);
    }

    @SafeParcelable.C40813b
    public PolygonOptions(@SafeParcelable.C40816e(mo134492id = 2) List<LatLng> list, @SafeParcelable.C40816e(mo134492id = 3) List list2, @SafeParcelable.C40816e(mo134492id = 4) float f, @SafeParcelable.C40816e(mo134492id = 5) int i, @SafeParcelable.C40816e(mo134492id = 6) int i2, @SafeParcelable.C40816e(mo134492id = 7) float f2, @SafeParcelable.C40816e(mo134492id = 8) boolean z, @SafeParcelable.C40816e(mo134492id = 9) boolean z2, @SafeParcelable.C40816e(mo134492id = 10) boolean z3, @SafeParcelable.C40816e(mo134492id = 11) int i3, @C0363p0 @SafeParcelable.C40816e(mo134492id = 12) List<PatternItem> list3) {
        this.f73058a = list;
        this.f73059b = list2;
        this.f73060c = f;
        this.f73061d = i;
        this.f73062e = i2;
        this.f73063f = f2;
        this.f73064g = z;
        this.f73065v = z2;
        this.f73066w = z3;
        this.f73067x = i3;
        this.f73068y = list3;
    }
}
