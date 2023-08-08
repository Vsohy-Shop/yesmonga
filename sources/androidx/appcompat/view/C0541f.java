package androidx.appcompat.view;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.C0535b;
import androidx.appcompat.view.menu.C0575k;
import androidx.appcompat.view.menu.C0589p;
import androidx.collection.C1886l;
import androidx.core.internal.view.C17673a;
import androidx.core.internal.view.C17674b;
import java.util.ArrayList;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.appcompat.view.f */
public class C0541f extends ActionMode {

    /* renamed from: a */
    public final Context f1408a;

    /* renamed from: b */
    public final C0535b f1409b;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: androidx.appcompat.view.f$a */
    public static class C0542a implements C0535b.C0536a {

        /* renamed from: a */
        public final ActionMode.Callback f1410a;

        /* renamed from: b */
        public final Context f1411b;

        /* renamed from: c */
        public final ArrayList<C0541f> f1412c = new ArrayList<>();

        /* renamed from: d */
        public final C1886l<Menu, Menu> f1413d = new C1886l<>();

        public C0542a(Context context, ActionMode.Callback callback) {
            this.f1411b = context;
            this.f1410a = callback;
        }

        /* renamed from: a */
        public void mo1209a(C0535b bVar) {
            this.f1410a.onDestroyActionMode(mo1790e(bVar));
        }

        /* renamed from: b */
        public boolean mo1210b(C0535b bVar, Menu menu) {
            return this.f1410a.onCreateActionMode(mo1790e(bVar), mo1791f(menu));
        }

        /* renamed from: c */
        public boolean mo1211c(C0535b bVar, MenuItem menuItem) {
            return this.f1410a.onActionItemClicked(mo1790e(bVar), new C0575k(this.f1411b, (C17674b) menuItem));
        }

        /* renamed from: d */
        public boolean mo1212d(C0535b bVar, Menu menu) {
            return this.f1410a.onPrepareActionMode(mo1790e(bVar), mo1791f(menu));
        }

        /* renamed from: e */
        public ActionMode mo1790e(C0535b bVar) {
            int size = this.f1412c.size();
            for (int i = 0; i < size; i++) {
                C0541f fVar = this.f1412c.get(i);
                if (fVar != null && fVar.f1409b == bVar) {
                    return fVar;
                }
            }
            C0541f fVar2 = new C0541f(this.f1411b, bVar);
            this.f1412c.add(fVar2);
            return fVar2;
        }

        /* renamed from: f */
        public final Menu mo1791f(Menu menu) {
            Menu menu2 = this.f1413d.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            C0589p pVar = new C0589p(this.f1411b, (C17673a) menu);
            this.f1413d.put(menu, pVar);
            return pVar;
        }
    }

    public C0541f(Context context, C0535b bVar) {
        this.f1408a = context;
        this.f1409b = bVar;
    }

    public void finish() {
        this.f1409b.mo1452c();
    }

    public View getCustomView() {
        return this.f1409b.mo1453d();
    }

    public Menu getMenu() {
        return new C0589p(this.f1408a, (C17673a) this.f1409b.mo1454e());
    }

    public MenuInflater getMenuInflater() {
        return this.f1409b.mo1455f();
    }

    public CharSequence getSubtitle() {
        return this.f1409b.mo1456g();
    }

    public Object getTag() {
        return this.f1409b.mo1753h();
    }

    public CharSequence getTitle() {
        return this.f1409b.mo1457i();
    }

    public boolean getTitleOptionalHint() {
        return this.f1409b.mo1754j();
    }

    public void invalidate() {
        this.f1409b.mo1458k();
    }

    public boolean isTitleOptional() {
        return this.f1409b.mo1459l();
    }

    public void setCustomView(View view) {
        this.f1409b.mo1460n(view);
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f1409b.mo1462p(charSequence);
    }

    public void setTag(Object obj) {
        this.f1409b.mo1756q(obj);
    }

    public void setTitle(CharSequence charSequence) {
        this.f1409b.mo1464s(charSequence);
    }

    public void setTitleOptionalHint(boolean z) {
        this.f1409b.mo1465t(z);
    }

    public void setSubtitle(int i) {
        this.f1409b.mo1461o(i);
    }

    public void setTitle(int i) {
        this.f1409b.mo1463r(i);
    }
}
