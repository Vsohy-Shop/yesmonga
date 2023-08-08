package androidx.navigation;

import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo22516d2 = {"Landroidx/navigation/NavDestination;", "it", "a", "(Landroidx/navigation/NavDestination;)Landroidx/navigation/NavDestination;"}, mo22517k = 3, mo22518mv = {1, 6, 0})
public final class NavGraph$Companion$findStartDestination$1 extends Lambda implements C11300l<NavDestination, NavDestination> {

    /* renamed from: f */
    public static final NavGraph$Companion$findStartDestination$1 f50466f = new NavGraph$Companion$findStartDestination$1();

    public NavGraph$Companion$findStartDestination$1() {
        super(1);
    }

    @C12580l
    /* renamed from: a */
    public final NavDestination invoke(@C12579k NavDestination navDestination) {
        Intrinsics.checkNotNullParameter(navDestination, "it");
        if (!(navDestination instanceof NavGraph)) {
            return null;
        }
        NavGraph navGraph = (NavGraph) navDestination;
        return navGraph.mo58273J0(navGraph.mo58280S0());
    }
}
