package androidx.camera.camera2.internal;

import android.graphics.Rect;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.util.ArrayMap;
import android.util.Rational;
import androidx.annotation.C0323b0;
import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.experimental.C0335b;
import androidx.camera.camera2.impl.C1004b;
import androidx.camera.camera2.internal.compat.C1073h;
import androidx.camera.camera2.internal.compat.workaround.C1156a;
import androidx.camera.camera2.internal.compat.workaround.C1157b;
import androidx.camera.camera2.interop.C1288i;
import androidx.camera.camera2.interop.C1296o;
import androidx.camera.camera2.interop.C1298p;
import androidx.camera.core.C1410h0;
import androidx.camera.core.C1417i2;
import androidx.camera.core.C1650n0;
import androidx.camera.core.C1657o0;
import androidx.camera.core.CameraControl;
import androidx.camera.core.impl.C1448f;
import androidx.camera.core.impl.C1450f1;
import androidx.camera.core.impl.C1456h;
import androidx.camera.core.impl.C1583y;
import androidx.camera.core.impl.CameraCaptureFailure;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.utils.executor.C1525a;
import androidx.camera.core.impl.utils.futures.C1548f;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.C18001r;
import com.google.common.util.concurrent.C32487a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;

@C0335b(markerClass = C1298p.class)
/* renamed from: androidx.camera.camera2.internal.v */
public class C1254v implements CameraControlInternal {

    /* renamed from: t */
    public static final String f3579t = "Camera2CameraControlImp";
    @C0344h1

    /* renamed from: b */
    public final C1256b f3580b;

    /* renamed from: c */
    public final Executor f3581c;

    /* renamed from: d */
    public final Object f3582d;

    /* renamed from: e */
    public final C1073h f3583e;

    /* renamed from: f */
    public final CameraControlInternal.C1420b f3584f;

    /* renamed from: g */
    public final SessionConfig.C1424b f3585g;

    /* renamed from: h */
    public volatile Rational f3586h;

    /* renamed from: i */
    public final C1036b2 f3587i;

    /* renamed from: j */
    public final C1029a3 f3588j;

    /* renamed from: k */
    public final C1260v2 f3589k;

    /* renamed from: l */
    public final C1236r1 f3590l;

    /* renamed from: m */
    public final C1288i f3591m;

    /* renamed from: n */
    public final C1156a f3592n;
    @C0323b0("mLock")

    /* renamed from: o */
    public int f3593o;

    /* renamed from: p */
    public volatile boolean f3594p;

    /* renamed from: q */
    public volatile int f3595q;

    /* renamed from: r */
    public final C1157b f3596r;

    /* renamed from: s */
    public final C1255a f3597s;

    /* renamed from: androidx.camera.camera2.internal.v$a */
    public static final class C1255a extends C1448f {

        /* renamed from: a */
        public Set<C1448f> f3598a = new HashSet();

        /* renamed from: b */
        public Map<C1448f, Executor> f3599b = new ArrayMap();

        /* renamed from: a */
        public void mo4262a() {
            for (C1448f next : this.f3598a) {
                try {
                    this.f3599b.get(next).execute(new C1246t(next));
                } catch (RejectedExecutionException e) {
                    C1417i2.m5914d(C1254v.f3579t, "Executor rejected to invoke onCaptureCancelled.", e);
                }
            }
        }

        /* renamed from: b */
        public void mo4263b(@C0359n0 C1456h hVar) {
            for (C1448f next : this.f3598a) {
                try {
                    this.f3599b.get(next).execute(new C1250u(next, hVar));
                } catch (RejectedExecutionException e) {
                    C1417i2.m5914d(C1254v.f3579t, "Executor rejected to invoke onCaptureCompleted.", e);
                }
            }
        }

        /* renamed from: c */
        public void mo4264c(@C0359n0 CameraCaptureFailure cameraCaptureFailure) {
            for (C1448f next : this.f3598a) {
                try {
                    this.f3599b.get(next).execute(new C1241s(next, cameraCaptureFailure));
                } catch (RejectedExecutionException e) {
                    C1417i2.m5914d(C1254v.f3579t, "Executor rejected to invoke onCaptureFailed.", e);
                }
            }
        }

        /* renamed from: g */
        public void mo4699g(@C0359n0 Executor executor, @C0359n0 C1448f fVar) {
            this.f3598a.add(fVar);
            this.f3599b.put(fVar, executor);
        }

