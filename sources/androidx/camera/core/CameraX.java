package androidx.camera.core;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import androidx.annotation.C0323b0;
import androidx.annotation.C0353k0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.annotation.experimental.C0335b;
import androidx.camera.core.C1349a0;
import androidx.camera.core.C1727y2;
import androidx.camera.core.impl.C1473l;
import androidx.camera.core.impl.C1477m;
import androidx.camera.core.impl.C1504t;
import androidx.camera.core.impl.C1579w;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.CameraValidator;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.impl.utils.executor.C1525a;
import androidx.camera.core.impl.utils.futures.C1544c;
import androidx.camera.core.impl.utils.futures.C1545d;
import androidx.camera.core.impl.utils.futures.C1548f;
import androidx.camera.core.internal.compat.quirk.C1599a;
import androidx.camera.core.internal.compat.quirk.C1603e;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.p027os.C17800k;
import androidx.core.util.C18001r;
import com.google.common.util.concurrent.C32487a;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@C0353k0
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class CameraX {

    /* renamed from: m */
    public static final String f3692m = "CameraX";

    /* renamed from: n */
    public static final String f3693n = "retry_token";

    /* renamed from: o */
    public static final long f3694o = 3000;

    /* renamed from: p */
    public static final long f3695p = 500;

    /* renamed from: q */
    public static final Object f3696q = new Object();
    @C0323b0("INSTANCE_LOCK")

    /* renamed from: r */
    public static CameraX f3697r;
    @C0323b0("INSTANCE_LOCK")

    /* renamed from: s */
    public static C1349a0.C1351b f3698s;
    @C0323b0("INSTANCE_LOCK")

    /* renamed from: t */
    public static C32487a<Void> f3699t = C1548f.m6477f(new IllegalStateException("CameraX is not initialized."));
    @C0323b0("INSTANCE_LOCK")

    /* renamed from: u */
    public static C32487a<Void> f3700u = C1548f.m6479h(null);

    /* renamed from: a */
    public final C1504t f3701a = new C1504t();

    /* renamed from: b */
    public final Object f3702b = new Object();

    /* renamed from: c */
    public final C1349a0 f3703c;

    /* renamed from: d */
    public final Executor f3704d;

    /* renamed from: e */
    public final Handler f3705e;
    @C0363p0

    /* renamed from: f */
    public final HandlerThread f3706f;

    /* renamed from: g */
    public C1477m f3707g;

    /* renamed from: h */
    public C1473l f3708h;

    /* renamed from: i */
    public UseCaseConfigFactory f3709i;

    /* renamed from: j */
    public Context f3710j;
    @C0323b0("mInitializeLock")

    /* renamed from: k */
    public InternalInitState f3711k = InternalInitState.UNINITIALIZED;
    @C0323b0("mInitializeLock")

    /* renamed from: l */
    public C32487a<Void> f3712l = C1548f.m6479h(null);

    public enum InternalInitState {
        UNINITIALIZED,
        INITIALIZING,
        INITIALIZED,
        SHUTDOWN
    }

    /* renamed from: androidx.camera.core.CameraX$a */
    public class C1300a implements C1544c<Void> {

        /* renamed from: a */
        public final /* synthetic */ CallbackToFutureAdapter.C16559a f3718a;

        /* renamed from: b */
        public final /* synthetic */ CameraX f3719b;

        public C1300a(CallbackToFutureAdapter.C16559a aVar, CameraX cameraX) {
            this.f3718a = aVar;
            this.f3719b = cameraX;
        }

        /* renamed from: b */
        public void mo4161b(Throwable th) {
            C1417i2.m5925o("CameraX", "CameraX initialize() failed", th);
            synchronized (CameraX.f3696q) {
                if (CameraX.f3697r == this.f3719b) {
                    CameraX.m5349V();
                }
            }
            this.f3718a.mo48128f(th);
        }

        /* renamed from: c */
        public void mo4160a(@C0363p0 Void voidR) {
            this.f3718a.mo48125c(null);
        }
    }

    /* renamed from: androidx.camera.core.CameraX$b */
    public static /* synthetic */ class C1301b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f3720a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                androidx.camera.core.CameraX$InternalInitState[] r0 = androidx.camera.core.CameraX.InternalInitState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f3720a = r0
                androidx.camera.core.CameraX$InternalInitState r1 = androidx.camera.core.CameraX.InternalInitState.UNINITIALIZED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f3720a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.camera.core.CameraX$InternalInitState r1 = androidx.camera.core.CameraX.InternalInitState.INITIALIZING     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f3720a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.camera.core.CameraX$InternalInitState r1 = androidx.camera.core.CameraX.InternalInitState.INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f3720a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.camera.core.CameraX$InternalInitState r1 = androidx.camera.core.CameraX.InternalInitState.SHUTDOWN     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.CameraX.C1301b.<clinit>():void");
        }
    }

    public CameraX(@C0359n0 C1349a0 a0Var) {
        this.f3703c = (C1349a0) C18001r.m81775l(a0Var);
        Executor a0 = a0Var.mo4980a0((Executor) null);
        Handler e0 = a0Var.mo4984e0((Handler) null);
        this.f3704d = a0 == null ? new C1629k() : a0;
        if (e0 == null) {
            HandlerThread handlerThread = new HandlerThread("CameraX-scheduler", 10);
            this.f3706f = handlerThread;
            handlerThread.start();
            this.f3705e = C17800k.m81188a(handlerThread.getLooper());
            return;
        }
        this.f3706f = null;
        this.f3705e = e0;
    }

    @RestrictTo({RestrictTo.Scope.TESTS})
    @C0359n0
    /* renamed from: C */
    public static C32487a<Void> m5333C(@C0359n0 Context context, @C0359n0 C1349a0 a0Var) {
        C32487a<Void> aVar;
        synchronized (f3696q) {
            C18001r.m81775l(context);
            m5365o(new C1710w(a0Var));
            m5334D(context);
            aVar = f3699t;
        }
        return aVar;
    }

    @C0323b0("INSTANCE_LOCK")
    /* renamed from: D */
    public static void m5334D(@C0359n0 Context context) {
        boolean z;
        C18001r.m81775l(context);
        if (f3697r == null) {
            z = true;
        } else {
            z = false;
        }
        C18001r.m81778o(z, "CameraX already initialized.");
        C18001r.m81775l(f3698s);
        CameraX cameraX = new CameraX(f3698s.getCameraXConfig());
        f3697r = cameraX;
        f3699t = CallbackToFutureAdapter.m74987a(new C1715x(cameraX, context));
    }

    @RestrictTo({RestrictTo.Scope.TESTS})
    /* renamed from: E */
    public static boolean m5335E() {
        boolean z;
        synchronized (f3696q) {
            CameraX cameraX = f3697r;
            if (cameraX == null || !cameraX.mo4772F()) {
                z = false;
            } else {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: G */
    public static /* synthetic */ C1349a0 m5336G(C1349a0 a0Var) {
        return a0Var;
    }

    /* renamed from: H */
    public static /* synthetic */ CameraX m5337H(CameraX cameraX, Void voidR) {
        return cameraX;
    }

    /* access modifiers changed from: private */
    /* renamed from: I */
    public /* synthetic */ void m5338I(Executor executor, long j, CallbackToFutureAdapter.C16559a aVar) {
        mo4770A(executor, j, this.f3710j, aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: J */
    public /* synthetic */ void m5339J(Context context, Executor executor, CallbackToFutureAdapter.C16559a aVar, long j) {
        try {
            Application p = m5366p(context);
            this.f3710j = p;
            if (p == null) {
                this.f3710j = context.getApplicationContext();
            }
            C1477m.C1478a b0 = this.f3703c.mo4981b0((C1477m.C1478a) null);
            if (b0 != null) {
                C1579w a = C1579w.m6535a(this.f3704d, this.f3705e);
                C1647n Z = this.f3703c.mo4979Z((C1647n) null);
                this.f3707g = b0.mo4084a(this.f3710j, a, Z);
                C1473l.C1474a c0 = this.f3703c.mo4982c0((C1473l.C1474a) null);
                if (c0 != null) {
                    this.f3708h = c0.mo4085a(this.f3710j, this.f3707g.mo4716a(), this.f3707g.mo4718c());
                    UseCaseConfigFactory.C1428a f0 = this.f3703c.mo4985f0((UseCaseConfigFactory.C1428a) null);
                    if (f0 != null) {
                        this.f3709i = f0.mo4086a(this.f3710j);
                        if (executor instanceof C1629k) {
                            ((C1629k) executor).mo5613c(this.f3707g);
                        }
                        this.f3701a.mo5323g(this.f3707g);
                        if (C1599a.m6623a(C1603e.class) != null) {
                            CameraValidator.m5969a(this.f3710j, this.f3701a, Z);
                        }
                        mo4773S();
                        aVar.mo48125c(null);
                        return;
                    }
                    throw new InitializationException((Throwable) new IllegalArgumentException("Invalid app configuration provided. Missing UseCaseConfigFactory."));
                }
                throw new InitializationException((Throwable) new IllegalArgumentException("Invalid app configuration provided. Missing CameraDeviceSurfaceManager."));
            }
            throw new InitializationException((Throwable) new IllegalArgumentException("Invalid app configuration provided. Missing CameraFactory."));
        } catch (InitializationException | CameraValidator.CameraIdListIncorrectException | RuntimeException e) {
            if (SystemClock.elapsedRealtime() - j < 2500) {
                C1417i2.m5925o("CameraX", "Retry init. Start time " + j + " current time " + SystemClock.elapsedRealtime(), e);
                C17800k.m81191d(this.f3705e, new C1674r(this, executor, j, aVar), f3693n, 500);
                return;
            }
            mo4773S();
            if (e instanceof CameraValidator.CameraIdListIncorrectException) {
                C1417i2.m5913c("CameraX", "The device might underreport the amount of the cameras. Finish the initialize task since we are already reaching the maximum number of retries.");
                aVar.mo48125c(null);
            } else if (e instanceof InitializationException) {
                aVar.mo48128f(e);
            } else {
                aVar.mo48128f(new InitializationException(e));
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: K */
    public /* synthetic */ Object m5340K(Context context, CallbackToFutureAdapter.C16559a aVar) throws Exception {
        mo4770A(this.f3704d, SystemClock.elapsedRealtime(), context, aVar);
        return "CameraX initInternal";
    }

    /* renamed from: L */
    public static /* synthetic */ C1349a0 m5341L(C1349a0 a0Var) {
        return a0Var;
    }

    /* renamed from: N */
    public static /* synthetic */ Object m5343N(CameraX cameraX, Context context, CallbackToFutureAdapter.C16559a aVar) throws Exception {
        synchronized (f3696q) {
            C1548f.m6473b(C1545d.m6463b(f3700u).mo5486f(new C1688t(cameraX, context), C1525a.m6437a()), new C1300a(aVar, cameraX), C1525a.m6437a());
        }
        return "CameraX-initialize";
    }

    /* access modifiers changed from: private */
    /* renamed from: O */
    public /* synthetic */ void m5344O(CallbackToFutureAdapter.C16559a aVar) {
        if (this.f3706f != null) {
            Executor executor = this.f3704d;
            if (executor instanceof C1629k) {
                ((C1629k) executor).mo5612b();
            }
            this.f3706f.quit();
            aVar.mo48125c(null);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: P */
    public /* synthetic */ Object m5345P(CallbackToFutureAdapter.C16559a aVar) throws Exception {
        this.f3701a.mo5319c().mo5489q(new C1669q(this, aVar), this.f3704d);
        return "CameraX shutdownInternal";
    }

    /* renamed from: R */
    public static /* synthetic */ Object m5347R(CameraX cameraX, CallbackToFutureAdapter.C16559a aVar) throws Exception {
        synchronized (f3696q) {
            f3699t.mo5489q(new C1722y(cameraX, aVar), C1525a.m6437a());
        }
        return "CameraX shutdown";
    }

    @C0359n0
    /* renamed from: T */
    public static C32487a<Void> m5348T() {
        C32487a<Void> V;
        synchronized (f3696q) {
            f3698s = null;
            C1417i2.m5921k();
            V = m5349V();
        }
        return V;
    }

    @C0323b0("INSTANCE_LOCK")
    @C0359n0
    /* renamed from: V */
    public static C32487a<Void> m5349V() {
        CameraX cameraX = f3697r;
        if (cameraX == null) {
            return f3700u;
        }
        f3697r = null;
        C32487a<Void> a = CallbackToFutureAdapter.m74987a(new C1739z(cameraX));
        f3700u = a;
        return a;
    }

    @C0359n0
    /* renamed from: W */
    public static CameraX m5350W() {
        try {
            return m5370x().get(3000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            throw new IllegalStateException(e);
        }
    }

    @C0359n0
    /* renamed from: m */
    public static CameraX m5363m() {
        CameraX W = m5350W();
        C18001r.m81778o(W.mo4772F(), "Must call CameraX.initialize() first");
        return W;
    }

    /* renamed from: n */
    public static void m5364n(@C0359n0 C1349a0 a0Var) {
        synchronized (f3696q) {
            m5365o(new C1683s(a0Var));
        }
    }

    @C0323b0("INSTANCE_LOCK")
    /* renamed from: o */
    public static void m5365o(@C0359n0 C1349a0.C1351b bVar) {
        boolean z;
        C18001r.m81775l(bVar);
        if (f3698s == null) {
            z = true;
        } else {
            z = false;
        }
        C18001r.m81778o(z, "CameraX has already been configured. To use a different configuration, shutdown() must be called.");
        f3698s = bVar;
        Integer num = (Integer) bVar.getCameraXConfig().mo5131h(C1349a0.f3906B, null);
        if (num != null) {
            C1417i2.m5922l(num.intValue());
        }
    }

    @C0363p0
    /* renamed from: p */
    public static Application m5366p(@C0359n0 Context context) {
        for (Context applicationContext = context.getApplicationContext(); applicationContext instanceof ContextWrapper; applicationContext = ((ContextWrapper) applicationContext).getBaseContext()) {
            if (applicationContext instanceof Application) {
                return (Application) applicationContext;
            }
        }
        return null;
    }

    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: t */
    public static CameraInternal m5367t(@C0359n0 C1647n nVar) {
        return nVar.mo5635e(m5363m().mo4777s().mo5322f());
    }

    @C0363p0
    /* renamed from: u */
    public static C1349a0.C1351b m5368u(@C0359n0 Context context) {
        Application p = m5366p(context);
        if (p instanceof C1349a0.C1351b) {
            return (C1349a0.C1351b) p;
        }
        try {
            return (C1349a0.C1351b) Class.forName(context.getApplicationContext().getResources().getString(C1727y2.C1735h.androidx_camera_default_config_provider)).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Resources.NotFoundException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException e) {
            C1417i2.m5914d("CameraX", "Failed to retrieve default CameraXConfig.Provider from resources", e);
            return null;
        }
    }

    @C0359n0
    @Deprecated
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: v */
    public static Context m5369v() {
        return m5363m().f3710j;
    }

    @C0359n0
    /* renamed from: x */
    public static C32487a<CameraX> m5370x() {
        C32487a<CameraX> y;
        synchronized (f3696q) {
            y = m5371y();
        }
        return y;
    }

    @C0323b0("INSTANCE_LOCK")
    @C0359n0
    /* renamed from: y */
    public static C32487a<CameraX> m5371y() {
        CameraX cameraX = f3697r;
        if (cameraX == null) {
            return C1548f.m6477f(new IllegalStateException("Must call CameraX.initialize() first"));
        }
        return C1548f.m6486o(f3699t, new C1662p(cameraX), C1525a.m6437a());
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x001d */
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    @androidx.annotation.C0359n0
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.common.util.concurrent.C32487a<androidx.camera.core.CameraX> m5372z(@androidx.annotation.C0359n0 android.content.Context r4) {
        /*
            java.lang.String r0 = "Context must not be null."
            androidx.core.util.C18001r.m81776m(r4, r0)
            java.lang.Object r0 = f3696q
            monitor-enter(r0)
            androidx.camera.core.a0$b r1 = f3698s     // Catch:{ all -> 0x004a }
            if (r1 == 0) goto L_0x000e
            r1 = 1
            goto L_0x000f
        L_0x000e:
            r1 = 0
        L_0x000f:
            com.google.common.util.concurrent.a r2 = m5371y()     // Catch:{ all -> 0x004a }
            boolean r3 = r2.isDone()     // Catch:{ all -> 0x004a }
            if (r3 == 0) goto L_0x002b
            r2.get()     // Catch:{ InterruptedException -> 0x0022, ExecutionException -> 0x001d }
            goto L_0x002b
        L_0x001d:
            m5349V()     // Catch:{ all -> 0x004a }
            r2 = 0
            goto L_0x002b
        L_0x0022:
            r4 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x004a }
            java.lang.String r2 = "Unexpected thread interrupt. Should not be possible since future is already complete."
            r1.<init>(r2, r4)     // Catch:{ all -> 0x004a }
            throw r1     // Catch:{ all -> 0x004a }
        L_0x002b:
            if (r2 != 0) goto L_0x0048
            if (r1 != 0) goto L_0x0041
            androidx.camera.core.a0$b r1 = m5368u(r4)     // Catch:{ all -> 0x004a }
            if (r1 == 0) goto L_0x0039
            m5365o(r1)     // Catch:{ all -> 0x004a }
            goto L_0x0041
        L_0x0039:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch:{ all -> 0x004a }
            java.lang.String r1 = "CameraX is not configured properly. The most likely cause is you did not include a default implementation in your build such as 'camera-camera2'."
            r4.<init>(r1)     // Catch:{ all -> 0x004a }
            throw r4     // Catch:{ all -> 0x004a }
        L_0x0041:
            m5334D(r4)     // Catch:{ all -> 0x004a }
            com.google.common.util.concurrent.a r2 = m5371y()     // Catch:{ all -> 0x004a }
        L_0x0048:
            monitor-exit(r0)     // Catch:{ all -> 0x004a }
            return r2
        L_0x004a:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x004a }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.CameraX.m5372z(android.content.Context):com.google.common.util.concurrent.a");
    }

    @C0335b(markerClass = C1390e0.class)
    /* renamed from: A */
    public final void mo4770A(@C0359n0 Executor executor, long j, @C0359n0 Context context, @C0359n0 CallbackToFutureAdapter.C16559a<Void> aVar) {
        executor.execute(new C1700u(this, context, executor, aVar, j));
    }

    /* renamed from: B */
    public final C32487a<Void> mo4771B(@C0359n0 Context context) {
        boolean z;
        C32487a<Void> a;
        synchronized (this.f3702b) {
            if (this.f3711k == InternalInitState.UNINITIALIZED) {
                z = true;
            } else {
                z = false;
            }
            C18001r.m81778o(z, "CameraX.initInternal() should only be called once per instance");
            this.f3711k = InternalInitState.INITIALIZING;
            a = CallbackToFutureAdapter.m74987a(new C1705v(this, context));
        }
        return a;
    }

    /* renamed from: F */
    public final boolean mo4772F() {
        boolean z;
        synchronized (this.f3702b) {
            if (this.f3711k == InternalInitState.INITIALIZED) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: S */
    public final void mo4773S() {
        synchronized (this.f3702b) {
            this.f3711k = InternalInitState.INITIALIZED;
        }
    }

    @C0359n0
    /* renamed from: U */
    public final C32487a<Void> mo4774U() {
        synchronized (this.f3702b) {
            this.f3705e.removeCallbacksAndMessages(f3693n);
            int i = C1301b.f3720a[this.f3711k.ordinal()];
            if (i == 1) {
                this.f3711k = InternalInitState.SHUTDOWN;
                C32487a<Void> h = C1548f.m6479h(null);
                return h;
            } else if (i != 2) {
                if (i == 3) {
                    this.f3711k = InternalInitState.SHUTDOWN;
                    this.f3712l = CallbackToFutureAdapter.m74987a(new C1656o(this));
                }
                C32487a<Void> aVar = this.f3712l;
                return aVar;
            } else {
                throw new IllegalStateException("CameraX could not be shutdown when it is initializing.");
            }
        }
    }

    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: q */
    public C1473l mo4775q() {
        C1473l lVar = this.f3708h;
        if (lVar != null) {
            return lVar;
        }
        throw new IllegalStateException("CameraX not initialized yet.");
    }

    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: r */
    public C1477m mo4776r() {
        C1477m mVar = this.f3707g;
        if (mVar != null) {
            return mVar;
        }
        throw new IllegalStateException("CameraX not initialized yet.");
    }

    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: s */
    public C1504t mo4777s() {
        return this.f3701a;
    }

    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: w */
    public UseCaseConfigFactory mo4778w() {
        UseCaseConfigFactory useCaseConfigFactory = this.f3709i;
        if (useCaseConfigFactory != null) {
            return useCaseConfigFactory;
        }
        throw new IllegalStateException("CameraX not initialized yet.");
    }
}
