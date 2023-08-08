package androidx.appcompat.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.ViewTreeOnBackPressedDispatcherOwner;
import androidx.activity.contextaware.C0233c;
import androidx.annotation.C0327c1;
import androidx.annotation.C0329d0;
import androidx.annotation.C0346i;
import androidx.annotation.C0347i0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0360o;
import androidx.annotation.C0363p0;
import androidx.appcompat.app.C0455b;
import androidx.appcompat.view.C0535b;
import androidx.appcompat.widget.C0793t1;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.C17018b;
import androidx.core.app.C17061d6;
import androidx.core.app.C17065e0;
import androidx.core.p027os.C17812o;
import androidx.fragment.app.C19232h;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.savedstate.C20431c;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;

/* renamed from: androidx.appcompat.app.e */
public class C0475e extends C19232h implements C0478f, C17061d6.C17063b, C0455b.C0458c {

    /* renamed from: T0 */
    public static final String f1227T0 = "androidx:appcompat";

    /* renamed from: R0 */
    public C0481i f1228R0;

    /* renamed from: S0 */
    public Resources f1229S0;

    /* renamed from: androidx.appcompat.app.e$a */
    public class C0476a implements C20431c.C20434c {
        public C0476a() {
        }

        @C0359n0
        /* renamed from: c */
        public Bundle mo832c() {
            Bundle bundle = new Bundle();
            C0475e.this.mo1472A0().mo1096Q(bundle);
            return bundle;
        }
    }

    /* renamed from: androidx.appcompat.app.e$b */
    public class C0477b implements C0233c {
        public C0477b() {
        }

        /* renamed from: a */
        public void mo823a(@C0359n0 Context context) {
            C0481i A0 = C0475e.this.mo1472A0();
            A0.mo1077E();
            A0.mo1088M(C0475e.this.getSavedStateRegistry().mo61284b(C0475e.f1227T0));
        }
    }

    public C0475e() {
        mo1474C0();
    }

    @C0359n0
    /* renamed from: A0 */
    public C0481i mo1472A0() {
        if (this.f1228R0 == null) {
            this.f1228R0 = C0481i.m2241n(this, this);
        }
        return this.f1228R0;
    }

    @C0363p0
    /* renamed from: B0 */
    public C0441a mo1473B0() {
        return mo1472A0().mo1073C();
    }

    /* renamed from: C0 */
    public final void mo1474C0() {
        getSavedStateRegistry().mo61291j(f1227T0, new C0476a());
        mo739s(new C0477b());
    }

    /* renamed from: D0 */
    public void mo1475D0(@C0359n0 C17061d6 d6Var) {
        d6Var.mo51263i(this);
    }

    @C0363p0
    /* renamed from: E */
    public C0535b mo1476E(@C0359n0 C0535b.C0536a aVar) {
        return null;
    }

    /* renamed from: E0 */
    public void mo1477E0(@C0359n0 C17812o oVar) {
    }

    /* renamed from: F0 */
    public void mo1478F0(int i) {
    }

    /* renamed from: G0 */
    public void mo1479G0(@C0359n0 C17061d6 d6Var) {
    }

    @Deprecated
    /* renamed from: H0 */
    public void mo1480H0() {
    }

    /* renamed from: I0 */
    public boolean mo1481I0() {
        Intent l = mo1500l();
        if (l == null) {
            return false;
        }
        if (mo1491S0(l)) {
            C17061d6 r = C17061d6.m78884r(this);
            mo1475D0(r);
            mo1479G0(r);
            r.mo51259X();
            try {
                C17018b.m78754z(this);
                return true;
            } catch (IllegalStateException unused) {
                finish();
                return true;
            }
        } else {
            mo1489Q0(l);
            return true;
        }
    }

    /* renamed from: J0 */
    public final boolean mo1482J0(KeyEvent keyEvent) {
        Window window;
        if (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
            return false;
        }
        return true;
    }

    /* renamed from: K0 */
    public void mo1483K0(@C0363p0 Toolbar toolbar) {
        mo1472A0().mo1128h0(toolbar);
    }

    @Deprecated
    /* renamed from: L0 */
    public void mo1484L0(int i) {
    }

    @Deprecated
    /* renamed from: M0 */
    public void mo1485M0(boolean z) {
    }

    @Deprecated
    /* renamed from: N0 */
    public void mo1486N0(boolean z) {
    }

    @Deprecated
    /* renamed from: O0 */
    public void mo1487O0(boolean z) {
    }

    @C0363p0
    /* renamed from: P0 */
    public C0535b mo1488P0(@C0359n0 C0535b.C0536a aVar) {
        return mo1472A0().mo1134k0(aVar);
    }

