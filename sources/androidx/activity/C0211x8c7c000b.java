package androidx.activity;

import android.view.View;
import androidx.activity.C0235d0;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"Landroid/view/View;", "it", "Landroidx/activity/a0;", "a", "(Landroid/view/View;)Landroidx/activity/a0;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: androidx.activity.ViewTreeOnBackPressedDispatcherOwner$findViewTreeOnBackPressedDispatcherOwner$2 */
public final class C0211x8c7c000b extends Lambda implements C11300l<View, C0213a0> {

    /* renamed from: f */
    public static final C0211x8c7c000b f696f = new C0211x8c7c000b();

    public C0211x8c7c000b() {
        super(1);
    }

    @C12580l
    /* renamed from: a */
    public final C0213a0 invoke(@C12579k View view) {
        Intrinsics.checkNotNullParameter(view, "it");
        Object tag = view.getTag(C0235d0.C0236a.view_tree_on_back_pressed_dispatcher_owner);
        if (tag instanceof C0213a0) {
            return (C0213a0) tag;
        }
        return null;
    }
}
