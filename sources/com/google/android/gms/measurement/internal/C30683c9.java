package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import androidx.annotation.C0348i1;
import androidx.annotation.C0353k0;
import androidx.annotation.C0359n0;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.C40747e;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.common.stats.C40954b;
import com.google.android.gms.common.util.C40974d0;

@C40974d0
/* renamed from: com.google.android.gms.measurement.internal.c9 */
public final class C30683c9 implements ServiceConnection, C40747e.C40748a, C40747e.C40749b {

    /* renamed from: c */
    public volatile boolean f73267c;

    /* renamed from: d */
    public volatile C30851q3 f73268d;

    /* renamed from: e */
    public final /* synthetic */ C30696d9 f73269e;

    public C30683c9(C30696d9 d9Var) {
        this.f73269e = d9Var;
    }

    @C0353k0
    /* renamed from: H0 */
    public final void mo86926H0(int i) {
        C40843u.m166197g("MeasurementServiceConnection.onConnectionSuspended");
        this.f73269e.f74136a.mo86903d().mo87488q().mo87463a("Service connection suspended");
        this.f73269e.f74136a.mo86904f().mo86950z(new C30657a9(this));
    }

    @C0353k0
    /* renamed from: O0 */
    public final void mo86927O0(@C0359n0 ConnectionResult connectionResult) {
        C40843u.m166197g("MeasurementServiceConnection.onConnectionFailed");
        C30899u3 E = this.f73269e.f74136a.mo87102E();
        if (E != null) {
            E.mo87494w().mo87464b("Service connection failed", connectionResult);
        }
        synchronized (this) {
            this.f73267c = false;
            this.f73268d = null;
        }
        this.f73269e.f74136a.mo86904f().mo86950z(new C30670b9(this));
    }

    @C0348i1
    /* renamed from: b */
    public final void mo86928b(Intent intent) {
        this.f73269e.mo86866h();
        Context c = this.f73269e.f74136a.mo86902c();
        C40954b b = C40954b.m166547b();
        synchronized (this) {
            if (this.f73267c) {
                this.f73269e.f74136a.mo86903d().mo87493v().mo87463a("Connection attempt already in progress");
                return;
            }
            this.f73269e.f74136a.mo86903d().mo87493v().mo87463a("Using local app measurement service");
            this.f73267c = true;
            b.mo134751a(c, intent, this.f73269e.f73338c, 129);
        }
    }

    @C0348i1
    /* renamed from: c */
    public final void mo86929c() {
        this.f73269e.mo86866h();
        Context c = this.f73269e.f74136a.mo86902c();
        synchronized (this) {
            if (this.f73267c) {
                this.f73269e.f74136a.mo86903d().mo87493v().mo87463a("Connection attempt already in progress");
            } else if (this.f73268d == null || (!this.f73268d.mo134357e() && !this.f73268d.mo134352a())) {
                this.f73268d = new C30851q3(c, Looper.getMainLooper(), this, this);
                this.f73269e.f74136a.mo86903d().mo87493v().mo87463a("Connecting to remote service");
                this.f73267c = true;
                C40843u.m166202l(this.f73268d);
                this.f73268d.mo134372y();
            } else {
                this.f73269e.f74136a.mo86903d().mo87493v().mo87463a("Already awaiting connection attempt");
            }
        }
    }

    @C0348i1
    /* renamed from: d */
    public final void mo86930d() {
        if (this.f73268d != null && (this.f73268d.mo134352a() || this.f73268d.mo134357e())) {
            this.f73268d.mo134358f();
        }
        this.f73268d = null;
    }

