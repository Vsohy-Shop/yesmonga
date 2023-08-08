package androidx.compose.material;

import androidx.compose.animation.core.C1968g;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class ModalBottomSheetKt$rememberModalBottomSheetState$2 extends Lambda implements C11289a<ModalBottomSheetState> {
    final /* synthetic */ C1968g<Float> $animationSpec;
    final /* synthetic */ C11300l<ModalBottomSheetValue, Boolean> $confirmValueChange;
    final /* synthetic */ ModalBottomSheetValue $initialValue;
    final /* synthetic */ boolean $skipHalfExpanded;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ModalBottomSheetKt$rememberModalBottomSheetState$2(ModalBottomSheetValue modalBottomSheetValue, C1968g<Float> gVar, C11300l<? super ModalBottomSheetValue, Boolean> lVar, boolean z) {
        super(0);
        this.$initialValue = modalBottomSheetValue;
        this.$animationSpec = gVar;
        this.$confirmValueChange = lVar;
        this.$skipHalfExpanded = z;
    }

    @C12579k
    /* renamed from: a */
    public final ModalBottomSheetState invoke() {
        return ModalBottomSheetKt.m13583d(this.$initialValue, this.$animationSpec, this.$confirmValueChange, this.$skipHalfExpanded);
    }
}
