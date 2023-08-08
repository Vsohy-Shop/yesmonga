package androidx.compose.material3;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.C8700z0;
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
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class DatePickerKt$DatePickerContent$1$4$2$2$1 extends Lambda implements C11300l<Integer, C11079d2> {
    final /* synthetic */ C12074o0 $coroutineScope;
    final /* synthetic */ LazyListState $monthsListState;
    final /* synthetic */ StateData $stateData;
    final /* synthetic */ C8700z0<Boolean> $yearPickerVisible$delegate;

    @C11067d(mo22501c = "androidx.compose.material3.DatePickerKt$DatePickerContent$1$4$2$2$1$1", mo22502f = "DatePicker.kt", mo22503i = {}, mo22504l = {1212}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
    @C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    /* renamed from: androidx.compose.material3.DatePickerKt$DatePickerContent$1$4$2$2$1$1 */
    public static final class C79871 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
        int label;

        @C12579k
        public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
            return new C79871(stateData, lazyListState, i, cVar);
        }

        @C12580l
        public final Object invokeSuspend(@C12579k Object obj) {
            Object h = C11063b.m42612h();
            int i = this.label;
            if (i == 0) {
                C11661u0.m45747n(obj);
                StateData stateData = stateData;
                this.label = 1;
                if (LazyListState.m10849H(lazyListState, (((i - stateData.mo11995i().mo23049r()) * 12) + stateData.mo11990d().mo12919l()) - 1, 0, this, 2, (Object) null) == h) {
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
            return ((C79871) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DatePickerKt$DatePickerContent$1$4$2$2$1(C12074o0 o0Var, C8700z0<Boolean> z0Var, StateData stateData, LazyListState lazyListState) {
        super(1);
        this.$coroutineScope = o0Var;
        this.$yearPickerVisible$delegate = z0Var;
        this.$stateData = stateData;
        this.$monthsListState = lazyListState;
    }

    /* renamed from: a */
    public final void mo11377a(final int i) {
        C8700z0<Boolean> z0Var = this.$yearPickerVisible$delegate;
        DatePickerKt.m25599e(z0Var, !DatePickerKt.m25598d(z0Var));
        C12074o0 o0Var = this.$coroutineScope;
        final StateData stateData = this.$stateData;
        final LazyListState lazyListState = this.$monthsListState;
        C11723c2 unused = C12038j.m48061f(o0Var, (CoroutineContext) null, (CoroutineStart) null, new C79871((C11045c<? super C79871>) null), 3, (Object) null);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo11377a(((Number) obj).intValue());
        return C11079d2.f28267a;
    }
}
