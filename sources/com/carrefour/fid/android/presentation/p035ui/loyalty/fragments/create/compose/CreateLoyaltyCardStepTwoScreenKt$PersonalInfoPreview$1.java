package com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.create.compose;

import android.app.DatePickerDialog;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.LayoutKt;
import androidx.compose.p004ui.node.ComposeUiNode;
import androidx.compose.p004ui.platform.C15863c4;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8410b2;
import androidx.compose.runtime.C8428d;
import androidx.compose.runtime.C8539f2;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8684u1;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.snapshots.C8667t;
import com.carrefour.fid.android.shared.type.C28892e;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nCreateLoyaltyCardStepTwoScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CreateLoyaltyCardStepTwoScreen.kt\ncom/carrefour/fid/android/presentation/ui/loyalty/fragments/create/compose/CreateLoyaltyCardStepTwoScreenKt$PersonalInfoPreview$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,838:1\n154#2:839\n74#3,6:840\n80#3:872\n84#3:877\n75#4:846\n76#4,11:848\n89#4:876\n76#5:847\n460#6,13:859\n473#6,3:873\n*S KotlinDebug\n*F\n+ 1 CreateLoyaltyCardStepTwoScreen.kt\ncom/carrefour/fid/android/presentation/ui/loyalty/fragments/create/compose/CreateLoyaltyCardStepTwoScreenKt$PersonalInfoPreview$1\n*L\n804#1:839\n800#1:840,6\n800#1:872\n800#1:877\n800#1:846\n800#1:848,11\n800#1:876\n800#1:847\n800#1:859,13\n800#1:873,3\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.compose.CreateLoyaltyCardStepTwoScreenKt$PersonalInfoPreview$1 */
public final class CreateLoyaltyCardStepTwoScreenKt$PersonalInfoPreview$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ C8667t<String, C24390b> $inputLoyaltyFieldStateMap;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreateLoyaltyCardStepTwoScreenKt$PersonalInfoPreview$1(C8667t<String, C24390b> tVar) {
        super(2);
        this.$inputLoyaltyFieldStateMap = tVar;
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
                ComposerKt.m29845w0(-2024848012, i2, -1, "com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.compose.PersonalInfoPreview.<anonymous> (CreateLoyaltyCardStepTwoScreen.kt:798)");
            }
            C8767m l = PaddingKt.m10025l(BackgroundKt.m8825d(SizeKt.m10112l(C8767m.f23478j, 0.0f, 1, (Object) null), C15240j2.f37547b.mo42852w(), (C15218g4) null, 2, (Object) null), C16483g.m74435M((float) 16), C16483g.m74435M((float) 24));
            C8667t<String, C24390b> tVar = this.$inputLoyaltyFieldStateMap;
            oVar2.mo14918M(-483455358);
            C15560f0 b = ColumnKt.m9863b(Arrangement.f6010a.mo7631r(), C8734c.f23406a.mo17072u(), oVar2, 0);
            oVar2.mo14918M(-1323940314);
            C16479d dVar = (C16479d) oVar2.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) oVar2.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var = (C15863c4) oVar2.mo15032w(CompositionLocalsKt.m71025w());
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            C11289a<ComposeUiNode> a = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f = LayoutKt.m68908f(l);
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
            CreateLoyaltyCardStepTwoScreenKt.m107010E("", "", CreateLoyaltyCardStepTwoScreenKt$PersonalInfoPreview$1$1$1.f60835f, CreateLoyaltyCardStepTwoScreenKt$PersonalInfoPreview$1$1$2.f60836f, (DatePickerDialog) null, tVar, CreateLoyaltyCardStepTwoScreenKt$PersonalInfoPreview$1$1$3.f60837f, oVar, 1797558);
            C8667t<String, C24390b> tVar2 = tVar;
            CreateLoyaltyCardStepTwoScreenKt.m107006A(false, C8539f2.m30981g((Object) null, (C8410b2) null, 2, (Object) null), tVar2, "", "", "", "", CreateLoyaltyCardStepTwoScreenKt$PersonalInfoPreview$1$1$4.f60838f, C8539f2.m30981g((Object) null, (C8410b2) null, 2, (Object) null), CreateLoyaltyCardStepTwoScreenKt$PersonalInfoPreview$1$1$5.f60839f, oVar, 819686790);
            CreateLoyaltyCardStepTwoScreenKt.m107009D(false, false, CreateLoyaltyCardStepTwoScreenKt$PersonalInfoPreview$1$1$6.f60840f, CreateLoyaltyCardStepTwoScreenKt$PersonalInfoPreview$1$1$7.f60841f, CreateLoyaltyCardStepTwoScreenKt$PersonalInfoPreview$1$1$8.f60842f, true, C8539f2.m30981g(C28892e.C28896d.f70785b, (C8410b2) null, 2, (Object) null), oVar, 224694);
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
