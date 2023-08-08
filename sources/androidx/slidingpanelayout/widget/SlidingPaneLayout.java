package androidx.slidingpanelayout.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import androidx.annotation.C0354l;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0372t0;
import androidx.annotation.C0375v;
import androidx.core.content.C17318d;
import androidx.core.graphics.C17616m0;
import androidx.core.view.C18019a;
import androidx.core.view.C18196h2;
import androidx.core.view.C18436z4;
import androidx.core.view.accessibility.C18065l0;
import androidx.core.view.animation.C18117b;
import androidx.customview.view.AbsSavedState;
import androidx.customview.widget.C18552c;
import androidx.customview.widget.C18553d;
import androidx.slidingpanelayout.widget.FoldingFeatureObserver;
import androidx.transition.C20560e;
import androidx.transition.C20629k0;
import androidx.window.layout.C21052l;
import androidx.window.layout.C21069q;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SlidingPaneLayout extends ViewGroup implements C18552c {

    /* renamed from: T0 */
    public static final String f52704T0 = "SlidingPaneLayout";

    /* renamed from: U0 */
    public static final int f52705U0 = 400;

    /* renamed from: V0 */
    public static final String f52706V0 = "androidx.slidingpanelayout.widget.SlidingPaneLayout";

    /* renamed from: W0 */
    public static final int f52707W0 = 0;

    /* renamed from: X0 */
    public static final int f52708X0 = 1;

    /* renamed from: Y0 */
    public static final int f52709Y0 = 2;

    /* renamed from: Z0 */
    public static final int f52710Z0 = 3;

    /* renamed from: a1 */
    public static boolean f52711a1 = (Build.VERSION.SDK_INT >= 29);

    /* renamed from: E0 */
    public float f52712E0;

    /* renamed from: F0 */
    public final List<C20452f> f52713F0;
    @C0363p0

    /* renamed from: G0 */
    public C20452f f52714G0;

    /* renamed from: H0 */
    public final C18553d f52715H0;

    /* renamed from: I0 */
    public boolean f52716I0;

    /* renamed from: J0 */
    public boolean f52717J0;

    /* renamed from: K0 */
    public final Rect f52718K0;

    /* renamed from: L0 */
    public final ArrayList<C20449c> f52719L0;

    /* renamed from: M0 */
    public int f52720M0;

    /* renamed from: N0 */
    public C21052l f52721N0;

    /* renamed from: O0 */
    public FoldingFeatureObserver.C20441a f52722O0;

    /* renamed from: P0 */
    public FoldingFeatureObserver f52723P0;

    /* renamed from: Q0 */
    public Method f52724Q0;

    /* renamed from: R0 */
    public Field f52725R0;

    /* renamed from: S0 */
    public boolean f52726S0;

    /* renamed from: a */
    public int f52727a;

    /* renamed from: b */
    public int f52728b;

    /* renamed from: c */
    public Drawable f52729c;

    /* renamed from: d */
    public Drawable f52730d;

    /* renamed from: e */
    public boolean f52731e;

    /* renamed from: f */
    public View f52732f;

    /* renamed from: g */
    public float f52733g;

    /* renamed from: v */
    public float f52734v;

    /* renamed from: w */
    public int f52735w;

    /* renamed from: x */
    public boolean f52736x;

    /* renamed from: y */
    public int f52737y;

    /* renamed from: z */
    public float f52738z;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C20446a();

        /* renamed from: c */
        public boolean f52739c;

        /* renamed from: d */
        public int f52740d;

        /* renamed from: androidx.slidingpanelayout.widget.SlidingPaneLayout$SavedState$a */
        public class C20446a implements Parcelable.ClassLoaderCreator<SavedState> {
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, (ClassLoader) null);
            }

            /* renamed from: c */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f52739c ? 1 : 0);
            parcel.writeInt(this.f52740d);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f52739c = parcel.readInt() != 0;
            this.f52740d = parcel.readInt();
        }
    }

    /* renamed from: androidx.slidingpanelayout.widget.SlidingPaneLayout$a */
    public class C20447a implements FoldingFeatureObserver.C20441a {
        public C20447a() {
        }

        /* renamed from: a */
        public void mo61304a(@C0359n0 C21052l lVar) {
            SlidingPaneLayout.this.f52721N0 = lVar;
            C20560e eVar = new C20560e();
            eVar.mo61718L0(300);
            eVar.mo61722O0(C18117b.m82265b(0.2f, 0.0f, 0.0f, 1.0f));
            C20629k0.m95932b(SlidingPaneLayout.this, eVar);
            SlidingPaneLayout.this.requestLayout();
        }
    }

    /* renamed from: androidx.slidingpanelayout.widget.SlidingPaneLayout$b */
    public class C20448b extends C18019a {

        /* renamed from: d */
        public final Rect f52742d = new Rect();

        public C20448b() {
        }

        /* renamed from: f */
        public void mo52492f(View view, AccessibilityEvent accessibilityEvent) {
            super.mo52492f(view, accessibilityEvent);
            accessibilityEvent.setClassName(SlidingPaneLayout.f52706V0);
        }

        /* renamed from: g */
        public void mo19938g(View view, C18065l0 l0Var) {
            C18065l0 I0 = C18065l0.m81935I0(l0Var);
            super.mo19938g(view, I0);
            mo61369n(l0Var, I0);
            I0.mo52550L0();
            l0Var.mo52592Z0(SlidingPaneLayout.f52706V0);
            l0Var.mo52551L1(view);
            ViewParent l0 = C18196h2.m82601l0(view);
            if (l0 instanceof View) {
                l0Var.mo52528C1((View) l0);
            }
            int childCount = SlidingPaneLayout.this.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = SlidingPaneLayout.this.getChildAt(i);
                if (!mo61370o(childAt) && childAt.getVisibility() == 0) {
                    C18196h2.m82531R1(childAt, 1);
                    l0Var.mo52602c(childAt);
                }
            }
        }

        /* renamed from: i */
        public boolean mo52494i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (!mo61370o(view)) {
                return super.mo52494i(viewGroup, view, accessibilityEvent);
            }
            return false;
        }

        /* renamed from: n */
        public final void mo61369n(C18065l0 l0Var, C18065l0 l0Var2) {
            Rect rect = this.f52742d;
            l0Var2.mo52654t(rect);
            l0Var.mo52580V0(rect);
            l0Var.mo52597a2(l0Var2.mo52533E0());
            l0Var.mo52522A1(l0Var2.mo52558O());
            l0Var.mo52592Z0(l0Var2.mo52664w());
            l0Var.mo52607d1(l0Var2.mo52520A());
            l0Var.mo52627j1(l0Var2.mo52646q0());
            l0Var.mo52596a1(l0Var2.mo52632l0());
            l0Var.mo52633l1(l0Var2.mo52649r0());
            l0Var.mo52636m1(l0Var2.mo52652s0());
            l0Var.mo52568R0(l0Var2.mo52623i0());
            l0Var.mo52545J1(l0Var2.mo52521A0());
            l0Var.mo52666w1(l0Var2.mo52662v0());
            l0Var.mo52594a(l0Var2.mo52642p());
            l0Var.mo52671y1(l0Var2.mo52552M());
        }

        /* renamed from: o */
        public boolean mo61370o(View view) {
            return SlidingPaneLayout.this.mo61328m(view);
        }
    }

    /* renamed from: androidx.slidingpanelayout.widget.SlidingPaneLayout$c */
    public class C20449c implements Runnable {

        /* renamed from: a */
        public final View f52744a;

        public C20449c(View view) {
            this.f52744a = view;
        }

        public void run() {
            if (this.f52744a.getParent() == SlidingPaneLayout.this) {
                this.f52744a.setLayerType(0, (Paint) null);
                SlidingPaneLayout.this.mo61327l(this.f52744a);
            }
            SlidingPaneLayout.this.f52719L0.remove(this);
        }
    }

    /* renamed from: androidx.slidingpanelayout.widget.SlidingPaneLayout$d */
    public class C20450d extends C18553d.C18556c {
        public C20450d() {
        }

        /* renamed from: a */
        public int mo18293a(View view, int i, int i2) {
            C20451e eVar = (C20451e) SlidingPaneLayout.this.f52732f.getLayoutParams();
            if (SlidingPaneLayout.this.mo61329n()) {
                int width = SlidingPaneLayout.this.getWidth() - ((SlidingPaneLayout.this.getPaddingRight() + eVar.rightMargin) + SlidingPaneLayout.this.f52732f.getWidth());
                return Math.max(Math.min(i, width), width - SlidingPaneLayout.this.f52735w);
            }
            int paddingLeft = SlidingPaneLayout.this.getPaddingLeft() + eVar.leftMargin;
            return Math.min(Math.max(i, paddingLeft), SlidingPaneLayout.this.f52735w + paddingLeft);
        }

        /* renamed from: b */
        public int mo18294b(View view, int i, int i2) {
            return view.getTop();
        }

        /* renamed from: d */
        public int mo53526d(View view) {
            return SlidingPaneLayout.this.f52735w;
        }

        /* renamed from: f */
        public void mo53528f(int i, int i2) {
            if (mo61372n()) {
                SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
                slidingPaneLayout.f52715H0.mo53502d(slidingPaneLayout.f52732f, i2);
            }
        }

        /* renamed from: h */
        public void mo53530h(int i, int i2) {
            if (mo61372n()) {
                SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
                slidingPaneLayout.f52715H0.mo53502d(slidingPaneLayout.f52732f, i2);
            }
        }

        /* renamed from: i */
        public void mo18295i(View view, int i) {
            SlidingPaneLayout.this.mo61358v();
        }

        /* renamed from: j */
        public void mo18296j(int i) {
            if (SlidingPaneLayout.this.f52715H0.mo53479F() == 0) {
                SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
                if (slidingPaneLayout.f52733g == 1.0f) {
                    slidingPaneLayout.mo61306A(slidingPaneLayout.f52732f);
                    SlidingPaneLayout slidingPaneLayout2 = SlidingPaneLayout.this;
                    slidingPaneLayout2.mo61317f(slidingPaneLayout2.f52732f);
                    SlidingPaneLayout.this.f52716I0 = false;
                    return;
                }
                slidingPaneLayout.mo61318g(slidingPaneLayout.f52732f);
                SlidingPaneLayout.this.f52716I0 = true;
            }
        }

        /* renamed from: k */
        public void mo18297k(View view, int i, int i2, int i3, int i4) {
            SlidingPaneLayout.this.mo61340q(i);
            SlidingPaneLayout.this.invalidate();
        }

        /* renamed from: l */
        public void mo18298l(View view, float f, float f2) {
            int i;
            C20451e eVar = (C20451e) view.getLayoutParams();
            if (SlidingPaneLayout.this.mo61329n()) {
                int paddingRight = SlidingPaneLayout.this.getPaddingRight() + eVar.rightMargin;
                if (f < 0.0f || (f == 0.0f && SlidingPaneLayout.this.f52733g > 0.5f)) {
                    paddingRight += SlidingPaneLayout.this.f52735w;
                }
                i = (SlidingPaneLayout.this.getWidth() - paddingRight) - SlidingPaneLayout.this.f52732f.getWidth();
            } else {
                i = eVar.leftMargin + SlidingPaneLayout.this.getPaddingLeft();
                int i2 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
                if (i2 > 0 || (i2 == 0 && SlidingPaneLayout.this.f52733g > 0.5f)) {
                    i += SlidingPaneLayout.this.f52735w;
                }
            }
            SlidingPaneLayout.this.f52715H0.mo53495V(i, view.getTop());
            SlidingPaneLayout.this.invalidate();
        }

        /* renamed from: m */
        public boolean mo18299m(View view, int i) {
            if (!mo61372n()) {
                return false;
            }
            return ((C20451e) view.getLayoutParams()).f52749b;
        }

        /* renamed from: n */
        public final boolean mo61372n() {
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            if (slidingPaneLayout.f52736x || slidingPaneLayout.getLockMode() == 3) {
                return false;
            }
            if (SlidingPaneLayout.this.isOpen() && SlidingPaneLayout.this.getLockMode() == 1) {
                return false;
            }
            if (SlidingPaneLayout.this.isOpen() || SlidingPaneLayout.this.getLockMode() != 2) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: androidx.slidingpanelayout.widget.SlidingPaneLayout$f */
    public interface C20452f {
        /* renamed from: a */
        void mo58409a(@C0359n0 View view);

        /* renamed from: b */
        void mo58410b(@C0359n0 View view);

        /* renamed from: c */
        void mo58411c(@C0359n0 View view, float f);
    }

    /* renamed from: androidx.slidingpanelayout.widget.SlidingPaneLayout$g */
    public static class C20453g implements C20452f {
        /* renamed from: a */
        public void mo58409a(@C0359n0 View view) {
        }

        /* renamed from: b */
        public void mo58410b(@C0359n0 View view) {
        }

        /* renamed from: c */
        public void mo58411c(@C0359n0 View view, float f) {
        }
    }

    /* renamed from: androidx.slidingpanelayout.widget.SlidingPaneLayout$h */
    public static class C20454h extends FrameLayout {
        public C20454h(View view) {
            super(view.getContext());
            addView(view);
        }

        public boolean onGenericMotionEvent(MotionEvent motionEvent) {
            return true;
        }

        public boolean onTouchEvent(MotionEvent motionEvent) {
            return true;
        }
    }

    public SlidingPaneLayout(@C0359n0 Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: B */
    public static boolean m95286B(View view) {
        return view.isOpaque();
    }

    private C17616m0 getSystemGestureInsets() {
        C18436z4 o0;
        if (!f52711a1 || (o0 = C18196h2.m82613o0(this)) == null) {
            return null;
        }
        return o0.mo53145n();
    }

    @C0363p0
    /* renamed from: i */
    public static Activity m95287i(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    /* renamed from: j */
    public static Rect m95288j(@C0359n0 C21052l lVar, View view) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i = iArr[0];
        Rect rect = new Rect(i, iArr[1], view.getWidth() + i, iArr[1] + view.getWidth());
        Rect rect2 = new Rect(lVar.getBounds());
        boolean intersect = rect2.intersect(rect);
        if ((rect2.width() == 0 && rect2.height() == 0) || !intersect) {
            return null;
        }
        rect2.offset(-iArr[0], -iArr[1]);
        return rect2;
    }

    /* renamed from: k */
    public static int m95289k(View view) {
        if (view instanceof C20454h) {
            return C18196h2.m82577f0(((C20454h) view).getChildAt(0));
        }
        return C18196h2.m82577f0(view);
    }

    /* renamed from: p */
    public static int m95290p(@C0359n0 View view, int i, int i2) {
        boolean z;
        C20451e eVar = (C20451e) view.getLayoutParams();
        if (eVar.width != 0 || eVar.f52748a <= 0.0f) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return ViewGroup.getChildMeasureSpec(i, i2, eVar.height);
        }
        return View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), 1073741824);
    }

    private void setFoldingFeatureObserver(FoldingFeatureObserver foldingFeatureObserver) {
        this.f52723P0 = foldingFeatureObserver;
        foldingFeatureObserver.mo61302f(this.f52722O0);
    }

    /* renamed from: A */
    public void mo61306A(View view) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        View childAt;
        boolean z;
        int i7;
        int i8;
        int i9;
        View view2 = view;
        boolean n = mo61329n();
        if (n) {
            i = getWidth() - getPaddingRight();
        } else {
            i = getPaddingLeft();
        }
        if (n) {
            i2 = getPaddingLeft();
        } else {
            i2 = getWidth() - getPaddingRight();
        }
        int paddingTop = getPaddingTop();
        int height = getHeight() - getPaddingBottom();
        if (view2 == null || !m95286B(view)) {
            i6 = 0;
            i5 = 0;
            i4 = 0;
            i3 = 0;
        } else {
            i6 = view.getLeft();
            i5 = view.getRight();
            i4 = view.getTop();
            i3 = view.getBottom();
        }
        int childCount = getChildCount();
        int i10 = 0;
        while (true) {
            if (i10 < childCount && (childAt = getChildAt(i10)) != view2) {
                if (childAt.getVisibility() == 8) {
                    z = n;
                } else {
                    if (n) {
                        i7 = i2;
                    } else {
                        i7 = i;
                    }
                    int max = Math.max(i7, childAt.getLeft());
                    int max2 = Math.max(paddingTop, childAt.getTop());
                    z = n;
                    if (n) {
                        i8 = i;
                    } else {
                        i8 = i2;
                    }
                    int min = Math.min(i8, childAt.getRight());
                    int min2 = Math.min(height, childAt.getBottom());
                    if (max < i6 || max2 < i4 || min > i5 || min2 > i3) {
                        i9 = 0;
                    } else {
                        i9 = 4;
                    }
                    childAt.setVisibility(i9);
                }
                i10++;
                view2 = view;
                n = z;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public void mo61307a(@C0359n0 C20452f fVar) {
        this.f52713F0.add(fVar);
    }

    public void addView(@C0359n0 View view, int i, @C0363p0 ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() == 1) {
            super.addView(new C20454h(view), i, layoutParams);
        } else {
            super.addView(view, i, layoutParams);
        }
    }

    /* renamed from: b */
    public boolean mo61309b(View view, boolean z, int i, int i2, int i3) {
        int i4;
        int i5;
        View view2 = view;
        if (view2 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view2;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i6 = i2 + scrollX;
                if (i6 >= childAt.getLeft() && i6 < childAt.getRight() && (i5 = i3 + scrollY) >= childAt.getTop() && i5 < childAt.getBottom()) {
                    if (mo61309b(childAt, true, i, i6 - childAt.getLeft(), i5 - childAt.getTop())) {
                        return true;
                    }
                }
            }
        }
        if (z) {
            if (mo61329n()) {
                i4 = i;
            } else {
                i4 = -i;
            }
            if (view.canScrollHorizontally(i4)) {
                return true;
            }
        }
        return false;
    }

    @Deprecated
    /* renamed from: c */
    public boolean mo61310c() {
        return this.f52731e;
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C20451e) && super.checkLayoutParams(layoutParams);
    }

    public void close() {
        mo61313d();
    }

    public void computeScroll() {
        if (!this.f52715H0.mo53513o(true)) {
            return;
        }
        if (!this.f52731e) {
            this.f52715H0.mo53499a();
        } else {
            C18196h2.m82610n1(this);
        }
    }

    /* renamed from: d */
    public boolean mo61313d() {
        return mo61316e(0);
    }

    public void draw(Canvas canvas) {
        Drawable drawable;
        View view;
        int i;
        int i2;
        super.draw(canvas);
        if (mo61329n()) {
            drawable = this.f52730d;
        } else {
            drawable = this.f52729c;
        }
        if (getChildCount() > 1) {
            view = getChildAt(1);
        } else {
            view = null;
        }
        if (view != null && drawable != null) {
            int top = view.getTop();
            int bottom = view.getBottom();
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (mo61329n()) {
                i2 = view.getRight();
                i = intrinsicWidth + i2;
            } else {
                int left = view.getLeft();
                int i3 = left - intrinsicWidth;
                i = left;
                i2 = i3;
            }
            drawable.setBounds(i2, top, i, bottom);
            drawable.draw(canvas);
        }
    }

    public boolean drawChild(Canvas canvas, View view, long j) {
        if (mo61329n() ^ isOpen()) {
            this.f52715H0.mo53493T(1);
            C17616m0 systemGestureInsets = getSystemGestureInsets();
            if (systemGestureInsets != null) {
                C18553d dVar = this.f52715H0;
                dVar.mo53492S(Math.max(dVar.mo53474A(), systemGestureInsets.f45995a));
            }
        } else {
            this.f52715H0.mo53493T(2);
            C17616m0 systemGestureInsets2 = getSystemGestureInsets();
            if (systemGestureInsets2 != null) {
                C18553d dVar2 = this.f52715H0;
                dVar2.mo53492S(Math.max(dVar2.mo53474A(), systemGestureInsets2.f45997c));
            }
        }
        C20451e eVar = (C20451e) view.getLayoutParams();
        int save = canvas.save();
        if (this.f52731e && !eVar.f52749b && this.f52732f != null) {
            canvas.getClipBounds(this.f52718K0);
            if (mo61329n()) {
                Rect rect = this.f52718K0;
                rect.left = Math.max(rect.left, this.f52732f.getRight());
            } else {
                Rect rect2 = this.f52718K0;
                rect2.right = Math.min(rect2.right, this.f52732f.getLeft());
            }
            canvas.clipRect(this.f52718K0);
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(save);
        return drawChild;
    }

    /* renamed from: e */
    public final boolean mo61316e(int i) {
        if (!this.f52731e) {
            this.f52716I0 = false;
        }
        if (!this.f52717J0 && !mo61361y(1.0f, i)) {
            return false;
        }
        this.f52716I0 = false;
        return true;
    }

    /* renamed from: f */
    public void mo61317f(@C0359n0 View view) {
        for (C20452f b : this.f52713F0) {
            b.mo58410b(view);
        }
        sendAccessibilityEvent(32);
    }

    /* renamed from: g */
    public void mo61318g(@C0359n0 View view) {
        for (C20452f a : this.f52713F0) {
            a.mo58409a(view);
        }
        sendAccessibilityEvent(32);
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C20451e();
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C20451e((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C20451e(layoutParams);
    }

    @C0354l
    @Deprecated
    public int getCoveredFadeColor() {
        return this.f52728b;
    }

    public final int getLockMode() {
        return this.f52720M0;
    }

    @C0372t0
    public int getParallaxDistance() {
        return this.f52737y;
    }

    @C0354l
    @Deprecated
    public int getSliderFadeColor() {
        return this.f52727a;
    }

    /* renamed from: h */
    public void mo61326h(@C0359n0 View view) {
        for (C20452f c : this.f52713F0) {
            c.mo58411c(view, this.f52733g);
        }
    }

    public boolean isOpen() {
        return !this.f52731e || this.f52733g == 0.0f;
    }

    /* renamed from: l */
    public void mo61327l(View view) {
        C18196h2.m82543V1(view, ((C20451e) view.getLayoutParams()).f52751d);
    }

    /* renamed from: m */
    public boolean mo61328m(View view) {
        if (view == null) {
            return false;
        }
        C20451e eVar = (C20451e) view.getLayoutParams();
        if (!this.f52731e || !eVar.f52750c || this.f52733g <= 0.0f) {
            return false;
        }
        return true;
    }

    /* renamed from: n */
    public boolean mo61329n() {
        return C18196h2.m82553Z(this) == 1;
    }

    /* renamed from: o */
    public boolean mo61330o() {
        return this.f52731e;
    }

    public void onAttachedToWindow() {
        Activity i;
        super.onAttachedToWindow();
        this.f52717J0 = true;
        if (this.f52723P0 != null && (i = m95287i(getContext())) != null) {
            this.f52723P0.mo61301e(i);
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f52717J0 = true;
        FoldingFeatureObserver foldingFeatureObserver = this.f52723P0;
        if (foldingFeatureObserver != null) {
            foldingFeatureObserver.mo61303g();
        }
        int size = this.f52719L0.size();
        for (int i = 0; i < size; i++) {
            this.f52719L0.get(i).run();
        }
        this.f52719L0.clear();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        View childAt;
        int actionMasked = motionEvent.getActionMasked();
        if (!this.f52731e && actionMasked == 0 && getChildCount() > 1 && (childAt = getChildAt(1)) != null) {
            this.f52716I0 = this.f52715H0.mo53485L(childAt, (int) motionEvent.getX(), (int) motionEvent.getY());
        }
        if (!this.f52731e || (this.f52736x && actionMasked != 0)) {
            this.f52715H0.mo53501c();
            return super.onInterceptTouchEvent(motionEvent);
        } else if (actionMasked == 3 || actionMasked == 1) {
            this.f52715H0.mo53501c();
            return false;
        } else {
            if (actionMasked == 0) {
                this.f52736x = false;
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                this.f52738z = x;
                this.f52712E0 = y;
                if (this.f52715H0.mo53485L(this.f52732f, (int) x, (int) y) && mo61328m(this.f52732f)) {
                    z = true;
                    if (this.f52715H0.mo53496W(motionEvent) && !z) {
                        return false;
                    }
                }
            } else if (actionMasked == 2) {
                float x2 = motionEvent.getX();
                float y2 = motionEvent.getY();
                float abs = Math.abs(x2 - this.f52738z);
                float abs2 = Math.abs(y2 - this.f52712E0);
                if (abs > ((float) this.f52715H0.mo53478E()) && abs2 > abs) {
                    this.f52715H0.mo53501c();
                    this.f52736x = true;
                    return false;
                }
            }
            z = false;
            return this.f52715H0.mo53496W(motionEvent) ? true : true;
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z2;
        float f;
        boolean n = mo61329n();
        int i14 = i3 - i;
        if (n) {
            i5 = getPaddingRight();
        } else {
            i5 = getPaddingLeft();
        }
        if (n) {
            i6 = getPaddingLeft();
        } else {
            i6 = getPaddingRight();
        }
        int paddingTop = getPaddingTop();
        int childCount = getChildCount();
        if (this.f52717J0) {
            if (!this.f52731e || !this.f52716I0) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            this.f52733g = f;
        }
        int i15 = i5;
        int i16 = 0;
        while (i16 < childCount) {
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() == 8) {
                i7 = i15;
            } else {
                C20451e eVar = (C20451e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                if (eVar.f52749b) {
                    int i17 = i14 - i6;
                    int min = (Math.min(i5, i17) - i15) - (eVar.leftMargin + eVar.rightMargin);
                    this.f52735w = min;
                    if (n) {
                        i13 = eVar.rightMargin;
                    } else {
                        i13 = eVar.leftMargin;
                    }
                    if (i15 + i13 + min + (measuredWidth / 2) > i17) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    eVar.f52750c = z2;
                    int i18 = (int) (((float) min) * this.f52733g);
                    this.f52733g = ((float) i18) / ((float) min);
                    i7 = i15 + i13 + i18;
                    i8 = 0;
                } else if (!this.f52731e || (i12 = this.f52737y) == 0) {
                    i7 = i5;
                    i8 = 0;
                } else {
                    i8 = (int) ((1.0f - this.f52733g) * ((float) i12));
                    i7 = i5;
                }
                if (n) {
                    i9 = (i14 - i7) + i8;
                    i10 = i9 - measuredWidth;
                } else {
                    i10 = i7 - i8;
                    i9 = i10 + measuredWidth;
                }
                childAt.layout(i10, paddingTop, i9, childAt.getMeasuredHeight() + paddingTop);
                C21052l lVar = this.f52721N0;
                if (lVar == null || lVar.mo62982a() != C21052l.C21055b.f54290c || !this.f52721N0.mo62983b()) {
                    i11 = 0;
                } else {
                    i11 = this.f52721N0.getBounds().width();
                }
                i5 += childAt.getWidth() + Math.abs(i11);
            }
            i16++;
            i15 = i7;
        }
        if (this.f52717J0) {
            if (this.f52731e && this.f52737y != 0) {
                mo61356t(this.f52733g);
            }
            mo61306A(this.f52732f);
        }
        this.f52717J0 = false;
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        boolean z;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z2;
        int i10;
        int i11 = i2;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        boolean z3 = false;
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 != 1073741824) {
                i4 = 0;
            } else {
                i4 = (size2 - getPaddingTop()) - getPaddingBottom();
            }
            i3 = i4;
        } else {
            i3 = (size2 - getPaddingTop()) - getPaddingBottom();
            i4 = 0;
        }
        int max = Math.max((size - getPaddingLeft()) - getPaddingRight(), 0);
        int childCount = getChildCount();
        this.f52732f = null;
        int i12 = 0;
        boolean z4 = false;
        int i13 = max;
        float f = 0.0f;
        while (true) {
            i5 = 8;
            if (i12 >= childCount) {
                break;
            }
            View childAt = getChildAt(i12);
            C20451e eVar = (C20451e) childAt.getLayoutParams();
            int i14 = size;
            if (childAt.getVisibility() == 8) {
                eVar.f52750c = z3;
            } else {
                float f2 = eVar.f52748a;
                if (f2 > 0.0f) {
                    f += f2;
                    if (eVar.width == 0) {
                    }
                }
                int max2 = Math.max(max - (eVar.leftMargin + eVar.rightMargin), z3 ? 1 : 0);
                int i15 = eVar.width;
                if (i15 == -2) {
                    if (mode == 0) {
                        i10 = mode;
                    } else {
                        i10 = Integer.MIN_VALUE;
                    }
                    i9 = View.MeasureSpec.makeMeasureSpec(max2, i10);
                } else if (i15 == -1) {
                    i9 = View.MeasureSpec.makeMeasureSpec(max2, mode);
                } else {
                    i9 = View.MeasureSpec.makeMeasureSpec(i15, 1073741824);
                }
                childAt.measure(i9, ViewGroup.getChildMeasureSpec(i11, getPaddingTop() + getPaddingBottom(), eVar.height));
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                if (measuredHeight > i4) {
                    if (mode2 == Integer.MIN_VALUE) {
                        i4 = Math.min(measuredHeight, i3);
                    } else if (mode2 == 0) {
                        i4 = measuredHeight;
                    }
                }
                i13 -= measuredWidth;
                if (i12 != 0) {
                    if (i13 < 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    eVar.f52749b = z2;
                    z4 |= z2;
                    if (z2) {
                        this.f52732f = childAt;
                    }
                }
            }
            i12++;
            size = i14;
            z3 = false;
        }
        int i16 = size;
        int i17 = i13;
        if (z4 || f > 0.0f) {
            int i18 = 0;
            while (i18 < childCount) {
                View childAt2 = getChildAt(i18);
                if (childAt2.getVisibility() != i5) {
                    C20451e eVar2 = (C20451e) childAt2.getLayoutParams();
                    if (eVar2.width != 0 || eVar2.f52748a <= 0.0f) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z) {
                        i6 = 0;
                    } else {
                        i6 = childAt2.getMeasuredWidth();
                    }
                    if (z4) {
                        i7 = max - (eVar2.leftMargin + eVar2.rightMargin);
                        i8 = View.MeasureSpec.makeMeasureSpec(i7, 1073741824);
                    } else if (eVar2.f52748a > 0.0f) {
                        i7 = i6 + ((int) ((eVar2.f52748a * ((float) Math.max(0, i17))) / f));
                        i8 = View.MeasureSpec.makeMeasureSpec(i7, 1073741824);
                    } else {
                        i7 = i6;
                        i8 = 0;
                    }
                    int p = m95290p(childAt2, i11, getPaddingTop() + getPaddingBottom());
                    if (i6 != i7) {
                        childAt2.measure(i8, p);
                        int measuredHeight2 = childAt2.getMeasuredHeight();
                        if (measuredHeight2 > i4) {
                            if (mode2 == Integer.MIN_VALUE) {
                                measuredHeight2 = Math.min(measuredHeight2, i3);
                            } else if (mode2 != 0) {
                            }
                            i4 = measuredHeight2;
                        }
                    }
                }
                i18++;
                i5 = 8;
            }
        }
        ArrayList<Rect> z5 = mo61362z();
        if (z5 != null && !z4) {
            for (int i19 = 0; i19 < childCount; i19++) {
                View childAt3 = getChildAt(i19);
                if (childAt3.getVisibility() != 8) {
                    Rect rect = z5.get(i19);
                    C20451e eVar3 = (C20451e) childAt3.getLayoutParams();
                    int i20 = eVar3.leftMargin + eVar3.rightMargin;
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(childAt3.getMeasuredHeight(), 1073741824);
                    childAt3.measure(View.MeasureSpec.makeMeasureSpec(rect.width(), Integer.MIN_VALUE), makeMeasureSpec);
                    if ((childAt3.getMeasuredWidthAndState() & 16777216) == 1 || (m95289k(childAt3) != 0 && rect.width() < m95289k(childAt3))) {
                        childAt3.measure(View.MeasureSpec.makeMeasureSpec(max - i20, 1073741824), makeMeasureSpec);
                        if (i19 != 0) {
                            eVar3.f52749b = true;
                            this.f52732f = childAt3;
                            z4 = true;
                        }
                    } else {
                        childAt3.measure(View.MeasureSpec.makeMeasureSpec(rect.width(), 1073741824), makeMeasureSpec);
                    }
                }
            }
        }
        setMeasuredDimension(i16, i4 + getPaddingTop() + getPaddingBottom());
        this.f52731e = z4;
        if (this.f52715H0.mo53479F() != 0 && !z4) {
            this.f52715H0.mo53499a();
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.mo53419a());
        if (savedState.f52739c) {
            mo61341r();
        } else {
            mo61313d();
        }
        this.f52716I0 = savedState.f52739c;
        setLockMode(savedState.f52740d);
    }

    public Parcelable onSaveInstanceState() {
        boolean z;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (mo61330o()) {
            z = isOpen();
        } else {
            z = this.f52716I0;
        }
        savedState.f52739c = z;
        savedState.f52740d = this.f52720M0;
        return savedState;
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            this.f52717J0 = true;
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f52731e) {
            return super.onTouchEvent(motionEvent);
        }
        this.f52715H0.mo53486M(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            this.f52738z = x;
            this.f52712E0 = y;
        } else if (actionMasked == 1 && mo61328m(this.f52732f)) {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            float f = x2 - this.f52738z;
            float f2 = y2 - this.f52712E0;
            int E = this.f52715H0.mo53478E();
            if ((f * f) + (f2 * f2) < ((float) (E * E)) && this.f52715H0.mo53485L(this.f52732f, (int) x2, (int) y2)) {
                mo61316e(0);
            }
        }
        return true;
    }

    public void open() {
        mo61341r();
    }

    /* renamed from: q */
    public void mo61340q(int i) {
        int i2;
        int i3;
        if (this.f52732f == null) {
            this.f52733g = 0.0f;
            return;
        }
        boolean n = mo61329n();
        C20451e eVar = (C20451e) this.f52732f.getLayoutParams();
        int width = this.f52732f.getWidth();
        if (n) {
            i = (getWidth() - i) - width;
        }
        if (n) {
            i2 = getPaddingRight();
        } else {
            i2 = getPaddingLeft();
        }
        if (n) {
            i3 = eVar.rightMargin;
        } else {
            i3 = eVar.leftMargin;
        }
        float f = ((float) (i - (i2 + i3))) / ((float) this.f52735w);
        this.f52733g = f;
        if (this.f52737y != 0) {
            mo61356t(f);
        }
        mo61326h(this.f52732f);
    }

    /* renamed from: r */
    public boolean mo61341r() {
        return mo61344s(0);
    }

    public void removeView(@C0359n0 View view) {
        if (view.getParent() instanceof C20454h) {
            super.removeView((View) view.getParent());
        } else {
            super.removeView(view);
        }
    }

    public void requestChildFocus(View view, View view2) {
        boolean z;
        super.requestChildFocus(view, view2);
        if (!isInTouchMode() && !this.f52731e) {
            if (view == this.f52732f) {
                z = true;
            } else {
                z = false;
            }
            this.f52716I0 = z;
        }
    }

    /* renamed from: s */
    public final boolean mo61344s(int i) {
        if (!this.f52731e) {
            this.f52716I0 = true;
        }
        if (!this.f52717J0 && !mo61361y(0.0f, i)) {
            return false;
        }
        this.f52716I0 = true;
        return true;
    }

    @Deprecated
    public void setCoveredFadeColor(@C0354l int i) {
        this.f52728b = i;
    }

    public final void setLockMode(int i) {
        this.f52720M0 = i;
    }

    @Deprecated
    public void setPanelSlideListener(@C0363p0 C20452f fVar) {
        C20452f fVar2 = this.f52714G0;
        if (fVar2 != null) {
            mo61357u(fVar2);
        }
        if (fVar != null) {
            mo61307a(fVar);
        }
        this.f52714G0 = fVar;
    }

    public void setParallaxDistance(@C0372t0 int i) {
        this.f52737y = i;
        requestLayout();
    }

    @Deprecated
    public void setShadowDrawable(Drawable drawable) {
        setShadowDrawableLeft(drawable);
    }

    public void setShadowDrawableLeft(@C0363p0 Drawable drawable) {
        this.f52729c = drawable;
    }

    public void setShadowDrawableRight(@C0363p0 Drawable drawable) {
        this.f52730d = drawable;
    }

    @Deprecated
    public void setShadowResource(@C0375v int i) {
        setShadowDrawableLeft(getResources().getDrawable(i));
    }

    public void setShadowResourceLeft(int i) {
        setShadowDrawableLeft(C17318d.m79726i(getContext(), i));
    }

    public void setShadowResourceRight(int i) {
        setShadowDrawableRight(C17318d.m79726i(getContext(), i));
    }

    @Deprecated
    public void setSliderFadeColor(@C0354l int i) {
        this.f52727a = i;
    }

    /* renamed from: t */
    public final void mo61356t(float f) {
        boolean n = mo61329n();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt != this.f52732f) {
                int i2 = this.f52737y;
                this.f52734v = f;
                int i3 = ((int) ((1.0f - this.f52734v) * ((float) i2))) - ((int) ((1.0f - f) * ((float) i2)));
                if (n) {
                    i3 = -i3;
                }
                childAt.offsetLeftAndRight(i3);
            }
        }
    }

    /* renamed from: u */
    public void mo61357u(@C0359n0 C20452f fVar) {
        this.f52713F0.remove(fVar);
    }

    /* renamed from: v */
    public void mo61358v() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 4) {
                childAt.setVisibility(0);
            }
        }
    }

    @Deprecated
    /* renamed from: w */
    public void mo61359w() {
        mo61313d();
    }

    @Deprecated
    /* renamed from: x */
    public void mo61360x() {
        mo61341r();
    }

    /* renamed from: y */
    public boolean mo61361y(float f, int i) {
        int i2;
        if (!this.f52731e) {
            return false;
        }
        boolean n = mo61329n();
        C20451e eVar = (C20451e) this.f52732f.getLayoutParams();
        if (n) {
            i2 = (int) (((float) getWidth()) - ((((float) (getPaddingRight() + eVar.rightMargin)) + (f * ((float) this.f52735w))) + ((float) this.f52732f.getWidth())));
        } else {
            i2 = (int) (((float) (getPaddingLeft() + eVar.leftMargin)) + (f * ((float) this.f52735w)));
        }
        C18553d dVar = this.f52715H0;
        View view = this.f52732f;
        if (!dVar.mo53497X(view, i2, view.getTop())) {
            return false;
        }
        mo61358v();
        C18196h2.m82610n1(this);
        return true;
    }

    /* renamed from: z */
    public final ArrayList<Rect> mo61362z() {
        Rect j;
        C21052l lVar = this.f52721N0;
        if (lVar == null || !lVar.mo62983b() || this.f52721N0.getBounds().left == 0 || this.f52721N0.getBounds().top != 0 || (j = m95288j(this.f52721N0, this)) == null) {
            return null;
        }
        Rect rect = new Rect(getPaddingLeft(), getPaddingTop(), Math.max(getPaddingLeft(), j.left), getHeight() - getPaddingBottom());
        int width = getWidth() - getPaddingRight();
        return new ArrayList<>(Arrays.asList(new Rect[]{rect, new Rect(Math.min(width, j.right), getPaddingTop(), width, getHeight() - getPaddingBottom())}));
    }

    /* renamed from: androidx.slidingpanelayout.widget.SlidingPaneLayout$e */
    public static class C20451e extends ViewGroup.MarginLayoutParams {

        /* renamed from: e */
        public static final int[] f52747e = {16843137};

        /* renamed from: a */
        public float f52748a = 0.0f;

        /* renamed from: b */
        public boolean f52749b;

        /* renamed from: c */
        public boolean f52750c;

        /* renamed from: d */
        public Paint f52751d;

        public C20451e() {
            super(-1, -1);
        }

        public C20451e(int i, int i2) {
            super(i, i2);
        }

        public C20451e(@C0359n0 ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C20451e(@C0359n0 ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public C20451e(@C0359n0 C20451e eVar) {
            super(eVar);
            this.f52748a = eVar.f52748a;
        }

        public C20451e(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f52747e);
            this.f52748a = obtainStyledAttributes.getFloat(0, 0.0f);
            obtainStyledAttributes.recycle();
        }
    }

    public SlidingPaneLayout(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SlidingPaneLayout(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f52727a = 0;
        this.f52733g = 1.0f;
        this.f52713F0 = new CopyOnWriteArrayList();
        this.f52717J0 = true;
        this.f52718K0 = new Rect();
        this.f52719L0 = new ArrayList<>();
        this.f52722O0 = new C20447a();
        float f = context.getResources().getDisplayMetrics().density;
        setWillNotDraw(false);
        C18196h2.m82474B1(this, new C20448b());
        C18196h2.m82531R1(this, 1);
        C18553d p = C18553d.m83925p(this, 0.5f, new C20450d());
        this.f52715H0 = p;
        p.mo53494U(f * 400.0f);
        setFoldingFeatureObserver(new FoldingFeatureObserver(C21069q.m97430b(context), C17318d.m79729l(context)));
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C20451e(getContext(), attributeSet);
    }
}
