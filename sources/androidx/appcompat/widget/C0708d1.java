package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.widget.SpinnerAdapter;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.appcompat.view.C0538d;

/* renamed from: androidx.appcompat.widget.d1 */
public interface C0708d1 extends SpinnerAdapter {

    /* renamed from: androidx.appcompat.widget.d1$a */
    public static final class C0709a {

        /* renamed from: a */
        public final Context f2353a;

        /* renamed from: b */
        public final LayoutInflater f2354b;

        /* renamed from: c */
        public LayoutInflater f2355c;

        public C0709a(@C0359n0 Context context) {
            this.f2353a = context;
            this.f2354b = LayoutInflater.from(context);
        }

        @C0359n0
        /* renamed from: a */
        public LayoutInflater mo3404a() {
            LayoutInflater layoutInflater = this.f2355c;
            return layoutInflater != null ? layoutInflater : this.f2354b;
        }

        @C0363p0
        /* renamed from: b */
        public Resources.Theme mo3405b() {
            LayoutInflater layoutInflater = this.f2355c;
            if (layoutInflater == null) {
                return null;
            }
            return layoutInflater.getContext().getTheme();
        }

        /* renamed from: c */
        public void mo3406c(@C0363p0 Resources.Theme theme) {
            if (theme == null) {
                this.f2355c = null;
            } else if (theme.equals(this.f2353a.getTheme())) {
                this.f2355c = this.f2354b;
            } else {
                this.f2355c = LayoutInflater.from(new C0538d(this.f2353a, theme));
            }
        }
    }

    @C0363p0
    Resources.Theme getDropDownViewTheme();

    void setDropDownViewTheme(@C0363p0 Resources.Theme theme);
}
