package androidx.compose.material3;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class ModalBottomSheet_androidKt$ModalBottomSheet$2$1$4$1$1$1$3 extends Lambda implements C11289a<Boolean> {
    final /* synthetic */ C12074o0 $scope;
    final /* synthetic */ SheetState $this_with;

    @C11067d(mo22501c = "androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$2$1$4$1$1$1$3$1", mo22502f = "ModalBottomSheet.android.kt", mo22503i = {}, mo22504l = {213}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
    @C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    /* renamed from: androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$2$1$4$1$1$1$3$1 */
    public static final class C80511 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
        int label;

        @C12579k
        public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
            return new C80511(sheetState, cVar);
        }

        @C12580l
        public final Object invokeSuspend(@C12579k Object obj) {
            Object h = C11063b.m42612h();
            int i = this.label;
            if (i == 0) {
                C11661u0.m45747n(obj);
                SheetState sheetState = sheetState;
                this.label = 1;
                if (sheetState.mo11866n(this) == h) {
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
            return ((C80511) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ModalBottomSheet_androidKt$ModalBottomSheet$2$1$4$1$1$1$3(SheetState sheetState, C12074o0 o0Var) {
        super(0);
        this.$this_with = sheetState;
        this.$scope = o0Var;
    }

    @C12579k
    public final Boolean invoke() {
        if (this.$this_with.mo11862j().mo12112p().invoke(SheetValue.PartiallyExpanded).booleanValue()) {
            C12074o0 o0Var = this.$scope;
            final SheetState sheetState = this.$this_with;
            C11723c2 unused = C12038j.m48061f(o0Var, (CoroutineContext) null, (CoroutineStart) null, new C80511((C11045c<? super C80511>) null), 3, (Object) null);
        }
        return Boolean.TRUE;
    }
}
