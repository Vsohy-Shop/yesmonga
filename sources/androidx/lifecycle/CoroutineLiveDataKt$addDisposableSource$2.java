package androidx.lifecycle;

import androidx.lifecycle.CoroutineLiveDataKt;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "androidx.lifecycle.CoroutineLiveDataKt$addDisposableSource$2", mo22502f = "CoroutineLiveData.kt", mo22503i = {}, mo22504l = {}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H@"}, mo22516d2 = {"T", "Lkotlinx/coroutines/o0;", "Landroidx/lifecycle/EmittedSource;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class CoroutineLiveDataKt$addDisposableSource$2 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super EmittedSource>, Object> {
    final /* synthetic */ LiveData<T> $source;
    final /* synthetic */ C19406e0<T> $this_addDisposableSource;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CoroutineLiveDataKt$addDisposableSource$2(C19406e0<T> e0Var, LiveData<T> liveData, C11045c<? super CoroutineLiveDataKt$addDisposableSource$2> cVar) {
        super(2, cVar);
        this.$this_addDisposableSource = e0Var;
        this.$source = liveData;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new CoroutineLiveDataKt$addDisposableSource$2(this.$this_addDisposableSource, this.$source, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        C11063b.m42612h();
        if (this.label == 0) {
            C11661u0.m45747n(obj);
            final C19406e0<T> e0Var = this.$this_addDisposableSource;
            e0Var.mo4611s(this.$source, new CoroutineLiveDataKt.C19362a(new C11300l<T, C11079d2>() {
                /* renamed from: a */
                public final void mo57451a(T t) {
                    e0Var.mo57496r(t);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    mo57451a(obj);
                    return C11079d2.f28267a;
                }
            }));
            return new EmittedSource(this.$source, this.$this_addDisposableSource);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super EmittedSource> cVar) {
        return ((CoroutineLiveDataKt$addDisposableSource$2) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
