package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.C0387a;
import androidx.appcompat.view.menu.C0585n;
import androidx.appcompat.widget.MenuPopupWindow;
import androidx.core.view.C18196h2;

/* renamed from: androidx.appcompat.view.menu.r */
public final class C0591r extends C0581l implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, C0585n, View.OnKeyListener {

    /* renamed from: K0 */
    public static final int f1715K0 = C0387a.C0397j.abc_popup_menu_item_layout;

    /* renamed from: E0 */
    public ViewTreeObserver f1716E0;

    /* renamed from: F0 */
    public boolean f1717F0;

    /* renamed from: G0 */
    public boolean f1718G0;

    /* renamed from: H0 */
    public int f1719H0;

    /* renamed from: I0 */
    public int f1720I0 = 0;

    /* renamed from: J0 */
    public boolean f1721J0;

    /* renamed from: X */
    public View f1722X;

    /* renamed from: Y */
    public View f1723Y;

    /* renamed from: Z */
    public C0585n.C0586a f1724Z;

    /* renamed from: b */
    public final Context f1725b;

    /* renamed from: c */
    public final C0568g f1726c;

    /* renamed from: d */
    public final C0567f f1727d;

    /* renamed from: e */
    public final boolean f1728e;

    /* renamed from: f */
    public final int f1729f;

    /* renamed from: g */
    public final int f1730g;

    /* renamed from: v */
    public final int f1731v;

    /* renamed from: w */
    public final MenuPopupWindow f1732w;

    /* renamed from: x */
    public final ViewTreeObserver.OnGlobalLayoutListener f1733x = new C0592a();

    /* renamed from: y */
    public final View.OnAttachStateChangeListener f1734y = new C0593b();

    /* renamed from: z */
    public PopupWindow.OnDismissListener f1735z;

    /* renamed from: androidx.appcompat.view.menu.r$a */
    public class C0592a implements ViewTreeObserver.OnGlobalLayoutListener {
        public C0592a() {
        }

        public void onGlobalLayout() {
            if (C0591r.this.mo1967c() && !C0591r.this.f1732w.mo3576L()) {
                View view = C0591r.this.f1723Y;
                if (view == null || !view.isShown()) {
                    C0591r.this.dismiss();
                } else {
                    C0591r.this.f1732w.mo1966a();
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.r$b */
    public class C0593b implements View.OnAttachStateChangeListener {
        public C0593b() {
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = C0591r.this.f1716E0;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    C0591r.this.f1716E0 = view.getViewTreeObserver();
                }
                C0591r rVar = C0591r.this;
                rVar.f1716E0.removeGlobalOnLayoutListener(rVar.f1733x);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public C0591r(Context context, C0568g gVar, View view, int i, int i2, boolean z) {
        this.f1725b = context;
        this.f1726c = gVar;
        this.f1728e = z;
        this.f1727d = new C0567f(gVar, LayoutInflater.from(context), z, f1715K0);
        this.f1730g = i;
        this.f1731v = i2;
        Resources resources = context.getResources();
        this.f1729f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C0387a.C0392e.abc_config_prefDialogWidth));
        this.f1722X = view;
        this.f1732w = new MenuPopupWindow(context, (AttributeSet) null, i, i2);
        gVar.mo2052c(this, context);
    }

    /* renamed from: C */
    public final boolean mo2285C() {
        View view;
        boolean z;
        if (mo1967c()) {
            return true;
        }
        if (this.f1717F0 || (view = this.f1722X) == null) {
            return false;
        }
        this.f1723Y = view;
        this.f1732w.mo3597e0(this);
        this.f1732w.mo3599f0(this);
        this.f1732w.mo3596d0(true);
        View view2 = this.f1723Y;
        if (this.f1716E0 == null) {
            z = true;
        } else {
            z = false;
        }
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f1716E0 = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f1733x);
        }
        view2.addOnAttachStateChangeListener(this.f1734y);
        this.f1732w.mo3583S(view2);
        this.f1732w.mo3587W(this.f1720I0);
        if (!this.f1718G0) {
            this.f1719H0 = C0581l.m2798r(this.f1727d, (ViewGroup) null, this.f1725b, this.f1729f);
            this.f1718G0 = true;
        }
        this.f1732w.mo3585U(this.f1719H0);
        this.f1732w.mo3591a0(2);
        this.f1732w.mo3588X(mo2242p());
        this.f1732w.mo1966a();
        ListView q = this.f1732w.mo1975q();
        q.setOnKeyListener(this);
        if (this.f1721J0 && this.f1726c.mo2014A() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f1725b).inflate(C0387a.C0397j.abc_popup_menu_header_item_layout, q, false);
            TextView textView = (TextView) frameLayout.findViewById(16908310);
            if (textView != null) {
                textView.setText(this.f1726c.mo2014A());
            }
            frameLayout.setEnabled(false);
            q.addHeaderView(frameLayout, (Object) null, false);
        }
        this.f1732w.mo2728o(this.f1727d);
        this.f1732w.mo1966a();
        return true;
    }

