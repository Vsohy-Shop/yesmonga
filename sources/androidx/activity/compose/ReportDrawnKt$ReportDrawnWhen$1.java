package androidx.activity.compose;

import androidx.activity.C0251r;
import androidx.compose.runtime.C8430d0;
import androidx.compose.runtime.C8434e0;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nReportDrawn.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReportDrawn.kt\nandroidx/activity/compose/ReportDrawnKt$ReportDrawnWhen$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,176:1\n62#2,5:177\n62#2,5:182\n*S KotlinDebug\n*F\n+ 1 ReportDrawn.kt\nandroidx/activity/compose/ReportDrawnKt$ReportDrawnWhen$1\n*L\n135#1:177,5\n138#1:182,5\n*E\n"})
public final class ReportDrawnKt$ReportDrawnWhen$1 extends Lambda implements C11300l<C8434e0, C8430d0> {
    final /* synthetic */ C0251r $fullyDrawnReporter;
    final /* synthetic */ C11289a<Boolean> $predicate;

    @C11363r0({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 ReportDrawn.kt\nandroidx/activity/compose/ReportDrawnKt$ReportDrawnWhen$1\n*L\n1#1,483:1\n135#2:484\n*E\n"})
    /* renamed from: androidx.activity.compose.ReportDrawnKt$ReportDrawnWhen$1$a */
    public static final class C0223a implements C8430d0 {
        /* renamed from: g */
        public void mo791g() {
        }
    }

    @C11363r0({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 ReportDrawn.kt\nandroidx/activity/compose/ReportDrawnKt$ReportDrawnWhen$1\n*L\n1#1,483:1\n139#2,2:484\n*E\n"})
    /* renamed from: androidx.activity.compose.ReportDrawnKt$ReportDrawnWhen$1$b */
    public static final class C0224b implements C8430d0 {

        /* renamed from: a */
        public final /* synthetic */ ReportDrawnComposition f724a;

        public C0224b(ReportDrawnComposition reportDrawnComposition) {
            this.f724a = reportDrawnComposition;
        }

        /* renamed from: g */
        public void mo791g() {
            this.f724a.mo806d();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReportDrawnKt$ReportDrawnWhen$1(C0251r rVar, C11289a<Boolean> aVar) {
        super(1);
        this.$fullyDrawnReporter = rVar;
        this.$predicate = aVar;
    }

    @C12579k
    /* renamed from: a */
    public final C8430d0 invoke(@C12579k C8434e0 e0Var) {
        Intrinsics.checkNotNullParameter(e0Var, "$this$DisposableEffect");
        if (this.$fullyDrawnReporter.mo850e()) {
            return new C0223a();
        }
        return new C0224b(new ReportDrawnComposition(this.$fullyDrawnReporter, this.$predicate));
    }
}
