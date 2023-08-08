package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.fragment.app.FragmentManager;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: androidx.fragment.app.q */
public class C19264q {
    @C0359n0

    /* renamed from: a */
    public final CopyOnWriteArrayList<C19265a> f49585a = new CopyOnWriteArrayList<>();
    @C0359n0

    /* renamed from: b */
    public final FragmentManager f49586b;

    /* renamed from: androidx.fragment.app.q$a */
    public static final class C19265a {
        @C0359n0

        /* renamed from: a */
        public final FragmentManager.C19180m f49587a;

        /* renamed from: b */
        public final boolean f49588b;

        public C19265a(@C0359n0 FragmentManager.C19180m mVar, boolean z) {
            this.f49587a = mVar;
            this.f49588b = z;
        }
    }

    public C19264q(@C0359n0 FragmentManager fragmentManager) {
        this.f49586b = fragmentManager;
    }

    /* renamed from: a */
    public void mo57349a(@C0359n0 Fragment fragment, @C0363p0 Bundle bundle, boolean z) {
        Fragment M0 = this.f49586b.mo56819M0();
        if (M0 != null) {
            M0.getParentFragmentManager().mo56816L0().mo57349a(fragment, bundle, true);
        }
        Iterator<C19265a> it = this.f49585a.iterator();
        while (it.hasNext()) {
            C19265a next = it.next();
            if (!z || next.f49588b) {
                next.f49587a.mo56947d(this.f49586b, fragment, bundle);
            }
        }
    }

    /* renamed from: b */
    public void mo57350b(@C0359n0 Fragment fragment, boolean z) {
        Context k = this.f49586b.mo56810J0().mo57316k();
        Fragment M0 = this.f49586b.mo56819M0();
        if (M0 != null) {
            M0.getParentFragmentManager().mo56816L0().mo57350b(fragment, true);
        }
        Iterator<C19265a> it = this.f49585a.iterator();
        while (it.hasNext()) {
            C19265a next = it.next();
            if (!z || next.f49588b) {
                next.f49587a.mo56948e(this.f49586b, fragment, k);
            }
        }
    }

    /* renamed from: c */
    public void mo57351c(@C0359n0 Fragment fragment, @C0363p0 Bundle bundle, boolean z) {
        Fragment M0 = this.f49586b.mo56819M0();
        if (M0 != null) {
            M0.getParentFragmentManager().mo56816L0().mo57351c(fragment, bundle, true);
        }
        Iterator<C19265a> it = this.f49585a.iterator();
        while (it.hasNext()) {
            C19265a next = it.next();
            if (!z || next.f49588b) {
                next.f49587a.mo56949f(this.f49586b, fragment, bundle);
            }
        }
    }

    /* renamed from: d */
    public void mo57352d(@C0359n0 Fragment fragment, boolean z) {
        Fragment M0 = this.f49586b.mo56819M0();
        if (M0 != null) {
            M0.getParentFragmentManager().mo56816L0().mo57352d(fragment, true);
        }
        Iterator<C19265a> it = this.f49585a.iterator();
        while (it.hasNext()) {
            C19265a next = it.next();
            if (!z || next.f49588b) {
                next.f49587a.mo56950h(this.f49586b, fragment);
            }
        }
    }

    /* renamed from: e */
    public void mo57353e(@C0359n0 Fragment fragment, boolean z) {
        Fragment M0 = this.f49586b.mo56819M0();
        if (M0 != null) {
            M0.getParentFragmentManager().mo56816L0().mo57353e(fragment, true);
        }
        Iterator<C19265a> it = this.f49585a.iterator();
        while (it.hasNext()) {
            C19265a next = it.next();
            if (!z || next.f49588b) {
                next.f49587a.mo56951i(this.f49586b, fragment);
            }
        }
    }

    /* renamed from: f */
    public void mo57354f(@C0359n0 Fragment fragment, boolean z) {
        Fragment M0 = this.f49586b.mo56819M0();
        if (M0 != null) {
            M0.getParentFragmentManager().mo56816L0().mo57354f(fragment, true);
        }
        Iterator<C19265a> it = this.f49585a.iterator();
        while (it.hasNext()) {
            C19265a next = it.next();
            if (!z || next.f49588b) {
                next.f49587a.mo56952j(this.f49586b, fragment);
            }
        }
    }

    /* renamed from: g */
    public void mo57355g(@C0359n0 Fragment fragment, boolean z) {
        Context k = this.f49586b.mo56810J0().mo57316k();
        Fragment M0 = this.f49586b.mo56819M0();
        if (M0 != null) {
            M0.getParentFragmentManager().mo56816L0().mo57355g(fragment, true);
        }
        Iterator<C19265a> it = this.f49585a.iterator();
        while (it.hasNext()) {
            C19265a next = it.next();
            if (!z || next.f49588b) {
                next.f49587a.mo35285k(this.f49586b, fragment, k);
            }
        }
    }

