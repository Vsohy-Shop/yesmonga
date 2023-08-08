package androidx.compose.p004ui.platform.actionmodecallback;

import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.C0376v0;
import androidx.compose.p004ui.geometry.C15098i;
import com.usabilla.sdk.ubform.telemetry.C10108c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C0376v0(23)
/* renamed from: androidx.compose.ui.platform.actionmodecallback.a */
public final class C15848a extends ActionMode.Callback2 {
    @C12579k

    /* renamed from: a */
    public final C15850c f39489a;

    public C15848a(@C12579k C15850c cVar) {
        Intrinsics.checkNotNullParameter(cVar, C10108c.f27778C);
        this.f39489a = cVar;
    }

    public boolean onActionItemClicked(@C12580l ActionMode actionMode, @C12580l MenuItem menuItem) {
        return this.f39489a.mo45667i(actionMode, menuItem);
    }

    public boolean onCreateActionMode(@C12580l ActionMode actionMode, @C12580l Menu menu) {
        return this.f39489a.mo45668j(actionMode, menu);
    }

    public void onDestroyActionMode(@C12580l ActionMode actionMode) {
        this.f39489a.mo45669k();
    }

    public void onGetContentRect(@C12580l ActionMode actionMode, @C12580l View view, @C12580l Rect rect) {
        C15098i h = this.f39489a.mo45666h();
        if (rect != null) {
            rect.set((int) h.mo42279t(), (int) h.mo42249B(), (int) h.mo42283x(), (int) h.mo42271j());
        }
    }

    public boolean onPrepareActionMode(@C12580l ActionMode actionMode, @C12580l Menu menu) {
        return this.f39489a.mo45670l(actionMode, menu);
    }
}
