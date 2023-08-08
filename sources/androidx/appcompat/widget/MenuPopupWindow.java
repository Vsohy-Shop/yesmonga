package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.Transition;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.C0567f;
import androidx.appcompat.view.menu.C0568g;
import androidx.appcompat.view.menu.C0573j;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.lang.reflect.Method;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class MenuPopupWindow extends C0765q0 implements C0792t0 {

    /* renamed from: j1 */
    public static final String f2016j1 = "MenuPopupWindow";

    /* renamed from: k1 */
    public static Method f2017k1;

    /* renamed from: i1 */
    public C0792t0 f2018i1;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static class MenuDropDownListView extends C0733k0 {

        /* renamed from: H0 */
        public final int f2019H0;

        /* renamed from: I0 */
        public final int f2020I0;

        /* renamed from: J0 */
        public C0792t0 f2021J0;

        /* renamed from: K0 */
        public MenuItem f2022K0;

        @C0376v0(17)
        /* renamed from: androidx.appcompat.widget.MenuPopupWindow$MenuDropDownListView$a */
        public static class C0644a {
            @C0373u
            /* renamed from: a */
            public static int m3157a(Configuration configuration) {
                return configuration.getLayoutDirection();
            }
        }

        public MenuDropDownListView(Context context, boolean z) {
            super(context, z);
            if (1 == C0644a.m3157a(context.getResources().getConfiguration())) {
                this.f2019H0 = 21;
                this.f2020I0 = 22;
                return;
            }
            this.f2019H0 = 22;
            this.f2020I0 = 21;
        }

        /* renamed from: d */
        public /* bridge */ /* synthetic */ int mo2869d(int i, boolean z) {
            return super.mo2869d(i, z);
        }

        /* renamed from: e */
        public /* bridge */ /* synthetic */ int mo2870e(int i, int i2, int i3, int i4, int i5) {
            return super.mo2870e(i, i2, i3, i4, i5);
        }

        /* renamed from: f */
        public /* bridge */ /* synthetic */ boolean mo2871f(MotionEvent motionEvent, int i) {
            return super.mo2871f(motionEvent, i);
        }

        public /* bridge */ /* synthetic */ boolean hasFocus() {
            return super.hasFocus();
        }

        public /* bridge */ /* synthetic */ boolean hasWindowFocus() {
            return super.hasWindowFocus();
        }

        public /* bridge */ /* synthetic */ boolean isFocused() {
            return super.isFocused();
        }

        public /* bridge */ /* synthetic */ boolean isInTouchMode() {
            return super.isInTouchMode();
        }

        public boolean onHoverEvent(MotionEvent motionEvent) {
            int i;
            C0567f fVar;
            C0573j jVar;
            int pointToPosition;
            int i2;
            if (this.f2021J0 != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i = headerViewListAdapter.getHeadersCount();
                    fVar = (C0567f) headerViewListAdapter.getWrappedAdapter();
                } else {
                    fVar = (C0567f) adapter;
                    i = 0;
                }
                if (motionEvent.getAction() == 10 || (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i2 = pointToPosition - i) < 0 || i2 >= fVar.getCount()) {
                    jVar = null;
                } else {
                    jVar = fVar.getItem(i2);
                }
                MenuItem menuItem = this.f2022K0;
                if (menuItem != jVar) {
                    C0568g b = fVar.mo2005b();
                    if (menuItem != null) {
                        this.f2021J0.mo1987p(b, menuItem);
                    }
                    this.f2022K0 = jVar;
                    if (jVar != null) {
                        this.f2021J0.mo1986e(b, jVar);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        public boolean onKeyDown(int i, KeyEvent keyEvent) {
            C0567f fVar;
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i == this.f2019H0) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            } else if (listMenuItemView == null || i != this.f2020I0) {
                return super.onKeyDown(i, keyEvent);
            } else {
                setSelection(-1);
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    fVar = (C0567f) ((HeaderViewListAdapter) adapter).getWrappedAdapter();
                } else {
                    fVar = (C0567f) adapter;
                }
                fVar.mo2005b().mo2061f(false);
                return true;
            }
        }

        public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
            return super.onTouchEvent(motionEvent);
        }

        /* renamed from: p */
        public void mo2879p() {
            setSelection(-1);
        }

        public void setHoverListener(C0792t0 t0Var) {
            this.f2021J0 = t0Var;
        }

        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    @C0376v0(23)
    /* renamed from: androidx.appcompat.widget.MenuPopupWindow$a */
    public static class C0645a {
        @C0373u
        /* renamed from: a */
        public static void m3158a(PopupWindow popupWindow, Transition transition) {
            popupWindow.setEnterTransition(transition);
        }

        @C0373u
        /* renamed from: b */
        public static void m3159b(PopupWindow popupWindow, Transition transition) {
            popupWindow.setExitTransition(transition);
        }
    }

    @C0376v0(29)
    /* renamed from: androidx.appcompat.widget.MenuPopupWindow$b */
    public static class C0646b {
        @C0373u
        /* renamed from: a */
        public static void m3160a(PopupWindow popupWindow, boolean z) {
            popupWindow.setTouchModal(z);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f2017k1 = PopupWindow.class.getDeclaredMethod("setTouchModal", new Class[]{Boolean.TYPE});
            }
        } catch (NoSuchMethodException unused) {
        }
    }

    public MenuPopupWindow(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    /* renamed from: e */
    public void mo1986e(@C0359n0 C0568g gVar, @C0359n0 MenuItem menuItem) {
        C0792t0 t0Var = this.f2018i1;
        if (t0Var != null) {
            t0Var.mo1986e(gVar, menuItem);
        }
    }

    /* renamed from: p */
    public void mo1987p(@C0359n0 C0568g gVar, @C0359n0 MenuItem menuItem) {
        C0792t0 t0Var = this.f2018i1;
        if (t0Var != null) {
            t0Var.mo1987p(gVar, menuItem);
        }
    }

    /* renamed from: p0 */
    public void mo2864p0(Object obj) {
        C0645a.m3158a(this.f2513U0, (Transition) obj);
    }

    /* renamed from: q0 */
    public void mo2865q0(Object obj) {
        C0645a.m3159b(this.f2513U0, (Transition) obj);
    }

    /* renamed from: r0 */
    public void mo2866r0(C0792t0 t0Var) {
        this.f2018i1 = t0Var;
    }

    /* renamed from: s0 */
    public void mo2867s0(boolean z) {
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f2017k1;
            if (method != null) {
                try {
                    method.invoke(this.f2513U0, new Object[]{Boolean.valueOf(z)});
                } catch (Exception unused) {
                }
            }
        } else {
            C0646b.m3160a(this.f2513U0, z);
        }
    }

    @C0359n0
    /* renamed from: u */
    public C0733k0 mo2868u(Context context, boolean z) {
        MenuDropDownListView menuDropDownListView = new MenuDropDownListView(context, z);
        menuDropDownListView.setHoverListener(this);
        return menuDropDownListView;
    }
}
