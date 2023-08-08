package androidx.compose.material3;

import androidx.compose.foundation.lazy.LazyListState;
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

@C11076d0(mo22515d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo22516d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class DateRangePickerKt$customScrollActions$scrollUpAction$1 extends Lambda implements C11289a<Boolean> {
    final /* synthetic */ C12074o0 $coroutineScope;
    final /* synthetic */ LazyListState $state;

    @C11067d(mo22501c = "androidx.compose.material3.DateRangePickerKt$customScrollActions$scrollUpAction$1$1", mo22502f = "DateRangePicker.kt", mo22503i = {}, mo22504l = {774}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
    @C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
    /* renamed from: androidx.compose.material3.DateRangePickerKt$customScrollActions$scrollUpAction$1$1 */
    public static final class C80121 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
        int label;

        @C12579k
        public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
            return new C80121(lazyListState, cVar);
        }

        @C12580l
        public final Object invokeSuspend(@C12579k Object obj) {
            Object h = C11063b.m42612h();
            int i = this.label;
            if (i == 0) {
                C11661u0.m45747n(obj);
                LazyListState lazyListState = lazyListState;
                this.label = 1;
                if (LazyListState.m10849H(lazyListState, lazyListState.mo8339q() - 1, 0, this, 2, (Object) null) == h) {
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
            return ((C80121) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DateRangePickerKt$customScrollActions$scrollUpAction$1(LazyListState lazyListState, C12074o0 o0Var) {
        super(0);
        this.$state = lazyListState;
        this.$coroutineScope = o0Var;
    }

    @C12579k
    public final Boolean invoke() {
        boolean z;
        if (!this.$state.mo7252f()) {
            z = false;
        } else {
            C12074o0 o0Var = this.$coroutineScope;
            final LazyListState lazyListState = this.$state;
            C11723c2 unused = C12038j.m48061f(o0Var, (CoroutineContext) null, (CoroutineStart) null, new C80121((C11045c<? super C80121>) null), 3, (Object) null);
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
