package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0368r0;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import androidx.appcompat.C0387a;
import androidx.appcompat.graphics.drawable.C0521c;
import androidx.core.graphics.drawable.C17549d;
import androidx.core.p027os.C17772a;
import androidx.core.view.C18402w3;
import androidx.core.widget.C18487l;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: androidx.appcompat.widget.k0 */
public class C0733k0 extends ListView {

    /* renamed from: F0 */
    public static final int f2411F0 = -1;

    /* renamed from: G0 */
    public static final int f2412G0 = -1;

    /* renamed from: E0 */
    public C0739f f2413E0;

    /* renamed from: a */
    public final Rect f2414a = new Rect();

    /* renamed from: b */
    public int f2415b = 0;

    /* renamed from: c */
    public int f2416c = 0;

    /* renamed from: d */
    public int f2417d = 0;

    /* renamed from: e */
    public int f2418e = 0;

    /* renamed from: f */
    public int f2419f;

    /* renamed from: g */
    public C0737d f2420g;

    /* renamed from: v */
    public boolean f2421v;

    /* renamed from: w */
    public boolean f2422w;

    /* renamed from: x */
    public boolean f2423x;

    /* renamed from: y */
    public C18402w3 f2424y;

    /* renamed from: z */
    public C18487l f2425z;

    @C0376v0(21)
    /* renamed from: androidx.appcompat.widget.k0$a */
    public static class C0734a {
        @C0373u
        /* renamed from: a */
        public static void m3617a(View view, float f, float f2) {
            view.drawableHotspotChanged(f, f2);
        }
    }

    @C0376v0(30)
    /* renamed from: androidx.appcompat.widget.k0$b */
    public static class C0735b {

        /* renamed from: a */
        public static Method f2426a;

        /* renamed from: b */
        public static Method f2427b;

        /* renamed from: c */
        public static Method f2428c;

        /* renamed from: d */
        public static boolean f2429d = true;

        static {
            Class<AdapterView> cls = AdapterView.class;
            Class<AbsListView> cls2 = AbsListView.class;
            try {
                Class cls3 = Integer.TYPE;
                Class cls4 = Float.TYPE;
                Method declaredMethod = cls2.getDeclaredMethod("positionSelector", new Class[]{cls3, View.class, Boolean.TYPE, cls4, cls4});
                f2426a = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = cls.getDeclaredMethod("setSelectedPositionInt", new Class[]{cls3});
                f2427b = declaredMethod2;
                declaredMethod2.setAccessible(true);
                Method declaredMethod3 = cls.getDeclaredMethod("setNextSelectedPositionInt", new Class[]{cls3});
                f2428c = declaredMethod3;
                declaredMethod3.setAccessible(true);
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }
        }

        /* renamed from: a */
        public static boolean m3618a() {
            return f2429d;
        }

        @SuppressLint({"BanUncheckedReflection"})
        /* renamed from: b */
        public static void m3619b(C0733k0 k0Var, int i, View view) {
            try {
                f2426a.invoke(k0Var, new Object[]{Integer.valueOf(i), view, Boolean.FALSE, -1, -1});
                f2427b.invoke(k0Var, new Object[]{Integer.valueOf(i)});
                f2428c.invoke(k0Var, new Object[]{Integer.valueOf(i)});
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e2) {
                e2.printStackTrace();
            }
        }
    }

    @C0376v0(33)
    /* renamed from: androidx.appcompat.widget.k0$c */
    public static class C0736c {
        @C0373u
        /* renamed from: a */
        public static boolean m3620a(AbsListView absListView) {
            return absListView.isSelectedChildViewEnabled();
        }

        @C0373u
        /* renamed from: b */
        public static void m3621b(AbsListView absListView, boolean z) {
            absListView.setSelectedChildViewEnabled(z);
        }
    }

    /* renamed from: androidx.appcompat.widget.k0$d */
    public static class C0737d extends C0521c {

        /* renamed from: b */
        public boolean f2430b = true;

        public C0737d(Drawable drawable) {
            super(drawable);
        }

