package com.google.android.gms.internal.measurement;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.Nullable;

/* renamed from: com.google.android.gms.internal.measurement.h7 */
public abstract class C41983h7 {

    /* renamed from: f */
    public static final Object f106177f = new Object();
    @Nullable

    /* renamed from: g */
    public static volatile C41929e7 f106178g = null;

    /* renamed from: h */
    public static volatile boolean f106179h = false;

    /* renamed from: i */
    public static final AtomicReference f106180i = new AtomicReference();

    /* renamed from: j */
    public static final C42019j7 f106181j = new C42019j7(C42276y6.f106554a);

    /* renamed from: k */
    public static final AtomicInteger f106182k = new AtomicInteger();

    /* renamed from: l */
    public static final /* synthetic */ int f106183l = 0;

    /* renamed from: a */
    public final C41911d7 f106184a;

    /* renamed from: b */
    public final String f106185b;

    /* renamed from: c */
    public final Object f106186c;

    /* renamed from: d */
    public volatile int f106187d = -1;

    /* renamed from: e */
    public volatile Object f106188e;

    public /* synthetic */ C41983h7(C41911d7 d7Var, String str, Object obj, boolean z, C41965g7 g7Var) {
        if (d7Var.f106070a != null) {
            this.f106184a = d7Var;
            this.f106185b = str;
            this.f106186c = obj;
            return;
        }
        throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
    }

