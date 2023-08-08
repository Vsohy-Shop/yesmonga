package androidx.compose.foundation.layout;

import android.os.Build;
import android.view.View;
import androidx.core.view.C18147d4;
import androidx.core.view.C18414x1;
import androidx.core.view.C18436z4;
import com.bumptech.glide.load.engine.executor.C22218a;
import com.google.android.gms.analytics.ecommerce.C40383c;
import com.usabilla.sdk.ubform.net.C9851c;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.foundation.layout.v */
public final class C2413v extends C18147d4.C18149b implements Runnable, C18414x1, View.OnAttachStateChangeListener {
    @C12579k

    /* renamed from: e */
    public final WindowInsetsHolder f6358e;

    /* renamed from: f */
    public boolean f6359f;

    /* renamed from: g */
    public boolean f6360g;
    @C12580l

    /* renamed from: v */
    public C18436z4 f6361v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2413v(@C12579k WindowInsetsHolder windowInsetsHolder) {
        super(windowInsetsHolder.mo7892f() ^ true ? 1 : 0);
        Intrinsics.checkNotNullParameter(windowInsetsHolder, "composeInsets");
        this.f6358e = windowInsetsHolder;
    }

    @C12579k
    /* renamed from: a */
    public C18436z4 mo1193a(@C12579k View view, @C12579k C18436z4 z4Var) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        Intrinsics.checkNotNullParameter(z4Var, "insets");
        this.f6361v = z4Var;
        this.f6358e.mo7888C(z4Var);
        if (this.f6359f) {
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (!this.f6360g) {
            this.f6358e.mo7887B(z4Var);
            WindowInsetsHolder.m10178A(this.f6358e, z4Var, 0, 2, (Object) null);
        }
        if (!this.f6358e.mo7892f()) {
            return z4Var;
        }
        C18436z4 z4Var2 = C18436z4.f47103c;
        Intrinsics.checkNotNullExpressionValue(z4Var2, "CONSUMED");
        return z4Var2;
    }

    /* renamed from: d */
    public void mo8198d(@C12579k C18147d4 d4Var) {
        Intrinsics.checkNotNullParameter(d4Var, C22218a.f57069g);
        this.f6359f = false;
        this.f6360g = false;
        C18436z4 z4Var = this.f6361v;
        if (!(d4Var.mo52812b() == 0 || z4Var == null)) {
            this.f6358e.mo7887B(z4Var);
            this.f6358e.mo7888C(z4Var);
            WindowInsetsHolder.m10178A(this.f6358e, z4Var, 0, 2, (Object) null);
        }
        this.f6361v = null;
        super.mo8198d(d4Var);
    }

    /* renamed from: e */
    public void mo8199e(@C12579k C18147d4 d4Var) {
        Intrinsics.checkNotNullParameter(d4Var, C22218a.f57069g);
        this.f6359f = true;
        this.f6360g = true;
        super.mo8199e(d4Var);
    }

    @C12579k
    /* renamed from: f */
    public C18436z4 mo8200f(@C12579k C18436z4 z4Var, @C12579k List<C18147d4> list) {
        Intrinsics.checkNotNullParameter(z4Var, "insets");
        Intrinsics.checkNotNullParameter(list, "runningAnimations");
        WindowInsetsHolder.m10178A(this.f6358e, z4Var, 0, 2, (Object) null);
        if (!this.f6358e.mo7892f()) {
            return z4Var;
        }
        C18436z4 z4Var2 = C18436z4.f47103c;
        Intrinsics.checkNotNullExpressionValue(z4Var2, "CONSUMED");
        return z4Var2;
    }

    @C12579k
    /* renamed from: g */
    public C18147d4.C18148a mo8201g(@C12579k C18147d4 d4Var, @C12579k C18147d4.C18148a aVar) {
        Intrinsics.checkNotNullParameter(d4Var, C22218a.f57069g);
        Intrinsics.checkNotNullParameter(aVar, "bounds");
        this.f6359f = false;
        C18147d4.C18148a g = super.mo8201g(d4Var, aVar);
        Intrinsics.checkNotNullExpressionValue(g, "super.onStart(animation, bounds)");
        return g;
    }

    @C12579k
    /* renamed from: h */
    public final WindowInsetsHolder mo8202h() {
        return this.f6358e;
    }

    /* renamed from: i */
    public final boolean mo8203i() {
        return this.f6359f;
    }

    /* renamed from: j */
    public final boolean mo8204j() {
        return this.f6360g;
    }

    @C12580l
    /* renamed from: k */
    public final C18436z4 mo8205k() {
        return this.f6361v;
    }

    /* renamed from: l */
    public final void mo8206l(boolean z) {
        this.f6359f = z;
    }

    /* renamed from: m */
    public final void mo8207m(boolean z) {
        this.f6360g = z;
    }

    /* renamed from: n */
    public final void mo8208n(@C12580l C18436z4 z4Var) {
        this.f6361v = z4Var;
    }

    public void onViewAttachedToWindow(@C12579k View view) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        view.requestApplyInsets();
    }

    public void onViewDetachedFromWindow(@C12579k View view) {
        Intrinsics.checkNotNullParameter(view, C9851c.f26937h);
    }

    public void run() {
        if (this.f6359f) {
            this.f6359f = false;
            this.f6360g = false;
            C18436z4 z4Var = this.f6361v;
            if (z4Var != null) {
                this.f6358e.mo7887B(z4Var);
                WindowInsetsHolder.m10178A(this.f6358e, z4Var, 0, 2, (Object) null);
                this.f6361v = null;
            }
        }
    }
}
