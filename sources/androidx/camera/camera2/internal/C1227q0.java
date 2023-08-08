package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Pair;
import androidx.annotation.C0323b0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.experimental.C0335b;
import androidx.camera.camera2.internal.compat.C1073h;
import androidx.camera.camera2.internal.compat.quirk.C1136d;
import androidx.camera.camera2.interop.C1292l;
import androidx.camera.camera2.interop.C1298p;
import androidx.camera.core.C1403f4;
import androidx.camera.core.C1410h0;
import androidx.camera.core.C1417i2;
import androidx.camera.core.C1636l0;
import androidx.camera.core.C1641m;
import androidx.camera.core.impl.C1448f;
import androidx.camera.core.impl.C1450f1;
import androidx.camera.core.impl.C1496q;
import androidx.core.util.C18001r;
import androidx.lifecycle.C19406e0;
import androidx.lifecycle.C19426h0;
import androidx.lifecycle.LiveData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

@C0335b(markerClass = C1298p.class)
/* renamed from: androidx.camera.camera2.internal.q0 */
public final class C1227q0 implements C1496q {

    /* renamed from: n */
    public static final String f3513n = "Camera2CameraInfo";

    /* renamed from: e */
    public final String f3514e;

    /* renamed from: f */
    public final C1073h f3515f;

    /* renamed from: g */
    public final C1292l f3516g;

    /* renamed from: h */
    public final Object f3517h = new Object();
    @C0363p0
    @C0323b0("mLock")

    /* renamed from: i */
    public C1254v f3518i;
    @C0363p0
    @C0323b0("mLock")

    /* renamed from: j */
    public C1228a<Integer> f3519j = null;
    @C0363p0
    @C0323b0("mLock")

    /* renamed from: k */
    public C1228a<C1403f4> f3520k = null;
    @C0363p0
    @C0323b0("mLock")

    /* renamed from: l */
    public List<Pair<C1448f, Executor>> f3521l = null;
    @C0359n0

    /* renamed from: m */
    public final C1450f1 f3522m;

    /* renamed from: androidx.camera.camera2.internal.q0$a */
    public static class C1228a<T> extends C19406e0<T> {

        /* renamed from: n */
        public LiveData<T> f3523n;

        /* renamed from: o */
        public T f3524o;

        public C1228a(T t) {
            this.f3524o = t;
        }

        /* renamed from: f */
        public T mo4610f() {
            LiveData<T> liveData = this.f3523n;
            return liveData == null ? this.f3524o : liveData.mo4610f();
        }

        /* renamed from: s */
        public <S> void mo4611s(@C0359n0 LiveData<S> liveData, @C0359n0 C19426h0<? super S> h0Var) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: u */
        public void mo4612u(@C0359n0 LiveData<T> liveData) {
            LiveData<T> liveData2 = this.f3523n;
            if (liveData2 != null) {
                super.mo57571t(liveData2);
            }
            this.f3523n = liveData;
            super.mo4611s(liveData, new C1223p0(this));
        }
    }

    public C1227q0(@C0359n0 String str, @C0359n0 C1073h hVar) {
        this.f3514e = (String) C18001r.m81775l(str);
        this.f3515f = hVar;
        this.f3516g = new C1292l(this);
        this.f3522m = C1136d.m4833a(str, hVar);
    }

    /* renamed from: a */
    public int mo4591a() {
        return mo4601k(0);
    }

    @C0359n0
    /* renamed from: b */
    public String mo4592b() {
        return this.f3514e;
    }

    /* renamed from: c */
    public void mo4593c(@C0359n0 Executor executor, @C0359n0 C1448f fVar) {
        synchronized (this.f3517h) {
            C1254v vVar = this.f3518i;
            if (vVar == null) {
                if (this.f3521l == null) {
                    this.f3521l = new ArrayList();
                }
                this.f3521l.add(new Pair(fVar, executor));
                return;
            }
            vVar.mo4655C(executor, fVar);
        }
    }

    @C0363p0
    /* renamed from: d */
    public Integer mo4594d() {
        Integer num = (Integer) this.f3515f.mo4323a(CameraCharacteristics.LENS_FACING);
        C18001r.m81775l(num);
        int intValue = num.intValue();
        if (intValue == 0) {
            return 0;
        }
        if (intValue != 1) {
            return null;
        }
        return 1;
    }

    /* renamed from: e */
    public boolean mo4595e() {
        Boolean bool = (Boolean) this.f3515f.mo4323a(CameraCharacteristics.FLASH_INFO_AVAILABLE);
        C18001r.m81775l(bool);
        return bool.booleanValue();
    }

    @C0359n0
    /* renamed from: f */
    public C1450f1 mo4596f() {
        return this.f3522m;
    }

