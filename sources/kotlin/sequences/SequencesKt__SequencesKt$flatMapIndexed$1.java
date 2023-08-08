package kotlin.sequences;

import java.util.Iterator;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11064a;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "kotlin.sequences.SequencesKt__SequencesKt$flatMapIndexed$1", mo22502f = "Sequences.kt", mo22503i = {0, 0}, mo22504l = {332}, mo22505m = "invokeSuspend", mo22506n = {"$this$sequence", "index"}, mo22507s = {"L$0", "I$0"})
@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00020\u0003H@"}, mo22516d2 = {"T", "C", "R", "Lkotlin/sequences/o;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class SequencesKt__SequencesKt$flatMapIndexed$1 extends RestrictedSuspendLambda implements C11304p<C11561o<? super R>, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ C11300l<C, Iterator<R>> $iterator;
    final /* synthetic */ C11559m<T> $source;
    final /* synthetic */ C11304p<Integer, T, C> $transform;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SequencesKt__SequencesKt$flatMapIndexed$1(C11559m<? extends T> mVar, C11304p<? super Integer, ? super T, ? extends C> pVar, C11300l<? super C, ? extends Iterator<? extends R>> lVar, C11045c<? super SequencesKt__SequencesKt$flatMapIndexed$1> cVar) {
        super(2, cVar);
        this.$source = mVar;
        this.$transform = pVar;
        this.$iterator = lVar;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        SequencesKt__SequencesKt$flatMapIndexed$1 sequencesKt__SequencesKt$flatMapIndexed$1 = new SequencesKt__SequencesKt$flatMapIndexed$1(this.$source, this.$transform, this.$iterator, cVar);
        sequencesKt__SequencesKt$flatMapIndexed$1.L$0 = obj;
        return sequencesKt__SequencesKt$flatMapIndexed$1;
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k C11561o<? super R> oVar, @C12580l C11045c<? super C11079d2> cVar) {
        return ((SequencesKt__SequencesKt$flatMapIndexed$1) create(oVar, cVar)).invokeSuspend(C11079d2.f28267a);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        int i;
        C11561o oVar;
        Iterator<T> it;
        Object h = C11063b.m42612h();
        int i2 = this.label;
        if (i2 == 0) {
            C11661u0.m45747n(obj);
            oVar = (C11561o) this.L$0;
            i = 0;
            it = this.$source.iterator();
        } else if (i2 == 1) {
            int i3 = this.I$0;
            it = (Iterator) this.L$1;
            oVar = (C11561o) this.L$0;
            C11661u0.m45747n(obj);
            i = i3;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        while (it.hasNext()) {
            T next = it.next();
            C11304p<Integer, T, C> pVar = this.$transform;
            int i4 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.m40459W();
            }
            C invoke = pVar.invoke(C11064a.m42620f(i), next);
            this.L$0 = oVar;
            this.L$1 = it;
            this.I$0 = i4;
            this.label = 1;
            if (oVar.mo23251f(this.$iterator.invoke(invoke), this) == h) {
                return h;
            }
            i = i4;
        }
        return C11079d2.f28267a;
    }
}
