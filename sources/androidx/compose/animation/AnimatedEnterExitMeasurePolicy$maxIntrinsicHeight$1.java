package androidx.compose.animation;

import androidx.compose.p004ui.layout.C15580l;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"Landroidx/compose/ui/layout/l;", "it", "", "a", "(Landroidx/compose/ui/layout/l;)Ljava/lang/Integer;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class AnimatedEnterExitMeasurePolicy$maxIntrinsicHeight$1 extends Lambda implements C11300l<C15580l, Integer> {
    final /* synthetic */ int $width;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnimatedEnterExitMeasurePolicy$maxIntrinsicHeight$1(int i) {
        super(1);
        this.$width = i;
    }

    @C12579k
    /* renamed from: a */
    public final Integer invoke(@C12579k C15580l lVar) {
        Intrinsics.checkNotNullParameter(lVar, "it");
        return Integer.valueOf(lVar.mo44320d(this.$width));
    }
}
