package com.carrefour.fid.android.shared.util;

import java.util.ArrayList;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.collections.C10978t;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.shared.util.ParallelMapKt$pmap$2", mo22502f = "ParallelMap.kt", mo22503i = {}, mo22504l = {12}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H@"}, mo22516d2 = {"A", "B", "Lkotlinx/coroutines/o0;", "", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nParallelMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ParallelMap.kt\ncom/carrefour/fid/android/shared/util/ParallelMapKt$pmap$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,14:1\n1549#2:15\n1620#2,3:16\n*S KotlinDebug\n*F\n+ 1 ParallelMap.kt\ncom/carrefour/fid/android/shared/util/ParallelMapKt$pmap$2\n*L\n12#1:15\n12#1:16,3\n*E\n"})
public final class ParallelMapKt$pmap$2 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super List<? extends B>>, Object> {

    /* renamed from: $f */
    final /* synthetic */ C11304p<A, C11045c<? super B>, Object> f70803$f;
    final /* synthetic */ Iterable<A> $this_pmap;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ParallelMapKt$pmap$2(Iterable<? extends A> iterable, C11304p<? super A, ? super C11045c<? super B>, ? extends Object> pVar, C11045c<? super ParallelMapKt$pmap$2> cVar) {
        super(2, cVar);
        this.$this_pmap = iterable;
        this.f70803$f = pVar;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        ParallelMapKt$pmap$2 parallelMapKt$pmap$2 = new ParallelMapKt$pmap$2(this.$this_pmap, this.f70803$f, cVar);
        parallelMapKt$pmap$2.L$0 = obj;
        return parallelMapKt$pmap$2;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            C12074o0 o0Var = (C12074o0) this.L$0;
            Iterable<A> iterable = this.$this_pmap;
            C11304p<A, C11045c<? super B>, Object> pVar = this.f70803$f;
            ArrayList arrayList = new ArrayList(C10978t.m41495Y(iterable, 10));
            for (A parallelMapKt$pmap$2$1$1 : iterable) {
                arrayList.add(C12038j.m48057b(o0Var, (CoroutineContext) null, (CoroutineStart) null, new ParallelMapKt$pmap$2$1$1(pVar, parallelMapKt$pmap$2$1$1, (C11045c<? super ParallelMapKt$pmap$2$1$1>) null), 3, (Object) null));
            }
            this.label = 1;
            obj = AwaitKt.m45893a(arrayList, this);
            if (obj == h) {
                return h;
            }
        } else if (i == 1) {
            C11661u0.m45747n(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super List<? extends B>> cVar) {
        return ((ParallelMapKt$pmap$2) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
