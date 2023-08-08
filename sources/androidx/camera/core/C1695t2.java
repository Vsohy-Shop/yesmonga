package androidx.camera.core;

import android.media.ImageReader;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.C0323b0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.camera.core.impl.C1430a0;
import androidx.camera.core.impl.C1448f;
import androidx.camera.core.impl.C1500r0;
import androidx.camera.core.impl.C1581x;
import androidx.camera.core.impl.C1587z;
import androidx.camera.core.impl.utils.futures.C1544c;
import androidx.camera.core.impl.utils.futures.C1548f;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.C18001r;
import com.google.common.util.concurrent.C32487a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: androidx.camera.core.t2 */
public class C1695t2 implements C1500r0 {

    /* renamed from: r */
    public static final String f4707r = "ProcessingImageReader";

    /* renamed from: a */
    public final Object f4708a;

    /* renamed from: b */
    public C1500r0.C1501a f4709b;

    /* renamed from: c */
    public C1500r0.C1501a f4710c;

    /* renamed from: d */
    public C1544c<List<C1353a2>> f4711d;
    @C0323b0("mLock")

    /* renamed from: e */
    public boolean f4712e;
    @C0323b0("mLock")

    /* renamed from: f */
    public boolean f4713f;
    @C0323b0("mLock")

    /* renamed from: g */
    public final C1638l2 f4714g;
    @C0323b0("mLock")

    /* renamed from: h */
    public final C1500r0 f4715h;
    @C0363p0
    @C0323b0("mLock")

    /* renamed from: i */
    public C1500r0.C1501a f4716i;
    @C0363p0
    @C0323b0("mLock")

    /* renamed from: j */
    public Executor f4717j;
    @C0323b0("mLock")

    /* renamed from: k */
    public CallbackToFutureAdapter.C16559a<Void> f4718k;
    @C0323b0("mLock")

    /* renamed from: l */
    public C32487a<Void> f4719l;
    @C0359n0

    /* renamed from: m */
    public final Executor f4720m;
    @C0359n0

    /* renamed from: n */
    public final C1587z f4721n;

    /* renamed from: o */
    public String f4722o;
    @C0323b0("mLock")
    @C0359n0

    /* renamed from: p */
    public C1385d3 f4723p;

    /* renamed from: q */
    public final List<Integer> f4724q;

    /* renamed from: androidx.camera.core.t2$a */
    public class C1696a implements C1500r0.C1501a {
        public C1696a() {
        }

        /* renamed from: a */
        public void mo4997a(@C0359n0 C1500r0 r0Var) {
            C1695t2.this.mo5737k(r0Var);
        }
    }

    /* renamed from: androidx.camera.core.t2$b */
    public class C1697b implements C1500r0.C1501a {
        public C1697b() {
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public /* synthetic */ void m6920c(C1500r0.C1501a aVar) {
            aVar.mo4997a(C1695t2.this);
        }

        /* renamed from: a */
        public void mo4997a(@C0359n0 C1500r0 r0Var) {
            C1500r0.C1501a aVar;
            Executor executor;
            synchronized (C1695t2.this.f4708a) {
                C1695t2 t2Var = C1695t2.this;
                aVar = t2Var.f4716i;
                executor = t2Var.f4717j;
                t2Var.f4723p.mo5085e();
                C1695t2.this.mo5739n();
            }
            if (aVar == null) {
                return;
            }
            if (executor != null) {
                executor.execute(new C1703u2(this, aVar));
            } else {
                aVar.mo4997a(C1695t2.this);
            }
        }
    }

    /* renamed from: androidx.camera.core.t2$c */
    public class C1698c implements C1544c<List<C1353a2>> {
        public C1698c() {
        }

