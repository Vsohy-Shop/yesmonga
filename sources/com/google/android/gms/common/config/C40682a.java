package com.google.android.gms.common.config;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.util.C40974d0;

@C40473a
/* renamed from: com.google.android.gms.common.config.a */
public abstract class C40682a<T> {

    /* renamed from: d */
    public static final Object f103645d = new Object();
    @C0359n0

    /* renamed from: a */
    public final String f103646a;
    @C0359n0

    /* renamed from: b */
    public final Object f103647b;
    @C0363p0

    /* renamed from: c */
    public Object f103648c = null;

    public C40682a(@C0359n0 String str, @C0359n0 Object obj) {
        this.f103646a = str;
        this.f103647b = obj;
    }

    @C40473a
    /* renamed from: c */
    public static boolean m165543c() {
        synchronized (f103645d) {
        }
        return false;
    }

    @C40473a
    @C0359n0
    /* renamed from: f */
    public static C40682a<Float> m165544f(@C0359n0 String str, @C0359n0 Float f) {
        return new C40686e(str, f);
    }

    @C40473a
    @C0359n0
    /* renamed from: g */
    public static C40682a<Integer> m165545g(@C0359n0 String str, @C0359n0 Integer num) {
        return new C40685d(str, num);
    }

    @C40473a
    @C0359n0
    /* renamed from: h */
    public static C40682a<Long> m165546h(@C0359n0 String str, @C0359n0 Long l) {
        return new C40684c(str, l);
    }

    @C40473a
    @C0359n0
    /* renamed from: i */
    public static C40682a<String> m165547i(@C0359n0 String str, @C0359n0 String str2) {
        return new C40687f(str, str2);
    }

    @C40473a
    @C0359n0
    /* renamed from: j */
    public static C40682a<Boolean> m165548j(@C0359n0 String str, boolean z) {
        return new C40683b(str, Boolean.valueOf(z));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0019, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r1 = android.os.Binder.clearCallingIdentity();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r3 = mo134121k(r4.f103646a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        android.os.Binder.restoreCallingIdentity(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0028, code lost:
        android.os.StrictMode.setThreadPolicy(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x002b, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x002c, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        android.os.Binder.restoreCallingIdentity(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0030, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0031, code lost:
        android.os.StrictMode.setThreadPolicy(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0034, code lost:
        throw r1;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x001b */
    @com.google.android.gms.common.annotation.C40473a
    @androidx.annotation.C0359n0
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final T mo134117a() {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f103648c
            if (r0 == 0) goto L_0x0005
            return r0
        L_0x0005:
            android.os.StrictMode$ThreadPolicy r0 = android.os.StrictMode.allowThreadDiskReads()
            java.lang.Object r1 = f103645d
            monitor-enter(r1)
            monitor-exit(r1)     // Catch:{ all -> 0x0038 }
            monitor-enter(r1)
            monitor-exit(r1)     // Catch:{ all -> 0x0035 }
            java.lang.String r1 = r4.f103646a     // Catch:{ SecurityException -> 0x001b }
            java.lang.Object r1 = r4.mo134121k(r1)     // Catch:{ SecurityException -> 0x001b }
            android.os.StrictMode.setThreadPolicy(r0)
            return r1
        L_0x0019:
            r1 = move-exception
            goto L_0x0031
        L_0x001b:
            long r1 = android.os.Binder.clearCallingIdentity()     // Catch:{ all -> 0x0019 }
            java.lang.String r3 = r4.f103646a     // Catch:{ all -> 0x002c }
            java.lang.Object r3 = r4.mo134121k(r3)     // Catch:{ all -> 0x002c }
            android.os.Binder.restoreCallingIdentity(r1)     // Catch:{ all -> 0x0019 }
            android.os.StrictMode.setThreadPolicy(r0)
            return r3
        L_0x002c:
            r3 = move-exception
            android.os.Binder.restoreCallingIdentity(r1)     // Catch:{ all -> 0x0019 }
            throw r3     // Catch:{ all -> 0x0019 }
        L_0x0031:
            android.os.StrictMode.setThreadPolicy(r0)
            throw r1
        L_0x0035:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0035 }
            throw r0
        L_0x0038:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0038 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.config.C40682a.mo134117a():java.lang.Object");
    }

    @C40473a
    @C0359n0
    @Deprecated
    /* renamed from: b */
    public final T mo134118b() {
        return mo134117a();
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    @com.google.android.gms.common.annotation.C40473a
    @com.google.android.gms.common.util.C40974d0
    /* renamed from: d */
    public void mo134119d(@androidx.annotation.C0359n0 T r2) {
        /*
            r1 = this;
            r1.f103648c = r2
            java.lang.Object r2 = f103645d
            monitor-enter(r2)
            monitor-enter(r2)     // Catch:{ all -> 0x000c }
            monitor-exit(r2)     // Catch:{ all -> 0x0009 }
            monitor-exit(r2)     // Catch:{ all -> 0x000c }
            return
        L_0x0009:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0009 }
            throw r0     // Catch:{ all -> 0x000c }
        L_0x000c:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x000c }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.config.C40682a.mo134119d(java.lang.Object):void");
    }

    @C40473a
    @C40974d0
    /* renamed from: e */
    public void mo134120e() {
        this.f103648c = null;
    }

    @C0359n0
    /* renamed from: k */
    public abstract Object mo134121k(@C0359n0 String str);
}
