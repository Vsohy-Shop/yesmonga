package androidx.compose.foundation.gestures.snapping;

import androidx.compose.p004ui.unit.C16479d;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo22516d2 = {"Landroidx/compose/ui/unit/d;", "", "layoutSize", "itemSize", "a", "(Landroidx/compose/ui/unit/d;FF)Ljava/lang/Float;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class LazyListSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1 extends Lambda implements C11305q<C16479d, Float, Float, Float> {

    /* renamed from: f */
    public static final LazyListSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1 f5947f = new LazyListSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1();

    public LazyListSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1() {
        super(3);
    }

    @C12579k
    /* renamed from: a */
    public final Float mo7550a(@C12579k C16479d dVar, float f, float f2) {
        Intrinsics.checkNotNullParameter(dVar, "$this$null");
        return Float.valueOf((f / 2.0f) - (f2 / 2.0f));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return mo7550a((C16479d) obj, ((Number) obj2).floatValue(), ((Number) obj3).floatValue());
    }
}
