package androidx.camera.core;

import androidx.annotation.C0323b0;
import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.camera.core.impl.C1500r0;
import androidx.camera.core.impl.utils.futures.C1544c;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* renamed from: androidx.camera.core.y0 */
public final class C1723y0 extends C1711w0 {

    /* renamed from: g */
    public final Executor f4798g;

    /* renamed from: h */
    public final Object f4799h = new Object();
    @C0363p0
    @C0344h1
    @C0323b0("mLock")

    /* renamed from: i */
    public C1353a2 f4800i;
    @C0363p0
    @C0323b0("mLock")

    /* renamed from: j */
    public C1725b f4801j;

    /* renamed from: androidx.camera.core.y0$a */
    public class C1724a implements C1544c<Void> {

        /* renamed from: a */
        public final /* synthetic */ C1725b f4802a;

        public C1724a(C1725b bVar) {
            this.f4802a = bVar;
        }

        /* renamed from: b */
        public void mo4161b(Throwable th) {
            this.f4802a.close();
        }

        /* renamed from: c */
        public void mo4160a(Void voidR) {
        }
    }

    /* renamed from: androidx.camera.core.y0$b */
    public static class C1725b extends C1663p0 {

        /* renamed from: c */
        public final WeakReference<C1723y0> f4804c;

        public C1725b(C1353a2 a2Var, C1723y0 y0Var) {
            super(a2Var);
            this.f4804c = new WeakReference<>(y0Var);
            mo5656a(new C1352a1(this));
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m6968d(C1353a2 a2Var) {
            C1723y0 y0Var = this.f4804c.get();
            if (y0Var != null) {
                y0Var.f4798g.execute(new C1740z0(y0Var));
            }
        }
    }

    public C1723y0(Executor executor) {
        this.f4798g = executor;
    }

    @C0363p0
    /* renamed from: d */
    public C1353a2 mo5748d(@C0359n0 C1500r0 r0Var) {
        return r0Var.mo5003c();
    }

    /* renamed from: g */
    public void mo5751g() {
        synchronized (this.f4799h) {
            C1353a2 a2Var = this.f4800i;
            if (a2Var != null) {
                a2Var.close();
                this.f4800i = null;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0034, code lost:
        return;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo5753k(@androidx.annotation.C0359n0 androidx.camera.core.C1353a2 r6) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f4799h
            monitor-enter(r0)
            boolean r1 = r5.f4759e     // Catch:{ all -> 0x004e }
            if (r1 != 0) goto L_0x000c
            r6.close()     // Catch:{ all -> 0x004e }
            monitor-exit(r0)     // Catch:{ all -> 0x004e }
            return
        L_0x000c:
            androidx.camera.core.y0$b r1 = r5.f4801j     // Catch:{ all -> 0x004e }
            if (r1 == 0) goto L_0x0035
            androidx.camera.core.z1 r1 = r6.mo4977q3()     // Catch:{ all -> 0x004e }
            long r1 = r1.getTimestamp()     // Catch:{ all -> 0x004e }
            androidx.camera.core.y0$b r3 = r5.f4801j     // Catch:{ all -> 0x004e }
            androidx.camera.core.z1 r3 = r3.mo4977q3()     // Catch:{ all -> 0x004e }
            long r3 = r3.getTimestamp()     // Catch:{ all -> 0x004e }
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 > 0) goto L_0x002a
            r6.close()     // Catch:{ all -> 0x004e }
            goto L_0x0033
        L_0x002a:
            androidx.camera.core.a2 r1 = r5.f4800i     // Catch:{ all -> 0x004e }
            if (r1 == 0) goto L_0x0031
            r1.close()     // Catch:{ all -> 0x004e }
        L_0x0031:
            r5.f4800i = r6     // Catch:{ all -> 0x004e }
        L_0x0033:
            monitor-exit(r0)     // Catch:{ all -> 0x004e }
            return
        L_0x0035:
            androidx.camera.core.y0$b r1 = new androidx.camera.core.y0$b     // Catch:{ all -> 0x004e }
            r1.<init>(r6, r5)     // Catch:{ all -> 0x004e }
            r5.f4801j = r1     // Catch:{ all -> 0x004e }
            com.google.common.util.concurrent.a r6 = r5.mo5749e(r1)     // Catch:{ all -> 0x004e }
            androidx.camera.core.y0$a r2 = new androidx.camera.core.y0$a     // Catch:{ all -> 0x004e }
            r2.<init>(r1)     // Catch:{ all -> 0x004e }
            java.util.concurrent.Executor r1 = androidx.camera.core.impl.utils.executor.C1525a.m6437a()     // Catch:{ all -> 0x004e }
            androidx.camera.core.impl.utils.futures.C1548f.m6473b(r6, r2, r1)     // Catch:{ all -> 0x004e }
            monitor-exit(r0)     // Catch:{ all -> 0x004e }
            return
        L_0x004e:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x004e }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.C1723y0.mo5753k(androidx.camera.core.a2):void");
    }

    /* renamed from: n */
    public void mo5766n() {
        synchronized (this.f4799h) {
            this.f4801j = null;
            C1353a2 a2Var = this.f4800i;
            if (a2Var != null) {
                this.f4800i = null;
                mo5753k(a2Var);
            }
        }
    }
}
