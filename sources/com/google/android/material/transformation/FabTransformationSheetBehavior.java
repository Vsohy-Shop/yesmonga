package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.annotation.C0346i;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C18196h2;
import com.google.android.material.C31076a;
import com.google.android.material.animation.C31100h;
import com.google.android.material.animation.C31102j;
import com.google.android.material.transformation.FabTransformationBehavior;
import java.util.HashMap;
import java.util.Map;

@Deprecated
public class FabTransformationSheetBehavior extends FabTransformationBehavior {
    @C0363p0

    /* renamed from: l */
    public Map<View, Integer> f77286l;

    public FabTransformationSheetBehavior() {
    }

    @C0346i
    /* renamed from: K */
    public boolean mo92043K(@C0359n0 View view, @C0359n0 View view2, boolean z, boolean z2) {
        mo92078j0(view2, z);
        return super.mo92043K(view, view2, z, z2);
    }

    @C0359n0
    /* renamed from: h0 */
    public FabTransformationBehavior.C31733e mo92067h0(Context context, boolean z) {
        int i;
        if (z) {
            i = C31076a.C31078b.mtrl_fab_transformation_sheet_expand_spec;
        } else {
            i = C31076a.C31078b.mtrl_fab_transformation_sheet_collapse_spec;
        }
        FabTransformationBehavior.C31733e eVar = new FabTransformationBehavior.C31733e();
        eVar.f77275a = C31100h.m124662d(context, i);
        eVar.f77276b = new C31102j(17, 0.0f, 0.0f);
        return eVar;
    }

    /* renamed from: j0 */
    public final void mo92078j0(@C0359n0 View view, boolean z) {
        boolean z2;
        ViewParent parent = view.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                this.f77286l = new HashMap(childCount);
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (!(childAt.getLayoutParams() instanceof CoordinatorLayout.C16981g) || !(((CoordinatorLayout.C16981g) childAt.getLayoutParams()).mo51111f() instanceof FabTransformationScrimBehavior)) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (childAt != view && !z2) {
                    if (!z) {
                        Map<View, Integer> map = this.f77286l;
                        if (map != null && map.containsKey(childAt)) {
                            C18196h2.m82531R1(childAt, this.f77286l.get(childAt).intValue());
                        }
                    } else {
                        this.f77286l.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        C18196h2.m82531R1(childAt, 4);
                    }
                }
            }
            if (!z) {
                this.f77286l = null;
            }
        }
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
