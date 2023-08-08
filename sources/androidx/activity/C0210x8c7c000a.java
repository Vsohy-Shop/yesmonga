package androidx.activity;

import android.view.View;
import android.view.ViewParent;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo22516d2 = {"Landroid/view/View;", "it", "a", "(Landroid/view/View;)Landroid/view/View;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: androidx.activity.ViewTreeOnBackPressedDispatcherOwner$findViewTreeOnBackPressedDispatcherOwner$1 */
public final class C0210x8c7c000a extends Lambda implements C11300l<View, View> {

    /* renamed from: f */
    public static final C0210x8c7c000a f695f = new C0210x8c7c000a();

    public C0210x8c7c000a() {
        super(1);
    }

    @C12580l
    /* renamed from: a */
    public final View invoke(@C12579k View view) {
        Intrinsics.checkNotNullParameter(view, "it");
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            return (View) parent;
        }
        return null;
    }
}
