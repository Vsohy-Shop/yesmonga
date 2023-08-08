package androidx.compose.p004ui.platform;

import android.view.View;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.ui.platform.i4 */
public interface C15902i4 {

    /* renamed from: androidx.compose.ui.platform.i4$a */
    public static final class C15903a {
        @C12580l
        @Deprecated
        /* renamed from: a */
        public static AbstractComposeView m71446a(@C12579k C15902i4 i4Var) {
            return C15902i4.super.getSubCompositionView();
        }

        @C12580l
        @Deprecated
        /* renamed from: b */
        public static View m71447b(@C12579k C15902i4 i4Var) {
            return C15902i4.super.getViewRoot();
        }
    }

    @C12580l
    AbstractComposeView getSubCompositionView() {
        return null;
    }

    @C12580l
    View getViewRoot() {
        return null;
    }
}
