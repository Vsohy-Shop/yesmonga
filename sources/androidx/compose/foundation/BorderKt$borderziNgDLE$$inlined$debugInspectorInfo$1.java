package androidx.compose.foundation;

import androidx.compose.material.OutlinedTextFieldKt;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.p004ui.graphics.C15225h4;
import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.p004ui.graphics.C15421z1;
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
@C11363r0({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Border.kt\nandroidx/compose/foundation/BorderKt\n*L\n1#1,170:1\n150#2,10:171\n*E\n"})
/* renamed from: androidx.compose.foundation.BorderKt$border-ziNgDLE$$inlined$debugInspectorInfo$1  reason: invalid class name */
public final class BorderKt$borderziNgDLE$$inlined$debugInspectorInfo$1 extends Lambda implements C11300l<C15983v0, C11079d2> {
    final /* synthetic */ C15421z1 $brush$inlined;
    final /* synthetic */ C15218g4 $shape$inlined;
    final /* synthetic */ float $width$inlined;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BorderKt$borderziNgDLE$$inlined$debugInspectorInfo$1(float f, C15421z1 z1Var, C15218g4 g4Var) {
        super(1);
        this.$width$inlined = f;
        this.$brush$inlined = z1Var;
        this.$shape$inlined = g4Var;
    }

    /* renamed from: a */
    public final void mo7131a(@C12579k C15983v0 v0Var) {
        Intrinsics.checkNotNullParameter(v0Var, "$this$null");
        v0Var.mo45973d(OutlinedTextFieldKt.f7748c);
        v0Var.mo45971b().mo45707c("width", C16483g.m74451w(this.$width$inlined));
        if (this.$brush$inlined instanceof C15225h4) {
            v0Var.mo45971b().mo45707c("color", C15240j2.m66071n(((C15225h4) this.$brush$inlined).mo42781c()));
            v0Var.mo45974e(C15240j2.m66071n(((C15225h4) this.$brush$inlined).mo42781c()));
        } else {
            v0Var.mo45971b().mo45707c("brush", this.$brush$inlined);
        }
        v0Var.mo45971b().mo45707c("shape", this.$shape$inlined);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo7131a((C15983v0) obj);
        return C11079d2.f28267a;
    }
}
