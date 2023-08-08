package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.os.Build;
import android.os.Handler;
import androidx.annotation.C0359n0;
import androidx.annotation.C0376v0;
import androidx.annotation.RestrictTo;
import androidx.camera.camera2.internal.compat.params.C1122z;
import androidx.camera.core.impl.utils.C1565i;
import java.util.concurrent.Executor;

@C0376v0(21)
/* renamed from: androidx.camera.camera2.internal.compat.i */
public final class C1074i {
    @RestrictTo({RestrictTo.Scope.LIBRARY})

    /* renamed from: b */
    public static final int f3287b = 0;
    @RestrictTo({RestrictTo.Scope.LIBRARY})

    /* renamed from: c */
    public static final int f3288c = 1;

    /* renamed from: a */
    public final C1075a f3289a;

    /* renamed from: androidx.camera.camera2.internal.compat.i$a */
    public interface C1075a {
        @C0359n0
        /* renamed from: a */
        CameraDevice mo4327a();

        /* renamed from: b */
        void mo4328b(@C0359n0 C1122z zVar) throws CameraAccessException;
    }

    /* renamed from: androidx.camera.camera2.internal.compat.i$b */
    public static final class C1076b extends CameraDevice.StateCallback {

        /* renamed from: a */
        public final CameraDevice.StateCallback f3290a;

        /* renamed from: b */
        public final Executor f3291b;

        /* renamed from: androidx.camera.camera2.internal.compat.i$b$a */
        public class C1077a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ CameraDevice f3292a;

            public C1077a(CameraDevice cameraDevice) {
                this.f3292a = cameraDevice;
            }

            public void run() {
                C1076b.this.f3290a.onOpened(this.f3292a);
            }
        }

        /* renamed from: androidx.camera.camera2.internal.compat.i$b$b */
        public class C1078b implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ CameraDevice f3294a;

            public C1078b(CameraDevice cameraDevice) {
                this.f3294a = cameraDevice;
            }

            public void run() {
                C1076b.this.f3290a.onDisconnected(this.f3294a);
            }
        }

        /* renamed from: androidx.camera.camera2.internal.compat.i$b$c */
        public class C1079c implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ CameraDevice f3296a;

            /* renamed from: b */
            public final /* synthetic */ int f3297b;

            public C1079c(CameraDevice cameraDevice, int i) {
                this.f3296a = cameraDevice;
                this.f3297b = i;
            }

            public void run() {
                C1076b.this.f3290a.onError(this.f3296a, this.f3297b);
            }
        }

        /* renamed from: androidx.camera.camera2.internal.compat.i$b$d */
        public class C1080d implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ CameraDevice f3299a;

            public C1080d(CameraDevice cameraDevice) {
                this.f3299a = cameraDevice;
            }

            public void run() {
                C1076b.this.f3290a.onClosed(this.f3299a);
            }
        }

        public C1076b(@C0359n0 Executor executor, @C0359n0 CameraDevice.StateCallback stateCallback) {
            this.f3291b = executor;
            this.f3290a = stateCallback;
        }

        public void onClosed(@C0359n0 CameraDevice cameraDevice) {
            this.f3291b.execute(new C1080d(cameraDevice));
        }

        public void onDisconnected(@C0359n0 CameraDevice cameraDevice) {
            this.f3291b.execute(new C1078b(cameraDevice));
        }

        public void onError(@C0359n0 CameraDevice cameraDevice, int i) {
            this.f3291b.execute(new C1079c(cameraDevice, i));
        }

        public void onOpened(@C0359n0 CameraDevice cameraDevice) {
            this.f3291b.execute(new C1077a(cameraDevice));
        }
    }

    public C1074i(@C0359n0 CameraDevice cameraDevice, @C0359n0 Handler handler) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f3289a = new C1085n(cameraDevice);
        } else {
            this.f3289a = C1082k.m4668i(cameraDevice, handler);
        }
    }

    @C0359n0
    /* renamed from: c */
    public static C1074i m4660c(@C0359n0 CameraDevice cameraDevice) {
        return m4661d(cameraDevice, C1565i.m6504a());
    }

    @C0359n0
    /* renamed from: d */
    public static C1074i m4661d(@C0359n0 CameraDevice cameraDevice, @C0359n0 Handler handler) {
        return new C1074i(cameraDevice, handler);
    }

    /* renamed from: a */
    public void mo4325a(@C0359n0 C1122z zVar) throws CameraAccessException {
        this.f3289a.mo4328b(zVar);
    }

    @C0359n0
    /* renamed from: b */
    public CameraDevice mo4326b() {
        return this.f3289a.mo4327a();
    }
}
