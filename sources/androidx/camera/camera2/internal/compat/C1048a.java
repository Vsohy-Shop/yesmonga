package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import androidx.annotation.C0359n0;
import androidx.annotation.C0376v0;
import androidx.camera.core.impl.utils.C1565i;
import java.util.List;
import java.util.concurrent.Executor;

@C0376v0(21)
/* renamed from: androidx.camera.camera2.internal.compat.a */
public final class C1048a {

    /* renamed from: a */
    public final C1049a f3233a;

    /* renamed from: androidx.camera.camera2.internal.compat.a$a */
    public interface C1049a {
        @C0359n0
        /* renamed from: a */
        CameraCaptureSession mo4290a();

        /* renamed from: b */
        int mo4291b(@C0359n0 List<CaptureRequest> list, @C0359n0 Executor executor, @C0359n0 CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException;

        /* renamed from: c */
        int mo4292c(@C0359n0 List<CaptureRequest> list, @C0359n0 Executor executor, @C0359n0 CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException;

        /* renamed from: d */
        int mo4293d(@C0359n0 CaptureRequest captureRequest, @C0359n0 Executor executor, @C0359n0 CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException;

        /* renamed from: e */
        int mo4294e(@C0359n0 CaptureRequest captureRequest, @C0359n0 Executor executor, @C0359n0 CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException;
    }

    /* renamed from: androidx.camera.camera2.internal.compat.a$b */
    public static final class C1050b extends CameraCaptureSession.CaptureCallback {

        /* renamed from: a */
        public final CameraCaptureSession.CaptureCallback f3234a;

        /* renamed from: b */
        public final Executor f3235b;

        /* renamed from: androidx.camera.camera2.internal.compat.a$b$a */
        public class C1051a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ CameraCaptureSession f3236a;

            /* renamed from: b */
            public final /* synthetic */ CaptureRequest f3237b;

            /* renamed from: c */
            public final /* synthetic */ long f3238c;

            /* renamed from: d */
            public final /* synthetic */ long f3239d;

            public C1051a(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
                this.f3236a = cameraCaptureSession;
                this.f3237b = captureRequest;
                this.f3238c = j;
                this.f3239d = j2;
            }

            public void run() {
                C1050b.this.f3234a.onCaptureStarted(this.f3236a, this.f3237b, this.f3238c, this.f3239d);
            }
        }

        /* renamed from: androidx.camera.camera2.internal.compat.a$b$b */
        public class C1052b implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ CameraCaptureSession f3241a;

            /* renamed from: b */
            public final /* synthetic */ CaptureRequest f3242b;

            /* renamed from: c */
            public final /* synthetic */ CaptureResult f3243c;

            public C1052b(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
                this.f3241a = cameraCaptureSession;
                this.f3242b = captureRequest;
                this.f3243c = captureResult;
            }

            public void run() {
                C1050b.this.f3234a.onCaptureProgressed(this.f3241a, this.f3242b, this.f3243c);
            }
        }

        /* renamed from: androidx.camera.camera2.internal.compat.a$b$c */
        public class C1053c implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ CameraCaptureSession f3245a;

            /* renamed from: b */
            public final /* synthetic */ CaptureRequest f3246b;

            /* renamed from: c */
            public final /* synthetic */ TotalCaptureResult f3247c;

            public C1053c(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
                this.f3245a = cameraCaptureSession;
                this.f3246b = captureRequest;
                this.f3247c = totalCaptureResult;
            }

            public void run() {
                C1050b.this.f3234a.onCaptureCompleted(this.f3245a, this.f3246b, this.f3247c);
            }
        }

        /* renamed from: androidx.camera.camera2.internal.compat.a$b$d */
        public class C1054d implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ CameraCaptureSession f3249a;

            /* renamed from: b */
            public final /* synthetic */ CaptureRequest f3250b;

            /* renamed from: c */
            public final /* synthetic */ CaptureFailure f3251c;

            public C1054d(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
                this.f3249a = cameraCaptureSession;
                this.f3250b = captureRequest;
                this.f3251c = captureFailure;
            }

            public void run() {
                C1050b.this.f3234a.onCaptureFailed(this.f3249a, this.f3250b, this.f3251c);
            }
        }

        /* renamed from: androidx.camera.camera2.internal.compat.a$b$e */
        public class C1055e implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ CameraCaptureSession f3253a;

            /* renamed from: b */
            public final /* synthetic */ int f3254b;

            /* renamed from: c */
            public final /* synthetic */ long f3255c;

            public C1055e(CameraCaptureSession cameraCaptureSession, int i, long j) {
                this.f3253a = cameraCaptureSession;
                this.f3254b = i;
                this.f3255c = j;
            }

            public void run() {
                C1050b.this.f3234a.onCaptureSequenceCompleted(this.f3253a, this.f3254b, this.f3255c);
            }
        }

