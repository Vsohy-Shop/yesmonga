package androidx.camera.view;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.util.Size;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.camera.core.C1417i2;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.utils.executor.C1525a;
import androidx.camera.core.impl.utils.futures.C1544c;
import androidx.camera.core.impl.utils.futures.C1548f;
import androidx.camera.view.C1822u;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.content.C17318d;
import androidx.core.util.C18001r;
import com.google.common.util.concurrent.C32487a;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: androidx.camera.view.i0 */
public final class C1793i0 extends C1822u {

    /* renamed from: m */
    public static final String f4941m = "TextureViewImpl";

    /* renamed from: e */
    public TextureView f4942e;

    /* renamed from: f */
    public SurfaceTexture f4943f;

    /* renamed from: g */
    public C32487a<SurfaceRequest.C1340e> f4944g;

    /* renamed from: h */
    public SurfaceRequest f4945h;

    /* renamed from: i */
    public boolean f4946i = false;

    /* renamed from: j */
    public SurfaceTexture f4947j;

    /* renamed from: k */
    public AtomicReference<CallbackToFutureAdapter.C16559a<Void>> f4948k = new AtomicReference<>();
    @C0363p0

    /* renamed from: l */
    public C1822u.C1823a f4949l;

    /* renamed from: androidx.camera.view.i0$a */
    public class C1794a implements TextureView.SurfaceTextureListener {

        /* renamed from: androidx.camera.view.i0$a$a */
        public class C1795a implements C1544c<SurfaceRequest.C1340e> {

            /* renamed from: a */
            public final /* synthetic */ SurfaceTexture f4951a;

            public C1795a(SurfaceTexture surfaceTexture) {
                this.f4951a = surfaceTexture;
            }

            /* renamed from: b */
            public void mo4161b(Throwable th) {
                throw new IllegalStateException("SurfaceReleaseFuture did not complete nicely.", th);
            }

            /* renamed from: c */
            public void mo4160a(SurfaceRequest.C1340e eVar) {
                boolean z;
                if (eVar.mo4938a() != 3) {
                    z = true;
                } else {
                    z = false;
                }
                C18001r.m81778o(z, "Unexpected result from SurfaceRequest. Surface was provided twice.");
                C1417i2.m5911a(C1793i0.f4941m, "SurfaceTexture about to manually be destroyed");
                this.f4951a.release();
                C1793i0 i0Var = C1793i0.this;
                if (i0Var.f4947j != null) {
                    i0Var.f4947j = null;
                }
            }
        }

        public C1794a() {
        }

        public void onSurfaceTextureAvailable(@C0359n0 SurfaceTexture surfaceTexture, int i, int i2) {
            C1417i2.m5911a(C1793i0.f4941m, "SurfaceTexture available. Size: " + i + "x" + i2);
            C1793i0 i0Var = C1793i0.this;
            i0Var.f4943f = surfaceTexture;
            if (i0Var.f4944g != null) {
                C18001r.m81775l(i0Var.f4945h);
                C1417i2.m5911a(C1793i0.f4941m, "Surface invalidated " + C1793i0.this.f4945h);
                C1793i0.this.f4945h.mo4927l().mo5136c();
                return;
            }
            i0Var.mo5943u();
        }

        public boolean onSurfaceTextureDestroyed(@C0359n0 SurfaceTexture surfaceTexture) {
            C1793i0 i0Var = C1793i0.this;
            i0Var.f4943f = null;
            C32487a<SurfaceRequest.C1340e> aVar = i0Var.f4944g;
            if (aVar != null) {
                C1548f.m6473b(aVar, new C1795a(surfaceTexture), C17318d.m79729l(C1793i0.this.f4942e.getContext()));
                C1793i0.this.f4947j = surfaceTexture;
                return false;
            }
            C1417i2.m5911a(C1793i0.f4941m, "SurfaceTexture about to be destroyed");
            return true;
        }

        public void onSurfaceTextureSizeChanged(@C0359n0 SurfaceTexture surfaceTexture, int i, int i2) {
            C1417i2.m5911a(C1793i0.f4941m, "SurfaceTexture size changed: " + i + "x" + i2);
        }

        public void onSurfaceTextureUpdated(@C0359n0 SurfaceTexture surfaceTexture) {
            CallbackToFutureAdapter.C16559a andSet = C1793i0.this.f4948k.getAndSet((Object) null);
            if (andSet != null) {
                andSet.mo48125c(null);
            }
        }
    }

