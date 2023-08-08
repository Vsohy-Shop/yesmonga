package androidx.lifecycle;

import android.view.View;
import androidx.lifecycle.runtime.C19464a;
import kotlin.jvm.C11314h;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11314h(name = "ViewTreeLifecycleOwner")
public final class ViewTreeLifecycleOwner {
    @C12580l
    @C11314h(name = "get")
    /* renamed from: a */
    public static final C19499w m90620a(@C12579k View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return (C19499w) SequencesKt___SequencesKt.m44641F0(SequencesKt___SequencesKt.m44781p1(SequencesKt__SequencesKt.m44595l(view, ViewTreeLifecycleOwner$findViewTreeLifecycleOwner$1.f49753f), ViewTreeLifecycleOwner$findViewTreeLifecycleOwner$2.f49754f));
    }

    @C11314h(name = "set")
    /* renamed from: b */
    public static final void m90621b(@C12579k View view, @C12580l C19499w wVar) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setTag(C19464a.C19465a.view_tree_lifecycle_owner, wVar);
    }
}
