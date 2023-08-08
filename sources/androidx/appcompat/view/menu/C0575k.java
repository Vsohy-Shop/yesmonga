package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.C0376v0;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.C0537c;
import androidx.core.internal.view.C17674b;
import androidx.core.view.C18119b;
import java.lang.reflect.Method;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.appcompat.view.menu.k */
public class C0575k extends C0557c implements MenuItem {

    /* renamed from: q */
    public static final String f1687q = "MenuItemWrapper";

    /* renamed from: o */
    public final C17674b f1688o;

    /* renamed from: p */
    public Method f1689p;

    /* renamed from: androidx.appcompat.view.menu.k$a */
    public class C0576a extends C18119b {

        /* renamed from: e */
        public final ActionProvider f1690e;

        public C0576a(Context context, ActionProvider actionProvider) {
            super(context);
            this.f1690e = actionProvider;
        }

        /* renamed from: b */
        public boolean mo2227b() {
            return this.f1690e.hasSubMenu();
        }

        /* renamed from: d */
        public View mo2228d() {
            return this.f1690e.onCreateActionView();
        }

        /* renamed from: f */
        public boolean mo2229f() {
            return this.f1690e.onPerformDefaultAction();
        }

        /* renamed from: g */
        public void mo2230g(SubMenu subMenu) {
            this.f1690e.onPrepareSubMenu(C0575k.this.mo1955f(subMenu));
        }
    }

    @C0376v0(16)
    /* renamed from: androidx.appcompat.view.menu.k$b */
    public class C0577b extends C0576a implements ActionProvider.VisibilityListener {

        /* renamed from: g */
        public C18119b.C18121b f1692g;