    @C0353k0
    /* renamed from: m0 */
    public final void mo86931m0(Bundle bundle) {
        C40843u.m166197g("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                C40843u.m166202l(this.f73268d);
                this.f73269e.f74136a.mo86904f().mo86950z(new C30964z8(this, (C30779k3) this.f73268d.mo134340M()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.f73268d = null;
                this.f73267c = false;
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:20|21) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r3.f73269e.f74136a.mo86903d().mo87489r().mo87463a("Service connect failed to get IMeasurementService");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0065 */
    @androidx.annotation.C0353k0
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onServiceConnected(android.content.ComponentName r4, android.os.IBinder r5) {
        /*
            r3 = this;
            java.lang.String r4 = "MeasurementServiceConnection.onServiceConnected"
            com.google.android.gms.common.internal.C40843u.m166197g(r4)
            monitor-enter(r3)
            r4 = 0
            if (r5 != 0) goto L_0x001e
            r3.f73267c = r4     // Catch:{ all -> 0x0063 }
            com.google.android.gms.measurement.internal.d9 r4 = r3.f73269e     // Catch:{ all -> 0x0063 }
            com.google.android.gms.measurement.internal.g5 r4 = r4.f74136a     // Catch:{ all -> 0x0063 }
            com.google.android.gms.measurement.internal.u3 r4 = r4.mo86903d()     // Catch:{ all -> 0x0063 }
            com.google.android.gms.measurement.internal.s3 r4 = r4.mo87489r()     // Catch:{ all -> 0x0063 }
            java.lang.String r5 = "Service connected with null binder"
            r4.mo87463a(r5)     // Catch:{ all -> 0x0063 }
            monitor-exit(r3)     // Catch:{ all -> 0x0063 }
            return
        L_0x001e:
            r0 = 0
            java.lang.String r1 = r5.getInterfaceDescriptor()     // Catch:{ RemoteException -> 0x0065 }
            java.lang.String r2 = "com.google.android.gms.measurement.internal.IMeasurementService"
            boolean r2 = r2.equals(r1)     // Catch:{ RemoteException -> 0x0065 }
            if (r2 == 0) goto L_0x0051
            java.lang.String r1 = "com.google.android.gms.measurement.internal.IMeasurementService"
            android.os.IInterface r1 = r5.queryLocalInterface(r1)     // Catch:{ RemoteException -> 0x0065 }
            boolean r2 = r1 instanceof com.google.android.gms.measurement.internal.C30779k3     // Catch:{ RemoteException -> 0x0065 }
            if (r2 == 0) goto L_0x0039
            com.google.android.gms.measurement.internal.k3 r1 = (com.google.android.gms.measurement.internal.C30779k3) r1     // Catch:{ RemoteException -> 0x0065 }
        L_0x0037:
            r0 = r1
            goto L_0x003f
        L_0x0039:
            com.google.android.gms.measurement.internal.i3 r1 = new com.google.android.gms.measurement.internal.i3     // Catch:{ RemoteException -> 0x0065 }
            r1.<init>(r5)     // Catch:{ RemoteException -> 0x0065 }
            goto L_0x0037
        L_0x003f:
            com.google.android.gms.measurement.internal.d9 r5 = r3.f73269e     // Catch:{ RemoteException -> 0x0065 }
            com.google.android.gms.measurement.internal.g5 r5 = r5.f74136a     // Catch:{ RemoteException -> 0x0065 }
            com.google.android.gms.measurement.internal.u3 r5 = r5.mo86903d()     // Catch:{ RemoteException -> 0x0065 }
            com.google.android.gms.measurement.internal.s3 r5 = r5.mo87493v()     // Catch:{ RemoteException -> 0x0065 }
            java.lang.String r1 = "Bound to IMeasurementService interface"
            r5.mo87463a(r1)     // Catch:{ RemoteException -> 0x0065 }
            goto L_0x0076
        L_0x0051:
            com.google.android.gms.measurement.internal.d9 r5 = r3.f73269e     // Catch:{ RemoteException -> 0x0065 }
            com.google.android.gms.measurement.internal.g5 r5 = r5.f74136a     // Catch:{ RemoteException -> 0x0065 }
            com.google.android.gms.measurement.internal.u3 r5 = r5.mo86903d()     // Catch:{ RemoteException -> 0x0065 }
            com.google.android.gms.measurement.internal.s3 r5 = r5.mo87489r()     // Catch:{ RemoteException -> 0x0065 }
            java.lang.String r2 = "Got binder with a wrong descriptor"
            r5.mo87464b(r2, r1)     // Catch:{ RemoteException -> 0x0065 }
            goto L_0x0076
        L_0x0063:
            r4 = move-exception
            goto L_0x00a2
        L_0x0065:
            com.google.android.gms.measurement.internal.d9 r5 = r3.f73269e     // Catch:{ all -> 0x0063 }
            com.google.android.gms.measurement.internal.g5 r5 = r5.f74136a     // Catch:{ all -> 0x0063 }
            com.google.android.gms.measurement.internal.u3 r5 = r5.mo86903d()     // Catch:{ all -> 0x0063 }
            com.google.android.gms.measurement.internal.s3 r5 = r5.mo87489r()     // Catch:{ all -> 0x0063 }
            java.lang.String r1 = "Service connect failed to get IMeasurementService"
            r5.mo87463a(r1)     // Catch:{ all -> 0x0063 }
        L_0x0076:
            if (r0 != 0) goto L_0x0090
            r3.f73267c = r4     // Catch:{ all -> 0x0063 }
            com.google.android.gms.common.stats.b r4 = com.google.android.gms.common.stats.C40954b.m166547b()     // Catch:{ IllegalArgumentException -> 0x00a0 }
            com.google.android.gms.measurement.internal.d9 r5 = r3.f73269e     // Catch:{ IllegalArgumentException -> 0x00a0 }
            com.google.android.gms.measurement.internal.g5 r5 = r5.f74136a     // Catch:{ IllegalArgumentException -> 0x00a0 }
            android.content.Context r5 = r5.mo86902c()     // Catch:{ IllegalArgumentException -> 0x00a0 }
            com.google.android.gms.measurement.internal.d9 r0 = r3.f73269e     // Catch:{ IllegalArgumentException -> 0x00a0 }
            com.google.android.gms.measurement.internal.c9 r0 = r0.f73338c     // Catch:{ IllegalArgumentException -> 0x00a0 }
            r4.mo134752c(r5, r0)     // Catch:{ IllegalArgumentException -> 0x00a0 }
            goto L_0x00a0
        L_0x0090:
            com.google.android.gms.measurement.internal.d9 r4 = r3.f73269e     // Catch:{ all -> 0x0063 }
            com.google.android.gms.measurement.internal.g5 r4 = r4.f74136a     // Catch:{ all -> 0x0063 }
            com.google.android.gms.measurement.internal.d5 r4 = r4.mo86904f()     // Catch:{ all -> 0x0063 }
            com.google.android.gms.measurement.internal.x8 r5 = new com.google.android.gms.measurement.internal.x8     // Catch:{ all -> 0x0063 }
            r5.<init>(r3, r0)     // Catch:{ all -> 0x0063 }
            r4.mo86950z(r5)     // Catch:{ all -> 0x0063 }
        L_0x00a0:
            monitor-exit(r3)     // Catch:{ all -> 0x0063 }
            return
        L_0x00a2:
            monitor-exit(r3)     // Catch:{ all -> 0x0063 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C30683c9.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
    }

    @C0353k0
    public final void onServiceDisconnected(ComponentName componentName) {
        C40843u.m166197g("MeasurementServiceConnection.onServiceDisconnected");
        this.f73269e.f74136a.mo86903d().mo87488q().mo87463a("Service disconnected");
        this.f73269e.f74136a.mo86904f().mo86950z(new C30952y8(this, componentName));
    }
}
