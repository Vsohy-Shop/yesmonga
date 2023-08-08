package androidx.camera.camera2.internal;

import android.annotation.SuppressLint;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Rational;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.camera.camera2.internal.C1237r2;
import androidx.camera.camera2.internal.compat.C1127q;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.core.C1417i2;
import androidx.camera.core.C1677r2;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.UseCase;
import androidx.camera.core.impl.C1432a1;
import androidx.camera.core.impl.C1483n1;
import androidx.camera.core.impl.C1496q;
import androidx.camera.core.impl.C1503s0;
import androidx.camera.core.impl.C1568v;
import androidx.camera.core.impl.C1571v0;
import androidx.camera.core.impl.C1583y;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.utils.executor.C1525a;
import androidx.camera.core.impl.utils.futures.C1544c;
import androidx.camera.core.impl.utils.futures.C1548f;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.C18001r;
import com.contentsquare.android.api.C14092c;
import com.google.common.util.concurrent.C32487a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;

public final class Camera2CameraImpl implements CameraInternal {

    /* renamed from: M0 */
    public static final String f3078M0 = "Camera2CameraImpl";

    /* renamed from: N0 */
    public static final int f3079N0 = 0;

    /* renamed from: E0 */
    public final Map<CaptureSession, C32487a<Void>> f3080E0;

    /* renamed from: F0 */
    public final C1014d f3081F0;

    /* renamed from: G0 */
    public final C1568v f3082G0;

    /* renamed from: H0 */
    public final Set<CaptureSession> f3083H0;

    /* renamed from: I0 */
    public C1173e2 f3084I0;
    @C0359n0

    /* renamed from: J0 */
    public final C1209m1 f3085J0;
    @C0359n0

    /* renamed from: K0 */
    public final C1237r2.C1238a f3086K0;

    /* renamed from: L0 */
    public final Set<String> f3087L0;

    /* renamed from: X */
    public final AtomicInteger f3088X;

    /* renamed from: Y */
    public C32487a<Void> f3089Y;

    /* renamed from: Z */
    public CallbackToFutureAdapter.C16559a<Void> f3090Z;

    /* renamed from: a */
    public final C1483n1 f3091a;

    /* renamed from: b */
    public final C1127q f3092b;

    /* renamed from: c */
    public final Executor f3093c;

    /* renamed from: d */
    public volatile InternalState f3094d = InternalState.INITIALIZED;

    /* renamed from: e */
    public final C1571v0<CameraInternal.State> f3095e;

    /* renamed from: f */
    public final C1254v f3096f;

    /* renamed from: g */
    public final C1016f f3097g;
    @C0359n0

    /* renamed from: v */
    public final C1227q0 f3098v;
    @C0363p0

    /* renamed from: w */
    public CameraDevice f3099w;

    /* renamed from: x */
    public int f3100x;

    /* renamed from: y */
    public CaptureSession f3101y;

    /* renamed from: z */
    public SessionConfig f3102z;

    public enum InternalState {
        INITIALIZED,
        PENDING_OPEN,
        OPENING,
        OPENED,
        CLOSING,
        REOPENING,
        RELEASING,
        RELEASED
    }

    /* renamed from: androidx.camera.camera2.internal.Camera2CameraImpl$a */
    public class C1011a implements C1544c<Void> {

        /* renamed from: a */
        public final /* synthetic */ CaptureSession f3112a;

        public C1011a(CaptureSession captureSession) {
            this.f3112a = captureSession;
        }

        /* renamed from: b */
        public void mo4161b(Throwable th) {
        }

        /* renamed from: c */
        public void mo4160a(@C0363p0 Void voidR) {
            CameraDevice cameraDevice;
            Camera2CameraImpl.this.f3080E0.remove(this.f3112a);
            int i = C1013c.f3115a[Camera2CameraImpl.this.f3094d.ordinal()];
            if (i != 2) {
                if (i != 5) {
                    if (i != 7) {
                        return;
                    }
                } else if (Camera2CameraImpl.this.f3100x == 0) {
                    return;
                }
            }
            if (Camera2CameraImpl.this.mo4128T() && (cameraDevice = Camera2CameraImpl.this.f3099w) != null) {
                cameraDevice.close();
                Camera2CameraImpl.this.f3099w = null;
            }
        }
    }

    /* renamed from: androidx.camera.camera2.internal.Camera2CameraImpl$b */
    public class C1012b implements C1544c<Void> {
        public C1012b() {
        }

        /* renamed from: b */
        public void mo4161b(Throwable th) {
            if (th instanceof CameraAccessException) {
                Camera2CameraImpl camera2CameraImpl = Camera2CameraImpl.this;
                camera2CameraImpl.mo4122M("Unable to configure camera due to " + th.getMessage());
            } else if (th instanceof CancellationException) {
                Camera2CameraImpl.this.mo4122M("Unable to configure camera cancelled");
            } else if (th instanceof DeferrableSurface.SurfaceClosedException) {
                SessionConfig O = Camera2CameraImpl.this.mo4124O(((DeferrableSurface.SurfaceClosedException) th).mo5143a());
                if (O != null) {
                    Camera2CameraImpl.this.mo4145o0(O);
                }
            } else if (th instanceof TimeoutException) {
                C1417i2.m5913c(Camera2CameraImpl.f3078M0, "Unable to configure camera " + Camera2CameraImpl.this.f3098v.mo4592b() + ", timeout!");
            } else {
                throw new RuntimeException(th);
            }
        }

        /* renamed from: c */
        public void mo4160a(@C0363p0 Void voidR) {
        }
    }

