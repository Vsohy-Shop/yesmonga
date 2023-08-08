package androidx.preference;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.C0213a0;
import androidx.activity.C0309t;
import androidx.activity.OnBackPressedDispatcher;
import androidx.annotation.C0346i;
import androidx.core.view.C18196h2;
import androidx.fragment.app.C19234h0;
import androidx.fragment.app.C19250l;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C19499w;
import androidx.preference.C19944m;
import androidx.preference.C19975v;
import androidx.slidingpanelayout.widget.SlidingPaneLayout;
import com.google.android.gms.analytics.ecommerce.C40383c;
import com.urbanairship.iam.events.C9175a;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b&\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\"B\u0007¢\u0006\u0004\b(\u0010)J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0017J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0017J$\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0017J\b\u0010\u0015\u001a\u00020\u0003H&J\u001a\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0017J\u0012\u0010\u0018\u001a\u00020\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016J\n\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u0016J\u0010\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0010\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u0005H\u0002J\u0012\u0010 \u001a\u00020\u000b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0002R\u0018\u0010$\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0011\u0010'\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006*"}, mo22516d2 = {"Landroidx/preference/q;", "Landroidx/fragment/app/Fragment;", "Landroidx/preference/m$f;", "Landroidx/preference/m;", "caller", "Landroidx/preference/Preference;", "pref", "", "q0", "Landroid/content/Context;", "context", "Lkotlin/d2;", "onAttach", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "N0", "view", "onViewCreated", "onViewStateRestored", "M0", "Landroidx/slidingpanelayout/widget/SlidingPaneLayout;", "K0", "header", "Q0", "Landroid/content/Intent;", "intent", "P0", "Landroidx/activity/t;", "a", "Landroidx/activity/t;", "onBackPressedCallback", "L0", "()Landroidx/slidingpanelayout/widget/SlidingPaneLayout;", "slidingPaneLayout", "<init>", "()V", "preference_release"}, mo22517k = 1, mo22518mv = {1, 6, 0})
/* renamed from: androidx.preference.q */
public abstract class C19962q extends Fragment implements C19944m.C19950f {
    @C12580l

    /* renamed from: a */
    public C0309t f51087a;

    /* renamed from: androidx.preference.q$a */
    public static final class C19963a extends C0309t implements SlidingPaneLayout.C20452f {
        @C12579k

        /* renamed from: d */
        public final C19962q f51088d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C19963a(@C12579k C19962q qVar) {
            super(true);
            Intrinsics.checkNotNullParameter(qVar, "caller");
            this.f51088d = qVar;
            qVar.mo59164L0().mo61307a(this);
        }

        /* renamed from: a */
        public void mo58409a(@C12579k View view) {
            Intrinsics.checkNotNullParameter(view, "panel");
            mo970j(true);
        }

        /* renamed from: b */
        public void mo58410b(@C12579k View view) {
            Intrinsics.checkNotNullParameter(view, "panel");
            mo970j(false);
        }

        /* renamed from: c */
        public void mo58411c(@C12579k View view, float f) {
            Intrinsics.checkNotNullParameter(view, "panel");
        }

        /* renamed from: f */
        public void mo792f() {
            this.f51088d.mo59164L0().mo61313d();
        }
    }

    /* renamed from: androidx.preference.q$b */
    public static final class C19964b implements View.OnLayoutChangeListener {

        /* renamed from: a */
        public final /* synthetic */ C19962q f51089a;

        public C19964b(C19962q qVar) {
            this.f51089a = qVar;
        }

        public void onLayoutChange(@C12579k View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            boolean z;
            view.removeOnLayoutChangeListener(this);
            C0309t J0 = this.f51089a.f51087a;
            Intrinsics.checkNotNull(J0);
            if (!this.f51089a.mo59164L0().mo61330o() || !this.f51089a.mo59164L0().isOpen()) {
                z = false;
            } else {
                z = true;
            }
            J0.mo970j(z);
        }
    }

    /* renamed from: O0 */
    public static final void m92832O0(C19962q qVar) {
        boolean z;
        Intrinsics.checkNotNullParameter(qVar, "this$0");
        C0309t tVar = qVar.f51087a;
        Intrinsics.checkNotNull(tVar);
        if (qVar.getChildFragmentManager().mo56786B0() == 0) {
            z = true;
        } else {
            z = false;
        }
        tVar.mo970j(z);
    }

