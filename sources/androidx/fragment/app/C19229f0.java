package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager.widget.C20784a;
import com.bumptech.glide.gifdecoder.C22075f;
import java.util.ArrayList;

@Deprecated
/* renamed from: androidx.fragment.app.f0 */
public abstract class C19229f0 extends C20784a {

    /* renamed from: l */
    public static final String f49447l = "FragmentStatePagerAdapt";

    /* renamed from: m */
    public static final boolean f49448m = false;
    @Deprecated

    /* renamed from: n */
    public static final int f49449n = 0;

    /* renamed from: o */
    public static final int f49450o = 1;

    /* renamed from: e */
    public final FragmentManager f49451e;

    /* renamed from: f */
    public final int f49452f;

    /* renamed from: g */
    public C19234h0 f49453g;

    /* renamed from: h */
    public ArrayList<Fragment.SavedState> f49454h;

    /* renamed from: i */
    public ArrayList<Fragment> f49455i;

    /* renamed from: j */
    public Fragment f49456j;

    /* renamed from: k */
    public boolean f49457k;

    @Deprecated
    public C19229f0(@C0359n0 FragmentManager fragmentManager) {
        this(fragmentManager, 0);
    }

    /* renamed from: b */
    public void mo21372b(@C0359n0 ViewGroup viewGroup, int i, @C0359n0 Object obj) {
        Fragment.SavedState savedState;
        Fragment fragment = (Fragment) obj;
        if (this.f49453g == null) {
            this.f49453g = this.f49451e.mo56909u();
        }
        while (this.f49454h.size() <= i) {
            this.f49454h.add((Object) null);
        }
        ArrayList<Fragment.SavedState> arrayList = this.f49454h;
        if (fragment.isAdded()) {
            savedState = this.f49451e.mo56839T1(fragment);
        } else {
            savedState = null;
        }
        arrayList.set(i, savedState);
        this.f49455i.set(i, (Object) null);
        this.f49453g.mo57038B(fragment);
        if (fragment.equals(this.f49456j)) {
            this.f49456j = null;
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: d */
    public void mo57088d(@C0359n0 ViewGroup viewGroup) {
        C19234h0 h0Var = this.f49453g;
        if (h0Var != null) {
            if (!this.f49457k) {
                try {
                    this.f49457k = true;
                    h0Var.mo57055t();
                    this.f49457k = false;
                } catch (Throwable th) {
                    this.f49457k = false;
                    throw th;
                }
            }
            this.f49453g = null;
        }
    }

    @C0359n0
    /* renamed from: j */
    public Object mo21374j(@C0359n0 ViewGroup viewGroup, int i) {
        Fragment.SavedState savedState;
        Fragment fragment;
        if (this.f49455i.size() > i && (fragment = this.f49455i.get(i)) != null) {
            return fragment;
        }
        if (this.f49453g == null) {
            this.f49453g = this.f49451e.mo56909u();
        }
        Fragment v = mo57143v(i);
        if (this.f49454h.size() > i && (savedState = this.f49454h.get(i)) != null) {
            v.setInitialSavedState(savedState);
        }
        while (this.f49455i.size() <= i) {
            this.f49455i.add((Object) null);
        }
        v.setMenuVisibility(false);
        if (this.f49452f == 0) {
            v.setUserVisibleHint(false);
        }
        this.f49455i.set(i, v);
        this.f49453g.mo57216f(viewGroup.getId(), v);
        if (this.f49452f == 1) {
            this.f49453g.mo57039O(v, Lifecycle.State.STARTED);
        }
        return v;
    }

    /* renamed from: k */
    public boolean mo21375k(@C0359n0 View view, @C0359n0 Object obj) {
        return ((Fragment) obj).getView() == view;
    }

    /* renamed from: n */
    public void mo57089n(@C0363p0 Parcelable parcelable, @C0363p0 ClassLoader classLoader) {
        if (parcelable != null) {
            Bundle bundle = (Bundle) parcelable;
            bundle.setClassLoader(classLoader);
            Parcelable[] parcelableArray = bundle.getParcelableArray("states");
            this.f49454h.clear();
            this.f49455i.clear();
            if (parcelableArray != null) {
                for (Parcelable parcelable2 : parcelableArray) {
                    this.f49454h.add((Fragment.SavedState) parcelable2);
                }
            }
            for (String str : bundle.keySet()) {
                if (str.startsWith(C22075f.f56695A)) {
                    int parseInt = Integer.parseInt(str.substring(1));
                    Fragment E0 = this.f49451e.mo56795E0(bundle, str);
                    if (E0 != null) {
                        while (this.f49455i.size() <= parseInt) {
                            this.f49455i.add((Object) null);
                        }
                        E0.setMenuVisibility(false);
                        this.f49455i.set(parseInt, E0);
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Bad fragment at key ");
                        sb.append(str);
                    }
                }
            }
        }
    }

    @C0363p0
    /* renamed from: o */
    public Parcelable mo57090o() {
        Bundle bundle;
        if (this.f49454h.size() > 0) {
            bundle = new Bundle();
            Fragment.SavedState[] savedStateArr = new Fragment.SavedState[this.f49454h.size()];
            this.f49454h.toArray(savedStateArr);
            bundle.putParcelableArray("states", savedStateArr);
        } else {
            bundle = null;
        }
        for (int i = 0; i < this.f49455i.size(); i++) {
            Fragment fragment = this.f49455i.get(i);
            if (fragment != null && fragment.isAdded()) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                this.f49451e.mo56784A1(bundle, C22075f.f56695A + i, fragment);
            }
        }
        return bundle;
    }

    /* renamed from: q */
    public void mo57091q(@C0359n0 ViewGroup viewGroup, int i, @C0359n0 Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.f49456j;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                if (this.f49452f == 1) {
                    if (this.f49453g == null) {
                        this.f49453g = this.f49451e.mo56909u();
                    }
                    this.f49453g.mo57039O(this.f49456j, Lifecycle.State.STARTED);
                } else {
                    this.f49456j.setUserVisibleHint(false);
                }
            }
            fragment.setMenuVisibility(true);
            if (this.f49452f == 1) {
                if (this.f49453g == null) {
                    this.f49453g = this.f49451e.mo56909u();
                }
                this.f49453g.mo57039O(fragment, Lifecycle.State.RESUMED);
            } else {
                fragment.setUserVisibleHint(true);
            }
            this.f49456j = fragment;
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
    public abstract Fragment mo57143v(int i);

    public C19229f0(@C0359n0 FragmentManager fragmentManager, int i) {
        this.f49453g = null;
        this.f49454h = new ArrayList<>();
        this.f49455i = new ArrayList<>();
        this.f49456j = null;
        this.f49451e = fragmentManager;
        this.f49452f = i;
    }
}
