package kotlin.sequences;

import java.util.Iterator;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.C11304p;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "kotlin.sequences.SequencesKt___SequencesKt$zipWithNext$2", mo22502f = "_Sequences.kt", mo22503i = {0, 0, 0}, mo22504l = {2855}, mo22505m = "invokeSuspend", mo22506n = {"$this$result", "iterator", "next"}, mo22507s = {"L$0", "L$1", "L$2"})
@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H@"}, mo22516d2 = {"T", "R", "Lkotlin/sequences/o;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class SequencesKt___SequencesKt$zipWithNext$2 extends RestrictedSuspendLambda implements C11304p<C11561o<? super R>, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ C11559m<T> $this_zipWithNext;
    final /* synthetic */ C11304p<T, T, R> $transform;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SequencesKt___SequencesKt$zipWithNext$2(C11559m<? extends T> mVar, C11304p<? super T, ? super T, ? extends R> pVar, C11045c<? super SequencesKt___SequencesKt$zipWithNext$2> cVar) {
        super(2, cVar);
        this.$this_zipWithNext = mVar;
        this.$transform = pVar;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        SequencesKt___SequencesKt$zipWithNext$2 sequencesKt___SequencesKt$zipWithNext$2 = new SequencesKt___SequencesKt$zipWithNext$2(this.$this_zipWithNext, this.$transform, cVar);
        sequencesKt___SequencesKt$zipWithNext$2.L$0 = obj;
        return sequencesKt___SequencesKt$zipWithNext$2;
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k C11561o<? super R> oVar, @C12580l C11045c<? super C11079d2> cVar) {
        return ((SequencesKt___SequencesKt$zipWithNext$2) create(oVar, cVar)).invokeSuspend(C11079d2.f28267a);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        T t;
        C11561o oVar;
        Iterator<T> it;
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            C11561o oVar2 = (C11561o) this.L$0;
            Iterator<T> it2 = this.$this_zipWithNext.iterator();
            if (!it2.hasNext()) {
                return C11079d2.f28267a;
            }
            oVar = oVar2;
            t = it2.next();
            it = it2;
        } else if (i == 1) {
            T t2 = this.L$2;
            it = (Iterator) this.L$1;
            oVar = (C11561o) this.L$0;
            C11661u0.m45747n(obj);
            t = t2;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        while (it.hasNext()) {
            T next = it.next();
            R invoke = this.$transform.invoke(t, next);
            this.L$0 = oVar;
            this.L$1 = it;
            this.L$2 = next;
            this.label = 1;
            if (oVar.mo23250b(invoke, this) == h) {
                return h;
            }
            t = next;
        }
        return C11079d2.f28267a;
    }
}
