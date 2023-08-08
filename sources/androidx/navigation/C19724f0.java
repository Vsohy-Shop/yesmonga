package androidx.navigation;

import android.os.Bundle;
import androidx.navigation.Navigator;
import com.google.firebase.remoteconfig.C33585u;
import java.util.List;
import kotlin.C11076d0;
import kotlin.collections.C10976s;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0016J*\u0010\f\u001a\u00020\u000b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J$\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, mo22516d2 = {"Landroidx/navigation/f0;", "Landroidx/navigation/Navigator;", "Landroidx/navigation/NavGraph;", "l", "", "Landroidx/navigation/NavBackStackEntry;", "entries", "Landroidx/navigation/k0;", "navOptions", "Landroidx/navigation/Navigator$a;", "navigatorExtras", "Lkotlin/d2;", "e", "entry", "m", "Landroidx/navigation/r0;", "c", "Landroidx/navigation/r0;", "navigatorProvider", "<init>", "(Landroidx/navigation/r0;)V", "navigation-common_release"}, mo22517k = 1, mo22518mv = {1, 6, 0})
@Navigator.C19689b("navigation")
/* renamed from: androidx.navigation.f0 */
public class C19724f0 extends Navigator<NavGraph> {
    @C12579k

    /* renamed from: c */
    public final C19795r0 f50530c;

    public C19724f0(@C12579k C19795r0 r0Var) {
        Intrinsics.checkNotNullParameter(r0Var, "navigatorProvider");
        this.f50530c = r0Var;
    }

    /* renamed from: e */
    public void mo58317e(@C12579k List<NavBackStackEntry> list, @C12580l C19761k0 k0Var, @C12580l Navigator.C19688a aVar) {
        Intrinsics.checkNotNullParameter(list, C33585u.C33588c.f81747z3);
        for (NavBackStackEntry m : list) {
            mo58395m(m, k0Var, aVar);
        }
    }

    @C12579k
    /* renamed from: l */
    public NavGraph mo58032a() {
        return new NavGraph(this);
    }

    /* renamed from: m */
    public final void mo58395m(NavBackStackEntry navBackStackEntry, C19761k0 k0Var, Navigator.C19688a aVar) {
        boolean z;
        NavDestination navDestination;
        NavGraph navGraph = (NavGraph) navBackStackEntry.mo58065f();
        Bundle d = navBackStackEntry.mo58062d();
        int S0 = navGraph.mo58280S0();
        String T0 = navGraph.mo58281T0();
        if (S0 == 0 && T0 == null) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            if (T0 != null) {
                navDestination = navGraph.mo58276M0(T0, false);
            } else {
                navDestination = navGraph.mo58274K0(S0, false);
            }
            if (navDestination != null) {
                this.f50530c.mo58562f(navDestination.mo58242i0()).mo58317e(C10976s.m41419k(mo58315b().mo58169a(navDestination, navDestination.mo58249r(d))), k0Var, aVar);
                return;
            }
            throw new IllegalArgumentException("navigation destination " + navGraph.mo58278P0() + " is not a direct child of this NavGraph");
        }
        throw new IllegalStateException(("no start destination defined via app:startDestination for " + navGraph.mo58237W()).toString());
    }
}
