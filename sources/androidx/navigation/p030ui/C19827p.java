package androidx.navigation.p030ui;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.C0329d0;
import androidx.annotation.RestrictTo;
import androidx.appcompat.app.C0475e;
import androidx.appcompat.widget.C0696c;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.widget.C18552c;
import androidx.navigation.ActivityNavigator;
import androidx.navigation.C19761k0;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.navigation.NavGraph;
import androidx.navigation.p030ui.C19812d;
import androidx.navigation.p030ui.C19834s;
import androidx.profileinstaller.C20022q;
import com.google.android.gms.analytics.ecommerce.C40383c;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.navigation.NavigationBarView;
import com.google.android.material.navigation.NavigationView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.usabilla.sdk.ubform.sdk.banner.BannerConfigurableFragment;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.C11315i;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.navigation.ui.p */
public final class C19827p {
    @C12579k

    /* renamed from: a */
    public static final C19827p f50695a = new C19827p();

    /* renamed from: androidx.navigation.ui.p$a */
    public static final class C19828a implements NavController.C19676b {

        /* renamed from: a */
        public final /* synthetic */ WeakReference<NavigationBarView> f50696a;

        /* renamed from: b */
        public final /* synthetic */ NavController f50697b;

        public C19828a(WeakReference<NavigationBarView> weakReference, NavController navController) {
            this.f50696a = weakReference;
            this.f50697b = navController;
        }

        /* renamed from: a */
        public void mo58177a(@C12579k NavController navController, @C12579k NavDestination navDestination, @C12580l Bundle bundle) {
            Intrinsics.checkNotNullParameter(navController, "controller");
            Intrinsics.checkNotNullParameter(navDestination, FirebaseAnalytics.C32532b.f78977z);
            NavigationBarView navigationBarView = this.f50696a.get();
            if (navigationBarView == null) {
                this.f50697b.mo58100G0(this);
                return;
            }
            Menu menu = navigationBarView.getMenu();
            Intrinsics.checkNotNullExpressionValue(menu, "view.menu");
            int size = menu.size();
            for (int i = 0; i < size; i++) {
                MenuItem item = menu.getItem(i);
                Intrinsics.checkExpressionValueIsNotNull(item, "getItem(index)");
                if (C19827p.m92167h(navDestination, item.getItemId())) {
                    item.setChecked(true);
                }
            }
        }
    }

    /* renamed from: androidx.navigation.ui.p$b */
    public static final class C19829b implements NavController.C19676b {

        /* renamed from: a */
        public final /* synthetic */ WeakReference<NavigationView> f50698a;

        /* renamed from: b */
        public final /* synthetic */ NavController f50699b;

        public C19829b(WeakReference<NavigationView> weakReference, NavController navController) {
            this.f50698a = weakReference;
            this.f50699b = navController;
        }

        /* renamed from: a */
        public void mo58177a(@C12579k NavController navController, @C12579k NavDestination navDestination, @C12580l Bundle bundle) {
            Intrinsics.checkNotNullParameter(navController, "controller");
            Intrinsics.checkNotNullParameter(navDestination, FirebaseAnalytics.C32532b.f78977z);
            NavigationView navigationView = this.f50698a.get();
            if (navigationView == null) {
                this.f50699b.mo58100G0(this);
                return;
            }
            Menu menu = navigationView.getMenu();
            Intrinsics.checkNotNullExpressionValue(menu, "view.menu");
            int size = menu.size();
            for (int i = 0; i < size; i++) {
                MenuItem item = menu.getItem(i);
                Intrinsics.checkExpressionValueIsNotNull(item, "getItem(index)");
                item.setChecked(C19827p.m92167h(navDestination, item.getItemId()));
            }
        }
    }

    /* renamed from: androidx.navigation.ui.p$c */
    public static final class C19830c implements NavController.C19676b {

        /* renamed from: a */
        public final /* synthetic */ WeakReference<NavigationView> f50700a;

        /* renamed from: b */
        public final /* synthetic */ NavController f50701b;

        public C19830c(WeakReference<NavigationView> weakReference, NavController navController) {
            this.f50700a = weakReference;
            this.f50701b = navController;
        }

        /* renamed from: a */
        public void mo58177a(@C12579k NavController navController, @C12579k NavDestination navDestination, @C12580l Bundle bundle) {
            Intrinsics.checkNotNullParameter(navController, "controller");
            Intrinsics.checkNotNullParameter(navDestination, FirebaseAnalytics.C32532b.f78977z);
            NavigationView navigationView = this.f50700a.get();
            if (navigationView == null) {
                this.f50701b.mo58100G0(this);
                return;
            }
            Menu menu = navigationView.getMenu();
            Intrinsics.checkNotNullExpressionValue(menu, "view.menu");
            int size = menu.size();
            for (int i = 0; i < size; i++) {
                MenuItem item = menu.getItem(i);
                Intrinsics.checkExpressionValueIsNotNull(item, "getItem(index)");
                item.setChecked(C19827p.m92167h(navDestination, item.getItemId()));
            }
        }
    }

