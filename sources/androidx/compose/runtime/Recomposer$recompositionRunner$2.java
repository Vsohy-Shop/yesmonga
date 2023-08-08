package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.C8642d;
import androidx.compose.runtime.snapshots.C8646f;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C11804f2;
import kotlinx.coroutines.C12072o;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.C12079p0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "androidx.compose.runtime.Recomposer$recompositionRunner$2", mo22502f = "Recomposer.kt", mo22503i = {0, 0}, mo22504l = {898}, mo22505m = "invokeSuspend", mo22506n = {"callingJob", "unregisterApplyObserver"}, mo22507s = {"L$0", "L$1"})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$recompositionRunner$2\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 3 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,1408:1\n70#2:1409\n70#2:1416\n33#3,6:1410\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$recompositionRunner$2\n*L\n893#1:1409\n903#1:1416\n894#1:1410,6\n*E\n"})
public final class Recomposer$recompositionRunner$2 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ C11305q<C12074o0, C8686v0, C11045c<? super C11079d2>, Object> $block;
    final /* synthetic */ C8686v0 $parentFrameClock;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ Recomposer this$0;

    @C11067d(mo22501c = "androidx.compose.runtime.Recomposer$recompositionRunner$2$2", mo22502f = "Recomposer.kt", mo22503i = {}, mo22504l = {899}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
    @C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
    /* renamed from: androidx.compose.runtime.Recomposer$recompositionRunner$2$2 */
    public static final class C83952 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        @C12579k
        public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
            C83952 r0 = new C83952(qVar, v0Var, cVar);
            r0.L$0 = obj;
            return r0;
        }

        @C12580l
        public final Object invokeSuspend(@C12579k Object obj) {
            Object h = C11063b.m42612h();
            int i = this.label;
            if (i == 0) {
                C11661u0.m45747n(obj);
                C11305q<C12074o0, C8686v0, C11045c<? super C11079d2>, Object> qVar = qVar;
                C8686v0 v0Var = v0Var;
                this.label = 1;
                if (qVar.invoke((C12074o0) this.L$0, v0Var, this) == h) {
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
            return ((C83952) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Recomposer$recompositionRunner$2(Recomposer recomposer, C11305q<? super C12074o0, ? super C8686v0, ? super C11045c<? super C11079d2>, ? extends Object> qVar, C8686v0 v0Var, C11045c<? super Recomposer$recompositionRunner$2> cVar) {
        super(2, cVar);
        this.this$0 = recomposer;
        this.$block = qVar;
        this.$parentFrameClock = v0Var;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        Recomposer$recompositionRunner$2 recomposer$recompositionRunner$2 = new Recomposer$recompositionRunner$2(this.this$0, this.$block, this.$parentFrameClock, cVar);
        recomposer$recompositionRunner$2.L$0 = obj;
        return recomposer$recompositionRunner$2;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Throwable th;
        C11723c2 c2Var;
        C8642d dVar;
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            c2Var = C11804f2.m46951B(((C12074o0) this.L$0).getCoroutineContext());
            this.this$0.mo15232I0(c2Var);
            C8642d h2 = C8646f.f23196e.mo16627h(new Recomposer$recompositionRunner$2$unregisterApplyObserver$1(this.this$0));
            Recomposer.f22709w.mo15258c(this.this$0.f22733v);
            try {
                Object L = this.this$0.f22715d;
                Recomposer recomposer = this.this$0;
                synchronized (L) {
                    List G = recomposer.f22718g;
                    int size = G.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        ((C8696y) G.get(i2)).mo16371x();
                    }
                    C11079d2 d2Var = C11079d2.f28267a;
                }
                final C11305q<C12074o0, C8686v0, C11045c<? super C11079d2>, Object> qVar = this.$block;
                final C8686v0 v0Var = this.$parentFrameClock;
                C83952 r4 = new C83952((C11045c<? super C83952>) null);
                this.L$0 = c2Var;
                this.L$1 = h2;
                this.label = 1;
                if (C12079p0.m48266g(r4, this) == h) {
                    return h;
                }
                dVar = h2;
            } catch (Throwable th2) {
                Throwable th3 = th2;
                dVar = h2;
                th = th3;
                dVar.mo16593g();
                Object L2 = this.this$0.f22715d;
                Recomposer recomposer2 = this.this$0;
                synchronized (L2) {
                    if (recomposer2.f22716e == c2Var) {
                        recomposer2.f22716e = null;
                    }
                    C12072o unused = recomposer2.mo15246m0();
                }
                Recomposer.f22709w.mo15264i(this.this$0.f22733v);
                throw th;
            }
        } else if (i == 1) {
            dVar = (C8642d) this.L$1;
            c2Var = (C11723c2) this.L$0;
            try {
                C11661u0.m45747n(obj);
            } catch (Throwable th4) {
                th = th4;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        dVar.mo16593g();
        Object L3 = this.this$0.f22715d;
        Recomposer recomposer3 = this.this$0;
        synchronized (L3) {
            if (recomposer3.f22716e == c2Var) {
                recomposer3.f22716e = null;
            }
            C12072o unused2 = recomposer3.mo15246m0();
        }
        Recomposer.f22709w.mo15264i(this.this$0.f22733v);
        return C11079d2.f28267a;
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((Recomposer$recompositionRunner$2) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
