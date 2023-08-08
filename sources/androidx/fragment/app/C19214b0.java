package androidx.fragment.app;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager.widget.C20784a;
import com.google.firebase.installations.C33124s;

@Deprecated
/* renamed from: androidx.fragment.app.b0 */
public abstract class C19214b0 extends C20784a {

    /* renamed from: j */
    public static final String f49415j = "FragmentPagerAdapter";

    /* renamed from: k */
    public static final boolean f49416k = false;
    @Deprecated

    /* renamed from: l */
    public static final int f49417l = 0;

    /* renamed from: m */
    public static final int f49418m = 1;

    /* renamed from: e */
    public final FragmentManager f49419e;

    /* renamed from: f */
    public final int f49420f;

    /* renamed from: g */
    public C19234h0 f49421g;

    /* renamed from: h */
    public Fragment f49422h;

    /* renamed from: i */
    public boolean f49423i;

    @Deprecated
    public C19214b0(@C0359n0 FragmentManager fragmentManager) {
        this(fragmentManager, 0);
    }

    /* renamed from: x */
    public static String m90022x(int i, long j) {
        return "android:switcher:" + i + C33124s.f80355c + j;
    }

    /* renamed from: b */
    public void mo21372b(@C0359n0 ViewGroup viewGroup, int i, @C0359n0 Object obj) {
        Fragment fragment = (Fragment) obj;
        if (this.f49421g == null) {
            this.f49421g = this.f49419e.mo56909u();
        }
        this.f49421g.mo57057v(fragment);
        if (fragment.equals(this.f49422h)) {
            this.f49422h = null;
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: d */
    public void mo57088d(@C0359n0 ViewGroup viewGroup) {
        C19234h0 h0Var = this.f49421g;
        if (h0Var != null) {
            if (!this.f49423i) {
                try {
                    this.f49423i = true;
                    h0Var.mo57055t();
                    this.f49423i = false;
                } catch (Throwable th) {
                    this.f49423i = false;
                    throw th;
                }
            }
            this.f49421g = null;
        }
    }

    @C0359n0
    /* renamed from: j */
    public Object mo21374j(@C0359n0 ViewGroup viewGroup, int i) {
        if (this.f49421g == null) {
            this.f49421g = this.f49419e.mo56909u();
        }
        long w = mo57094w(i);
        Fragment s0 = this.f49419e.mo56903s0(m90022x(viewGroup.getId(), w));
        if (s0 != null) {
            this.f49421g.mo57226p(s0);
        } else {
            s0 = mo57093v(i);
            this.f49421g.mo57217g(viewGroup.getId(), s0, m90022x(viewGroup.getId(), w));
        }
        if (s0 != this.f49422h) {
            s0.setMenuVisibility(false);
            if (this.f49420f == 1) {
                this.f49421g.mo57039O(s0, Lifecycle.State.STARTED);
            } else {
                s0.setUserVisibleHint(false);
            }
        }
        return s0;
    }

    /* renamed from: k */
    public boolean mo21375k(@C0359n0 View view, @C0359n0 Object obj) {
        return ((Fragment) obj).getView() == view;
    }

    /* renamed from: n */
    public void mo57089n(@C0363p0 Parcelable parcelable, @C0363p0 ClassLoader classLoader) {
    }

    @C0363p0
    /* renamed from: o */
    public Parcelable mo57090o() {
        return null;
    }

    /* renamed from: q */
    public void mo57091q(@C0359n0 ViewGroup viewGroup, int i, @C0359n0 Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.f49422h;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                if (this.f49420f == 1) {
                    if (this.f49421g == null) {
                        this.f49421g = this.f49419e.mo56909u();
                    }
                    this.f49421g.mo57039O(this.f49422h, Lifecycle.State.STARTED);
                } else {
                    this.f49422h.setUserVisibleHint(false);
                }
            }
            fragment.setMenuVisibility(true);
            if (this.f49420f == 1) {
                if (this.f49421g == null) {
                    this.f49421g = this.f49419e.mo56909u();
                }
                this.f49421g.mo57039O(fragment, Lifecycle.State.RESUMED);
            } else {
                fragment.setUserVisibleHint(true);
            }
            this.f49422h = fragment;
        }
    }

    /* renamed from: t */
    public void mo57092t(@C0359n0 ViewGroup viewGroup) {
        if (viewGroup.getId() == -1) {
            throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
        }
    }

    @C0359n0
    /* renamed from: v */
    public abstract Fragment mo57093v(int i);

    /* renamed from: w */
    public long mo57094w(int i) {
        return (long) i;
    }

    public C19214b0(@C0359n0 FragmentManager fragmentManager, int i) {
        this.f49421g = null;
        this.f49422h = null;
        this.f49419e = fragmentManager;
        this.f49420f = i;
    }
}
