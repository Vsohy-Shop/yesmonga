package androidx.compose.foundation.layout;

import androidx.compose.p004ui.layout.C15580l;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, mo22516d2 = {"", "Landroidx/compose/ui/layout/l;", "measurables", "", "availableWidth", "mainAxisSpacing", "a", "(Ljava/util/List;II)Ljava/lang/Integer;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class IntrinsicMeasureBlocks$VerticalMinHeight$1 extends Lambda implements C11305q<List<? extends C15580l>, Integer, Integer, Integer> {

    /* renamed from: f */
    public static final IntrinsicMeasureBlocks$VerticalMinHeight$1 f6117f = new IntrinsicMeasureBlocks$VerticalMinHeight$1();

    public IntrinsicMeasureBlocks$VerticalMinHeight$1() {
        super(3);
    }

    @C12579k
    /* renamed from: a */
    public final Integer mo7795a(@C12579k List<? extends C15580l> list, int i, int i2) {
        Intrinsics.checkNotNullParameter(list, "measurables");
        C22931 r2 = C22931.f6118f;
        C22942 r3 = C22942.f6119f;
        LayoutOrientation layoutOrientation = LayoutOrientation.Vertical;
        return Integer.valueOf(RowColumnImplKt.m10059p(list, r2, r3, i, i2, layoutOrientation, layoutOrientation));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return mo7795a((List) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
    }
}