    /* renamed from: h */
    public void mo57356h(@C0359n0 Fragment fragment, @C0363p0 Bundle bundle, boolean z) {
        Fragment M0 = this.f49586b.mo56819M0();
        if (M0 != null) {
            M0.getParentFragmentManager().mo56816L0().mo57356h(fragment, bundle, true);
        }
        Iterator<C19265a> it = this.f49585a.iterator();
        while (it.hasNext()) {
            C19265a next = it.next();
            if (!z || next.f49588b) {
                next.f49587a.mo56953l(this.f49586b, fragment, bundle);
            }
        }
    }

    /* renamed from: i */
    public void mo57357i(@C0359n0 Fragment fragment, boolean z) {
        Fragment M0 = this.f49586b.mo56819M0();
        if (M0 != null) {
            M0.getParentFragmentManager().mo56816L0().mo57357i(fragment, true);
        }
        Iterator<C19265a> it = this.f49585a.iterator();
        while (it.hasNext()) {
            C19265a next = it.next();
            if (!z || next.f49588b) {
                next.f49587a.mo35286m(this.f49586b, fragment);
            }
        }
    }

    /* renamed from: j */
    public void mo57358j(@C0359n0 Fragment fragment, @C0359n0 Bundle bundle, boolean z) {
        Fragment M0 = this.f49586b.mo56819M0();
        if (M0 != null) {
            M0.getParentFragmentManager().mo56816L0().mo57358j(fragment, bundle, true);
        }
        Iterator<C19265a> it = this.f49585a.iterator();
        while (it.hasNext()) {
            C19265a next = it.next();
            if (!z || next.f49588b) {
                next.f49587a.mo56954n(this.f49586b, fragment, bundle);
            }
        }
    }

    /* renamed from: k */
    public void mo57359k(@C0359n0 Fragment fragment, boolean z) {
        Fragment M0 = this.f49586b.mo56819M0();
        if (M0 != null) {
            M0.getParentFragmentManager().mo56816L0().mo57359k(fragment, true);
        }
        Iterator<C19265a> it = this.f49585a.iterator();
        while (it.hasNext()) {
            C19265a next = it.next();
            if (!z || next.f49588b) {
                next.f49587a.mo35287o(this.f49586b, fragment);
            }
        }
    }

    /* renamed from: l */
    public void mo57360l(@C0359n0 Fragment fragment, boolean z) {
        Fragment M0 = this.f49586b.mo56819M0();
        if (M0 != null) {
            M0.getParentFragmentManager().mo56816L0().mo57360l(fragment, true);
        }
        Iterator<C19265a> it = this.f49585a.iterator();
        while (it.hasNext()) {
            C19265a next = it.next();
            if (!z || next.f49588b) {
                next.f49587a.mo56955p(this.f49586b, fragment);
            }
        }
    }

    /* renamed from: m */
    public void mo57361m(@C0359n0 Fragment fragment, @C0359n0 View view, @C0363p0 Bundle bundle, boolean z) {
        Fragment M0 = this.f49586b.mo56819M0();
        if (M0 != null) {
            M0.getParentFragmentManager().mo56816L0().mo57361m(fragment, view, bundle, true);
        }
        Iterator<C19265a> it = this.f49585a.iterator();
        while (it.hasNext()) {
            C19265a next = it.next();
            if (!z || next.f49588b) {
                next.f49587a.mo56956q(this.f49586b, fragment, view, bundle);
            }
        }
    }

    /* renamed from: n */
    public void mo57362n(@C0359n0 Fragment fragment, boolean z) {
        Fragment M0 = this.f49586b.mo56819M0();
        if (M0 != null) {
            M0.getParentFragmentManager().mo56816L0().mo57362n(fragment, true);
        }
        Iterator<C19265a> it = this.f49585a.iterator();
        while (it.hasNext()) {
            C19265a next = it.next();
            if (!z || next.f49588b) {
                next.f49587a.mo56957r(this.f49586b, fragment);
            }
        }
    }

    /* renamed from: o */
    public void mo57363o(@C0359n0 FragmentManager.C19180m mVar, boolean z) {
        this.f49585a.add(new C19265a(mVar, z));
    }

    /* renamed from: p */
    public void mo57364p(@C0359n0 FragmentManager.C19180m mVar) {
        synchronized (this.f49585a) {
            int size = this.f49585a.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                } else if (this.f49585a.get(i).f49587a == mVar) {
                    this.f49585a.remove(i);
                    break;
                } else {
                    i++;
                }
            }
        }
    }
}
