package androidx.navigation;

import android.os.Bundle;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"Landroidx/navigation/NavBackStackEntry;", "it", "Lkotlin/d2;", "a", "(Landroidx/navigation/NavBackStackEntry;)V"}, mo22517k = 3, mo22518mv = {1, 6, 0})
public final class NavController$navigate$4 extends Lambda implements C11300l<NavBackStackEntry, C11079d2> {
    final /* synthetic */ Bundle $finalArgs;
    final /* synthetic */ Ref.BooleanRef $navigated;
    final /* synthetic */ NavDestination $node;
    final /* synthetic */ NavController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NavController$navigate$4(Ref.BooleanRef booleanRef, NavController navController, NavDestination navDestination, Bundle bundle) {
        super(1);
        this.$navigated = booleanRef;
        this.this$0 = navController;
        this.$node = navDestination;
        this.$finalArgs = bundle;
    }

    /* renamed from: a */
    public final void mo58183a(@C12579k NavBackStackEntry navBackStackEntry) {
        Intrinsics.checkNotNullParameter(navBackStackEntry, "it");
        this.$navigated.element = true;
        NavController.m91395p(this.this$0, this.$node, this.$finalArgs, navBackStackEntry, (List) null, 8, (Object) null);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo58183a((NavBackStackEntry) obj);
        return C11079d2.f28267a;
    }
}
