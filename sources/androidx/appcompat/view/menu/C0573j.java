package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewDebug;
import android.widget.LinearLayout;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.appcompat.C0387a;
import androidx.appcompat.content.res.C0507a;
import androidx.appcompat.view.menu.C0587o;
import androidx.core.graphics.drawable.C17549d;
import androidx.core.internal.view.C17674b;
import androidx.core.view.C18119b;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.appcompat.view.menu.j */
public final class C0573j implements C17674b {

    /* renamed from: Q */
    public static final String f1646Q = "MenuItemImpl";

    /* renamed from: R */
    public static final int f1647R = 3;

    /* renamed from: S */
    public static final int f1648S = 1;

    /* renamed from: T */
    public static final int f1649T = 2;

    /* renamed from: U */
    public static final int f1650U = 4;

    /* renamed from: V */
    public static final int f1651V = 8;

    /* renamed from: W */
    public static final int f1652W = 16;

    /* renamed from: X */
    public static final int f1653X = 32;

    /* renamed from: Y */
    public static final int f1654Y = 0;

    /* renamed from: A */
    public Runnable f1655A;

    /* renamed from: B */
    public MenuItem.OnMenuItemClickListener f1656B;

    /* renamed from: C */
    public CharSequence f1657C;

    /* renamed from: D */
    public CharSequence f1658D;

    /* renamed from: E */
    public ColorStateList f1659E = null;

    /* renamed from: F */
    public PorterDuff.Mode f1660F = null;

    /* renamed from: G */
    public boolean f1661G = false;

    /* renamed from: H */
    public boolean f1662H = false;

    /* renamed from: I */
    public boolean f1663I = false;

    /* renamed from: J */
    public int f1664J = 16;

    /* renamed from: K */
    public int f1665K;

    /* renamed from: L */
    public View f1666L;

    /* renamed from: M */
    public C18119b f1667M;

    /* renamed from: N */
    public MenuItem.OnActionExpandListener f1668N;

    /* renamed from: O */
    public boolean f1669O = false;

    /* renamed from: P */
    public ContextMenu.ContextMenuInfo f1670P;

    /* renamed from: l */
    public final int f1671l;

    /* renamed from: m */
    public final int f1672m;

    /* renamed from: n */
    public final int f1673n;

    /* renamed from: o */
    public final int f1674o;

    /* renamed from: p */
    public CharSequence f1675p;

    /* renamed from: q */
    public CharSequence f1676q;

    /* renamed from: r */
    public Intent f1677r;

    /* renamed from: s */
    public char f1678s;

    /* renamed from: t */
    public int f1679t = 4096;

    /* renamed from: u */
    public char f1680u;

    /* renamed from: v */
    public int f1681v = 4096;

    /* renamed from: w */
    public Drawable f1682w;

    /* renamed from: x */
    public int f1683x = 0;

    /* renamed from: y */
    public C0568g f1684y;

    /* renamed from: z */
    public C0594s f1685z;

    /* renamed from: androidx.appcompat.view.menu.j$a */
    public class C0574a implements C18119b.C18121b {
        public C0574a() {
        }

        public void onActionProviderVisibilityChanged(boolean z) {
            C0573j jVar = C0573j.this;
            jVar.f1684y.mo2025M(jVar);
        }
    }

    public C0573j(C0568g gVar, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.f1684y = gVar;
        this.f1671l = i2;
        this.f1672m = i;
        this.f1673n = i3;
        this.f1674o = i4;
        this.f1675p = charSequence;
        this.f1665K = i5;
    }

    /* renamed from: f */
    public static void m2752f(StringBuilder sb, int i, int i2, String str) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    /* renamed from: A */
    public void mo2111A(C0594s sVar) {
        this.f1685z = sVar;
        sVar.setHeaderTitle(getTitle());
    }

    /* renamed from: B */
    public boolean mo2112B(boolean z) {
        int i;
        int i2 = this.f1664J;
        int i3 = i2 & -9;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        int i4 = i | i3;
        this.f1664J = i4;
        if (i2 != i4) {
            return true;
        }
        return false;
    }

    /* renamed from: C */
    public boolean mo2113C() {
        return this.f1684y.mo2017D();
    }

    /* renamed from: D */
    public boolean mo2114D() {
        return this.f1684y.mo2023K() && mo2137j() != 0;
    }

    /* renamed from: E */
    public boolean mo2115E() {
        return (this.f1665K & 4) == 4;
    }

