package androidx.compose.p004ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import com.urbanairship.iam.events.C9175a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C0376v0(26)
/* renamed from: androidx.compose.ui.text.font.v0 */
public final class C16247v0 {
    @C12579k

    /* renamed from: a */
    public static final C16247v0 f40354a = new C16247v0();

    @C12579k
    @C0373u
    /* renamed from: a */
    public final Typeface mo47019a(@C12579k Context context, @C12579k C16245u0 u0Var) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(u0Var, "font");
        Typeface a = context.getResources().getFont(u0Var.mo47015h());
        Intrinsics.checkNotNullExpressionValue(a, "context.resources.getFont(font.resId)");
        return a;
    }
}
