package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import androidx.annotation.C0359n0;
import androidx.camera.camera2.internal.C1254v;
import androidx.camera.camera2.internal.compat.C1073h;
import androidx.camera.core.C1417i2;
import androidx.camera.core.CameraControl;
import androidx.camera.core.impl.utils.C1566j;
import androidx.camera.core.impl.utils.futures.C1548f;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.lifecycle.C19423g0;
import androidx.lifecycle.LiveData;
import com.google.common.util.concurrent.C32487a;
import java.util.concurrent.Executor;

/* renamed from: androidx.camera.camera2.internal.v2 */
public final class C1260v2 {

    /* renamed from: i */
    public static final String f3606i = "TorchControl";

    /* renamed from: j */
    public static final int f3607j = 0;

    /* renamed from: a */
    public final C1254v f3608a;

    /* renamed from: b */
    public final C19423g0<Integer> f3609b;

    /* renamed from: c */
    public final boolean f3610c;

    /* renamed from: d */
    public final Executor f3611d;

    /* renamed from: e */
    public boolean f3612e;

    /* renamed from: f */
    public CallbackToFutureAdapter.C16559a<Void> f3613f;

    /* renamed from: g */
    public boolean f3614g;

    /* renamed from: h */
    public final C1254v.C1257c f3615h;

    /* renamed from: androidx.camera.camera2.internal.v2$a */
    public class C1261a implements C1254v.C1257c {
        public C1261a() {
        }

        /* renamed from: a */
        public boolean mo4229a(@C0359n0 TotalCaptureResult totalCaptureResult) {
            boolean z;
            if (C1260v2.this.f3613f != null) {
                Integer num = (Integer) totalCaptureResult.getRequest().get(CaptureRequest.FLASH_MODE);
                if (num == null || num.intValue() != 2) {
                    z = false;
                } else {
                    z = true;
                }
                C1260v2 v2Var = C1260v2.this;
                if (z == v2Var.f3614g) {
                    v2Var.f3613f.mo48125c(null);
                    C1260v2.this.f3613f = null;
                }
            }
            return false;
        }
    }

    public C1260v2(@C0359n0 C1254v vVar, @C0359n0 C1073h hVar, @C0359n0 Executor executor) {
        boolean z;
        C1261a aVar = new C1261a();
        this.f3615h = aVar;
        this.f3608a = vVar;
        this.f3611d = executor;
        Boolean bool = (Boolean) hVar.mo4323a(CameraCharacteristics.FLASH_INFO_AVAILABLE);
        if (bool == null || !bool.booleanValue()) {
            z = false;
        } else {
            z = true;
        }
        this.f3610c = z;
        this.f3609b = new C19423g0<>(0);
        vVar.mo4654B(aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ Object m5243g(boolean z, CallbackToFutureAdapter.C16559a aVar) throws Exception {
        this.f3611d.execute(new C1253u2(this, aVar, z));
        return "enableTorch: " + z;
    }

    /* renamed from: c */
    public C32487a<Void> mo4708c(boolean z) {
        if (!this.f3610c) {
            C1417i2.m5911a(f3606i, "Unable to enableTorch due to there is no flash unit.");
            return C1548f.m6477f(new IllegalStateException("No flash unit"));
        }
        mo4712i(this.f3609b, Integer.valueOf(z ? 1 : 0));
        return CallbackToFutureAdapter.m74987a(new C1249t2(this, z));
    }

    /* renamed from: d */
    public void m5242f(@C0359n0 CallbackToFutureAdapter.C16559a<Void> aVar, boolean z) {
        if (!this.f3612e) {
            mo4712i(this.f3609b, 0);
            aVar.mo48128f(new CameraControl.OperationCanceledException("Camera is not active."));
            return;
        }
        this.f3614g = z;
        this.f3608a.mo4657E(z);
        mo4712i(this.f3609b, Integer.valueOf(z ? 1 : 0));
        CallbackToFutureAdapter.C16559a<Void> aVar2 = this.f3613f;
        if (aVar2 != null) {
            aVar2.mo48128f(new CameraControl.OperationCanceledException("There is a new enableTorch being set"));
        }
        this.f3613f = aVar;
    }

    @C0359n0
    /* renamed from: e */
    public LiveData<Integer> mo4710e() {
        return this.f3609b;
    }

    /* renamed from: h */
    public void mo4711h(boolean z) {
        if (this.f3612e != z) {
            this.f3612e = z;
            if (!z) {
                if (this.f3614g) {
                    this.f3614g = false;
                    this.f3608a.mo4657E(false);
                    mo4712i(this.f3609b, 0);
                }
                CallbackToFutureAdapter.C16559a<Void> aVar = this.f3613f;
                if (aVar != null) {
                    aVar.mo48128f(new CameraControl.OperationCanceledException("Camera is not active."));
                    this.f3613f = null;
                }
            }
        }
    }

    /* renamed from: i */
    public final <T> void mo4712i(@C0359n0 C19423g0<T> g0Var, T t) {
        if (C1566j.m6508d()) {
            g0Var.mo57496r(t);
        } else {
            g0Var.mo57493o(t);
        }
    }
}
