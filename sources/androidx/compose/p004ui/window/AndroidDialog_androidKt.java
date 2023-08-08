package androidx.compose.p004ui.window;

import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.layout.LayoutKt;
import androidx.compose.p004ui.node.ComposeUiNode;
import androidx.compose.p004ui.platform.C15863c4;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8428d;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8544h;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.C8684u1;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Updater;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;

@C11363r0({"SMAP\nAndroidDialog.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidDialog.android.kt\nandroidx/compose/ui/window/AndroidDialog_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,456:1\n76#2:457\n76#2:458\n76#2:459\n76#2:469\n50#3:460\n49#3:461\n456#3,14:481\n1114#4,6:462\n74#5:468\n75#5,11:470\n88#5:495\n76#6:496\n*S KotlinDebug\n*F\n+ 1 AndroidDialog.android.kt\nandroidx/compose/ui/window/AndroidDialog_androidKt\n*L\n156#1:457\n157#1:458\n158#1:459\n444#1:469\n162#1:460\n162#1:461\n444#1:481,14\n162#1:462,6\n444#1:468\n444#1:470,11\n444#1:495\n160#1:496\n*E\n"})
/* renamed from: androidx.compose.ui.window.AndroidDialog_androidKt */
public final class AndroidDialog_androidKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v5, resolved type: androidx.compose.ui.window.DialogWrapper} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v17, resolved type: androidx.compose.ui.window.DialogWrapper} */
    /* JADX WARNING: type inference failed for: r12v3 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m74858a(@org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<kotlin.C11079d2> r19, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.window.C16541b r20, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r21, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r22, int r23, int r24) {
        /*
            r7 = r19
            r8 = r21
            r9 = r23
            java.lang.String r0 = "onDismissRequest"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r0 = -2032877254(0xffffffff86d4c13a, float:-8.002946E-35)
            r1 = r22
            androidx.compose.runtime.o r6 = r1.mo15009o(r0)
            r1 = r24 & 1
            if (r1 == 0) goto L_0x0020
            r1 = r9 | 6
            goto L_0x0030
        L_0x0020:
            r1 = r9 & 14
            if (r1 != 0) goto L_0x002f
            boolean r1 = r6.mo14927P(r7)
            if (r1 == 0) goto L_0x002c
            r1 = 4
            goto L_0x002d
        L_0x002c:
            r1 = 2
        L_0x002d:
            r1 = r1 | r9
            goto L_0x0030
        L_0x002f:
            r1 = r9
        L_0x0030:
            r2 = r24 & 2
            if (r2 == 0) goto L_0x0037
            r1 = r1 | 48
            goto L_0x004a
        L_0x0037:
            r3 = r9 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x004a
            r3 = r20
            boolean r4 = r6.mo15006n0(r3)
            if (r4 == 0) goto L_0x0046
            r4 = 32
            goto L_0x0048
        L_0x0046:
            r4 = 16
        L_0x0048:
            r1 = r1 | r4
            goto L_0x004c
        L_0x004a:
            r3 = r20
        L_0x004c:
            r4 = r24 & 4
            if (r4 == 0) goto L_0x0053
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0063
        L_0x0053:
            r4 = r9 & 896(0x380, float:1.256E-42)
            if (r4 != 0) goto L_0x0063
            boolean r4 = r6.mo14927P(r8)
            if (r4 == 0) goto L_0x0060
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x0062
        L_0x0060:
            r4 = 128(0x80, float:1.794E-43)
        L_0x0062:
            r1 = r1 | r4
        L_0x0063:
            r4 = r1 & 731(0x2db, float:1.024E-42)
            r5 = 146(0x92, float:2.05E-43)
            if (r4 != r5) goto L_0x0077
            boolean r4 = r6.mo15011p()
            if (r4 != 0) goto L_0x0070
            goto L_0x0077
        L_0x0070:
            r6.mo14958a0()
            r2 = r3
            r15 = r6
            goto L_0x0148
        L_0x0077:
            if (r2 == 0) goto L_0x0086
            androidx.compose.ui.window.b r2 = new androidx.compose.ui.window.b
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 7
            r15 = 0
            r10 = r2
            r10.<init>((boolean) r11, (boolean) r12, (androidx.compose.p004ui.window.SecureFlagPolicy) r13, (int) r14, (kotlin.jvm.internal.DefaultConstructorMarker) r15)
            r5 = r2
            goto L_0x0087
        L_0x0086:
            r5 = r3
        L_0x0087:
            boolean r2 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r2 == 0) goto L_0x0093
            r2 = -1
            java.lang.String r3 = "androidx.compose.ui.window.Dialog (AndroidDialog.android.kt:150)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r1, r2, r3)
        L_0x0093:
            androidx.compose.runtime.i1 r0 = androidx.compose.p004ui.platform.AndroidCompositionLocals_androidKt.m70956k()
            java.lang.Object r0 = r6.mo15032w(r0)
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            androidx.compose.runtime.i1 r0 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r0 = r6.mo15032w(r0)
            r4 = r0
            androidx.compose.ui.unit.d r4 = (androidx.compose.p004ui.unit.C16479d) r4
            androidx.compose.runtime.i1 r0 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r0 = r6.mo15032w(r0)
            r2 = r0
            androidx.compose.ui.unit.LayoutDirection r2 = (androidx.compose.p004ui.unit.LayoutDirection) r2
            r0 = 0
            androidx.compose.runtime.q r15 = androidx.compose.runtime.ComposablesKt.m29526u(r6, r0)
            int r1 = r1 >> 6
            r1 = r1 & 14
            androidx.compose.runtime.k2 r1 = androidx.compose.runtime.C8415c2.m30251t(r8, r6, r1)
            java.lang.Object[] r10 = new java.lang.Object[r0]
            r11 = 0
            r12 = 0
            androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$dialogId$1 r13 = androidx.compose.p004ui.window.AndroidDialog_androidKt$Dialog$dialogId$1.f40975f
            r16 = 3080(0xc08, float:4.316E-42)
            r17 = 6
            r14 = r6
            r18 = r15
            r15 = r16
            r16 = r17
            java.lang.Object r10 = androidx.compose.runtime.saveable.RememberSaveableKt.m31343d(r10, r11, r12, r13, r14, r15, r16)
            java.util.UUID r10 = (java.util.UUID) r10
            r11 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r6.mo14918M(r11)
            boolean r11 = r6.mo15006n0(r3)
            boolean r12 = r6.mo15006n0(r4)
            r11 = r11 | r12
            java.lang.Object r12 = r6.mo14921N()
            if (r11 != 0) goto L_0x00fa
            androidx.compose.runtime.o$a r11 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r11 = r11.mo16277a()
            if (r12 != r11) goto L_0x00f6
            goto L_0x00fa
        L_0x00f6:
            r14 = r2
            r11 = r5
            r15 = r6
            goto L_0x0126
        L_0x00fa:
            androidx.compose.ui.window.DialogWrapper r12 = new androidx.compose.ui.window.DialogWrapper
            java.lang.String r11 = "dialogId"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r11)
            r11 = r0
            r0 = r12
            r13 = r1
            r1 = r19
            r14 = r2
            r2 = r5
            r15 = r4
            r4 = r14
            r11 = r5
            r5 = r15
            r15 = r6
            r6 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$dialog$1$1$1 r0 = new androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$dialog$1$1$1
            r0.<init>(r13)
            r1 = 488261145(0x1d1a4619, float:2.041797E-21)
            r2 = 1
            androidx.compose.runtime.internal.a r0 = androidx.compose.runtime.internal.C8553b.m31049c(r1, r2, r0)
            r1 = r18
            r12.mo48039l(r1, r0)
            r15.mo14893C(r12)
        L_0x0126:
            r15.mo15002m0()
            androidx.compose.ui.window.DialogWrapper r12 = (androidx.compose.p004ui.window.DialogWrapper) r12
            androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$1 r0 = new androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$1
            r0.<init>(r12)
            r1 = 8
            androidx.compose.runtime.EffectsKt.m29891c(r12, r0, r15, r1)
            androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$2 r0 = new androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$2
            r0.<init>(r12, r7, r11, r14)
            r1 = 0
            androidx.compose.runtime.EffectsKt.m29899k(r0, r15, r1)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0147
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0147:
            r2 = r11
        L_0x0148:
            androidx.compose.runtime.t1 r6 = r15.mo15020s()
            if (r6 != 0) goto L_0x014f
            goto L_0x0160
        L_0x014f:
            androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$3 r10 = new androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$3
            r0 = r10
            r1 = r19
            r3 = r21
            r4 = r23
            r5 = r24
            r0.<init>(r1, r2, r3, r4, r5)
            r6.mo15202a(r10)
        L_0x0160:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.window.AndroidDialog_androidKt.m74858a(kotlin.jvm.functions.a, androidx.compose.ui.window.b, kotlin.jvm.functions.p, androidx.compose.runtime.o, int, int):void");
    }

    /* renamed from: b */
    public static final C11304p<C8592o, Integer, C11079d2> m74859b(C8578k2<? extends C11304p<? super C8592o, ? super Integer, C11079d2>> k2Var) {
        return (C11304p) k2Var.getValue();
    }

    @C8540g
    @C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: c */
    public static final void m74860c(C8767m mVar, C11304p<? super C8592o, ? super Integer, C11079d2> pVar, C8592o oVar, int i, int i2) {
        int i3;
        int i4;
        int i5;
        C8592o o = oVar.mo15009o(-1177876616);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (o.mo15006n0(mVar)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i3 = i5 | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            if (o.mo14927P(pVar)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i3 |= i4;
        }
        if ((i3 & 91) != 18 || !o.mo15011p()) {
            if (i6 != 0) {
                mVar = C8767m.f23478j;
            }
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1177876616, i3, -1, "androidx.compose.ui.window.DialogLayout (AndroidDialog.android.kt:439)");
            }
            AndroidDialog_androidKt$DialogLayout$1 androidDialog_androidKt$DialogLayout$1 = AndroidDialog_androidKt$DialogLayout$1.f40976a;
            int i7 = ((i3 >> 3) & 14) | ((i3 << 3) & 112);
            o.mo14918M(-1323940314);
            C16479d dVar = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            C11289a<ComposeUiNode> a = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f = LayoutKt.m68908f(mVar);
            int i8 = ((i7 << 9) & 7168) | 6;
            if (!(o.mo15017r() instanceof C8428d)) {
                ComposablesKt.m29519n();
            }
            o.mo14938T();
            if (o.mo14997l()) {
                o.mo14947W(a);
            } else {
                o.mo14888A();
            }
            C8592o b = Updater.m30180b(o);
            Updater.m30188j(b, androidDialog_androidKt$DialogLayout$1, companion.mo44588d());
            Updater.m30188j(b, dVar, companion.mo44586b());
            Updater.m30188j(b, layoutDirection, companion.mo44587c());
            Updater.m30188j(b, c4Var, companion.mo44590f());
            f.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, Integer.valueOf((i8 >> 3) & 112));
            o.mo14918M(2058660585);
            pVar.invoke(o, Integer.valueOf((i8 >> 9) & 14));
            o.mo15002m0();
            o.mo14896D();
            o.mo15002m0();
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new AndroidDialog_androidKt$DialogLayout$2(mVar, pVar, i, i2));
        }
    }
}