    /* renamed from: a */
    public void mo1966a() {
        if (!mo2285C()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    /* renamed from: b */
    public void mo1936b(C0568g gVar, boolean z) {
        if (gVar == this.f1726c) {
            dismiss();
            C0585n.C0586a aVar = this.f1724Z;
            if (aVar != null) {
                aVar.mo1207b(gVar, z);
            }
        }
    }

    /* renamed from: c */
    public boolean mo1967c() {
        return !this.f1717F0 && this.f1732w.mo1967c();
    }

    public void dismiss() {
        if (mo1967c()) {
            this.f1732w.dismiss();
        }
    }

    /* renamed from: e */
    public void mo1939e(C0585n.C0586a aVar) {
        this.f1724Z = aVar;
    }

    /* renamed from: f */
    public void mo1969f(Parcelable parcelable) {
    }

    /* renamed from: g */
    public boolean mo1940g(C0594s sVar) {
        if (sVar.hasVisibleItems()) {
            C0582m mVar = new C0582m(this.f1725b, sVar, this.f1723Y, this.f1728e, this.f1730g, this.f1731v);
            mVar.mo2109a(this.f1724Z);
            mVar.mo2251i(C0581l.m2796A(sVar));
            mVar.mo2253k(this.f1735z);
            this.f1735z = null;
            this.f1726c.mo2061f(false);
            int d = this.f1732w.mo3595d();
            int m = this.f1732w.mo3608m();
            if ((Gravity.getAbsoluteGravity(this.f1720I0, C18196h2.m82553Z(this.f1722X)) & 7) == 5) {
                d += this.f1722X.getWidth();
            }
            if (mVar.mo2258p(d, m)) {
                C0585n.C0586a aVar = this.f1724Z;
                if (aVar == null) {
                    return true;
                }
                aVar.mo1208c(sVar);
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public Parcelable mo1970i() {
        return null;
    }

    /* renamed from: j */
    public void mo1943j(boolean z) {
        this.f1718G0 = false;
        C0567f fVar = this.f1727d;
        if (fVar != null) {
            fVar.notifyDataSetChanged();
        }
    }

    /* renamed from: k */
    public boolean mo1944k() {
        return false;
    }

    /* renamed from: n */
    public void mo1971n(C0568g gVar) {
    }

    public void onDismiss() {
        this.f1717F0 = true;
        this.f1726c.close();
        ViewTreeObserver viewTreeObserver = this.f1716E0;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f1716E0 = this.f1723Y.getViewTreeObserver();
            }
            this.f1716E0.removeGlobalOnLayoutListener(this.f1733x);
            this.f1716E0 = null;
        }
        this.f1723Y.removeOnAttachStateChangeListener(this.f1734y);
        PopupWindow.OnDismissListener onDismissListener = this.f1735z;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    /* renamed from: q */
    public ListView mo1975q() {
        return this.f1732w.mo1975q();
    }

    /* renamed from: s */
    public void mo1976s(View view) {
        this.f1722X = view;
    }

    /* renamed from: u */
    public void mo1977u(boolean z) {
        this.f1727d.mo2008e(z);
    }

    /* renamed from: v */
    public void mo1978v(int i) {
        this.f1720I0 = i;
    }

    /* renamed from: w */
    public void mo1979w(int i) {
        this.f1732w.mo3598f(i);
    }

    /* renamed from: x */
    public void mo1980x(PopupWindow.OnDismissListener onDismissListener) {
        this.f1735z = onDismissListener;
    }

    /* renamed from: y */
    public void mo1981y(boolean z) {
        this.f1721J0 = z;
    }

    /* renamed from: z */
    public void mo1982z(int i) {
        this.f1732w.mo3604j(i);
    }
}
