package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.content.Context;
import android.location.Location;
import android.os.Build;
import android.os.Looper;
import com.google.android.gms.common.api.C40507i;
import com.google.android.gms.common.api.C40663m;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.common.util.C40974d0;
import com.google.android.gms.location.C30323d;
import com.google.android.gms.location.C30354k;
import com.google.android.gms.location.C30358l;
import com.google.android.gms.location.C30362m;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import java.lang.reflect.InvocationTargetException;

@C40974d0
/* renamed from: com.google.android.gms.internal.location.l1 */
public final class C41784l1 implements C30323d {
    /* renamed from: a */
    public final C40663m<Status> mo85656a(C40507i iVar, LocationRequest locationRequest, PendingIntent pendingIntent) {
        return iVar.mo133753m(new C41769g1(this, iVar, locationRequest, pendingIntent));
    }

    /* renamed from: b */
    public final C40663m<Status> mo85657b(C40507i iVar, C30354k kVar) {
        return iVar.mo133753m(new C41812z0(this, iVar, kVar));
    }

    /* renamed from: c */
    public final C40663m<Status> mo85658c(C40507i iVar, PendingIntent pendingIntent) {
        return iVar.mo133753m(new C41775i1(this, iVar, pendingIntent));
    }

    /* renamed from: d */
    public final C40663m<Status> mo85659d(C40507i iVar, C30358l lVar) {
        return iVar.mo133753m(new C41772h1(this, iVar, lVar));
    }

    /* renamed from: e */
    public final C40663m<Status> mo85660e(C40507i iVar, boolean z) {
        return iVar.mo133753m(new C41751a1(this, iVar, z));
    }

    /* renamed from: f */
    public final C40663m<Status> mo85661f(C40507i iVar, Location location) {
        return iVar.mo133753m(new C41754b1(this, iVar, location));
    }

    /* renamed from: g */
    public final C40663m<Status> mo85662g(C40507i iVar) {
        return iVar.mo133753m(new C41757c1(this, iVar));
    }

    /* renamed from: h */
    public final Location mo85663h(C40507i iVar) {
        String str;
        C41811z g = C30362m.m122193g(iVar);
        Context q = iVar.mo133756q();
        if (Build.VERSION.SDK_INT >= 30 && q != null) {
            try {
                str = (String) Context.class.getMethod("getAttributionTag", new Class[0]).invoke(q, new Object[0]);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            return g.mo136264Q0(str);
        }
        str = null;
        try {
            return g.mo136264Q0(str);
        } catch (Exception unused2) {
            return null;
        }
    }

    /* renamed from: i */
    public final C40663m<Status> mo85664i(C40507i iVar, LocationRequest locationRequest, C30354k kVar, Looper looper) {
        return iVar.mo133753m(new C41766f1(this, iVar, locationRequest, kVar, looper));
    }

    /* renamed from: j */
    public final C40663m<Status> mo85665j(C40507i iVar, LocationRequest locationRequest, C30358l lVar) {
        C40843u.m166203m(Looper.myLooper(), "Calling thread must be a prepared Looper thread.");
        return iVar.mo133753m(new C41760d1(this, iVar, locationRequest, lVar));
    }

    /* renamed from: k */
    public final C40663m<Status> mo85666k(C40507i iVar, LocationRequest locationRequest, C30358l lVar, Looper looper) {
        return iVar.mo133753m(new C41763e1(this, iVar, locationRequest, lVar, looper));
    }

    /* renamed from: l */
    public final LocationAvailability mo85667l(C40507i iVar) {
        try {
            return C30362m.m122193g(iVar).mo136265v0();
        } catch (Exception unused) {
            return null;
        }
    }
}
