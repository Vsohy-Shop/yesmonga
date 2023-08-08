package androidx.compose.material3;

import androidx.compose.p004ui.unit.C16479d;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"Landroidx/compose/ui/unit/d;", "", "distance", "a", "(Landroidx/compose/ui/unit/d;F)Ljava/lang/Float;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class SwipeableV2Kt$fractionalPositionalThreshold$1 extends Lambda implements C11304p<C16479d, Float, Float> {
    final /* synthetic */ float $fraction;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwipeableV2Kt$fractionalPositionalThreshold$1(float f) {
        super(2);
        this.$fraction = f;
    }

    @C12579k
    /* renamed from: a */
    public final Float mo12082a(@C12579k C16479d dVar, float f) {
        Intrinsics.checkNotNullParameter(dVar, "$this$null");
        return Float.valueOf(f * this.$fraction);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return mo12082a((C16479d) obj, ((Number) obj2).floatValue());
    }
}
