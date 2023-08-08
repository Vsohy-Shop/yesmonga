package com.carrefour.fid.android.product.presentation.p039ui.details.nal;

import androidx.compose.foundation.C2223i;
import androidx.compose.foundation.shape.C2694o;
import androidx.compose.material.SurfaceKt;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.tooling.preview.C16464c;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8553b;
import com.carrefour.fid.android.design.theme.C37475b;
import com.carrefour.fid.android.design.theme.ThemeKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.product.presentation.ui.details.nal.TagComponentKt */
public final class TagComponentKt {
    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    public static final void m116921a(@C12579k String str, @C12580l C8592o oVar, int i) {
        int i2;
        int i3;
        Intrinsics.checkNotNullParameter(str, "text");
        C8592o o = oVar.mo15009o(1623392628);
        if ((i & 14) == 0) {
            if (o.mo15006n0(str)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1623392628, i2, -1, "com.carrefour.fid.android.product.presentation.ui.details.nal.Tag (TagComponent.kt:16)");
            }
            SurfaceKt.m13879b((C8767m) null, C2694o.m12161c(50), C37475b.f94185a.mo114206C(), 0, (C2223i) null, 0.0f, C8553b.m31048b(o, 233681080, true, new TagComponentKt$Tag$1(str, i2)), o, 1572864, 57);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new TagComponentKt$Tag$2(str, i));
        }
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: b */
    public static final void m116922b(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(935530995);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(935530995, i, -1, "com.carrefour.fid.android.product.presentation.ui.details.nal.TagPreview (TagComponent.kt:33)");
            }
            ThemeKt.m153788a(ComposableSingletons$TagComponentKt.f67431a.mo80804a(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new TagComponentKt$TagPreview$1(i));
        }
    }
}
