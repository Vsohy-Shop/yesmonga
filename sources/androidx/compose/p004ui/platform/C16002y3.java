package androidx.compose.p004ui.platform;

import android.view.ActionMode;
import android.view.View;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import com.google.android.gms.analytics.ecommerce.C40383c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C0376v0(23)
/* renamed from: androidx.compose.ui.platform.y3 */
public final class C16002y3 {
    @C12579k

    /* renamed from: a */
    public static final C16002y3 f39689a = new C16002y3();

    @C0376v0(23)
    @C0373u
    /* renamed from: a */
    public final void mo45981a(@C12579k ActionMode actionMode) {
        Intrinsics.checkNotNullParameter(actionMode, "actionMode");
        actionMode.invalidateContentRect();
    }

    @C12580l
    @C0376v0(23)
    @C0373u
    /* renamed from: b */
    public final ActionMode mo45982b(@C12579k View view, @C12579k ActionMode.Callback callback, int i) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        Intrinsics.checkNotNullParameter(callback, "actionModeCallback");
        return view.startActionMode(callback, i);
    }
}
