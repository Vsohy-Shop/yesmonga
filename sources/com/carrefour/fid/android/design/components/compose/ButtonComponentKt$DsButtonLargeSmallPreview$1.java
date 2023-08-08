package com.carrefour.fid.android.design.components.compose;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.LayoutKt;
import androidx.compose.p004ui.node.ComposeUiNode;
import androidx.compose.p004ui.platform.C15863c4;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8428d;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8684u1;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Updater;
import com.contentsquare.android.api.C14092c;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nButtonComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ButtonComponent.kt\ncom/carrefour/fid/android/design/components/compose/ButtonComponentKt$DsButtonLargeSmallPreview$1\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,370:1\n73#2,7:371\n80#2:404\n84#2:409\n75#3:378\n76#3,11:380\n89#3:408\n76#4:379\n460#5,13:391\n473#5,3:405\n*S KotlinDebug\n*F\n+ 1 ButtonComponent.kt\ncom/carrefour/fid/android/design/components/compose/ButtonComponentKt$DsButtonLargeSmallPreview$1\n*L\n358#1:371,7\n358#1:404\n358#1:409\n358#1:378\n358#1:380,11\n358#1:408\n358#1:379\n358#1:391,13\n358#1:405,3\n*E\n"})
public final class ButtonComponentKt$DsButtonLargeSmallPreview$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ String $buttonText;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ButtonComponentKt$DsButtonLargeSmallPreview$1(String str) {
        super(2);
        this.$buttonText = str;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public final void invoke(@C12580l C8592o oVar, int i) {
        C8592o oVar2 = oVar;
        int i2 = i;
        if ((i2 & 11) != 2 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1154661949, i2, -1, "com.carrefour.fid.android.design.components.compose.DsButtonLargeSmallPreview.<anonymous> (ButtonComponent.kt:356)");
            }
            String str = this.$buttonText;
            oVar2.mo14918M(-483455358);
            C8767m.C8768a aVar = C8767m.f23478j;
            C15560f0 b = ColumnKt.m9863b(Arrangement.f6010a.mo7631r(), C8734c.f23406a.mo17072u(), oVar2, 0);
            oVar2.mo14918M(-1323940314);
            C16479d dVar = (C16479d) oVar2.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) oVar2.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var = (C15863c4) oVar2.mo15032w(CompositionLocalsKt.m71025w());
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            C11289a<ComposeUiNode> a = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f = LayoutKt.m68908f(aVar);
            if (!(oVar.mo15017r() instanceof C8428d)) {
                ComposablesKt.m29519n();
            }
            oVar.mo14938T();
            if (oVar.mo14997l()) {
                oVar2.mo14947W(a);
            } else {
                oVar.mo14888A();
            }
            oVar.mo14941U();
            C8592o b2 = Updater.m30180b(oVar);
            Updater.m30188j(b2, b, companion.mo44588d());
            Updater.m30188j(b2, dVar, companion.mo44586b());
            Updater.m30188j(b2, layoutDirection, companion.mo44587c());
            Updater.m30188j(b2, c4Var, companion.mo44590f());
            oVar.mo14972e();
            f.invoke(C8684u1.m31905a(C8684u1.m31906b(oVar)), oVar2, 0);
            oVar2.mo14918M(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f6049a;
            ButtonComponentKt.m151340g((C8767m) null, ButtonComponentKt$DsButtonLargeSmallPreview$1$1$1.f92095f, (ButtonType) null, (ButtonColor) null, false, false, str, (Integer) null, (Integer) null, false, oVar, 1572912, C14092c.f34649r2);
            ButtonComponentKt.m151339f((C8767m) null, ButtonComponentKt$DsButtonLargeSmallPreview$1$1$2.f92096f, (ButtonType) null, (ButtonColor) null, false, str, false, (Integer) null, false, oVar, 196656, 477);
            oVar.mo15002m0();
            oVar.mo14896D();
            oVar.mo15002m0();
            oVar.mo15002m0();
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}
