package androidx.appcompat.app;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.C0324b1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import androidx.appcompat.app.C0463c;
import androidx.appcompat.graphics.drawable.C0522d;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.C18306m0;
import androidx.drawerlayout.widget.DrawerLayout;

/* renamed from: androidx.appcompat.app.b */
public class C0455b implements DrawerLayout.C18951e {

    /* renamed from: a */
    public final C0457b f1124a;

    /* renamed from: b */
    public final DrawerLayout f1125b;

    /* renamed from: c */
    public C0522d f1126c;

    /* renamed from: d */
    public boolean f1127d;

    /* renamed from: e */
    public Drawable f1128e;

    /* renamed from: f */
    public boolean f1129f;

    /* renamed from: g */
    public boolean f1130g;

    /* renamed from: h */
    public final int f1131h;

    /* renamed from: i */
    public final int f1132i;

    /* renamed from: j */
    public View.OnClickListener f1133j;

    /* renamed from: k */
    public boolean f1134k;

    /* renamed from: androidx.appcompat.app.b$a */
    public class C0456a implements View.OnClickListener {
        public C0456a() {
        }

        public void onClick(View view) {
            C0455b bVar = C0455b.this;
            if (bVar.f1129f) {
                bVar.mo1363v();
                return;
            }
            View.OnClickListener onClickListener = bVar.f1133j;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.b$b */
    public interface C0457b {
        /* renamed from: a */
        void mo1200a(Drawable drawable, @C0324b1 int i);

        /* renamed from: b */
        Drawable mo1201b();

        /* renamed from: c */
        void mo1202c(@C0324b1 int i);

        /* renamed from: d */
        Context mo1203d();

        /* renamed from: e */
        boolean mo1204e();
    }

    /* renamed from: androidx.appcompat.app.b$c */
    public interface C0458c {
        @C0363p0
        /* renamed from: b */
        C0457b mo1365b();
    }

    /* renamed from: androidx.appcompat.app.b$d */
    public static class C0459d implements C0457b {

        /* renamed from: a */
        public final Activity f1136a;

        /* renamed from: b */
        public C0463c.C0464a f1137b;

        @C0376v0(18)
        /* renamed from: androidx.appcompat.app.b$d$a */
        public static class C0460a {
            @C0373u
            /* renamed from: a */
            public static void m1981a(ActionBar actionBar, int i) {
                actionBar.setHomeActionContentDescription(i);
            }

            @C0373u
            /* renamed from: b */
            public static void m1982b(ActionBar actionBar, Drawable drawable) {
                actionBar.setHomeAsUpIndicator(drawable);
            }
        }

        public C0459d(Activity activity) {
            this.f1136a = activity;
        }

        /* renamed from: a */
        public void mo1200a(Drawable drawable, int i) {
            ActionBar actionBar = this.f1136a.getActionBar();
            if (actionBar != null) {
                C0460a.m1982b(actionBar, drawable);
                C0460a.m1981a(actionBar, i);
            }
        }

        /* renamed from: b */
        public Drawable mo1201b() {
            TypedArray obtainStyledAttributes = mo1203d().obtainStyledAttributes((AttributeSet) null, new int[]{16843531}, 16843470, 0);
            Drawable drawable = obtainStyledAttributes.getDrawable(0);
            obtainStyledAttributes.recycle();
            return drawable;
        }

        /* renamed from: c */
        public void mo1202c(int i) {
            ActionBar actionBar = this.f1136a.getActionBar();
            if (actionBar != null) {
                C0460a.m1981a(actionBar, i);
            }
        }

        /* renamed from: d */
        public Context mo1203d() {
            ActionBar actionBar = this.f1136a.getActionBar();
            if (actionBar != null) {
                return actionBar.getThemedContext();
            }
            return this.f1136a;
        }

        /* renamed from: e */
        public boolean mo1204e() {
            ActionBar actionBar = this.f1136a.getActionBar();
            if (actionBar == null || (actionBar.getDisplayOptions() & 4) == 0) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: androidx.appcompat.app.b$e */
    public static class C0461e implements C0457b {

        /* renamed from: a */
        public final Toolbar f1138a;

        /* renamed from: b */
        public final Drawable f1139b;

        /* renamed from: c */
        public final CharSequence f1140c;

        public C0461e(Toolbar toolbar) {
            this.f1138a = toolbar;
            this.f1139b = toolbar.getNavigationIcon();
            this.f1140c = toolbar.getNavigationContentDescription();
        }

        /* renamed from: a */
        public void mo1200a(Drawable drawable, @C0324b1 int i) {
            this.f1138a.setNavigationIcon(drawable);
            mo1202c(i);
        }

        /* renamed from: b */
        public Drawable mo1201b() {
            return this.f1139b;
        }

        /* renamed from: c */
        public void mo1202c(@C0324b1 int i) {
            if (i == 0) {
                this.f1138a.setNavigationContentDescription(this.f1140c);
            } else {
                this.f1138a.setNavigationContentDescription(i);
            }
        }

        /* renamed from: d */
        public Context mo1203d() {
            return this.f1138a.getContext();
        }

        /* renamed from: e */
        public boolean mo1204e() {
            return true;
        }
    }

    public C0455b(Activity activity, DrawerLayout drawerLayout, @C0324b1 int i, @C0324b1 int i2) {
        this(activity, (Toolbar) null, drawerLayout, (C0522d) null, i, i2);
    }

    /* renamed from: a */
    public void mo1342a(View view) {
        mo1360s(1.0f);
        if (this.f1129f) {
            mo1353l(this.f1132i);
        }
    }

    /* renamed from: b */
    public void mo1343b(View view) {
        mo1360s(0.0f);
        if (this.f1129f) {
            mo1353l(this.f1131h);
        }
    }

    /* renamed from: c */
    public void mo1344c(int i) {
    }

    /* renamed from: d */
    public void mo1345d(View view, float f) {
        if (this.f1127d) {
            mo1360s(Math.min(1.0f, Math.max(0.0f, f)));
        } else {
            mo1360s(0.0f);
        }
    }

    @C0359n0
    /* renamed from: e */
    public C0522d mo1346e() {
        return this.f1126c;
    }

    /* renamed from: f */
    public Drawable mo1347f() {
        return this.f1124a.mo1201b();
    }

    /* renamed from: g */
    public View.OnClickListener mo1348g() {
        return this.f1133j;
    }

    /* renamed from: h */
    public boolean mo1349h() {
        return this.f1129f;
    }

    /* renamed from: i */
    public boolean mo1350i() {
        return this.f1127d;
    }

    /* renamed from: j */
    public void mo1351j(Configuration configuration) {
        if (!this.f1130g) {
            this.f1128e = mo1347f();
        }
        mo1362u();
    }

    /* renamed from: k */
    public boolean mo1352k(MenuItem menuItem) {
        if (menuItem == null || menuItem.getItemId() != 16908332 || !this.f1129f) {
            return false;
        }
        mo1363v();
        return true;
    }

    /* renamed from: l */
    public void mo1353l(int i) {
        this.f1124a.mo1202c(i);
    }

    /* renamed from: m */
    public void mo1354m(Drawable drawable, int i) {
        if (!this.f1134k && !this.f1124a.mo1204e()) {
            this.f1134k = true;
        }
        this.f1124a.mo1200a(drawable, i);
    }

    /* renamed from: n */
    public void mo1355n(@C0359n0 C0522d dVar) {
        this.f1126c = dVar;
        mo1362u();
    }

    /* renamed from: o */
    public void mo1356o(boolean z) {
        int i;
        if (z != this.f1129f) {
            if (z) {
                C0522d dVar = this.f1126c;
                if (this.f1125b.mo55743C(C18306m0.f46960b)) {
                    i = this.f1132i;
                } else {
                    i = this.f1131h;
                }
                mo1354m(dVar, i);
            } else {
                mo1354m(this.f1128e, 0);
            }
            this.f1129f = z;
        }
    }

    /* renamed from: p */
    public void mo1357p(boolean z) {
        this.f1127d = z;
        if (!z) {
            mo1360s(0.0f);
        }
    }

    /* renamed from: q */
    public void mo1358q(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = this.f1125b.getResources().getDrawable(i);
        } else {
            drawable = null;
        }
        mo1359r(drawable);
    }

    /* renamed from: r */
    public void mo1359r(Drawable drawable) {
        if (drawable == null) {
            this.f1128e = mo1347f();
            this.f1130g = false;
        } else {
            this.f1128e = drawable;
            this.f1130g = true;
        }
        if (!this.f1129f) {
            mo1354m(this.f1128e, 0);
        }
    }

    /* renamed from: s */
    public final void mo1360s(float f) {
        if (f == 1.0f) {
            this.f1126c.mo1732t(true);
        } else if (f == 0.0f) {
            this.f1126c.mo1732t(false);
        }
        this.f1126c.setProgress(f);
    }

    /* renamed from: t */
    public void mo1361t(View.OnClickListener onClickListener) {
        this.f1133j = onClickListener;
    }

    /* renamed from: u */
    public void mo1362u() {
        int i;
        if (this.f1125b.mo55743C(C18306m0.f46960b)) {
            mo1360s(1.0f);
        } else {
            mo1360s(0.0f);
        }
        if (this.f1129f) {
            C0522d dVar = this.f1126c;
            if (this.f1125b.mo55743C(C18306m0.f46960b)) {
                i = this.f1132i;
            } else {
                i = this.f1131h;
            }
            mo1354m(dVar, i);
        }
    }

    /* renamed from: v */
    public void mo1363v() {
        int q = this.f1125b.mo55802q(C18306m0.f46960b);
        if (this.f1125b.mo55746F(C18306m0.f46960b) && q != 2) {
            this.f1125b.mo55770d(C18306m0.f46960b);
        } else if (q != 1) {
            this.f1125b.mo55751K(C18306m0.f46960b);
        }
    }

    public C0455b(Activity activity, DrawerLayout drawerLayout, Toolbar toolbar, @C0324b1 int i, @C0324b1 int i2) {
        this(activity, toolbar, drawerLayout, (C0522d) null, i, i2);
    }

    public C0455b(Activity activity, Toolbar toolbar, DrawerLayout drawerLayout, C0522d dVar, @C0324b1 int i, @C0324b1 int i2) {
        this.f1127d = true;
        this.f1129f = true;
        this.f1134k = false;
        if (toolbar != null) {
            this.f1124a = new C0461e(toolbar);
            toolbar.setNavigationOnClickListener(new C0456a());
        } else if (activity instanceof C0458c) {
            this.f1124a = ((C0458c) activity).mo1365b();
        } else {
            this.f1124a = new C0459d(activity);
        }
        this.f1125b = drawerLayout;
        this.f1131h = i;
        this.f1132i = i2;
        if (dVar == null) {
            this.f1126c = new C0522d(this.f1124a.mo1203d());
        } else {
            this.f1126c = dVar;
        }
        this.f1128e = mo1347f();
    }
}
