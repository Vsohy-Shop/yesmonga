package androidx.camera.camera2.internal.compat;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.Handler;
import android.util.ArrayMap;
import androidx.annotation.C0323b0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0376v0;
import androidx.annotation.C0380x0;
import androidx.annotation.RestrictTo;
import androidx.camera.core.impl.utils.C1565i;
import java.util.Map;
import java.util.concurrent.Executor;

@C0376v0(21)
/* renamed from: androidx.camera.camera2.internal.compat.q */
public final class C1127q {

    /* renamed from: a */
    public final C1132b f3342a;
    @C0323b0("mCameraCharacteristicsMap")

    /* renamed from: b */
    public final Map<String, C1073h> f3343b = new ArrayMap(4);

    /* renamed from: androidx.camera.camera2.internal.compat.q$a */
    public static final class C1128a extends CameraManager.AvailabilityCallback {

        /* renamed from: a */
        public final Executor f3344a;

        /* renamed from: b */
        public final CameraManager.AvailabilityCallback f3345b;

        /* renamed from: c */
        public final Object f3346c = new Object();
        @C0323b0("mLock")

        /* renamed from: d */
        public boolean f3347d = false;

        /* renamed from: androidx.camera.camera2.internal.compat.q$a$a */
        public class C1129a implements Runnable {
            public C1129a() {
            }

            public void run() {
                C1128a.this.f3345b.onCameraAccessPrioritiesChanged();
            }
        }

        /* renamed from: androidx.camera.camera2.internal.compat.q$a$b */
        public class C1130b implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ String f3349a;

            public C1130b(String str) {
                this.f3349a = str;
            }

            public void run() {
                C1128a.this.f3345b.onCameraAvailable(this.f3349a);
            }
        }

        /* renamed from: androidx.camera.camera2.internal.compat.q$a$c */
        public class C1131c implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ String f3351a;

            public C1131c(String str) {
                this.f3351a = str;
            }

            public void run() {
                C1128a.this.f3345b.onCameraUnavailable(this.f3351a);
            }
        }

        public C1128a(@C0359n0 Executor executor, @C0359n0 CameraManager.AvailabilityCallback availabilityCallback) {
            this.f3344a = executor;
            this.f3345b = availabilityCallback;
        }

        /* renamed from: a */
        public void mo4416a() {
            synchronized (this.f3346c) {
                this.f3347d = true;
            }
        }

        @C0376v0(29)
        public void onCameraAccessPrioritiesChanged() {
            synchronized (this.f3346c) {
                if (!this.f3347d) {
                    this.f3344a.execute(new C1129a());
                }
            }
        }

        public void onCameraAvailable(@C0359n0 String str) {
            synchronized (this.f3346c) {
                if (!this.f3347d) {
                    this.f3344a.execute(new C1130b(str));
                }
            }
        }

        public void onCameraUnavailable(@C0359n0 String str) {
            synchronized (this.f3346c) {
                if (!this.f3347d) {
                    this.f3344a.execute(new C1131c(str));
                }
            }
        }
    }

    /* renamed from: androidx.camera.camera2.internal.compat.q$b */
    public interface C1132b {
        @C0359n0
        /* renamed from: g */
        static C1132b m4819g(@C0359n0 Context context, @C0359n0 Handler handler) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 29) {
                return new C1152u(context);
            }
            if (i >= 28) {
                return C1151t.m4857i(context);
            }
            return C1153v.m4867h(context, handler);
        }

        @C0359n0
        /* renamed from: a */
        CameraManager mo4423a();

        /* renamed from: b */
        void mo4424b(@C0359n0 Executor executor, @C0359n0 CameraManager.AvailabilityCallback availabilityCallback);

        @C0359n0
        /* renamed from: c */
        CameraCharacteristics mo4425c(@C0359n0 String str) throws CameraAccessExceptionCompat;

        @C0380x0("android.permission.CAMERA")
        /* renamed from: d */
        void mo4426d(@C0359n0 String str, @C0359n0 Executor executor, @C0359n0 CameraDevice.StateCallback stateCallback) throws CameraAccessExceptionCompat;

        @C0359n0
        /* renamed from: e */
        String[] mo4427e() throws CameraAccessExceptionCompat;

        /* renamed from: f */
        void mo4428f(@C0359n0 CameraManager.AvailabilityCallback availabilityCallback);
    }

    public C1127q(C1132b bVar) {
        this.f3342a = bVar;
    }

    @C0359n0
    /* renamed from: a */
    public static C1127q m4809a(@C0359n0 Context context) {
        return m4810b(context, C1565i.m6504a());
    }

    @C0359n0
    /* renamed from: b */
    public static C1127q m4810b(@C0359n0 Context context, @C0359n0 Handler handler) {
        return new C1127q(C1132b.m4819g(context, handler));
    }

    @C0359n0
    @RestrictTo({RestrictTo.Scope.TESTS})
    /* renamed from: c */
    public static C1127q m4811c(@C0359n0 C1132b bVar) {
        return new C1127q(bVar);
    }

    @C0359n0
    /* renamed from: d */
    public C1073h mo4410d(@C0359n0 String str) throws CameraAccessExceptionCompat {
        C1073h hVar;
        synchronized (this.f3343b) {
            hVar = this.f3343b.get(str);
            if (hVar == null) {
                hVar = C1073h.m4657c(this.f3342a.mo4425c(str));
                this.f3343b.put(str, hVar);
            }
        }
        return hVar;
    }

    @C0359n0
    /* renamed from: e */
    public String[] mo4411e() throws CameraAccessExceptionCompat {
        return this.f3342a.mo4427e();
    }

    @C0380x0("android.permission.CAMERA")
    /* renamed from: f */
    public void mo4412f(@C0359n0 String str, @C0359n0 Executor executor, @C0359n0 CameraDevice.StateCallback stateCallback) throws CameraAccessExceptionCompat {
        this.f3342a.mo4426d(str, executor, stateCallback);
    }

    /* renamed from: g */
    public void mo4413g(@C0359n0 Executor executor, @C0359n0 CameraManager.AvailabilityCallback availabilityCallback) {
        this.f3342a.mo4424b(executor, availabilityCallback);
    }

    /* renamed from: h */
    public void mo4414h(@C0359n0 CameraManager.AvailabilityCallback availabilityCallback) {
        this.f3342a.mo4428f(availabilityCallback);
    }

    @C0359n0
    /* renamed from: i */
    public CameraManager mo4415i() {
        return this.f3342a.mo4423a();
    }
}
