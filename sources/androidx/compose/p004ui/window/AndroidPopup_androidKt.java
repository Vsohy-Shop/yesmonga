package androidx.compose.p004ui.window;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.layout.LayoutKt;
import androidx.compose.p004ui.node.ComposeUiNode;
import androidx.compose.p004ui.platform.C15863c4;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16497o;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8410b2;
import androidx.compose.runtime.C8428d;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8544h;
import androidx.compose.runtime.C8550i1;
import androidx.compose.runtime.C8572j1;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.C8684u1;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.Updater;
import com.google.android.gms.analytics.ecommerce.C40383c;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nAndroidPopup.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPopup.android.kt\nandroidx/compose/ui/window/AndroidPopup_androidKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,824:1\n50#2:825\n49#2:826\n25#2:837\n456#2,14:857\n456#2,14:885\n1114#3,6:827\n1114#3,6:838\n76#4:833\n76#4:834\n76#4:835\n76#4:836\n76#4:845\n76#4:873\n74#5:844\n75#5,11:846\n88#5:871\n74#5:872\n75#5,11:874\n88#5:899\n76#6:900\n*S KotlinDebug\n*F\n+ 1 AndroidPopup.android.kt\nandroidx/compose/ui/window/AndroidPopup_androidKt\n*L\n194#1:825\n194#1:826\n235#1:837\n309#1:857,14\n341#1:885,14\n194#1:827,6\n235#1:838,6\n228#1:833\n229#1:834\n230#1:835\n231#1:836\n309#1:845\n341#1:873\n309#1:844\n309#1:846,11\n309#1:871\n341#1:872\n341#1:874,11\n341#1:899\n233#1:900\n*E\n"})
/* renamed from: androidx.compose.ui.window.AndroidPopup_androidKt */
public final class AndroidPopup_androidKt {
    @C12579k

