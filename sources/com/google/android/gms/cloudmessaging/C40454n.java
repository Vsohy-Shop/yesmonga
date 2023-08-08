package com.google.android.gms.cloudmessaging;

import android.os.IBinder;

/* renamed from: com.google.android.gms.cloudmessaging.n */
public final /* synthetic */ class C40454n implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C40457q f103083a;

    /* renamed from: b */
    public final /* synthetic */ IBinder f103084b;

    public /* synthetic */ C40454n(C40457q qVar, IBinder iBinder) {
        this.f103083a = qVar;
        this.f103084b = iBinder;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x001e, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0020, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0021, code lost:
        r0.mo133564a(0, r1.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0029, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x002b, code lost:
        throw r1;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:5:0x000a, B:9:0x000f] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r4 = this;
            com.google.android.gms.cloudmessaging.q r0 = r4.f103083a
            android.os.IBinder r1 = r4.f103084b
            monitor-enter(r0)
            r2 = 0
            if (r1 != 0) goto L_0x000f
            java.lang.String r1 = "Null service connection"
            r0.mo133564a(r2, r1)     // Catch:{ all -> 0x001e }
            monitor-exit(r0)     // Catch:{ all -> 0x001e }
            return
        L_0x000f:
            com.google.android.gms.cloudmessaging.r r3 = new com.google.android.gms.cloudmessaging.r     // Catch:{ RemoteException -> 0x0020 }
            r3.<init>(r1)     // Catch:{ RemoteException -> 0x0020 }
            r0.f103089e = r3     // Catch:{ RemoteException -> 0x0020 }
            r1 = 2
            r0.f103087c = r1     // Catch:{ all -> 0x001e }
            r0.mo133566c()     // Catch:{ all -> 0x001e }
            monitor-exit(r0)     // Catch:{ all -> 0x001e }
            return
        L_0x001e:
            r1 = move-exception
            goto L_0x002a
        L_0x0020:
            r1 = move-exception
            java.lang.String r1 = r1.getMessage()     // Catch:{ all -> 0x001e }
            r0.mo133564a(r2, r1)     // Catch:{ all -> 0x001e }
            monitor-exit(r0)     // Catch:{ all -> 0x001e }
            return
        L_0x002a:
            monitor-exit(r0)     // Catch:{ all -> 0x001e }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cloudmessaging.C40454n.run():void");
    }
}
