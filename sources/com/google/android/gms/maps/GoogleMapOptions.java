package com.google.android.gms.maps;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import androidx.annotation.C0354l;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.internal.C40808s;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.C30550j;
import com.google.android.gms.maps.internal.C30507m;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.onetrust.otpublishers.headless.Public.Keys.OTUXParamsKeys;

@SafeParcelable.C40812a(creator = "GoogleMapOptionsCreator")
@SafeParcelable.C40818g({1})
public final class GoogleMapOptions extends AbstractSafeParcelable implements ReflectedParcelable {
    @C0359n0
    public static final Parcelable.Creator<GoogleMapOptions> CREATOR = new C30615q();
    @C0363p0
    @SafeParcelable.C40814c(getter = "getLatLngBoundsForCameraTarget", mo134489id = 18)

    /* renamed from: E0 */
    public LatLngBounds f72892E0 = null;
    @C0363p0
    @SafeParcelable.C40814c(defaultValue = "-1", getter = "getScrollGesturesEnabledDuringRotateOrZoomForParcel", mo134489id = 19, type = "byte")

    /* renamed from: F0 */
    public Boolean f72893F0;
    @C0363p0
    @C0354l
    @SafeParcelable.C40814c(getter = "getBackgroundColor", mo134489id = 20)

    /* renamed from: G0 */
    public Integer f72894G0 = null;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getMapId", mo134489id = 21)

    /* renamed from: H0 */
    public String f72895H0 = null;
    @C0363p0
    @SafeParcelable.C40814c(defaultValue = "-1", getter = "getAmbientEnabledForParcel", mo134489id = 15, type = "byte")

    /* renamed from: X */
    public Boolean f72896X;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getMinZoomPreference", mo134489id = 16)

    /* renamed from: Y */
    public Float f72897Y = null;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getMaxZoomPreference", mo134489id = 17)

    /* renamed from: Z */
    public Float f72898Z = null;
    @C0363p0
    @SafeParcelable.C40814c(defaultValue = "-1", getter = "getZOrderOnTopForParcel", mo134489id = 2, type = "byte")

    /* renamed from: a */
    public Boolean f72899a;
    @C0363p0
    @SafeParcelable.C40814c(defaultValue = "-1", getter = "getUseViewLifecycleInFragmentForParcel", mo134489id = 3, type = "byte")

    /* renamed from: b */
    public Boolean f72900b;
    @SafeParcelable.C40814c(getter = "getMapType", mo134489id = 4)

    /* renamed from: c */
    public int f72901c = -1;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getCamera", mo134489id = 5)

    /* renamed from: d */
    public CameraPosition f72902d;
    @C0363p0
    @SafeParcelable.C40814c(defaultValue = "-1", getter = "getZoomControlsEnabledForParcel", mo134489id = 6, type = "byte")

    /* renamed from: e */
    public Boolean f72903e;
    @C0363p0
    @SafeParcelable.C40814c(defaultValue = "-1", getter = "getCompassEnabledForParcel", mo134489id = 7, type = "byte")

    /* renamed from: f */
    public Boolean f72904f;
    @C0363p0
    @SafeParcelable.C40814c(defaultValue = "-1", getter = "getScrollGesturesEnabledForParcel", mo134489id = 8, type = "byte")

    /* renamed from: g */
    public Boolean f72905g;
    @C0363p0
    @SafeParcelable.C40814c(defaultValue = "-1", getter = "getZoomGesturesEnabledForParcel", mo134489id = 9, type = "byte")

    /* renamed from: v */
    public Boolean f72906v;
    @C0363p0
    @SafeParcelable.C40814c(defaultValue = "-1", getter = "getTiltGesturesEnabledForParcel", mo134489id = 10, type = "byte")

    /* renamed from: w */
    public Boolean f72907w;
    @C0363p0
    @SafeParcelable.C40814c(defaultValue = "-1", getter = "getRotateGesturesEnabledForParcel", mo134489id = 11, type = "byte")

