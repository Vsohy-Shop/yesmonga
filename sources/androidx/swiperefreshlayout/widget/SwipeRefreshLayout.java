package androidx.swiperefreshlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.ListView;
import androidx.annotation.C0344h1;
import androidx.annotation.C0354l;
import androidx.annotation.C0358n;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0372t0;
import androidx.core.content.C17318d;
import androidx.core.view.C18196h2;
import androidx.core.view.C18336p1;
import androidx.core.view.C18346q1;
import androidx.core.view.C18355r1;
import androidx.core.view.C18363s1;
import androidx.core.view.C18373t1;
import androidx.core.view.C18384u1;
import androidx.core.view.C18393v1;
import androidx.core.view.C18400w1;
import androidx.core.widget.C18488m;

public class SwipeRefreshLayout extends ViewGroup implements C18384u1, C18373t1, C18346q1, C18336p1, C18393v1, C18355r1 {

    /* renamed from: i1 */
    public static final int f52837i1 = 0;

    /* renamed from: j1 */
    public static final int f52838j1 = 1;

    /* renamed from: k1 */
    public static final int f52839k1 = -1;
    @C0344h1

    /* renamed from: l1 */
    public static final int f52840l1 = 40;
    @C0344h1

    /* renamed from: m1 */
    public static final int f52841m1 = 56;

    /* renamed from: n1 */
    public static final String f52842n1 = "SwipeRefreshLayout";

    /* renamed from: o1 */
    public static final int f52843o1 = 255;

    /* renamed from: p1 */
    public static final int f52844p1 = 76;

    /* renamed from: q1 */
    public static final float f52845q1 = 2.0f;

    /* renamed from: r1 */
    public static final int f52846r1 = -1;

    /* renamed from: s1 */
    public static final float f52847s1 = 0.5f;

    /* renamed from: t1 */
    public static final float f52848t1 = 0.8f;

    /* renamed from: u1 */
    public static final int f52849u1 = 150;

    /* renamed from: v1 */
    public static final int f52850v1 = 300;

    /* renamed from: w1 */
    public static final int f52851w1 = 200;

    /* renamed from: x1 */
    public static final int f52852x1 = 200;

    /* renamed from: y1 */
    public static final int f52853y1 = 64;

    /* renamed from: z1 */
    public static final int[] f52854z1 = {16842766};

    /* renamed from: E0 */
    public int f52855E0;

    /* renamed from: F0 */
    public int f52856F0;

    /* renamed from: G0 */
    public float f52857G0;

    /* renamed from: H0 */
    public float f52858H0;

    /* renamed from: I0 */
    public boolean f52859I0;

    /* renamed from: J0 */
    public int f52860J0;

    /* renamed from: K0 */
    public boolean f52861K0;

    /* renamed from: L0 */
    public boolean f52862L0;

    /* renamed from: M0 */
    public final DecelerateInterpolator f52863M0;

    /* renamed from: N0 */
    public C20522a f52864N0;

    /* renamed from: O0 */
    public int f52865O0;

    /* renamed from: P0 */
    public int f52866P0;

    /* renamed from: Q0 */
    public float f52867Q0;

    /* renamed from: R0 */
    public int f52868R0;

    /* renamed from: S0 */
    public int f52869S0;

    /* renamed from: T0 */
    public int f52870T0;

    /* renamed from: U0 */
    public C20524b f52871U0;

    /* renamed from: V0 */
    public Animation f52872V0;

    /* renamed from: W0 */
    public Animation f52873W0;

    /* renamed from: X0 */
    public Animation f52874X0;

    /* renamed from: Y0 */
    public Animation f52875Y0;

    /* renamed from: Z0 */
    public Animation f52876Z0;

    /* renamed from: a */
    public View f52877a;

    /* renamed from: a1 */
    public boolean f52878a1;

    /* renamed from: b */
    public C20521j f52879b;

    /* renamed from: b1 */
    public int f52880b1;

    /* renamed from: c */
    public boolean f52881c;

    /* renamed from: c1 */
    public boolean f52882c1;

    /* renamed from: d */
    public int f52883d;

    /* renamed from: d1 */
    public C20520i f52884d1;

    /* renamed from: e */
    public float f52885e;

    /* renamed from: e1 */
    public boolean f52886e1;

    /* renamed from: f */
    public float f52887f;

    /* renamed from: f1 */
    public Animation.AnimationListener f52888f1;

