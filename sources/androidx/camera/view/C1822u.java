package androidx.camera.view;

import android.graphics.Bitmap;
import android.util.Size;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.camera.core.SurfaceRequest;
import com.google.common.util.concurrent.C32487a;

/* renamed from: androidx.camera.view.u */
public abstract class C1822u {
    @C0363p0

    /* renamed from: a */
    public Size f5008a;
    @C0359n0

    /* renamed from: b */
    public FrameLayout f5009b;
    @C0359n0

    /* renamed from: c */
    public final C1811o f5010c;

    /* renamed from: d */
    public boolean f5011d = false;

    /* renamed from: androidx.camera.view.u$a */
    public interface C1823a {
        /* renamed from: a */
        void mo5978a();
    }

    public C1822u(@C0359n0 FrameLayout frameLayout, @C0359n0 C1811o oVar) {
        this.f5009b = frameLayout;
        this.f5010c = oVar;
    }

    @C0363p0
    /* renamed from: a */
    public Bitmap mo5997a() {
        Bitmap c = mo5844c();
        if (c == null) {
            return null;
        }
        return this.f5010c.mo5961a(c, new Size(this.f5009b.getWidth(), this.f5009b.getHeight()), this.f5009b.getLayoutDirection());
    }

    @C0363p0
    /* renamed from: b */
    public abstract View mo5843b();

    @C0363p0
    /* renamed from: c */
    public abstract Bitmap mo5844c();

    /* renamed from: d */
    public abstract void mo5845d();

    /* renamed from: e */
    public abstract void mo5846e();

    /* renamed from: f */
    public abstract void mo5847f();

    /* renamed from: g */
    public void mo5998g() {
        this.f5011d = true;
        mo5999i();
    }

    /* renamed from: h */
    public abstract void mo5848h(@C0359n0 SurfaceRequest surfaceRequest, @C0363p0 C1823a aVar);

    /* renamed from: i */
    public void mo5999i() {
        View b = mo5843b();
        if (b != null && this.f5011d) {
            this.f5010c.mo5975q(new Size(this.f5009b.getWidth(), this.f5009b.getHeight()), this.f5009b.getLayoutDirection(), b);
        }
    }

    @C0359n0
    /* renamed from: j */
    public abstract C32487a<Void> mo5849j();
}
