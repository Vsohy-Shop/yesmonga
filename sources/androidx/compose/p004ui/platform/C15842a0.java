package androidx.compose.p004ui.platform;

import android.content.Context;
import android.graphics.Typeface;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import com.urbanairship.iam.events.C9175a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C0376v0(26)
/* renamed from: androidx.compose.ui.platform.a0 */
public final class C15842a0 {
    @C12579k

    /* renamed from: a */
    public static final C15842a0 f39476a = new C15842a0();

    @C0376v0(26)
    @C12579k
    @C0373u
    /* renamed from: a */
    public final Typeface mo45637a(@C12579k Context context, int i) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Typeface a = context.getResources().getFont(i);
        Intrinsics.checkNotNullExpressionValue(a, "context.resources.getFont(resourceId)");
        return a;
    }
}
