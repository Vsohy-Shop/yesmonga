package com.carrefour.fid.android.widget;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import androidx.compose.runtime.internal.C8567o;
import com.urbanairship.messagecenter.MessageCenterFragment;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.widget.b */
public final class C22841b {
    @C12579k

    /* renamed from: a */
    public static final C22841b f58414a = new C22841b();

    /* renamed from: b */
    public static final int f58415b = 0;

    /* renamed from: a */
    public final void mo67303a(@C12579k ExpandableListView expandableListView, int i) {
        ExpandableListView expandableListView2 = expandableListView;
        int i2 = i;
        Intrinsics.checkNotNullParameter(expandableListView2, MessageCenterFragment.f25491y);
        ExpandableListAdapter expandableListAdapter = expandableListView.getExpandableListAdapter();
        Intrinsics.checkNotNull(expandableListAdapter, "null cannot be cast to non-null type android.widget.ExpandableListAdapter");
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(expandableListView.getWidth(), 1073741824);
        int groupCount = expandableListAdapter.getGroupCount();
        int i3 = 0;
        for (int i4 = 0; i4 < groupCount; i4++) {
            View groupView = expandableListAdapter.getGroupView(i4, false, (View) null, expandableListView2);
            groupView.measure(makeMeasureSpec, 0);
            i3 += groupView.getMeasuredHeight();
            if ((expandableListView2.isGroupExpanded(i4) && i4 != i2) || (!expandableListView2.isGroupExpanded(i4) && i4 == i2)) {
                int childrenCount = expandableListAdapter.getChildrenCount(i4);
                int i5 = i3;
                for (int i6 = 0; i6 < childrenCount; i6++) {
                    View childView = expandableListAdapter.getChildView(i4, i6, false, (View) null, expandableListView);
                    childView.measure(makeMeasureSpec, 0);
                    i5 += childView.getMeasuredHeight();
                }
                i3 = i5;
            }
        }
        ViewGroup.LayoutParams layoutParams = expandableListView.getLayoutParams();
        int dividerHeight = i3 + (expandableListView.getDividerHeight() * (expandableListAdapter.getGroupCount() - 1));
        if (dividerHeight < 10) {
            dividerHeight = 200;
        }
        layoutParams.height = dividerHeight;
        expandableListView2.setLayoutParams(layoutParams);
        expandableListView.requestLayout();
    }
}
