package androidx.core.view;

import android.view.View;
import androidx.annotation.C0359n0;

/* renamed from: androidx.core.view.v1 */
public interface C18393v1 {
    int getNestedScrollAxes();

    boolean onNestedFling(@C0359n0 View view, float f, float f2, boolean z);

    boolean onNestedPreFling(@C0359n0 View view, float f, float f2);

    void onNestedPreScroll(@C0359n0 View view, int i, int i2, @C0359n0 int[] iArr);

    void onNestedScroll(@C0359n0 View view, int i, int i2, int i3, int i4);

    void onNestedScrollAccepted(@C0359n0 View view, @C0359n0 View view2, int i);

    boolean onStartNestedScroll(@C0359n0 View view, @C0359n0 View view2, int i);

    void onStopNestedScroll(@C0359n0 View view);
}
