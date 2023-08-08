package androidx.navigation;

import com.google.firebase.remoteconfig.internal.C33541p;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.collections.C10944i;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"Landroidx/navigation/NavBackStackEntry;", "entry", "Lkotlin/d2;", "a", "(Landroidx/navigation/NavBackStackEntry;)V"}, mo22517k = 3, mo22518mv = {1, 6, 0})
public final class NavController$popBackStackInternal$2 extends Lambda implements C11300l<NavBackStackEntry, C11079d2> {
    final /* synthetic */ Ref.BooleanRef $popped;
    final /* synthetic */ Ref.BooleanRef $receivedPop;
    final /* synthetic */ boolean $saveState;
    final /* synthetic */ C10944i<NavBackStackEntryState> $savedState;
    final /* synthetic */ NavController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NavController$popBackStackInternal$2(Ref.BooleanRef booleanRef, Ref.BooleanRef booleanRef2, NavController navController, boolean z, C10944i<NavBackStackEntryState> iVar) {
        super(1);
        this.$receivedPop = booleanRef;
        this.$popped = booleanRef2;
        this.this$0 = navController;
        this.$saveState = z;
        this.$savedState = iVar;
    }

    /* renamed from: a */
    public final void mo58186a(@C12579k NavBackStackEntry navBackStackEntry) {
        Intrinsics.checkNotNullParameter(navBackStackEntry, C33541p.f81644a);
        this.$receivedPop.element = true;
        this.$popped.element = true;
        this.this$0.mo58095D0(navBackStackEntry, this.$saveState, this.$savedState);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo58186a((NavBackStackEntry) obj);
        return C11079d2.f28267a;
    }
}
