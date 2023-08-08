package androidx.compose.material;

import androidx.compose.animation.core.C1968g;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo22516d2 = {"", "T", "it", "Landroidx/compose/material/SwipeableState;", "a", "(Ljava/lang/Object;)Landroidx/compose/material/SwipeableState;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class SwipeableState$Companion$Saver$2 extends Lambda implements C11300l<T, SwipeableState<T>> {
    final /* synthetic */ C1968g<Float> $animationSpec;
    final /* synthetic */ C11300l<T, Boolean> $confirmStateChange;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwipeableState$Companion$Saver$2(C1968g<Float> gVar, C11300l<? super T, Boolean> lVar) {
        super(1);
        this.$animationSpec = gVar;
        this.$confirmStateChange = lVar;
    }

    @C12580l
    /* renamed from: a */
    public final SwipeableState<T> invoke(@C12579k T t) {
        Intrinsics.checkNotNullParameter(t, "it");
        return new SwipeableState<>(t, this.$animationSpec, this.$confirmStateChange);
    }
}
