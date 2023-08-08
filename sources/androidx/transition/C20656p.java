package androidx.transition;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.annotation.C0359n0;
import androidx.transition.C20538b0;
import java.util.ArrayList;

@SuppressLint({"ViewConstructor"})
/* renamed from: androidx.transition.p */
public class C20656p extends FrameLayout {
    @C0359n0

    /* renamed from: a */
    public ViewGroup f53277a;

    /* renamed from: b */
    public boolean f53278b = true;

    public C20656p(ViewGroup viewGroup) {
        super(viewGroup.getContext());
        setClipChildren(false);
        this.f53277a = viewGroup;
        viewGroup.setTag(C20538b0.C20545g.ghost_view_holder, this);
        C20685x0.m96147b(this.f53277a).mo61892c(this);
    }

    /* renamed from: b */
    public static C20656p m96069b(@C0359n0 ViewGroup viewGroup) {
        return (C20656p) viewGroup.getTag(C20538b0.C20545g.ghost_view_holder);
    }

    /* renamed from: d */
    public static void m96070d(View view, ArrayList<View> arrayList) {
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            m96070d((View) parent, arrayList);
        }
        arrayList.add(view);
    }

    /* renamed from: e */
    public static boolean m96071e(View view, View view2) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        int childCount = viewGroup.getChildCount();
        if (view.getZ() == view2.getZ()) {
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(C20685x0.m96146a(viewGroup, i));
                if (childAt == view) {
                    return false;
                }
                if (childAt == view2) {
                    break;
                }
            }
            return true;
        } else if (view.getZ() > view2.getZ()) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: f */
    public static boolean m96072f(ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        if (arrayList.isEmpty() || arrayList2.isEmpty() || arrayList.get(0) != arrayList2.get(0)) {
            return true;
        }
        int min = Math.min(arrayList.size(), arrayList2.size());
        for (int i = 1; i < min; i++) {
            View view = arrayList.get(i);
            View view2 = arrayList2.get(i);
            if (view != view2) {
                return m96071e(view, view2);
            }
        }
        if (arrayList2.size() == min) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo61857a(C20666r rVar) {
        ArrayList arrayList = new ArrayList();
        m96070d(rVar.f53322c, arrayList);
        int c = mo61858c(arrayList);
        if (c < 0 || c >= getChildCount()) {
            addView(rVar);
        } else {
            addView(rVar, c);
        }
    }

    /* renamed from: c */
    public final int mo61858c(ArrayList<View> arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int childCount = getChildCount() - 1;
        int i = 0;
        while (i <= childCount) {
            int i2 = (i + childCount) / 2;
            m96070d(((C20666r) getChildAt(i2)).f53322c, arrayList2);
            if (m96072f(arrayList, arrayList2)) {
                i = i2 + 1;
            } else {
                childCount = i2 - 1;
            }
            arrayList2.clear();
        }
        return i;
    }

    /* renamed from: g */
    public void mo61859g() {
        if (this.f53278b) {
            C20685x0.m96147b(this.f53277a).mo61893d(this);
            C20685x0.m96147b(this.f53277a).mo61892c(this);
            return;
        }
        throw new IllegalStateException("This GhostViewHolder is detached!");
    }

    public void onViewAdded(View view) {
        if (this.f53278b) {
            super.onViewAdded(view);
            return;
        }
        throw new IllegalStateException("This GhostViewHolder is detached!");
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if ((getChildCount() == 1 && getChildAt(0) == view) || getChildCount() == 0) {
            this.f53277a.setTag(C20538b0.C20545g.ghost_view_holder, (Object) null);
            C20685x0.m96147b(this.f53277a).mo61893d(this);
            this.f53278b = false;
        }
    }
}
