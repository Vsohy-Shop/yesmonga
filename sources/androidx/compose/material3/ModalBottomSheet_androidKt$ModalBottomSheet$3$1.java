package androidx.compose.material3;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$3$1", mo22502f = "ModalBottomSheet.android.kt", mo22503i = {}, mo22504l = {231}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class ModalBottomSheet_androidKt$ModalBottomSheet$3$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ SheetState $sheetState;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ModalBottomSheet_androidKt$ModalBottomSheet$3$1(SheetState sheetState, C11045c<? super ModalBottomSheet_androidKt$ModalBottomSheet$3$1> cVar) {
        super(2, cVar);
        this.$sheetState = sheetState;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new ModalBottomSheet_androidKt$ModalBottomSheet$3$1(this.$sheetState, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            SheetState sheetState = this.$sheetState;
            this.label = 1;
            if (sheetState.mo11870r(this) == h) {
                return h;
            }
        } else if (i == 1) {
            C11661u0.m45747n(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C11079d2.f28267a;
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((ModalBottomSheet_androidKt$ModalBottomSheet$3$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