    /* renamed from: Q0 */
    public void mo1489Q0(@C0359n0 Intent intent) {
        C17065e0.m78908g(this, intent);
    }

    /* renamed from: R0 */
    public boolean mo1490R0(int i) {
        return mo1472A0().mo1104V(i);
    }

    /* renamed from: S0 */
    public boolean mo1491S0(@C0359n0 Intent intent) {
        return C17065e0.m78909h(this, intent);
    }

    /* renamed from: U */
    public final void mo1492U() {
        ViewTreeLifecycleOwner.m90621b(getWindow().getDecorView(), this);
        ViewTreeViewModelStoreOwner.m90625b(getWindow().getDecorView(), this);
        ViewTreeSavedStateRegistryOwner.m95252b(getWindow().getDecorView(), this);
        ViewTreeOnBackPressedDispatcherOwner.m1268b(getWindow().getDecorView(), this);
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        mo1492U();
        mo1472A0().mo1121f(view, layoutParams);
    }

    public void attachBaseContext(Context context) {
        super.attachBaseContext(mo1472A0().mo1137m(context));
    }

    @C0363p0
    /* renamed from: b */
    public C0455b.C0457b mo1365b() {
        return mo1472A0().mo1163w();
    }

    public void closeOptionsMenu() {
        C0441a B0 = mo1473B0();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (B0 == null || !B0.mo1286l()) {
            super.closeOptionsMenu();
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        C0441a B0 = mo1473B0();
        if (keyCode != 82 || B0 == null || !B0.mo1255L(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    public <T extends View> T findViewById(@C0329d0 int i) {
        return mo1472A0().mo1153s(i);
    }

    @C0359n0
    public MenuInflater getMenuInflater() {
        return mo1472A0().mo1171z();
    }

    public Resources getResources() {
        if (this.f1229S0 == null && C0793t1.m3855d()) {
            this.f1229S0 = new C0793t1(this, super.getResources());
        }
        Resources resources = this.f1229S0;
        if (resources == null) {
            return super.getResources();
        }
        return resources;
    }

    public void invalidateOptionsMenu() {
        mo1472A0().mo1079F();
    }

    @C0363p0
    /* renamed from: l */
    public Intent mo1500l() {
        return C17065e0.m78902a(this);
    }

    public void onConfigurationChanged(@C0359n0 Configuration configuration) {
        super.onConfigurationChanged(configuration);
        mo1472A0().mo1086L(configuration);
        if (this.f1229S0 != null) {
            this.f1229S0.updateConfiguration(super.getResources().getConfiguration(), super.getResources().getDisplayMetrics());
        }
    }

    public void onContentChanged() {
        mo1480H0();
    }

    public void onDestroy() {
        super.onDestroy();
        mo1472A0().mo1090N();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (mo1482J0(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public final boolean onMenuItemSelected(int i, @C0359n0 MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        C0441a B0 = mo1473B0();
        if (menuItem.getItemId() != 16908332 || B0 == null || (B0.mo1294p() & 4) == 0) {
            return false;
        }
        return mo1481I0();
    }

    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    public void onPanelClosed(int i, @C0359n0 Menu menu) {
        super.onPanelClosed(i, menu);
    }

    public void onPostCreate(@C0363p0 Bundle bundle) {
        super.onPostCreate(bundle);
        mo1472A0().mo1092O(bundle);
    }

    public void onPostResume() {
        super.onPostResume();
        mo1472A0().mo1094P();
    }

    public void onStart() {
        super.onStart();
        mo1472A0().mo1098R();
    }

    public void onStop() {
        super.onStop();
        mo1472A0().mo1100S();
    }

    public void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        mo1472A0().mo1132j0(charSequence);
    }

    public void openOptionsMenu() {
        C0441a B0 = mo1473B0();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (B0 == null || !B0.mo1256M()) {
            super.openOptionsMenu();
        }
    }

    public void setContentView(@C0347i0 int i) {
        mo1492U();
        mo1472A0().mo1109Z(i);
    }

    public void setTheme(@C0327c1 int i) {
        super.setTheme(i);
        mo1472A0().mo1130i0(i);
    }

    /* renamed from: x0 */
    public void mo1512x0() {
        mo1472A0().mo1079F();
    }

    @C0346i
    /* renamed from: y */
    public void mo1513y(@C0359n0 C0535b bVar) {
    }

    @C0346i
    /* renamed from: z */
    public void mo1514z(@C0359n0 C0535b bVar) {
    }

    @C0360o
    public C0475e(@C0347i0 int i) {
        super(i);
        mo1474C0();
    }

    public void setContentView(View view) {
        mo1492U();
        mo1472A0().mo1112a0(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        mo1492U();
        mo1472A0().mo1115b0(view, layoutParams);
    }
}
