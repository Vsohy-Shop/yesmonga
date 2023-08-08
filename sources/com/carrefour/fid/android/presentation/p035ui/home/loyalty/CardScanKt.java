package com.carrefour.fid.android.presentation.p035ui.home.loyalty;

import androidx.compose.foundation.C2223i;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.C2694o;
import androidx.compose.material.C7873k;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.text.C16361p0;
import androidx.compose.p004ui.tooling.preview.C16464c;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.C8700z0;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8553b;
import com.bumptech.glide.load.data.mediastore.C22132b;
import com.carrefour.fid.android.design.theme.C37474a;
import com.carrefour.fid.android.design.theme.ThemeKt;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nCardScan.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardScan.kt\ncom/carrefour/fid/android/presentation/ui/home/loyalty/CardScanKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,192:1\n154#2:193\n154#2:194\n76#3:195\n25#4:196\n25#4:203\n36#4:210\n50#4:217\n49#4:218\n1114#5,6:197\n1114#5,6:204\n1114#5,6:211\n1114#5,6:219\n76#6:225\n102#6,2:226\n76#6:228\n102#6,2:229\n*S KotlinDebug\n*F\n+ 1 CardScan.kt\ncom/carrefour/fid/android/presentation/ui/home/loyalty/CardScanKt\n*L\n58#1:193\n60#1:194\n141#1:195\n155#1:196\n156#1:203\n166#1:210\n169#1:217\n169#1:218\n155#1:197,6\n156#1:204,6\n166#1:211,6\n169#1:219,6\n155#1:225\n155#1:226,2\n156#1:228\n156#1:229,2\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.home.loyalty.CardScanKt */
public final class CardScanKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v1, resolved type: kotlin.jvm.functions.l} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m106404a(androidx.compose.foundation.layout.C2362h r33, androidx.compose.p004ui.C8767m r34, java.lang.String r35, androidx.compose.runtime.C8592o r36, int r37) {
        /*
            r0 = r33
            r1 = r34
            r2 = r35
            r15 = r37
            r3 = 757024386(0x2d1f4682, float:9.0537595E-12)
            r4 = r36
            androidx.compose.runtime.o r14 = r4.mo15009o(r3)
            r4 = r15 & 14
            r5 = 2
            if (r4 != 0) goto L_0x0021
            boolean r4 = r14.mo15006n0(r0)
            if (r4 == 0) goto L_0x001e
            r4 = 4
            goto L_0x001f
        L_0x001e:
            r4 = r5
        L_0x001f:
            r4 = r4 | r15
            goto L_0x0022
        L_0x0021:
            r4 = r15
        L_0x0022:
            r6 = r15 & 112(0x70, float:1.57E-43)
            if (r6 != 0) goto L_0x0032
            boolean r6 = r14.mo15006n0(r1)
            if (r6 == 0) goto L_0x002f
            r6 = 32
            goto L_0x0031
        L_0x002f:
            r6 = 16
        L_0x0031:
            r4 = r4 | r6
        L_0x0032:
            r6 = r15 & 896(0x380, float:1.256E-42)
            if (r6 != 0) goto L_0x0042
            boolean r6 = r14.mo15006n0(r2)
            if (r6 == 0) goto L_0x003f
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x0041
        L_0x003f:
            r6 = 128(0x80, float:1.794E-43)
        L_0x0041:
            r4 = r4 | r6
        L_0x0042:
            r13 = r4
            r4 = r13 & 731(0x2db, float:1.024E-42)
            r6 = 146(0x92, float:2.05E-43)
            if (r4 != r6) goto L_0x0057
            boolean r4 = r14.mo15011p()
            if (r4 != 0) goto L_0x0050
            goto L_0x0057
        L_0x0050:
            r14.mo14958a0()
            r32 = r14
            goto L_0x01e5
        L_0x0057:
            boolean r4 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r4 == 0) goto L_0x0063
            r4 = -1
            java.lang.String r6 = "com.carrefour.fid.android.presentation.ui.home.loyalty.CardNumberAutoAdjust (CardScan.kt:138)"
            androidx.compose.runtime.ComposerKt.m29845w0(r3, r13, r4, r6)
        L_0x0063:
            r3 = 814382534(0x308a7dc6, float:1.0076568E-9)
            r14.mo14918M(r3)
            androidx.compose.runtime.i1 r3 = androidx.compose.p004ui.platform.InspectionModeKt.m71067a()
            java.lang.Object r3 = r14.mo15032w(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            r4 = 1
            r8 = 0
            r9 = 0
            if (r3 == 0) goto L_0x00ee
            r3 = 9
            long r6 = androidx.compose.p004ui.unit.C16506u.m74712m(r3)
            androidx.compose.ui.text.style.r$a r3 = androidx.compose.p004ui.text.style.C16449r.f40760b
            int r17 = r3.mo47727c()
            androidx.compose.ui.m$a r3 = androidx.compose.p004ui.C8767m.f23478j
            androidx.compose.ui.m r3 = androidx.compose.foundation.layout.SizeKt.m10114n(r3, r8, r4, r9)
            androidx.compose.ui.c$a r4 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c r4 = r4.mo17063c()
            androidx.compose.ui.m r3 = r0.mo7701c(r3, r4)
            r4 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r16 = 0
            r23 = r13
            r13 = r16
            r36 = r14
            r14 = r16
            r18 = 0
            r15 = r18
            r18 = 0
            r19 = 1
            r20 = 0
            r21 = 0
            r22 = 0
            int r23 = r23 >> 6
            r4 = r23 & 14
            r4 = r4 | 3072(0xc00, float:4.305E-42)
            r24 = r4
            r25 = 3120(0xc30, float:4.372E-42)
            r26 = 120820(0x1d7f4, float:1.69305E-40)
            r4 = r2
            r2 = r35
            r23 = r36
            r4 = 0
            androidx.compose.material.TextKt.m14196c(r2, r3, r4, r6, r8, r9, r10, r11, r13, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r36.mo15002m0()
            boolean r2 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r2 == 0) goto L_0x00da
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x00da:
            androidx.compose.runtime.t1 r2 = r36.mo15020s()
            if (r2 != 0) goto L_0x00e1
            goto L_0x00ed
        L_0x00e1:
            com.carrefour.fid.android.presentation.ui.home.loyalty.CardScanKt$CardNumberAutoAdjust$1 r3 = new com.carrefour.fid.android.presentation.ui.home.loyalty.CardScanKt$CardNumberAutoAdjust$1
            r15 = r35
            r14 = r37
            r3.<init>(r0, r1, r15, r14)
            r2.mo15202a(r3)
        L_0x00ed:
            return
        L_0x00ee:
            r23 = r13
            r36 = r14
            r14 = r15
            r15 = r2
            r36.mo15002m0()
            androidx.compose.material.t0 r2 = androidx.compose.material.C7933t0.f19075a
            int r3 = androidx.compose.material.C7933t0.f19076b
            r13 = r36
            androidx.compose.material.w1 r2 = r2.mo11077c(r13, r3)
            androidx.compose.ui.text.p0 r2 = com.carrefour.fid.android.design.theme.C37477d.m153892d(r2)
            r3 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r13.mo14918M(r3)
            java.lang.Object r6 = r13.mo14921N()
            androidx.compose.runtime.o$a r7 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r10 = r7.mo16277a()
            if (r6 != r10) goto L_0x011e
            androidx.compose.runtime.z0 r6 = androidx.compose.runtime.C8539f2.m30981g(r2, r9, r5, r9)
            r13.mo14893C(r6)
        L_0x011e:
            r13.mo15002m0()
            androidx.compose.runtime.z0 r6 = (androidx.compose.runtime.C8700z0) r6
            r13.mo14918M(r3)
            java.lang.Object r2 = r13.mo14921N()
            java.lang.Object r3 = r7.mo16277a()
            if (r2 != r3) goto L_0x0139
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            androidx.compose.runtime.z0 r2 = androidx.compose.runtime.C8539f2.m30981g(r2, r9, r5, r9)
            r13.mo14893C(r2)
        L_0x0139:
            r13.mo15002m0()
            androidx.compose.runtime.z0 r2 = (androidx.compose.runtime.C8700z0) r2
            androidx.compose.ui.text.p0 r22 = m106405b(r6)
            androidx.compose.ui.m r3 = androidx.compose.foundation.layout.SizeKt.m10114n(r1, r8, r4, r9)
            androidx.compose.ui.c$a r4 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c r4 = r4.mo17063c()
            androidx.compose.ui.m r3 = r0.mo7701c(r3, r4)
            r4 = 1157296644(0x44faf204, float:2007.563)
            r13.mo14918M(r4)
            boolean r4 = r13.mo15006n0(r2)
            java.lang.Object r5 = r13.mo14921N()
            if (r4 != 0) goto L_0x0166
            java.lang.Object r4 = r7.mo16277a()
            if (r5 != r4) goto L_0x016e
        L_0x0166:
            com.carrefour.fid.android.presentation.ui.home.loyalty.CardScanKt$CardNumberAutoAdjust$2$1 r5 = new com.carrefour.fid.android.presentation.ui.home.loyalty.CardScanKt$CardNumberAutoAdjust$2$1
            r5.<init>(r2)
            r13.mo14893C(r5)
        L_0x016e:
            r13.mo15002m0()
            kotlin.jvm.functions.l r5 = (kotlin.jvm.functions.C11300l) r5
            androidx.compose.ui.m r3 = androidx.compose.p004ui.draw.DrawModifierKt.m32438c(r3, r5)
            r4 = 0
            r8 = 0
            r10 = 0
            r16 = 0
            r18 = 0
            r19 = 0
            r27 = 0
            r20 = 0
            r29 = 0
            r30 = 1
            r31 = 0
            r12 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r13.mo14918M(r12)
            boolean r12 = r13.mo15006n0(r6)
            boolean r21 = r13.mo15006n0(r2)
            r12 = r12 | r21
            java.lang.Object r11 = r13.mo14921N()
            if (r12 != 0) goto L_0x01a8
            java.lang.Object r7 = r7.mo16277a()
            if (r11 != r7) goto L_0x01b0
        L_0x01a8:
            com.carrefour.fid.android.presentation.ui.home.loyalty.CardScanKt$CardNumberAutoAdjust$3$1 r11 = new com.carrefour.fid.android.presentation.ui.home.loyalty.CardScanKt$CardNumberAutoAdjust$3$1
            r11.<init>(r6, r2)
            r13.mo14893C(r11)
        L_0x01b0:
            r13.mo15002m0()
            r21 = r11
            kotlin.jvm.functions.l r21 = (kotlin.jvm.functions.C11300l) r21
            int r2 = r23 >> 6
            r24 = r2 & 14
            r25 = 3456(0xd80, float:4.843E-42)
            r26 = 20476(0x4ffc, float:2.8693E-41)
            r2 = r35
            r6 = r8
            r8 = r10
            r9 = 0
            r10 = 0
            r11 = r16
            r32 = r13
            r13 = r18
            r14 = r19
            r15 = r27
            r17 = r20
            r18 = r29
            r19 = r30
            r20 = r31
            r23 = r32
            androidx.compose.material.TextKt.m14196c(r2, r3, r4, r6, r8, r9, r10, r11, r13, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            boolean r2 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r2 == 0) goto L_0x01e5
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x01e5:
            androidx.compose.runtime.t1 r2 = r32.mo15020s()
            if (r2 != 0) goto L_0x01ec
            goto L_0x01f8
        L_0x01ec:
            com.carrefour.fid.android.presentation.ui.home.loyalty.CardScanKt$CardNumberAutoAdjust$4 r3 = new com.carrefour.fid.android.presentation.ui.home.loyalty.CardScanKt$CardNumberAutoAdjust$4
            r4 = r35
            r5 = r37
            r3.<init>(r0, r1, r4, r5)
            r2.mo15202a(r3)
        L_0x01f8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.home.loyalty.CardScanKt.m106404a(androidx.compose.foundation.layout.h, androidx.compose.ui.m, java.lang.String, androidx.compose.runtime.o, int):void");
    }

    /* renamed from: b */
    public static final C16361p0 m106405b(C8700z0<C16361p0> z0Var) {
        return z0Var.getValue();
    }

