package com.carrefour.fid.android.presentation.p035ui.checkout.common;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.C2428y0;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.C7933t0;
import androidx.compose.material.TextKt;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15249k2;
import androidx.compose.p004ui.layout.C15541c;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.LayoutKt;
import androidx.compose.p004ui.node.ComposeUiNode;
import androidx.compose.p004ui.platform.C15863c4;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.res.C16015f;
import androidx.compose.p004ui.res.C16018i;
import androidx.compose.p004ui.text.C16260h0;
import androidx.compose.p004ui.text.font.C16190e0;
import androidx.compose.p004ui.text.font.C16209i0;
import androidx.compose.p004ui.text.font.C16242u;
import androidx.compose.p004ui.text.style.C16432i;
import androidx.compose.p004ui.text.style.C16434j;
import androidx.compose.p004ui.tooling.preview.C16464c;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8428d;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.C8684u1;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Updater;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.design.components.compose.ExpandButtonPosition;
import com.carrefour.fid.android.design.components.compose.ExpandableComponentKt;
import com.carrefour.fid.android.design.theme.C37475b;
import com.carrefour.fid.android.design.theme.ThemeKt;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nSecurePaymentComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SecurePaymentComponent.kt\ncom/carrefour/fid/android/presentation/ui/checkout/common/SecurePaymentComponentKt\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,100:1\n74#2,6:101\n80#2:133\n84#2:143\n75#3:107\n76#3,11:109\n89#3:142\n76#4:108\n460#5,13:120\n473#5,3:139\n154#6:134\n154#6:135\n154#6:136\n154#6:137\n154#6:138\n*S KotlinDebug\n*F\n+ 1 SecurePaymentComponent.kt\ncom/carrefour/fid/android/presentation/ui/checkout/common/SecurePaymentComponentKt\n*L\n30#1:101,6\n30#1:133\n30#1:143\n30#1:107\n30#1:109,11\n30#1:142\n30#1:108\n30#1:120,13\n30#1:139,3\n34#1:134\n37#1:135\n38#1:136\n44#1:137\n51#1:138\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.common.SecurePaymentComponentKt */
public final class SecurePaymentComponentKt {
    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    public static final void m104652a(@C12580l C8592o oVar, int i) {
        C8592o oVar2;
        int i2 = i;
        C8592o o = oVar.mo15009o(1914197891);
        if (i2 != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1914197891, i2, -1, "com.carrefour.fid.android.presentation.ui.checkout.common.SecurePaymentComponent (SecurePaymentComponent.kt:28)");
            }
            C8767m.C8768a aVar = C8767m.f23478j;
            C8767m n = SizeKt.m10114n(aVar, 0.0f, 1, (Object) null);
            C8734c.C8735a aVar2 = C8734c.f23406a;
            C8734c.C8736b m = aVar2.mo17068m();
            o.mo14918M(-483455358);
            C15560f0 b = ColumnKt.m9863b(Arrangement.f6010a.mo7631r(), m, o, 48);
            o.mo14918M(-1323940314);
            C16479d dVar = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            C11289a<ComposeUiNode> a = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f = LayoutKt.m68908f(n);
            if (!(o.mo15017r() instanceof C8428d)) {
                ComposablesKt.m29519n();
            }
            o.mo14938T();
            if (o.mo14997l()) {
                o.mo14947W(a);
            } else {
                o.mo14888A();
            }
            o.mo14941U();
            C8592o b2 = Updater.m30180b(o);
            Updater.m30188j(b2, b, companion.mo44588d());
            Updater.m30188j(b2, dVar, companion.mo44586b());
            Updater.m30188j(b2, layoutDirection, companion.mo44587c());
            Updater.m30188j(b2, c4Var, companion.mo44590f());
            o.mo14972e();
            f.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
            o.mo14918M(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f6049a;
            float f2 = (float) 16;
            C2428y0.m10726a(PaddingKt.m10024k(aVar, C16483g.m74435M(f2)), o, 6);
            ImageKt.m8967b(C16015f.m71849d(R.drawable.ic_verified_visa, o, 0), (String) null, SizeKt.m10115o(SizeKt.m10092H(aVar, C16483g.m74435M((float) 57)), C16483g.m74435M((float) 48)), (C8734c) null, (C15541c) null, 0.0f, (C15249k2) null, o, 440, 120);
            float f3 = (float) 24;
            C8767m.C8768a aVar3 = aVar;
            C8767m o2 = PaddingKt.m10028o(aVar3, C16483g.m74435M(f3), C16483g.m74435M(f2), C16483g.m74435M(f3), 0.0f, 8, (Object) null);
            C8592o oVar3 = o;
            TextKt.m14196c(C16018i.m71858d(R.string.checkout_3ds_secure_title, o, 0), o2, C37475b.f94185a.mo114220Q(), 0, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, C7933t0.f19075a.mo11077c(o, C7933t0.f19076b).mo11098k(), oVar3, 0, 0, 65528);
            ColumnScopeInstance columnScopeInstance2 = columnScopeInstance;
            C8592o oVar4 = oVar3;
            oVar2 = oVar4;
            ExpandableComponentKt.m151485a((String) null, C16018i.m71858d(R.string.checkout_3ds_secure_instructions, oVar4, 0), C16018i.m71858d(R.string.checkout_3ds_secure_instructions, oVar4, 0), columnScopeInstance2.mo7714e(PaddingKt.m10028o(aVar, C16483g.m74435M((float) 10), 0.0f, C16483g.m74435M(f3), C16483g.m74435M(f2), 2, (Object) null), aVar2.mo17072u()), false, false, aVar2.mo17072u(), ExpandButtonPosition.Top, 0, 0, (C11300l<? super Boolean, C11079d2>) null, ComposableSingletons$SecurePaymentComponentKt.f59409a.mo68806a(), oVar4, 14155776, 48, 1841);
            oVar2.mo15002m0();
            oVar2.mo14896D();
            oVar2.mo15002m0();
            oVar2.mo15002m0();
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
            oVar2 = o;
        }
        C8678t1 s = oVar2.mo15020s();
        if (s != null) {
            s.mo15202a(new SecurePaymentComponentKt$SecurePaymentComponent$2(i2));
        }
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: b */
    public static final void m104653b(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(696929299);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(696929299, i, -1, "com.carrefour.fid.android.presentation.ui.checkout.common.SecurePaymentComponentPreview (SecurePaymentComponent.kt:91)");
            }
            ThemeKt.m153788a(ComposableSingletons$SecurePaymentComponentKt.f59409a.mo68807b(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new SecurePaymentComponentKt$SecurePaymentComponentPreview$1(i));
        }
    }
}
