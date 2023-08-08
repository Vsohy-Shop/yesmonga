package androidx.viewpager2.widget;

import android.view.View;
import androidx.annotation.C0363p0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewpager2.widget.ViewPager2;
import java.util.Locale;

/* renamed from: androidx.viewpager2.widget.f */
public final class C20834f extends ViewPager2.C20817j {

    /* renamed from: a */
    public final LinearLayoutManager f53872a;

    /* renamed from: b */
    public ViewPager2.C20823m f53873b;

    public C20834f(LinearLayoutManager linearLayoutManager) {
        this.f53872a = linearLayoutManager;
    }

    /* renamed from: a */
    public void mo30665a(int i) {
    }

    /* renamed from: b */
    public void mo30666b(int i, float f, int i2) {
        if (this.f53873b != null) {
            float f2 = -f;
            int i3 = 0;
            while (i3 < this.f53872a.mo59922Y()) {
                View X = this.f53872a.mo59919X(i3);
                if (X != null) {
                    this.f53873b.mo62526a(X, ((float) (this.f53872a.mo59978u0(X) - i)) + f2);
                    i3++;
                } else {
                    throw new IllegalStateException(String.format(Locale.US, "LayoutManager returned a null child at pos %d/%d while transforming pages", new Object[]{Integer.valueOf(i3), Integer.valueOf(this.f53872a.mo59922Y())}));
                }
            }
        }
    }

    /* renamed from: c */
    public void mo30667c(int i) {
    }

    /* renamed from: d */
    public ViewPager2.C20823m mo62546d() {
        return this.f53873b;
    }

    /* renamed from: e */
    public void mo62547e(@C0363p0 ViewPager2.C20823m mVar) {
        this.f53873b = mVar;
    }
}
