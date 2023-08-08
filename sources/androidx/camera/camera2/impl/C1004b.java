package androidx.camera.camera2.impl;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.annotation.experimental.C0335b;
import androidx.camera.camera2.interop.C1296o;
import androidx.camera.camera2.interop.C1298p;
import androidx.camera.core.C1643m0;
import androidx.camera.core.impl.C1441c1;
import androidx.camera.core.impl.C1582x0;
import androidx.camera.core.impl.C1586y0;
import androidx.camera.core.impl.Config;

@C0335b(markerClass = C1298p.class)
/* renamed from: androidx.camera.camera2.impl.b */
public final class C1004b extends C1296o {
    @RestrictTo({RestrictTo.Scope.LIBRARY})

    /* renamed from: A */
    public static final Config.C1421a<CameraCaptureSession.CaptureCallback> f3068A = Config.C1421a.m5980a("camera2.cameraCaptureSession.captureCallback", CameraCaptureSession.CaptureCallback.class);
    @RestrictTo({RestrictTo.Scope.LIBRARY})

    /* renamed from: B */
    public static final Config.C1421a<C1008d> f3069B = Config.C1421a.m5980a("camera2.cameraEvent.callback", C1008d.class);
    @RestrictTo({RestrictTo.Scope.LIBRARY})

    /* renamed from: C */
    public static final Config.C1421a<Object> f3070C = Config.C1421a.m5980a("camera2.captureRequest.tag", Object.class);
    @RestrictTo({RestrictTo.Scope.LIBRARY})

    /* renamed from: w */
    public static final String f3071w = "camera2.captureRequest.option.";
    @RestrictTo({RestrictTo.Scope.LIBRARY})

    /* renamed from: x */
    public static final Config.C1421a<Integer> f3072x = Config.C1421a.m5980a("camera2.captureRequest.templateType", Integer.TYPE);
    @RestrictTo({RestrictTo.Scope.LIBRARY})

    /* renamed from: y */
    public static final Config.C1421a<CameraDevice.StateCallback> f3073y = Config.C1421a.m5980a("camera2.cameraDevice.stateCallback", CameraDevice.StateCallback.class);
    @RestrictTo({RestrictTo.Scope.LIBRARY})

    /* renamed from: z */
    public static final Config.C1421a<CameraCaptureSession.StateCallback> f3074z = Config.C1421a.m5980a("camera2.cameraCaptureSession.stateCallback", CameraCaptureSession.StateCallback.class);

    /* renamed from: androidx.camera.camera2.impl.b$a */
    public static final class C1005a implements C1643m0<C1004b> {

        /* renamed from: a */
        public final C1586y0 f3075a = C1586y0.m6573d0();

        @C0359n0
        /* renamed from: b */
        public C1004b mo4098g() {
            return new C1004b(C1441c1.m6059b0(this.f3075a));
        }

        @C0359n0
        /* renamed from: d */
        public C1005a mo4095d(@C0359n0 Config config) {
            for (Config.C1421a next : config.mo5129f()) {
                this.f3075a.mo5545t(next, config.mo5125b(next));
            }
            return this;
        }

        @C0359n0
        /* renamed from: e */
        public <ValueT> C1005a mo4096e(@C0359n0 CaptureRequest.Key<ValueT> key, @C0359n0 ValueT valuet) {
            this.f3075a.mo5545t(C1004b.m4370b0(key), valuet);
            return this;
        }

        @C0359n0
        /* renamed from: f */
        public <ValueT> C1005a mo4097f(@C0359n0 CaptureRequest.Key<ValueT> key, @C0359n0 ValueT valuet, @C0359n0 Config.OptionPriority optionPriority) {
            this.f3075a.mo5544q(C1004b.m4370b0(key), optionPriority, valuet);
            return this;
        }

        @C0359n0
        /* renamed from: h */
        public C1582x0 mo4099h() {
            return this.f3075a;
        }
    }

    /* renamed from: androidx.camera.camera2.impl.b$b */
    public static final class C1006b<T> {

        /* renamed from: a */
        public C1643m0<T> f3076a;

        public C1006b(@C0359n0 C1643m0<T> m0Var) {
            this.f3076a = m0Var;
        }

        @C0359n0
        /* renamed from: a */
        public C1006b<T> mo4100a(@C0359n0 C1008d dVar) {
            this.f3076a.mo4099h().mo5545t(C1004b.f3069B, dVar);
            return this;
        }
    }

    public C1004b(@C0359n0 Config config) {
        super(config);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @C0359n0
    /* renamed from: b0 */
    public static Config.C1421a<Object> m4370b0(@C0359n0 CaptureRequest.Key<?> key) {
        return Config.C1421a.m5981b(f3071w + key.getName(), Object.class, key);
    }

    @C0363p0
    /* renamed from: c0 */
    public C1008d mo4087c0(@C0363p0 C1008d dVar) {
        return (C1008d) mo4458a().mo5131h(f3069B, dVar);
    }

    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: d0 */
    public C1296o mo4088d0() {
        return C1296o.C1297a.m5319f(mo4458a()).mo4098g();
    }

    @C0363p0
    /* renamed from: e0 */
    public Object mo4089e0(@C0363p0 Object obj) {
        return mo4458a().mo5131h(f3070C, obj);
    }

    /* renamed from: f0 */
    public int mo4090f0(int i) {
        return ((Integer) mo4458a().mo5131h(f3072x, Integer.valueOf(i))).intValue();
    }

    @C0363p0
    /* renamed from: g0 */
    public CameraDevice.StateCallback mo4091g0(@C0363p0 CameraDevice.StateCallback stateCallback) {
        return (CameraDevice.StateCallback) mo4458a().mo5131h(f3073y, stateCallback);
    }

    @C0363p0
    /* renamed from: h0 */
    public CameraCaptureSession.CaptureCallback mo4092h0(@C0363p0 CameraCaptureSession.CaptureCallback captureCallback) {
        return (CameraCaptureSession.CaptureCallback) mo4458a().mo5131h(f3068A, captureCallback);
    }

    @C0363p0
    /* renamed from: i0 */
    public CameraCaptureSession.StateCallback mo4093i0(@C0363p0 CameraCaptureSession.StateCallback stateCallback) {
        return (CameraCaptureSession.StateCallback) mo4458a().mo5131h(f3074z, stateCallback);
    }
}
