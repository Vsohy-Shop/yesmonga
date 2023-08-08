package com.google.android.gms.maps;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.internal.C40808s;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.internal.C30507m;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import com.google.android.gms.maps.model.StreetViewSource;

@SafeParcelable.C40812a(creator = "StreetViewPanoramaOptionsCreator")
@SafeParcelable.C40818g({1})
public final class StreetViewPanoramaOptions extends AbstractSafeParcelable implements ReflectedParcelable {
    @C0359n0
    public static final Parcelable.Creator<StreetViewPanoramaOptions> CREATOR = new C30445e0();
    @C0363p0
    @SafeParcelable.C40814c(getter = "getStreetViewPanoramaCamera", mo134489id = 2)

    /* renamed from: a */
    public StreetViewPanoramaCamera f72918a;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getPanoramaId", mo134489id = 3)

    /* renamed from: b */
    public String f72919b;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getPosition", mo134489id = 4)

    /* renamed from: c */
    public LatLng f72920c;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getRadius", mo134489id = 5)

    /* renamed from: d */
    public Integer f72921d;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getUserNavigationEnabledForParcel", mo134489id = 6, type = "byte")

    /* renamed from: e */
    public Boolean f72922e;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getZoomGesturesEnabledForParcel", mo134489id = 7, type = "byte")

    /* renamed from: f */
    public Boolean f72923f;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getPanningGesturesEnabledForParcel", mo134489id = 8, type = "byte")

    /* renamed from: g */
    public Boolean f72924g;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getStreetNamesEnabledForParcel", mo134489id = 9, type = "byte")

    /* renamed from: v */
    public Boolean f72925v;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getUseViewLifecycleInFragmentForParcel", mo134489id = 10, type = "byte")

    /* renamed from: w */
    public Boolean f72926w;
    @SafeParcelable.C40814c(getter = "getSource", mo134489id = 11)

    /* renamed from: x */
    public StreetViewSource f72927x = StreetViewSource.f73096b;

    public StreetViewPanoramaOptions() {
        Boolean bool = Boolean.TRUE;
        this.f72922e = bool;
        this.f72923f = bool;
        this.f72924g = bool;
        this.f72925v = bool;
    }

    @C0363p0
    /* renamed from: A0 */
    public Boolean mo85830A0() {
        return this.f72923f;
    }

    @C0359n0
    /* renamed from: A1 */
    public StreetViewPanoramaOptions mo85831A1(@C0363p0 LatLng latLng, @C0363p0 Integer num) {
        this.f72920c = latLng;
        this.f72921d = num;
        return this;
    }

    @C0359n0
    /* renamed from: C0 */
    public StreetViewPanoramaOptions mo85832C0(boolean z) {
        this.f72924g = Boolean.valueOf(z);
        return this;
    }

    @C0359n0
    /* renamed from: G1 */
    public StreetViewPanoramaOptions mo85833G1(@C0363p0 LatLng latLng, @C0363p0 Integer num, @C0359n0 StreetViewSource streetViewSource) {
        this.f72920c = latLng;
        this.f72921d = num;
        this.f72927x = streetViewSource;
        return this;
    }

    @C0359n0
    /* renamed from: K0 */
    public StreetViewPanoramaOptions mo85834K0(@C0363p0 StreetViewPanoramaCamera streetViewPanoramaCamera) {
        this.f72918a = streetViewPanoramaCamera;
        return this;
    }

    @C0359n0
    /* renamed from: L1 */
    public StreetViewPanoramaOptions mo85835L1(boolean z) {
        this.f72925v = Boolean.valueOf(z);
        return this;
    }

    @C0363p0
    /* renamed from: M */
    public Boolean mo85836M() {
        return this.f72924g;
    }

    @C0359n0
    /* renamed from: M1 */
    public StreetViewPanoramaOptions mo85837M1(boolean z) {
        this.f72926w = Boolean.valueOf(z);
        return this;
    }

    @C0359n0
    /* renamed from: N0 */
    public StreetViewPanoramaOptions mo85838N0(@C0363p0 String str) {
        this.f72919b = str;
        return this;
    }

    @C0363p0
    /* renamed from: Q */
    public String mo85839Q() {
        return this.f72919b;
    }

    @C0363p0
    /* renamed from: W */
    public LatLng mo85840W() {
        return this.f72920c;
    }

    @C0363p0
    /* renamed from: X */
    public Integer mo85841X() {
        return this.f72921d;
    }

    @C0359n0
    /* renamed from: X1 */
    public StreetViewPanoramaOptions mo85842X1(boolean z) {
        this.f72922e = Boolean.valueOf(z);
        return this;
    }

