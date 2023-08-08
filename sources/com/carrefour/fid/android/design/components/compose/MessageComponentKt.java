package com.carrefour.fid.android.design.components.compose;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.LayoutKt;
import androidx.compose.p004ui.node.ComposeUiNode;
import androidx.compose.p004ui.platform.C15863c4;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.tooling.preview.C16464c;
import androidx.compose.p004ui.unit.C16479d;
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
import com.bumptech.glide.load.data.mediastore.C22132b;
import com.carrefour.fid.android.design.theme.ThemeKt;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nMessageComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MessageComponent.kt\ncom/carrefour/fid/android/design/components/compose/MessageComponentKt\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 8 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 9 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,120:1\n68#2,5:121\n73#2:152\n77#2:157\n75#3:126\n76#3,11:128\n89#3:156\n75#3:161\n76#3,11:163\n75#3:195\n76#3,11:197\n89#3:227\n89#3:241\n75#3:250\n76#3,11:252\n89#3:280\n76#4:127\n76#4:162\n76#4:196\n76#4:251\n460#5,13:139\n473#5,3:153\n460#5,13:174\n460#5,13:208\n473#5,3:224\n36#5:229\n473#5,3:238\n460#5,13:263\n473#5,3:277\n154#6:158\n154#6:188\n154#6:222\n154#6:223\n154#6:236\n154#6:237\n154#6:243\n78#7,2:159\n80#7:187\n84#7:242\n74#7,6:244\n80#7:276\n84#7:281\n75#8,6:189\n81#8:221\n85#8:228\n1114#9,6:230\n*S KotlinDebug\n*F\n+ 1 MessageComponent.kt\ncom/carrefour/fid/android/design/components/compose/MessageComponentKt\n*L\n30#1:121,5\n30#1:152\n30#1:157\n30#1:126\n30#1:128,11\n30#1:156\n42#1:161\n42#1:163,11\n51#1:195\n51#1:197,11\n51#1:227\n42#1:241\n84#1:250\n84#1:252,11\n84#1:280\n30#1:127\n42#1:162\n51#1:196\n84#1:251\n30#1:139,13\n30#1:153,3\n42#1:174,13\n51#1:208,13\n51#1:224,3\n67#1:229\n42#1:238,3\n84#1:263,13\n84#1:277,3\n45#1:158\n51#1:188\n56#1:222\n57#1:223\n69#1:236\n70#1:237\n84#1:243\n42#1:159,2\n42#1:187\n42#1:242\n84#1:244,6\n84#1:276\n84#1:281\n51#1:189,6\n51#1:221\n51#1:228\n67#1:230,6\n*E\n"})
public final class MessageComponentKt {
    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    public static final void m151544a(@C12580l C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(-1160528827);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1160528827, i, -1, "com.carrefour.fid.android.design.components.compose.ErrorCustomMessageNoActionPreview (MessageComponent.kt:110)");
            }
            ThemeKt.m153788a(ComposableSingletons$MessageComponentKt.f92242a.mo112109c(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new MessageComponentKt$ErrorCustomMessageNoActionPreview$1(i));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01e3  */
    /* JADX WARNING: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m151545b(java.lang.String r30, kotlin.jvm.functions.C11289a<kotlin.C11079d2> r31, androidx.compose.runtime.C8592o r32, int r33, int r34) {
        /*
            r0 = r33
            r1 = r34
            r2 = -560086038(0xffffffffde9dc3ea, float:-5.6840936E18)
            r3 = r32
            androidx.compose.runtime.o r15 = r3.mo15009o(r2)
            r3 = r1 & 1
            if (r3 == 0) goto L_0x0017
            r4 = r0 | 6
            r5 = r4
            r4 = r30
            goto L_0x002b
        L_0x0017:
            r4 = r0 & 14
            if (r4 != 0) goto L_0x0028
            r4 = r30
            boolean r5 = r15.mo15006n0(r4)
            if (r5 == 0) goto L_0x0025
            r5 = 4
            goto L_0x0026
        L_0x0025:
            r5 = 2
        L_0x0026:
            r5 = r5 | r0
            goto L_0x002b
        L_0x0028:
            r4 = r30
            r5 = r0
        L_0x002b:
            r6 = r1 & 2
            r7 = 16
            if (r6 == 0) goto L_0x0034
            r5 = r5 | 48
            goto L_0x0046
        L_0x0034:
            r8 = r0 & 112(0x70, float:1.57E-43)
            if (r8 != 0) goto L_0x0046
            r8 = r31
            boolean r9 = r15.mo14927P(r8)
            if (r9 == 0) goto L_0x0043
            r9 = 32
            goto L_0x0044
        L_0x0043:
            r9 = r7
        L_0x0044:
            r5 = r5 | r9
            goto L_0x0048
        L_0x0046:
            r8 = r31
        L_0x0048:
            r5 = r5 & 91
            r9 = 18
            if (r5 != r9) goto L_0x005a
            boolean r5 = r15.mo15011p()
            if (r5 != 0) goto L_0x0055
            goto L_0x005a
        L_0x0055:
            r15.mo14958a0()
            goto L_0x01dc
        L_0x005a:
            r5 = 0
            if (r3 == 0) goto L_0x0060
            r28 = r5
            goto L_0x0062
        L_0x0060:
            r28 = r4
        L_0x0062:
            if (r6 == 0) goto L_0x0067
            r29 = r5
            goto L_0x0069
        L_0x0067:
            r29 = r8
        L_0x0069:
            boolean r3 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r3 == 0) goto L_0x0075
            r3 = -1
            java.lang.String r4 = "com.carrefour.fid.android.design.components.compose.ErrorMessage (MessageComponent.kt:81)"
            androidx.compose.runtime.ComposerKt.m29845w0(r2, r0, r3, r4)
        L_0x0075:
            r2 = -553534417(0xffffffffdf01bc2f, float:-9.348399E18)
            r15.mo14918M(r2)
            r2 = 0
            if (r28 != 0) goto L_0x0087
            int r3 = com.carrefour.fid.android.design.components.C36896b.C36912p.message_error_screen
            java.lang.String r3 = androidx.compose.p004ui.res.C16018i.m71858d(r3, r15, r2)
            r24 = r3
            goto L_0x0089
        L_0x0087:
            r24 = r28
        L_0x0089:
            r15.mo15002m0()
            androidx.compose.ui.m$a r14 = androidx.compose.p004ui.C8767m.f23478j
            float r3 = (float) r7
            float r3 = androidx.compose.p004ui.unit.C16483g.m74435M(r3)
            androidx.compose.ui.m r3 = androidx.compose.foundation.layout.PaddingKt.m10024k(r14, r3)
            androidx.compose.ui.c$a r4 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c$b r4 = r4.mo17068m()
            r5 = -483455358(0xffffffffe32f0e82, float:-3.2292256E21)
            r15.mo14918M(r5)
            androidx.compose.foundation.layout.Arrangement r5 = androidx.compose.foundation.layout.Arrangement.f6010a
            androidx.compose.foundation.layout.Arrangement$l r5 = r5.mo7631r()
            r6 = 48
            androidx.compose.ui.layout.f0 r4 = androidx.compose.foundation.layout.ColumnKt.m9863b(r5, r4, r15, r6)
            r5 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r15.mo14918M(r5)
            androidx.compose.runtime.i1 r5 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r5 = r15.mo15032w(r5)
            androidx.compose.ui.unit.d r5 = (androidx.compose.p004ui.unit.C16479d) r5
            androidx.compose.runtime.i1 r6 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r6 = r15.mo15032w(r6)
            androidx.compose.ui.unit.LayoutDirection r6 = (androidx.compose.p004ui.unit.LayoutDirection) r6
            androidx.compose.runtime.i1 r7 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r7 = r15.mo15032w(r7)
            androidx.compose.ui.platform.c4 r7 = (androidx.compose.p004ui.platform.C15863c4) r7
            androidx.compose.ui.node.ComposeUiNode$Companion r8 = androidx.compose.p004ui.node.ComposeUiNode.f38797m
            kotlin.jvm.functions.a r9 = r8.mo44585a()
            kotlin.jvm.functions.q r3 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r3)
            androidx.compose.runtime.d r10 = r15.mo15017r()
            boolean r10 = r10 instanceof androidx.compose.runtime.C8428d
            if (r10 != 0) goto L_0x00e8
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x00e8:
            r15.mo14938T()
            boolean r10 = r15.mo14997l()
            if (r10 == 0) goto L_0x00f5
            r15.mo14947W(r9)
            goto L_0x00f8
        L_0x00f5:
            r15.mo14888A()
        L_0x00f8:
            r15.mo14941U()
            androidx.compose.runtime.o r9 = androidx.compose.runtime.Updater.m30180b(r15)
            kotlin.jvm.functions.p r10 = r8.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r9, r4, r10)
            kotlin.jvm.functions.p r4 = r8.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r9, r5, r4)
            kotlin.jvm.functions.p r4 = r8.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r9, r6, r4)
            kotlin.jvm.functions.p r4 = r8.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r9, r7, r4)
            r15.mo14972e()
            androidx.compose.runtime.o r4 = androidx.compose.runtime.C8684u1.m31906b(r15)
            androidx.compose.runtime.u1 r4 = androidx.compose.runtime.C8684u1.m31905a(r4)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            r3.invoke(r4, r15, r5)
            r3 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r15.mo14918M(r3)
            androidx.compose.foundation.layout.ColumnScopeInstance r3 = androidx.compose.foundation.layout.ColumnScopeInstance.f6049a
            int r3 = com.carrefour.fid.android.design.components.C36896b.C36904h.ds_il_page_error
            androidx.compose.ui.graphics.painter.Painter r3 = androidx.compose.p004ui.res.C16015f.m71849d(r3, r15, r2)
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = 56
            r12 = 124(0x7c, float:1.74E-43)
            r10 = r15
            androidx.compose.foundation.ImageKt.m8967b(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            androidx.compose.material.t0 r3 = androidx.compose.material.C7933t0.f19075a
            int r4 = androidx.compose.material.C7933t0.f19076b
            androidx.compose.material.w1 r3 = r3.mo11077c(r15, r4)
            androidx.compose.ui.text.p0 r23 = r3.mo11096i()
            androidx.compose.ui.text.font.i0$a r3 = androidx.compose.p004ui.text.font.C16209i0.f40292b
            androidx.compose.ui.text.font.i0 r10 = r3.mo46947c()
            androidx.compose.ui.text.style.i$a r3 = androidx.compose.p004ui.text.style.C16432i.f40718b
            int r3 = r3.mo47667a()
            r4 = 0
            r5 = 0
            r7 = 0
            r11 = 0
            r12 = 0
            r16 = 0
            r2 = r14
            r14 = r16
            androidx.compose.ui.text.style.i r3 = androidx.compose.p004ui.text.style.C16432i.m74172g(r3)
            r31 = r15
            r15 = r3
            r16 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r25 = 196608(0x30000, float:2.75506E-40)
            r26 = 0
            r27 = 64990(0xfdde, float:9.107E-41)
            r3 = r24
            r24 = r31
            androidx.compose.material.TextKt.m14196c(r3, r4, r5, r7, r9, r10, r11, r12, r14, r15, r16, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r3 = -553533946(0xffffffffdf01be06, float:-9.348916E18)
            r15 = r31
            r15.mo14918M(r3)
            if (r29 != 0) goto L_0x019a
            goto L_0x01c0
        L_0x019a:
            com.carrefour.fid.android.design.theme.a r3 = com.carrefour.fid.android.design.theme.C37474a.f94133a
            float r3 = r3.mo114199v()
            androidx.compose.ui.m r2 = androidx.compose.foundation.layout.SizeKt.m10115o(r2, r3)
            r3 = 0
            androidx.compose.foundation.layout.C2428y0.m10726a(r2, r15, r3)
            com.carrefour.fid.android.design.components.compose.ButtonType r5 = com.carrefour.fid.android.design.components.compose.ButtonType.Secondary
            int r2 = com.carrefour.fid.android.design.components.C36896b.C36912p.retry_title
            java.lang.String r8 = androidx.compose.p004ui.res.C16018i.m71858d(r2, r15, r3)
            r3 = 0
            r6 = 0
            r7 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r13 = 384(0x180, float:5.38E-43)
            r14 = 473(0x1d9, float:6.63E-43)
            r4 = r29
            r12 = r15
            com.carrefour.fid.android.design.components.compose.ButtonComponentKt.m151339f(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
        L_0x01c0:
            r15.mo15002m0()
            r15.mo15002m0()
            r15.mo14896D()
            r15.mo15002m0()
            r15.mo15002m0()
            boolean r2 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r2 == 0) goto L_0x01d8
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x01d8:
            r4 = r28
            r8 = r29
        L_0x01dc:
            androidx.compose.runtime.t1 r2 = r15.mo15020s()
            if (r2 != 0) goto L_0x01e3
            goto L_0x01eb
        L_0x01e3:
            com.carrefour.fid.android.design.components.compose.MessageComponentKt$ErrorMessage$2 r3 = new com.carrefour.fid.android.design.components.compose.MessageComponentKt$ErrorMessage$2
            r3.<init>(r4, r8, r0, r1)
            r2.mo15202a(r3)
        L_0x01eb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.design.components.compose.MessageComponentKt.m151545b(java.lang.String, kotlin.jvm.functions.a, androidx.compose.runtime.o, int, int):void");
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: c */
    public static final void m151546c(@C12580l C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(1685148782);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1685148782, i, -1, "com.carrefour.fid.android.design.components.compose.ErrorMessageFullPreview (MessageComponent.kt:116)");
            }
            ThemeKt.m153788a(ComposableSingletons$MessageComponentKt.f92242a.mo112110d(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new MessageComponentKt$ErrorMessageFullPreview$1(i));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v19, resolved type: kotlin.jvm.functions.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v9, resolved type: com.carrefour.fid.android.design.components.compose.MessageComponentKt$ErrorMessageFullScreen$1} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0214  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0220  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0224  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x035d  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x036a  */
    /* JADX WARNING: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m151547d(@org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r31, int r32, @org.jetbrains.annotations.C12579k java.lang.String r33, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11289a<kotlin.C11079d2> r34, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r35, int r36, int r37) {
        /*
            r0 = r33
            r15 = r36
            java.lang.String r1 = "message"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r1 = -93384607(0xfffffffffa6f1061, float:-3.1032279E35)
            r2 = r35
            androidx.compose.runtime.o r13 = r2.mo15009o(r1)
            r2 = r37 & 1
            r12 = 2
            if (r2 == 0) goto L_0x001d
            r3 = r15 | 6
            r4 = r3
            r3 = r31
            goto L_0x0031
        L_0x001d:
            r3 = r15 & 14
            if (r3 != 0) goto L_0x002e
            r3 = r31
            boolean r4 = r13.mo15006n0(r3)
            if (r4 == 0) goto L_0x002b
            r4 = 4
            goto L_0x002c
        L_0x002b:
            r4 = r12
        L_0x002c:
            r4 = r4 | r15
            goto L_0x0031
        L_0x002e:
            r3 = r31
            r4 = r15
        L_0x0031:
            r5 = r15 & 112(0x70, float:1.57E-43)
            r14 = 32
            r6 = 16
            if (r5 != 0) goto L_0x004c
            r5 = r37 & 2
            if (r5 != 0) goto L_0x0047
            r5 = r32
            boolean r7 = r13.mo14976f(r5)
            if (r7 == 0) goto L_0x0049
            r7 = r14
            goto L_0x004a
        L_0x0047:
            r5 = r32
        L_0x0049:
            r7 = r6
        L_0x004a:
            r4 = r4 | r7
            goto L_0x004e
        L_0x004c:
            r5 = r32
        L_0x004e:
            r7 = r37 & 4
            if (r7 == 0) goto L_0x0055
            r4 = r4 | 384(0x180, float:5.38E-43)
            goto L_0x0065
        L_0x0055:
            r7 = r15 & 896(0x380, float:1.256E-42)
            if (r7 != 0) goto L_0x0065
            boolean r7 = r13.mo15006n0(r0)
            if (r7 == 0) goto L_0x0062
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x0064
        L_0x0062:
            r7 = 128(0x80, float:1.794E-43)
        L_0x0064:
            r4 = r4 | r7
        L_0x0065:
            r7 = r37 & 8
            if (r7 == 0) goto L_0x006c
            r4 = r4 | 3072(0xc00, float:4.305E-42)
            goto L_0x007f
        L_0x006c:
            r8 = r15 & 7168(0x1c00, float:1.0045E-41)
            if (r8 != 0) goto L_0x007f
            r8 = r34
            boolean r9 = r13.mo14927P(r8)
            if (r9 == 0) goto L_0x007b
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x007d
        L_0x007b:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x007d:
            r4 = r4 | r9
            goto L_0x0081
        L_0x007f:
            r8 = r34
        L_0x0081:
            r9 = r4 & 5851(0x16db, float:8.199E-42)
            r10 = 1170(0x492, float:1.64E-42)
            if (r9 != r10) goto L_0x0098
            boolean r9 = r13.mo15011p()
            if (r9 != 0) goto L_0x008e
            goto L_0x0098
        L_0x008e:
            r13.mo14958a0()
            r29 = r3
            r2 = r5
            r4 = r8
            r1 = r13
            goto L_0x0363
        L_0x0098:
            r13.mo14930Q()
            r9 = r15 & 1
            if (r9 == 0) goto L_0x00b4
            boolean r9 = r13.mo14977f0()
            if (r9 == 0) goto L_0x00a6
            goto L_0x00b4
        L_0x00a6:
            r13.mo14958a0()
            r2 = r37 & 2
            if (r2 == 0) goto L_0x00af
            r4 = r4 & -113(0xffffffffffffff8f, float:NaN)
        L_0x00af:
            r11 = r3
            r10 = r5
        L_0x00b1:
            r9 = r8
            r8 = r4
            goto L_0x00d0
        L_0x00b4:
            if (r2 == 0) goto L_0x00b9
            androidx.compose.ui.m$a r2 = androidx.compose.p004ui.C8767m.f23478j
            goto L_0x00ba
        L_0x00b9:
            r2 = r3
        L_0x00ba:
            r3 = r37 & 2
            if (r3 == 0) goto L_0x00c3
            int r3 = com.carrefour.fid.android.design.components.C36896b.C36904h.ds_il_page_error
            r4 = r4 & -113(0xffffffffffffff8f, float:NaN)
            goto L_0x00c4
        L_0x00c3:
            r3 = r5
        L_0x00c4:
            if (r7 == 0) goto L_0x00cd
            com.carrefour.fid.android.design.components.compose.MessageComponentKt$ErrorMessageFullScreen$1 r5 = com.carrefour.fid.android.design.components.compose.MessageComponentKt$ErrorMessageFullScreen$1.f92303f
            r11 = r2
            r10 = r3
            r8 = r4
            r9 = r5
            goto L_0x00d0
        L_0x00cd:
            r11 = r2
            r10 = r3
            goto L_0x00b1
        L_0x00d0:
            r13.mo14899E()
            boolean r2 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r2 == 0) goto L_0x00df
            r2 = -1
            java.lang.String r3 = "com.carrefour.fid.android.design.components.compose.ErrorMessageFullScreen (MessageComponent.kt:35)"
            androidx.compose.runtime.ComposerKt.m29845w0(r1, r8, r2, r3)
        L_0x00df:
            r1 = 0
            r7 = 1
            r5 = 0
            androidx.compose.ui.m r2 = androidx.compose.foundation.layout.SizeKt.m10112l(r11, r1, r7, r5)
            float r6 = (float) r6
            float r3 = androidx.compose.p004ui.unit.C16483g.m74435M(r6)
            androidx.compose.ui.m r2 = androidx.compose.foundation.layout.PaddingKt.m10026m(r2, r3, r1, r12, r5)
            androidx.compose.foundation.layout.Arrangement r16 = androidx.compose.foundation.layout.Arrangement.f6010a
            androidx.compose.foundation.layout.Arrangement$e r3 = r16.mo7625f()
            androidx.compose.ui.c$a r17 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c$b r4 = r17.mo17068m()
            r5 = -483455358(0xffffffffe32f0e82, float:-3.2292256E21)
            r13.mo14918M(r5)
            r5 = 54
            androidx.compose.ui.layout.f0 r3 = androidx.compose.foundation.layout.ColumnKt.m9863b(r3, r4, r13, r5)
            r5 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r13.mo14918M(r5)
            androidx.compose.runtime.i1 r4 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r4 = r13.mo15032w(r4)
            androidx.compose.ui.unit.d r4 = (androidx.compose.p004ui.unit.C16479d) r4
            androidx.compose.runtime.i1 r5 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r5 = r13.mo15032w(r5)
            androidx.compose.ui.unit.LayoutDirection r5 = (androidx.compose.p004ui.unit.LayoutDirection) r5
            androidx.compose.runtime.i1 r7 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r7 = r13.mo15032w(r7)
            androidx.compose.ui.platform.c4 r7 = (androidx.compose.p004ui.platform.C15863c4) r7
            androidx.compose.ui.node.ComposeUiNode$Companion r18 = androidx.compose.p004ui.node.ComposeUiNode.f38797m
            kotlin.jvm.functions.a r1 = r18.mo44585a()
            kotlin.jvm.functions.q r2 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r2)
            androidx.compose.runtime.d r12 = r13.mo15017r()
            boolean r12 = r12 instanceof androidx.compose.runtime.C8428d
            if (r12 != 0) goto L_0x0140
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x0140:
            r13.mo14938T()
            boolean r12 = r13.mo14997l()
            if (r12 == 0) goto L_0x014d
            r13.mo14947W(r1)
            goto L_0x0150
        L_0x014d:
            r13.mo14888A()
        L_0x0150:
            r13.mo14941U()
            androidx.compose.runtime.o r1 = androidx.compose.runtime.Updater.m30180b(r13)
            kotlin.jvm.functions.p r12 = r18.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r1, r3, r12)
            kotlin.jvm.functions.p r3 = r18.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r1, r4, r3)
            kotlin.jvm.functions.p r3 = r18.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r1, r5, r3)
            kotlin.jvm.functions.p r3 = r18.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r1, r7, r3)
            r13.mo14972e()
            androidx.compose.runtime.o r1 = androidx.compose.runtime.C8684u1.m31906b(r13)
            androidx.compose.runtime.u1 r1 = androidx.compose.runtime.C8684u1.m31905a(r1)
            r12 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r12)
            r2.invoke(r1, r13, r3)
            r1 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r13.mo14918M(r1)
            androidx.compose.foundation.layout.ColumnScopeInstance r2 = androidx.compose.foundation.layout.ColumnScopeInstance.f6049a
            int r2 = r8 >> 3
            r2 = r2 & 14
            androidx.compose.ui.graphics.painter.Painter r2 = androidx.compose.p004ui.res.C16015f.m71849d(r10, r13, r2)
            r3 = 0
            r4 = 0
            r5 = 0
            r7 = 0
            r20 = 0
            r21 = 0
            r22 = 56
            r23 = 124(0x7c, float:1.74E-43)
            r1 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r15 = 0
            r25 = r6
            r6 = r7
            r7 = r20
            r26 = r8
            r8 = r21
            r27 = r9
            r9 = r13
            r28 = r10
            r10 = r22
            r29 = r11
            r11 = r23
            androidx.compose.foundation.ImageKt.m8967b(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            androidx.compose.ui.c$c r2 = r17.mo17070q()
            androidx.compose.ui.m$a r11 = androidx.compose.p004ui.C8767m.f23478j
            r4 = 0
            float r3 = (float) r14
            float r5 = androidx.compose.p004ui.unit.C16483g.m74435M(r3)
            r6 = 0
            r7 = 0
            r8 = 13
            r9 = 0
            r3 = r11
            androidx.compose.ui.m r3 = androidx.compose.foundation.layout.PaddingKt.m10028o(r3, r4, r5, r6, r7, r8, r9)
            r4 = 693286680(0x2952b718, float:4.6788176E-14)
            r13.mo14918M(r4)
            androidx.compose.foundation.layout.Arrangement$d r4 = r16.mo7630p()
            r5 = 48
            androidx.compose.ui.layout.f0 r2 = androidx.compose.foundation.layout.RowKt.m10071d(r4, r2, r13, r5)
            r13.mo14918M(r1)
            androidx.compose.runtime.i1 r1 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r1 = r13.mo15032w(r1)
            androidx.compose.ui.unit.d r1 = (androidx.compose.p004ui.unit.C16479d) r1
            androidx.compose.runtime.i1 r4 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r4 = r13.mo15032w(r4)
            androidx.compose.ui.unit.LayoutDirection r4 = (androidx.compose.p004ui.unit.LayoutDirection) r4
            androidx.compose.runtime.i1 r5 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r5 = r13.mo15032w(r5)
            androidx.compose.ui.platform.c4 r5 = (androidx.compose.p004ui.platform.C15863c4) r5
            kotlin.jvm.functions.a r6 = r18.mo44585a()
            kotlin.jvm.functions.q r3 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r3)
            androidx.compose.runtime.d r7 = r13.mo15017r()
            boolean r7 = r7 instanceof androidx.compose.runtime.C8428d
            if (r7 != 0) goto L_0x0217
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x0217:
            r13.mo14938T()
            boolean r7 = r13.mo14997l()
            if (r7 == 0) goto L_0x0224
            r13.mo14947W(r6)
            goto L_0x0227
        L_0x0224:
            r13.mo14888A()
        L_0x0227:
            r13.mo14941U()
            androidx.compose.runtime.o r6 = androidx.compose.runtime.Updater.m30180b(r13)
            kotlin.jvm.functions.p r7 = r18.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r6, r2, r7)
            kotlin.jvm.functions.p r2 = r18.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r6, r1, r2)
            kotlin.jvm.functions.p r1 = r18.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r6, r4, r1)
            kotlin.jvm.functions.p r1 = r18.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r6, r5, r1)
            r13.mo14972e()
            androidx.compose.runtime.o r1 = androidx.compose.runtime.C8684u1.m31906b(r13)
            androidx.compose.runtime.u1 r1 = androidx.compose.runtime.C8684u1.m31905a(r1)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r12)
            r3.invoke(r1, r13, r2)
            r1 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r13.mo14918M(r1)
            androidx.compose.foundation.layout.RowScopeInstance r1 = androidx.compose.foundation.layout.RowScopeInstance.f6147a
            int r1 = com.carrefour.fid.android.design.components.C36896b.C36904h.ds_gr_red_error
            androidx.compose.ui.graphics.painter.Painter r2 = androidx.compose.p004ui.res.C16015f.m71849d(r1, r13, r12)
            r3 = 0
            float r1 = androidx.compose.p004ui.unit.C16483g.m74435M(r25)
            r4 = 2
            r14 = 0
            androidx.compose.ui.m r1 = androidx.compose.foundation.layout.PaddingKt.m10026m(r11, r1, r14, r4, r15)
            r4 = 24
            float r10 = (float) r4
            float r4 = androidx.compose.p004ui.unit.C16483g.m74435M(r10)
            androidx.compose.ui.m r4 = androidx.compose.foundation.layout.SizeKt.m10087C(r1, r4)
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r1 = 440(0x1b8, float:6.17E-43)
            r16 = 120(0x78, float:1.68E-43)
            r9 = r13
            r25 = r10
            r10 = r1
            r1 = r11
            r11 = r16
            androidx.compose.foundation.ImageKt.m8967b(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            int r2 = com.carrefour.fid.android.design.components.C36896b.C36902f.ds_red_1
            long r2 = androidx.compose.p004ui.res.C16009b.m71825a(r2, r13, r12)
            androidx.compose.material.t0 r4 = androidx.compose.material.C7933t0.f19075a
            int r5 = androidx.compose.material.C7933t0.f19076b
            androidx.compose.material.w1 r4 = r4.mo11077c(r13, r5)
            androidx.compose.ui.text.p0 r20 = r4.mo11096i()
            androidx.compose.ui.text.font.i0$a r4 = androidx.compose.p004ui.text.font.C16209i0.f40292b
            androidx.compose.ui.text.font.i0 r7 = r4.mo46947c()
            r4 = 0
            r12 = r14
            r14 = r1
            r1 = r4
            r4 = 0
            r9 = 0
            r11 = 0
            r16 = 0
            r12 = r16
            r16 = 0
            r31 = r13
            r30 = r14
            r13 = r16
            r16 = 0
            r15 = r16
            r17 = 0
            r18 = 0
            r19 = 0
            int r21 = r26 >> 6
            r21 = r21 & 14
            r22 = 196608(0x30000, float:2.75506E-40)
            r22 = r21 | r22
            r23 = 0
            r24 = 65498(0xffda, float:9.1782E-41)
            r0 = r33
            r21 = r31
            androidx.compose.material.TextKt.m14196c(r0, r1, r2, r4, r6, r7, r8, r9, r11, r12, r13, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r31.mo15002m0()
            r31.mo14896D()
            r31.mo15002m0()
            r31.mo15002m0()
            r0 = 1157296644(0x44faf204, float:2007.563)
            r1 = r31
            r1.mo14918M(r0)
            r0 = r27
            boolean r2 = r1.mo15006n0(r0)
            java.lang.Object r3 = r1.mo14921N()
            if (r2 != 0) goto L_0x0305
            androidx.compose.runtime.o$a r2 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r2 = r2.mo16277a()
            if (r3 != r2) goto L_0x030d
        L_0x0305:
            com.carrefour.fid.android.design.components.compose.MessageComponentKt$ErrorMessageFullScreen$2$2$1 r3 = new com.carrefour.fid.android.design.components.compose.MessageComponentKt$ErrorMessageFullScreen$2$2$1
            r3.<init>(r0)
            r1.mo14893C(r3)
        L_0x030d:
            r1.mo15002m0()
            r2 = r3
            kotlin.jvm.functions.a r2 = (kotlin.jvm.functions.C11289a) r2
            r3 = r30
            r4 = 0
            r5 = 0
            r6 = 1
            androidx.compose.ui.m r7 = androidx.compose.foundation.layout.SizeKt.m10114n(r3, r5, r6, r4)
            r8 = 0
            float r9 = androidx.compose.p004ui.unit.C16483g.m74435M(r25)
            r10 = 0
            r11 = 0
            r12 = 13
            r13 = 0
            androidx.compose.ui.m r3 = androidx.compose.foundation.layout.PaddingKt.m10028o(r7, r8, r9, r10, r11, r12, r13)
            r4 = 56
            float r4 = (float) r4
            float r4 = androidx.compose.p004ui.unit.C16483g.m74435M(r4)
            androidx.compose.ui.m r3 = androidx.compose.foundation.layout.SizeKt.m10115o(r3, r4)
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            com.carrefour.fid.android.design.components.compose.ComposableSingletons$MessageComponentKt r11 = com.carrefour.fid.android.design.components.compose.ComposableSingletons$MessageComponentKt.f92242a
            kotlin.jvm.functions.q r11 = r11.mo112107a()
            r13 = 805306416(0x30000030, float:4.6566395E-10)
            r14 = 508(0x1fc, float:7.12E-43)
            r12 = r1
            androidx.compose.material.ButtonKt.m13343a(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r1.mo15002m0()
            r1.mo14896D()
            r1.mo15002m0()
            r1.mo15002m0()
            boolean r2 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r2 == 0) goto L_0x0360
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0360:
            r4 = r0
            r2 = r28
        L_0x0363:
            androidx.compose.runtime.t1 r7 = r1.mo15020s()
            if (r7 != 0) goto L_0x036a
            goto L_0x037b
        L_0x036a:
            com.carrefour.fid.android.design.components.compose.MessageComponentKt$ErrorMessageFullScreen$3 r8 = new com.carrefour.fid.android.design.components.compose.MessageComponentKt$ErrorMessageFullScreen$3
            r0 = r8
            r1 = r29
            r3 = r33
            r5 = r36
            r6 = r37
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.mo15202a(r8)
        L_0x037b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.design.components.compose.MessageComponentKt.m151547d(androidx.compose.ui.m, int, java.lang.String, kotlin.jvm.functions.a, androidx.compose.runtime.o, int, int):void");
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: e */
    public static final void m151548e(@C12580l C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(594804863);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(594804863, i, -1, "com.carrefour.fid.android.design.components.compose.ErrorMessagePreview (MessageComponent.kt:104)");
            }
            ThemeKt.m153788a(ComposableSingletons$MessageComponentKt.f92242a.mo112108b(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new MessageComponentKt$ErrorMessagePreview$1(i));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: f */
    public static final void m151549f(@C12580l C8767m mVar, @C12580l String str, @C12580l C11289a<C11079d2> aVar, @C12580l C8592o oVar, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        C8592o o = oVar.mo15009o(-779698315);
        int i7 = i2 & 1;
        if (i7 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (o.mo15006n0(mVar)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i3 = i6 | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            if (o.mo15006n0(str)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        int i9 = i2 & 4;
        if (i9 != 0) {
            i3 |= C22132b.f56831b;
        } else if ((i & 896) == 0) {
            if (o.mo14927P(aVar)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i3 |= i4;
        }
        if ((i3 & 731) != 146 || !o.mo15011p()) {
            if (i7 != 0) {
                mVar = C8767m.f23478j;
            }
            if (i8 != 0) {
                str = null;
            }
            if (i9 != 0) {
                aVar = null;
            }
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-779698315, i3, -1, "com.carrefour.fid.android.design.components.compose.ErrorMessageScreen (MessageComponent.kt:28)");
            }
            C8767m l = SizeKt.m10112l(mVar, 0.0f, 1, (Object) null);
            C8734c i10 = C8734c.f23406a.mo17066i();
            o.mo14918M(733328855);
            C15560f0 k = BoxKt.m9849k(i10, false, o, 6);
            o.mo14918M(-1323940314);
            C16479d dVar = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            C11289a<ComposeUiNode> a = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f = LayoutKt.m68908f(l);
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
            C8592o b = Updater.m30180b(o);
            Updater.m30188j(b, k, companion.mo44588d());
            Updater.m30188j(b, dVar, companion.mo44586b());
            Updater.m30188j(b, layoutDirection, companion.mo44587c());
            Updater.m30188j(b, c4Var, companion.mo44590f());
            o.mo14972e();
            f.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
            o.mo14918M(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f6046a;
            int i11 = i3 >> 3;
            m151545b(str, aVar, o, (i11 & 112) | (i11 & 14), 0);
            o.mo15002m0();
            o.mo14896D();
            o.mo15002m0();
            o.mo15002m0();
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8767m mVar2 = mVar;
        String str2 = str;
        C11289a<C11079d2> aVar2 = aVar;
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new MessageComponentKt$ErrorMessageScreen$2(mVar2, str2, aVar2, i, i2));
        }
    }
}