        /* renamed from: c */
        public void mo3522c(boolean z) {
            this.f2430b = z;
        }

        public void draw(Canvas canvas) {
            if (this.f2430b) {
                super.draw(canvas);
            }
        }

        public void setHotspot(float f, float f2) {
            if (this.f2430b) {
                super.setHotspot(f, f2);
            }
        }

        public void setHotspotBounds(int i, int i2, int i3, int i4) {
            if (this.f2430b) {
                super.setHotspotBounds(i, i2, i3, i4);
            }
        }

        public boolean setState(int[] iArr) {
            if (this.f2430b) {
                return super.setState(iArr);
            }
            return false;
        }

        public boolean setVisible(boolean z, boolean z2) {
            if (this.f2430b) {
                return super.setVisible(z, z2);
            }
            return false;
        }
    }

    /* renamed from: androidx.appcompat.widget.k0$e */
    public static class C0738e {

        /* renamed from: a */
        public static final Field f2431a;

        static {
            Field field = null;
            try {
                field = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
                field.setAccessible(true);
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
            }
            f2431a = field;
        }

        /* renamed from: a */
        public static boolean m3623a(AbsListView absListView) {
            Field field = f2431a;
            if (field == null) {
                return false;
            }
            try {
                return field.getBoolean(absListView);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
                return false;
            }
        }