        /* renamed from: k */
        public void mo4700k(@C0359n0 C1448f fVar) {
            this.f3598a.remove(fVar);
            this.f3599b.remove(fVar);
        }
    }

    /* renamed from: androidx.camera.camera2.internal.v$b */
    public static final class C1256b extends CameraCaptureSession.CaptureCallback {

        /* renamed from: a */
        public final Set<C1257c> f3600a = new HashSet();

        /* renamed from: b */
        public final Executor f3601b;

        public C1256b(@C0359n0 Executor executor) {
            this.f3601b = executor;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public /* synthetic */ void m5231c(TotalCaptureResult totalCaptureResult) {
            HashSet hashSet = new HashSet();
            for (C1257c next : this.f3600a) {
                if (next.mo4229a(totalCaptureResult)) {
                    hashSet.add(next);
                }
            }
            if (!hashSet.isEmpty()) {
                this.f3600a.removeAll(hashSet);
            }
        }

        /* renamed from: b */
        public void mo4701b(@C0359n0 C1257c cVar) {
            this.f3600a.add(cVar);
        }

        /* renamed from: d */
        public void mo4702d(@C0359n0 C1257c cVar) {
            this.f3600a.remove(cVar);
        }

        public void onCaptureCompleted(@C0359n0 CameraCaptureSession cameraCaptureSession, @C0359n0 CaptureRequest captureRequest, @C0359n0 TotalCaptureResult totalCaptureResult) {
            this.f3601b.execute(new C1262w(this, totalCaptureResult));
        }
    }

    /* renamed from: androidx.camera.camera2.internal.v$c */
    public interface C1257c {
        /* renamed from: a */
        boolean mo4229a(@C0359n0 TotalCaptureResult totalCaptureResult);
    }

    @C0344h1
    public C1254v(@C0359n0 C1073h hVar, @C0359n0 ScheduledExecutorService scheduledExecutorService, @C0359n0 Executor executor, @C0359n0 CameraControlInternal.C1420b bVar) {
        this(hVar, scheduledExecutorService, executor, bVar, new C1450f1(new ArrayList()));
    }

    /* renamed from: W */
    public static /* synthetic */ void m5153W() {
    }

