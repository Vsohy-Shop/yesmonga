package androidx.compose.p004ui.platform;

import androidx.compose.runtime.C8415c2;
import androidx.compose.runtime.C8578k2;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11064a;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11908f;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "androidx.compose.ui.platform.WindowInfoKt$WindowFocusObserver$1$1", mo22502f = "WindowInfo.kt", mo22503i = {}, mo22504l = {58}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: androidx.compose.ui.platform.WindowInfoKt$WindowFocusObserver$1$1 */
public final class WindowInfoKt$WindowFocusObserver$1$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ C8578k2<C11300l<Boolean, C11079d2>> $callback;
    final /* synthetic */ C15922l4 $windowInfo;
    int label;

    /* renamed from: androidx.compose.ui.platform.WindowInfoKt$WindowFocusObserver$1$1$a */
    public static final class C15816a implements C11908f<Boolean> {

        /* renamed from: a */
        public final /* synthetic */ C8578k2<C11300l<Boolean, C11079d2>> f39428a;

        public C15816a(C8578k2<? extends C11300l<? super Boolean, C11079d2>> k2Var) {
            this.f39428a = k2Var;
        }

        @C12580l
        /* renamed from: c */
        public final Object mo45592c(boolean z, @C12579k C11045c<? super C11079d2> cVar) {
            this.f39428a.getValue().invoke(C11064a.m42615a(z));
            return C11079d2.f28267a;
        }

        public /* bridge */ /* synthetic */ Object emit(Object obj, C11045c cVar) {
            return mo45592c(((Boolean) obj).booleanValue(), cVar);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WindowInfoKt$WindowFocusObserver$1$1(C15922l4 l4Var, C8578k2<? extends C11300l<? super Boolean, C11079d2>> k2Var, C11045c<? super WindowInfoKt$WindowFocusObserver$1$1> cVar) {
        super(2, cVar);
        this.$windowInfo = l4Var;
        this.$callback = k2Var;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new WindowInfoKt$WindowFocusObserver$1$1(this.$windowInfo, this.$callback, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            final C15922l4 l4Var = this.$windowInfo;
            C11907e v = C8415c2.m30253v(new C11289a<Boolean>() {
                @C12579k
                public final Boolean invoke() {
                    return Boolean.valueOf(l4Var.mo45822b());
                }
            });
            C15816a aVar = new C15816a(this.$callback);
            this.label = 1;
            if (v.collect(aVar, this) == h) {
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
        return ((WindowInfoKt$WindowFocusObserver$1$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
