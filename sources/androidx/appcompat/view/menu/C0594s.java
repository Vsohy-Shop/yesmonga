package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.C0568g;
import com.google.firebase.installations.C33124s;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.appcompat.view.menu.s */
public class C0594s extends C0568g implements SubMenu {

    /* renamed from: Q */
    public C0568g f1738Q;

    /* renamed from: R */
    public C0573j f1739R;

    public C0594s(Context context, C0568g gVar, C0573j jVar) {
        super(context);
        this.f1738Q = gVar;
        this.f1739R = jVar;
    }

    /* renamed from: G */
    public C0568g mo2019G() {
        return this.f1738Q.mo2019G();
    }

    /* renamed from: I */
    public boolean mo2021I() {
        return this.f1738Q.mo2021I();
    }

    /* renamed from: J */
    public boolean mo2022J() {
        return this.f1738Q.mo2022J();
    }

    /* renamed from: K */
    public boolean mo2023K() {
        return this.f1738Q.mo2023K();
    }

    /* renamed from: X */
    public void mo2036X(C0568g.C0569a aVar) {
        this.f1738Q.mo2036X(aVar);
    }

    /* renamed from: g */
    public boolean mo2064g(C0573j jVar) {
        return this.f1738Q.mo2064g(jVar);
    }

    public MenuItem getItem() {
        return this.f1739R;
    }

    /* renamed from: i */
    public boolean mo2070i(@C0359n0 C0568g gVar, @C0359n0 MenuItem menuItem) {
        if (super.mo2070i(gVar, menuItem) || this.f1738Q.mo2070i(gVar, menuItem)) {
            return true;
        }
        return false;
    }

    /* renamed from: j0 */
    public void mo2074j0(boolean z) {
        this.f1738Q.mo2074j0(z);
    }

    /* renamed from: n */
    public boolean mo2081n(C0573j jVar) {
        return this.f1738Q.mo2081n(jVar);
    }

    /* renamed from: n0 */
    public Menu mo2292n0() {
        return this.f1738Q;
    }

    public void setGroupDividerEnabled(boolean z) {
        this.f1738Q.setGroupDividerEnabled(z);
    }

    public SubMenu setHeaderIcon(Drawable drawable) {
        return (SubMenu) super.mo2053c0(drawable);
    }

    public SubMenu setHeaderTitle(CharSequence charSequence) {
        return (SubMenu) super.mo2062f0(charSequence);
    }

    public SubMenu setHeaderView(View view) {
        return (SubMenu) super.mo2065g0(view);
    }

    public SubMenu setIcon(Drawable drawable) {
        this.f1739R.setIcon(drawable);
        return this;
    }

    public void setQwertyMode(boolean z) {
        this.f1738Q.setQwertyMode(z);
    }

    /* renamed from: w */
    public String mo2099w() {
        int i;
        C0573j jVar = this.f1739R;
        if (jVar != null) {
            i = jVar.getItemId();
        } else {
            i = 0;
        }
        if (i == 0) {
            return null;
        }
        return super.mo2099w() + C33124s.f80355c + i;
    }

    public SubMenu setHeaderIcon(int i) {
        return (SubMenu) super.mo2051b0(i);
    }

    public SubMenu setHeaderTitle(int i) {
        return (SubMenu) super.mo2060e0(i);
    }

    public SubMenu setIcon(int i) {
        this.f1739R.setIcon(i);
        return this;
    }
}
