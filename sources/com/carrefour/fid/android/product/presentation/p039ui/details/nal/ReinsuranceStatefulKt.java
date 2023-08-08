package com.carrefour.fid.android.product.presentation.p039ui.details.nal;

import android.content.Context;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.C2223i;
import androidx.compose.foundation.interaction.C2243g;
import androidx.compose.foundation.layout.C2366i0;
import androidx.compose.foundation.layout.C2373k;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.ButtonKt;
import androidx.compose.material.C3036d1;
import androidx.compose.material.C3046h;
import androidx.compose.material.C7870j;
import androidx.compose.material.ScaffoldKt;
import androidx.compose.material.SnackbarHostState;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.p004ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p004ui.res.C16018i;
import androidx.compose.p004ui.text.C16361p0;
import androidx.compose.p004ui.viewinterop.AndroidView_androidKt;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8553b;
import androidx.constraintlayout.core.motion.utils.C16717v;
import com.bumptech.glide.load.data.mediastore.C22132b;
import com.carrefour.fid.android.design.components.compose.HeaderComponentKt;
import com.carrefour.fid.android.design.theme.C37475b;
import com.carrefour.fid.android.product.C27609f;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nReinsuranceStateful.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReinsuranceStateful.kt\ncom/carrefour/fid/android/product/presentation/ui/details/nal/ReinsuranceStatefulKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,104:1\n36#2:105\n50#2:113\n49#2:114\n36#2:122\n1114#3,6:106\n1114#3,6:115\n1114#3,6:123\n154#4:112\n76#5:121\n*S KotlinDebug\n*F\n+ 1 ReinsuranceStateful.kt\ncom/carrefour/fid/android/product/presentation/ui/details/nal/ReinsuranceStatefulKt\n*L\n28#1:105\n51#1:113\n51#1:114\n97#1:122\n28#1:106,6\n51#1:115,6\n97#1:123,6\n51#1:112\n63#1:121\n*E\n"})
/* renamed from: com.carrefour.fid.android.product.presentation.ui.details.nal.ReinsuranceStatefulKt */
public final class ReinsuranceStatefulKt {
    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    public static final void m116902a(C11300l<? super C27900p, C11079d2> lVar, C8592o oVar, int i) {
        int i2;
        C8592o oVar2;
        int i3;
        C11300l<? super C27900p, C11079d2> lVar2 = lVar;
        int i4 = i;
        C8592o o = oVar.mo15009o(1787601860);
        if ((i4 & 14) == 0) {
            if (o.mo14927P(lVar2)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i4;
        } else {
            i2 = i4;
        }
        if ((i2 & 11) != 2 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1787601860, i2, -1, "com.carrefour.fid.android.product.presentation.ui.details.nal.CloseButton (ReinsuranceStateful.kt:94)");
            }
            o.mo14918M(1157296644);
            boolean n0 = o.mo15006n0(lVar2);
            Object N = o.mo14921N();
            if (n0 || N == C8592o.f23032a.mo16277a()) {
                N = new ReinsuranceStatefulKt$CloseButton$1$1(lVar2);
                o.mo14893C(N);
            }
            o.mo15002m0();
            oVar2 = o;
            ButtonKt.m13343a((C11289a) N, SizeKt.m10114n(C8767m.f23478j, 0.0f, 1, (Object) null), false, (C2243g) null, (C7870j) null, (C15218g4) null, (C2223i) null, (C3046h) null, (C2366i0) null, ComposableSingletons$ReinsuranceStatefulKt.f67428a.mo80802a(), o, 805306416, C16717v.C16724g.f42312p);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
            oVar2 = o;
        }
        C8678t1 s = oVar2.mo15020s();
        if (s != null) {
            s.mo15202a(new ReinsuranceStatefulKt$CloseButton$2(lVar2, i4));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: b */
    public static final void m116903b(ReinsuranceType reinsuranceType, C8592o oVar, int i) {
        int i2;
        int i3;
        C8592o o = oVar.mo15009o(1476079465);
        if ((i & 14) == 0) {
            if (o.mo15006n0(reinsuranceType)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1476079465, i, -1, "com.carrefour.fid.android.product.presentation.ui.details.nal.LoadWebPage (ReinsuranceStateful.kt:61)");
            }
            AndroidView_androidKt.m74829a(new ReinsuranceStatefulKt$LoadWebPage$1((Context) o.mo15032w(AndroidCompositionLocals_androidKt.m70952g()), reinsuranceType), (C8767m) null, (C11300l) null, o, 0, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new ReinsuranceStatefulKt$LoadWebPage$2(reinsuranceType, i));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: kotlin.jvm.functions.l} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m116904c(kotlin.jvm.functions.C11300l<? super com.carrefour.fid.android.product.presentation.p039ui.details.nal.C27900p, kotlin.C11079d2> r17, com.carrefour.fid.android.product.presentation.p039ui.details.nal.ReinsuranceType r18, androidx.compose.runtime.C8592o r19, int r20) {
        /*
            r0 = r17
            r1 = r18
            r2 = r20
            r3 = 1173541963(0x45f2d44b, float:7770.5366)
            r4 = r19
            androidx.compose.runtime.o r15 = r4.mo15009o(r3)
            r4 = r2 & 14
            r5 = 2
            if (r4 != 0) goto L_0x001f
            boolean r4 = r15.mo14927P(r0)
            if (r4 == 0) goto L_0x001c
            r4 = 4
            goto L_0x001d
        L_0x001c:
            r4 = r5
        L_0x001d:
            r4 = r4 | r2
            goto L_0x0020
        L_0x001f:
            r4 = r2
        L_0x0020:
            r6 = r2 & 112(0x70, float:1.57E-43)
            r7 = 16
            if (r6 != 0) goto L_0x0031
            boolean r6 = r15.mo15006n0(r1)
            if (r6 == 0) goto L_0x002f
            r6 = 32
            goto L_0x0030
        L_0x002f:
            r6 = r7
        L_0x0030:
            r4 = r4 | r6
        L_0x0031:
            r6 = r4 & 91
            r8 = 18
            if (r6 != r8) goto L_0x0043
            boolean r6 = r15.mo15011p()
            if (r6 != 0) goto L_0x003e
            goto L_0x0043
        L_0x003e:
            r15.mo14958a0()
            r3 = r15
            goto L_0x00a1
        L_0x0043:
            boolean r6 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r6 == 0) goto L_0x004f
            r6 = -1
            java.lang.String r8 = "com.carrefour.fid.android.product.presentation.ui.details.nal.ReinsuranceContent (ReinsuranceStateful.kt:49)"
            androidx.compose.runtime.ComposerKt.m29845w0(r3, r4, r6, r8)
        L_0x004f:
            androidx.compose.ui.m$a r3 = androidx.compose.p004ui.C8767m.f23478j
            float r6 = (float) r7
            float r6 = androidx.compose.p004ui.unit.C16483g.m74435M(r6)
            r7 = 0
            r8 = 0
            androidx.compose.ui.m r3 = androidx.compose.foundation.layout.PaddingKt.m10026m(r3, r6, r7, r5, r8)
            r5 = 0
            r6 = 0
            r7 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r15.mo14918M(r12)
            boolean r12 = r15.mo15006n0(r1)
            boolean r13 = r15.mo15006n0(r0)
            r12 = r12 | r13
            java.lang.Object r13 = r15.mo14921N()
            if (r12 != 0) goto L_0x007f
            androidx.compose.runtime.o$a r12 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r12 = r12.mo16277a()
            if (r13 != r12) goto L_0x0087
        L_0x007f:
            com.carrefour.fid.android.product.presentation.ui.details.nal.ReinsuranceStatefulKt$ReinsuranceContent$1$1 r13 = new com.carrefour.fid.android.product.presentation.ui.details.nal.ReinsuranceStatefulKt$ReinsuranceContent$1$1
            r13.<init>(r1, r4, r0)
            r15.mo14893C(r13)
        L_0x0087:
            r15.mo15002m0()
            r12 = r13
            kotlin.jvm.functions.l r12 = (kotlin.jvm.functions.C11300l) r12
            r14 = 6
            r16 = 254(0xfe, float:3.56E-43)
            r4 = r3
            r13 = r15
            r3 = r15
            r15 = r16
            androidx.compose.foundation.lazy.LazyDslKt.m10737b(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            boolean r4 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r4 == 0) goto L_0x00a1
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x00a1:
            androidx.compose.runtime.t1 r3 = r3.mo15020s()
            if (r3 != 0) goto L_0x00a8
            goto L_0x00b0
        L_0x00a8:
            com.carrefour.fid.android.product.presentation.ui.details.nal.ReinsuranceStatefulKt$ReinsuranceContent$2 r4 = new com.carrefour.fid.android.product.presentation.ui.details.nal.ReinsuranceStatefulKt$ReinsuranceContent$2
            r4.<init>(r0, r1, r2)
            r3.mo15202a(r4)
        L_0x00b0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.presentation.p039ui.details.nal.ReinsuranceStatefulKt.m116904c(kotlin.jvm.functions.l, com.carrefour.fid.android.product.presentation.ui.details.nal.ReinsuranceType, androidx.compose.runtime.o, int):void");
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: d */
    public static final void m116905d(C11300l<? super C27900p, C11079d2> lVar, C8592o oVar, int i) {
        int i2;
        C8592o oVar2;
        int i3;
        C11300l<? super C27900p, C11079d2> lVar2 = lVar;
        int i4 = i;
        C8592o o = oVar.mo15009o(-847037094);
        if ((i4 & 14) == 0) {
            if (o.mo14927P(lVar2)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i4;
        } else {
            i2 = i4;
        }
        if ((i2 & 11) != 2 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-847037094, i2, -1, "com.carrefour.fid.android.product.presentation.ui.details.nal.ReinsuranceHeader (ReinsuranceStateful.kt:75)");
            }
            String d = C16018i.m71858d(C27609f.C27627r.pdp_repairability_link, o, 0);
            String d2 = C16018i.m71858d(C27609f.C27627r.accessibility_display_reinsurance_title, o, 0);
            C37475b bVar = C37475b.f94185a;
            String str = d;
            oVar2 = o;
            HeaderComponentKt.m151497b(str, (C16361p0) null, bVar.mo114218O(), bVar.mo114231a0(), bVar.mo114231a0(), d2, ReinsuranceStatefulKt$ReinsuranceHeader$1.f67453f, C8553b.m31048b(o, -1308022011, true, new ReinsuranceStatefulKt$ReinsuranceHeader$2(lVar2, i2)), o, 14155776, 2);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
            oVar2 = o;
        }
        C8678t1 s = oVar2.mo15020s();
        if (s != null) {
            s.mo15202a(new ReinsuranceStatefulKt$ReinsuranceHeader$3(lVar2, i4));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: e */
    public static final void m116906e(C11300l<? super C27900p, C11079d2> lVar, ReinsuranceType reinsuranceType, C8592o oVar, int i) {
        int i2;
        C8592o oVar2;
        int i3;
        int i4;
        C11300l<? super C27900p, C11079d2> lVar2 = lVar;
        ReinsuranceType reinsuranceType2 = reinsuranceType;
        int i5 = i;
        C8592o o = oVar.mo15009o(418047398);
        if ((i5 & 14) == 0) {
            if (o.mo14927P(lVar2)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i5;
        } else {
            i2 = i5;
        }
        if ((i5 & 112) == 0) {
            if (o.mo15006n0(reinsuranceType2)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        int i6 = i2;
        if ((i6 & 91) != 18 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(418047398, i6, -1, "com.carrefour.fid.android.product.presentation.ui.details.nal.ReinsuranceScreen (ReinsuranceStateful.kt:38)");
            }
            C8767m.C8768a aVar = C8767m.f23478j;
            C37475b bVar = C37475b.f94185a;
            C8767m d = BackgroundKt.m8825d(aVar, bVar.mo114231a0(), (C15218g4) null, 2, (Object) null);
            long a0 = bVar.mo114231a0();
            C8592o oVar3 = o;
            oVar2 = oVar3;
            ScaffoldKt.m13747a(d, (C3036d1) null, C8553b.m31048b(o, -2115828351, true, new ReinsuranceStatefulKt$ReinsuranceScreen$1(lVar2, i6)), (C11304p<? super C8592o, ? super Integer, C11079d2>) null, (C11305q<? super SnackbarHostState, ? super C8592o, ? super Integer, C11079d2>) null, (C11304p<? super C8592o, ? super Integer, C11079d2>) null, 0, false, (C11305q<? super C2373k, ? super C8592o, ? super Integer, C11079d2>) null, false, (C15218g4) null, 0.0f, 0, 0, 0, a0, 0, C8553b.m31048b(oVar3, 1920705704, true, new ReinsuranceStatefulKt$ReinsuranceScreen$2(lVar2, reinsuranceType2, i6)), oVar3, C22132b.f56831b, 12582912, 98298);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
            oVar2 = o;
        }
        C8678t1 s = oVar2.mo15020s();
        if (s != null) {
            s.mo15202a(new ReinsuranceStatefulKt$ReinsuranceScreen$3(lVar2, reinsuranceType2, i5));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: f */
    public static final void m116907f(@C12579k ReinsuranceType reinsuranceType, @C12579k C11289a<C11079d2> aVar, @C12580l C8592o oVar, int i) {
        int i2;
        int i3;
        int i4;
        Intrinsics.checkNotNullParameter(reinsuranceType, "reinsuranceType");
        Intrinsics.checkNotNullParameter(aVar, "onBackPressed");
        C8592o o = oVar.mo15009o(-2011654937);
        if ((i & 14) == 0) {
            if (o.mo15006n0(reinsuranceType)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (o.mo14927P(aVar)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 91) != 18 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-2011654937, i2, -1, "com.carrefour.fid.android.product.presentation.ui.details.nal.ReinsuranceStateful (ReinsuranceStateful.kt:26)");
            }
            o.mo14918M(1157296644);
            boolean n0 = o.mo15006n0(aVar);
            Object N = o.mo14921N();
            if (n0 || N == C8592o.f23032a.mo16277a()) {
                N = new ReinsuranceStatefulKt$ReinsuranceStateful$actioner$1$1(aVar);
                o.mo14893C(N);
            }
            o.mo15002m0();
            m116906e((C11300l) N, reinsuranceType, o, (i2 << 3) & 112);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new ReinsuranceStatefulKt$ReinsuranceStateful$1(reinsuranceType, aVar, i));
        }
    }
}
