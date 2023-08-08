package com.bumptech.glide.manager;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bumptech.glide.C22038b;
import com.bumptech.glide.C22092j;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.bumptech.glide.manager.u */
public class C22535u extends Fragment {

    /* renamed from: g */
    public static final String f57746g = "SupportRMFragment";

    /* renamed from: a */
    public final C22503a f57747a;

    /* renamed from: b */
    public final C22524r f57748b;

    /* renamed from: c */
    public final Set<C22535u> f57749c;
    @C0363p0

    /* renamed from: d */
    public C22535u f57750d;
    @C0363p0

    /* renamed from: e */
    public C22092j f57751e;
    @C0363p0

    /* renamed from: f */
    public Fragment f57752f;

    /* renamed from: com.bumptech.glide.manager.u$a */
    public class C22536a implements C22524r {
        public C22536a() {
        }

        @C0359n0
        /* renamed from: a */
        public Set<C22092j> mo66580a() {
            Set<C22535u> J0 = C22535u.this.mo66650J0();
            HashSet hashSet = new HashSet(J0.size());
            for (C22535u next : J0) {
                if (next.mo66653M0() != null) {
                    hashSet.add(next.mo66653M0());
                }
            }
            return hashSet;
        }

        public String toString() {
            return super.toString() + "{fragment=" + C22535u.this + "}";
        }
    }

    public C22535u() {
        this(new C22503a());
    }

    @C0363p0
    /* renamed from: O0 */
    public static FragmentManager m102157O0(@C0359n0 Fragment fragment) {
        while (fragment.getParentFragment() != null) {
            fragment = fragment.getParentFragment();
        }
        return fragment.getFragmentManager();
    }

    /* renamed from: I0 */
    public final void mo66649I0(C22535u uVar) {
        this.f57749c.add(uVar);
    }

    @C0359n0
    /* renamed from: J0 */
    public Set<C22535u> mo66650J0() {
        C22535u uVar = this.f57750d;
        if (uVar == null) {
            return Collections.emptySet();
        }
        if (equals(uVar)) {
            return Collections.unmodifiableSet(this.f57749c);
        }
        HashSet hashSet = new HashSet();
        for (C22535u next : this.f57750d.mo66650J0()) {
            if (mo66655P0(next.mo66652L0())) {
                hashSet.add(next);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    @C0359n0
    /* renamed from: K0 */
    public C22503a mo66651K0() {
        return this.f57747a;
    }

    @C0363p0
    /* renamed from: L0 */
    public final Fragment mo66652L0() {
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null) {
            return parentFragment;
        }
        return this.f57752f;
    }

    @C0363p0
    /* renamed from: M0 */
    public C22092j mo66653M0() {
        return this.f57751e;
    }

    @C0359n0
    /* renamed from: N0 */
    public C22524r mo66654N0() {
        return this.f57748b;
    }

    /* renamed from: P0 */
    public final boolean mo66655P0(@C0359n0 Fragment fragment) {
        Fragment L0 = mo66652L0();
        while (true) {
            Fragment parentFragment = fragment.getParentFragment();
            if (parentFragment == null) {
                return false;
            }
            if (parentFragment.equals(L0)) {
                return true;
            }
            fragment = fragment.getParentFragment();
        }
    }

    /* renamed from: Q0 */
    public final void mo66656Q0(@C0359n0 Context context, @C0359n0 FragmentManager fragmentManager) {
        mo66660U0();
        C22535u s = C22038b.m100356e(context).mo65485o().mo66618s(fragmentManager);
        this.f57750d = s;
        if (!equals(s)) {
            this.f57750d.mo66649I0(this);
        }
    }

    /* renamed from: R0 */
    public final void mo66657R0(C22535u uVar) {
        this.f57749c.remove(uVar);
    }

    /* renamed from: S0 */
    public void mo66658S0(@C0363p0 Fragment fragment) {
        FragmentManager O0;
        this.f57752f = fragment;
        if (fragment != null && fragment.getContext() != null && (O0 = m102157O0(fragment)) != null) {
            mo66656Q0(fragment.getContext(), O0);
        }
    }

    /* renamed from: T0 */
    public void mo66659T0(@C0363p0 C22092j jVar) {
        this.f57751e = jVar;
    }

    /* renamed from: U0 */
    public final void mo66660U0() {
        C22535u uVar = this.f57750d;
        if (uVar != null) {
            uVar.mo66657R0(this);
            this.f57750d = null;
        }
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        FragmentManager O0 = m102157O0(this);
        if (O0 != null) {
            try {
                mo66656Q0(getContext(), O0);
            } catch (IllegalStateException unused) {
            }
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.f57747a.mo66573c();
        mo66660U0();
    }

    public void onDetach() {
        super.onDetach();
        this.f57752f = null;
        mo66660U0();
    }

    public void onStart() {
        super.onStart();
        this.f57747a.mo66574d();
    }

    public void onStop() {
        super.onStop();
        this.f57747a.mo66575e();
    }

    public String toString() {
        return super.toString() + "{parent=" + mo66652L0() + "}";
    }

    @C0344h1
    @SuppressLint({"ValidFragment"})
    public C22535u(@C0359n0 C22503a aVar) {
        this.f57748b = new C22536a();
        this.f57749c = new HashSet();
        this.f57747a = aVar;
    }
}
