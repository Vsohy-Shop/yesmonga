package com.bumptech.glide.manager;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.collection.C1866a;
import androidx.fragment.app.C19232h;
import androidx.fragment.app.C19234h0;
import androidx.fragment.app.Fragment;
import com.bumptech.glide.C22038b;
import com.bumptech.glide.C22040c;
import com.bumptech.glide.C22059e;
import com.bumptech.glide.C22092j;
import com.bumptech.glide.load.resource.bitmap.C22395b0;
import com.bumptech.glide.util.C22633m;
import com.bumptech.glide.util.C22635o;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bumptech.glide.manager.q */
public class C22521q implements Handler.Callback {
    @C0344h1

    /* renamed from: l */
    public static final String f57705l = "com.bumptech.glide.manager";

    /* renamed from: m */
    public static final String f57706m = "RMRetriever";

    /* renamed from: n */
    public static final int f57707n = 1;

    /* renamed from: o */
    public static final int f57708o = 1;

    /* renamed from: p */
    public static final int f57709p = 2;

    /* renamed from: q */
    public static final String f57710q = "key";

    /* renamed from: r */
    public static final C22523b f57711r = new C22522a();

    /* renamed from: c */
    public volatile C22092j f57712c;
    @C0344h1

    /* renamed from: d */
    public final Map<FragmentManager, C22518o> f57713d = new HashMap();
    @C0344h1

    /* renamed from: e */
    public final Map<androidx.fragment.app.FragmentManager, C22535u> f57714e = new HashMap();

    /* renamed from: f */
    public final Handler f57715f;

    /* renamed from: g */
    public final C22523b f57716g;

    /* renamed from: h */
    public final C1866a<View, Fragment> f57717h = new C1866a<>();

    /* renamed from: i */
    public final C1866a<View, android.app.Fragment> f57718i = new C1866a<>();

    /* renamed from: j */
    public final Bundle f57719j = new Bundle();

    /* renamed from: k */
    public final C22514k f57720k;

    /* renamed from: com.bumptech.glide.manager.q$a */
    public class C22522a implements C22523b {
        @C0359n0
        /* renamed from: a */
        public C22092j mo66623a(@C0359n0 C22038b bVar, @C0359n0 C22515l lVar, @C0359n0 C22524r rVar, @C0359n0 Context context) {
            return new C22092j(bVar, lVar, rVar, context);
        }
    }

    /* renamed from: com.bumptech.glide.manager.q$b */
    public interface C22523b {
        @C0359n0
        /* renamed from: a */
        C22092j mo66623a(@C0359n0 C22038b bVar, @C0359n0 C22515l lVar, @C0359n0 C22524r rVar, @C0359n0 Context context);
    }

    public C22521q(@C0363p0 C22523b bVar, C22059e eVar) {
        this.f57716g = bVar == null ? f57711r : bVar;
        this.f57715f = new Handler(Looper.getMainLooper(), this);
        this.f57720k = m102105b(eVar);
    }

