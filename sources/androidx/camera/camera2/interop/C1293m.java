package androidx.camera.camera2.interop;

import android.annotation.SuppressLint;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;
import androidx.camera.camera2.impl.C1004b;
import androidx.camera.core.C1643m0;
import androidx.camera.core.impl.Config;

@C1298p
/* renamed from: androidx.camera.camera2.interop.m */
public final class C1293m {

    /* renamed from: androidx.camera.camera2.interop.m$a */
    public static final class C1294a<T> {

        /* renamed from: a */
        public C1643m0<T> f3680a;

        public C1294a(@C0359n0 C1643m0<T> m0Var) {
            this.f3680a = m0Var;
        }

        @C0359n0
        /* renamed from: a */
        public <ValueT> C1294a<T> mo4758a(@C0359n0 CaptureRequest.Key<ValueT> key, @C0359n0 ValueT valuet) {
            this.f3680a.mo4099h().mo5544q(C1004b.m4370b0(key), Config.OptionPriority.ALWAYS_OVERRIDE, valuet);
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY})
        @C0359n0
        /* renamed from: b */
        public C1294a<T> mo4759b(int i) {
            this.f3680a.mo4099h().mo5545t(C1004b.f3072x, Integer.valueOf(i));
            return this;
        }

        @SuppressLint({"ExecutorRegistration"})
        @C0359n0
        /* renamed from: c */
        public C1294a<T> mo4760c(@C0359n0 CameraDevice.StateCallback stateCallback) {
            this.f3680a.mo4099h().mo5545t(C1004b.f3073y, stateCallback);
            return this;
        }

        @SuppressLint({"ExecutorRegistration"})
        @C0359n0
        /* renamed from: d */
        public C1294a<T> mo4761d(@C0359n0 CameraCaptureSession.CaptureCallback captureCallback) {
            this.f3680a.mo4099h().mo5545t(C1004b.f3068A, captureCallback);
            return this;
        }

        @SuppressLint({"ExecutorRegistration"})
        @C0359n0
        /* renamed from: e */
        public C1294a<T> mo4762e(@C0359n0 CameraCaptureSession.StateCallback stateCallback) {
            this.f3680a.mo4099h().mo5545t(C1004b.f3074z, stateCallback);
            return this;
        }
    }
}
