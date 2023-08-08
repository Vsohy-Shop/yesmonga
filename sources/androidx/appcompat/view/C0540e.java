package androidx.appcompat.view;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.C0535b;
import androidx.appcompat.view.menu.C0568g;
import androidx.appcompat.view.menu.C0582m;
import androidx.appcompat.view.menu.C0594s;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.appcompat.view.e */
public class C0540e extends C0535b implements C0568g.C0569a {

    /* renamed from: c */
    public Context f1401c;

    /* renamed from: d */
    public ActionBarContextView f1402d;

    /* renamed from: e */
    public C0535b.C0536a f1403e;

    /* renamed from: f */
    public WeakReference<View> f1404f;

    /* renamed from: g */
    public boolean f1405g;

    /* renamed from: v */
    public boolean f1406v;

    /* renamed from: w */
    public C0568g f1407w;

    public C0540e(Context context, ActionBarContextView actionBarContextView, C0535b.C0536a aVar, boolean z) {
        this.f1401c = context;
        this.f1402d = actionBarContextView;
        this.f1403e = aVar;
        C0568g Z = new C0568g(actionBarContextView.getContext()).mo2038Z(1);
        this.f1407w = Z;
        Z.mo2036X(this);
        this.f1406v = z;
    }

    /* renamed from: a */
    public boolean mo1111a(@C0359n0 C0568g gVar, @C0359n0 MenuItem menuItem) {
        return this.f1403e.mo1211c(this, menuItem);
    }

    /* renamed from: b */
    public void mo1114b(@C0359n0 C0568g gVar) {
        mo1458k();
        this.f1402d.mo2344o();
    }

    /* renamed from: c */
    public void mo1452c() {
        if (!this.f1405g) {
            this.f1405g = true;
            this.f1403e.mo1209a(this);
        }
    }

    /* renamed from: d */
    public View mo1453d() {
        WeakReference<View> weakReference = this.f1404f;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* renamed from: e */
    public Menu mo1454e() {
        return this.f1407w;
    }

    /* renamed from: f */
    public MenuInflater mo1455f() {
        return new C0543g(this.f1402d.getContext());
    }

    /* renamed from: g */
    public CharSequence mo1456g() {
        return this.f1402d.getSubtitle();
    }

    /* renamed from: i */
    public CharSequence mo1457i() {
        return this.f1402d.getTitle();
    }

    /* renamed from: k */
    public void mo1458k() {
        this.f1403e.mo1212d(this, this.f1407w);
    }

    /* renamed from: l */
    public boolean mo1459l() {
        return this.f1402d.mo2353s();
    }

    /* renamed from: m */
    public boolean mo1755m() {
        return this.f1406v;
    }

    /* renamed from: n */
    public void mo1460n(View view) {
        WeakReference<View> weakReference;
        this.f1402d.setCustomView(view);
        if (view != null) {
            weakReference = new WeakReference<>(view);
        } else {
            weakReference = null;
        }
        this.f1404f = weakReference;
    }

    /* renamed from: o */
    public void mo1461o(int i) {
        mo1462p(this.f1401c.getString(i));
    }

    /* renamed from: p */
    public void mo1462p(CharSequence charSequence) {
        this.f1402d.setSubtitle(charSequence);
    }

    /* renamed from: r */
    public void mo1463r(int i) {
        mo1464s(this.f1401c.getString(i));
    }

    /* renamed from: s */
    public void mo1464s(CharSequence charSequence) {
        this.f1402d.setTitle(charSequence);
    }

    /* renamed from: t */
    public void mo1465t(boolean z) {
        super.mo1465t(z);
        this.f1402d.setTitleOptional(z);
    }

    /* renamed from: u */
    public void mo1770u(C0568g gVar, boolean z) {
    }

    /* renamed from: v */
    public void mo1771v(C0594s sVar) {
    }

    /* renamed from: w */
    public boolean mo1772w(C0594s sVar) {
        if (!sVar.hasVisibleItems()) {
            return true;
        }
        new C0582m(this.f1402d.getContext(), sVar).mo2254l();
        return true;
    }
}
