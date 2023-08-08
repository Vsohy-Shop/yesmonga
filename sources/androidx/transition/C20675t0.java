package androidx.transition;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;
import androidx.annotation.C0359n0;
import androidx.annotation.C0376v0;

@C0376v0(18)
/* renamed from: androidx.transition.t0 */
public class C20675t0 implements C20678u0 {

    /* renamed from: a */
    public final ViewGroupOverlay f53338a;

    public C20675t0(@C0359n0 ViewGroup viewGroup) {
        this.f53338a = viewGroup.getOverlay();
    }

    /* renamed from: a */
    public void mo61604a(@C0359n0 Drawable drawable) {
        this.f53338a.add(drawable);
    }

    /* renamed from: b */
    public void mo61605b(@C0359n0 Drawable drawable) {
        this.f53338a.remove(drawable);
    }

    /* renamed from: c */
    public void mo61892c(@C0359n0 View view) {
        this.f53338a.add(view);
    }

    /* renamed from: d */
    public void mo61893d(@C0359n0 View view) {
        this.f53338a.remove(view);
    }
}
