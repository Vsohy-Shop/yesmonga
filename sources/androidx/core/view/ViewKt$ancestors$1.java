package androidx.core.view;

import android.view.ViewParent;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 7, 1}, mo22520xi = 48)
public /* synthetic */ class ViewKt$ancestors$1 extends FunctionReferenceImpl implements C11300l<ViewParent, ViewParent> {

    /* renamed from: a */
    public static final ViewKt$ancestors$1 f46534a = new ViewKt$ancestors$1();

    public ViewKt$ancestors$1() {
        super(1, ViewParent.class, "getParent", "getParent()Landroid/view/ViewParent;", 0);
    }

    /* renamed from: d */
    public final ViewParent invoke(@C12579k ViewParent viewParent) {
        Intrinsics.checkNotNullParameter(viewParent, "p0");
        return viewParent.getParent();
    }
}
