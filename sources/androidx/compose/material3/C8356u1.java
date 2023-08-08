package androidx.compose.material3;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.gms.analytics.ecommerce.C40383c;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.material3.u1 */
public final class C8356u1 implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {
    @C12579k

    /* renamed from: a */
    public final View f22433a;
    @C12579k

    /* renamed from: b */
    public final C11289a<C11079d2> f22434b;

    /* renamed from: c */
    public boolean f22435c;

    public C8356u1(@C12579k View view, @C12579k C11289a<C11079d2> aVar) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        Intrinsics.checkNotNullParameter(aVar, "onGlobalLayoutCallback");
        this.f22433a = view;
        this.f22434b = aVar;
        view.addOnAttachStateChangeListener(this);
        mo14729b();
    }

    /* renamed from: a */
    public final void mo14728a() {
        mo14730c();
        this.f22433a.removeOnAttachStateChangeListener(this);
    }

    /* renamed from: b */
    public final void mo14729b() {
        if (!this.f22435c && this.f22433a.isAttachedToWindow()) {
            this.f22433a.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.f22435c = true;
        }
    }

    /* renamed from: c */
    public final void mo14730c() {
        if (this.f22435c) {
            this.f22433a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.f22435c = false;
        }
    }

    public void onGlobalLayout() {
        this.f22434b.invoke();
    }

    public void onViewAttachedToWindow(@C12579k View view) {
        Intrinsics.checkNotNullParameter(view, "p0");
        mo14729b();
    }

    public void onViewDetachedFromWindow(@C12579k View view) {
        Intrinsics.checkNotNullParameter(view, "p0");
        mo14730c();
    }
}
