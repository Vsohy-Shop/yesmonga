package androidx.camera.view;

import android.graphics.Bitmap;
import android.os.Handler;
import android.util.Size;
import android.view.PixelCopy;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.C0341g1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import androidx.camera.core.C1417i2;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.utils.futures.C1548f;
import androidx.camera.view.C1822u;
import androidx.core.content.C17318d;
import androidx.core.util.C18001r;
import com.google.common.util.concurrent.C32487a;

/* renamed from: androidx.camera.view.b0 */
public final class C1768b0 extends C1822u {

    /* renamed from: h */
    public static final String f4864h = "SurfaceViewImpl";

    /* renamed from: e */
    public SurfaceView f4865e;

    /* renamed from: f */
    public final C1770b f4866f = new C1770b();
    @C0363p0

    /* renamed from: g */
    public C1822u.C1823a f4867g;

    @C0376v0(24)
    /* renamed from: androidx.camera.view.b0$a */
    public static class C1769a {
        @C0373u
        /* renamed from: a */
        public static void m7057a(@C0359n0 SurfaceView surfaceView, @C0359n0 Bitmap bitmap, @C0359n0 PixelCopy.OnPixelCopyFinishedListener onPixelCopyFinishedListener, @C0359n0 Handler handler) {
            PixelCopy.request(surfaceView, bitmap, onPixelCopyFinishedListener, handler);
        }
    }

    /* renamed from: androidx.camera.view.b0$b */
    public class C1770b implements SurfaceHolder.Callback {
        @C0363p0

        /* renamed from: a */
        public Size f4868a;
        @C0363p0

        /* renamed from: b */
        public SurfaceRequest f4869b;
        @C0363p0

        /* renamed from: c */
        public Size f4870c;

        /* renamed from: d */
        public boolean f4871d = false;

        public C1770b() {
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public /* synthetic */ void m7059e(SurfaceRequest.C1340e eVar) {
            C1417i2.m5911a(C1768b0.f4864h, "Safe to release surface.");
            C1768b0.this.mo5850o();
        }

        /* renamed from: b */
        public final boolean mo5851b() {
            Size size;
            if (this.f4871d || this.f4869b == null || (size = this.f4868a) == null || !size.equals(this.f4870c)) {
                return false;
            }
            return true;
        }

        @C0341g1
        /* renamed from: c */
        public final void mo5852c() {
            if (this.f4869b != null) {
                C1417i2.m5911a(C1768b0.f4864h, "Request canceled: " + this.f4869b);
                this.f4869b.mo4933z();
            }
        }

        @C0341g1
        /* renamed from: d */
        public final void mo5853d() {
            if (this.f4869b != null) {
                C1417i2.m5911a(C1768b0.f4864h, "Surface invalidated " + this.f4869b);
                this.f4869b.mo4927l().mo5136c();
            }
        }

        @C0341g1
        /* renamed from: f */
        public void mo5854f(@C0359n0 SurfaceRequest surfaceRequest) {
            mo5852c();
            this.f4869b = surfaceRequest;
            Size m = surfaceRequest.mo4928m();
            this.f4868a = m;
            this.f4871d = false;
            if (!mo5855g()) {
                C1417i2.m5911a(C1768b0.f4864h, "Wait for new Surface creation.");
                C1768b0.this.f4865e.getHolder().setFixedSize(m.getWidth(), m.getHeight());
            }
        }

        @C0341g1
        /* renamed from: g */
        public final boolean mo5855g() {
            Surface surface = C1768b0.this.f4865e.getHolder().getSurface();
            if (!mo5851b()) {
                return false;
            }
            C1417i2.m5911a(C1768b0.f4864h, "Surface set on Preview.");
            this.f4869b.mo4930w(surface, C17318d.m79729l(C1768b0.this.f4865e.getContext()), new C1772c0(this));
            this.f4871d = true;
            C1768b0.this.mo5998g();
            return true;
        }

        public void surfaceChanged(@C0359n0 SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            C1417i2.m5911a(C1768b0.f4864h, "Surface changed. Size: " + i2 + "x" + i3);
            this.f4870c = new Size(i2, i3);
            mo5855g();
        }

        public void surfaceCreated(@C0359n0 SurfaceHolder surfaceHolder) {
            C1417i2.m5911a(C1768b0.f4864h, "Surface created.");
        }

        public void surfaceDestroyed(@C0359n0 SurfaceHolder surfaceHolder) {
            C1417i2.m5911a(C1768b0.f4864h, "Surface destroyed.");
            if (this.f4871d) {
                mo5853d();
            } else {
                mo5852c();
            }
            this.f4871d = false;
            this.f4869b = null;
            this.f4870c = null;
            this.f4868a = null;
        }
    }

    public C1768b0(@C0359n0 FrameLayout frameLayout, @C0359n0 C1811o oVar) {
        super(frameLayout, oVar);
    }

    /* renamed from: m */
    public static /* synthetic */ void m7047m(int i) {
        if (i == 0) {
            C1417i2.m5911a(f4864h, "PreviewView.SurfaceViewImplementation.getBitmap() succeeded");
            return;
        }
        C1417i2.m5913c(f4864h, "PreviewView.SurfaceViewImplementation.getBitmap() failed with error " + i);
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public /* synthetic */ void m7048n(SurfaceRequest surfaceRequest) {
        this.f4866f.mo5854f(surfaceRequest);
    }

    @C0363p0
    /* renamed from: b */
    public View mo5843b() {
        return this.f4865e;
    }

    @C0363p0
    @C0376v0(24)
    /* renamed from: c */
    public Bitmap mo5844c() {
        SurfaceView surfaceView = this.f4865e;
        if (surfaceView == null || surfaceView.getHolder().getSurface() == null || !this.f4865e.getHolder().getSurface().isValid()) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(this.f4865e.getWidth(), this.f4865e.getHeight(), Bitmap.Config.ARGB_8888);
        C1769a.m7057a(this.f4865e, createBitmap, new C1766a0(), this.f4865e.getHandler());
        return createBitmap;
    }

    /* renamed from: d */
    public void mo5845d() {
        C18001r.m81775l(this.f5009b);
        C18001r.m81775l(this.f5008a);
        SurfaceView surfaceView = new SurfaceView(this.f5009b.getContext());
        this.f4865e = surfaceView;
        surfaceView.setLayoutParams(new FrameLayout.LayoutParams(this.f5008a.getWidth(), this.f5008a.getHeight()));
        this.f5009b.removeAllViews();
        this.f5009b.addView(this.f4865e);
        this.f4865e.getHolder().addCallback(this.f4866f);
    }

    /* renamed from: e */
    public void mo5846e() {
    }

    /* renamed from: f */
    public void mo5847f() {
    }

    /* renamed from: h */
    public void mo5848h(@C0359n0 SurfaceRequest surfaceRequest, @C0363p0 C1822u.C1823a aVar) {
        this.f5008a = surfaceRequest.mo4928m();
        this.f4867g = aVar;
        mo5845d();
        surfaceRequest.mo4924i(C17318d.m79729l(this.f4865e.getContext()), new C1846y(this));
        this.f4865e.post(new C1847z(this, surfaceRequest));
    }

    @C0359n0
    /* renamed from: j */
    public C32487a<Void> mo5849j() {
        return C1548f.m6479h(null);
    }

    /* renamed from: o */
    public void mo5850o() {
        C1822u.C1823a aVar = this.f4867g;
        if (aVar != null) {
            aVar.mo5978a();
            this.f4867g = null;
        }
    }
}
