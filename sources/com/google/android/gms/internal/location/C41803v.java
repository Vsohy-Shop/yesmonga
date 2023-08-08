package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.content.Context;
import android.location.Location;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.api.internal.C40592n;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.location.C30354k;
import com.google.android.gms.location.C30358l;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.location.v */
public final class C41803v {

    /* renamed from: a */
    public final C41762e0<C41785m> f105921a;

    /* renamed from: b */
    public final Context f105922b;

    /* renamed from: c */
    public boolean f105923c = false;

    /* renamed from: d */
    public final Map<C40592n.C40593a<C30358l>, C41801u> f105924d = new HashMap();

    /* renamed from: e */
    public final Map<C40592n.C40593a, C41797s> f105925e = new HashMap();

    /* renamed from: f */
    public final Map<C40592n.C40593a<C30354k>, C41795r> f105926f = new HashMap();

    public C41803v(Context context, C41762e0<C41785m> e0Var) {
        this.f105922b = context;
        this.f105921a = e0Var;
    }

    /* renamed from: a */
    public final Location mo136227a(String str) throws RemoteException {
        ((C41804v0) this.f105921a).f105927a.mo134373z();
        return ((C41804v0) this.f105921a).mo136242a().mo136213x2(str);
    }

    @Deprecated
    /* renamed from: b */
    public final Location mo136228b() throws RemoteException {
        ((C41804v0) this.f105921a).f105927a.mo134373z();
        return ((C41804v0) this.f105921a).mo136242a().mo136209r();
    }

