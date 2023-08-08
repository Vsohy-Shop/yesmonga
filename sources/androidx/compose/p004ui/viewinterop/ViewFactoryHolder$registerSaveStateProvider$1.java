package androidx.compose.p004ui.viewinterop;

import android.util.SparseArray;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo22516d2 = {"<anonymous>", "", "T", "Landroid/view/View;", "invoke"}, mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: androidx.compose.ui.viewinterop.ViewFactoryHolder$registerSaveStateProvider$1 */
public final class ViewFactoryHolder$registerSaveStateProvider$1 extends Lambda implements C11289a<Object> {
    final /* synthetic */ ViewFactoryHolder<T> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ViewFactoryHolder$registerSaveStateProvider$1(ViewFactoryHolder<T> viewFactoryHolder) {
        super(0);
        this.this$0 = viewFactoryHolder;
    }

    @C12580l
    public final Object invoke() {
        SparseArray sparseArray = new SparseArray();
        this.this$0.getTypedView().saveHierarchyState(sparseArray);
        return sparseArray;
    }
}
