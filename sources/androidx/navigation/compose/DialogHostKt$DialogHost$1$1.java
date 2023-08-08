package androidx.navigation.compose;

import androidx.navigation.NavBackStackEntry;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 6, 0}, mo22520xi = 48)
public final class DialogHostKt$DialogHost$1$1 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ NavBackStackEntry $backStackEntry;
    final /* synthetic */ C19714d $dialogNavigator;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DialogHostKt$DialogHost$1$1(C19714d dVar, NavBackStackEntry navBackStackEntry) {
        super(0);
        this.$dialogNavigator = dVar;
        this.$backStackEntry = navBackStackEntry;
    }

    public final void invoke() {
        this.$dialogNavigator.mo58381m(this.$backStackEntry);
    }
}
