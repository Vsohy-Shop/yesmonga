package com.carrefour.fid.android.service.presentation.p044ui.delivery.screen;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.LayoutKt;
import androidx.compose.p004ui.semantics.SemanticsModifierKt;
import androidx.compose.p004ui.tooling.preview.C16464c;
import androidx.compose.runtime.C8410b2;
import androidx.compose.runtime.C8539f2;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.C8700z0;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8553b;
import androidx.constraintlayout.compose.ConstraintLayoutKt;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.Measurer;
import com.carrefour.fid.android.design.components.compose.C37019o;
import com.carrefour.fid.android.design.theme.C37475b;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.Pair;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a!\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u000f\u0010\u0007\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, mo22516d2 = {"", "isLoading", "", "address", "Lkotlin/d2;", "BlockAddress", "(ZLjava/lang/String;Landroidx/compose/runtime/o;II)V", "BlockAddressPreview", "(Landroidx/compose/runtime/o;I)V", "service_release"}, mo22517k = 2, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nBlockAddress.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlockAddress.kt\ncom/carrefour/fid/android/service/presentation/ui/delivery/screen/BlockAddressKt\n+ 2 ConstraintLayout.kt\nandroidx/constraintlayout/compose/ConstraintLayoutKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,70:1\n73#2,4:71\n77#2,20:82\n25#3:75\n955#4,6:76\n*S KotlinDebug\n*F\n+ 1 BlockAddress.kt\ncom/carrefour/fid/android/service/presentation/ui/delivery/screen/BlockAddressKt\n*L\n27#1:71,4\n27#1:82,20\n27#1:75\n27#1:76,6\n*E\n"})
/* renamed from: com.carrefour.fid.android.service.presentation.ui.delivery.screen.BlockAddressKt */
public final class BlockAddressKt {
    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public static final void BlockAddress(boolean z, @C12579k String str, @C12580l C8592o oVar, int i, int i2) {
        int i3;
        boolean z2;
        int i4;
        int i5;
        String str2 = str;
        int i6 = i;
        int i7 = i2;
        Intrinsics.checkNotNullParameter(str2, "address");
        C8592o o = oVar.mo15009o(-1743880308);
        int i8 = i7 & 1;
        if (i8 != 0) {
            i3 = i6 | 6;
            z2 = z;
        } else if ((i6 & 14) == 0) {
            z2 = z;
            if (o.mo14961b(z2)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i3 = i5 | i6;
        } else {
            z2 = z;
            i3 = i6;
        }
        if ((i7 & 2) != 0) {
            i3 |= 48;
        } else if ((i6 & 112) == 0) {
            if (o.mo15006n0(str2)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i3 |= i4;
        }
        int i9 = i3;
        if ((i9 & 91) != 18 || !o.mo15011p()) {
            if (i8 != 0) {
                z2 = false;
            }
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1743880308, i9, -1, "com.carrefour.fid.android.service.presentation.ui.delivery.screen.BlockAddress (BlockAddress.kt:22)");
            }
            C8767m b = C37019o.m151909b(BackgroundKt.m8825d(SizeKt.m10114n(C8767m.f23478j, 0.0f, 1, (Object) null), C37475b.f94185a.mo114234c(), (C15218g4) null, 2, (Object) null), z2, (C15218g4) null, 2, (Object) null);
            o.mo14918M(-270267587);
            o.mo14918M(-3687241);
            Object N = o.mo14921N();
            C8592o.C8593a aVar = C8592o.f23032a;
            if (N == aVar.mo16277a()) {
                N = new Measurer();
                o.mo14893C(N);
            }
            o.mo15002m0();
            Measurer measurer = (Measurer) N;
            o.mo14918M(-3687241);
            Object N2 = o.mo14921N();
            if (N2 == aVar.mo16277a()) {
                N2 = new ConstraintLayoutScope();
                o.mo14893C(N2);
            }
            o.mo15002m0();
            ConstraintLayoutScope constraintLayoutScope = (ConstraintLayoutScope) N2;
            o.mo14918M(-3687241);
            Object N3 = o.mo14921N();
            if (N3 == aVar.mo16277a()) {
                N3 = C8539f2.m30981g(Boolean.FALSE, (C8410b2) null, 2, (Object) null);
                o.mo14893C(N3);
            }
            o.mo15002m0();
            Pair<C15560f0, C11289a<C11079d2>> E = ConstraintLayoutKt.m75199E(257, constraintLayoutScope, (C8700z0) N3, measurer, o, 4544);
            ConstraintLayoutScope constraintLayoutScope2 = constraintLayoutScope;
            boolean z3 = z2;
            LayoutKt.m68906d(SemanticsModifierKt.m71868c(b, false, new BlockAddressKt$BlockAddress$$inlined$ConstraintLayout$1(measurer), 1, (Object) null), C8553b.m31048b(o, -819894182, true, new BlockAddressKt$BlockAddress$$inlined$ConstraintLayout$2(constraintLayoutScope2, 0, E.mo21847b(), str, i9)), E.mo21846a(), o, 48, 0);
            o.mo15002m0();
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
            z2 = z3;
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new BlockAddressKt$BlockAddress$2(z2, str, i6, i7));
        }
    }

    /* access modifiers changed from: private */
    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public static final void BlockAddressPreview(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(981845209);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(981845209, i, -1, "com.carrefour.fid.android.service.presentation.ui.delivery.screen.BlockAddressPreview (BlockAddress.kt:66)");
            }
            BlockAddress(false, "31 avenue de la République Française, Appartement 213, 31300 Toulouse", o, 48, 1);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new BlockAddressKt$BlockAddressPreview$1(i));
        }
    }
}