    /* renamed from: c */
    public static void m170215c() {
        f106182k.incrementAndGet();
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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: d */
    public static void m170216d(android.content.Context r3) {
        /*
            com.google.android.gms.internal.measurement.e7 r0 = f106178g
            if (r0 != 0) goto L_0x0048
            if (r3 != 0) goto L_0x0007
            goto L_0x0048
        L_0x0007:
            java.lang.Object r0 = f106177f
            monitor-enter(r0)
            com.google.android.gms.internal.measurement.e7 r1 = f106178g     // Catch:{ all -> 0x0045 }
            if (r1 != 0) goto L_0x0043
            monitor-enter(r0)     // Catch:{ all -> 0x0045 }
            com.google.android.gms.internal.measurement.e7 r1 = f106178g     // Catch:{ all -> 0x0040 }
            android.content.Context r2 = r3.getApplicationContext()     // Catch:{ all -> 0x0040 }
            if (r2 == 0) goto L_0x0018
            r3 = r2
        L_0x0018:
            if (r1 == 0) goto L_0x0020
            android.content.Context r1 = r1.mo136712a()     // Catch:{ all -> 0x0040 }
            if (r1 == r3) goto L_0x003e
        L_0x0020:
            com.google.android.gms.internal.measurement.C42036k6.m170452e()     // Catch:{ all -> 0x0040 }
            com.google.android.gms.internal.measurement.C42001i7.m170279c()     // Catch:{ all -> 0x0040 }
            com.google.android.gms.internal.measurement.C42174s6.m170810e()     // Catch:{ all -> 0x0040 }
            com.google.android.gms.internal.measurement.x6 r1 = new com.google.android.gms.internal.measurement.x6     // Catch:{ all -> 0x0040 }
            r1.<init>(r3)     // Catch:{ all -> 0x0040 }
            com.google.android.gms.internal.measurement.p7 r1 = com.google.android.gms.internal.measurement.C42175s7.m170814a(r1)     // Catch:{ all -> 0x0040 }
            com.google.android.gms.internal.measurement.h6 r2 = new com.google.android.gms.internal.measurement.h6     // Catch:{ all -> 0x0040 }
            r2.<init>(r3, r1)     // Catch:{ all -> 0x0040 }
            f106178g = r2     // Catch:{ all -> 0x0040 }
            java.util.concurrent.atomic.AtomicInteger r3 = f106182k     // Catch:{ all -> 0x0040 }
            r3.incrementAndGet()     // Catch:{ all -> 0x0040 }
        L_0x003e:
            monitor-exit(r0)     // Catch:{ all -> 0x0040 }
            goto L_0x0043
        L_0x0040:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0040 }
            throw r3     // Catch:{ all -> 0x0045 }
        L_0x0043:
            monitor-exit(r0)     // Catch:{ all -> 0x0045 }
            return
        L_0x0045:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0045 }
            throw r3
        L_0x0048:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C41983h7.m170216d(android.content.Context):void");
    }

    /* renamed from: a */
    public abstract Object mo136524a(Object obj);

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00bd  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo137007b() {
        /*
            r8 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = f106182k
            int r0 = r0.get()
            int r1 = r8.f106187d
            if (r1 >= r0) goto L_0x00c8
            monitor-enter(r8)
            int r1 = r8.f106187d     // Catch:{ all -> 0x00c5 }
            if (r1 >= r0) goto L_0x00c3
            com.google.android.gms.internal.measurement.e7 r1 = f106178g     // Catch:{ all -> 0x00c5 }
            com.google.android.gms.internal.measurement.zzii r2 = com.google.android.gms.internal.measurement.zzii.m171304c()     // Catch:{ all -> 0x00c5 }
            r3 = 0
            if (r1 == 0) goto L_0x003b
            com.google.android.gms.internal.measurement.p7 r2 = r1.mo136713b()     // Catch:{ all -> 0x00c5 }
            java.lang.Object r2 = r2.zza()     // Catch:{ all -> 0x00c5 }
            com.google.android.gms.internal.measurement.zzii r2 = (com.google.android.gms.internal.measurement.zzii) r2     // Catch:{ all -> 0x00c5 }
            boolean r4 = r2.mo137539b()     // Catch:{ all -> 0x00c5 }
            if (r4 == 0) goto L_0x003b
            java.lang.Object r4 = r2.mo137538a()     // Catch:{ all -> 0x00c5 }
            com.google.android.gms.internal.measurement.m6 r4 = (com.google.android.gms.internal.measurement.C42072m6) r4     // Catch:{ all -> 0x00c5 }
            com.google.android.gms.internal.measurement.d7 r5 = r8.f106184a     // Catch:{ all -> 0x00c5 }
            android.net.Uri r6 = r5.f106070a     // Catch:{ all -> 0x00c5 }
            java.lang.String r5 = r5.f106072c     // Catch:{ all -> 0x00c5 }
            java.lang.String r7 = r8.f106185b     // Catch:{ all -> 0x00c5 }
            java.lang.String r4 = r4.mo137151a(r6, r3, r5, r7)     // Catch:{ all -> 0x00c5 }
            goto L_0x003c
        L_0x003b:
            r4 = r3
        L_0x003c:
            java.lang.String r5 = "Must call PhenotypeFlag.init() first"
            if (r1 == 0) goto L_0x00bd
            com.google.android.gms.internal.measurement.d7 r5 = r8.f106184a     // Catch:{ all -> 0x00c5 }
            android.net.Uri r5 = r5.f106070a     // Catch:{ all -> 0x00c5 }
            if (r5 == 0) goto L_0x0065
            android.content.Context r6 = r1.mo136712a()     // Catch:{ all -> 0x00c5 }
            boolean r5 = com.google.android.gms.internal.measurement.C42208u6.m170901a(r6, r5)     // Catch:{ all -> 0x00c5 }
            if (r5 == 0) goto L_0x0063
            android.content.Context r5 = r1.mo136712a()     // Catch:{ all -> 0x00c5 }
            android.content.ContentResolver r5 = r5.getContentResolver()     // Catch:{ all -> 0x00c5 }
            com.google.android.gms.internal.measurement.d7 r6 = r8.f106184a     // Catch:{ all -> 0x00c5 }
            android.net.Uri r6 = r6.f106070a     // Catch:{ all -> 0x00c5 }
            com.google.android.gms.internal.measurement.w6 r7 = com.google.android.gms.internal.measurement.C42242w6.f106479a     // Catch:{ all -> 0x00c5 }
            com.google.android.gms.internal.measurement.k6 r5 = com.google.android.gms.internal.measurement.C42036k6.m170451b(r5, r6, r7)     // Catch:{ all -> 0x00c5 }
            goto L_0x006f
        L_0x0063:
            r5 = r3
            goto L_0x006f
        L_0x0065:
            android.content.Context r5 = r1.mo136712a()     // Catch:{ all -> 0x00c5 }
            com.google.android.gms.internal.measurement.w6 r6 = com.google.android.gms.internal.measurement.C42242w6.f106479a     // Catch:{ all -> 0x00c5 }
            com.google.android.gms.internal.measurement.i7 r5 = com.google.android.gms.internal.measurement.C42001i7.m170278b(r5, r3, r6)     // Catch:{ all -> 0x00c5 }
        L_0x006f:
            if (r5 == 0) goto L_0x007e
            java.lang.String r6 = r8.f106185b     // Catch:{ all -> 0x00c5 }
            java.lang.Object r5 = r5.mo137032a(r6)     // Catch:{ all -> 0x00c5 }
            if (r5 == 0) goto L_0x007e
            java.lang.Object r5 = r8.mo136524a(r5)     // Catch:{ all -> 0x00c5 }
            goto L_0x007f
        L_0x007e:
            r5 = r3
        L_0x007f:
            if (r5 != 0) goto L_0x00a9
            com.google.android.gms.internal.measurement.d7 r5 = r8.f106184a     // Catch:{ all -> 0x00c5 }
            boolean r5 = r5.f106073d     // Catch:{ all -> 0x00c5 }
            if (r5 != 0) goto L_0x00a3
            android.content.Context r1 = r1.mo136712a()     // Catch:{ all -> 0x00c5 }
            com.google.android.gms.internal.measurement.s6 r1 = com.google.android.gms.internal.measurement.C42174s6.m170809b(r1)     // Catch:{ all -> 0x00c5 }
            com.google.android.gms.internal.measurement.d7 r5 = r8.f106184a     // Catch:{ all -> 0x00c5 }
            boolean r5 = r5.f106073d     // Catch:{ all -> 0x00c5 }
            if (r5 == 0) goto L_0x0097
            r5 = r3
            goto L_0x0099
        L_0x0097:
            java.lang.String r5 = r8.f106185b     // Catch:{ all -> 0x00c5 }
        L_0x0099:
            java.lang.String r1 = r1.mo137032a(r5)     // Catch:{ all -> 0x00c5 }
            if (r1 == 0) goto L_0x00a3
            java.lang.Object r3 = r8.mo136524a(r1)     // Catch:{ all -> 0x00c5 }
        L_0x00a3:
            if (r3 != 0) goto L_0x00a8
            java.lang.Object r5 = r8.f106186c     // Catch:{ all -> 0x00c5 }
            goto L_0x00a9
        L_0x00a8:
            r5 = r3
        L_0x00a9:
            boolean r1 = r2.mo137539b()     // Catch:{ all -> 0x00c5 }
            if (r1 == 0) goto L_0x00b8
            if (r4 != 0) goto L_0x00b4
            java.lang.Object r5 = r8.f106186c     // Catch:{ all -> 0x00c5 }
            goto L_0x00b8
        L_0x00b4:
            java.lang.Object r5 = r8.mo136524a(r4)     // Catch:{ all -> 0x00c5 }
        L_0x00b8:
            r8.f106188e = r5     // Catch:{ all -> 0x00c5 }
            r8.f106187d = r0     // Catch:{ all -> 0x00c5 }
            goto L_0x00c3
        L_0x00bd:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00c5 }
            r0.<init>(r5)     // Catch:{ all -> 0x00c5 }
            throw r0     // Catch:{ all -> 0x00c5 }
        L_0x00c3:
            monitor-exit(r8)     // Catch:{ all -> 0x00c5 }
            goto L_0x00c8
        L_0x00c5:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x00c5 }
            throw r0
        L_0x00c8:
            java.lang.Object r0 = r8.f106188e
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C41983h7.mo137007b():java.lang.Object");
    }
}
