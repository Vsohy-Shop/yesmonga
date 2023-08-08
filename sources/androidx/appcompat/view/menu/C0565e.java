package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.annotation.RestrictTo;
import androidx.appcompat.C0387a;
import androidx.appcompat.view.menu.C0585n;
import androidx.appcompat.view.menu.C0587o;
import java.util.ArrayList;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.appcompat.view.menu.e */
public class C0565e implements C0585n, AdapterView.OnItemClickListener {

    /* renamed from: y */
    public static final String f1591y = "ListMenuPresenter";

    /* renamed from: z */
    public static final String f1592z = "android:menu:list";

    /* renamed from: a */
    public Context f1593a;

    /* renamed from: b */
    public LayoutInflater f1594b;

    /* renamed from: c */
    public C0568g f1595c;

    /* renamed from: d */
    public ExpandedMenuView f1596d;

    /* renamed from: e */
    public int f1597e;

    /* renamed from: f */
    public int f1598f;

    /* renamed from: g */
    public int f1599g;

    /* renamed from: v */
    public C0585n.C0586a f1600v;

    /* renamed from: w */
    public C0566a f1601w;

    /* renamed from: x */
    public int f1602x;

    /* renamed from: androidx.appcompat.view.menu.e$a */
    public class C0566a extends BaseAdapter {

        /* renamed from: a */
        public int f1603a = -1;

        public C0566a() {
            mo1997a();
        }

        /* renamed from: a */
        public void mo1997a() {
            C0573j y = C0565e.this.f1595c.mo2101y();
            if (y != null) {
                ArrayList<C0573j> C = C0565e.this.f1595c.mo2016C();
                int size = C.size();
                for (int i = 0; i < size; i++) {
                    if (C.get(i) == y) {
                        this.f1603a = i;
                        return;
                    }
                }
            }
            this.f1603a = -1;
        }

        /* renamed from: b */
        public C0573j getItem(int i) {
            ArrayList<C0573j> C = C0565e.this.f1595c.mo2016C();
            int i2 = i + C0565e.this.f1597e;
            int i3 = this.f1603a;
            if (i3 >= 0 && i2 >= i3) {
                i2++;
            }
            return C.get(i2);
        }

        public int getCount() {
            int size = C0565e.this.f1595c.mo2016C().size() - C0565e.this.f1597e;
            if (this.f1603a < 0) {
                return size;
            }
            return size - 1;
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                C0565e eVar = C0565e.this;
                view = eVar.f1594b.inflate(eVar.f1599g, viewGroup, false);
            }
            ((C0587o.C0588a) view).mo1832d(getItem(i), 0);
            return view;
        }

        public void notifyDataSetChanged() {
            mo1997a();
            super.notifyDataSetChanged();
        }
    }

    public C0565e(Context context, int i) {
        this(i, 0);
        this.f1593a = context;
        this.f1594b = LayoutInflater.from(context);
    }

    /* renamed from: a */
    public ListAdapter mo1990a() {
        if (this.f1601w == null) {
            this.f1601w = new C0566a();
        }
        return this.f1601w;
    }

    /* renamed from: b */
    public void mo1936b(C0568g gVar, boolean z) {
        C0585n.C0586a aVar = this.f1600v;
        if (aVar != null) {
            aVar.mo1207b(gVar, z);
        }
    }

    /* renamed from: c */
    public int mo1991c() {
        return this.f1597e;
    }

    /* renamed from: d */
    public boolean mo1938d(C0568g gVar, C0573j jVar) {
        return false;
    }

    /* renamed from: e */
    public void mo1939e(C0585n.C0586a aVar) {
        this.f1600v = aVar;
    }

    /* renamed from: f */
    public void mo1969f(Parcelable parcelable) {
        mo1992n((Bundle) parcelable);
    }

    /* renamed from: g */
    public boolean mo1940g(C0594s sVar) {
        if (!sVar.hasVisibleItems()) {
            return false;
        }
        new C0571h(sVar).mo2105e((IBinder) null);
        C0585n.C0586a aVar = this.f1600v;
        if (aVar == null) {
            return true;
        }
        aVar.mo1208c(sVar);
        return true;
    }

    public int getId() {
        return this.f1602x;
    }

    /* renamed from: h */
    public C0587o mo1942h(ViewGroup viewGroup) {
        if (this.f1596d == null) {
            this.f1596d = (ExpandedMenuView) this.f1594b.inflate(C0387a.C0397j.abc_expanded_menu_layout, viewGroup, false);
            if (this.f1601w == null) {
                this.f1601w = new C0566a();
            }
            this.f1596d.setAdapter(this.f1601w);
            this.f1596d.setOnItemClickListener(this);
        }
        return this.f1596d;
    }

    /* renamed from: i */
    public Parcelable mo1970i() {
        if (this.f1596d == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        mo1993o(bundle);
        return bundle;
    }

    /* renamed from: j */
    public void mo1943j(boolean z) {
        C0566a aVar = this.f1601w;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    /* renamed from: k */
    public boolean mo1944k() {
        return false;
    }

    /* renamed from: l */
    public boolean mo1945l(C0568g gVar, C0573j jVar) {
        return false;
    }

    /* renamed from: m */
    public void mo1946m(Context context, C0568g gVar) {
        if (this.f1598f != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, this.f1598f);
            this.f1593a = contextThemeWrapper;
            this.f1594b = LayoutInflater.from(contextThemeWrapper);
        } else if (this.f1593a != null) {
            this.f1593a = context;
            if (this.f1594b == null) {
                this.f1594b = LayoutInflater.from(context);
            }
        }
        this.f1595c = gVar;
        C0566a aVar = this.f1601w;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    /* renamed from: n */
    public void mo1992n(Bundle bundle) {
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.f1596d.restoreHierarchyState(sparseParcelableArray);
        }
    }

    /* renamed from: o */
    public void mo1993o(Bundle bundle) {
        SparseArray sparseArray = new SparseArray();
        ExpandedMenuView expandedMenuView = this.f1596d;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f1595c.mo2028P(this.f1601w.getItem(i), this, 0);
    }

    /* renamed from: p */
    public void mo1995p(int i) {
        this.f1602x = i;
    }

    /* renamed from: q */
    public void mo1996q(int i) {
        this.f1597e = i;
        if (this.f1596d != null) {
            mo1943j(false);
        }
    }

    public C0565e(int i, int i2) {
        this.f1599g = i;
        this.f1598f = i2;
    }
}
