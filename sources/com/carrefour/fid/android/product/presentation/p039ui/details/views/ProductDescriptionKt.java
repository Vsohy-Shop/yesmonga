package com.carrefour.fid.android.product.presentation.p039ui.details.views;

import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.p004ui.tooling.preview.C16464c;
import androidx.compose.runtime.C8410b2;
import androidx.compose.runtime.C8539f2;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.C8700z0;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8552a;
import androidx.compose.runtime.internal.C8553b;
import com.carrefour.fid.android.design.components.compose.ExpandButtonPosition;
import com.carrefour.fid.android.design.components.compose.ExpandableComponentKt;
import com.carrefour.fid.android.design.theme.ThemeKt;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11622t;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nProductDescription.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProductDescription.kt\ncom/carrefour/fid/android/product/presentation/ui/details/views/ProductDescriptionKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,103:1\n25#2:104\n25#2:111\n36#2:118\n1114#3,6:105\n1114#3,6:112\n1114#3,6:119\n76#4:125\n102#4,2:126\n76#4:128\n102#4,2:129\n*S KotlinDebug\n*F\n+ 1 ProductDescription.kt\ncom/carrefour/fid/android/product/presentation/ui/details/views/ProductDescriptionKt\n*L\n33#1:104\n34#1:111\n41#1:118\n33#1:105,6\n34#1:112,6\n41#1:119,6\n33#1:125\n33#1:126,2\n34#1:128\n34#1:129,2\n*E\n"})
/* renamed from: com.carrefour.fid.android.product.presentation.ui.details.views.ProductDescriptionKt */
public final class ProductDescriptionKt {

    /* renamed from: a */
    public static final int f67720a = 4;

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    public static final void m117218a(@C12580l C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(1125088214);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1125088214, i, -1, "com.carrefour.fid.android.product.presentation.ui.details.views.DescriptionPreview (ProductDescription.kt:65)");
            }
            ThemeKt.m153788a(ComposableSingletons$ProductDescriptionKt.f67658a.mo81220b(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new ProductDescriptionKt$DescriptionPreview$1(i));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: b */
    public static final void m117219b(@C12579k String str, @C12579k String str2, @C12579k String str3, @C12579k String str4, @C12579k C8767m mVar, @C12579k C11300l<? super Float, C11079d2> lVar, @C12580l C8592o oVar, int i) {
        int i2;
        C8592o oVar2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        String str5 = str;
        String str6 = str2;
        String str7 = str3;
        String str8 = str4;
        C8767m mVar2 = mVar;
        C11300l<? super Float, C11079d2> lVar2 = lVar;
        int i9 = i;
        Intrinsics.checkNotNullParameter(str5, "title");
        Intrinsics.checkNotNullParameter(str6, "text");
        Intrinsics.checkNotNullParameter(str7, "labelMore");
        Intrinsics.checkNotNullParameter(str8, "labelLess");
        Intrinsics.checkNotNullParameter(mVar2, "modifier");
        Intrinsics.checkNotNullParameter(lVar2, "onScrollPositionKnown");
        C8592o o = oVar.mo15009o(-385535399);
        if ((i9 & 14) == 0) {
            if (o.mo15006n0(str5)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i2 = i8 | i9;
        } else {
            i2 = i9;
        }
        if ((i9 & 112) == 0) {
            if (o.mo15006n0(str6)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i2 |= i7;
        }
        if ((i9 & 896) == 0) {
            if (o.mo15006n0(str7)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i2 |= i6;
        }
        if ((i9 & 7168) == 0) {
            if (o.mo15006n0(str8)) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i2 |= i5;
        }
        if ((57344 & i9) == 0) {
            if (o.mo15006n0(mVar2)) {
                i4 = 16384;
            } else {
                i4 = 8192;
            }
            i2 |= i4;
        }
        if ((458752 & i9) == 0) {
            if (o.mo14927P(lVar2)) {
                i3 = 131072;
            } else {
                i3 = 65536;
            }
            i2 |= i3;
        }
        if ((374491 & i2) != 74898 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-385535399, i2, -1, "com.carrefour.fid.android.product.presentation.ui.details.views.ProductDescription (ProductDescription.kt:23)");
            }
            if (!C11622t.isBlank(str2)) {
                o.mo14918M(-492369756);
                Object N = o.mo14921N();
                C8592o.C8593a aVar = C8592o.f23032a;
                if (N == aVar.mo16277a()) {
                    N = C8539f2.m30981g(Boolean.FALSE, (C8410b2) null, 2, (Object) null);
                    o.mo14893C(N);
                }
                o.mo15002m0();
                C8700z0 z0Var = (C8700z0) N;
                o.mo14918M(-492369756);
                Object N2 = o.mo14921N();
                if (N2 == aVar.mo16277a()) {
                    N2 = C8539f2.m30981g(Integer.MAX_VALUE, (C8410b2) null, 2, (Object) null);
                    o.mo14893C(N2);
                }
                o.mo15002m0();
                C8700z0 z0Var2 = (C8700z0) N2;
                boolean c = m117220c(z0Var);
                o.mo14918M(1157296644);
                boolean n0 = o.mo15006n0(lVar2);
                Object N3 = o.mo14921N();
                if (n0 || N3 == aVar.mo16277a()) {
                    N3 = new ProductDescriptionKt$ProductDescription$1$1(lVar2);
                    o.mo14893C(N3);
                }
                o.mo15002m0();
                C8767m a = OnGloballyPositionedModifierKt.m68999a(mVar2, (C11300l) N3);
                C8552a b = C8553b.m31048b(o, -361408936, true, new ProductDescriptionKt$ProductDescription$2(str6, z0Var, z0Var2, i2));
                int i10 = i2 & 14;
                int i11 = i2 >> 3;
                oVar2 = o;
                ExpandableComponentKt.m151485a(str, str3, str4, a, c, false, (C8734c.C8736b) null, (ExpandButtonPosition) null, 0, 0, (C11300l<? super Boolean, C11079d2>) null, b, oVar2, i10 | (i11 & 112) | (i11 & 896), 48, 2016);
            } else {
                oVar2 = o;
            }
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
            oVar2 = o;
        }
        C8678t1 s = oVar2.mo15020s();
        if (s != null) {
            s.mo15202a(new ProductDescriptionKt$ProductDescription$3(str, str2, str3, str4, mVar, lVar, i));
        }
    }

    /* renamed from: c */
    public static final boolean m117220c(C8700z0<Boolean> z0Var) {
        return z0Var.getValue().booleanValue();
    }

    /* renamed from: d */
    public static final void m117221d(C8700z0<Boolean> z0Var, boolean z) {
        z0Var.setValue(Boolean.valueOf(z));
    }

    /* renamed from: e */
    public static final int m117222e(C8700z0<Integer> z0Var) {
        return z0Var.getValue().intValue();
    }

    /* renamed from: f */
    public static final void m117223f(C8700z0<Integer> z0Var, int i) {
        z0Var.setValue(Integer.valueOf(i));
    }
}