    /* renamed from: androidx.camera.camera2.internal.Camera2CameraImpl$c */
    public static /* synthetic */ class C1013c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f3115a;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                androidx.camera.camera2.internal.Camera2CameraImpl$InternalState[] r0 = androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f3115a = r0
                androidx.camera.camera2.internal.Camera2CameraImpl$InternalState r1 = androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f3115a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.camera.camera2.internal.Camera2CameraImpl$InternalState r1 = androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.CLOSING     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f3115a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.camera.camera2.internal.Camera2CameraImpl$InternalState r1 = androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.OPENED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f3115a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.camera.camera2.internal.Camera2CameraImpl$InternalState r1 = androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.OPENING     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f3115a     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.camera.camera2.internal.Camera2CameraImpl$InternalState r1 = androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.REOPENING     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f3115a     // Catch:{ NoSuchFieldError -> 0x0049 }
                androidx.camera.camera2.internal.Camera2CameraImpl$InternalState r1 = androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.PENDING_OPEN     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f3115a     // Catch:{ NoSuchFieldError -> 0x0054 }
                androidx.camera.camera2.internal.Camera2CameraImpl$InternalState r1 = androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.RELEASING     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f3115a     // Catch:{ NoSuchFieldError -> 0x0060 }
                androidx.camera.camera2.internal.Camera2CameraImpl$InternalState r1 = androidx.camera.camera2.internal.Camera2CameraImpl.InternalState.RELEASED     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.internal.Camera2CameraImpl.C1013c.<clinit>():void");
        }
    }

    /* renamed from: androidx.camera.camera2.internal.Camera2CameraImpl$d */
    public final class C1014d extends CameraManager.AvailabilityCallback implements C1568v.C1570b {

        /* renamed from: a */
        public final String f3116a;

        /* renamed from: b */
        public boolean f3117b = true;

        public C1014d(String str) {
            this.f3116a = str;
        }

        /* renamed from: a */
        public void mo4164a() {
            if (Camera2CameraImpl.this.f3094d == InternalState.PENDING_OPEN) {
                Camera2CameraImpl.this.mo4140l0(false);
            }
        }

        /* renamed from: b */
        public boolean mo4165b() {
            return this.f3117b;
        }

        public void onCameraAvailable(@C0359n0 String str) {
            if (this.f3116a.equals(str)) {
                this.f3117b = true;
                if (Camera2CameraImpl.this.f3094d == InternalState.PENDING_OPEN) {
                    Camera2CameraImpl.this.mo4140l0(false);
                }
            }
        }

        public void onCameraUnavailable(@C0359n0 String str) {
            if (this.f3116a.equals(str)) {
                this.f3117b = false;
            }
        }
    }

    /* renamed from: androidx.camera.camera2.internal.Camera2CameraImpl$e */
    public final class C1015e implements CameraControlInternal.C1420b {
        public C1015e() {
        }

        /* renamed from: a */
        public void mo4168a(@C0359n0 List<C1583y> list) {
            Camera2CameraImpl.this.mo4155v0((List) C18001r.m81775l(list));
        }

        /* renamed from: b */
        public void mo4169b(@C0359n0 SessionConfig sessionConfig) {
            Camera2CameraImpl.this.f3102z = (SessionConfig) C18001r.m81775l(sessionConfig);
            Camera2CameraImpl.this.mo4159z0();
        }
    }

    /* renamed from: androidx.camera.camera2.internal.Camera2CameraImpl$f */
    public final class C1016f extends CameraDevice.StateCallback {

        /* renamed from: g */
        public static final int f3120g = 700;

        /* renamed from: a */
        public final Executor f3121a;

        /* renamed from: b */
        public final ScheduledExecutorService f3122b;

        /* renamed from: c */
        public C1018b f3123c;

        /* renamed from: d */
        public ScheduledFuture<?> f3124d;
        @C0359n0

        /* renamed from: e */
        public final C1017a f3125e = new C1017a();

        /* renamed from: androidx.camera.camera2.internal.Camera2CameraImpl$f$a */
        public class C1017a {

            /* renamed from: c */
            public static final int f3127c = 10000;

            /* renamed from: d */
            public static final int f3128d = -1;

            /* renamed from: a */
            public long f3129a = -1;

            public C1017a() {
            }

            /* renamed from: a */
            public boolean mo4179a() {
                boolean z;
                long uptimeMillis = SystemClock.uptimeMillis();
                long j = this.f3129a;
                if (j == -1) {
                    this.f3129a = uptimeMillis;
                    return true;
                }
                if (uptimeMillis - j >= 10000) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    return true;
                }
                mo4180b();
                return false;
            }

            /* renamed from: b */
            public void mo4180b() {
                this.f3129a = -1;
            }
        }

        /* renamed from: androidx.camera.camera2.internal.Camera2CameraImpl$f$b */
        public class C1018b implements Runnable {

            /* renamed from: a */
            public Executor f3131a;

            /* renamed from: b */
            public boolean f3132b = false;

            public C1018b(@C0359n0 Executor executor) {
                this.f3131a = executor;
            }

            /* access modifiers changed from: private */
            /* renamed from: d */
            public /* synthetic */ void m4489d() {
                boolean z;
                if (!this.f3132b) {
                    if (Camera2CameraImpl.this.f3094d == InternalState.REOPENING) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C18001r.m81777n(z);
                    Camera2CameraImpl.this.mo4140l0(true);
                }
            }

            /* renamed from: c */
            public void mo4181c() {
                this.f3132b = true;
            }

            public void run() {
                this.f3131a.execute(new C1219o0(this));
            }
        }

        public C1016f(@C0359n0 Executor executor, @C0359n0 ScheduledExecutorService scheduledExecutorService) {
            this.f3121a = executor;
            this.f3122b = scheduledExecutorService;
        }

        /* renamed from: a */
        public boolean mo4170a() {
            if (this.f3124d == null) {
                return false;
            }
            Camera2CameraImpl camera2CameraImpl = Camera2CameraImpl.this;
            camera2CameraImpl.mo4122M("Cancelling scheduled re-open: " + this.f3123c);
            this.f3123c.mo4181c();
            this.f3123c = null;
            this.f3124d.cancel(false);
            this.f3124d = null;
            return true;
        }

        /* renamed from: b */
        public final void mo4171b(@C0359n0 CameraDevice cameraDevice, int i) {
            boolean z;
            if (Camera2CameraImpl.this.f3094d == InternalState.OPENING || Camera2CameraImpl.this.f3094d == InternalState.OPENED || Camera2CameraImpl.this.f3094d == InternalState.REOPENING) {
                z = true;
            } else {
                z = false;
            }
            C18001r.m81778o(z, "Attempt to handle open error from non open state: " + Camera2CameraImpl.this.f3094d);
            if (i == 1 || i == 2 || i == 4) {
                C1417i2.m5911a(Camera2CameraImpl.f3078M0, String.format("Attempt to reopen camera[%s] after error[%s]", new Object[]{cameraDevice.getId(), Camera2CameraImpl.m4401Q(i)}));
                mo4172c();
                return;
            }
            C1417i2.m5913c(Camera2CameraImpl.f3078M0, "Error observed on open (or opening) camera device " + cameraDevice.getId() + ": " + Camera2CameraImpl.m4401Q(i) + " closing camera.");
            Camera2CameraImpl.this.mo4154u0(InternalState.CLOSING);
            Camera2CameraImpl.this.mo4118I(false);
        }

        /* renamed from: c */
        public final void mo4172c() {
            boolean z;
            if (Camera2CameraImpl.this.f3100x != 0) {
                z = true;
            } else {
                z = false;
            }
            C18001r.m81778o(z, "Can only reopen camera device after error if the camera device is actually in an error state.");
            Camera2CameraImpl.this.mo4154u0(InternalState.REOPENING);
            Camera2CameraImpl.this.mo4118I(false);
        }

        /* renamed from: d */
        public void mo4173d() {
            this.f3125e.mo4180b();
        }

        /* renamed from: e */
        public void mo4174e() {
            boolean z;
            boolean z2 = true;
            if (this.f3123c == null) {
                z = true;
            } else {
                z = false;
            }
            C18001r.m81777n(z);
            if (this.f3124d != null) {
                z2 = false;
            }
            C18001r.m81777n(z2);
            if (this.f3125e.mo4179a()) {
                this.f3123c = new C1018b(this.f3121a);
                Camera2CameraImpl.this.mo4122M("Attempting camera re-open in 700ms: " + this.f3123c);
                this.f3124d = this.f3122b.schedule(this.f3123c, 700, TimeUnit.MILLISECONDS);
                return;
            }
            C1417i2.m5913c(Camera2CameraImpl.f3078M0, "Camera reopening attempted for 10000ms without success.");
            Camera2CameraImpl.this.mo4154u0(InternalState.INITIALIZED);
        }

        public void onClosed(@C0359n0 CameraDevice cameraDevice) {
            boolean z;
            Camera2CameraImpl.this.mo4122M("CameraDevice.onClosed()");
            if (Camera2CameraImpl.this.f3099w == null) {
                z = true;
            } else {
                z = false;
            }
            C18001r.m81778o(z, "Unexpected onClose callback on camera device: " + cameraDevice);
            int i = C1013c.f3115a[Camera2CameraImpl.this.f3094d.ordinal()];
            if (i != 2) {
                if (i == 5) {
                    Camera2CameraImpl camera2CameraImpl = Camera2CameraImpl.this;
                    if (camera2CameraImpl.f3100x != 0) {
                        camera2CameraImpl.mo4122M("Camera closed due to error: " + Camera2CameraImpl.m4401Q(Camera2CameraImpl.this.f3100x));
                        mo4174e();
                        return;
                    }
                    camera2CameraImpl.mo4140l0(false);
                    return;
                } else if (i != 7) {
                    throw new IllegalStateException("Camera closed while in state: " + Camera2CameraImpl.this.f3094d);
                }
            }
            C18001r.m81777n(Camera2CameraImpl.this.mo4128T());
            Camera2CameraImpl.this.mo4125P();
        }

        public void onDisconnected(@C0359n0 CameraDevice cameraDevice) {
            Camera2CameraImpl.this.mo4122M("CameraDevice.onDisconnected()");
            onError(cameraDevice, 1);
        }

        public void onError(@C0359n0 CameraDevice cameraDevice, int i) {
            Camera2CameraImpl camera2CameraImpl = Camera2CameraImpl.this;
            camera2CameraImpl.f3099w = cameraDevice;
            camera2CameraImpl.f3100x = i;
            int i2 = C1013c.f3115a[camera2CameraImpl.f3094d.ordinal()];
            if (i2 != 2) {
                if (i2 == 3 || i2 == 4 || i2 == 5) {
                    C1417i2.m5911a(Camera2CameraImpl.f3078M0, String.format("CameraDevice.onError(): %s failed with %s while in %s state. Will attempt recovering from error.", new Object[]{cameraDevice.getId(), Camera2CameraImpl.m4401Q(i), Camera2CameraImpl.this.f3094d.name()}));
                    mo4171b(cameraDevice, i);
                    return;
                } else if (i2 != 7) {
                    throw new IllegalStateException("onError() should not be possible from state: " + Camera2CameraImpl.this.f3094d);
                }
            }
            C1417i2.m5913c(Camera2CameraImpl.f3078M0, String.format("CameraDevice.onError(): %s failed with %s while in %s state. Will finish closing camera.", new Object[]{cameraDevice.getId(), Camera2CameraImpl.m4401Q(i), Camera2CameraImpl.this.f3094d.name()}));
            Camera2CameraImpl.this.mo4118I(false);
        }

        public void onOpened(@C0359n0 CameraDevice cameraDevice) {
            Camera2CameraImpl.this.mo4122M("CameraDevice.onOpened()");
            Camera2CameraImpl camera2CameraImpl = Camera2CameraImpl.this;
            camera2CameraImpl.f3099w = cameraDevice;
            camera2CameraImpl.mo4113A0(cameraDevice);
            Camera2CameraImpl camera2CameraImpl2 = Camera2CameraImpl.this;
            camera2CameraImpl2.f3100x = 0;
            int i = C1013c.f3115a[camera2CameraImpl2.f3094d.ordinal()];
            if (i == 2 || i == 7) {
                C18001r.m81777n(Camera2CameraImpl.this.mo4128T());
                Camera2CameraImpl.this.f3099w.close();
                Camera2CameraImpl.this.f3099w = null;
            } else if (i == 4 || i == 5) {
                Camera2CameraImpl.this.mo4154u0(InternalState.OPENED);
                Camera2CameraImpl.this.mo4142m0();
            } else {
                throw new IllegalStateException("onOpened() should not be possible from state: " + Camera2CameraImpl.this.f3094d);
            }
        }
    }

    public Camera2CameraImpl(@C0359n0 C1127q qVar, @C0359n0 String str, @C0359n0 C1227q0 q0Var, @C0359n0 C1568v vVar, @C0359n0 Executor executor, @C0359n0 Handler handler) throws CameraUnavailableException {
        C1571v0<CameraInternal.State> v0Var = new C1571v0<>();
        this.f3095e = v0Var;
        this.f3100x = 0;
        this.f3102z = SessionConfig.m5999a();
        this.f3088X = new AtomicInteger(0);
        this.f3080E0 = new LinkedHashMap();
        this.f3083H0 = new HashSet();
        this.f3087L0 = new HashSet();
        this.f3092b = qVar;
        this.f3082G0 = vVar;
        ScheduledExecutorService g = C1525a.m6443g(handler);
        Executor h = C1525a.m6444h(executor);
        this.f3093c = h;
        this.f3097g = new C1016f(h, g);
        this.f3091a = new C1483n1(str);
        v0Var.mo5531f(CameraInternal.State.CLOSED);
        C1209m1 m1Var = new C1209m1(h);
        this.f3085J0 = m1Var;
        this.f3101y = new CaptureSession();
        try {
            C1254v vVar2 = new C1254v(qVar.mo4410d(str), g, h, new C1015e(), q0Var.mo4596f());
            this.f3096f = vVar2;
            this.f3098v = q0Var;
            q0Var.mo4607q(vVar2);
            this.f3086K0 = new C1237r2.C1238a(h, g, handler, m1Var, q0Var.mo4606p());
            C1014d dVar = new C1014d(str);
            this.f3081F0 = dVar;
            vVar.mo5522d(this, h, dVar);
            qVar.mo4413g(h, dVar);
        } catch (CameraAccessExceptionCompat e) {
            throw C1172e1.m4889a(e);
        }
    }

    /* renamed from: Q */
    public static String m4401Q(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "UNKNOWN ERROR" : "ERROR_CAMERA_SERVICE" : "ERROR_CAMERA_DEVICE" : "ERROR_CAMERA_DISABLED" : "ERROR_MAX_CAMERAS_IN_USE" : "ERROR_CAMERA_IN_USE" : "ERROR_NONE";
    }

    /* access modifiers changed from: private */
    /* renamed from: V */
    public /* synthetic */ void m4402V(Collection collection) {
        try {
            mo4156w0(collection);
        } finally {
            this.f3096f.mo4656D();
        }
    }

    /* renamed from: W */
    public static /* synthetic */ void m4403W(Surface surface, SurfaceTexture surfaceTexture) {
        surface.release();
        surfaceTexture.release();
    }

    /* access modifiers changed from: private */
    /* renamed from: Z */
    public /* synthetic */ Object m4406Z(CallbackToFutureAdapter.C16559a aVar) throws Exception {
        boolean z;
        if (this.f3090Z == null) {
            z = true;
        } else {
            z = false;
        }
        C18001r.m81778o(z, "Camera can only be released once, so release completer should be null on creation.");
        this.f3090Z = aVar;
        return "Release[camera=" + this + "]";
    }

    /* access modifiers changed from: private */
    /* renamed from: a0 */
    public /* synthetic */ Object m4407a0(UseCase useCase, CallbackToFutureAdapter.C16559a aVar) throws Exception {
        try {
            this.f3093c.execute(new C1171e0(this, aVar, useCase));
            return "isUseCaseAttached";
        } catch (RejectedExecutionException unused) {
            aVar.mo48128f(new RuntimeException("Unable to check if use case is attached. Camera executor shut down."));
            return "isUseCaseAttached";
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b0 */
    public /* synthetic */ void m4408b0(CallbackToFutureAdapter.C16559a aVar, UseCase useCase) {
        C1483n1 n1Var = this.f3091a;
        aVar.mo48125c(Boolean.valueOf(n1Var.mo5266i(useCase.mo4957i() + useCase.hashCode())));
    }

    /* access modifiers changed from: private */
    /* renamed from: c0 */
    public /* synthetic */ void m4409c0(UseCase useCase) {
        mo4122M("Use case " + useCase + " ACTIVE");
        try {
            C1483n1 n1Var = this.f3091a;
            n1Var.mo5268m(useCase.mo4957i() + useCase.hashCode(), useCase.mo4959k());
            C1483n1 n1Var2 = this.f3091a;
            n1Var2.mo5272q(useCase.mo4957i() + useCase.hashCode(), useCase.mo4959k());
            mo4159z0();
        } catch (NullPointerException unused) {
            mo4122M("Failed to set already detached use case active");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d0 */
    public /* synthetic */ void m4410d0(UseCase useCase) {
        mo4122M("Use case " + useCase + " INACTIVE");
        C1483n1 n1Var = this.f3091a;
        n1Var.mo5271p(useCase.mo4957i() + useCase.hashCode());
        mo4159z0();
    }

    /* access modifiers changed from: private */
    /* renamed from: e0 */
    public /* synthetic */ void m4411e0(UseCase useCase) {
        mo4122M("Use case " + useCase + " RESET");
        C1483n1 n1Var = this.f3091a;
        n1Var.mo5272q(useCase.mo4957i() + useCase.hashCode(), useCase.mo4959k());
        mo4152t0(false);
        mo4159z0();
        if (this.f3094d == InternalState.OPENED) {
            mo4142m0();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f0 */
    public /* synthetic */ void m4412f0(UseCase useCase) {
        mo4122M("Use case " + useCase + " UPDATED");
        C1483n1 n1Var = this.f3091a;
        n1Var.mo5272q(useCase.mo4957i() + useCase.hashCode(), useCase.mo4959k());
        mo4159z0();
    }

    /* access modifiers changed from: private */
    /* renamed from: h0 */
    public /* synthetic */ void m4414h0(CallbackToFutureAdapter.C16559a aVar) {
        C1548f.m6482k(mo4147p0(), aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: i0 */
    public /* synthetic */ Object m4415i0(CallbackToFutureAdapter.C16559a aVar) throws Exception {
        this.f3093c.execute(new C1196j0(this, aVar));
        return "Release[request=" + this.f3088X.getAndIncrement() + "]";
    }

    /* renamed from: A0 */
    public void mo4113A0(@C0359n0 CameraDevice cameraDevice) {
        try {
            this.f3096f.mo4689k0(cameraDevice.createCaptureRequest(this.f3096f.mo4660H()));
        } catch (CameraAccessException e) {
            C1417i2.m5914d(f3078M0, "fail to create capture request.", e);
        }
    }

    /* renamed from: E */
    public final void mo4114E() {
        if (this.f3084I0 != null) {
            C1483n1 n1Var = this.f3091a;
            n1Var.mo5269n(this.f3084I0.mo4455d() + this.f3084I0.hashCode(), this.f3084I0.mo4456e());
            C1483n1 n1Var2 = this.f3091a;
            n1Var2.mo5268m(this.f3084I0.mo4455d() + this.f3084I0.hashCode(), this.f3084I0.mo4456e());
        }
    }

    /* renamed from: F */
    public final void mo4115F() {
        SessionConfig b = this.f3091a.mo5262e().mo5173b();
        C1583y f = b.mo5148f();
        int size = f.mo5549d().size();
        int size2 = b.mo5151i().size();
        if (b.mo5151i().isEmpty()) {
            return;
        }
        if (f.mo5549d().isEmpty()) {
            if (this.f3084I0 == null) {
                this.f3084I0 = new C1173e2(this.f3098v.mo4604n());
            }
            mo4114E();
        } else if (size2 == 1 && size == 1) {
            mo4151s0();
        } else if (size >= 2) {
            mo4151s0();
        } else {
            C1417i2.m5911a(f3078M0, "mMeteringRepeating is ATTACHED, SessionConfig Surfaces: " + size2 + ", CaptureConfig Surfaces: " + size);
        }
    }

    /* renamed from: G */
    public final boolean mo4116G(C1583y.C1584a aVar) {
        if (!aVar.mo5563m().isEmpty()) {
            C1417i2.m5924n(f3078M0, "The capture config builder already has surface inside.");
            return false;
        }
        for (SessionConfig f : this.f3091a.mo5261d()) {
            List<DeferrableSurface> d = f.mo5148f().mo5549d();
            if (!d.isEmpty()) {
                for (DeferrableSurface f2 : d) {
                    aVar.mo5558f(f2);
                }
            }
        }
        if (!aVar.mo5563m().isEmpty()) {
            return true;
        }
        C1417i2.m5924n(f3078M0, "Unable to find a repeating surface to attach to CaptureConfig");
        return false;
    }

    /* renamed from: H */
    public final void mo4117H(Collection<UseCase> collection) {
        for (UseCase useCase : collection) {
            if (useCase instanceof C1677r2) {
                this.f3096f.mo4691l0((Rational) null);
                return;
            }
        }
    }

    /* renamed from: I */
    public void mo4118I(boolean z) {
        boolean z2;
        if (this.f3094d == InternalState.CLOSING || this.f3094d == InternalState.RELEASING || (this.f3094d == InternalState.REOPENING && this.f3100x != 0)) {
            z2 = true;
        } else {
            z2 = false;
        }
        C18001r.m81778o(z2, "closeCamera should only be called in a CLOSING, RELEASING or REOPENING (with error) state. Current state: " + this.f3094d + " (error: " + m4401Q(this.f3100x) + ")");
        if (Build.VERSION.SDK_INT >= 29 || !mo4127S() || this.f3100x != 0) {
            mo4152t0(z);
        } else {
            mo4120K(z);
        }
        this.f3101y.mo4183d();
    }

    /* renamed from: J */
    public final void mo4119J() {
        mo4122M("Closing camera.");
        int i = C1013c.f3115a[this.f3094d.ordinal()];
        boolean z = false;
        if (i == 3) {
            mo4154u0(InternalState.CLOSING);
            mo4118I(false);
        } else if (i == 4 || i == 5) {
            boolean a = this.f3097g.mo4170a();
            mo4154u0(InternalState.CLOSING);
            if (a) {
                C18001r.m81777n(mo4128T());
                mo4125P();
            }
        } else if (i != 6) {
            mo4122M("close() ignored due to being in state: " + this.f3094d);
        } else {
            if (this.f3099w == null) {
                z = true;
            }
            C18001r.m81777n(z);
            mo4154u0(InternalState.INITIALIZED);
        }
    }

    /* renamed from: K */
    public final void mo4120K(boolean z) {
        CaptureSession captureSession = new CaptureSession();
        this.f3083H0.add(captureSession);
        mo4152t0(z);
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(640, C14092c.f34573Y0);
        Surface surface = new Surface(surfaceTexture);
        C1034b0 b0Var = new C1034b0(surface, surfaceTexture);
        SessionConfig.C1424b bVar = new SessionConfig.C1424b();
        C1503s0 s0Var = new C1503s0(surface);
        bVar.mo5161i(s0Var);
        bVar.mo5171t(1);
        mo4122M("Start configAndClose.");
        captureSession.mo4194s(bVar.mo5166n(), (CameraDevice) C18001r.m81775l(this.f3099w), this.f3086K0.mo4643a()).mo5489q(new C1041c0(this, captureSession, s0Var, b0Var), this.f3093c);
    }

    /* renamed from: L */
    public final CameraDevice.StateCallback mo4121L() {
        ArrayList arrayList = new ArrayList(this.f3091a.mo5262e().mo5173b().mo5144b());
        arrayList.add(this.f3085J0.mo4549c());
        arrayList.add(this.f3097g);
        return C1042c1.m4621a(arrayList);
    }

    /* renamed from: M */
    public void mo4122M(@C0359n0 String str) {
        mo4123N(str, (Throwable) null);
    }

    /* renamed from: N */
    public final void mo4123N(@C0359n0 String str, @C0363p0 Throwable th) {
        C1417i2.m5912b(f3078M0, String.format("{%s} %s", new Object[]{toString(), str}), th);
    }

    @C0363p0
    /* renamed from: O */
    public SessionConfig mo4124O(@C0359n0 DeferrableSurface deferrableSurface) {
        for (SessionConfig next : this.f3091a.mo5263f()) {
            if (next.mo5151i().contains(deferrableSurface)) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: P */
    public void mo4125P() {
        boolean z;
        if (this.f3094d == InternalState.RELEASING || this.f3094d == InternalState.CLOSING) {
            z = true;
        } else {
            z = false;
        }
        C18001r.m81777n(z);
        C18001r.m81777n(this.f3080E0.isEmpty());
        this.f3099w = null;
        if (this.f3094d == InternalState.CLOSING) {
            mo4154u0(InternalState.INITIALIZED);
            return;
        }
        this.f3092b.mo4414h(this.f3081F0);
        mo4154u0(InternalState.RELEASED);
        CallbackToFutureAdapter.C16559a<Void> aVar = this.f3090Z;
        if (aVar != null) {
            aVar.mo48125c(null);
            this.f3090Z = null;
        }
    }

    /* renamed from: R */
    public final C32487a<Void> mo4126R() {
        if (this.f3089Y == null) {
            if (this.f3094d != InternalState.RELEASED) {
                this.f3089Y = CallbackToFutureAdapter.m74987a(new C1177f0(this));
            } else {
                this.f3089Y = C1548f.m6479h(null);
            }
        }
        return this.f3089Y;
    }

    /* renamed from: S */
    public final boolean mo4127S() {
        if (((C1227q0) mo4139l()).mo4606p() == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: T */
    public boolean mo4128T() {
        return this.f3080E0.isEmpty() && this.f3083H0.isEmpty();
    }

    @RestrictTo({RestrictTo.Scope.TESTS})
    /* renamed from: U */
    public boolean mo4129U(@C0359n0 UseCase useCase) {
        try {
            return ((Boolean) CallbackToFutureAdapter.m74987a(new C1204l0(this, useCase)).get()).booleanValue();
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException("Unable to check if use case is attached.", e);
        }
    }

    public void close() {
        this.f3093c.execute(new C1276z(this));
    }

    /* renamed from: f */
    public void mo4131f(@C0359n0 UseCase useCase) {
        C18001r.m81775l(useCase);
        this.f3093c.execute(new C1188h0(this, useCase));
    }

    /* renamed from: g */
    public void mo4132g(@C0359n0 UseCase useCase) {
        C18001r.m81775l(useCase);
        this.f3093c.execute(new C1200k0(this, useCase));
    }

    @C0359n0
    /* renamed from: h */
    public CameraControlInternal mo4133h() {
        return this.f3096f;
    }

    /* renamed from: i */
    public void mo4134i(@C0359n0 UseCase useCase) {
        C18001r.m81775l(useCase);
        this.f3093c.execute(new C1167d0(this, useCase));
    }

    /* renamed from: j */
    public void mo4135j(@C0359n0 Collection<UseCase> collection) {
        if (!collection.isEmpty()) {
            this.f3096f.mo4672T();
            mo4136j0(new ArrayList(collection));
            try {
                this.f3093c.execute(new C1024a0(this, collection));
            } catch (RejectedExecutionException e) {
                mo4123N("Unable to attach use cases.", e);
                this.f3096f.mo4656D();
            }
        }
    }

    /* renamed from: j0 */
    public final void mo4136j0(List<UseCase> list) {
        for (UseCase next : list) {
            Set<String> set = this.f3087L0;
            if (!set.contains(next.mo4957i() + next.hashCode())) {
                Set<String> set2 = this.f3087L0;
                set2.add(next.mo4957i() + next.hashCode());
                next.mo4944B();
            }
        }
    }

    /* renamed from: k */
    public void mo4137k(@C0359n0 Collection<UseCase> collection) {
        if (!collection.isEmpty()) {
            mo4138k0(new ArrayList(collection));
            this.f3093c.execute(new C1215n0(this, collection));
        }
    }

    /* renamed from: k0 */
    public final void mo4138k0(List<UseCase> list) {
        for (UseCase next : list) {
            Set<String> set = this.f3087L0;
            if (set.contains(next.mo4957i() + next.hashCode())) {
                next.mo4781C();
                Set<String> set2 = this.f3087L0;
                set2.remove(next.mo4957i() + next.hashCode());
            }
        }
    }

    @C0359n0
    /* renamed from: l */
    public C1496q mo4139l() {
        return this.f3098v;
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: l0 */
    public void mo4140l0(boolean z) {
        if (!z) {
            this.f3097g.mo4173d();
        }
        this.f3097g.mo4170a();
        if (!this.f3081F0.mo4165b() || !this.f3082G0.mo5523e(this)) {
            mo4122M("No cameras available. Waiting for available camera before opening camera.");
            mo4154u0(InternalState.PENDING_OPEN);
            return;
        }
        mo4154u0(InternalState.OPENING);
        mo4122M("Opening camera.");
        try {
            this.f3092b.mo4412f(this.f3098v.mo4592b(), this.f3093c, mo4121L());
        } catch (CameraAccessExceptionCompat e) {
            mo4122M("Unable to open camera due to " + e.getMessage());
            if (e.mo4283d() == 10001) {
                mo4154u0(InternalState.INITIALIZED);
            }
        } catch (SecurityException e2) {
            mo4122M("Unable to open camera due to " + e2.getMessage());
            mo4154u0(InternalState.REOPENING);
            this.f3097g.mo4174e();
        }
    }

    @C0359n0
    /* renamed from: m */
    public C1432a1<CameraInternal.State> mo4141m() {
        return this.f3095e;
    }

    /* renamed from: m0 */
    public void mo4142m0() {
        boolean z;
        if (this.f3094d == InternalState.OPENED) {
            z = true;
        } else {
            z = false;
        }
        C18001r.m81777n(z);
        SessionConfig.C1427e e = this.f3091a.mo5262e();
        if (!e.mo5174c()) {
            mo4122M("Unable to create capture session due to conflicting configurations");
        } else {
            C1548f.m6473b(this.f3101y.mo4194s(e.mo5173b(), (CameraDevice) C18001r.m81775l(this.f3099w), this.f3086K0.mo4643a()), new C1012b(), this.f3093c);
        }
    }

    /* renamed from: n */
    public void mo4143n(@C0359n0 UseCase useCase) {
        C18001r.m81775l(useCase);
        this.f3093c.execute(new C1271y(this, useCase));
    }

    /* renamed from: n0 */
    public final void mo4144n0() {
        int i = C1013c.f3115a[this.f3094d.ordinal()];
        boolean z = false;
        if (i == 1) {
            mo4140l0(false);
        } else if (i != 2) {
            mo4122M("open() ignored due to being in state: " + this.f3094d);
        } else {
            mo4154u0(InternalState.REOPENING);
            if (!mo4128T() && this.f3100x == 0) {
                if (this.f3099w != null) {
                    z = true;
                }
                C18001r.m81778o(z, "Camera Device should be open if session close is not complete");
                mo4154u0(InternalState.OPENED);
                mo4142m0();
            }
        }
    }

    /* renamed from: o0 */
    public void mo4145o0(@C0359n0 SessionConfig sessionConfig) {
        ScheduledExecutorService e = C1525a.m6441e();
        List<SessionConfig.C1425c> c = sessionConfig.mo5145c();
        if (!c.isEmpty()) {
            mo4123N("Posting surface closed", new Throwable());
            e.execute(new C1192i0(c.get(0), sessionConfig));
        }
    }

    public void open() {
        this.f3093c.execute(new C1208m0(this));
    }

    /* renamed from: p0 */
    public final C32487a<Void> mo4147p0() {
        C32487a<Void> R = mo4126R();
        boolean z = false;
        switch (C1013c.f3115a[this.f3094d.ordinal()]) {
            case 1:
            case 6:
                if (this.f3099w == null) {
                    z = true;
                }
                C18001r.m81777n(z);
                mo4154u0(InternalState.RELEASING);
                C18001r.m81777n(mo4128T());
                mo4125P();
                break;
            case 2:
            case 4:
            case 5:
            case 7:
                boolean a = this.f3097g.mo4170a();
                mo4154u0(InternalState.RELEASING);
                if (a) {
                    C18001r.m81777n(mo4128T());
                    mo4125P();
                    break;
                }
                break;
            case 3:
                mo4154u0(InternalState.RELEASING);
                mo4118I(false);
                break;
            default:
                mo4122M("release() ignored due to being in state: " + this.f3094d);
                break;
        }
        return R;
    }

    /* renamed from: q0 */
    public void m4404X(@C0359n0 CaptureSession captureSession, @C0359n0 DeferrableSurface deferrableSurface, @C0359n0 Runnable runnable) {
        this.f3083H0.remove(captureSession);
        C32487a<Void> r0 = mo4149r0(captureSession, false);
        deferrableSurface.mo5136c();
        C1548f.m6485n(Arrays.asList(new C32487a[]{r0, deferrableSurface.mo5139f()})).mo5489q(runnable, C1525a.m6437a());
    }

    /* renamed from: r0 */
    public C32487a<Void> mo4149r0(@C0359n0 CaptureSession captureSession, boolean z) {
        captureSession.mo4184e();
        C32487a<Void> u = captureSession.mo4196u(z);
        mo4122M("Releasing session in state " + this.f3094d.name());
        this.f3080E0.put(captureSession, u);
        C1548f.m6473b(u, new C1011a(captureSession), C1525a.m6437a());
        return u;
    }

    @C0359n0
    public C32487a<Void> release() {
        return CallbackToFutureAdapter.m74987a(new C1183g0(this));
    }

    /* renamed from: s0 */
    public final void mo4151s0() {
        if (this.f3084I0 != null) {
            C1483n1 n1Var = this.f3091a;
            n1Var.mo5270o(this.f3084I0.mo4455d() + this.f3084I0.hashCode());
            C1483n1 n1Var2 = this.f3091a;
            n1Var2.mo5271p(this.f3084I0.mo4455d() + this.f3084I0.hashCode());
            this.f3084I0.mo4453b();
            this.f3084I0 = null;
        }
    }

    /* renamed from: t0 */
    public void mo4152t0(boolean z) {
        boolean z2;
        if (this.f3101y != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        C18001r.m81777n(z2);
        mo4122M("Resetting Capture Session");
        CaptureSession captureSession = this.f3101y;
        SessionConfig i = captureSession.mo4188i();
        List<C1583y> h = captureSession.mo4187h();
        CaptureSession captureSession2 = new CaptureSession();
        this.f3101y = captureSession2;
        captureSession2.mo4197v(i);
        this.f3101y.mo4191l(h);
        mo4149r0(captureSession, z);
    }

    @C0359n0
    public String toString() {
        return String.format(Locale.US, "Camera@%x[id=%s]", new Object[]{Integer.valueOf(hashCode()), this.f3098v.mo4592b()});
    }

    /* renamed from: u0 */
    public void mo4154u0(@C0359n0 InternalState internalState) {
        CameraInternal.State state;
        mo4122M("Transitioning camera internal state: " + this.f3094d + " --> " + internalState);
        this.f3094d = internalState;
        switch (C1013c.f3115a[internalState.ordinal()]) {
            case 1:
                state = CameraInternal.State.CLOSED;
                break;
            case 2:
                state = CameraInternal.State.CLOSING;
                break;
            case 3:
                state = CameraInternal.State.OPEN;
                break;
            case 4:
            case 5:
                state = CameraInternal.State.OPENING;
                break;
            case 6:
                state = CameraInternal.State.PENDING_OPEN;
                break;
            case 7:
                state = CameraInternal.State.RELEASING;
                break;
            case 8:
                state = CameraInternal.State.RELEASED;
                break;
            default:
                throw new IllegalStateException("Unknown state: " + internalState);
        }
        this.f3082G0.mo5520b(this, state);
        this.f3095e.mo5531f(state);
    }

    /* renamed from: v0 */
    public void mo4155v0(@C0359n0 List<C1583y> list) {
        ArrayList arrayList = new ArrayList();
        for (C1583y next : list) {
            C1583y.C1584a k = C1583y.C1584a.m6553k(next);
            if (!next.mo5549d().isEmpty() || !next.mo5552g() || mo4116G(k)) {
                arrayList.add(k.mo5560h());
            }
        }
        mo4122M("Issue capture request");
        this.f3101y.mo4191l(arrayList);
    }

    /* renamed from: w0 */
    public final void mo4156w0(@C0359n0 Collection<UseCase> collection) {
        boolean isEmpty = this.f3091a.mo5263f().isEmpty();
        ArrayList arrayList = new ArrayList();
        for (UseCase next : collection) {
            C1483n1 n1Var = this.f3091a;
            if (!n1Var.mo5266i(next.mo4957i() + next.hashCode())) {
                try {
                    C1483n1 n1Var2 = this.f3091a;
                    n1Var2.mo5269n(next.mo4957i() + next.hashCode(), next.mo4959k());
                    arrayList.add(next);
                } catch (NullPointerException unused) {
                    mo4122M("Failed to attach a detached use case");
                }
            }
        }
        if (!arrayList.isEmpty()) {
            mo4122M("Use cases [" + TextUtils.join(", ", arrayList) + "] now ATTACHED");
            if (isEmpty) {
                this.f3096f.mo4687j0(true);
                this.f3096f.mo4672T();
            }
            mo4115F();
            mo4159z0();
            mo4152t0(false);
            if (this.f3094d == InternalState.OPENED) {
                mo4142m0();
            } else {
                mo4144n0();
            }
            mo4158y0(arrayList);
        }
    }

    /* renamed from: x0 */
    public final void m4405Y(@C0359n0 Collection<UseCase> collection) {
        ArrayList arrayList = new ArrayList();
        for (UseCase next : collection) {
            C1483n1 n1Var = this.f3091a;
            if (n1Var.mo5266i(next.mo4957i() + next.hashCode())) {
                C1483n1 n1Var2 = this.f3091a;
                n1Var2.mo5267l(next.mo4957i() + next.hashCode());
                arrayList.add(next);
            }
        }
        if (!arrayList.isEmpty()) {
            mo4122M("Use cases [" + TextUtils.join(", ", arrayList) + "] now DETACHED for camera");
            mo4117H(arrayList);
            mo4115F();
            if (this.f3091a.mo5263f().isEmpty()) {
                this.f3096f.mo4656D();
                mo4152t0(false);
                this.f3096f.mo4687j0(false);
                this.f3101y = new CaptureSession();
                mo4119J();
                return;
            }
            mo4159z0();
            mo4152t0(false);
            if (this.f3094d == InternalState.OPENED) {
                mo4142m0();
            }
        }
    }

    /* renamed from: y0 */
    public final void mo4158y0(Collection<UseCase> collection) {
        for (UseCase next : collection) {
            if (next instanceof C1677r2) {
                Size b = next.mo4951b();
                if (b != null) {
                    this.f3096f.mo4691l0(new Rational(b.getWidth(), b.getHeight()));
                    return;
                }
                return;
            }
        }
    }

    /* renamed from: z0 */
    public void mo4159z0() {
        SessionConfig.C1427e c = this.f3091a.mo5260c();
        if (c.mo5174c()) {
            c.mo5172a(this.f3102z);
            this.f3101y.mo4197v(c.mo5173b());
            return;
        }
        this.f3101y.mo4197v(this.f3102z);
    }
}
