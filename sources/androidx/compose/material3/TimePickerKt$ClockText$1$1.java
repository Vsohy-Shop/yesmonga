package androidx.compose.material3;

import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.layout.C15588o;
import androidx.compose.p004ui.layout.C15591p;
import androidx.compose.runtime.C8700z0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class TimePickerKt$ClockText$1$1 extends Lambda implements C11300l<C15588o, C11079d2> {
    final /* synthetic */ C8700z0<C15094f> $center$delegate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TimePickerKt$ClockText$1$1(C8700z0<C15094f> z0Var) {
        super(1);
        this.$center$delegate = z0Var;
    }

    /* renamed from: a */
    public final void mo12278a(@C12579k C15588o oVar) {
        Intrinsics.checkNotNullParameter(oVar, "it");
        TimePickerKt.m26745f(this.$center$delegate, C15591p.m69299a(oVar).mo42275o());
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo12278a((C15588o) obj);
        return C11079d2.f28267a;
    }
}
