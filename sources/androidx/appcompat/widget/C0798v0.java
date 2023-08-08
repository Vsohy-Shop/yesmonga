package androidx.appcompat.widget;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.annotation.C0327c1;
import androidx.annotation.C0336f;
import androidx.annotation.C0355l0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.appcompat.C0387a;
import androidx.appcompat.view.C0543g;
import androidx.appcompat.view.menu.C0568g;
import androidx.appcompat.view.menu.C0582m;
import androidx.appcompat.view.menu.C0590q;

/* renamed from: androidx.appcompat.widget.v0 */
public class C0798v0 {

    /* renamed from: a */
    public final Context f2595a;

    /* renamed from: b */
    public final C0568g f2596b;

    /* renamed from: c */
    public final View f2597c;

    /* renamed from: d */
    public final C0582m f2598d;

    /* renamed from: e */
    public C0803e f2599e;

    /* renamed from: f */
    public C0802d f2600f;

    /* renamed from: g */
    public View.OnTouchListener f2601g;

    /* renamed from: androidx.appcompat.widget.v0$a */
    public class C0799a implements C0568g.C0569a {
        public C0799a() {
        }

        /* renamed from: a */
        public boolean mo1111a(@C0359n0 C0568g gVar, @C0359n0 MenuItem menuItem) {
            C0803e eVar = C0798v0.this.f2599e;
            if (eVar != null) {
                return eVar.onMenuItemClick(menuItem);
            }
            return false;
        }

        /* renamed from: b */
        public void mo1114b(@C0359n0 C0568g gVar) {
        }
    }

    /* renamed from: androidx.appcompat.widget.v0$b */
    public class C0800b implements PopupWindow.OnDismissListener {
        public C0800b() {
        }

        public void onDismiss() {
            C0798v0 v0Var = C0798v0.this;
            C0802d dVar = v0Var.f2600f;
            if (dVar != null) {
                dVar.mo3735a(v0Var);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.v0$c */
    public class C0801c extends C0760p0 {
        public C0801c(View view) {
            super(view);
        }

        /* renamed from: b */
        public C0590q mo1854b() {
            return C0798v0.this.f2598d.mo2247e();
        }

        /* renamed from: c */
        public boolean mo1855c() {
            C0798v0.this.mo3733l();
            return true;
        }

        /* renamed from: d */
        public boolean mo2462d() {
            C0798v0.this.mo3722a();
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.v0$d */
    public interface C0802d {
        /* renamed from: a */
        void mo3735a(C0798v0 v0Var);
    }

    /* renamed from: androidx.appcompat.widget.v0$e */
    public interface C0803e {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public C0798v0(@C0359n0 Context context, @C0359n0 View view) {
        this(context, view, 0);
    }

    /* renamed from: a */
    public void mo3722a() {
        this.f2598d.dismiss();
    }

    @C0359n0
    /* renamed from: b */
    public View.OnTouchListener mo3723b() {
        if (this.f2601g == null) {
            this.f2601g = new C0801c(this.f2597c);
        }
        return this.f2601g;
    }

    /* renamed from: c */
    public int mo3724c() {
        return this.f2598d.mo2245c();
    }

    @C0359n0
    /* renamed from: d */
    public Menu mo3725d() {
        return this.f2596b;
    }

    @C0359n0
    /* renamed from: e */
    public MenuInflater mo3726e() {
        return new C0543g(this.f2595a);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: f */
    public ListView mo3727f() {
        if (!this.f2598d.mo2248f()) {
            return null;
        }
        return this.f2598d.mo2246d();
    }

    /* renamed from: g */
    public void mo3728g(@C0355l0 int i) {
        mo3726e().inflate(i, this.f2596b);
    }

    /* renamed from: h */
    public void mo3729h(boolean z) {
        this.f2598d.mo2251i(z);
    }

    /* renamed from: i */
    public void mo3730i(int i) {
        this.f2598d.mo2252j(i);
    }

    /* renamed from: j */
    public void mo3731j(@C0363p0 C0802d dVar) {
        this.f2600f = dVar;
    }

    /* renamed from: k */
    public void mo3732k(@C0363p0 C0803e eVar) {
        this.f2599e = eVar;
    }

    /* renamed from: l */
    public void mo3733l() {
        this.f2598d.mo2254l();
    }

    public C0798v0(@C0359n0 Context context, @C0359n0 View view, int i) {
        this(context, view, i, C0387a.C0389b.popupMenuStyle, 0);
    }

    public C0798v0(@C0359n0 Context context, @C0359n0 View view, int i, @C0336f int i2, @C0327c1 int i3) {
        this.f2595a = context;
        this.f2597c = view;
        C0568g gVar = new C0568g(context);
        this.f2596b = gVar;
        gVar.mo2036X(new C0799a());
        C0582m mVar = new C0582m(context, gVar, view, false, i2, i3);
        this.f2598d = mVar;
        mVar.mo2252j(i);
        mVar.mo2253k(new C0800b());
    }
}
