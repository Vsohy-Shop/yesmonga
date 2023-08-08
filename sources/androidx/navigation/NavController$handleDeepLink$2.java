package androidx.navigation;

import java.util.Iterator;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.C11559m;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo22516d2 = {"Landroidx/navigation/NavOptionsBuilder;", "Lkotlin/d2;", "invoke", "(Landroidx/navigation/NavOptionsBuilder;)V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 6, 0})
public final class NavController$handleDeepLink$2 extends Lambda implements C11300l<NavOptionsBuilder, C11079d2> {
    final /* synthetic */ NavDestination $node;
    final /* synthetic */ NavController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NavController$handleDeepLink$2(NavDestination navDestination, NavController navController) {
        super(1);
        this.$node = navDestination;
        this.this$0 = navController;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((NavOptionsBuilder) obj);
        return C11079d2.f28267a;
    }

    public final void invoke(@C12579k NavOptionsBuilder navOptionsBuilder) {
        boolean z;
        Intrinsics.checkNotNullParameter(navOptionsBuilder, "$this$navOptions");
        navOptionsBuilder.mo58295a(C196781.f50413f);
        NavDestination navDestination = this.$node;
        boolean z2 = false;
        if (navDestination instanceof NavGraph) {
            C11559m<NavDestination> c = NavDestination.f50441x.mo58260c(navDestination);
            NavController navController = this.this$0;
            Iterator<NavDestination> it = c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = true;
                    break;
                }
                NavDestination next = it.next();
                NavDestination I = navController.mo58103I();
                if (Intrinsics.areEqual((Object) next, (Object) I != null ? I.mo58243j0() : null)) {
                    z = false;
                    break;
                }
            }
            if (z) {
                z2 = true;
            }
        }
        if (z2 && NavController.f50376U) {
            navOptionsBuilder.mo58302i(NavGraph.f50458E0.mo58289a(this.this$0.mo58107K()).mo58238f0(), C196792.f50414f);
        }
    }
}
