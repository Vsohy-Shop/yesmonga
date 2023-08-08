package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.core.content.C17318d;
import androidx.core.graphics.drawable.C17549d;
import androidx.core.internal.view.C17674b;
import androidx.core.view.C18119b;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.appcompat.view.menu.a */
public class C0555a implements C17674b {

    /* renamed from: F */
    public static final int f1513F = 1;

    /* renamed from: G */
    public static final int f1514G = 2;

    /* renamed from: H */
    public static final int f1515H = 4;

    /* renamed from: I */
    public static final int f1516I = 8;

    /* renamed from: J */
    public static final int f1517J = 16;

    /* renamed from: A */
    public ColorStateList f1518A = null;

    /* renamed from: B */
    public PorterDuff.Mode f1519B = null;

    /* renamed from: C */
    public boolean f1520C = false;

    /* renamed from: D */
    public boolean f1521D = false;

    /* renamed from: E */
    public int f1522E = 16;

    /* renamed from: l */
    public final int f1523l;

    /* renamed from: m */
    public final int f1524m;

    /* renamed from: n */
    public final int f1525n;

    /* renamed from: o */
    public CharSequence f1526o;

    /* renamed from: p */
    public CharSequence f1527p;

    /* renamed from: q */
    public Intent f1528q;

    /* renamed from: r */
    public char f1529r;

    /* renamed from: s */
    public int f1530s = 4096;

    /* renamed from: t */
    public char f1531t;

    /* renamed from: u */
    public int f1532u = 4096;

    /* renamed from: v */
    public Drawable f1533v;

    /* renamed from: w */
    public Context f1534w;

    /* renamed from: x */
    public MenuItem.OnMenuItemClickListener f1535x;

    /* renamed from: y */
    public CharSequence f1536y;

    /* renamed from: z */
    public CharSequence f1537z;

    public C0555a(Context context, int i, int i2, int i3, int i4, CharSequence charSequence) {
        this.f1534w = context;
        this.f1523l = i2;
        this.f1524m = i;
        this.f1525n = i4;
        this.f1526o = charSequence;
    }

    /* renamed from: a */
    public C18119b mo1872a() {
        return null;
    }

    /* renamed from: b */
    public boolean mo1873b() {
        return true;
    }

    @C0359n0
    /* renamed from: c */
    public C17674b mo1874c(C18119b bVar) {
        throw new UnsupportedOperationException();
    }

    public boolean collapseActionView() {
        return false;
    }

    /* renamed from: d */
    public boolean mo1876d() {
        return false;
    }

    /* renamed from: e */
    public final void mo1877e() {
        Drawable drawable = this.f1533v;
        if (drawable == null) {
            return;
        }
        if (this.f1520C || this.f1521D) {
            Drawable r = C17549d.m80456r(drawable);
            this.f1533v = r;
            Drawable mutate = r.mutate();
            this.f1533v = mutate;
            if (this.f1520C) {
                C17549d.m80453o(mutate, this.f1518A);
            }
            if (this.f1521D) {
                C17549d.m80454p(this.f1533v, this.f1519B);
            }
        }
    }

    public boolean expandActionView() {
        return false;
    }