        public C0577b(Context context, ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        /* renamed from: c */
        public boolean mo2231c() {
            return this.f1690e.isVisible();
        }

        /* renamed from: e */
        public View mo2232e(MenuItem menuItem) {
            return this.f1690e.onCreateActionView(menuItem);
        }

        /* renamed from: h */
        public boolean mo2233h() {
            return this.f1690e.overridesItemVisibility();
        }

        /* renamed from: i */
        public void mo2234i() {
            this.f1690e.refreshVisibility();
        }

        /* renamed from: l */
        public void mo2235l(C18119b.C18121b bVar) {
            C0577b bVar2;
            this.f1692g = bVar;
            ActionProvider actionProvider = this.f1690e;
            if (bVar != null) {
                bVar2 = this;
            } else {
                bVar2 = null;
            }
            actionProvider.setVisibilityListener(bVar2);
        }

        public void onActionProviderVisibilityChanged(boolean z) {
            C18119b.C18121b bVar = this.f1692g;
            if (bVar != null) {
                bVar.onActionProviderVisibilityChanged(z);
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.k$c */
    public static class C0578c extends FrameLayout implements C0537c {

        /* renamed from: a */
        public final CollapsibleActionView f1694a;

        public C0578c(View view) {
            super(view.getContext());
            this.f1694a = (CollapsibleActionView) view;
            addView(view);
        }

        /* renamed from: a */
        public void mo1757a() {
            this.f1694a.onActionViewExpanded();
        }

        /* renamed from: b */
        public View mo2237b() {
            return (View) this.f1694a;
        }

        /* renamed from: g */
        public void mo1758g() {
            this.f1694a.onActionViewCollapsed();
        }
    }

    /* renamed from: androidx.appcompat.view.menu.k$d */
    public class C0579d implements MenuItem.OnActionExpandListener {

        /* renamed from: a */
        public final MenuItem.OnActionExpandListener f1695a;

        public C0579d(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f1695a = onActionExpandListener;
        }

        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f1695a.onMenuItemActionCollapse(C0575k.this.mo1954e(menuItem));
        }

        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f1695a.onMenuItemActionExpand(C0575k.this.mo1954e(menuItem));
        }
    }

    /* renamed from: androidx.appcompat.view.menu.k$e */
    public class C0580e implements MenuItem.OnMenuItemClickListener {

        /* renamed from: a */
        public final MenuItem.OnMenuItemClickListener f1697a;

        public C0580e(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f1697a = onMenuItemClickListener;
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.f1697a.onMenuItemClick(C0575k.this.mo1954e(menuItem));
        }
    }

    public C0575k(Context context, C17674b bVar) {
        super(context);
        if (bVar != null) {
            this.f1688o = bVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    public boolean collapseActionView() {
        return this.f1688o.collapseActionView();
    }

    public boolean expandActionView() {
        return this.f1688o.expandActionView();
    }

    public ActionProvider getActionProvider() {
        C18119b a = this.f1688o.mo1872a();
        if (a instanceof C0576a) {
            return ((C0576a) a).f1690e;
        }
        return null;
    }

    public View getActionView() {
        View actionView = this.f1688o.getActionView();
        if (actionView instanceof C0578c) {
            return ((C0578c) actionView).mo2237b();
        }
        return actionView;
    }

    public int getAlphabeticModifiers() {
        return this.f1688o.getAlphabeticModifiers();
    }

    public char getAlphabeticShortcut() {
        return this.f1688o.getAlphabeticShortcut();
    }

    public CharSequence getContentDescription() {
        return this.f1688o.getContentDescription();
    }

    public int getGroupId() {
        return this.f1688o.getGroupId();
    }

    public Drawable getIcon() {
        return this.f1688o.getIcon();
    }

    public ColorStateList getIconTintList() {
        return this.f1688o.getIconTintList();
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f1688o.getIconTintMode();
    }

    public Intent getIntent() {
        return this.f1688o.getIntent();
    }

    public int getItemId() {
        return this.f1688o.getItemId();
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f1688o.getMenuInfo();
    }

    public int getNumericModifiers() {
        return this.f1688o.getNumericModifiers();
    }

    public char getNumericShortcut() {
        return this.f1688o.getNumericShortcut();
    }

    public int getOrder() {
        return this.f1688o.getOrder();
    }

    public SubMenu getSubMenu() {
        return mo1955f(this.f1688o.getSubMenu());
    }

    public CharSequence getTitle() {
        return this.f1688o.getTitle();
    }

    public CharSequence getTitleCondensed() {
        return this.f1688o.getTitleCondensed();
    }

    public CharSequence getTooltipText() {
        return this.f1688o.getTooltipText();
    }

    public boolean hasSubMenu() {
        return this.f1688o.hasSubMenu();
    }

    public boolean isActionViewExpanded() {
        return this.f1688o.isActionViewExpanded();
    }

    public boolean isCheckable() {
        return this.f1688o.isCheckable();
    }

    public boolean isChecked() {
        return this.f1688o.isChecked();
    }

    public boolean isEnabled() {
        return this.f1688o.isEnabled();
    }

    public boolean isVisible() {
        return this.f1688o.isVisible();
    }

    /* renamed from: j */
    public void mo2199j(boolean z) {
        try {
            if (this.f1689p == null) {
                this.f1689p = this.f1688o.getClass().getDeclaredMethod("setExclusiveCheckable", new Class[]{Boolean.TYPE});
            }
            this.f1689p.invoke(this.f1688o, new Object[]{Boolean.valueOf(z)});
        } catch (Exception unused) {
        }
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        C0577b bVar = new C0577b(this.f1548l, actionProvider);
        C17674b bVar2 = this.f1688o;
        if (actionProvider == null) {
            bVar = null;
        }
        bVar2.mo1874c(bVar);
        return this;
    }

    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new C0578c(view);
        }
        this.f1688o.setActionView(view);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c) {
        this.f1688o.setAlphabeticShortcut(c);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        this.f1688o.setCheckable(z);
        return this;
    }

    public MenuItem setChecked(boolean z) {
        this.f1688o.setChecked(z);
        return this;
    }

    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f1688o.setContentDescription(charSequence);
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        this.f1688o.setEnabled(z);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f1688o.setIcon(drawable);
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f1688o.setIconTintList(colorStateList);
        return this;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f1688o.setIconTintMode(mode);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f1688o.setIntent(intent);
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        this.f1688o.setNumericShortcut(c);
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        C0579d dVar;
        C17674b bVar = this.f1688o;
        if (onActionExpandListener != null) {
            dVar = new C0579d(onActionExpandListener);
        } else {
            dVar = null;
        }
        bVar.setOnActionExpandListener(dVar);
        return this;
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        C0580e eVar;
        C17674b bVar = this.f1688o;
        if (onMenuItemClickListener != null) {
            eVar = new C0580e(onMenuItemClickListener);
        } else {
            eVar = null;
        }
        bVar.setOnMenuItemClickListener(eVar);
        return this;
    }

    public MenuItem setShortcut(char c, char c2) {
        this.f1688o.setShortcut(c, c2);
        return this;
    }

    public void setShowAsAction(int i) {
        this.f1688o.setShowAsAction(i);
    }

    public MenuItem setShowAsActionFlags(int i) {
        this.f1688o.setShowAsActionFlags(i);
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f1688o.setTitle(charSequence);
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f1688o.setTitleCondensed(charSequence);
        return this;
    }

    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f1688o.setTooltipText(charSequence);
        return this;
    }

    public MenuItem setVisible(boolean z) {
        return this.f1688o.setVisible(z);
    }

    public MenuItem setAlphabeticShortcut(char c, int i) {
        this.f1688o.setAlphabeticShortcut(c, i);
        return this;
    }

    public MenuItem setIcon(int i) {
        this.f1688o.setIcon(i);
        return this;
    }

    public MenuItem setNumericShortcut(char c, int i) {
        this.f1688o.setNumericShortcut(c, i);
        return this;
    }

    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f1688o.setShortcut(c, c2, i, i2);
        return this;
    }

    public MenuItem setTitle(int i) {
        this.f1688o.setTitle(i);
        return this;
    }

    public MenuItem setActionView(int i) {
        this.f1688o.setActionView(i);
        View actionView = this.f1688o.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.f1688o.setActionView((View) new C0578c(actionView));
        }
        return this;
    }
}