    /* renamed from: g */
    public void mo4597g(@C0359n0 C1448f fVar) {
        synchronized (this.f3517h) {
            C1254v vVar = this.f3518i;
            if (vVar == null) {
                List<Pair<C1448f, Executor>> list = this.f3521l;
                if (list != null) {
                    Iterator<Pair<C1448f, Executor>> it = list.iterator();
                    while (it.hasNext()) {
                        if (it.next().first == fVar) {
                            it.remove();
                        }
                    }
                    return;
                }
                return;
            }
            vVar.mo4685i0(fVar);
        }
    }

    @C0359n0
    /* renamed from: h */
    public LiveData<Integer> mo4598h() {
        synchronized (this.f3517h) {
            C1254v vVar = this.f3518i;
            if (vVar == null) {
                if (this.f3519j == null) {
                    this.f3519j = new C1228a<>(0);
                }
                C1228a<Integer> aVar = this.f3519j;
                return aVar;
            }
            C1228a<Integer> aVar2 = this.f3519j;
            if (aVar2 != null) {
                return aVar2;
            }
            LiveData<Integer> e = vVar.mo4669Q().mo4710e();
            return e;
        }
    }

    @C0359n0
    @C1410h0
    /* renamed from: i */
    public C1636l0 mo4599i() {
        synchronized (this.f3517h) {
            C1254v vVar = this.f3518i;
            if (vVar == null) {
                C1636l0 e = C1236r1.m5103e(this.f3515f);
                return e;
            }
            C1636l0 f = vVar.mo4661I().mo4634f();
            return f;
        }
    }

    @C0359n0
    /* renamed from: j */
    public String mo4600j() {
        return mo4606p() == 2 ? C1641m.f4592c : C1641m.f4591b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0017, code lost:
        if (1 == r1.intValue()) goto L_0x001b;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo4601k(int r4) {
        /*
            r3 = this;
            int r0 = r3.mo4605o()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r4 = androidx.camera.core.impl.utils.C1515c.m6375c(r4)
            java.lang.Integer r1 = r3.mo4594d()
            if (r1 == 0) goto L_0x001a
            int r1 = r1.intValue()
            r2 = 1
            if (r2 != r1) goto L_0x001a
            goto L_0x001b
        L_0x001a:
            r2 = 0
        L_0x001b:
            int r0 = r0.intValue()
            int r4 = androidx.camera.core.impl.utils.C1515c.m6374b(r4, r0, r2)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.internal.C1227q0.mo4601k(int):int");
    }

    @C0359n0
    /* renamed from: l */
    public LiveData<C1403f4> mo4602l() {
        synchronized (this.f3517h) {
            C1254v vVar = this.f3518i;
            if (vVar == null) {
                if (this.f3520k == null) {
                    this.f3520k = new C1228a<>(C1029a3.m4530h(this.f3515f));
                }
                C1228a<C1403f4> aVar = this.f3520k;
                return aVar;
            }
            C1228a<C1403f4> aVar2 = this.f3520k;
            if (aVar2 != null) {
                return aVar2;
            }
            LiveData<C1403f4> i = vVar.mo4671S().mo4223i();
            return i;
        }
    }

    @C0359n0
    /* renamed from: m */
    public C1292l mo4603m() {
        return this.f3516g;
    }

    @C0359n0
    /* renamed from: n */
    public C1073h mo4604n() {
        return this.f3515f;
    }

    /* renamed from: o */
    public int mo4605o() {
        Integer num = (Integer) this.f3515f.mo4323a(CameraCharacteristics.SENSOR_ORIENTATION);
        C18001r.m81775l(num);
        return num.intValue();
    }

    /* renamed from: p */
    public int mo4606p() {
        Integer num = (Integer) this.f3515f.mo4323a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        C18001r.m81775l(num);
        return num.intValue();
    }

    /* renamed from: q */
    public void mo4607q(@C0359n0 C1254v vVar) {
        synchronized (this.f3517h) {
            this.f3518i = vVar;
            C1228a<C1403f4> aVar = this.f3520k;
            if (aVar != null) {
                aVar.mo4612u(vVar.mo4671S().mo4223i());
            }
            C1228a<Integer> aVar2 = this.f3519j;
            if (aVar2 != null) {
                aVar2.mo4612u(this.f3518i.mo4669Q().mo4710e());
            }
            List<Pair<C1448f, Executor>> list = this.f3521l;
            if (list != null) {
                for (Pair next : list) {
                    this.f3518i.mo4655C((Executor) next.second, (C1448f) next.first);
                }
                this.f3521l = null;
            }
        }
        mo4608r();
    }

    /* renamed from: r */
    public final void mo4608r() {
        mo4609s();
    }

    /* renamed from: s */
    public final void mo4609s() {
        String str;
        int p = mo4606p();
        if (p == 0) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_LIMITED";
        } else if (p == 1) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_FULL";
        } else if (p == 2) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_LEGACY";
        } else if (p == 3) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_3";
        } else if (p != 4) {
            str = "Unknown value: " + p;
        } else {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_EXTERNAL";
        }
        C1417i2.m5915e(f3513n, "Device Level: " + str);
    }
}
