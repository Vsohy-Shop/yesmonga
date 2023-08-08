package androidx.viewpager2.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.C0337f0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0372t0;
import androidx.annotation.C0376v0;
import androidx.annotation.RestrictTo;
import androidx.core.view.C18196h2;
import androidx.core.view.accessibility.C18065l0;
import androidx.core.view.accessibility.C18098w0;
import androidx.recyclerview.widget.C20227z;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.C20785a;
import androidx.viewpager2.adapter.C20806b;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class ViewPager2 extends ViewGroup {

    /* renamed from: M0 */
    public static final int f53810M0 = 0;

    /* renamed from: N0 */
    public static final int f53811N0 = 1;

    /* renamed from: O0 */
    public static final int f53812O0 = 0;

    /* renamed from: P0 */
    public static final int f53813P0 = 1;

    /* renamed from: Q0 */
    public static final int f53814Q0 = 2;

    /* renamed from: R0 */
    public static final int f53815R0 = -1;

    /* renamed from: S0 */
    public static boolean f53816S0 = true;

    /* renamed from: E0 */
    public C20830b f53817E0;

    /* renamed from: F0 */
    public C20832d f53818F0;

    /* renamed from: G0 */
    public C20834f f53819G0;

    /* renamed from: H0 */
    public RecyclerView.C20069l f53820H0 = null;

    /* renamed from: I0 */
    public boolean f53821I0 = false;

    /* renamed from: J0 */
    public boolean f53822J0 = true;

    /* renamed from: K0 */
    public int f53823K0 = -1;

    /* renamed from: L0 */
    public C20812e f53824L0;

    /* renamed from: a */
    public final Rect f53825a = new Rect();

    /* renamed from: b */
    public final Rect f53826b = new Rect();

    /* renamed from: c */
    public C20830b f53827c = new C20830b(3);

    /* renamed from: d */
    public int f53828d;

    /* renamed from: e */
    public boolean f53829e = false;

    /* renamed from: f */
    public RecyclerView.C20065i f53830f = new C20808a();

    /* renamed from: g */
    public LinearLayoutManager f53831g;

    /* renamed from: v */
    public int f53832v = -1;

    /* renamed from: w */
    public Parcelable f53833w;

    /* renamed from: x */
    public RecyclerView f53834x;

    /* renamed from: y */
    public C20227z f53835y;

    /* renamed from: z */
    public C20835g f53836z;

    /* renamed from: androidx.viewpager2.widget.ViewPager2$a */
    public class C20808a extends C20814g {
        public C20808a() {
            super((C20808a) null);
        }

        /* renamed from: a */
        public void mo30655a() {
            ViewPager2 viewPager2 = ViewPager2.this;
            viewPager2.f53829e = true;
            viewPager2.f53836z.mo62559n();
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$b */
    public class C20809b extends C20817j {
        public C20809b() {
        }

        /* renamed from: a */
        public void mo30665a(int i) {
            if (i == 0) {
                ViewPager2.this.mo62494x();
            }
        }

        /* renamed from: c */
        public void mo30667c(int i) {
            ViewPager2 viewPager2 = ViewPager2.this;
            if (viewPager2.f53828d != i) {
                viewPager2.f53828d = i;
                viewPager2.f53824L0.mo62519q();
            }
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$c */
    public class C20810c extends C20817j {
        public C20810c() {
        }

        /* renamed from: c */
        public void mo30667c(int i) {
            ViewPager2.this.clearFocus();
            if (ViewPager2.this.hasFocus()) {
                ViewPager2.this.f53834x.requestFocus(2);
            }
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$d */
    public class C20811d implements RecyclerView.C20082q {
        public C20811d() {
        }

        /* renamed from: b */
        public void mo32759b(@C0359n0 View view) {
        }

        /* renamed from: d */
        public void mo32760d(@C0359n0 View view) {
            RecyclerView.C20081p pVar = (RecyclerView.C20081p) view.getLayoutParams();
            if (pVar.width != -1 || pVar.height != -1) {
                throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
            }
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$e */
    public abstract class C20812e {
        public C20812e() {
        }

        /* renamed from: a */
        public boolean mo62503a() {
            return false;
        }

        /* renamed from: b */
        public boolean mo62504b(int i) {
            return false;
        }

        /* renamed from: c */
        public boolean mo62505c(int i, Bundle bundle) {
            return false;
        }

        /* renamed from: d */
        public boolean mo62506d() {
            return false;
        }

        /* renamed from: e */
        public void mo62507e(@C0363p0 RecyclerView.Adapter<?> adapter) {
        }

        /* renamed from: f */
        public void mo62508f(@C0363p0 RecyclerView.Adapter<?> adapter) {
        }

        /* renamed from: g */
        public String mo62509g() {
            throw new IllegalStateException("Not implemented.");
        }

        /* renamed from: h */
        public void mo62510h(@C0359n0 C20830b bVar, @C0359n0 RecyclerView recyclerView) {
        }

        /* renamed from: i */
        public void mo62511i(AccessibilityNodeInfo accessibilityNodeInfo) {
        }

        /* renamed from: j */
        public void mo62512j(@C0359n0 C18065l0 l0Var) {
        }

        /* renamed from: k */
        public boolean mo62513k(int i) {
            throw new IllegalStateException("Not implemented.");
        }

        /* renamed from: l */
        public boolean mo62514l(int i, Bundle bundle) {
            throw new IllegalStateException("Not implemented.");
        }

        /* renamed from: m */
        public void mo62515m() {
        }

        /* renamed from: n */
        public CharSequence mo62516n() {
            throw new IllegalStateException("Not implemented.");
        }

        /* renamed from: o */
        public void mo62517o(@C0359n0 AccessibilityEvent accessibilityEvent) {
        }

        /* renamed from: p */
        public void mo62518p() {
        }

        /* renamed from: q */
        public void mo62519q() {
        }

        /* renamed from: r */
        public void mo62520r() {
        }

        /* renamed from: s */
        public void mo62521s() {
        }

        public /* synthetic */ C20812e(ViewPager2 viewPager2, C20808a aVar) {
            this();
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$f */
    public class C20813f extends C20812e {
        public C20813f() {
            super(ViewPager2.this, (C20808a) null);
        }

        /* renamed from: b */
        public boolean mo62504b(int i) {
            if ((i == 8192 || i == 4096) && !ViewPager2.this.mo62467l()) {
                return true;
            }
            return false;
        }

        /* renamed from: d */
        public boolean mo62506d() {
            return true;
        }

        /* renamed from: j */
        public void mo62512j(@C0359n0 C18065l0 l0Var) {
            if (!ViewPager2.this.mo62467l()) {
                l0Var.mo52556N0(C18065l0.C18066a.f46682s);
                l0Var.mo52556N0(C18065l0.C18066a.f46681r);
                l0Var.mo52542I1(false);
            }
        }

        /* renamed from: k */
        public boolean mo62513k(int i) {
            if (mo62504b(i)) {
                return false;
            }
            throw new IllegalStateException();
        }

        /* renamed from: n */
        public CharSequence mo62516n() {
            if (mo62506d()) {
                return "androidx.viewpager.widget.ViewPager";
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$g */
    public static abstract class C20814g extends RecyclerView.C20065i {
        public C20814g() {
        }

        /* renamed from: a */
        public abstract void mo30655a();

        /* renamed from: b */
        public final void mo30656b(int i, int i2) {
            mo30655a();
        }

        /* renamed from: c */
        public final void mo30657c(int i, int i2, @C0363p0 Object obj) {
            mo30655a();
        }

        /* renamed from: d */
        public final void mo30658d(int i, int i2) {
            mo30655a();
        }

        /* renamed from: e */
        public final void mo30659e(int i, int i2, int i3) {
            mo30655a();
        }

        /* renamed from: f */
        public final void mo30660f(int i, int i2) {
            mo30655a();
        }

        public /* synthetic */ C20814g(C20808a aVar) {
            this();
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$h */
    public class C20815h extends LinearLayoutManager {
        public C20815h(Context context) {
            super(context);
        }

        /* renamed from: A1 */
        public boolean mo59867A1(@C0359n0 RecyclerView.C20089w wVar, @C0359n0 RecyclerView.C20055b0 b0Var, int i, @C0363p0 Bundle bundle) {
            if (ViewPager2.this.f53824L0.mo62504b(i)) {
                return ViewPager2.this.f53824L0.mo62513k(i);
            }
            return super.mo59867A1(wVar, b0Var, i, bundle);
        }

        /* renamed from: M1 */
        public boolean mo59896M1(@C0359n0 RecyclerView recyclerView, @C0359n0 View view, @C0359n0 Rect rect, boolean z, boolean z2) {
            return false;
        }

        /* renamed from: g1 */
        public void mo59940g1(@C0359n0 RecyclerView.C20089w wVar, @C0359n0 RecyclerView.C20055b0 b0Var, @C0359n0 C18065l0 l0Var) {
            super.mo59940g1(wVar, b0Var, l0Var);
            ViewPager2.this.f53824L0.mo62512j(l0Var);
        }

        /* renamed from: k2 */
        public void mo59408k2(@C0359n0 RecyclerView.C20055b0 b0Var, @C0359n0 int[] iArr) {
            int offscreenPageLimit = ViewPager2.this.getOffscreenPageLimit();
            if (offscreenPageLimit == -1) {
                super.mo59408k2(b0Var, iArr);
                return;
            }
            int pageSize = ViewPager2.this.getPageSize() * offscreenPageLimit;
            iArr[0] = pageSize;
            iArr[1] = pageSize;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @C0337f0(from = 1)
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.viewpager2.widget.ViewPager2$i */
    public @interface C20816i {
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$j */
    public static abstract class C20817j {
        /* renamed from: a */
        public void mo30665a(int i) {
        }

        /* renamed from: b */
        public void mo30666b(int i, float f, @C0372t0 int i2) {
        }

        /* renamed from: c */
        public void mo30667c(int i) {
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.viewpager2.widget.ViewPager2$k */
    public @interface C20818k {
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$l */
    public class C20819l extends C20812e {

        /* renamed from: b */
        public final C18098w0 f53847b = new C20820a();

        /* renamed from: c */
        public final C18098w0 f53848c = new C20821b();

        /* renamed from: d */
        public RecyclerView.C20065i f53849d;

        /* renamed from: androidx.viewpager2.widget.ViewPager2$l$a */
        public class C20820a implements C18098w0 {
            public C20820a() {
            }

            /* renamed from: a */
            public boolean mo19056a(@C0359n0 View view, @C0363p0 C18098w0.C18099a aVar) {
                C20819l.this.mo62524v(((ViewPager2) view).getCurrentItem() + 1);
                return true;
            }
        }

        /* renamed from: androidx.viewpager2.widget.ViewPager2$l$b */
        public class C20821b implements C18098w0 {
            public C20821b() {
            }

            /* renamed from: a */
            public boolean mo19056a(@C0359n0 View view, @C0363p0 C18098w0.C18099a aVar) {
                C20819l.this.mo62524v(((ViewPager2) view).getCurrentItem() - 1);
                return true;
            }
        }

        /* renamed from: androidx.viewpager2.widget.ViewPager2$l$c */
        public class C20822c extends C20814g {
            public C20822c() {
                super((C20808a) null);
            }

            /* renamed from: a */
            public void mo30655a() {
                C20819l.this.mo62525w();
            }
        }

        public C20819l() {
            super(ViewPager2.this, (C20808a) null);
        }

        /* renamed from: a */
        public boolean mo62503a() {
            return true;
        }

        /* renamed from: c */
        public boolean mo62505c(int i, Bundle bundle) {
            return i == 8192 || i == 4096;
        }

        /* renamed from: e */
        public void mo62507e(@C0363p0 RecyclerView.Adapter<?> adapter) {
            mo62525w();
            if (adapter != null) {
                adapter.registerAdapterDataObserver(this.f53849d);
            }
        }

        /* renamed from: f */
        public void mo62508f(@C0363p0 RecyclerView.Adapter<?> adapter) {
            if (adapter != null) {
                adapter.unregisterAdapterDataObserver(this.f53849d);
            }
        }

        /* renamed from: g */
        public String mo62509g() {
            if (mo62503a()) {
                return "androidx.viewpager.widget.ViewPager";
            }
            throw new IllegalStateException();
        }

        /* renamed from: h */
        public void mo62510h(@C0359n0 C20830b bVar, @C0359n0 RecyclerView recyclerView) {
            C18196h2.m82531R1(recyclerView, 2);
            this.f53849d = new C20822c();
            if (C18196h2.m82541V(ViewPager2.this) == 0) {
                C18196h2.m82531R1(ViewPager2.this, 1);
            }
        }

        /* renamed from: i */
        public void mo62511i(AccessibilityNodeInfo accessibilityNodeInfo) {
            mo62522t(accessibilityNodeInfo);
            mo62523u(accessibilityNodeInfo);
        }

        /* renamed from: l */
        public boolean mo62514l(int i, Bundle bundle) {
            int i2;
            if (mo62505c(i, bundle)) {
                if (i == 8192) {
                    i2 = ViewPager2.this.getCurrentItem() - 1;
                } else {
                    i2 = ViewPager2.this.getCurrentItem() + 1;
                }
                mo62524v(i2);
                return true;
            }
            throw new IllegalStateException();
        }

        /* renamed from: m */
        public void mo62515m() {
            mo62525w();
        }

        /* renamed from: o */
        public void mo62517o(@C0359n0 AccessibilityEvent accessibilityEvent) {
            accessibilityEvent.setSource(ViewPager2.this);
            accessibilityEvent.setClassName(mo62509g());
        }

        /* renamed from: p */
        public void mo62518p() {
            mo62525w();
        }

        /* renamed from: q */
        public void mo62519q() {
            mo62525w();
        }

        /* renamed from: r */
        public void mo62520r() {
            mo62525w();
        }

        /* renamed from: s */
        public void mo62521s() {
            mo62525w();
        }

        /* renamed from: t */
        public final void mo62522t(AccessibilityNodeInfo accessibilityNodeInfo) {
            int i;
            int i2;
            if (ViewPager2.this.getAdapter() == null) {
                i2 = 0;
                i = 0;
            } else if (ViewPager2.this.getOrientation() == 1) {
                i2 = ViewPager2.this.getAdapter().getItemCount();
                i = 0;
            } else {
                i = ViewPager2.this.getAdapter().getItemCount();
                i2 = 0;
            }
            C18065l0.m81936c2(accessibilityNodeInfo).mo52600b1(C18065l0.C18068c.m82100f(i2, i, false, 0));
        }

        /* renamed from: u */
        public final void mo62523u(AccessibilityNodeInfo accessibilityNodeInfo) {
            int itemCount;
            RecyclerView.Adapter adapter = ViewPager2.this.getAdapter();
            if (adapter != null && (itemCount = adapter.getItemCount()) != 0 && ViewPager2.this.mo62467l()) {
                if (ViewPager2.this.f53828d > 0) {
                    accessibilityNodeInfo.addAction(8192);
                }
                if (ViewPager2.this.f53828d < itemCount - 1) {
                    accessibilityNodeInfo.addAction(4096);
                }
                accessibilityNodeInfo.setScrollable(true);
            }
        }

        /* renamed from: v */
        public void mo62524v(int i) {
            if (ViewPager2.this.mo62467l()) {
                ViewPager2.this.mo62481s(i, true);
            }
        }

        /* renamed from: w */
        public void mo62525w() {
            int itemCount;
            int i;
            ViewPager2 viewPager2 = ViewPager2.this;
            int i2 = 16908360;
            C18196h2.m82626r1(viewPager2, 16908360);
            C18196h2.m82626r1(viewPager2, 16908361);
            C18196h2.m82626r1(viewPager2, 16908358);
            C18196h2.m82626r1(viewPager2, 16908359);
            if (ViewPager2.this.getAdapter() != null && (itemCount = ViewPager2.this.getAdapter().getItemCount()) != 0 && ViewPager2.this.mo62467l()) {
                if (ViewPager2.this.getOrientation() == 0) {
                    boolean k = ViewPager2.this.mo62466k();
                    if (k) {
                        i = 16908360;
                    } else {
                        i = 16908361;
                    }
                    if (k) {
                        i2 = 16908361;
                    }
                    if (ViewPager2.this.f53828d < itemCount - 1) {
                        C18196h2.m82638u1(viewPager2, new C18065l0.C18066a(i, (CharSequence) null), (CharSequence) null, this.f53847b);
                    }
                    if (ViewPager2.this.f53828d > 0) {
                        C18196h2.m82638u1(viewPager2, new C18065l0.C18066a(i2, (CharSequence) null), (CharSequence) null, this.f53848c);
                        return;
                    }
                    return;
                }
                if (ViewPager2.this.f53828d < itemCount - 1) {
                    C18196h2.m82638u1(viewPager2, new C18065l0.C18066a(16908359, (CharSequence) null), (CharSequence) null, this.f53847b);
                }
                if (ViewPager2.this.f53828d > 0) {
                    C18196h2.m82638u1(viewPager2, new C18065l0.C18066a(16908358, (CharSequence) null), (CharSequence) null, this.f53848c);
                }
            }
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$m */
    public interface C20823m {
        /* renamed from: a */
        void mo62526a(@C0359n0 View view, float f);
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$n */
    public class C20824n extends C20227z {
        public C20824n() {
        }

        @C0363p0
        /* renamed from: h */
        public View mo60280h(RecyclerView.C20076o oVar) {
            if (ViewPager2.this.mo62465j()) {
                return null;
            }
            return super.mo60280h(oVar);
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$o */
    public class C20825o extends RecyclerView {
        public C20825o(@C0359n0 Context context) {
            super(context);
        }

        @C0376v0(23)
        public CharSequence getAccessibilityClassName() {
            if (ViewPager2.this.f53824L0.mo62506d()) {
                return ViewPager2.this.f53824L0.mo62516n();
            }
            return super.getAccessibilityClassName();
        }

        public void onInitializeAccessibilityEvent(@C0359n0 AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setFromIndex(ViewPager2.this.f53828d);
            accessibilityEvent.setToIndex(ViewPager2.this.f53828d);
            ViewPager2.this.f53824L0.mo62517o(accessibilityEvent);
        }

        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.mo62467l() && super.onInterceptTouchEvent(motionEvent);
        }

        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.mo62467l() && super.onTouchEvent(motionEvent);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.viewpager2.widget.ViewPager2$p */
    public @interface C20826p {
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$q */
    public static class C20827q implements Runnable {

        /* renamed from: a */
        public final int f53856a;

        /* renamed from: b */
        public final RecyclerView f53857b;

        public C20827q(int i, RecyclerView recyclerView) {
            this.f53856a = i;
            this.f53857b = recyclerView;
        }

        public void run() {
            this.f53857b.mo59503O1(this.f53856a);
        }
    }

    public ViewPager2(@C0359n0 Context context) {
        super(context);
        mo62463h(context, (AttributeSet) null);
    }

    /* renamed from: a */
    public void mo62445a(@C0359n0 RecyclerView.C20075n nVar) {
        this.f53834x.mo59589n(nVar);
    }

    /* renamed from: b */
    public void mo62446b(@C0359n0 RecyclerView.C20075n nVar, int i) {
        this.f53834x.mo59592o(nVar, i);
    }

    /* renamed from: c */
    public boolean mo62447c() {
        return this.f53818F0.mo62540b();
    }

    public boolean canScrollHorizontally(int i) {
        return this.f53834x.canScrollHorizontally(i);
    }

    public boolean canScrollVertically(int i) {
        return this.f53834x.canScrollVertically(i);
    }

    /* renamed from: d */
    public boolean mo62450d() {
        return this.f53818F0.mo62542d();
    }

    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        Parcelable parcelable = sparseArray.get(getId());
        if (parcelable instanceof SavedState) {
            int i = ((SavedState) parcelable).f53837a;
            sparseArray.put(this.f53834x.getId(), sparseArray.get(i));
            sparseArray.remove(i);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        mo62480r();
    }

    /* renamed from: e */
    public final RecyclerView.C20082q mo62452e() {
        return new C20811d();
    }

    /* renamed from: f */
    public boolean mo62453f(@C0372t0 @SuppressLint({"SupportAnnotationUsage"}) float f) {
        return this.f53818F0.mo62543e(f);
    }

    @C0359n0
    /* renamed from: g */
    public RecyclerView.C20075n mo62454g(int i) {
        return this.f53834x.mo59460A0(i);
    }

    @C0376v0(23)
    public CharSequence getAccessibilityClassName() {
        if (this.f53824L0.mo62503a()) {
            return this.f53824L0.mo62509g();
        }
        return super.getAccessibilityClassName();
    }

    @C0363p0
    public RecyclerView.Adapter getAdapter() {
        return this.f53834x.getAdapter();
    }

    public int getCurrentItem() {
        return this.f53828d;
    }

    public int getItemDecorationCount() {
        return this.f53834x.getItemDecorationCount();
    }

    public int getOffscreenPageLimit() {
        return this.f53823K0;
    }

    public int getOrientation() {
        return this.f53831g.mo59379M2();
    }

    public int getPageSize() {
        int i;
        int i2;
        RecyclerView recyclerView = this.f53834x;
        if (getOrientation() == 0) {
            i = recyclerView.getWidth() - recyclerView.getPaddingLeft();
            i2 = recyclerView.getPaddingRight();
        } else {
            i = recyclerView.getHeight() - recyclerView.getPaddingTop();
            i2 = recyclerView.getPaddingBottom();
        }
        return i - i2;
    }

    public int getScrollState() {
        return this.f53836z.mo62553h();
    }

    /* renamed from: h */
    public final void mo62463h(Context context, AttributeSet attributeSet) {
        C20812e eVar;
        if (f53816S0) {
            eVar = new C20819l();
        } else {
            eVar = new C20813f();
        }
        this.f53824L0 = eVar;
        C20825o oVar = new C20825o(context);
        this.f53834x = oVar;
        oVar.setId(C18196h2.m82480D());
        this.f53834x.setDescendantFocusability(131072);
        C20815h hVar = new C20815h(context);
        this.f53831g = hVar;
        this.f53834x.setLayoutManager(hVar);
        this.f53834x.setScrollingTouchSlop(1);
        mo62490t(context, attributeSet);
        this.f53834x.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.f53834x.mo59607p(mo62452e());
        C20835g gVar = new C20835g(this);
        this.f53836z = gVar;
        this.f53818F0 = new C20832d(this, gVar, this.f53834x);
        C20824n nVar = new C20824n();
        this.f53835y = nVar;
        nVar.mo60274b(this.f53834x);
        this.f53834x.mo59613r(this.f53836z);
        C20830b bVar = new C20830b(3);
        this.f53817E0 = bVar;
        this.f53836z.mo62563r(bVar);
        C20809b bVar2 = new C20809b();
        C20810c cVar = new C20810c();
        this.f53817E0.mo62534d(bVar2);
        this.f53817E0.mo62534d(cVar);
        this.f53824L0.mo62510h(this.f53817E0, this.f53834x);
        this.f53817E0.mo62534d(this.f53827c);
        C20834f fVar = new C20834f(this.f53831g);
        this.f53819G0 = fVar;
        this.f53817E0.mo62534d(fVar);
        RecyclerView recyclerView = this.f53834x;
        attachViewToParent(recyclerView, 0, recyclerView.getLayoutParams());
    }

    /* renamed from: i */
    public void mo62464i() {
        this.f53834x.mo59490K0();
    }

    /* renamed from: j */
    public boolean mo62465j() {
        return this.f53818F0.mo62544f();
    }

    /* renamed from: k */
    public boolean mo62466k() {
        return this.f53831g.mo59966q0() == 1;
    }

    /* renamed from: l */
    public boolean mo62467l() {
        return this.f53822J0;
    }

    /* renamed from: m */
    public final void mo62468m(@C0363p0 RecyclerView.Adapter<?> adapter) {
        if (adapter != null) {
            adapter.registerAdapterDataObserver(this.f53830f);
        }
    }

    /* renamed from: n */
    public void mo62469n(@C0359n0 C20817j jVar) {
        this.f53827c.mo62534d(jVar);
    }

    /* renamed from: o */
    public void mo62470o(@C0359n0 RecyclerView.C20075n nVar) {
        this.f53834x.mo59623s1(nVar);
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f53824L0.mo62511i(accessibilityNodeInfo);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = this.f53834x.getMeasuredWidth();
        int measuredHeight = this.f53834x.getMeasuredHeight();
        this.f53825a.left = getPaddingLeft();
        this.f53825a.right = (i3 - i) - getPaddingRight();
        this.f53825a.top = getPaddingTop();
        this.f53825a.bottom = (i4 - i2) - getPaddingBottom();
        Gravity.apply(8388659, measuredWidth, measuredHeight, this.f53825a, this.f53826b);
        RecyclerView recyclerView = this.f53834x;
        Rect rect = this.f53826b;
        recyclerView.layout(rect.left, rect.top, rect.right, rect.bottom);
        if (this.f53829e) {
            mo62494x();
        }
    }

    public void onMeasure(int i, int i2) {
        measureChild(this.f53834x, i, i2);
        int measuredWidth = this.f53834x.getMeasuredWidth();
        int measuredHeight = this.f53834x.getMeasuredHeight();
        int measuredState = this.f53834x.getMeasuredState();
        int paddingLeft = measuredWidth + getPaddingLeft() + getPaddingRight();
        int paddingTop = measuredHeight + getPaddingTop() + getPaddingBottom();
        setMeasuredDimension(View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i, measuredState), View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i2, measuredState << 16));
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f53832v = savedState.f53838b;
        this.f53833w = savedState.f53839c;
    }

    @C0363p0
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f53837a = this.f53834x.getId();
        int i = this.f53832v;
        if (i == -1) {
            i = this.f53828d;
        }
        savedState.f53838b = i;
        Parcelable parcelable = this.f53833w;
        if (parcelable != null) {
            savedState.f53839c = parcelable;
        } else {
            RecyclerView.Adapter adapter = this.f53834x.getAdapter();
            if (adapter instanceof C20806b) {
                savedState.f53839c = ((C20806b) adapter).mo62423c();
            }
        }
        return savedState;
    }

    public void onViewAdded(View view) {
        throw new IllegalStateException(ViewPager2.class.getSimpleName() + " does not support direct child views");
    }

    /* renamed from: p */
    public void mo62477p(int i) {
        this.f53834x.mo59649t1(i);
    }

    @C0376v0(16)
    public boolean performAccessibilityAction(int i, Bundle bundle) {
        if (this.f53824L0.mo62505c(i, bundle)) {
            return this.f53824L0.mo62514l(i, bundle);
        }
        return super.performAccessibilityAction(i, bundle);
    }

    /* renamed from: q */
    public void mo62479q() {
        if (this.f53819G0.mo62546d() != null) {
            double g = this.f53836z.mo62552g();
            int i = (int) g;
            float f = (float) (g - ((double) i));
            this.f53819G0.mo30666b(i, f, Math.round(((float) getPageSize()) * f));
        }
    }

    /* renamed from: r */
    public final void mo62480r() {
        RecyclerView.Adapter adapter;
        if (this.f53832v != -1 && (adapter = getAdapter()) != null) {
            Parcelable parcelable = this.f53833w;
            if (parcelable != null) {
                if (adapter instanceof C20806b) {
                    ((C20806b) adapter).mo62424i(parcelable);
                }
                this.f53833w = null;
            }
            int max = Math.max(0, Math.min(this.f53832v, adapter.getItemCount() - 1));
            this.f53828d = max;
            this.f53832v = -1;
            this.f53834x.mo59479G1(max);
            this.f53824L0.mo62515m();
        }
    }

    /* renamed from: s */
    public void mo62481s(int i, boolean z) {
        int i2;
        RecyclerView.Adapter adapter = getAdapter();
        if (adapter == null) {
            if (this.f53832v != -1) {
                this.f53832v = Math.max(i, 0);
            }
        } else if (adapter.getItemCount() > 0) {
            int min = Math.min(Math.max(i, 0), adapter.getItemCount() - 1);
            if (min != this.f53828d || !this.f53836z.mo62556k()) {
                int i3 = this.f53828d;
                if (min != i3 || !z) {
                    double d = (double) i3;
                    this.f53828d = min;
                    this.f53824L0.mo62519q();
                    if (!this.f53836z.mo62556k()) {
                        d = this.f53836z.mo62552g();
                    }
                    this.f53836z.mo62561p(min, z);
                    if (!z) {
                        this.f53834x.mo59479G1(min);
                        return;
                    }
                    double d2 = (double) min;
                    if (Math.abs(d2 - d) > 3.0d) {
                        RecyclerView recyclerView = this.f53834x;
                        if (d2 > d) {
                            i2 = min - 3;
                        } else {
                            i2 = min + 3;
                        }
                        recyclerView.mo59479G1(i2);
                        RecyclerView recyclerView2 = this.f53834x;
                        recyclerView2.post(new C20827q(min, recyclerView2));
                        return;
                    }
                    this.f53834x.mo59503O1(min);
                }
            }
        }
    }

    public void setAdapter(@C0363p0 RecyclerView.Adapter adapter) {
        RecyclerView.Adapter adapter2 = this.f53834x.getAdapter();
        this.f53824L0.mo62508f(adapter2);
        mo62492v(adapter2);
        this.f53834x.setAdapter(adapter);
        this.f53828d = 0;
        mo62480r();
        this.f53824L0.mo62507e(adapter);
        mo62468m(adapter);
    }

    public void setCurrentItem(int i) {
        setCurrentItem(i, true);
    }

    @C0376v0(17)
    public void setLayoutDirection(int i) {
        super.setLayoutDirection(i);
        this.f53824L0.mo62518p();
    }

    public void setOffscreenPageLimit(int i) {
        if (i >= 1 || i == -1) {
            this.f53823K0 = i;
            this.f53834x.requestLayout();
            return;
        }
        throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
    }

    public void setOrientation(int i) {
        this.f53831g.mo59404f3(i);
        this.f53824L0.mo62520r();
    }

    public void setPageTransformer(@C0363p0 C20823m mVar) {
        if (mVar != null) {
            if (!this.f53821I0) {
                this.f53820H0 = this.f53834x.getItemAnimator();
                this.f53821I0 = true;
            }
            this.f53834x.setItemAnimator((RecyclerView.C20069l) null);
        } else if (this.f53821I0) {
            this.f53834x.setItemAnimator(this.f53820H0);
            this.f53820H0 = null;
            this.f53821I0 = false;
        }
        if (mVar != this.f53819G0.mo62546d()) {
            this.f53819G0.mo62547e(mVar);
            mo62479q();
        }
    }

    public void setUserInputEnabled(boolean z) {
        this.f53822J0 = z;
        this.f53824L0.mo62521s();
    }

    /* renamed from: t */
    public final void mo62490t(Context context, AttributeSet attributeSet) {
        int[] iArr = C20785a.C20795j.ViewPager2;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, 0, 0);
        }
        try {
            setOrientation(obtainStyledAttributes.getInt(C20785a.C20795j.ViewPager2_android_orientation, 0));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: u */
    public void mo62491u() {
        View h = this.f53835y.mo60280h(this.f53831g);
        if (h != null) {
            int[] c = this.f53835y.mo60275c(this.f53831g, h);
            int i = c[0];
            if (i != 0 || c[1] != 0) {
                this.f53834x.mo59491K1(i, c[1]);
            }
        }
    }

    /* renamed from: v */
    public final void mo62492v(@C0363p0 RecyclerView.Adapter<?> adapter) {
        if (adapter != null) {
            adapter.unregisterAdapterDataObserver(this.f53830f);
        }
    }

    /* renamed from: w */
    public void mo62493w(@C0359n0 C20817j jVar) {
        this.f53827c.mo62535e(jVar);
    }

    /* renamed from: x */
    public void mo62494x() {
        C20227z zVar = this.f53835y;
        if (zVar != null) {
            View h = zVar.mo60280h(this.f53831g);
            if (h != null) {
                int u0 = this.f53831g.mo59978u0(h);
                if (u0 != this.f53828d && getScrollState() == 0) {
                    this.f53817E0.mo30667c(u0);
                }
                this.f53829e = false;
                return;
            }
            return;
        }
        throw new IllegalStateException("Design assumption violated.");
    }

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C20807a();

        /* renamed from: a */
        public int f53837a;

        /* renamed from: b */
        public int f53838b;

        /* renamed from: c */
        public Parcelable f53839c;

        /* renamed from: androidx.viewpager2.widget.ViewPager2$SavedState$a */
        public static class C20807a implements Parcelable.ClassLoaderCreator<SavedState> {
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return createFromParcel(parcel, (ClassLoader) null);
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

        @C0376v0(24)
        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            mo62495a(parcel, classLoader);
        }

        /* renamed from: a */
        public final void mo62495a(Parcel parcel, ClassLoader classLoader) {
            this.f53837a = parcel.readInt();
            this.f53838b = parcel.readInt();
            this.f53839c = parcel.readParcelable(classLoader);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f53837a);
            parcel.writeInt(this.f53838b);
            parcel.writeParcelable(this.f53839c, i);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            mo62495a(parcel, (ClassLoader) null);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public void setCurrentItem(int i, boolean z) {
        if (!mo62465j()) {
            mo62481s(i, z);
            return;
        }
        throw new IllegalStateException("Cannot change current item when ViewPager2 is fake dragging");
    }

    public ViewPager2(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet) {
        super(context, attributeSet);
        mo62463h(context, attributeSet);
    }

    public ViewPager2(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo62463h(context, attributeSet);
    }

    @C0376v0(21)
    public ViewPager2(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        mo62463h(context, attributeSet);
    }
}
