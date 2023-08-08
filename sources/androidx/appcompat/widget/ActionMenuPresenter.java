package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.appcompat.C0387a;
import androidx.appcompat.view.C0534a;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.C0556b;
import androidx.appcompat.view.menu.C0568g;
import androidx.appcompat.view.menu.C0573j;
import androidx.appcompat.view.menu.C0582m;
import androidx.appcompat.view.menu.C0585n;
import androidx.appcompat.view.menu.C0587o;
import androidx.appcompat.view.menu.C0590q;
import androidx.appcompat.view.menu.C0594s;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.graphics.drawable.C17549d;
import androidx.core.view.C18119b;
import java.util.ArrayList;

public class ActionMenuPresenter extends C0556b implements C18119b.C18120a {

    /* renamed from: T0 */
    public static final String f1802T0 = "ActionMenuPresenter";

    /* renamed from: E0 */
    public int f1803E0;

    /* renamed from: F0 */
    public int f1804F0;

    /* renamed from: G0 */
    public int f1805G0;

    /* renamed from: H0 */
    public boolean f1806H0;

    /* renamed from: I0 */
    public boolean f1807I0;

    /* renamed from: J0 */
    public boolean f1808J0;

    /* renamed from: K0 */
    public boolean f1809K0;

    /* renamed from: L0 */
    public int f1810L0;

    /* renamed from: M0 */
    public final SparseBooleanArray f1811M0 = new SparseBooleanArray();

    /* renamed from: N0 */
    public C0609e f1812N0;

    /* renamed from: O0 */
    public C0604a f1813O0;

    /* renamed from: P0 */
    public C0606c f1814P0;

    /* renamed from: Q0 */
    public C0605b f1815Q0;

    /* renamed from: R0 */
    public final C0610f f1816R0 = new C0610f();

    /* renamed from: S0 */
    public int f1817S0;

    /* renamed from: X */
    public boolean f1818X;

    /* renamed from: Y */
    public boolean f1819Y;

    /* renamed from: Z */
    public boolean f1820Z;

    /* renamed from: y */
    public C0607d f1821y;

    /* renamed from: z */
    public Drawable f1822z;

    @SuppressLint({"BanParcelableUsage"})
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0603a();

        /* renamed from: a */
        public int f1823a;

        /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$SavedState$a */
        public class C0603a implements Parcelable.Creator<SavedState> {
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* renamed from: b */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState() {
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f1823a);
        }

