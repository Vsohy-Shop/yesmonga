package androidx.camera.camera2.internal.compat.params;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.InputConfiguration;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.os.Build;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;
import androidx.annotation.RestrictTo;
import androidx.camera.camera2.internal.compat.C1083l;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

@C0376v0(21)
/* renamed from: androidx.camera.camera2.internal.compat.params.z */
public final class C1122z {

    /* renamed from: b */
    public static final int f3331b = 0;

    /* renamed from: c */
    public static final int f3332c = 1;

    /* renamed from: a */
    public final C1125c f3333a;

    /* renamed from: androidx.camera.camera2.internal.compat.params.z$b */
    public static final class C1124b implements C1125c {

        /* renamed from: a */
        public final List<C1096d> f3336a;

        /* renamed from: b */
        public final CameraCaptureSession.StateCallback f3337b;

        /* renamed from: c */
        public final Executor f3338c;

        /* renamed from: d */
        public int f3339d;

        /* renamed from: e */
        public C1089a f3340e = null;

        /* renamed from: f */
        public CaptureRequest f3341f = null;

        public C1124b(int i, @C0359n0 List<C1096d> list, @C0359n0 Executor executor, @C0359n0 CameraCaptureSession.StateCallback stateCallback) {
            this.f3339d = i;
            this.f3336a = Collections.unmodifiableList(new ArrayList(list));
            this.f3337b = stateCallback;
            this.f3338c = executor;
        }

        /* renamed from: a */
        public Executor mo4397a() {
            return this.f3338c;
        }

        @C0363p0
        /* renamed from: b */
        public C1089a mo4398b() {
            return this.f3340e;
        }

        /* renamed from: c */
        public void mo4399c(@C0359n0 C1089a aVar) {
            if (this.f3339d != 1) {
                this.f3340e = aVar;
                return;
            }
            throw new UnsupportedOperationException("Method not supported for high speed session types");
        }

        /* renamed from: d */
        public CaptureRequest mo4400d() {
            return this.f3341f;
        }

        /* renamed from: e */
        public List<C1096d> mo4401e() {
            return this.f3336a;
        }

        public boolean equals(@C0363p0 Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C1124b) {
                C1124b bVar = (C1124b) obj;
                if (Objects.equals(this.f3340e, bVar.f3340e) && this.f3339d == bVar.f3339d && this.f3336a.size() == bVar.f3336a.size()) {
                    for (int i = 0; i < this.f3336a.size(); i++) {
                        if (!this.f3336a.get(i).equals(bVar.f3336a.get(i))) {
                            return false;
                        }
                    }
                    return true;
                }
            }
            return false;
        }

        /* renamed from: f */
        public CameraCaptureSession.StateCallback mo4403f() {
            return this.f3337b;
        }

        @C0363p0
        /* renamed from: g */
        public Object mo4404g() {
            return null;
        }

        /* renamed from: h */
        public int mo4405h() {
            return this.f3339d;
        }

        public int hashCode() {
            int i;
            int hashCode = this.f3336a.hashCode() ^ 31;
            int i2 = (hashCode << 5) - hashCode;
            C1089a aVar = this.f3340e;
            if (aVar == null) {
                i = 0;
            } else {
                i = aVar.hashCode();
            }
            int i3 = i ^ i2;
            return this.f3339d ^ ((i3 << 5) - i3);
        }