    /* renamed from: androidx.navigation.ui.p$d */
    public static final class C19831d implements NavController.C19676b {

        /* renamed from: a */
        public final /* synthetic */ WeakReference<NavigationBarView> f50702a;

        /* renamed from: b */
        public final /* synthetic */ NavController f50703b;

        public C19831d(WeakReference<NavigationBarView> weakReference, NavController navController) {
            this.f50702a = weakReference;
            this.f50703b = navController;
        }

        /* renamed from: a */
        public void mo58177a(@C12579k NavController navController, @C12579k NavDestination navDestination, @C12580l Bundle bundle) {
            Intrinsics.checkNotNullParameter(navController, "controller");
            Intrinsics.checkNotNullParameter(navDestination, FirebaseAnalytics.C32532b.f78977z);
            NavigationBarView navigationBarView = this.f50702a.get();
            if (navigationBarView == null) {
                this.f50703b.mo58100G0(this);
                return;
            }
            Menu menu = navigationBarView.getMenu();
            Intrinsics.checkNotNullExpressionValue(menu, "view.menu");
            int size = menu.size();
            for (int i = 0; i < size; i++) {
                MenuItem item = menu.getItem(i);
                Intrinsics.checkExpressionValueIsNotNull(item, "getItem(index)");
                if (C19827p.m92167h(navDestination, item.getItemId())) {
                    item.setChecked(true);
                }
            }
        }
    }

    @C19832q
    @C11384m
    /* renamed from: A */
    public static final void m92151A(@C12579k NavigationView navigationView, @C12579k NavController navController, boolean z) {
        Intrinsics.checkNotNullParameter(navigationView, "navigationView");
        Intrinsics.checkNotNullParameter(navController, "navController");
        if (!z) {
            navigationView.setNavigationItemSelectedListener(new C19820j(navController, z, navigationView));
            navController.mo58151q(new C19830c(new WeakReference(navigationView), navController));
            return;
        }
        throw new IllegalStateException("Leave the saveState parameter out entirely to use the non-experimental version of this API, which saves the state by default".toString());
    }

    /* renamed from: B */
    public static /* synthetic */ void m92152B(Toolbar toolbar, NavController navController, C19812d dVar, int i, Object obj) {
        if ((i & 4) != 0) {
            dVar = new C19812d.C19813a(navController.mo58107K()).mo58605a();
        }
        m92179t(toolbar, navController, dVar);
    }

    /* renamed from: C */
    public static /* synthetic */ void m92153C(CollapsingToolbarLayout collapsingToolbarLayout, Toolbar toolbar, NavController navController, C19812d dVar, int i, Object obj) {
        if ((i & 8) != 0) {
            dVar = new C19812d.C19813a(navController.mo58107K()).mo58605a();
        }
        m92182w(collapsingToolbarLayout, toolbar, navController, dVar);
    }

    /* renamed from: D */
    public static final void m92154D(NavController navController, C19812d dVar, View view) {
        Intrinsics.checkNotNullParameter(navController, "$navController");
        Intrinsics.checkNotNullParameter(dVar, "$configuration");
        m92170k(navController, dVar);
    }

    /* renamed from: E */
    public static final void m92155E(NavController navController, C19812d dVar, View view) {
        Intrinsics.checkNotNullParameter(navController, "$navController");
        Intrinsics.checkNotNullParameter(dVar, "$configuration");
        m92170k(navController, dVar);
    }

    /* renamed from: F */
    public static final boolean m92156F(NavController navController, NavigationView navigationView, MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(navController, "$navController");
        Intrinsics.checkNotNullParameter(navigationView, "$navigationView");
        Intrinsics.checkNotNullParameter(menuItem, "item");
        boolean l = m92171l(menuItem, navController);
        if (l) {
            ViewParent parent = navigationView.getParent();
            if (parent instanceof C18552c) {
                ((C18552c) parent).close();
            } else {
                BottomSheetBehavior<?> g = m92166g(navigationView);
                if (g != null) {
                    g.mo88418W0(5);
                }
            }
        }
        return l;
    }

