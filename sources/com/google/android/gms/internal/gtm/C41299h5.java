package com.google.android.gms.internal.gtm;

import android.content.Context;
import com.google.android.gms.ads.identifier.C40365a;
import com.google.android.gms.common.util.C40974d0;
import com.google.android.gms.common.util.C40979g;
import com.google.android.gms.common.util.C40985k;

@C40974d0
/* renamed from: com.google.android.gms.internal.gtm.h5 */
public final class C41299h5 {

    /* renamed from: m */
    public static final Object f104638m = new Object();

    /* renamed from: n */
    public static C41299h5 f104639n;

    /* renamed from: a */
    public volatile long f104640a = 900000;

    /* renamed from: b */
    public volatile long f104641b = 30000;

    /* renamed from: c */
    public volatile boolean f104642c = true;

    /* renamed from: d */
    public volatile boolean f104643d = false;

    /* renamed from: e */
    public volatile C40365a.C40366a f104644e;

    /* renamed from: f */
    public volatile long f104645f;

    /* renamed from: g */
    public volatile long f104646g;

    /* renamed from: h */
    public final Context f104647h;

    /* renamed from: i */
    public final C40979g f104648i;

    /* renamed from: j */
    public final Thread f104649j;

    /* renamed from: k */
    public final Object f104650k = new Object();

    /* renamed from: l */
    public final C41275g5 f104651l = new C41227e5(this);

    @C40974d0
    public C41299h5(Context context, C41275g5 g5Var, C40979g gVar) {
        this.f104648i = gVar;
        if (context != null) {
            this.f104647h = context.getApplicationContext();
        } else {
            this.f104647h = null;
        }
        this.f104645f = gVar.mo134768a();
        this.f104649j = new Thread(new C41251f5(this));
    }

    /* renamed from: b */
    public static C41299h5 m167615b(Context context) {
        if (f104639n == null) {
            synchronized (f104638m) {
                if (f104639n == null) {
                    C41299h5 h5Var = new C41299h5(context, (C41275g5) null, C40985k.m166636d());
                    f104639n = h5Var;
                    h5Var.f104649j.start();
                }
            }
        }
        return f104639n;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.makeEndlessLoop(RegionMaker.java:368)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:172)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: e */
    public static /* bridge */ /* synthetic */ void m167617e(com.google.android.gms.internal.gtm.C41299h5 r4) {
        /*
            r0 = 10
            android.os.Process.setThreadPriority(r0)
        L_0x0005:
            boolean r0 = r4.f104643d
            boolean r0 = r4.f104642c
            if (r0 == 0) goto L_0x0012
            com.google.android.gms.internal.gtm.g5 r0 = r4.f104651l
            com.google.android.gms.ads.identifier.a$a r0 = r0.zza()
            goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            if (r0 == 0) goto L_0x0024
            r4.f104644e = r0
            com.google.android.gms.common.util.g r0 = r4.f104648i
            long r0 = r0.mo134768a()
            r4.f104646g = r0
            java.lang.String r0 = "Obtained fresh AdvertisingId info from GmsCore."
            com.google.android.gms.internal.gtm.C41493p6.m168151c(r0)
        L_0x0024:
            monitor-enter(r4)
            r4.notifyAll()     // Catch:{ all -> 0x003e }
            monitor-exit(r4)     // Catch:{ all -> 0x003e }
            java.lang.Object r0 = r4.f104650k     // Catch:{ InterruptedException -> 0x0038 }
            monitor-enter(r0)     // Catch:{ InterruptedException -> 0x0038 }
            java.lang.Object r1 = r4.f104650k     // Catch:{ all -> 0x0035 }
            long r2 = r4.f104640a     // Catch:{ all -> 0x0035 }
            r1.wait(r2)     // Catch:{ all -> 0x0035 }
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            goto L_0x0005
        L_0x0035:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            throw r1     // Catch:{ InterruptedException -> 0x0038 }
        L_0x0038:
            java.lang.String r0 = "sleep interrupted in AdvertiserDataPoller thread; continuing"
            com.google.android.gms.internal.gtm.C41493p6.m168151c(r0)
            goto L_0x0005
        L_0x003e:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x003e }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.C41299h5.m167617e(com.google.android.gms.internal.gtm.h5):void");
    }

    /* renamed from: c */
    public final String mo135425c() {
        if (this.f104644e == null) {
            mo135429i();
        } else {
            mo135428h();
        }
        mo135427g();
        if (this.f104644e == null) {
            return null;
        }
        return this.f104644e.mo133250a();
    }

    /* renamed from: f */
    public final boolean mo135426f() {
        if (this.f104644e == null) {
            mo135429i();
        } else {
            mo135428h();
        }
        mo135427g();
        if (this.f104644e == null) {
            return true;
        }
        return this.f104644e.mo133251b();
    }

    /* renamed from: g */
    public final void mo135427g() {
        if (this.f104648i.mo134768a() - this.f104646g > 3600000) {
            this.f104644e = null;
        }
    }

    /* renamed from: h */
    public final void mo135428h() {
        if (this.f104648i.mo134768a() - this.f104645f > this.f104641b) {
            synchronized (this.f104650k) {
                this.f104650k.notify();
            }
            this.f104645f = this.f104648i.mo134768a();
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x000c */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo135429i() {
        /*
            r2 = this;
            monitor-enter(r2)
            r2.mo135428h()     // Catch:{ InterruptedException -> 0x000c }
            r0 = 500(0x1f4, double:2.47E-321)
            r2.wait(r0)     // Catch:{ InterruptedException -> 0x000c }
            goto L_0x000c
        L_0x000a:
            r0 = move-exception
            goto L_0x000e
        L_0x000c:
            monitor-exit(r2)     // Catch:{ all -> 0x000a }
            return
        L_0x000e:
            monitor-exit(r2)     // Catch:{ all -> 0x000a }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.C41299h5.mo135429i():void");
    }
}
