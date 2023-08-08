package androidx.activity.compose;

import androidx.activity.C0251r;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "androidx.activity.compose.ReportDrawnKt$ReportDrawnAfter$1", mo22502f = "ReportDrawn.kt", mo22503i = {0}, mo22504l = {182}, mo22505m = "invokeSuspend", mo22506n = {"$this$reportWhenComplete$iv"}, mo22507s = {"L$0"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nReportDrawn.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReportDrawn.kt\nandroidx/activity/compose/ReportDrawnKt$ReportDrawnAfter$1\n+ 2 FullyDrawnReporter.kt\nandroidx/activity/FullyDrawnReporterKt\n*L\n1#1,176:1\n183#2,10:177\n*S KotlinDebug\n*F\n+ 1 ReportDrawn.kt\nandroidx/activity/compose/ReportDrawnKt$ReportDrawnAfter$1\n*L\n173#1:177,10\n*E\n"})
public final class ReportDrawnKt$ReportDrawnAfter$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ C11300l<C11045c<? super C11079d2>, Object> $block;
    final /* synthetic */ C0251r $fullyDrawnReporter;
    Object L$0;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReportDrawnKt$ReportDrawnAfter$1(C0251r rVar, C11300l<? super C11045c<? super C11079d2>, ? extends Object> lVar, C11045c<? super ReportDrawnKt$ReportDrawnAfter$1> cVar) {
        super(2, cVar);
        this.$fullyDrawnReporter = rVar;
        this.$block = lVar;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new ReportDrawnKt$ReportDrawnAfter$1(this.$fullyDrawnReporter, this.$block, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Throwable th;
        C0251r rVar;
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            C0251r rVar2 = this.$fullyDrawnReporter;
            C11300l<C11045c<? super C11079d2>, Object> lVar = this.$block;
            rVar2.mo848c();
            if (!rVar2.mo850e()) {
                try {
                    this.L$0 = rVar2;
                    this.label = 1;
                    if (lVar.invoke(this) == h) {
                        return h;
                    }
                    rVar = rVar2;
                } catch (Throwable th2) {
                    Throwable th3 = th2;
                    rVar = rVar2;
                    th = th3;
                    rVar.mo853h();
                    throw th;
                }
            }
            return C11079d2.f28267a;
        } else if (i == 1) {
            rVar = (C0251r) this.L$0;
            try {
                C11661u0.m45747n(obj);
            } catch (Throwable th4) {
                th = th4;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        rVar.mo853h();
        return C11079d2.f28267a;
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((ReportDrawnKt$ReportDrawnAfter$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
