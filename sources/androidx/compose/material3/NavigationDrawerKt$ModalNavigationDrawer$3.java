package androidx.compose.material3;

import androidx.compose.p004ui.C8767m;
import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class NavigationDrawerKt$ModalNavigationDrawer$3 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $content;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $drawerContent;
    final /* synthetic */ DrawerState $drawerState;
    final /* synthetic */ boolean $gesturesEnabled;
    final /* synthetic */ C8767m $modifier;
    final /* synthetic */ long $scrimColor;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NavigationDrawerKt$ModalNavigationDrawer$3(C11304p<? super C8592o, ? super Integer, C11079d2> pVar, C8767m mVar, DrawerState drawerState, boolean z, long j, C11304p<? super C8592o, ? super Integer, C11079d2> pVar2, int i, int i2) {
        super(2);
        this.$drawerContent = pVar;
        this.$modifier = mVar;
        this.$drawerState = drawerState;
        this.$gesturesEnabled = z;
        this.$scrimColor = j;
        this.$content = pVar2;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        NavigationDrawerKt.m25938e(this.$drawerContent, this.$modifier, this.$drawerState, this.$gesturesEnabled, this.$scrimColor, this.$content, oVar, C8590n1.m31123a(this.$$changed | 1), this.$$default);
    }
}
