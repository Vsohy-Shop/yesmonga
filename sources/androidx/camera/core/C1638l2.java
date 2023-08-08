package androidx.camera.core;

import android.media.ImageReader;
import android.util.LongSparseArray;
import android.view.Surface;
import androidx.annotation.C0323b0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.camera.core.C1663p0;
import androidx.camera.core.impl.C1448f;
import androidx.camera.core.impl.C1456h;
import androidx.camera.core.impl.C1500r0;
import androidx.camera.core.internal.C1592b;
import androidx.core.util.C18001r;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: androidx.camera.core.l2 */
public class C1638l2 implements C1500r0, C1663p0.C1664a {

    /* renamed from: m */
    public static final String f4575m = "MetadataImageReader";

    /* renamed from: a */
    public final Object f4576a;

    /* renamed from: b */
    public C1448f f4577b;

    /* renamed from: c */
    public C1500r0.C1501a f4578c;
    @C0323b0("mLock")

    /* renamed from: d */
    public boolean f4579d;
    @C0323b0("mLock")

    /* renamed from: e */
    public final C1500r0 f4580e;
    @C0363p0
    @C0323b0("mLock")

    /* renamed from: f */
    public C1500r0.C1501a f4581f;
    @C0363p0
    @C0323b0("mLock")

    /* renamed from: g */
    public Executor f4582g;
    @C0323b0("mLock")

    /* renamed from: h */
    public final LongSparseArray<C1741z1> f4583h;
    @C0323b0("mLock")

    /* renamed from: i */
    public final LongSparseArray<C1353a2> f4584i;
    @C0323b0("mLock")

    /* renamed from: j */
    public int f4585j;
    @C0323b0("mLock")

    /* renamed from: k */
    public final List<C1353a2> f4586k;
    @C0323b0("mLock")

    /* renamed from: l */
    public final List<C1353a2> f4587l;

    /* renamed from: androidx.camera.core.l2$a */
    public class C1639a extends C1448f {
        public C1639a() {
        }

        /* renamed from: b */
        public void mo4263b(@C0359n0 C1456h hVar) {
            super.mo4263b(hVar);
            C1638l2.this.mo5623s(hVar);
        }
    }

    public C1638l2(int i, int i2, int i3, int i4) {
        this(m6698j(i, i2, i3, i4));
    }

