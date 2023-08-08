package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.View;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.annotation.C0327c1;
import androidx.annotation.C0336f;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import androidx.annotation.RestrictTo;
import androidx.appcompat.C0387a;
import androidx.appcompat.view.menu.C0585n;
import androidx.core.view.C18196h2;
import androidx.core.view.C18306m0;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.appcompat.view.menu.m */
public class C0582m implements C0572i {

    /* renamed from: m */
    public static final int f1700m = 48;

    /* renamed from: a */
    public final Context f1701a;

    /* renamed from: b */
    public final C0568g f1702b;

    /* renamed from: c */
    public final boolean f1703c;

    /* renamed from: d */
    public final int f1704d;

    /* renamed from: e */
    public final int f1705e;

    /* renamed from: f */
    public View f1706f;

    /* renamed from: g */
    public int f1707g;

    /* renamed from: h */
    public boolean f1708h;

    /* renamed from: i */
    public C0585n.C0586a f1709i;

    /* renamed from: j */
    public C0581l f1710j;

    /* renamed from: k */
    public PopupWindow.OnDismissListener f1711k;

    /* renamed from: l */
    public final PopupWindow.OnDismissListener f1712l;

    /* renamed from: androidx.appcompat.view.menu.m$a */
    public class C0583a implements PopupWindow.OnDismissListener {
        public C0583a() {
        }

        public void onDismiss() {
            C0582m.this.mo2249g();
        }
    }

    @C0376v0(17)
    /* renamed from: androidx.appcompat.view.menu.m$b */
    public static class C0584b {
        @C0373u
        /* renamed from: a */
        public static void m2830a(Display display, Point point) {
            display.getRealSize(point);
        }
    }

    public C0582m(@C0359n0 Context context, @C0359n0 C0568g gVar) {
        this(context, gVar, (View) null, false, C0387a.C0389b.popupMenuStyle, 0);
    }

