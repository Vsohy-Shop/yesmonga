package androidx.savedstate;

import android.view.View;
import androidx.savedstate.C20428a;
import com.google.android.gms.analytics.ecommerce.C40383c;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"Landroid/view/View;", "view", "Landroidx/savedstate/e;", "a", "(Landroid/view/View;)Landroidx/savedstate/e;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: androidx.savedstate.ViewTreeSavedStateRegistryOwner$findViewTreeSavedStateRegistryOwner$2 */
public final class C20427x10fac0e3 extends Lambda implements C11300l<View, C20437e> {

    /* renamed from: f */
    public static final C20427x10fac0e3 f52681f = new C20427x10fac0e3();

    public C20427x10fac0e3() {
        super(1);
    }

    @C12580l
    /* renamed from: a */
    public final C20437e invoke(@C12579k View view) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        Object tag = view.getTag(C20428a.C20429a.view_tree_saved_state_registry_owner);
        if (tag instanceof C20437e) {
            return (C20437e) tag;
        }
        return null;
    }
}