    /* renamed from: j */
    public static C1500r0 m6698j(int i, int i2, int i3, int i4) {
        return new C1381d(ImageReader.newInstance(i, i2, i3, i4));
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public /* synthetic */ void m6699o(C1500r0.C1501a aVar) {
        aVar.mo4997a(this);
    }

    @C0363p0
    /* renamed from: a */
    public Surface mo5002a() {
        Surface a;
        synchronized (this.f4576a) {
            a = this.f4580e.mo5002a();
        }
        return a;
    }

    /* renamed from: b */
    public void mo4882b(C1353a2 a2Var) {
        synchronized (this.f4576a) {
            mo5617k(a2Var);
        }
    }

    @C0363p0
    /* renamed from: c */
    public C1353a2 mo5003c() {
        synchronized (this.f4576a) {
            if (this.f4586k.isEmpty()) {
                return null;
            }
            if (this.f4585j < this.f4586k.size()) {
                ArrayList<C1353a2> arrayList = new ArrayList<>();
                for (int i = 0; i < this.f4586k.size() - 1; i++) {
                    if (!this.f4587l.contains(this.f4586k.get(i))) {
                        arrayList.add(this.f4586k.get(i));
                    }
                }
                for (C1353a2 close : arrayList) {
                    close.close();
                }
                int size = this.f4586k.size() - 1;
                List<C1353a2> list = this.f4586k;
                this.f4585j = size + 1;
                C1353a2 a2Var = list.get(size);
                this.f4587l.add(a2Var);
                return a2Var;
            }
            throw new IllegalStateException("Maximum image number reached.");
        }
    }

    public void close() {
        synchronized (this.f4576a) {
            if (!this.f4579d) {
                for (C1353a2 close : new ArrayList(this.f4586k)) {
                    close.close();
                }
                this.f4586k.clear();
                this.f4580e.close();
                this.f4579d = true;
            }
        }
    }

    /* renamed from: d */
    public void mo5005d() {
        synchronized (this.f4576a) {
            this.f4581f = null;
            this.f4582g = null;
        }
    }

    /* renamed from: e */
    public int mo5006e() {
        int e;
        synchronized (this.f4576a) {
            e = this.f4580e.mo5006e();
        }
        return e;
    }

    /* renamed from: f */
    public void mo5007f(@C0359n0 C1500r0.C1501a aVar, @C0359n0 Executor executor) {
        synchronized (this.f4576a) {
            this.f4581f = (C1500r0.C1501a) C18001r.m81775l(aVar);
            this.f4582g = (Executor) C18001r.m81775l(executor);
            this.f4580e.mo5007f(this.f4578c, executor);
        }
    }

    @C0363p0
    /* renamed from: g */
    public C1353a2 mo5008g() {
        synchronized (this.f4576a) {
            if (this.f4586k.isEmpty()) {
                return null;
            }
            if (this.f4585j < this.f4586k.size()) {
                List<C1353a2> list = this.f4586k;
                int i = this.f4585j;
                this.f4585j = i + 1;
                C1353a2 a2Var = list.get(i);
                this.f4587l.add(a2Var);
                return a2Var;
            }
            throw new IllegalStateException("Maximum image number reached.");
        }
    }

    public int getHeight() {
        int height;
        synchronized (this.f4576a) {
            height = this.f4580e.getHeight();
        }
        return height;
    }

    public int getImageFormat() {
        int imageFormat;
        synchronized (this.f4576a) {
            imageFormat = this.f4580e.getImageFormat();
        }
        return imageFormat;
    }

    public int getWidth() {
        int width;
        synchronized (this.f4576a) {
            width = this.f4580e.getWidth();
        }
        return width;
    }

    /* renamed from: k */
    public final void mo5617k(C1353a2 a2Var) {
        synchronized (this.f4576a) {
            int indexOf = this.f4586k.indexOf(a2Var);
            if (indexOf >= 0) {
                this.f4586k.remove(indexOf);
                int i = this.f4585j;
                if (indexOf <= i) {
                    this.f4585j = i - 1;
                }
            }
            this.f4587l.remove(a2Var);
        }
    }

    /* renamed from: l */
    public final void mo5618l(C1379c3 c3Var) {
        C1500r0.C1501a aVar;
        Executor executor;
        synchronized (this.f4576a) {
            if (this.f4586k.size() < mo5006e()) {
                c3Var.mo5656a(this);
                this.f4586k.add(c3Var);
                aVar = this.f4581f;
                executor = this.f4582g;
            } else {
                C1417i2.m5911a("TAG", "Maximum image number reached.");
                c3Var.close();
                aVar = null;
                executor = null;
            }
        }
        if (aVar == null) {
            return;
        }
        if (executor != null) {
            executor.execute(new C1627j2(this, aVar));
        } else {
            aVar.mo4997a(this);
        }
    }

    /* renamed from: m */
    public C1448f mo5619m() {
        return this.f4577b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0037, code lost:
        return;
     */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m6700p(androidx.camera.core.impl.C1500r0 r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f4576a
            monitor-enter(r0)
            boolean r1 = r6.f4579d     // Catch:{ all -> 0x0039 }
            if (r1 == 0) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x0039 }
            return
        L_0x0009:
            r1 = 0
        L_0x000a:
            androidx.camera.core.a2 r2 = r7.mo5008g()     // Catch:{ IllegalStateException -> 0x0025 }
            if (r2 == 0) goto L_0x002e
            int r1 = r1 + 1
            android.util.LongSparseArray<androidx.camera.core.a2> r3 = r6.f4584i     // Catch:{ all -> 0x0039 }
            androidx.camera.core.z1 r4 = r2.mo4977q3()     // Catch:{ all -> 0x0039 }
            long r4 = r4.getTimestamp()     // Catch:{ all -> 0x0039 }
            r3.put(r4, r2)     // Catch:{ all -> 0x0039 }
            r6.mo5621q()     // Catch:{ all -> 0x0039 }
            goto L_0x002e
        L_0x0023:
            r7 = move-exception
            goto L_0x0038
        L_0x0025:
            r2 = move-exception
            java.lang.String r3 = "MetadataImageReader"
            java.lang.String r4 = "Failed to acquire next image."
            androidx.camera.core.C1417i2.m5912b(r3, r4, r2)     // Catch:{ all -> 0x0023 }
            r2 = 0
        L_0x002e:
            if (r2 == 0) goto L_0x0036
            int r2 = r7.mo5006e()     // Catch:{ all -> 0x0039 }
            if (r1 < r2) goto L_0x000a
        L_0x0036:
            monitor-exit(r0)     // Catch:{ all -> 0x0039 }
            return
        L_0x0038:
            throw r7     // Catch:{ all -> 0x0039 }
        L_0x0039:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0039 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.C1638l2.m6700p(androidx.camera.core.impl.r0):void");
    }

    /* renamed from: q */
    public final void mo5621q() {
        synchronized (this.f4576a) {
            for (int size = this.f4583h.size() - 1; size >= 0; size--) {
                C1741z1 valueAt = this.f4583h.valueAt(size);
                long timestamp = valueAt.getTimestamp();
                C1353a2 a2Var = this.f4584i.get(timestamp);
                if (a2Var != null) {
                    this.f4584i.remove(timestamp);
                    this.f4583h.removeAt(size);
                    mo5618l(new C1379c3(a2Var, valueAt));
                }
            }
            mo5622r();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008d, code lost:
        return;
     */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo5622r() {
        /*
            r10 = this;
            java.lang.Object r0 = r10.f4576a
            monitor-enter(r0)
            android.util.LongSparseArray<androidx.camera.core.a2> r1 = r10.f4584i     // Catch:{ all -> 0x008e }
            int r1 = r1.size()     // Catch:{ all -> 0x008e }
            if (r1 == 0) goto L_0x008c
            android.util.LongSparseArray<androidx.camera.core.z1> r1 = r10.f4583h     // Catch:{ all -> 0x008e }
            int r1 = r1.size()     // Catch:{ all -> 0x008e }
            if (r1 != 0) goto L_0x0015
            goto L_0x008c
        L_0x0015:
            android.util.LongSparseArray<androidx.camera.core.a2> r1 = r10.f4584i     // Catch:{ all -> 0x008e }
            r2 = 0
            long r3 = r1.keyAt(r2)     // Catch:{ all -> 0x008e }
            java.lang.Long r1 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x008e }
            android.util.LongSparseArray<androidx.camera.core.z1> r3 = r10.f4583h     // Catch:{ all -> 0x008e }
            long r3 = r3.keyAt(r2)     // Catch:{ all -> 0x008e }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x008e }
            boolean r4 = r3.equals(r1)     // Catch:{ all -> 0x008e }
            r5 = 1
            if (r4 != 0) goto L_0x0032
            r2 = r5
        L_0x0032:
            androidx.core.util.C18001r.m81764a(r2)     // Catch:{ all -> 0x008e }
            long r6 = r3.longValue()     // Catch:{ all -> 0x008e }
            long r8 = r1.longValue()     // Catch:{ all -> 0x008e }
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r2 <= 0) goto L_0x006b
            android.util.LongSparseArray<androidx.camera.core.a2> r1 = r10.f4584i     // Catch:{ all -> 0x008e }
            int r1 = r1.size()     // Catch:{ all -> 0x008e }
            int r1 = r1 - r5
        L_0x0048:
            if (r1 < 0) goto L_0x008a
            android.util.LongSparseArray<androidx.camera.core.a2> r2 = r10.f4584i     // Catch:{ all -> 0x008e }
            long r4 = r2.keyAt(r1)     // Catch:{ all -> 0x008e }
            long r6 = r3.longValue()     // Catch:{ all -> 0x008e }
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x0068
            android.util.LongSparseArray<androidx.camera.core.a2> r2 = r10.f4584i     // Catch:{ all -> 0x008e }
            java.lang.Object r2 = r2.valueAt(r1)     // Catch:{ all -> 0x008e }
            androidx.camera.core.a2 r2 = (androidx.camera.core.C1353a2) r2     // Catch:{ all -> 0x008e }
            r2.close()     // Catch:{ all -> 0x008e }
            android.util.LongSparseArray<androidx.camera.core.a2> r2 = r10.f4584i     // Catch:{ all -> 0x008e }
            r2.removeAt(r1)     // Catch:{ all -> 0x008e }
        L_0x0068:
            int r1 = r1 + -1
            goto L_0x0048
        L_0x006b:
            android.util.LongSparseArray<androidx.camera.core.z1> r2 = r10.f4583h     // Catch:{ all -> 0x008e }
            int r2 = r2.size()     // Catch:{ all -> 0x008e }
            int r2 = r2 - r5
        L_0x0072:
            if (r2 < 0) goto L_0x008a
            android.util.LongSparseArray<androidx.camera.core.z1> r3 = r10.f4583h     // Catch:{ all -> 0x008e }
            long r3 = r3.keyAt(r2)     // Catch:{ all -> 0x008e }
            long r5 = r1.longValue()     // Catch:{ all -> 0x008e }
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 >= 0) goto L_0x0087
            android.util.LongSparseArray<androidx.camera.core.z1> r3 = r10.f4583h     // Catch:{ all -> 0x008e }
            r3.removeAt(r2)     // Catch:{ all -> 0x008e }
        L_0x0087:
            int r2 = r2 + -1
            goto L_0x0072
        L_0x008a:
            monitor-exit(r0)     // Catch:{ all -> 0x008e }
            return
        L_0x008c:
            monitor-exit(r0)     // Catch:{ all -> 0x008e }
            return
        L_0x008e:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x008e }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.C1638l2.mo5622r():void");
    }

    /* renamed from: s */
    public void mo5623s(C1456h hVar) {
        synchronized (this.f4576a) {
            if (!this.f4579d) {
                this.f4583h.put(hVar.getTimestamp(), new C1592b(hVar));
                mo5621q();
            }
        }
    }

    public C1638l2(@C0359n0 C1500r0 r0Var) {
        this.f4576a = new Object();
        this.f4577b = new C1639a();
        this.f4578c = new C1633k2(this);
        this.f4579d = false;
        this.f4583h = new LongSparseArray<>();
        this.f4584i = new LongSparseArray<>();
        this.f4587l = new ArrayList();
        this.f4580e = r0Var;
        this.f4585j = 0;
        this.f4586k = new ArrayList(mo5006e());
    }
}
