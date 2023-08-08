package androidx.navigation;

import androidx.navigation.Navigator;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo22516d2 = {"Landroidx/navigation/NavDestination;", "D", "Landroidx/navigation/NavBackStackEntry;", "backStackEntry", "a", "(Landroidx/navigation/NavBackStackEntry;)Landroidx/navigation/NavBackStackEntry;"}, mo22517k = 3, mo22518mv = {1, 6, 0})
public final class Navigator$navigate$1 extends Lambda implements C11300l<NavBackStackEntry, NavBackStackEntry> {
    final /* synthetic */ C19761k0 $navOptions;
    final /* synthetic */ Navigator.C19688a $navigatorExtras;
    final /* synthetic */ Navigator<D> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Navigator$navigate$1(Navigator<D> navigator, C19761k0 k0Var, Navigator.C19688a aVar) {
        super(1);
        this.this$0 = navigator;
        this.$navOptions = k0Var;
        this.$navigatorExtras = aVar;
    }

    @C12580l
    /* renamed from: a */
    public final NavBackStackEntry invoke(@C12579k NavBackStackEntry navBackStackEntry) {
        Intrinsics.checkNotNullParameter(navBackStackEntry, "backStackEntry");
        NavDestination f = navBackStackEntry.mo58065f();
        if (!(f instanceof NavDestination)) {
            f = null;
        }
        if (f == null) {
            return null;
        }
        NavDestination d = this.this$0.mo58033d(f, navBackStackEntry.mo58062d(), this.$navOptions, this.$navigatorExtras);
        if (d == null) {
            return null;
        }
        if (Intrinsics.areEqual((Object) d, (Object) f)) {
            return navBackStackEntry;
        }
        return this.this$0.mo58315b().mo58169a(d, d.mo58249r(navBackStackEntry.mo58062d()));
    }
}
