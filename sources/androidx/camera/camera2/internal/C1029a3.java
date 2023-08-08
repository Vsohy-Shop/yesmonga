package androidx.camera.camera2.internal;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.os.Looper;
import androidx.annotation.C0323b0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0379x;
import androidx.camera.camera2.impl.C1004b;
import androidx.camera.camera2.internal.C1254v;
import androidx.camera.camera2.internal.compat.C1073h;
import androidx.camera.core.C1403f4;
import androidx.camera.core.CameraControl;
import androidx.camera.core.impl.utils.futures.C1548f;
import androidx.camera.core.internal.C1593c;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.lifecycle.C19423g0;
import androidx.lifecycle.LiveData;
import com.google.common.util.concurrent.C32487a;
import java.util.concurrent.Executor;

/* renamed from: androidx.camera.camera2.internal.a3 */
public final class C1029a3 {

    /* renamed from: h */
    public static final String f3169h = "ZoomControl";

    /* renamed from: i */
    public static final float f3170i = 1.0f;

    /* renamed from: a */
    public final C1254v f3171a;

    /* renamed from: b */
    public final Executor f3172b;
    @C0323b0("mCurrentZoomState")

    /* renamed from: c */
    public final C1039b3 f3173c;

    /* renamed from: d */
    public final C19423g0<C1403f4> f3174d;
    @C0359n0

    /* renamed from: e */
    public final C1031b f3175e;

    /* renamed from: f */
    public boolean f3176f = false;

    /* renamed from: g */
    public C1254v.C1257c f3177g = new C1030a();

    /* renamed from: androidx.camera.camera2.internal.a3$a */
    public class C1030a implements C1254v.C1257c {
        public C1030a() {
        }

        /* renamed from: a */
        public boolean mo4229a(@C0359n0 TotalCaptureResult totalCaptureResult) {
            C1029a3.this.f3175e.mo4230a(totalCaptureResult);
            return false;
        }
    }

    /* renamed from: androidx.camera.camera2.internal.a3$b */
    public interface C1031b {
        /* renamed from: a */
        void mo4230a(@C0359n0 TotalCaptureResult totalCaptureResult);

        /* renamed from: b */
        void mo4231b(@C0359n0 C1004b.C1005a aVar);

        /* renamed from: c */
        void mo4232c(float f, @C0359n0 CallbackToFutureAdapter.C16559a<Void> aVar);

        /* renamed from: d */
        float mo4233d();

        /* renamed from: e */
        void mo4234e();

        /* renamed from: f */
        float mo4235f();

        @C0359n0
        /* renamed from: g */
        Rect mo4236g();
    }

    public C1029a3(@C0359n0 C1254v vVar, @C0359n0 C1073h hVar, @C0359n0 Executor executor) {
        this.f3171a = vVar;
        this.f3172b = executor;
        C1031b f = m4529f(hVar);
        this.f3175e = f;
        C1039b3 b3Var = new C1039b3(f.mo4235f(), f.mo4233d());
        this.f3173c = b3Var;
        b3Var.mo4272h(1.0f);
        this.f3174d = new C19423g0<>(C1593c.m6614f(b3Var));
        vVar.mo4654B(this.f3177g);
    }

    /* renamed from: f */
    public static C1031b m4529f(@C0359n0 C1073h hVar) {
        if (m4531j(hVar)) {
            return new C1040c(hVar);
        }
        return new C1216n1(hVar);
    }

    /* renamed from: h */
    public static C1403f4 m4530h(C1073h hVar) {
        C1031b f = m4529f(hVar);
        C1039b3 b3Var = new C1039b3(f.mo4235f(), f.mo4233d());
        b3Var.mo4272h(1.0f);
        return C1593c.m6614f(b3Var);
    }

    /* renamed from: j */
    public static boolean m4531j(C1073h hVar) {
        return Build.VERSION.SDK_INT >= 30 && hVar.mo4323a(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE) != null;
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public /* synthetic */ Object m4533l(C1403f4 f4Var, CallbackToFutureAdapter.C16559a aVar) throws Exception {
        this.f3172b.execute(new C1270x2(this, aVar, f4Var));
        return "setLinearZoom";
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public /* synthetic */ Object m4535n(C1403f4 f4Var, CallbackToFutureAdapter.C16559a aVar) throws Exception {
        this.f3172b.execute(new C1275y2(this, aVar, f4Var));
        return "setZoomRatio";
    }

    /* renamed from: e */
    public void mo4221e(@C0359n0 C1004b.C1005a aVar) {
        this.f3175e.mo4231b(aVar);
    }

    @C0359n0
    /* renamed from: g */
    public Rect mo4222g() {
        return this.f3175e.mo4236g();
    }

    /* renamed from: i */
    public LiveData<C1403f4> mo4223i() {
        return this.f3174d;
    }

    /* renamed from: o */
    public void mo4224o(boolean z) {
        C1403f4 f;
        if (this.f3176f != z) {
            this.f3176f = z;
            if (!z) {
                synchronized (this.f3173c) {
                    this.f3173c.mo4272h(1.0f);
                    f = C1593c.m6614f(this.f3173c);
                }
                mo4228s(f);
                this.f3175e.mo4234e();
                this.f3171a.mo4697o0();
            }
        }
    }

    @C0359n0
    /* renamed from: p */
    public C32487a<Void> mo4225p(@C0379x(from = 0.0d, mo1016to = 1.0d) float f) {
        C1403f4 f2;
        synchronized (this.f3173c) {
            try {
                this.f3173c.mo4271g(f);
                f2 = C1593c.m6614f(this.f3173c);
            } catch (IllegalArgumentException e) {
                return C1548f.m6477f(e);
            }
        }
        mo4228s(f2);
        return CallbackToFutureAdapter.m74987a(new C1279z2(this, f2));
    }

    @C0359n0
    /* renamed from: q */
    public C32487a<Void> mo4226q(float f) {
        C1403f4 f2;
        synchronized (this.f3173c) {
            try {
                this.f3173c.mo4272h(f);
                f2 = C1593c.m6614f(this.f3173c);
            } catch (IllegalArgumentException e) {
                return C1548f.m6477f(e);
            }
        }
        mo4228s(f2);
        return CallbackToFutureAdapter.m74987a(new C1265w2(this, f2));
    }

    /* renamed from: r */
    public final void m4534m(@C0359n0 CallbackToFutureAdapter.C16559a<Void> aVar, @C0359n0 C1403f4 f4Var) {
        C1403f4 f;
        if (!this.f3176f) {
            synchronized (this.f3173c) {
                this.f3173c.mo4272h(1.0f);
                f = C1593c.m6614f(this.f3173c);
            }
            mo4228s(f);
            aVar.mo48128f(new CameraControl.OperationCanceledException("Camera is not active."));
            return;
        }
        mo4228s(f4Var);
        this.f3175e.mo4232c(f4Var.mo4268d(), aVar);
        this.f3171a.mo4697o0();
    }

    /* renamed from: s */
    public final void mo4228s(C1403f4 f4Var) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.f3174d.mo57496r(f4Var);
        } else {
            this.f3174d.mo57493o(f4Var);
        }
    }
}
