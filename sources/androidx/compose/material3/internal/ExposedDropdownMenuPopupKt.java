package androidx.compose.material3.internal;

import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.layout.LayoutKt;
import androidx.compose.p004ui.node.ComposeUiNode;
import androidx.compose.p004ui.platform.C15863c4;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8410b2;
import androidx.compose.runtime.C8428d;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8544h;
import androidx.compose.runtime.C8550i1;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8684u1;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.Updater;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nExposedDropdownMenuPopup.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExposedDropdownMenuPopup.kt\nandroidx/compose/material3/internal/ExposedDropdownMenuPopupKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,476:1\n76#2:477\n76#2:478\n76#2:479\n76#2:480\n76#2:489\n76#2:517\n25#3:481\n456#3,14:501\n456#3,14:529\n1114#4,6:482\n74#5:488\n75#5,11:490\n88#5:515\n74#5:516\n75#5,11:518\n88#5:543\n76#6:544\n*S KotlinDebug\n*F\n+ 1 ExposedDropdownMenuPopup.kt\nandroidx/compose/material3/internal/ExposedDropdownMenuPopupKt\n*L\n86#1:477\n87#1:478\n88#1:479\n89#1:480\n151#1:489\n180#1:517\n93#1:481\n151#1:501,14\n180#1:529,14\n93#1:482,6\n151#1:488\n151#1:490,11\n151#1:515\n180#1:516\n180#1:518,11\n180#1:543\n91#1:544\n*E\n"})
public final class ExposedDropdownMenuPopupKt {
    @C12579k

