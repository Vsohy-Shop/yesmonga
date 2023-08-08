package androidx.compose.p004ui.text.platform;

import android.content.Context;
import android.graphics.Typeface;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import com.urbanairship.iam.events.C9175a;
import kotlin.C11395k;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11395k(message = "Only used by deprecated APIs in this file, remove with them.")
@C0376v0(26)
/* renamed from: androidx.compose.ui.text.platform.i */
public final class C16380i {
    @C12579k

    /* renamed from: a */
    public static final C16380i f40634a = new C16380i();

    @C0376v0(26)
    @C12579k
    @C0373u
    /* renamed from: a */
    public final Typeface mo47542a(@C12579k Context context, int i) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Typeface a = context.getResources().getFont(i);
        Intrinsics.checkNotNullExpressionValue(a, "context.resources.getFont(resourceId)");
        return a;
    }
}
