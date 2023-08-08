package androidx.compose.foundation;

import androidx.compose.p004ui.platform.C15983v0;
import androidx.compose.p004ui.unit.C16483g;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo22516d2 = {"Landroidx/compose/ui/platform/v0;", "Lkotlin/d2;", "a", "(Landroidx/compose/ui/platform/v0;)V", "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 BasicMarquee.kt\nandroidx/compose/foundation/BasicMarqueeKt\n*L\n1#1,170:1\n143#2,8:171\n*E\n"})
/* renamed from: androidx.compose.foundation.BasicMarqueeKt$basicMarquee-1Mj1MLw$$inlined$debugInspectorInfo$1 */
public final class C2053xe635dc7b extends Lambda implements C11300l<C15983v0, C11079d2> {
    final /* synthetic */ int $animationMode$inlined;
    final /* synthetic */ int $delayMillis$inlined;
    final /* synthetic */ int $initialDelayMillis$inlined;
    final /* synthetic */ int $iterations$inlined;
    final /* synthetic */ C2124g0 $spacing$inlined;
    final /* synthetic */ float $velocity$inlined;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2053xe635dc7b(int i, int i2, int i3, int i4, C2124g0 g0Var, float f) {
        super(1);
        this.$iterations$inlined = i;
        this.$animationMode$inlined = i2;
        this.$delayMillis$inlined = i3;
        this.$initialDelayMillis$inlined = i4;
        this.$spacing$inlined = g0Var;
        this.$velocity$inlined = f;
    }

    /* renamed from: a */
    public final void mo7128a(@C12579k C15983v0 v0Var) {
        Intrinsics.checkNotNullParameter(v0Var, "$this$null");
        v0Var.mo45973d("basicMarquee");
        v0Var.mo45971b().mo45707c("iterations", Integer.valueOf(this.$iterations$inlined));
        v0Var.mo45971b().mo45707c("animationMode", C2120f0.m9146c(this.$animationMode$inlined));
        v0Var.mo45971b().mo45707c("delayMillis", Integer.valueOf(this.$delayMillis$inlined));
        v0Var.mo45971b().mo45707c("initialDelayMillis", Integer.valueOf(this.$initialDelayMillis$inlined));
        v0Var.mo45971b().mo45707c("spacing", this.$spacing$inlined);
        v0Var.mo45971b().mo45707c("velocity", C16483g.m74451w(this.$velocity$inlined));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo7128a((C15983v0) obj);
        return C11079d2.f28267a;
    }
}
