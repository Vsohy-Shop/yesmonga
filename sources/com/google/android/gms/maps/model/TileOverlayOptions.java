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
import com.google.android.gms.internal.maps.C41831j;
import com.google.android.gms.internal.maps.C41833k;

@SafeParcelable.C40812a(creator = "TileOverlayOptionsCreator")
@SafeParcelable.C40818g({1})
public final class TileOverlayOptions extends AbstractSafeParcelable {
    @C0359n0
    public static final Parcelable.Creator<TileOverlayOptions> CREATOR = new C30590i0();
    @C0363p0
    @SafeParcelable.C40814c(getter = "getTileProviderDelegate", mo134489id = 2, type = "android.os.IBinder")

    /* renamed from: a */
    public C41833k f73103a;
    @C0363p0

    /* renamed from: b */
    public C30594l f73104b;
    @SafeParcelable.C40814c(getter = "isVisible", mo134489id = 3)

    /* renamed from: c */
    public boolean f73105c = true;
    @SafeParcelable.C40814c(getter = "getZIndex", mo134489id = 4)

    /* renamed from: d */
    public float f73106d;
    @SafeParcelable.C40814c(defaultValue = "true", getter = "getFadeIn", mo134489id = 5)

    /* renamed from: e */
    public boolean f73107e = true;
    @SafeParcelable.C40814c(getter = "getTransparency", mo134489id = 6)

    /* renamed from: f */
    public float f73108f = 0.0f;

    public TileOverlayOptions() {
    }

    @C0359n0
    /* renamed from: A0 */
    public TileOverlayOptions mo86464A0(float f) {
        this.f73106d = f;
        return this;
    }

    @C0359n0
    /* renamed from: M */
    public TileOverlayOptions mo86465M(boolean z) {
        this.f73107e = z;
        return this;
    }

    /* renamed from: Q */
    public boolean mo86466Q() {
        return this.f73107e;
    }

    @C0363p0
    /* renamed from: W */
    public C30594l mo86467W() {
        return this.f73104b;
    }

    /* renamed from: X */
    public float mo86468X() {
        return this.f73108f;
    }

    /* renamed from: e0 */
    public float mo86469e0() {
        return this.f73106d;
    }

    /* renamed from: f0 */
    public boolean mo86470f0() {
        return this.f73105c;
    }

    @C0359n0
    /* renamed from: n0 */
    public TileOverlayOptions mo86471n0(@C0359n0 C30594l lVar) {
        this.f73104b = (C30594l) C40843u.m166203m(lVar, "tileProvider must not be null.");
        this.f73103a = new C30588h0(this, lVar);
        return this;
    }

    @C0359n0
    /* renamed from: p0 */
    public TileOverlayOptions mo86472p0(float f) {
        boolean z = false;
        if (f >= 0.0f && f <= 1.0f) {
            z = true;
        }
        C40843u.m166192b(z, "Transparency must be in the range [0..1]");
        this.f73108f = f;
        return this;
    }

    @C0359n0
    /* renamed from: t0 */
    public TileOverlayOptions mo86473t0(boolean z) {
        this.f73105c = z;
        return this;
    }

    public void writeToParcel(@C0359n0 Parcel parcel, int i) {
        IBinder iBinder;
        int a = C40820a.m166110a(parcel);
        C41833k kVar = this.f73103a;
        if (kVar == null) {
            iBinder = null;
        } else {
            iBinder = kVar.asBinder();
        }
        C40820a.m166085B(parcel, 2, iBinder, false);
        C40820a.m166122g(parcel, 3, mo86470f0());
        C40820a.m166141w(parcel, 4, mo86469e0());
        C40820a.m166122g(parcel, 5, mo86466Q());
        C40820a.m166141w(parcel, 6, mo86468X());
        C40820a.m166112b(parcel, a);
    }

    @SafeParcelable.C40813b
    public TileOverlayOptions(@SafeParcelable.C40816e(mo134492id = 2) IBinder iBinder, @SafeParcelable.C40816e(mo134492id = 3) boolean z, @SafeParcelable.C40816e(mo134492id = 4) float f, @SafeParcelable.C40816e(mo134492id = 5) boolean z2, @SafeParcelable.C40816e(mo134492id = 6) float f2) {
        C30586g0 g0Var;
        C41833k H0 = C41831j.m169446H0(iBinder);
        this.f73103a = H0;
        if (H0 == null) {
            g0Var = null;
        } else {
            g0Var = new C30586g0(this);
        }
        this.f73104b = g0Var;
        this.f73105c = z;
        this.f73106d = f;
        this.f73107e = z2;
        this.f73108f = f2;
    }
}
