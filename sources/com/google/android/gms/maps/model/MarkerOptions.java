package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.C41016d;

@SafeParcelable.C40812a(creator = "MarkerOptionsCreator")
@SafeParcelable.C40818g({1})
public final class MarkerOptions extends AbstractSafeParcelable {
    @C0359n0
    public static final Parcelable.Creator<MarkerOptions> CREATOR = new C30604v();
    @SafeParcelable.C40814c(defaultValue = "1.0f", getter = "getAlpha", mo134489id = 14)

    /* renamed from: X */
    public float f73038X = 1.0f;
    @SafeParcelable.C40814c(getter = "getZIndex", mo134489id = 15)

    /* renamed from: Y */
    public float f73039Y;
    @SafeParcelable.C40814c(getter = "getPosition", mo134489id = 2)

    /* renamed from: a */
    public LatLng f73040a;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getTitle", mo134489id = 3)

    /* renamed from: b */
    public String f73041b;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getSnippet", mo134489id = 4)

    /* renamed from: c */
    public String f73042c;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getWrappedIconDescriptorImplBinder", mo134489id = 5, type = "android.os.IBinder")

    /* renamed from: d */
    public C30573a f73043d;
    @SafeParcelable.C40814c(getter = "getAnchorU", mo134489id = 6)

    /* renamed from: e */
    public float f73044e = 0.5f;
    @SafeParcelable.C40814c(getter = "getAnchorV", mo134489id = 7)

    /* renamed from: f */
    public float f73045f = 1.0f;
    @SafeParcelable.C40814c(getter = "isDraggable", mo134489id = 8)

    /* renamed from: g */
    public boolean f73046g;
    @SafeParcelable.C40814c(getter = "isVisible", mo134489id = 9)

    /* renamed from: v */
    public boolean f73047v = true;
    @SafeParcelable.C40814c(getter = "isFlat", mo134489id = 10)

    /* renamed from: w */
    public boolean f73048w = false;
    @SafeParcelable.C40814c(getter = "getRotation", mo134489id = 11)

    /* renamed from: x */
    public float f73049x = 0.0f;
    @SafeParcelable.C40814c(defaultValue = "0.5f", getter = "getInfoWindowAnchorU", mo134489id = 12)

    /* renamed from: y */
    public float f73050y = 0.5f;
    @SafeParcelable.C40814c(getter = "getInfoWindowAnchorV", mo134489id = 13)

    /* renamed from: z */
    public float f73051z = 0.0f;

    public MarkerOptions() {
    }

    /* renamed from: A0 */
    public float mo86353A0() {
        return this.f73051z;
    }

    @C0359n0
    /* renamed from: A1 */
    public MarkerOptions mo86354A1(@C0363p0 C30573a aVar) {
        this.f73043d = aVar;
        return this;
    }

    @C0359n0
    /* renamed from: C0 */
    public LatLng mo86355C0() {
        return this.f73040a;
    }

    @C0359n0
    /* renamed from: G1 */
    public MarkerOptions mo86356G1(float f, float f2) {
        this.f73050y = f;
        this.f73051z = f2;
        return this;
    }

    /* renamed from: K0 */
    public float mo86357K0() {
        return this.f73049x;
    }

    /* renamed from: L1 */
    public boolean mo86358L1() {
        return this.f73046g;
    }

    @C0359n0
    /* renamed from: M */
    public MarkerOptions mo86359M(float f) {
        this.f73038X = f;
        return this;
    }

    /* renamed from: M1 */
    public boolean mo86360M1() {
        return this.f73048w;
    }

    @C0363p0
    /* renamed from: N0 */
    public String mo86361N0() {
        return this.f73042c;
    }

    @C0359n0
    /* renamed from: Q */
    public MarkerOptions mo86362Q(float f, float f2) {
        this.f73044e = f;
        this.f73045f = f2;
        return this;
    }

    @C0359n0
    /* renamed from: W */
    public MarkerOptions mo86363W(boolean z) {
        this.f73046g = z;
        return this;
    }

    @C0359n0
    /* renamed from: X */
    public MarkerOptions mo86364X(boolean z) {
        this.f73048w = z;
        return this;
    }

    /* renamed from: X1 */
    public boolean mo86365X1() {
        return this.f73047v;
    }

    @C0359n0
    /* renamed from: Y1 */
    public MarkerOptions mo86366Y1(@C0359n0 LatLng latLng) {
        if (latLng != null) {
            this.f73040a = latLng;
            return this;
        }
        throw new IllegalArgumentException("latlng cannot be null - a position is required.");
    }

