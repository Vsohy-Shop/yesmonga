package kotlinx.coroutines.flow;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "kotlinx.coroutines.flow.FlowKt__MigrationKt$onErrorReturn$2", mo22502f = "Migration.kt", mo22503i = {}, mo22504l = {306}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H@"}, mo22516d2 = {"T", "Lkotlinx/coroutines/flow/f;", "", "e", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class FlowKt__MigrationKt$onErrorReturn$2 extends SuspendLambda implements C11305q<C11908f<? super T>, Throwable, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ T $fallback;
    final /* synthetic */ C11300l<Throwable, Boolean> $predicate;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowKt__MigrationKt$onErrorReturn$2(C11300l<? super Throwable, Boolean> lVar, T t, C11045c<? super FlowKt__MigrationKt$onErrorReturn$2> cVar) {
        super(3, cVar);
        this.$predicate = lVar;
        this.$fallback = t;
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k C11908f<? super T> fVar, @C12579k Throwable th, @C12580l C11045c<? super C11079d2> cVar) {
        FlowKt__MigrationKt$onErrorReturn$2 flowKt__MigrationKt$onErrorReturn$2 = new FlowKt__MigrationKt$onErrorReturn$2(this.$predicate, this.$fallback, cVar);
        flowKt__MigrationKt$onErrorReturn$2.L$0 = fVar;
        flowKt__MigrationKt$onErrorReturn$2.L$1 = th;
        return flowKt__MigrationKt$onErrorReturn$2.invokeSuspend(C11079d2.f28267a);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            C11908f fVar = (C11908f) this.L$0;
            Throwable th = (Throwable) this.L$1;
            if (this.$predicate.invoke(th).booleanValue()) {
                T t = this.$fallback;
                this.L$0 = null;
                this.label = 1;
                if (fVar.emit(t, this) == h) {
                    return h;
                }
            } else {
                throw th;
            }
        } else if (i == 1) {
            C11661u0.m45747n(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C11079d2.f28267a;
    }
}
