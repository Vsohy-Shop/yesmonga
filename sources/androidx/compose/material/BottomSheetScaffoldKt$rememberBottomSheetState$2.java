package androidx.compose.material;

import androidx.compose.animation.core.C1968g;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class BottomSheetScaffoldKt$rememberBottomSheetState$2 extends Lambda implements C11289a<BottomSheetState> {
    final /* synthetic */ C1968g<Float> $animationSpec;
    final /* synthetic */ C11300l<BottomSheetValue, Boolean> $confirmStateChange;
    final /* synthetic */ BottomSheetValue $initialValue;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BottomSheetScaffoldKt$rememberBottomSheetState$2(BottomSheetValue bottomSheetValue, C1968g<Float> gVar, C11300l<? super BottomSheetValue, Boolean> lVar) {
        super(0);
        this.$initialValue = bottomSheetValue;
        this.$animationSpec = gVar;
        this.$confirmStateChange = lVar;
    }

    @C12579k
    /* renamed from: a */
    public final BottomSheetState invoke() {
        return new BottomSheetState(this.$initialValue, this.$animationSpec, this.$confirmStateChange);
    }
}
