package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.annotation.C0327c1;
import androidx.annotation.C0336f;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.appcompat.C0387a;
import androidx.appcompat.view.menu.C0585n;
import androidx.appcompat.widget.C0792t0;
import androidx.appcompat.widget.MenuPopupWindow;
import androidx.core.view.C18196h2;
import androidx.core.view.C18306m0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.appcompat.view.menu.d */
public final class C0558d extends C0581l implements C0585n, View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: Q0 */
    public static final int f1551Q0 = C0387a.C0397j.abc_cascading_menu_item_layout;

    /* renamed from: R0 */
    public static final int f1552R0 = 0;

    /* renamed from: S0 */
    public static final int f1553S0 = 1;

    /* renamed from: T0 */
    public static final int f1554T0 = 200;

    /* renamed from: E0 */
    public View f1555E0;

    /* renamed from: F0 */
    public int f1556F0;

    /* renamed from: G0 */
    public boolean f1557G0;

    /* renamed from: H0 */
    public boolean f1558H0;

    /* renamed from: I0 */
    public int f1559I0;

    /* renamed from: J0 */
    public int f1560J0;

    /* renamed from: K0 */
    public boolean f1561K0;

    /* renamed from: L0 */
    public boolean f1562L0;

    /* renamed from: M0 */
    public C0585n.C0586a f1563M0;

    /* renamed from: N0 */
    public ViewTreeObserver f1564N0;

    /* renamed from: O0 */
    public PopupWindow.OnDismissListener f1565O0;

    /* renamed from: P0 */
    public boolean f1566P0;

    /* renamed from: X */
    public int f1567X = 0;

    /* renamed from: Y */
    public int f1568Y = 0;

    /* renamed from: Z */
    public View f1569Z;

    /* renamed from: b */
    public final Context f1570b;

    /* renamed from: c */
    public final int f1571c;

    /* renamed from: d */
    public final int f1572d;

    /* renamed from: e */
    public final int f1573e;

    /* renamed from: f */
    public final boolean f1574f;

    /* renamed from: g */
    public final Handler f1575g;

    /* renamed from: v */
    public final List<C0568g> f1576v = new ArrayList();

    /* renamed from: w */
    public final List<C0563d> f1577w = new ArrayList();

    /* renamed from: x */
    public final ViewTreeObserver.OnGlobalLayoutListener f1578x = new C0559a();

    /* renamed from: y */
    public final View.OnAttachStateChangeListener f1579y = new C0560b();

    /* renamed from: z */
    public final C0792t0 f1580z = new C0561c();

    /* renamed from: androidx.appcompat.view.menu.d$a */
    public class C0559a implements ViewTreeObserver.OnGlobalLayoutListener {
        public C0559a() {
        }

        public void onGlobalLayout() {
            if (C0558d.this.mo1967c() && C0558d.this.f1577w.size() > 0 && !C0558d.this.f1577w.get(0).f1588a.mo3576L()) {
                View view = C0558d.this.f1555E0;
                if (view == null || !view.isShown()) {
                    C0558d.this.dismiss();
                    return;
                }
                for (C0563d dVar : C0558d.this.f1577w) {
                    dVar.f1588a.mo1966a();
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.d$b */
    public class C0560b implements View.OnAttachStateChangeListener {
        public C0560b() {
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = C0558d.this.f1564N0;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    C0558d.this.f1564N0 = view.getViewTreeObserver();
                }
                C0558d dVar = C0558d.this;
                dVar.f1564N0.removeGlobalOnLayoutListener(dVar.f1578x);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    /* renamed from: androidx.appcompat.view.menu.d$c */
    public class C0561c implements C0792t0 {

        /* renamed from: androidx.appcompat.view.menu.d$c$a */
        public class C0562a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ C0563d f1584a;

            /* renamed from: b */
            public final /* synthetic */ MenuItem f1585b;

            /* renamed from: c */
            public final /* synthetic */ C0568g f1586c;

            public C0562a(C0563d dVar, MenuItem menuItem, C0568g gVar) {
                this.f1584a = dVar;
                this.f1585b = menuItem;
                this.f1586c = gVar;
            }

            public void run() {
                C0563d dVar = this.f1584a;
                if (dVar != null) {
                    C0558d.this.f1566P0 = true;
                    dVar.f1589b.mo2061f(false);
                    C0558d.this.f1566P0 = false;
                }
                if (this.f1585b.isEnabled() && this.f1585b.hasSubMenu()) {
                    this.f1586c.mo2027O(this.f1585b, 4);
                }
            }
        }

        public C0561c() {
        }

        /* renamed from: e */
        public void mo1986e(@C0359n0 C0568g gVar, @C0359n0 MenuItem menuItem) {
            C0563d dVar = null;
            C0558d.this.f1575g.removeCallbacksAndMessages((Object) null);
            int size = C0558d.this.f1577w.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                } else if (gVar == C0558d.this.f1577w.get(i).f1589b) {
                    break;
                } else {
                    i++;
                }
            }
            if (i != -1) {
                int i2 = i + 1;
                if (i2 < C0558d.this.f1577w.size()) {
                    dVar = C0558d.this.f1577w.get(i2);
                }
                C0558d.this.f1575g.postAtTime(new C0562a(dVar, menuItem, gVar), gVar, SystemClock.uptimeMillis() + 200);
            }
        }

        /* renamed from: p */
        public void mo1987p(@C0359n0 C0568g gVar, @C0359n0 MenuItem menuItem) {
            C0558d.this.f1575g.removeCallbacksAndMessages(gVar);
        }
    }

    /* renamed from: androidx.appcompat.view.menu.d$d */
    public static class C0563d {

        /* renamed from: a */
        public final MenuPopupWindow f1588a;

        /* renamed from: b */
        public final C0568g f1589b;

        /* renamed from: c */
        public final int f1590c;

        public C0563d(@C0359n0 MenuPopupWindow menuPopupWindow, @C0359n0 C0568g gVar, int i) {
            this.f1588a = menuPopupWindow;
            this.f1589b = gVar;
            this.f1590c = i;
        }

        /* renamed from: a */
        public ListView mo1989a() {
            return this.f1588a.mo1975q();
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.appcompat.view.menu.d$e */
    public @interface C0564e {
    }

    public C0558d(@C0359n0 Context context, @C0359n0 View view, @C0336f int i, @C0327c1 int i2, boolean z) {
        this.f1570b = context;
        this.f1569Z = view;
        this.f1572d = i;
        this.f1573e = i2;
        this.f1574f = z;
        this.f1561K0 = false;
        this.f1556F0 = mo1963G();
        Resources resources = context.getResources();
        this.f1571c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C0387a.C0392e.abc_config_prefDialogWidth));
        this.f1575g = new Handler();
    }

    /* renamed from: C */
    public final MenuPopupWindow mo1959C() {
        MenuPopupWindow menuPopupWindow = new MenuPopupWindow(this.f1570b, (AttributeSet) null, this.f1572d, this.f1573e);
        menuPopupWindow.mo2866r0(this.f1580z);
        menuPopupWindow.mo3599f0(this);
        menuPopupWindow.mo3597e0(this);
        menuPopupWindow.mo3583S(this.f1569Z);
        menuPopupWindow.mo3587W(this.f1568Y);
        menuPopupWindow.mo3596d0(true);
        menuPopupWindow.mo3591a0(2);
        return menuPopupWindow;
    }

    /* renamed from: D */
    public final int mo1960D(@C0359n0 C0568g gVar) {
        int size = this.f1577w.size();
        for (int i = 0; i < size; i++) {
            if (gVar == this.f1577w.get(i).f1589b) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: E */
    public final MenuItem mo1961E(@C0359n0 C0568g gVar, @C0359n0 C0568g gVar2) {
        int size = gVar.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = gVar.getItem(i);
            if (item.hasSubMenu() && gVar2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    @C0363p0
    /* renamed from: F */
    public final View mo1962F(@C0359n0 C0563d dVar, @C0359n0 C0568g gVar) {
        int i;
        C0567f fVar;
        int firstVisiblePosition;
        MenuItem E = mo1961E(dVar.f1589b, gVar);
        if (E == null) {
            return null;
        }
        ListView a = dVar.mo1989a();
        ListAdapter adapter = a.getAdapter();
        int i2 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            i = headerViewListAdapter.getHeadersCount();
            fVar = (C0567f) headerViewListAdapter.getWrappedAdapter();
        } else {
            fVar = (C0567f) adapter;
            i = 0;
        }
        int count = fVar.getCount();
        while (true) {
            if (i2 >= count) {
                i2 = -1;
                break;
            } else if (E == fVar.getItem(i2)) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 != -1 && (firstVisiblePosition = (i2 + i) - a.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < a.getChildCount()) {
            return a.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    /* renamed from: G */
    public final int mo1963G() {
        return C18196h2.m82553Z(this.f1569Z) == 1 ? 0 : 1;
    }

    /* renamed from: H */
    public final int mo1964H(int i) {
        List<C0563d> list = this.f1577w;
        ListView a = list.get(list.size() - 1).mo1989a();
        int[] iArr = new int[2];
        a.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.f1555E0.getWindowVisibleDisplayFrame(rect);
        if (this.f1556F0 == 1) {
            if (iArr[0] + a.getWidth() + i > rect.right) {
                return 0;
            }
            return 1;
        } else if (iArr[0] - i < 0) {
            return 1;
        } else {
            return 0;
        }
    }

    /* renamed from: I */
    public final void mo1965I(@C0359n0 C0568g gVar) {
        View view;
        C0563d dVar;
        boolean z;
        int i;
        int i2;
        int i3;
        LayoutInflater from = LayoutInflater.from(this.f1570b);
        C0567f fVar = new C0567f(gVar, from, this.f1574f, f1551Q0);
        if (!mo1967c() && this.f1561K0) {
            fVar.mo2008e(true);
        } else if (mo1967c()) {
            fVar.mo2008e(C0581l.m2796A(gVar));
        }
        int r = C0581l.m2798r(fVar, (ViewGroup) null, this.f1570b, this.f1571c);
        MenuPopupWindow C = mo1959C();
        C.mo2728o(fVar);
        C.mo3585U(r);
        C.mo3587W(this.f1568Y);
        if (this.f1577w.size() > 0) {
            List<C0563d> list = this.f1577w;
            dVar = list.get(list.size() - 1);
            view = mo1962F(dVar, gVar);
        } else {
            dVar = null;
            view = null;
        }
        if (view != null) {
            C.mo2867s0(false);
            C.mo2864p0((Object) null);
            int H = mo1964H(r);
            if (H == 1) {
                z = true;
            } else {
                z = false;
            }
            this.f1556F0 = H;
            if (Build.VERSION.SDK_INT >= 26) {
                C.mo3583S(view);
                i2 = 0;
                i = 0;
            } else {
                int[] iArr = new int[2];
                this.f1569Z.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                if ((this.f1568Y & 7) == 5) {
                    iArr[0] = iArr[0] + this.f1569Z.getWidth();
                    iArr2[0] = iArr2[0] + view.getWidth();
                }
                i = iArr2[0] - iArr[0];
                i2 = iArr2[1] - iArr[1];
            }
            if ((this.f1568Y & 5) != 5) {
                if (z) {
                    r = view.getWidth();
                }
                i3 = i - r;
                C.mo3598f(i3);
                C.mo3602h0(true);
                C.mo3604j(i2);
            } else if (!z) {
                r = view.getWidth();
                i3 = i - r;
                C.mo3598f(i3);
                C.mo3602h0(true);
                C.mo3604j(i2);
            }
            i3 = i + r;
            C.mo3598f(i3);
            C.mo3602h0(true);
            C.mo3604j(i2);
        } else {
            if (this.f1557G0) {
                C.mo3598f(this.f1559I0);
            }
            if (this.f1558H0) {
                C.mo3604j(this.f1560J0);
            }
            C.mo3588X(mo2242p());
        }
        this.f1577w.add(new C0563d(C, gVar, this.f1556F0));
        C.mo1966a();
        ListView q = C.mo1975q();
        q.setOnKeyListener(this);
        if (dVar == null && this.f1562L0 && gVar.mo2014A() != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(C0387a.C0397j.abc_popup_menu_header_item_layout, q, false);
            frameLayout.setEnabled(false);
            ((TextView) frameLayout.findViewById(16908310)).setText(gVar.mo2014A());
            q.addHeaderView(frameLayout, (Object) null, false);
            C.mo1966a();
        }
    }

    /* renamed from: a */
    public void mo1966a() {
        boolean z;
        if (!mo1967c()) {
            for (C0568g I : this.f1576v) {
                mo1965I(I);
            }
            this.f1576v.clear();
            View view = this.f1569Z;
            this.f1555E0 = view;
            if (view != null) {
                if (this.f1564N0 == null) {
                    z = true;
                } else {
                    z = false;
                }
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                this.f1564N0 = viewTreeObserver;
                if (z) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.f1578x);
                }
                this.f1555E0.addOnAttachStateChangeListener(this.f1579y);
            }
        }
    }

    /* renamed from: b */
    public void mo1936b(C0568g gVar, boolean z) {
        int D = mo1960D(gVar);
        if (D >= 0) {
            int i = D + 1;
            if (i < this.f1577w.size()) {
                this.f1577w.get(i).f1589b.mo2061f(false);
            }
            C0563d remove = this.f1577w.remove(D);
            remove.f1589b.mo2031S(this);
            if (this.f1566P0) {
                remove.f1588a.mo2865q0((Object) null);
                remove.f1588a.mo3584T(0);
            }
            remove.f1588a.dismiss();
            int size = this.f1577w.size();
            if (size > 0) {
                this.f1556F0 = this.f1577w.get(size - 1).f1590c;
            } else {
                this.f1556F0 = mo1963G();
            }
            if (size == 0) {
                dismiss();
                C0585n.C0586a aVar = this.f1563M0;
                if (aVar != null) {
                    aVar.mo1207b(gVar, true);
                }
                ViewTreeObserver viewTreeObserver = this.f1564N0;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        this.f1564N0.removeGlobalOnLayoutListener(this.f1578x);
                    }
                    this.f1564N0 = null;
                }
                this.f1555E0.removeOnAttachStateChangeListener(this.f1579y);
                this.f1565O0.onDismiss();
            } else if (z) {
                this.f1577w.get(0).f1589b.mo2061f(false);
            }
        }
    }

    /* renamed from: c */
    public boolean mo1967c() {
        return this.f1577w.size() > 0 && this.f1577w.get(0).f1588a.mo1967c();
    }

    public void dismiss() {
        int size = this.f1577w.size();
        if (size > 0) {
            C0563d[] dVarArr = (C0563d[]) this.f1577w.toArray(new C0563d[size]);
            for (int i = size - 1; i >= 0; i--) {
                C0563d dVar = dVarArr[i];
                if (dVar.f1588a.mo1967c()) {
                    dVar.f1588a.dismiss();
                }
            }
        }
    }

    /* renamed from: e */
    public void mo1939e(C0585n.C0586a aVar) {
        this.f1563M0 = aVar;
    }

    /* renamed from: f */
    public void mo1969f(Parcelable parcelable) {
    }

    /* renamed from: g */
    public boolean mo1940g(C0594s sVar) {
        for (C0563d next : this.f1577w) {
            if (sVar == next.f1589b) {
                next.mo1989a().requestFocus();
                return true;
            }
        }
        if (!sVar.hasVisibleItems()) {
            return false;
        }
        mo1971n(sVar);
        C0585n.C0586a aVar = this.f1563M0;
        if (aVar != null) {
            aVar.mo1208c(sVar);
        }
        return true;
    }

    /* renamed from: i */
    public Parcelable mo1970i() {
        return null;
    }

    /* renamed from: j */
    public void mo1943j(boolean z) {
        for (C0563d a : this.f1577w) {
            C0581l.m2797B(a.mo1989a().getAdapter()).notifyDataSetChanged();
        }
    }

    /* renamed from: k */
    public boolean mo1944k() {
        return false;
    }

    /* renamed from: n */
    public void mo1971n(C0568g gVar) {
        gVar.mo2052c(this, this.f1570b);
        if (mo1967c()) {
            mo1965I(gVar);
        } else {
            this.f1576v.add(gVar);
        }
    }

    /* renamed from: o */
    public boolean mo1972o() {
        return false;
    }

    public void onDismiss() {
        C0563d dVar;
        int size = this.f1577w.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                dVar = null;
                break;
            }
            dVar = this.f1577w.get(i);
            if (!dVar.f1588a.mo1967c()) {
                break;
            }
            i++;
        }
        if (dVar != null) {
            dVar.f1589b.mo2061f(false);
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
        if (this.f1577w.isEmpty()) {
            return null;
        }
        List<C0563d> list = this.f1577w;
        return list.get(list.size() - 1).mo1989a();
    }

    /* renamed from: s */
    public void mo1976s(@C0359n0 View view) {
        if (this.f1569Z != view) {
            this.f1569Z = view;
            this.f1568Y = C18306m0.m82991d(this.f1567X, C18196h2.m82553Z(view));
        }
    }

    /* renamed from: u */
    public void mo1977u(boolean z) {
        this.f1561K0 = z;
    }

    /* renamed from: v */
    public void mo1978v(int i) {
        if (this.f1567X != i) {
            this.f1567X = i;
            this.f1568Y = C18306m0.m82991d(i, C18196h2.m82553Z(this.f1569Z));
        }
    }

    /* renamed from: w */
    public void mo1979w(int i) {
        this.f1557G0 = true;
        this.f1559I0 = i;
    }

    /* renamed from: x */
    public void mo1980x(PopupWindow.OnDismissListener onDismissListener) {
        this.f1565O0 = onDismissListener;
    }

    /* renamed from: y */
    public void mo1981y(boolean z) {
        this.f1562L0 = z;
    }

    /* renamed from: z */
    public void mo1982z(int i) {
        this.f1558H0 = true;
        this.f1560J0 = i;
    }
}
