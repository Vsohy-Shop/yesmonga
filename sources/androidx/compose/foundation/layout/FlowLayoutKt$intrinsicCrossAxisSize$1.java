package androidx.compose.foundation.layout;

import androidx.compose.p004ui.layout.C15580l;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo22516d2 = {"Landroidx/compose/ui/layout/l;", "", "index", "<anonymous parameter 1>", "a", "(Landroidx/compose/ui/layout/l;II)Ljava/lang/Integer;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class FlowLayoutKt$intrinsicCrossAxisSize$1 extends Lambda implements C11305q<C15580l, Integer, Integer, Integer> {
    final /* synthetic */ int[] $mainAxisSizes;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowLayoutKt$intrinsicCrossAxisSize$1(int[] iArr) {
        super(3);
        this.$mainAxisSizes = iArr;
    }

    @C12579k
    /* renamed from: a */
    public final Integer mo7756a(@C12579k C15580l lVar, int i, int i2) {
        Intrinsics.checkNotNullParameter(lVar, "$this$intrinsicCrossAxisSize");
        return Integer.valueOf(this.$mainAxisSizes[i]);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return mo7756a((C15580l) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
    }
}
