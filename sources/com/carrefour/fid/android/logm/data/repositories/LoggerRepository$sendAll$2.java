package com.carrefour.fid.android.logm.data.repositories;

import com.carrefour.fid.android.domain.models.logm.LogMEntry;
import com.carrefour.fid.android.logm.data.datasource.LogMDataSource;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.Result;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.logm.data.repositories.LoggerRepository$sendAll$2", mo22502f = "LoggerRepository.kt", mo22503i = {0}, mo22504l = {50}, mo22505m = "invokeSuspend", mo22506n = {"it"}, mo22507s = {"L$2"})
@C11076d0(mo22515d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "", "Lcom/carrefour/fid/android/domain/models/logm/LogMEntry;", "kotlin.jvm.PlatformType", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class LoggerRepository$sendAll$2 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super List<? extends LogMEntry>>, Object> {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ LoggerRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LoggerRepository$sendAll$2(LoggerRepository loggerRepository, C11045c<? super LoggerRepository$sendAll$2> cVar) {
        super(2, cVar);
        this.this$0 = loggerRepository;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new LoggerRepository$sendAll$2(this.this$0, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object obj2;
        List list;
        LoggerRepository loggerRepository;
        List list2;
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            List Q5 = CollectionsKt___CollectionsKt.m40557Q5(this.this$0.f96958d);
            loggerRepository = this.this$0;
            if (!(!Q5.isEmpty())) {
                return Q5;
            }
            LogMDataSource c = loggerRepository.f96955a;
            this.L$0 = Q5;
            this.L$1 = loggerRepository;
            this.L$2 = Q5;
            this.label = 1;
            Object a = c.mo119713a(Q5, this);
            if (a == h) {
                return h;
            }
            list2 = Q5;
            obj2 = a;
            list = list2;
        } else if (i == 1) {
            list2 = (List) this.L$2;
            loggerRepository = (LoggerRepository) this.L$1;
            list = (List) this.L$0;
            C11661u0.m45747n(obj);
            obj2 = ((Result) obj).mo21858l();
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (Result.m38710j(obj2)) {
            loggerRepository.f96958d.removeAll(list2);
        }
        return list;
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super List<LogMEntry>> cVar) {
        return ((LoggerRepository$sendAll$2) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
