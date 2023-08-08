package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.collection.C1886l;
import androidx.core.internal.view.C17674b;
import androidx.core.internal.view.C17675c;

/* renamed from: androidx.appcompat.view.menu.c */
public abstract class C0557c {

    /* renamed from: l */
    public final Context f1548l;

    /* renamed from: m */
    public C1886l<C17674b, MenuItem> f1549m;

    /* renamed from: n */
    public C1886l<C17675c, SubMenu> f1550n;

    public C0557c(Context context) {
        this.f1548l = context;
    }

    /* renamed from: e */
    public final MenuItem mo1954e(MenuItem menuItem) {
        if (!(menuItem instanceof C17674b)) {
            return menuItem;
        }
        C17674b bVar = (C17674b) menuItem;
        if (this.f1549m == null) {
            this.f1549m = new C1886l<>();
        }
        MenuItem menuItem2 = this.f1549m.get(bVar);
        if (menuItem2 != null) {
            return menuItem2;
        }
        C0575k kVar = new C0575k(this.f1548l, bVar);
        this.f1549m.put(bVar, kVar);
        return kVar;
    }

    /* renamed from: f */
    public final SubMenu mo1955f(SubMenu subMenu) {
        if (!(subMenu instanceof C17675c)) {
            return subMenu;
        }
        C17675c cVar = (C17675c) subMenu;
        if (this.f1550n == null) {
            this.f1550n = new C1886l<>();
        }
        SubMenu subMenu2 = this.f1550n.get(cVar);
        if (subMenu2 != null) {
            return subMenu2;
        }
        C0595t tVar = new C0595t(this.f1548l, cVar);
        this.f1550n.put(cVar, tVar);
        return tVar;
    }

    /* renamed from: g */
    public final void mo1956g() {
        C1886l<C17674b, MenuItem> lVar = this.f1549m;
        if (lVar != null) {
            lVar.clear();
        }
        C1886l<C17675c, SubMenu> lVar2 = this.f1550n;
        if (lVar2 != null) {
            lVar2.clear();
        }
    }

    /* renamed from: h */
    public final void mo1957h(int i) {
        if (this.f1549m != null) {
            int i2 = 0;
            while (i2 < this.f1549m.size()) {
                if (this.f1549m.mo6334j(i2).getGroupId() == i) {
                    this.f1549m.mo6336m(i2);
                    i2--;
                }
                i2++;
            }
        }
    }

    /* renamed from: i */
    public final void mo1958i(int i) {
        if (this.f1549m != null) {
            for (int i2 = 0; i2 < this.f1549m.size(); i2++) {
                if (this.f1549m.mo6334j(i2).getItemId() == i) {
                    this.f1549m.mo6336m(i2);
                    return;
                }
            }
        }
    }
}
