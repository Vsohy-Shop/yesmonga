package androidx.appcompat.view;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.RestrictTo;
import androidx.appcompat.C0387a;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.appcompat.view.a */
public class C0534a {

    /* renamed from: a */
    public Context f1392a;

    public C0534a(Context context) {
        this.f1392a = context;
    }

    /* renamed from: b */
    public static C0534a m2478b(Context context) {
        return new C0534a(context);
    }

    /* renamed from: a */
    public boolean mo1746a() {
        return this.f1392a.getApplicationInfo().targetSdkVersion < 14;
    }

    /* renamed from: c */
    public int mo1747c() {
        return this.f1392a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    /* renamed from: d */
    public int mo1748d() {
        Configuration configuration = this.f1392a.getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i > 600) {
            return 5;
        }
        if (i > 960 && i2 > 720) {
            return 5;
        }
        if (i > 720 && i2 > 960) {
            return 5;
        }
        if (i >= 500) {
            return 4;
        }
        if (i > 640 && i2 > 480) {
            return 4;
        }
        if (i > 480 && i2 > 640) {
            return 4;
        }
        if (i >= 360) {
            return 3;
        }
        return 2;
    }

    /* renamed from: e */
    public int mo1749e() {
        return this.f1392a.getResources().getDimensionPixelSize(C0387a.C0392e.abc_action_bar_stacked_tab_max_width);
    }

    /* renamed from: f */
    public int mo1750f() {
        TypedArray obtainStyledAttributes = this.f1392a.obtainStyledAttributes((AttributeSet) null, C0387a.C0400m.ActionBar, C0387a.C0389b.actionBarStyle, 0);
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(C0387a.C0400m.ActionBar_height, 0);
        Resources resources = this.f1392a.getResources();
        if (!mo1751g()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(C0387a.C0392e.abc_action_bar_stacked_max_height));
        }
        obtainStyledAttributes.recycle();
        return layoutDimension;
    }

    /* renamed from: g */
    public boolean mo1751g() {
        return this.f1392a.getResources().getBoolean(C0387a.C0390c.abc_action_bar_embed_tabs);
    }

    /* renamed from: h */
    public boolean mo1752h() {
        return true;
    }
}