        /* renamed from: androidx.camera.camera2.internal.compat.a$b$f */
        public class C1056f implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ CameraCaptureSession f3257a;

            /* renamed from: b */
            public final /* synthetic */ int f3258b;

            public C1056f(CameraCaptureSession cameraCaptureSession, int i) {
                this.f3257a = cameraCaptureSession;
                this.f3258b = i;
            }

            public void run() {
                C1050b.this.f3234a.onCaptureSequenceAborted(this.f3257a, this.f3258b);
            }
        }

        /* renamed from: androidx.camera.camera2.internal.compat.a$b$g */
        public class C1057g implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ CameraCaptureSession f3260a;

            /* renamed from: b */
            public final /* synthetic */ CaptureRequest f3261b;

            /* renamed from: c */
            public final /* synthetic */ Surface f3262c;

            /* renamed from: d */
            public final /* synthetic */ long f3263d;

            public C1057g(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j) {
                this.f3260a = cameraCaptureSession;
                this.f3261b = captureRequest;
                this.f3262c = surface;
                this.f3263d = j;
            }

            public void run() {
                C1050b.this.f3234a.onCaptureBufferLost(this.f3260a, this.f3261b, this.f3262c, this.f3263d);
            }
        }

        public C1050b(@C0359n0 Executor executor, @C0359n0 CameraCaptureSession.CaptureCallback captureCallback) {
            this.f3235b = executor;
            this.f3234a = captureCallback;
        }

        @C0376v0(24)
        public void onCaptureBufferLost(@C0359n0 CameraCaptureSession cameraCaptureSession, @C0359n0 CaptureRequest captureRequest, @C0359n0 Surface surface, long j) {
            this.f3235b.execute(new C1057g(cameraCaptureSession, captureRequest, surface, j));
        }

        public void onCaptureCompleted(@C0359n0 CameraCaptureSession cameraCaptureSession, @C0359n0 CaptureRequest captureRequest, @C0359n0 TotalCaptureResult totalCaptureResult) {
            this.f3235b.execute(new C1053c(cameraCaptureSession, captureRequest, totalCaptureResult));
        }

        public void onCaptureFailed(@C0359n0 CameraCaptureSession cameraCaptureSession, @C0359n0 CaptureRequest captureRequest, @C0359n0 CaptureFailure captureFailure) {
            this.f3235b.execute(new C1054d(cameraCaptureSession, captureRequest, captureFailure));
        }

        public void onCaptureProgressed(@C0359n0 CameraCaptureSession cameraCaptureSession, @C0359n0 CaptureRequest captureRequest, @C0359n0 CaptureResult captureResult) {
            this.f3235b.execute(new C1052b(cameraCaptureSession, captureRequest, captureResult));
        }

        public void onCaptureSequenceAborted(@C0359n0 CameraCaptureSession cameraCaptureSession, int i) {
            this.f3235b.execute(new C1056f(cameraCaptureSession, i));
        }

        public void onCaptureSequenceCompleted(@C0359n0 CameraCaptureSession cameraCaptureSession, int i, long j) {
            this.f3235b.execute(new C1055e(cameraCaptureSession, i, j));
        }

        public void onCaptureStarted(@C0359n0 CameraCaptureSession cameraCaptureSession, @C0359n0 CaptureRequest captureRequest, long j, long j2) {
            this.f3235b.execute(new C1051a(cameraCaptureSession, captureRequest, j, j2));
        }
    }

    /* renamed from: androidx.camera.camera2.internal.compat.a$c */
    public static final class C1058c extends CameraCaptureSession.StateCallback {

        /* renamed from: a */
        public final CameraCaptureSession.StateCallback f3265a;

        /* renamed from: b */
        public final Executor f3266b;

        /* renamed from: androidx.camera.camera2.internal.compat.a$c$a */
        public class C1059a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ CameraCaptureSession f3267a;

            public C1059a(CameraCaptureSession cameraCaptureSession) {
                this.f3267a = cameraCaptureSession;
            }

            public void run() {
                C1058c.this.f3265a.onConfigured(this.f3267a);
            }
        }

        /* renamed from: androidx.camera.camera2.internal.compat.a$c$b */
        public class C1060b implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ CameraCaptureSession f3269a;

            public C1060b(CameraCaptureSession cameraCaptureSession) {
                this.f3269a = cameraCaptureSession;
            }

            public void run() {
                C1058c.this.f3265a.onConfigureFailed(this.f3269a);
            }
        }

        /* renamed from: androidx.camera.camera2.internal.compat.a$c$c */
        public class C1061c implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ CameraCaptureSession f3271a;

            public C1061c(CameraCaptureSession cameraCaptureSession) {
                this.f3271a = cameraCaptureSession;
            }

            public void run() {
                C1058c.this.f3265a.onReady(this.f3271a);
            }
        }

        /* renamed from: androidx.camera.camera2.internal.compat.a$c$d */
        public class C1062d implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ CameraCaptureSession f3273a;

            public C1062d(CameraCaptureSession cameraCaptureSession) {
                this.f3273a = cameraCaptureSession;
            }

            public void run() {
                C1058c.this.f3265a.onActive(this.f3273a);
            }
        }

        /* renamed from: androidx.camera.camera2.internal.compat.a$c$e */
        public class C1063e implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ CameraCaptureSession f3275a;

            public C1063e(CameraCaptureSession cameraCaptureSession) {
                this.f3275a = cameraCaptureSession;
            }

            public void run() {
                C1058c.this.f3265a.onCaptureQueueEmpty(this.f3275a);
            }
        }

        /* renamed from: androidx.camera.camera2.internal.compat.a$c$f */
        public class C1064f implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ CameraCaptureSession f3277a;

            public C1064f(CameraCaptureSession cameraCaptureSession) {
                this.f3277a = cameraCaptureSession;
            }

            public void run() {
                C1058c.this.f3265a.onClosed(this.f3277a);
            }
        }

        /* renamed from: androidx.camera.camera2.internal.compat.a$c$g */
        public class C1065g implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ CameraCaptureSession f3279a;

            /* renamed from: b */
            public final /* synthetic */ Surface f3280b;

            public C1065g(CameraCaptureSession cameraCaptureSession, Surface surface) {
                this.f3279a = cameraCaptureSession;
                this.f3280b = surface;
            }

            public void run() {
                C1058c.this.f3265a.onSurfacePrepared(this.f3279a, this.f3280b);
            }
        }

        public C1058c(@C0359n0 Executor executor, @C0359n0 CameraCaptureSession.StateCallback stateCallback) {
            this.f3266b = executor;
            this.f3265a = stateCallback;
        }

        public void onActive(@C0359n0 CameraCaptureSession cameraCaptureSession) {
            this.f3266b.execute(new C1062d(cameraCaptureSession));
        }

        @C0376v0(26)
        public void onCaptureQueueEmpty(@C0359n0 CameraCaptureSession cameraCaptureSession) {
            this.f3266b.execute(new C1063e(cameraCaptureSession));
        }

        public void onClosed(@C0359n0 CameraCaptureSession cameraCaptureSession) {
            this.f3266b.execute(new C1064f(cameraCaptureSession));
        }

        public void onConfigureFailed(@C0359n0 CameraCaptureSession cameraCaptureSession) {
            this.f3266b.execute(new C1060b(cameraCaptureSession));
        }

        public void onConfigured(@C0359n0 CameraCaptureSession cameraCaptureSession) {
            this.f3266b.execute(new C1059a(cameraCaptureSession));
        }

        public void onReady(@C0359n0 CameraCaptureSession cameraCaptureSession) {
            this.f3266b.execute(new C1061c(cameraCaptureSession));
        }

        @C0376v0(23)
        public void onSurfacePrepared(@C0359n0 CameraCaptureSession cameraCaptureSession, @C0359n0 Surface surface) {
            this.f3266b.execute(new C1065g(cameraCaptureSession, surface));
        }
    }

    public C1048a(@C0359n0 CameraCaptureSession cameraCaptureSession, @C0359n0 Handler handler) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f3233a = new C1070f(cameraCaptureSession);
        } else {
            this.f3233a = C1071g.m4651f(cameraCaptureSession, handler);
        }
    }

    @C0359n0
    /* renamed from: f */
    public static C1048a m4631f(@C0359n0 CameraCaptureSession cameraCaptureSession) {
        return m4632g(cameraCaptureSession, C1565i.m6504a());
    }

    @C0359n0
    /* renamed from: g */
    public static C1048a m4632g(@C0359n0 CameraCaptureSession cameraCaptureSession, @C0359n0 Handler handler) {
        return new C1048a(cameraCaptureSession, handler);
    }

    /* renamed from: a */
    public int mo4285a(@C0359n0 List<CaptureRequest> list, @C0359n0 Executor executor, @C0359n0 CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        return this.f3233a.mo4291b(list, executor, captureCallback);
    }

    /* renamed from: b */
    public int mo4286b(@C0359n0 CaptureRequest captureRequest, @C0359n0 Executor executor, @C0359n0 CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        return this.f3233a.mo4294e(captureRequest, executor, captureCallback);
    }

    /* renamed from: c */
    public int mo4287c(@C0359n0 List<CaptureRequest> list, @C0359n0 Executor executor, @C0359n0 CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        return this.f3233a.mo4292c(list, executor, captureCallback);
    }

    /* renamed from: d */
    public int mo4288d(@C0359n0 CaptureRequest captureRequest, @C0359n0 Executor executor, @C0359n0 CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        return this.f3233a.mo4293d(captureRequest, executor, captureCallback);
    }

    @C0359n0
    /* renamed from: e */
    public CameraCaptureSession mo4289e() {
        return this.f3233a.mo4290a();
    }
}
