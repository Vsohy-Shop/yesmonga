package androidx.lifecycle;

import android.view.View;
import androidx.lifecycle.viewmodel.C19493f;
import kotlin.jvm.C11314h;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11314h(name = "ViewTreeViewModelStoreOwner")
public final class ViewTreeViewModelStoreOwner {
    @C12580l
    @C11314h(name = "get")
    /* renamed from: a */
    public static final C19395b1 m90624a(@C12579k View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return (C19395b1) SequencesKt___SequencesKt.m44641F0(SequencesKt___SequencesKt.m44781p1(SequencesKt__SequencesKt.m44595l(view, ViewTreeViewModelStoreOwner$findViewTreeViewModelStoreOwner$1.f49755f), ViewTreeViewModelStoreOwner$findViewTreeViewModelStoreOwner$2.f49756f));
    }

    @C11314h(name = "set")
    /* renamed from: b */
    public static final void m90625b(@C12579k View view, @C12580l C19395b1 b1Var) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setTag(C19493f.C19494a.view_tree_view_model_store_owner, b1Var);
    }
}
