package androidx.viewpager.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0372t0;
import androidx.annotation.C0375v;
import androidx.core.content.C17318d;
import androidx.core.view.C18019a;
import androidx.core.view.C18196h2;
import androidx.core.view.C18414x1;
import androidx.core.view.C18436z4;
import androidx.core.view.accessibility.C18065l0;
import androidx.customview.view.AbsSavedState;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ViewPager extends ViewGroup {

    /* renamed from: A1 */
    public static final int f53678A1 = 1;

    /* renamed from: B1 */
    public static final int f53679B1 = 600;

    /* renamed from: C1 */
    public static final int f53680C1 = 25;

    /* renamed from: D1 */
    public static final int f53681D1 = 16;

    /* renamed from: E1 */
    public static final int f53682E1 = 400;

    /* renamed from: F1 */
    public static final int[] f53683F1 = {16842931};

    /* renamed from: G1 */
    public static final Comparator<C20775f> f53684G1 = new C20770a();

    /* renamed from: H1 */
    public static final Interpolator f53685H1 = new C20771b();

    /* renamed from: I1 */
    public static final int f53686I1 = -1;

    /* renamed from: J1 */
    public static final int f53687J1 = 2;

    /* renamed from: K1 */
    public static final int f53688K1 = 0;

    /* renamed from: L1 */
    public static final int f53689L1 = 1;

    /* renamed from: M1 */
    public static final int f53690M1 = 2;

    /* renamed from: N1 */
    public static final C20783n f53691N1 = new C20783n();

    /* renamed from: O1 */
    public static final int f53692O1 = 0;

    /* renamed from: P1 */
    public static final int f53693P1 = 1;

    /* renamed from: Q1 */
    public static final int f53694Q1 = 2;

    /* renamed from: x1 */
    public static final String f53695x1 = "ViewPager";

    /* renamed from: y1 */
    public static final boolean f53696y1 = false;

    /* renamed from: z1 */
    public static final boolean f53697z1 = false;

    /* renamed from: E0 */
    public int f53698E0;

    /* renamed from: F0 */
    public Drawable f53699F0;

    /* renamed from: G0 */
    public int f53700G0;

    /* renamed from: H0 */
    public int f53701H0;

    /* renamed from: I0 */
    public float f53702I0 = -3.4028235E38f;

    /* renamed from: J0 */
    public float f53703J0 = Float.MAX_VALUE;

    /* renamed from: K0 */
    public int f53704K0;

    /* renamed from: L0 */
    public int f53705L0;

    /* renamed from: M0 */
    public boolean f53706M0;

    /* renamed from: N0 */
    public boolean f53707N0;

    /* renamed from: O0 */
    public boolean f53708O0;

    /* renamed from: P0 */
    public int f53709P0 = 1;

    /* renamed from: Q0 */
    public boolean f53710Q0;

    /* renamed from: R0 */
    public boolean f53711R0;

    /* renamed from: S0 */
    public int f53712S0;

    /* renamed from: T0 */
    public int f53713T0;

    /* renamed from: U0 */
    public int f53714U0;

    /* renamed from: V0 */
    public float f53715V0;

    /* renamed from: W0 */
    public float f53716W0;

    /* renamed from: X0 */
    public float f53717X0;

    /* renamed from: Y0 */
    public float f53718Y0;

    /* renamed from: Z0 */
    public int f53719Z0 = -1;

    /* renamed from: a */
    public int f53720a;

    /* renamed from: a1 */
    public VelocityTracker f53721a1;

    /* renamed from: b */
    public final ArrayList<C20775f> f53722b = new ArrayList<>();

    /* renamed from: b1 */
    public int f53723b1;

    /* renamed from: c */
    public final C20775f f53724c = new C20775f();

    /* renamed from: c1 */
    public int f53725c1;

    /* renamed from: d */
    public final Rect f53726d = new Rect();

    /* renamed from: d1 */
    public int f53727d1;

    /* renamed from: e */
    public C20784a f53728e;

    /* renamed from: e1 */
    public int f53729e1;

    /* renamed from: f */
    public int f53730f;

    /* renamed from: f1 */
    public boolean f53731f1;

    /* renamed from: g */
    public int f53732g = -1;

    /* renamed from: g1 */
    public long f53733g1;

    /* renamed from: h1 */
    public EdgeEffect f53734h1;

    /* renamed from: i1 */
    public EdgeEffect f53735i1;

    /* renamed from: j1 */
    public boolean f53736j1 = true;

    /* renamed from: k1 */
    public boolean f53737k1 = false;

    /* renamed from: l1 */
    public boolean f53738l1;

    /* renamed from: m1 */
    public int f53739m1;

    /* renamed from: n1 */
    public List<C20779j> f53740n1;

    /* renamed from: o1 */
    public C20779j f53741o1;

    /* renamed from: p1 */
    public C20779j f53742p1;

    /* renamed from: q1 */
    public List<C20778i> f53743q1;

    /* renamed from: r1 */
    public C20780k f53744r1;

    /* renamed from: s1 */
    public int f53745s1;

    /* renamed from: t1 */
    public int f53746t1;

    /* renamed from: u1 */
    public ArrayList<View> f53747u1;

    /* renamed from: v */
    public Parcelable f53748v = null;

    /* renamed from: v1 */
    public final Runnable f53749v1 = new C20772c();

    /* renamed from: w */
    public ClassLoader f53750w = null;

    /* renamed from: w1 */
    public int f53751w1 = 0;

    /* renamed from: x */
    public Scroller f53752x;

    /* renamed from: y */
    public boolean f53753y;

    /* renamed from: z */
    public C20781l f53754z;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C20769a();

        /* renamed from: c */
        public int f53755c;

        /* renamed from: d */
        public Parcelable f53756d;

        /* renamed from: e */
        public ClassLoader f53757e;

        /* renamed from: androidx.viewpager.widget.ViewPager$SavedState$a */
        public static class C20769a implements Parcelable.ClassLoaderCreator<SavedState> {
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

        public SavedState(@C0359n0 Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.f53755c + "}";
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f53755c);
            parcel.writeParcelable(this.f53756d, i);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.f53755c = parcel.readInt();
            this.f53756d = parcel.readParcelable(classLoader);
            this.f53757e = classLoader;
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$a */
    public static class C20770a implements Comparator<C20775f> {
        /* renamed from: a */
        public int compare(C20775f fVar, C20775f fVar2) {
            return fVar.f53762b - fVar2.f53762b;
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$b */
    public static class C20771b implements Interpolator {
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$c */
    public class C20772c implements Runnable {
        public C20772c() {
        }

        public void run() {
            ViewPager.this.setScrollState(0);
            ViewPager.this.mo62309J();
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$d */
    public class C20773d implements C18414x1 {

        /* renamed from: a */
        public final Rect f53759a = new Rect();

        public C20773d() {
        }

        /* renamed from: a */
        public C18436z4 mo1193a(View view, C18436z4 z4Var) {
            C18436z4 g1 = C18196h2.m82582g1(view, z4Var);
            if (g1.mo53120A()) {
                return g1;
            }
            Rect rect = this.f53759a;
            rect.left = g1.mo53147p();
            rect.top = g1.mo53149r();
            rect.right = g1.mo53148q();
            rect.bottom = g1.mo53146o();
            int childCount = ViewPager.this.getChildCount();
            for (int i = 0; i < childCount; i++) {
                C18436z4 p = C18196h2.m82616p(ViewPager.this.getChildAt(i), g1);
                rect.left = Math.min(p.mo53147p(), rect.left);
                rect.top = Math.min(p.mo53149r(), rect.top);
                rect.right = Math.min(p.mo53148q(), rect.right);
                rect.bottom = Math.min(p.mo53146o(), rect.bottom);
            }
            return g1.mo53123D(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    @Inherited
    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: androidx.viewpager.widget.ViewPager$e */
    public @interface C20774e {
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$f */
    public static class C20775f {

        /* renamed from: a */
        public Object f53761a;

        /* renamed from: b */
        public int f53762b;

        /* renamed from: c */
        public boolean f53763c;

        /* renamed from: d */
        public float f53764d;

        /* renamed from: e */
        public float f53765e;
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$h */
    public class C20777h extends C18019a {
        public C20777h() {
        }

        /* renamed from: f */
        public void mo52492f(View view, AccessibilityEvent accessibilityEvent) {
            C20784a aVar;
            super.mo52492f(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            accessibilityEvent.setScrollable(mo62401n());
            if (accessibilityEvent.getEventType() == 4096 && (aVar = ViewPager.this.f53728e) != null) {
                accessibilityEvent.setItemCount(aVar.mo21373e());
                accessibilityEvent.setFromIndex(ViewPager.this.f53730f);
                accessibilityEvent.setToIndex(ViewPager.this.f53730f);
            }
        }

        /* renamed from: g */
        public void mo19938g(View view, C18065l0 l0Var) {
            super.mo19938g(view, l0Var);
            l0Var.mo52592Z0(ViewPager.class.getName());
            l0Var.mo52542I1(mo62401n());
            if (ViewPager.this.canScrollHorizontally(1)) {
                l0Var.mo52594a(4096);
            }
            if (ViewPager.this.canScrollHorizontally(-1)) {
                l0Var.mo52594a(8192);
            }
        }

        /* renamed from: j */
        public boolean mo19939j(View view, int i, Bundle bundle) {
            if (super.mo19939j(view, i, bundle)) {
                return true;
            }
            if (i != 4096) {
                if (i != 8192 || !ViewPager.this.canScrollHorizontally(-1)) {
                    return false;
                }
                ViewPager viewPager = ViewPager.this;
                viewPager.setCurrentItem(viewPager.f53730f - 1);
                return true;
            } else if (!ViewPager.this.canScrollHorizontally(1)) {
                return false;
            } else {
                ViewPager viewPager2 = ViewPager.this;
                viewPager2.setCurrentItem(viewPager2.f53730f + 1);
                return true;
            }
        }

        /* renamed from: n */
        public final boolean mo62401n() {
            C20784a aVar = ViewPager.this.f53728e;
            return aVar != null && aVar.mo21373e() > 1;
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$i */
    public interface C20778i {
        /* renamed from: a */
        void mo62298a(@C0359n0 ViewPager viewPager, @C0363p0 C20784a aVar, @C0363p0 C20784a aVar2);
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$j */
    public interface C20779j {
        /* renamed from: d */
        void mo30672d(int i, float f, @C0372t0 int i2);

        /* renamed from: e */
        void mo30673e(int i);

        /* renamed from: f */
        void mo30674f(int i);
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$k */
    public interface C20780k {
        /* renamed from: a */
        void mo62402a(@C0359n0 View view, float f);
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$l */
    public class C20781l extends DataSetObserver {
        public C20781l() {
        }

        public void onChanged() {
            ViewPager.this.mo62351j();
        }

        public void onInvalidated() {
            ViewPager.this.mo62351j();
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$m */
    public static class C20782m implements C20779j {
        /* renamed from: d */
        public void mo30672d(int i, float f, int i2) {
        }

        /* renamed from: e */
        public void mo30673e(int i) {
        }

        /* renamed from: f */
        public void mo30674f(int i) {
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$n */
    public static class C20783n implements Comparator<View> {
        /* renamed from: a */
        public int compare(View view, View view2) {
            C20776g gVar = (C20776g) view.getLayoutParams();
            C20776g gVar2 = (C20776g) view2.getLayoutParams();
            boolean z = gVar.f53766a;
            if (z == gVar2.f53766a) {
                return gVar.f53770e - gVar2.f53770e;
            }
            if (z) {
                return 1;
            }
            return -1;
        }
    }

    public ViewPager(@C0359n0 Context context) {
        super(context);
        mo62389z();
    }

    /* renamed from: A */
    public static boolean m96472A(@C0359n0 View view) {
        if (view.getClass().getAnnotation(C20774e.class) != null) {
            return true;
        }
        return false;
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.f53707N0 != z) {
            this.f53707N0 = z;
        }
    }

    /* renamed from: B */
    public boolean mo62301B() {
        return this.f53731f1;
    }

    /* renamed from: C */
    public final boolean mo62302C(float f, float f2) {
        return (f < ((float) this.f53713T0) && f2 > 0.0f) || (f > ((float) (getWidth() - this.f53713T0)) && f2 < 0.0f);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0064  */
    @androidx.annotation.C0346i
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo62303D(int r13, float r14, int r15) {
        /*
            r12 = this;
            int r0 = r12.f53739m1
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L_0x006b
            int r0 = r12.getScrollX()
            int r3 = r12.getPaddingLeft()
            int r4 = r12.getPaddingRight()
            int r5 = r12.getWidth()
            int r6 = r12.getChildCount()
            r7 = r1
        L_0x001b:
            if (r7 >= r6) goto L_0x006b
            android.view.View r8 = r12.getChildAt(r7)
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            androidx.viewpager.widget.ViewPager$g r9 = (androidx.viewpager.widget.ViewPager.C20776g) r9
            boolean r10 = r9.f53766a
            if (r10 != 0) goto L_0x002c
            goto L_0x0068
        L_0x002c:
            int r9 = r9.f53767b
            r9 = r9 & 7
            if (r9 == r2) goto L_0x004d
            r10 = 3
            if (r9 == r10) goto L_0x0047
            r10 = 5
            if (r9 == r10) goto L_0x003a
            r9 = r3
            goto L_0x005c
        L_0x003a:
            int r9 = r5 - r4
            int r10 = r8.getMeasuredWidth()
            int r9 = r9 - r10
            int r10 = r8.getMeasuredWidth()
            int r4 = r4 + r10
            goto L_0x0059
        L_0x0047:
            int r9 = r8.getWidth()
            int r9 = r9 + r3
            goto L_0x005c
        L_0x004d:
            int r9 = r8.getMeasuredWidth()
            int r9 = r5 - r9
            int r9 = r9 / 2
            int r9 = java.lang.Math.max(r9, r3)
        L_0x0059:
            r11 = r9
            r9 = r3
            r3 = r11
        L_0x005c:
            int r3 = r3 + r0
            int r10 = r8.getLeft()
            int r3 = r3 - r10
            if (r3 == 0) goto L_0x0067
            r8.offsetLeftAndRight(r3)
        L_0x0067:
            r3 = r9
        L_0x0068:
            int r7 = r7 + 1
            goto L_0x001b
        L_0x006b:
            r12.mo62353l(r13, r14, r15)
            androidx.viewpager.widget.ViewPager$k r13 = r12.f53744r1
            if (r13 == 0) goto L_0x009f
            int r13 = r12.getScrollX()
            int r14 = r12.getChildCount()
        L_0x007a:
            if (r1 >= r14) goto L_0x009f
            android.view.View r15 = r12.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r0 = r15.getLayoutParams()
            androidx.viewpager.widget.ViewPager$g r0 = (androidx.viewpager.widget.ViewPager.C20776g) r0
            boolean r0 = r0.f53766a
            if (r0 == 0) goto L_0x008b
            goto L_0x009c
        L_0x008b:
            int r0 = r15.getLeft()
            int r0 = r0 - r13
            float r0 = (float) r0
            int r3 = r12.getClientWidth()
            float r3 = (float) r3
            float r0 = r0 / r3
            androidx.viewpager.widget.ViewPager$k r3 = r12.f53744r1
            r3.mo62402a(r15, r0)
        L_0x009c:
            int r1 = r1 + 1
            goto L_0x007a
        L_0x009f:
            r12.f53738l1 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.mo62303D(int, float, int):void");
    }

    /* renamed from: E */
    public final void mo62304E(MotionEvent motionEvent) {
        int i;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f53719Z0) {
            if (actionIndex == 0) {
                i = 1;
            } else {
                i = 0;
            }
            this.f53715V0 = motionEvent.getX(i);
            this.f53719Z0 = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f53721a1;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* renamed from: F */
    public boolean mo62305F() {
        int i = this.f53730f;
        if (i <= 0) {
            return false;
        }
        setCurrentItem(i - 1, true);
        return true;
    }

    /* renamed from: G */
    public boolean mo62306G() {
        C20784a aVar = this.f53728e;
        if (aVar == null || this.f53730f >= aVar.mo21373e() - 1) {
            return false;
        }
        setCurrentItem(this.f53730f + 1, true);
        return true;
    }

    /* renamed from: H */
    public final boolean mo62307H(int i) {
        if (this.f53722b.size() != 0) {
            C20775f x = mo62387x();
            int clientWidth = getClientWidth();
            int i2 = this.f53698E0;
            int i3 = clientWidth + i2;
            float f = (float) clientWidth;
            int i4 = x.f53762b;
            float f2 = ((((float) i) / f) - x.f53765e) / (x.f53764d + (((float) i2) / f));
            this.f53738l1 = false;
            mo62303D(i4, f2, (int) (((float) i3) * f2));
            if (this.f53738l1) {
                return true;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        } else if (this.f53736j1) {
            return false;
        } else {
            this.f53738l1 = false;
            mo62303D(0, 0.0f, 0);
            if (this.f53738l1) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
    }

    /* renamed from: I */
    public final boolean mo62308I(float f) {
        boolean z;
        boolean z2;
        float f2 = this.f53715V0 - f;
        this.f53715V0 = f;
        float scrollX = ((float) getScrollX()) + f2;
        float clientWidth = (float) getClientWidth();
        float f3 = this.f53702I0 * clientWidth;
        float f4 = this.f53703J0 * clientWidth;
        boolean z3 = false;
        C20775f fVar = this.f53722b.get(0);
        ArrayList<C20775f> arrayList = this.f53722b;
        C20775f fVar2 = arrayList.get(arrayList.size() - 1);
        if (fVar.f53762b != 0) {
            f3 = fVar.f53765e * clientWidth;
            z = false;
        } else {
            z = true;
        }
        if (fVar2.f53762b != this.f53728e.mo21373e() - 1) {
            f4 = fVar2.f53765e * clientWidth;
            z2 = false;
        } else {
            z2 = true;
        }
        if (scrollX < f3) {
            if (z) {
                this.f53734h1.onPull(Math.abs(f3 - scrollX) / clientWidth);
                z3 = true;
            }
            scrollX = f3;
        } else if (scrollX > f4) {
            if (z2) {
                this.f53735i1.onPull(Math.abs(scrollX - f4) / clientWidth);
                z3 = true;
            }
            scrollX = f4;
        }
        int i = (int) scrollX;
        this.f53715V0 += scrollX - ((float) i);
        scrollTo(i, getScrollY());
        mo62307H(i);
        return z3;
    }

    /* renamed from: J */
    public void mo62309J() {
        mo62310K(this.f53730f);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0060, code lost:
        if (r9 == r10) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0066, code lost:
        r8 = null;
     */
    /* renamed from: K */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo62310K(int r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r0.f53730f
            if (r2 == r1) goto L_0x000f
            androidx.viewpager.widget.ViewPager$f r2 = r0.mo62388y(r2)
            r0.f53730f = r1
            goto L_0x0010
        L_0x000f:
            r2 = 0
        L_0x0010:
            androidx.viewpager.widget.a r1 = r0.f53728e
            if (r1 != 0) goto L_0x0018
            r17.mo62323X()
            return
        L_0x0018:
            boolean r1 = r0.f53708O0
            if (r1 == 0) goto L_0x0020
            r17.mo62323X()
            return
        L_0x0020:
            android.os.IBinder r1 = r17.getWindowToken()
            if (r1 != 0) goto L_0x0027
            return
        L_0x0027:
            androidx.viewpager.widget.a r1 = r0.f53728e
            r1.mo57092t(r0)
            int r1 = r0.f53709P0
            int r4 = r0.f53730f
            int r4 = r4 - r1
            r5 = 0
            int r4 = java.lang.Math.max(r5, r4)
            androidx.viewpager.widget.a r6 = r0.f53728e
            int r6 = r6.mo21373e()
            int r7 = r6 + -1
            int r8 = r0.f53730f
            int r8 = r8 + r1
            int r1 = java.lang.Math.min(r7, r8)
            int r7 = r0.f53720a
            if (r6 != r7) goto L_0x020e
            r7 = r5
        L_0x004a:
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r8 = r0.f53722b
            int r8 = r8.size()
            if (r7 >= r8) goto L_0x0066
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r8 = r0.f53722b
            java.lang.Object r8 = r8.get(r7)
            androidx.viewpager.widget.ViewPager$f r8 = (androidx.viewpager.widget.ViewPager.C20775f) r8
            int r9 = r8.f53762b
            int r10 = r0.f53730f
            if (r9 < r10) goto L_0x0063
            if (r9 != r10) goto L_0x0066
            goto L_0x0067
        L_0x0063:
            int r7 = r7 + 1
            goto L_0x004a
        L_0x0066:
            r8 = 0
        L_0x0067:
            if (r8 != 0) goto L_0x0071
            if (r6 <= 0) goto L_0x0071
            int r8 = r0.f53730f
            androidx.viewpager.widget.ViewPager$f r8 = r0.mo62324a(r8, r7)
        L_0x0071:
            r9 = 0
            if (r8 == 0) goto L_0x019b
            int r10 = r7 + -1
            if (r10 < 0) goto L_0x0081
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r11 = r0.f53722b
            java.lang.Object r11 = r11.get(r10)
            androidx.viewpager.widget.ViewPager$f r11 = (androidx.viewpager.widget.ViewPager.C20775f) r11
            goto L_0x0082
        L_0x0081:
            r11 = 0
        L_0x0082:
            int r12 = r17.getClientWidth()
            r13 = 1073741824(0x40000000, float:2.0)
            if (r12 > 0) goto L_0x008c
            r14 = r9
            goto L_0x0098
        L_0x008c:
            float r14 = r8.f53764d
            float r14 = r13 - r14
            int r15 = r17.getPaddingLeft()
            float r15 = (float) r15
            float r3 = (float) r12
            float r15 = r15 / r3
            float r14 = r14 + r15
        L_0x0098:
            int r3 = r0.f53730f
            int r3 = r3 + -1
            r15 = r9
        L_0x009d:
            if (r3 < 0) goto L_0x00fd
            int r16 = (r15 > r14 ? 1 : (r15 == r14 ? 0 : -1))
            if (r16 < 0) goto L_0x00cb
            if (r3 >= r4) goto L_0x00cb
            if (r11 != 0) goto L_0x00a8
            goto L_0x00fd
        L_0x00a8:
            int r5 = r11.f53762b
            if (r3 != r5) goto L_0x00f9
            boolean r5 = r11.f53763c
            if (r5 != 0) goto L_0x00f9
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f53722b
            r5.remove(r10)
            androidx.viewpager.widget.a r5 = r0.f53728e
            java.lang.Object r11 = r11.f53761a
            r5.mo21372b(r0, r3, r11)
            int r10 = r10 + -1
            int r7 = r7 + -1
            if (r10 < 0) goto L_0x00f7
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f53722b
            java.lang.Object r5 = r5.get(r10)
            androidx.viewpager.widget.ViewPager$f r5 = (androidx.viewpager.widget.ViewPager.C20775f) r5
            goto L_0x00f8
        L_0x00cb:
            if (r11 == 0) goto L_0x00e1
            int r5 = r11.f53762b
            if (r3 != r5) goto L_0x00e1
            float r5 = r11.f53764d
            float r15 = r15 + r5
            int r10 = r10 + -1
            if (r10 < 0) goto L_0x00f7
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f53722b
            java.lang.Object r5 = r5.get(r10)
            androidx.viewpager.widget.ViewPager$f r5 = (androidx.viewpager.widget.ViewPager.C20775f) r5
            goto L_0x00f8
        L_0x00e1:
            int r5 = r10 + 1
            androidx.viewpager.widget.ViewPager$f r5 = r0.mo62324a(r3, r5)
            float r5 = r5.f53764d
            float r15 = r15 + r5
            int r7 = r7 + 1
            if (r10 < 0) goto L_0x00f7
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f53722b
            java.lang.Object r5 = r5.get(r10)
            androidx.viewpager.widget.ViewPager$f r5 = (androidx.viewpager.widget.ViewPager.C20775f) r5
            goto L_0x00f8
        L_0x00f7:
            r5 = 0
        L_0x00f8:
            r11 = r5
        L_0x00f9:
            int r3 = r3 + -1
            r5 = 0
            goto L_0x009d
        L_0x00fd:
            float r3 = r8.f53764d
            int r4 = r7 + 1
            int r5 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r5 >= 0) goto L_0x018f
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f53722b
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x0116
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f53722b
            java.lang.Object r5 = r5.get(r4)
            androidx.viewpager.widget.ViewPager$f r5 = (androidx.viewpager.widget.ViewPager.C20775f) r5
            goto L_0x0117
        L_0x0116:
            r5 = 0
        L_0x0117:
            if (r12 > 0) goto L_0x011b
            r10 = r9
            goto L_0x0123
        L_0x011b:
            int r10 = r17.getPaddingRight()
            float r10 = (float) r10
            float r11 = (float) r12
            float r10 = r10 / r11
            float r10 = r10 + r13
        L_0x0123:
            int r11 = r0.f53730f
        L_0x0125:
            int r11 = r11 + 1
            if (r11 >= r6) goto L_0x018f
            int r12 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r12 < 0) goto L_0x0159
            if (r11 <= r1) goto L_0x0159
            if (r5 != 0) goto L_0x0132
            goto L_0x018f
        L_0x0132:
            int r12 = r5.f53762b
            if (r11 != r12) goto L_0x018e
            boolean r12 = r5.f53763c
            if (r12 != 0) goto L_0x018e
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r12 = r0.f53722b
            r12.remove(r4)
            androidx.viewpager.widget.a r12 = r0.f53728e
            java.lang.Object r5 = r5.f53761a
            r12.mo21372b(r0, r11, r5)
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f53722b
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x0157
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f53722b
            java.lang.Object r5 = r5.get(r4)
            androidx.viewpager.widget.ViewPager$f r5 = (androidx.viewpager.widget.ViewPager.C20775f) r5
            goto L_0x018e
        L_0x0157:
            r5 = 0
            goto L_0x018e
        L_0x0159:
            if (r5 == 0) goto L_0x0175
            int r12 = r5.f53762b
            if (r11 != r12) goto L_0x0175
            float r5 = r5.f53764d
            float r3 = r3 + r5
            int r4 = r4 + 1
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f53722b
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x0157
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f53722b
            java.lang.Object r5 = r5.get(r4)
            androidx.viewpager.widget.ViewPager$f r5 = (androidx.viewpager.widget.ViewPager.C20775f) r5
            goto L_0x018e
        L_0x0175:
            androidx.viewpager.widget.ViewPager$f r5 = r0.mo62324a(r11, r4)
            int r4 = r4 + 1
            float r5 = r5.f53764d
            float r3 = r3 + r5
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f53722b
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x0157
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f53722b
            java.lang.Object r5 = r5.get(r4)
            androidx.viewpager.widget.ViewPager$f r5 = (androidx.viewpager.widget.ViewPager.C20775f) r5
        L_0x018e:
            goto L_0x0125
        L_0x018f:
            r0.mo62339f(r8, r7, r2)
            androidx.viewpager.widget.a r1 = r0.f53728e
            int r2 = r0.f53730f
            java.lang.Object r3 = r8.f53761a
            r1.mo57091q(r0, r2, r3)
        L_0x019b:
            androidx.viewpager.widget.a r1 = r0.f53728e
            r1.mo57088d(r0)
            int r1 = r17.getChildCount()
            r2 = 0
        L_0x01a5:
            if (r2 >= r1) goto L_0x01ce
            android.view.View r3 = r0.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            androidx.viewpager.widget.ViewPager$g r4 = (androidx.viewpager.widget.ViewPager.C20776g) r4
            r4.f53771f = r2
            boolean r5 = r4.f53766a
            if (r5 != 0) goto L_0x01cb
            float r5 = r4.f53768c
            int r5 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r5 != 0) goto L_0x01cb
            androidx.viewpager.widget.ViewPager$f r3 = r0.mo62386w(r3)
            if (r3 == 0) goto L_0x01cb
            float r5 = r3.f53764d
            r4.f53768c = r5
            int r3 = r3.f53762b
            r4.f53770e = r3
        L_0x01cb:
            int r2 = r2 + 1
            goto L_0x01a5
        L_0x01ce:
            r17.mo62323X()
            boolean r1 = r17.hasFocus()
            if (r1 == 0) goto L_0x020d
            android.view.View r1 = r17.findFocus()
            if (r1 == 0) goto L_0x01e2
            androidx.viewpager.widget.ViewPager$f r3 = r0.mo62384v(r1)
            goto L_0x01e3
        L_0x01e2:
            r3 = 0
        L_0x01e3:
            if (r3 == 0) goto L_0x01eb
            int r1 = r3.f53762b
            int r2 = r0.f53730f
            if (r1 == r2) goto L_0x020d
        L_0x01eb:
            r5 = 0
        L_0x01ec:
            int r1 = r17.getChildCount()
            if (r5 >= r1) goto L_0x020d
            android.view.View r1 = r0.getChildAt(r5)
            androidx.viewpager.widget.ViewPager$f r2 = r0.mo62386w(r1)
            if (r2 == 0) goto L_0x020a
            int r2 = r2.f53762b
            int r3 = r0.f53730f
            if (r2 != r3) goto L_0x020a
            r2 = 2
            boolean r1 = r1.requestFocus(r2)
            if (r1 == 0) goto L_0x020a
            goto L_0x020d
        L_0x020a:
            int r5 = r5 + 1
            goto L_0x01ec
        L_0x020d:
            return
        L_0x020e:
            android.content.res.Resources r1 = r17.getResources()     // Catch:{ NotFoundException -> 0x021b }
            int r2 = r17.getId()     // Catch:{ NotFoundException -> 0x021b }
            java.lang.String r1 = r1.getResourceName(r2)     // Catch:{ NotFoundException -> 0x021b }
            goto L_0x0223
        L_0x021b:
            int r1 = r17.getId()
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
        L_0x0223:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: "
            r3.append(r4)
            int r4 = r0.f53720a
            r3.append(r4)
            java.lang.String r4 = ", found: "
            r3.append(r4)
            r3.append(r6)
            java.lang.String r4 = " Pager id: "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = " Pager class: "
            r3.append(r1)
            java.lang.Class r1 = r17.getClass()
            r3.append(r1)
            java.lang.String r1 = " Problematic adapter: "
            r3.append(r1)
            androidx.viewpager.widget.a r1 = r0.f53728e
            java.lang.Class r1 = r1.getClass()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.mo62310K(int):void");
    }

    /* renamed from: L */
    public final void mo62311L(int i, int i2, int i3, int i4) {
        float f;
        if (i2 <= 0 || this.f53722b.isEmpty()) {
            C20775f y = mo62388y(this.f53730f);
            if (y != null) {
                f = Math.min(y.f53765e, this.f53703J0);
            } else {
                f = 0.0f;
            }
            int paddingLeft = (int) (f * ((float) ((i - getPaddingLeft()) - getPaddingRight())));
            if (paddingLeft != getScrollX()) {
                mo62350i(false);
                scrollTo(paddingLeft, getScrollY());
            }
        } else if (!this.f53752x.isFinished()) {
            this.f53752x.setFinalX(getCurrentItem() * getClientWidth());
        } else {
            scrollTo((int) ((((float) getScrollX()) / ((float) (((i2 - getPaddingLeft()) - getPaddingRight()) + i4))) * ((float) (((i - getPaddingLeft()) - getPaddingRight()) + i3))), getScrollY());
        }
    }

    /* renamed from: M */
    public final void mo62312M() {
        int i = 0;
        while (i < getChildCount()) {
            if (!((C20776g) getChildAt(i).getLayoutParams()).f53766a) {
                removeViewAt(i);
                i--;
            }
            i++;
        }
    }

    /* renamed from: N */
    public void mo62313N(@C0359n0 C20778i iVar) {
        List<C20778i> list = this.f53743q1;
        if (list != null) {
            list.remove(iVar);
        }
    }

    /* renamed from: O */
    public void mo62314O(@C0359n0 C20779j jVar) {
        List<C20779j> list = this.f53740n1;
        if (list != null) {
            list.remove(jVar);
        }
    }

    /* renamed from: P */
    public final void mo62315P(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    /* renamed from: Q */
    public final boolean mo62316Q() {
        this.f53719Z0 = -1;
        mo62367q();
        this.f53734h1.onRelease();
        this.f53735i1.onRelease();
        if (this.f53734h1.isFinished() || this.f53735i1.isFinished()) {
            return true;
        }
        return false;
    }

    /* renamed from: R */
    public final void mo62317R(int i, boolean z, int i2, boolean z2) {
        int i3;
        C20775f y = mo62388y(i);
        if (y != null) {
            i3 = (int) (((float) getClientWidth()) * Math.max(this.f53702I0, Math.min(y.f53765e, this.f53703J0)));
        } else {
            i3 = 0;
        }
        if (z) {
            mo62322W(i3, 0, i2);
            if (z2) {
                mo62354m(i);
                return;
            }
            return;
        }
        if (z2) {
            mo62354m(i);
        }
        mo62350i(false);
        scrollTo(i3, 0);
        mo62307H(i3);
    }

    /* renamed from: S */
    public void mo62318S(int i, boolean z, boolean z2) {
        mo62319T(i, z, z2, 0);
    }

    /* renamed from: T */
    public void mo62319T(int i, boolean z, boolean z2, int i2) {
        C20784a aVar = this.f53728e;
        boolean z3 = false;
        if (aVar == null || aVar.mo21373e() <= 0) {
            setScrollingCacheEnabled(false);
        } else if (z2 || this.f53730f != i || this.f53722b.size() == 0) {
            if (i < 0) {
                i = 0;
            } else if (i >= this.f53728e.mo21373e()) {
                i = this.f53728e.mo21373e() - 1;
            }
            int i3 = this.f53709P0;
            int i4 = this.f53730f;
            if (i > i4 + i3 || i < i4 - i3) {
                for (int i5 = 0; i5 < this.f53722b.size(); i5++) {
                    this.f53722b.get(i5).f53763c = true;
                }
            }
            if (this.f53730f != i) {
                z3 = true;
            }
            if (this.f53736j1) {
                this.f53730f = i;
                if (z3) {
                    mo62354m(i);
                }
                requestLayout();
                return;
            }
            mo62310K(i);
            mo62317R(i, z, i2, z3);
        } else {
            setScrollingCacheEnabled(false);
        }
    }

    /* renamed from: U */
    public C20779j mo62320U(C20779j jVar) {
        C20779j jVar2 = this.f53742p1;
        this.f53742p1 = jVar;
        return jVar2;
    }

    /* renamed from: V */
    public void mo62321V(int i, int i2) {
        mo62322W(i, i2, 0);
    }

    /* renamed from: W */
    public void mo62322W(int i, int i2, int i3) {
        boolean z;
        int i4;
        int i5;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.f53752x;
        if (scroller == null || scroller.isFinished()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            if (this.f53753y) {
                i4 = this.f53752x.getCurrX();
            } else {
                i4 = this.f53752x.getStartX();
            }
            this.f53752x.abortAnimation();
            setScrollingCacheEnabled(false);
        } else {
            i4 = getScrollX();
        }
        int i6 = i4;
        int scrollY = getScrollY();
        int i7 = i - i6;
        int i8 = i2 - scrollY;
        if (i7 == 0 && i8 == 0) {
            mo62350i(false);
            mo62309J();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i9 = clientWidth / 2;
        float f = (float) clientWidth;
        float f2 = (float) i9;
        float o = f2 + (mo62356o(Math.min(1.0f, (((float) Math.abs(i7)) * 1.0f) / f)) * f2);
        int abs = Math.abs(i3);
        if (abs > 0) {
            i5 = Math.round(Math.abs(o / ((float) abs)) * 1000.0f) * 4;
        } else {
            i5 = (int) (((((float) Math.abs(i7)) / ((f * this.f53728e.mo62411h(this.f53730f)) + ((float) this.f53698E0))) + 1.0f) * 100.0f);
        }
        int min = Math.min(i5, 600);
        this.f53753y = false;
        this.f53752x.startScroll(i6, scrollY, i7, i8, min);
        C18196h2.m82610n1(this);
    }

    /* renamed from: X */
    public final void mo62323X() {
        if (this.f53746t1 != 0) {
            ArrayList<View> arrayList = this.f53747u1;
            if (arrayList == null) {
                this.f53747u1 = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.f53747u1.add(getChildAt(i));
            }
            Collections.sort(this.f53747u1, f53691N1);
        }
    }

    /* renamed from: a */
    public C20775f mo62324a(int i, int i2) {
        C20775f fVar = new C20775f();
        fVar.f53762b = i;
        fVar.f53761a = this.f53728e.mo21374j(this, i);
        fVar.f53764d = this.f53728e.mo62411h(i);
        if (i2 < 0 || i2 >= this.f53722b.size()) {
            this.f53722b.add(fVar);
        } else {
            this.f53722b.add(i2, fVar);
        }
        return fVar;
    }

    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        C20775f w;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0 && (w = mo62386w(childAt)) != null && w.f53762b == this.f53730f) {
                    childAt.addFocusables(arrayList, i, i2);
                }
            }
        }
        if ((descendantFocusability == 262144 && size != arrayList.size()) || !isFocusable()) {
            return;
        }
        if ((i2 & 1) != 1 || !isInTouchMode() || isFocusableInTouchMode()) {
            arrayList.add(this);
        }
    }

    public void addTouchables(ArrayList<View> arrayList) {
        C20775f w;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (w = mo62386w(childAt)) != null && w.f53762b == this.f53730f) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        C20776g gVar = (C20776g) layoutParams;
        boolean A = gVar.f53766a | m96472A(view);
        gVar.f53766a = A;
        if (!this.f53706M0) {
            super.addView(view, i, layoutParams);
        } else if (!A) {
            gVar.f53769d = true;
            addViewInLayout(view, i, layoutParams);
        } else {
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
    }

    /* renamed from: b */
    public void mo62328b(@C0359n0 C20778i iVar) {
        if (this.f53743q1 == null) {
            this.f53743q1 = new ArrayList();
        }
        this.f53743q1.add(iVar);
    }

    /* renamed from: c */
    public void mo62329c(@C0359n0 C20779j jVar) {
        if (this.f53740n1 == null) {
            this.f53740n1 = new ArrayList();
        }
        this.f53740n1.add(jVar);
    }

    public boolean canScrollHorizontally(int i) {
        if (this.f53728e == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        if (i < 0) {
            if (scrollX > ((int) (((float) clientWidth) * this.f53702I0))) {
                return true;
            }
            return false;
        } else if (i <= 0 || scrollX >= ((int) (((float) clientWidth) * this.f53703J0))) {
            return false;
        } else {
            return true;
        }
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C20776g) && super.checkLayoutParams(layoutParams);
    }

    public void computeScroll() {
        this.f53753y = true;
        if (this.f53752x.isFinished() || !this.f53752x.computeScrollOffset()) {
            mo62350i(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f53752x.getCurrX();
        int currY = this.f53752x.getCurrY();
        if (!(scrollX == currX && scrollY == currY)) {
            scrollTo(currX, currY);
            if (!mo62307H(currX)) {
                this.f53752x.abortAnimation();
                scrollTo(0, currY);
            }
        }
        C18196h2.m82610n1(this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00c6  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo62333d(int r7) {
        /*
            r6 = this;
            android.view.View r0 = r6.findFocus()
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 != r6) goto L_0x000b
        L_0x0009:
            r0 = r3
            goto L_0x0060
        L_0x000b:
            if (r0 == 0) goto L_0x0060
            android.view.ViewParent r4 = r0.getParent()
        L_0x0011:
            boolean r5 = r4 instanceof android.view.ViewGroup
            if (r5 == 0) goto L_0x001e
            if (r4 != r6) goto L_0x0019
            r4 = r1
            goto L_0x001f
        L_0x0019:
            android.view.ViewParent r4 = r4.getParent()
            goto L_0x0011
        L_0x001e:
            r4 = r2
        L_0x001f:
            if (r4 != 0) goto L_0x0060
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.Class r5 = r0.getClass()
            java.lang.String r5 = r5.getSimpleName()
            r4.append(r5)
            android.view.ViewParent r0 = r0.getParent()
        L_0x0035:
            boolean r5 = r0 instanceof android.view.ViewGroup
            if (r5 == 0) goto L_0x004e
            java.lang.String r5 = " => "
            r4.append(r5)
            java.lang.Class r5 = r0.getClass()
            java.lang.String r5 = r5.getSimpleName()
            r4.append(r5)
            android.view.ViewParent r0 = r0.getParent()
            goto L_0x0035
        L_0x004e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "arrowScroll tried to find focus based on non-child current focused view "
            r0.append(r5)
            java.lang.String r4 = r4.toString()
            r0.append(r4)
            goto L_0x0009
        L_0x0060:
            android.view.FocusFinder r3 = android.view.FocusFinder.getInstance()
            android.view.View r3 = r3.findNextFocus(r6, r0, r7)
            r4 = 66
            r5 = 17
            if (r3 == 0) goto L_0x00b1
            if (r3 == r0) goto L_0x00b1
            if (r7 != r5) goto L_0x0091
            android.graphics.Rect r1 = r6.f53726d
            android.graphics.Rect r1 = r6.mo62383u(r1, r3)
            int r1 = r1.left
            android.graphics.Rect r2 = r6.f53726d
            android.graphics.Rect r2 = r6.mo62383u(r2, r0)
            int r2 = r2.left
            if (r0 == 0) goto L_0x008b
            if (r1 < r2) goto L_0x008b
            boolean r0 = r6.mo62305F()
            goto L_0x008f
        L_0x008b:
            boolean r0 = r3.requestFocus()
        L_0x008f:
            r2 = r0
            goto L_0x00c4
        L_0x0091:
            if (r7 != r4) goto L_0x00c4
            android.graphics.Rect r1 = r6.f53726d
            android.graphics.Rect r1 = r6.mo62383u(r1, r3)
            int r1 = r1.left
            android.graphics.Rect r2 = r6.f53726d
            android.graphics.Rect r2 = r6.mo62383u(r2, r0)
            int r2 = r2.left
            if (r0 == 0) goto L_0x00ac
            if (r1 > r2) goto L_0x00ac
            boolean r0 = r6.mo62306G()
            goto L_0x008f
        L_0x00ac:
            boolean r0 = r3.requestFocus()
            goto L_0x008f
        L_0x00b1:
            if (r7 == r5) goto L_0x00c0
            if (r7 != r1) goto L_0x00b6
            goto L_0x00c0
        L_0x00b6:
            if (r7 == r4) goto L_0x00bb
            r0 = 2
            if (r7 != r0) goto L_0x00c4
        L_0x00bb:
            boolean r2 = r6.mo62306G()
            goto L_0x00c4
        L_0x00c0:
            boolean r2 = r6.mo62305F()
        L_0x00c4:
            if (r2 == 0) goto L_0x00cd
            int r7 = android.view.SoundEffectConstants.getContantForFocusDirection(r7)
            r6.playSoundEffect(r7)
        L_0x00cd:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.mo62333d(int):boolean");
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || mo62370s(keyEvent);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        C20775f w;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (w = mo62386w(childAt)) != null && w.f53762b == this.f53730f && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    public void draw(Canvas canvas) {
        C20784a aVar;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean z = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (aVar = this.f53728e) != null && aVar.mo21373e() > 1)) {
            if (!this.f53734h1.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((float) ((-height) + getPaddingTop()), this.f53702I0 * ((float) width));
                this.f53734h1.setSize(height, width);
                z = false | this.f53734h1.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.f53735i1.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate((float) (-getPaddingTop()), (-(this.f53703J0 + 1.0f)) * ((float) width2));
                this.f53735i1.setSize(height2, width2);
                z |= this.f53735i1.draw(canvas);
                canvas.restoreToCount(save2);
            }
        } else {
            this.f53734h1.finish();
            this.f53735i1.finish();
        }
        if (z) {
            C18196h2.m82610n1(this);
        }
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f53699F0;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    /* renamed from: e */
    public boolean mo62338e() {
        if (this.f53710Q0) {
            return false;
        }
        this.f53731f1 = true;
        setScrollState(1);
        this.f53715V0 = 0.0f;
        this.f53717X0 = 0.0f;
        VelocityTracker velocityTracker = this.f53721a1;
        if (velocityTracker == null) {
            this.f53721a1 = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, 0.0f, 0.0f, 0);
        this.f53721a1.addMovement(obtain);
        obtain.recycle();
        this.f53733g1 = uptimeMillis;
        return true;
    }

    /* renamed from: f */
    public final void mo62339f(C20775f fVar, int i, C20775f fVar2) {
        float f;
        float f2;
        float f3;
        int i2;
        int i3;
        C20775f fVar3;
        C20775f fVar4;
        int e = this.f53728e.mo21373e();
        int clientWidth = getClientWidth();
        if (clientWidth > 0) {
            f = ((float) this.f53698E0) / ((float) clientWidth);
        } else {
            f = 0.0f;
        }
        if (fVar2 != null) {
            int i4 = fVar2.f53762b;
            int i5 = fVar.f53762b;
            if (i4 < i5) {
                float f4 = fVar2.f53765e + fVar2.f53764d + f;
                int i6 = i4 + 1;
                int i7 = 0;
                while (i6 <= fVar.f53762b && i7 < this.f53722b.size()) {
                    Object obj = this.f53722b.get(i7);
                    while (true) {
                        fVar4 = (C20775f) obj;
                        if (i6 > fVar4.f53762b && i7 < this.f53722b.size() - 1) {
                            i7++;
                            obj = this.f53722b.get(i7);
                        }
                    }
                    while (i6 < fVar4.f53762b) {
                        f4 += this.f53728e.mo62411h(i6) + f;
                        i6++;
                    }
                    fVar4.f53765e = f4;
                    f4 += fVar4.f53764d + f;
                    i6++;
                }
            } else if (i4 > i5) {
                int size = this.f53722b.size() - 1;
                float f5 = fVar2.f53765e;
                while (true) {
                    i4--;
                    if (i4 < fVar.f53762b || size < 0) {
                        break;
                    }
                    Object obj2 = this.f53722b.get(size);
                    while (true) {
                        fVar3 = (C20775f) obj2;
                        if (i4 < fVar3.f53762b && size > 0) {
                            size--;
                            obj2 = this.f53722b.get(size);
                        }
                    }
                    while (i4 > fVar3.f53762b) {
                        f5 -= this.f53728e.mo62411h(i4) + f;
                        i4--;
                    }
                    f5 -= fVar3.f53764d + f;
                    fVar3.f53765e = f5;
                }
            }
        }
        int size2 = this.f53722b.size();
        float f6 = fVar.f53765e;
        int i8 = fVar.f53762b;
        int i9 = i8 - 1;
        if (i8 == 0) {
            f2 = f6;
        } else {
            f2 = -3.4028235E38f;
        }
        this.f53702I0 = f2;
        int i10 = e - 1;
        if (i8 == i10) {
            f3 = (fVar.f53764d + f6) - 1.0f;
        } else {
            f3 = Float.MAX_VALUE;
        }
        this.f53703J0 = f3;
        int i11 = i - 1;
        while (i11 >= 0) {
            C20775f fVar5 = this.f53722b.get(i11);
            while (true) {
                i3 = fVar5.f53762b;
                if (i9 <= i3) {
                    break;
                }
                f6 -= this.f53728e.mo62411h(i9) + f;
                i9--;
            }
            f6 -= fVar5.f53764d + f;
            fVar5.f53765e = f6;
            if (i3 == 0) {
                this.f53702I0 = f6;
            }
            i11--;
            i9--;
        }
        float f7 = fVar.f53765e + fVar.f53764d + f;
        int i12 = fVar.f53762b + 1;
        int i13 = i + 1;
        while (i13 < size2) {
            C20775f fVar6 = this.f53722b.get(i13);
            while (true) {
                i2 = fVar6.f53762b;
                if (i12 >= i2) {
                    break;
                }
                f7 += this.f53728e.mo62411h(i12) + f;
                i12++;
            }
            if (i2 == i10) {
                this.f53703J0 = (fVar6.f53764d + f7) - 1.0f;
            }
            fVar6.f53765e = f7;
            f7 += fVar6.f53764d + f;
            i13++;
            i12++;
        }
        this.f53737k1 = false;
    }

    /* renamed from: g */
    public boolean mo62340g(View view, boolean z, int i, int i2, int i3) {
        int i4;
        View view2 = view;
        if (view2 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view2;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i5 = i2 + scrollX;
                if (i5 >= childAt.getLeft() && i5 < childAt.getRight() && (i4 = i3 + scrollY) >= childAt.getTop() && i4 < childAt.getBottom()) {
                    if (mo62340g(childAt, true, i, i5 - childAt.getLeft(), i4 - childAt.getTop())) {
                        return true;
                    }
                }
            }
        }
        if (!z || !view.canScrollHorizontally(-i)) {
            return false;
        }
        return true;
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C20776g();
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    @C0363p0
    public C20784a getAdapter() {
        return this.f53728e;
    }

    public int getChildDrawingOrder(int i, int i2) {
        if (this.f53746t1 == 2) {
            i2 = (i - 1) - i2;
        }
        return ((C20776g) this.f53747u1.get(i2).getLayoutParams()).f53771f;
    }

    public int getCurrentItem() {
        return this.f53730f;
    }

    public int getOffscreenPageLimit() {
        return this.f53709P0;
    }

    public int getPageMargin() {
        return this.f53698E0;
    }

    /* renamed from: h */
    public void mo62349h() {
        List<C20779j> list = this.f53740n1;
        if (list != null) {
            list.clear();
        }
    }

    /* renamed from: i */
    public final void mo62350i(boolean z) {
        boolean z2;
        if (this.f53751w1 == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            setScrollingCacheEnabled(false);
            if (!this.f53752x.isFinished()) {
                this.f53752x.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.f53752x.getCurrX();
                int currY = this.f53752x.getCurrY();
                if (!(scrollX == currX && scrollY == currY)) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        mo62307H(currX);
                    }
                }
            }
        }
        this.f53708O0 = false;
        for (int i = 0; i < this.f53722b.size(); i++) {
            C20775f fVar = this.f53722b.get(i);
            if (fVar.f53763c) {
                fVar.f53763c = false;
                z2 = true;
            }
        }
        if (!z2) {
            return;
        }
        if (z) {
            C18196h2.m82618p1(this, this.f53749v1);
        } else {
            this.f53749v1.run();
        }
    }

    /* renamed from: j */
    public void mo62351j() {
        boolean z;
        int e = this.f53728e.mo21373e();
        this.f53720a = e;
        if (this.f53722b.size() >= (this.f53709P0 * 2) + 1 || this.f53722b.size() >= e) {
            z = false;
        } else {
            z = true;
        }
        int i = this.f53730f;
        int i2 = 0;
        boolean z2 = false;
        while (i2 < this.f53722b.size()) {
            C20775f fVar = this.f53722b.get(i2);
            int f = this.f53728e.mo62409f(fVar.f53761a);
            if (f != -1) {
                if (f == -2) {
                    this.f53722b.remove(i2);
                    i2--;
                    if (!z2) {
                        this.f53728e.mo57092t(this);
                        z2 = true;
                    }
                    this.f53728e.mo21372b(this, fVar.f53762b, fVar.f53761a);
                    int i3 = this.f53730f;
                    if (i3 == fVar.f53762b) {
                        i = Math.max(0, Math.min(i3, e - 1));
                    }
                } else {
                    int i4 = fVar.f53762b;
                    if (i4 != f) {
                        if (i4 == this.f53730f) {
                            i = f;
                        }
                        fVar.f53762b = f;
                    }
                }
                z = true;
            }
            i2++;
        }
        if (z2) {
            this.f53728e.mo57088d(this);
        }
        Collections.sort(this.f53722b, f53684G1);
        if (z) {
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                C20776g gVar = (C20776g) getChildAt(i5).getLayoutParams();
                if (!gVar.f53766a) {
                    gVar.f53768c = 0.0f;
                }
            }
            mo62318S(i, false, true);
            requestLayout();
        }
    }

    /* renamed from: k */
    public final int mo62352k(int i, float f, int i2, int i3) {
        float f2;
        if (Math.abs(i3) <= this.f53727d1 || Math.abs(i2) <= this.f53723b1) {
            if (i >= this.f53730f) {
                f2 = 0.4f;
            } else {
                f2 = 0.6f;
            }
            i += (int) (f + f2);
        } else if (i2 <= 0) {
            i++;
        }
        if (this.f53722b.size() <= 0) {
            return i;
        }
        ArrayList<C20775f> arrayList = this.f53722b;
        return Math.max(this.f53722b.get(0).f53762b, Math.min(i, arrayList.get(arrayList.size() - 1).f53762b));
    }

    /* renamed from: l */
    public final void mo62353l(int i, float f, int i2) {
        C20779j jVar = this.f53741o1;
        if (jVar != null) {
            jVar.mo30672d(i, f, i2);
        }
        List<C20779j> list = this.f53740n1;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                C20779j jVar2 = this.f53740n1.get(i3);
                if (jVar2 != null) {
                    jVar2.mo30672d(i, f, i2);
                }
            }
        }
        C20779j jVar3 = this.f53742p1;
        if (jVar3 != null) {
            jVar3.mo30672d(i, f, i2);
        }
    }

    /* renamed from: m */
    public final void mo62354m(int i) {
        C20779j jVar = this.f53741o1;
        if (jVar != null) {
            jVar.mo30674f(i);
        }
        List<C20779j> list = this.f53740n1;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                C20779j jVar2 = this.f53740n1.get(i2);
                if (jVar2 != null) {
                    jVar2.mo30674f(i);
                }
            }
        }
        C20779j jVar3 = this.f53742p1;
        if (jVar3 != null) {
            jVar3.mo30674f(i);
        }
    }

    /* renamed from: n */
    public final void mo62355n(int i) {
        C20779j jVar = this.f53741o1;
        if (jVar != null) {
            jVar.mo30673e(i);
        }
        List<C20779j> list = this.f53740n1;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                C20779j jVar2 = this.f53740n1.get(i2);
                if (jVar2 != null) {
                    jVar2.mo30673e(i);
                }
            }
        }
        C20779j jVar3 = this.f53742p1;
        if (jVar3 != null) {
            jVar3.mo30673e(i);
        }
    }

    /* renamed from: o */
    public float mo62356o(float f) {
        return (float) Math.sin((double) ((f - 0.5f) * 0.47123894f));
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f53736j1 = true;
    }

    public void onDetachedFromWindow() {
        removeCallbacks(this.f53749v1);
        Scroller scroller = this.f53752x;
        if (scroller != null && !scroller.isFinished()) {
            this.f53752x.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0064  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDraw(android.graphics.Canvas r18) {
        /*
            r17 = this;
            r0 = r17
            super.onDraw(r18)
            int r1 = r0.f53698E0
            if (r1 <= 0) goto L_0x00a8
            android.graphics.drawable.Drawable r1 = r0.f53699F0
            if (r1 == 0) goto L_0x00a8
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r1 = r0.f53722b
            int r1 = r1.size()
            if (r1 <= 0) goto L_0x00a8
            androidx.viewpager.widget.a r1 = r0.f53728e
            if (r1 == 0) goto L_0x00a8
            int r1 = r17.getScrollX()
            int r2 = r17.getWidth()
            int r3 = r0.f53698E0
            float r3 = (float) r3
            float r4 = (float) r2
            float r3 = r3 / r4
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f53722b
            r6 = 0
            java.lang.Object r5 = r5.get(r6)
            androidx.viewpager.widget.ViewPager$f r5 = (androidx.viewpager.widget.ViewPager.C20775f) r5
            float r7 = r5.f53765e
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r8 = r0.f53722b
            int r8 = r8.size()
            int r9 = r5.f53762b
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r10 = r0.f53722b
            int r11 = r8 + -1
            java.lang.Object r10 = r10.get(r11)
            androidx.viewpager.widget.ViewPager$f r10 = (androidx.viewpager.widget.ViewPager.C20775f) r10
            int r10 = r10.f53762b
        L_0x0045:
            if (r9 >= r10) goto L_0x00a8
        L_0x0047:
            int r11 = r5.f53762b
            if (r9 <= r11) goto L_0x0058
            if (r6 >= r8) goto L_0x0058
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f53722b
            int r6 = r6 + 1
            java.lang.Object r5 = r5.get(r6)
            androidx.viewpager.widget.ViewPager$f r5 = (androidx.viewpager.widget.ViewPager.C20775f) r5
            goto L_0x0047
        L_0x0058:
            if (r9 != r11) goto L_0x0064
            float r7 = r5.f53765e
            float r11 = r5.f53764d
            float r12 = r7 + r11
            float r12 = r12 * r4
            float r7 = r7 + r11
            float r7 = r7 + r3
            goto L_0x006f
        L_0x0064:
            androidx.viewpager.widget.a r11 = r0.f53728e
            float r11 = r11.mo62411h(r9)
            float r12 = r7 + r11
            float r12 = r12 * r4
            float r11 = r11 + r3
            float r7 = r7 + r11
        L_0x006f:
            int r11 = r0.f53698E0
            float r11 = (float) r11
            float r11 = r11 + r12
            float r13 = (float) r1
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 <= 0) goto L_0x0097
            android.graphics.drawable.Drawable r11 = r0.f53699F0
            int r13 = java.lang.Math.round(r12)
            int r14 = r0.f53700G0
            int r15 = r0.f53698E0
            float r15 = (float) r15
            float r15 = r15 + r12
            int r15 = java.lang.Math.round(r15)
            r16 = r3
            int r3 = r0.f53701H0
            r11.setBounds(r13, r14, r15, r3)
            android.graphics.drawable.Drawable r3 = r0.f53699F0
            r11 = r18
            r3.draw(r11)
            goto L_0x009b
        L_0x0097:
            r11 = r18
            r16 = r3
        L_0x009b:
            int r3 = r1 + r2
            float r3 = (float) r3
            int r3 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r3 <= 0) goto L_0x00a3
            goto L_0x00a8
        L_0x00a3:
            int r9 = r9 + 1
            r3 = r16
            goto L_0x0045
        L_0x00a8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onDraw(android.graphics.Canvas):void");
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float f;
        MotionEvent motionEvent2 = motionEvent;
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            mo62316Q();
            return false;
        }
        if (action != 0) {
            if (this.f53710Q0) {
                return true;
            }
            if (this.f53711R0) {
                return false;
            }
        }
        if (action == 0) {
            float x = motionEvent.getX();
            this.f53717X0 = x;
            this.f53715V0 = x;
            float y = motionEvent.getY();
            this.f53718Y0 = y;
            this.f53716W0 = y;
            this.f53719Z0 = motionEvent2.getPointerId(0);
            this.f53711R0 = false;
            this.f53753y = true;
            this.f53752x.computeScrollOffset();
            if (this.f53751w1 != 2 || Math.abs(this.f53752x.getFinalX() - this.f53752x.getCurrX()) <= this.f53729e1) {
                mo62350i(false);
                this.f53710Q0 = false;
            } else {
                this.f53752x.abortAnimation();
                this.f53708O0 = false;
                mo62309J();
                this.f53710Q0 = true;
                mo62315P(true);
                setScrollState(1);
            }
        } else if (action == 2) {
            int i = this.f53719Z0;
            if (i != -1) {
                int findPointerIndex = motionEvent2.findPointerIndex(i);
                float x2 = motionEvent2.getX(findPointerIndex);
                float f2 = x2 - this.f53715V0;
                float abs = Math.abs(f2);
                float y2 = motionEvent2.getY(findPointerIndex);
                float abs2 = Math.abs(y2 - this.f53718Y0);
                int i2 = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
                if (i2 != 0 && !mo62302C(this.f53715V0, f2)) {
                    if (mo62340g(this, false, (int) f2, (int) x2, (int) y2)) {
                        this.f53715V0 = x2;
                        this.f53716W0 = y2;
                        this.f53711R0 = true;
                        return false;
                    }
                }
                int i3 = this.f53714U0;
                if (abs > ((float) i3) && abs * 0.5f > abs2) {
                    this.f53710Q0 = true;
                    mo62315P(true);
                    setScrollState(1);
                    float f3 = this.f53717X0;
                    float f4 = (float) this.f53714U0;
                    if (i2 > 0) {
                        f = f3 + f4;
                    } else {
                        f = f3 - f4;
                    }
                    this.f53715V0 = f;
                    this.f53716W0 = y2;
                    setScrollingCacheEnabled(true);
                } else if (abs2 > ((float) i3)) {
                    this.f53711R0 = true;
                }
                if (this.f53710Q0 && mo62308I(x2)) {
                    C18196h2.m82610n1(this);
                }
            }
        } else if (action == 6) {
            mo62304E(motionEvent);
        }
        if (this.f53721a1 == null) {
            this.f53721a1 = VelocityTracker.obtain();
        }
        this.f53721a1.addMovement(motionEvent2);
        return this.f53710Q0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            r18 = this;
            r0 = r18
            int r1 = r18.getChildCount()
            int r2 = r22 - r20
            int r3 = r23 - r21
            int r4 = r18.getPaddingLeft()
            int r5 = r18.getPaddingTop()
            int r6 = r18.getPaddingRight()
            int r7 = r18.getPaddingBottom()
            int r8 = r18.getScrollX()
            r10 = 0
            r11 = 0
        L_0x0020:
            r12 = 8
            if (r10 >= r1) goto L_0x00b6
            android.view.View r13 = r0.getChildAt(r10)
            int r14 = r13.getVisibility()
            if (r14 == r12) goto L_0x00b2
            android.view.ViewGroup$LayoutParams r12 = r13.getLayoutParams()
            androidx.viewpager.widget.ViewPager$g r12 = (androidx.viewpager.widget.ViewPager.C20776g) r12
            boolean r14 = r12.f53766a
            if (r14 == 0) goto L_0x00b2
            int r12 = r12.f53767b
            r14 = r12 & 7
            r12 = r12 & 112(0x70, float:1.57E-43)
            r15 = 1
            if (r14 == r15) goto L_0x005c
            r15 = 3
            if (r14 == r15) goto L_0x0056
            r15 = 5
            if (r14 == r15) goto L_0x0049
            r14 = r4
            goto L_0x006d
        L_0x0049:
            int r14 = r2 - r6
            int r15 = r13.getMeasuredWidth()
            int r14 = r14 - r15
            int r15 = r13.getMeasuredWidth()
            int r6 = r6 + r15
            goto L_0x0068
        L_0x0056:
            int r14 = r13.getMeasuredWidth()
            int r14 = r14 + r4
            goto L_0x006d
        L_0x005c:
            int r14 = r13.getMeasuredWidth()
            int r14 = r2 - r14
            int r14 = r14 / 2
            int r14 = java.lang.Math.max(r14, r4)
        L_0x0068:
            r17 = r14
            r14 = r4
            r4 = r17
        L_0x006d:
            r15 = 16
            if (r12 == r15) goto L_0x008e
            r15 = 48
            if (r12 == r15) goto L_0x0088
            r15 = 80
            if (r12 == r15) goto L_0x007b
            r12 = r5
            goto L_0x009f
        L_0x007b:
            int r12 = r3 - r7
            int r15 = r13.getMeasuredHeight()
            int r12 = r12 - r15
            int r15 = r13.getMeasuredHeight()
            int r7 = r7 + r15
            goto L_0x009a
        L_0x0088:
            int r12 = r13.getMeasuredHeight()
            int r12 = r12 + r5
            goto L_0x009f
        L_0x008e:
            int r12 = r13.getMeasuredHeight()
            int r12 = r3 - r12
            int r12 = r12 / 2
            int r12 = java.lang.Math.max(r12, r5)
        L_0x009a:
            r17 = r12
            r12 = r5
            r5 = r17
        L_0x009f:
            int r4 = r4 + r8
            int r15 = r13.getMeasuredWidth()
            int r15 = r15 + r4
            int r16 = r13.getMeasuredHeight()
            int r9 = r5 + r16
            r13.layout(r4, r5, r15, r9)
            int r11 = r11 + 1
            r5 = r12
            r4 = r14
        L_0x00b2:
            int r10 = r10 + 1
            goto L_0x0020
        L_0x00b6:
            int r2 = r2 - r4
            int r2 = r2 - r6
            r6 = 0
        L_0x00b9:
            if (r6 >= r1) goto L_0x0106
            android.view.View r8 = r0.getChildAt(r6)
            int r9 = r8.getVisibility()
            if (r9 == r12) goto L_0x0103
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            androidx.viewpager.widget.ViewPager$g r9 = (androidx.viewpager.widget.ViewPager.C20776g) r9
            boolean r10 = r9.f53766a
            if (r10 != 0) goto L_0x0103
            androidx.viewpager.widget.ViewPager$f r10 = r0.mo62386w(r8)
            if (r10 == 0) goto L_0x0103
            float r13 = (float) r2
            float r10 = r10.f53765e
            float r10 = r10 * r13
            int r10 = (int) r10
            int r10 = r10 + r4
            boolean r14 = r9.f53769d
            if (r14 == 0) goto L_0x00f6
            r14 = 0
            r9.f53769d = r14
            float r9 = r9.f53768c
            float r13 = r13 * r9
            int r9 = (int) r13
            r13 = 1073741824(0x40000000, float:2.0)
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r13)
            int r14 = r3 - r5
            int r14 = r14 - r7
            int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r13)
            r8.measure(r9, r13)
        L_0x00f6:
            int r9 = r8.getMeasuredWidth()
            int r9 = r9 + r10
            int r13 = r8.getMeasuredHeight()
            int r13 = r13 + r5
            r8.layout(r10, r5, r9, r13)
        L_0x0103:
            int r6 = r6 + 1
            goto L_0x00b9
        L_0x0106:
            r0.f53700G0 = r5
            int r3 = r3 - r7
            r0.f53701H0 = r3
            r0.f53739m1 = r11
            boolean r1 = r0.f53736j1
            if (r1 == 0) goto L_0x0118
            int r1 = r0.f53730f
            r2 = 0
            r0.mo62317R(r1, r2, r2, r2)
            goto L_0x0119
        L_0x0118:
            r2 = 0
        L_0x0119:
            r0.f53736j1 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onLayout(boolean, int, int, int, int):void");
    }

    public void onMeasure(int i, int i2) {
        C20776g gVar;
        C20776g gVar2;
        boolean z;
        int i3;
        setMeasuredDimension(View.getDefaultSize(0, i), View.getDefaultSize(0, i2));
        int measuredWidth = getMeasuredWidth();
        this.f53713T0 = Math.min(measuredWidth / 10, this.f53712S0);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i4 = 0;
        while (true) {
            boolean z2 = true;
            int i5 = 1073741824;
            if (i4 >= childCount) {
                break;
            }
            View childAt = getChildAt(i4);
            if (!(childAt.getVisibility() == 8 || (gVar2 = (C20776g) childAt.getLayoutParams()) == null || !gVar2.f53766a)) {
                int i6 = gVar2.f53767b;
                int i7 = i6 & 7;
                int i8 = i6 & 112;
                if (i8 == 48 || i8 == 80) {
                    z = true;
                } else {
                    z = false;
                }
                if (!(i7 == 3 || i7 == 5)) {
                    z2 = false;
                }
                int i9 = Integer.MIN_VALUE;
                if (z) {
                    i3 = Integer.MIN_VALUE;
                    i9 = 1073741824;
                } else if (z2) {
                    i3 = 1073741824;
                } else {
                    i3 = Integer.MIN_VALUE;
                }
                int i10 = gVar2.width;
                if (i10 != -2) {
                    if (i10 == -1) {
                        i10 = paddingLeft;
                    }
                    i9 = 1073741824;
                } else {
                    i10 = paddingLeft;
                }
                int i11 = gVar2.height;
                if (i11 == -2) {
                    i11 = measuredHeight;
                    i5 = i3;
                } else if (i11 == -1) {
                    i11 = measuredHeight;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i10, i9), View.MeasureSpec.makeMeasureSpec(i11, i5));
                if (z) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z2) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i4++;
        }
        this.f53704K0 = View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.f53705L0 = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.f53706M0 = true;
        mo62309J();
        this.f53706M0 = false;
        int childCount2 = getChildCount();
        for (int i12 = 0; i12 < childCount2; i12++) {
            View childAt2 = getChildAt(i12);
            if (childAt2.getVisibility() != 8 && ((gVar = (C20776g) childAt2.getLayoutParams()) == null || !gVar.f53766a)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (((float) paddingLeft) * gVar.f53768c), 1073741824), this.f53705L0);
            }
        }
    }

    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3;
        int i4;
        C20775f w;
        int childCount = getChildCount();
        if ((i & 2) != 0) {
            i3 = childCount;
            i4 = 0;
            i2 = 1;
        } else {
            i4 = childCount - 1;
            i3 = -1;
            i2 = -1;
        }
        while (i4 != i3) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() == 0 && (w = mo62386w(childAt)) != null && w.f53762b == this.f53730f && childAt.requestFocus(i, rect)) {
                return true;
            }
            i4 += i2;
        }
        return false;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.mo53419a());
        C20784a aVar = this.f53728e;
        if (aVar != null) {
            aVar.mo57089n(savedState.f53756d, savedState.f53757e);
            mo62318S(savedState.f53755c, false, true);
            return;
        }
        this.f53732g = savedState.f53755c;
        this.f53748v = savedState.f53756d;
        this.f53750w = savedState.f53757e;
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f53755c = this.f53730f;
        C20784a aVar = this.f53728e;
        if (aVar != null) {
            savedState.f53756d = aVar.mo57090o();
        }
        return savedState;
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            int i5 = this.f53698E0;
            mo62311L(i, i3, i5, i5);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C20784a aVar;
        float f;
        if (this.f53731f1) {
            return true;
        }
        boolean z = false;
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (aVar = this.f53728e) == null || aVar.mo21373e() == 0) {
            return false;
        }
        if (this.f53721a1 == null) {
            this.f53721a1 = VelocityTracker.obtain();
        }
        this.f53721a1.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.f53752x.abortAnimation();
            this.f53708O0 = false;
            mo62309J();
            float x = motionEvent.getX();
            this.f53717X0 = x;
            this.f53715V0 = x;
            float y = motionEvent.getY();
            this.f53718Y0 = y;
            this.f53716W0 = y;
            this.f53719Z0 = motionEvent.getPointerId(0);
        } else if (action != 1) {
            if (action == 2) {
                if (!this.f53710Q0) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.f53719Z0);
                    if (findPointerIndex == -1) {
                        z = mo62316Q();
                    } else {
                        float x2 = motionEvent.getX(findPointerIndex);
                        float abs = Math.abs(x2 - this.f53715V0);
                        float y2 = motionEvent.getY(findPointerIndex);
                        float abs2 = Math.abs(y2 - this.f53716W0);
                        if (abs > ((float) this.f53714U0) && abs > abs2) {
                            this.f53710Q0 = true;
                            mo62315P(true);
                            float f2 = this.f53717X0;
                            if (x2 - f2 > 0.0f) {
                                f = f2 + ((float) this.f53714U0);
                            } else {
                                f = f2 - ((float) this.f53714U0);
                            }
                            this.f53715V0 = f;
                            this.f53716W0 = y2;
                            setScrollState(1);
                            setScrollingCacheEnabled(true);
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                        }
                    }
                }
                if (this.f53710Q0) {
                    z = false | mo62308I(motionEvent.getX(motionEvent.findPointerIndex(this.f53719Z0)));
                }
            } else if (action != 3) {
                if (action == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    this.f53715V0 = motionEvent.getX(actionIndex);
                    this.f53719Z0 = motionEvent.getPointerId(actionIndex);
                } else if (action == 6) {
                    mo62304E(motionEvent);
                    this.f53715V0 = motionEvent.getX(motionEvent.findPointerIndex(this.f53719Z0));
                }
            } else if (this.f53710Q0) {
                mo62317R(this.f53730f, true, 0, false);
                z = mo62316Q();
            }
        } else if (this.f53710Q0) {
            VelocityTracker velocityTracker = this.f53721a1;
            velocityTracker.computeCurrentVelocity(1000, (float) this.f53725c1);
            int xVelocity = (int) velocityTracker.getXVelocity(this.f53719Z0);
            this.f53708O0 = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            C20775f x3 = mo62387x();
            float f3 = (float) clientWidth;
            mo62319T(mo62352k(x3.f53762b, ((((float) scrollX) / f3) - x3.f53765e) / (x3.f53764d + (((float) this.f53698E0) / f3)), xVelocity, (int) (motionEvent.getX(motionEvent.findPointerIndex(this.f53719Z0)) - this.f53717X0)), true, true, xVelocity);
            z = mo62316Q();
        }
        if (z) {
            C18196h2.m82610n1(this);
        }
        return true;
    }

    /* renamed from: p */
    public final void mo62366p(boolean z) {
        int i;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            if (z) {
                i = this.f53745s1;
            } else {
                i = 0;
            }
            getChildAt(i2).setLayerType(i, (Paint) null);
        }
    }

    /* renamed from: q */
    public final void mo62367q() {
        this.f53710Q0 = false;
        this.f53711R0 = false;
        VelocityTracker velocityTracker = this.f53721a1;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f53721a1 = null;
        }
    }

    /* renamed from: r */
    public void mo62368r() {
        if (this.f53731f1) {
            if (this.f53728e != null) {
                VelocityTracker velocityTracker = this.f53721a1;
                velocityTracker.computeCurrentVelocity(1000, (float) this.f53725c1);
                int xVelocity = (int) velocityTracker.getXVelocity(this.f53719Z0);
                this.f53708O0 = true;
                int clientWidth = getClientWidth();
                int scrollX = getScrollX();
                C20775f x = mo62387x();
                mo62319T(mo62352k(x.f53762b, ((((float) scrollX) / ((float) clientWidth)) - x.f53765e) / x.f53764d, xVelocity, (int) (this.f53715V0 - this.f53717X0)), true, true, xVelocity);
            }
            mo62367q();
            this.f53731f1 = false;
            return;
        }
        throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
    }

    public void removeView(View view) {
        if (this.f53706M0) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    /* renamed from: s */
    public boolean mo62370s(@C0359n0 KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 21) {
                if (keyCode != 22) {
                    if (keyCode == 61) {
                        if (keyEvent.hasNoModifiers()) {
                            return mo62333d(2);
                        }
                        if (keyEvent.hasModifiers(1)) {
                            return mo62333d(1);
                        }
                    }
                } else if (keyEvent.hasModifiers(2)) {
                    return mo62306G();
                } else {
                    return mo62333d(66);
                }
            } else if (keyEvent.hasModifiers(2)) {
                return mo62305F();
            } else {
                return mo62333d(17);
            }
        }
        return false;
    }

    public void setAdapter(@C0363p0 C20784a aVar) {
        C20784a aVar2 = this.f53728e;
        if (aVar2 != null) {
            aVar2.mo62416r((DataSetObserver) null);
            this.f53728e.mo57092t(this);
            for (int i = 0; i < this.f53722b.size(); i++) {
                C20775f fVar = this.f53722b.get(i);
                this.f53728e.mo21372b(this, fVar.f53762b, fVar.f53761a);
            }
            this.f53728e.mo57088d(this);
            this.f53722b.clear();
            mo62312M();
            this.f53730f = 0;
            scrollTo(0, 0);
        }
        C20784a aVar3 = this.f53728e;
        this.f53728e = aVar;
        this.f53720a = 0;
        if (aVar != null) {
            if (this.f53754z == null) {
                this.f53754z = new C20781l();
            }
            this.f53728e.mo62416r(this.f53754z);
            this.f53708O0 = false;
            boolean z = this.f53736j1;
            this.f53736j1 = true;
            this.f53720a = this.f53728e.mo21373e();
            if (this.f53732g >= 0) {
                this.f53728e.mo57089n(this.f53748v, this.f53750w);
                mo62318S(this.f53732g, false, true);
                this.f53732g = -1;
                this.f53748v = null;
                this.f53750w = null;
            } else if (!z) {
                mo62309J();
            } else {
                requestLayout();
            }
        }
        List<C20778i> list = this.f53743q1;
        if (list != null && !list.isEmpty()) {
            int size = this.f53743q1.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.f53743q1.get(i2).mo62298a(this, aVar3, aVar);
            }
        }
    }

    public void setCurrentItem(int i) {
        this.f53708O0 = false;
        mo62318S(i, !this.f53736j1, false);
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1) {
            StringBuilder sb = new StringBuilder();
            sb.append("Requested offscreen page limit ");
            sb.append(i);
            sb.append(" too small; defaulting to ");
            sb.append(1);
            i = 1;
        }
        if (i != this.f53709P0) {
            this.f53709P0 = i;
            mo62309J();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(C20779j jVar) {
        this.f53741o1 = jVar;
    }

    public void setPageMargin(int i) {
        int i2 = this.f53698E0;
        this.f53698E0 = i;
        int width = getWidth();
        mo62311L(width, width, i, i2);
        requestLayout();
    }

    public void setPageMarginDrawable(@C0363p0 Drawable drawable) {
        this.f53699F0 = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setPageTransformer(boolean z, @C0363p0 C20780k kVar) {
        setPageTransformer(z, kVar, 2);
    }

    public void setScrollState(int i) {
        boolean z;
        if (this.f53751w1 != i) {
            this.f53751w1 = i;
            if (this.f53744r1 != null) {
                if (i != 0) {
                    z = true;
                } else {
                    z = false;
                }
                mo62366p(z);
            }
            mo62355n(i);
        }
    }

    /* renamed from: t */
    public void mo62382t(float f) {
        if (!this.f53731f1) {
            throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        } else if (this.f53728e != null) {
            this.f53715V0 += f;
            float scrollX = ((float) getScrollX()) - f;
            float clientWidth = (float) getClientWidth();
            float f2 = this.f53702I0 * clientWidth;
            float f3 = this.f53703J0 * clientWidth;
            C20775f fVar = this.f53722b.get(0);
            ArrayList<C20775f> arrayList = this.f53722b;
            C20775f fVar2 = arrayList.get(arrayList.size() - 1);
            if (fVar.f53762b != 0) {
                f2 = fVar.f53765e * clientWidth;
            }
            if (fVar2.f53762b != this.f53728e.mo21373e() - 1) {
                f3 = fVar2.f53765e * clientWidth;
            }
            if (scrollX < f2) {
                scrollX = f2;
            } else if (scrollX > f3) {
                scrollX = f3;
            }
            int i = (int) scrollX;
            this.f53715V0 += scrollX - ((float) i);
            scrollTo(i, getScrollY());
            mo62307H(i);
            MotionEvent obtain = MotionEvent.obtain(this.f53733g1, SystemClock.uptimeMillis(), 2, this.f53715V0, 0.0f, 0);
            this.f53721a1.addMovement(obtain);
            obtain.recycle();
        }
    }

    /* renamed from: u */
    public final Rect mo62383u(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    /* renamed from: v */
    public C20775f mo62384v(View view) {
        while (true) {
            ViewParent parent = view.getParent();
            if (parent == this) {
                return mo62386w(view);
            }
            if (parent == null || !(parent instanceof View)) {
                return null;
            }
            view = (View) parent;
        }
    }

    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f53699F0;
    }

    /* renamed from: w */
    public C20775f mo62386w(View view) {
        for (int i = 0; i < this.f53722b.size(); i++) {
            C20775f fVar = this.f53722b.get(i);
            if (this.f53728e.mo21375k(view, fVar.f53761a)) {
                return fVar;
            }
        }
        return null;
    }

    /* renamed from: x */
    public final C20775f mo62387x() {
        float f;
        float f2;
        int i;
        int clientWidth = getClientWidth();
        float f3 = 0.0f;
        if (clientWidth > 0) {
            f = ((float) getScrollX()) / ((float) clientWidth);
        } else {
            f = 0.0f;
        }
        if (clientWidth > 0) {
            f2 = ((float) this.f53698E0) / ((float) clientWidth);
        } else {
            f2 = 0.0f;
        }
        int i2 = 0;
        boolean z = true;
        C20775f fVar = null;
        int i3 = -1;
        float f4 = 0.0f;
        while (i2 < this.f53722b.size()) {
            C20775f fVar2 = this.f53722b.get(i2);
            if (!z && fVar2.f53762b != (i = i3 + 1)) {
                fVar2 = this.f53724c;
                fVar2.f53765e = f3 + f4 + f2;
                fVar2.f53762b = i;
                fVar2.f53764d = this.f53728e.mo62411h(i);
                i2--;
            }
            C20775f fVar3 = fVar2;
            f3 = fVar3.f53765e;
            float f5 = fVar3.f53764d + f3 + f2;
            if (!z && f < f3) {
                return fVar;
            }
            if (f < f5 || i2 == this.f53722b.size() - 1) {
                return fVar3;
            }
            int i4 = fVar3.f53762b;
            float f6 = fVar3.f53764d;
            i2++;
            z = false;
            C20775f fVar4 = fVar3;
            i3 = i4;
            f4 = f6;
            fVar = fVar4;
        }
        return fVar;
    }

    /* renamed from: y */
    public C20775f mo62388y(int i) {
        for (int i2 = 0; i2 < this.f53722b.size(); i2++) {
            C20775f fVar = this.f53722b.get(i2);
            if (fVar.f53762b == i) {
                return fVar;
            }
        }
        return null;
    }

    /* renamed from: z */
    public void mo62389z() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.f53752x = new Scroller(context, f53685H1);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.f53714U0 = viewConfiguration.getScaledPagingTouchSlop();
        this.f53723b1 = (int) (400.0f * f);
        this.f53725c1 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f53734h1 = new EdgeEffect(context);
        this.f53735i1 = new EdgeEffect(context);
        this.f53727d1 = (int) (25.0f * f);
        this.f53729e1 = (int) (2.0f * f);
        this.f53712S0 = (int) (f * 16.0f);
        C18196h2.m82474B1(this, new C20777h());
        if (C18196h2.m82541V(this) == 0) {
            C18196h2.m82531R1(this, 1);
        }
        C18196h2.m82559a2(this, new C20773d());
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$g */
    public static class C20776g extends ViewGroup.LayoutParams {

        /* renamed from: a */
        public boolean f53766a;

        /* renamed from: b */
        public int f53767b;

        /* renamed from: c */
        public float f53768c = 0.0f;

        /* renamed from: d */
        public boolean f53769d;

        /* renamed from: e */
        public int f53770e;

        /* renamed from: f */
        public int f53771f;

        public C20776g() {
            super(-1, -1);
        }

        public C20776g(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.f53683F1);
            this.f53767b = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C20776g(getContext(), attributeSet);
    }

    public void setPageTransformer(boolean z, @C0363p0 C20780k kVar, int i) {
        int i2 = 1;
        boolean z2 = kVar != null;
        boolean z3 = z2 != (this.f53744r1 != null);
        this.f53744r1 = kVar;
        setChildrenDrawingOrderEnabled(z2);
        if (z2) {
            if (z) {
                i2 = 2;
            }
            this.f53746t1 = i2;
            this.f53745s1 = i;
        } else {
            this.f53746t1 = 0;
        }
        if (z3) {
            mo62309J();
        }
    }

    public void setCurrentItem(int i, boolean z) {
        this.f53708O0 = false;
        mo62318S(i, z, false);
    }

    public void setPageMarginDrawable(@C0375v int i) {
        setPageMarginDrawable(C17318d.m79726i(getContext(), i));
    }

    public ViewPager(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet) {
        super(context, attributeSet);
        mo62389z();
    }
}