    /* renamed from: g */
    public final C18400w1 f52889g;

    /* renamed from: g1 */
    public final Animation f52890g1;

    /* renamed from: h1 */
    public final Animation f52891h1;

    /* renamed from: v */
    public final C18363s1 f52892v;

    /* renamed from: w */
    public final int[] f52893w;

    /* renamed from: x */
    public final int[] f52894x;

    /* renamed from: y */
    public final int[] f52895y;

    /* renamed from: z */
    public boolean f52896z;

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$a */
    public class C20512a implements Animation.AnimationListener {
        public C20512a() {
        }

        public void onAnimationEnd(Animation animation) {
            C20521j jVar;
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (swipeRefreshLayout.f52881c) {
                swipeRefreshLayout.f52871U0.setAlpha(255);
                SwipeRefreshLayout.this.f52871U0.start();
                SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.this;
                if (swipeRefreshLayout2.f52878a1 && (jVar = swipeRefreshLayout2.f52879b) != null) {
                    jVar.mo19059a();
                }
                SwipeRefreshLayout swipeRefreshLayout3 = SwipeRefreshLayout.this;
                swipeRefreshLayout3.f52856F0 = swipeRefreshLayout3.f52864N0.getTop();
                return;
            }
            swipeRefreshLayout.mo61488x();
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$b */
    public class C20513b extends Animation {
        public C20513b() {
        }

        public void applyTransformation(float f, Transformation transformation) {
            SwipeRefreshLayout.this.setAnimationProgress(f);
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$c */
    public class C20514c extends Animation {
        public C20514c() {
        }

        public void applyTransformation(float f, Transformation transformation) {
            SwipeRefreshLayout.this.setAnimationProgress(1.0f - f);
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$d */
    public class C20515d extends Animation {

        /* renamed from: a */
        public final /* synthetic */ int f52901a;

        /* renamed from: b */
        public final /* synthetic */ int f52902b;

        public C20515d(int i, int i2) {
            this.f52901a = i;
            this.f52902b = i2;
        }

        public void applyTransformation(float f, Transformation transformation) {
            C20524b bVar = SwipeRefreshLayout.this.f52871U0;
            int i = this.f52901a;
            bVar.setAlpha((int) (((float) i) + (((float) (this.f52902b - i)) * f)));
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$e */
    public class C20516e implements Animation.AnimationListener {
        public C20516e() {
        }

        public void onAnimationEnd(Animation animation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (!swipeRefreshLayout.f52861K0) {
                swipeRefreshLayout.mo61444D((Animation.AnimationListener) null);
            }
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$f */
    public class C20517f extends Animation {
        public C20517f() {
        }

        public void applyTransformation(float f, Transformation transformation) {
            int i;
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (!swipeRefreshLayout.f52882c1) {
                i = swipeRefreshLayout.f52869S0 - Math.abs(swipeRefreshLayout.f52868R0);
            } else {
                i = swipeRefreshLayout.f52869S0;
            }
            SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.this;
            int i2 = swipeRefreshLayout2.f52866P0;
            SwipeRefreshLayout.this.setTargetOffsetTopAndBottom((i2 + ((int) (((float) (i - i2)) * f))) - swipeRefreshLayout2.f52864N0.getTop());
            SwipeRefreshLayout.this.f52871U0.mo61553v(1.0f - f);
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$g */
    public class C20518g extends Animation {
        public C20518g() {
        }

        public void applyTransformation(float f, Transformation transformation) {
            SwipeRefreshLayout.this.mo61486v(f);
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$h */
    public class C20519h extends Animation {
        public C20519h() {
        }

        public void applyTransformation(float f, Transformation transformation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            float f2 = swipeRefreshLayout.f52867Q0;
            swipeRefreshLayout.setAnimationProgress(f2 + ((-f2) * f));
            SwipeRefreshLayout.this.mo61486v(f);
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$i */
    public interface C20520i {
        /* renamed from: a */
        boolean mo61508a(@C0359n0 SwipeRefreshLayout swipeRefreshLayout, @C0363p0 View view);
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$j */
    public interface C20521j {
        /* renamed from: a */
        void mo19059a();
    }

    public SwipeRefreshLayout(@C0359n0 Context context) {
        this(context, (AttributeSet) null);
    }

    private void setColorViewAlpha(int i) {
        this.f52864N0.getBackground().setAlpha(i);
        this.f52871U0.setAlpha(i);
    }

    /* renamed from: A */
    public final void mo61441A(float f) {
        float f2 = this.f52858H0;
        int i = this.f52883d;
        if (f - f2 > ((float) i) && !this.f52859I0) {
            this.f52857G0 = f2 + ((float) i);
            this.f52859I0 = true;
            this.f52871U0.setAlpha(76);
        }
    }

    /* renamed from: B */
    public final void mo61442B() {
        this.f52875Y0 = mo61490z(this.f52871U0.getAlpha(), 255);
    }

    /* renamed from: C */
    public final void mo61443C() {
        this.f52874X0 = mo61490z(this.f52871U0.getAlpha(), 76);
    }

    /* renamed from: D */
    public void mo61444D(Animation.AnimationListener animationListener) {
        C20514c cVar = new C20514c();
        this.f52873W0 = cVar;
        cVar.setDuration(150);
        this.f52864N0.mo61511c(animationListener);
        this.f52864N0.clearAnimation();
        this.f52864N0.startAnimation(this.f52873W0);
    }

    /* renamed from: E */
    public final void mo61445E(int i, Animation.AnimationListener animationListener) {
        this.f52866P0 = i;
        this.f52867Q0 = this.f52864N0.getScaleX();
        C20519h hVar = new C20519h();
        this.f52876Z0 = hVar;
        hVar.setDuration(150);
        if (animationListener != null) {
            this.f52864N0.mo61511c(animationListener);
        }
        this.f52864N0.clearAnimation();
        this.f52864N0.startAnimation(this.f52876Z0);
    }

    /* renamed from: F */
    public final void mo61446F(Animation.AnimationListener animationListener) {
        this.f52864N0.setVisibility(0);
        this.f52871U0.setAlpha(255);
        C20513b bVar = new C20513b();
        this.f52872V0 = bVar;
        bVar.setDuration((long) this.f52855E0);
        if (animationListener != null) {
            this.f52864N0.mo61511c(animationListener);
        }
        this.f52864N0.clearAnimation();
        this.f52864N0.startAnimation(this.f52872V0);
    }

    /* renamed from: a */
    public void mo52998a(int i, int i2, int i3, int i4, @C0363p0 int[] iArr, int i5, @C0359n0 int[] iArr2) {
        if (i5 == 0) {
            this.f52892v.mo53013e(i, i2, i3, i4, iArr, i5, iArr2);
        }
    }

    /* renamed from: b */
    public boolean mo52992b(int i) {
        return i == 0 && hasNestedScrollingParent();
    }

    /* renamed from: c */
    public final void mo61447c(int i, Animation.AnimationListener animationListener) {
        this.f52866P0 = i;
        this.f52890g1.reset();
        this.f52890g1.setDuration(200);
        this.f52890g1.setInterpolator(this.f52863M0);
        if (animationListener != null) {
            this.f52864N0.mo61511c(animationListener);
        }
        this.f52864N0.clearAnimation();
        this.f52864N0.startAnimation(this.f52890g1);
    }

    /* renamed from: d */
    public boolean mo52993d(int i, int i2) {
        return i2 == 0 && startNestedScroll(i);
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f52892v.mo53009a(f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.f52892v.mo53010b(f, f2);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.f52892v.mo53011c(i, i2, iArr, iArr2);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f52892v.mo53014f(i, i2, i3, i4, iArr);
    }

    /* renamed from: e */
    public boolean mo52994e(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return i5 == 0 && this.f52892v.mo53015g(i, i2, i3, i4, iArr, i5);
    }

    /* renamed from: f */
    public boolean mo52995f(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return i3 == 0 && dispatchNestedPreScroll(i, i2, iArr, iArr2);
    }

    /* renamed from: g */
    public void mo52996g(int i) {
        if (i == 0) {
            stopNestedScroll();
        }
    }

    public int getChildDrawingOrder(int i, int i2) {
        int i3 = this.f52865O0;
        return i3 < 0 ? i2 : i2 == i + -1 ? i3 : i2 >= i3 ? i2 + 1 : i2;
    }

    public int getNestedScrollAxes() {
        return this.f52889g.mo53039a();
    }

    public int getProgressCircleDiameter() {
        return this.f52880b1;
    }

    public int getProgressViewEndOffset() {
        return this.f52869S0;
    }

    public int getProgressViewStartOffset() {
        return this.f52868R0;
    }

    /* renamed from: h */
    public final void mo61452h(int i, Animation.AnimationListener animationListener) {
        if (this.f52861K0) {
            mo61445E(i, animationListener);
            return;
        }
        this.f52866P0 = i;
        this.f52891h1.reset();
        this.f52891h1.setDuration(200);
        this.f52891h1.setInterpolator(this.f52863M0);
        if (animationListener != null) {
            this.f52864N0.mo61511c(animationListener);
        }
        this.f52864N0.clearAnimation();
        this.f52864N0.startAnimation(this.f52891h1);
    }

    public boolean hasNestedScrollingParent() {
        return this.f52892v.mo53019k();
    }

    /* renamed from: i */
    public boolean mo61453i() {
        C20520i iVar = this.f52884d1;
        if (iVar != null) {
            return iVar.mo61508a(this, this.f52877a);
        }
        View view = this.f52877a;
        if (view instanceof ListView) {
            return C18488m.m83685a((ListView) view, -1);
        }
        return view.canScrollVertically(-1);
    }

    public boolean isNestedScrollingEnabled() {
        return this.f52892v.mo53021m();
    }

    /* renamed from: j */
    public final void mo61454j() {
        this.f52864N0 = new C20522a(getContext());
        C20524b bVar = new C20524b(getContext());
        this.f52871U0 = bVar;
        bVar.mo61524F(1);
        this.f52864N0.setImageDrawable(this.f52871U0);
        this.f52864N0.setVisibility(8);
        addView(this.f52864N0);
    }

    /* renamed from: k */
    public final void mo61455k() {
        if (this.f52877a == null) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (!childAt.equals(this.f52864N0)) {
                    this.f52877a = childAt;
                    return;
                }
            }
        }
    }

    /* renamed from: l */
    public final void mo61456l(float f) {
        C20516e eVar;
        if (f > this.f52885e) {
            mo61489y(true, true);
            return;
        }
        this.f52881c = false;
        this.f52871U0.mo61521C(0.0f, 0.0f);
        if (!this.f52861K0) {
            eVar = new C20516e();
        } else {
            eVar = null;
        }
        mo61452h(this.f52856F0, eVar);
        this.f52871U0.mo61552u(false);
    }

    /* renamed from: m */
    public void mo2389m(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    /* renamed from: n */
    public void mo2390n(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    /* renamed from: o */
    public void mo2391o(View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(view, i, i2, iArr);
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo61488x();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int findPointerIndex;
        mo61455k();
        int actionMasked = motionEvent.getActionMasked();
        if (this.f52862L0 && actionMasked == 0) {
            this.f52862L0 = false;
        }
        if (!isEnabled() || this.f52862L0 || mo61453i() || this.f52881c || this.f52896z) {
            return false;
        }
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i = this.f52860J0;
                    if (i == -1 || (findPointerIndex = motionEvent.findPointerIndex(i)) < 0) {
                        return false;
                    }
                    mo61441A(motionEvent.getY(findPointerIndex));
                } else if (actionMasked != 3) {
                    if (actionMasked == 6) {
                        mo61487w(motionEvent);
                    }
                }
            }
            this.f52859I0 = false;
            this.f52860J0 = -1;
        } else {
            setTargetOffsetTopAndBottom(this.f52868R0 - this.f52864N0.getTop());
            int pointerId = motionEvent.getPointerId(0);
            this.f52860J0 = pointerId;
            this.f52859I0 = false;
            int findPointerIndex2 = motionEvent.findPointerIndex(pointerId);
            if (findPointerIndex2 < 0) {
                return false;
            }
            this.f52858H0 = motionEvent.getY(findPointerIndex2);
        }
        return this.f52859I0;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() != 0) {
            if (this.f52877a == null) {
                mo61455k();
            }
            View view = this.f52877a;
            if (view != null) {
                int paddingLeft = getPaddingLeft();
                int paddingTop = getPaddingTop();
                view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
                int measuredWidth2 = this.f52864N0.getMeasuredWidth();
                int measuredHeight2 = this.f52864N0.getMeasuredHeight();
                int i5 = measuredWidth / 2;
                int i6 = measuredWidth2 / 2;
                int i7 = this.f52856F0;
                this.f52864N0.layout(i5 - i6, i7, i5 + i6, measuredHeight2 + i7);
            }
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f52877a == null) {
            mo61455k();
        }
        View view = this.f52877a;
        if (view != null) {
            view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
            this.f52864N0.measure(View.MeasureSpec.makeMeasureSpec(this.f52880b1, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f52880b1, 1073741824));
            this.f52865O0 = -1;
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                if (getChildAt(i3) == this.f52864N0) {
                    this.f52865O0 = i3;
                    return;
                }
            }
        }
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        return dispatchNestedFling(f, f2, z);
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        if (i2 > 0) {
            float f = this.f52887f;
            if (f > 0.0f) {
                float f2 = (float) i2;
                if (f2 > f) {
                    iArr[1] = (int) f;
                    this.f52887f = 0.0f;
                } else {
                    this.f52887f = f - f2;
                    iArr[1] = i2;
                }
                mo61485u(this.f52887f);
            }
        }
        if (this.f52882c1 && i2 > 0 && this.f52887f == 0.0f && Math.abs(i2 - iArr[1]) > 0) {
            this.f52864N0.setVisibility(8);
        }
        int[] iArr2 = this.f52893w;
        if (dispatchNestedPreScroll(i - iArr[0], i2 - iArr[1], iArr2, (int[]) null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        mo2407q(view, i, i2, i3, i4, 0, this.f52895y);
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.f52889g.mo53040b(view, view2, i);
        startNestedScroll(i & 2);
        this.f52887f = 0.0f;
        this.f52896z = true;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setRefreshing(savedState.f52897a);
    }

    public Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState(), this.f52881c);
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return isEnabled() && !this.f52862L0 && !this.f52881c && (i & 2) != 0;
    }

    public void onStopNestedScroll(View view) {
        this.f52889g.mo53042d(view);
        this.f52896z = false;
        float f = this.f52887f;
        if (f > 0.0f) {
            mo61456l(f);
            this.f52887f = 0.0f;
        }
        stopNestedScroll();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (this.f52862L0 && actionMasked == 0) {
            this.f52862L0 = false;
        }
        if (!isEnabled() || this.f52862L0 || mo61453i() || this.f52881c || this.f52896z) {
            return false;
        }
        if (actionMasked == 0) {
            this.f52860J0 = motionEvent.getPointerId(0);
            this.f52859I0 = false;
        } else if (actionMasked == 1) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f52860J0);
            if (findPointerIndex < 0) {
                return false;
            }
            if (this.f52859I0) {
                this.f52859I0 = false;
                mo61456l((motionEvent.getY(findPointerIndex) - this.f52857G0) * 0.5f);
            }
            this.f52860J0 = -1;
            return false;
        } else if (actionMasked == 2) {
            int findPointerIndex2 = motionEvent.findPointerIndex(this.f52860J0);
            if (findPointerIndex2 < 0) {
                return false;
            }
            float y = motionEvent.getY(findPointerIndex2);
            mo61441A(y);
            if (this.f52859I0) {
                float f = (y - this.f52857G0) * 0.5f;
                if (f <= 0.0f) {
                    return false;
                }
                getParent().requestDisallowInterceptTouchEvent(true);
                mo61485u(f);
            }
        } else if (actionMasked == 3) {
            return false;
        } else {
            if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                if (actionIndex < 0) {
                    return false;
                }
                this.f52860J0 = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                mo61487w(motionEvent);
            }
        }
        return true;
    }

    /* renamed from: p */
    public final boolean mo61464p(Animation animation) {
        return animation != null && animation.hasStarted() && !animation.hasEnded();
    }

    /* renamed from: q */
    public void mo2407q(@C0359n0 View view, int i, int i2, int i3, int i4, int i5, @C0359n0 int[] iArr) {
        int i6;
        if (i5 == 0) {
            int i7 = iArr[1];
            mo52998a(i, i2, i3, i4, this.f52894x, i5, iArr);
            int i8 = i4 - (iArr[1] - i7);
            if (i8 == 0) {
                i6 = i4 + this.f52894x[1];
            } else {
                i6 = i8;
            }
            if (i6 < 0 && !mo61453i()) {
                float abs = this.f52887f + ((float) Math.abs(i6));
                this.f52887f = abs;
                mo61485u(abs);
                iArr[1] = iArr[1] + i8;
            }
        }
    }

    /* renamed from: r */
    public void mo2408r(View view, int i, int i2, int i3, int i4, int i5) {
        mo2407q(view, i, i2, i3, i4, i5, this.f52895y);
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        ViewParent parent;
        View view = this.f52877a;
        if (view == null || C18196h2.m82545W0(view)) {
            super.requestDisallowInterceptTouchEvent(z);
        } else if (!this.f52886e1 && (parent = getParent()) != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    /* renamed from: s */
    public boolean mo2409s(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            return onStartNestedScroll(view, view2, i);
        }
        return false;
    }

    public void setAnimationProgress(float f) {
        this.f52864N0.setScaleX(f);
        this.f52864N0.setScaleY(f);
    }

    @Deprecated
    public void setColorScheme(@C0358n int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(@C0354l int... iArr) {
        mo61455k();
        this.f52871U0.mo61556y(iArr);
    }

    public void setColorSchemeResources(@C0358n int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr2[i] = C17318d.m79723f(context, iArr[i]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i) {
        this.f52885e = (float) i;
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (!z) {
            mo61488x();
        }
    }

    @Deprecated
    public void setLegacyRequestDisallowInterceptTouchEventEnabled(boolean z) {
        this.f52886e1 = z;
    }

    public void setNestedScrollingEnabled(boolean z) {
        this.f52892v.mo53024p(z);
    }

    public void setOnChildScrollUpCallback(@C0363p0 C20520i iVar) {
        this.f52884d1 = iVar;
    }

    public void setOnRefreshListener(@C0363p0 C20521j jVar) {
        this.f52879b = jVar;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i) {
        setProgressBackgroundColorSchemeResource(i);
    }

    public void setProgressBackgroundColorSchemeColor(@C0354l int i) {
        this.f52864N0.setBackgroundColor(i);
    }

    public void setProgressBackgroundColorSchemeResource(@C0358n int i) {
        setProgressBackgroundColorSchemeColor(C17318d.m79723f(getContext(), i));
    }

    public void setProgressViewEndTarget(boolean z, int i) {
        this.f52869S0 = i;
        this.f52861K0 = z;
        this.f52864N0.invalidate();
    }

    public void setProgressViewOffset(boolean z, int i, int i2) {
        this.f52861K0 = z;
        this.f52868R0 = i;
        this.f52869S0 = i2;
        this.f52882c1 = true;
        mo61488x();
        this.f52881c = false;
    }

    public void setRefreshing(boolean z) {
        int i;
        if (!z || this.f52881c == z) {
            mo61489y(z, false);
            return;
        }
        this.f52881c = z;
        if (!this.f52882c1) {
            i = this.f52869S0 + this.f52868R0;
        } else {
            i = this.f52869S0;
        }
        setTargetOffsetTopAndBottom(i - this.f52856F0);
        this.f52878a1 = false;
        mo61446F(this.f52888f1);
    }

    public void setSize(int i) {
        if (i == 0 || i == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i == 0) {
                this.f52880b1 = (int) (displayMetrics.density * 56.0f);
            } else {
                this.f52880b1 = (int) (displayMetrics.density * 40.0f);
            }
            this.f52864N0.setImageDrawable((Drawable) null);
            this.f52871U0.mo61524F(i);
            this.f52864N0.setImageDrawable(this.f52871U0);
        }
    }

    public void setSlingshotDistance(@C0372t0 int i) {
        this.f52870T0 = i;
    }

    public void setTargetOffsetTopAndBottom(int i) {
        this.f52864N0.bringToFront();
        C18196h2.m82578f1(this.f52864N0, i);
        this.f52856F0 = this.f52864N0.getTop();
    }

    public boolean startNestedScroll(int i) {
        return this.f52892v.mo53026r(i);
    }

    public void stopNestedScroll() {
        this.f52892v.mo53028t();
    }

    /* renamed from: t */
    public boolean mo61484t() {
        return this.f52881c;
    }

    /* renamed from: u */
    public final void mo61485u(float f) {
        this.f52871U0.mo61552u(true);
        float min = Math.min(1.0f, Math.abs(f / this.f52885e));
        float max = (((float) Math.max(((double) min) - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float abs = Math.abs(f) - this.f52885e;
        int i = this.f52870T0;
        if (i <= 0) {
            if (this.f52882c1) {
                i = this.f52869S0 - this.f52868R0;
            } else {
                i = this.f52869S0;
            }
        }
        float f2 = (float) i;
        double max2 = (double) (Math.max(0.0f, Math.min(abs, f2 * 2.0f) / f2) / 4.0f);
        float pow = ((float) (max2 - Math.pow(max2, 2.0d))) * 2.0f;
        int i2 = this.f52868R0 + ((int) ((f2 * min) + (f2 * pow * 2.0f)));
        if (this.f52864N0.getVisibility() != 0) {
            this.f52864N0.setVisibility(0);
        }
        if (!this.f52861K0) {
            this.f52864N0.setScaleX(1.0f);
            this.f52864N0.setScaleY(1.0f);
        }
        if (this.f52861K0) {
            setAnimationProgress(Math.min(1.0f, f / this.f52885e));
        }
        if (f < this.f52885e) {
            if (this.f52871U0.getAlpha() > 76 && !mo61464p(this.f52874X0)) {
                mo61443C();
            }
        } else if (this.f52871U0.getAlpha() < 255 && !mo61464p(this.f52875Y0)) {
            mo61442B();
        }
        this.f52871U0.mo61521C(0.0f, Math.min(0.8f, max * 0.8f));
        this.f52871U0.mo61553v(Math.min(1.0f, max));
        this.f52871U0.mo61557z((((max * 0.4f) - 16.0f) + (pow * 2.0f)) * 0.5f);
        setTargetOffsetTopAndBottom(i2 - this.f52856F0);
    }

    /* renamed from: v */
    public void mo61486v(float f) {
        int i = this.f52866P0;
        setTargetOffsetTopAndBottom((i + ((int) (((float) (this.f52868R0 - i)) * f))) - this.f52864N0.getTop());
    }

    /* renamed from: w */
    public final void mo61487w(MotionEvent motionEvent) {
        int i;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f52860J0) {
            if (actionIndex == 0) {
                i = 1;
            } else {
                i = 0;
            }
            this.f52860J0 = motionEvent.getPointerId(i);
        }
    }

    /* renamed from: x */
    public void mo61488x() {
        this.f52864N0.clearAnimation();
        this.f52871U0.stop();
        this.f52864N0.setVisibility(8);
        setColorViewAlpha(255);
        if (this.f52861K0) {
            setAnimationProgress(0.0f);
        } else {
            setTargetOffsetTopAndBottom(this.f52868R0 - this.f52856F0);
        }
        this.f52856F0 = this.f52864N0.getTop();
    }

    /* renamed from: y */
    public final void mo61489y(boolean z, boolean z2) {
        if (this.f52881c != z) {
            this.f52878a1 = z2;
            mo61455k();
            this.f52881c = z;
            if (z) {
                mo61447c(this.f52856F0, this.f52888f1);
            } else {
                mo61444D(this.f52888f1);
            }
        }
    }

    /* renamed from: z */
    public final Animation mo61490z(int i, int i2) {
        C20515d dVar = new C20515d(i, i2);
        dVar.setDuration(300);
        this.f52864N0.mo61511c((Animation.AnimationListener) null);
        this.f52864N0.clearAnimation();
        this.f52864N0.startAnimation(dVar);
        return dVar;
    }

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C20511a();

        /* renamed from: a */
        public final boolean f52897a;

        /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$SavedState$a */
        public class C20511a implements Parcelable.Creator<SavedState> {
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* renamed from: b */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcelable parcelable, boolean z) {
            super(parcelable);
            this.f52897a = z;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.f52897a ? (byte) 1 : 0);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f52897a = parcel.readByte() != 0;
        }
    }

    public SwipeRefreshLayout(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f52881c = false;
        this.f52885e = -1.0f;
        this.f52893w = new int[2];
        this.f52894x = new int[2];
        this.f52895y = new int[2];
        this.f52860J0 = -1;
        this.f52865O0 = -1;
        this.f52888f1 = new C20512a();
        this.f52890g1 = new C20517f();
        this.f52891h1 = new C20518g();
        this.f52883d = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f52855E0 = getResources().getInteger(17694721);
        setWillNotDraw(false);
        this.f52863M0 = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f52880b1 = (int) (displayMetrics.density * 40.0f);
        mo61454j();
        setChildrenDrawingOrderEnabled(true);
        int i = (int) (displayMetrics.density * 64.0f);
        this.f52869S0 = i;
        this.f52885e = (float) i;
        this.f52889g = new C18400w1(this);
        this.f52892v = new C18363s1(this);
        setNestedScrollingEnabled(true);
        int i2 = -this.f52880b1;
        this.f52856F0 = i2;
        this.f52868R0 = i2;
        mo61486v(1.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f52854z1);
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
    }
}
