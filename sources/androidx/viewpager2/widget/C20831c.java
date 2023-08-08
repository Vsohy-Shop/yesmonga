package androidx.viewpager2.widget;

import android.view.View;
import androidx.annotation.C0359n0;
import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.viewpager2.widget.c */
public final class C20831c implements ViewPager2.C20823m {

    /* renamed from: a */
    public final List<ViewPager2.C20823m> f53862a = new ArrayList();

    /* renamed from: a */
    public void mo62526a(@C0359n0 View view, float f) {
        for (ViewPager2.C20823m a : this.f53862a) {
            a.mo62526a(view, f);
        }
    }

    /* renamed from: b */
    public void mo62537b(@C0359n0 ViewPager2.C20823m mVar) {
        this.f53862a.add(mVar);
    }

    /* renamed from: c */
    public void mo62538c(@C0359n0 ViewPager2.C20823m mVar) {
        this.f53862a.remove(mVar);
    }
}
