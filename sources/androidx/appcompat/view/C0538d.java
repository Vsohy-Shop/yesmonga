package androidx.appcompat.view;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;
import androidx.annotation.C0327c1;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import androidx.appcompat.C0387a;

/* renamed from: androidx.appcompat.view.d */
public class C0538d extends ContextWrapper {

    /* renamed from: f */
    public static Configuration f1395f;

    /* renamed from: a */
    public int f1396a;

    /* renamed from: b */
    public Resources.Theme f1397b;

    /* renamed from: c */
    public LayoutInflater f1398c;

    /* renamed from: d */
    public Configuration f1399d;

    /* renamed from: e */
    public Resources f1400e;

    @C0376v0(17)
    /* renamed from: androidx.appcompat.view.d$a */
    public static class C0539a {
        @C0373u
        /* renamed from: a */
        public static Context m2516a(C0538d dVar, Configuration configuration) {
            return dVar.createConfigurationContext(configuration);
        }
    }

    public C0538d() {
        super((Context) null);
    }

    @C0376v0(26)
    /* renamed from: e */
    public static boolean m2510e(Configuration configuration) {
        if (configuration == null) {
            return true;
        }
        if (f1395f == null) {
            Configuration configuration2 = new Configuration();
            configuration2.fontScale = 0.0f;
            f1395f = configuration2;
        }
        return configuration.equals(f1395f);
    }

    /* renamed from: a */
    public void mo1759a(Configuration configuration) {
        if (this.f1400e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        } else if (this.f1399d == null) {
            this.f1399d = new Configuration(configuration);
        } else {
            throw new IllegalStateException("Override configuration has already been set");
        }
    }

    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    /* renamed from: b */
    public final Resources mo1761b() {
        if (this.f1400e == null) {
            Configuration configuration = this.f1399d;
            if (configuration == null || (Build.VERSION.SDK_INT >= 26 && m2510e(configuration))) {
                this.f1400e = super.getResources();
            } else {
                this.f1400e = C0539a.m2516a(this, this.f1399d).getResources();
            }
        }
        return this.f1400e;
    }

    /* renamed from: c */
    public int mo1762c() {
        return this.f1396a;
    }

    /* renamed from: d */
    public final void mo1763d() {
        boolean z;
        if (this.f1397b == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f1397b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f1397b.setTo(theme);
            }
        }
        mo1764f(this.f1397b, this.f1396a, z);
    }

    /* renamed from: f */
    public void mo1764f(Resources.Theme theme, int i, boolean z) {
        theme.applyStyle(i, true);
    }

    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    public Resources getResources() {
        return mo1761b();
    }

    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f1398c == null) {
            this.f1398c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f1398c;
    }

    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f1397b;
        if (theme != null) {
            return theme;
        }
        if (this.f1396a == 0) {
            this.f1396a = C0387a.C0399l.Theme_AppCompat_Light;
        }
        mo1763d();
        return this.f1397b;
    }

    public void setTheme(int i) {
        if (this.f1396a != i) {
            this.f1396a = i;
            mo1763d();
        }
    }

    public C0538d(Context context, @C0327c1 int i) {
        super(context);
        this.f1396a = i;
    }

    public C0538d(Context context, Resources.Theme theme) {
        super(context);
        this.f1397b = theme;
    }
}