    public C1793i0(@C0359n0 FrameLayout frameLayout, @C0359n0 C1811o oVar) {
        super(frameLayout, oVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public /* synthetic */ void m7165o(SurfaceRequest surfaceRequest) {
        SurfaceRequest surfaceRequest2 = this.f4945h;
        if (surfaceRequest2 != null && surfaceRequest2 == surfaceRequest) {
            this.f4945h = null;
            this.f4944g = null;
        }
        mo5941s();
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public /* synthetic */ Object m7166p(Surface surface, CallbackToFutureAdapter.C16559a aVar) throws Exception {
        C1417i2.m5911a(f4941m, "Surface set on Preview.");
        SurfaceRequest surfaceRequest = this.f4945h;
        Executor a = C1525a.m6437a();
        Objects.requireNonNull(aVar);
        surfaceRequest.mo4930w(surface, a, new C1789g0(aVar));
        return "provideSurface[request=" + this.f4945h + " surface=" + surface + "]";
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ void m7167q(Surface surface, C32487a aVar, SurfaceRequest surfaceRequest) {
        C1417i2.m5911a(f4941m, "Safe to release surface.");
        mo5941s();
        surface.release();
        if (this.f4944g == aVar) {
            this.f4944g = null;
        }
        if (this.f4945h == surfaceRequest) {
            this.f4945h = null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public /* synthetic */ Object m7168r(CallbackToFutureAdapter.C16559a aVar) throws Exception {
        this.f4948k.set(aVar);
        return "textureViewImpl_waitForNextFrame";
    }

    @C0363p0
    /* renamed from: b */
    public View mo5843b() {
        return this.f4942e;
    }

    @C0363p0
    /* renamed from: c */
    public Bitmap mo5844c() {
        TextureView textureView = this.f4942e;
        if (textureView == null || !textureView.isAvailable()) {
            return null;
        }
        return this.f4942e.getBitmap();
    }

    /* renamed from: d */
    public void mo5845d() {
        C18001r.m81775l(this.f5009b);
        C18001r.m81775l(this.f5008a);
        TextureView textureView = new TextureView(this.f5009b.getContext());
        this.f4942e = textureView;
        textureView.setLayoutParams(new FrameLayout.LayoutParams(this.f5008a.getWidth(), this.f5008a.getHeight()));
        this.f4942e.setSurfaceTextureListener(new C1794a());
        this.f5009b.removeAllViews();
        this.f5009b.addView(this.f4942e);
    }

    /* renamed from: e */
    public void mo5846e() {
        mo5942t();
    }

    /* renamed from: f */
    public void mo5847f() {
        this.f4946i = true;
    }

    /* renamed from: h */
    public void mo5848h(@C0359n0 SurfaceRequest surfaceRequest, @C0363p0 C1822u.C1823a aVar) {
        this.f5008a = surfaceRequest.mo4928m();
        this.f4949l = aVar;
        mo5845d();
        SurfaceRequest surfaceRequest2 = this.f4945h;
        if (surfaceRequest2 != null) {
            surfaceRequest2.mo4933z();
        }
        this.f4945h = surfaceRequest;
        surfaceRequest.mo4924i(C17318d.m79729l(this.f4942e.getContext()), new C1791h0(this, surfaceRequest));
        mo5943u();
    }

    @C0359n0
    /* renamed from: j */
    public C32487a<Void> mo5849j() {
        return CallbackToFutureAdapter.m74987a(new C1787f0(this));
    }

    /* renamed from: s */
    public final void mo5941s() {
        C1822u.C1823a aVar = this.f4949l;
        if (aVar != null) {
            aVar.mo5978a();
            this.f4949l = null;
        }
    }

    /* renamed from: t */
    public final void mo5942t() {
        SurfaceTexture surfaceTexture;
        if (this.f4946i && this.f4947j != null && this.f4942e.getSurfaceTexture() != (surfaceTexture = this.f4947j)) {
            this.f4942e.setSurfaceTexture(surfaceTexture);
            this.f4947j = null;
            this.f4946i = false;
        }
    }

    /* renamed from: u */
    public void mo5943u() {
        SurfaceTexture surfaceTexture;
        Size size = this.f5008a;
        if (size != null && (surfaceTexture = this.f4943f) != null && this.f4945h != null) {
            surfaceTexture.setDefaultBufferSize(size.getWidth(), this.f5008a.getHeight());
            Surface surface = new Surface(this.f4943f);
            SurfaceRequest surfaceRequest = this.f4945h;
            C32487a<SurfaceRequest.C1340e> a = CallbackToFutureAdapter.m74987a(new C1783d0(this, surface));
            this.f4944g = a;
            a.mo5489q(new C1785e0(this, surface, a, surfaceRequest), C17318d.m79729l(this.f4942e.getContext()));
            mo5998g();
        }
    }
}
