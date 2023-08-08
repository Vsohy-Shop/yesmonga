package com.google.firebase.messaging;

import android.content.Context;
import android.util.Log;
import androidx.annotation.C0323b0;
import androidx.annotation.C0344h1;
import androidx.annotation.C0348i1;
import androidx.annotation.C0359n0;
import androidx.collection.C1866a;
import com.google.android.gms.tasks.C31047k;
import com.google.android.gms.tasks.C31049l;
import com.google.android.gms.tasks.C31053n;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.firebase.messaging.e1 */
public class C33179e1 {

    /* renamed from: i */
    public static final String f80547i = "INTERNAL_SERVER_ERROR";

    /* renamed from: j */
    public static final String f80548j = "SERVICE_NOT_AVAILABLE";

    /* renamed from: k */
    public static final long f80549k = 30;

    /* renamed from: l */
    public static final long f80550l = 30;

    /* renamed from: m */
    public static final long f80551m = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: a */
    public final Context f80552a;

    /* renamed from: b */
    public final C33206k0 f80553b;

    /* renamed from: c */
    public final C33188f0 f80554c;

    /* renamed from: d */
    public final FirebaseMessaging f80555d;
    @C0323b0("pendingOperations")

    /* renamed from: e */
    public final Map<String, ArrayDeque<C31049l<Void>>> f80556e = new C1866a();

    /* renamed from: f */
    public final ScheduledExecutorService f80557f;
    @C0323b0("this")

    /* renamed from: g */
    public boolean f80558g = false;

    /* renamed from: h */
    public final C33172c1 f80559h;

    public C33179e1(FirebaseMessaging firebaseMessaging, C33206k0 k0Var, C33172c1 c1Var, C33188f0 f0Var, Context context, @C0359n0 ScheduledExecutorService scheduledExecutorService) {
        this.f80555d = firebaseMessaging;
        this.f80553b = k0Var;
        this.f80559h = c1Var;
        this.f80554c = f0Var;
        this.f80552a = context;
        this.f80557f = scheduledExecutorService;
    }

