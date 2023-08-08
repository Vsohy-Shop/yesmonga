package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.C8415c2;
import androidx.compose.runtime.C8700z0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.ranges.C11466l;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11908f;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "androidx.compose.foundation.lazy.layout.LazyNearestItemsRangeKt$rememberLazyNearestItemsRangeState$1$1", mo22502f = "LazyNearestItemsRange.kt", mo22503i = {}, mo22504l = {66}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class LazyNearestItemsRangeKt$rememberLazyNearestItemsRangeState$1$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ C11289a<Integer> $extraItemCount;
    final /* synthetic */ C11289a<Integer> $firstVisibleItemIndex;
    final /* synthetic */ C11289a<Integer> $slidingWindowSize;
    final /* synthetic */ C8700z0<C11466l> $state;
    int label;

    /* renamed from: androidx.compose.foundation.lazy.layout.LazyNearestItemsRangeKt$rememberLazyNearestItemsRangeState$1$1$a */
    public static final class C2533a implements C11908f<C11466l> {

        /* renamed from: a */
        public final /* synthetic */ C8700z0<C11466l> f6703a;

        public C2533a(C8700z0<C11466l> z0Var) {
            this.f6703a = z0Var;
        }

        @C12580l
        /* renamed from: c */
        public final Object emit(@C12579k C11466l lVar, @C12579k C11045c<? super C11079d2> cVar) {
            this.f6703a.setValue(lVar);
            return C11079d2.f28267a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyNearestItemsRangeKt$rememberLazyNearestItemsRangeState$1$1(C11289a<Integer> aVar, C11289a<Integer> aVar2, C11289a<Integer> aVar3, C8700z0<C11466l> z0Var, C11045c<? super LazyNearestItemsRangeKt$rememberLazyNearestItemsRangeState$1$1> cVar) {
        super(2, cVar);
        this.$firstVisibleItemIndex = aVar;
        this.$slidingWindowSize = aVar2;
        this.$extraItemCount = aVar3;
        this.$state = z0Var;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new LazyNearestItemsRangeKt$rememberLazyNearestItemsRangeState$1$1(this.$firstVisibleItemIndex, this.$slidingWindowSize, this.$extraItemCount, this.$state, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            final C11289a<Integer> aVar = this.$firstVisibleItemIndex;
            final C11289a<Integer> aVar2 = this.$slidingWindowSize;
            final C11289a<Integer> aVar3 = this.$extraItemCount;
            C11907e v = C8415c2.m30253v(new C11289a<C11466l>() {
                @C12579k
                /* renamed from: a */
                public final C11466l invoke() {
                    return LazyNearestItemsRangeKt.m11364b(aVar.invoke().intValue(), aVar2.invoke().intValue(), aVar3.invoke().intValue());
                }
            });
            C2533a aVar4 = new C2533a(this.$state);
            this.label = 1;
            if (v.collect(aVar4, this) == h) {
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
        return ((LazyNearestItemsRangeKt$rememberLazyNearestItemsRangeState$1$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