    @C0359n0
    /* renamed from: Y1 */
    public StreetViewPanoramaOptions mo85843Y1(boolean z) {
        this.f72923f = Boolean.valueOf(z);
        return this;
    }

    @C0359n0
    /* renamed from: e0 */
    public StreetViewSource mo85844e0() {
        return this.f72927x;
    }

    @C0363p0
    /* renamed from: f0 */
    public Boolean mo85845f0() {
        return this.f72925v;
    }

    @C0359n0
    /* renamed from: j1 */
    public StreetViewPanoramaOptions mo85846j1(@C0363p0 LatLng latLng) {
        this.f72920c = latLng;
        return this;
    }

    @C0359n0
    /* renamed from: k1 */
    public StreetViewPanoramaOptions mo85847k1(@C0363p0 LatLng latLng, @C0359n0 StreetViewSource streetViewSource) {
        this.f72920c = latLng;
        this.f72927x = streetViewSource;
        return this;
    }

    @C0363p0
    /* renamed from: n0 */
    public StreetViewPanoramaCamera mo85848n0() {
        return this.f72918a;
    }

    @C0363p0
    /* renamed from: p0 */
    public Boolean mo85849p0() {
        return this.f72926w;
    }

    @C0363p0
    /* renamed from: t0 */
    public Boolean mo85850t0() {
        return this.f72922e;
    }

    @C0359n0
    public String toString() {
        return C40808s.m166012d(this).mo134475a("PanoramaId", this.f72919b).mo134475a("Position", this.f72920c).mo134475a("Radius", this.f72921d).mo134475a("Source", this.f72927x).mo134475a("StreetViewPanoramaCamera", this.f72918a).mo134475a("UserNavigationEnabled", this.f72922e).mo134475a("ZoomGesturesEnabled", this.f72923f).mo134475a("PanningGesturesEnabled", this.f72924g).mo134475a("StreetNamesEnabled", this.f72925v).mo134475a("UseViewLifecycleInFragment", this.f72926w).toString();
    }

    public void writeToParcel(@C0359n0 Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166102S(parcel, 2, mo85848n0(), i, false);
        C40820a.m166108Y(parcel, 3, mo85839Q(), false);
        C40820a.m166102S(parcel, 4, mo85840W(), i, false);
        C40820a.m166092I(parcel, 5, mo85841X(), false);
        C40820a.m166130l(parcel, 6, C30507m.m122739a(this.f72922e));
        C40820a.m166130l(parcel, 7, C30507m.m122739a(this.f72923f));
        C40820a.m166130l(parcel, 8, C30507m.m122739a(this.f72924g));
        C40820a.m166130l(parcel, 9, C30507m.m122739a(this.f72925v));
        C40820a.m166130l(parcel, 10, C30507m.m122739a(this.f72926w));
        C40820a.m166102S(parcel, 11, mo85844e0(), i, false);
        C40820a.m166112b(parcel, a);
    }

    @SafeParcelable.C40813b
    public StreetViewPanoramaOptions(@C0363p0 @SafeParcelable.C40816e(mo134492id = 2) StreetViewPanoramaCamera streetViewPanoramaCamera, @C0363p0 @SafeParcelable.C40816e(mo134492id = 3) String str, @C0363p0 @SafeParcelable.C40816e(mo134492id = 4) LatLng latLng, @C0363p0 @SafeParcelable.C40816e(mo134492id = 5) Integer num, @SafeParcelable.C40816e(mo134492id = 6) byte b, @SafeParcelable.C40816e(mo134492id = 7) byte b2, @SafeParcelable.C40816e(mo134492id = 8) byte b3, @SafeParcelable.C40816e(mo134492id = 9) byte b4, @SafeParcelable.C40816e(mo134492id = 10) byte b5, @SafeParcelable.C40816e(mo134492id = 11) StreetViewSource streetViewSource) {
        Boolean bool = Boolean.TRUE;
        this.f72922e = bool;
        this.f72923f = bool;
        this.f72924g = bool;
        this.f72925v = bool;
        this.f72918a = streetViewPanoramaCamera;
        this.f72920c = latLng;
        this.f72921d = num;
        this.f72919b = str;
        this.f72922e = C30507m.m122740b(b);
        this.f72923f = C30507m.m122740b(b2);
        this.f72924g = C30507m.m122740b(b3);
        this.f72925v = C30507m.m122740b(b4);
        this.f72926w = C30507m.m122740b(b5);
        this.f72927x = streetViewSource;
    }
}
