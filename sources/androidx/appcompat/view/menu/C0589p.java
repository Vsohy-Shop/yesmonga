package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.annotation.RestrictTo;
import androidx.core.internal.view.C17673a;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.appcompat.view.menu.p */
public class C0589p extends C0557c implements Menu {

    /* renamed from: o */
    public final C17673a f1714o;

    public C0589p(Context context, C17673a aVar) {
        super(context);
        if (aVar != null) {
            this.f1714o = aVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    public MenuItem add(CharSequence charSequence) {
        return mo1954e(this.f1714o.add(charSequence));
    }

    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2;
        MenuItem[] menuItemArr3 = menuItemArr;
        if (menuItemArr3 != null) {
            menuItemArr2 = new MenuItem[menuItemArr3.length];
        } else {
            menuItemArr2 = null;
        }
        int addIntentOptions = this.f1714o.addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr3[i5] = mo1954e(menuItemArr2[i5]);
            }
        }
        return addIntentOptions;
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return mo1955f(this.f1714o.addSubMenu(charSequence));
    }

    public void clear() {
        mo1956g();
        this.f1714o.clear();
    }

    public void close() {
        this.f1714o.close();
    }

    public MenuItem findItem(int i) {
        return mo1954e(this.f1714o.findItem(i));
    }

    public MenuItem getItem(int i) {
        return mo1954e(this.f1714o.getItem(i));
    }

    public boolean hasVisibleItems() {
        return this.f1714o.hasVisibleItems();
    }

    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return this.f1714o.isShortcutKey(i, keyEvent);
    }

    public boolean performIdentifierAction(int i, int i2) {
        return this.f1714o.performIdentifierAction(i, i2);
    }

    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return this.f1714o.performShortcut(i, keyEvent, i2);
    }

    public void removeGroup(int i) {
        mo1957h(i);
        this.f1714o.removeGroup(i);
    }

    public void removeItem(int i) {
        mo1958i(i);
        this.f1714o.removeItem(i);
    }

    public void setGroupCheckable(int i, boolean z, boolean z2) {
        this.f1714o.setGroupCheckable(i, z, z2);
    }

    public void setGroupEnabled(int i, boolean z) {
        this.f1714o.setGroupEnabled(i, z);
    }

    public void setGroupVisible(int i, boolean z) {
        this.f1714o.setGroupVisible(i, z);
    }

    public void setQwertyMode(boolean z) {
        this.f1714o.setQwertyMode(z);
    }

    public int size() {
        return this.f1714o.size();
    }

    public MenuItem add(int i) {
        return mo1954e(this.f1714o.add(i));
    }

    public SubMenu addSubMenu(int i) {
        return mo1955f(this.f1714o.addSubMenu(i));
    }

    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return mo1954e(this.f1714o.add(i, i2, i3, charSequence));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return mo1955f(this.f1714o.addSubMenu(i, i2, i3, charSequence));
    }

    public MenuItem add(int i, int i2, int i3, int i4) {
        return mo1954e(this.f1714o.add(i, i2, i3, i4));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return mo1955f(this.f1714o.addSubMenu(i, i2, i3, i4));
    }
}
