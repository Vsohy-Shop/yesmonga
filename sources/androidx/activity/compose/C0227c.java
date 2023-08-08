package androidx.activity.compose;

import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.ComponentActivity;
import androidx.compose.p004ui.platform.ComposeView;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8602q;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.activity.compose.c */
public final class C0227c {
    @C12579k

    /* renamed from: a */
    public static final ViewGroup.LayoutParams f726a = new ViewGroup.LayoutParams(-2, -2);

    /* renamed from: a */
    public static final void m1311a(@C12579k ComponentActivity componentActivity, @C12580l C8602q qVar, @C12579k C11304p<? super C8592o, ? super Integer, C11079d2> pVar) {
        ComposeView composeView;
        Intrinsics.checkNotNullParameter(componentActivity, "<this>");
        Intrinsics.checkNotNullParameter(pVar, "content");
        View childAt = ((ViewGroup) componentActivity.getWindow().getDecorView().findViewById(16908290)).getChildAt(0);
        if (childAt instanceof ComposeView) {
            composeView = (ComposeView) childAt;
        } else {
            composeView = null;
        }
        if (composeView != null) {
            composeView.setParentCompositionContext(qVar);
            composeView.setContent(pVar);
            return;
        }
        ComposeView composeView2 = new ComposeView(componentActivity, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        composeView2.setParentCompositionContext(qVar);
        composeView2.setContent(pVar);
        m1313c(componentActivity);
        componentActivity.setContentView(composeView2, f726a);
    }

    /* renamed from: b */
    public static /* synthetic */ void m1312b(ComponentActivity componentActivity, C8602q qVar, C11304p pVar, int i, Object obj) {
        if ((i & 1) != 0) {
            qVar = null;
        }
        m1311a(componentActivity, qVar, pVar);
    }

    /* renamed from: c */
    public static final void m1313c(ComponentActivity componentActivity) {
        View decorView = componentActivity.getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "window.decorView");
        if (ViewTreeLifecycleOwner.m90620a(decorView) == null) {
            ViewTreeLifecycleOwner.m90621b(decorView, componentActivity);
        }
        if (ViewTreeViewModelStoreOwner.m90624a(decorView) == null) {
            ViewTreeViewModelStoreOwner.m90625b(decorView, componentActivity);
        }
        if (ViewTreeSavedStateRegistryOwner.m95251a(decorView) == null) {
            ViewTreeSavedStateRegistryOwner.m95252b(decorView, componentActivity);
        }
    }
}
