package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;
import androidx.annotation.C0359n0;
import androidx.annotation.C0376v0;
import androidx.camera.camera2.internal.C1185g2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: androidx.camera.camera2.internal.s2 */
public final class C1244s2 extends C1185g2.C1186a {

    /* renamed from: a */
    public final List<C1185g2.C1186a> f3563a;

    public C1244s2(@C0359n0 List<C1185g2.C1186a> list) {
        ArrayList arrayList = new ArrayList();
        this.f3563a = arrayList;
        arrayList.addAll(list);
    }

    @C0359n0
    /* renamed from: B */
    public static C1185g2.C1186a m5128B(@C0359n0 C1185g2.C1186a... aVarArr) {
        return new C1244s2(Arrays.asList(aVarArr));
    }

    @C0376v0(api = 23)
    /* renamed from: A */
    public void mo4527A(@C0359n0 C1185g2 g2Var, @C0359n0 Surface surface) {
        for (C1185g2.C1186a A : this.f3563a) {
            A.mo4527A(g2Var, surface);
        }
    }

    /* renamed from: t */
    public void mo4528t(@C0359n0 C1185g2 g2Var) {
        for (C1185g2.C1186a t : this.f3563a) {
            t.mo4528t(g2Var);
        }
    }

    @C0376v0(api = 26)
    /* renamed from: u */
    public void mo4529u(@C0359n0 C1185g2 g2Var) {
        for (C1185g2.C1186a u : this.f3563a) {
            u.mo4529u(g2Var);
        }
    }

    /* renamed from: v */
    public void mo4530v(@C0359n0 C1185g2 g2Var) {
        for (C1185g2.C1186a v : this.f3563a) {
            v.mo4530v(g2Var);
        }
    }

    /* renamed from: w */
    public void mo4201w(@C0359n0 C1185g2 g2Var) {
        for (C1185g2.C1186a w : this.f3563a) {
            w.mo4201w(g2Var);
        }
    }

    /* renamed from: x */
    public void mo4202x(@C0359n0 C1185g2 g2Var) {
        for (C1185g2.C1186a x : this.f3563a) {
            x.mo4202x(g2Var);
        }
    }

    /* renamed from: y */
    public void mo4203y(@C0359n0 C1185g2 g2Var) {
        for (C1185g2.C1186a y : this.f3563a) {
            y.mo4203y(g2Var);
        }
    }

    /* renamed from: z */
    public void mo4204z(@C0359n0 C1185g2 g2Var) {
        for (C1185g2.C1186a z : this.f3563a) {
            z.mo4204z(g2Var);
        }
    }

    /* renamed from: androidx.camera.camera2.internal.s2$a */
    public static class C1245a extends C1185g2.C1186a {
        @C0359n0

        /* renamed from: a */
        public final CameraCaptureSession.StateCallback f3564a;

        public C1245a(@C0359n0 CameraCaptureSession.StateCallback stateCallback) {
            this.f3564a = stateCallback;
        }

        @C0376v0(api = 23)
        /* renamed from: A */
        public void mo4527A(@C0359n0 C1185g2 g2Var, @C0359n0 Surface surface) {
            this.f3564a.onSurfacePrepared(g2Var.mo4525r().mo4289e(), surface);
        }

        /* renamed from: t */
        public void mo4528t(@C0359n0 C1185g2 g2Var) {
            this.f3564a.onActive(g2Var.mo4525r().mo4289e());
        }

        @C0376v0(api = 26)
        /* renamed from: u */
        public void mo4529u(@C0359n0 C1185g2 g2Var) {
            this.f3564a.onCaptureQueueEmpty(g2Var.mo4525r().mo4289e());
        }

        /* renamed from: v */
        public void mo4530v(@C0359n0 C1185g2 g2Var) {
            this.f3564a.onClosed(g2Var.mo4525r().mo4289e());
        }

        /* renamed from: w */
        public void mo4201w(@C0359n0 C1185g2 g2Var) {
            this.f3564a.onConfigureFailed(g2Var.mo4525r().mo4289e());
        }

        /* renamed from: x */
        public void mo4202x(@C0359n0 C1185g2 g2Var) {
            this.f3564a.onConfigured(g2Var.mo4525r().mo4289e());
        }

        /* renamed from: y */
        public void mo4203y(@C0359n0 C1185g2 g2Var) {
            this.f3564a.onReady(g2Var.mo4525r().mo4289e());
        }

        /* renamed from: z */
        public void mo4204z(@C0359n0 C1185g2 g2Var) {
        }

        public C1245a(@C0359n0 List<CameraCaptureSession.StateCallback> list) {
            this(C1025a1.m4522a(list));
        }
    }
}
