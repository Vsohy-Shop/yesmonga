package androidx.work.impl;

import androidx.work.C21414w;
import androidx.work.ExistingWorkPolicy;
import androidx.work.impl.utils.C21303e;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.collections.C10976s;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "()V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 7, 1})
public final class WorkerUpdater$enqueueUniquelyNamedPeriodic$enqueueNew$1 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ String $name;
    final /* synthetic */ C21282o $operation;
    final /* synthetic */ C21191g0 $this_enqueueUniquelyNamedPeriodic;
    final /* synthetic */ C21414w $workRequest;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WorkerUpdater$enqueueUniquelyNamedPeriodic$enqueueNew$1(C21414w wVar, C21191g0 g0Var, String str, C21282o oVar) {
        super(0);
        this.$workRequest = wVar;
        this.$this_enqueueUniquelyNamedPeriodic = g0Var;
        this.$name = str;
        this.$operation = oVar;
    }

    public final void invoke() {
        new C21303e(new C21367x(this.$this_enqueueUniquelyNamedPeriodic, this.$name, ExistingWorkPolicy.KEEP, C10976s.m41419k(this.$workRequest)), this.$operation).run();
    }
}
