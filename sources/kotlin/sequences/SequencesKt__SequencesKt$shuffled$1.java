package kotlin.sequences;

import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.collections.C10994x;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlin.random.Random;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "kotlin.sequences.SequencesKt__SequencesKt$shuffled$1", mo22502f = "Sequences.kt", mo22503i = {0, 0}, mo22504l = {145}, mo22505m = "invokeSuspend", mo22506n = {"$this$sequence", "buffer"}, mo22507s = {"L$0", "L$1"})
@C11076d0(mo22515d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H@"}, mo22516d2 = {"T", "Lkotlin/sequences/o;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class SequencesKt__SequencesKt$shuffled$1 extends RestrictedSuspendLambda implements C11304p<C11561o<? super T>, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ Random $random;
    final /* synthetic */ C11559m<T> $this_shuffled;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SequencesKt__SequencesKt$shuffled$1(C11559m<? extends T> mVar, Random random, C11045c<? super SequencesKt__SequencesKt$shuffled$1> cVar) {
        super(2, cVar);
        this.$this_shuffled = mVar;
        this.$random = random;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        SequencesKt__SequencesKt$shuffled$1 sequencesKt__SequencesKt$shuffled$1 = new SequencesKt__SequencesKt$shuffled$1(this.$this_shuffled, this.$random, cVar);
        sequencesKt__SequencesKt$shuffled$1.L$0 = obj;
        return sequencesKt__SequencesKt$shuffled$1;
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k C11561o<? super T> oVar, @C12580l C11045c<? super C11079d2> cVar) {
        return ((SequencesKt__SequencesKt$shuffled$1) create(oVar, cVar)).invokeSuspend(C11079d2.f28267a);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        C11561o oVar;
        List<T> list;
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            list = SequencesKt___SequencesKt.m44735d3(this.$this_shuffled);
            oVar = (C11561o) this.L$0;
        } else if (i == 1) {
            list = (List) this.L$1;
            oVar = (C11561o) this.L$0;
            C11661u0.m45747n(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        while (!list.isEmpty()) {
            int m = this.$random.mo22986m(list.size());
            T L0 = C10994x.m42351L0(list);
            if (m < list.size()) {
                L0 = list.set(m, L0);
            }
            this.L$0 = oVar;
            this.L$1 = list;
            this.label = 1;
            if (oVar.mo23250b(L0, this) == h) {
                return h;
            }
        }
        return C11079d2.f28267a;
    }
}
