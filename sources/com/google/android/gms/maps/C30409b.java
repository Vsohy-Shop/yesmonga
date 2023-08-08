package com.google.android.gms.maps;

import android.graphics.Point;
import android.os.RemoteException;
import androidx.annotation.C0359n0;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.maps.internal.C30459a;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.RuntimeRemoteException;

/* renamed from: com.google.android.gms.maps.b */
public final class C30409b {

    /* renamed from: a */
    public static C30459a f72933a;

    @C0359n0
    /* renamed from: a */
    public static C30406a m122329a(@C0359n0 CameraPosition cameraPosition) {
        C40843u.m166203m(cameraPosition, "cameraPosition must not be null");
        try {
            return new C30406a(m122341m().mo86021y3(cameraPosition));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @C0359n0
    /* renamed from: b */
    public static C30406a m122330b(@C0359n0 LatLng latLng) {
        C40843u.m166203m(latLng, "latLng must not be null");
        try {
            return new C30406a(m122341m().mo86016Y5(latLng));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @C0359n0
    /* renamed from: c */
    public static C30406a m122331c(@C0359n0 LatLngBounds latLngBounds, int i) {
        C40843u.m166203m(latLngBounds, "bounds must not be null");
        try {
            return new C30406a(m122341m().mo86015X0(latLngBounds, i));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @C0359n0
    /* renamed from: d */
    public static C30406a m122332d(@C0359n0 LatLngBounds latLngBounds, int i, int i2, int i3) {
        C40843u.m166203m(latLngBounds, "bounds must not be null");
        try {
            return new C30406a(m122341m().mo86019r3(latLngBounds, i, i2, i3));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @C0359n0
    /* renamed from: e */
    public static C30406a m122333e(@C0359n0 LatLng latLng, float f) {
        C40843u.m166203m(latLng, "latLng must not be null");
        try {
            return new C30406a(m122341m().mo86011E4(latLng, f));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @C0359n0
    /* renamed from: f */
    public static C30406a m122334f(float f, float f2) {
        try {
            return new C30406a(m122341m().mo86012F4(f, f2));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @C0359n0
    /* renamed from: g */
    public static C30406a m122335g(float f) {
        try {
            return new C30406a(m122341m().mo86017c1(f));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @C0359n0
    /* renamed from: h */
    public static C30406a m122336h(float f, @C0359n0 Point point) {
        C40843u.m166203m(point, "focus must not be null");
        try {
            return new C30406a(m122341m().mo86014U6(f, point.x, point.y));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @C0359n0
    /* renamed from: i */
    public static C30406a m122337i() {
        try {
            return new C30406a(m122341m().mo86018n2());
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @C0359n0
    /* renamed from: j */
    public static C30406a m122338j() {
        try {
            return new C30406a(m122341m().mo86013P7());
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @C0359n0
    /* renamed from: k */
    public static C30406a m122339k(float f) {
        try {
            return new C30406a(m122341m().mo86020u4(f));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: l */
    public static void m122340l(@C0359n0 C30459a aVar) {
        f72933a = (C30459a) C40843u.m166202l(aVar);
    }

    /* renamed from: m */
    public static C30459a m122341m() {
        return (C30459a) C40843u.m166203m(f72933a, "CameraUpdateFactory is not initialized");
    }
}
