package androidx.compose.p004ui.text.input;

import android.graphics.Matrix;
import android.view.inputmethod.CursorAnchorInfo;
import androidx.compose.p004ui.geometry.C15098i;
import androidx.compose.p004ui.text.C16260h0;
import androidx.compose.p004ui.text.C16356n0;
import androidx.compose.p004ui.text.style.ResolvedTextDirection;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.ui.text.input.d */
public final class C16284d {
    @C12579k
    /* renamed from: a */
    public static final CursorAnchorInfo m73404a(@C12579k CursorAnchorInfo.Builder builder, @C12579k TextFieldValue textFieldValue, @C12579k C16260h0 h0Var, @C12579k Matrix matrix) {
        int i;
        Intrinsics.checkNotNullParameter(builder, "<this>");
        Intrinsics.checkNotNullParameter(textFieldValue, "textFieldValue");
        Intrinsics.checkNotNullParameter(h0Var, "textLayoutResult");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        builder.reset();
        builder.setMatrix(matrix);
        int l = C16356n0.m73740l(textFieldValue.mo47113h());
        builder.setSelectionRange(l, C16356n0.m73739k(textFieldValue.mo47113h()));
        m73405b(builder, l, h0Var);
        C16356n0 g = textFieldValue.mo47112g();
        int i2 = -1;
        if (g != null) {
            i = C16356n0.m73740l(g.mo47427r());
        } else {
            i = -1;
        }
        C16356n0 g2 = textFieldValue.mo47112g();
        if (g2 != null) {
            i2 = C16356n0.m73739k(g2.mo47427r());
        }
        boolean z = false;
        if (i >= 0 && i < i2) {
            z = true;
        }
        if (z) {
            builder.setComposingText(i, textFieldValue.mo47115i().subSequence(i, i2));
        }
        CursorAnchorInfo build = builder.build();
        Intrinsics.checkNotNullExpressionValue(build, "build()");
        return build;
    }

    /* renamed from: b */
    public static final CursorAnchorInfo.Builder m73405b(CursorAnchorInfo.Builder builder, int i, C16260h0 h0Var) {
        boolean z;
        if (i < 0) {
            return builder;
        }
        C15098i e = h0Var.mo47049e(i);
        int i2 = 0;
        if (h0Var.mo47047c(i) == ResolvedTextDirection.Rtl) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i2 = 4;
        }
        builder.setInsertionMarkerLocation(e.mo42279t(), e.mo42249B(), e.mo42271j(), e.mo42271j(), i2);
        return builder;
    }
}
