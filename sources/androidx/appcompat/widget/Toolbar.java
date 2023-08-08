package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.C0310u;
import androidx.activity.C0311v;
import androidx.annotation.C0324b1;
import androidx.annotation.C0327c1;
import androidx.annotation.C0353k0;
import androidx.annotation.C0354l;
import androidx.annotation.C0355l0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0373u;
import androidx.annotation.C0375v;
import androidx.annotation.C0376v0;
import androidx.annotation.RestrictTo;
import androidx.appcompat.C0387a;
import androidx.appcompat.app.C0441a;
import androidx.appcompat.content.res.C0507a;
import androidx.appcompat.view.C0537c;
import androidx.appcompat.view.C0543g;
import androidx.appcompat.view.menu.C0568g;
import androidx.appcompat.view.menu.C0573j;
import androidx.appcompat.view.menu.C0585n;
import androidx.appcompat.view.menu.C0587o;
import androidx.appcompat.view.menu.C0594s;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.view.C18196h2;
import androidx.core.view.C18306m0;
import androidx.core.view.C18318n1;
import androidx.core.view.C18353r0;
import androidx.core.view.C18383u0;
import androidx.core.view.C18412x0;
import androidx.customview.view.AbsSavedState;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.Lifecycle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class Toolbar extends ViewGroup implements C18383u0 {

    /* renamed from: m1 */
    public static final String f2185m1 = "Toolbar";

    /* renamed from: E0 */
    public int f2186E0;

    /* renamed from: F0 */
    public int f2187F0;

    /* renamed from: G0 */
    public int f2188G0;

    /* renamed from: H0 */
    public int f2189H0;

    /* renamed from: I0 */
    public int f2190I0;

    /* renamed from: J0 */
    public int f2191J0;

    /* renamed from: K0 */
    public int f2192K0;

    /* renamed from: L0 */
    public C0817y0 f2193L0;

    /* renamed from: M0 */
    public int f2194M0;

    /* renamed from: N0 */
    public int f2195N0;

    /* renamed from: O0 */
    public int f2196O0;

    /* renamed from: P0 */
    public CharSequence f2197P0;

    /* renamed from: Q0 */
    public CharSequence f2198Q0;

    /* renamed from: R0 */
    public ColorStateList f2199R0;

    /* renamed from: S0 */
    public ColorStateList f2200S0;

    /* renamed from: T0 */
    public boolean f2201T0;

    /* renamed from: U0 */
    public boolean f2202U0;

    /* renamed from: V0 */
    public final ArrayList<View> f2203V0;

    /* renamed from: W0 */
    public final ArrayList<View> f2204W0;

    /* renamed from: X0 */
    public final int[] f2205X0;

    /* renamed from: Y0 */
    public final C18412x0 f2206Y0;

    /* renamed from: Z0 */
    public ArrayList<MenuItem> f2207Z0;

    /* renamed from: a */
    public ActionMenuView f2208a;

    /* renamed from: a1 */
    public C0681h f2209a1;

    /* renamed from: b */
    public TextView f2210b;

    /* renamed from: b1 */
    public final ActionMenuView.C0615e f2211b1;

    /* renamed from: c */
    public TextView f2212c;

    /* renamed from: c1 */
    public C0747m1 f2213c1;

    /* renamed from: d */
    public ImageButton f2214d;

    /* renamed from: d1 */
    public ActionMenuPresenter f2215d1;

    /* renamed from: e */
    public ImageView f2216e;

    /* renamed from: e1 */
    public C0679f f2217e1;

    /* renamed from: f */
    public Drawable f2218f;

    /* renamed from: f1 */
    public C0585n.C0586a f2219f1;

    /* renamed from: g */
    public CharSequence f2220g;

    /* renamed from: g1 */
    public C0568g.C0569a f2221g1;

    /* renamed from: h1 */
    public boolean f2222h1;

    /* renamed from: i1 */
    public OnBackInvokedCallback f2223i1;

    /* renamed from: j1 */
    public OnBackInvokedDispatcher f2224j1;

    /* renamed from: k1 */
    public boolean f2225k1;

    /* renamed from: l1 */
    public final Runnable f2226l1;

    /* renamed from: v */
    public ImageButton f2227v;

    /* renamed from: w */
    public View f2228w;

    /* renamed from: x */
    public Context f2229x;

    /* renamed from: y */
    public int f2230y;

    /* renamed from: z */
    public int f2231z;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0673a();

        /* renamed from: c */
        public int f2232c;

        /* renamed from: d */
        public boolean f2233d;

        /* renamed from: androidx.appcompat.widget.Toolbar$SavedState$a */
        public class C0673a implements Parcelable.ClassLoaderCreator<SavedState> {
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            /* renamed from: c */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcel parcel) {
            this(parcel, (ClassLoader) null);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f2232c);
            parcel.writeInt(this.f2233d ? 1 : 0);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f2232c = parcel.readInt();
            this.f2233d = parcel.readInt() != 0;
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$a */
    public class C0674a implements ActionMenuView.C0615e {
        public C0674a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            if (Toolbar.this.f2206Y0.mo53090j(menuItem)) {
                return true;
            }
            C0681h hVar = Toolbar.this.f2209a1;
            if (hVar != null) {
                return hVar.onMenuItemClick(menuItem);
            }
            return false;
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$b */
    public class C0675b implements Runnable {
        public C0675b() {
        }

        public void run() {
            Toolbar.this.mo3124R();
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$c */
    public class C0676c implements C0568g.C0569a {
        public C0676c() {
        }

        /* renamed from: a */
        public boolean mo1111a(@C0359n0 C0568g gVar, @C0359n0 MenuItem menuItem) {
            C0568g.C0569a aVar = Toolbar.this.f2221g1;
            if (aVar == null || !aVar.mo1111a(gVar, menuItem)) {
                return false;
            }
            return true;
        }

        /* renamed from: b */
        public void mo1114b(@C0359n0 C0568g gVar) {
            if (!Toolbar.this.f2208a.mo2471M()) {
                Toolbar.this.f2206Y0.mo53091k(gVar);
            }
            C0568g.C0569a aVar = Toolbar.this.f2221g1;
            if (aVar != null) {
                aVar.mo1114b(gVar);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$d */
    public class C0677d implements View.OnClickListener {
        public C0677d() {
        }

        public void onClick(View view) {
            Toolbar.this.mo3131e();
        }
    }

    @C0376v0(33)
    /* renamed from: androidx.appcompat.widget.Toolbar$e */
    public static class C0678e {
        @C0363p0
        @C0373u
        /* renamed from: a */
        public static OnBackInvokedDispatcher m3308a(@C0359n0 View view) {
            return view.findOnBackInvokedDispatcher();
        }

        @C0359n0
        @C0373u
        /* renamed from: b */
        public static OnBackInvokedCallback m3309b(@C0359n0 Runnable runnable) {
            Objects.requireNonNull(runnable);
            return new C0743l1(runnable);
        }

        @C0373u
        /* renamed from: c */
        public static void m3310c(@C0359n0 Object obj, @C0359n0 Object obj2) {
            C0310u.m1557a(obj).registerOnBackInvokedCallback(1000000, C0311v.m1558a(obj2));
        }

        @C0373u
        /* renamed from: d */
        public static void m3311d(@C0359n0 Object obj, @C0359n0 Object obj2) {
            C0310u.m1557a(obj).unregisterOnBackInvokedCallback(C0311v.m1558a(obj2));
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$f */
    public class C0679f implements C0585n {

        /* renamed from: a */
        public C0568g f2238a;

        /* renamed from: b */
        public C0573j f2239b;

        public C0679f() {
        }

        /* renamed from: b */
        public void mo1936b(C0568g gVar, boolean z) {
        }

        /* renamed from: d */
        public boolean mo1938d(C0568g gVar, C0573j jVar) {
            Toolbar.this.mo3133g();
            ViewParent parent = Toolbar.this.f2227v.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f2227v);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f2227v);
            }
            Toolbar.this.f2228w = jVar.getActionView();
            this.f2239b = jVar;
            ViewParent parent2 = Toolbar.this.f2228w.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.f2228w);
                }
                C0680g m = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                m.f1107a = (toolbar4.f2187F0 & 112) | C18306m0.f46960b;
                m.f2244b = 2;
                toolbar4.f2228w.setLayoutParams(m);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.f2228w);
            }
            Toolbar.this.mo3121O();
            Toolbar.this.requestLayout();
            jVar.mo2163t(true);
            View view = Toolbar.this.f2228w;
            if (view instanceof C0537c) {
                ((C0537c) view).mo1757a();
            }
            Toolbar.this.mo3125S();
            return true;
        }

        /* renamed from: e */
        public void mo1939e(C0585n.C0586a aVar) {
        }

        /* renamed from: f */
        public void mo1969f(Parcelable parcelable) {
        }

        /* renamed from: g */
        public boolean mo1940g(C0594s sVar) {
            return false;
        }

        public int getId() {
            return 0;
        }

        /* renamed from: h */
        public C0587o mo1942h(ViewGroup viewGroup) {
            return null;
        }

        /* renamed from: i */
        public Parcelable mo1970i() {
            return null;
        }

        /* renamed from: j */
        public void mo1943j(boolean z) {
            if (this.f2239b != null) {
                C0568g gVar = this.f2238a;
                boolean z2 = false;
                if (gVar != null) {
                    int size = gVar.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            break;
                        } else if (this.f2238a.getItem(i) == this.f2239b) {
                            z2 = true;
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                if (!z2) {
                    mo1945l(this.f2238a, this.f2239b);
                }
            }
        }

        /* renamed from: k */
        public boolean mo1944k() {
            return false;
        }

        /* renamed from: l */
        public boolean mo1945l(C0568g gVar, C0573j jVar) {
            View view = Toolbar.this.f2228w;
            if (view instanceof C0537c) {
                ((C0537c) view).mo1758g();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.f2228w);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f2227v);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.f2228w = null;
            toolbar3.mo3126a();
            this.f2239b = null;
            Toolbar.this.requestLayout();
            jVar.mo2163t(false);
            Toolbar.this.mo3125S();
            return true;
        }

        /* renamed from: m */
        public void mo1946m(Context context, C0568g gVar) {
            C0573j jVar;
            C0568g gVar2 = this.f2238a;
            if (!(gVar2 == null || (jVar = this.f2239b) == null)) {
                gVar2.mo2064g(jVar);
            }
            this.f2238a = gVar;
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$h */
    public interface C0681h {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public Toolbar(@C0359n0 Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: N */
    private void m3258N() {
        removeCallbacks(this.f2226l1);
        post(this.f2226l1);
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i = 0; i < menu.size(); i++) {
            arrayList.add(menu.getItem(i));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new C0543g(getContext());
    }

    /* renamed from: A */
    public void mo3110A(@C0355l0 int i) {
        getMenuInflater().inflate(i, getMenu());
    }

    /* renamed from: B */
    public boolean mo3111B() {
        return this.f2225k1;
    }

    /* renamed from: C */
    public final boolean mo3112C(View view) {
        return view.getParent() == this || this.f2204W0.contains(view);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: D */
    public boolean mo3113D() {
        ActionMenuView actionMenuView = this.f2208a;
        return actionMenuView != null && actionMenuView.mo2470L();
    }

    /* renamed from: E */
    public boolean mo3114E() {
        ActionMenuView actionMenuView = this.f2208a;
        return actionMenuView != null && actionMenuView.mo2471M();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: F */
    public boolean mo3115F() {
        Layout layout;
        TextView textView = this.f2210b;
        if (textView == null || (layout = textView.getLayout()) == null) {
            return false;
        }
        int lineCount = layout.getLineCount();
        for (int i = 0; i < lineCount; i++) {
            if (layout.getEllipsisCount(i) > 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: G */
    public final int mo3116G(View view, int i, int[] iArr, int i2) {
        C0680g gVar = (C0680g) view.getLayoutParams();
        int i3 = gVar.leftMargin - iArr[0];
        int max = i + Math.max(0, i3);
        iArr[0] = Math.max(0, -i3);
        int q = mo3186q(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, q, max + measuredWidth, view.getMeasuredHeight() + q);
        return max + measuredWidth + gVar.rightMargin;
    }

    @C0353k0
    /* renamed from: H */
    public void mo696H(@C0359n0 C18318n1 n1Var) {
        this.f2206Y0.mo53085c(n1Var);
    }

    @C0353k0
    /* renamed from: I */
    public void mo697I() {
        Iterator<MenuItem> it = this.f2207Z0.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(it.next().getItemId());
        }
        mo3120M();
    }

    /* renamed from: J */
    public final int mo3117J(View view, int i, int[] iArr, int i2) {
        C0680g gVar = (C0680g) view.getLayoutParams();
        int i3 = gVar.rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int q = mo3186q(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, q, max, view.getMeasuredHeight() + q);
        return max - (measuredWidth + gVar.leftMargin);
    }

    /* renamed from: K */
    public final int mo3118K(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i5) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + max + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    /* renamed from: L */
    public final void mo3119L(View view, int i, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i5 >= 0) {
            if (mode != 0) {
                i5 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i5);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    /* renamed from: M */
    public final void mo3120M() {
        Menu menu = getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        this.f2206Y0.mo53088h(menu, getMenuInflater());
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.f2207Z0 = currentMenuItems2;
    }

    /* renamed from: O */
    public void mo3121O() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (!(((C0680g) childAt.getLayoutParams()).f2244b == 2 || childAt == this.f2208a)) {
                removeViewAt(childCount);
                this.f2204W0.add(childAt);
            }
        }
    }

    /* renamed from: P */
    public final boolean mo3122P() {
        if (!this.f2222h1) {
            return false;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (mo3123Q(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: Q */
    public final boolean mo3123Q(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    /* renamed from: R */
    public boolean mo3124R() {
        ActionMenuView actionMenuView = this.f2208a;
        return actionMenuView != null && actionMenuView.mo2475R();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S */
    public void mo3125S() {
        boolean z;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher a = C0678e.m3308a(this);
            if (!mo3230y() || a == null || !C18196h2.m82521O0(this) || !this.f2225k1) {
                z = false;
            } else {
                z = true;
            }
            if (z && this.f2224j1 == null) {
                if (this.f2223i1 == null) {
                    this.f2223i1 = C0678e.m3309b(new C0731j1(this));
                }
                C0678e.m3310c(a, this.f2223i1);
                this.f2224j1 = a;
            } else if (!z && (onBackInvokedDispatcher = this.f2224j1) != null) {
                C0678e.m3311d(onBackInvokedDispatcher, this.f2223i1);
                this.f2224j1 = null;
            }
        }
    }

    /* renamed from: a */
    public void mo3126a() {
        for (int size = this.f2204W0.size() - 1; size >= 0; size--) {
            addView(this.f2204W0.get(size));
        }
        this.f2204W0.clear();
    }

    /* renamed from: b */
    public final void mo3127b(List<View> list, int i) {
        boolean z;
        if (C18196h2.m82553Z(this) == 1) {
            z = true;
        } else {
            z = false;
        }
        int childCount = getChildCount();
        int d = C18306m0.m82991d(i, C18196h2.m82553Z(this));
        list.clear();
        if (z) {
            for (int i2 = childCount - 1; i2 >= 0; i2--) {
                View childAt = getChildAt(i2);
                C0680g gVar = (C0680g) childAt.getLayoutParams();
                if (gVar.f2244b == 0 && mo3123Q(childAt) && mo3185p(gVar.f1107a) == d) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt2 = getChildAt(i3);
            C0680g gVar2 = (C0680g) childAt2.getLayoutParams();
            if (gVar2.f2244b == 0 && mo3123Q(childAt2) && mo3185p(gVar2.f1107a) == d) {
                list.add(childAt2);
            }
        }
    }

    /* renamed from: c */
    public final void mo3128c(View view, boolean z) {
        C0680g gVar;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            gVar = generateDefaultLayoutParams();
        } else if (!checkLayoutParams(layoutParams)) {
            gVar = generateLayoutParams(layoutParams);
        } else {
            gVar = (C0680g) layoutParams;
        }
        gVar.f2244b = 1;
        if (!z || this.f2228w == null) {
            addView(view, gVar);
            return;
        }
        view.setLayoutParams(gVar);
        this.f2204W0.add(view);
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C0680g);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r1.f2208a;
     */
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo3130d() {
        /*
            r1 = this;
            int r0 = r1.getVisibility()
            if (r0 != 0) goto L_0x0012
            androidx.appcompat.widget.ActionMenuView r0 = r1.f2208a
            if (r0 == 0) goto L_0x0012
            boolean r0 = r0.mo2472N()
            if (r0 == 0) goto L_0x0012
            r0 = 1
            goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.mo3130d():boolean");
    }

    /* renamed from: e */
    public void mo3131e() {
        C0573j jVar;
        C0679f fVar = this.f2217e1;
        if (fVar == null) {
            jVar = null;
        } else {
            jVar = fVar.f2239b;
        }
        if (jVar != null) {
            jVar.collapseActionView();
        }
    }

    /* renamed from: f */
    public void mo3132f() {
        ActionMenuView actionMenuView = this.f2208a;
        if (actionMenuView != null) {
            actionMenuView.mo2463E();
        }
    }

    /* renamed from: g */
    public void mo3133g() {
        if (this.f2227v == null) {
            AppCompatImageButton appCompatImageButton = new AppCompatImageButton(getContext(), (AttributeSet) null, C0387a.C0389b.toolbarNavigationButtonStyle);
            this.f2227v = appCompatImageButton;
            appCompatImageButton.setImageDrawable(this.f2218f);
            this.f2227v.setContentDescription(this.f2220g);
            C0680g m = generateDefaultLayoutParams();
            m.f1107a = (this.f2187F0 & 112) | C18306m0.f46960b;
            m.f2244b = 2;
            this.f2227v.setLayoutParams(m);
            this.f2227v.setOnClickListener(new C0677d());
        }
    }

    @C0363p0
    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.f2227v;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    @C0363p0
    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.f2227v;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        C0817y0 y0Var = this.f2193L0;
        if (y0Var != null) {
            return y0Var.mo3759a();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.f2195N0;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        return getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        C0817y0 y0Var = this.f2193L0;
        if (y0Var != null) {
            return y0Var.mo3760b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        C0817y0 y0Var = this.f2193L0;
        if (y0Var != null) {
            return y0Var.mo3761c();
        }
        return 0;
    }

    public int getContentInsetStart() {
        C0817y0 y0Var = this.f2193L0;
        if (y0Var != null) {
            return y0Var.mo3762d();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.f2194M0;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        return getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        boolean z;
        C0568g Q;
        ActionMenuView actionMenuView = this.f2208a;
        if (actionMenuView == null || (Q = actionMenuView.mo2474Q()) == null || !Q.hasVisibleItems()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return Math.max(getContentInsetEnd(), Math.max(this.f2195N0, 0));
        }
        return getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        if (C18196h2.m82553Z(this) == 1) {
            return getCurrentContentInsetEnd();
        }
        return getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        if (C18196h2.m82553Z(this) == 1) {
            return getCurrentContentInsetStart();
        }
        return getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        if (getNavigationIcon() != null) {
            return Math.max(getContentInsetStart(), Math.max(this.f2194M0, 0));
        }
        return getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f2216e;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f2216e;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        mo3170j();
        return this.f2208a.getMenu();
    }

    @C0363p0
    @RestrictTo({RestrictTo.Scope.TESTS})
    public View getNavButtonView() {
        return this.f2214d;
    }

    @C0363p0
    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f2214d;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    @C0363p0
    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f2214d;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public ActionMenuPresenter getOuterActionMenuPresenter() {
        return this.f2215d1;
    }

    @C0363p0
    public Drawable getOverflowIcon() {
        mo3170j();
        return this.f2208a.getOverflowIcon();
    }

    /* access modifiers changed from: package-private */
    public Context getPopupContext() {
        return this.f2229x;
    }

    @C0327c1
    public int getPopupTheme() {
        return this.f2230y;
    }

    public CharSequence getSubtitle() {
        return this.f2198Q0;
    }

    @C0363p0
    @RestrictTo({RestrictTo.Scope.TESTS})
    public final TextView getSubtitleTextView() {
        return this.f2212c;
    }

    public CharSequence getTitle() {
        return this.f2197P0;
    }

    public int getTitleMarginBottom() {
        return this.f2192K0;
    }

    public int getTitleMarginEnd() {
        return this.f2190I0;
    }

    public int getTitleMarginStart() {
        return this.f2189H0;
    }

    public int getTitleMarginTop() {
        return this.f2191J0;
    }

    @C0363p0
    @RestrictTo({RestrictTo.Scope.TESTS})
    public final TextView getTitleTextView() {
        return this.f2210b;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public C0707d0 getWrapper() {
        if (this.f2213c1 == null) {
            this.f2213c1 = new C0747m1(this, true);
        }
        return this.f2213c1;
    }

    /* renamed from: h */
    public final void mo3168h() {
        if (this.f2193L0 == null) {
            this.f2193L0 = new C0817y0();
        }
    }

    /* renamed from: i */
    public final void mo3169i() {
        if (this.f2216e == null) {
            this.f2216e = new AppCompatImageView(getContext());
        }
    }

    /* renamed from: j */
    public final void mo3170j() {
        mo3171k();
        if (this.f2208a.mo2474Q() == null) {
            C0568g gVar = (C0568g) this.f2208a.getMenu();
            if (this.f2217e1 == null) {
                this.f2217e1 = new C0679f();
            }
            this.f2208a.setExpandedActionViewsExclusive(true);
            gVar.mo2052c(this.f2217e1, this.f2229x);
            mo3125S();
        }
    }

    /* renamed from: k */
    public final void mo3171k() {
        if (this.f2208a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f2208a = actionMenuView;
            actionMenuView.setPopupTheme(this.f2230y);
            this.f2208a.setOnMenuItemClickListener(this.f2211b1);
            this.f2208a.setMenuCallbacks(this.f2219f1, new C0676c());
            C0680g m = generateDefaultLayoutParams();
            m.f1107a = (this.f2187F0 & 112) | 8388613;
            this.f2208a.setLayoutParams(m);
            mo3128c(this.f2208a, false);
        }
    }

    /* renamed from: l */
    public final void mo3172l() {
        if (this.f2214d == null) {
            this.f2214d = new AppCompatImageButton(getContext(), (AttributeSet) null, C0387a.C0389b.toolbarNavigationButtonStyle);
            C0680g m = generateDefaultLayoutParams();
            m.f1107a = (this.f2187F0 & 112) | C18306m0.f46960b;
            this.f2214d.setLayoutParams(m);
        }
    }

    /* renamed from: m */
    public C0680g generateDefaultLayoutParams() {
        return new C0680g(-2, -2);
    }

    /* renamed from: n */
    public C0680g generateLayoutParams(AttributeSet attributeSet) {
        return new C0680g(getContext(), attributeSet);
    }

    /* renamed from: o */
    public C0680g generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C0680g) {
            return new C0680g((C0680g) layoutParams);
        }
        if (layoutParams instanceof C0441a.C0443b) {
            return new C0680g((C0441a.C0443b) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C0680g((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C0680g(layoutParams);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        mo3125S();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f2226l1);
        mo3125S();
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f2202U0 = false;
        }
        if (!this.f2202U0) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f2202U0 = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f2202U0 = false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x029f A[LOOP:0: B:101:0x029d->B:102:0x029f, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x02c1 A[LOOP:1: B:104:0x02bf->B:105:0x02c1, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x02eb  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x02fa A[LOOP:2: B:112:0x02f8->B:113:0x02fa, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0168  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01a6  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01b7  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0227  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            r19 = this;
            r0 = r19
            int r1 = androidx.core.view.C18196h2.m82553Z(r19)
            r2 = 0
            r3 = 1
            if (r1 != r3) goto L_0x000c
            r1 = r3
            goto L_0x000d
        L_0x000c:
            r1 = r2
        L_0x000d:
            int r4 = r19.getWidth()
            int r5 = r19.getHeight()
            int r6 = r19.getPaddingLeft()
            int r7 = r19.getPaddingRight()
            int r8 = r19.getPaddingTop()
            int r9 = r19.getPaddingBottom()
            int r10 = r4 - r7
            int[] r11 = r0.f2205X0
            r11[r3] = r2
            r11[r2] = r2
            int r12 = androidx.core.view.C18196h2.m82573e0(r19)
            if (r12 < 0) goto L_0x003a
            int r13 = r24 - r22
            int r12 = java.lang.Math.min(r12, r13)
            goto L_0x003b
        L_0x003a:
            r12 = r2
        L_0x003b:
            android.widget.ImageButton r13 = r0.f2214d
            boolean r13 = r0.mo3123Q(r13)
            if (r13 == 0) goto L_0x0055
            if (r1 == 0) goto L_0x004e
            android.widget.ImageButton r13 = r0.f2214d
            int r13 = r0.mo3117J(r13, r10, r11, r12)
            r14 = r13
            r13 = r6
            goto L_0x0057
        L_0x004e:
            android.widget.ImageButton r13 = r0.f2214d
            int r13 = r0.mo3116G(r13, r6, r11, r12)
            goto L_0x0056
        L_0x0055:
            r13 = r6
        L_0x0056:
            r14 = r10
        L_0x0057:
            android.widget.ImageButton r15 = r0.f2227v
            boolean r15 = r0.mo3123Q(r15)
            if (r15 == 0) goto L_0x006e
            if (r1 == 0) goto L_0x0068
            android.widget.ImageButton r15 = r0.f2227v
            int r14 = r0.mo3117J(r15, r14, r11, r12)
            goto L_0x006e
        L_0x0068:
            android.widget.ImageButton r15 = r0.f2227v
            int r13 = r0.mo3116G(r15, r13, r11, r12)
        L_0x006e:
            androidx.appcompat.widget.ActionMenuView r15 = r0.f2208a
            boolean r15 = r0.mo3123Q(r15)
            if (r15 == 0) goto L_0x0085
            if (r1 == 0) goto L_0x007f
            androidx.appcompat.widget.ActionMenuView r15 = r0.f2208a
            int r13 = r0.mo3116G(r15, r13, r11, r12)
            goto L_0x0085
        L_0x007f:
            androidx.appcompat.widget.ActionMenuView r15 = r0.f2208a
            int r14 = r0.mo3117J(r15, r14, r11, r12)
        L_0x0085:
            int r15 = r19.getCurrentContentInsetLeft()
            int r16 = r19.getCurrentContentInsetRight()
            int r3 = r15 - r13
            int r3 = java.lang.Math.max(r2, r3)
            r11[r2] = r3
            int r3 = r10 - r14
            int r3 = r16 - r3
            int r3 = java.lang.Math.max(r2, r3)
            r17 = 1
            r11[r17] = r3
            int r3 = java.lang.Math.max(r13, r15)
            int r10 = r10 - r16
            int r10 = java.lang.Math.min(r14, r10)
            android.view.View r13 = r0.f2228w
            boolean r13 = r0.mo3123Q(r13)
            if (r13 == 0) goto L_0x00c2
            if (r1 == 0) goto L_0x00bc
            android.view.View r13 = r0.f2228w
            int r10 = r0.mo3117J(r13, r10, r11, r12)
            goto L_0x00c2
        L_0x00bc:
            android.view.View r13 = r0.f2228w
            int r3 = r0.mo3116G(r13, r3, r11, r12)
        L_0x00c2:
            android.widget.ImageView r13 = r0.f2216e
            boolean r13 = r0.mo3123Q(r13)
            if (r13 == 0) goto L_0x00d9
            if (r1 == 0) goto L_0x00d3
            android.widget.ImageView r13 = r0.f2216e
            int r10 = r0.mo3117J(r13, r10, r11, r12)
            goto L_0x00d9
        L_0x00d3:
            android.widget.ImageView r13 = r0.f2216e
            int r3 = r0.mo3116G(r13, r3, r11, r12)
        L_0x00d9:
            android.widget.TextView r13 = r0.f2210b
            boolean r13 = r0.mo3123Q(r13)
            android.widget.TextView r14 = r0.f2212c
            boolean r14 = r0.mo3123Q(r14)
            if (r13 == 0) goto L_0x0100
            android.widget.TextView r15 = r0.f2210b
            android.view.ViewGroup$LayoutParams r15 = r15.getLayoutParams()
            androidx.appcompat.widget.Toolbar$g r15 = (androidx.appcompat.widget.Toolbar.C0680g) r15
            int r2 = r15.topMargin
            r23 = r7
            android.widget.TextView r7 = r0.f2210b
            int r7 = r7.getMeasuredHeight()
            int r2 = r2 + r7
            int r7 = r15.bottomMargin
            int r2 = r2 + r7
            r7 = 0
            int r2 = r2 + r7
            goto L_0x0103
        L_0x0100:
            r23 = r7
            r2 = 0
        L_0x0103:
            if (r14 == 0) goto L_0x011d
            android.widget.TextView r7 = r0.f2212c
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            androidx.appcompat.widget.Toolbar$g r7 = (androidx.appcompat.widget.Toolbar.C0680g) r7
            int r15 = r7.topMargin
            r16 = r4
            android.widget.TextView r4 = r0.f2212c
            int r4 = r4.getMeasuredHeight()
            int r15 = r15 + r4
            int r4 = r7.bottomMargin
            int r15 = r15 + r4
            int r2 = r2 + r15
            goto L_0x011f
        L_0x011d:
            r16 = r4
        L_0x011f:
            if (r13 != 0) goto L_0x012b
            if (r14 == 0) goto L_0x0124
            goto L_0x012b
        L_0x0124:
            r18 = r6
            r22 = r12
        L_0x0128:
            r1 = 0
            goto L_0x0290
        L_0x012b:
            if (r13 == 0) goto L_0x0130
            android.widget.TextView r4 = r0.f2210b
            goto L_0x0132
        L_0x0130:
            android.widget.TextView r4 = r0.f2212c
        L_0x0132:
            if (r14 == 0) goto L_0x0137
            android.widget.TextView r7 = r0.f2212c
            goto L_0x0139
        L_0x0137:
            android.widget.TextView r7 = r0.f2210b
        L_0x0139:
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            androidx.appcompat.widget.Toolbar$g r4 = (androidx.appcompat.widget.Toolbar.C0680g) r4
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            androidx.appcompat.widget.Toolbar$g r7 = (androidx.appcompat.widget.Toolbar.C0680g) r7
            if (r13 == 0) goto L_0x014f
            android.widget.TextView r15 = r0.f2210b
            int r15 = r15.getMeasuredWidth()
            if (r15 > 0) goto L_0x0159
        L_0x014f:
            if (r14 == 0) goto L_0x015c
            android.widget.TextView r15 = r0.f2212c
            int r15 = r15.getMeasuredWidth()
            if (r15 <= 0) goto L_0x015c
        L_0x0159:
            r17 = 1
            goto L_0x015e
        L_0x015c:
            r17 = 0
        L_0x015e:
            int r15 = r0.f2196O0
            r15 = r15 & 112(0x70, float:1.57E-43)
            r18 = r6
            r6 = 48
            if (r15 == r6) goto L_0x01a6
            r6 = 80
            if (r15 == r6) goto L_0x0198
            int r6 = r5 - r8
            int r6 = r6 - r9
            int r6 = r6 - r2
            int r6 = r6 / 2
            int r15 = r4.topMargin
            r22 = r12
            int r12 = r0.f2191J0
            r24 = r3
            int r3 = r15 + r12
            if (r6 >= r3) goto L_0x0181
            int r6 = r15 + r12
            goto L_0x0196
        L_0x0181:
            int r5 = r5 - r9
            int r5 = r5 - r2
            int r5 = r5 - r6
            int r5 = r5 - r8
            int r2 = r4.bottomMargin
            int r3 = r0.f2192K0
            int r2 = r2 + r3
            if (r5 >= r2) goto L_0x0196
            int r2 = r7.bottomMargin
            int r2 = r2 + r3
            int r2 = r2 - r5
            int r6 = r6 - r2
            r2 = 0
            int r6 = java.lang.Math.max(r2, r6)
        L_0x0196:
            int r8 = r8 + r6
            goto L_0x01b5
        L_0x0198:
            r24 = r3
            r22 = r12
            int r5 = r5 - r9
            int r3 = r7.bottomMargin
            int r5 = r5 - r3
            int r3 = r0.f2192K0
            int r5 = r5 - r3
            int r8 = r5 - r2
            goto L_0x01b5
        L_0x01a6:
            r24 = r3
            r22 = r12
            int r2 = r19.getPaddingTop()
            int r3 = r4.topMargin
            int r2 = r2 + r3
            int r3 = r0.f2191J0
            int r8 = r2 + r3
        L_0x01b5:
            if (r1 == 0) goto L_0x0227
            if (r17 == 0) goto L_0x01bc
            int r1 = r0.f2189H0
            goto L_0x01bd
        L_0x01bc:
            r1 = 0
        L_0x01bd:
            r2 = 1
            r3 = r11[r2]
            int r1 = r1 - r3
            r3 = 0
            int r4 = java.lang.Math.max(r3, r1)
            int r10 = r10 - r4
            int r1 = -r1
            int r1 = java.lang.Math.max(r3, r1)
            r11[r2] = r1
            if (r13 == 0) goto L_0x01f4
            android.widget.TextView r1 = r0.f2210b
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$g r1 = (androidx.appcompat.widget.Toolbar.C0680g) r1
            android.widget.TextView r2 = r0.f2210b
            int r2 = r2.getMeasuredWidth()
            int r2 = r10 - r2
            android.widget.TextView r3 = r0.f2210b
            int r3 = r3.getMeasuredHeight()
            int r3 = r3 + r8
            android.widget.TextView r4 = r0.f2210b
            r4.layout(r2, r8, r10, r3)
            int r4 = r0.f2190I0
            int r2 = r2 - r4
            int r1 = r1.bottomMargin
            int r8 = r3 + r1
            goto L_0x01f5
        L_0x01f4:
            r2 = r10
        L_0x01f5:
            if (r14 == 0) goto L_0x021b
            android.widget.TextView r1 = r0.f2212c
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$g r1 = (androidx.appcompat.widget.Toolbar.C0680g) r1
            int r1 = r1.topMargin
            int r8 = r8 + r1
            android.widget.TextView r1 = r0.f2212c
            int r1 = r1.getMeasuredWidth()
            int r1 = r10 - r1
            android.widget.TextView r3 = r0.f2212c
            int r3 = r3.getMeasuredHeight()
            int r3 = r3 + r8
            android.widget.TextView r4 = r0.f2212c
            r4.layout(r1, r8, r10, r3)
            int r1 = r0.f2190I0
            int r1 = r10 - r1
            goto L_0x021c
        L_0x021b:
            r1 = r10
        L_0x021c:
            if (r17 == 0) goto L_0x0223
            int r1 = java.lang.Math.min(r2, r1)
            r10 = r1
        L_0x0223:
            r3 = r24
            goto L_0x0128
        L_0x0227:
            if (r17 == 0) goto L_0x022d
            int r7 = r0.f2189H0
            r1 = 0
            goto L_0x022f
        L_0x022d:
            r1 = 0
            r7 = 0
        L_0x022f:
            r2 = r11[r1]
            int r7 = r7 - r2
            int r2 = java.lang.Math.max(r1, r7)
            int r3 = r24 + r2
            int r2 = -r7
            int r2 = java.lang.Math.max(r1, r2)
            r11[r1] = r2
            if (r13 == 0) goto L_0x0264
            android.widget.TextView r2 = r0.f2210b
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            androidx.appcompat.widget.Toolbar$g r2 = (androidx.appcompat.widget.Toolbar.C0680g) r2
            android.widget.TextView r4 = r0.f2210b
            int r4 = r4.getMeasuredWidth()
            int r4 = r4 + r3
            android.widget.TextView r5 = r0.f2210b
            int r5 = r5.getMeasuredHeight()
            int r5 = r5 + r8
            android.widget.TextView r6 = r0.f2210b
            r6.layout(r3, r8, r4, r5)
            int r6 = r0.f2190I0
            int r4 = r4 + r6
            int r2 = r2.bottomMargin
            int r8 = r5 + r2
            goto L_0x0265
        L_0x0264:
            r4 = r3
        L_0x0265:
            if (r14 == 0) goto L_0x0289
            android.widget.TextView r2 = r0.f2212c
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            androidx.appcompat.widget.Toolbar$g r2 = (androidx.appcompat.widget.Toolbar.C0680g) r2
            int r2 = r2.topMargin
            int r8 = r8 + r2
            android.widget.TextView r2 = r0.f2212c
            int r2 = r2.getMeasuredWidth()
            int r2 = r2 + r3
            android.widget.TextView r5 = r0.f2212c
            int r5 = r5.getMeasuredHeight()
            int r5 = r5 + r8
            android.widget.TextView r6 = r0.f2212c
            r6.layout(r3, r8, r2, r5)
            int r5 = r0.f2190I0
            int r2 = r2 + r5
            goto L_0x028a
        L_0x0289:
            r2 = r3
        L_0x028a:
            if (r17 == 0) goto L_0x0290
            int r3 = java.lang.Math.max(r4, r2)
        L_0x0290:
            java.util.ArrayList<android.view.View> r2 = r0.f2203V0
            r4 = 3
            r0.mo3127b(r2, r4)
            java.util.ArrayList<android.view.View> r2 = r0.f2203V0
            int r2 = r2.size()
            r7 = r1
        L_0x029d:
            if (r7 >= r2) goto L_0x02b0
            java.util.ArrayList<android.view.View> r4 = r0.f2203V0
            java.lang.Object r4 = r4.get(r7)
            android.view.View r4 = (android.view.View) r4
            r12 = r22
            int r3 = r0.mo3116G(r4, r3, r11, r12)
            int r7 = r7 + 1
            goto L_0x029d
        L_0x02b0:
            r12 = r22
            java.util.ArrayList<android.view.View> r2 = r0.f2203V0
            r4 = 5
            r0.mo3127b(r2, r4)
            java.util.ArrayList<android.view.View> r2 = r0.f2203V0
            int r2 = r2.size()
            r7 = r1
        L_0x02bf:
            if (r7 >= r2) goto L_0x02d0
            java.util.ArrayList<android.view.View> r4 = r0.f2203V0
            java.lang.Object r4 = r4.get(r7)
            android.view.View r4 = (android.view.View) r4
            int r10 = r0.mo3117J(r4, r10, r11, r12)
            int r7 = r7 + 1
            goto L_0x02bf
        L_0x02d0:
            java.util.ArrayList<android.view.View> r2 = r0.f2203V0
            r4 = 1
            r0.mo3127b(r2, r4)
            java.util.ArrayList<android.view.View> r2 = r0.f2203V0
            int r2 = r0.mo3229w(r2, r11)
            int r4 = r16 - r18
            int r4 = r4 - r23
            int r4 = r4 / 2
            int r6 = r18 + r4
            int r4 = r2 / 2
            int r6 = r6 - r4
            int r2 = r2 + r6
            if (r6 >= r3) goto L_0x02eb
            goto L_0x02f2
        L_0x02eb:
            if (r2 <= r10) goto L_0x02f1
            int r2 = r2 - r10
            int r3 = r6 - r2
            goto L_0x02f2
        L_0x02f1:
            r3 = r6
        L_0x02f2:
            java.util.ArrayList<android.view.View> r2 = r0.f2203V0
            int r2 = r2.size()
        L_0x02f8:
            if (r1 >= r2) goto L_0x0309
            java.util.ArrayList<android.view.View> r4 = r0.f2203V0
            java.lang.Object r4 = r4.get(r1)
            android.view.View r4 = (android.view.View) r4
            int r3 = r0.mo3116G(r4, r3, r11, r12)
            int r1 = r1 + 1
            goto L_0x02f8
        L_0x0309:
            java.util.ArrayList<android.view.View> r1 = r0.f2203V0
            r1.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int[] iArr = this.f2205X0;
        char b = C0796u1.m3859b(this);
        int i10 = 0;
        char c = b ^ 1;
        if (mo3123Q(this.f2214d)) {
            mo3119L(this.f2214d, i, 0, i2, 0, this.f2188G0);
            i5 = this.f2214d.getMeasuredWidth() + mo3227t(this.f2214d);
            i4 = Math.max(0, this.f2214d.getMeasuredHeight() + mo3228u(this.f2214d));
            i3 = View.combineMeasuredStates(0, this.f2214d.getMeasuredState());
        } else {
            i5 = 0;
            i4 = 0;
            i3 = 0;
        }
        if (mo3123Q(this.f2227v)) {
            mo3119L(this.f2227v, i, 0, i2, 0, this.f2188G0);
            i5 = this.f2227v.getMeasuredWidth() + mo3227t(this.f2227v);
            i4 = Math.max(i4, this.f2227v.getMeasuredHeight() + mo3228u(this.f2227v));
            i3 = View.combineMeasuredStates(i3, this.f2227v.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = 0 + Math.max(currentContentInsetStart, i5);
        iArr[b] = Math.max(0, currentContentInsetStart - i5);
        if (mo3123Q(this.f2208a)) {
            mo3119L(this.f2208a, i, max, i2, 0, this.f2188G0);
            i6 = this.f2208a.getMeasuredWidth() + mo3227t(this.f2208a);
            i4 = Math.max(i4, this.f2208a.getMeasuredHeight() + mo3228u(this.f2208a));
            i3 = View.combineMeasuredStates(i3, this.f2208a.getMeasuredState());
        } else {
            i6 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max2 = max + Math.max(currentContentInsetEnd, i6);
        iArr[c] = Math.max(0, currentContentInsetEnd - i6);
        if (mo3123Q(this.f2228w)) {
            max2 += mo3118K(this.f2228w, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, this.f2228w.getMeasuredHeight() + mo3228u(this.f2228w));
            i3 = View.combineMeasuredStates(i3, this.f2228w.getMeasuredState());
        }
        if (mo3123Q(this.f2216e)) {
            max2 += mo3118K(this.f2216e, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, this.f2216e.getMeasuredHeight() + mo3228u(this.f2216e));
            i3 = View.combineMeasuredStates(i3, this.f2216e.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (((C0680g) childAt.getLayoutParams()).f2244b == 0 && mo3123Q(childAt)) {
                max2 += mo3118K(childAt, i, max2, i2, 0, iArr);
                i4 = Math.max(i4, childAt.getMeasuredHeight() + mo3228u(childAt));
                i3 = View.combineMeasuredStates(i3, childAt.getMeasuredState());
            }
        }
        int i12 = this.f2191J0 + this.f2192K0;
        int i13 = this.f2189H0 + this.f2190I0;
        if (mo3123Q(this.f2210b)) {
            mo3118K(this.f2210b, i, max2 + i13, i2, i12, iArr);
            int measuredWidth = this.f2210b.getMeasuredWidth() + mo3227t(this.f2210b);
            i7 = this.f2210b.getMeasuredHeight() + mo3228u(this.f2210b);
            i9 = View.combineMeasuredStates(i3, this.f2210b.getMeasuredState());
            i8 = measuredWidth;
        } else {
            i7 = 0;
            i9 = i3;
            i8 = 0;
        }
        if (mo3123Q(this.f2212c)) {
            i8 = Math.max(i8, mo3118K(this.f2212c, i, max2 + i13, i2, i7 + i12, iArr));
            i7 += this.f2212c.getMeasuredHeight() + mo3228u(this.f2212c);
            i9 = View.combineMeasuredStates(i9, this.f2212c.getMeasuredState());
        } else {
            int i14 = i9;
        }
        int max3 = Math.max(i4, i7);
        int paddingLeft = max2 + i8 + getPaddingLeft() + getPaddingRight();
        int paddingTop = max3 + getPaddingTop() + getPaddingBottom();
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i, -16777216 & i9);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i2, i9 << 16);
        if (!mo3122P()) {
            i10 = resolveSizeAndState2;
        }
        setMeasuredDimension(resolveSizeAndState, i10);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        C0568g gVar;
        MenuItem findItem;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.mo53419a());
        ActionMenuView actionMenuView = this.f2208a;
        if (actionMenuView != null) {
            gVar = actionMenuView.mo2474Q();
        } else {
            gVar = null;
        }
        int i = savedState.f2232c;
        if (!(i == 0 || this.f2217e1 == null || gVar == null || (findItem = gVar.findItem(i)) == null)) {
            findItem.expandActionView();
        }
        if (savedState.f2233d) {
            m3258N();
        }
    }

    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        mo3168h();
        C0817y0 y0Var = this.f2193L0;
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        y0Var.mo3764f(z);
    }

    public Parcelable onSaveInstanceState() {
        C0573j jVar;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        C0679f fVar = this.f2217e1;
        if (!(fVar == null || (jVar = fVar.f2239b) == null)) {
            savedState.f2232c = jVar.getItemId();
        }
        savedState.f2233d = mo3114E();
        return savedState;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f2201T0 = false;
        }
        if (!this.f2201T0) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f2201T0 = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f2201T0 = false;
        }
        return true;
    }

    /* renamed from: p */
    public final int mo3185p(int i) {
        int Z = C18196h2.m82553Z(this);
        int d = C18306m0.m82991d(i, Z) & 7;
        if (d == 1 || d == 3 || d == 5) {
            return d;
        }
        if (Z == 1) {
            return 5;
        }
        return 3;
    }

    /* renamed from: q */
    public final int mo3186q(View view, int i) {
        int i2;
        C0680g gVar = (C0680g) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        if (i > 0) {
            i2 = (measuredHeight - i) / 2;
        } else {
            i2 = 0;
        }
        int s = mo3187s(gVar.f1107a);
        if (s == 48) {
            return getPaddingTop() - i2;
        }
        if (s == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - gVar.bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i3 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i4 = gVar.topMargin;
        if (i3 < i4) {
            i3 = i4;
        } else {
            int i5 = (((height - paddingBottom) - measuredHeight) - i3) - paddingTop;
            int i6 = gVar.bottomMargin;
            if (i5 < i6) {
                i3 = Math.max(0, i3 - (i6 - i5));
            }
        }
        return paddingTop + i3;
    }

    @C0353k0
    @SuppressLint({"LambdaLast"})
    /* renamed from: r */
    public void mo735r(@C0359n0 C18318n1 n1Var, @C0359n0 C19499w wVar, @C0359n0 Lifecycle.State state) {
        this.f2206Y0.mo53087e(n1Var, wVar, state);
    }

    /* renamed from: s */
    public final int mo3187s(int i) {
        int i2 = i & 112;
        return (i2 == 16 || i2 == 48 || i2 == 80) ? i2 : this.f2196O0 & 112;
    }

    public void setBackInvokedCallbackEnabled(boolean z) {
        if (this.f2225k1 != z) {
            this.f2225k1 = z;
            mo3125S();
        }
    }

    public void setCollapseContentDescription(@C0324b1 int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseIcon(@C0375v int i) {
        setCollapseIcon(C0507a.m2346b(getContext(), i));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setCollapsible(boolean z) {
        this.f2222h1 = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f2195N0) {
            this.f2195N0 = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f2194M0) {
            this.f2194M0 = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetsAbsolute(int i, int i2) {
        mo3168h();
        this.f2193L0.mo3763e(i, i2);
    }

    public void setContentInsetsRelative(int i, int i2) {
        mo3168h();
        this.f2193L0.mo3765g(i, i2);
    }

    public void setLogo(@C0375v int i) {
        setLogo(C0507a.m2346b(getContext(), i));
    }

    public void setLogoDescription(@C0324b1 int i) {
        setLogoDescription(getContext().getText(i));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void setMenu(C0568g gVar, ActionMenuPresenter actionMenuPresenter) {
        if (gVar != null || this.f2208a != null) {
            mo3171k();
            C0568g Q = this.f2208a.mo2474Q();
            if (Q != gVar) {
                if (Q != null) {
                    Q.mo2031S(this.f2215d1);
                    Q.mo2031S(this.f2217e1);
                }
                if (this.f2217e1 == null) {
                    this.f2217e1 = new C0679f();
                }
                actionMenuPresenter.mo2445K(true);
                if (gVar != null) {
                    gVar.mo2052c(actionMenuPresenter, this.f2229x);
                    gVar.mo2052c(this.f2217e1, this.f2229x);
                } else {
                    actionMenuPresenter.mo1946m(this.f2229x, (C0568g) null);
                    this.f2217e1.mo1946m(this.f2229x, (C0568g) null);
                    actionMenuPresenter.mo1943j(true);
                    this.f2217e1.mo1943j(true);
                }
                this.f2208a.setPopupTheme(this.f2230y);
                this.f2208a.setPresenter(actionMenuPresenter);
                this.f2215d1 = actionMenuPresenter;
                mo3125S();
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setMenuCallbacks(C0585n.C0586a aVar, C0568g.C0569a aVar2) {
        this.f2219f1 = aVar;
        this.f2221g1 = aVar2;
        ActionMenuView actionMenuView = this.f2208a;
        if (actionMenuView != null) {
            actionMenuView.setMenuCallbacks(aVar, aVar2);
        }
    }

    public void setNavigationContentDescription(@C0324b1 int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationIcon(@C0375v int i) {
        setNavigationIcon(C0507a.m2346b(getContext(), i));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        mo3172l();
        this.f2214d.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(C0681h hVar) {
        this.f2209a1 = hVar;
    }

    public void setOverflowIcon(@C0363p0 Drawable drawable) {
        mo3170j();
        this.f2208a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(@C0327c1 int i) {
        if (this.f2230y != i) {
            this.f2230y = i;
            if (i == 0) {
                this.f2229x = getContext();
            } else {
                this.f2229x = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(@C0324b1 int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitleTextAppearance(Context context, @C0327c1 int i) {
        this.f2186E0 = i;
        TextView textView = this.f2212c;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    public void setSubtitleTextColor(@C0354l int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitle(@C0324b1 int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitleMargin(int i, int i2, int i3, int i4) {
        this.f2189H0 = i;
        this.f2191J0 = i2;
        this.f2190I0 = i3;
        this.f2192K0 = i4;
        requestLayout();
    }

    public void setTitleMarginBottom(int i) {
        this.f2192K0 = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.f2190I0 = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.f2189H0 = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.f2191J0 = i;
        requestLayout();
    }

    public void setTitleTextAppearance(Context context, @C0327c1 int i) {
        this.f2231z = i;
        TextView textView = this.f2210b;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    public void setTitleTextColor(@C0354l int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    /* renamed from: t */
    public final int mo3227t(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return C18353r0.m83082c(marginLayoutParams) + C18353r0.m83081b(marginLayoutParams);
    }

    /* renamed from: u */
    public final int mo3228u(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    @C0353k0
    /* renamed from: v */
    public void mo748v(@C0359n0 C18318n1 n1Var, @C0359n0 C19499w wVar) {
        this.f2206Y0.mo53086d(n1Var, wVar);
    }

    /* renamed from: w */
    public final int mo3229w(List<View> list, int[] iArr) {
        int i = iArr[0];
        int i2 = iArr[1];
        int size = list.size();
        int i3 = 0;
        int i4 = 0;
        while (i3 < size) {
            View view = list.get(i3);
            C0680g gVar = (C0680g) view.getLayoutParams();
            int i5 = gVar.leftMargin - i;
            int i6 = gVar.rightMargin - i2;
            int max = Math.max(0, i5);
            int max2 = Math.max(0, i6);
            int max3 = Math.max(0, -i5);
            int max4 = Math.max(0, -i6);
            i4 += max + view.getMeasuredWidth() + max2;
            i3++;
            i2 = max4;
            i = max3;
        }
        return i4;
    }

    @C0353k0
    /* renamed from: x */
    public void mo749x(@C0359n0 C18318n1 n1Var) {
        this.f2206Y0.mo53092l(n1Var);
    }

    /* renamed from: y */
    public boolean mo3230y() {
        C0679f fVar = this.f2217e1;
        return (fVar == null || fVar.f2239b == null) ? false : true;
    }

    /* renamed from: z */
    public boolean mo3231z() {
        ActionMenuView actionMenuView = this.f2208a;
        return actionMenuView != null && actionMenuView.mo2469K();
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$g */
    public static class C0680g extends C0441a.C0443b {

        /* renamed from: c */
        public static final int f2241c = 0;

        /* renamed from: d */
        public static final int f2242d = 1;

        /* renamed from: e */
        public static final int f2243e = 2;

        /* renamed from: b */
        public int f2244b;

        public C0680g(@C0359n0 Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2244b = 0;
        }

        /* renamed from: a */
        public void mo3240a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            this.leftMargin = marginLayoutParams.leftMargin;
            this.topMargin = marginLayoutParams.topMargin;
            this.rightMargin = marginLayoutParams.rightMargin;
            this.bottomMargin = marginLayoutParams.bottomMargin;
        }

        public C0680g(int i, int i2) {
            super(i, i2);
            this.f2244b = 0;
            this.f1107a = 8388627;
        }

        public C0680g(int i, int i2, int i3) {
            super(i, i2);
            this.f2244b = 0;
            this.f1107a = i3;
        }

        public C0680g(int i) {
            this(-2, -1, i);
        }

        public C0680g(C0680g gVar) {
            super((C0441a.C0443b) gVar);
            this.f2244b = 0;
            this.f2244b = gVar.f2244b;
        }

        public C0680g(C0441a.C0443b bVar) {
            super(bVar);
            this.f2244b = 0;
        }

        public C0680g(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super((ViewGroup.LayoutParams) marginLayoutParams);
            this.f2244b = 0;
            mo3240a(marginLayoutParams);
        }

        public C0680g(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f2244b = 0;
        }
    }

    public Toolbar(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet) {
        this(context, attributeSet, C0387a.C0389b.toolbarStyle);
    }

    public void setCollapseContentDescription(@C0363p0 CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            mo3133g();
        }
        ImageButton imageButton = this.f2227v;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(@C0363p0 Drawable drawable) {
        if (drawable != null) {
            mo3133g();
            this.f2227v.setImageDrawable(drawable);
            return;
        }
        ImageButton imageButton = this.f2227v;
        if (imageButton != null) {
            imageButton.setImageDrawable(this.f2218f);
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            mo3169i();
            if (!mo3112C(this.f2216e)) {
                mo3128c(this.f2216e, true);
            }
        } else {
            ImageView imageView = this.f2216e;
            if (imageView != null && mo3112C(imageView)) {
                removeView(this.f2216e);
                this.f2204W0.remove(this.f2216e);
            }
        }
        ImageView imageView2 = this.f2216e;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            mo3169i();
        }
        ImageView imageView = this.f2216e;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(@C0363p0 CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            mo3172l();
        }
        ImageButton imageButton = this.f2214d;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
            C0757o1.m3709a(this.f2214d, charSequence);
        }
    }

    public void setNavigationIcon(@C0363p0 Drawable drawable) {
        if (drawable != null) {
            mo3172l();
            if (!mo3112C(this.f2214d)) {
                mo3128c(this.f2214d, true);
            }
        } else {
            ImageButton imageButton = this.f2214d;
            if (imageButton != null && mo3112C(imageButton)) {
                removeView(this.f2214d);
                this.f2204W0.remove(this.f2214d);
            }
        }
        ImageButton imageButton2 = this.f2214d;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f2212c == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.f2212c = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.f2212c.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f2186E0;
                if (i != 0) {
                    this.f2212c.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f2200S0;
                if (colorStateList != null) {
                    this.f2212c.setTextColor(colorStateList);
                }
            }
            if (!mo3112C(this.f2212c)) {
                mo3128c(this.f2212c, true);
            }
        } else {
            TextView textView = this.f2212c;
            if (textView != null && mo3112C(textView)) {
                removeView(this.f2212c);
                this.f2204W0.remove(this.f2212c);
            }
        }
        TextView textView2 = this.f2212c;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f2198Q0 = charSequence;
    }

    public void setSubtitleTextColor(@C0359n0 ColorStateList colorStateList) {
        this.f2200S0 = colorStateList;
        TextView textView = this.f2212c;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f2210b == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.f2210b = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.f2210b.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f2231z;
                if (i != 0) {
                    this.f2210b.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f2199R0;
                if (colorStateList != null) {
                    this.f2210b.setTextColor(colorStateList);
                }
            }
            if (!mo3112C(this.f2210b)) {
                mo3128c(this.f2210b, true);
            }
        } else {
            TextView textView = this.f2210b;
            if (textView != null && mo3112C(textView)) {
                removeView(this.f2210b);
                this.f2204W0.remove(this.f2210b);
            }
        }
        TextView textView2 = this.f2210b;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f2197P0 = charSequence;
    }

    public void setTitleTextColor(@C0359n0 ColorStateList colorStateList) {
        this.f2199R0 = colorStateList;
        TextView textView = this.f2210b;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public Toolbar(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2196O0 = 8388627;
        this.f2203V0 = new ArrayList<>();
        this.f2204W0 = new ArrayList<>();
        this.f2205X0 = new int[2];
        this.f2206Y0 = new C18412x0(new C0728i1(this));
        this.f2207Z0 = new ArrayList<>();
        this.f2211b1 = new C0674a();
        this.f2226l1 = new C0675b();
        Context context2 = getContext();
        int[] iArr = C0387a.C0400m.Toolbar;
        C0722h1 G = C0722h1.m3539G(context2, attributeSet, iArr, i, 0);
        C18196h2.m82658z1(this, context, iArr, attributeSet, G.mo3454B(), i, 0);
        this.f2231z = G.mo3479u(C0387a.C0400m.Toolbar_titleTextAppearance, 0);
        this.f2186E0 = G.mo3479u(C0387a.C0400m.Toolbar_subtitleTextAppearance, 0);
        this.f2196O0 = G.mo3474p(C0387a.C0400m.Toolbar_android_gravity, this.f2196O0);
        this.f2187F0 = G.mo3474p(C0387a.C0400m.Toolbar_buttonGravity, 48);
        int f = G.mo3464f(C0387a.C0400m.Toolbar_titleMargin, 0);
        int i2 = C0387a.C0400m.Toolbar_titleMargins;
        f = G.mo3455C(i2) ? G.mo3464f(i2, f) : f;
        this.f2192K0 = f;
        this.f2191J0 = f;
        this.f2190I0 = f;
        this.f2189H0 = f;
        int f2 = G.mo3464f(C0387a.C0400m.Toolbar_titleMarginStart, -1);
        if (f2 >= 0) {
            this.f2189H0 = f2;
        }
        int f3 = G.mo3464f(C0387a.C0400m.Toolbar_titleMarginEnd, -1);
        if (f3 >= 0) {
            this.f2190I0 = f3;
        }
        int f4 = G.mo3464f(C0387a.C0400m.Toolbar_titleMarginTop, -1);
        if (f4 >= 0) {
            this.f2191J0 = f4;
        }
        int f5 = G.mo3464f(C0387a.C0400m.Toolbar_titleMarginBottom, -1);
        if (f5 >= 0) {
            this.f2192K0 = f5;
        }
        this.f2188G0 = G.mo3465g(C0387a.C0400m.Toolbar_maxButtonHeight, -1);
        int f6 = G.mo3464f(C0387a.C0400m.Toolbar_contentInsetStart, Integer.MIN_VALUE);
        int f7 = G.mo3464f(C0387a.C0400m.Toolbar_contentInsetEnd, Integer.MIN_VALUE);
        int g = G.mo3465g(C0387a.C0400m.Toolbar_contentInsetLeft, 0);
        int g2 = G.mo3465g(C0387a.C0400m.Toolbar_contentInsetRight, 0);
        mo3168h();
        this.f2193L0.mo3763e(g, g2);
        if (!(f6 == Integer.MIN_VALUE && f7 == Integer.MIN_VALUE)) {
            this.f2193L0.mo3765g(f6, f7);
        }
        this.f2194M0 = G.mo3464f(C0387a.C0400m.Toolbar_contentInsetStartWithNavigation, Integer.MIN_VALUE);
        this.f2195N0 = G.mo3464f(C0387a.C0400m.Toolbar_contentInsetEndWithActions, Integer.MIN_VALUE);
        this.f2218f = G.mo3466h(C0387a.C0400m.Toolbar_collapseIcon);
        this.f2220g = G.mo3482x(C0387a.C0400m.Toolbar_collapseContentDescription);
        CharSequence x = G.mo3482x(C0387a.C0400m.Toolbar_title);
        if (!TextUtils.isEmpty(x)) {
            setTitle(x);
        }
        CharSequence x2 = G.mo3482x(C0387a.C0400m.Toolbar_subtitle);
        if (!TextUtils.isEmpty(x2)) {
            setSubtitle(x2);
        }
        this.f2229x = getContext();
        setPopupTheme(G.mo3479u(C0387a.C0400m.Toolbar_popupTheme, 0));
        Drawable h = G.mo3466h(C0387a.C0400m.Toolbar_navigationIcon);
        if (h != null) {
            setNavigationIcon(h);
        }
        CharSequence x3 = G.mo3482x(C0387a.C0400m.Toolbar_navigationContentDescription);
        if (!TextUtils.isEmpty(x3)) {
            setNavigationContentDescription(x3);
        }
        Drawable h2 = G.mo3466h(C0387a.C0400m.Toolbar_logo);
        if (h2 != null) {
            setLogo(h2);
        }
        CharSequence x4 = G.mo3482x(C0387a.C0400m.Toolbar_logoDescription);
        if (!TextUtils.isEmpty(x4)) {
            setLogoDescription(x4);
        }
        int i3 = C0387a.C0400m.Toolbar_titleTextColor;
        if (G.mo3455C(i3)) {
            setTitleTextColor(G.mo3462d(i3));
        }
        int i4 = C0387a.C0400m.Toolbar_subtitleTextColor;
        if (G.mo3455C(i4)) {
            setSubtitleTextColor(G.mo3462d(i4));
        }
        int i5 = C0387a.C0400m.Toolbar_menu;
        if (G.mo3455C(i5)) {
            mo3110A(G.mo3479u(i5, 0));
        }
        G.mo3458I();
    }
}
