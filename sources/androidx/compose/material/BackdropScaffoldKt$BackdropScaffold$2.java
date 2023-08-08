package androidx.compose.material;

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
public final class BackdropScaffoldKt$BackdropScaffold$2 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $appBar;
    final /* synthetic */ long $backLayerBackgroundColor;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $backLayerContent;
    final /* synthetic */ long $backLayerContentColor;
    final /* synthetic */ long $frontLayerBackgroundColor;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $frontLayerContent;
    final /* synthetic */ long $frontLayerContentColor;
    final /* synthetic */ float $frontLayerElevation;
    final /* synthetic */ long $frontLayerScrimColor;
    final /* synthetic */ C15218g4 $frontLayerShape;
    final /* synthetic */ boolean $gesturesEnabled;
    final /* synthetic */ float $headerHeight;
    final /* synthetic */ C8767m $modifier;
    final /* synthetic */ float $peekHeight;
    final /* synthetic */ boolean $persistentAppBar;
    final /* synthetic */ BackdropScaffoldState $scaffoldState;
    final /* synthetic */ C11305q<SnackbarHostState, C8592o, Integer, C11079d2> $snackbarHost;
    final /* synthetic */ boolean $stickyFrontLayer;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackdropScaffoldKt$BackdropScaffold$2(C11304p<? super C8592o, ? super Integer, C11079d2> pVar, C11304p<? super C8592o, ? super Integer, C11079d2> pVar2, C11304p<? super C8592o, ? super Integer, C11079d2> pVar3, C8767m mVar, BackdropScaffoldState backdropScaffoldState, boolean z, float f, float f2, boolean z2, boolean z3, long j, long j2, C15218g4 g4Var, float f3, long j3, long j4, long j5, C11305q<? super SnackbarHostState, ? super C8592o, ? super Integer, C11079d2> qVar, int i, int i2, int i3) {
        super(2);
        this.$appBar = pVar;
        this.$backLayerContent = pVar2;
        this.$frontLayerContent = pVar3;
        this.$modifier = mVar;
        this.$scaffoldState = backdropScaffoldState;
        this.$gesturesEnabled = z;
        this.$peekHeight = f;
        this.$headerHeight = f2;
        this.$persistentAppBar = z2;
        this.$stickyFrontLayer = z3;
        this.$backLayerBackgroundColor = j;
        this.$backLayerContentColor = j2;
        this.$frontLayerShape = g4Var;
        this.$frontLayerElevation = f3;
        this.$frontLayerBackgroundColor = j3;
        this.$frontLayerContentColor = j4;
        this.$frontLayerScrimColor = j5;
        this.$snackbarHost = qVar;
        this.$$changed = i;
        this.$$changed1 = i2;
        this.$$default = i3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        C8592o oVar2 = oVar;
        C11304p<C8592o, Integer, C11079d2> pVar = this.$appBar;
        C11304p<C8592o, Integer, C11079d2> pVar2 = pVar;
        BackdropScaffoldKt.m13222c(pVar2, this.$backLayerContent, this.$frontLayerContent, this.$modifier, this.$scaffoldState, this.$gesturesEnabled, this.$peekHeight, this.$headerHeight, this.$persistentAppBar, this.$stickyFrontLayer, this.$backLayerBackgroundColor, this.$backLayerContentColor, this.$frontLayerShape, this.$frontLayerElevation, this.$frontLayerBackgroundColor, this.$frontLayerContentColor, this.$frontLayerScrimColor, this.$snackbarHost, oVar2, C8590n1.m31123a(this.$$changed | 1), C8590n1.m31123a(this.$$changed1), this.$$default);
    }
}
