package androidx.camera.camera2.internal;

import android.graphics.PointF;
import android.graphics.Rect;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import android.util.Rational;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.camera.camera2.impl.C1004b;
import androidx.camera.camera2.internal.C1254v;
import androidx.camera.core.C1645m2;
import androidx.camera.core.C1650n0;
import androidx.camera.core.C1657o0;
import androidx.camera.core.CameraControl;
import androidx.camera.core.impl.C1448f;
import androidx.camera.core.impl.C1456h;
import androidx.camera.core.impl.C1583y;
import androidx.camera.core.impl.CameraCaptureFailure;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.google.common.util.concurrent.C32487a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: androidx.camera.camera2.internal.b2 */
public class C1036b2 {

    /* renamed from: u */
    public static final String f3181u = "FocusMeteringControl";

    /* renamed from: a */
    public final C1254v f3182a;

    /* renamed from: b */
    public final Executor f3183b;

    /* renamed from: c */
    public final ScheduledExecutorService f3184c;

    /* renamed from: d */
    public volatile boolean f3185d = false;

    /* renamed from: e */
    public boolean f3186e = false;
    @C0359n0

    /* renamed from: f */
    public Integer f3187f = 0;

    /* renamed from: g */
    public ScheduledFuture<?> f3188g;

    /* renamed from: h */
    public long f3189h = 0;

    /* renamed from: i */
    public boolean f3190i = false;

    /* renamed from: j */
    public boolean f3191j = false;

    /* renamed from: k */
    public C1254v.C1257c f3192k = null;

    /* renamed from: l */
    public C1254v.C1257c f3193l = null;

    /* renamed from: m */
    public MeteringRectangle[] f3194m = new MeteringRectangle[0];

    /* renamed from: n */
    public MeteringRectangle[] f3195n = new MeteringRectangle[0];

    /* renamed from: o */
    public MeteringRectangle[] f3196o = new MeteringRectangle[0];

    /* renamed from: p */
    public MeteringRectangle[] f3197p = new MeteringRectangle[0];

    /* renamed from: q */
    public MeteringRectangle[] f3198q = new MeteringRectangle[0];

    /* renamed from: r */
    public MeteringRectangle[] f3199r = new MeteringRectangle[0];

    /* renamed from: s */
    public CallbackToFutureAdapter.C16559a<C1657o0> f3200s = null;

    /* renamed from: t */
    public CallbackToFutureAdapter.C16559a<Void> f3201t = null;

    /* renamed from: androidx.camera.camera2.internal.b2$a */
    public class C1037a extends C1448f {

        /* renamed from: a */
        public final /* synthetic */ CallbackToFutureAdapter.C16559a f3202a;

        public C1037a(CallbackToFutureAdapter.C16559a aVar) {
            this.f3202a = aVar;
        }

        /* renamed from: a */
        public void mo4262a() {
            CallbackToFutureAdapter.C16559a aVar = this.f3202a;
            if (aVar != null) {
                aVar.mo48128f(new CameraControl.OperationCanceledException("Camera is closed"));
            }
        }

        /* renamed from: b */
        public void mo4263b(@C0359n0 C1456h hVar) {
            CallbackToFutureAdapter.C16559a aVar = this.f3202a;
            if (aVar != null) {
                aVar.mo48125c(hVar);
            }
        }

        /* renamed from: c */
        public void mo4264c(@C0359n0 CameraCaptureFailure cameraCaptureFailure) {
            CallbackToFutureAdapter.C16559a aVar = this.f3202a;
            if (aVar != null) {
                aVar.mo48128f(new CameraControlInternal.CameraControlException(cameraCaptureFailure));
            }
        }
    }

    /* renamed from: androidx.camera.camera2.internal.b2$b */
    public class C1038b extends C1448f {

        /* renamed from: a */
        public final /* synthetic */ CallbackToFutureAdapter.C16559a f3204a;

        public C1038b(CallbackToFutureAdapter.C16559a aVar) {
            this.f3204a = aVar;
        }

