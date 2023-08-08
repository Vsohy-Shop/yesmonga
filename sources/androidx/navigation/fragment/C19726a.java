package androidx.navigation.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.C0309t;
import androidx.activity.OnBackPressedDispatcher;
import androidx.annotation.C0346i;
import androidx.core.view.C18196h2;
import androidx.fragment.app.C19234h0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C19499w;
import androidx.navigation.C19844w0;
import androidx.navigation.fragment.C19746l;
import androidx.navigation.fragment.NavHostFragment;
import androidx.slidingpanelayout.widget.SlidingPaneLayout;
import com.google.android.gms.analytics.ecommerce.C40383c;
import com.urbanairship.iam.events.C9175a;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b&\u0018\u00002\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b+\u0010,J\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0017J$\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007J$\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&J\b\u0010\u0012\u001a\u00020\u0011H\u0016J\u001a\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u000e2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007J\u001a\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u000e2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0016\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0017J\u0010\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0006H\u0017R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0011\u0010'\u001a\u00020$8F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0011\u0010*\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006-"}, mo22516d2 = {"Landroidx/navigation/fragment/a;", "Landroidx/fragment/app/Fragment;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/d2;", "onInflate", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "M0", "Landroidx/navigation/fragment/NavHostFragment;", "L0", "view", "onViewCreated", "N0", "onViewStateRestored", "outState", "onSaveInstanceState", "Landroidx/activity/t;", "a", "Landroidx/activity/t;", "onBackPressedCallback", "b", "Landroidx/navigation/fragment/NavHostFragment;", "_detailPaneNavHostFragment", "", "c", "I", "graphId", "Landroidx/slidingpanelayout/widget/SlidingPaneLayout;", "K0", "()Landroidx/slidingpanelayout/widget/SlidingPaneLayout;", "slidingPaneLayout", "J0", "()Landroidx/navigation/fragment/NavHostFragment;", "detailPaneNavHostFragment", "<init>", "()V", "navigation-fragment_release"}, mo22517k = 1, mo22518mv = {1, 6, 0})
/* renamed from: androidx.navigation.fragment.a */
public abstract class C19726a extends Fragment {
    @C12580l

    /* renamed from: a */
    public C0309t f50541a;
    @C12580l

    /* renamed from: b */
    public NavHostFragment f50542b;

    /* renamed from: c */
    public int f50543c;

    /* renamed from: androidx.navigation.fragment.a$a */
    public static final class C19727a extends C0309t implements SlidingPaneLayout.C20452f {
        @C12579k

        /* renamed from: d */
        public final SlidingPaneLayout f50544d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C19727a(@C12579k SlidingPaneLayout slidingPaneLayout) {
            super(true);
            Intrinsics.checkNotNullParameter(slidingPaneLayout, "slidingPaneLayout");
            this.f50544d = slidingPaneLayout;
            slidingPaneLayout.mo61307a(this);
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
            this.f50544d.mo61313d();
        }
    }

    /* renamed from: androidx.navigation.fragment.a$b */
    public static final class C19728b implements View.OnLayoutChangeListener {

        /* renamed from: a */
        public final /* synthetic */ C19726a f50545a;

        /* renamed from: b */
        public final /* synthetic */ SlidingPaneLayout f50546b;

        public C19728b(C19726a aVar, SlidingPaneLayout slidingPaneLayout) {
            this.f50545a = aVar;
            this.f50546b = slidingPaneLayout;
        }

        public void onLayoutChange(@C12579k View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            boolean z;
            view.removeOnLayoutChangeListener(this);
            C0309t I0 = this.f50545a.f50541a;
            Intrinsics.checkNotNull(I0);
            if (!this.f50546b.mo61330o() || !this.f50546b.isOpen()) {
                z = false;
            } else {
                z = true;
            }
            I0.mo970j(z);
        }
    }

    @C12579k
    /* renamed from: J0 */
    public final NavHostFragment mo58404J0() {
        NavHostFragment navHostFragment = this.f50542b;
        if (navHostFragment == null) {
            throw new IllegalStateException(("Fragment " + this + " was called before onCreateView().").toString());
        } else if (navHostFragment != null) {
            return navHostFragment;
        } else {
            throw new NullPointerException("null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment");
        }
    }

    @C12579k
    /* renamed from: K0 */
    public final SlidingPaneLayout mo58405K0() {
        return (SlidingPaneLayout) requireView();
    }

    @C12579k
    /* renamed from: L0 */
    public NavHostFragment mo58406L0() {
        int i = this.f50543c;
        if (i != 0) {
            return NavHostFragment.C19725a.m91792c(NavHostFragment.f50531f, i, (Bundle) null, 2, (Object) null);
        }
        return new NavHostFragment();
    }

