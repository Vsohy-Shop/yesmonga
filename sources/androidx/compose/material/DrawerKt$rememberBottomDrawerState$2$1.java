package androidx.compose.material;

import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class DrawerKt$rememberBottomDrawerState$2$1 extends Lambda implements C11289a<BottomDrawerState> {
    final /* synthetic */ C11300l<BottomDrawerValue, Boolean> $confirmStateChange;
    final /* synthetic */ BottomDrawerValue $initialValue;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DrawerKt$rememberBottomDrawerState$2$1(BottomDrawerValue bottomDrawerValue, C11300l<? super BottomDrawerValue, Boolean> lVar) {
        super(0);
        this.$initialValue = bottomDrawerValue;
        this.$confirmStateChange = lVar;
    }

    @C12579k
    /* renamed from: a */
    public final BottomDrawerState invoke() {
        return new BottomDrawerState(this.$initialValue, this.$confirmStateChange);
    }
}
