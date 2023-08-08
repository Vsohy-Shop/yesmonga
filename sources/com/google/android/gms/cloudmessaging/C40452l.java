package com.google.android.gms.cloudmessaging;

/* renamed from: com.google.android.gms.cloudmessaging.l */
public final /* synthetic */ class C40452l implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C40457q f103081a;

    public /* synthetic */ C40452l(C40457q qVar) {
        this.f103081a = qVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0040, code lost:
        if (android.util.Log.isLoggable("MessengerIpcClient", 3) == false) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0042, code lost:
        r3 = java.lang.String.valueOf(r1);
        r5 = new java.lang.StringBuilder(r3.length() + 8);
        r5.append("Sending ");
        r5.append(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0059, code lost:
        r3 = r0.f103092h.f103100a;
        r4 = r0.f103088d;
        r5 = android.os.Message.obtain();
        r5.what = r1.f103097c;
        r5.arg1 = r1.f103095a;
        r5.replyTo = r4;
        r4 = new android.os.Bundle();
        r4.putBoolean("oneWay", r1.mo133575b());
        r4.putString("pkg", r3.getPackageName());
        r4.putBundle("data", r1.f103098d);
        r5.setData(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r0.f103089e.mo133573a(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0097, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0098, code lost:
        r0.mo133564a(2, r1.getMessage());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r8 = this;
            com.google.android.gms.cloudmessaging.q r0 = r8.f103081a
        L_0x0002:
            monitor-enter(r0)
            int r1 = r0.f103087c     // Catch:{ all -> 0x00a1 }
            r2 = 2
            if (r1 == r2) goto L_0x000a
            monitor-exit(r0)     // Catch:{ all -> 0x00a1 }
            return
        L_0x000a:
            java.util.Queue<com.google.android.gms.cloudmessaging.t<?>> r1 = r0.f103090f     // Catch:{ all -> 0x00a1 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x00a1 }
            if (r1 == 0) goto L_0x0017
            r0.mo133569f()     // Catch:{ all -> 0x00a1 }
            monitor-exit(r0)     // Catch:{ all -> 0x00a1 }
            return
        L_0x0017:
            java.util.Queue<com.google.android.gms.cloudmessaging.t<?>> r1 = r0.f103090f     // Catch:{ all -> 0x00a1 }
            java.lang.Object r1 = r1.poll()     // Catch:{ all -> 0x00a1 }
            com.google.android.gms.cloudmessaging.t r1 = (com.google.android.gms.cloudmessaging.C40460t) r1     // Catch:{ all -> 0x00a1 }
            android.util.SparseArray<com.google.android.gms.cloudmessaging.t<?>> r3 = r0.f103091g     // Catch:{ all -> 0x00a1 }
            int r4 = r1.f103095a     // Catch:{ all -> 0x00a1 }
            r3.put(r4, r1)     // Catch:{ all -> 0x00a1 }
            com.google.android.gms.cloudmessaging.v r3 = r0.f103092h     // Catch:{ all -> 0x00a1 }
            java.util.concurrent.ScheduledExecutorService r3 = r3.f103101b     // Catch:{ all -> 0x00a1 }
            com.google.android.gms.cloudmessaging.o r4 = new com.google.android.gms.cloudmessaging.o     // Catch:{ all -> 0x00a1 }
            r4.<init>(r0, r1)     // Catch:{ all -> 0x00a1 }
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x00a1 }
            r6 = 30
            r3.schedule(r4, r6, r5)     // Catch:{ all -> 0x00a1 }
            monitor-exit(r0)     // Catch:{ all -> 0x00a1 }
            java.lang.String r3 = "MessengerIpcClient"
            r4 = 3
            boolean r3 = android.util.Log.isLoggable(r3, r4)
            if (r3 == 0) goto L_0x0059
            java.lang.String r3 = java.lang.String.valueOf(r1)
            int r4 = r3.length()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            int r4 = r4 + 8
            r5.<init>(r4)
            java.lang.String r4 = "Sending "
            r5.append(r4)
            r5.append(r3)
        L_0x0059:
            com.google.android.gms.cloudmessaging.v r3 = r0.f103092h
            android.content.Context r3 = r3.f103100a
            android.os.Messenger r4 = r0.f103088d
            android.os.Message r5 = android.os.Message.obtain()
            int r6 = r1.f103097c
            r5.what = r6
            int r6 = r1.f103095a
            r5.arg1 = r6
            r5.replyTo = r4
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            java.lang.String r6 = "oneWay"
            boolean r7 = r1.mo133575b()
            r4.putBoolean(r6, r7)
            java.lang.String r6 = "pkg"
            java.lang.String r3 = r3.getPackageName()
            r4.putString(r6, r3)
            java.lang.String r3 = "data"
            android.os.Bundle r1 = r1.f103098d
            r4.putBundle(r3, r1)
            r5.setData(r4)
            com.google.android.gms.cloudmessaging.r r1 = r0.f103089e     // Catch:{ RemoteException -> 0x0097 }
            r1.mo133573a(r5)     // Catch:{ RemoteException -> 0x0097 }
            goto L_0x0002
        L_0x0097:
            r1 = move-exception
            java.lang.String r1 = r1.getMessage()
            r0.mo133564a(r2, r1)
            goto L_0x0002
        L_0x00a1:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00a1 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cloudmessaging.C40452l.run():void");
    }
}