        /* renamed from: b */
        public static void m3624b(AbsListView absListView, boolean z) {
            Field field = f2431a;
            if (field != null) {
                try {
                    field.set(absListView, Boolean.valueOf(z));
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.k0$f */
    public class C0739f implements Runnable {
        public C0739f() {
        }

        /* renamed from: a */
        public void mo3523a() {
            C0733k0 k0Var = C0733k0.this;
            k0Var.f2413E0 = null;
            k0Var.removeCallbacks(this);
        }

        /* renamed from: c */
        public void mo3524c() {
            C0733k0.this.post(this);
        }

        public void run() {
            C0733k0 k0Var = C0733k0.this;
            k0Var.f2413E0 = null;
            k0Var.drawableStateChanged();
        }
    }

    public C0733k0(@C0359n0 Context context, boolean z) {
        super(context, (AttributeSet) null, C0387a.C0389b.dropDownListViewStyle);
        this.f2422w = z;
        setCacheColorHint(0);
    }

    /* renamed from: a */
    public final void mo3506a() {
        this.f2423x = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.f2419f - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
        C18402w3 w3Var = this.f2424y;
        if (w3Var != null) {
            w3Var.mo53060d();
            this.f2424y = null;
        }
    }

    /* renamed from: b */
    public final void mo3507b(View view, int i) {
        performItemClick(view, i, getItemIdAtPosition(i));
    }

    /* renamed from: c */
    public final void mo3508c(Canvas canvas) {
        Drawable selector;
        if (!this.f2414a.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(this.f2414a);
            selector.draw(canvas);
        }
    }

    /* renamed from: d */
    public int mo2869d(int i, boolean z) {
        int i2;
        ListAdapter adapter = getAdapter();
        if (adapter != null && !isInTouchMode()) {
            int count = adapter.getCount();
            if (!getAdapter().areAllItemsEnabled()) {
                if (z) {
                    i2 = Math.max(0, i);
                    while (i2 < count && !adapter.isEnabled(i2)) {
                        i2++;
                    }
                } else {
                    int min = Math.min(i, count - 1);
                    while (i2 >= 0 && !adapter.isEnabled(i2)) {
                        min = i2 - 1;
                    }
                }
                if (i2 < 0 || i2 >= count) {
                    return -1;
                }
                return i2;
            } else if (i < 0 || i >= count) {
                return -1;
            } else {
                return i;
            }
        }
        return -1;
    }

    public void dispatchDraw(Canvas canvas) {
        mo3508c(canvas);
        super.dispatchDraw(canvas);
    }

    public void drawableStateChanged() {
        if (this.f2413E0 == null) {
            super.drawableStateChanged();
            mo3515k(true);
            mo3519o();
        }
    }

    /* renamed from: e */
    public int mo2870e(int i, int i2, int i3, int i4, int i5) {
        int i6;
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i7 = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        View view = null;
        while (i8 < count) {
            int itemViewType = adapter.getItemViewType(i8);
            if (itemViewType != i9) {
                view = null;
                i9 = itemViewType;
            }
            view = adapter.getView(i8, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i11 = layoutParams.height;
            if (i11 > 0) {
                i6 = View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
            } else {
                i6 = View.MeasureSpec.makeMeasureSpec(0, 0);
            }
            view.measure(i, i6);
            view.forceLayout();
            if (i8 > 0) {
                i7 += dividerHeight;
            }
            i7 += view.getMeasuredHeight();
            if (i7 < i4) {
                if (i5 >= 0 && i8 >= i5) {
                    i10 = i7;
                }
                i8++;
            } else if (i5 < 0 || i8 <= i5 || i10 <= 0 || i7 == i4) {
                return i4;
            } else {
                return i10;
            }
        }
        return i7;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000c, code lost:
        if (r0 != 3) goto L_0x000e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x001e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0065  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo2871f(android.view.MotionEvent r8, int r9) {
        /*
            r7 = this;
            int r0 = r8.getActionMasked()
            r1 = 1
            r2 = 0
            if (r0 == r1) goto L_0x0016
            r3 = 2
            if (r0 == r3) goto L_0x0014
            r9 = 3
            if (r0 == r9) goto L_0x0011
        L_0x000e:
            r3 = r1
            r9 = r2
            goto L_0x0046
        L_0x0011:
            r9 = r2
            r3 = r9
            goto L_0x0046
        L_0x0014:
            r3 = r1
            goto L_0x0017
        L_0x0016:
            r3 = r2
        L_0x0017:
            int r9 = r8.findPointerIndex(r9)
            if (r9 >= 0) goto L_0x001e
            goto L_0x0011
        L_0x001e:
            float r4 = r8.getX(r9)
            int r4 = (int) r4
            float r9 = r8.getY(r9)
            int r9 = (int) r9
            int r5 = r7.pointToPosition(r4, r9)
            r6 = -1
            if (r5 != r6) goto L_0x0031
            r9 = r1
            goto L_0x0046
        L_0x0031:
            int r3 = r7.getFirstVisiblePosition()
            int r3 = r5 - r3
            android.view.View r3 = r7.getChildAt(r3)
            float r4 = (float) r4
            float r9 = (float) r9
            r7.mo3514j(r3, r5, r4, r9)
            if (r0 != r1) goto L_0x000e
            r7.mo3507b(r3, r5)
            goto L_0x000e
        L_0x0046:
            if (r3 == 0) goto L_0x004a
            if (r9 == 0) goto L_0x004d
        L_0x004a:
            r7.mo3506a()
        L_0x004d:
            if (r3 == 0) goto L_0x0065
            androidx.core.widget.l r9 = r7.f2425z
            if (r9 != 0) goto L_0x005a
            androidx.core.widget.l r9 = new androidx.core.widget.l
            r9.<init>(r7)
            r7.f2425z = r9
        L_0x005a:
            androidx.core.widget.l r9 = r7.f2425z
            r9.mo53318o(r1)
            androidx.core.widget.l r9 = r7.f2425z
            r9.onTouch(r7, r8)
            goto L_0x006c
        L_0x0065:
            androidx.core.widget.l r8 = r7.f2425z
            if (r8 == 0) goto L_0x006c
            r8.mo53318o(r2)
        L_0x006c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0733k0.mo2871f(android.view.MotionEvent, int):boolean");
    }

    /* renamed from: g */
    public final void mo3511g(int i, View view) {
        Rect rect = this.f2414a;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.f2415b;
        rect.top -= this.f2416c;
        rect.right += this.f2417d;
        rect.bottom += this.f2418e;
        boolean l = mo3516l();
        if (view.isEnabled() != l) {
            mo3517m(!l);
            if (i != -1) {
                refreshDrawableState();
            }
        }
    }

    /* renamed from: h */
    public final void mo3512h(int i, View view) {
        boolean z;
        Drawable selector = getSelector();
        boolean z2 = true;
        if (selector == null || i == -1) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            selector.setVisible(false, false);
        }
        mo3511g(i, view);
        if (z) {
            Rect rect = this.f2414a;
            float exactCenterX = rect.exactCenterX();
            float exactCenterY = rect.exactCenterY();
            if (getVisibility() != 0) {
                z2 = false;
            }
            selector.setVisible(z2, false);
            C17549d.m80449k(selector, exactCenterX, exactCenterY);
        }
    }

    public boolean hasFocus() {
        return this.f2422w || super.hasFocus();
    }

    public boolean hasWindowFocus() {
        return this.f2422w || super.hasWindowFocus();
    }

    /* renamed from: i */
    public final void mo3513i(int i, View view, float f, float f2) {
        mo3512h(i, view);
        Drawable selector = getSelector();
        if (selector != null && i != -1) {
            C17549d.m80449k(selector, f, f2);
        }
    }

    public boolean isFocused() {
        return this.f2422w || super.isFocused();
    }

    public boolean isInTouchMode() {
        return (this.f2422w && this.f2421v) || super.isInTouchMode();
    }

    /* renamed from: j */
    public final void mo3514j(View view, int i, float f, float f2) {
        View childAt;
        this.f2423x = true;
        C0734a.m3617a(this, f, f2);
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        int i2 = this.f2419f;
        if (!(i2 == -1 || (childAt = getChildAt(i2 - getFirstVisiblePosition())) == null || childAt == view || !childAt.isPressed())) {
            childAt.setPressed(false);
        }
        this.f2419f = i;
        C0734a.m3617a(view, f - ((float) view.getLeft()), f2 - ((float) view.getTop()));
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        mo3513i(i, view, f, f2);
        mo3515k(false);
        refreshDrawableState();
    }

    /* renamed from: k */
    public final void mo3515k(boolean z) {
        C0737d dVar = this.f2420g;
        if (dVar != null) {
            dVar.mo3522c(z);
        }
    }

    @C0368r0(markerClass = {C17772a.C17773a.class})
    /* renamed from: l */
    public final boolean mo3516l() {
        if (C17772a.m81155k()) {
            return C0736c.m3620a(this);
        }
        return C0738e.m3623a(this);
    }

    @C0368r0(markerClass = {C17772a.C17773a.class})
    /* renamed from: m */
    public final void mo3517m(boolean z) {
        if (C17772a.m81155k()) {
            C0736c.m3621b(this, z);
        } else {
            C0738e.m3624b(this, z);
        }
    }

    /* renamed from: n */
    public final boolean mo3518n() {
        return this.f2423x;
    }

    /* renamed from: o */
    public final void mo3519o() {
        Drawable selector = getSelector();
        if (selector != null && mo3518n() && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    public void onDetachedFromWindow() {
        this.f2413E0 = null;
        super.onDetachedFromWindow();
    }

    public boolean onHoverEvent(@C0359n0 MotionEvent motionEvent) {
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f2413E0 == null) {
            C0739f fVar = new C0739f();
            this.f2413E0 = fVar;
            fVar.mo3524c();
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (!(pointToPosition == -1 || pointToPosition == getSelectedItemPosition())) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    requestFocus();
                    if (i < 30 || !C0735b.m3618a()) {
                        setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                    } else {
                        C0735b.m3619b(this, pointToPosition, childAt);
                    }
                }
                mo3519o();
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f2419f = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        C0739f fVar = this.f2413E0;
        if (fVar != null) {
            fVar.mo3523a();
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z) {
        this.f2421v = z;
    }

    public void setSelector(Drawable drawable) {
        C0737d dVar;
        if (drawable != null) {
            dVar = new C0737d(drawable);
        } else {
            dVar = null;
        }
        this.f2420g = dVar;
        super.setSelector(dVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f2415b = rect.left;
        this.f2416c = rect.top;
        this.f2417d = rect.right;
        this.f2418e = rect.bottom;
    }
}