    /* access modifiers changed from: private */
    /* renamed from: X */
    public /* synthetic */ void m5154X(Executor executor, C1448f fVar) {
        this.f3597s.mo4699g(executor, fVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: Y */
    public /* synthetic */ void m5155Y(boolean z, boolean z2) {
        this.f3587i.mo4250j(z, z2);
    }

    /* renamed from: Z */
    public static /* synthetic */ void m5156Z() {
    }

    /* access modifiers changed from: private */
    /* renamed from: a0 */
    public /* synthetic */ void m5157a0() {
        mo4654B(this.f3591m.mo4750o());
    }

    /* access modifiers changed from: private */
    /* renamed from: b0 */
    public /* synthetic */ void m5158b0(C1448f fVar) {
        this.f3597s.mo4700k(fVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: d0 */
    public /* synthetic */ void m5160d0(CallbackToFutureAdapter.C16559a aVar) {
        this.f3587i.mo4247O(aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: e0 */
    public /* synthetic */ Object m5161e0(CallbackToFutureAdapter.C16559a aVar) throws Exception {
        this.f3581c.execute(new C1195j(this, aVar));
        return "triggerAePrecapture";
    }

    /* access modifiers changed from: private */
    /* renamed from: f0 */
    public /* synthetic */ void m5162f0(CallbackToFutureAdapter.C16559a aVar) {
        this.f3587i.mo4248P(aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: g0 */
    public /* synthetic */ Object m5163g0(CallbackToFutureAdapter.C16559a aVar) throws Exception {
        this.f3581c.execute(new C1199k(this, aVar));
        return "triggerAf";
    }

    /* renamed from: B */
    public void mo4654B(@C0359n0 C1257c cVar) {
        this.f3580b.mo4701b(cVar);
    }

    /* renamed from: C */
    public void mo4655C(@C0359n0 Executor executor, @C0359n0 C1448f fVar) {
        this.f3581c.execute(new C1214n(this, executor, fVar));
    }

    /* renamed from: D */
    public void mo4656D() {
        synchronized (this.f3582d) {
            int i = this.f3593o;
            if (i != 0) {
                this.f3593o = i - 1;
            } else {
                throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
            }
        }
    }

    /* renamed from: E */
    public void mo4657E(boolean z) {
        this.f3594p = z;
        if (!z) {
            C1583y.C1584a aVar = new C1583y.C1584a();
            aVar.mo5569s(mo4660H());
            aVar.mo5570t(true);
            C1004b.C1005a aVar2 = new C1004b.C1005a();
            aVar2.mo4096e(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(mo4666N(1)));
            aVar2.mo4096e(CaptureRequest.FLASH_MODE, 0);
            aVar.mo5557e(aVar2.mo4098g());
            m5159c0(Collections.singletonList(aVar.mo5560h()));
        }
        mo4697o0();
    }

    @C0359n0
    /* renamed from: F */
    public C1288i mo4658F() {
        return this.f3591m;
    }

    @C0359n0
    /* renamed from: G */
    public Rect mo4659G() {
        return this.f3588j.mo4222g();
    }

    /* renamed from: H */
    public int mo4660H() {
        return 1;
    }

    @C0359n0
    /* renamed from: I */
    public C1236r1 mo4661I() {
        return this.f3590l;
    }

    /* renamed from: J */
    public int mo4662J() {
        Integer num = (Integer) this.f3583e.mo4323a(CameraCharacteristics.CONTROL_MAX_REGIONS_AE);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    /* renamed from: K */
    public int mo4663K() {
        Integer num = (Integer) this.f3583e.mo4323a(CameraCharacteristics.CONTROL_MAX_REGIONS_AF);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    /* renamed from: L */
    public int mo4664L() {
        Integer num = (Integer) this.f3583e.mo4323a(CameraCharacteristics.CONTROL_MAX_REGIONS_AWB);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0070 A[LOOP:0: B:10:0x006a->B:12:0x0070, LOOP_END] */
    @androidx.annotation.C0344h1
    /* renamed from: M */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.camera.core.impl.Config mo4665M() {
        /*
            r7 = this;
            androidx.camera.camera2.impl.b$a r0 = new androidx.camera.camera2.impl.b$a
            r0.<init>()
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_MODE
            r2 = 1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r0.mo4096e(r1, r3)
            androidx.camera.camera2.internal.b2 r1 = r7.f3587i
            r1.mo4249i(r0)
            androidx.camera.camera2.internal.compat.workaround.a r1 = r7.f3592n
            r1.mo4440a(r0)
            androidx.camera.camera2.internal.a3 r1 = r7.f3588j
            r1.mo4221e(r0)
            boolean r1 = r7.f3594p
            r3 = 2
            if (r1 == 0) goto L_0x002d
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.FLASH_MODE
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.mo4096e(r1, r3)
            goto L_0x0033
        L_0x002d:
            int r1 = r7.f3595q
            if (r1 == 0) goto L_0x0037
            if (r1 == r2) goto L_0x0035
        L_0x0033:
            r1 = r2
            goto L_0x003d
        L_0x0035:
            r1 = 3
            goto L_0x003d
        L_0x0037:
            androidx.camera.camera2.internal.compat.workaround.b r1 = r7.f3596r
            int r1 = r1.mo4441a(r3)
        L_0x003d:
            android.hardware.camera2.CaptureRequest$Key r3 = android.hardware.camera2.CaptureRequest.CONTROL_AE_MODE
            int r1 = r7.mo4666N(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.mo4096e(r3, r1)
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_AWB_MODE
            int r2 = r7.mo4668P(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.mo4096e(r1, r2)
            androidx.camera.camera2.internal.r1 r1 = r7.f3590l
            r1.mo4636k(r0)
            androidx.camera.camera2.interop.i r1 = r7.f3591m
            androidx.camera.camera2.impl.b r1 = r1.mo4749n()
            java.util.Set r2 = r1.mo5129f()
            java.util.Iterator r2 = r2.iterator()
        L_0x006a:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0084
            java.lang.Object r3 = r2.next()
            androidx.camera.core.impl.Config$a r3 = (androidx.camera.core.impl.Config.C1421a) r3
            androidx.camera.core.impl.x0 r4 = r0.mo4099h()
            androidx.camera.core.impl.Config$OptionPriority r5 = androidx.camera.core.impl.Config.OptionPriority.ALWAYS_OVERRIDE
            java.lang.Object r6 = r1.mo5125b(r3)
            r4.mo5544q(r3, r5, r6)
            goto L_0x006a
        L_0x0084:
            androidx.camera.camera2.impl.b r0 = r0.mo4098g()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.internal.C1254v.mo4665M():androidx.camera.core.impl.Config");
    }

    /* renamed from: N */
    public final int mo4666N(int i) {
        int[] iArr = (int[]) this.f3583e.mo4323a(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        if (mo4674V(i, iArr)) {
            return i;
        }
        if (mo4674V(1, iArr)) {
            return 1;
        }
        return 0;
    }

    /* renamed from: O */
    public int mo4667O(int i) {
        int[] iArr = (int[]) this.f3583e.mo4323a(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        if (mo4674V(i, iArr)) {
            return i;
        }
        if (mo4674V(4, iArr)) {
            return 4;
        }
        if (mo4674V(1, iArr)) {
            return 1;
        }
        return 0;
    }

    /* renamed from: P */
    public final int mo4668P(int i) {
        int[] iArr = (int[]) this.f3583e.mo4323a(CameraCharacteristics.CONTROL_AWB_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        if (mo4674V(i, iArr)) {
            return i;
        }
        if (mo4674V(1, iArr)) {
            return 1;
        }
        return 0;
    }

    @C0359n0
    /* renamed from: Q */
    public C1260v2 mo4669Q() {
        return this.f3589k;
    }

    @C0344h1
    /* renamed from: R */
    public int mo4670R() {
        int i;
        synchronized (this.f3582d) {
            i = this.f3593o;
        }
        return i;
    }

    @C0359n0
    /* renamed from: S */
    public C1029a3 mo4671S() {
        return this.f3588j;
    }

    /* renamed from: T */
    public void mo4672T() {
        synchronized (this.f3582d) {
            this.f3593o++;
        }
    }

    /* renamed from: U */
    public final boolean mo4673U() {
        return mo4670R() > 0;
    }

    /* renamed from: V */
    public final boolean mo4674V(int i, int[] iArr) {
        for (int i2 : iArr) {
            if (i == i2) {
                return true;
            }
        }
        return false;
    }

    @C1410h0
    @C0359n0
    /* renamed from: a */
    public C32487a<Integer> mo4675a(int i) {
        if (!mo4673U()) {
            return C1548f.m6477f(new CameraControl.OperationCanceledException("Camera is not active."));
        }
        return this.f3590l.mo4637l(i);
    }

    @C0359n0
    /* renamed from: b */
    public C32487a<C1456h> mo4676b() {
        if (!mo4673U()) {
            return C1548f.m6477f(new CameraControl.OperationCanceledException("Camera is not active."));
        }
        return C1548f.m6481j(CallbackToFutureAdapter.m74987a(new C1226q(this)));
    }

    @C0359n0
    /* renamed from: c */
    public C32487a<Void> mo4677c(float f) {
        if (!mo4673U()) {
            return C1548f.m6477f(new CameraControl.OperationCanceledException("Camera is not active."));
        }
        return C1548f.m6481j(this.f3588j.mo4225p(f));
    }

    @C0359n0
    /* renamed from: d */
    public C32487a<Void> mo4678d() {
        if (!mo4673U()) {
            return C1548f.m6477f(new CameraControl.OperationCanceledException("Camera is not active."));
        }
        return C1548f.m6481j(this.f3587i.mo4251k());
    }

    @C0359n0
    /* renamed from: e */
    public C32487a<Void> mo4679e(float f) {
        if (!mo4673U()) {
            return C1548f.m6477f(new CameraControl.OperationCanceledException("Camera is not active."));
        }
        return C1548f.m6481j(this.f3588j.mo4226q(f));
    }

    @C0359n0
    /* renamed from: f */
    public Rect mo4680f() {
        return (Rect) C18001r.m81775l((Rect) this.f3583e.mo4323a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE));
    }

    /* renamed from: g */
    public void mo4681g(int i) {
        if (!mo4673U()) {
            C1417i2.m5924n(f3579t, "Camera is not active.");
            return;
        }
        this.f3595q = i;
        mo4695n0();
    }

    @C0359n0
    /* renamed from: h */
    public C32487a<Void> mo4682h(boolean z) {
        if (!mo4673U()) {
            return C1548f.m6477f(new CameraControl.OperationCanceledException("Camera is not active."));
        }
        return C1548f.m6481j(this.f3589k.mo4708c(z));
    }

    /* renamed from: h0 */
    public void mo4683h0(@C0359n0 C1257c cVar) {
        this.f3580b.mo4702d(cVar);
    }

    @C0359n0
    /* renamed from: i */
    public Config mo4684i() {
        return this.f3591m.mo4749n();
    }

    /* renamed from: i0 */
    public void mo4685i0(@C0359n0 C1448f fVar) {
        this.f3581c.execute(new C1182g(this, fVar));
    }

    @C0359n0
    /* renamed from: j */
    public C32487a<C1657o0> mo4686j(@C0359n0 C1650n0 n0Var) {
        if (!mo4673U()) {
            return C1548f.m6477f(new CameraControl.OperationCanceledException("Camera is not active."));
        }
        return C1548f.m6481j(this.f3587i.mo4245M(n0Var, this.f3586h));
    }

    /* renamed from: j0 */
    public void mo4687j0(boolean z) {
        this.f3587i.mo4242J(z);
        this.f3588j.mo4224o(z);
        this.f3589k.mo4711h(z);
        this.f3590l.mo4635j(z);
        this.f3591m.mo4752y(z);
    }

    /* renamed from: k */
    public void mo4688k(@C0359n0 Config config) {
        this.f3591m.mo4745i(C1296o.C1297a.m5319f(config).mo4098g()).mo5489q(new C1187h(), C1525a.m6437a());
    }

    /* renamed from: k0 */
    public void mo4689k0(@C0359n0 CaptureRequest.Builder builder) {
        this.f3587i.mo4243K(builder);
    }

    @C0359n0
    /* renamed from: l */
    public C32487a<C1456h> mo4690l() {
        if (!mo4673U()) {
            return C1548f.m6477f(new CameraControl.OperationCanceledException("Camera is not active."));
        }
        return C1548f.m6481j(CallbackToFutureAdapter.m74987a(new C1232r(this)));
    }

    /* renamed from: l0 */
    public void mo4691l0(@C0363p0 Rational rational) {
        this.f3586h = rational;
    }

    /* renamed from: m */
    public void mo4692m(boolean z, boolean z2) {
        if (!mo4673U()) {
            C1417i2.m5924n(f3579t, "Camera is not active.");
        } else {
            this.f3581c.execute(new C1191i(this, z, z2));
        }
    }

    /* renamed from: m0 */
    public void m5159c0(List<C1583y> list) {
        this.f3584f.mo4168a(list);
    }

    /* renamed from: n */
    public int mo4694n() {
        return this.f3595q;
    }

    /* renamed from: n0 */
    public void mo4695n0() {
        this.f3581c.execute(new C1203l(this));
    }

    /* renamed from: o */
    public void mo4696o() {
        this.f3591m.mo4747k().mo5489q(new C1207m(), C1525a.m6437a());
    }

    /* renamed from: o0 */
    public void mo4697o0() {
        this.f3585g.mo5170s(mo4665M());
        Object e0 = this.f3591m.mo4749n().mo4089e0((Object) null);
        if (e0 != null && (e0 instanceof Integer)) {
            this.f3585g.mo5165m(C1288i.f3669i, (Integer) e0);
        }
        this.f3584f.mo4169b(this.f3585g.mo5166n());
    }

    /* renamed from: p */
    public void mo4698p(@C0359n0 List<C1583y> list) {
        if (!mo4673U()) {
            C1417i2.m5924n(f3579t, "Camera is not active.");
        } else {
            this.f3581c.execute(new C1218o(this, list));
        }
    }

    public C1254v(@C0359n0 C1073h hVar, @C0359n0 ScheduledExecutorService scheduledExecutorService, @C0359n0 Executor executor, @C0359n0 CameraControlInternal.C1420b bVar, @C0359n0 C1450f1 f1Var) {
        this.f3582d = new Object();
        SessionConfig.C1424b bVar2 = new SessionConfig.C1424b();
        this.f3585g = bVar2;
        this.f3586h = null;
        this.f3593o = 0;
        this.f3594p = false;
        this.f3595q = 2;
        this.f3596r = new C1157b();
        C1255a aVar = new C1255a();
        this.f3597s = aVar;
        this.f3583e = hVar;
        this.f3584f = bVar;
        this.f3581c = executor;
        C1256b bVar3 = new C1256b(executor);
        this.f3580b = bVar3;
        bVar2.mo5171t(mo4660H());
        bVar2.mo5162j(C1184g1.m4952d(bVar3));
        bVar2.mo5162j(aVar);
        this.f3590l = new C1236r1(this, hVar, executor);
        this.f3587i = new C1036b2(this, scheduledExecutorService, executor);
        this.f3588j = new C1029a3(this, hVar, executor);
        this.f3589k = new C1260v2(this, hVar, executor);
        this.f3592n = new C1156a(f1Var);
        this.f3591m = new C1288i(this, executor);
        executor.execute(new C1222p(this));
        mo4695n0();
    }
}
