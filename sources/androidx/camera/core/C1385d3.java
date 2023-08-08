package androidx.camera.core;

import android.util.SparseArray;
import androidx.annotation.C0323b0;
import androidx.annotation.C0359n0;
import androidx.camera.core.impl.C1497q0;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.google.common.util.concurrent.C32487a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: androidx.camera.core.d3 */
public final class C1385d3 implements C1497q0 {

    /* renamed from: a */
    public final Object f4020a = new Object();
    @C0323b0("mLock")

    /* renamed from: b */
    public final SparseArray<CallbackToFutureAdapter.C16559a<C1353a2>> f4021b = new SparseArray<>();
    @C0323b0("mLock")

    /* renamed from: c */
    public final SparseArray<C32487a<C1353a2>> f4022c = new SparseArray<>();
    @C0323b0("mLock")

    /* renamed from: d */
    public final List<C1353a2> f4023d = new ArrayList();

    /* renamed from: e */
    public final List<Integer> f4024e;

    /* renamed from: f */
    public String f4025f;
    @C0323b0("mLock")

    /* renamed from: g */
    public boolean f4026g = false;

    /* renamed from: androidx.camera.core.d3$a */
    public class C1386a implements CallbackToFutureAdapter.C16560b<C1353a2> {

        /* renamed from: a */
        public final /* synthetic */ int f4027a;

        public C1386a(int i) {
            this.f4027a = i;
        }

        /* renamed from: a */
        public Object mo4001a(@C0359n0 CallbackToFutureAdapter.C16559a<C1353a2> aVar) {
            synchronized (C1385d3.this.f4020a) {
                C1385d3.this.f4021b.put(this.f4027a, aVar);
            }
            return "getImageProxy(id: " + this.f4027a + ")";
        }
    }

    public C1385d3(List<Integer> list, String str) {
        this.f4024e = list;
        this.f4025f = str;
        mo5086f();
    }

    @C0359n0
    /* renamed from: a */
    public List<Integer> mo5081a() {
        return Collections.unmodifiableList(this.f4024e);
    }

    @C0359n0
    /* renamed from: b */
    public C32487a<C1353a2> mo5082b(int i) {
        C32487a<C1353a2> aVar;
        synchronized (this.f4020a) {
            if (!this.f4026g) {
                aVar = this.f4022c.get(i);
                if (aVar == null) {
                    throw new IllegalArgumentException("ImageProxyBundle does not contain this id: " + i);
                }
            } else {
                throw new IllegalStateException("ImageProxyBundle already closed.");
            }
        }
        return aVar;
    }

    /* renamed from: c */
    public void mo5083c(C1353a2 a2Var) {
        synchronized (this.f4020a) {
            if (!this.f4026g) {
                Integer d = a2Var.mo4977q3().mo5101b().mo5239d(this.f4025f);
                if (d != null) {
                    CallbackToFutureAdapter.C16559a aVar = this.f4021b.get(d.intValue());
                    if (aVar != null) {
                        this.f4023d.add(a2Var);
                        aVar.mo48125c(a2Var);
                        return;
                    }
                    throw new IllegalArgumentException("ImageProxyBundle does not contain this id: " + d);
                }
                throw new IllegalArgumentException("CaptureId is null.");
            }
        }
    }

    /* renamed from: d */
    public void mo5084d() {
        synchronized (this.f4020a) {
            if (!this.f4026g) {
                for (C1353a2 close : this.f4023d) {
                    close.close();
                }
                this.f4023d.clear();
                this.f4022c.clear();
                this.f4021b.clear();
                this.f4026g = true;
            }
        }
    }

    /* renamed from: e */
    public void mo5085e() {
        synchronized (this.f4020a) {
            if (!this.f4026g) {
                for (C1353a2 close : this.f4023d) {
                    close.close();
                }
                this.f4023d.clear();
                this.f4022c.clear();
                this.f4021b.clear();
                mo5086f();
            }
        }
    }

    /* renamed from: f */
    public final void mo5086f() {
        synchronized (this.f4020a) {
            for (Integer intValue : this.f4024e) {
                int intValue2 = intValue.intValue();
                this.f4022c.put(intValue2, CallbackToFutureAdapter.m74987a(new C1386a(intValue2)));
            }
        }
    }
}
