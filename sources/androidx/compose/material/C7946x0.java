package androidx.compose.material;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.gms.analytics.ecommerce.C40383c;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.material.x0 */
public final class C7946x0 implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {
    @C12579k

    /* renamed from: a */
    public final View f19119a;
    @C12579k

    /* renamed from: b */
    public final C11289a<C11079d2> f19120b;

    /* renamed from: c */
    public boolean f19121c;

    public C7946x0(@C12579k View view, @C12579k C11289a<C11079d2> aVar) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        Intrinsics.checkNotNullParameter(aVar, "onGlobalLayoutCallback");
        this.f19119a = view;
        this.f19120b = aVar;
        view.addOnAttachStateChangeListener(this);
        mo11107b();
    }

    /* renamed from: a */
    public final void mo11106a() {
        mo11108c();
        this.f19119a.removeOnAttachStateChangeListener(this);
    }

    /* renamed from: b */
    public final void mo11107b() {
        if (!this.f19121c && this.f19119a.isAttachedToWindow()) {
            this.f19119a.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.f19121c = true;
        }
    }

    /* renamed from: c */
    public final void mo11108c() {
        if (this.f19121c) {
            this.f19119a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.f19121c = false;
        }
    }

    public void onGlobalLayout() {
        this.f19120b.invoke();
    }

    public void onViewAttachedToWindow(@C12579k View view) {
        Intrinsics.checkNotNullParameter(view, "p0");
        mo11107b();
    }

    public void onViewDetachedFromWindow(@C12579k View view) {
        Intrinsics.checkNotNullParameter(view, "p0");
        mo11108c();
    }
}