        /* renamed from: i */
        public void mo4407i(CaptureRequest captureRequest) {
            this.f3341f = captureRequest;
        }
    }

    /* renamed from: androidx.camera.camera2.internal.compat.params.z$c */
    public interface C1125c {
        /* renamed from: a */
        Executor mo4397a();

        /* renamed from: b */
        C1089a mo4398b();

        /* renamed from: c */
        void mo4399c(@C0359n0 C1089a aVar);

        /* renamed from: d */
        CaptureRequest mo4400d();

        /* renamed from: e */
        List<C1096d> mo4401e();

        /* renamed from: f */
        CameraCaptureSession.StateCallback mo4403f();

        @C0363p0
        /* renamed from: g */
        Object mo4404g();

        /* renamed from: h */
        int mo4405h();

        /* renamed from: i */
        void mo4407i(CaptureRequest captureRequest);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.camera.camera2.internal.compat.params.z$d */
    public @interface C1126d {
    }

    public C1122z(int i, @C0359n0 List<C1096d> list, @C0359n0 Executor executor, @C0359n0 CameraCaptureSession.StateCallback stateCallback) {
        if (Build.VERSION.SDK_INT < 28) {
            this.f3333a = new C1124b(i, list, executor, stateCallback);
        } else {
            this.f3333a = new C1123a(i, list, executor, stateCallback);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @C0376v0(24)
    /* renamed from: i */
    public static List<OutputConfiguration> m4770i(@C0359n0 List<C1096d> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (C1096d j : list) {
            arrayList.add((OutputConfiguration) j.mo4366j());
        }
        return arrayList;
    }

    @C0376v0(24)
    /* renamed from: j */
    public static List<C1096d> m4771j(@C0359n0 List<OutputConfiguration> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (OutputConfiguration k : list) {
            arrayList.add(C1096d.m4691k(k));
        }
        return arrayList;
    }

    @C0363p0
    /* renamed from: l */
    public static C1122z m4772l(@C0363p0 Object obj) {
        if (obj != null && Build.VERSION.SDK_INT >= 28) {
            return new C1122z(new C1123a(obj));
        }
        return null;
    }

    /* renamed from: a */
    public Executor mo4386a() {
        return this.f3333a.mo4397a();
    }

    /* renamed from: b */
    public C1089a mo4387b() {
        return this.f3333a.mo4398b();
    }

    /* renamed from: c */
    public List<C1096d> mo4388c() {
        return this.f3333a.mo4401e();
    }

    /* renamed from: d */
    public CaptureRequest mo4389d() {
        return this.f3333a.mo4400d();
    }

    /* renamed from: e */
    public int mo4390e() {
        return this.f3333a.mo4405h();
    }

    public boolean equals(@C0363p0 Object obj) {
        if (!(obj instanceof C1122z)) {
            return false;
        }
        return this.f3333a.equals(((C1122z) obj).f3333a);
    }

    /* renamed from: f */
    public CameraCaptureSession.StateCallback mo4392f() {
        return this.f3333a.mo4403f();
    }

    /* renamed from: g */
    public void mo4393g(@C0359n0 C1089a aVar) {
        this.f3333a.mo4399c(aVar);
    }

    /* renamed from: h */
    public void mo4394h(CaptureRequest captureRequest) {
        this.f3333a.mo4407i(captureRequest);
    }

    public int hashCode() {
        return this.f3333a.hashCode();
    }

    @C0363p0
    /* renamed from: k */
    public Object mo4396k() {
        return this.f3333a.mo4404g();
    }

    @C0376v0(28)
    /* renamed from: androidx.camera.camera2.internal.compat.params.z$a */
    public static final class C1123a implements C1125c {

        /* renamed from: a */
        public final SessionConfiguration f3334a;

        /* renamed from: b */
        public final List<C1096d> f3335b;

        public C1123a(@C0359n0 Object obj) {
            this.f3334a = C1083l.m4670a(obj);
            this.f3335b = Collections.unmodifiableList(C1122z.m4771j(C1083l.m4670a(obj).getOutputConfigurations()));
        }

        /* renamed from: a */
        public Executor mo4397a() {
            return this.f3334a.getExecutor();
        }

        /* renamed from: b */
        public C1089a mo4398b() {
            return C1089a.m4681e(this.f3334a.getInputConfiguration());
        }

        /* renamed from: c */
        public void mo4399c(@C0359n0 C1089a aVar) {
            this.f3334a.setInputConfiguration((InputConfiguration) aVar.mo4341d());
        }

        /* renamed from: d */
        public CaptureRequest mo4400d() {
            return this.f3334a.getSessionParameters();
        }

        /* renamed from: e */
        public List<C1096d> mo4401e() {
            return this.f3335b;
        }

        public boolean equals(@C0363p0 Object obj) {
            if (!(obj instanceof C1123a)) {
                return false;
            }
            return Objects.equals(this.f3334a, ((C1123a) obj).f3334a);
        }

        /* renamed from: f */
        public CameraCaptureSession.StateCallback mo4403f() {
            return this.f3334a.getStateCallback();
        }

        @C0363p0
        /* renamed from: g */
        public Object mo4404g() {
            return this.f3334a;
        }

        /* renamed from: h */
        public int mo4405h() {
            return this.f3334a.getSessionType();
        }

        public int hashCode() {
            return this.f3334a.hashCode();
        }

        /* renamed from: i */
        public void mo4407i(CaptureRequest captureRequest) {
            this.f3334a.setSessionParameters(captureRequest);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public C1123a(int i, @C0359n0 List<C1096d> list, @C0359n0 Executor executor, @C0359n0 CameraCaptureSession.StateCallback stateCallback) {
            this(C1121y.m4769a(i, C1122z.m4770i(list), executor, stateCallback));
            C1112p.m4760a();
        }
    }

    public C1122z(@C0359n0 C1125c cVar) {
        this.f3333a = cVar;
    }
}
