package androidx.camera.core.impl;

import android.graphics.Rect;
import androidx.annotation.C0359n0;
import androidx.camera.core.C1410h0;
import androidx.camera.core.C1650n0;
import androidx.camera.core.C1657o0;
import androidx.camera.core.CameraControl;
import androidx.camera.core.impl.C1456h;
import androidx.camera.core.impl.utils.futures.C1548f;
import com.google.common.util.concurrent.C32487a;
import java.util.List;

public interface CameraControlInternal extends CameraControl {

    /* renamed from: a */
    public static final CameraControlInternal f4120a = new C1419a();

    /* renamed from: androidx.camera.core.impl.CameraControlInternal$a */
    public class C1419a implements CameraControlInternal {
        @C1410h0
        @C0359n0
        /* renamed from: a */
        public C32487a<Integer> mo4675a(int i) {
            return C1548f.m6479h(0);
        }

        @C0359n0
        /* renamed from: b */
        public C32487a<C1456h> mo4676b() {
            return C1548f.m6479h(C1456h.C1457a.m6110h());
        }

        @C0359n0
        /* renamed from: c */
        public C32487a<Void> mo4677c(float f) {
            return C1548f.m6479h(null);
        }

        @C0359n0
        /* renamed from: d */
        public C32487a<Void> mo4678d() {
            return C1548f.m6479h(null);
        }

        @C0359n0
        /* renamed from: e */
        public C32487a<Void> mo4679e(float f) {
            return C1548f.m6479h(null);
        }

        @C0359n0
        /* renamed from: f */
        public Rect mo4680f() {
            return new Rect();
        }

        /* renamed from: g */
        public void mo4681g(int i) {
        }

        @C0359n0
        /* renamed from: h */
        public C32487a<Void> mo4682h(boolean z) {
            return C1548f.m6479h(null);
        }

        @C0359n0
        /* renamed from: i */
        public Config mo4684i() {
            return null;
        }

        @C0359n0
        /* renamed from: j */
        public C32487a<C1657o0> mo4686j(@C0359n0 C1650n0 n0Var) {
            return C1548f.m6479h(C1657o0.m6754b());
        }

        /* renamed from: k */
        public void mo4688k(@C0359n0 Config config) {
        }

        @C0359n0
        /* renamed from: l */
        public C32487a<C1456h> mo4690l() {
            return C1548f.m6479h(C1456h.C1457a.m6110h());
        }

        /* renamed from: m */
        public void mo4692m(boolean z, boolean z2) {
        }

        /* renamed from: n */
        public int mo4694n() {
            return 2;
        }

        /* renamed from: o */
        public void mo4696o() {
        }

        /* renamed from: p */
        public void mo4698p(@C0359n0 List<C1583y> list) {
        }
    }

    /* renamed from: androidx.camera.core.impl.CameraControlInternal$b */
    public interface C1420b {
        /* renamed from: a */
        void mo4168a(@C0359n0 List<C1583y> list);

        /* renamed from: b */
        void mo4169b(@C0359n0 SessionConfig sessionConfig);
    }

    @C1410h0
    @C0359n0
    /* renamed from: a */
    C32487a<Integer> mo4675a(int i);

    @C0359n0
    /* renamed from: b */
    C32487a<C1456h> mo4676b();

    @C0359n0
    /* renamed from: f */
    Rect mo4680f();

    /* renamed from: g */
    void mo4681g(int i);

    @C0359n0
    /* renamed from: i */
    Config mo4684i();

    /* renamed from: k */
    void mo4688k(@C0359n0 Config config);

    @C0359n0
    /* renamed from: l */
    C32487a<C1456h> mo4690l();

    /* renamed from: m */
    void mo4692m(boolean z, boolean z2);

    /* renamed from: n */
    int mo4694n();

    /* renamed from: o */
    void mo4696o();

    /* renamed from: p */
    void mo4698p(@C0359n0 List<C1583y> list);

    public static final class CameraControlException extends Exception {
        @C0359n0
        private CameraCaptureFailure mCameraCaptureFailure;

        public CameraControlException(@C0359n0 CameraCaptureFailure cameraCaptureFailure) {
            this.mCameraCaptureFailure = cameraCaptureFailure;
        }

        @C0359n0
        /* renamed from: a */
        public CameraCaptureFailure mo5118a() {
            return this.mCameraCaptureFailure;
        }

        public CameraControlException(@C0359n0 CameraCaptureFailure cameraCaptureFailure, @C0359n0 Throwable th) {
            super(th);
            this.mCameraCaptureFailure = cameraCaptureFailure;
        }
    }
}