    /* renamed from: G */
    public static final boolean m92157G(NavController navController, boolean z, NavigationView navigationView, MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(navController, "$navController");
        Intrinsics.checkNotNullParameter(navigationView, "$navigationView");
        Intrinsics.checkNotNullParameter(menuItem, "item");
        boolean m = m92172m(menuItem, navController, z);
        if (m) {
            ViewParent parent = navigationView.getParent();
            if (parent instanceof C18552c) {
                ((C18552c) parent).close();
            } else {
                BottomSheetBehavior<?> g = m92166g(navigationView);
                if (g != null) {
                    g.mo88418W0(5);
                }
            }
        }
        return m;
    }

    /* renamed from: H */
    public static final boolean m92158H(NavController navController, MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(navController, "$navController");
        Intrinsics.checkNotNullParameter(menuItem, "item");
        return m92171l(menuItem, navController);
    }

    /* renamed from: I */
    public static final boolean m92159I(NavController navController, boolean z, MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(navController, "$navController");
        Intrinsics.checkNotNullParameter(menuItem, "item");
        return m92172m(menuItem, navController, z);
    }

    @C12580l
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @C11384m
    /* renamed from: g */
    public static final BottomSheetBehavior<?> m92166g(@C12579k View view) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout.C16981g)) {
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                return m92166g((View) parent);
            }
            return null;
        }
        CoordinatorLayout.C16977c f = ((CoordinatorLayout.C16981g) layoutParams).mo51111f();
        if (!(f instanceof BottomSheetBehavior)) {
            return null;
        }
        return (BottomSheetBehavior) f;
    }

    @C11384m
    /* renamed from: h */
    public static final boolean m92167h(@C12579k NavDestination navDestination, @C0329d0 int i) {
        boolean z;
        Intrinsics.checkNotNullParameter(navDestination, "<this>");
        Iterator<NavDestination> it = NavDestination.f50441x.mo58260c(navDestination).iterator();
        do {
            z = false;
            if (!it.hasNext()) {
                return false;
            }
            if (it.next().mo58238f0() == i) {
                z = true;
                continue;
            }
        } while (!z);
        return true;
    }

    @C11384m
    /* renamed from: i */
    public static final boolean m92168i(@C12579k NavDestination navDestination, @C12579k Set<Integer> set) {
        Intrinsics.checkNotNullParameter(navDestination, "<this>");
        Intrinsics.checkNotNullParameter(set, "destinationIds");
        for (NavDestination f0 : NavDestination.f50441x.mo58260c(navDestination)) {
            if (set.contains(Integer.valueOf(f0.mo58238f0()))) {
                return true;
            }
        }
        return false;
    }

    @C11384m
    /* renamed from: j */
    public static final boolean m92169j(@C12579k NavController navController, @C12580l C18552c cVar) {
        Intrinsics.checkNotNullParameter(navController, "navController");
        return m92170k(navController, new C19812d.C19813a(navController.mo58107K()).mo58608d(cVar).mo58605a());
    }

    @C11384m
    /* renamed from: k */
    public static final boolean m92170k(@C12579k NavController navController, @C12579k C19812d dVar) {
        Intrinsics.checkNotNullParameter(navController, "navController");
        Intrinsics.checkNotNullParameter(dVar, BannerConfigurableFragment.f27258E0);
        C18552c c = dVar.mo58603c();
        NavDestination I = navController.mo58103I();
        Set<Integer> d = dVar.mo58604d();
        if (c != null && I != null && m92168i(I, d)) {
            c.open();
            return true;
        } else if (navController.mo58152q0()) {
            return true;
        } else {
            C19812d.C19814b b = dVar.mo58602b();
            if (b == null) {
                return false;
            }
            return b.mo58595a();
        }
    }

    @C11384m
    /* renamed from: l */
    public static final boolean m92171l(@C12579k MenuItem menuItem, @C12579k NavController navController) {
        Intrinsics.checkNotNullParameter(menuItem, "item");
        Intrinsics.checkNotNullParameter(navController, "navController");
        boolean z = true;
        C19761k0.C19762a m = new C19761k0.C19762a().mo58466d(true).mo58473m(true);
        NavDestination I = navController.mo58103I();
        Intrinsics.checkNotNull(I);
        NavGraph j0 = I.mo58243j0();
        Intrinsics.checkNotNull(j0);
        if (j0.mo58273J0(menuItem.getItemId()) instanceof ActivityNavigator.C19667b) {
            m.mo58464b(C19834s.C19835a.nav_default_enter_anim).mo58465c(C19834s.C19835a.nav_default_exit_anim).mo58467e(C19834s.C19835a.nav_default_pop_enter_anim).mo58468f(C19834s.C19835a.nav_default_pop_exit_anim);
        } else {
            m.mo58464b(C19834s.C19836b.nav_default_enter_anim).mo58465c(C19834s.C19836b.nav_default_exit_anim).mo58467e(C19834s.C19836b.nav_default_pop_enter_anim).mo58468f(C19834s.C19836b.nav_default_pop_exit_anim);
        }
        if ((menuItem.getOrder() & C20022q.C20025c.f51280k) == 0) {
            m.mo58470h(NavGraph.f50458E0.mo58289a(navController.mo58107K()).mo58238f0(), false, true);
        }
        try {
            navController.mo58132X(menuItem.getItemId(), (Bundle) null, m.mo58463a());
            NavDestination I2 = navController.mo58103I();
            if (I2 == null || !m92167h(I2, menuItem.getItemId())) {
                z = false;
            }
            return z;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    @C19832q
    @C11384m
    /* renamed from: m */
    public static final boolean m92172m(@C12579k MenuItem menuItem, @C12579k NavController navController, boolean z) {
        Intrinsics.checkNotNullParameter(menuItem, "item");
        Intrinsics.checkNotNullParameter(navController, "navController");
        boolean z2 = true;
        if (!z) {
            C19761k0.C19762a d = new C19761k0.C19762a().mo58466d(true);
            NavDestination I = navController.mo58103I();
            Intrinsics.checkNotNull(I);
            NavGraph j0 = I.mo58243j0();
            Intrinsics.checkNotNull(j0);
            if (j0.mo58273J0(menuItem.getItemId()) instanceof ActivityNavigator.C19667b) {
                d.mo58464b(C19834s.C19835a.nav_default_enter_anim).mo58465c(C19834s.C19835a.nav_default_exit_anim).mo58467e(C19834s.C19835a.nav_default_pop_enter_anim).mo58468f(C19834s.C19835a.nav_default_pop_exit_anim);
            } else {
                d.mo58464b(C19834s.C19836b.nav_default_enter_anim).mo58465c(C19834s.C19836b.nav_default_exit_anim).mo58467e(C19834s.C19836b.nav_default_pop_enter_anim).mo58468f(C19834s.C19836b.nav_default_pop_exit_anim);
            }
            if ((menuItem.getOrder() & C20022q.C20025c.f51280k) == 0) {
                C19761k0.C19762a.m91893k(d, NavGraph.f50458E0.mo58289a(navController.mo58107K()).mo58238f0(), false, false, 4, (Object) null);
            }
            try {
                navController.mo58132X(menuItem.getItemId(), (Bundle) null, d.mo58463a());
                NavDestination I2 = navController.mo58103I();
                if (I2 == null || !m92167h(I2, menuItem.getItemId())) {
                    z2 = false;
                }
                return z2;
            } catch (IllegalArgumentException unused) {
                return false;
            }
        } else {
            throw new IllegalStateException("Leave the saveState parameter out entirely to use the non-experimental version of this API, which saves the state by default".toString());
        }
    }

    @C11315i
    @C11384m
    /* renamed from: n */
    public static final void m92173n(@C12579k C0475e eVar, @C12579k NavController navController) {
        Intrinsics.checkNotNullParameter(eVar, C0696c.f2306r);
        Intrinsics.checkNotNullParameter(navController, "navController");
        m92176q(eVar, navController, (C19812d) null, 4, (Object) null);
    }

    @C11384m
    /* renamed from: o */
    public static final void m92174o(@C12579k C0475e eVar, @C12579k NavController navController, @C12580l C18552c cVar) {
        Intrinsics.checkNotNullParameter(eVar, C0696c.f2306r);
        Intrinsics.checkNotNullParameter(navController, "navController");
        m92175p(eVar, navController, new C19812d.C19813a(navController.mo58107K()).mo58608d(cVar).mo58605a());
    }

    @C11315i
    @C11384m
    /* renamed from: p */
    public static final void m92175p(@C12579k C0475e eVar, @C12579k NavController navController, @C12579k C19812d dVar) {
        Intrinsics.checkNotNullParameter(eVar, C0696c.f2306r);
        Intrinsics.checkNotNullParameter(navController, "navController");
        Intrinsics.checkNotNullParameter(dVar, BannerConfigurableFragment.f27258E0);
        navController.mo58151q(new C19810b(eVar, dVar));
    }

    /* renamed from: q */
    public static /* synthetic */ void m92176q(C0475e eVar, NavController navController, C19812d dVar, int i, Object obj) {
        if ((i & 4) != 0) {
            dVar = new C19812d.C19813a(navController.mo58107K()).mo58605a();
        }
        m92175p(eVar, navController, dVar);
    }

    @C11315i
    @C11384m
    /* renamed from: r */
    public static final void m92177r(@C12579k Toolbar toolbar, @C12579k NavController navController) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        Intrinsics.checkNotNullParameter(navController, "navController");
        m92152B(toolbar, navController, (C19812d) null, 4, (Object) null);
    }

    @C11384m
    /* renamed from: s */
    public static final void m92178s(@C12579k Toolbar toolbar, @C12579k NavController navController, @C12580l C18552c cVar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        Intrinsics.checkNotNullParameter(navController, "navController");
        m92179t(toolbar, navController, new C19812d.C19813a(navController.mo58107K()).mo58608d(cVar).mo58605a());
    }

    @C11315i
    @C11384m
    /* renamed from: t */
    public static final void m92179t(@C12579k Toolbar toolbar, @C12579k NavController navController, @C12579k C19812d dVar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        Intrinsics.checkNotNullParameter(navController, "navController");
        Intrinsics.checkNotNullParameter(dVar, BannerConfigurableFragment.f27258E0);
        navController.mo58151q(new C19840u(toolbar, dVar));
        toolbar.setNavigationOnClickListener(new C19825n(navController, dVar));
    }

    @C11315i
    @C11384m
    /* renamed from: u */
    public static final void m92180u(@C12579k CollapsingToolbarLayout collapsingToolbarLayout, @C12579k Toolbar toolbar, @C12579k NavController navController) {
        Intrinsics.checkNotNullParameter(collapsingToolbarLayout, "collapsingToolbarLayout");
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        Intrinsics.checkNotNullParameter(navController, "navController");
        m92153C(collapsingToolbarLayout, toolbar, navController, (C19812d) null, 8, (Object) null);
    }

    @C11384m
    /* renamed from: v */
    public static final void m92181v(@C12579k CollapsingToolbarLayout collapsingToolbarLayout, @C12579k Toolbar toolbar, @C12579k NavController navController, @C12580l C18552c cVar) {
        Intrinsics.checkNotNullParameter(collapsingToolbarLayout, "collapsingToolbarLayout");
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        Intrinsics.checkNotNullParameter(navController, "navController");
        m92182w(collapsingToolbarLayout, toolbar, navController, new C19812d.C19813a(navController.mo58107K()).mo58608d(cVar).mo58605a());
    }

    @C11315i
    @C11384m
    /* renamed from: w */
    public static final void m92182w(@C12579k CollapsingToolbarLayout collapsingToolbarLayout, @C12579k Toolbar toolbar, @C12579k NavController navController, @C12579k C19812d dVar) {
        Intrinsics.checkNotNullParameter(collapsingToolbarLayout, "collapsingToolbarLayout");
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        Intrinsics.checkNotNullParameter(navController, "navController");
        Intrinsics.checkNotNullParameter(dVar, BannerConfigurableFragment.f27258E0);
        navController.mo58151q(new C19817g(collapsingToolbarLayout, toolbar, dVar));
        toolbar.setNavigationOnClickListener(new C19821k(navController, dVar));
    }

    @C11384m
    /* renamed from: x */
    public static final void m92183x(@C12579k NavigationBarView navigationBarView, @C12579k NavController navController) {
        Intrinsics.checkNotNullParameter(navigationBarView, "navigationBarView");
        Intrinsics.checkNotNullParameter(navController, "navController");
        navigationBarView.setOnItemSelectedListener(new C19823l(navController));
        navController.mo58151q(new C19831d(new WeakReference(navigationBarView), navController));
    }

    @C19832q
    @C11384m
    /* renamed from: y */
    public static final void m92184y(@C12579k NavigationBarView navigationBarView, @C12579k NavController navController, boolean z) {
        Intrinsics.checkNotNullParameter(navigationBarView, "navigationBarView");
        Intrinsics.checkNotNullParameter(navController, "navController");
        if (!z) {
            navigationBarView.setOnItemSelectedListener(new C19826o(navController, z));
            navController.mo58151q(new C19828a(new WeakReference(navigationBarView), navController));
            return;
        }
        throw new IllegalStateException("Leave the saveState parameter out entirely to use the non-experimental version of this API, which saves the state by default".toString());
    }

    @C11384m
    /* renamed from: z */
    public static final void m92185z(@C12579k NavigationView navigationView, @C12579k NavController navController) {
        Intrinsics.checkNotNullParameter(navigationView, "navigationView");
        Intrinsics.checkNotNullParameter(navController, "navController");
        navigationView.setNavigationItemSelectedListener(new C19824m(navController, navigationView));
        navController.mo58151q(new C19829b(new WeakReference(navigationView), navController));
    }
}