        /* renamed from: a */
        public void mo4262a() {
            CallbackToFutureAdapter.C16559a aVar = this.f3204a;
            if (aVar != null) {
                aVar.mo48128f(new CameraControl.OperationCanceledException("Camera is closed"));
            }
        }

        /* renamed from: b */
        public void mo4263b(@C0359n0 C1456h hVar) {
            CallbackToFutureAdapter.C16559a aVar = this.f3204a;
            if (aVar != null) {
                aVar.mo48125c(hVar);
            }
        }

        /* renamed from: c */
        public void mo4264c(@C0359n0 CameraCaptureFailure cameraCaptureFailure) {
            CallbackToFutureAdapter.C16559a aVar = this.f3204a;
            if (aVar != null) {
                aVar.mo48128f(new CameraControlInternal.CameraControlException(cameraCaptureFailure));
            }
        }
    }

    public C1036b2(@C0359n0 C1254v vVar, @C0359n0 ScheduledExecutorService scheduledExecutorService, @C0359n0 Executor executor) {
        this.f3182a = vVar;
        this.f3183b = executor;
        this.f3184c = scheduledExecutorService;
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public /* synthetic */ Object m4559B(CallbackToFutureAdapter.C16559a aVar) throws Exception {
        this.f3183b.execute(new C1252u1(this, aVar));
        return "cancelFocusAndMetering";
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public /* synthetic */ boolean m4560C(int i, TotalCaptureResult totalCaptureResult) {
        CaptureRequest request = totalCaptureResult.getRequest();
        MeteringRectangle[] meteringRectangleArr = (MeteringRectangle[]) request.get(CaptureRequest.CONTROL_AF_REGIONS);
        MeteringRectangle[] meteringRectangleArr2 = (MeteringRectangle[]) request.get(CaptureRequest.CONTROL_AE_REGIONS);
        MeteringRectangle[] meteringRectangleArr3 = (MeteringRectangle[]) request.get(CaptureRequest.CONTROL_AWB_REGIONS);
        if (((Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_MODE)).intValue() != i || !m4578x(meteringRectangleArr, this.f3197p) || !m4578x(meteringRectangleArr2, this.f3198q) || !m4578x(meteringRectangleArr3, this.f3199r)) {
            return false;
        }
        mo4255o();
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: D */
    public /* synthetic */ boolean m4561D(boolean z, MeteringRectangle[] meteringRectangleArr, MeteringRectangle[] meteringRectangleArr2, MeteringRectangle[] meteringRectangleArr3, TotalCaptureResult totalCaptureResult) {
        Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
        if (mo4244L()) {
            if (!z || num == null) {
                this.f3191j = true;
                this.f3190i = true;
            } else if (this.f3187f.intValue() == 3) {
                if (num.intValue() == 4) {
                    this.f3191j = true;
                    this.f3190i = true;
                } else if (num.intValue() == 5) {
                    this.f3191j = false;
                    this.f3190i = true;
                }
            }
        }
        if (this.f3190i && totalCaptureResult.getRequest() != null) {
            if (meteringRectangleArr.length == 0) {
                meteringRectangleArr = this.f3197p;
            }
            if (meteringRectangleArr2.length == 0) {
                meteringRectangleArr2 = this.f3198q;
            }
            if (meteringRectangleArr3.length == 0) {
                meteringRectangleArr3 = this.f3199r;
            }
            CaptureRequest request = totalCaptureResult.getRequest();
            if (m4578x((MeteringRectangle[]) request.get(CaptureRequest.CONTROL_AF_REGIONS), meteringRectangleArr) && m4578x((MeteringRectangle[]) request.get(CaptureRequest.CONTROL_AE_REGIONS), meteringRectangleArr2) && m4578x((MeteringRectangle[]) request.get(CaptureRequest.CONTROL_AWB_REGIONS), meteringRectangleArr3)) {
                mo4254n(this.f3191j);
                return true;
            }
        }
        if (!this.f3187f.equals(num) && num != null) {
            this.f3187f = num;
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: E */
    public /* synthetic */ void m4562E(long j) {
        if (j == this.f3189h) {
            mo4253m();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: F */
    public /* synthetic */ void m4563F(long j) {
        this.f3183b.execute(new C1269x1(this, j));
    }

    /* access modifiers changed from: private */
    /* renamed from: H */
    public /* synthetic */ Object m4565H(C1650n0 n0Var, Rational rational, CallbackToFutureAdapter.C16559a aVar) throws Exception {
        this.f3183b.execute(new C1264w1(this, aVar, n0Var, rational));
        return "startFocusAndMetering";
    }

    /* renamed from: I */
    public static int m4566I(int i, int i2, int i3) {
        return Math.min(Math.max(i, i3), i2);
    }

    /* renamed from: u */
    public static PointF m4575u(@C0359n0 C1645m2 m2Var, @C0359n0 Rational rational, @C0359n0 Rational rational2) {
        if (m2Var.mo5627b() != null) {
            rational2 = m2Var.mo5627b();
        }
        PointF pointF = new PointF(m2Var.mo5628c(), m2Var.mo5629d());
        if (!rational2.equals(rational)) {
            if (rational2.compareTo(rational) > 0) {
                float doubleValue = (float) (rational2.doubleValue() / rational.doubleValue());
                pointF.y = (((float) ((((double) doubleValue) - 1.0d) / 2.0d)) + pointF.y) * (1.0f / doubleValue);
            } else {
                float doubleValue2 = (float) (rational.doubleValue() / rational2.doubleValue());
                pointF.x = (((float) ((((double) doubleValue2) - 1.0d) / 2.0d)) + pointF.x) * (1.0f / doubleValue2);
            }
        }
        return pointF;
    }

    /* renamed from: v */
    public static MeteringRectangle m4576v(C1645m2 m2Var, PointF pointF, Rect rect) {
        int width = (int) (((float) rect.left) + (pointF.x * ((float) rect.width())));
        int height = (int) (((float) rect.top) + (pointF.y * ((float) rect.height())));
        int a = ((int) (m2Var.mo5626a() * ((float) rect.width()))) / 2;
        int a2 = ((int) (m2Var.mo5626a() * ((float) rect.height()))) / 2;
        Rect rect2 = new Rect(width - a, height - a2, width + a, height + a2);
        rect2.left = m4566I(rect2.left, rect.right, rect.left);
        rect2.right = m4566I(rect2.right, rect.right, rect.left);
        rect2.top = m4566I(rect2.top, rect.bottom, rect.top);
        rect2.bottom = m4566I(rect2.bottom, rect.bottom, rect.top);
        return new MeteringRectangle(rect2, 1000);
    }

    /* renamed from: w */
    public static int m4577w(@C0363p0 MeteringRectangle[] meteringRectangleArr) {
        if (meteringRectangleArr == null) {
            return 0;
        }
        return meteringRectangleArr.length;
    }

    /* renamed from: x */
    public static boolean m4578x(@C0363p0 MeteringRectangle[] meteringRectangleArr, @C0363p0 MeteringRectangle[] meteringRectangleArr2) {
        if (m4577w(meteringRectangleArr) == 0 && m4577w(meteringRectangleArr2) == 0) {
            return true;
        }
        if (m4577w(meteringRectangleArr) != m4577w(meteringRectangleArr2)) {
            return false;
        }
        if (!(meteringRectangleArr == null || meteringRectangleArr2 == null)) {
            for (int i = 0; i < meteringRectangleArr.length; i++) {
                if (!meteringRectangleArr[i].equals(meteringRectangleArr2[i])) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: z */
    public static boolean m4579z(@C0359n0 C1645m2 m2Var) {
        return m2Var.mo5628c() >= 0.0f && m2Var.mo5628c() <= 1.0f && m2Var.mo5629d() >= 0.0f && m2Var.mo5629d() <= 1.0f;
    }

    /* renamed from: J */
    public void mo4242J(boolean z) {
        if (z != this.f3185d) {
            this.f3185d = z;
            if (!this.f3185d) {
                mo4253m();
            }
        }
    }

    /* renamed from: K */
    public void mo4243K(@C0359n0 CaptureRequest.Builder builder) {
        this.f3197p = (MeteringRectangle[]) builder.get(CaptureRequest.CONTROL_AF_REGIONS);
        this.f3198q = (MeteringRectangle[]) builder.get(CaptureRequest.CONTROL_AE_REGIONS);
        this.f3199r = (MeteringRectangle[]) builder.get(CaptureRequest.CONTROL_AWB_REGIONS);
    }

    /* renamed from: L */
    public final boolean mo4244L() {
        return this.f3194m.length > 0;
    }

    /* renamed from: M */
    public C32487a<C1657o0> mo4245M(@C0359n0 C1650n0 n0Var, @C0363p0 Rational rational) {
        return CallbackToFutureAdapter.m74987a(new C1248t1(this, n0Var, rational));
    }

    /* renamed from: N */
    public void m4564G(@C0359n0 CallbackToFutureAdapter.C16559a<C1657o0> aVar, @C0359n0 C1650n0 n0Var, @C0363p0 Rational rational) {
        if (!this.f3185d) {
            aVar.mo48128f(new CameraControl.OperationCanceledException("Camera is not active."));
        } else if (!n0Var.mo5641c().isEmpty() || !n0Var.mo5640b().isEmpty() || !n0Var.mo5642d().isEmpty()) {
            int min = Math.min(n0Var.mo5641c().size(), this.f3182a.mo4663K());
            int min2 = Math.min(n0Var.mo5640b().size(), this.f3182a.mo4662J());
            int min3 = Math.min(n0Var.mo5642d().size(), this.f3182a.mo4664L());
            if (min + min2 + min3 <= 0) {
                aVar.mo48128f(new IllegalArgumentException("None of the specified AF/AE/AWB MeteringPoints is supported on this camera."));
                return;
            }
            ArrayList<C1645m2> arrayList = new ArrayList<>();
            ArrayList<C1645m2> arrayList2 = new ArrayList<>();
            ArrayList<C1645m2> arrayList3 = new ArrayList<>();
            if (min > 0) {
                arrayList.addAll(n0Var.mo5641c().subList(0, min));
            }
            if (min2 > 0) {
                arrayList2.addAll(n0Var.mo5640b().subList(0, min2));
            }
            if (min3 > 0) {
                arrayList3.addAll(n0Var.mo5642d().subList(0, min3));
            }
            Rect G = this.f3182a.mo4659G();
            Rational rational2 = new Rational(G.width(), G.height());
            if (rational == null) {
                rational = rational2;
            }
            ArrayList arrayList4 = new ArrayList();
            ArrayList arrayList5 = new ArrayList();
            ArrayList arrayList6 = new ArrayList();
            for (C1645m2 m2Var : arrayList) {
                if (m4579z(m2Var)) {
                    MeteringRectangle v = m4576v(m2Var, m4575u(m2Var, rational2, rational), G);
                    if (!(v.getWidth() == 0 || v.getHeight() == 0)) {
                        arrayList4.add(v);
                    }
                }
            }
            for (C1645m2 m2Var2 : arrayList2) {
                if (m4579z(m2Var2)) {
                    MeteringRectangle v2 = m4576v(m2Var2, m4575u(m2Var2, rational2, rational), G);
                    if (!(v2.getWidth() == 0 || v2.getHeight() == 0)) {
                        arrayList5.add(v2);
                    }
                }
            }
            for (C1645m2 m2Var3 : arrayList3) {
                if (m4579z(m2Var3)) {
                    MeteringRectangle v3 = m4576v(m2Var3, m4575u(m2Var3, rational2, rational), G);
                    if (!(v3.getWidth() == 0 || v3.getHeight() == 0)) {
                        arrayList6.add(v3);
                    }
                }
            }
            if (!arrayList4.isEmpty() || !arrayList5.isEmpty() || !arrayList6.isEmpty()) {
                mo4258r("Cancelled by another startFocusAndMetering()");
                mo4259s("Cancelled by another startFocusAndMetering()");
                mo4256p();
                this.f3200s = aVar;
                mo4257q((MeteringRectangle[]) arrayList4.toArray(new MeteringRectangle[0]), (MeteringRectangle[]) arrayList5.toArray(new MeteringRectangle[0]), (MeteringRectangle[]) arrayList6.toArray(new MeteringRectangle[0]), n0Var);
                return;
            }
            aVar.mo48128f(new IllegalArgumentException("None of the specified AF/AE/AWB MeteringPoints are valid."));
        } else {
            aVar.mo48128f(new IllegalArgumentException("No AF/AE/AWB MeteringPoints are added."));
        }
    }

    /* renamed from: O */
    public void mo4247O(@C0363p0 CallbackToFutureAdapter.C16559a<C1456h> aVar) {
        if (this.f3185d) {
            C1583y.C1584a aVar2 = new C1583y.C1584a();
            aVar2.mo5569s(mo4260t());
            aVar2.mo5570t(true);
            C1004b.C1005a aVar3 = new C1004b.C1005a();
            aVar3.mo4096e(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 1);
            aVar2.mo5557e(aVar3.mo4098g());
            aVar2.mo5555c(new C1038b(aVar));
            this.f3182a.m5159c0(Collections.singletonList(aVar2.mo5560h()));
        } else if (aVar != null) {
            aVar.mo48128f(new CameraControl.OperationCanceledException("Camera is not active."));
        }
    }

    /* renamed from: P */
    public void mo4248P(@C0363p0 CallbackToFutureAdapter.C16559a<C1456h> aVar) {
        if (this.f3185d) {
            C1583y.C1584a aVar2 = new C1583y.C1584a();
            aVar2.mo5569s(mo4260t());
            aVar2.mo5570t(true);
            C1004b.C1005a aVar3 = new C1004b.C1005a();
            aVar3.mo4096e(CaptureRequest.CONTROL_AF_TRIGGER, 1);
            aVar2.mo5557e(aVar3.mo4098g());
            aVar2.mo5555c(new C1037a(aVar));
            this.f3182a.m5159c0(Collections.singletonList(aVar2.mo5560h()));
        } else if (aVar != null) {
            aVar.mo48128f(new CameraControl.OperationCanceledException("Camera is not active."));
        }
    }

    /* renamed from: i */
    public void mo4249i(@C0359n0 C1004b.C1005a aVar) {
        int i;
        if (this.f3186e) {
            i = 1;
        } else {
            i = 4;
        }
        aVar.mo4096e(CaptureRequest.CONTROL_AF_MODE, Integer.valueOf(this.f3182a.mo4667O(i)));
        MeteringRectangle[] meteringRectangleArr = this.f3194m;
        if (meteringRectangleArr.length != 0) {
            aVar.mo4096e(CaptureRequest.CONTROL_AF_REGIONS, meteringRectangleArr);
        }
        MeteringRectangle[] meteringRectangleArr2 = this.f3195n;
        if (meteringRectangleArr2.length != 0) {
            aVar.mo4096e(CaptureRequest.CONTROL_AE_REGIONS, meteringRectangleArr2);
        }
        MeteringRectangle[] meteringRectangleArr3 = this.f3196o;
        if (meteringRectangleArr3.length != 0) {
            aVar.mo4096e(CaptureRequest.CONTROL_AWB_REGIONS, meteringRectangleArr3);
        }
    }

    /* renamed from: j */
    public void mo4250j(boolean z, boolean z2) {
        if (this.f3185d) {
            C1583y.C1584a aVar = new C1583y.C1584a();
            aVar.mo5570t(true);
            aVar.mo5569s(mo4260t());
            C1004b.C1005a aVar2 = new C1004b.C1005a();
            if (z) {
                aVar2.mo4096e(CaptureRequest.CONTROL_AF_TRIGGER, 2);
            }
            if (z2) {
                aVar2.mo4096e(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 2);
            }
            aVar.mo5557e(aVar2.mo4098g());
            this.f3182a.m5159c0(Collections.singletonList(aVar.mo5560h()));
        }
    }

    /* renamed from: k */
    public C32487a<Void> mo4251k() {
        return CallbackToFutureAdapter.m74987a(new C1259v1(this));
    }

    /* renamed from: l */
    public void m4558A(@C0363p0 CallbackToFutureAdapter.C16559a<Void> aVar) {
        mo4259s("Cancelled by another cancelFocusAndMetering()");
        mo4258r("Cancelled by cancelFocusAndMetering()");
        this.f3201t = aVar;
        mo4256p();
        if (this.f3201t != null) {
            C1274y1 y1Var = new C1274y1(this, this.f3182a.mo4667O(4));
            this.f3193l = y1Var;
            this.f3182a.mo4654B(y1Var);
        }
        if (mo4244L()) {
            mo4250j(true, false);
        }
        this.f3194m = new MeteringRectangle[0];
        this.f3195n = new MeteringRectangle[0];
        this.f3196o = new MeteringRectangle[0];
        this.f3186e = false;
        this.f3182a.mo4697o0();
    }

    /* renamed from: m */
    public void mo4253m() {
        m4558A((CallbackToFutureAdapter.C16559a<Void>) null);
    }

    /* renamed from: n */
    public final void mo4254n(boolean z) {
        CallbackToFutureAdapter.C16559a<C1657o0> aVar = this.f3200s;
        if (aVar != null) {
            aVar.mo48125c(C1657o0.m6753a(z));
            this.f3200s = null;
        }
    }

    /* renamed from: o */
    public final void mo4255o() {
        CallbackToFutureAdapter.C16559a<Void> aVar = this.f3201t;
        if (aVar != null) {
            aVar.mo48125c(null);
            this.f3201t = null;
        }
    }

    /* renamed from: p */
    public final void mo4256p() {
        ScheduledFuture<?> scheduledFuture = this.f3188g;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.f3188g = null;
        }
    }

    /* renamed from: q */
    public final void mo4257q(@C0359n0 MeteringRectangle[] meteringRectangleArr, @C0359n0 MeteringRectangle[] meteringRectangleArr2, @C0359n0 MeteringRectangle[] meteringRectangleArr3, C1650n0 n0Var) {
        this.f3182a.mo4683h0(this.f3192k);
        mo4256p();
        this.f3194m = meteringRectangleArr;
        this.f3195n = meteringRectangleArr2;
        this.f3196o = meteringRectangleArr3;
        if (mo4244L()) {
            this.f3186e = true;
            this.f3190i = false;
            this.f3191j = false;
            this.f3182a.mo4697o0();
            mo4248P((CallbackToFutureAdapter.C16559a<C1456h>) null);
        } else {
            this.f3186e = false;
            this.f3190i = true;
            this.f3191j = false;
            this.f3182a.mo4697o0();
        }
        this.f3187f = 0;
        C1278z1 z1Var = new C1278z1(this, mo4261y(), meteringRectangleArr, meteringRectangleArr2, meteringRectangleArr3);
        this.f3192k = z1Var;
        this.f3182a.mo4654B(z1Var);
        if (n0Var.mo5643e()) {
            long j = this.f3189h + 1;
            this.f3189h = j;
            this.f3188g = this.f3184c.schedule(new C1028a2(this, j), n0Var.mo5639a(), TimeUnit.MILLISECONDS);
        }
    }

    /* renamed from: r */
    public final void mo4258r(String str) {
        this.f3182a.mo4683h0(this.f3192k);
        CallbackToFutureAdapter.C16559a<C1657o0> aVar = this.f3200s;
        if (aVar != null) {
            aVar.mo48128f(new CameraControl.OperationCanceledException(str));
            this.f3200s = null;
        }
    }

    /* renamed from: s */
    public final void mo4259s(String str) {
        this.f3182a.mo4683h0(this.f3193l);
        CallbackToFutureAdapter.C16559a<Void> aVar = this.f3201t;
        if (aVar != null) {
            aVar.mo48128f(new CameraControl.OperationCanceledException(str));
            this.f3201t = null;
        }
    }

    /* renamed from: t */
    public final int mo4260t() {
        return 1;
    }

    /* renamed from: y */
    public final boolean mo4261y() {
        return this.f3182a.mo4667O(1) == 1;
    }
}