    /* renamed from: a */
    public void mo2109a(@C0363p0 C0585n.C0586a aVar) {
        this.f1709i = aVar;
        C0581l lVar = this.f1710j;
        if (lVar != null) {
            lVar.mo1939e(aVar);
        }
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [androidx.appcompat.view.menu.l, androidx.appcompat.view.menu.n] */
    /* JADX WARNING: type inference failed for: r7v1, types: [androidx.appcompat.view.menu.r] */
    /* JADX WARNING: type inference failed for: r1v13, types: [androidx.appcompat.view.menu.d] */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.annotation.C0359n0
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.appcompat.view.menu.C0581l mo2244b() {
        /*
            r14 = this;
            android.content.Context r0 = r14.f1701a
            java.lang.String r1 = "window"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.view.Display r0 = r0.getDefaultDisplay()
            android.graphics.Point r1 = new android.graphics.Point
            r1.<init>()
            androidx.appcompat.view.menu.C0582m.C0584b.m2830a(r0, r1)
            int r0 = r1.x
            int r1 = r1.y
            int r0 = java.lang.Math.min(r0, r1)
            android.content.Context r1 = r14.f1701a
            android.content.res.Resources r1 = r1.getResources()
            int r2 = androidx.appcompat.C0387a.C0392e.abc_cascading_menus_min_smallest_width
            int r1 = r1.getDimensionPixelSize(r2)
            if (r0 < r1) goto L_0x002e
            r0 = 1
            goto L_0x002f
        L_0x002e:
            r0 = 0
        L_0x002f:
            if (r0 == 0) goto L_0x0042
            androidx.appcompat.view.menu.d r0 = new androidx.appcompat.view.menu.d
            android.content.Context r2 = r14.f1701a
            android.view.View r3 = r14.f1706f
            int r4 = r14.f1704d
            int r5 = r14.f1705e
            boolean r6 = r14.f1703c
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            goto L_0x0054
        L_0x0042:
            androidx.appcompat.view.menu.r r0 = new androidx.appcompat.view.menu.r
            android.content.Context r8 = r14.f1701a
            androidx.appcompat.view.menu.g r9 = r14.f1702b
            android.view.View r10 = r14.f1706f
            int r11 = r14.f1704d
            int r12 = r14.f1705e
            boolean r13 = r14.f1703c
            r7 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13)
        L_0x0054:
            androidx.appcompat.view.menu.g r1 = r14.f1702b
            r0.mo1971n(r1)
            android.widget.PopupWindow$OnDismissListener r1 = r14.f1712l
            r0.mo1980x(r1)
            android.view.View r1 = r14.f1706f
            r0.mo1976s(r1)
            androidx.appcompat.view.menu.n$a r1 = r14.f1709i
            r0.mo1939e(r1)
            boolean r1 = r14.f1708h
            r0.mo1977u(r1)
            int r1 = r14.f1707g
            r0.mo1978v(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.C0582m.mo2244b():androidx.appcompat.view.menu.l");
    }

    /* renamed from: c */
    public int mo2245c() {
        return this.f1707g;
    }

    /* renamed from: d */
    public ListView mo2246d() {
        return mo2247e().mo1975q();
    }

    public void dismiss() {
        if (mo2248f()) {
            this.f1710j.dismiss();
        }
    }

    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: e */
    public C0581l mo2247e() {
        if (this.f1710j == null) {
            this.f1710j = mo2244b();
        }
        return this.f1710j;
    }

    /* renamed from: f */
    public boolean mo2248f() {
        C0581l lVar = this.f1710j;
        return lVar != null && lVar.mo1967c();
    }

    /* renamed from: g */
    public void mo2249g() {
        this.f1710j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f1711k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    /* renamed from: h */
    public void mo2250h(@C0359n0 View view) {
        this.f1706f = view;
    }

    /* renamed from: i */
    public void mo2251i(boolean z) {
        this.f1708h = z;
        C0581l lVar = this.f1710j;
        if (lVar != null) {
            lVar.mo1977u(z);
        }
    }

    /* renamed from: j */
    public void mo2252j(int i) {
        this.f1707g = i;
    }

    /* renamed from: k */
    public void mo2253k(@C0363p0 PopupWindow.OnDismissListener onDismissListener) {
        this.f1711k = onDismissListener;
    }

    /* renamed from: l */
    public void mo2254l() {
        if (!mo2257o()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    /* renamed from: m */
    public void mo2255m(int i, int i2) {
        if (!mo2258p(i, i2)) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    /* renamed from: n */
    public final void mo2256n(int i, int i2, boolean z, boolean z2) {
        C0581l e = mo2247e();
        e.mo1981y(z2);
        if (z) {
            if ((C18306m0.m82991d(this.f1707g, C18196h2.m82553Z(this.f1706f)) & 7) == 5) {
                i -= this.f1706f.getWidth();
            }
            e.mo1979w(i);
            e.mo1982z(i2);
            int i3 = (int) ((this.f1701a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            e.mo2243t(new Rect(i - i3, i2 - i3, i + i3, i2 + i3));
        }
        e.mo1966a();
    }

    /* renamed from: o */
    public boolean mo2257o() {
        if (mo2248f()) {
            return true;
        }
        if (this.f1706f == null) {
            return false;
        }
        mo2256n(0, 0, false, false);
        return true;
    }

    /* renamed from: p */
    public boolean mo2258p(int i, int i2) {
        if (mo2248f()) {
            return true;
        }
        if (this.f1706f == null) {
            return false;
        }
        mo2256n(i, i2, true, true);
        return true;
    }

    public C0582m(@C0359n0 Context context, @C0359n0 C0568g gVar, @C0359n0 View view) {
        this(context, gVar, view, false, C0387a.C0389b.popupMenuStyle, 0);
    }

    public C0582m(@C0359n0 Context context, @C0359n0 C0568g gVar, @C0359n0 View view, boolean z, @C0336f int i) {
        this(context, gVar, view, z, i, 0);
    }

    public C0582m(@C0359n0 Context context, @C0359n0 C0568g gVar, @C0359n0 View view, boolean z, @C0336f int i, @C0327c1 int i2) {
        this.f1707g = C18306m0.f46960b;
        this.f1712l = new C0583a();
        this.f1701a = context;
        this.f1702b = gVar;
        this.f1706f = view;
        this.f1703c = z;
        this.f1704d = i;
        this.f1705e = i2;
    }
}
