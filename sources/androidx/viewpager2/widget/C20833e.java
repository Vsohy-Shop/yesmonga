package androidx.viewpager2.widget;

import android.view.View;
import android.view.ViewParent;
import androidx.annotation.C0359n0;
import androidx.annotation.C0372t0;
import androidx.core.util.C18001r;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

/* renamed from: androidx.viewpager2.widget.e */
public final class C20833e implements ViewPager2.C20823m {

    /* renamed from: a */
    public final int f53871a;

    public C20833e(@C0372t0 int i) {
        C18001r.m81773j(i, "Margin must be non-negative");
        this.f53871a = i;
    }

    /* renamed from: a */
    public void mo62526a(@C0359n0 View view, float f) {
        ViewPager2 b = mo62545b(view);
        float f2 = ((float) this.f53871a) * f;
        if (b.getOrientation() == 0) {
            if (b.mo62466k()) {
                f2 = -f2;
            }
            view.setTranslationX(f2);
            return;
        }
        view.setTranslationY(f2);
    }

    /* renamed from: b */
    public final ViewPager2 mo62545b(@C0359n0 View view) {
        ViewParent parent = view.getParent();
        ViewParent parent2 = parent.getParent();
        if ((parent instanceof RecyclerView) && (parent2 instanceof ViewPager2)) {
            return (ViewPager2) parent2;
        }
        throw new IllegalStateException("Expected the page view to be managed by a ViewPager2 instance.");
    }
}