    @C0348i1
    /* renamed from: c */
    public static <T> void m133836c(C31047k<T> kVar) throws IOException {
        try {
            C31053n.m124520b(kVar, 30, TimeUnit.SECONDS);
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            } else if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else {
                throw new IOException(e);
            }
        } catch (InterruptedException | TimeoutException e2) {
            throw new IOException("SERVICE_NOT_AVAILABLE", e2);
        }
    }

    @C0344h1
    /* renamed from: f */
    public static C31047k<C33179e1> m133837f(FirebaseMessaging firebaseMessaging, C33206k0 k0Var, C33188f0 f0Var, Context context, @C0359n0 ScheduledExecutorService scheduledExecutorService) {
        return C31053n.m124522d(scheduledExecutorService, new C33175d1(context, scheduledExecutorService, firebaseMessaging, k0Var, f0Var));
    }

    /* renamed from: i */
    public static boolean m133838i() {
        if (!Log.isLoggable("FirebaseMessaging", 3)) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    public static /* synthetic */ C33179e1 m133839k(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseMessaging firebaseMessaging, C33206k0 k0Var, C33188f0 f0Var) throws Exception {
        return new C33179e1(firebaseMessaging, k0Var, C33172c1.m133807d(context, scheduledExecutorService), f0Var, context, scheduledExecutorService);
    }

    /* renamed from: b */
    public final void mo96052b(C33168b1 b1Var, C31049l<Void> lVar) {
        ArrayDeque arrayDeque;
        synchronized (this.f80556e) {
            String e = b1Var.mo96035e();
            if (this.f80556e.containsKey(e)) {
                arrayDeque = this.f80556e.get(e);
            } else {
                ArrayDeque arrayDeque2 = new ArrayDeque();
                this.f80556e.put(e, arrayDeque2);
                arrayDeque = arrayDeque2;
            }
            arrayDeque.add(lVar);
        }
    }

    @C0348i1
    /* renamed from: d */
    public final void mo96053d(String str) throws IOException {
        m133836c(this.f80554c.mo96076l(this.f80555d.mo95940n(), str));
    }

    @C0348i1
    /* renamed from: e */
    public final void mo96054e(String str) throws IOException {
        m133836c(this.f80554c.mo96077m(this.f80555d.mo95940n(), str));
    }

    @C0344h1
    /* renamed from: g */
    public C33172c1 mo96055g() {
        return this.f80559h;
    }

    /* renamed from: h */
    public boolean mo96056h() {
        return this.f80559h.mo96046e() != null;
    }

    /* renamed from: j */
    public synchronized boolean mo96057j() {
        return this.f80558g;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0031, code lost:
        return;
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo96058l(com.google.firebase.messaging.C33168b1 r5) {
        /*
            r4 = this;
            java.util.Map<java.lang.String, java.util.ArrayDeque<com.google.android.gms.tasks.l<java.lang.Void>>> r0 = r4.f80556e
            monitor-enter(r0)
            java.lang.String r5 = r5.mo96035e()     // Catch:{ all -> 0x0032 }
            java.util.Map<java.lang.String, java.util.ArrayDeque<com.google.android.gms.tasks.l<java.lang.Void>>> r1 = r4.f80556e     // Catch:{ all -> 0x0032 }
            boolean r1 = r1.containsKey(r5)     // Catch:{ all -> 0x0032 }
            if (r1 != 0) goto L_0x0011
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            return
        L_0x0011:
            java.util.Map<java.lang.String, java.util.ArrayDeque<com.google.android.gms.tasks.l<java.lang.Void>>> r1 = r4.f80556e     // Catch:{ all -> 0x0032 }
            java.lang.Object r1 = r1.get(r5)     // Catch:{ all -> 0x0032 }
            java.util.ArrayDeque r1 = (java.util.ArrayDeque) r1     // Catch:{ all -> 0x0032 }
            java.lang.Object r2 = r1.poll()     // Catch:{ all -> 0x0032 }
            com.google.android.gms.tasks.l r2 = (com.google.android.gms.tasks.C31049l) r2     // Catch:{ all -> 0x0032 }
            if (r2 == 0) goto L_0x0025
            r3 = 0
            r2.mo87743c(r3)     // Catch:{ all -> 0x0032 }
        L_0x0025:
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0032 }
            if (r1 == 0) goto L_0x0030
            java.util.Map<java.lang.String, java.util.ArrayDeque<com.google.android.gms.tasks.l<java.lang.Void>>> r1 = r4.f80556e     // Catch:{ all -> 0x0032 }
            r1.remove(r5)     // Catch:{ all -> 0x0032 }
        L_0x0030:
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            return
        L_0x0032:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.C33179e1.mo96058l(com.google.firebase.messaging.b1):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0069 A[Catch:{ IOException -> 0x008b }] */
    @androidx.annotation.C0348i1
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo96059m(com.google.firebase.messaging.C33168b1 r6) throws java.io.IOException {
        /*
            r5 = this;
            r0 = 0
            java.lang.String r1 = r6.mo96033b()     // Catch:{ IOException -> 0x008b }
            int r2 = r1.hashCode()     // Catch:{ IOException -> 0x008b }
            r3 = 83
            r4 = 1
            if (r2 == r3) goto L_0x001d
            r3 = 85
            if (r2 == r3) goto L_0x0013
            goto L_0x0027
        L_0x0013:
            java.lang.String r2 = "U"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x008b }
            if (r1 == 0) goto L_0x0027
            r1 = r4
            goto L_0x0028
        L_0x001d:
            java.lang.String r2 = "S"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x008b }
            if (r1 == 0) goto L_0x0027
            r1 = r0
            goto L_0x0028
        L_0x0027:
            r1 = -1
        L_0x0028:
            java.lang.String r2 = " succeeded."
            if (r1 == 0) goto L_0x0069
            if (r1 == r4) goto L_0x0047
            boolean r1 = m133838i()     // Catch:{ IOException -> 0x008b }
            if (r1 == 0) goto L_0x008a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x008b }
            r1.<init>()     // Catch:{ IOException -> 0x008b }
            java.lang.String r2 = "Unknown topic operation"
            r1.append(r2)     // Catch:{ IOException -> 0x008b }
            r1.append(r6)     // Catch:{ IOException -> 0x008b }
            java.lang.String r6 = "."
            r1.append(r6)     // Catch:{ IOException -> 0x008b }
            goto L_0x008a
        L_0x0047:
            java.lang.String r1 = r6.mo96034c()     // Catch:{ IOException -> 0x008b }
            r5.mo96054e(r1)     // Catch:{ IOException -> 0x008b }
            boolean r1 = m133838i()     // Catch:{ IOException -> 0x008b }
            if (r1 == 0) goto L_0x008a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x008b }
            r1.<init>()     // Catch:{ IOException -> 0x008b }
            java.lang.String r3 = "Unsubscribe from topic: "
            r1.append(r3)     // Catch:{ IOException -> 0x008b }
            java.lang.String r6 = r6.mo96034c()     // Catch:{ IOException -> 0x008b }
            r1.append(r6)     // Catch:{ IOException -> 0x008b }
            r1.append(r2)     // Catch:{ IOException -> 0x008b }
            goto L_0x008a
        L_0x0069:
            java.lang.String r1 = r6.mo96034c()     // Catch:{ IOException -> 0x008b }
            r5.mo96053d(r1)     // Catch:{ IOException -> 0x008b }
            boolean r1 = m133838i()     // Catch:{ IOException -> 0x008b }
            if (r1 == 0) goto L_0x008a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x008b }
            r1.<init>()     // Catch:{ IOException -> 0x008b }
            java.lang.String r3 = "Subscribe to topic: "
            r1.append(r3)     // Catch:{ IOException -> 0x008b }
            java.lang.String r6 = r6.mo96034c()     // Catch:{ IOException -> 0x008b }
            r1.append(r6)     // Catch:{ IOException -> 0x008b }
            r1.append(r2)     // Catch:{ IOException -> 0x008b }
        L_0x008a:
            return r4
        L_0x008b:
            r6 = move-exception
            java.lang.String r1 = "SERVICE_NOT_AVAILABLE"
            java.lang.String r2 = r6.getMessage()
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x00ad
            java.lang.String r1 = "INTERNAL_SERVER_ERROR"
            java.lang.String r2 = r6.getMessage()
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x00a5
            goto L_0x00ad
        L_0x00a5:
            java.lang.String r1 = r6.getMessage()
            if (r1 != 0) goto L_0x00ac
            return r0
        L_0x00ac:
            throw r6
        L_0x00ad:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Topic operation failed: "
            r1.append(r2)
            java.lang.String r6 = r6.getMessage()
            r1.append(r6)
            java.lang.String r6 = ". Will retry Topic operation."
            r1.append(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.C33179e1.mo96059m(com.google.firebase.messaging.b1):boolean");
    }

    /* renamed from: n */
    public void mo96060n(Runnable runnable, long j) {
        this.f80557f.schedule(runnable, j, TimeUnit.SECONDS);
    }

    @C0344h1
    /* renamed from: o */
    public C31047k<Void> mo96061o(C33168b1 b1Var) {
        this.f80559h.mo96044a(b1Var);
        C31049l lVar = new C31049l();
        mo96052b(b1Var, lVar);
        return lVar.mo87741a();
    }

    /* renamed from: p */
    public synchronized void mo96062p(boolean z) {
        this.f80558g = z;
    }

    /* renamed from: q */
    public final void mo96063q() {
        if (!mo96057j()) {
            mo96067u(0);
        }
    }

    /* renamed from: r */
    public void mo96064r() {
        if (mo96056h()) {
            mo96063q();
        }
    }

    /* renamed from: s */
    public C31047k<Void> mo96065s(String str) {
        C31047k<Void> o = mo96061o(C33168b1.m133794f(str));
        mo96064r();
        return o;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0017, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0015, code lost:
        if (mo96059m(r0) != false) goto L_0x0019;
     */
    @androidx.annotation.C0348i1
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo96066t() throws java.io.IOException {
        /*
            r2 = this;
        L_0x0000:
            monitor-enter(r2)
            com.google.firebase.messaging.c1 r0 = r2.f80559h     // Catch:{ all -> 0x0022 }
            com.google.firebase.messaging.b1 r0 = r0.mo96046e()     // Catch:{ all -> 0x0022 }
            if (r0 != 0) goto L_0x0010
            boolean r0 = m133838i()     // Catch:{ all -> 0x0022 }
            monitor-exit(r2)     // Catch:{ all -> 0x0022 }
            r0 = 1
            return r0
        L_0x0010:
            monitor-exit(r2)     // Catch:{ all -> 0x0022 }
            boolean r1 = r2.mo96059m(r0)
            if (r1 != 0) goto L_0x0019
            r0 = 0
            return r0
        L_0x0019:
            com.google.firebase.messaging.c1 r1 = r2.f80559h
            r1.mo96050i(r0)
            r2.mo96058l(r0)
            goto L_0x0000
        L_0x0022:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0022 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.C33179e1.mo96066t():boolean");
    }

    /* renamed from: u */
    public void mo96067u(long j) {
        mo96060n(new C33189f1(this, this.f80552a, this.f80553b, Math.min(Math.max(30, 2 * j), f80551m)), j);
        mo96062p(true);
    }

    /* renamed from: v */
    public C31047k<Void> mo96068v(String str) {
        C31047k<Void> o = mo96061o(C33168b1.m133795g(str));
        mo96064r();
        return o;
    }
}