    /* renamed from: x */
    public Boolean f72908x;
    @C0363p0
    @SafeParcelable.C40814c(defaultValue = "-1", getter = "getLiteModeForParcel", mo134489id = 12, type = "byte")

    /* renamed from: y */
    public Boolean f72909y;
    @C0363p0
    @SafeParcelable.C40814c(defaultValue = "-1", getter = "getMapToolbarEnabledForParcel", mo134489id = 14, type = "byte")

    /* renamed from: z */
    public Boolean f72910z;

    public GoogleMapOptions() {
    }

    @C0363p0
    /* renamed from: e0 */
    public static GoogleMapOptions m122236e0(@C0363p0 Context context, @C0363p0 AttributeSet attributeSet) {
        String string;
        if (context == null || attributeSet == null) {
            return null;
        }
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, C30550j.C30553c.MapAttrs);
        GoogleMapOptions googleMapOptions = new GoogleMapOptions();
        int i = C30550j.C30553c.MapAttrs_mapType;
        if (obtainAttributes.hasValue(i)) {
            googleMapOptions.mo85792T2(obtainAttributes.getInt(i, -1));
        }
        int i2 = C30550j.C30553c.MapAttrs_zOrderOnTop;
        if (obtainAttributes.hasValue(i2)) {
            googleMapOptions.mo85801c4(obtainAttributes.getBoolean(i2, false));
        }
        int i3 = C30550j.C30553c.MapAttrs_useViewLifecycle;
        if (obtainAttributes.hasValue(i3)) {
            googleMapOptions.mo85799b4(obtainAttributes.getBoolean(i3, false));
        }
        int i4 = C30550j.C30553c.MapAttrs_uiCompass;
        if (obtainAttributes.hasValue(i4)) {
            googleMapOptions.mo85794X(obtainAttributes.getBoolean(i4, true));
        }
        int i5 = C30550j.C30553c.MapAttrs_uiRotateGestures;
        if (obtainAttributes.hasValue(i5)) {
            googleMapOptions.mo85816w3(obtainAttributes.getBoolean(i5, true));
        }
        int i6 = C30550j.C30553c.MapAttrs_uiScrollGesturesDuringRotateOrZoom;
        if (obtainAttributes.hasValue(i6)) {
            googleMapOptions.mo85797Z3(obtainAttributes.getBoolean(i6, true));
        }
        int i7 = C30550j.C30553c.MapAttrs_uiScrollGestures;
        if (obtainAttributes.hasValue(i7)) {
            googleMapOptions.mo85784J3(obtainAttributes.getBoolean(i7, true));
        }
        int i8 = C30550j.C30553c.MapAttrs_uiTiltGestures;
        if (obtainAttributes.hasValue(i8)) {
            googleMapOptions.mo85798a4(obtainAttributes.getBoolean(i8, true));
        }
        int i9 = C30550j.C30553c.MapAttrs_uiZoomGestures;
        if (obtainAttributes.hasValue(i9)) {
            googleMapOptions.mo85804e4(obtainAttributes.getBoolean(i9, true));
        }
        int i10 = C30550j.C30553c.MapAttrs_uiZoomControls;
        if (obtainAttributes.hasValue(i10)) {
            googleMapOptions.mo85802d4(obtainAttributes.getBoolean(i10, true));
        }
        int i11 = C30550j.C30553c.MapAttrs_liteMode;
        if (obtainAttributes.hasValue(i11)) {
            googleMapOptions.mo85818y2(obtainAttributes.getBoolean(i11, false));
        }
        int i12 = C30550j.C30553c.MapAttrs_uiMapToolbar;
        if (obtainAttributes.hasValue(i12)) {
            googleMapOptions.mo85789M2(obtainAttributes.getBoolean(i12, true));
        }
        int i13 = C30550j.C30553c.MapAttrs_ambientEnabled;
        if (obtainAttributes.hasValue(i13)) {
            googleMapOptions.mo85787M(obtainAttributes.getBoolean(i13, false));
        }
        int i14 = C30550j.C30553c.MapAttrs_cameraMinZoomPreference;
        if (obtainAttributes.hasValue(i14)) {
            googleMapOptions.mo85814t3(obtainAttributes.getFloat(i14, Float.NEGATIVE_INFINITY));
        }
        if (obtainAttributes.hasValue(i14)) {
            googleMapOptions.mo85812r3(obtainAttributes.getFloat(C30550j.C30553c.MapAttrs_cameraMaxZoomPreference, Float.POSITIVE_INFINITY));
        }
        TypedArray obtainAttributes2 = context.getResources().obtainAttributes(attributeSet, new int[]{m122239h4(context, OTUXParamsKeys.OT_UX_BACKGROUND_COLOR), m122239h4(context, "mapId")});
        if (obtainAttributes2.hasValue(0)) {
            googleMapOptions.mo85791Q(Integer.valueOf(obtainAttributes2.getColor(0, 0)));
        }
        if (obtainAttributes2.hasValue(1) && (string = obtainAttributes2.getString(1)) != null && !string.isEmpty()) {
            googleMapOptions.mo85782D2(string);
        }
        obtainAttributes2.recycle();
        googleMapOptions.mo85809m2(m122238g4(context, attributeSet));
        googleMapOptions.mo85793W(m122237f4(context, attributeSet));
        obtainAttributes.recycle();
        return googleMapOptions;
    }

    @C0363p0
    /* renamed from: f4 */
    public static CameraPosition m122237f4(@C0363p0 Context context, @C0363p0 AttributeSet attributeSet) {
        float f;
        float f2;
        if (context == null || attributeSet == null) {
            return null;
        }
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, C30550j.C30553c.MapAttrs);
        int i = C30550j.C30553c.MapAttrs_cameraTargetLat;
        if (obtainAttributes.hasValue(i)) {
            f = obtainAttributes.getFloat(i, 0.0f);
        } else {
            f = 0.0f;
        }
        int i2 = C30550j.C30553c.MapAttrs_cameraTargetLng;
        if (obtainAttributes.hasValue(i2)) {
            f2 = obtainAttributes.getFloat(i2, 0.0f);
        } else {
            f2 = 0.0f;
        }
        LatLng latLng = new LatLng((double) f, (double) f2);
        CameraPosition.C30569a M = CameraPosition.m122995M();
        M.mo86287c(latLng);
        int i3 = C30550j.C30553c.MapAttrs_cameraZoom;
        if (obtainAttributes.hasValue(i3)) {
            M.mo86289e(obtainAttributes.getFloat(i3, 0.0f));
        }
        int i4 = C30550j.C30553c.MapAttrs_cameraBearing;
        if (obtainAttributes.hasValue(i4)) {
            M.mo86285a(obtainAttributes.getFloat(i4, 0.0f));
        }
        int i5 = C30550j.C30553c.MapAttrs_cameraTilt;
        if (obtainAttributes.hasValue(i5)) {
            M.mo86288d(obtainAttributes.getFloat(i5, 0.0f));
        }
        obtainAttributes.recycle();
        return M.mo86286b();
    }

    @C0363p0
    /* renamed from: g4 */
    public static LatLngBounds m122238g4(@C0363p0 Context context, @C0363p0 AttributeSet attributeSet) {
        Float f;
        Float f2;
        Float f3;
        Float f4;
        if (context == null || attributeSet == null) {
            return null;
        }
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, C30550j.C30553c.MapAttrs);
        int i = C30550j.C30553c.MapAttrs_latLngBoundsSouthWestLatitude;
        if (obtainAttributes.hasValue(i)) {
            f = Float.valueOf(obtainAttributes.getFloat(i, 0.0f));
        } else {
            f = null;
        }
        int i2 = C30550j.C30553c.MapAttrs_latLngBoundsSouthWestLongitude;
        if (obtainAttributes.hasValue(i2)) {
            f2 = Float.valueOf(obtainAttributes.getFloat(i2, 0.0f));
        } else {
            f2 = null;
        }
        int i3 = C30550j.C30553c.MapAttrs_latLngBoundsNorthEastLatitude;
        if (obtainAttributes.hasValue(i3)) {
            f3 = Float.valueOf(obtainAttributes.getFloat(i3, 0.0f));
        } else {
            f3 = null;
        }
        int i4 = C30550j.C30553c.MapAttrs_latLngBoundsNorthEastLongitude;
        if (obtainAttributes.hasValue(i4)) {
            f4 = Float.valueOf(obtainAttributes.getFloat(i4, 0.0f));
        } else {
            f4 = null;
        }
        obtainAttributes.recycle();
        if (f == null || f2 == null || f3 == null || f4 == null) {
            return null;
        }
        return new LatLngBounds(new LatLng((double) f.floatValue(), (double) f2.floatValue()), new LatLng((double) f3.floatValue(), (double) f4.floatValue()));
    }

    /* renamed from: h4 */
    public static int m122239h4(Context context, String str) {
        return context.getResources().getIdentifier(str, "attr", context.getPackageName());
    }

    @C0363p0
    /* renamed from: A0 */
    public LatLngBounds mo85779A0() {
        return this.f72892E0;
    }

    @C0363p0
    /* renamed from: A1 */
    public Float mo85780A1() {
        return this.f72897Y;
    }

    @C0363p0
    /* renamed from: C0 */
    public Boolean mo85781C0() {
        return this.f72909y;
    }

    @C0359n0
    /* renamed from: D2 */
    public GoogleMapOptions mo85782D2(@C0359n0 String str) {
        this.f72895H0 = str;
        return this;
    }

    @C0363p0
    /* renamed from: G1 */
    public Boolean mo85783G1() {
        return this.f72908x;
    }

    @C0359n0
    /* renamed from: J3 */
    public GoogleMapOptions mo85784J3(boolean z) {
        this.f72905g = Boolean.valueOf(z);
        return this;
    }

    @C0363p0
    /* renamed from: K0 */
    public String mo85785K0() {
        return this.f72895H0;
    }

    @C0363p0
    /* renamed from: L1 */
    public Boolean mo85786L1() {
        return this.f72905g;
    }

    @C0359n0
    /* renamed from: M */
    public GoogleMapOptions mo85787M(boolean z) {
        this.f72896X = Boolean.valueOf(z);
        return this;
    }

    @C0363p0
    /* renamed from: M1 */
    public Boolean mo85788M1() {
        return this.f72893F0;
    }

    @C0359n0
    /* renamed from: M2 */
    public GoogleMapOptions mo85789M2(boolean z) {
        this.f72910z = Boolean.valueOf(z);
        return this;
    }

    @C0363p0
    /* renamed from: N0 */
    public Boolean mo85790N0() {
        return this.f72910z;
    }

    @C0359n0
    /* renamed from: Q */
    public GoogleMapOptions mo85791Q(@C0363p0 @C0354l Integer num) {
        this.f72894G0 = num;
        return this;
    }

    @C0359n0
    /* renamed from: T2 */
    public GoogleMapOptions mo85792T2(int i) {
        this.f72901c = i;
        return this;
    }

    @C0359n0
    /* renamed from: W */
    public GoogleMapOptions mo85793W(@C0363p0 CameraPosition cameraPosition) {
        this.f72902d = cameraPosition;
        return this;
    }

    @C0359n0
    /* renamed from: X */
    public GoogleMapOptions mo85794X(boolean z) {
        this.f72904f = Boolean.valueOf(z);
        return this;
    }

    @C0363p0
    /* renamed from: X1 */
    public Boolean mo85795X1() {
        return this.f72907w;
    }

    @C0363p0
    /* renamed from: Y1 */
    public Boolean mo85796Y1() {
        return this.f72900b;
    }

    @C0359n0
    /* renamed from: Z3 */
    public GoogleMapOptions mo85797Z3(boolean z) {
        this.f72893F0 = Boolean.valueOf(z);
        return this;
    }

    @C0359n0
    /* renamed from: a4 */
    public GoogleMapOptions mo85798a4(boolean z) {
        this.f72907w = Boolean.valueOf(z);
        return this;
    }

    @C0359n0
    /* renamed from: b4 */
    public GoogleMapOptions mo85799b4(boolean z) {
        this.f72900b = Boolean.valueOf(z);
        return this;
    }

    @C0363p0
    /* renamed from: c2 */
    public Boolean mo85800c2() {
        return this.f72899a;
    }

    @C0359n0
    /* renamed from: c4 */
    public GoogleMapOptions mo85801c4(boolean z) {
        this.f72899a = Boolean.valueOf(z);
        return this;
    }

    @C0359n0
    /* renamed from: d4 */
    public GoogleMapOptions mo85802d4(boolean z) {
        this.f72903e = Boolean.valueOf(z);
        return this;
    }

    @C0363p0
    /* renamed from: e2 */
    public Boolean mo85803e2() {
        return this.f72903e;
    }

    @C0359n0
    /* renamed from: e4 */
    public GoogleMapOptions mo85804e4(boolean z) {
        this.f72906v = Boolean.valueOf(z);
        return this;
    }

    @C0363p0
    /* renamed from: f0 */
    public Boolean mo85805f0() {
        return this.f72896X;
    }

    /* renamed from: j1 */
    public int mo85806j1() {
        return this.f72901c;
    }

    @C0363p0
    /* renamed from: k1 */
    public Float mo85807k1() {
        return this.f72898Z;
    }

    @C0363p0
    /* renamed from: l2 */
    public Boolean mo85808l2() {
        return this.f72906v;
    }

    @C0359n0
    /* renamed from: m2 */
    public GoogleMapOptions mo85809m2(@C0363p0 LatLngBounds latLngBounds) {
        this.f72892E0 = latLngBounds;
        return this;
    }

    @C0363p0
    @C0354l
    /* renamed from: n0 */
    public Integer mo85810n0() {
        return this.f72894G0;
    }

    @C0363p0
    /* renamed from: p0 */
    public CameraPosition mo85811p0() {
        return this.f72902d;
    }

    @C0359n0
    /* renamed from: r3 */
    public GoogleMapOptions mo85812r3(float f) {
        this.f72898Z = Float.valueOf(f);
        return this;
    }

    @C0363p0
    /* renamed from: t0 */
    public Boolean mo85813t0() {
        return this.f72904f;
    }

    @C0359n0
    /* renamed from: t3 */
    public GoogleMapOptions mo85814t3(float f) {
        this.f72897Y = Float.valueOf(f);
        return this;
    }

    @C0359n0
    public String toString() {
        return C40808s.m166012d(this).mo134475a("MapType", Integer.valueOf(this.f72901c)).mo134475a("LiteMode", this.f72909y).mo134475a("Camera", this.f72902d).mo134475a("CompassEnabled", this.f72904f).mo134475a("ZoomControlsEnabled", this.f72903e).mo134475a("ScrollGesturesEnabled", this.f72905g).mo134475a("ZoomGesturesEnabled", this.f72906v).mo134475a("TiltGesturesEnabled", this.f72907w).mo134475a("RotateGesturesEnabled", this.f72908x).mo134475a("ScrollGesturesEnabledDuringRotateOrZoom", this.f72893F0).mo134475a("MapToolbarEnabled", this.f72910z).mo134475a("AmbientEnabled", this.f72896X).mo134475a("MinZoomPreference", this.f72897Y).mo134475a("MaxZoomPreference", this.f72898Z).mo134475a("BackgroundColor", this.f72894G0).mo134475a("LatLngBoundsForCameraTarget", this.f72892E0).mo134475a("ZOrderOnTop", this.f72899a).mo134475a("UseViewLifecycleInFragment", this.f72900b).toString();
    }

    @C0359n0
    /* renamed from: w3 */
    public GoogleMapOptions mo85816w3(boolean z) {
        this.f72908x = Boolean.valueOf(z);
        return this;
    }

    public void writeToParcel(@C0359n0 Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166130l(parcel, 2, C30507m.m122739a(this.f72899a));
        C40820a.m166130l(parcel, 3, C30507m.m122739a(this.f72900b));
        C40820a.m166089F(parcel, 4, mo85806j1());
        C40820a.m166102S(parcel, 5, mo85811p0(), i, false);
        C40820a.m166130l(parcel, 6, C30507m.m122739a(this.f72903e));
        C40820a.m166130l(parcel, 7, C30507m.m122739a(this.f72904f));
        C40820a.m166130l(parcel, 8, C30507m.m122739a(this.f72905g));
        C40820a.m166130l(parcel, 9, C30507m.m122739a(this.f72906v));
        C40820a.m166130l(parcel, 10, C30507m.m122739a(this.f72907w));
        C40820a.m166130l(parcel, 11, C30507m.m122739a(this.f72908x));
        C40820a.m166130l(parcel, 12, C30507m.m122739a(this.f72909y));
        C40820a.m166130l(parcel, 14, C30507m.m122739a(this.f72910z));
        C40820a.m166130l(parcel, 15, C30507m.m122739a(this.f72896X));
        C40820a.m166144z(parcel, 16, mo85780A1(), false);
        C40820a.m166144z(parcel, 17, mo85807k1(), false);
        C40820a.m166102S(parcel, 18, mo85779A0(), i, false);
        C40820a.m166130l(parcel, 19, C30507m.m122739a(this.f72893F0));
        C40820a.m166092I(parcel, 20, mo85810n0(), false);
        C40820a.m166108Y(parcel, 21, mo85785K0(), false);
        C40820a.m166112b(parcel, a);
    }

    @C0359n0
    /* renamed from: y2 */
    public GoogleMapOptions mo85818y2(boolean z) {
        this.f72909y = Boolean.valueOf(z);
        return this;
    }

    @SafeParcelable.C40813b
    public GoogleMapOptions(@SafeParcelable.C40816e(mo134492id = 2) byte b, @SafeParcelable.C40816e(mo134492id = 3) byte b2, @SafeParcelable.C40816e(mo134492id = 4) int i, @C0363p0 @SafeParcelable.C40816e(mo134492id = 5) CameraPosition cameraPosition, @SafeParcelable.C40816e(mo134492id = 6) byte b3, @SafeParcelable.C40816e(mo134492id = 7) byte b4, @SafeParcelable.C40816e(mo134492id = 8) byte b5, @SafeParcelable.C40816e(mo134492id = 9) byte b6, @SafeParcelable.C40816e(mo134492id = 10) byte b7, @SafeParcelable.C40816e(mo134492id = 11) byte b8, @SafeParcelable.C40816e(mo134492id = 12) byte b9, @SafeParcelable.C40816e(mo134492id = 14) byte b10, @SafeParcelable.C40816e(mo134492id = 15) byte b11, @C0363p0 @SafeParcelable.C40816e(mo134492id = 16) Float f, @C0363p0 @SafeParcelable.C40816e(mo134492id = 17) Float f2, @C0363p0 @SafeParcelable.C40816e(mo134492id = 18) LatLngBounds latLngBounds, @SafeParcelable.C40816e(mo134492id = 19) byte b12, @C0363p0 @SafeParcelable.C40816e(mo134492id = 20) @C0354l Integer num, @C0363p0 @SafeParcelable.C40816e(mo134492id = 21) String str) {
        this.f72899a = C30507m.m122740b(b);
        this.f72900b = C30507m.m122740b(b2);
        this.f72901c = i;
        this.f72902d = cameraPosition;
        this.f72903e = C30507m.m122740b(b3);
        this.f72904f = C30507m.m122740b(b4);
        this.f72905g = C30507m.m122740b(b5);
        this.f72906v = C30507m.m122740b(b6);
        this.f72907w = C30507m.m122740b(b7);
        this.f72908x = C30507m.m122740b(b8);
        this.f72909y = C30507m.m122740b(b9);
        this.f72910z = C30507m.m122740b(b10);
        this.f72896X = C30507m.m122740b(b11);
        this.f72897Y = f;
        this.f72898Z = f2;
        this.f72892E0 = latLngBounds;
        this.f72893F0 = C30507m.m122740b(b12);
        this.f72894G0 = num;
        this.f72895H0 = str;
    }
}