    /* renamed from: a */
    public static final C8550i1<String> f40977a = CompositionLocalKt.m29858d((C8410b2) null, AndroidPopup_androidKt$LocalPopupTestTag$1.f40978f, 1, (Object) null);

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0255  */
    /* JADX WARNING: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m74868a(@org.jetbrains.annotations.C12579k androidx.compose.p004ui.window.C16546g r35, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11289a<kotlin.C11079d2> r36, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.window.C16547h r37, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r38, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r39, int r40, int r41) {
        /*
            r11 = r35
            r12 = r38
            r13 = r40
            java.lang.String r0 = "popupPositionProvider"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            r0 = -830247068(0xffffffffce836f64, float:-1.1025577E9)
            r1 = r39
            androidx.compose.runtime.o r14 = r1.mo15009o(r0)
            r1 = r41 & 1
            if (r1 == 0) goto L_0x0020
            r1 = r13 | 6
            goto L_0x0030
        L_0x0020:
            r1 = r13 & 14
            if (r1 != 0) goto L_0x002f
            boolean r1 = r14.mo15006n0(r11)
            if (r1 == 0) goto L_0x002c
            r1 = 4
            goto L_0x002d
        L_0x002c:
            r1 = 2
        L_0x002d:
            r1 = r1 | r13
            goto L_0x0030
        L_0x002f:
            r1 = r13
        L_0x0030:
            r2 = r41 & 2
            if (r2 == 0) goto L_0x0037
            r1 = r1 | 48
            goto L_0x004a
        L_0x0037:
            r3 = r13 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x004a
            r3 = r36
            boolean r4 = r14.mo14927P(r3)
            if (r4 == 0) goto L_0x0046
            r4 = 32
            goto L_0x0048
        L_0x0046:
            r4 = 16
        L_0x0048:
            r1 = r1 | r4
            goto L_0x004c
        L_0x004a:
            r3 = r36
        L_0x004c:
            r4 = r41 & 4
            if (r4 == 0) goto L_0x0053
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0066
        L_0x0053:
            r5 = r13 & 896(0x380, float:1.256E-42)
            if (r5 != 0) goto L_0x0066
            r5 = r37
            boolean r6 = r14.mo15006n0(r5)
            if (r6 == 0) goto L_0x0062
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x0064
        L_0x0062:
            r6 = 128(0x80, float:1.794E-43)
        L_0x0064:
            r1 = r1 | r6
            goto L_0x0068
        L_0x0066:
            r5 = r37
        L_0x0068:
            r6 = r41 & 8
            if (r6 == 0) goto L_0x006f
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x007f
        L_0x006f:
            r6 = r13 & 7168(0x1c00, float:1.0045E-41)
            if (r6 != 0) goto L_0x007f
            boolean r6 = r14.mo14927P(r12)
            if (r6 == 0) goto L_0x007c
            r6 = 2048(0x800, float:2.87E-42)
            goto L_0x007e
        L_0x007c:
            r6 = 1024(0x400, float:1.435E-42)
        L_0x007e:
            r1 = r1 | r6
        L_0x007f:
            r15 = r1
            r1 = r15 & 5851(0x16db, float:8.199E-42)
            r6 = 1170(0x492, float:1.64E-42)
            if (r1 != r6) goto L_0x0094
            boolean r1 = r14.mo15011p()
            if (r1 != 0) goto L_0x008d
            goto L_0x0094
        L_0x008d:
            r14.mo14958a0()
            r2 = r3
            r3 = r5
            goto L_0x024e
        L_0x0094:
            r10 = 0
            if (r2 == 0) goto L_0x009a
            r22 = r10
            goto L_0x009c
        L_0x009a:
            r22 = r3
        L_0x009c:
            if (r4 == 0) goto L_0x00b6
            androidx.compose.ui.window.h r1 = new androidx.compose.ui.window.h
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 63
            r31 = 0
            r23 = r1
            r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31)
            goto L_0x00b8
        L_0x00b6:
            r23 = r5
        L_0x00b8:
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x00c4
            r1 = -1
            java.lang.String r2 = "androidx.compose.ui.window.Popup (AndroidPopup.android.kt:221)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r15, r1, r2)
        L_0x00c4:
            androidx.compose.runtime.i1 r0 = androidx.compose.p004ui.platform.AndroidCompositionLocals_androidKt.m70956k()
            java.lang.Object r0 = r14.mo15032w(r0)
            r8 = r0
            android.view.View r8 = (android.view.View) r8
            androidx.compose.runtime.i1 r0 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r0 = r14.mo15032w(r0)
            r9 = r0
            androidx.compose.ui.unit.d r9 = (androidx.compose.p004ui.unit.C16479d) r9
            androidx.compose.runtime.i1<java.lang.String> r0 = f40977a
            java.lang.Object r0 = r14.mo15032w(r0)
            r24 = r0
            java.lang.String r24 = (java.lang.String) r24
            androidx.compose.runtime.i1 r0 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r0 = r14.mo15032w(r0)
            androidx.compose.ui.unit.LayoutDirection r0 = (androidx.compose.p004ui.unit.LayoutDirection) r0
            r7 = 0
            androidx.compose.runtime.q r6 = androidx.compose.runtime.ComposablesKt.m29526u(r14, r7)
            int r1 = r15 >> 9
            r1 = r1 & 14
            androidx.compose.runtime.k2 r5 = androidx.compose.runtime.C8415c2.m30251t(r12, r14, r1)
            java.lang.Object[] r1 = new java.lang.Object[r7]
            r2 = 0
            r3 = 0
            androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupId$1 r4 = androidx.compose.p004ui.window.AndroidPopup_androidKt$Popup$popupId$1.f40984f
            r16 = 3080(0xc08, float:4.316E-42)
            r17 = 6
            r32 = r5
            r5 = r14
            r33 = r6
            r6 = r16
            r7 = r17
            java.lang.Object r1 = androidx.compose.runtime.saveable.RememberSaveableKt.m31343d(r1, r2, r3, r4, r5, r6, r7)
            r7 = r1
            java.util.UUID r7 = (java.util.UUID) r7
            r1 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r14.mo14918M(r1)
            java.lang.Object r1 = r14.mo14921N()
            androidx.compose.runtime.o$a r2 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r2 = r2.mo16277a()
            if (r1 != r2) goto L_0x016b
            androidx.compose.ui.window.PopupLayout r6 = new androidx.compose.ui.window.PopupLayout
            java.lang.String r1 = "popupId"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r1)
            r16 = 0
            r17 = 128(0x80, float:1.794E-43)
            r18 = 0
            r5 = r0
            r0 = r6
            r1 = r22
            r2 = r23
            r3 = r24
            r4 = r8
            r8 = r5
            r5 = r9
            r9 = r6
            r6 = r35
            r36 = r8
            r8 = r16
            r34 = r9
            r9 = r17
            r12 = r10
            r10 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1 r0 = new androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1
            r1 = r32
            r2 = r34
            r0.<init>(r2, r1)
            r1 = 1302892335(0x4da88f2f, float:3.53494496E8)
            r3 = 1
            androidx.compose.runtime.internal.a r0 = androidx.compose.runtime.internal.C8553b.m31049c(r1, r3, r0)
            r1 = r33
            r2.setContent(r1, r0)
            r14.mo14893C(r2)
            r1 = r2
            goto L_0x016e
        L_0x016b:
            r36 = r0
            r12 = r10
        L_0x016e:
            r14.mo15002m0()
            androidx.compose.ui.window.PopupLayout r1 = (androidx.compose.p004ui.window.PopupLayout) r1
            androidx.compose.ui.window.AndroidPopup_androidKt$Popup$2 r0 = new androidx.compose.ui.window.AndroidPopup_androidKt$Popup$2
            r16 = r0
            r17 = r1
            r18 = r22
            r19 = r23
            r20 = r24
            r21 = r36
            r16.<init>(r17, r18, r19, r20, r21)
            r2 = 8
            androidx.compose.runtime.EffectsKt.m29891c(r1, r0, r14, r2)
            androidx.compose.ui.window.AndroidPopup_androidKt$Popup$3 r0 = new androidx.compose.ui.window.AndroidPopup_androidKt$Popup$3
            r16 = r0
            r16.<init>(r17, r18, r19, r20, r21)
            r2 = 0
            androidx.compose.runtime.EffectsKt.m29899k(r0, r14, r2)
            androidx.compose.ui.window.AndroidPopup_androidKt$Popup$4 r0 = new androidx.compose.ui.window.AndroidPopup_androidKt$Popup$4
            r0.<init>(r1, r11)
            r3 = r15 & 14
            androidx.compose.runtime.EffectsKt.m29891c(r11, r0, r14, r3)
            androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5 r0 = new androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5
            r0.<init>(r1, r12)
            r3 = 72
            androidx.compose.runtime.EffectsKt.m29896h(r1, r0, r14, r3)
            androidx.compose.ui.m$a r0 = androidx.compose.p004ui.C8767m.f23478j
            androidx.compose.ui.window.AndroidPopup_androidKt$Popup$7 r3 = new androidx.compose.ui.window.AndroidPopup_androidKt$Popup$7
            r3.<init>(r1)
            androidx.compose.ui.m r0 = androidx.compose.p004ui.layout.OnGloballyPositionedModifierKt.m68999a(r0, r3)
            androidx.compose.ui.window.AndroidPopup_androidKt$Popup$8 r3 = new androidx.compose.ui.window.AndroidPopup_androidKt$Popup$8
            r4 = r36
            r3.<init>(r1, r4)
            r1 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r14.mo14918M(r1)
            androidx.compose.runtime.i1 r1 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r1 = r14.mo15032w(r1)
            androidx.compose.ui.unit.d r1 = (androidx.compose.p004ui.unit.C16479d) r1
            androidx.compose.runtime.i1 r4 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r4 = r14.mo15032w(r4)
            androidx.compose.ui.unit.LayoutDirection r4 = (androidx.compose.p004ui.unit.LayoutDirection) r4
            androidx.compose.runtime.i1 r5 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r5 = r14.mo15032w(r5)
            androidx.compose.ui.platform.c4 r5 = (androidx.compose.p004ui.platform.C15863c4) r5
            androidx.compose.ui.node.ComposeUiNode$Companion r6 = androidx.compose.p004ui.node.ComposeUiNode.f38797m
            kotlin.jvm.functions.a r7 = r6.mo44585a()
            kotlin.jvm.functions.q r0 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r0)
            androidx.compose.runtime.d r8 = r14.mo15017r()
            boolean r8 = r8 instanceof androidx.compose.runtime.C8428d
            if (r8 != 0) goto L_0x01f3
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x01f3:
            r14.mo14938T()
            boolean r8 = r14.mo14997l()
            if (r8 == 0) goto L_0x0200
            r14.mo14947W(r7)
            goto L_0x0203
        L_0x0200:
            r14.mo14888A()
        L_0x0203:
            androidx.compose.runtime.o r7 = androidx.compose.runtime.Updater.m30180b(r14)
            kotlin.jvm.functions.p r8 = r6.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r7, r3, r8)
            kotlin.jvm.functions.p r3 = r6.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r7, r1, r3)
            kotlin.jvm.functions.p r1 = r6.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r7, r4, r1)
            kotlin.jvm.functions.p r1 = r6.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r7, r5, r1)
            androidx.compose.runtime.o r1 = androidx.compose.runtime.C8684u1.m31906b(r14)
            androidx.compose.runtime.u1 r1 = androidx.compose.runtime.C8684u1.m31905a(r1)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.invoke(r1, r14, r2)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r14.mo14918M(r0)
            r14.mo15002m0()
            r14.mo14896D()
            r14.mo15002m0()
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x024a
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x024a:
            r2 = r22
            r3 = r23
        L_0x024e:
            androidx.compose.runtime.t1 r7 = r14.mo15020s()
            if (r7 != 0) goto L_0x0255
            goto L_0x0266
        L_0x0255:
            androidx.compose.ui.window.AndroidPopup_androidKt$Popup$9 r8 = new androidx.compose.ui.window.AndroidPopup_androidKt$Popup$9
            r0 = r8
            r1 = r35
            r4 = r38
            r5 = r40
            r6 = r41
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.mo15202a(r8)
        L_0x0266:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.window.AndroidPopup_androidKt.m74868a(androidx.compose.ui.window.g, kotlin.jvm.functions.a, androidx.compose.ui.window.h, kotlin.jvm.functions.p, androidx.compose.runtime.o, int, int):void");
    }

    /* renamed from: b */
    public static final C11304p<C8592o, Integer, C11079d2> m74869b(C8578k2<? extends C11304p<? super C8592o, ? super Integer, C11079d2>> k2Var) {
        return (C11304p) k2Var.getValue();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: androidx.compose.ui.window.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m74870c(@org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8734c r24, long r25, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11289a<kotlin.C11079d2> r27, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.window.C16547h r28, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r29, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r30, int r31, int r32) {
        /*
            r7 = r29
            r8 = r31
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            r0 = 295309329(0x119a1011, float:2.4306818E-28)
            r1 = r30
            androidx.compose.runtime.o r9 = r1.mo15009o(r0)
            r1 = r32 & 1
            if (r1 == 0) goto L_0x001c
            r2 = r8 | 6
            r3 = r2
            r2 = r24
            goto L_0x0030
        L_0x001c:
            r2 = r8 & 14
            if (r2 != 0) goto L_0x002d
            r2 = r24
            boolean r3 = r9.mo15006n0(r2)
            if (r3 == 0) goto L_0x002a
            r3 = 4
            goto L_0x002b
        L_0x002a:
            r3 = 2
        L_0x002b:
            r3 = r3 | r8
            goto L_0x0030
        L_0x002d:
            r2 = r24
            r3 = r8
        L_0x0030:
            r4 = r32 & 2
            if (r4 == 0) goto L_0x0037
            r3 = r3 | 48
            goto L_0x004a
        L_0x0037:
            r5 = r8 & 112(0x70, float:1.57E-43)
            if (r5 != 0) goto L_0x004a
            r5 = r25
            boolean r10 = r9.mo14980g(r5)
            if (r10 == 0) goto L_0x0046
            r10 = 32
            goto L_0x0048
        L_0x0046:
            r10 = 16
        L_0x0048:
            r3 = r3 | r10
            goto L_0x004c
        L_0x004a:
            r5 = r25
        L_0x004c:
            r10 = r32 & 4
            if (r10 == 0) goto L_0x0053
            r3 = r3 | 384(0x180, float:5.38E-43)
            goto L_0x0066
        L_0x0053:
            r11 = r8 & 896(0x380, float:1.256E-42)
            if (r11 != 0) goto L_0x0066
            r11 = r27
            boolean r12 = r9.mo14927P(r11)
            if (r12 == 0) goto L_0x0062
            r12 = 256(0x100, float:3.59E-43)
            goto L_0x0064
        L_0x0062:
            r12 = 128(0x80, float:1.794E-43)
        L_0x0064:
            r3 = r3 | r12
            goto L_0x0068
        L_0x0066:
            r11 = r27
        L_0x0068:
            r12 = r32 & 8
            if (r12 == 0) goto L_0x006f
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            goto L_0x0082
        L_0x006f:
            r13 = r8 & 7168(0x1c00, float:1.0045E-41)
            if (r13 != 0) goto L_0x0082
            r13 = r28
            boolean r14 = r9.mo15006n0(r13)
            if (r14 == 0) goto L_0x007e
            r14 = 2048(0x800, float:2.87E-42)
            goto L_0x0080
        L_0x007e:
            r14 = 1024(0x400, float:1.435E-42)
        L_0x0080:
            r3 = r3 | r14
            goto L_0x0084
        L_0x0082:
            r13 = r28
        L_0x0084:
            r14 = r32 & 16
            if (r14 == 0) goto L_0x008b
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
            goto L_0x009d
        L_0x008b:
            r14 = 57344(0xe000, float:8.0356E-41)
            r14 = r14 & r8
            if (r14 != 0) goto L_0x009d
            boolean r14 = r9.mo14927P(r7)
            if (r14 == 0) goto L_0x009a
            r14 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009c
        L_0x009a:
            r14 = 8192(0x2000, float:1.14794E-41)
        L_0x009c:
            r3 = r3 | r14
        L_0x009d:
            r14 = 46811(0xb6db, float:6.5596E-41)
            r14 = r14 & r3
            r15 = 9362(0x2492, float:1.3119E-41)
            if (r14 != r15) goto L_0x00b5
            boolean r14 = r9.mo15011p()
            if (r14 != 0) goto L_0x00ac
            goto L_0x00b5
        L_0x00ac:
            r9.mo14958a0()
            r1 = r2
            r2 = r5
            r4 = r11
            r5 = r13
            goto L_0x0144
        L_0x00b5:
            if (r1 == 0) goto L_0x00bf
            androidx.compose.ui.c$a r1 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c r1 = r1.mo17061C()
            r14 = r1
            goto L_0x00c0
        L_0x00bf:
            r14 = r2
        L_0x00c0:
            if (r4 == 0) goto L_0x00c8
            r1 = 0
            long r1 = androidx.compose.p004ui.unit.C16496n.m74593a(r1, r1)
            r5 = r1
        L_0x00c8:
            r1 = 0
            if (r10 == 0) goto L_0x00cc
            r11 = r1
        L_0x00cc:
            if (r12 == 0) goto L_0x00e5
            androidx.compose.ui.window.h r2 = new androidx.compose.ui.window.h
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 63
            r23 = 0
            r15 = r2
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23)
            r13 = r2
        L_0x00e5:
            boolean r2 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r2 == 0) goto L_0x00f1
            r2 = -1
            java.lang.String r4 = "androidx.compose.ui.window.Popup (AndroidPopup.android.kt:186)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r3, r2, r4)
        L_0x00f1:
            androidx.compose.ui.unit.m r0 = androidx.compose.p004ui.unit.C16494m.m74570b(r5)
            r2 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r9.mo14918M(r2)
            boolean r2 = r9.mo15006n0(r14)
            boolean r0 = r9.mo15006n0(r0)
            r0 = r0 | r2
            java.lang.Object r2 = r9.mo14921N()
            if (r0 != 0) goto L_0x0112
            androidx.compose.runtime.o$a r0 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r0 = r0.mo16277a()
            if (r2 != r0) goto L_0x011a
        L_0x0112:
            androidx.compose.ui.window.a r2 = new androidx.compose.ui.window.a
            r2.<init>(r14, r5, r1)
            r9.mo14893C(r2)
        L_0x011a:
            r9.mo15002m0()
            r0 = r2
            androidx.compose.ui.window.a r0 = (androidx.compose.p004ui.window.C16540a) r0
            int r1 = r3 >> 3
            r2 = r1 & 112(0x70, float:1.57E-43)
            r3 = r1 & 896(0x380, float:1.256E-42)
            r2 = r2 | r3
            r1 = r1 & 7168(0x1c00, float:1.0045E-41)
            r10 = r2 | r1
            r12 = 0
            r1 = r11
            r2 = r13
            r3 = r29
            r4 = r9
            r15 = r5
            r5 = r10
            r6 = r12
            m74868a(r0, r1, r2, r3, r4, r5, r6)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0140
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0140:
            r4 = r11
            r5 = r13
            r1 = r14
            r2 = r15
        L_0x0144:
            androidx.compose.runtime.t1 r9 = r9.mo15020s()
            if (r9 != 0) goto L_0x014b
            goto L_0x015a
        L_0x014b:
            androidx.compose.ui.window.AndroidPopup_androidKt$Popup$1 r10 = new androidx.compose.ui.window.AndroidPopup_androidKt$Popup$1
            r0 = r10
            r6 = r29
            r7 = r31
            r8 = r32
            r0.<init>(r1, r2, r4, r5, r6, r7, r8)
            r9.mo15202a(r10)
        L_0x015a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.window.AndroidPopup_androidKt.m74870c(androidx.compose.ui.c, long, kotlin.jvm.functions.a, androidx.compose.ui.window.h, kotlin.jvm.functions.p, androidx.compose.runtime.o, int, int):void");
    }

    @C8540g
    @C8544h(scheme = "[0[0]]")
    /* renamed from: d */
    public static final void m74871d(@C12579k String str, @C12579k C11304p<? super C8592o, ? super Integer, C11079d2> pVar, @C12580l C8592o oVar, int i) {
        int i2;
        int i3;
        int i4;
        Intrinsics.checkNotNullParameter(str, "tag");
        Intrinsics.checkNotNullParameter(pVar, "content");
        C8592o o = oVar.mo15009o(-498879600);
        if ((i & 14) == 0) {
            if (o.mo15006n0(str)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (o.mo14927P(pVar)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 91) != 18 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-498879600, i2, -1, "androidx.compose.ui.window.PopupTestTag (AndroidPopup.android.kt:331)");
            }
            CompositionLocalKt.m29856b(new C8572j1[]{f40977a.mo16141f(str)}, pVar, o, (i2 & 112) | 8);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new AndroidPopup_androidKt$PopupTestTag$1(str, pVar, i));
        }
    }

