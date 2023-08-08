package com.carrefour.fid.android.presentation.p035ui.orders.online.view;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.material.C7948y0;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.layout.OnRemeasuredModifierKt;
import androidx.compose.p004ui.tooling.preview.C16464c;
import androidx.compose.p004ui.unit.C16500q;
import androidx.compose.runtime.C8410b2;
import androidx.compose.runtime.C8539f2;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.C8700z0;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.internal.C8553b;
import androidx.compose.runtime.saveable.C8628e;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import com.bumptech.glide.load.data.mediastore.C22132b;
import com.carrefour.fid.android.design.theme.ThemeKt;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nGreenStepProgressComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GreenStepProgressComponent.kt\ncom/carrefour/fid/android/presentation/ui/orders/online/view/GreenStepProgressComponentKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,189:1\n25#2:190\n460#2,13:217\n50#2:232\n49#2:233\n36#2:240\n473#2,3:247\n25#2:252\n36#2:259\n36#2:266\n1114#3,6:191\n1114#3,6:234\n1114#3,6:241\n1114#3,6:253\n1114#3,6:260\n1114#3,6:267\n73#4,7:197\n80#4:230\n84#4:251\n75#5:204\n76#5,11:206\n89#5:250\n76#6:205\n154#7:231\n76#8:273\n102#8,2:274\n76#8:276\n102#8,2:277\n76#8:279\n102#8,2:280\n76#8:282\n*S KotlinDebug\n*F\n+ 1 GreenStepProgressComponent.kt\ncom/carrefour/fid/android/presentation/ui/orders/online/view/GreenStepProgressComponentKt\n*L\n25#1:190\n27#1:217,13\n30#1:232\n30#1:233\n38#1:240\n27#1:247,3\n54#1:252\n61#1:259\n66#1:266\n25#1:191,6\n30#1:234,6\n38#1:241,6\n54#1:253,6\n61#1:260,6\n66#1:267,6\n27#1:197,7\n27#1:230\n27#1:251\n27#1:204\n27#1:206,11\n27#1:250\n27#1:205\n28#1:231\n25#1:273\n25#1:274,2\n54#1:276\n54#1:277,2\n55#1:279\n55#1:280,2\n56#1:282\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.view.GreenStepProgressComponentKt */
public final class GreenStepProgressComponentKt {
    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    public static final void m109290a(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(1271133523);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1271133523, i, -1, "com.carrefour.fid.android.presentation.ui.orders.online.view.Green3Step1Preview (GreenStepProgressComponent.kt:167)");
            }
            ThemeKt.m153788a(ComposableSingletons$GreenStepProgressComponentKt.f62266a.mo73599k(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new GreenStepProgressComponentKt$Green3Step1Preview$1(i));
        }
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: b */
    public static final void m109291b(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(124593010);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(124593010, i, -1, "com.carrefour.fid.android.presentation.ui.orders.online.view.Green3Step2Preview (GreenStepProgressComponent.kt:175)");
            }
            ThemeKt.m153788a(ComposableSingletons$GreenStepProgressComponentKt.f62266a.mo73590b(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new GreenStepProgressComponentKt$Green3Step2Preview$1(i));
        }
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: c */
    public static final void m109292c(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(-1021947503);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1021947503, i, -1, "com.carrefour.fid.android.presentation.ui.orders.online.view.Green3Step3Preview (GreenStepProgressComponent.kt:183)");
            }
            ThemeKt.m153788a(ComposableSingletons$GreenStepProgressComponentKt.f62266a.mo73591c(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new GreenStepProgressComponentKt$Green3Step3Preview$1(i));
        }
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: d */
    public static final void m109293d(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(630047380);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(630047380, i, -1, "com.carrefour.fid.android.presentation.ui.orders.online.view.Green4Step1Preview (GreenStepProgressComponent.kt:135)");
            }
            ThemeKt.m153788a(ComposableSingletons$GreenStepProgressComponentKt.f62266a.mo73595g(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new GreenStepProgressComponentKt$Green4Step1Preview$1(i));
        }
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: e */
    public static final void m109294e(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(-516493133);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-516493133, i, -1, "com.carrefour.fid.android.presentation.ui.orders.online.view.Green4Step2Preview (GreenStepProgressComponent.kt:143)");
            }
            ThemeKt.m153788a(ComposableSingletons$GreenStepProgressComponentKt.f62266a.mo73596h(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new GreenStepProgressComponentKt$Green4Step2Preview$1(i));
        }
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: f */
    public static final void m109295f(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(-1663033646);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1663033646, i, -1, "com.carrefour.fid.android.presentation.ui.orders.online.view.Green4Step3Preview (GreenStepProgressComponent.kt:151)");
            }
            ThemeKt.m153788a(ComposableSingletons$GreenStepProgressComponentKt.f62266a.mo73597i(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new GreenStepProgressComponentKt$Green4Step3Preview$1(i));
        }
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: g */
    public static final void m109296g(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(1485393137);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1485393137, i, -1, "com.carrefour.fid.android.presentation.ui.orders.online.view.Green4Step4Preview (GreenStepProgressComponent.kt:159)");
            }
            ThemeKt.m153788a(ComposableSingletons$GreenStepProgressComponentKt.f62266a.mo73598j(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new GreenStepProgressComponentKt$Green4Step4Preview$1(i));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: h */
    public static final void m109297h(@C12580l C8767m mVar, int i, int i2, @C12580l C8592o oVar, int i3, int i4) {
        int i5;
        C8767m mVar2;
        C8767m.C8768a aVar;
        int i6;
        int i7;
        int i8;
        int i9 = i;
        int i10 = i2;
        int i11 = i3;
        C8592o o = oVar.mo15009o(-514225213);
        int i12 = i4 & 1;
        if (i12 != 0) {
            i5 = i11 | 6;
            mVar2 = mVar;
        } else if ((i11 & 14) == 0) {
            mVar2 = mVar;
            if (o.mo15006n0(mVar2)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i5 = i8 | i11;
        } else {
            mVar2 = mVar;
            i5 = i11;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else if ((i11 & 112) == 0) {
            if (o.mo14976f(i9)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i5 |= i7;
        }
        if ((i4 & 4) != 0) {
            i5 |= C22132b.f56831b;
        } else if ((i11 & 896) == 0) {
            if (o.mo14976f(i10)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i5 |= i6;
        }
        if ((i5 & 731) != 146 || !o.mo15011p()) {
            if (i12 != 0) {
                aVar = C8767m.f23478j;
            } else {
                aVar = mVar2;
            }
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-514225213, i11, -1, "com.carrefour.fid.android.presentation.ui.orders.online.view.GreenStepProgress (GreenStepProgressComponent.kt:47)");
            }
            float f = ((float) i9) / ((float) i10);
            o.mo14918M(-492369756);
            Object N = o.mo14921N();
            C8592o.C8593a aVar2 = C8592o.f23032a;
            if (N == aVar2.mo16277a()) {
                N = C8539f2.m30981g(C16500q.m74651b(C16500q.f40900b.mo47897a()), (C8410b2) null, 2, (Object) null);
                o.mo14893C(N);
            }
            o.mo15002m0();
            C8700z0 z0Var = (C8700z0) N;
            C8700z0 z0Var2 = (C8700z0) RememberSaveableKt.m31343d(new Object[]{Integer.valueOf(i)}, (C8628e) null, (String) null, GreenStepProgressComponentKt$GreenStepProgress$hasAnimated$2.f62316f, o, 3080, 6);
            if (!m109302m(z0Var2)) {
                f = 0.0f;
            }
            C8700z0 z0Var3 = z0Var2;
            C8700z0 z0Var4 = z0Var;
            C8578k2<Float> e = AnimateAsStateKt.m7971e(f, C7948y0.f19132a.mo11114a(), 0.0f, (String) null, (C11300l<? super Float, C11079d2>) null, o, 0, 28);
            Boolean valueOf = Boolean.valueOf(m109302m(z0Var3));
            o.mo14918M(1157296644);
            C8700z0 z0Var5 = z0Var3;
            boolean n0 = o.mo15006n0(z0Var5);
            Object N2 = o.mo14921N();
            if (n0 || N2 == aVar2.mo16277a()) {
                N2 = new GreenStepProgressComponentKt$GreenStepProgress$1$1(z0Var5, (C11045c<? super GreenStepProgressComponentKt$GreenStepProgress$1$1>) null);
                o.mo14893C(N2);
            }
            o.mo15002m0();
            EffectsKt.m29896h(valueOf, (C11304p) N2, o, 64);
            o.mo14918M(1157296644);
            boolean n02 = o.mo15006n0(z0Var4);
            Object N3 = o.mo14921N();
            if (n02 || N3 == aVar2.mo16277a()) {
                N3 = new GreenStepProgressComponentKt$GreenStepProgress$2$1(z0Var4);
                o.mo14893C(N3);
            }
            o.mo15002m0();
            BoxWithConstraintsKt.m9860a(OnRemeasuredModifierKt.m69010a(aVar, (C11300l) N3), C8734c.f23406a.mo17069o(), false, C8553b.m31048b(o, 1876377241, true, new GreenStepProgressComponentKt$GreenStepProgress$3(e, i10)), o, 3120, 4);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
            aVar = mVar2;
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new GreenStepProgressComponentKt$GreenStepProgress$4(aVar, i, i2, i3, i4));
        }
    }

    /* renamed from: i */
    public static final void m109298i(C8700z0<Boolean> z0Var, boolean z) {
        z0Var.setValue(Boolean.valueOf(z));
    }

    /* renamed from: j */
    public static final float m109299j(C8578k2<Float> k2Var) {
        return k2Var.getValue().floatValue();
    }

    /* renamed from: k */
    public static final long m109300k(C8700z0<C16500q> z0Var) {
        return z0Var.getValue().mo47895q();
    }

    /* renamed from: l */
    public static final void m109301l(C8700z0<C16500q> z0Var, long j) {
        z0Var.setValue(C16500q.m74651b(j));
    }

    /* renamed from: m */
    public static final boolean m109302m(C8700z0<Boolean> z0Var) {
        return z0Var.getValue().booleanValue();
    }

    @C8540g
    @C16464c(heightDp = 400, widthDp = 350)
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: n */
    public static final void m109303n(@C12580l C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(912160458);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(912160458, i, -1, "com.carrefour.fid.android.presentation.ui.orders.online.view.ListOfProgressBarsPreview (GreenStepProgressComponent.kt:113)");
            }
            ThemeKt.m153788a(ComposableSingletons$GreenStepProgressComponentKt.f62266a.mo73594f(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new GreenStepProgressComponentKt$ListOfProgressBarsPreview$1(i));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v19, resolved type: kotlin.jvm.functions.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v23, resolved type: kotlin.jvm.functions.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m109304o(@org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r18, int r19) {
        /*
            r0 = r19
            r1 = 1183630574(0x468cc4ee, float:18018.465)
            r2 = r18
            androidx.compose.runtime.o r15 = r2.mo15009o(r1)
            if (r0 != 0) goto L_0x0019
            boolean r2 = r15.mo15011p()
            if (r2 != 0) goto L_0x0014
            goto L_0x0019
        L_0x0014:
            r15.mo14958a0()
            goto L_0x0192
        L_0x0019:
            boolean r2 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r2 == 0) goto L_0x0025
            r2 = -1
            java.lang.String r3 = "com.carrefour.fid.android.presentation.ui.orders.online.view.TestGreenStepProgress (GreenStepProgressComponent.kt:22)"
            androidx.compose.runtime.ComposerKt.m29845w0(r1, r0, r2, r3)
        L_0x0025:
            r1 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r15.mo14918M(r1)
            java.lang.Object r1 = r15.mo14921N()
            androidx.compose.runtime.o$a r16 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r2 = r16.mo16277a()
            if (r1 != r2) goto L_0x0044
            r1 = 2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r3 = 0
            androidx.compose.runtime.z0 r1 = androidx.compose.runtime.C8539f2.m30981g(r2, r3, r1, r3)
            r15.mo14893C(r1)
        L_0x0044:
            r15.mo15002m0()
            androidx.compose.runtime.z0 r1 = (androidx.compose.runtime.C8700z0) r1
            androidx.compose.ui.c$a r2 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c$b r2 = r2.mo17068m()
            r3 = -483455358(0xffffffffe32f0e82, float:-3.2292256E21)
            r15.mo14918M(r3)
            androidx.compose.ui.m$a r3 = androidx.compose.p004ui.C8767m.f23478j
            androidx.compose.foundation.layout.Arrangement r4 = androidx.compose.foundation.layout.Arrangement.f6010a
            androidx.compose.foundation.layout.Arrangement$l r4 = r4.mo7631r()
            r5 = 48
            androidx.compose.ui.layout.f0 r2 = androidx.compose.foundation.layout.ColumnKt.m9863b(r4, r2, r15, r5)
            r4 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r15.mo14918M(r4)
            androidx.compose.runtime.i1 r4 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r4 = r15.mo15032w(r4)
            androidx.compose.ui.unit.d r4 = (androidx.compose.p004ui.unit.C16479d) r4
            androidx.compose.runtime.i1 r5 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r5 = r15.mo15032w(r5)
            androidx.compose.ui.unit.LayoutDirection r5 = (androidx.compose.p004ui.unit.LayoutDirection) r5
            androidx.compose.runtime.i1 r6 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r6 = r15.mo15032w(r6)
            androidx.compose.ui.platform.c4 r6 = (androidx.compose.p004ui.platform.C15863c4) r6
            androidx.compose.ui.node.ComposeUiNode$Companion r7 = androidx.compose.p004ui.node.ComposeUiNode.f38797m
            kotlin.jvm.functions.a r8 = r7.mo44585a()
            kotlin.jvm.functions.q r9 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r3)
            androidx.compose.runtime.d r10 = r15.mo15017r()
            boolean r10 = r10 instanceof androidx.compose.runtime.C8428d
            if (r10 != 0) goto L_0x009c
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x009c:
            r15.mo14938T()
            boolean r10 = r15.mo14997l()
            if (r10 == 0) goto L_0x00a9
            r15.mo14947W(r8)
            goto L_0x00ac
        L_0x00a9:
            r15.mo14888A()
        L_0x00ac:
            r15.mo14941U()
            androidx.compose.runtime.o r8 = androidx.compose.runtime.Updater.m30180b(r15)
            kotlin.jvm.functions.p r10 = r7.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r8, r2, r10)
            kotlin.jvm.functions.p r2 = r7.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r8, r4, r2)
            kotlin.jvm.functions.p r2 = r7.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r8, r5, r2)
            kotlin.jvm.functions.p r2 = r7.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r8, r6, r2)
            r15.mo14972e()
            androidx.compose.runtime.o r2 = androidx.compose.runtime.C8684u1.m31906b(r15)
            androidx.compose.runtime.u1 r2 = androidx.compose.runtime.C8684u1.m31905a(r2)
            r4 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r9.invoke(r2, r15, r4)
            r2 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r15.mo14918M(r2)
            androidx.compose.foundation.layout.ColumnScopeInstance r2 = androidx.compose.foundation.layout.ColumnScopeInstance.f6049a
            r2 = 16
            float r2 = (float) r2
            float r2 = androidx.compose.p004ui.unit.C16483g.m74435M(r2)
            androidx.compose.ui.m r2 = androidx.compose.foundation.layout.PaddingKt.m10024k(r3, r2)
            int r3 = m109305p(r1)
            r6 = 390(0x186, float:5.47E-43)
            r7 = 0
            r4 = 3
            r5 = r15
            m109297h(r2, r3, r4, r5, r6, r7)
            r2 = 3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r4 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r15.mo14918M(r4)
            boolean r4 = r15.mo15006n0(r1)
            boolean r3 = r15.mo15006n0(r3)
            r3 = r3 | r4
            java.lang.Object r4 = r15.mo14921N()
            if (r3 != 0) goto L_0x0121
            java.lang.Object r3 = r16.mo16277a()
            if (r4 != r3) goto L_0x0129
        L_0x0121:
            com.carrefour.fid.android.presentation.ui.orders.online.view.GreenStepProgressComponentKt$TestGreenStepProgress$1$1$1 r4 = new com.carrefour.fid.android.presentation.ui.orders.online.view.GreenStepProgressComponentKt$TestGreenStepProgress$1$1$1
            r4.<init>(r2, r1)
            r15.mo14893C(r4)
        L_0x0129:
            r15.mo15002m0()
            r2 = r4
            kotlin.jvm.functions.a r2 = (kotlin.jvm.functions.C11289a) r2
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            com.carrefour.fid.android.presentation.ui.orders.online.view.ComposableSingletons$GreenStepProgressComponentKt r17 = com.carrefour.fid.android.presentation.p035ui.orders.online.view.ComposableSingletons$GreenStepProgressComponentKt.f62266a
            kotlin.jvm.functions.q r11 = r17.mo73589a()
            r13 = 805306368(0x30000000, float:4.656613E-10)
            r14 = 510(0x1fe, float:7.15E-43)
            r12 = r15
            androidx.compose.material.ButtonKt.m13345c(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r2 = 1157296644(0x44faf204, float:2007.563)
            r15.mo14918M(r2)
            boolean r2 = r15.mo15006n0(r1)
            java.lang.Object r3 = r15.mo14921N()
            if (r2 != 0) goto L_0x015b
            java.lang.Object r2 = r16.mo16277a()
            if (r3 != r2) goto L_0x0163
        L_0x015b:
            com.carrefour.fid.android.presentation.ui.orders.online.view.GreenStepProgressComponentKt$TestGreenStepProgress$1$2$1 r3 = new com.carrefour.fid.android.presentation.ui.orders.online.view.GreenStepProgressComponentKt$TestGreenStepProgress$1$2$1
            r3.<init>(r1)
            r15.mo14893C(r3)
        L_0x0163:
            r15.mo15002m0()
            r2 = r3
            kotlin.jvm.functions.a r2 = (kotlin.jvm.functions.C11289a) r2
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            kotlin.jvm.functions.q r11 = r17.mo73592d()
            r13 = 805306368(0x30000000, float:4.656613E-10)
            r14 = 510(0x1fe, float:7.15E-43)
            r12 = r15
            androidx.compose.material.ButtonKt.m13345c(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r15.mo15002m0()
            r15.mo14896D()
            r15.mo15002m0()
            r15.mo15002m0()
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x0192
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0192:
            androidx.compose.runtime.t1 r1 = r15.mo15020s()
            if (r1 != 0) goto L_0x0199
            goto L_0x01a1
        L_0x0199:
            com.carrefour.fid.android.presentation.ui.orders.online.view.GreenStepProgressComponentKt$TestGreenStepProgress$2 r2 = new com.carrefour.fid.android.presentation.ui.orders.online.view.GreenStepProgressComponentKt$TestGreenStepProgress$2
            r2.<init>(r0)
            r1.mo15202a(r2)
        L_0x01a1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.orders.online.view.GreenStepProgressComponentKt.m109304o(androidx.compose.runtime.o, int):void");
    }

    /* renamed from: p */
    public static final int m109305p(C8700z0<Integer> z0Var) {
        return z0Var.getValue().intValue();
    }

    /* renamed from: q */
    public static final void m109306q(C8700z0<Integer> z0Var, int i) {
        z0Var.setValue(Integer.valueOf(i));
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: r */
    public static final void m109307r(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(800079485);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(800079485, i, -1, "com.carrefour.fid.android.presentation.ui.orders.online.view.TestLinearProgressIndicatorPreview (GreenStepProgressComponent.kt:105)");
            }
            ThemeKt.m153788a(ComposableSingletons$GreenStepProgressComponentKt.f62266a.mo73593e(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new C25251xab631c44(i));
        }
    }
}
