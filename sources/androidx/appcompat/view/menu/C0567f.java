package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.C0587o;
import java.util.ArrayList;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.appcompat.view.menu.f */
public class C0567f extends BaseAdapter {

    /* renamed from: a */
    public C0568g f1605a;

    /* renamed from: b */
    public int f1606b = -1;

    /* renamed from: c */
    public boolean f1607c;

    /* renamed from: d */
    public final boolean f1608d;

    /* renamed from: e */
    public final LayoutInflater f1609e;

    /* renamed from: f */
    public final int f1610f;

    public C0567f(C0568g gVar, LayoutInflater layoutInflater, boolean z, int i) {
        this.f1608d = z;
        this.f1609e = layoutInflater;
        this.f1605a = gVar;
        this.f1610f = i;
        mo2004a();
    }

    /* renamed from: a */
    public void mo2004a() {
        C0573j y = this.f1605a.mo2101y();
        if (y != null) {
            ArrayList<C0573j> C = this.f1605a.mo2016C();
            int size = C.size();
            for (int i = 0; i < size; i++) {
                if (C.get(i) == y) {
                    this.f1606b = i;
                    return;
                }
            }
        }
        this.f1606b = -1;
    }

    /* renamed from: b */
    public C0568g mo2005b() {
        return this.f1605a;
    }

    /* renamed from: c */
    public boolean mo2006c() {
        return this.f1607c;
    }

    /* renamed from: d */
    public C0573j getItem(int i) {
        ArrayList<C0573j> arrayList;
        if (this.f1608d) {
            arrayList = this.f1605a.mo2016C();
        } else {
            arrayList = this.f1605a.mo2020H();
        }
        int i2 = this.f1606b;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return arrayList.get(i);
    }

    /* renamed from: e */
    public void mo2008e(boolean z) {
        this.f1607c = z;
    }

    public int getCount() {
        ArrayList<C0573j> arrayList;
        if (this.f1608d) {
            arrayList = this.f1605a.mo2016C();
        } else {
            arrayList = this.f1605a.mo2020H();
        }
        if (this.f1606b < 0) {
            return arrayList.size();
        }
        return arrayList.size() - 1;
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        int i2;
        boolean z;
        if (view == null) {
            view = this.f1609e.inflate(this.f1610f, viewGroup, false);
        }
        int groupId = getItem(i).getGroupId();
        int i3 = i - 1;
        if (i3 >= 0) {
            i2 = getItem(i3).getGroupId();
        } else {
            i2 = groupId;
        }
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (!this.f1605a.mo2021I() || groupId == i2) {
            z = false;
        } else {
            z = true;
        }
        listMenuItemView.setGroupDividerEnabled(z);
        C0587o.C0588a aVar = (C0587o.C0588a) view;
        if (this.f1607c) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.mo1832d(getItem(i), 0);
        return view;
    }

    public void notifyDataSetChanged() {
        mo2004a();
        super.notifyDataSetChanged();
    }
}
