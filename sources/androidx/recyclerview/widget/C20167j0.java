package androidx.recyclerview.widget;

import android.view.View;
import androidx.core.text.C17897a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* renamed from: androidx.recyclerview.widget.j0 */
public class C20167j0 {

    /* renamed from: c */
    public static final int f51922c = 1;

    /* renamed from: d */
    public static final int f51923d = 2;

    /* renamed from: e */
    public static final int f51924e = 4;

    /* renamed from: f */
    public static final int f51925f = 0;

    /* renamed from: g */
    public static final int f51926g = 1;

    /* renamed from: h */
    public static final int f51927h = 2;

    /* renamed from: i */
    public static final int f51928i = 4;

    /* renamed from: j */
    public static final int f51929j = 4;

    /* renamed from: k */
    public static final int f51930k = 16;

    /* renamed from: l */
    public static final int f51931l = 32;

    /* renamed from: m */
    public static final int f51932m = 64;

    /* renamed from: n */
    public static final int f51933n = 8;

    /* renamed from: o */
    public static final int f51934o = 256;

    /* renamed from: p */
    public static final int f51935p = 512;

    /* renamed from: q */
    public static final int f51936q = 1024;

    /* renamed from: r */
    public static final int f51937r = 12;

    /* renamed from: s */
    public static final int f51938s = 4096;

    /* renamed from: t */
    public static final int f51939t = 8192;

    /* renamed from: u */
    public static final int f51940u = 16384;

    /* renamed from: v */
    public static final int f51941v = 7;

    /* renamed from: a */
    public final C20169b f51942a;

    /* renamed from: b */
    public C20168a f51943b = new C20168a();

    /* renamed from: androidx.recyclerview.widget.j0$a */
    public static class C20168a {

        /* renamed from: a */
        public int f51944a = 0;

        /* renamed from: b */
        public int f51945b;

        /* renamed from: c */
        public int f51946c;

        /* renamed from: d */
        public int f51947d;

        /* renamed from: e */
        public int f51948e;

        /* renamed from: a */
        public void mo60488a(int i) {
            this.f51944a = i | this.f51944a;
        }

        /* renamed from: b */
        public boolean mo60489b() {
            int i = this.f51944a;
            if ((i & 7) != 0 && (i & (mo60490c(this.f51947d, this.f51945b) << 0)) == 0) {
                return false;
            }
            int i2 = this.f51944a;
            if ((i2 & 112) != 0 && (i2 & (mo60490c(this.f51947d, this.f51946c) << 4)) == 0) {
                return false;
            }
            int i3 = this.f51944a;
            if ((i3 & C17897a.C17899b.f46339f) != 0 && (i3 & (mo60490c(this.f51948e, this.f51945b) << 8)) == 0) {
                return false;
            }
            int i4 = this.f51944a;
            if ((i4 & 28672) == 0 || (i4 & (mo60490c(this.f51948e, this.f51946c) << 12)) != 0) {
                return true;
            }
            return false;
        }

        /* renamed from: c */
        public int mo60490c(int i, int i2) {
            if (i > i2) {
                return 1;
            }
            return i == i2 ? 2 : 4;
        }

        /* renamed from: d */
        public void mo60491d() {
            this.f51944a = 0;
        }

        /* renamed from: e */
        public void mo60492e(int i, int i2, int i3, int i4) {
            this.f51945b = i;
            this.f51946c = i2;
            this.f51947d = i3;
            this.f51948e = i4;
        }
    }

    /* renamed from: androidx.recyclerview.widget.j0$b */
    public interface C20169b {
        /* renamed from: a */
        View mo59986a(int i);

        /* renamed from: b */
        int mo59987b(View view);

        /* renamed from: c */
        int mo59988c();

        /* renamed from: d */
        int mo59989d();

        /* renamed from: e */
        int mo59990e(View view);
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.recyclerview.widget.j0$c */
    public @interface C20170c {
    }

    public C20167j0(C20169b bVar) {
        this.f51942a = bVar;
    }

    /* renamed from: a */
    public View mo60486a(int i, int i2, int i3, int i4) {
        int i5;
        int c = this.f51942a.mo59988c();
        int d = this.f51942a.mo59989d();
        if (i2 > i) {
            i5 = 1;
        } else {
            i5 = -1;
        }
        View view = null;
        while (i != i2) {
            View a = this.f51942a.mo59986a(i);
            this.f51943b.mo60492e(c, d, this.f51942a.mo59987b(a), this.f51942a.mo59990e(a));
            if (i3 != 0) {
                this.f51943b.mo60491d();
                this.f51943b.mo60488a(i3);
                if (this.f51943b.mo60489b()) {
                    return a;
                }
            }
            if (i4 != 0) {
                this.f51943b.mo60491d();
                this.f51943b.mo60488a(i4);
                if (this.f51943b.mo60489b()) {
                    view = a;
                }
            }
            i += i5;
        }
        return view;
    }

    /* renamed from: b */
    public boolean mo60487b(View view, int i) {
        this.f51943b.mo60492e(this.f51942a.mo59988c(), this.f51942a.mo59989d(), this.f51942a.mo59987b(view), this.f51942a.mo59990e(view));
        if (i == 0) {
            return false;
        }
        this.f51943b.mo60491d();
        this.f51943b.mo60488a(i);
        return this.f51943b.mo60489b();
    }
}
