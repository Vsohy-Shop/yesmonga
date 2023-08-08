package androidx.browser.browseractions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;
import androidx.browser.C0873a;

@Deprecated
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class BrowserActionsFallbackMenuView extends LinearLayout {

    /* renamed from: a */
    public final int f2727a = getResources().getDimensionPixelOffset(C0873a.C0875b.browser_actions_context_menu_min_padding);

    /* renamed from: b */
    public final int f2728b = getResources().getDimensionPixelOffset(C0873a.C0875b.browser_actions_context_menu_max_width);

    public BrowserActionsFallbackMenuView(@C0359n0 Context context, @C0359n0 AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(getResources().getDisplayMetrics().widthPixels - (this.f2727a * 2), this.f2728b), 1073741824), i2);
    }
}
