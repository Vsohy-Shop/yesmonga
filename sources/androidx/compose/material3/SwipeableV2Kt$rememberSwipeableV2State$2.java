package androidx.compose.material3;

import androidx.compose.animation.core.C1968g;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class SwipeableV2Kt$rememberSwipeableV2State$2 extends Lambda implements C11289a<SwipeableV2State<T>> {
    final /* synthetic */ C1968g<Float> $animationSpec;
    final /* synthetic */ C11300l<T, Boolean> $confirmValueChange;
    final /* synthetic */ T $initialValue;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwipeableV2Kt$rememberSwipeableV2State$2(T t, C1968g<Float> gVar, C11300l<? super T, Boolean> lVar) {
        super(0);
        this.$initialValue = t;
        this.$animationSpec = gVar;
        this.$confirmValueChange = lVar;
    }

    @C12579k
    /* renamed from: a */
    public final SwipeableV2State<T> invoke() {
        T t = this.$initialValue;
        C1968g<Float> gVar = this.$animationSpec;
        C11300l<T, Boolean> lVar = this.$confirmValueChange;
        C8374y2 y2Var = C8374y2.f22489a;
        return new SwipeableV2State(t, gVar, lVar, y2Var.mo14800d(), y2Var.mo14801f(), (DefaultConstructorMarker) null);
    }
}
