package com.google.android.gms.maps.model;

import android.graphics.Bitmap;
import android.os.RemoteException;
import androidx.annotation.C0359n0;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.internal.maps.C41841s;

/* renamed from: com.google.android.gms.maps.model.b */
public final class C30575b {

    /* renamed from: a */
    public static final float f73115a = 0.0f;

    /* renamed from: b */
    public static final float f73116b = 30.0f;

    /* renamed from: c */
    public static final float f73117c = 60.0f;

    /* renamed from: d */
    public static final float f73118d = 120.0f;

    /* renamed from: e */
    public static final float f73119e = 180.0f;

    /* renamed from: f */
    public static final float f73120f = 210.0f;

    /* renamed from: g */
    public static final float f73121g = 240.0f;

    /* renamed from: h */
    public static final float f73122h = 270.0f;

    /* renamed from: i */
    public static final float f73123i = 300.0f;

    /* renamed from: j */
    public static final float f73124j = 330.0f;

    /* renamed from: k */
    public static C41841s f73125k;

    @C0359n0
    /* renamed from: a */
    public static C30573a m123155a() {
        try {
            return new C30573a(m123163i().mo136441e());
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @C0359n0
    /* renamed from: b */
    public static C30573a m123156b(float f) {
        try {
            return new C30573a(m123163i().mo136443t1(f));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @C0359n0
    /* renamed from: c */
    public static C30573a m123157c(@C0359n0 String str) {
        C40843u.m166203m(str, "assetName must not be null");
        try {
            return new C30573a(m123163i().mo136438I0(str));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @C0359n0
    /* renamed from: d */
    public static C30573a m123158d(@C0359n0 Bitmap bitmap) {
        C40843u.m166203m(bitmap, "image must not be null");
        try {
            return new C30573a(m123163i().mo136439S1(bitmap));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @C0359n0
    /* renamed from: e */
    public static C30573a m123159e(@C0359n0 String str) {
        C40843u.m166203m(str, "fileName must not be null");
        try {
            return new C30573a(m123163i().mo136442q7(str));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @C0359n0
    /* renamed from: f */
    public static C30573a m123160f(@C0359n0 String str) {
        C40843u.m166203m(str, "absolutePath must not be null");
        try {
            return new C30573a(m123163i().mo136444y8(str));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @C0359n0
    /* renamed from: g */
    public static C30573a m123161g(int i) {
        try {
            return new C30573a(m123163i().mo136440T3(i));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: h */
    public static void m123162h(C41841s sVar) {
        if (f73125k == null) {
            f73125k = (C41841s) C40843u.m166203m(sVar, "delegate must not be null");
        }
    }

    /* renamed from: i */
    public static C41841s m123163i() {
        return (C41841s) C40843u.m166203m(f73125k, "IBitmapDescriptorFactory is not initialized");
    }
}
