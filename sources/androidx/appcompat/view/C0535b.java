package androidx.appcompat.view;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.RestrictTo;

/* renamed from: androidx.appcompat.view.b */
public abstract class C0535b {

    /* renamed from: a */
    public Object f1393a;

    /* renamed from: b */
    public boolean f1394b;

    /* renamed from: androidx.appcompat.view.b$a */
    public interface C0536a {
        /* renamed from: a */
        void mo1209a(C0535b bVar);

        /* renamed from: b */
        boolean mo1210b(C0535b bVar, Menu menu);

        /* renamed from: c */
        boolean mo1211c(C0535b bVar, MenuItem menuItem);

        /* renamed from: d */
        boolean mo1212d(C0535b bVar, Menu menu);
    }

    /* renamed from: c */
    public abstract void mo1452c();

    /* renamed from: d */
    public abstract View mo1453d();

    /* renamed from: e */
    public abstract Menu mo1454e();

    /* renamed from: f */
    public abstract MenuInflater mo1455f();

    /* renamed from: g */
    public abstract CharSequence mo1456g();

    /* renamed from: h */
    public Object mo1753h() {
        return this.f1393a;
    }

    /* renamed from: i */
    public abstract CharSequence mo1457i();

    /* renamed from: j */
    public boolean mo1754j() {
        return this.f1394b;
    }

    /* renamed from: k */
    public abstract void mo1458k();

    /* renamed from: l */
    public boolean mo1459l() {
        return false;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: m */
    public boolean mo1755m() {
        return true;
    }

    /* renamed from: n */
    public abstract void mo1460n(View view);

    /* renamed from: o */
    public abstract void mo1461o(int i);

    /* renamed from: p */
    public abstract void mo1462p(CharSequence charSequence);

    /* renamed from: q */
    public void mo1756q(Object obj) {
        this.f1393a = obj;
    }

    /* renamed from: r */
    public abstract void mo1463r(int i);

    /* renamed from: s */
    public abstract void mo1464s(CharSequence charSequence);

    /* renamed from: t */
    public void mo1465t(boolean z) {
        this.f1394b = z;
    }
}
