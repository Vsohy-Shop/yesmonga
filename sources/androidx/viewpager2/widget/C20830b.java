package androidx.viewpager2.widget;

import androidx.annotation.C0359n0;
import androidx.annotation.C0372t0;
import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;

/* renamed from: androidx.viewpager2.widget.b */
public final class C20830b extends ViewPager2.C20817j {
    @C0359n0

    /* renamed from: a */
    public final List<ViewPager2.C20817j> f53861a;

    public C20830b(int i) {
        this.f53861a = new ArrayList(i);
    }

    /* renamed from: a */
    public void mo30665a(int i) {
        try {
            for (ViewPager2.C20817j a : this.f53861a) {
                a.mo30665a(i);
            }
        } catch (ConcurrentModificationException e) {
            mo62536f(e);
        }
    }

    /* renamed from: b */
    public void mo30666b(int i, float f, @C0372t0 int i2) {
        try {
            for (ViewPager2.C20817j b : this.f53861a) {
                b.mo30666b(i, f, i2);
            }
        } catch (ConcurrentModificationException e) {
            mo62536f(e);
        }
    }

    /* renamed from: c */
    public void mo30667c(int i) {
        try {
            for (ViewPager2.C20817j c : this.f53861a) {
                c.mo30667c(i);
            }
        } catch (ConcurrentModificationException e) {
            mo62536f(e);
        }
    }

    /* renamed from: d */
    public void mo62534d(ViewPager2.C20817j jVar) {
        this.f53861a.add(jVar);
    }

    /* renamed from: e */
    public void mo62535e(ViewPager2.C20817j jVar) {
        this.f53861a.remove(jVar);
    }

    /* renamed from: f */
    public final void mo62536f(ConcurrentModificationException concurrentModificationException) {
        throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", concurrentModificationException);
    }
}
