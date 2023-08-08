package androidx.activity.compose;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public /* synthetic */ class ReportDrawnComposition$checkReporter$1 extends FunctionReferenceImpl implements C11300l<C11289a<? extends Boolean>, C11079d2> {
    public ReportDrawnComposition$checkReporter$1(Object obj) {
        super(1, obj, ReportDrawnComposition.class, "observeReporter", "observeReporter(Lkotlin/jvm/functions/Function0;)V", 0);
    }

    /* renamed from: d */
    public final void mo807d(@C12579k C11289a<Boolean> aVar) {
        Intrinsics.checkNotNullParameter(aVar, "p0");
        ((ReportDrawnComposition) this.receiver).mo805c(aVar);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo807d((C11289a) obj);
        return C11079d2.f28267a;
    }
}
