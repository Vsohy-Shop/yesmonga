package androidx.core.view;

import androidx.annotation.C0363p0;

/* renamed from: androidx.core.view.r1 */
public interface C18355r1 {
    boolean dispatchNestedFling(float f, float f2, boolean z);

    boolean dispatchNestedPreFling(float f, float f2);

    boolean dispatchNestedPreScroll(int i, int i2, @C0363p0 int[] iArr, @C0363p0 int[] iArr2);

    boolean dispatchNestedScroll(int i, int i2, int i3, int i4, @C0363p0 int[] iArr);

    boolean hasNestedScrollingParent();

    boolean isNestedScrollingEnabled();

    void setNestedScrollingEnabled(boolean z);

    boolean startNestedScroll(int i);

    void stopNestedScroll();
}
