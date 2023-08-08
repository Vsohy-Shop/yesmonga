package androidx.core.internal.view;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.core.view.C18119b;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.core.internal.view.b */
public interface C17674b extends MenuItem {

    /* renamed from: g */
    public static final int f46029g = 0;

    /* renamed from: h */
    public static final int f46030h = 1;

    /* renamed from: i */
    public static final int f46031i = 2;

    /* renamed from: j */
    public static final int f46032j = 4;

    /* renamed from: k */
    public static final int f46033k = 8;

    @C0363p0
    /* renamed from: a */
    C18119b mo1872a();

    /* renamed from: b */
    boolean mo1873b();

    @C0359n0
    /* renamed from: c */
    C17674b mo1874c(@C0363p0 C18119b bVar);

    boolean collapseActionView();

    /* renamed from: d */
    boolean mo1876d();

    boolean expandActionView();

    @C0363p0
    View getActionView();

    int getAlphabeticModifiers();

    @C0363p0
    CharSequence getContentDescription();

    @C0363p0
    ColorStateList getIconTintList();

    @C0363p0
    PorterDuff.Mode getIconTintMode();

    int getNumericModifiers();

    @C0363p0
    CharSequence getTooltipText();

    boolean isActionViewExpanded();

    @C0359n0
    MenuItem setActionView(int i);

    @C0359n0
    MenuItem setActionView(@C0363p0 View view);

    @C0359n0
    MenuItem setAlphabeticShortcut(char c, int i);

    @C0359n0
    C17674b setContentDescription(@C0363p0 CharSequence charSequence);

    @C0359n0
    MenuItem setIconTintList(@C0363p0 ColorStateList colorStateList);

    @C0359n0
    MenuItem setIconTintMode(@C0363p0 PorterDuff.Mode mode);

    @C0359n0
    MenuItem setNumericShortcut(char c, int i);

    @C0359n0
    MenuItem setShortcut(char c, char c2, int i, int i2);

    void setShowAsAction(int i);

    @C0359n0
    MenuItem setShowAsActionFlags(int i);

    @C0359n0
    C17674b setTooltipText(@C0363p0 CharSequence charSequence);
}
