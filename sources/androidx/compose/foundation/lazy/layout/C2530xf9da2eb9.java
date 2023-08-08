package androidx.compose.foundation.lazy.layout;

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
/* renamed from: androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt$lazyLayoutSemantics$1$scrollToIndexAction$1 */
public final class C2530xf9da2eb9 extends Lambda implements C11300l<Integer, Boolean> {
    final /* synthetic */ C12074o0 $coroutineScope;
    final /* synthetic */ C2549h $itemProvider;
    final /* synthetic */ C2563q $state;

    @C11067d(mo22501c = "androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt$lazyLayoutSemantics$1$scrollToIndexAction$1$2", mo22502f = "LazyLayoutSemantics.kt", mo22503i = {}, mo22504l = {112}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
    @C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    /* renamed from: androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt$lazyLayoutSemantics$1$scrollToIndexAction$1$2 */
    public static final class C25312 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
        int label;

        @C12579k
        public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
            return new C25312(qVar, i, cVar);
        }

        @C12580l
        public final Object invokeSuspend(@C12579k Object obj) {
            Object h = C11063b.m42612h();
            int i = this.label;
            if (i == 0) {
                C11661u0.m45747n(obj);
                C2563q qVar = qVar;
                int i2 = i;
                this.label = 1;
                if (qVar.mo8634b(i2, this) == h) {
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
            return ((C25312) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2530xf9da2eb9(C2549h hVar, C12074o0 o0Var, C2563q qVar) {
        super(1);
        this.$itemProvider = hVar;
        this.$coroutineScope = o0Var;
        this.$state = qVar;
    }

    @C12579k
    /* renamed from: a */
    public final Boolean mo8703a(final int i) {
        boolean z;
        if (i < 0 || i >= this.$itemProvider.mo8288a()) {
            z = false;
        } else {
            z = true;
        }
        C2549h hVar = this.$itemProvider;
        if (z) {
            C12074o0 o0Var = this.$coroutineScope;
            final C2563q qVar = this.$state;
            C11723c2 unused = C12038j.m48061f(o0Var, (CoroutineContext) null, (CoroutineStart) null, new C25312((C11045c<? super C25312>) null), 3, (Object) null);
            return Boolean.TRUE;
        }
        throw new IllegalArgumentException(("Can't scroll to index " + i + ", it is out of bounds [0, " + hVar.mo8288a() + ')').toString());
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return mo8703a(((Number) obj).intValue());
    }
}
