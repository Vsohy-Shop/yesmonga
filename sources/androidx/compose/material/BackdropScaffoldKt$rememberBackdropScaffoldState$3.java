package androidx.compose.material;

import androidx.compose.animation.core.C1968g;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class BackdropScaffoldKt$rememberBackdropScaffoldState$3 extends Lambda implements C11289a<BackdropScaffoldState> {
    final /* synthetic */ C1968g<Float> $animationSpec;
    final /* synthetic */ C11300l<BackdropValue, Boolean> $confirmStateChange;
    final /* synthetic */ BackdropValue $initialValue;
    final /* synthetic */ SnackbarHostState $snackbarHostState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackdropScaffoldKt$rememberBackdropScaffoldState$3(BackdropValue backdropValue, C1968g<Float> gVar, C11300l<? super BackdropValue, Boolean> lVar, SnackbarHostState snackbarHostState) {
        super(0);
        this.$initialValue = backdropValue;
        this.$animationSpec = gVar;
        this.$confirmStateChange = lVar;
        this.$snackbarHostState = snackbarHostState;
    }

    @C12579k
    /* renamed from: a */
    public final BackdropScaffoldState invoke() {
        return new BackdropScaffoldState(this.$initialValue, this.$animationSpec, this.$confirmStateChange, this.$snackbarHostState);
    }
}
