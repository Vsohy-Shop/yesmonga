package com.carrefour.fid.android.design.components.compose;

import androidx.compose.material.AndroidAlertDialog_androidKt;
import androidx.compose.material.C7933t0;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.tooling.preview.C16464c;
import androidx.compose.p004ui.window.C16541b;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8553b;
import com.carrefour.fid.android.design.components.compose.C36984f;
import com.carrefour.fid.android.design.theme.ThemeKt;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class DialogComponentKt {
    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    public static final void m151478a(@C12579k C36984f.C36985a aVar, @C12580l C8592o oVar, int i) {
        int i2;
        C8592o oVar2;
        int i3;
        C36984f.C36985a aVar2 = aVar;
        int i4 = i;
        Intrinsics.checkNotNullParameter(aVar2, "data");
        C8592o o = oVar.mo15009o(-1581405628);
        if ((i4 & 14) == 0) {
            if (o.mo15006n0(aVar2)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i4;
        } else {
            i2 = i4;
        }
        if ((i2 & 11) != 2 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1581405628, i2, -1, "com.carrefour.fid.android.design.components.compose.AlertDialogComponent (DialogComponent.kt:74)");
            }
            oVar2 = o;
            AndroidAlertDialog_androidKt.m13200a(DialogComponentKt$AlertDialogComponent$1.f92292f, C8553b.m31048b(o, -2068733188, true, new DialogComponentKt$AlertDialogComponent$2(aVar2, i2)), (C8767m) null, (C11304p<? super C8592o, ? super Integer, C11079d2>) null, C8553b.m31048b(o, -1561301863, true, new DialogComponentKt$AlertDialogComponent$3(aVar2)), C8553b.m31048b(o, -1392158088, true, new DialogComponentKt$AlertDialogComponent$4(aVar2)), C7933t0.f19075a.mo11076b(o, C7933t0.f19076b).mo10757d(), 0, 0, (C16541b) null, o, 221238, 908);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
            oVar2 = o;
        }
        C8678t1 s = oVar2.mo15020s();
        if (s != null) {
            s.mo15202a(new DialogComponentKt$AlertDialogComponent$5(aVar2, i4));
        }
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: b */
    public static final void m151479b(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(1199084618);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1199084618, i, -1, "com.carrefour.fid.android.design.components.compose.AlertDialogComponentPreview (DialogComponent.kt:125)");
            }
            ThemeKt.m153788a(ComposableSingletons$DialogComponentKt.f92166a.mo112052b(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new DialogComponentKt$AlertDialogComponentPreview$1(i));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: c */
    public static final void m151480c(@C12579k C36984f.C36986b bVar, @C12580l C8592o oVar, int i) {
        int i2;
        C8592o oVar2;
        int i3;
        C36984f.C36986b bVar2 = bVar;
        int i4 = i;
        Intrinsics.checkNotNullParameter(bVar2, "data");
        C8592o o = oVar.mo15009o(-1931886892);
        if ((i4 & 14) == 0) {
            if (o.mo15006n0(bVar2)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i4;
        } else {
            i2 = i4;
        }
        if ((i2 & 11) != 2 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1931886892, i2, -1, "com.carrefour.fid.android.design.components.compose.ConfirmationDialogComponent (DialogComponent.kt:34)");
            }
            oVar2 = o;
            AndroidAlertDialog_androidKt.m13200a(DialogComponentKt$ConfirmationDialogComponent$1.f92293f, C8553b.m31048b(o, -282061428, true, new DialogComponentKt$ConfirmationDialogComponent$2(bVar2, i2)), (C8767m) null, C8553b.m31048b(o, 1817677002, true, new DialogComponentKt$ConfirmationDialogComponent$3(bVar2, i2)), C8553b.m31048b(o, -1427421079, true, new DialogComponentKt$ConfirmationDialogComponent$4(bVar2)), C8553b.m31048b(o, -377551864, true, new DialogComponentKt$ConfirmationDialogComponent$5(bVar2)), C7933t0.f19075a.mo11076b(o, C7933t0.f19076b).mo10757d(), 0, 0, (C16541b) null, o, 224310, 900);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
            oVar2 = o;
        }
        C8678t1 s = oVar2.mo15020s();
        if (s != null) {
            s.mo15202a(new DialogComponentKt$ConfirmationDialogComponent$6(bVar2, i4));
        }
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: d */
    public static final void m151481d(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(997396287);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(997396287, i, -1, "com.carrefour.fid.android.design.components.compose.ConfirmationDialogComponentPreview (DialogComponent.kt:108)");
            }
            ThemeKt.m153788a(ComposableSingletons$DialogComponentKt.f92166a.mo112051a(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new DialogComponentKt$ConfirmationDialogComponentPreview$1(i));
        }
    }
}
