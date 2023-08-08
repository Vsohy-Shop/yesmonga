package com.bumptech.glide.util;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.bumptech.glide.util.j */
public class C22629j<T, Y> {

    /* renamed from: a */
    public final Map<T, C22630a<Y>> f58017a = new LinkedHashMap(100, 0.75f, true);

    /* renamed from: b */
    public final long f58018b;

    /* renamed from: c */
    public long f58019c;

    /* renamed from: d */
    public long f58020d;

    /* renamed from: com.bumptech.glide.util.j$a */
    public static final class C22630a<Y> {

        /* renamed from: a */
        public final Y f58021a;

        /* renamed from: b */
        public final int f58022b;

        public C22630a(Y y, int i) {
            this.f58021a = y;
            this.f58022b = i;
        }
    }

    public C22629j(long j) {
        this.f58018b = j;
        this.f58019c = j;
    }

    /* renamed from: b */
    public void mo66988b() {
        mo66998q(0);
    }

    /* renamed from: c */
    public synchronized void mo66989c(float f) {
        if (f >= 0.0f) {
            this.f58019c = (long) Math.round(((float) this.f58018b) * f);
            mo66993j();
        } else {
            throw new IllegalArgumentException("Multiplier must be >= 0");
        }
    }

    /* renamed from: d */
    public synchronized long mo66990d() {
        return this.f58020d;
    }

    /* renamed from: e */
    public synchronized long mo66991e() {
        return this.f58019c;
    }

    /* renamed from: i */
    public synchronized boolean mo66992i(@C0359n0 T t) {
        return this.f58017a.containsKey(t);
    }

    /* renamed from: j */
    public final void mo66993j() {
        mo66998q(this.f58019c);
    }

    @C0363p0
    /* renamed from: k */
    public synchronized Y mo66994k(@C0359n0 T t) {
        Y y;
        C22630a aVar = this.f58017a.get(t);
        if (aVar != null) {
            y = aVar.f58021a;
        } else {
            y = null;
        }
        return y;
    }

    /* renamed from: l */
    public synchronized int mo66995l() {
        return this.f58017a.size();
    }

    /* renamed from: m */
    public int mo66040m(@C0363p0 Y y) {
        return 1;
    }

    /* renamed from: n */
    public void mo66041n(@C0359n0 T t, @C0363p0 Y y) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0049, code lost:
        return r4;
     */
    @androidx.annotation.C0363p0
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized Y mo66996o(@androidx.annotation.C0359n0 T r8, @androidx.annotation.C0363p0 Y r9) {
        /*
            r7 = this;
            monitor-enter(r7)
            int r0 = r7.mo66040m(r9)     // Catch:{ all -> 0x004a }
            long r1 = (long) r0     // Catch:{ all -> 0x004a }
            long r3 = r7.f58019c     // Catch:{ all -> 0x004a }
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r4 = 0
            if (r3 < 0) goto L_0x0012
            r7.mo66041n(r8, r9)     // Catch:{ all -> 0x004a }
            monitor-exit(r7)
            return r4
        L_0x0012:
            if (r9 == 0) goto L_0x0019
            long r5 = r7.f58020d     // Catch:{ all -> 0x004a }
            long r5 = r5 + r1
            r7.f58020d = r5     // Catch:{ all -> 0x004a }
        L_0x0019:
            java.util.Map<T, com.bumptech.glide.util.j$a<Y>> r1 = r7.f58017a     // Catch:{ all -> 0x004a }
            if (r9 != 0) goto L_0x001f
            r2 = r4
            goto L_0x0024
        L_0x001f:
            com.bumptech.glide.util.j$a r2 = new com.bumptech.glide.util.j$a     // Catch:{ all -> 0x004a }
            r2.<init>(r9, r0)     // Catch:{ all -> 0x004a }
        L_0x0024:
            java.lang.Object r0 = r1.put(r8, r2)     // Catch:{ all -> 0x004a }
            com.bumptech.glide.util.j$a r0 = (com.bumptech.glide.util.C22629j.C22630a) r0     // Catch:{ all -> 0x004a }
            if (r0 == 0) goto L_0x0041
            long r1 = r7.f58020d     // Catch:{ all -> 0x004a }
            int r3 = r0.f58022b     // Catch:{ all -> 0x004a }
            long r5 = (long) r3     // Catch:{ all -> 0x004a }
            long r1 = r1 - r5
            r7.f58020d = r1     // Catch:{ all -> 0x004a }
            Y r1 = r0.f58021a     // Catch:{ all -> 0x004a }
            boolean r9 = r1.equals(r9)     // Catch:{ all -> 0x004a }
            if (r9 != 0) goto L_0x0041
            Y r9 = r0.f58021a     // Catch:{ all -> 0x004a }
            r7.mo66041n(r8, r9)     // Catch:{ all -> 0x004a }
        L_0x0041:
            r7.mo66993j()     // Catch:{ all -> 0x004a }
            if (r0 == 0) goto L_0x0048
            Y r4 = r0.f58021a     // Catch:{ all -> 0x004a }
        L_0x0048:
            monitor-exit(r7)
            return r4
        L_0x004a:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.util.C22629j.mo66996o(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    @C0363p0
    /* renamed from: p */
    public synchronized Y mo66997p(@C0359n0 T t) {
        C22630a remove = this.f58017a.remove(t);
        if (remove == null) {
            return null;
        }
        this.f58020d -= (long) remove.f58022b;
        return remove.f58021a;
    }

    /* renamed from: q */
    public synchronized void mo66998q(long j) {
        while (this.f58020d > j) {
            Iterator<Map.Entry<T, C22630a<Y>>> it = this.f58017a.entrySet().iterator();
            Map.Entry next = it.next();
            C22630a aVar = (C22630a) next.getValue();
            this.f58020d -= (long) aVar.f58022b;
            Object key = next.getKey();
            it.remove();
            mo66041n(key, aVar.f58021a);
        }
    }
}
