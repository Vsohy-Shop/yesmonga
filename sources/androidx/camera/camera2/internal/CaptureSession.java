package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import androidx.annotation.C0323b0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.experimental.C0335b;
import androidx.camera.camera2.impl.C1004b;
import androidx.camera.camera2.impl.C1008d;
import androidx.camera.camera2.internal.C1185g2;
import androidx.camera.camera2.internal.C1244s2;
import androidx.camera.camera2.internal.compat.params.C1096d;
import androidx.camera.camera2.internal.compat.params.C1122z;
import androidx.camera.camera2.internal.compat.workaround.C1162g;
import androidx.camera.camera2.interop.C1298p;
import androidx.camera.core.C1417i2;
import androidx.camera.core.impl.C1441c1;
import androidx.camera.core.impl.C1448f;
import androidx.camera.core.impl.C1583y;
import androidx.camera.core.impl.C1586y0;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.utils.futures.C1544c;
import androidx.camera.core.impl.utils.futures.C1545d;
import androidx.camera.core.impl.utils.futures.C1548f;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.C18001r;
import com.google.common.util.concurrent.C32487a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CancellationException;

public final class CaptureSession {

    /* renamed from: p */
    public static final String f3134p = "CaptureSession";

    /* renamed from: q */
    public static final long f3135q = 5000;

    /* renamed from: a */
    public final Object f3136a;

    /* renamed from: b */
    public final List<C1583y> f3137b;

    /* renamed from: c */
    public final CameraCaptureSession.CaptureCallback f3138c;

    /* renamed from: d */
    public final C1022d f3139d;
    @C0363p0

    /* renamed from: e */
    public C1237r2 f3140e;
    @C0363p0

    /* renamed from: f */
    public C1185g2 f3141f;
    @C0363p0

    /* renamed from: g */
    public volatile SessionConfig f3142g;
    @C0359n0

    /* renamed from: h */
    public volatile Config f3143h;
    @C0359n0

    /* renamed from: i */
    public C1008d f3144i;

    /* renamed from: j */
    public Map<DeferrableSurface, Surface> f3145j;
    @C0323b0("mStateLock")

    /* renamed from: k */
    public List<DeferrableSurface> f3146k;
    @C0323b0("mStateLock")

    /* renamed from: l */
    public State f3147l;
    @C0323b0("mStateLock")

    /* renamed from: m */
    public C32487a<Void> f3148m;
    @C0323b0("mStateLock")

    /* renamed from: n */
    public CallbackToFutureAdapter.C16559a<Void> f3149n;

    /* renamed from: o */
    public final C1162g f3150o;

    public enum State {
        UNINITIALIZED,
        INITIALIZED,
        GET_SURFACE,
        OPENING,
        OPENED,
        CLOSED,
        RELEASING,
        RELEASED
    }

    /* renamed from: androidx.camera.camera2.internal.CaptureSession$a */
    public class C1019a extends CameraCaptureSession.CaptureCallback {
        public C1019a() {
        }

        public void onCaptureCompleted(@C0359n0 CameraCaptureSession cameraCaptureSession, @C0359n0 CaptureRequest captureRequest, @C0359n0 TotalCaptureResult totalCaptureResult) {
        }
    }

    /* renamed from: androidx.camera.camera2.internal.CaptureSession$b */
    public class C1020b implements C1544c<Void> {
        public C1020b() {
        }

        /* renamed from: b */
        public void mo4161b(Throwable th) {
            CaptureSession.this.f3140e.mo4642e();
            synchronized (CaptureSession.this.f3136a) {
                int i = C1021c.f3162a[CaptureSession.this.f3147l.ordinal()];
                if (i == 4 || i == 6 || i == 7) {
                    if (!(th instanceof CancellationException)) {
                        C1417i2.m5925o(CaptureSession.f3134p, "Opening session with fail " + CaptureSession.this.f3147l, th);
                        CaptureSession.this.mo4186g();
                    }
                }
            }
        }

        /* renamed from: c */
        public void mo4160a(@C0363p0 Void voidR) {
        }
    }

