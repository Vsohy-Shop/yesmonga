package androidx.compose.material3;

import androidx.compose.p004ui.layout.C15557e0;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.C15564g0;
import androidx.compose.p004ui.layout.C15568h0;
import androidx.compose.p004ui.layout.C15611w0;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

public final class NavigationDrawerKt$DismissibleNavigationDrawer$2$2 implements C15560f0 {

    /* renamed from: a */
    public final /* synthetic */ DrawerState f19509a;

    public NavigationDrawerKt$DismissibleNavigationDrawer$2$2(DrawerState drawerState) {
        this.f19509a = drawerState;
    }

    @C12579k
    /* renamed from: a */
    public final C15564g0 mo6397a(@C12579k C15568h0 h0Var, @C12579k List<? extends C15557e0> list, long j) {
        Intrinsics.checkNotNullParameter(h0Var, "$this$Layout");
        Intrinsics.checkNotNullParameter(list, "measurables");
        C15611w0 t0 = ((C15557e0) list.get(0)).mo44324t0(j);
        C15611w0 t02 = ((C15557e0) list.get(1)).mo44324t0(j);
        return C15568h0.m69206r2(h0Var, t02.mo44471K0(), t02.mo44468G0(), (Map) null, new NavigationDrawerKt$DismissibleNavigationDrawer$2$2$measure$1(t02, t0, this.f19509a), 4, (Object) null);
    }
}
