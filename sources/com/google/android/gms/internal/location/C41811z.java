package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.content.Context;
import android.location.Location;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.C40507i;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C40538e;
import com.google.android.gms.common.api.internal.C40592n;
import com.google.android.gms.common.api.internal.C40645x;
import com.google.android.gms.common.internal.C40756f;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.common.util.C40965b;
import com.google.android.gms.location.ActivityTransitionRequest;
import com.google.android.gms.location.C30345h2;
import com.google.android.gms.location.C30354k;
import com.google.android.gms.location.C30358l;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResult;
import com.google.android.gms.location.zzbq;
import java.util.List;

/* renamed from: com.google.android.gms.internal.location.z */
public final class C41811z extends C41806w0 {

    /* renamed from: S */
    public final C41803v f105933S;

    public C41811z(Context context, Looper looper, C40507i.C40509b bVar, C40507i.C40510c cVar, String str, C40756f fVar) {
        super(context, looper, bVar, cVar, str, fVar);
        this.f105933S = new C41803v(context, this.f105930R);
    }

    /* renamed from: A0 */
    public final void mo136248A0(C40592n.C40593a<C30358l> aVar, C41773i iVar) throws RemoteException {
        this.f105933S.mo136234h(aVar, iVar);
    }

    /* renamed from: B0 */
    public final void mo136249B0(PendingIntent pendingIntent, C41773i iVar) throws RemoteException {
        this.f105933S.mo136236j(pendingIntent, iVar);
    }

    /* renamed from: C0 */
    public final void mo136250C0(C40592n.C40593a<C30354k> aVar, C41773i iVar) throws RemoteException {
        this.f105933S.mo136235i(aVar, iVar);
    }

    /* renamed from: D0 */
    public final void mo136251D0(boolean z) throws RemoteException {
        this.f105933S.mo136237k(z);
    }

    /* renamed from: E0 */
    public final void mo136252E0(Location location) throws RemoteException {
        this.f105933S.mo136238l(location);
    }

    /* renamed from: F0 */
    public final void mo136253F0(C41773i iVar) throws RemoteException {
        this.f105933S.mo136239m(iVar);
    }

    /* renamed from: G0 */
    public final void mo136254G0(LocationSettingsRequest locationSettingsRequest, C40538e.C40540b<LocationSettingsResult> bVar, String str) throws RemoteException {
        boolean z;
        mo134373z();
        boolean z2 = true;
        if (locationSettingsRequest != null) {
            z = true;
        } else {
            z = false;
        }
        C40843u.m166192b(z, "locationSettingsRequest can't be null nor empty.");
        if (bVar == null) {
            z2 = false;
        }
        C40843u.m166192b(z2, "listener can't be null.");
        ((C41785m) mo134340M()).mo136200b1(locationSettingsRequest, new C41809y(bVar), (String) null);
    }

    /* renamed from: H0 */
    public final void mo136255H0(long j, PendingIntent pendingIntent) throws RemoteException {
        boolean z;
        mo134373z();
        C40843u.m166202l(pendingIntent);
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        C40843u.m166192b(z, "detectionIntervalMillis must be >= 0");
        ((C41785m) mo134340M()).mo136198S6(j, true, pendingIntent);
    }

    /* renamed from: I0 */
    public final void mo136256I0(ActivityTransitionRequest activityTransitionRequest, PendingIntent pendingIntent, C40538e.C40540b<Status> bVar) throws RemoteException {
        mo134373z();
        C40843u.m166203m(activityTransitionRequest, "activityTransitionRequest must be specified.");
        C40843u.m166203m(pendingIntent, "PendingIntent must be specified.");
        C40843u.m166203m(bVar, "ResultHolder not provided.");
        ((C41785m) mo134340M()).mo136203f4(activityTransitionRequest, pendingIntent, new C40645x(bVar));
    }

    /* renamed from: J0 */
    public final void mo136257J0(PendingIntent pendingIntent, C40538e.C40540b<Status> bVar) throws RemoteException {
        mo134373z();
        C40843u.m166203m(bVar, "ResultHolder not provided.");
        ((C41785m) mo134340M()).mo136205l1(pendingIntent, new C40645x(bVar));
    }

    /* renamed from: K0 */
    public final void mo136258K0(PendingIntent pendingIntent) throws RemoteException {
        mo134373z();
        C40843u.m166202l(pendingIntent);
        ((C41785m) mo134340M()).mo136201d6(pendingIntent);
    }

    /* renamed from: L0 */
    public final void mo136259L0(PendingIntent pendingIntent, C40538e.C40540b<Status> bVar) throws RemoteException {
        mo134373z();
        C40843u.m166203m(pendingIntent, "PendingIntent must be specified.");
        C40843u.m166203m(bVar, "ResultHolder not provided.");
        ((C41785m) mo134340M()).mo136211w2(pendingIntent, new C40645x(bVar));
    }

