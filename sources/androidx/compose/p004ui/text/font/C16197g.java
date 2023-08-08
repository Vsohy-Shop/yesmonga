package androidx.compose.p004ui.text.font;

import android.content.Context;
import android.os.Build;
import com.urbanairship.iam.events.C9175a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.ui.text.font.g */
public final class C16197g {
    @C12579k
    /* renamed from: a */
    public static final C16193f m72982a(@C12579k Context context) {
        int i;
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        if (Build.VERSION.SDK_INT >= 31) {
            i = context.getResources().getConfiguration().fontWeightAdjustment;
        } else {
            i = 0;
        }
        return new C16193f(i);
    }
}
