package androidx.camera.view;

import androidx.annotation.C0323b0;
import androidx.annotation.C0353k0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.camera.core.C1417i2;
import androidx.camera.core.C1641m;
import androidx.camera.core.impl.C1432a1;
import androidx.camera.core.impl.C1448f;
import androidx.camera.core.impl.C1456h;
import androidx.camera.core.impl.C1496q;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.utils.executor.C1525a;
import androidx.camera.core.impl.utils.futures.C1544c;
import androidx.camera.core.impl.utils.futures.C1545d;
import androidx.camera.core.impl.utils.futures.C1548f;
import androidx.camera.view.PreviewView;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.lifecycle.C19423g0;
import com.google.common.util.concurrent.C32487a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.camera.view.n */
public final class C1808n implements C1432a1.C1433a<CameraInternal.State> {

    /* renamed from: g */
    public static final String f4968g = "StreamStateObserver";

    /* renamed from: a */
    public final C1496q f4969a;

    /* renamed from: b */
    public final C19423g0<PreviewView.StreamState> f4970b;
    @C0323b0("this")

    /* renamed from: c */
    public PreviewView.StreamState f4971c;

    /* renamed from: d */
    public final C1822u f4972d;

    /* renamed from: e */
    public C32487a<Void> f4973e;

    /* renamed from: f */
    public boolean f4974f = false;

    /* renamed from: androidx.camera.view.n$a */
    public class C1809a implements C1544c<Void> {

        /* renamed from: a */
        public final /* synthetic */ List f4975a;

        /* renamed from: b */
        public final /* synthetic */ C1641m f4976b;

        public C1809a(List list, C1641m mVar) {
            this.f4975a = list;
            this.f4976b = mVar;
        }

        /* renamed from: b */
        public void mo4161b(Throwable th) {
            C1808n.this.f4973e = null;
            if (!this.f4975a.isEmpty()) {
                for (C1448f g : this.f4975a) {
                    ((C1496q) this.f4976b).mo4597g(g);
                }
                this.f4975a.clear();
            }
        }

        /* renamed from: c */
        public void mo4160a(@C0363p0 Void voidR) {
            C1808n.this.f4973e = null;
        }
    }

    /* renamed from: androidx.camera.view.n$b */
    public class C1810b extends C1448f {

        /* renamed from: a */
        public final /* synthetic */ CallbackToFutureAdapter.C16559a f4978a;

        /* renamed from: b */
        public final /* synthetic */ C1641m f4979b;

        public C1810b(CallbackToFutureAdapter.C16559a aVar, C1641m mVar) {
            this.f4978a = aVar;
            this.f4979b = mVar;
        }

        /* renamed from: b */
        public void mo4263b(@C0359n0 C1456h hVar) {
            this.f4978a.mo48125c(null);
            ((C1496q) this.f4979b).mo4597g(this);
        }
    }

    public C1808n(C1496q qVar, C19423g0<PreviewView.StreamState> g0Var, C1822u uVar) {
        this.f4969a = qVar;
        this.f4970b = g0Var;
        this.f4972d = uVar;
        synchronized (this) {
            this.f4971c = g0Var.mo4610f();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ C32487a m7211g(Void voidR) throws Exception {
        return this.f4972d.mo5849j();
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ Void m7212h(Void voidR) {
        mo5958l(PreviewView.StreamState.STREAMING);
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ Object m7213i(C1641m mVar, List list, CallbackToFutureAdapter.C16559a aVar) throws Exception {
        C1810b bVar = new C1810b(aVar, mVar);
        list.add(bVar);
        ((C1496q) mVar).mo4593c(C1525a.m6437a(), bVar);
        return "waitForCaptureResult";
    }

    /* renamed from: e */
    public final void mo5954e() {
        C32487a<Void> aVar = this.f4973e;
        if (aVar != null) {
            aVar.cancel(false);
            this.f4973e = null;
        }
    }

    /* renamed from: f */
    public void mo5955f() {
        mo5954e();
    }

    @C0353k0
    /* renamed from: j */
    public void mo5189a(@C0363p0 CameraInternal.State state) {
        if (state == CameraInternal.State.CLOSING || state == CameraInternal.State.CLOSED || state == CameraInternal.State.RELEASING || state == CameraInternal.State.RELEASED) {
            mo5958l(PreviewView.StreamState.IDLE);
            if (this.f4974f) {
                this.f4974f = false;
                mo5954e();
            }
        } else if ((state == CameraInternal.State.OPENING || state == CameraInternal.State.OPEN || state == CameraInternal.State.PENDING_OPEN) && !this.f4974f) {
            mo5957k(this.f4969a);
            this.f4974f = true;
        }
    }

    @C0353k0
    /* renamed from: k */
    public final void mo5957k(C1641m mVar) {
        mo5958l(PreviewView.StreamState.IDLE);
        ArrayList arrayList = new ArrayList();
        C1545d<T> e = C1545d.m6463b(mo5959m(mVar, arrayList)).mo5486f(new C1804k(this), C1525a.m6437a()).mo5485e(new C1806l(this), C1525a.m6437a());
        this.f4973e = e;
        C1548f.m6473b(e, new C1809a(arrayList, mVar), C1525a.m6437a());
    }

    /* renamed from: l */
    public void mo5958l(PreviewView.StreamState streamState) {
        synchronized (this) {
            if (!this.f4971c.equals(streamState)) {
                this.f4971c = streamState;
                C1417i2.m5911a(f4968g, "Update Preview stream state to " + streamState);
                this.f4970b.mo57493o(streamState);
            }
        }
    }

    /* renamed from: m */
    public final C32487a<Void> mo5959m(C1641m mVar, List<C1448f> list) {
        return CallbackToFutureAdapter.m74987a(new C1807m(this, mVar, list));
    }

    @C0353k0
    public void onError(@C0359n0 Throwable th) {
        mo5955f();
        mo5958l(PreviewView.StreamState.IDLE);
    }
}
