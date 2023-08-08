package androidx.core.view;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import androidx.core.internal.view.C17674b;

/* renamed from: androidx.core.view.y0 */
public final class C18420y0 {

    /* renamed from: a */
    public static final String f47093a = "MenuItemCompat";
    @Deprecated

    /* renamed from: b */
    public static final int f47094b = 0;
    @Deprecated

    /* renamed from: c */
    public static final int f47095c = 1;
    @Deprecated

    /* renamed from: d */
    public static final int f47096d = 2;
    @Deprecated

    /* renamed from: e */
    public static final int f47097e = 4;
    @Deprecated

    /* renamed from: f */
    public static final int f47098f = 8;

    /* renamed from: androidx.core.view.y0$a */
    public class C18421a implements MenuItem.OnActionExpandListener {

        /* renamed from: a */
        public final /* synthetic */ C18423c f47099a;

        public C18421a(C18423c cVar) {
            this.f47099a = cVar;
        }

        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f47099a.onMenuItemActionCollapse(menuItem);
        }

        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f47099a.onMenuItemActionExpand(menuItem);
        }
    }

    @C0376v0(26)
    /* renamed from: androidx.core.view.y0$b */
    public static class C18422b {
        @C0373u
        /* renamed from: a */
        public static int m83319a(MenuItem menuItem) {
            return menuItem.getAlphabeticModifiers();
        }

        @C0373u
        /* renamed from: b */
        public static CharSequence m83320b(MenuItem menuItem) {
            return menuItem.getContentDescription();
        }

        @C0373u
        /* renamed from: c */
        public static ColorStateList m83321c(MenuItem menuItem) {
            return menuItem.getIconTintList();
        }

        @C0373u
        /* renamed from: d */
        public static PorterDuff.Mode m83322d(MenuItem menuItem) {
            return menuItem.getIconTintMode();
        }

        @C0373u
        /* renamed from: e */
        public static int m83323e(MenuItem menuItem) {
            return menuItem.getNumericModifiers();
        }

        @C0373u
        /* renamed from: f */
        public static CharSequence m83324f(MenuItem menuItem) {
            return menuItem.getTooltipText();
        }

        @C0373u
        /* renamed from: g */
        public static MenuItem m83325g(MenuItem menuItem, char c, int i) {
            return menuItem.setAlphabeticShortcut(c, i);
        }

        @C0373u
        /* renamed from: h */
        public static MenuItem m83326h(MenuItem menuItem, CharSequence charSequence) {
            return menuItem.setContentDescription(charSequence);
        }

        @C0373u
        /* renamed from: i */
        public static MenuItem m83327i(MenuItem menuItem, ColorStateList colorStateList) {
            return menuItem.setIconTintList(colorStateList);
        }

        @C0373u
        /* renamed from: j */
        public static MenuItem m83328j(MenuItem menuItem, PorterDuff.Mode mode) {
            return menuItem.setIconTintMode(mode);
        }

        @C0373u
        /* renamed from: k */
        public static MenuItem m83329k(MenuItem menuItem, char c, int i) {
            return menuItem.setNumericShortcut(c, i);
        }

        @C0373u
        /* renamed from: l */
        public static MenuItem m83330l(MenuItem menuItem, char c, char c2, int i, int i2) {
            return menuItem.setShortcut(c, c2, i, i2);
        }

        @C0373u
        /* renamed from: m */
        public static MenuItem m83331m(MenuItem menuItem, CharSequence charSequence) {
            return menuItem.setTooltipText(charSequence);
        }
    }

    @Deprecated
    /* renamed from: androidx.core.view.y0$c */
    public interface C18423c {
        boolean onMenuItemActionCollapse(MenuItem menuItem);

        boolean onMenuItemActionExpand(MenuItem menuItem);
    }

    @Deprecated
    /* renamed from: a */
    public static boolean m83296a(MenuItem menuItem) {
        return menuItem.collapseActionView();
    }

    @Deprecated
    /* renamed from: b */
    public static boolean m83297b(MenuItem menuItem) {
        return menuItem.expandActionView();
    }

    @C0363p0
    /* renamed from: c */
    public static C18119b m83298c(@C0359n0 MenuItem menuItem) {
        if (menuItem instanceof C17674b) {
            return ((C17674b) menuItem).mo1872a();
        }
        return null;
    }

    @Deprecated
    /* renamed from: d */
    public static View m83299d(MenuItem menuItem) {
        return menuItem.getActionView();
    }

    /* renamed from: e */
    public static int m83300e(@C0359n0 MenuItem menuItem) {
        if (menuItem instanceof C17674b) {
            return ((C17674b) menuItem).getAlphabeticModifiers();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return C18422b.m83319a(menuItem);
        }
        return 0;
    }

    @C0363p0
    /* renamed from: f */
    public static CharSequence m83301f(@C0359n0 MenuItem menuItem) {
        if (menuItem instanceof C17674b) {
            return ((C17674b) menuItem).getContentDescription();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return C18422b.m83320b(menuItem);
        }
        return null;
    }

    @C0363p0
    /* renamed from: g */
    public static ColorStateList m83302g(@C0359n0 MenuItem menuItem) {
        if (menuItem instanceof C17674b) {
            return ((C17674b) menuItem).getIconTintList();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return C18422b.m83321c(menuItem);
        }
        return null;
    }

    @C0363p0
    /* renamed from: h */
    public static PorterDuff.Mode m83303h(@C0359n0 MenuItem menuItem) {
        if (menuItem instanceof C17674b) {
            return ((C17674b) menuItem).getIconTintMode();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return C18422b.m83322d(menuItem);
        }
        return null;
    }

    /* renamed from: i */
    public static int m83304i(@C0359n0 MenuItem menuItem) {
        if (menuItem instanceof C17674b) {
            return ((C17674b) menuItem).getNumericModifiers();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return C18422b.m83323e(menuItem);
        }
        return 0;
    }

    @C0363p0
    /* renamed from: j */
    public static CharSequence m83305j(@C0359n0 MenuItem menuItem) {
        if (menuItem instanceof C17674b) {
            return ((C17674b) menuItem).getTooltipText();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return C18422b.m83324f(menuItem);
        }
        return null;
    }

    @Deprecated
    /* renamed from: k */
    public static boolean m83306k(MenuItem menuItem) {
        return menuItem.isActionViewExpanded();
    }

    @C0363p0
    /* renamed from: l */
    public static MenuItem m83307l(@C0359n0 MenuItem menuItem, @C0363p0 C18119b bVar) {
        if (menuItem instanceof C17674b) {
            return ((C17674b) menuItem).mo1874c(bVar);
        }
        return menuItem;
    }

    @Deprecated
    /* renamed from: m */
    public static MenuItem m83308m(MenuItem menuItem, int i) {
        return menuItem.setActionView(i);
    }

    @Deprecated
    /* renamed from: n */
    public static MenuItem m83309n(MenuItem menuItem, View view) {
        return menuItem.setActionView(view);
    }

    /* renamed from: o */
    public static void m83310o(@C0359n0 MenuItem menuItem, char c, int i) {
        if (menuItem instanceof C17674b) {
            ((C17674b) menuItem).setAlphabeticShortcut(c, i);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C18422b.m83325g(menuItem, c, i);
        }
    }

    /* renamed from: p */
    public static void m83311p(@C0359n0 MenuItem menuItem, @C0363p0 CharSequence charSequence) {
        if (menuItem instanceof C17674b) {
            ((C17674b) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C18422b.m83326h(menuItem, charSequence);
        }
    }

    /* renamed from: q */
    public static void m83312q(@C0359n0 MenuItem menuItem, @C0363p0 ColorStateList colorStateList) {
        if (menuItem instanceof C17674b) {
            ((C17674b) menuItem).setIconTintList(colorStateList);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C18422b.m83327i(menuItem, colorStateList);
        }
    }

    /* renamed from: r */
    public static void m83313r(@C0359n0 MenuItem menuItem, @C0363p0 PorterDuff.Mode mode) {
        if (menuItem instanceof C17674b) {
            ((C17674b) menuItem).setIconTintMode(mode);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C18422b.m83328j(menuItem, mode);
        }
    }

    /* renamed from: s */
    public static void m83314s(@C0359n0 MenuItem menuItem, char c, int i) {
        if (menuItem instanceof C17674b) {
            ((C17674b) menuItem).setNumericShortcut(c, i);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C18422b.m83329k(menuItem, c, i);
        }
    }

    @Deprecated
    /* renamed from: t */
    public static MenuItem m83315t(MenuItem menuItem, C18423c cVar) {
        return menuItem.setOnActionExpandListener(new C18421a(cVar));
    }

    /* renamed from: u */
    public static void m83316u(@C0359n0 MenuItem menuItem, char c, char c2, int i, int i2) {
        if (menuItem instanceof C17674b) {
            ((C17674b) menuItem).setShortcut(c, c2, i, i2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C18422b.m83330l(menuItem, c, c2, i, i2);
        }
    }

    @Deprecated
    /* renamed from: v */
    public static void m83317v(MenuItem menuItem, int i) {
        menuItem.setShowAsAction(i);
    }

    /* renamed from: w */
    public static void m83318w(@C0359n0 MenuItem menuItem, @C0363p0 CharSequence charSequence) {
        if (menuItem instanceof C17674b) {
            ((C17674b) menuItem).setTooltipText(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C18422b.m83331m(menuItem, charSequence);
        }
    }
}