    /* renamed from: c */
    public final LocationAvailability mo136229c() throws RemoteException {
        ((C41804v0) this.f105921a).f105927a.mo134373z();
        return ((C41804v0) this.f105921a).mo136242a().mo136195I5(this.f105922b.getPackageName());
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [android.os.IBinder] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo136230d(com.google.android.gms.location.LocationRequest r12, com.google.android.gms.common.api.internal.C40592n<com.google.android.gms.location.C30358l> r13, com.google.android.gms.internal.location.C41773i r14) throws android.os.RemoteException {
        /*
            r11 = this;
            com.google.android.gms.internal.location.e0<com.google.android.gms.internal.location.m> r0 = r11.f105921a
            com.google.android.gms.internal.location.v0 r0 = (com.google.android.gms.internal.location.C41804v0) r0
            com.google.android.gms.internal.location.w0 r0 = r0.f105927a
            r0.mo134373z()
            com.google.android.gms.common.api.internal.n$a r0 = r13.mo133987b()
            r1 = 0
            if (r0 != 0) goto L_0x0012
            r7 = r1
            goto L_0x002b
        L_0x0012:
            java.util.Map<com.google.android.gms.common.api.internal.n$a<com.google.android.gms.location.l>, com.google.android.gms.internal.location.u> r2 = r11.f105924d
            monitor-enter(r2)
            java.util.Map<com.google.android.gms.common.api.internal.n$a<com.google.android.gms.location.l>, com.google.android.gms.internal.location.u> r3 = r11.f105924d     // Catch:{ all -> 0x0048 }
            java.lang.Object r3 = r3.get(r0)     // Catch:{ all -> 0x0048 }
            com.google.android.gms.internal.location.u r3 = (com.google.android.gms.internal.location.C41801u) r3     // Catch:{ all -> 0x0048 }
            if (r3 != 0) goto L_0x0024
            com.google.android.gms.internal.location.u r3 = new com.google.android.gms.internal.location.u     // Catch:{ all -> 0x0048 }
            r3.<init>(r13)     // Catch:{ all -> 0x0048 }
        L_0x0024:
            java.util.Map<com.google.android.gms.common.api.internal.n$a<com.google.android.gms.location.l>, com.google.android.gms.internal.location.u> r13 = r11.f105924d     // Catch:{ all -> 0x0048 }
            r13.put(r0, r3)     // Catch:{ all -> 0x0048 }
            monitor-exit(r2)     // Catch:{ all -> 0x0048 }
            r7 = r3
        L_0x002b:
            if (r7 != 0) goto L_0x002e
            return
        L_0x002e:
            com.google.android.gms.internal.location.e0<com.google.android.gms.internal.location.m> r13 = r11.f105921a
            com.google.android.gms.internal.location.v0 r13 = (com.google.android.gms.internal.location.C41804v0) r13
            com.google.android.gms.internal.location.m r13 = r13.mo136242a()
            com.google.android.gms.internal.location.zzba r6 = com.google.android.gms.internal.location.zzba.m169191M(r1, r12)
            com.google.android.gms.internal.location.zzbc r12 = new com.google.android.gms.internal.location.zzbc
            r5 = 1
            r8 = 0
            r9 = 0
            r4 = r12
            r10 = r14
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r13.mo136207p1(r12)
            return
        L_0x0048:
            r12 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0048 }
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.location.C41803v.mo136230d(com.google.android.gms.location.LocationRequest, com.google.android.gms.common.api.internal.n, com.google.android.gms.internal.location.i):void");
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [android.os.IBinder] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo136231e(com.google.android.gms.internal.location.zzba r11, com.google.android.gms.common.api.internal.C40592n<com.google.android.gms.location.C30354k> r12, com.google.android.gms.internal.location.C41773i r13) throws android.os.RemoteException {
        /*
            r10 = this;
            com.google.android.gms.internal.location.e0<com.google.android.gms.internal.location.m> r0 = r10.f105921a
            com.google.android.gms.internal.location.v0 r0 = (com.google.android.gms.internal.location.C41804v0) r0
            com.google.android.gms.internal.location.w0 r0 = r0.f105927a
            r0.mo134373z()
            com.google.android.gms.common.api.internal.n$a r0 = r12.mo133987b()
            if (r0 != 0) goto L_0x0012
            r12 = 0
        L_0x0010:
            r8 = r12
            goto L_0x002c
        L_0x0012:
            java.util.Map<com.google.android.gms.common.api.internal.n$a<com.google.android.gms.location.k>, com.google.android.gms.internal.location.r> r1 = r10.f105926f
            monitor-enter(r1)
            java.util.Map<com.google.android.gms.common.api.internal.n$a<com.google.android.gms.location.k>, com.google.android.gms.internal.location.r> r2 = r10.f105926f     // Catch:{ all -> 0x0046 }
            java.lang.Object r2 = r2.get(r0)     // Catch:{ all -> 0x0046 }
            com.google.android.gms.internal.location.r r2 = (com.google.android.gms.internal.location.C41795r) r2     // Catch:{ all -> 0x0046 }
            if (r2 != 0) goto L_0x0024
            com.google.android.gms.internal.location.r r2 = new com.google.android.gms.internal.location.r     // Catch:{ all -> 0x0046 }
            r2.<init>(r12)     // Catch:{ all -> 0x0046 }
        L_0x0024:
            r12 = r2
            java.util.Map<com.google.android.gms.common.api.internal.n$a<com.google.android.gms.location.k>, com.google.android.gms.internal.location.r> r2 = r10.f105926f     // Catch:{ all -> 0x0046 }
            r2.put(r0, r12)     // Catch:{ all -> 0x0046 }
            monitor-exit(r1)     // Catch:{ all -> 0x0046 }
            goto L_0x0010
        L_0x002c:
            if (r8 != 0) goto L_0x002f
            return
        L_0x002f:
            com.google.android.gms.internal.location.e0<com.google.android.gms.internal.location.m> r12 = r10.f105921a
            com.google.android.gms.internal.location.v0 r12 = (com.google.android.gms.internal.location.C41804v0) r12
            com.google.android.gms.internal.location.m r12 = r12.mo136242a()
            com.google.android.gms.internal.location.zzbc r0 = new com.google.android.gms.internal.location.zzbc
            r4 = 1
            r6 = 0
            r7 = 0
            r3 = r0
            r5 = r11
            r9 = r13
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r12.mo136207p1(r0)
            return
        L_0x0046:
            r11 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0046 }
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.location.C41803v.mo136231e(com.google.android.gms.internal.location.zzba, com.google.android.gms.common.api.internal.n, com.google.android.gms.internal.location.i):void");
    }

    /* renamed from: f */
    public final void mo136232f(zzba zzba, PendingIntent pendingIntent, C41773i iVar) throws RemoteException {
        ((C41804v0) this.f105921a).f105927a.mo134373z();
        ((C41804v0) this.f105921a).mo136242a().mo136207p1(zzbc.m169196Q(zzba, pendingIntent, iVar));
    }

    /* renamed from: g */
    public final void mo136233g(LocationRequest locationRequest, PendingIntent pendingIntent, C41773i iVar) throws RemoteException {
        ((C41804v0) this.f105921a).f105927a.mo134373z();
        ((C41804v0) this.f105921a).mo136242a().mo136207p1(zzbc.m169196Q(zzba.m169191M((String) null, locationRequest), pendingIntent, iVar));
    }

    /* renamed from: h */
    public final void mo136234h(C40592n.C40593a<C30358l> aVar, C41773i iVar) throws RemoteException {
        ((C41804v0) this.f105921a).f105927a.mo134373z();
        C40843u.m166203m(aVar, "Invalid null listener key");
        synchronized (this.f105924d) {
            C41801u remove = this.f105924d.remove(aVar);
            if (remove != null) {
                remove.mo136226d();
                ((C41804v0) this.f105921a).mo136242a().mo136207p1(zzbc.m169195M(remove, iVar));
            }
        }
    }

    /* renamed from: i */
    public final void mo136235i(C40592n.C40593a<C30354k> aVar, C41773i iVar) throws RemoteException {
        ((C41804v0) this.f105921a).f105927a.mo134373z();
        C40843u.m166203m(aVar, "Invalid null listener key");
        synchronized (this.f105926f) {
            C41795r remove = this.f105926f.remove(aVar);
            if (remove != null) {
                remove.mo136225d();
                ((C41804v0) this.f105921a).mo136242a().mo136207p1(zzbc.m169197W(remove, iVar));
            }
        }
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [android.os.IBinder] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo136236j(android.app.PendingIntent r10, com.google.android.gms.internal.location.C41773i r11) throws android.os.RemoteException {
        /*
            r9 = this;
            com.google.android.gms.internal.location.e0<com.google.android.gms.internal.location.m> r0 = r9.f105921a
            com.google.android.gms.internal.location.v0 r0 = (com.google.android.gms.internal.location.C41804v0) r0
            com.google.android.gms.internal.location.w0 r0 = r0.f105927a
            r0.mo134373z()
            com.google.android.gms.internal.location.e0<com.google.android.gms.internal.location.m> r0 = r9.f105921a
            com.google.android.gms.internal.location.v0 r0 = (com.google.android.gms.internal.location.C41804v0) r0
            com.google.android.gms.internal.location.m r0 = r0.mo136242a()
            com.google.android.gms.internal.location.zzbc r8 = new com.google.android.gms.internal.location.zzbc
            r2 = 2
            r3 = 0
            r4 = 0
            r6 = 0
            r1 = r8
            r5 = r10
            r7 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r0.mo136207p1(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.location.C41803v.mo136236j(android.app.PendingIntent, com.google.android.gms.internal.location.i):void");
    }

    /* renamed from: k */
    public final void mo136237k(boolean z) throws RemoteException {
        ((C41804v0) this.f105921a).f105927a.mo134373z();
        ((C41804v0) this.f105921a).mo136242a().mo136206n(z);
        this.f105923c = z;
    }

    /* renamed from: l */
    public final void mo136238l(Location location) throws RemoteException {
        ((C41804v0) this.f105921a).f105927a.mo134373z();
        ((C41804v0) this.f105921a).mo136242a().mo136204k3(location);
    }

    /* renamed from: m */
    public final void mo136239m(C41773i iVar) throws RemoteException {
        ((C41804v0) this.f105921a).f105927a.mo134373z();
        ((C41804v0) this.f105921a).mo136242a().mo136199X3(iVar);
    }

    /* renamed from: n */
    public final void mo136240n() throws RemoteException {
        synchronized (this.f105924d) {
            for (C41801u next : this.f105924d.values()) {
                if (next != null) {
                    ((C41804v0) this.f105921a).mo136242a().mo136207p1(zzbc.m169195M(next, (C41773i) null));
                }
            }
            this.f105924d.clear();
        }
        synchronized (this.f105926f) {
            for (C41795r next2 : this.f105926f.values()) {
                if (next2 != null) {
                    ((C41804v0) this.f105921a).mo136242a().mo136207p1(zzbc.m169197W(next2, (C41773i) null));
                }
            }
            this.f105926f.clear();
        }
        synchronized (this.f105925e) {
            for (C41797s next3 : this.f105925e.values()) {
                if (next3 != null) {
                    ((C41804v0) this.f105921a).mo136242a().mo136196P2(new zzl(2, (zzj) null, next3, (IBinder) null));
                }
            }
            this.f105925e.clear();
        }
    }

    /* renamed from: o */
    public final void mo136241o() throws RemoteException {
        if (this.f105923c) {
            mo136237k(false);
        }
    }
}