    @C8540g
    @C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: e */
    public static final void m74872e(C8767m mVar, C11304p<? super C8592o, ? super Integer, C11079d2> pVar, C8592o oVar, int i) {
        oVar.mo14918M(1406149896);
        AndroidPopup_androidKt$SimpleStack$1 androidPopup_androidKt$SimpleStack$1 = AndroidPopup_androidKt$SimpleStack$1.f40986a;
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
        Updater.m30188j(b, androidPopup_androidKt$SimpleStack$1, companion.mo44588d());
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
    /* renamed from: h */
    public static final C8550i1<String> m74875h() {
        return f40977a;
    }

    /* renamed from: i */
    public static final boolean m74876i(@C12579k View view) {
        WindowManager.LayoutParams layoutParams;
        Intrinsics.checkNotNullParameter(view, "<this>");
        ViewGroup.LayoutParams layoutParams2 = view.getRootView().getLayoutParams();
        if (layoutParams2 instanceof WindowManager.LayoutParams) {
            layoutParams = (WindowManager.LayoutParams) layoutParams2;
        } else {
            layoutParams = null;
        }
        if (layoutParams == null || (layoutParams.flags & 8192) == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public static final boolean m74877j(@C12579k View view, @C12580l String str) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        if (!(view instanceof PopupLayout) || (str != null && !Intrinsics.areEqual((Object) str, (Object) ((PopupLayout) view).getTestTag()))) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    public static /* synthetic */ boolean m74878k(View view, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        return m74877j(view, str);
    }

    /* renamed from: l */
    public static final C16497o m74879l(Rect rect) {
        return new C16497o(rect.left, rect.top, rect.right, rect.bottom);
    }
}