    @C0359n0
    /* renamed from: c2 */
    public MarkerOptions mo86367c2(float f) {
        this.f73049x = f;
        return this;
    }

    /* renamed from: e0 */
    public float mo86368e0() {
        return this.f73038X;
    }

    @C0359n0
    /* renamed from: e2 */
    public MarkerOptions mo86369e2(@C0363p0 String str) {
        this.f73042c = str;
        return this;
    }

    /* renamed from: f0 */
    public float mo86370f0() {
        return this.f73044e;
    }

    @C0363p0
    /* renamed from: j1 */
    public String mo86371j1() {
        return this.f73041b;
    }

    /* renamed from: k1 */
    public float mo86372k1() {
        return this.f73039Y;
    }

    @C0359n0
    /* renamed from: l2 */
    public MarkerOptions mo86373l2(@C0363p0 String str) {
        this.f73041b = str;
        return this;
    }

    @C0359n0
    /* renamed from: m2 */
    public MarkerOptions mo86374m2(boolean z) {
        this.f73047v = z;
        return this;
    }

    /* renamed from: n0 */
    public float mo86375n0() {
        return this.f73045f;
    }

    @C0363p0
    /* renamed from: p0 */
    public C30573a mo86376p0() {
        return this.f73043d;
    }

    /* renamed from: t0 */
    public float mo86377t0() {
        return this.f73050y;
    }

    public void writeToParcel(@C0359n0 Parcel parcel, int i) {
        IBinder iBinder;
        int a = C40820a.m166110a(parcel);
        C40820a.m166102S(parcel, 2, mo86355C0(), i, false);
        C40820a.m166108Y(parcel, 3, mo86371j1(), false);
        C40820a.m166108Y(parcel, 4, mo86361N0(), false);
        C30573a aVar = this.f73043d;
        if (aVar == null) {
            iBinder = null;
        } else {
            iBinder = aVar.mo86479a().asBinder();
        }
        C40820a.m166085B(parcel, 5, iBinder, false);
        C40820a.m166141w(parcel, 6, mo86370f0());
        C40820a.m166141w(parcel, 7, mo86375n0());
        C40820a.m166122g(parcel, 8, mo86358L1());
        C40820a.m166122g(parcel, 9, mo86365X1());
        C40820a.m166122g(parcel, 10, mo86360M1());
        C40820a.m166141w(parcel, 11, mo86357K0());
        C40820a.m166141w(parcel, 12, mo86377t0());
        C40820a.m166141w(parcel, 13, mo86353A0());
        C40820a.m166141w(parcel, 14, mo86368e0());
        C40820a.m166141w(parcel, 15, mo86372k1());
        C40820a.m166112b(parcel, a);
    }

    @C0359n0
    /* renamed from: y2 */
    public MarkerOptions mo86379y2(float f) {
        this.f73039Y = f;
        return this;
    }

    @SafeParcelable.C40813b
    public MarkerOptions(@SafeParcelable.C40816e(mo134492id = 2) LatLng latLng, @SafeParcelable.C40816e(mo134492id = 3) String str, @SafeParcelable.C40816e(mo134492id = 4) String str2, @C0363p0 @SafeParcelable.C40816e(mo134492id = 5) IBinder iBinder, @SafeParcelable.C40816e(mo134492id = 6) float f, @SafeParcelable.C40816e(mo134492id = 7) float f2, @SafeParcelable.C40816e(mo134492id = 8) boolean z, @SafeParcelable.C40816e(mo134492id = 9) boolean z2, @SafeParcelable.C40816e(mo134492id = 10) boolean z3, @SafeParcelable.C40816e(mo134492id = 11) float f3, @SafeParcelable.C40816e(mo134492id = 12) float f4, @SafeParcelable.C40816e(mo134492id = 13) float f5, @SafeParcelable.C40816e(mo134492id = 14) float f6, @SafeParcelable.C40816e(mo134492id = 15) float f7) {
        this.f73040a = latLng;
        this.f73041b = str;
        this.f73042c = str2;
        if (iBinder == null) {
            this.f73043d = null;
        } else {
            this.f73043d = new C30573a(C41016d.C41017a.m166799H0(iBinder));
        }
        this.f73044e = f;
        this.f73045f = f2;
        this.f73046g = z;
        this.f73047v = z2;
        this.f73048w = z3;
        this.f73049x = f3;
        this.f73050y = f4;
        this.f73051z = f5;
        this.f73038X = f6;
        this.f73039Y = f7;
    }
}
