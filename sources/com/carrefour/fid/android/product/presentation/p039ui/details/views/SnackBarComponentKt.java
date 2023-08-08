package com.carrefour.fid.android.product.presentation.p039ui.details.views;

import androidx.compose.material.SnackbarHostKt;
import androidx.compose.material.SnackbarHostState;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.tooling.preview.C16464c;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8553b;
import com.bumptech.glide.load.data.mediastore.C22132b;
import com.carrefour.fid.android.design.theme.ThemeKt;
import com.carrefour.fid.android.product.presentation.p039ui.details.nal.C27906t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.product.presentation.ui.details.views.SnackBarComponentKt */
public final class SnackBarComponentKt {
    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    public static final void m117278a(@C12579k SnackbarHostState snackbarHostState, @C12579k C27906t tVar, @C12580l C8767m mVar, @C12580l C8592o oVar, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        Intrinsics.checkNotNullParameter(snackbarHostState, "snackbarHostState");
        Intrinsics.checkNotNullParameter(tVar, "variant");
        C8592o o = oVar.mo15009o(-1396870723);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (o.mo15006n0(snackbarHostState)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i3 = i6 | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            if (o.mo15006n0(tVar)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 |= C22132b.f56831b;
        } else if ((i & 896) == 0) {
            if (o.mo15006n0(mVar)) {
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
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1396870723, i3, -1, "com.carrefour.fid.android.product.presentation.ui.details.views.SnackBarComponent (SnackBarComponent.kt:33)");
            }
            SnackbarHostKt.m13845b(snackbarHostState, mVar, C8553b.m31048b(o, 1869531658, true, new SnackBarComponentKt$SnackBarComponent$1(tVar)), o, (i3 & 14) | C22132b.f56831b | ((i3 >> 3) & 112), 0);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8767m mVar2 = mVar;
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new SnackBarComponentKt$SnackBarComponent$2(snackbarHostState, tVar, mVar2, i, i2));
        }
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: b */
    public static final void m117279b(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(-734900745);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-734900745, i, -1, "com.carrefour.fid.android.product.presentation.ui.details.views.SnackBarComponentPreview (SnackBarComponent.kt:91)");
            }
            ThemeKt.m153788a(ComposableSingletons$SnackBarComponentKt.f67695a.mo81254a(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new SnackBarComponentKt$SnackBarComponentPreview$1(i));
        }
    }
}
