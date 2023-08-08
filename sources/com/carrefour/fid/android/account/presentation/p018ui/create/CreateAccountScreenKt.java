package com.carrefour.fid.android.account.presentation.p018ui.create;

import android.annotation.SuppressLint;
import androidx.compose.foundation.layout.C2373k;
import androidx.compose.material.C3036d1;
import androidx.compose.material.ScaffoldKt;
import androidx.compose.material.SnackbarHostState;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8552a;
import androidx.compose.runtime.internal.C8553b;
import com.bumptech.glide.load.data.mediastore.C22132b;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nCreateAccountScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CreateAccountScreen.kt\ncom/carrefour/fid/android/account/presentation/ui/create/CreateAccountScreenKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,104:1\n67#2,3:105\n66#2:108\n1114#3,6:109\n*S KotlinDebug\n*F\n+ 1 CreateAccountScreen.kt\ncom/carrefour/fid/android/account/presentation/ui/create/CreateAccountScreenKt\n*L\n29#1:105,3\n29#1:108\n29#1:109,6\n*E\n"})
/* renamed from: com.carrefour.fid.android.account.presentation.ui.create.CreateAccountScreenKt */
public final class CreateAccountScreenKt {
    @SuppressLint({"UnusedMaterialScaffoldPaddingParameter"})
    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    public static final void m57997a(@C12579k String str, @C12579k String str2, @C12579k String str3, @C12579k C11300l<? super C13488a, C11079d2> lVar, @C12580l C8592o oVar, int i) {
        int i2;
        C8592o oVar2;
        int i3;
        int i4;
        int i5;
        int i6;
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        C11300l<? super C13488a, C11079d2> lVar2 = lVar;
        int i7 = i;
        Intrinsics.checkNotNullParameter(str4, "createAccountUrl");
        Intrinsics.checkNotNullParameter(str5, "signInUrl");
        Intrinsics.checkNotNullParameter(str6, "userAgent");
        Intrinsics.checkNotNullParameter(lVar2, "actioner");
        C8592o o = oVar.mo15009o(1768361971);
        if ((i7 & 14) == 0) {
            if (o.mo15006n0(str4)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i2 = i6 | i7;
        } else {
            i2 = i7;
        }
        if ((i7 & 112) == 0) {
            if (o.mo15006n0(str5)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i2 |= i5;
        }
        if ((i7 & 896) == 0) {
            if (o.mo15006n0(str6)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i2 |= i4;
        }
        if ((i7 & 7168) == 0) {
            if (o.mo14927P(lVar2)) {
                i3 = 2048;
            } else {
                i3 = 1024;
            }
            i2 |= i3;
        }
        int i8 = i2;
        if ((i8 & 5851) != 1170 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1768361971, i8, -1, "com.carrefour.fid.android.account.presentation.ui.create.CreateAccountScreen (CreateAccountScreen.kt:47)");
            }
            C8552a b = C8553b.m31048b(o, 1960224014, true, new CreateAccountScreenKt$CreateAccountScreen$1(lVar2, i8));
            CreateAccountScreenKt$CreateAccountScreen$2 createAccountScreenKt$CreateAccountScreen$2 = r0;
            C8592o oVar3 = o;
            CreateAccountScreenKt$CreateAccountScreen$2 createAccountScreenKt$CreateAccountScreen$22 = new CreateAccountScreenKt$CreateAccountScreen$2(str2, lVar, str3, str, i8);
            oVar2 = oVar3;
            ScaffoldKt.m13747a((C8767m) null, (C3036d1) null, b, (C11304p<? super C8592o, ? super Integer, C11079d2>) null, (C11305q<? super SnackbarHostState, ? super C8592o, ? super Integer, C11079d2>) null, (C11304p<? super C8592o, ? super Integer, C11079d2>) null, 0, false, (C11305q<? super C2373k, ? super C8592o, ? super Integer, C11079d2>) null, false, (C15218g4) null, 0.0f, 0, 0, 0, 0, 0, C8553b.m31048b(oVar3, -1580984715, true, createAccountScreenKt$CreateAccountScreen$2), oVar3, C22132b.f56831b, 12582912, 131067);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
            oVar2 = o;
        }
        C8678t1 s = oVar2.mo15020s();
        if (s != null) {
            s.mo15202a(new CreateAccountScreenKt$CreateAccountScreen$3(str, str2, str3, lVar, i));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: kotlin.jvm.functions.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: com.carrefour.fid.android.account.presentation.ui.create.CreateAccountScreenKt$CreateAccountStateful$3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: com.carrefour.fid.android.account.presentation.ui.create.CreateAccountScreenKt$CreateAccountStateful$2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: com.carrefour.fid.android.account.presentation.ui.create.CreateAccountScreenKt$CreateAccountStateful$1} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m57998b(@org.jetbrains.annotations.C12579k java.lang.String r15, @org.jetbrains.annotations.C12579k java.lang.String r16, @org.jetbrains.annotations.C12579k java.lang.String r17, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11289a<kotlin.C11079d2> r18, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11289a<kotlin.C11079d2> r19, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11300l<? super java.lang.String, kotlin.C11079d2> r20, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r21, int r22, int r23) {
        /*
            r6 = r15
            r7 = r16
            r8 = r17
            r9 = r22
            java.lang.String r0 = "createAccountUrl"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            java.lang.String r0 = "signInUrl"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "userAgent"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r0 = 369612523(0x1607d6eb, float:1.0973029E-25)
            r1 = r21
            androidx.compose.runtime.o r10 = r1.mo15009o(r0)
            r1 = r23 & 1
            if (r1 == 0) goto L_0x0026
            r1 = r9 | 6
            goto L_0x0036
        L_0x0026:
            r1 = r9 & 14
            if (r1 != 0) goto L_0x0035
            boolean r1 = r10.mo15006n0(r15)
            if (r1 == 0) goto L_0x0032
            r1 = 4
            goto L_0x0033
        L_0x0032:
            r1 = 2
        L_0x0033:
            r1 = r1 | r9
            goto L_0x0036
        L_0x0035:
            r1 = r9
        L_0x0036:
            r2 = r23 & 2
            if (r2 == 0) goto L_0x003d
            r1 = r1 | 48
            goto L_0x004d
        L_0x003d:
            r2 = r9 & 112(0x70, float:1.57E-43)
            if (r2 != 0) goto L_0x004d
            boolean r2 = r10.mo15006n0(r7)
            if (r2 == 0) goto L_0x004a
            r2 = 32
            goto L_0x004c
        L_0x004a:
            r2 = 16
        L_0x004c:
            r1 = r1 | r2
        L_0x004d:
            r2 = r23 & 4
            if (r2 == 0) goto L_0x0054
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0064
        L_0x0054:
            r2 = r9 & 896(0x380, float:1.256E-42)
            if (r2 != 0) goto L_0x0064
            boolean r2 = r10.mo15006n0(r8)
            if (r2 == 0) goto L_0x0061
            r2 = 256(0x100, float:3.59E-43)
            goto L_0x0063
        L_0x0061:
            r2 = 128(0x80, float:1.794E-43)
        L_0x0063:
            r1 = r1 | r2
        L_0x0064:
            r2 = r23 & 8
            if (r2 == 0) goto L_0x006b
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x007e
        L_0x006b:
            r3 = r9 & 7168(0x1c00, float:1.0045E-41)
            if (r3 != 0) goto L_0x007e
            r3 = r18
            boolean r4 = r10.mo14927P(r3)
            if (r4 == 0) goto L_0x007a
            r4 = 2048(0x800, float:2.87E-42)
            goto L_0x007c
        L_0x007a:
            r4 = 1024(0x400, float:1.435E-42)
        L_0x007c:
            r1 = r1 | r4
            goto L_0x0080
        L_0x007e:
            r3 = r18
        L_0x0080:
            r4 = r23 & 16
            if (r4 == 0) goto L_0x0087
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            goto L_0x009c
        L_0x0087:
            r5 = 57344(0xe000, float:8.0356E-41)
            r5 = r5 & r9
            if (r5 != 0) goto L_0x009c
            r5 = r19
            boolean r11 = r10.mo14927P(r5)
            if (r11 == 0) goto L_0x0098
            r11 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009a
        L_0x0098:
            r11 = 8192(0x2000, float:1.14794E-41)
        L_0x009a:
            r1 = r1 | r11
            goto L_0x009e
        L_0x009c:
            r5 = r19
        L_0x009e:
            r11 = r23 & 32
            if (r11 == 0) goto L_0x00a6
            r12 = 196608(0x30000, float:2.75506E-40)
            r1 = r1 | r12
            goto L_0x00ba
        L_0x00a6:
            r12 = 458752(0x70000, float:6.42848E-40)
            r12 = r12 & r9
            if (r12 != 0) goto L_0x00ba
            r12 = r20
            boolean r13 = r10.mo14927P(r12)
            if (r13 == 0) goto L_0x00b6
            r13 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b8
        L_0x00b6:
            r13 = 65536(0x10000, float:9.18355E-41)
        L_0x00b8:
            r1 = r1 | r13
            goto L_0x00bc
        L_0x00ba:
            r12 = r20
        L_0x00bc:
            r13 = 374491(0x5b6db, float:5.24774E-40)
            r13 = r13 & r1
            r14 = 74898(0x12492, float:1.04954E-40)
            if (r13 != r14) goto L_0x00d2
            boolean r13 = r10.mo15011p()
            if (r13 != 0) goto L_0x00cc
            goto L_0x00d2
        L_0x00cc:
            r10.mo14958a0()
            r4 = r3
            goto L_0x013e
        L_0x00d2:
            if (r2 == 0) goto L_0x00d8
            com.carrefour.fid.android.account.presentation.ui.create.CreateAccountScreenKt$CreateAccountStateful$1 r2 = com.carrefour.fid.android.account.presentation.p018ui.create.CreateAccountScreenKt$CreateAccountStateful$1.f32961f
            r13 = r2
            goto L_0x00d9
        L_0x00d8:
            r13 = r3
        L_0x00d9:
            if (r4 == 0) goto L_0x00df
            com.carrefour.fid.android.account.presentation.ui.create.CreateAccountScreenKt$CreateAccountStateful$2 r2 = com.carrefour.fid.android.account.presentation.p018ui.create.CreateAccountScreenKt$CreateAccountStateful$2.f32962f
            r14 = r2
            goto L_0x00e0
        L_0x00df:
            r14 = r5
        L_0x00e0:
            if (r11 == 0) goto L_0x00e5
            com.carrefour.fid.android.account.presentation.ui.create.CreateAccountScreenKt$CreateAccountStateful$3 r2 = com.carrefour.fid.android.account.presentation.p018ui.create.CreateAccountScreenKt$CreateAccountStateful$3.f32963f
            r12 = r2
        L_0x00e5:
            boolean r2 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r2 == 0) goto L_0x00f1
            r2 = -1
            java.lang.String r3 = "com.carrefour.fid.android.account.presentation.ui.create.CreateAccountStateful (CreateAccountScreen.kt:16)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r1, r2, r3)
        L_0x00f1:
            r0 = 1618982084(0x607fb4c4, float:7.370227E19)
            r10.mo14918M(r0)
            boolean r0 = r10.mo15006n0(r13)
            boolean r2 = r10.mo15006n0(r14)
            r0 = r0 | r2
            boolean r2 = r10.mo15006n0(r12)
            r0 = r0 | r2
            java.lang.Object r2 = r10.mo14921N()
            if (r0 != 0) goto L_0x0113
            androidx.compose.runtime.o$a r0 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r0 = r0.mo16277a()
            if (r2 != r0) goto L_0x011b
        L_0x0113:
            com.carrefour.fid.android.account.presentation.ui.create.CreateAccountScreenKt$CreateAccountStateful$4$1 r2 = new com.carrefour.fid.android.account.presentation.ui.create.CreateAccountScreenKt$CreateAccountStateful$4$1
            r2.<init>(r13, r14, r12)
            r10.mo14893C(r2)
        L_0x011b:
            r10.mo15002m0()
            r3 = r2
            kotlin.jvm.functions.l r3 = (kotlin.jvm.functions.C11300l) r3
            r0 = r1 & 14
            r2 = r1 & 112(0x70, float:1.57E-43)
            r0 = r0 | r2
            r1 = r1 & 896(0x380, float:1.256E-42)
            r5 = r0 | r1
            r0 = r15
            r1 = r16
            r2 = r17
            r4 = r10
            m57997a(r0, r1, r2, r3, r4, r5)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x013c
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x013c:
            r4 = r13
            r5 = r14
        L_0x013e:
            androidx.compose.runtime.t1 r10 = r10.mo15020s()
            if (r10 != 0) goto L_0x0145
            goto L_0x0158
        L_0x0145:
            com.carrefour.fid.android.account.presentation.ui.create.CreateAccountScreenKt$CreateAccountStateful$5 r11 = new com.carrefour.fid.android.account.presentation.ui.create.CreateAccountScreenKt$CreateAccountStateful$5
            r0 = r11
            r1 = r15
            r2 = r16
            r3 = r17
            r6 = r12
            r7 = r22
            r8 = r23
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r10.mo15202a(r11)
        L_0x0158:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.account.presentation.p018ui.create.CreateAccountScreenKt.m57998b(java.lang.String, java.lang.String, java.lang.String, kotlin.jvm.functions.a, kotlin.jvm.functions.a, kotlin.jvm.functions.l, androidx.compose.runtime.o, int, int):void");
    }
}
