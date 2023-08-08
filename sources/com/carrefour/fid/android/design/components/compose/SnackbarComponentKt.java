package com.carrefour.fid.android.design.components.compose;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material.SnackbarHostKt;
import androidx.compose.material.SnackbarHostState;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.tooling.preview.C16464c;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8553b;
import com.carrefour.fid.android.design.components.C36896b;
import com.carrefour.fid.android.design.theme.ThemeKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nSnackbarComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnackbarComponent.kt\ncom/carrefour/fid/android/design/components/compose/SnackbarComponentKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,139:1\n154#2:140\n*S KotlinDebug\n*F\n+ 1 SnackbarComponent.kt\ncom/carrefour/fid/android/design/components/compose/SnackbarComponentKt\n*L\n56#1:140\n*E\n"})
public final class SnackbarComponentKt {

    /* renamed from: com.carrefour.fid.android.design.components.compose.SnackbarComponentKt$a */
    public /* synthetic */ class C36962a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                com.carrefour.fid.android.design.components.compose.Variant[] r0 = com.carrefour.fid.android.design.components.compose.Variant.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.carrefour.fid.android.design.components.compose.Variant r1 = com.carrefour.fid.android.design.components.compose.Variant.Warning     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.carrefour.fid.android.design.components.compose.Variant r1 = com.carrefour.fid.android.design.components.compose.Variant.Error     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.carrefour.fid.android.design.components.compose.Variant r1 = com.carrefour.fid.android.design.components.compose.Variant.Success     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.design.components.compose.SnackbarComponentKt.C36962a.<clinit>():void");
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    public static final void m151647a(@C12579k SnackbarHostState snackbarHostState, @C12579k Variant variant, @C12580l C8592o oVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        Intrinsics.checkNotNullParameter(snackbarHostState, "snackbarHostState");
        Intrinsics.checkNotNullParameter(variant, "variant");
        C8592o o = oVar.mo15009o(-1295088273);
        if ((i & 14) == 0) {
            if (o.mo15006n0(snackbarHostState)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i2 = i7 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (o.mo15006n0(variant)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i2 |= i6;
        }
        if ((i2 & 91) != 18 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1295088273, i2, -1, "com.carrefour.fid.android.design.components.compose.SnackBarComponent (SnackbarComponent.kt:33)");
            }
            int[] iArr = C36962a.$EnumSwitchMapping$0;
            int i8 = iArr[variant.ordinal()];
            if (i8 == 1) {
                i3 = C36896b.C36902f.ds_orange_light;
            } else if (i8 == 2) {
                i3 = C36896b.C36902f.ds_red_light;
            } else if (i8 == 3) {
                i3 = C36896b.C36902f.ds_green_dark;
            } else {
                throw new NoWhenBranchMatchedException();
            }
            int i9 = iArr[variant.ordinal()];
            if (i9 == 1) {
                i4 = C36896b.C36904h.ds_gr_warning;
            } else if (i9 == 2) {
                i4 = C36896b.C36904h.ds_gr_red_error;
            } else if (i9 == 3) {
                i4 = C36896b.C36904h.ds_dark_gr_check;
            } else {
                throw new NoWhenBranchMatchedException();
            }
            int i10 = iArr[variant.ordinal()];
            if (i10 == 1) {
                i5 = C36896b.C36902f.ds_orange;
            } else if (i10 == 2) {
                i5 = C36896b.C36902f.ds_red_1;
            } else if (i10 == 3) {
                i5 = C36896b.C36902f.ds_green_dark;
            } else {
                throw new NoWhenBranchMatchedException();
            }
            SnackbarHostKt.m13845b(snackbarHostState, PaddingKt.m10024k(C8767m.f23478j, C16483g.m74435M((float) 16)), C8553b.m31048b(o, -1880623358, true, new SnackbarComponentKt$SnackBarComponent$1(i3, i4, i5)), o, (i2 & 14) | 432, 0);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new SnackbarComponentKt$SnackBarComponent$2(snackbarHostState, variant, i));
        }
    }

    @C8540g
    @C16464c(widthDp = 450)
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: b */
    public static final void m151648b(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(1207243972);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1207243972, i, -1, "com.carrefour.fid.android.design.components.compose.SnackBarComponentPreview (SnackbarComponent.kt:116)");
            }
            ThemeKt.m153788a(ComposableSingletons$SnackbarComponentKt.f92283a.mo112144b(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new SnackbarComponentKt$SnackBarComponentPreview$1(i));
        }
    }
}
