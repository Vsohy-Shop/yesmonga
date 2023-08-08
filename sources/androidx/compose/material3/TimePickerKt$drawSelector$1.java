package androidx.compose.material3;

import androidx.compose.material3.tokens.C8306g1;
import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.geometry.C15096g;
import androidx.compose.p004ui.geometry.C15106n;
import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.p004ui.graphics.C15242j3;
import androidx.compose.p004ui.graphics.C15249k2;
import androidx.compose.p004ui.graphics.C15325u1;
import androidx.compose.p004ui.graphics.drawscope.C15184c;
import androidx.compose.p004ui.graphics.drawscope.C15187e;
import androidx.compose.p004ui.graphics.drawscope.C15192h;
import androidx.compose.p004ui.unit.C16486i;
import com.urbanairship.push.notifications.C9527p;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo22516d2 = {"Landroidx/compose/ui/graphics/drawscope/c;", "Lkotlin/d2;", "a", "(Landroidx/compose/ui/graphics/drawscope/c;)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class TimePickerKt$drawSelector$1 extends Lambda implements C11300l<C15184c, C11079d2> {
    final /* synthetic */ C8212h3 $colors;
    final /* synthetic */ TimePickerState $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TimePickerKt$drawSelector$1(TimePickerState timePickerState, C8212h3 h3Var) {
        super(1);
        this.$state = timePickerState;
        this.$colors = h3Var;
    }

    /* renamed from: a */
    public final void mo12332a(@C12579k C15184c cVar) {
        C15184c cVar2 = cVar;
        Intrinsics.checkNotNullParameter(cVar2, "$this$drawWithContent");
        long a = C15096g.m64898a(cVar2.mo7425g5(C16486i.m74517j(this.$state.mo12352m())), cVar2.mo7425g5(C16486i.m74519l(this.$state.mo12352m())));
        C8306g1 g1Var = C8306g1.f21226a;
        float f = (float) 2;
        float g5 = cVar2.mo7425g5(g1Var.mo13639j()) / f;
        long e = this.$colors.mo12641e();
        long a2 = C15240j2.f37547b.mo42841a();
        C15325u1.C15326a aVar = C15325u1.f37708b;
        C15184c cVar3 = cVar;
        float f2 = g5;
        long j = a;
        C15187e.m65705a6(cVar3, a2, f2, j, 0.0f, (C15192h) null, (C15249k2) null, aVar.mo43017a(), 56, (Object) null);
        cVar.mo42716g6();
        C15187e.m65705a6(cVar3, e, f2, j, 0.0f, (C15192h) null, (C15249k2) null, aVar.mo43016C(), 56, (Object) null);
        float g52 = cVar2.mo7425g5(g1Var.mo13641l());
        long u = C15094f.m64885u(a, C15096g.m64898a(((float) Math.cos((double) this.$state.mo12345f().mo6613u().floatValue())) * g5, ((float) Math.sin((double) this.$state.mo12345f().mo6613u().floatValue())) * g5));
        C15187e.m65695K2(cVar, e, C15106n.m65034b(cVar.mo42718b()), u, g52, 0, (C15242j3) null, 0.0f, (C15249k2) null, aVar.mo43015B(), C9527p.f26031b, (Object) null);
        C15187e.m65705a6(cVar, e, cVar2.mo7425g5(g1Var.mo13636g()) / f, C15106n.m65034b(cVar.mo42718b()), 0.0f, (C15192h) null, (C15249k2) null, 0, 120, (Object) null);
        C15187e.m65705a6(cVar, this.$colors.mo12637a(true), g5, a, 0.0f, (C15192h) null, (C15249k2) null, aVar.mo43027k(), 56, (Object) null);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo12332a((C15184c) obj);
        return C11079d2.f28267a;
    }
}
