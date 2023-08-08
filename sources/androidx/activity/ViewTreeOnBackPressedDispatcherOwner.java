package androidx.activity;

import android.view.View;
import androidx.activity.C0235d0;
import kotlin.jvm.C11314h;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11314h(name = "ViewTreeOnBackPressedDispatcherOwner")
public final class ViewTreeOnBackPressedDispatcherOwner {
    @C12580l
    @C11314h(name = "get")
    /* renamed from: a */
    public static final C0213a0 m1267a(@C12579k View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return (C0213a0) SequencesKt___SequencesKt.m44641F0(SequencesKt___SequencesKt.m44781p1(SequencesKt__SequencesKt.m44595l(view, C0210x8c7c000a.f695f), C0211x8c7c000b.f696f));
    }

    @C11314h(name = "set")
    /* renamed from: b */
    public static final void m1268b(@C12579k View view, @C12579k C0213a0 a0Var) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(a0Var, "onBackPressedDispatcherOwner");
        view.setTag(C0235d0.C0236a.view_tree_on_back_pressed_dispatcher_owner, a0Var);
    }
}