    /* renamed from: M0 */
    public final void mo136260M0(GeofencingRequest geofencingRequest, PendingIntent pendingIntent, C40538e.C40540b<Status> bVar) throws RemoteException {
        mo134373z();
        C40843u.m166203m(geofencingRequest, "geofencingRequest can't be null.");
        C40843u.m166203m(pendingIntent, "PendingIntent must be specified.");
        C40843u.m166203m(bVar, "ResultHolder not provided.");
        ((C41785m) mo134340M()).mo136202d8(geofencingRequest, pendingIntent, new C41805w(bVar));
    }

    /* renamed from: N0 */
    public final void mo136261N0(zzbq zzbq, C40538e.C40540b<Status> bVar) throws RemoteException {
        mo134373z();
        C40843u.m166203m(zzbq, "removeGeofencingRequest can't be null.");
        C40843u.m166203m(bVar, "ResultHolder not provided.");
        ((C41785m) mo134340M()).mo136197Q6(zzbq, new C41807x(bVar));
    }

    /* renamed from: O0 */
    public final void mo136262O0(PendingIntent pendingIntent, C40538e.C40540b<Status> bVar) throws RemoteException {
        mo134373z();
        C40843u.m166203m(pendingIntent, "PendingIntent must be specified.");
        C40843u.m166203m(bVar, "ResultHolder not provided.");
        ((C41785m) mo134340M()).mo136210v8(pendingIntent, new C41807x(bVar), mo134335G().getPackageName());
    }

    /* renamed from: P0 */
    public final void mo136263P0(List<String> list, C40538e.C40540b<Status> bVar) throws RemoteException {
        boolean z;
        mo134373z();
        if (list == null || list.size() <= 0) {
            z = false;
        } else {
            z = true;
        }
        C40843u.m166192b(z, "geofenceRequestIds can't be null nor empty.");
        C40843u.m166203m(bVar, "ResultHolder not provided.");
        ((C41785m) mo134340M()).mo136208q3((String[]) list.toArray(new String[0]), new C41807x(bVar), mo134335G().getPackageName());
    }

    /* renamed from: Q0 */
    public final Location mo136264Q0(String str) throws RemoteException {
        if (C40965b.m166578d(mo134369u(), C30345h2.f72802c)) {
            return this.f105933S.mo136227a(str);
        }
        return this.f105933S.mo136228b();
    }

    /* renamed from: a0 */
    public final boolean mo134353a0() {
        return true;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:2|3|(2:5|6)|7|8|9) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0013 */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo134358f() {
        /*
            r2 = this;
            com.google.android.gms.internal.location.v r0 = r2.f105933S
            monitor-enter(r0)
            boolean r1 = r2.mo134352a()     // Catch:{ all -> 0x0018 }
            if (r1 == 0) goto L_0x0013
            com.google.android.gms.internal.location.v r1 = r2.f105933S     // Catch:{ Exception -> 0x0013 }
            r1.mo136240n()     // Catch:{ Exception -> 0x0013 }
            com.google.android.gms.internal.location.v r1 = r2.f105933S     // Catch:{ Exception -> 0x0013 }
            r1.mo136241o()     // Catch:{ Exception -> 0x0013 }
        L_0x0013:
            super.mo134358f()     // Catch:{ all -> 0x0018 }
            monitor-exit(r0)     // Catch:{ all -> 0x0018 }
            return
        L_0x0018:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0018 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.location.C41811z.mo134358f():void");
    }

    /* renamed from: v0 */
    public final LocationAvailability mo136265v0() throws RemoteException {
        return this.f105933S.mo136229c();
    }

    /* renamed from: w0 */
    public final void mo136266w0(zzba zzba, C40592n<C30354k> nVar, C41773i iVar) throws RemoteException {
        synchronized (this.f105933S) {
            this.f105933S.mo136231e(zzba, nVar, iVar);
        }
    }

    /* renamed from: x0 */
    public final void mo136267x0(LocationRequest locationRequest, C40592n<C30358l> nVar, C41773i iVar) throws RemoteException {
        synchronized (this.f105933S) {
            this.f105933S.mo136230d(locationRequest, nVar, iVar);
        }
    }

    /* renamed from: y0 */
    public final void mo136268y0(zzba zzba, PendingIntent pendingIntent, C41773i iVar) throws RemoteException {
        this.f105933S.mo136232f(zzba, pendingIntent, iVar);
    }

    /* renamed from: z0 */
    public final void mo136269z0(LocationRequest locationRequest, PendingIntent pendingIntent, C41773i iVar) throws RemoteException {
        this.f105933S.mo136233g(locationRequest, pendingIntent, iVar);
    }
}
