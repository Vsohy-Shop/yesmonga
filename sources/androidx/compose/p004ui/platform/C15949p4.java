package androidx.compose.p004ui.platform;

import android.view.ViewParent;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C0376v0(26)
/* renamed from: androidx.compose.ui.platform.p4 */
public final class C15949p4 {
    @C12579k

    /* renamed from: a */
    public static final C15949p4 f39655a = new C15949p4();

    @C0373u
    /* renamed from: a */
    public final void mo45928a(@C12579k AndroidComposeView androidComposeView) {
        Intrinsics.checkNotNullParameter(androidComposeView, "ownerView");
        ViewParent parent = androidComposeView.getParent();
        if (parent != null) {
            parent.onDescendantInvalidated(androidComposeView, androidComposeView);
        }
    }
}
