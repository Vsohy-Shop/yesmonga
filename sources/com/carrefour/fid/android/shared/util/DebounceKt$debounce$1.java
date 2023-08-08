package com.carrefour.fid.android.shared.util;

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
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11908f;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.shared.util.DebounceKt$debounce$1", mo22502f = "Debounce.kt", mo22503i = {}, mo22504l = {17}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H@"}, mo22516d2 = {"T", "Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class DebounceKt$debounce$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ C11300l<T, C11079d2> $block;
    final /* synthetic */ C11907e<T> $flow;
    int label;

    /* renamed from: com.carrefour.fid.android.shared.util.DebounceKt$debounce$1$a */
    public static final class C28898a implements C11908f<T> {

        /* renamed from: a */
        public final /* synthetic */ C11300l<T, C11079d2> f70787a;

        public C28898a(C11300l<? super T, C11079d2> lVar) {
            this.f70787a = lVar;
        }

        @C12580l
        public final Object emit(T t, @C12579k C11045c<? super C11079d2> cVar) {
            this.f70787a.invoke(t);
            return C11079d2.f28267a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DebounceKt$debounce$1(C11907e<? extends T> eVar, C11300l<? super T, C11079d2> lVar, C11045c<? super DebounceKt$debounce$1> cVar) {
        super(2, cVar);
        this.$flow = eVar;
        this.$block = lVar;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new DebounceKt$debounce$1(this.$flow, this.$block, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            C11907e<T> eVar = this.$flow;
            C28898a aVar = new C28898a(this.$block);
            this.label = 1;
            if (eVar.collect(aVar, this) == h) {
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
        return ((DebounceKt$debounce$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
