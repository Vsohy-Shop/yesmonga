package androidx.compose.runtime;

import androidx.compose.runtime.Recomposer;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11064a;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "androidx.compose.runtime.Recomposer$join$2", mo22502f = "Recomposer.kt", mo22503i = {}, mo22504l = {}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H@"}, mo22516d2 = {"Landroidx/compose/runtime/Recomposer$State;", "it", "", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class Recomposer$join$2 extends SuspendLambda implements C11304p<Recomposer.State, C11045c<? super Boolean>, Object> {
    /* synthetic */ Object L$0;
    int label;

    public Recomposer$join$2(C11045c<? super Recomposer$join$2> cVar) {
        super(2, cVar);
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        Recomposer$join$2 recomposer$join$2 = new Recomposer$join$2(cVar);
        recomposer$join$2.L$0 = obj;
        return recomposer$join$2;
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k Recomposer.State state, @C12580l C11045c<? super Boolean> cVar) {
        return ((Recomposer$join$2) create(state, cVar)).invokeSuspend(C11079d2.f28267a);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        boolean z;
        C11063b.m42612h();
        if (this.label == 0) {
            C11661u0.m45747n(obj);
            if (((Recomposer.State) this.L$0) == Recomposer.State.ShutDown) {
                z = true;
            } else {
                z = false;
            }
            return C11064a.m42615a(z);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
