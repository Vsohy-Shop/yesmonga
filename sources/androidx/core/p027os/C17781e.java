package androidx.core.p027os;

import android.os.CancellationSignal;
import androidx.annotation.C0363p0;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;

/* renamed from: androidx.core.os.e */
public final class C17781e {

    /* renamed from: a */
    public boolean f46177a;

    /* renamed from: b */
    public C17783b f46178b;

    /* renamed from: c */
    public Object f46179c;

    /* renamed from: d */
    public boolean f46180d;

    @C0376v0(16)
    /* renamed from: androidx.core.os.e$a */
    public static class C17782a {
        @C0373u
        /* renamed from: a */
        public static void m81172a(Object obj) {
            ((CancellationSignal) obj).cancel();
        }

        @C0373u
        /* renamed from: b */
        public static CancellationSignal m81173b() {
            return new CancellationSignal();
        }
    }

    /* renamed from: androidx.core.os.e$b */
    public interface C17783b {
        void onCancel();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r0.onCancel();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0018, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001a, code lost:
        if (r1 == null) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001c, code lost:
        androidx.core.p027os.C17781e.C17782a.m81172a(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0020, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r3.f46180d = false;
        notifyAll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0027, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x002b, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r3.f46180d = false;
        notifyAll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0031, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0032, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        if (r0 == null) goto L_0x001a;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo52219a() {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.f46177a     // Catch:{ all -> 0x0036 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r3)     // Catch:{ all -> 0x0036 }
            return
        L_0x0007:
            r0 = 1
            r3.f46177a = r0     // Catch:{ all -> 0x0036 }
            r3.f46180d = r0     // Catch:{ all -> 0x0036 }
            androidx.core.os.e$b r0 = r3.f46178b     // Catch:{ all -> 0x0036 }
            java.lang.Object r1 = r3.f46179c     // Catch:{ all -> 0x0036 }
            monitor-exit(r3)     // Catch:{ all -> 0x0036 }
            r2 = 0
            if (r0 == 0) goto L_0x001a
            r0.onCancel()     // Catch:{ all -> 0x0018 }
            goto L_0x001a
        L_0x0018:
            r0 = move-exception
            goto L_0x0020
        L_0x001a:
            if (r1 == 0) goto L_0x002b
            androidx.core.p027os.C17781e.C17782a.m81172a(r1)     // Catch:{ all -> 0x0018 }
            goto L_0x002b
        L_0x0020:
            monitor-enter(r3)
            r3.f46180d = r2     // Catch:{ all -> 0x0028 }
            r3.notifyAll()     // Catch:{ all -> 0x0028 }
            monitor-exit(r3)     // Catch:{ all -> 0x0028 }
            throw r0
        L_0x0028:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0028 }
            throw r0
        L_0x002b:
            monitor-enter(r3)
            r3.f46180d = r2     // Catch:{ all -> 0x0033 }
            r3.notifyAll()     // Catch:{ all -> 0x0033 }
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            return
        L_0x0033:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            throw r0
        L_0x0036:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0036 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.p027os.C17781e.mo52219a():void");
    }

    @C0363p0
    /* renamed from: b */
    public Object mo52220b() {
        Object obj;
        synchronized (this) {
            if (this.f46179c == null) {
                CancellationSignal b = C17782a.m81173b();
                this.f46179c = b;
                if (this.f46177a) {
                    C17782a.m81172a(b);
                }
            }
            obj = this.f46179c;
        }
        return obj;
    }

    /* renamed from: c */
    public boolean mo52221c() {
        boolean z;
        synchronized (this) {
            z = this.f46177a;
        }
        return z;
    }

    /* renamed from: d */
    public void mo52222d(@C0363p0 C17783b bVar) {
        synchronized (this) {
            mo52224f();
            if (this.f46178b != bVar) {
                this.f46178b = bVar;
                if (this.f46177a) {
                    if (bVar != null) {
                        bVar.onCancel();
                    }
                }
            }
        }
    }

    /* renamed from: e */
    public void mo52223e() {
        if (mo52221c()) {
            throw new OperationCanceledException();
        }
    }

    /* renamed from: f */
    public final void mo52224f() {
        while (this.f46180d) {
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
    }
}
