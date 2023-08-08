package androidx.camera.lifecycle;

import androidx.annotation.C0323b0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.camera.core.C1394e4;
import androidx.camera.core.UseCase;
import androidx.camera.core.internal.CameraUseCaseAdapter;
import androidx.core.util.C18001r;
import androidx.lifecycle.C19428i0;
import androidx.lifecycle.C19475v;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.Lifecycle;
import com.google.auto.value.C32455c;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class LifecycleCameraRepository {

    /* renamed from: a */
    public final Object f4819a = new Object();
    @C0323b0("mLock")

    /* renamed from: b */
    public final Map<C1744a, LifecycleCamera> f4820b = new HashMap();
    @C0323b0("mLock")

    /* renamed from: c */
    public final Map<LifecycleCameraRepositoryObserver, Set<C1744a>> f4821c = new HashMap();
    @C0323b0("mLock")

    /* renamed from: d */
    public final ArrayDeque<C19499w> f4822d = new ArrayDeque<>();

    public static class LifecycleCameraRepositoryObserver implements C19475v {

        /* renamed from: a */
        public final LifecycleCameraRepository f4823a;

        /* renamed from: b */
        public final C19499w f4824b;

        public LifecycleCameraRepositoryObserver(C19499w wVar, LifecycleCameraRepository lifecycleCameraRepository) {
            this.f4824b = wVar;
            this.f4823a = lifecycleCameraRepository;
        }

        /* renamed from: a */
        public C19499w mo5801a() {
            return this.f4824b;
        }

        @C19428i0(Lifecycle.C19372Event.ON_DESTROY)
        public void onDestroy(C19499w wVar) {
            this.f4823a.mo5799n(wVar);
        }

        @C19428i0(Lifecycle.C19372Event.ON_START)
        public void onStart(C19499w wVar) {
            this.f4823a.mo5794i(wVar);
        }

        @C19428i0(Lifecycle.C19372Event.ON_STOP)
        public void onStop(C19499w wVar) {
            this.f4823a.mo5795j(wVar);
        }
    }

    @C32455c
    /* renamed from: androidx.camera.lifecycle.LifecycleCameraRepository$a */
    public static abstract class C1744a {
        /* renamed from: a */
        public static C1744a m7006a(@C0359n0 C19499w wVar, @C0359n0 CameraUseCaseAdapter.C1589a aVar) {
            return new C1745a(wVar, aVar);
        }

        @C0359n0
        /* renamed from: b */
        public abstract CameraUseCaseAdapter.C1589a mo5805b();

        @C0359n0
        /* renamed from: c */
        public abstract C19499w mo5806c();
    }

    /* renamed from: a */
    public void mo5786a(@C0359n0 LifecycleCamera lifecycleCamera, @C0363p0 C1394e4 e4Var, @C0359n0 Collection<UseCase> collection) {
        boolean z;
        synchronized (this.f4819a) {
            if (!collection.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            C18001r.m81764a(z);
            C19499w o = lifecycleCamera.mo5774o();
            for (C1744a aVar : this.f4821c.get(mo5790e(o))) {
                LifecycleCamera lifecycleCamera2 = (LifecycleCamera) C18001r.m81775l(this.f4820b.get(aVar));
                if (!lifecycleCamera2.equals(lifecycleCamera)) {
                    if (!lifecycleCamera2.mo5778p().isEmpty()) {
                        throw new IllegalArgumentException("Multiple LifecycleCameras with use cases are registered to the same LifecycleOwner.");
                    }
                }
            }
            try {
                lifecycleCamera.mo5773n().mo5588x(e4Var);
                lifecycleCamera.mo5772g(collection);
                if (o.getLifecycle().mo57465b().mo57474q(Lifecycle.State.STARTED)) {
                    mo5794i(o);
                }
            } catch (CameraUseCaseAdapter.CameraException e) {
                throw new IllegalArgumentException(e.getMessage());
            }
        }
    }

    /* renamed from: b */
    public void mo5787b() {
        synchronized (this.f4819a) {
            for (LifecycleCameraRepositoryObserver a : new HashSet(this.f4821c.keySet())) {
                mo5799n(a.mo5801a());
            }
        }
    }

    /* renamed from: c */
    public LifecycleCamera mo5788c(@C0359n0 C19499w wVar, @C0359n0 CameraUseCaseAdapter cameraUseCaseAdapter) {
        boolean z;
        LifecycleCamera lifecycleCamera;
        synchronized (this.f4819a) {
            if (this.f4820b.get(C1744a.m7006a(wVar, cameraUseCaseAdapter.mo5582r())) == null) {
                z = true;
            } else {
                z = false;
            }
            C18001r.m81765b(z, "LifecycleCamera already exists for the given LifecycleOwner and set of cameras");
            if (wVar.getLifecycle().mo57465b() != Lifecycle.State.DESTROYED) {
                lifecycleCamera = new LifecycleCamera(wVar, cameraUseCaseAdapter);
                if (cameraUseCaseAdapter.mo5584t().isEmpty()) {
                    lifecycleCamera.mo5782t();
                }
                mo5793h(lifecycleCamera);
            } else {
                throw new IllegalArgumentException("Trying to create LifecycleCamera with destroyed lifecycle.");
            }
        }
        return lifecycleCamera;
    }

    @C0363p0
    /* renamed from: d */
    public LifecycleCamera mo5789d(C19499w wVar, CameraUseCaseAdapter.C1589a aVar) {
        LifecycleCamera lifecycleCamera;
        synchronized (this.f4819a) {
            lifecycleCamera = this.f4820b.get(C1744a.m7006a(wVar, aVar));
        }
        return lifecycleCamera;
    }

    /* renamed from: e */
    public final LifecycleCameraRepositoryObserver mo5790e(C19499w wVar) {
        synchronized (this.f4819a) {
            for (LifecycleCameraRepositoryObserver next : this.f4821c.keySet()) {
                if (wVar.equals(next.mo5801a())) {
                    return next;
                }
            }
            return null;
        }
    }

    /* renamed from: f */
    public Collection<LifecycleCamera> mo5791f() {
        Collection<LifecycleCamera> unmodifiableCollection;
        synchronized (this.f4819a) {
            unmodifiableCollection = Collections.unmodifiableCollection(this.f4820b.values());
        }
        return unmodifiableCollection;
    }

    /* renamed from: g */
    public final boolean mo5792g(C19499w wVar) {
        synchronized (this.f4819a) {
            LifecycleCameraRepositoryObserver e = mo5790e(wVar);
            if (e == null) {
                return false;
            }
            for (C1744a aVar : this.f4821c.get(e)) {
                if (!((LifecycleCamera) C18001r.m81775l(this.f4820b.get(aVar))).mo5778p().isEmpty()) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: h */
    public final void mo5793h(LifecycleCamera lifecycleCamera) {
        Set set;
        synchronized (this.f4819a) {
            C19499w o = lifecycleCamera.mo5774o();
            C1744a a = C1744a.m7006a(o, lifecycleCamera.mo5773n().mo5582r());
            LifecycleCameraRepositoryObserver e = mo5790e(o);
            if (e != null) {
                set = this.f4821c.get(e);
            } else {
                set = new HashSet();
            }
            set.add(a);
            this.f4820b.put(a, lifecycleCamera);
            if (e == null) {
                LifecycleCameraRepositoryObserver lifecycleCameraRepositoryObserver = new LifecycleCameraRepositoryObserver(o, this);
                this.f4821c.put(lifecycleCameraRepositoryObserver, set);
                o.getLifecycle().mo57464a(lifecycleCameraRepositoryObserver);
            }
        }
    }

    /* renamed from: i */
    public void mo5794i(C19499w wVar) {
        synchronized (this.f4819a) {
            if (mo5792g(wVar)) {
                if (this.f4822d.isEmpty()) {
                    this.f4822d.push(wVar);
                } else {
                    C19499w peek = this.f4822d.peek();
                    if (!wVar.equals(peek)) {
                        mo5796k(peek);
                        this.f4822d.remove(wVar);
                        this.f4822d.push(wVar);
                    }
                }
                mo5800o(wVar);
            }
        }
    }

    /* renamed from: j */
    public void mo5795j(C19499w wVar) {
        synchronized (this.f4819a) {
            this.f4822d.remove(wVar);
            mo5796k(wVar);
            if (!this.f4822d.isEmpty()) {
                mo5800o(this.f4822d.peek());
            }
        }
    }

    /* renamed from: k */
    public final void mo5796k(C19499w wVar) {
        synchronized (this.f4819a) {
            for (C1744a aVar : this.f4821c.get(mo5790e(wVar))) {
                ((LifecycleCamera) C18001r.m81775l(this.f4820b.get(aVar))).mo5782t();
            }
        }
    }

    /* renamed from: l */
    public void mo5797l(@C0359n0 Collection<UseCase> collection) {
        boolean z;
        synchronized (this.f4819a) {
            for (C1744a aVar : this.f4820b.keySet()) {
                LifecycleCamera lifecycleCamera = this.f4820b.get(aVar);
                if (!lifecycleCamera.mo5778p().isEmpty()) {
                    z = true;
                } else {
                    z = false;
                }
                lifecycleCamera.mo5783u(collection);
                if (z && lifecycleCamera.mo5778p().isEmpty()) {
                    mo5795j(lifecycleCamera.mo5774o());
                }
            }
        }
    }

    /* renamed from: m */
    public void mo5798m() {
        synchronized (this.f4819a) {
            for (C1744a aVar : this.f4820b.keySet()) {
                LifecycleCamera lifecycleCamera = this.f4820b.get(aVar);
                lifecycleCamera.mo5784w();
                mo5795j(lifecycleCamera.mo5774o());
            }
        }
    }

    /* renamed from: n */
    public void mo5799n(C19499w wVar) {
        synchronized (this.f4819a) {
            LifecycleCameraRepositoryObserver e = mo5790e(wVar);
            if (e != null) {
                mo5795j(wVar);
                for (C1744a remove : this.f4821c.get(e)) {
                    this.f4820b.remove(remove);
                }
                this.f4821c.remove(e);
                e.mo5801a().getLifecycle().mo57467d(e);
            }
        }
    }

    /* renamed from: o */
    public final void mo5800o(C19499w wVar) {
        synchronized (this.f4819a) {
            for (C1744a aVar : this.f4821c.get(mo5790e(wVar))) {
                LifecycleCamera lifecycleCamera = this.f4820b.get(aVar);
                if (!((LifecycleCamera) C18001r.m81775l(lifecycleCamera)).mo5778p().isEmpty()) {
                    lifecycleCamera.mo5785x();
                }
            }
        }
    }
}
