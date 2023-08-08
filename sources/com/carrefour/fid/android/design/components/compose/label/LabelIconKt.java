package com.carrefour.fid.android.design.components.compose.label;

import androidx.annotation.C0375v;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.res.C16009b;
import androidx.compose.p004ui.tooling.preview.C16464c;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.ComposerKt;
import com.carrefour.fid.android.design.components.C36896b;
import com.carrefour.fid.android.design.theme.ThemeKt;
import kotlin.jvm.internal.C11363r0;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nLabelIcon.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LabelIcon.kt\ncom/carrefour/fid/android/design/components/compose/label/LabelIconKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,101:1\n154#2:102\n154#2:103\n*S KotlinDebug\n*F\n+ 1 LabelIcon.kt\ncom/carrefour/fid/android/design/components/compose/label/LabelIconKt\n*L\n28#1:102\n57#1:103\n*E\n"})
public final class LabelIconKt {
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m151854a(long r17, long r19, @androidx.annotation.C0375v int r21, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r22, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r23, int r24, int r25) {
        /*
            r3 = r19
            r5 = r21
            r7 = r24
            r0 = -1685366209(0xffffffff9b8b5a3f, float:-2.305394E-22)
            r1 = r23
            androidx.compose.runtime.o r1 = r1.mo15009o(r0)
            r2 = r25 & 1
            r6 = 4
            if (r2 == 0) goto L_0x0019
            r2 = r7 | 6
            r14 = r17
            goto L_0x002b
        L_0x0019:
            r2 = r7 & 14
            r14 = r17
            if (r2 != 0) goto L_0x002a
            boolean r2 = r1.mo14980g(r14)
            if (r2 == 0) goto L_0x0027
            r2 = r6
            goto L_0x0028
        L_0x0027:
            r2 = 2
        L_0x0028:
            r2 = r2 | r7
            goto L_0x002b
        L_0x002a:
            r2 = r7
        L_0x002b:
            r8 = r25 & 2
            if (r8 == 0) goto L_0x0032
            r2 = r2 | 48
            goto L_0x0042
        L_0x0032:
            r8 = r7 & 112(0x70, float:1.57E-43)
            if (r8 != 0) goto L_0x0042
            boolean r8 = r1.mo14980g(r3)
            if (r8 == 0) goto L_0x003f
            r8 = 32
            goto L_0x0041
        L_0x003f:
            r8 = 16
        L_0x0041:
            r2 = r2 | r8
        L_0x0042:
            r8 = r25 & 4
            if (r8 == 0) goto L_0x0049
            r2 = r2 | 384(0x180, float:5.38E-43)
            goto L_0x0059
        L_0x0049:
            r8 = r7 & 896(0x380, float:1.256E-42)
            if (r8 != 0) goto L_0x0059
            boolean r8 = r1.mo14976f(r5)
            if (r8 == 0) goto L_0x0056
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0058
        L_0x0056:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0058:
            r2 = r2 | r8
        L_0x0059:
            r8 = r25 & 8
            if (r8 == 0) goto L_0x0060
            r2 = r2 | 3072(0xc00, float:4.305E-42)
            goto L_0x0073
        L_0x0060:
            r9 = r7 & 7168(0x1c00, float:1.0045E-41)
            if (r9 != 0) goto L_0x0073
            r9 = r22
            boolean r10 = r1.mo15006n0(r9)
            if (r10 == 0) goto L_0x006f
            r10 = 2048(0x800, float:2.87E-42)
            goto L_0x0071
        L_0x006f:
            r10 = 1024(0x400, float:1.435E-42)
        L_0x0071:
            r2 = r2 | r10
            goto L_0x0075
        L_0x0073:
            r9 = r22
        L_0x0075:
            r10 = r2 & 5851(0x16db, float:8.199E-42)
            r11 = 1170(0x492, float:1.64E-42)
            if (r10 != r11) goto L_0x0087
            boolean r10 = r1.mo15011p()
            if (r10 != 0) goto L_0x0082
            goto L_0x0087
        L_0x0082:
            r1.mo14958a0()
            r6 = r9
            goto L_0x00cd
        L_0x0087:
            if (r8 == 0) goto L_0x008e
            androidx.compose.ui.m$a r8 = androidx.compose.p004ui.C8767m.f23478j
            r16 = r8
            goto L_0x0090
        L_0x008e:
            r16 = r9
        L_0x0090:
            boolean r8 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r8 == 0) goto L_0x009c
            r8 = -1
            java.lang.String r9 = "com.carrefour.fid.android.design.components.compose.label.LabelLargeIcon (LabelIcon.kt:47)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r2, r8, r9)
        L_0x009c:
            float r0 = (float) r6
            float r10 = androidx.compose.p004ui.unit.C16483g.m74435M(r0)
            com.carrefour.fid.android.design.components.compose.label.LabelIconKt$LabelLargeIcon$1 r0 = new com.carrefour.fid.android.design.components.compose.label.LabelIconKt$LabelLargeIcon$1
            r0.<init>(r3, r5, r2)
            r6 = 1992765013(0x76c72e55, float:2.0199352E33)
            r8 = 1
            androidx.compose.runtime.internal.a r12 = androidx.compose.runtime.internal.C8553b.m31048b(r1, r6, r8, r0)
            r0 = r2 & 14
            r0 = r0 | 3120(0xc30, float:4.372E-42)
            int r2 = r2 >> 3
            r2 = r2 & 896(0x380, float:1.256E-42)
            r0 = r0 | r2
            r2 = 0
            r8 = r17
            r11 = r16
            r13 = r1
            r14 = r0
            r15 = r2
            com.carrefour.fid.android.design.components.compose.label.BaseLabelComponentKt.m151752c(r8, r10, r11, r12, r13, r14, r15)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x00cb
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x00cb:
            r6 = r16
        L_0x00cd:
            androidx.compose.runtime.t1 r9 = r1.mo15020s()
            if (r9 != 0) goto L_0x00d4
            goto L_0x00e7
        L_0x00d4:
            com.carrefour.fid.android.design.components.compose.label.LabelIconKt$LabelLargeIcon$2 r10 = new com.carrefour.fid.android.design.components.compose.label.LabelIconKt$LabelLargeIcon$2
            r0 = r10
            r1 = r17
            r3 = r19
            r5 = r21
            r7 = r24
            r8 = r25
            r0.<init>(r1, r3, r5, r6, r7, r8)
            r9.mo15202a(r10)
        L_0x00e7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.design.components.compose.label.LabelIconKt.m151854a(long, long, int, androidx.compose.ui.m, androidx.compose.runtime.o, int, int):void");
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: b */
    public static final void m151855b(@C0375v int i, @C12580l C8767m mVar, @C12580l C8592o oVar, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        C8592o o = oVar.mo15009o(-1168063643);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            if (o.mo14976f(i)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i4 = i6 | i2;
        } else {
            i4 = i2;
        }
        int i7 = i3 & 2;
        if (i7 != 0) {
            i4 |= 48;
        } else if ((i2 & 112) == 0) {
            if (o.mo15006n0(mVar)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i4 |= i5;
        }
        if ((i4 & 91) != 18 || !o.mo15011p()) {
            if (i7 != 0) {
                mVar = C8767m.f23478j;
            }
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1168063643, i4, -1, "com.carrefour.fid.android.design.components.compose.label.LabelLargeIconUnavailable (LabelIcon.kt:63)");
            }
            int i8 = i4 << 6;
            m151854a(C16009b.m71825a(C36896b.C36902f.ds_grey_60, o, 0), C16009b.m71825a(C36896b.C36902f.ds_grey_10, o, 0), i, mVar, o, (i8 & 896) | (i8 & 7168), 0);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new LabelIconKt$LabelLargeIconUnavailable$1(i, mVar, i2, i3));
        }
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: c */
    public static final void m151856c(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(-660825731);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-660825731, i, -1, "com.carrefour.fid.android.design.components.compose.label.LabelLargeIconUnavailablePreview (LabelIcon.kt:91)");
            }
            ThemeKt.m153788a(ComposableSingletons$LabelIconKt.f92474a.mo112510d(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new LabelIconKt$LabelLargeIconUnavailablePreview$1(i));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m151857d(long r17, long r19, @androidx.annotation.C0375v int r21, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r22, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r23, int r24, int r25) {
        /*
            r3 = r19
            r5 = r21
            r7 = r24
            r0 = 1181370635(0x466a490b, float:14994.261)
            r1 = r23
            androidx.compose.runtime.o r1 = r1.mo15009o(r0)
            r2 = r25 & 1
            r6 = 4
            if (r2 == 0) goto L_0x0019
            r2 = r7 | 6
            r14 = r17
            goto L_0x002b
        L_0x0019:
            r2 = r7 & 14
            r14 = r17
            if (r2 != 0) goto L_0x002a
            boolean r2 = r1.mo14980g(r14)
            if (r2 == 0) goto L_0x0027
            r2 = r6
            goto L_0x0028
        L_0x0027:
            r2 = 2
        L_0x0028:
            r2 = r2 | r7
            goto L_0x002b
        L_0x002a:
            r2 = r7
        L_0x002b:
            r8 = r25 & 2
            if (r8 == 0) goto L_0x0032
            r2 = r2 | 48
            goto L_0x0042
        L_0x0032:
            r8 = r7 & 112(0x70, float:1.57E-43)
            if (r8 != 0) goto L_0x0042
            boolean r8 = r1.mo14980g(r3)
            if (r8 == 0) goto L_0x003f
            r8 = 32
            goto L_0x0041
        L_0x003f:
            r8 = 16
        L_0x0041:
            r2 = r2 | r8
        L_0x0042:
            r8 = r25 & 4
            if (r8 == 0) goto L_0x0049
            r2 = r2 | 384(0x180, float:5.38E-43)
            goto L_0x0059
        L_0x0049:
            r8 = r7 & 896(0x380, float:1.256E-42)
            if (r8 != 0) goto L_0x0059
            boolean r8 = r1.mo14976f(r5)
            if (r8 == 0) goto L_0x0056
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0058
        L_0x0056:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0058:
            r2 = r2 | r8
        L_0x0059:
            r8 = r25 & 8
            if (r8 == 0) goto L_0x0060
            r2 = r2 | 3072(0xc00, float:4.305E-42)
            goto L_0x0073
        L_0x0060:
            r9 = r7 & 7168(0x1c00, float:1.0045E-41)
            if (r9 != 0) goto L_0x0073
            r9 = r22
            boolean r10 = r1.mo15006n0(r9)
            if (r10 == 0) goto L_0x006f
            r10 = 2048(0x800, float:2.87E-42)
            goto L_0x0071
        L_0x006f:
            r10 = 1024(0x400, float:1.435E-42)
        L_0x0071:
            r2 = r2 | r10
            goto L_0x0075
        L_0x0073:
            r9 = r22
        L_0x0075:
            r10 = r2 & 5851(0x16db, float:8.199E-42)
            r11 = 1170(0x492, float:1.64E-42)
            if (r10 != r11) goto L_0x0087
            boolean r10 = r1.mo15011p()
            if (r10 != 0) goto L_0x0082
            goto L_0x0087
        L_0x0082:
            r1.mo14958a0()
            r6 = r9
            goto L_0x00cd
        L_0x0087:
            if (r8 == 0) goto L_0x008e
            androidx.compose.ui.m$a r8 = androidx.compose.p004ui.C8767m.f23478j
            r16 = r8
            goto L_0x0090
        L_0x008e:
            r16 = r9
        L_0x0090:
            boolean r8 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r8 == 0) goto L_0x009c
            r8 = -1
            java.lang.String r9 = "com.carrefour.fid.android.design.components.compose.label.LabelSmallIcon (LabelIcon.kt:18)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r2, r8, r9)
        L_0x009c:
            float r0 = (float) r6
            float r10 = androidx.compose.p004ui.unit.C16483g.m74435M(r0)
            com.carrefour.fid.android.design.components.compose.label.LabelIconKt$LabelSmallIcon$1 r0 = new com.carrefour.fid.android.design.components.compose.label.LabelIconKt$LabelSmallIcon$1
            r0.<init>(r3, r5, r2)
            r6 = 564534561(0x21a61d21, float:1.1256308E-18)
            r8 = 1
            androidx.compose.runtime.internal.a r12 = androidx.compose.runtime.internal.C8553b.m31048b(r1, r6, r8, r0)
            r0 = r2 & 14
            r0 = r0 | 3120(0xc30, float:4.372E-42)
            int r2 = r2 >> 3
            r2 = r2 & 896(0x380, float:1.256E-42)
            r0 = r0 | r2
            r2 = 0
            r8 = r17
            r11 = r16
            r13 = r1
            r14 = r0
            r15 = r2
            com.carrefour.fid.android.design.components.compose.label.BaseLabelComponentKt.m151752c(r8, r10, r11, r12, r13, r14, r15)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x00cb
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x00cb:
            r6 = r16
        L_0x00cd:
            androidx.compose.runtime.t1 r9 = r1.mo15020s()
            if (r9 != 0) goto L_0x00d4
            goto L_0x00e7
        L_0x00d4:
            com.carrefour.fid.android.design.components.compose.label.LabelIconKt$LabelSmallIcon$2 r10 = new com.carrefour.fid.android.design.components.compose.label.LabelIconKt$LabelSmallIcon$2
            r0 = r10
            r1 = r17
            r3 = r19
            r5 = r21
            r7 = r24
            r8 = r25
            r0.<init>(r1, r3, r5, r6, r7, r8)
            r9.mo15202a(r10)
        L_0x00e7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.design.components.compose.label.LabelIconKt.m151857d(long, long, int, androidx.compose.ui.m, androidx.compose.runtime.o, int, int):void");
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: e */
    public static final void m151858e(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(-1665179579);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1665179579, i, -1, "com.carrefour.fid.android.design.components.compose.label.LabelSmallIconPreview (LabelIcon.kt:77)");
            }
            ThemeKt.m153788a(ComposableSingletons$LabelIconKt.f92474a.mo112508b(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new LabelIconKt$LabelSmallIconPreview$1(i));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: f */
    public static final void m151859f(@C0375v int i, @C12580l C8767m mVar, @C12580l C8592o oVar, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        C8592o o = oVar.mo15009o(1002621721);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            if (o.mo14976f(i)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i4 = i6 | i2;
        } else {
            i4 = i2;
        }
        int i7 = i3 & 2;
        if (i7 != 0) {
            i4 |= 48;
        } else if ((i2 & 112) == 0) {
            if (o.mo15006n0(mVar)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i4 |= i5;
        }
        if ((i4 & 91) != 18 || !o.mo15011p()) {
            if (i7 != 0) {
                mVar = C8767m.f23478j;
            }
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1002621721, i4, -1, "com.carrefour.fid.android.design.components.compose.label.LabelSmallIconUnavailable (LabelIcon.kt:34)");
            }
            int i8 = i4 << 6;
            m151857d(C16009b.m71825a(C36896b.C36902f.ds_grey_60, o, 0), C16009b.m71825a(C36896b.C36902f.ds_grey_10, o, 0), i, mVar, o, (i8 & 896) | (i8 & 7168), 0);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new LabelIconKt$LabelSmallIconUnavailable$1(i, mVar, i2, i3));
        }
    }
}
