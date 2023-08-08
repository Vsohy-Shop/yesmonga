package androidx.compose.material;

import androidx.compose.foundation.layout.C2366i0;
import androidx.compose.foundation.layout.C2373k;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class ScaffoldKt$Scaffold$2 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ long $backgroundColor;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $bottomBar;
    final /* synthetic */ C11305q<C2366i0, C8592o, Integer, C11079d2> $content;
    final /* synthetic */ long $contentColor;
    final /* synthetic */ long $drawerBackgroundColor;
    final /* synthetic */ C11305q<C2373k, C8592o, Integer, C11079d2> $drawerContent;
    final /* synthetic */ long $drawerContentColor;
    final /* synthetic */ float $drawerElevation;
    final /* synthetic */ boolean $drawerGesturesEnabled;
    final /* synthetic */ long $drawerScrimColor;
    final /* synthetic */ C15218g4 $drawerShape;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $floatingActionButton;
    final /* synthetic */ int $floatingActionButtonPosition;
    final /* synthetic */ boolean $isFloatingActionButtonDocked;
    final /* synthetic */ C8767m $modifier;
    final /* synthetic */ C3036d1 $scaffoldState;
    final /* synthetic */ C11305q<SnackbarHostState, C8592o, Integer, C11079d2> $snackbarHost;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $topBar;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScaffoldKt$Scaffold$2(C8767m mVar, C3036d1 d1Var, C11304p<? super C8592o, ? super Integer, C11079d2> pVar, C11304p<? super C8592o, ? super Integer, C11079d2> pVar2, C11305q<? super SnackbarHostState, ? super C8592o, ? super Integer, C11079d2> qVar, C11304p<? super C8592o, ? super Integer, C11079d2> pVar3, int i, boolean z, C11305q<? super C2373k, ? super C8592o, ? super Integer, C11079d2> qVar2, boolean z2, C15218g4 g4Var, float f, long j, long j2, long j3, long j4, long j5, C11305q<? super C2366i0, ? super C8592o, ? super Integer, C11079d2> qVar3, int i2, int i3, int i4) {
        super(2);
        this.$modifier = mVar;
        this.$scaffoldState = d1Var;
        this.$topBar = pVar;
        this.$bottomBar = pVar2;
        this.$snackbarHost = qVar;
        this.$floatingActionButton = pVar3;
        this.$floatingActionButtonPosition = i;
        this.$isFloatingActionButtonDocked = z;
        this.$drawerContent = qVar2;
        this.$drawerGesturesEnabled = z2;
        this.$drawerShape = g4Var;
        this.$drawerElevation = f;
        this.$drawerBackgroundColor = j;
        this.$drawerContentColor = j2;
        this.$drawerScrimColor = j3;
        this.$backgroundColor = j4;
        this.$contentColor = j5;
        this.$content = qVar3;
        this.$$changed = i2;
        this.$$changed1 = i3;
        this.$$default = i4;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        C8592o oVar2 = oVar;
        C8767m mVar = this.$modifier;
        C8767m mVar2 = mVar;
        ScaffoldKt.m13747a(mVar2, this.$scaffoldState, this.$topBar, this.$bottomBar, this.$snackbarHost, this.$floatingActionButton, this.$floatingActionButtonPosition, this.$isFloatingActionButtonDocked, this.$drawerContent, this.$drawerGesturesEnabled, this.$drawerShape, this.$drawerElevation, this.$drawerBackgroundColor, this.$drawerContentColor, this.$drawerScrimColor, this.$backgroundColor, this.$contentColor, this.$content, oVar2, C8590n1.m31123a(this.$$changed | 1), C8590n1.m31123a(this.$$changed1), this.$$default);
    }
}