    /* renamed from: a */
    public C18119b mo1872a() {
        return this.f1667M;
    }

    /* renamed from: b */
    public boolean mo1873b() {
        return (this.f1665K & 2) == 2;
    }

    @C0359n0
    /* renamed from: c */
    public C17674b mo1874c(C18119b bVar) {
        C18119b bVar2 = this.f1667M;
        if (bVar2 != null) {
            bVar2.mo52791j();
        }
        this.f1666L = null;
        this.f1667M = bVar;
        this.f1684y.mo2026N(true);
        C18119b bVar3 = this.f1667M;
        if (bVar3 != null) {
            bVar3.mo2235l(new C0574a());
        }
        return this;
    }

    public boolean collapseActionView() {
        if ((this.f1665K & 8) == 0) {
            return false;
        }
        if (this.f1666L == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f1668N;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f1684y.mo2064g(this);
        }
        return false;
    }

    /* renamed from: d */
    public boolean mo1876d() {
        return !mo1873b() && !mo2144q();
    }

    /* renamed from: e */
    public void mo2116e() {
        this.f1684y.mo2024L(this);
    }

    public boolean expandActionView() {
        if (!mo2140m()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f1668N;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f1684y.mo2081n(this);
        }
        return false;
    }

    /* renamed from: g */
    public final Drawable mo2117g(Drawable drawable) {
        if (drawable != null && this.f1663I && (this.f1661G || this.f1662H)) {
            drawable = C17549d.m80456r(drawable).mutate();
            if (this.f1661G) {
                C17549d.m80453o(drawable, this.f1659E);
            }
            if (this.f1662H) {
                C17549d.m80454p(drawable, this.f1660F);
            }
            this.f1663I = false;
        }
        return drawable;
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    public View getActionView() {
        View view = this.f1666L;
        if (view != null) {
            return view;
        }
        C18119b bVar = this.f1667M;
        if (bVar == null) {
            return null;
        }
        View e = bVar.mo2232e(this);
        this.f1666L = e;
        return e;
    }

    public int getAlphabeticModifiers() {
        return this.f1681v;
    }

    public char getAlphabeticShortcut() {
        return this.f1680u;
    }

    public CharSequence getContentDescription() {
        return this.f1657C;
    }

    public int getGroupId() {
        return this.f1672m;
    }

    public Drawable getIcon() {
        Drawable drawable = this.f1682w;
        if (drawable != null) {
            return mo2117g(drawable);
        }
        if (this.f1683x == 0) {
            return null;
        }
        Drawable b = C0507a.m2346b(this.f1684y.mo2100x(), this.f1683x);
        this.f1683x = 0;
        this.f1682w = b;
        return mo2117g(b);
    }

    public ColorStateList getIconTintList() {
        return this.f1659E;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f1660F;
    }

    public Intent getIntent() {
        return this.f1677r;
    }

    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.f1671l;
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f1670P;
    }

    public int getNumericModifiers() {
        return this.f1679t;
    }

    public char getNumericShortcut() {
        return this.f1678s;
    }

    public int getOrder() {
        return this.f1673n;
    }

