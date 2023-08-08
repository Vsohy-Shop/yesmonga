package kotlin.sequences;

import java.util.Iterator;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "kotlin.sequences.SequencesKt__SequencesKt$ifEmpty$1", mo22502f = "Sequences.kt", mo22503i = {}, mo22504l = {69, 71}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H@"}, mo22516d2 = {"T", "Lkotlin/sequences/o;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class SequencesKt__SequencesKt$ifEmpty$1 extends RestrictedSuspendLambda implements C11304p<C11561o<? super T>, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ C11289a<C11559m<T>> $defaultValue;
    final /* synthetic */ C11559m<T> $this_ifEmpty;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SequencesKt__SequencesKt$ifEmpty$1(C11559m<? extends T> mVar, C11289a<? extends C11559m<? extends T>> aVar, C11045c<? super SequencesKt__SequencesKt$ifEmpty$1> cVar) {
        super(2, cVar);
        this.$this_ifEmpty = mVar;
        this.$defaultValue = aVar;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        SequencesKt__SequencesKt$ifEmpty$1 sequencesKt__SequencesKt$ifEmpty$1 = new SequencesKt__SequencesKt$ifEmpty$1(this.$this_ifEmpty, this.$defaultValue, cVar);
        sequencesKt__SequencesKt$ifEmpty$1.L$0 = obj;
        return sequencesKt__SequencesKt$ifEmpty$1;
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k C11561o<? super T> oVar, @C12580l C11045c<? super C11079d2> cVar) {
        return ((SequencesKt__SequencesKt$ifEmpty$1) create(oVar, cVar)).invokeSuspend(C11079d2.f28267a);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            C11561o oVar = (C11561o) this.L$0;
            Iterator<T> it = this.$this_ifEmpty.iterator();
            if (it.hasNext()) {
                this.label = 1;
                if (oVar.mo23251f(it, this) == h) {
                    return h;
                }
            } else {
                this.label = 2;
                if (oVar.mo23260h(this.$defaultValue.invoke(), this) == h) {
                    return h;
                }
            }
        } else if (i == 1 || i == 2) {
            C11661u0.m45747n(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C11079d2.f28267a;
    }
}
