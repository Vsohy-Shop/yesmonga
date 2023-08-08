package androidx.lifecycle;

import android.view.View;
import android.view.ViewParent;
import com.google.android.gms.analytics.ecommerce.C40383c;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo22516d2 = {"Landroid/view/View;", "view", "a", "(Landroid/view/View;)Landroid/view/View;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class ViewTreeViewModelStoreOwner$findViewTreeViewModelStoreOwner$1 extends Lambda implements C11300l<View, View> {

    /* renamed from: f */
    public static final ViewTreeViewModelStoreOwner$findViewTreeViewModelStoreOwner$1 f49755f = new ViewTreeViewModelStoreOwner$findViewTreeViewModelStoreOwner$1();

    public ViewTreeViewModelStoreOwner$findViewTreeViewModelStoreOwner$1() {
        super(1);
    }

    @C12580l
    /* renamed from: a */
    public final View invoke(@C12579k View view) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            return (View) parent;
        }
        return null;
    }
}