        public SavedState(Parcel parcel) {
            this.f1823a = parcel.readInt();
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$a */
    public class C0604a extends C0582m {
        public C0604a(Context context, C0594s sVar, View view) {
            super(context, sVar, view, false, C0387a.C0389b.actionOverflowMenuStyle);
            if (!((C0573j) sVar.getItem()).mo2142o()) {
                View view2 = ActionMenuPresenter.this.f1821y;
                mo2250h(view2 == null ? (View) ActionMenuPresenter.this.f1546w : view2);
            }
            mo2109a(ActionMenuPresenter.this.f1816R0);
        }

        /* renamed from: g */
        public void mo2249g() {
            ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
            actionMenuPresenter.f1813O0 = null;
            actionMenuPresenter.f1817S0 = 0;
            super.mo2249g();
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$b */
    public class C0605b extends ActionMenuItemView.C0554b {
        public C0605b() {
        }

        /* renamed from: a */
        public C0590q mo1856a() {
            C0604a aVar = ActionMenuPresenter.this.f1813O0;
            if (aVar != null) {
                return aVar.mo2247e();
            }
            return null;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$c */
    public class C0606c implements Runnable {

        /* renamed from: a */
        public C0609e f1826a;

        public C0606c(C0609e eVar) {
            this.f1826a = eVar;
        }

        public void run() {
            if (ActionMenuPresenter.this.f1540c != null) {
                ActionMenuPresenter.this.f1540c.mo2057d();
            }
            View view = (View) ActionMenuPresenter.this.f1546w;
            if (!(view == null || view.getWindowToken() == null || !this.f1826a.mo2257o())) {
                ActionMenuPresenter.this.f1812N0 = this.f1826a;
            }
            ActionMenuPresenter.this.f1814P0 = null;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$d */
    public class C0607d extends AppCompatImageView implements ActionMenuView.C0611a {

        /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$d$a */
        public class C0608a extends C0760p0 {

            /* renamed from: x */
            public final /* synthetic */ ActionMenuPresenter f1829x;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0608a(View view, ActionMenuPresenter actionMenuPresenter) {
                super(view);
                this.f1829x = actionMenuPresenter;
            }

            /* renamed from: b */
            public C0590q mo1854b() {
                C0609e eVar = ActionMenuPresenter.this.f1812N0;
                if (eVar == null) {
                    return null;
                }
                return eVar.mo2247e();
            }

            /* renamed from: c */
            public boolean mo1855c() {
                ActionMenuPresenter.this.mo2451Q();
                return true;
            }

            /* renamed from: d */
            public boolean mo2462d() {
                ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
                if (actionMenuPresenter.f1814P0 != null) {
                    return false;
                }
                actionMenuPresenter.mo2439E();
                return true;
            }
        }

        public C0607d(Context context) {
            super(context, (AttributeSet) null, C0387a.C0389b.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            C0757o1.m3709a(this, getContentDescription());
            setOnTouchListener(new C0608a(this, ActionMenuPresenter.this));
        }

        /* renamed from: a */
        public boolean mo1830a() {
            return false;
        }

        /* renamed from: c */
        public boolean mo1831c() {
            return false;
        }

        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            ActionMenuPresenter.this.mo2451Q();
            return true;
        }

        public boolean setFrame(int i, int i2, int i3, int i4) {
            boolean frame = super.setFrame(i, i2, i3, i4);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (!(drawable == null || background == null)) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                C17549d.m80450l(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$e */
    public class C0609e extends C0582m {
        public C0609e(Context context, C0568g gVar, View view, boolean z) {
            super(context, gVar, view, z, C0387a.C0389b.actionOverflowMenuStyle);
            mo2252j(8388613);
            mo2109a(ActionMenuPresenter.this.f1816R0);
        }

        /* renamed from: g */
        public void mo2249g() {
            if (ActionMenuPresenter.this.f1540c != null) {
                ActionMenuPresenter.this.f1540c.close();
            }
            ActionMenuPresenter.this.f1812N0 = null;
            super.mo2249g();
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$f */
    public class C0610f implements C0585n.C0586a {
        public C0610f() {
        }

        /* renamed from: b */
        public void mo1207b(@C0359n0 C0568g gVar, boolean z) {
            if (gVar instanceof C0594s) {
                gVar.mo2019G().mo2061f(false);
            }
            C0585n.C0586a q = ActionMenuPresenter.this.mo1950q();
            if (q != null) {
                q.mo1207b(gVar, z);
            }
        }

        /* renamed from: c */
        public boolean mo1208c(@C0359n0 C0568g gVar) {
            if (gVar == ActionMenuPresenter.this.f1540c) {
                return false;
            }
            ActionMenuPresenter.this.f1817S0 = ((C0594s) gVar).getItem().getItemId();
            C0585n.C0586a q = ActionMenuPresenter.this.mo1950q();
            if (q != null) {
                return q.mo1208c(gVar);
            }
            return false;
        }
    }

    public ActionMenuPresenter(Context context) {
        super(context, C0387a.C0397j.abc_action_menu_layout, C0387a.C0397j.abc_action_menu_item_layout);
    }

    /* renamed from: B */
    public boolean mo2436B() {
        return mo2439E() | mo2440F();
    }

    /* renamed from: C */
    public final View mo2437C(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f1546w;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof C0587o.C0588a) && ((C0587o.C0588a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: D */
    public Drawable mo2438D() {
        C0607d dVar = this.f1821y;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (this.f1818X) {
            return this.f1822z;
        }
        return null;
    }

    /* renamed from: E */
    public boolean mo2439E() {
        C0587o oVar;
        C0606c cVar = this.f1814P0;
        if (cVar == null || (oVar = this.f1546w) == null) {
            C0609e eVar = this.f1812N0;
            if (eVar == null) {
                return false;
            }
            eVar.dismiss();
            return true;
        }
        ((View) oVar).removeCallbacks(cVar);
        this.f1814P0 = null;
        return true;
    }

    /* renamed from: F */
    public boolean mo2440F() {
        C0604a aVar = this.f1813O0;
        if (aVar == null) {
            return false;
        }
        aVar.dismiss();
        return true;
    }

    /* renamed from: G */
    public boolean mo2441G() {
        return this.f1814P0 != null || mo2442H();
    }

    /* renamed from: H */
    public boolean mo2442H() {
        C0609e eVar = this.f1812N0;
        return eVar != null && eVar.mo2248f();
    }

    /* renamed from: I */
    public boolean mo2443I() {
        return this.f1819Y;
    }

    /* renamed from: J */
    public void mo2444J(Configuration configuration) {
        if (!this.f1806H0) {
            this.f1805G0 = C0534a.m2478b(this.f1539b).mo1748d();
        }
        C0568g gVar = this.f1540c;
        if (gVar != null) {
            gVar.mo2026N(true);
        }
    }

    /* renamed from: K */
    public void mo2445K(boolean z) {
        this.f1809K0 = z;
    }

    /* renamed from: L */
    public void mo2446L(int i) {
        this.f1805G0 = i;
        this.f1806H0 = true;
    }

    /* renamed from: M */
    public void mo2447M(ActionMenuView actionMenuView) {
        this.f1546w = actionMenuView;
        actionMenuView.mo1858c(this.f1540c);
    }

    /* renamed from: N */
    public void mo2448N(Drawable drawable) {
        C0607d dVar = this.f1821y;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
            return;
        }
        this.f1818X = true;
        this.f1822z = drawable;
    }

    /* renamed from: O */
    public void mo2449O(boolean z) {
        this.f1819Y = z;
        this.f1820Z = true;
    }

    /* renamed from: P */
    public void mo2450P(int i, boolean z) {
        this.f1803E0 = i;
        this.f1807I0 = z;
        this.f1808J0 = true;
    }

    /* renamed from: Q */
    public boolean mo2451Q() {
        C0568g gVar;
        if (!this.f1819Y || mo2442H() || (gVar = this.f1540c) == null || this.f1546w == null || this.f1814P0 != null || gVar.mo2016C().isEmpty()) {
            return false;
        }
        C0606c cVar = new C0606c(new C0609e(this.f1539b, this.f1540c, this.f1821y, true));
        this.f1814P0 = cVar;
        ((View) this.f1546w).post(cVar);
        return true;
    }

    /* renamed from: a */
    public void mo2452a(boolean z) {
        if (z) {
            super.mo1940g((C0594s) null);
            return;
        }
        C0568g gVar = this.f1540c;
        if (gVar != null) {
            gVar.mo2061f(false);
        }
    }

    /* renamed from: b */
    public void mo1936b(C0568g gVar, boolean z) {
        mo2436B();
        super.mo1936b(gVar, z);
    }

    /* renamed from: f */
    public void mo1969f(Parcelable parcelable) {
        int i;
        MenuItem findItem;
        if ((parcelable instanceof SavedState) && (i = ((SavedState) parcelable).f1823a) > 0 && (findItem = this.f1540c.findItem(i)) != null) {
            mo1940g((C0594s) findItem.getSubMenu());
        }
    }

    /* renamed from: g */
    public boolean mo1940g(C0594s sVar) {
        boolean z = false;
        if (!sVar.hasVisibleItems()) {
            return false;
        }
        C0594s sVar2 = sVar;
        while (sVar2.mo2292n0() != this.f1540c) {
            sVar2 = (C0594s) sVar2.mo2292n0();
        }
        View C = mo2437C(sVar2.getItem());
        if (C == null) {
            return false;
        }
        this.f1817S0 = sVar.getItem().getItemId();
        int size = sVar.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            MenuItem item = sVar.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                z = true;
                break;
            }
            i++;
        }
        C0604a aVar = new C0604a(this.f1539b, sVar, C);
        this.f1813O0 = aVar;
        aVar.mo2251i(z);
        this.f1813O0.mo2254l();
        super.mo1940g(sVar);
        return true;
    }

    /* renamed from: h */
    public C0587o mo1942h(ViewGroup viewGroup) {
        C0587o oVar = this.f1546w;
        C0587o h = super.mo1942h(viewGroup);
        if (oVar != h) {
            ((ActionMenuView) h).setPresenter(this);
        }
        return h;
    }

    /* renamed from: i */
    public Parcelable mo1970i() {
        SavedState savedState = new SavedState();
        savedState.f1823a = this.f1817S0;
        return savedState;
    }

    /* renamed from: j */
    public void mo1943j(boolean z) {
        ArrayList<C0573j> arrayList;
        C0587o oVar;
        super.mo1943j(z);
        ((View) this.f1546w).requestLayout();
        C0568g gVar = this.f1540c;
        boolean z2 = false;
        if (gVar != null) {
            ArrayList<C0573j> v = gVar.mo2098v();
            int size = v.size();
            for (int i = 0; i < size; i++) {
                C18119b a = v.get(i).mo1872a();
                if (a != null) {
                    a.mo52792k(this);
                }
            }
        }
        C0568g gVar2 = this.f1540c;
        if (gVar2 != null) {
            arrayList = gVar2.mo2016C();
        } else {
            arrayList = null;
        }
        if (this.f1819Y && arrayList != null) {
            int size2 = arrayList.size();
            if (size2 == 1) {
                z2 = !arrayList.get(0).isActionViewExpanded();
            } else if (size2 > 0) {
                z2 = true;
            }
        }
        if (z2) {
            if (this.f1821y == null) {
                this.f1821y = new C0607d(this.f1538a);
            }
            ViewGroup viewGroup = (ViewGroup) this.f1821y.getParent();
            if (viewGroup != this.f1546w) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f1821y);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f1546w;
                actionMenuView.addView(this.f1821y, actionMenuView.mo2467I());
            }
        } else {
            C0607d dVar = this.f1821y;
            if (dVar != null && dVar.getParent() == (oVar = this.f1546w)) {
                ((ViewGroup) oVar).removeView(this.f1821y);
            }
        }
        ((ActionMenuView) this.f1546w).setOverflowReserved(this.f1819Y);
    }

    /* renamed from: k */
    public boolean mo1944k() {
        int i;
        ArrayList<C0573j> arrayList;
        int i2;
        int i3;
        int i4;
        boolean z;
        boolean z2;
        boolean z3;
        ActionMenuPresenter actionMenuPresenter = this;
        C0568g gVar = actionMenuPresenter.f1540c;
        View view = null;
        boolean z4 = false;
        if (gVar != null) {
            arrayList = gVar.mo2020H();
            i = arrayList.size();
        } else {
            arrayList = null;
            i = 0;
        }
        int i5 = actionMenuPresenter.f1805G0;
        int i6 = actionMenuPresenter.f1804F0;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) actionMenuPresenter.f1546w;
        boolean z5 = false;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < i; i9++) {
            C0573j jVar = arrayList.get(i9);
            if (jVar.mo1873b()) {
                i7++;
            } else if (jVar.mo2144q()) {
                i8++;
            } else {
                z5 = true;
            }
            if (actionMenuPresenter.f1809K0 && jVar.isActionViewExpanded()) {
                i5 = 0;
            }
        }
        if (actionMenuPresenter.f1819Y && (z5 || i8 + i7 > i5)) {
            i5--;
        }
        int i10 = i5 - i7;
        SparseBooleanArray sparseBooleanArray = actionMenuPresenter.f1811M0;
        sparseBooleanArray.clear();
        if (actionMenuPresenter.f1807I0) {
            int i11 = actionMenuPresenter.f1810L0;
            i2 = i6 / i11;
            i3 = i11 + ((i6 % i11) / i2);
        } else {
            i3 = 0;
            i2 = 0;
        }
        int i12 = 0;
        int i13 = 0;
        while (i12 < i) {
            C0573j jVar2 = arrayList.get(i12);
            if (jVar2.mo1873b()) {
                View r = actionMenuPresenter.mo1951r(jVar2, view, viewGroup);
                if (actionMenuPresenter.f1807I0) {
                    i2 -= ActionMenuView.m2984O(r, i3, i2, makeMeasureSpec, z4 ? 1 : 0);
                } else {
                    r.measure(makeMeasureSpec, makeMeasureSpec);
                }
                int measuredWidth = r.getMeasuredWidth();
                i6 -= measuredWidth;
                if (i13 == 0) {
                    i13 = measuredWidth;
                }
                int groupId = jVar2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                jVar2.mo2168x(true);
                z = z4;
                i4 = i;
            } else if (jVar2.mo2144q()) {
                int groupId2 = jVar2.getGroupId();
                boolean z6 = sparseBooleanArray.get(groupId2);
                if ((i10 > 0 || z6) && i6 > 0 && (!actionMenuPresenter.f1807I0 || i2 > 0)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolean z7 = z2;
                i4 = i;
                if (z2) {
                    View r2 = actionMenuPresenter.mo1951r(jVar2, (View) null, viewGroup);
                    if (actionMenuPresenter.f1807I0) {
                        int O = ActionMenuView.m2984O(r2, i3, i2, makeMeasureSpec, 0);
                        i2 -= O;
                        if (O == 0) {
                            z7 = false;
                        }
                    } else {
                        r2.measure(makeMeasureSpec, makeMeasureSpec);
                    }
                    boolean z8 = z7;
                    int measuredWidth2 = r2.getMeasuredWidth();
                    i6 -= measuredWidth2;
                    if (i13 == 0) {
                        i13 = measuredWidth2;
                    }
                    if (!actionMenuPresenter.f1807I0 ? i6 + i13 <= 0 : i6 < 0) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    z2 = z8 & z3;
                }
                if (z2 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z6) {
                    sparseBooleanArray.put(groupId2, false);
                    int i14 = 0;
                    while (i14 < i12) {
                        C0573j jVar3 = arrayList.get(i14);
                        if (jVar3.getGroupId() == groupId2) {
                            if (jVar3.mo2142o()) {
                                i10++;
                            }
                            jVar3.mo2168x(false);
                        }
                        i14++;
                    }
                }
                if (z2) {
                    i10--;
                }
                jVar2.mo2168x(z2);
                z = false;
            } else {
                z = z4;
                i4 = i;
                jVar2.mo2168x(z);
            }
            i12++;
            z4 = z;
            i = i4;
            view = null;
            actionMenuPresenter = this;
        }
        return true;
    }

    /* renamed from: m */
    public void mo1946m(@C0359n0 Context context, @C0363p0 C0568g gVar) {
        super.mo1946m(context, gVar);
        Resources resources = context.getResources();
        C0534a b = C0534a.m2478b(context);
        if (!this.f1820Z) {
            this.f1819Y = b.mo1752h();
        }
        if (!this.f1808J0) {
            this.f1803E0 = b.mo1747c();
        }
        if (!this.f1806H0) {
            this.f1805G0 = b.mo1748d();
        }
        int i = this.f1803E0;
        if (this.f1819Y) {
            if (this.f1821y == null) {
                C0607d dVar = new C0607d(this.f1538a);
                this.f1821y = dVar;
                if (this.f1818X) {
                    dVar.setImageDrawable(this.f1822z);
                    this.f1822z = null;
                    this.f1818X = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f1821y.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i -= this.f1821y.getMeasuredWidth();
        } else {
            this.f1821y = null;
        }
        this.f1804F0 = i;
        this.f1810L0 = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    /* renamed from: n */
    public void mo1947n(C0573j jVar, C0587o.C0588a aVar) {
        aVar.mo1832d(jVar, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f1546w);
        if (this.f1815Q0 == null) {
            this.f1815Q0 = new C0605b();
        }
        actionMenuItemView.setPopupCallback(this.f1815Q0);
    }

    /* renamed from: p */
    public boolean mo1949p(ViewGroup viewGroup, int i) {
        if (viewGroup.getChildAt(i) == this.f1821y) {
            return false;
        }
        return super.mo1949p(viewGroup, i);
    }

    /* renamed from: r */
    public View mo1951r(C0573j jVar, View view, ViewGroup viewGroup) {
        int i;
        View actionView = jVar.getActionView();
        if (actionView == null || jVar.mo2140m()) {
            actionView = super.mo1951r(jVar, view, viewGroup);
        }
        if (jVar.isActionViewExpanded()) {
            i = 8;
        } else {
            i = 0;
        }
        actionView.setVisibility(i);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.mo2490p(layoutParams));
        }
        return actionView;
    }

    /* renamed from: t */
    public boolean mo1953t(int i, C0573j jVar) {
        return jVar.mo2142o();
    }
}
