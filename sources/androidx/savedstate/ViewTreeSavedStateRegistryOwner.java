package androidx.savedstate;

import android.view.View;
import androidx.savedstate.C20428a;
import kotlin.jvm.C11314h;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11314h(name = "ViewTreeSavedStateRegistryOwner")
public final class ViewTreeSavedStateRegistryOwner {
    @C12580l
    @C11314h(name = "get")
    /* renamed from: a */
    public static final C20437e m95251a(@C12579k View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return (C20437e) SequencesKt___SequencesKt.m44641F0(SequencesKt___SequencesKt.m44781p1(SequencesKt__SequencesKt.m44595l(view, C20426x10fac0e2.f52680f), C20427x10fac0e3.f52681f));
    }

    @C11314h(name = "set")
    /* renamed from: b */
    public static final void m95252b(@C12579k View view, @C12580l C20437e eVar) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setTag(C20428a.C20429a.view_tree_saved_state_registry_owner, eVar);
    }
}
