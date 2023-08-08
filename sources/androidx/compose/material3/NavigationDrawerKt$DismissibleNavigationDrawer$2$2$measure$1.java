package androidx.compose.material3;

import androidx.compose.p004ui.layout.C15611w0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.math.C11409d;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class NavigationDrawerKt$DismissibleNavigationDrawer$2$2$measure$1 extends Lambda implements C11300l<C15611w0.C15612a, C11079d2> {
    final /* synthetic */ C15611w0 $contentPlaceable;
    final /* synthetic */ DrawerState $drawerState;
    final /* synthetic */ C15611w0 $sheetPlaceable;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NavigationDrawerKt$DismissibleNavigationDrawer$2$2$measure$1(C15611w0 w0Var, C15611w0 w0Var2, DrawerState drawerState) {
        super(1);
        this.$contentPlaceable = w0Var;
        this.$sheetPlaceable = w0Var2;
        this.$drawerState = drawerState;
    }

    /* renamed from: a */
    public final void mo11707a(@C12579k C15611w0.C15612a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "$this$layout");
        C15611w0.C15612a aVar2 = aVar;
        C15611w0.C15612a.m69414v(aVar2, this.$contentPlaceable, this.$sheetPlaceable.mo44471K0() + C11409d.m43851L0(this.$drawerState.mo11512e().getValue().floatValue()), 0, 0.0f, 4, (Object) null);
        C15611w0.C15612a.m69414v(aVar2, this.$sheetPlaceable, C11409d.m43851L0(this.$drawerState.mo11512e().getValue().floatValue()), 0, 0.0f, 4, (Object) null);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo11707a((C15611w0.C15612a) obj);
        return C11079d2.f28267a;
    }
}
