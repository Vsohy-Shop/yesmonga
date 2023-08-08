package androidx.compose.foundation;

import androidx.compose.foundation.interaction.C2241e;
import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.foundation.interaction.HoverInteractionKt;
import androidx.compose.foundation.interaction.PressInteractionKt;
import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.p004ui.graphics.C15249k2;
import androidx.compose.p004ui.graphics.drawscope.C15184c;
import androidx.compose.p004ui.graphics.drawscope.C15187e;
import androidx.compose.p004ui.graphics.drawscope.C15192h;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nIndication.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Indication.kt\nandroidx/compose/foundation/DefaultDebugIndication\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,186:1\n36#2:187\n1114#3,6:188\n*S KotlinDebug\n*F\n+ 1 Indication.kt\nandroidx/compose/foundation/DefaultDebugIndication\n*L\n171#1:187\n171#1:188,6\n*E\n"})
/* renamed from: androidx.compose.foundation.o */
public final class C2630o implements C2104a0 {
    @C12579k

    /* renamed from: a */
    public static final C2630o f6967a = new C2630o();

    /* renamed from: androidx.compose.foundation.o$a */
    public static final class C2631a implements C2107b0 {
        @C12579k

        /* renamed from: a */
        public final C8578k2<Boolean> f6968a;
        @C12579k

        /* renamed from: b */
        public final C8578k2<Boolean> f6969b;
        @C12579k

        /* renamed from: c */
        public final C8578k2<Boolean> f6970c;

        public C2631a(@C12579k C8578k2<Boolean> k2Var, @C12579k C8578k2<Boolean> k2Var2, @C12579k C8578k2<Boolean> k2Var3) {
            Intrinsics.checkNotNullParameter(k2Var, "isPressed");
            Intrinsics.checkNotNullParameter(k2Var2, "isHovered");
            Intrinsics.checkNotNullParameter(k2Var3, "isFocused");
            this.f6968a = k2Var;
            this.f6969b = k2Var2;
            this.f6970c = k2Var3;
        }

        /* renamed from: a */
        public void mo7285a(@C12579k C15184c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "<this>");
            cVar.mo42716g6();
            if (this.f6968a.getValue().booleanValue()) {
                C15187e.m65710e5(cVar, C15240j2.m66080w(C15240j2.f37547b.mo42841a(), 0.3f, 0.0f, 0.0f, 0.0f, 14, (Object) null), 0, cVar.mo42718b(), 0.0f, (C15192h) null, (C15249k2) null, 0, 122, (Object) null);
            } else if (this.f6969b.getValue().booleanValue() || this.f6970c.getValue().booleanValue()) {
                C15187e.m65710e5(cVar, C15240j2.m66080w(C15240j2.f37547b.mo42841a(), 0.1f, 0.0f, 0.0f, 0.0f, 14, (Object) null), 0, cVar.mo42718b(), 0.0f, (C15192h) null, (C15249k2) null, 0, 122, (Object) null);
            }
        }
    }

    @C8540g
    @C12579k
    /* renamed from: a */
    public C2107b0 mo7284a(@C12579k C2241e eVar, @C12580l C8592o oVar, int i) {
        Intrinsics.checkNotNullParameter(eVar, "interactionSource");
        oVar.mo14918M(1683566979);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(1683566979, i, -1, "androidx.compose.foundation.DefaultDebugIndication.rememberUpdatedInstance (Indication.kt:166)");
        }
        int i2 = i & 14;
        C8578k2<Boolean> a = PressInteractionKt.m9677a(eVar, oVar, i2);
        C8578k2<Boolean> a2 = HoverInteractionKt.m9675a(eVar, oVar, i2);
        C8578k2<Boolean> a3 = FocusInteractionKt.m9673a(eVar, oVar, i2);
        oVar.mo14918M(1157296644);
        boolean n0 = oVar.mo15006n0(eVar);
        Object N = oVar.mo14921N();
        if (n0 || N == C8592o.f23032a.mo16277a()) {
            N = new C2631a(a, a2, a3);
            oVar.mo14893C(N);
        }
        oVar.mo15002m0();
        C2631a aVar = (C2631a) N;
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return aVar;
    }
}
