package androidx.compose.material;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$anchorChangeHandler$1$2 */
public final class C2962xb86509e1 extends Lambda implements C11300l<ModalBottomSheetValue, C11079d2> {
    final /* synthetic */ C12074o0 $scope;
    final /* synthetic */ ModalBottomSheetState $sheetState;

    @C11067d(mo22501c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$anchorChangeHandler$1$2$1", mo22502f = "ModalBottomSheet.kt", mo22503i = {}, mo22504l = {451}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
    @C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    /* renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$anchorChangeHandler$1$2$1 */
    public static final class C29631 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
        int label;

        @C12579k
        public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
            return new C29631(modalBottomSheetState, modalBottomSheetValue, cVar);
        }

        @C12580l
        public final Object invokeSuspend(@C12579k Object obj) {
            Object h = C11063b.m42612h();
            int i = this.label;
            if (i == 0) {
                C11661u0.m45747n(obj);
                ModalBottomSheetState modalBottomSheetState = modalBottomSheetState;
                ModalBottomSheetValue modalBottomSheetValue = modalBottomSheetValue;
                this.label = 1;
                if (modalBottomSheetState.mo10297q(modalBottomSheetValue, this) == h) {
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
            return ((C29631) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2962xb86509e1(C12074o0 o0Var, ModalBottomSheetState modalBottomSheetState) {
        super(1);
        this.$scope = o0Var;
        this.$sheetState = modalBottomSheetState;
    }

    /* renamed from: a */
    public final void mo10271a(@C12579k final ModalBottomSheetValue modalBottomSheetValue) {
        Intrinsics.checkNotNullParameter(modalBottomSheetValue, "target");
        C12074o0 o0Var = this.$scope;
        final ModalBottomSheetState modalBottomSheetState = this.$sheetState;
        C11723c2 unused = C12038j.m48061f(o0Var, (CoroutineContext) null, (CoroutineStart) null, new C29631((C11045c<? super C29631>) null), 3, (Object) null);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo10271a((ModalBottomSheetValue) obj);
        return C11079d2.f28267a;
    }
}
