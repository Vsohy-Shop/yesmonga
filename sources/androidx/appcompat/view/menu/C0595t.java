package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.annotation.RestrictTo;
import androidx.core.internal.view.C17675c;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.appcompat.view.menu.t */
public class C0595t extends C0589p implements SubMenu {

    /* renamed from: p */
    public final C17675c f1740p;

    public C0595t(Context context, C17675c cVar) {
        super(context, cVar);
        this.f1740p = cVar;
    }

    public void clearHeader() {
        this.f1740p.clearHeader();
    }

    public MenuItem getItem() {
        return mo1954e(this.f1740p.getItem());
    }

    public SubMenu setHeaderIcon(int i) {
        this.f1740p.setHeaderIcon(i);
        return this;
    }

    public SubMenu setHeaderTitle(int i) {
        this.f1740p.setHeaderTitle(i);
        return this;
    }

    public SubMenu setHeaderView(View view) {
        this.f1740p.setHeaderView(view);
        return this;
    }

    public SubMenu setIcon(int i) {
        this.f1740p.setIcon(i);
        return this;
    }

    public SubMenu setHeaderIcon(Drawable drawable) {
        this.f1740p.setHeaderIcon(drawable);
        return this;
    }

    public SubMenu setHeaderTitle(CharSequence charSequence) {
        this.f1740p.setHeaderTitle(charSequence);
        return this;
    }

    public SubMenu setIcon(Drawable drawable) {
        this.f1740p.setIcon(drawable);
        return this;
    }
}