    /* renamed from: K0 */
    public final SlidingPaneLayout mo59163K0(LayoutInflater layoutInflater) {
        SlidingPaneLayout slidingPaneLayout = new SlidingPaneLayout(layoutInflater.getContext());
        slidingPaneLayout.setId(C19975v.C19981f.preferences_sliding_pane_layout);
        FragmentContainerView fragmentContainerView = new FragmentContainerView(layoutInflater.getContext());
        fragmentContainerView.setId(C19975v.C19981f.preferences_header);
        SlidingPaneLayout.C20451e eVar = new SlidingPaneLayout.C20451e(getResources().getDimensionPixelSize(C19975v.C19979d.preferences_header_width), -1);
        eVar.f52748a = (float) getResources().getInteger(C19975v.C19982g.preferences_header_pane_weight);
        slidingPaneLayout.addView(fragmentContainerView, eVar);
        FragmentContainerView fragmentContainerView2 = new FragmentContainerView(layoutInflater.getContext());
        fragmentContainerView2.setId(C19975v.C19981f.preferences_detail);
        SlidingPaneLayout.C20451e eVar2 = new SlidingPaneLayout.C20451e(getResources().getDimensionPixelSize(C19975v.C19979d.preferences_detail_width), -1);
        eVar2.f52748a = (float) getResources().getInteger(C19975v.C19982g.preferences_detail_pane_weight);
        slidingPaneLayout.addView(fragmentContainerView2, eVar2);
        return slidingPaneLayout;
    }

    @C12579k
    /* renamed from: L0 */
    public final SlidingPaneLayout mo59164L0() {
        return (SlidingPaneLayout) requireView();
    }

    @C12580l
    /* renamed from: M0 */
    public Fragment mo59165M0() {
        Fragment r0 = getChildFragmentManager().mo56900r0(C19975v.C19981f.preferences_header);
        if (r0 != null) {
            C19944m mVar = (C19944m) r0;
            if (mVar.mo59117N0().mo58942q3() <= 0) {
                return null;
            }
            int q3 = mVar.mo59117N0().mo58942q3();
            int i = 0;
            while (i < q3) {
                int i2 = i + 1;
                Preference p3 = mVar.mo59117N0().mo58941p3(i);
                Intrinsics.checkNotNullExpressionValue(p3, "headerFragment.preferenc…reen.getPreference(index)");
                if (p3.mo58878e0() == null) {
                    i = i2;
                } else {
                    String e0 = p3.mo58878e0();
                    if (e0 == null) {
                        return null;
                    }
                    return getChildFragmentManager().mo56801G0().mo56932a(requireContext().getClassLoader(), e0);
                }
            }
            return null;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.preference.PreferenceFragmentCompat");
    }

    @C12579k
    /* renamed from: N0 */
    public abstract C19944m mo59166N0();

    /* renamed from: P0 */
    public final void mo59167P0(Intent intent) {
        if (intent != null) {
            startActivity(intent);
        }
    }

    /* renamed from: Q0 */
    public final void mo59168Q0(Preference preference) {
        Fragment fragment;
        if (preference.mo58878e0() == null) {
            mo59167P0(preference.mo58886i0());
            return;
        }
        String e0 = preference.mo58878e0();
        if (e0 == null) {
            fragment = null;
        } else {
            fragment = getChildFragmentManager().mo56801G0().mo56932a(requireContext().getClassLoader(), e0);
        }
        if (fragment != null) {
            fragment.setArguments(preference.mo58864X());
        }
        if (getChildFragmentManager().mo56786B0() > 0) {
            FragmentManager.C19177j A0 = getChildFragmentManager().mo56783A0(0);
            Intrinsics.checkNotNullExpressionValue(A0, "childFragmentManager.getBackStackEntryAt(0)");
            getChildFragmentManager().mo56904s1(A0.getId(), 1);
        }
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "childFragmentManager");
        C19234h0 u = childFragmentManager.mo56909u();
        Intrinsics.checkNotNullExpressionValue(u, "beginTransaction()");
        u.mo57213Q(true);
        int i = C19975v.C19981f.preferences_detail;
        Intrinsics.checkNotNull(fragment);
        u.mo57201C(i, fragment);
        if (mo59164L0().isOpen()) {
            u.mo57214R(C19234h0.f49481K);
        }
        mo59164L0().mo61341r();
        u.mo57052q();
    }

