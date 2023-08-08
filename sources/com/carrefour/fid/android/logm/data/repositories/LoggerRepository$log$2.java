package com.carrefour.fid.android.logm.data.repositories;

import com.carrefour.fid.android.domain.models.logm.LogMEntry;
import com.carrefour.fid.android.domain.models.logm.LogMSeverity;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.logm.data.repositories.LoggerRepository$log$2", mo22502f = "LoggerRepository.kt", mo22503i = {}, mo22504l = {}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class LoggerRepository$log$2 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ LogMEntry $logEntry;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ LoggerRepository this$0;

    @C11067d(mo22501c = "com.carrefour.fid.android.logm.data.repositories.LoggerRepository$log$2$1", mo22502f = "LoggerRepository.kt", mo22503i = {}, mo22504l = {42}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
    @C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
    /* renamed from: com.carrefour.fid.android.logm.data.repositories.LoggerRepository$log$2$1 */
    public static final class C382741 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
        int label;

        @C12579k
        public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
            return new C382741(loggerRepository2, cVar);
        }

        @C12580l
        public final Object invokeSuspend(@C12579k Object obj) {
            Object h = C11063b.m42612h();
            int i = this.label;
            if (i == 0) {
                C11661u0.m45747n(obj);
                LoggerRepository loggerRepository = loggerRepository2;
                this.label = 1;
                if (loggerRepository.mo119867i(this) == h) {
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
            return ((C382741) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LoggerRepository$log$2(LoggerRepository loggerRepository, LogMEntry logMEntry, C11045c<? super LoggerRepository$log$2> cVar) {
        super(2, cVar);
        this.this$0 = loggerRepository;
        this.$logEntry = logMEntry;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        LoggerRepository$log$2 loggerRepository$log$2 = new LoggerRepository$log$2(this.this$0, this.$logEntry, cVar);
        loggerRepository$log$2.L$0 = obj;
        return loggerRepository$log$2;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        C11063b.m42612h();
        if (this.label == 0) {
            C11661u0.m45747n(obj);
            C12074o0 o0Var = (C12074o0) this.L$0;
            LoggerRepository loggerRepository = this.this$0;
            LogMEntry a = loggerRepository.mo119864f(this.$logEntry, loggerRepository.f96957c);
            if (this.this$0.f96958d.size() < 1000) {
                this.this$0.f96958d.add(a);
            } else {
                this.this$0.mo119866h();
            }
            if (this.this$0.f96958d.size() >= 50 || a.getSeverity() == LogMSeverity.ERROR) {
                final LoggerRepository loggerRepository2 = this.this$0;
                C11723c2 unused = C12038j.m48061f(o0Var, (CoroutineContext) null, (CoroutineStart) null, new C382741((C11045c<? super C382741>) null), 3, (Object) null);
            }
            return C11079d2.f28267a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((LoggerRepository$log$2) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