    /* renamed from: f */
    public boolean mo1879f() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f1535x;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        Intent intent = this.f1528q;
        if (intent == null) {
            return false;
        }
        this.f1534w.startActivity(intent);
        return true;
    }

    @C0359n0
    /* renamed from: g */
    public C17674b setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    public View getActionView() {
        return null;
    }

    public int getAlphabeticModifiers() {
        return this.f1532u;
    }

    public char getAlphabeticShortcut() {
        return this.f1531t;
    }

    public CharSequence getContentDescription() {
        return this.f1536y;
    }

    public int getGroupId() {
        return this.f1524m;
    }

    public Drawable getIcon() {
        return this.f1533v;
    }

    public ColorStateList getIconTintList() {
        return this.f1518A;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f1519B;
    }

    public Intent getIntent() {
        return this.f1528q;
    }

    public int getItemId() {
        return this.f1523l;
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    public int getNumericModifiers() {
        return this.f1530s;
    }

    public char getNumericShortcut() {
        return this.f1529r;
    }

    public int getOrder() {
        return this.f1525n;
    }

    public SubMenu getSubMenu() {
        return null;
    }

    public CharSequence getTitle() {
        return this.f1526o;
    }

    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f1527p;
        return charSequence != null ? charSequence : this.f1526o;
    }

    public CharSequence getTooltipText() {
        return this.f1537z;
    }

    @C0359n0
    /* renamed from: h */
    public C17674b setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    public boolean hasSubMenu() {
        return false;
    }

    /* renamed from: i */
    public C0555a mo1902i(boolean z) {
        this.f1522E = (z ? 4 : 0) | (this.f1522E & -5);
        return this;
    }

    public boolean isActionViewExpanded() {
        return false;
    }

    public boolean isCheckable() {
        return (this.f1522E & 1) != 0;
    }

    public boolean isChecked() {
        return (this.f1522E & 2) != 0;
    }

    public boolean isEnabled() {
        return (this.f1522E & 16) != 0;
    }

    public boolean isVisible() {
        return (this.f1522E & 8) == 0;
    }

    @C0359n0
    /* renamed from: j */
    public C17674b setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setAlphabeticShortcut(char c) {
        this.f1531t = Character.toLowerCase(c);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        this.f1522E = z | (this.f1522E & true) ? 1 : 0;
        return this;
    }

    public MenuItem setChecked(boolean z) {
        this.f1522E = (z ? 2 : 0) | (this.f1522E & -3);
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        this.f1522E = (z ? 16 : 0) | (this.f1522E & -17);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f1533v = drawable;
        mo1877e();
        return this;
    }

    @C0359n0
    public MenuItem setIconTintList(@C0363p0 ColorStateList colorStateList) {
        this.f1518A = colorStateList;
        this.f1520C = true;
        mo1877e();
        return this;
    }

    @C0359n0
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f1519B = mode;
        this.f1521D = true;
        mo1877e();
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f1528q = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        this.f1529r = c;
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f1535x = onMenuItemClickListener;
        return this;
    }

    public MenuItem setShortcut(char c, char c2) {
        this.f1529r = c;
        this.f1531t = Character.toLowerCase(c2);
        return this;
    }

    public void setShowAsAction(int i) {
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f1526o = charSequence;
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f1527p = charSequence;
        return this;
    }

    public MenuItem setVisible(boolean z) {
        int i = 8;
        int i2 = this.f1522E & 8;
        if (z) {
            i = 0;
        }
        this.f1522E = i2 | i;
        return this;
    }

    @C0359n0
    public MenuItem setAlphabeticShortcut(char c, int i) {
        this.f1531t = Character.toLowerCase(c);
        this.f1532u = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @C0359n0
    public C17674b setContentDescription(CharSequence charSequence) {
        this.f1536y = charSequence;
        return this;
    }

    @C0359n0
    public MenuItem setNumericShortcut(char c, int i) {
        this.f1529r = c;
        this.f1530s = KeyEvent.normalizeMetaState(i);
        return this;
    }

    public MenuItem setTitle(int i) {
        this.f1526o = this.f1534w.getResources().getString(i);
        return this;
    }

    @C0359n0
    public C17674b setTooltipText(CharSequence charSequence) {
        this.f1537z = charSequence;
        return this;
    }

    public MenuItem setIcon(int i) {
        this.f1533v = C17318d.m79726i(this.f1534w, i);
        mo1877e();
        return this;
    }

    @C0359n0
    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f1529r = c;
        this.f1530s = KeyEvent.normalizeMetaState(i);
        this.f1531t = Character.toLowerCase(c2);
        this.f1532u = KeyEvent.normalizeMetaState(i2);
        return this;
    }
}
