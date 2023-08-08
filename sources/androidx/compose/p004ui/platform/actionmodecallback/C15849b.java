package androidx.compose.p004ui.platform.actionmodecallback;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import com.usabilla.sdk.ubform.telemetry.C10108c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.ui.platform.actionmodecallback.b */
public final class C15849b implements ActionMode.Callback {
    @C12579k

    /* renamed from: a */
    public final C15850c f39490a;

    public C15849b(@C12579k C15850c cVar) {
        Intrinsics.checkNotNullParameter(cVar, C10108c.f27778C);
        this.f39490a = cVar;
    }

    public boolean onActionItemClicked(@C12580l ActionMode actionMode, @C12580l MenuItem menuItem) {
        return this.f39490a.mo45667i(actionMode, menuItem);
    }

    public boolean onCreateActionMode(@C12580l ActionMode actionMode, @C12580l Menu menu) {
        return this.f39490a.mo45668j(actionMode, menu);
    }

    public void onDestroyActionMode(@C12580l ActionMode actionMode) {
        this.f39490a.mo45669k();
    }

    public boolean onPrepareActionMode(@C12580l ActionMode actionMode, @C12580l Menu menu) {
        return this.f39490a.mo45670l(actionMode, menu);
    }
}
