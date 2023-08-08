package com.bumptech.glide.manager;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Fragment;
import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.bumptech.glide.C22038b;
import com.bumptech.glide.C22092j;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@Deprecated
/* renamed from: com.bumptech.glide.manager.o */
public class C22518o extends Fragment {

    /* renamed from: g */
    public static final String f57697g = "RMFragment";

    /* renamed from: a */
    public final C22503a f57698a;

    /* renamed from: b */
    public final C22524r f57699b;

    /* renamed from: c */
    public final Set<C22518o> f57700c;
    @C0363p0

    /* renamed from: d */
    public C22092j f57701d;
    @C0363p0

    /* renamed from: e */
    public C22518o f57702e;
    @C0363p0

    /* renamed from: f */
    public Fragment f57703f;

    /* renamed from: com.bumptech.glide.manager.o$a */
    public class C22519a implements C22524r {
        public C22519a() {
        }

        @C0359n0
        /* renamed from: a */
        public Set<C22092j> mo66580a() {
            Set<C22518o> b = C22518o.this.mo66585b();
            HashSet hashSet = new HashSet(b.size());
            for (C22518o next : b) {
                if (next.mo66588e() != null) {
                    hashSet.add(next.mo66588e());
                }
            }
            return hashSet;
        }

        public String toString() {
            return super.toString() + "{fragment=" + C22518o.this + "}";
        }
    }

    public C22518o() {
        this(new C22503a());
    }

    /* renamed from: a */
    public final void mo66584a(C22518o oVar) {
        this.f57700c.add(oVar);
    }

    @TargetApi(17)
    @C0359n0
    /* renamed from: b */
    public Set<C22518o> mo66585b() {
        if (equals(this.f57702e)) {
            return Collections.unmodifiableSet(this.f57700c);
        }
        if (this.f57702e == null) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet();
        for (C22518o next : this.f57702e.mo66585b()) {
            if (mo66590g(next.getParentFragment())) {
                hashSet.add(next);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    @C0359n0
    /* renamed from: c */
    public C22503a mo66586c() {
        return this.f57698a;
    }

    @C0363p0
    @TargetApi(17)
    /* renamed from: d */
    public final Fragment mo66587d() {
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null) {
            return parentFragment;
        }
        return this.f57703f;
    }

    @C0363p0
    /* renamed from: e */
    public C22092j mo66588e() {
        return this.f57701d;
    }

    @C0359n0
    /* renamed from: f */
    public C22524r mo66589f() {
        return this.f57699b;
    }

    @TargetApi(17)
    /* renamed from: g */
    public final boolean mo66590g(@C0359n0 Fragment fragment) {
        Fragment parentFragment = getParentFragment();
        while (true) {
            Fragment parentFragment2 = fragment.getParentFragment();
            if (parentFragment2 == null) {
                return false;
            }
            if (parentFragment2.equals(parentFragment)) {
                return true;
            }
            fragment = fragment.getParentFragment();
        }
    }

    /* renamed from: h */
    public final void mo66591h(@C0359n0 Activity activity) {
        mo66595l();
        C22518o q = C22038b.m100356e(activity).mo65485o().mo66616q(activity);
        this.f57702e = q;
        if (!equals(q)) {
            this.f57702e.mo66584a(this);
        }
    }

    /* renamed from: i */
    public final void mo66592i(C22518o oVar) {
        this.f57700c.remove(oVar);
    }

    /* renamed from: j */
    public void mo66593j(@C0363p0 Fragment fragment) {
        this.f57703f = fragment;
        if (fragment != null && fragment.getActivity() != null) {
            mo66591h(fragment.getActivity());
        }
    }

    /* renamed from: k */
    public void mo66594k(@C0363p0 C22092j jVar) {
        this.f57701d = jVar;
    }

    /* renamed from: l */
    public final void mo66595l() {
        C22518o oVar = this.f57702e;
        if (oVar != null) {
            oVar.mo66592i(this);
            this.f57702e = null;
        }
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            mo66591h(activity);
        } catch (IllegalStateException unused) {
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.f57698a.mo66573c();
        mo66595l();
    }

    public void onDetach() {
        super.onDetach();
        mo66595l();
    }

    public void onStart() {
        super.onStart();
        this.f57698a.mo66574d();
    }

    public void onStop() {
        super.onStop();
        this.f57698a.mo66575e();
    }

    public String toString() {
        return super.toString() + "{parent=" + mo66587d() + "}";
    }

    @C0344h1
    @SuppressLint({"ValidFragment"})
    public C22518o(@C0359n0 C22503a aVar) {
        this.f57699b = new C22519a();
        this.f57700c = new HashSet();
        this.f57698a = aVar;
    }
}
