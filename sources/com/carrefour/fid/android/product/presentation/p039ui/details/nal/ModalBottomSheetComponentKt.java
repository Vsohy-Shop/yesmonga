package com.carrefour.fid.android.product.presentation.p039ui.details.nal;

import androidx.compose.foundation.layout.C2373k;
import androidx.compose.material.C3036d1;
import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.material.ScaffoldKt;
import androidx.compose.material.SnackbarHostState;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8544h;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8553b;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.product.presentation.ui.details.nal.ModalBottomSheetComponentKt */
public final class ModalBottomSheetComponentKt {
    @C8540g
    @C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: a */
    public static final void m116819a(@C12579k ModalBottomSheetState modalBottomSheetState, @C12579k C11305q<? super SnackbarHostState, ? super C8592o, ? super Integer, C11079d2> qVar, @C12579k C11305q<? super C2373k, ? super C8592o, ? super Integer, C11079d2> qVar2, @C12579k C11304p<? super C8592o, ? super Integer, C11079d2> pVar, @C12580l C8592o oVar, int i) {
        int i2;
        C8592o oVar2;
        int i3;
        int i4;
        int i5;
        int i6;
        ModalBottomSheetState modalBottomSheetState2 = modalBottomSheetState;
        C11305q<? super SnackbarHostState, ? super C8592o, ? super Integer, C11079d2> qVar3 = qVar;
        C11305q<? super C2373k, ? super C8592o, ? super Integer, C11079d2> qVar4 = qVar2;
        C11304p<? super C8592o, ? super Integer, C11079d2> pVar2 = pVar;
        int i7 = i;
        Intrinsics.checkNotNullParameter(modalBottomSheetState2, "modalBottomSheetState");
        Intrinsics.checkNotNullParameter(qVar3, "snackbarHost");
        Intrinsics.checkNotNullParameter(qVar4, "sheetContent");
        Intrinsics.checkNotNullParameter(pVar2, "content");
        C8592o o = oVar.mo15009o(963638590);
        if ((i7 & 14) == 0) {
            if (o.mo15006n0(modalBottomSheetState2)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i2 = i6 | i7;
        } else {
            i2 = i7;
        }
        if ((i7 & 112) == 0) {
            if (o.mo14927P(qVar3)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i2 |= i5;
        }
        if ((i7 & 896) == 0) {
            if (o.mo14927P(qVar4)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i2 |= i4;
        }
        if ((i7 & 7168) == 0) {
            if (o.mo14927P(pVar2)) {
                i3 = 2048;
            } else {
                i3 = 1024;
            }
            i2 |= i3;
        }
        int i8 = i2;
        if ((i8 & 5851) != 1170 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(963638590, i8, -1, "com.carrefour.fid.android.product.presentation.ui.details.nal.ModalBottomSheetComponent (ModalBottomSheetComponent.kt:15)");
            }
            int i9 = i8;
            C8592o oVar3 = o;
            oVar2 = oVar3;
            ScaffoldKt.m13747a((C8767m) null, (C3036d1) null, (C11304p<? super C8592o, ? super Integer, C11079d2>) null, (C11304p<? super C8592o, ? super Integer, C11079d2>) null, qVar, (C11304p<? super C8592o, ? super Integer, C11079d2>) null, 0, false, (C11305q<? super C2373k, ? super C8592o, ? super Integer, C11079d2>) null, false, (C15218g4) null, 0.0f, 0, 0, 0, 0, 0, C8553b.m31048b(oVar3, 1549142592, true, new ModalBottomSheetComponentKt$ModalBottomSheetComponent$1(modalBottomSheetState2, i9, qVar4, pVar2)), oVar3, (i9 << 9) & 57344, 12582912, 131055);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
            oVar2 = o;
        }
        C8678t1 s = oVar2.mo15020s();
        if (s != null) {
            s.mo15202a(new ModalBottomSheetComponentKt$ModalBottomSheetComponent$2(modalBottomSheetState, qVar, qVar2, pVar, i));
        }
    }
}