    @TargetApi(17)
    /* renamed from: a */
    public static void m102104a(@C0359n0 Activity activity) {
        if (activity.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
    }

    /* renamed from: b */
    public static C22514k m102105b(C22059e eVar) {
        if (!C22395b0.f57485i || !C22395b0.f57484h) {
            return new C22510g();
        }
        if (eVar.mo65571b(C22040c.C22047g.class)) {
            return new C22512i();
        }
        return new C22513j();
    }

    @C0363p0
    /* renamed from: c */
    public static Activity m102106c(@C0359n0 Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return m102106c(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    /* renamed from: f */
    public static void m102107f(@C0363p0 Collection<Fragment> collection, @C0359n0 Map<View, Fragment> map) {
        if (collection != null) {
            for (Fragment next : collection) {
                if (!(next == null || next.getView() == null)) {
                    map.put(next.getView(), next);
                    m102107f(next.getChildFragmentManager().mo56807I0(), map);
                }
            }
        }
    }

    /* renamed from: u */
    public static boolean m102108u(Context context) {
        Activity c = m102106c(context);
        if (c == null || !c.isFinishing()) {
            return true;
        }
        return false;
    }

    @TargetApi(26)
    @Deprecated
    /* renamed from: d */
    public final void mo66603d(@C0359n0 FragmentManager fragmentManager, @C0359n0 C1866a<View, android.app.Fragment> aVar) {
        if (Build.VERSION.SDK_INT >= 26) {
            for (android.app.Fragment fragment : fragmentManager.getFragments()) {
                if (fragment.getView() != null) {
                    aVar.put(fragment.getView(), fragment);
                    mo66603d(fragment.getChildFragmentManager(), aVar);
                }
            }
            return;
        }
        mo66604e(fragmentManager, aVar);
    }

    @Deprecated
    /* renamed from: e */
    public final void mo66604e(@C0359n0 FragmentManager fragmentManager, @C0359n0 C1866a<View, android.app.Fragment> aVar) {
        android.app.Fragment fragment;
        int i = 0;
        while (true) {
            int i2 = i + 1;
            this.f57719j.putInt("key", i);
            try {
                fragment = fragmentManager.getFragment(this.f57719j, "key");
            } catch (Exception unused) {
                fragment = null;
            }
            if (fragment != null) {
                if (fragment.getView() != null) {
                    aVar.put(fragment.getView(), fragment);
                    mo66603d(fragment.getChildFragmentManager(), aVar);
                }
                i = i2;
            } else {
                return;
            }
        }
    }

    @C0363p0
    @Deprecated
    /* renamed from: g */
    public final android.app.Fragment mo66605g(@C0359n0 View view, @C0359n0 Activity activity) {
        this.f57718i.clear();
        mo66603d(activity.getFragmentManager(), this.f57718i);
        View findViewById = activity.findViewById(16908290);
        android.app.Fragment fragment = null;
        while (!view.equals(findViewById) && (fragment = this.f57718i.get(view)) == null && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        this.f57718i.clear();
        return fragment;
    }

    @C0363p0
    /* renamed from: h */
    public final Fragment mo66606h(@C0359n0 View view, @C0359n0 C19232h hVar) {
        this.f57717h.clear();
        m102107f(hVar.mo57175g0().mo56807I0(), this.f57717h);
        View findViewById = hVar.findViewById(16908290);
        Fragment fragment = null;
        while (!view.equals(findViewById) && (fragment = this.f57717h.get(view)) == null && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        this.f57717h.clear();
        return fragment;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: android.app.FragmentManager} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: androidx.fragment.app.FragmentManager} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v9, resolved type: android.app.FragmentManager} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v10, resolved type: android.app.FragmentManager} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v11, resolved type: android.app.FragmentManager} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean handleMessage(android.os.Message r8) {
        /*
            r7 = this;
            int r0 = r8.arg1
            r1 = 1
            r2 = 0
            if (r0 != r1) goto L_0x0008
            r0 = r1
            goto L_0x0009
        L_0x0008:
            r0 = r2
        L_0x0009:
            int r3 = r8.what
            r4 = 0
            if (r3 == r1) goto L_0x0025
            r5 = 2
            if (r3 == r5) goto L_0x0014
            r1 = r2
            r8 = r4
            goto L_0x003b
        L_0x0014:
            java.lang.Object r8 = r8.obj
            androidx.fragment.app.FragmentManager r8 = (androidx.fragment.app.FragmentManager) r8
            boolean r0 = r7.mo66622x(r8, r0)
            if (r0 == 0) goto L_0x0037
            java.util.Map<androidx.fragment.app.FragmentManager, com.bumptech.glide.manager.u> r0 = r7.f57714e
            java.lang.Object r4 = r0.remove(r8)
            goto L_0x0035
        L_0x0025:
            java.lang.Object r8 = r8.obj
            android.app.FragmentManager r8 = (android.app.FragmentManager) r8
            boolean r0 = r7.mo66621w(r8, r0)
            if (r0 == 0) goto L_0x0037
            java.util.Map<android.app.FragmentManager, com.bumptech.glide.manager.o> r0 = r7.f57713d
            java.lang.Object r4 = r0.remove(r8)
        L_0x0035:
            r2 = r1
            goto L_0x003b
        L_0x0037:
            r8 = r4
            r6 = r2
            r2 = r1
            r1 = r6
        L_0x003b:
            java.lang.String r0 = "RMRetriever"
            r3 = 5
            boolean r0 = android.util.Log.isLoggable(r0, r3)
            if (r0 == 0) goto L_0x0055
            if (r1 == 0) goto L_0x0055
            if (r4 != 0) goto L_0x0055
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Failed to remove expected request manager fragment, manager: "
            r0.append(r1)
            r0.append(r8)
        L_0x0055:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.manager.C22521q.handleMessage(android.os.Message):boolean");
    }

    @C0359n0
    @Deprecated
    /* renamed from: i */
    public final C22092j mo66608i(@C0359n0 Context context, @C0359n0 FragmentManager fragmentManager, @C0363p0 android.app.Fragment fragment, boolean z) {
        C22518o r = mo66617r(fragmentManager, fragment);
        C22092j e = r.mo66588e();
        if (e == null) {
            e = this.f57716g.mo66623a(C22038b.m100356e(context), r.mo66586c(), r.mo66589f(), context);
            if (z) {
                e.mo65586b();
            }
            r.mo66594k(e);
        }
        return e;
    }

    @C0359n0
    /* renamed from: j */
    public C22092j mo66609j(@C0359n0 Activity activity) {
        if (C22635o.m102645t()) {
            return mo66611l(activity.getApplicationContext());
        }
        if (activity instanceof C19232h) {
            return mo66614o((C19232h) activity);
        }
        m102104a(activity);
        this.f57720k.mo66579a(activity);
        return mo66608i(activity, activity.getFragmentManager(), (android.app.Fragment) null, m102108u(activity));
    }

    @TargetApi(17)
    @C0359n0
    @Deprecated
    /* renamed from: k */
    public C22092j mo66610k(@C0359n0 android.app.Fragment fragment) {
        if (fragment.getActivity() == null) {
            throw new IllegalArgumentException("You cannot start a load on a fragment before it is attached");
        } else if (C22635o.m102645t()) {
            return mo66611l(fragment.getActivity().getApplicationContext());
        } else {
            if (fragment.getActivity() != null) {
                this.f57720k.mo66579a(fragment.getActivity());
            }
            return mo66608i(fragment.getActivity(), fragment.getChildFragmentManager(), fragment, fragment.isVisible());
        }
    }

    @C0359n0
    /* renamed from: l */
    public C22092j mo66611l(@C0359n0 Context context) {
        if (context != null) {
            if (C22635o.m102646u() && !(context instanceof Application)) {
                if (context instanceof C19232h) {
                    return mo66614o((C19232h) context);
                }
                if (context instanceof Activity) {
                    return mo66609j((Activity) context);
                }
                if (context instanceof ContextWrapper) {
                    ContextWrapper contextWrapper = (ContextWrapper) context;
                    if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                        return mo66611l(contextWrapper.getBaseContext());
                    }
                }
            }
            return mo66615p(context);
        }
        throw new IllegalArgumentException("You cannot start a load on a null Context");
    }

    @C0359n0
    /* renamed from: m */
    public C22092j mo66612m(@C0359n0 View view) {
        if (C22635o.m102645t()) {
            return mo66611l(view.getContext().getApplicationContext());
        }
        C22633m.m102624d(view);
        C22633m.m102625e(view.getContext(), "Unable to obtain a request manager for a view without a Context");
        Activity c = m102106c(view.getContext());
        if (c == null) {
            return mo66611l(view.getContext().getApplicationContext());
        }
        if (c instanceof C19232h) {
            C19232h hVar = (C19232h) c;
            Fragment h = mo66606h(view, hVar);
            if (h != null) {
                return mo66613n(h);
            }
            return mo66614o(hVar);
        }
        android.app.Fragment g = mo66605g(view, c);
        if (g == null) {
            return mo66609j(c);
        }
        return mo66610k(g);
    }

    @C0359n0
    /* renamed from: n */
    public C22092j mo66613n(@C0359n0 Fragment fragment) {
        C22633m.m102625e(fragment.getContext(), "You cannot start a load on a fragment before it is attached or after it is destroyed");
        if (C22635o.m102645t()) {
            return mo66611l(fragment.getContext().getApplicationContext());
        }
        if (fragment.getActivity() != null) {
            this.f57720k.mo66579a(fragment.getActivity());
        }
        return mo66620v(fragment.getContext(), fragment.getChildFragmentManager(), fragment, fragment.isVisible());
    }

    @C0359n0
    /* renamed from: o */
    public C22092j mo66614o(@C0359n0 C19232h hVar) {
        if (C22635o.m102645t()) {
            return mo66611l(hVar.getApplicationContext());
        }
        m102104a(hVar);
        this.f57720k.mo66579a(hVar);
        return mo66620v(hVar, hVar.mo57175g0(), (Fragment) null, m102108u(hVar));
    }

    @C0359n0
    /* renamed from: p */
    public final C22092j mo66615p(@C0359n0 Context context) {
        if (this.f57712c == null) {
            synchronized (this) {
                if (this.f57712c == null) {
                    this.f57712c = this.f57716g.mo66623a(C22038b.m100356e(context.getApplicationContext()), new C22504b(), new C22511h(), context.getApplicationContext());
                }
            }
        }
        return this.f57712c;
    }

    @C0359n0
    @Deprecated
    /* renamed from: q */
    public C22518o mo66616q(Activity activity) {
        return mo66617r(activity.getFragmentManager(), (android.app.Fragment) null);
    }

    @C0359n0
    /* renamed from: r */
    public final C22518o mo66617r(@C0359n0 FragmentManager fragmentManager, @C0363p0 android.app.Fragment fragment) {
        C22518o oVar = this.f57713d.get(fragmentManager);
        if (oVar != null) {
            return oVar;
        }
        C22518o oVar2 = (C22518o) fragmentManager.findFragmentByTag(f57705l);
        if (oVar2 == null) {
            oVar2 = new C22518o();
            oVar2.mo66593j(fragment);
            this.f57713d.put(fragmentManager, oVar2);
            fragmentManager.beginTransaction().add(oVar2, f57705l).commitAllowingStateLoss();
            this.f57715f.obtainMessage(1, fragmentManager).sendToTarget();
        }
        return oVar2;
    }

    @C0359n0
    /* renamed from: s */
    public C22535u mo66618s(androidx.fragment.app.FragmentManager fragmentManager) {
        return mo66619t(fragmentManager, (Fragment) null);
    }

    @C0359n0
    /* renamed from: t */
    public final C22535u mo66619t(@C0359n0 androidx.fragment.app.FragmentManager fragmentManager, @C0363p0 Fragment fragment) {
        C22535u uVar = this.f57714e.get(fragmentManager);
        if (uVar != null) {
            return uVar;
        }
        C22535u uVar2 = (C22535u) fragmentManager.mo56903s0(f57705l);
        if (uVar2 == null) {
            uVar2 = new C22535u();
            uVar2.mo66658S0(fragment);
            this.f57714e.put(fragmentManager, uVar2);
            fragmentManager.mo56909u().mo57221k(uVar2, f57705l).mo57053r();
            this.f57715f.obtainMessage(2, fragmentManager).sendToTarget();
        }
        return uVar2;
    }

    @C0359n0
    /* renamed from: v */
    public final C22092j mo66620v(@C0359n0 Context context, @C0359n0 androidx.fragment.app.FragmentManager fragmentManager, @C0363p0 Fragment fragment, boolean z) {
        C22535u t = mo66619t(fragmentManager, fragment);
        C22092j M0 = t.mo66653M0();
        if (M0 == null) {
            M0 = this.f57716g.mo66623a(C22038b.m100356e(context), t.mo66651K0(), t.mo66654N0(), context);
            if (z) {
                M0.mo65586b();
            }
            t.mo66659T0(M0);
        }
        return M0;
    }

    /* renamed from: w */
    public final boolean mo66621w(FragmentManager fragmentManager, boolean z) {
        C22518o oVar = this.f57713d.get(fragmentManager);
        C22518o oVar2 = (C22518o) fragmentManager.findFragmentByTag(f57705l);
        if (oVar2 == oVar) {
            return true;
        }
        if (oVar2 != null && oVar2.mo66588e() != null) {
            throw new IllegalStateException("We've added two fragments with requests! Old: " + oVar2 + " New: " + oVar);
        } else if (z || fragmentManager.isDestroyed()) {
            if (Log.isLoggable(f57706m, 5)) {
                fragmentManager.isDestroyed();
            }
            oVar.mo66586c().mo66573c();
            return true;
        } else {
            FragmentTransaction add = fragmentManager.beginTransaction().add(oVar, f57705l);
            if (oVar2 != null) {
                add.remove(oVar2);
            }
            add.commitAllowingStateLoss();
            this.f57715f.obtainMessage(1, 1, 0, fragmentManager).sendToTarget();
            return false;
        }
    }

    /* renamed from: x */
    public final boolean mo66622x(androidx.fragment.app.FragmentManager fragmentManager, boolean z) {
        C22535u uVar = this.f57714e.get(fragmentManager);
        C22535u uVar2 = (C22535u) fragmentManager.mo56903s0(f57705l);
        if (uVar2 == uVar) {
            return true;
        }
        if (uVar2 != null && uVar2.mo66653M0() != null) {
            throw new IllegalStateException("We've added two fragments with requests! Old: " + uVar2 + " New: " + uVar);
        } else if (z || fragmentManager.mo56844V0()) {
            fragmentManager.mo56844V0();
            uVar.mo66651K0().mo66573c();
            return true;
        } else {
            C19234h0 k = fragmentManager.mo56909u().mo57221k(uVar, f57705l);
            if (uVar2 != null) {
                k.mo57038B(uVar2);
            }
            k.mo57055t();
            this.f57715f.obtainMessage(2, 1, 0, fragmentManager).sendToTarget();
            return false;
        }
    }
}
