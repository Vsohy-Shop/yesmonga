package androidx.activity.compose;

import android.content.ContextWrapper;
import androidx.exifinterface.media.C19135a;
import com.urbanairship.iam.events.C9175a;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.activity.compose.a */
public final class C0225a {
    /* renamed from: a */
    public static final /* synthetic */ <T> T m1306a(T t) {
        Intrinsics.checkNotNullParameter(t, C9175a.f24932Y);
        while (t instanceof ContextWrapper) {
            Intrinsics.reifiedOperationMarker(3, C19135a.f48928d5);
            if (t instanceof Object) {
                return t;
            }
            t = ((ContextWrapper) t).getBaseContext();
            Intrinsics.checkNotNullExpressionValue(t, "innerContext.baseContext");
        }
        return null;
    }
}
