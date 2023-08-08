package androidx.compose.p004ui.text.platform.extensions;

import android.text.style.TtsSpan;
import androidx.compose.p004ui.text.C16405r0;
import androidx.compose.p004ui.text.C16452t0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.ui.text.platform.extensions.e */
public final class C16374e {
    @C12579k
    /* renamed from: a */
    public static final TtsSpan m73923a(@C12579k C16405r0 r0Var) {
        Intrinsics.checkNotNullParameter(r0Var, "<this>");
        if (r0Var instanceof C16452t0) {
            return m73924b((C16452t0) r0Var);
        }
        throw new NoWhenBranchMatchedException();
    }

    @C12579k
    /* renamed from: b */
    public static final TtsSpan m73924b(@C12579k C16452t0 t0Var) {
        Intrinsics.checkNotNullParameter(t0Var, "<this>");
        TtsSpan build = new TtsSpan.VerbatimBuilder(t0Var.mo47751a()).build();
        Intrinsics.checkNotNullExpressionValue(build, "builder.build()");
        return build;
    }
}
