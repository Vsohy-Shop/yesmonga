package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.C0376v0;
import androidx.annotation.RestrictTo;
import androidx.appcompat.C0387a;
import androidx.core.view.C18196h2;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class ActionBarContainer extends FrameLayout {

    /* renamed from: a */
    public boolean f1741a;

    /* renamed from: b */
    public View f1742b;

    /* renamed from: c */
    public View f1743c;

    /* renamed from: d */
    public View f1744d;

    /* renamed from: e */
    public Drawable f1745e;

    /* renamed from: f */
    public Drawable f1746f;

    /* renamed from: g */
    public Drawable f1747g;

    /* renamed from: v */
    public boolean f1748v;

    /* renamed from: w */
    public boolean f1749w;

    /* renamed from: x */
    public int f1750x;

    @C0376v0(21)
    /* renamed from: androidx.appcompat.widget.ActionBarContainer$a */
    public static class C0596a {
        /* renamed from: a */
        public static void m2883a(ActionBarContainer actionBarContainer) {
            actionBarContainer.invalidateOutline();
        }
    }

    public ActionBarContainer(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    public final int mo2309a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    /* renamed from: b */
    public final boolean mo2310b(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f1745e;
        if (drawable != null && drawable.isStateful()) {
            this.f1745e.setState(getDrawableState());
        }
        Drawable drawable2 = this.f1746f;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f1746f.setState(getDrawableState());
        }
        Drawable drawable3 = this.f1747g;
        if (drawable3 != null && drawable3.isStateful()) {
            this.f1747g.setState(getDrawableState());
        }
    }

    public View getTabContainer() {
        return this.f1742b;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1745e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f1746f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f1747g;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f1743c = findViewById(C0387a.C0394g.action_bar);
        this.f1744d = findViewById(C0387a.C0394g.action_context_bar);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f1741a || super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r5, int r6, int r7, int r8, int r9) {
        /*
            r4 = this;
            super.onLayout(r5, r6, r7, r8, r9)
            android.view.View r5 = r4.f1742b
            r7 = 8
            r9 = 1
            r0 = 0
            if (r5 == 0) goto L_0x0013
            int r1 = r5.getVisibility()
            if (r1 == r7) goto L_0x0013
            r1 = r9
            goto L_0x0014
        L_0x0013:
            r1 = r0
        L_0x0014:
            if (r5 == 0) goto L_0x0033
            int r2 = r5.getVisibility()
            if (r2 == r7) goto L_0x0033
            int r7 = r4.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r2 = r5.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r2 = (android.widget.FrameLayout.LayoutParams) r2
            int r3 = r5.getMeasuredHeight()
            int r3 = r7 - r3
            int r2 = r2.bottomMargin
            int r3 = r3 - r2
            int r7 = r7 - r2
            r5.layout(r6, r3, r8, r7)
        L_0x0033:
            boolean r6 = r4.f1748v
            if (r6 == 0) goto L_0x004b
            android.graphics.drawable.Drawable r5 = r4.f1747g
            if (r5 == 0) goto L_0x0048
            int r6 = r4.getMeasuredWidth()
            int r7 = r4.getMeasuredHeight()
            r5.setBounds(r0, r0, r6, r7)
            goto L_0x00be
        L_0x0048:
            r9 = r0
            goto L_0x00be
        L_0x004b:
            android.graphics.drawable.Drawable r6 = r4.f1745e
            if (r6 == 0) goto L_0x00a3
            android.view.View r6 = r4.f1743c
            int r6 = r6.getVisibility()
            if (r6 != 0) goto L_0x0075
            android.graphics.drawable.Drawable r6 = r4.f1745e
            android.view.View r7 = r4.f1743c
            int r7 = r7.getLeft()
            android.view.View r8 = r4.f1743c
            int r8 = r8.getTop()
            android.view.View r0 = r4.f1743c
            int r0 = r0.getRight()
            android.view.View r2 = r4.f1743c
            int r2 = r2.getBottom()
            r6.setBounds(r7, r8, r0, r2)
            goto L_0x00a2
        L_0x0075:
            android.view.View r6 = r4.f1744d
            if (r6 == 0) goto L_0x009d
            int r6 = r6.getVisibility()
            if (r6 != 0) goto L_0x009d
            android.graphics.drawable.Drawable r6 = r4.f1745e
            android.view.View r7 = r4.f1744d
            int r7 = r7.getLeft()
            android.view.View r8 = r4.f1744d
            int r8 = r8.getTop()
            android.view.View r0 = r4.f1744d
            int r0 = r0.getRight()
            android.view.View r2 = r4.f1744d
            int r2 = r2.getBottom()
            r6.setBounds(r7, r8, r0, r2)
            goto L_0x00a2
        L_0x009d:
            android.graphics.drawable.Drawable r6 = r4.f1745e
            r6.setBounds(r0, r0, r0, r0)
        L_0x00a2:
            r0 = r9
        L_0x00a3:
            r4.f1749w = r1
            if (r1 == 0) goto L_0x0048
            android.graphics.drawable.Drawable r6 = r4.f1746f
            if (r6 == 0) goto L_0x0048
            int r7 = r5.getLeft()
            int r8 = r5.getTop()
            int r0 = r5.getRight()
            int r5 = r5.getBottom()
            r6.setBounds(r7, r8, r0, r5)
        L_0x00be:
            if (r9 == 0) goto L_0x00c3
            r4.invalidate()
        L_0x00c3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContainer.onLayout(boolean, int, int, int, int):void");
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        if (this.f1743c == null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && (i5 = this.f1750x) >= 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i5, View.MeasureSpec.getSize(i2)), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.f1743c != null) {
            int mode = View.MeasureSpec.getMode(i2);
            View view = this.f1742b;
            if (view != null && view.getVisibility() != 8 && mode != 1073741824) {
                if (!mo2310b(this.f1743c)) {
                    i3 = mo2309a(this.f1743c);
                } else if (!mo2310b(this.f1744d)) {
                    i3 = mo2309a(this.f1744d);
                } else {
                    i3 = 0;
                }
                if (mode == Integer.MIN_VALUE) {
                    i4 = View.MeasureSpec.getSize(i2);
                } else {
                    i4 = Integer.MAX_VALUE;
                }
                setMeasuredDimension(getMeasuredWidth(), Math.min(i3 + mo2309a(this.f1742b), i4));
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f1745e;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f1745e);
        }
        this.f1745e = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f1743c;
            if (view != null) {
                this.f1745e.setBounds(view.getLeft(), this.f1743c.getTop(), this.f1743c.getRight(), this.f1743c.getBottom());
            }
        }
        boolean z = true;
        if (!this.f1748v ? !(this.f1745e == null && this.f1746f == null) : this.f1747g != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        C0596a.m2883a(this);
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f1747g;
        if (drawable3 != null) {
            drawable3.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f1747g);
        }
        this.f1747g = drawable;
        boolean z = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f1748v && (drawable2 = this.f1747g) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f1748v ? this.f1745e == null && this.f1746f == null : this.f1747g == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        C0596a.m2883a(this);
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f1746f;
        if (drawable3 != null) {
            drawable3.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f1746f);
        }
        this.f1746f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f1749w && (drawable2 = this.f1746f) != null) {
                drawable2.setBounds(this.f1742b.getLeft(), this.f1742b.getTop(), this.f1742b.getRight(), this.f1742b.getBottom());
            }
        }
        boolean z = true;
        if (!this.f1748v ? !(this.f1745e == null && this.f1746f == null) : this.f1747g != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        C0596a.m2883a(this);
    }

    public void setTabContainer(ScrollingTabContainerView scrollingTabContainerView) {
        View view = this.f1742b;
        if (view != null) {
            removeView(view);
        }
        this.f1742b = scrollingTabContainerView;
        if (scrollingTabContainerView != null) {
            addView(scrollingTabContainerView);
            ViewGroup.LayoutParams layoutParams = scrollingTabContainerView.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            scrollingTabContainerView.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z) {
        int i;
        this.f1741a = z;
        if (z) {
            i = 393216;
        } else {
            i = 262144;
        }
        setDescendantFocusability(i);
    }

    public void setVisibility(int i) {
        boolean z;
        super.setVisibility(i);
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        Drawable drawable = this.f1745e;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.f1746f;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.f1747g;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    public boolean verifyDrawable(Drawable drawable) {
        if ((drawable != this.f1745e || this.f1748v) && ((drawable != this.f1746f || !this.f1749w) && ((drawable != this.f1747g || !this.f1748v) && !super.verifyDrawable(drawable)))) {
            return false;
        }
        return true;
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18196h2.m82502I1(this, new C0691b(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0387a.C0400m.ActionBar);
        this.f1745e = obtainStyledAttributes.getDrawable(C0387a.C0400m.ActionBar_background);
        this.f1746f = obtainStyledAttributes.getDrawable(C0387a.C0400m.ActionBar_backgroundStacked);
        this.f1750x = obtainStyledAttributes.getDimensionPixelSize(C0387a.C0400m.ActionBar_height, -1);
        boolean z = true;
        if (getId() == C0387a.C0394g.split_action_bar) {
            this.f1748v = true;
            this.f1747g = obtainStyledAttributes.getDrawable(C0387a.C0400m.ActionBar_backgroundSplit);
        }
        obtainStyledAttributes.recycle();
        if (!this.f1748v ? !(this.f1745e == null && this.f1746f == null) : this.f1747g != null) {
            z = false;
        }
        setWillNotDraw(z);
    }

    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }
}
