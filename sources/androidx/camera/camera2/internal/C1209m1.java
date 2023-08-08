package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraDevice;
import androidx.annotation.C0323b0;
import androidx.annotation.C0359n0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: androidx.camera.camera2.internal.m1 */
public class C1209m1 {
    @C0359n0

    /* renamed from: a */
    public final Executor f3462a;

    /* renamed from: b */
    public final Object f3463b = new Object();
    @C0323b0("mLock")

    /* renamed from: c */
    public final Set<C1185g2> f3464c = new LinkedHashSet();
    @C0323b0("mLock")

    /* renamed from: d */
    public final Set<C1185g2> f3465d = new LinkedHashSet();
    @C0323b0("mLock")

    /* renamed from: e */
    public final Set<C1185g2> f3466e = new LinkedHashSet();

    /* renamed from: f */
    public final CameraDevice.StateCallback f3467f = new C1210a();

    /* renamed from: androidx.camera.camera2.internal.m1$a */
    public class C1210a extends CameraDevice.StateCallback {
        public C1210a() {
        }

        /* renamed from: b */
        public final void mo4559b() {
            List<C1185g2> g;
            synchronized (C1209m1.this.f3463b) {
                g = C1209m1.this.mo4553g();
                C1209m1.this.f3466e.clear();
                C1209m1.this.f3464c.clear();
                C1209m1.this.f3465d.clear();
            }
            for (C1185g2 g2 : g) {
                g2.mo4517g();
            }
        }

        /* renamed from: c */
        public final void mo4560c() {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            synchronized (C1209m1.this.f3463b) {
                linkedHashSet.addAll(C1209m1.this.f3466e);
                linkedHashSet.addAll(C1209m1.this.f3464c);
            }
            C1209m1.this.f3462a.execute(new C1205l1(linkedHashSet));
        }

        public void onClosed(@C0359n0 CameraDevice cameraDevice) {
            mo4559b();
        }

        public void onDisconnected(@C0359n0 CameraDevice cameraDevice) {
            mo4560c();
            mo4559b();
        }

        public void onError(@C0359n0 CameraDevice cameraDevice, int i) {
            mo4560c();
            mo4559b();
        }

        public void onOpened(@C0359n0 CameraDevice cameraDevice) {
        }
    }

    public C1209m1(@C0359n0 Executor executor) {
        this.f3462a = executor;
    }

    /* renamed from: b */
    public static void m4983b(@C0359n0 Set<C1185g2> set) {
        for (C1185g2 next : set) {
            next.mo4516f().mo4530v(next);
        }
    }

    /* renamed from: a */
    public final void mo4548a(@C0359n0 C1185g2 g2Var) {
        C1185g2 next;
        Iterator<C1185g2> it = mo4553g().iterator();
        while (it.hasNext() && (next = it.next()) != g2Var) {
            next.mo4517g();
        }
    }

    @C0359n0
    /* renamed from: c */
    public CameraDevice.StateCallback mo4549c() {
        return this.f3467f;
    }

    @C0359n0
    /* renamed from: d */
    public List<C1185g2> mo4550d() {
        ArrayList arrayList;
        synchronized (this.f3463b) {
            arrayList = new ArrayList(this.f3464c);
        }
        return arrayList;
    }

    @C0359n0
    /* renamed from: e */
    public List<C1185g2> mo4551e() {
        ArrayList arrayList;
        synchronized (this.f3463b) {
            arrayList = new ArrayList(this.f3465d);
        }
        return arrayList;
    }

    @C0359n0
    /* renamed from: f */
    public List<C1185g2> mo4552f() {
        ArrayList arrayList;
        synchronized (this.f3463b) {
            arrayList = new ArrayList(this.f3466e);
        }
        return arrayList;
    }

    @C0359n0
    /* renamed from: g */
    public List<C1185g2> mo4553g() {
        ArrayList arrayList;
        synchronized (this.f3463b) {
            arrayList = new ArrayList();
            arrayList.addAll(mo4550d());
            arrayList.addAll(mo4552f());
        }
        return arrayList;
    }

    /* renamed from: h */
    public void mo4554h(@C0359n0 C1185g2 g2Var) {
        synchronized (this.f3463b) {
            this.f3464c.remove(g2Var);
            this.f3465d.remove(g2Var);
        }
    }

    /* renamed from: i */
    public void mo4555i(@C0359n0 C1185g2 g2Var) {
        synchronized (this.f3463b) {
            this.f3465d.add(g2Var);
        }
    }

    /* renamed from: j */
    public void mo4556j(@C0359n0 C1185g2 g2Var) {
        mo4548a(g2Var);
        synchronized (this.f3463b) {
            this.f3466e.remove(g2Var);
        }
    }

    /* renamed from: k */
    public void mo4557k(@C0359n0 C1185g2 g2Var) {
        synchronized (this.f3463b) {
            this.f3464c.add(g2Var);
            this.f3466e.remove(g2Var);
        }
        mo4548a(g2Var);
    }

    /* renamed from: l */
    public void mo4558l(@C0359n0 C1185g2 g2Var) {
        synchronized (this.f3463b) {
            this.f3466e.add(g2Var);
        }
    }
}
