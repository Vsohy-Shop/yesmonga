package androidx.compose.p004ui.draw;

import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.p004ui.graphics.C15240j2;
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
@C11363r0({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Shadow.kt\nandroidx/compose/ui/draw/ShadowKt\n*L\n1#1,170:1\n104#2,7:171\n*E\n"})
/* renamed from: androidx.compose.ui.draw.ShadowKt$shadow-s4CzXII$$inlined$debugInspectorInfo$1  reason: invalid class name */
public final class ShadowKt$shadows4CzXII$$inlined$debugInspectorInfo$1 extends Lambda implements C11300l<C15983v0, C11079d2> {
    final /* synthetic */ long $ambientColor$inlined;
    final /* synthetic */ boolean $clip$inlined;
    final /* synthetic */ float $elevation$inlined;
    final /* synthetic */ C15218g4 $shape$inlined;
    final /* synthetic */ long $spotColor$inlined;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShadowKt$shadows4CzXII$$inlined$debugInspectorInfo$1(float f, C15218g4 g4Var, boolean z, long j, long j2) {
        super(1);
        this.$elevation$inlined = f;
        this.$shape$inlined = g4Var;
        this.$clip$inlined = z;
        this.$ambientColor$inlined = j;
        this.$spotColor$inlined = j2;
    }

    /* renamed from: a */
    public final void mo17159a(@C12579k C15983v0 v0Var) {
        Intrinsics.checkNotNullParameter(v0Var, "$this$null");
        v0Var.mo45973d("shadow");
        v0Var.mo45971b().mo45707c("elevation", C16483g.m74451w(this.$elevation$inlined));
        v0Var.mo45971b().mo45707c("shape", this.$shape$inlined);
        v0Var.mo45971b().mo45707c("clip", Boolean.valueOf(this.$clip$inlined));
        v0Var.mo45971b().mo45707c("ambientColor", C15240j2.m66071n(this.$ambientColor$inlined));
        v0Var.mo45971b().mo45707c("spotColor", C15240j2.m66071n(this.$spotColor$inlined));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo17159a((C15983v0) obj);
        return C11079d2.f28267a;
    }
}