        /* renamed from: b */
        public void mo4161b(Throwable th) {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x001c, code lost:
            monitor-enter(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
            r3 = r2.f4727a;
            r3.f4713f = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0024, code lost:
            if (r3.f4712e == false) goto L_0x0043;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
            r3.f4714g.close();
            r2.f4727a.f4723p.mo5084d();
            r2.f4727a.f4715h.close();
            r3 = r2.f4727a.f4718k;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x003d, code lost:
            if (r3 == null) goto L_0x0043;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x003f, code lost:
            r3.mo48125c(null);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0043, code lost:
            monitor-exit(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0044, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
            r0.f4721n.mo5573c(r1);
            r0 = r2.f4727a.f4708a;
         */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo4160a(@androidx.annotation.C0363p0 java.util.List<androidx.camera.core.C1353a2> r3) {
            /*
                r2 = this;
                androidx.camera.core.t2 r3 = androidx.camera.core.C1695t2.this
                java.lang.Object r3 = r3.f4708a
                monitor-enter(r3)
                androidx.camera.core.t2 r0 = androidx.camera.core.C1695t2.this     // Catch:{ all -> 0x0048 }
                boolean r1 = r0.f4712e     // Catch:{ all -> 0x0048 }
                if (r1 == 0) goto L_0x000d
                monitor-exit(r3)     // Catch:{ all -> 0x0048 }
                return
            L_0x000d:
                r1 = 1
                r0.f4713f = r1     // Catch:{ all -> 0x0048 }
                androidx.camera.core.d3 r1 = r0.f4723p     // Catch:{ all -> 0x0048 }
                monitor-exit(r3)     // Catch:{ all -> 0x0048 }
                androidx.camera.core.impl.z r3 = r0.f4721n
                r3.mo5573c(r1)
                androidx.camera.core.t2 r3 = androidx.camera.core.C1695t2.this
                java.lang.Object r0 = r3.f4708a
                monitor-enter(r0)
                androidx.camera.core.t2 r3 = androidx.camera.core.C1695t2.this     // Catch:{ all -> 0x0045 }
                r1 = 0
                r3.f4713f = r1     // Catch:{ all -> 0x0045 }
                boolean r1 = r3.f4712e     // Catch:{ all -> 0x0045 }
                if (r1 == 0) goto L_0x0043
                androidx.camera.core.l2 r3 = r3.f4714g     // Catch:{ all -> 0x0045 }
                r3.close()     // Catch:{ all -> 0x0045 }
                androidx.camera.core.t2 r3 = androidx.camera.core.C1695t2.this     // Catch:{ all -> 0x0045 }
                androidx.camera.core.d3 r3 = r3.f4723p     // Catch:{ all -> 0x0045 }
                r3.mo5084d()     // Catch:{ all -> 0x0045 }
                androidx.camera.core.t2 r3 = androidx.camera.core.C1695t2.this     // Catch:{ all -> 0x0045 }
                androidx.camera.core.impl.r0 r3 = r3.f4715h     // Catch:{ all -> 0x0045 }
                r3.close()     // Catch:{ all -> 0x0045 }
                androidx.camera.core.t2 r3 = androidx.camera.core.C1695t2.this     // Catch:{ all -> 0x0045 }
                androidx.concurrent.futures.CallbackToFutureAdapter$a<java.lang.Void> r3 = r3.f4718k     // Catch:{ all -> 0x0045 }
                if (r3 == 0) goto L_0x0043
                r1 = 0
                r3.mo48125c(r1)     // Catch:{ all -> 0x0045 }
            L_0x0043:
                monitor-exit(r0)     // Catch:{ all -> 0x0045 }
                return
            L_0x0045:
                r3 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0045 }
                throw r3
            L_0x0048:
                r0 = move-exception
                monitor-exit(r3)     // Catch:{ all -> 0x0048 }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.C1695t2.C1698c.mo4160a(java.util.List):void");
        }
    }

    public C1695t2(int i, int i2, int i3, int i4, @C0359n0 Executor executor, @C0359n0 C1581x xVar, @C0359n0 C1587z zVar) {
        this(i, i2, i3, i4, executor, xVar, zVar, i3);
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public /* synthetic */ Object m6905l(CallbackToFutureAdapter.C16559a aVar) throws Exception {
        synchronized (this.f4708a) {
            this.f4718k = aVar;
        }
        return "ProcessingImageReader-close";
    }

    @C0363p0
    /* renamed from: a */
    public Surface mo5002a() {
        Surface a;
        synchronized (this.f4708a) {
            a = this.f4714g.mo5002a();
        }
        return a;
    }

    @C0363p0
    /* renamed from: c */
    public C1353a2 mo5003c() {
        C1353a2 c;
        synchronized (this.f4708a) {
            c = this.f4715h.mo5003c();
        }
        return c;
    }

    public void close() {
        synchronized (this.f4708a) {
            if (!this.f4712e) {
                this.f4715h.mo5005d();
                if (!this.f4713f) {
                    this.f4714g.close();
                    this.f4723p.mo5084d();
                    this.f4715h.close();
                    CallbackToFutureAdapter.C16559a<Void> aVar = this.f4718k;
                    if (aVar != null) {
                        aVar.mo48125c(null);
                    }
                }
                this.f4712e = true;
            }
        }
    }

    /* renamed from: d */
    public void mo5005d() {
        synchronized (this.f4708a) {
            this.f4716i = null;
            this.f4717j = null;
            this.f4714g.mo5005d();
            this.f4715h.mo5005d();
            if (!this.f4713f) {
                this.f4723p.mo5084d();
            }
        }
    }

    /* renamed from: e */
    public int mo5006e() {
        int e;
        synchronized (this.f4708a) {
            e = this.f4714g.mo5006e();
        }
        return e;
    }

    /* renamed from: f */
    public void mo5007f(@C0359n0 C1500r0.C1501a aVar, @C0359n0 Executor executor) {
        synchronized (this.f4708a) {
            this.f4716i = (C1500r0.C1501a) C18001r.m81775l(aVar);
            this.f4717j = (Executor) C18001r.m81775l(executor);
            this.f4714g.mo5007f(this.f4709b, executor);
            this.f4715h.mo5007f(this.f4710c, executor);
        }
    }

    @C0363p0
    /* renamed from: g */
    public C1353a2 mo5008g() {
        C1353a2 g;
        synchronized (this.f4708a) {
            g = this.f4715h.mo5008g();
        }
        return g;
    }

    public int getHeight() {
        int height;
        synchronized (this.f4708a) {
            height = this.f4714g.getHeight();
        }
        return height;
    }

    public int getImageFormat() {
        int imageFormat;
        synchronized (this.f4708a) {
            imageFormat = this.f4715h.getImageFormat();
        }
        return imageFormat;
    }

    public int getWidth() {
        int width;
        synchronized (this.f4708a) {
            width = this.f4714g.getWidth();
        }
        return width;
    }

    @C0363p0
    /* renamed from: h */
    public C1448f mo5734h() {
        C1448f m;
        synchronized (this.f4708a) {
            m = this.f4714g.mo5619m();
        }
        return m;
    }

    @C0359n0
    /* renamed from: i */
    public C32487a<Void> mo5735i() {
        C32487a<Void> aVar;
        synchronized (this.f4708a) {
            if (!this.f4712e || this.f4713f) {
                if (this.f4719l == null) {
                    this.f4719l = CallbackToFutureAdapter.m74987a(new C1686s2(this));
                }
                aVar = C1548f.m6481j(this.f4719l);
            } else {
                aVar = C1548f.m6479h(null);
            }
        }
        return aVar;
    }

    @C0359n0
    /* renamed from: j */
    public String mo5736j() {
        return this.f4722o;
    }

    /* renamed from: k */
    public void mo5737k(C1500r0 r0Var) {
        synchronized (this.f4708a) {
            if (!this.f4712e) {
                try {
                    C1353a2 g = r0Var.mo5008g();
                    if (g != null) {
                        Integer d = g.mo4977q3().mo5101b().mo5239d(this.f4722o);
                        if (!this.f4724q.contains(d)) {
                            C1417i2.m5924n(f4707r, "ImageProxyBundle does not contain this id: " + d);
                            g.close();
                        } else {
                            this.f4723p.mo5083c(g);
                        }
                    }
                } catch (IllegalStateException e) {
                    C1417i2.m5914d(f4707r, "Failed to acquire latest image.", e);
                }
                return;
            }
            return;
        }
    }

    /* renamed from: m */
    public void mo5738m(@C0359n0 C1581x xVar) {
        synchronized (this.f4708a) {
            if (xVar.mo5074a() != null) {
                if (this.f4714g.mo5006e() >= xVar.mo5074a().size()) {
                    this.f4724q.clear();
                    for (C1430a0 next : xVar.mo5074a()) {
                        if (next != null) {
                            this.f4724q.add(Integer.valueOf(next.getId()));
                        }
                    }
                } else {
                    throw new IllegalArgumentException("CaptureBundle is larger than InputImageReader.");
                }
            }
            String num = Integer.toString(xVar.hashCode());
            this.f4722o = num;
            this.f4723p = new C1385d3(this.f4724q, num);
            mo5739n();
        }
    }

    @C0323b0("mLock")
    /* renamed from: n */
    public void mo5739n() {
        ArrayList arrayList = new ArrayList();
        for (Integer intValue : this.f4724q) {
            arrayList.add(this.f4723p.mo5082b(intValue.intValue()));
        }
        C1548f.m6473b(C1548f.m6474c(arrayList), this.f4711d, this.f4720m);
    }

    public C1695t2(int i, int i2, int i3, int i4, @C0359n0 Executor executor, @C0359n0 C1581x xVar, @C0359n0 C1587z zVar, int i5) {
        this(new C1638l2(i, i2, i3, i4), executor, xVar, zVar, i5);
    }

    public C1695t2(@C0359n0 C1638l2 l2Var, @C0359n0 Executor executor, @C0359n0 C1581x xVar, @C0359n0 C1587z zVar) {
        this(l2Var, executor, xVar, zVar, l2Var.getImageFormat());
    }

    public C1695t2(@C0359n0 C1638l2 l2Var, @C0359n0 Executor executor, @C0359n0 C1581x xVar, @C0359n0 C1587z zVar, int i) {
        this.f4708a = new Object();
        this.f4709b = new C1696a();
        this.f4710c = new C1697b();
        this.f4711d = new C1698c();
        this.f4712e = false;
        this.f4713f = false;
        this.f4722o = new String();
        this.f4723p = new C1385d3(Collections.emptyList(), this.f4722o);
        this.f4724q = new ArrayList();
        if (l2Var.mo5006e() >= xVar.mo5074a().size()) {
            this.f4714g = l2Var;
            int width = l2Var.getWidth();
            int height = l2Var.getHeight();
            if (i == 256) {
                width = l2Var.getWidth() * l2Var.getHeight();
                height = 1;
            }
            C1381d dVar = new C1381d(ImageReader.newInstance(width, height, i, l2Var.mo5006e()));
            this.f4715h = dVar;
            this.f4720m = executor;
            this.f4721n = zVar;
            zVar.mo5571a(dVar.mo5002a(), i);
            zVar.mo5572b(new Size(l2Var.getWidth(), l2Var.getHeight()));
            mo5738m(xVar);
            return;
        }
        throw new IllegalArgumentException("MetadataImageReader is smaller than CaptureBundle.");
    }
}