    @C12579k
    /* renamed from: M0 */
    public abstract View mo58407M0(@C12579k LayoutInflater layoutInflater, @C12580l ViewGroup viewGroup, @C12580l Bundle bundle);

    /* renamed from: N0 */
    public void mo58408N0(@C12579k View view, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
    }

    @C12579k
    @C0346i
    public final View onCreateView(@C12579k LayoutInflater layoutInflater, @C12580l ViewGroup viewGroup, @C12580l Bundle bundle) {
        NavHostFragment navHostFragment;
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        if (bundle != null) {
            this.f50543c = bundle.getInt(NavHostFragment.f50532g);
        }
        SlidingPaneLayout slidingPaneLayout = new SlidingPaneLayout(layoutInflater.getContext());
        slidingPaneLayout.setId(C19746l.C19749c.sliding_pane_layout);
        View M0 = mo58407M0(layoutInflater, slidingPaneLayout, bundle);
        if (!Intrinsics.areEqual((Object) M0, (Object) slidingPaneLayout) && !Intrinsics.areEqual((Object) M0.getParent(), (Object) slidingPaneLayout)) {
            slidingPaneLayout.addView(M0);
        }
        Context context = layoutInflater.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "inflater.context");
        FragmentContainerView fragmentContainerView = new FragmentContainerView(context);
        int i = C19746l.C19749c.sliding_pane_detail_container;
        fragmentContainerView.setId(i);
        SlidingPaneLayout.C20451e eVar = new SlidingPaneLayout.C20451e(layoutInflater.getContext().getResources().getDimensionPixelSize(C19746l.C19748b.sliding_pane_detail_pane_width), -1);
        eVar.f52748a = 1.0f;
        slidingPaneLayout.addView(fragmentContainerView, eVar);
        Fragment r0 = getChildFragmentManager().mo56900r0(i);
        boolean z = true;
        if (r0 != null) {
            navHostFragment = (NavHostFragment) r0;
        } else {
            navHostFragment = mo58406L0();
            FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "childFragmentManager");
            C19234h0 u = childFragmentManager.mo56909u();
            Intrinsics.checkNotNullExpressionValue(u, "beginTransaction()");
            u.mo57213Q(true);
            u.mo57216f(i, navHostFragment);
            u.mo57052q();
        }
        this.f50542b = navHostFragment;
        this.f50541a = new C19727a(slidingPaneLayout);
        if (!C18196h2.m82539U0(slidingPaneLayout) || slidingPaneLayout.isLayoutRequested()) {
            slidingPaneLayout.addOnLayoutChangeListener(new C19728b(this, slidingPaneLayout));
        } else {
            C0309t I0 = this.f50541a;
            Intrinsics.checkNotNull(I0);
            if (!slidingPaneLayout.mo61330o() || !slidingPaneLayout.isOpen()) {
                z = false;
            }
            I0.mo970j(z);
        }
        OnBackPressedDispatcher Z = requireActivity().mo702Z();
        C19499w viewLifecycleOwner = getViewLifecycleOwner();
        C0309t tVar = this.f50541a;
        Intrinsics.checkNotNull(tVar);
        Z.mo764c(viewLifecycleOwner, tVar);
        return slidingPaneLayout;
    }

    @C0346i
    public void onInflate(@C12579k Context context, @C12579k AttributeSet attributeSet, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(attributeSet, "attrs");
        super.onInflate(context, attributeSet, bundle);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C19844w0.C19847c.NavHost);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "context.obtainStyledAttr…yleable.NavHost\n        )");
        int resourceId = obtainStyledAttributes.getResourceId(C19844w0.C19847c.NavHost_navGraph, 0);
        if (resourceId != 0) {
            this.f50543c = resourceId;
        }
        C11079d2 d2Var = C11079d2.f28267a;
        obtainStyledAttributes.recycle();
    }

    @C0346i
    public void onSaveInstanceState(@C12579k Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "outState");
        super.onSaveInstanceState(bundle);
        int i = this.f50543c;
        if (i != 0) {
            bundle.putInt(NavHostFragment.f50532g, i);
        }
    }

    @C0346i
    public final void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        View childAt = mo58405K0().getChildAt(0);
        Intrinsics.checkNotNullExpressionValue(childAt, "listPaneView");
        mo58408N0(childAt, bundle);
    }

    @C0346i
    public void onViewStateRestored(@C12580l Bundle bundle) {
        boolean z;
        super.onViewStateRestored(bundle);
        C0309t tVar = this.f50541a;
        Intrinsics.checkNotNull(tVar);
        if (!mo58405K0().mo61330o() || !mo58405K0().isOpen()) {
            z = false;
        } else {
            z = true;
        }
        tVar.mo970j(z);
    }
}