    /* renamed from: a */
    public static final C8550i1<String> f20194a = CompositionLocalKt.m29858d((C8410b2) null, ExposedDropdownMenuPopupKt$LocalPopupTestTag$1.f20201f, 1, (Object) null);

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: androidx.compose.material3.internal.PopupLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v24, resolved type: androidx.compose.material3.internal.PopupLayout} */
    /* JADX WARNING: type inference failed for: r11v3 */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m27169a(@org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11289a<kotlin.C11079d2> r21, @org.jetbrains.annotations.C12579k androidx.compose.p004ui.window.C16546g r22, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r23, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r24, int r25, int r26) {
        /*
            r7 = r22
            r8 = r23
            r9 = r25
            java.lang.String r0 = "popupPositionProvider"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r0 = 187306684(0xb2a12bc, float:3.2754903E-32)
            r1 = r24
            androidx.compose.runtime.o r6 = r1.mo15009o(r0)
            r1 = r26 & 1
            if (r1 == 0) goto L_0x0023
            r2 = r9 | 6
            r3 = r2
            r2 = r21
            goto L_0x0037
        L_0x0023:
            r2 = r9 & 14
            if (r2 != 0) goto L_0x0034
            r2 = r21
            boolean r3 = r6.mo14927P(r2)
            if (r3 == 0) goto L_0x0031
            r3 = 4
            goto L_0x0032
        L_0x0031:
            r3 = 2
        L_0x0032:
            r3 = r3 | r9
            goto L_0x0037
        L_0x0034:
            r2 = r21
            r3 = r9
        L_0x0037:
            r4 = r26 & 2
            if (r4 == 0) goto L_0x003e
            r3 = r3 | 48
            goto L_0x004e
        L_0x003e:
            r4 = r9 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x004e
            boolean r4 = r6.mo15006n0(r7)
            if (r4 == 0) goto L_0x004b
            r4 = 32
            goto L_0x004d
        L_0x004b:
            r4 = 16
        L_0x004d:
            r3 = r3 | r4
        L_0x004e:
            r4 = r26 & 4
            if (r4 == 0) goto L_0x0055
            r3 = r3 | 384(0x180, float:5.38E-43)
            goto L_0x0065
        L_0x0055:
            r4 = r9 & 896(0x380, float:1.256E-42)
            if (r4 != 0) goto L_0x0065
            boolean r4 = r6.mo14927P(r8)
            if (r4 == 0) goto L_0x0062
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x0064
        L_0x0062:
            r4 = 128(0x80, float:1.794E-43)
        L_0x0064:
            r3 = r3 | r4
        L_0x0065:
            r5 = r3
            r3 = r5 & 731(0x2db, float:1.024E-42)
            r4 = 146(0x92, float:2.05E-43)
            if (r3 != r4) goto L_0x007a
            boolean r3 = r6.mo15011p()
            if (r3 != 0) goto L_0x0073
            goto L_0x007a
        L_0x0073:
            r6.mo14958a0()
            r1 = r2
            r12 = r6
            goto L_0x01eb
        L_0x007a:
            if (r1 == 0) goto L_0x007f
            r1 = 0
            r4 = r1
            goto L_0x0080
        L_0x007f:
            r4 = r2
        L_0x0080:
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x008c
            r1 = -1
            java.lang.String r2 = "androidx.compose.material3.internal.ExposedDropdownMenuPopup (ExposedDropdownMenuPopup.kt:80)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r5, r1, r2)
        L_0x008c:
            androidx.compose.runtime.i1 r0 = androidx.compose.p004ui.platform.AndroidCompositionLocals_androidKt.m70956k()
            java.lang.Object r0 = r6.mo15032w(r0)
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            androidx.compose.runtime.i1 r0 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r0 = r6.mo15032w(r0)
            r17 = r0
            androidx.compose.ui.unit.d r17 = (androidx.compose.p004ui.unit.C16479d) r17
            androidx.compose.runtime.i1<java.lang.String> r0 = f20194a
            java.lang.Object r0 = r6.mo15032w(r0)
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            androidx.compose.runtime.i1 r0 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r0 = r6.mo15032w(r0)
            r1 = r0
            androidx.compose.ui.unit.LayoutDirection r1 = (androidx.compose.p004ui.unit.LayoutDirection) r1
            r0 = 0
            androidx.compose.runtime.q r15 = androidx.compose.runtime.ComposablesKt.m29526u(r6, r0)
            int r10 = r5 >> 6
            r10 = r10 & 14
            androidx.compose.runtime.k2 r14 = androidx.compose.runtime.C8415c2.m30251t(r8, r6, r10)
            java.lang.Object[] r10 = new java.lang.Object[r0]
            r11 = 0
            r12 = 0
            androidx.compose.material3.internal.ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$popupId$1 r13 = androidx.compose.material3.internal.ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$popupId$1.f20199f
            r16 = 3080(0xc08, float:4.316E-42)
            r18 = 6
            r19 = r14
            r14 = r6
            r20 = r15
            r15 = r16
            r16 = r18
            java.lang.Object r10 = androidx.compose.runtime.saveable.RememberSaveableKt.m31343d(r10, r11, r12, r13, r14, r15, r16)
            java.util.UUID r10 = (java.util.UUID) r10
            r11 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r6.mo14918M(r11)
            java.lang.Object r11 = r6.mo14921N()
            androidx.compose.runtime.o$a r12 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r12 = r12.mo16277a()
            if (r11 != r12) goto L_0x011f
            androidx.compose.material3.internal.PopupLayout r11 = new androidx.compose.material3.internal.PopupLayout
            java.lang.String r12 = "popupId"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r12)
            r12 = r0
            r0 = r11
            r13 = r1
            r1 = r4
            r14 = r2
            r15 = r4
            r4 = r17
            r16 = r5
            r5 = r22
            r12 = r6
            r6 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            androidx.compose.material3.internal.ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$popupLayout$1$1$1 r0 = new androidx.compose.material3.internal.ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$popupLayout$1$1$1
            r1 = r19
            r0.<init>(r11, r1)
            r1 = 686046343(0x28e43c87, float:2.5339335E-14)
            r2 = 1
            androidx.compose.runtime.internal.a r0 = androidx.compose.runtime.internal.C8553b.m31049c(r1, r2, r0)
            r1 = r20
            r11.setContent(r1, r0)
            r12.mo14893C(r11)
            goto L_0x0125
        L_0x011f:
            r13 = r1
            r14 = r2
            r15 = r4
            r16 = r5
            r12 = r6
        L_0x0125:
            r12.mo15002m0()
            androidx.compose.material3.internal.PopupLayout r11 = (androidx.compose.material3.internal.PopupLayout) r11
            androidx.compose.material3.internal.ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$1 r0 = new androidx.compose.material3.internal.ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$1
            r0.<init>(r11, r15, r14, r13)
            r1 = 8
            androidx.compose.runtime.EffectsKt.m29891c(r11, r0, r12, r1)
            androidx.compose.material3.internal.ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$2 r0 = new androidx.compose.material3.internal.ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$2
            r0.<init>(r11, r15, r14, r13)
            r1 = 0
            androidx.compose.runtime.EffectsKt.m29899k(r0, r12, r1)
            androidx.compose.material3.internal.ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$3 r0 = new androidx.compose.material3.internal.ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$3
            r0.<init>(r11, r7)
            int r1 = r16 >> 3
            r1 = r1 & 14
            androidx.compose.runtime.EffectsKt.m29891c(r7, r0, r12, r1)
            androidx.compose.ui.m$a r0 = androidx.compose.p004ui.C8767m.f23478j
            androidx.compose.material3.internal.ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$5 r1 = new androidx.compose.material3.internal.ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$5
            r1.<init>(r11)
            androidx.compose.ui.m r0 = androidx.compose.p004ui.layout.OnGloballyPositionedModifierKt.m68999a(r0, r1)
            androidx.compose.material3.internal.ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$6 r1 = new androidx.compose.material3.internal.ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$6
            r1.<init>(r11, r13)
            r2 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r12.mo14918M(r2)
            androidx.compose.runtime.i1 r2 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r2 = r12.mo15032w(r2)
            androidx.compose.ui.unit.d r2 = (androidx.compose.p004ui.unit.C16479d) r2
            androidx.compose.runtime.i1 r3 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r3 = r12.mo15032w(r3)
            androidx.compose.ui.unit.LayoutDirection r3 = (androidx.compose.p004ui.unit.LayoutDirection) r3
            androidx.compose.runtime.i1 r4 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r4 = r12.mo15032w(r4)
            androidx.compose.ui.platform.c4 r4 = (androidx.compose.p004ui.platform.C15863c4) r4
            androidx.compose.ui.node.ComposeUiNode$Companion r5 = androidx.compose.p004ui.node.ComposeUiNode.f38797m
            kotlin.jvm.functions.a r6 = r5.mo44585a()
            kotlin.jvm.functions.q r0 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r0)
            androidx.compose.runtime.d r10 = r12.mo15017r()
            boolean r10 = r10 instanceof androidx.compose.runtime.C8428d
            if (r10 != 0) goto L_0x0192
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x0192:
            r12.mo14938T()
            boolean r10 = r12.mo14997l()
            if (r10 == 0) goto L_0x019f
            r12.mo14947W(r6)
            goto L_0x01a2
        L_0x019f:
            r12.mo14888A()
        L_0x01a2:
            androidx.compose.runtime.o r6 = androidx.compose.runtime.Updater.m30180b(r12)
            kotlin.jvm.functions.p r10 = r5.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r6, r1, r10)
            kotlin.jvm.functions.p r1 = r5.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r6, r2, r1)
            kotlin.jvm.functions.p r1 = r5.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r6, r3, r1)
            kotlin.jvm.functions.p r1 = r5.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r6, r4, r1)
            androidx.compose.runtime.o r1 = androidx.compose.runtime.C8684u1.m31906b(r12)
            androidx.compose.runtime.u1 r1 = androidx.compose.runtime.C8684u1.m31905a(r1)
            r2 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.invoke(r1, r12, r2)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r12.mo14918M(r0)
            r12.mo15002m0()
            r12.mo14896D()
            r12.mo15002m0()
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x01ea
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x01ea:
            r1 = r15
        L_0x01eb:
            androidx.compose.runtime.t1 r6 = r12.mo15020s()
            if (r6 != 0) goto L_0x01f2
            goto L_0x0203
        L_0x01f2:
            androidx.compose.material3.internal.ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$7 r10 = new androidx.compose.material3.internal.ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$7
            r0 = r10
            r2 = r22
            r3 = r23
            r4 = r25
            r5 = r26
            r0.<init>(r1, r2, r3, r4, r5)
            r6.mo15202a(r10)
        L_0x0203:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.ExposedDropdownMenuPopupKt.m27169a(kotlin.jvm.functions.a, androidx.compose.ui.window.g, kotlin.jvm.functions.p, androidx.compose.runtime.o, int, int):void");
    }

    /* renamed from: b */
    public static final C11304p<C8592o, Integer, C11079d2> m27170b(C8578k2<? extends C11304p<? super C8592o, ? super Integer, C11079d2>> k2Var) {
        return (C11304p) k2Var.getValue();
    }

    @C8540g
    @C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: c */
    public static final void m27171c(C8767m mVar, C11304p<? super C8592o, ? super Integer, C11079d2> pVar, C8592o oVar, int i) {
        oVar.mo14918M(-483170785);
        ExposedDropdownMenuPopupKt$SimpleStack$1 exposedDropdownMenuPopupKt$SimpleStack$1 = ExposedDropdownMenuPopupKt$SimpleStack$1.f20202a;
        oVar.mo14918M(-1323940314);
        C16479d dVar = (C16479d) oVar.mo15032w(CompositionLocalsKt.m71011i());
        LayoutDirection layoutDirection = (LayoutDirection) oVar.mo15032w(CompositionLocalsKt.m71018p());
        C15863c4 c4Var = (C15863c4) oVar.mo15032w(CompositionLocalsKt.m71025w());
        ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
        C11289a<ComposeUiNode> a = companion.mo44585a();
        C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f = LayoutKt.m68908f(mVar);
        int i2 = (((((i << 3) & 112) | ((i >> 3) & 14)) << 9) & 7168) | 6;
        if (!(oVar.mo15017r() instanceof C8428d)) {
            ComposablesKt.m29519n();
        }
        oVar.mo14938T();
        if (oVar.mo14997l()) {
            oVar.mo14947W(a);
        } else {
            oVar.mo14888A();
        }
        C8592o b = Updater.m30180b(oVar);
        Updater.m30188j(b, exposedDropdownMenuPopupKt$SimpleStack$1, companion.mo44588d());
        Updater.m30188j(b, dVar, companion.mo44586b());
        Updater.m30188j(b, layoutDirection, companion.mo44587c());
        Updater.m30188j(b, c4Var, companion.mo44590f());
        f.invoke(C8684u1.m31905a(C8684u1.m31906b(oVar)), oVar, Integer.valueOf((i2 >> 3) & 112));
        oVar.mo14918M(2058660585);
        pVar.invoke(oVar, Integer.valueOf((i2 >> 9) & 14));
        oVar.mo15002m0();
        oVar.mo14896D();
        oVar.mo15002m0();
        oVar.mo15002m0();
    }

    @C12579k
    /* renamed from: e */
    public static final C8550i1<String> m27173e() {
        return f20194a;
    }
}
