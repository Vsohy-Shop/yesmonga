package androidx.navigation;

import android.view.View;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"Landroid/view/View;", "it", "Landroidx/navigation/NavController;", "a", "(Landroid/view/View;)Landroidx/navigation/NavController;"}, mo22517k = 3, mo22518mv = {1, 6, 0})
public final class Navigation$findViewNavController$2 extends Lambda implements C11300l<View, NavController> {

    /* renamed from: f */
    public static final Navigation$findViewNavController$2 f50478f = new Navigation$findViewNavController$2();

    public Navigation$findViewNavController$2() {
        super(1);
    }

    @C12580l
    /* renamed from: a */
    public final NavController invoke(@C12579k View view) {
        Intrinsics.checkNotNullParameter(view, "it");
        return Navigation.f50476a.mo58312m(view);
    }
}
