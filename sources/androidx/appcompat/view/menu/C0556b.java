package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.C0585n;
import androidx.appcompat.view.menu.C0587o;
import java.util.ArrayList;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.appcompat.view.menu.b */
public abstract class C0556b implements C0585n {

    /* renamed from: a */
    public Context f1538a;

    /* renamed from: b */
    public Context f1539b;

    /* renamed from: c */
    public C0568g f1540c;

    /* renamed from: d */
    public LayoutInflater f1541d;

    /* renamed from: e */
    public LayoutInflater f1542e;

    /* renamed from: f */
    public C0585n.C0586a f1543f;

    /* renamed from: g */
    public int f1544g;

    /* renamed from: v */
    public int f1545v;

    /* renamed from: w */
    public C0587o f1546w;

    /* renamed from: x */
    public int f1547x;

    public C0556b(Context context, int i, int i2) {
        this.f1538a = context;
        this.f1541d = LayoutInflater.from(context);
        this.f1544g = i;
        this.f1545v = i2;
    }

    /* renamed from: b */
    public void mo1936b(C0568g gVar, boolean z) {
        C0585n.C0586a aVar = this.f1543f;
        if (aVar != null) {
            aVar.mo1207b(gVar, z);
        }
    }

    /* renamed from: c */
    public void mo1937c(View view, int i) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f1546w).addView(view, i);
    }

    /* renamed from: d */
    public boolean mo1938d(C0568g gVar, C0573j jVar) {
        return false;
    }

    /* renamed from: e */
    public void mo1939e(C0585n.C0586a aVar) {
        this.f1543f = aVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
        return false;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo1940g(androidx.appcompat.view.menu.C0594s r2) {
        /*
            r1 = this;
            androidx.appcompat.view.menu.n$a r0 = r1.f1543f
            if (r0 == 0) goto L_0x000e
            if (r2 == 0) goto L_0x0007
            goto L_0x0009
        L_0x0007:
            androidx.appcompat.view.menu.g r2 = r1.f1540c
        L_0x0009:
            boolean r2 = r0.mo1208c(r2)
            return r2
        L_0x000e:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.C0556b.mo1940g(androidx.appcompat.view.menu.s):boolean");
    }

    public int getId() {
        return this.f1547x;
    }

    /* renamed from: h */
    public C0587o mo1942h(ViewGroup viewGroup) {
        if (this.f1546w == null) {
            C0587o oVar = (C0587o) this.f1541d.inflate(this.f1544g, viewGroup, false);
            this.f1546w = oVar;
            oVar.mo1858c(this.f1540c);
            mo1943j(true);
        }
        return this.f1546w;
    }

    /* renamed from: j */
    public void mo1943j(boolean z) {
        C0573j jVar;
        ViewGroup viewGroup = (ViewGroup) this.f1546w;
        if (viewGroup != null) {
            C0568g gVar = this.f1540c;
            int i = 0;
            if (gVar != null) {
                gVar.mo2097u();
                ArrayList<C0573j> H = this.f1540c.mo2020H();
                int size = H.size();
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    C0573j jVar2 = H.get(i3);
                    if (mo1953t(i2, jVar2)) {
                        View childAt = viewGroup.getChildAt(i2);
                        if (childAt instanceof C0587o.C0588a) {
                            jVar = ((C0587o.C0588a) childAt).getItemData();
                        } else {
                            jVar = null;
                        }
                        View r = mo1951r(jVar2, childAt, viewGroup);
                        if (jVar2 != jVar) {
                            r.setPressed(false);
                            r.jumpDrawablesToCurrentState();
                        }
                        if (r != childAt) {
                            mo1937c(r, i2);
                        }
                        i2++;
                    }
                }
                i = i2;
            }
            while (i < viewGroup.getChildCount()) {
                if (!mo1949p(viewGroup, i)) {
                    i++;
                }
            }
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
        this.f1539b = context;
        this.f1542e = LayoutInflater.from(context);
        this.f1540c = gVar;
    }

    /* renamed from: n */
    public abstract void mo1947n(C0573j jVar, C0587o.C0588a aVar);

    /* renamed from: o */
    public C0587o.C0588a mo1948o(ViewGroup viewGroup) {
        return (C0587o.C0588a) this.f1541d.inflate(this.f1545v, viewGroup, false);
    }

    /* renamed from: p */
    public boolean mo1949p(ViewGroup viewGroup, int i) {
        viewGroup.removeViewAt(i);
        return true;
    }

    /* renamed from: q */
    public C0585n.C0586a mo1950q() {
        return this.f1543f;
    }

    /* renamed from: r */
    public View mo1951r(C0573j jVar, View view, ViewGroup viewGroup) {
        C0587o.C0588a aVar;
        if (view instanceof C0587o.C0588a) {
            aVar = (C0587o.C0588a) view;
        } else {
            aVar = mo1948o(viewGroup);
        }
        mo1947n(jVar, aVar);
        return (View) aVar;
    }

    /* renamed from: s */
    public void mo1952s(int i) {
        this.f1547x = i;
    }

    /* renamed from: t */
    public boolean mo1953t(int i, C0573j jVar) {
        return true;
    }
}