    /* renamed from: c */
    public static final void m106406c(C8700z0<C16361p0> z0Var, C16361p0 p0Var) {
        z0Var.setValue(p0Var);
    }

    /* renamed from: d */
    public static final boolean m106407d(C8700z0<Boolean> z0Var) {
        return z0Var.getValue().booleanValue();
    }

    /* renamed from: e */
    public static final void m106408e(C8700z0<Boolean> z0Var, boolean z) {
        z0Var.setValue(Boolean.valueOf(z));
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: f */
    public static final void m106409f(@C12580l C8767m mVar, @C12579k String str, @C12579k C11289a<C11079d2> aVar, @C12580l C8592o oVar, int i, int i2) {
        int i3;
        C8767m mVar2;
        C8767m.C8768a aVar2;
        int i4;
        int i5;
        int i6;
        String str2 = str;
        C11289a<C11079d2> aVar3 = aVar;
        int i7 = i;
        Intrinsics.checkNotNullParameter(str2, "card");
        Intrinsics.checkNotNullParameter(aVar3, "onShowCard");
        C8592o o = oVar.mo15009o(1175101737);
        int i8 = i2 & 1;
        if (i8 != 0) {
            i3 = i7 | 6;
            mVar2 = mVar;
        } else if ((i7 & 14) == 0) {
            mVar2 = mVar;
            if (o.mo15006n0(mVar2)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i3 = i6 | i7;
        } else {
            mVar2 = mVar;
            i3 = i7;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i7 & 112) == 0) {
            if (o.mo15006n0(str2)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i2 & 4) != 0) {
            i3 |= C22132b.f56831b;
        } else if ((i7 & 896) == 0) {
            if (o.mo14927P(aVar3)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i3 |= i4;
        }
        if ((i3 & 731) != 146 || !o.mo15011p()) {
            if (i8 != 0) {
                aVar2 = C8767m.f23478j;
            } else {
                aVar2 = mVar2;
            }
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1175101737, i3, -1, "com.carrefour.fid.android.presentation.ui.home.loyalty.CardScan (CardScan.kt:49)");
            }
            C8767m mVar3 = aVar2;
            C7873k.m25025b(SizeKt.m10115o(SizeKt.m10114n(aVar2, 0.0f, 1, (Object) null), C16483g.m74435M((float) 180)), C2694o.m12166h(C37474a.f94133a.mo114189l()), 0, 0, (C2223i) null, C16483g.m74435M((float) 1), C8553b.m31048b(o, 1079384396, true, new CardScanKt$CardScan$1(aVar3, str2, i3, aVar2)), o, 1769472, 28);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
            mVar2 = mVar3;
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new CardScanKt$CardScan$2(mVar2, str, aVar, i, i2));
        }
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: g */
    public static final void m106410g(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(-1251965933);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1251965933, i, -1, "com.carrefour.fid.android.presentation.ui.home.loyalty.CardScanPreview (CardScan.kt:180)");
            }
            ThemeKt.m153788a(ComposableSingletons$CardScanKt.f60430a.mo70685a(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new CardScanKt$CardScanPreview$1(i));
        }
    }
}
