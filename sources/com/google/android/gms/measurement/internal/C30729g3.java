package com.google.android.gms.measurement.internal;

import androidx.annotation.C0323b0;

/* renamed from: com.google.android.gms.measurement.internal.g3 */
public final class C30729g3 {

    /* renamed from: h */
    public static final Object f73411h = new Object();

    /* renamed from: a */
    public final String f73412a;

    /* renamed from: b */
    public final C30690d3 f73413b;

    /* renamed from: c */
    public final Object f73414c;

    /* renamed from: d */
    public final Object f73415d;

    /* renamed from: e */
    public final Object f73416e = new Object();
    @C0323b0("overrideLock")

    /* renamed from: f */
    public volatile Object f73417f = null;
    @C0323b0("cachingLock")

    /* renamed from: g */
    public volatile Object f73418g = null;

    public /* synthetic */ C30729g3(String str, Object obj, Object obj2, C30690d3 d3Var, C30716f3 f3Var) {
        this.f73412a = str;
        this.f73414c = obj;
        this.f73415d = obj2;
        this.f73413b = d3Var;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processHandlersOutBlocks(RegionMaker.java:1008)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:978)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0046 */
    /* renamed from: a */
    public final java.lang.Object mo87094a(java.lang.Object r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f73416e
            monitor-enter(r0)
            monitor-exit(r0)     // Catch:{ all -> 0x006d }
            if (r4 == 0) goto L_0x0007
            return r4
        L_0x0007:
            com.google.android.gms.measurement.internal.c r4 = com.google.android.gms.measurement.internal.C30703e3.f73351a
            if (r4 != 0) goto L_0x000e
            java.lang.Object r4 = r3.f73414c
            return r4
        L_0x000e:
            java.lang.Object r4 = f73411h
            monitor-enter(r4)
            boolean r0 = com.google.android.gms.measurement.internal.C30673c.m123531a()     // Catch:{ all -> 0x006a }
            if (r0 == 0) goto L_0x0022
            java.lang.Object r0 = r3.f73418g     // Catch:{ all -> 0x006a }
            if (r0 != 0) goto L_0x001e
            java.lang.Object r0 = r3.f73414c     // Catch:{ all -> 0x006a }
            goto L_0x0020
        L_0x001e:
            java.lang.Object r0 = r3.f73418g     // Catch:{ all -> 0x006a }
        L_0x0020:
            monitor-exit(r4)     // Catch:{ all -> 0x006a }
            return r0
        L_0x0022:
            monitor-exit(r4)     // Catch:{ all -> 0x006a }
            java.util.List r4 = com.google.android.gms.measurement.internal.C30742h3.f73521a     // Catch:{ SecurityException -> 0x0058 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ SecurityException -> 0x0058 }
        L_0x002b:
            boolean r0 = r4.hasNext()     // Catch:{ SecurityException -> 0x0058 }
            if (r0 == 0) goto L_0x0058
            java.lang.Object r0 = r4.next()     // Catch:{ SecurityException -> 0x0058 }
            com.google.android.gms.measurement.internal.g3 r0 = (com.google.android.gms.measurement.internal.C30729g3) r0     // Catch:{ SecurityException -> 0x0058 }
            boolean r1 = com.google.android.gms.measurement.internal.C30673c.m123531a()     // Catch:{ SecurityException -> 0x0058 }
            if (r1 != 0) goto L_0x0050
            r1 = 0
            com.google.android.gms.measurement.internal.d3 r2 = r0.f73413b     // Catch:{ IllegalStateException -> 0x0046 }
            if (r2 == 0) goto L_0x0046
            java.lang.Object r1 = r2.zza()     // Catch:{ IllegalStateException -> 0x0046 }
        L_0x0046:
            java.lang.Object r2 = f73411h     // Catch:{ SecurityException -> 0x0058 }
            monitor-enter(r2)     // Catch:{ SecurityException -> 0x0058 }
            r0.f73418g = r1     // Catch:{ all -> 0x004d }
            monitor-exit(r2)     // Catch:{ all -> 0x004d }
            goto L_0x002b
        L_0x004d:
            r4 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x004d }
            throw r4     // Catch:{ SecurityException -> 0x0058 }
        L_0x0050:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch:{ SecurityException -> 0x0058 }
            java.lang.String r0 = "Refreshing flag cache must be done on a worker thread."
            r4.<init>(r0)     // Catch:{ SecurityException -> 0x0058 }
            throw r4     // Catch:{ SecurityException -> 0x0058 }
        L_0x0058:
            com.google.android.gms.measurement.internal.d3 r4 = r3.f73413b
            if (r4 != 0) goto L_0x005f
            java.lang.Object r4 = r3.f73414c
            return r4
        L_0x005f:
            java.lang.Object r4 = r4.zza()     // Catch:{ SecurityException -> 0x0067, IllegalStateException -> 0x0064 }
            return r4
        L_0x0064:
            java.lang.Object r4 = r3.f73414c
            return r4
        L_0x0067:
            java.lang.Object r4 = r3.f73414c
            return r4
        L_0x006a:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x006a }
            throw r0
        L_0x006d:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x006d }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C30729g3.mo87094a(java.lang.Object):java.lang.Object");
    }

    /* renamed from: b */
    public final String mo87095b() {
        return this.f73412a;
    }
}
