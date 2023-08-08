package androidx.navigation;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo22516d2 = {"Landroidx/navigation/NavDestination;", "destination", "a", "(Landroidx/navigation/NavDestination;)Landroidx/navigation/NavDestination;"}, mo22517k = 3, mo22518mv = {1, 6, 0})
public final class NavController$popBackStackInternal$6 extends Lambda implements C11300l<NavDestination, NavDestination> {

    /* renamed from: f */
    public static final NavController$popBackStackInternal$6 f50418f = new NavController$popBackStackInternal$6();

    public NavController$popBackStackInternal$6() {
        super(1);
    }

    @C12580l
    /* renamed from: a */
    public final NavDestination invoke(@C12579k NavDestination navDestination) {
        Intrinsics.checkNotNullParameter(navDestination, FirebaseAnalytics.C32532b.f78977z);
        NavGraph j0 = navDestination.mo58243j0();
        boolean z = false;
        if (j0 != null && j0.mo58280S0() == navDestination.mo58238f0()) {
            z = true;
        }
        if (z) {
            return navDestination.mo58243j0();
        }
        return null;
    }
}