    @C0346i
    public void onAttach(@C12579k Context context) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        super.onAttach(context);
        FragmentManager parentFragmentManager = getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parentFragmentManager");
        C19234h0 u = parentFragmentManager.mo56909u();
        Intrinsics.checkNotNullExpressionValue(u, "beginTransaction()");
        u.mo57040P(this);
        u.mo57052q();
    }

    @C12579k
    @C0346i
    public View onCreateView(@C12579k LayoutInflater layoutInflater, @C12580l ViewGroup viewGroup, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        SlidingPaneLayout K0 = mo59163K0(layoutInflater);
        FragmentManager childFragmentManager = getChildFragmentManager();
        int i = C19975v.C19981f.preferences_header;
        if (childFragmentManager.mo56900r0(i) == null) {
            C19944m N0 = mo59166N0();
            FragmentManager childFragmentManager2 = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "childFragmentManager");
            C19234h0 u = childFragmentManager2.mo56909u();
            Intrinsics.checkNotNullExpressionValue(u, "beginTransaction()");
            u.mo57213Q(true);
            u.mo57216f(i, N0);
            u.mo57052q();
        }
        K0.setLockMode(3);
        return K0;
    }

    @C0346i
    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        C0213a0 a0Var;
        boolean z;
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        this.f51087a = new C19963a(this);
        SlidingPaneLayout L0 = mo59164L0();
        if (!C18196h2.m82539U0(L0) || L0.isLayoutRequested()) {
            L0.addOnLayoutChangeListener(new C19964b(this));
        } else {
            C0309t J0 = this.f51087a;
            Intrinsics.checkNotNull(J0);
            if (!mo59164L0().mo61330o() || !mo59164L0().isOpen()) {
                z = false;
            } else {
                z = true;
            }
            J0.mo970j(z);
        }
        getChildFragmentManager().mo56894p(new C19961p(this));
        Context requireContext = requireContext();
        if (requireContext instanceof C0213a0) {
            a0Var = (C0213a0) requireContext;
        } else {
            a0Var = null;
        }
        if (a0Var != null) {
            OnBackPressedDispatcher Z = a0Var.mo702Z();
            C19499w viewLifecycleOwner = getViewLifecycleOwner();
            C0309t tVar = this.f51087a;
            Intrinsics.checkNotNull(tVar);
            Z.mo764c(viewLifecycleOwner, tVar);
        }
    }

    public void onViewStateRestored(@C12580l Bundle bundle) {
        Fragment M0;
        super.onViewStateRestored(bundle);
        if (bundle == null && (M0 = mo59165M0()) != null) {
            FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "childFragmentManager");
            C19234h0 u = childFragmentManager.mo56909u();
            Intrinsics.checkNotNullExpressionValue(u, "beginTransaction()");
            u.mo57213Q(true);
            u.mo57201C(C19975v.C19981f.preferences_detail, M0);
            u.mo57052q();
        }
    }

    @C0346i
    /* renamed from: q0 */
    public boolean mo59141q0(@C12579k C19944m mVar, @C12579k Preference preference) {
        Intrinsics.checkNotNullParameter(mVar, "caller");
        Intrinsics.checkNotNullParameter(preference, "pref");
        if (mVar.getId() == C19975v.C19981f.preferences_header) {
            mo59168Q0(preference);
            return true;
        }
        int id = mVar.getId();
        int i = C19975v.C19981f.preferences_detail;
        if (id != i) {
            return false;
        }
        C19250l G0 = getChildFragmentManager().mo56801G0();
        ClassLoader classLoader = requireContext().getClassLoader();
        String e0 = preference.mo58878e0();
        Intrinsics.checkNotNull(e0);
        Fragment a = G0.mo56932a(classLoader, e0);
        Intrinsics.checkNotNullExpressionValue(a, "childFragmentManager.fra….fragment!!\n            )");
        a.setArguments(preference.mo58864X());
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "childFragmentManager");
        C19234h0 u = childFragmentManager.mo56909u();
        Intrinsics.checkNotNullExpressionValue(u, "beginTransaction()");
        u.mo57213Q(true);
        u.mo57201C(i, a);
        u.mo57214R(C19234h0.f49481K);
        u.mo57225o((String) null);
        u.mo57052q();
        return true;
    }
}
