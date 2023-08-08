package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;

/* renamed from: androidx.appcompat.view.menu.l */
public abstract class C0581l implements C0590q, C0585n, AdapterView.OnItemClickListener {

    /* renamed from: a */
    public Rect f1699a;

    /* renamed from: A */
    public static boolean m2796A(C0568g gVar) {
        int size = gVar.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = gVar.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: B */
    public static C0567f m2797B(ListAdapter listAdapter) {
        if (listAdapter instanceof HeaderViewListAdapter) {
            return (C0567f) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter();
        }
        return (C0567f) listAdapter;
    }

    /* renamed from: r */
    public static int m2798r(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i2 = 0;
        int i3 = 0;
        View view = null;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = listAdapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (viewGroup == null) {
                viewGroup = new FrameLayout(context);
            }
            view = listAdapter.getView(i4, view, viewGroup);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i2) {
                i2 = measuredWidth;
            }
        }
        return i2;
    }

    /* renamed from: d */
    public boolean mo1938d(C0568g gVar, C0573j jVar) {
        return false;
    }

    public int getId() {
        return 0;
    }

    /* renamed from: h */
    public C0587o mo1942h(ViewGroup viewGroup) {
        throw new UnsupportedOperationException("MenuPopups manage their own views");
    }

    /* renamed from: l */
    public boolean mo1945l(C0568g gVar, C0573j jVar) {
        return false;
    }

    /* renamed from: m */
    public void mo1946m(@C0359n0 Context context, @C0363p0 C0568g gVar) {
    }

    /* renamed from: n */
    public abstract void mo1971n(C0568g gVar);

    /* renamed from: o */
    public boolean mo1972o() {
        return true;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        int i2;
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        C0568g gVar = m2797B(listAdapter).f1605a;
        MenuItem menuItem = (MenuItem) listAdapter.getItem(i);
        if (mo1972o()) {
            i2 = 0;
        } else {
            i2 = 4;
        }
        gVar.mo2028P(menuItem, this, i2);
    }

    /* renamed from: p */
    public Rect mo2242p() {
        return this.f1699a;
    }

    /* renamed from: s */
    public abstract void mo1976s(View view);

    /* renamed from: t */
    public void mo2243t(Rect rect) {
        this.f1699a = rect;
    }

    /* renamed from: u */
    public abstract void mo1977u(boolean z);

    /* renamed from: v */
    public abstract void mo1978v(int i);

    /* renamed from: w */
    public abstract void mo1979w(int i);

    /* renamed from: x */
    public abstract void mo1980x(PopupWindow.OnDismissListener onDismissListener);

    /* renamed from: y */
    public abstract void mo1981y(boolean z);

    /* renamed from: z */
    public abstract void mo1982z(int i);
}
