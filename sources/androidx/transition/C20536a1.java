package androidx.transition;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;
import androidx.annotation.C0359n0;
import androidx.annotation.C0376v0;

@C0376v0(18)
/* renamed from: androidx.transition.a1 */
public class C20536a1 implements C20551b1 {

    /* renamed from: a */
    public final ViewOverlay f52978a;

    public C20536a1(@C0359n0 View view) {
        this.f52978a = view.getOverlay();
    }

    /* renamed from: a */
    public void mo61604a(@C0359n0 Drawable drawable) {
        this.f52978a.add(drawable);
    }

    /* renamed from: b */
    public void mo61605b(@C0359n0 Drawable drawable) {
        this.f52978a.remove(drawable);
    }
}