    public SubMenu getSubMenu() {
        return this.f1685z;
    }

    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.f1675p;
    }

    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f1676q;
        return charSequence != null ? charSequence : this.f1675p;
    }

    public CharSequence getTooltipText() {
        return this.f1658D;
    }

    /* renamed from: h */
    public Runnable mo2130h() {
        return this.f1655A;
    }

    public boolean hasSubMenu() {
        return this.f1685z != null;
    }

    /* renamed from: i */
    public int mo2132i() {
        return this.f1674o;
    }

    public boolean isActionViewExpanded() {
        return this.f1669O;
    }

    public boolean isCheckable() {
        return (this.f1664J & 1) == 1;
    }

    public boolean isChecked() {
        return (this.f1664J & 2) == 2;
    }

    public boolean isEnabled() {
        return (this.f1664J & 16) != 0;
    }

    public boolean isVisible() {
        C18119b bVar = this.f1667M;
        if (bVar == null || !bVar.mo2233h()) {
            if ((this.f1664J & 8) == 0) {
                return true;
            }
            return false;
        } else if ((this.f1664J & 8) != 0 || !this.f1667M.mo2231c()) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: j */
    public char mo2137j() {
        return this.f1684y.mo2022J() ? this.f1680u : this.f1678s;
    }

    /* renamed from: k */
    public String mo2138k() {
        int i;
        char j = mo2137j();
        if (j == 0) {
            return "";
        }
        Resources resources = this.f1684y.mo2100x().getResources();
        StringBuilder sb = new StringBuilder();
        if (ViewConfiguration.get(this.f1684y.mo2100x()).hasPermanentMenuKey()) {
            sb.append(resources.getString(C0387a.C0398k.abc_prepend_shortcut_label));
        }
        if (this.f1684y.mo2022J()) {
            i = this.f1681v;
        } else {
            i = this.f1679t;
        }
        m2752f(sb, i, 65536, resources.getString(C0387a.C0398k.abc_menu_meta_shortcut_label));
        m2752f(sb, i, 4096, resources.getString(C0387a.C0398k.abc_menu_ctrl_shortcut_label));
        m2752f(sb, i, 2, resources.getString(C0387a.C0398k.abc_menu_alt_shortcut_label));
        m2752f(sb, i, 1, resources.getString(C0387a.C0398k.abc_menu_shift_shortcut_label));
        m2752f(sb, i, 4, resources.getString(C0387a.C0398k.abc_menu_sym_shortcut_label));
        m2752f(sb, i, 8, resources.getString(C0387a.C0398k.abc_menu_function_shortcut_label));
        if (j == 8) {
            sb.append(resources.getString(C0387a.C0398k.abc_menu_delete_shortcut_label));
        } else if (j == 10) {
            sb.append(resources.getString(C0387a.C0398k.abc_menu_enter_shortcut_label));
        } else if (j != ' ') {
            sb.append(j);
        } else {
            sb.append(resources.getString(C0387a.C0398k.abc_menu_space_shortcut_label));
        }
        return sb.toString();
    }

    /* renamed from: l */
    public CharSequence mo2139l(C0587o.C0588a aVar) {
        if (aVar == null || !aVar.mo1833e()) {
            return getTitle();
        }
        return getTitleCondensed();
    }

    /* renamed from: m */
    public boolean mo2140m() {
        C18119b bVar;
        if ((this.f1665K & 8) == 0) {
            return false;
        }
        if (this.f1666L == null && (bVar = this.f1667M) != null) {
            this.f1666L = bVar.mo2232e(this);
        }
        if (this.f1666L != null) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public boolean mo2141n() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f1656B;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        C0568g gVar = this.f1684y;
        if (gVar.mo2070i(gVar, this)) {
            return true;
        }
        Runnable runnable = this.f1655A;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.f1677r != null) {
            try {
                this.f1684y.mo2100x().startActivity(this.f1677r);
                return true;
            } catch (ActivityNotFoundException unused) {
            }
        }
        C18119b bVar = this.f1667M;
        if (bVar == null || !bVar.mo2229f()) {
            return false;
        }
        return true;
    }

    /* renamed from: o */
    public boolean mo2142o() {
        return (this.f1664J & 32) == 32;
    }

    /* renamed from: p */
    public boolean mo2143p() {
        return (this.f1664J & 4) != 0;
    }

    /* renamed from: q */
    public boolean mo2144q() {
        return (this.f1665K & 1) == 1;
    }

    @C0359n0
    /* renamed from: r */
    public C17674b setActionView(int i) {
        Context x = this.f1684y.mo2100x();
        setActionView(LayoutInflater.from(x).inflate(i, new LinearLayout(x), false));
        return this;
    }

    @C0359n0
    /* renamed from: s */
    public C17674b setActionView(View view) {
        int i;
        this.f1666L = view;
        this.f1667M = null;
        if (view != null && view.getId() == -1 && (i = this.f1671l) > 0) {
            view.setId(i);
        }
        this.f1684y.mo2024L(this);
        return this;
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    public MenuItem setAlphabeticShortcut(char c) {
        if (this.f1680u == c) {
            return this;
        }
        this.f1680u = Character.toLowerCase(c);
        this.f1684y.mo2026N(false);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        int i = this.f1664J;
        boolean z2 = z | (i & true);
        this.f1664J = z2 ? 1 : 0;
        if (i != z2) {
            this.f1684y.mo2026N(false);
        }
        return this;
    }

    public MenuItem setChecked(boolean z) {
        if ((this.f1664J & 4) != 0) {
            this.f1684y.mo2040a0(this);
        } else {
            mo2166v(z);
        }
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        if (z) {
            this.f1664J |= 16;
        } else {
            this.f1664J &= -17;
        }
        this.f1684y.mo2026N(false);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f1683x = 0;
        this.f1682w = drawable;
        this.f1663I = true;
        this.f1684y.mo2026N(false);
        return this;
    }

    @C0359n0
    public MenuItem setIconTintList(@C0363p0 ColorStateList colorStateList) {
        this.f1659E = colorStateList;
        this.f1661G = true;
        this.f1663I = true;
        this.f1684y.mo2026N(false);
        return this;
    }

    @C0359n0
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f1660F = mode;
        this.f1662H = true;
        this.f1663I = true;
        this.f1684y.mo2026N(false);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f1677r = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        if (this.f1678s == c) {
            return this;
        }
        this.f1678s = c;
        this.f1684y.mo2026N(false);
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f1668N = onActionExpandListener;
        return this;
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f1656B = onMenuItemClickListener;
        return this;
    }

    public MenuItem setShortcut(char c, char c2) {
        this.f1678s = c;
        this.f1680u = Character.toLowerCase(c2);
        this.f1684y.mo2026N(false);
        return this;
    }

    public void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 == 0 || i2 == 1 || i2 == 2) {
            this.f1665K = i;
            this.f1684y.mo2024L(this);
            return;
        }
        throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f1675p = charSequence;
        this.f1684y.mo2026N(false);
        C0594s sVar = this.f1685z;
        if (sVar != null) {
            sVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f1676q = charSequence;
        this.f1684y.mo2026N(false);
        return this;
    }

    public MenuItem setVisible(boolean z) {
        if (mo2112B(z)) {
            this.f1684y.mo2025M(this);
        }
        return this;
    }

    /* renamed from: t */
    public void mo2163t(boolean z) {
        this.f1669O = z;
        this.f1684y.mo2026N(false);
    }

    public String toString() {
        CharSequence charSequence = this.f1675p;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    /* renamed from: u */
    public MenuItem mo2165u(Runnable runnable) {
        this.f1655A = runnable;
        return this;
    }

    /* renamed from: v */
    public void mo2166v(boolean z) {
        int i;
        int i2 = this.f1664J;
        int i3 = i2 & -3;
        if (z) {
            i = 2;
        } else {
            i = 0;
        }
        int i4 = i | i3;
        this.f1664J = i4;
        if (i2 != i4) {
            this.f1684y.mo2026N(false);
        }
    }

    /* renamed from: w */
    public void mo2167w(boolean z) {
        this.f1664J = (z ? 4 : 0) | (this.f1664J & -5);
    }

    /* renamed from: x */
    public void mo2168x(boolean z) {
        if (z) {
            this.f1664J |= 32;
        } else {
            this.f1664J &= -33;
        }
    }

    /* renamed from: y */
    public void mo2169y(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.f1670P = contextMenuInfo;
    }

    @C0359n0
    /* renamed from: z */
    public C17674b setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @C0359n0
    public C17674b setContentDescription(CharSequence charSequence) {
        this.f1657C = charSequence;
        this.f1684y.mo2026N(false);
        return this;
    }

    @C0359n0
    public C17674b setTooltipText(CharSequence charSequence) {
        this.f1658D = charSequence;
        this.f1684y.mo2026N(false);
        return this;
    }

    @C0359n0
    public MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.f1680u == c && this.f1681v == i) {
            return this;
        }
        this.f1680u = Character.toLowerCase(c);
        this.f1681v = KeyEvent.normalizeMetaState(i);
        this.f1684y.mo2026N(false);
        return this;
    }

    @C0359n0
    public MenuItem setNumericShortcut(char c, int i) {
        if (this.f1678s == c && this.f1679t == i) {
            return this;
        }
        this.f1678s = c;
        this.f1679t = KeyEvent.normalizeMetaState(i);
        this.f1684y.mo2026N(false);
        return this;
    }

    @C0359n0
    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f1678s = c;
        this.f1679t = KeyEvent.normalizeMetaState(i);
        this.f1680u = Character.toLowerCase(c2);
        this.f1681v = KeyEvent.normalizeMetaState(i2);
        this.f1684y.mo2026N(false);
        return this;
    }

    public MenuItem setIcon(int i) {
        this.f1682w = null;
        this.f1683x = i;
        this.f1663I = true;
        this.f1684y.mo2026N(false);
        return this;
    }

    public MenuItem setTitle(int i) {
        return setTitle((CharSequence) this.f1684y.mo2100x().getString(i));
    }
}