    /* renamed from: androidx.camera.camera2.internal.CaptureSession$c */
    public static /* synthetic */ class C1021c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f3162a;

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
                androidx.camera.camera2.internal.CaptureSession$State[] r0 = androidx.camera.camera2.internal.CaptureSession.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f3162a = r0
                androidx.camera.camera2.internal.CaptureSession$State r1 = androidx.camera.camera2.internal.CaptureSession.State.UNINITIALIZED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f3162a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.camera.camera2.internal.CaptureSession$State r1 = androidx.camera.camera2.internal.CaptureSession.State.INITIALIZED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f3162a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.camera.camera2.internal.CaptureSession$State r1 = androidx.camera.camera2.internal.CaptureSession.State.GET_SURFACE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f3162a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.camera.camera2.internal.CaptureSession$State r1 = androidx.camera.camera2.internal.CaptureSession.State.OPENING     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f3162a     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.camera.camera2.internal.CaptureSession$State r1 = androidx.camera.camera2.internal.CaptureSession.State.OPENED     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f3162a     // Catch:{ NoSuchFieldError -> 0x0049 }
                androidx.camera.camera2.internal.CaptureSession$State r1 = androidx.camera.camera2.internal.CaptureSession.State.CLOSED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f3162a     // Catch:{ NoSuchFieldError -> 0x0054 }
                androidx.camera.camera2.internal.CaptureSession$State r1 = androidx.camera.camera2.internal.CaptureSession.State.RELEASING     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f3162a     // Catch:{ NoSuchFieldError -> 0x0060 }
                androidx.camera.camera2.internal.CaptureSession$State r1 = androidx.camera.camera2.internal.CaptureSession.State.RELEASED     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.internal.CaptureSession.C1021c.<clinit>():void");
        }
    }

    /* renamed from: androidx.camera.camera2.internal.CaptureSession$d */
    public final class C1022d extends C1185g2.C1186a {
        public C1022d() {
        }

        /* renamed from: w */
        public void mo4201w(@C0359n0 C1185g2 g2Var) {
            synchronized (CaptureSession.this.f3136a) {
                switch (C1021c.f3162a[CaptureSession.this.f3147l.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 5:
                    case 8:
                        throw new IllegalStateException("onConfigureFailed() should not be possible in state: " + CaptureSession.this.f3147l);
                    case 4:
                    case 6:
                    case 7:
                        CaptureSession.this.mo4186g();
                        break;
                }
                C1417i2.m5913c(CaptureSession.f3134p, "CameraCaptureSession.onConfigureFailed() " + CaptureSession.this.f3147l);
            }
        }

        /* renamed from: x */
        public void mo4202x(@C0359n0 C1185g2 g2Var) {
            synchronized (CaptureSession.this.f3136a) {
                switch (C1021c.f3162a[CaptureSession.this.f3147l.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 5:
                    case 8:
                        throw new IllegalStateException("onConfigured() should not be possible in state: " + CaptureSession.this.f3147l);
                    case 4:
                        CaptureSession captureSession = CaptureSession.this;
                        captureSession.f3147l = State.OPENED;
                        captureSession.f3141f = g2Var;
                        if (captureSession.f3142g != null) {
                            List<C1583y> c = CaptureSession.this.f3144i.mo4107d().mo4110c();
                            if (!c.isEmpty()) {
                                CaptureSession captureSession2 = CaptureSession.this;
                                captureSession2.mo4190k(captureSession2.mo4198w(c));
                            }
                        }
                        C1417i2.m5911a(CaptureSession.f3134p, "Attempting to send capture request onConfigured");
                        CaptureSession.this.mo4193n();
                        CaptureSession.this.mo4192m();
                        break;
                    case 6:
                        CaptureSession.this.f3141f = g2Var;
                        break;
                    case 7:
                        g2Var.close();
                        break;
                }
                C1417i2.m5911a(CaptureSession.f3134p, "CameraCaptureSession.onConfigured() mState=" + CaptureSession.this.f3147l);
            }
        }

        /* renamed from: y */
        public void mo4203y(@C0359n0 C1185g2 g2Var) {
            synchronized (CaptureSession.this.f3136a) {
                if (C1021c.f3162a[CaptureSession.this.f3147l.ordinal()] != 1) {
                    C1417i2.m5911a(CaptureSession.f3134p, "CameraCaptureSession.onReady() " + CaptureSession.this.f3147l);
                } else {
                    throw new IllegalStateException("onReady() should not be possible in state: " + CaptureSession.this.f3147l);
                }
            }
        }

        /* renamed from: z */
        public void mo4204z(@C0359n0 C1185g2 g2Var) {
            synchronized (CaptureSession.this.f3136a) {
                if (CaptureSession.this.f3147l != State.UNINITIALIZED) {
                    C1417i2.m5911a(CaptureSession.f3134p, "onSessionFinished()");
                    CaptureSession.this.mo4186g();
                } else {
                    throw new IllegalStateException("onSessionFinished() should not be possible in state: " + CaptureSession.this.f3147l);
                }
            }
        }
    }

    public CaptureSession() {
        this.f3136a = new Object();
        this.f3137b = new ArrayList();
        this.f3138c = new C1019a();
        this.f3143h = C1441c1.m6058a0();
        this.f3144i = C1008d.m4389e();
        this.f3145j = new HashMap();
        this.f3146k = Collections.emptyList();
        this.f3147l = State.UNINITIALIZED;
        this.f3150o = new C1162g();
        this.f3147l = State.INITIALIZED;
        this.f3139d = new C1022d();
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public /* synthetic */ void m4494o(CameraCaptureSession cameraCaptureSession, int i, boolean z) {
        synchronized (this.f3136a) {
            if (this.f3147l == State.OPENED) {
                mo4193n();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ Object m4496q(CallbackToFutureAdapter.C16559a aVar) throws Exception {
        boolean z;
        String str;
        synchronized (this.f3136a) {
            if (this.f3149n == null) {
                z = true;
            } else {
                z = false;
            }
            C18001r.m81778o(z, "Release completer expected to be null");
            this.f3149n = aVar;
            str = "Release[session=" + this + "]";
        }
        return str;
    }

    @C0359n0
    /* renamed from: r */
    public static Config m4497r(List<C1583y> list) {
        C1586y0 d0 = C1586y0.m6573d0();
        for (C1583y c : list) {
            Config c2 = c.mo5548c();
            for (Config.C1421a next : c2.mo5129f()) {
                Object h = c2.mo5131h(next, null);
                if (d0.mo5126c(next)) {
                    Object h2 = d0.mo5131h(next, null);
                    if (!Objects.equals(h2, h)) {
                        C1417i2.m5911a(f3134p, "Detect conflicting option " + next.mo5133c() + " : " + h + " != " + h2);
                    }
                } else {
                    d0.mo5545t(next, h);
                }
            }
        }
        return d0;
    }

    /* renamed from: d */
    public void mo4183d() {
        if (!this.f3137b.isEmpty()) {
            for (C1583y b : this.f3137b) {
                for (C1448f a : b.mo5547b()) {
                    a.mo4262a();
                }
            }
            this.f3137b.clear();
        }
    }

    /* renamed from: e */
    public void mo4184e() {
        synchronized (this.f3136a) {
            int i = C1021c.f3162a[this.f3147l.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                if (this.f3142g != null) {
                                    List<C1583y> b = this.f3144i.mo4107d().mo4109b();
                                    if (!b.isEmpty()) {
                                        try {
                                            mo4191l(mo4198w(b));
                                        } catch (IllegalStateException e) {
                                            C1417i2.m5914d(f3134p, "Unable to issue the request before close the capture session", e);
                                        }
                                    }
                                }
                            }
                        }
                        C1237r2 r2Var = this.f3140e;
                        C18001r.m81776m(r2Var, "The Opener shouldn't null in state:" + this.f3147l);
                        this.f3140e.mo4642e();
                        this.f3147l = State.CLOSED;
                        this.f3142g = null;
                    } else {
                        C1237r2 r2Var2 = this.f3140e;
                        C18001r.m81776m(r2Var2, "The Opener shouldn't null in state:" + this.f3147l);
                        this.f3140e.mo4642e();
                    }
                }
                this.f3147l = State.RELEASED;
            } else {
                throw new IllegalStateException("close() should not be possible in state: " + this.f3147l);
            }
        }
    }

    /* renamed from: f */
    public final CameraCaptureSession.CaptureCallback mo4185f(List<C1448f> list, CameraCaptureSession.CaptureCallback... captureCallbackArr) {
        ArrayList arrayList = new ArrayList(list.size() + captureCallbackArr.length);
        for (C1448f a : list) {
            arrayList.add(C1189h1.m4977a(a));
        }
        Collections.addAll(arrayList, captureCallbackArr);
        return C1233r0.m5097a(arrayList);
    }

    @C0323b0("mStateLock")
    /* renamed from: g */
    public void mo4186g() {
        State state = this.f3147l;
        State state2 = State.RELEASED;
        if (state == state2) {
            C1417i2.m5911a(f3134p, "Skipping finishClose due to being state RELEASED.");
            return;
        }
        this.f3147l = state2;
        this.f3141f = null;
        CallbackToFutureAdapter.C16559a<Void> aVar = this.f3149n;
        if (aVar != null) {
            aVar.mo48125c(null);
            this.f3149n = null;
        }
    }

    /* renamed from: h */
    public List<C1583y> mo4187h() {
        List<C1583y> unmodifiableList;
        synchronized (this.f3136a) {
            unmodifiableList = Collections.unmodifiableList(this.f3137b);
        }
        return unmodifiableList;
    }

    @C0363p0
    /* renamed from: i */
    public SessionConfig mo4188i() {
        SessionConfig sessionConfig;
        synchronized (this.f3136a) {
            sessionConfig = this.f3142g;
        }
        return sessionConfig;
    }

    /* renamed from: j */
    public State mo4189j() {
        State state;
        synchronized (this.f3136a) {
            state = this.f3147l;
        }
        return state;
    }

    /* renamed from: k */
    public void mo4190k(List<C1583y> list) {
        boolean z;
        if (!list.isEmpty()) {
            try {
                C1272y0 y0Var = new C1272y0();
                ArrayList arrayList = new ArrayList();
                C1417i2.m5911a(f3134p, "Issuing capture request.");
                boolean z2 = false;
                for (C1583y next : list) {
                    if (next.mo5549d().isEmpty()) {
                        C1417i2.m5911a(f3134p, "Skipping issuing empty capture request.");
                    } else {
                        Iterator<DeferrableSurface> it = next.mo5549d().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                z = true;
                                break;
                            }
                            DeferrableSurface next2 = it.next();
                            if (!this.f3145j.containsKey(next2)) {
                                C1417i2.m5911a(f3134p, "Skipping capture request with invalid surface: " + next2);
                                z = false;
                                break;
                            }
                        }
                        if (z) {
                            if (next.mo5551f() == 2) {
                                z2 = true;
                            }
                            C1583y.C1584a k = C1583y.C1584a.m6553k(next);
                            if (this.f3142g != null) {
                                k.mo5557e(this.f3142g.mo5148f().mo5548c());
                            }
                            k.mo5557e(this.f3143h);
                            k.mo5557e(next.mo5548c());
                            CaptureRequest b = C1247t0.m5146b(k.mo5560h(), this.f3141f.mo4520j(), this.f3145j);
                            if (b == null) {
                                C1417i2.m5911a(f3134p, "Skipping issuing request without surface.");
                                return;
                            }
                            ArrayList arrayList2 = new ArrayList();
                            for (C1448f b2 : next.mo5547b()) {
                                C1189h1.m4978b(b2, arrayList2);
                            }
                            y0Var.mo4726a(b, arrayList2);
                            arrayList.add(b);
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    if (this.f3150o.mo4444a(arrayList, z2)) {
                        this.f3141f.mo4526s();
                        y0Var.mo4728c(new C1201k1(this));
                    }
                    this.f3141f.mo4524q(arrayList, y0Var);
                    return;
                }
                C1417i2.m5911a(f3134p, "Skipping issuing burst request due to no valid request elements");
            } catch (CameraAccessException e) {
                C1417i2.m5913c(f3134p, "Unable to access camera: " + e.getMessage());
                Thread.dumpStack();
            }
        }
    }

    /* renamed from: l */
    public void mo4191l(List<C1583y> list) {
        synchronized (this.f3136a) {
            switch (C1021c.f3162a[this.f3147l.ordinal()]) {
                case 1:
                    throw new IllegalStateException("issueCaptureRequests() should not be possible in state: " + this.f3147l);
                case 2:
                case 3:
                case 4:
                    this.f3137b.addAll(list);
                    break;
                case 5:
                    this.f3137b.addAll(list);
                    mo4192m();
                    break;
                case 6:
                case 7:
                case 8:
                    throw new IllegalStateException("Cannot issue capture request on a closed/released session.");
            }
        }
    }

    /* renamed from: m */
    public void mo4192m() {
        if (!this.f3137b.isEmpty()) {
            try {
                mo4190k(this.f3137b);
            } finally {
                this.f3137b.clear();
            }
        }
    }

    @C0323b0("mStateLock")
    /* renamed from: n */
    public void mo4193n() {
        if (this.f3142g == null) {
            C1417i2.m5911a(f3134p, "Skipping issueRepeatingCaptureRequests for no configuration case.");
            return;
        }
        C1583y f = this.f3142g.mo5148f();
        if (f.mo5549d().isEmpty()) {
            C1417i2.m5911a(f3134p, "Skipping issueRepeatingCaptureRequests for no surface.");
            try {
                this.f3141f.mo4526s();
            } catch (CameraAccessException e) {
                C1417i2.m5913c(f3134p, "Unable to access camera: " + e.getMessage());
                Thread.dumpStack();
            }
        } else {
            try {
                C1417i2.m5911a(f3134p, "Issuing request for session.");
                C1583y.C1584a k = C1583y.C1584a.m6553k(f);
                this.f3143h = m4497r(this.f3144i.mo4107d().mo4112e());
                k.mo5557e(this.f3143h);
                CaptureRequest b = C1247t0.m5146b(k.mo5560h(), this.f3141f.mo4520j(), this.f3145j);
                if (b == null) {
                    C1417i2.m5911a(f3134p, "Skipping issuing empty request for session.");
                    return;
                }
                this.f3141f.mo4521k(b, mo4185f(f.mo5547b(), this.f3138c));
            } catch (CameraAccessException e2) {
                C1417i2.m5913c(f3134p, "Unable to access camera: " + e2.getMessage());
                Thread.dumpStack();
            }
        }
    }

    @C0359n0
    /* renamed from: s */
    public C32487a<Void> mo4194s(@C0359n0 SessionConfig sessionConfig, @C0359n0 CameraDevice cameraDevice, @C0359n0 C1237r2 r2Var) {
        synchronized (this.f3136a) {
            if (C1021c.f3162a[this.f3147l.ordinal()] != 2) {
                C1417i2.m5913c(f3134p, "Open not allowed in state: " + this.f3147l);
                C32487a<Void> f = C1548f.m6477f(new IllegalStateException("open() should not allow the state: " + this.f3147l));
                return f;
            }
            this.f3147l = State.GET_SURFACE;
            ArrayList arrayList = new ArrayList(sessionConfig.mo5151i());
            this.f3146k = arrayList;
            this.f3140e = r2Var;
            C1545d<T> f2 = C1545d.m6463b(r2Var.mo4641d(arrayList, 5000)).mo5486f(new C1193i1(this, sessionConfig, cameraDevice), this.f3140e.mo4639b());
            C1548f.m6473b(f2, new C1020b(), this.f3140e.mo4639b());
            C32487a<Void> j = C1548f.m6481j(f2);
            return j;
        }
    }

    @C0335b(markerClass = C1298p.class)
    @C0359n0
    /* renamed from: t */
    public final C32487a<Void> m4495p(@C0359n0 List<Surface> list, @C0359n0 SessionConfig sessionConfig, @C0359n0 CameraDevice cameraDevice) {
        synchronized (this.f3136a) {
            int i = C1021c.f3162a[this.f3147l.ordinal()];
            if (!(i == 1 || i == 2)) {
                if (i == 3) {
                    this.f3145j.clear();
                    for (int i2 = 0; i2 < list.size(); i2++) {
                        this.f3145j.put(this.f3146k.get(i2), list.get(i2));
                    }
                    ArrayList<Surface> arrayList = new ArrayList<>(new HashSet(list));
                    this.f3147l = State.OPENING;
                    C1417i2.m5911a(f3134p, "Opening capture session.");
                    C1185g2.C1186a B = C1244s2.m5128B(this.f3139d, new C1244s2.C1245a(sessionConfig.mo5149g()));
                    C1008d c0 = new C1004b(sessionConfig.mo5146d()).mo4087c0(C1008d.m4389e());
                    this.f3144i = c0;
                    List<C1583y> d = c0.mo4107d().mo4111d();
                    C1583y.C1584a k = C1583y.C1584a.m6553k(sessionConfig.mo5148f());
                    for (C1583y c : d) {
                        k.mo5557e(c.mo5548c());
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (Surface dVar : arrayList) {
                        arrayList2.add(new C1096d(dVar));
                    }
                    C1122z a = this.f3140e.mo4638a(0, arrayList2, B);
                    try {
                        CaptureRequest c2 = C1247t0.m5147c(k.mo5560h(), cameraDevice);
                        if (c2 != null) {
                            a.mo4394h(c2);
                        }
                        C32487a<Void> c3 = this.f3140e.mo4640c(cameraDevice, a, this.f3146k);
                        return c3;
                    } catch (CameraAccessException e) {
                        return C1548f.m6477f(e);
                    }
                } else if (i != 5) {
                    C32487a<Void> f = C1548f.m6477f(new CancellationException("openCaptureSession() not execute in state: " + this.f3147l));
                    return f;
                }
            }
            C32487a<Void> f2 = C1548f.m6477f(new IllegalStateException("openCaptureSession() should not be possible in state: " + this.f3147l));
            return f2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0029, code lost:
        r3.f3147l = androidx.camera.camera2.internal.CaptureSession.State.f3157g;
        r4 = r3.f3140e;
        androidx.core.util.C18001r.m81776m(r4, "The Opener shouldn't null in state:" + r3.f3147l);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004b, code lost:
        if (r3.f3140e.mo4642e() == false) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004d, code lost:
        mo4186g();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0053, code lost:
        if (r3.f3148m != null) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0055, code lost:
        r3.f3148m = androidx.concurrent.futures.CallbackToFutureAdapter.m74987a(new androidx.camera.camera2.internal.C1197j1(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0060, code lost:
        r4 = r3.f3148m;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0063, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0081, code lost:
        r3.f3147l = androidx.camera.camera2.internal.CaptureSession.State.f3158v;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a5, code lost:
        return androidx.camera.core.impl.utils.futures.C1548f.m6479h(null);
     */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.common.util.concurrent.C32487a<java.lang.Void> mo4196u(boolean r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f3136a
            monitor-enter(r0)
            int[] r1 = androidx.camera.camera2.internal.CaptureSession.C1021c.f3162a     // Catch:{ all -> 0x00a6 }
            androidx.camera.camera2.internal.CaptureSession$State r2 = r3.f3147l     // Catch:{ all -> 0x00a6 }
            int r2 = r2.ordinal()     // Catch:{ all -> 0x00a6 }
            r1 = r1[r2]     // Catch:{ all -> 0x00a6 }
            switch(r1) {
                case 1: goto L_0x0086;
                case 2: goto L_0x0081;
                case 3: goto L_0x0064;
                case 4: goto L_0x0029;
                case 5: goto L_0x0012;
                case 6: goto L_0x0012;
                case 7: goto L_0x0051;
                default: goto L_0x0010;
            }     // Catch:{ all -> 0x00a6 }
        L_0x0010:
            goto L_0x009f
        L_0x0012:
            androidx.camera.camera2.internal.g2 r1 = r3.f3141f     // Catch:{ all -> 0x00a6 }
            if (r1 == 0) goto L_0x0029
            if (r4 == 0) goto L_0x0024
            r1.mo4519i()     // Catch:{ CameraAccessException -> 0x001c }
            goto L_0x0024
        L_0x001c:
            r4 = move-exception
            java.lang.String r1 = "CaptureSession"
            java.lang.String r2 = "Unable to abort captures."
            androidx.camera.core.C1417i2.m5914d(r1, r2, r4)     // Catch:{ all -> 0x00a6 }
        L_0x0024:
            androidx.camera.camera2.internal.g2 r4 = r3.f3141f     // Catch:{ all -> 0x00a6 }
            r4.close()     // Catch:{ all -> 0x00a6 }
        L_0x0029:
            androidx.camera.camera2.internal.CaptureSession$State r4 = androidx.camera.camera2.internal.CaptureSession.State.RELEASING     // Catch:{ all -> 0x00a6 }
            r3.f3147l = r4     // Catch:{ all -> 0x00a6 }
            androidx.camera.camera2.internal.r2 r4 = r3.f3140e     // Catch:{ all -> 0x00a6 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a6 }
            r1.<init>()     // Catch:{ all -> 0x00a6 }
            java.lang.String r2 = "The Opener shouldn't null in state:"
            r1.append(r2)     // Catch:{ all -> 0x00a6 }
            androidx.camera.camera2.internal.CaptureSession$State r2 = r3.f3147l     // Catch:{ all -> 0x00a6 }
            r1.append(r2)     // Catch:{ all -> 0x00a6 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00a6 }
            androidx.core.util.C18001r.m81776m(r4, r1)     // Catch:{ all -> 0x00a6 }
            androidx.camera.camera2.internal.r2 r4 = r3.f3140e     // Catch:{ all -> 0x00a6 }
            boolean r4 = r4.mo4642e()     // Catch:{ all -> 0x00a6 }
            if (r4 == 0) goto L_0x0051
            r3.mo4186g()     // Catch:{ all -> 0x00a6 }
            goto L_0x009f
        L_0x0051:
            com.google.common.util.concurrent.a<java.lang.Void> r4 = r3.f3148m     // Catch:{ all -> 0x00a6 }
            if (r4 != 0) goto L_0x0060
            androidx.camera.camera2.internal.j1 r4 = new androidx.camera.camera2.internal.j1     // Catch:{ all -> 0x00a6 }
            r4.<init>(r3)     // Catch:{ all -> 0x00a6 }
            com.google.common.util.concurrent.a r4 = androidx.concurrent.futures.CallbackToFutureAdapter.m74987a(r4)     // Catch:{ all -> 0x00a6 }
            r3.f3148m = r4     // Catch:{ all -> 0x00a6 }
        L_0x0060:
            com.google.common.util.concurrent.a<java.lang.Void> r4 = r3.f3148m     // Catch:{ all -> 0x00a6 }
            monitor-exit(r0)     // Catch:{ all -> 0x00a6 }
            return r4
        L_0x0064:
            androidx.camera.camera2.internal.r2 r4 = r3.f3140e     // Catch:{ all -> 0x00a6 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a6 }
            r1.<init>()     // Catch:{ all -> 0x00a6 }
            java.lang.String r2 = "The Opener shouldn't null in state:"
            r1.append(r2)     // Catch:{ all -> 0x00a6 }
            androidx.camera.camera2.internal.CaptureSession$State r2 = r3.f3147l     // Catch:{ all -> 0x00a6 }
            r1.append(r2)     // Catch:{ all -> 0x00a6 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00a6 }
            androidx.core.util.C18001r.m81776m(r4, r1)     // Catch:{ all -> 0x00a6 }
            androidx.camera.camera2.internal.r2 r4 = r3.f3140e     // Catch:{ all -> 0x00a6 }
            r4.mo4642e()     // Catch:{ all -> 0x00a6 }
        L_0x0081:
            androidx.camera.camera2.internal.CaptureSession$State r4 = androidx.camera.camera2.internal.CaptureSession.State.RELEASED     // Catch:{ all -> 0x00a6 }
            r3.f3147l = r4     // Catch:{ all -> 0x00a6 }
            goto L_0x009f
        L_0x0086:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00a6 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a6 }
            r1.<init>()     // Catch:{ all -> 0x00a6 }
            java.lang.String r2 = "release() should not be possible in state: "
            r1.append(r2)     // Catch:{ all -> 0x00a6 }
            androidx.camera.camera2.internal.CaptureSession$State r2 = r3.f3147l     // Catch:{ all -> 0x00a6 }
            r1.append(r2)     // Catch:{ all -> 0x00a6 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00a6 }
            r4.<init>(r1)     // Catch:{ all -> 0x00a6 }
            throw r4     // Catch:{ all -> 0x00a6 }
        L_0x009f:
            monitor-exit(r0)     // Catch:{ all -> 0x00a6 }
            r4 = 0
            com.google.common.util.concurrent.a r4 = androidx.camera.core.impl.utils.futures.C1548f.m6479h(r4)
            return r4
        L_0x00a6:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00a6 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.internal.CaptureSession.mo4196u(boolean):com.google.common.util.concurrent.a");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005c, code lost:
        return;
     */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo4197v(androidx.camera.core.impl.SessionConfig r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f3136a
            monitor-enter(r0)
            int[] r1 = androidx.camera.camera2.internal.CaptureSession.C1021c.f3162a     // Catch:{ all -> 0x005d }
            androidx.camera.camera2.internal.CaptureSession$State r2 = r3.f3147l     // Catch:{ all -> 0x005d }
            int r2 = r2.ordinal()     // Catch:{ all -> 0x005d }
            r1 = r1[r2]     // Catch:{ all -> 0x005d }
            switch(r1) {
                case 1: goto L_0x0042;
                case 2: goto L_0x003f;
                case 3: goto L_0x003f;
                case 4: goto L_0x003f;
                case 5: goto L_0x0019;
                case 6: goto L_0x0011;
                case 7: goto L_0x0011;
                case 8: goto L_0x0011;
                default: goto L_0x0010;
            }     // Catch:{ all -> 0x005d }
        L_0x0010:
            goto L_0x005b
        L_0x0011:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch:{ all -> 0x005d }
            java.lang.String r1 = "Session configuration cannot be set on a closed/released session."
            r4.<init>(r1)     // Catch:{ all -> 0x005d }
            throw r4     // Catch:{ all -> 0x005d }
        L_0x0019:
            r3.f3142g = r4     // Catch:{ all -> 0x005d }
            java.util.Map<androidx.camera.core.impl.DeferrableSurface, android.view.Surface> r1 = r3.f3145j     // Catch:{ all -> 0x005d }
            java.util.Set r1 = r1.keySet()     // Catch:{ all -> 0x005d }
            java.util.List r4 = r4.mo5151i()     // Catch:{ all -> 0x005d }
            boolean r4 = r1.containsAll(r4)     // Catch:{ all -> 0x005d }
            if (r4 != 0) goto L_0x0034
            java.lang.String r4 = "CaptureSession"
            java.lang.String r1 = "Does not have the proper configured lists"
            androidx.camera.core.C1417i2.m5913c(r4, r1)     // Catch:{ all -> 0x005d }
            monitor-exit(r0)     // Catch:{ all -> 0x005d }
            return
        L_0x0034:
            java.lang.String r4 = "CaptureSession"
            java.lang.String r1 = "Attempting to submit CaptureRequest after setting"
            androidx.camera.core.C1417i2.m5911a(r4, r1)     // Catch:{ all -> 0x005d }
            r3.mo4193n()     // Catch:{ all -> 0x005d }
            goto L_0x005b
        L_0x003f:
            r3.f3142g = r4     // Catch:{ all -> 0x005d }
            goto L_0x005b
        L_0x0042:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch:{ all -> 0x005d }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x005d }
            r1.<init>()     // Catch:{ all -> 0x005d }
            java.lang.String r2 = "setSessionConfig() should not be possible in state: "
            r1.append(r2)     // Catch:{ all -> 0x005d }
            androidx.camera.camera2.internal.CaptureSession$State r2 = r3.f3147l     // Catch:{ all -> 0x005d }
            r1.append(r2)     // Catch:{ all -> 0x005d }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x005d }
            r4.<init>(r1)     // Catch:{ all -> 0x005d }
            throw r4     // Catch:{ all -> 0x005d }
        L_0x005b:
            monitor-exit(r0)     // Catch:{ all -> 0x005d }
            return
        L_0x005d:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x005d }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.internal.CaptureSession.mo4197v(androidx.camera.core.impl.SessionConfig):void");
    }

    /* renamed from: w */
    public List<C1583y> mo4198w(List<C1583y> list) {
        ArrayList arrayList = new ArrayList();
        for (C1583y k : list) {
            C1583y.C1584a k2 = C1583y.C1584a.m6553k(k);
            k2.mo5569s(1);
            for (DeferrableSurface f : this.f3142g.mo5148f().mo5549d()) {
                k2.mo5558f(f);
            }
            arrayList.add(k2.mo5560h());
        }
        return arrayList;
    }
}
