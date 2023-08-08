package com.carrefour.fid.android.presentation.p035ui.checkout.nal.step2.component;

import androidx.compose.foundation.C2223i;
import androidx.compose.foundation.interaction.C2243g;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.C2366i0;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.ButtonKt;
import androidx.compose.material.C3046h;
import androidx.compose.material.C7870j;
import androidx.compose.material.C7933t0;
import androidx.compose.material.TextKt;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.LayoutKt;
import androidx.compose.p004ui.node.ComposeUiNode;
import androidx.compose.p004ui.platform.C15863c4;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
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
import androidx.constraintlayout.core.motion.utils.C16717v;
import androidx.profileinstaller.C20022q;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.design.theme.ThemeKt;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nPickupComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PickupComponent.kt\ncom/carrefour/fid/android/presentation/ui/checkout/nal/step2/component/PickupComponentKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,113:1\n36#2:114\n460#2,13:140\n473#2,3:155\n1114#3,6:115\n74#4,6:121\n80#4:153\n84#4:159\n75#5:127\n76#5,11:129\n89#5:158\n76#6:128\n154#7:154\n*S KotlinDebug\n*F\n+ 1 PickupComponent.kt\ncom/carrefour/fid/android/presentation/ui/checkout/nal/step2/component/PickupComponentKt\n*L\n42#1:114\n73#1:140,13\n73#1:155,3\n42#1:115,6\n73#1:121,6\n73#1:153\n73#1:159\n73#1:127\n73#1:129,11\n73#1:158\n73#1:128\n83#1:154\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step2.component.PickupComponentKt */
public final class PickupComponentKt {
    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    public static final void m105043a(@C12579k C8767m mVar, @C12579k C11289a<C11079d2> aVar, @C12580l C8592o oVar, int i) {
        int i2;
        C8592o oVar2;
        int i3;
        int i4;
        C8767m mVar2 = mVar;
        C11289a<C11079d2> aVar2 = aVar;
        int i5 = i;
        Intrinsics.checkNotNullParameter(mVar2, "modifier");
        Intrinsics.checkNotNullParameter(aVar2, "onClicked");
        C8592o o = oVar.mo15009o(1344653116);
        if ((i5 & 14) == 0) {
            if (o.mo15006n0(mVar2)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i5;
        } else {
            i2 = i5;
        }
        if ((i5 & 112) == 0) {
            if (o.mo14927P(aVar2)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 91) != 18 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1344653116, i2, -1, "com.carrefour.fid.android.presentation.ui.checkout.nal.step2.component.EmptyPickupComponent (PickupComponent.kt:68)");
            }
            int i6 = i2 & 14;
            o.mo14918M(-483455358);
            int i7 = i6 >> 3;
            C15560f0 b = ColumnKt.m9863b(Arrangement.f6010a.mo7631r(), C8734c.f23406a.mo17072u(), o, (i7 & 112) | (i7 & 14));
            o.mo14918M(-1323940314);
            C16479d dVar = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            C11289a<ComposeUiNode> a = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f = LayoutKt.m68908f(mVar);
            int i8 = ((((i6 << 3) & 112) << 9) & 7168) | 6;
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
            f.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, Integer.valueOf((i8 >> 3) & 112));
            o.mo14918M(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f6049a;
            TextKt.m14196c(C16018i.m71858d(R.string.checkout_non_food_pickup_title, o, 0), (C8767m) null, 0, 0, (C16190e0) null, C16209i0.f40292b.mo46947c(), (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, C7933t0.f19075a.mo11077c(o, C7933t0.f19076b).mo11097j(), o, C20022q.C20025c.f51280k, 0, 65502);
            oVar2 = o;
            ButtonKt.m13343a(aVar, PaddingKt.m10028o(SizeKt.m10114n(C8767m.f23478j, 0.0f, 1, (Object) null), 0.0f, C16483g.m74435M((float) 12), 0.0f, 0.0f, 13, (Object) null), false, (C2243g) null, (C7870j) null, (C15218g4) null, (C2223i) null, (C3046h) null, (C2366i0) null, ComposableSingletons$PickupComponentKt.f59645a.mo69256a(), o, ((i2 >> 3) & 14) | 805306416, C16717v.C16724g.f42312p);
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
            s.mo15202a(new PickupComponentKt$EmptyPickupComponent$2(mVar2, aVar2, i5));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: kotlin.jvm.functions.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m105044b(@org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r8, @org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.models.pickup.C38080a r9, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<kotlin.C11079d2> r10, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<kotlin.C11079d2> r11, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r12, int r13, int r14) {
        /*
            java.lang.String r0 = "pickup"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "onEditClicked"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "onSeeOpenings"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            r0 = -389096479(0xffffffffe8cedbe1, float:-7.8149084E24)
            androidx.compose.runtime.o r12 = r12.mo15009o(r0)
            r1 = r14 & 1
            if (r1 == 0) goto L_0x001c
            androidx.compose.ui.m$a r8 = androidx.compose.p004ui.C8767m.f23478j
        L_0x001c:
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x0028
            r1 = -1
            java.lang.String r2 = "com.carrefour.fid.android.presentation.ui.checkout.nal.step2.component.FilledPickupComponent (PickupComponent.kt:32)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r13, r1, r2)
        L_0x0028:
            r0 = 2131952171(0x7f13022b, float:1.9540777E38)
            r1 = 0
            java.lang.String r2 = androidx.compose.p004ui.res.C16018i.m71858d(r0, r12, r1)
            r0 = 1157296644(0x44faf204, float:2007.563)
            r12.mo14918M(r0)
            boolean r0 = r12.mo15006n0(r10)
            java.lang.Object r1 = r12.mo14921N()
            if (r0 != 0) goto L_0x0048
            androidx.compose.runtime.o$a r0 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r0 = r0.mo16277a()
            if (r1 != r0) goto L_0x0050
        L_0x0048:
            com.carrefour.fid.android.presentation.ui.checkout.nal.step2.component.PickupComponentKt$FilledPickupComponent$1$1 r1 = new com.carrefour.fid.android.presentation.ui.checkout.nal.step2.component.PickupComponentKt$FilledPickupComponent$1$1
            r1.<init>(r10)
            r12.mo14893C(r1)
        L_0x0050:
            r12.mo15002m0()
            r3 = r1
            kotlin.jvm.functions.a r3 = (kotlin.jvm.functions.C11289a) r3
            com.carrefour.fid.android.presentation.ui.checkout.nal.step2.component.PickupComponentKt$FilledPickupComponent$2 r0 = new com.carrefour.fid.android.presentation.ui.checkout.nal.step2.component.PickupComponentKt$FilledPickupComponent$2
            r0.<init>(r9, r11)
            r1 = 933770606(0x37a8356e, float:2.005204E-5)
            r4 = 1
            androidx.compose.runtime.internal.a r4 = androidx.compose.runtime.internal.C8553b.m31048b(r12, r1, r4, r0)
            r0 = r13 & 14
            r6 = r0 | 3072(0xc00, float:4.305E-42)
            r7 = 0
            r1 = r8
            r5 = r12
            com.carrefour.fid.android.presentation.p035ui.checkout.common.EditableSectionKt.m104616c(r1, r2, r3, r4, r5, r6, r7)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0076
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0076:
            androidx.compose.runtime.t1 r12 = r12.mo15020s()
            if (r12 != 0) goto L_0x007d
            goto L_0x008c
        L_0x007d:
            com.carrefour.fid.android.presentation.ui.checkout.nal.step2.component.PickupComponentKt$FilledPickupComponent$3 r0 = new com.carrefour.fid.android.presentation.ui.checkout.nal.step2.component.PickupComponentKt$FilledPickupComponent$3
            r1 = r0
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r13
            r7 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r12.mo15202a(r0)
        L_0x008c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.checkout.nal.step2.component.PickupComponentKt.m105044b(androidx.compose.ui.m, com.carrefour.fid.android.domain.models.pickup.a, kotlin.jvm.functions.a, kotlin.jvm.functions.a, androidx.compose.runtime.o, int, int):void");
    }

    @C8540g
    @C16464c(showBackground = true, widthDp = 300)
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: c */
    public static final void m105045c(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(-1514088257);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1514088257, i, -1, "com.carrefour.fid.android.presentation.ui.checkout.nal.step2.component.FilledPickupPreview (PickupComponent.kt:102)");
            }
            ThemeKt.m153788a(ComposableSingletons$PickupComponentKt.f59645a.mo69257b(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new PickupComponentKt$FilledPickupPreview$1(i));
        }
    }
}
