package androidx.camera.lifecycle;

import android.content.Context;
import androidx.annotation.C0353k0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.annotation.experimental.C0335b;
import androidx.camera.core.C1349a0;
import androidx.camera.core.C1394e4;
import androidx.camera.core.C1399f0;
import androidx.camera.core.C1624j;
import androidx.camera.core.C1631k0;
import androidx.camera.core.C1635l;
import androidx.camera.core.C1647n;
import androidx.camera.core.C1667p3;
import androidx.camera.core.CameraInfoUnavailableException;
import androidx.camera.core.CameraX;
import androidx.camera.core.UseCase;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.utils.C1566j;
import androidx.camera.core.impl.utils.executor.C1525a;
import androidx.camera.core.impl.utils.futures.C1548f;
import androidx.camera.core.internal.CameraUseCaseAdapter;
import androidx.core.util.C18001r;
import androidx.lifecycle.C19499w;
import com.google.common.util.concurrent.C32487a;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: androidx.camera.lifecycle.f */
public final class C1750f implements C1748d {

    /* renamed from: c */
    public static final C1750f f4827c = new C1750f();

    /* renamed from: a */
    public final LifecycleCameraRepository f4828a = new LifecycleCameraRepository();

    /* renamed from: b */
    public CameraX f4829b;

    @C1746b
    /* renamed from: i */
    public static void m7016i(@C0359n0 C1349a0 a0Var) {
        CameraX.m5364n(a0Var);
    }

    @C0359n0
    /* renamed from: j */
    public static C32487a<C1750f> m7017j(@C0359n0 Context context) {
        C18001r.m81775l(context);
        return C1548f.m6486o(CameraX.m5372z(context), new C1749e(), C1525a.m6437a());
    }

    /* renamed from: k */
    public static /* synthetic */ C1750f m7018k(CameraX cameraX) {
        C1750f fVar = f4827c;
        fVar.mo5817l(cameraX);
        return fVar;
    }

    @C0353k0
    /* renamed from: a */
    public void mo5810a() {
        C1566j.m6506b();
        this.f4828a.mo5798m();
    }

    /* renamed from: b */
    public boolean mo5811b(@C0359n0 UseCase useCase) {
        for (LifecycleCamera r : this.f4828a.mo5791f()) {
            if (r.mo5780r(useCase)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public boolean mo5812c(@C0359n0 C1647n nVar) throws CameraInfoUnavailableException {
        try {
            nVar.mo5635e(this.f4829b.mo4777s().mo5322f());
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    @C0353k0
    /* renamed from: d */
    public void mo5813d(@C0359n0 UseCase... useCaseArr) {
        C1566j.m6506b();
        this.f4828a.mo5797l(Arrays.asList(useCaseArr));
    }

    @C0335b(markerClass = C1631k0.class)
    @C0353k0
    @C0359n0
    @C1747c
    /* renamed from: f */
    public C1624j mo5814f(@C0359n0 C19499w wVar, @C0359n0 C1647n nVar, @C0359n0 C1667p3 p3Var) {
        return mo5815g(wVar, nVar, p3Var.mo5659b(), (UseCase[]) p3Var.mo5658a().toArray(new UseCase[0]));
    }

    @C1631k0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @C0335b(markerClass = C1399f0.class)
    @C0359n0
    /* renamed from: g */
    public C1624j mo5815g(@C0359n0 C19499w wVar, @C0359n0 C1647n nVar, @C0363p0 C1394e4 e4Var, @C0359n0 UseCase... useCaseArr) {
        C1566j.m6506b();
        C1647n.C1648a c = C1647n.C1648a.m6734c(nVar);
        for (UseCase f : useCaseArr) {
            C1647n V = f.mo4955f().mo5285V((C1647n) null);
            if (V != null) {
                Iterator<C1635l> it = V.mo5633c().iterator();
                while (it.hasNext()) {
                    c.mo5636a(it.next());
                }
            }
        }
        LinkedHashSet<CameraInternal> a = c.mo5637b().mo5631a(this.f4829b.mo4777s().mo5322f());
        LifecycleCamera d = this.f4828a.mo5789d(wVar, CameraUseCaseAdapter.m6585q(a));
        Collection<LifecycleCamera> f2 = this.f4828a.mo5791f();
        for (UseCase useCase : useCaseArr) {
            for (LifecycleCamera next : f2) {
                if (next.mo5780r(useCase) && next != d) {
                    throw new IllegalStateException(String.format("Use case %s already bound to a different lifecycle.", new Object[]{useCase}));
                }
            }
        }
        if (d == null) {
            d = this.f4828a.mo5788c(wVar, new CameraUseCaseAdapter(a, this.f4829b.mo4775q(), this.f4829b.mo4778w()));
        }
        if (useCaseArr.length == 0) {
            return d;
        }
        this.f4828a.mo5786a(d, e4Var, Arrays.asList(useCaseArr));
        return d;
    }

    @C0335b(markerClass = C1631k0.class)
    @C0353k0
    @C0359n0
    /* renamed from: h */
    public C1624j mo5816h(@C0359n0 C19499w wVar, @C0359n0 C1647n nVar, @C0359n0 UseCase... useCaseArr) {
        return mo5815g(wVar, nVar, (C1394e4) null, useCaseArr);
    }

    /* renamed from: l */
    public final void mo5817l(CameraX cameraX) {
        this.f4829b = cameraX;
    }

    @C0359n0
    @RestrictTo({RestrictTo.Scope.TESTS})
    /* renamed from: m */
    public C32487a<Void> mo5818m() {
        this.f4828a.mo5787b();
        return CameraX.m5348T();
    }
}
