package com.google.android.material.navigation;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.annotation.C0327c1;
import androidx.annotation.C0329d0;
import androidx.annotation.C0347i0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0364q;
import androidx.annotation.C0366r;
import androidx.annotation.C0372t0;
import androidx.annotation.C0375v;
import androidx.annotation.RestrictTo;
import androidx.appcompat.C0387a;
import androidx.appcompat.content.res.C0507a;
import androidx.appcompat.view.C0543g;
import androidx.appcompat.view.menu.C0568g;
import androidx.appcompat.view.menu.C0573j;
import androidx.appcompat.widget.C0722h1;
import androidx.core.content.C17318d;
import androidx.core.view.C18196h2;
import androidx.core.view.C18306m0;
import androidx.core.view.C18436z4;
import androidx.customview.view.AbsSavedState;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.C31076a;
import com.google.android.material.internal.C31391c;
import com.google.android.material.internal.C31398i;
import com.google.android.material.internal.C31399j;
import com.google.android.material.internal.ScrimInsetsFrameLayout;
import com.google.android.material.resources.C31500c;
import com.google.android.material.shape.C31525j;
import com.google.android.material.shape.C31530k;
import com.google.android.material.shape.C31534o;
import com.google.android.material.shape.C31538p;

public class NavigationView extends ScrimInsetsFrameLayout {

    /* renamed from: K0 */
    public static final int[] f76083K0 = {16842912};

    /* renamed from: L0 */
    public static final int[] f76084L0 = {-16842910};

    /* renamed from: M0 */
    public static final int f76085M0 = C31076a.C31090n.Widget_Design_NavigationView;

    /* renamed from: N0 */
    public static final int f76086N0 = 1;

    /* renamed from: E0 */
    public boolean f76087E0;

    /* renamed from: F0 */
    public boolean f76088F0;

    /* renamed from: G0 */
    public int f76089G0;
    @C0372t0

    /* renamed from: H0 */
    public int f76090H0;
    @C0363p0

    /* renamed from: I0 */
    public Path f76091I0;

    /* renamed from: J0 */
    public final RectF f76092J0;
    @C0359n0

    /* renamed from: f */
    public final C31398i f76093f;

    /* renamed from: g */
    public final C31399j f76094g;

    /* renamed from: v */
    public C31457c f76095v;

    /* renamed from: w */
    public final int f76096w;

    /* renamed from: x */
    public final int[] f76097x;

    /* renamed from: y */
    public MenuInflater f76098y;

    /* renamed from: z */
    public ViewTreeObserver.OnGlobalLayoutListener f76099z;

    /* renamed from: com.google.android.material.navigation.NavigationView$a */
    public class C31455a implements C0568g.C0569a {
        public C31455a() {
        }

        /* renamed from: a */
        public boolean mo1111a(C0568g gVar, MenuItem menuItem) {
            C31457c cVar = NavigationView.this.f76095v;
            return cVar != null && cVar.mo58609a(menuItem);
        }

        /* renamed from: b */
        public void mo1114b(C0568g gVar) {
        }
    }

    /* renamed from: com.google.android.material.navigation.NavigationView$b */
    public class C31456b implements ViewTreeObserver.OnGlobalLayoutListener {
        public C31456b() {
        }

        public void onGlobalLayout() {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            NavigationView navigationView = NavigationView.this;
            navigationView.getLocationOnScreen(navigationView.f76097x);
            boolean z5 = true;
            if (NavigationView.this.f76097x[1] == 0) {
                z = true;
            } else {
                z = false;
            }
            NavigationView.this.f76094g.mo90104F(z);
            NavigationView navigationView2 = NavigationView.this;
            if (!z || !navigationView2.mo90398m()) {
                z2 = false;
            } else {
                z2 = true;
            }
            navigationView2.setDrawTopInsetForeground(z2);
            Activity a = C31391c.m126854a(NavigationView.this.getContext());
            if (a != null) {
                if (a.findViewById(16908290).getHeight() == NavigationView.this.getHeight()) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (Color.alpha(a.getWindow().getNavigationBarColor()) != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                NavigationView navigationView3 = NavigationView.this;
                if (!z3 || !z4 || !navigationView3.mo90397l()) {
                    z5 = false;
                }
                navigationView3.setDrawBottomInsetForeground(z5);
            }
        }
    }

    /* renamed from: com.google.android.material.navigation.NavigationView$c */
    public interface C31457c {
        /* renamed from: a */
        boolean mo58609a(@C0359n0 MenuItem menuItem);
    }

    public NavigationView(@C0359n0 Context context) {
        this(context, (AttributeSet) null);
    }

    private MenuInflater getMenuInflater() {
        if (this.f76098y == null) {
            this.f76098y = new C0543g(getContext());
        }
        return this.f76098y;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: a */
    public void mo89970a(@C0359n0 C18436z4 z4Var) {
        this.f76094g.mo90127n(z4Var);
    }

    /* renamed from: d */
    public void mo90374d(@C0359n0 View view) {
        this.f76094g.mo90126c(view);
    }

    public void dispatchDraw(@C0359n0 Canvas canvas) {
        if (this.f76091I0 == null) {
            super.dispatchDraw(canvas);
            return;
        }
        int save = canvas.save();
        canvas.clipPath(this.f76091I0);
        super.dispatchDraw(canvas);
        canvas.restoreToCount(save);
    }

    @C0363p0
    /* renamed from: e */
    public final ColorStateList mo90376e(int i) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i, typedValue, true)) {
            return null;
        }
        ColorStateList a = C0507a.m2345a(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(C0387a.C0389b.colorPrimary, typedValue, true)) {
            return null;
        }
        int i2 = typedValue.data;
        int defaultColor = a.getDefaultColor();
        int[] iArr = f76084L0;
        return new ColorStateList(new int[][]{iArr, f76083K0, FrameLayout.EMPTY_STATE_SET}, new int[]{a.getColorForState(iArr, defaultColor), i2, defaultColor});
    }

    @C0359n0
    /* renamed from: f */
    public final Drawable mo90377f(@C0359n0 C0722h1 h1Var) {
        return mo90378g(h1Var, C31500c.m127364b(getContext(), h1Var, C31076a.C31091o.NavigationView_itemShapeFillColor));
    }

    @C0359n0
    /* renamed from: g */
    public final Drawable mo90378g(@C0359n0 C0722h1 h1Var, @C0363p0 ColorStateList colorStateList) {
        C31525j jVar = new C31525j(C31534o.m127562b(getContext(), h1Var.mo3479u(C31076a.C31091o.NavigationView_itemShapeAppearance, 0), h1Var.mo3479u(C31076a.C31091o.NavigationView_itemShapeAppearanceOverlay, 0)).mo90843m());
        jVar.mo90777o0(colorStateList);
        return new InsetDrawable(jVar, h1Var.mo3465g(C31076a.C31091o.NavigationView_itemShapeInsetStart, 0), h1Var.mo3465g(C31076a.C31091o.NavigationView_itemShapeInsetTop, 0), h1Var.mo3465g(C31076a.C31091o.NavigationView_itemShapeInsetEnd, 0), h1Var.mo3465g(C31076a.C31091o.NavigationView_itemShapeInsetBottom, 0));
    }

    @C0363p0
    public MenuItem getCheckedItem() {
        return this.f76094g.mo90128o();
    }

    @C0372t0
    public int getDividerInsetEnd() {
        return this.f76094g.mo90129p();
    }

    @C0372t0
    public int getDividerInsetStart() {
        return this.f76094g.mo90130q();
    }

    public int getHeaderCount() {
        return this.f76094g.mo90131r();
    }

    @C0363p0
    public Drawable getItemBackground() {
        return this.f76094g.mo90133t();
    }

    @C0366r
    public int getItemHorizontalPadding() {
        return this.f76094g.mo90134u();
    }

    @C0366r
    public int getItemIconPadding() {
        return this.f76094g.mo90135v();
    }

    @C0363p0
    public ColorStateList getItemIconTintList() {
        return this.f76094g.mo90138y();
    }

    public int getItemMaxLines() {
        return this.f76094g.mo90136w();
    }

    @C0363p0
    public ColorStateList getItemTextColor() {
        return this.f76094g.mo90137x();
    }

    @C0372t0
    public int getItemVerticalPadding() {
        return this.f76094g.mo90139z();
    }

    @C0359n0
    public Menu getMenu() {
        return this.f76093f;
    }

    @C0372t0
    public int getSubheaderInsetEnd() {
        return this.f76094g.mo90099A();
    }

    @C0372t0
    public int getSubheaderInsetStart() {
        return this.f76094g.mo90100B();
    }

    /* renamed from: h */
    public View mo90393h(int i) {
        return this.f76094g.mo90132s(i);
    }

    /* renamed from: i */
    public final boolean mo90394i(@C0359n0 C0722h1 h1Var) {
        if (h1Var.mo3455C(C31076a.C31091o.NavigationView_itemShapeAppearance) || h1Var.mo3455C(C31076a.C31091o.NavigationView_itemShapeAppearanceOverlay)) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public View mo90395j(@C0347i0 int i) {
        return this.f76094g.mo90101C(i);
    }

    /* renamed from: k */
    public void mo90396k(int i) {
        this.f76094g.mo90124Z(true);
        getMenuInflater().inflate(i, this.f76093f);
        this.f76094g.mo90124Z(false);
        this.f76094g.mo1943j(false);
    }

    /* renamed from: l */
    public boolean mo90397l() {
        return this.f76088F0;
    }

    /* renamed from: m */
    public boolean mo90398m() {
        return this.f76087E0;
    }

    /* renamed from: n */
    public final void mo90399n(@C0372t0 int i, @C0372t0 int i2) {
        if (!(getParent() instanceof DrawerLayout) || this.f76090H0 <= 0 || !(getBackground() instanceof C31525j)) {
            this.f76091I0 = null;
            this.f76092J0.setEmpty();
            return;
        }
        C31525j jVar = (C31525j) getBackground();
        C31534o.C31536b v = jVar.getShapeAppearanceModel().mo90822v();
        if (C18306m0.m82991d(this.f76089G0, C18196h2.m82553Z(this)) == 3) {
            v.mo90841P((float) this.f76090H0);
            v.mo90828C((float) this.f76090H0);
        } else {
            v.mo90836K((float) this.f76090H0);
            v.mo90853x((float) this.f76090H0);
        }
        jVar.setShapeAppearanceModel(v.mo90843m());
        if (this.f76091I0 == null) {
            this.f76091I0 = new Path();
        }
        this.f76091I0.reset();
        this.f76092J0.set(0.0f, 0.0f, (float) i, (float) i2);
        C31538p.m127630k().mo90859d(jVar.getShapeAppearanceModel(), jVar.mo90799z(), this.f76092J0, this.f76091I0);
        invalidate();
    }

    /* renamed from: o */
    public void mo90400o(@C0359n0 View view) {
        this.f76094g.mo90103E(view);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C31530k.m127554e(this);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalLayoutListener(this.f76099z);
    }

    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE) {
            i = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), this.f76096w), 1073741824);
        } else if (mode == 0) {
            i = View.MeasureSpec.makeMeasureSpec(this.f76096w, 1073741824);
        }
        super.onMeasure(i, i2);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.mo53419a());
        this.f76093f.mo2033U(savedState.f76100c);
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        savedState.f76100c = bundle;
        this.f76093f.mo2035W(bundle);
        return savedState;
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        mo90399n(i, i2);
    }

    /* renamed from: p */
    public final void mo90405p() {
        this.f76099z = new C31456b();
        getViewTreeObserver().addOnGlobalLayoutListener(this.f76099z);
    }

    public void setBottomInsetScrimEnabled(boolean z) {
        this.f76088F0 = z;
    }

    public void setCheckedItem(@C0329d0 int i) {
        MenuItem findItem = this.f76093f.findItem(i);
        if (findItem != null) {
            this.f76094g.mo90105G((C0573j) findItem);
        }
    }

    public void setDividerInsetEnd(@C0372t0 int i) {
        this.f76094g.mo90106H(i);
    }

    public void setDividerInsetStart(@C0372t0 int i) {
        this.f76094g.mo90107I(i);
    }

    public void setElevation(float f) {
        super.setElevation(f);
        C31530k.m127553d(this, f);
    }

    public void setItemBackground(@C0363p0 Drawable drawable) {
        this.f76094g.mo90109K(drawable);
    }

    public void setItemBackgroundResource(@C0375v int i) {
        setItemBackground(C17318d.m79726i(getContext(), i));
    }

    public void setItemHorizontalPadding(@C0366r int i) {
        this.f76094g.mo90111M(i);
    }

    public void setItemHorizontalPaddingResource(@C0364q int i) {
        this.f76094g.mo90111M(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconPadding(@C0366r int i) {
        this.f76094g.mo90112N(i);
    }

    public void setItemIconPaddingResource(int i) {
        this.f76094g.mo90112N(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconSize(@C0366r int i) {
        this.f76094g.mo90113O(i);
    }

    public void setItemIconTintList(@C0363p0 ColorStateList colorStateList) {
        this.f76094g.mo90114P(colorStateList);
    }

    public void setItemMaxLines(int i) {
        this.f76094g.mo90115Q(i);
    }

    public void setItemTextAppearance(@C0327c1 int i) {
        this.f76094g.mo90116R(i);
    }

    public void setItemTextColor(@C0363p0 ColorStateList colorStateList) {
        this.f76094g.mo90117S(colorStateList);
    }

    public void setItemVerticalPadding(@C0372t0 int i) {
        this.f76094g.mo90118T(i);
    }

    public void setItemVerticalPaddingResource(@C0364q int i) {
        this.f76094g.mo90118T(getResources().getDimensionPixelSize(i));
    }

    public void setNavigationItemSelectedListener(@C0363p0 C31457c cVar) {
        this.f76095v = cVar;
    }

    public void setOverScrollMode(int i) {
        super.setOverScrollMode(i);
        C31399j jVar = this.f76094g;
        if (jVar != null) {
            jVar.mo90119U(i);
        }
    }

    public void setSubheaderInsetEnd(@C0372t0 int i) {
        this.f76094g.mo90122X(i);
    }

    public void setSubheaderInsetStart(@C0372t0 int i) {
        this.f76094g.mo90122X(i);
    }

    public void setTopInsetScrimEnabled(boolean z) {
        this.f76087E0 = z;
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C31454a();
        @C0363p0

        /* renamed from: c */
        public Bundle f76100c;

        /* renamed from: com.google.android.material.navigation.NavigationView$SavedState$a */
        public class C31454a implements Parcelable.ClassLoaderCreator<SavedState> {
            @C0363p0
            /* renamed from: a */
            public SavedState createFromParcel(@C0359n0 Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }

            @C0359n0
            /* renamed from: b */
            public SavedState createFromParcel(@C0359n0 Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @C0359n0
            /* renamed from: c */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(@C0359n0 Parcel parcel, @C0363p0 ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f76100c = parcel.readBundle(classLoader);
        }

        public void writeToParcel(@C0359n0 Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(this.f76100c);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public NavigationView(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet) {
        this(context, attributeSet, C31076a.C31079c.navigationViewStyle);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public NavigationView(@androidx.annotation.C0359n0 android.content.Context r17, @androidx.annotation.C0363p0 android.util.AttributeSet r18, int r19) {
        /*
            r16 = this;
            r0 = r16
            r7 = r18
            r8 = r19
            int r9 = f76085M0
            r1 = r17
            android.content.Context r1 = com.google.android.material.theme.overlay.C31683a.m128455c(r1, r7, r8, r9)
            r0.<init>(r1, r7, r8)
            com.google.android.material.internal.j r10 = new com.google.android.material.internal.j
            r10.<init>()
            r0.f76094g = r10
            r1 = 2
            int[] r1 = new int[r1]
            r0.f76097x = r1
            r11 = 1
            r0.f76087E0 = r11
            r0.f76088F0 = r11
            r12 = 0
            r0.f76089G0 = r12
            r0.f76090H0 = r12
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r0.f76092J0 = r1
            android.content.Context r13 = r16.getContext()
            com.google.android.material.internal.i r14 = new com.google.android.material.internal.i
            r14.<init>(r13)
            r0.f76093f = r14
            int[] r3 = com.google.android.material.C31076a.C31091o.NavigationView
            int[] r6 = new int[r12]
            r1 = r13
            r2 = r18
            r4 = r19
            r5 = r9
            androidx.appcompat.widget.h1 r1 = com.google.android.material.internal.C31422p.m126971k(r1, r2, r3, r4, r5, r6)
            int r2 = com.google.android.material.C31076a.C31091o.NavigationView_android_background
            boolean r3 = r1.mo3455C(r2)
            if (r3 == 0) goto L_0x0056
            android.graphics.drawable.Drawable r2 = r1.mo3466h(r2)
            androidx.core.view.C18196h2.m82502I1(r0, r2)
        L_0x0056:
            int r2 = com.google.android.material.C31076a.C31091o.NavigationView_drawerLayoutCornerSize
            int r2 = r1.mo3465g(r2, r12)
            r0.f76090H0 = r2
            int r2 = com.google.android.material.C31076a.C31091o.NavigationView_android_layout_gravity
            int r2 = r1.mo3473o(r2, r12)
            r0.f76089G0 = r2
            android.graphics.drawable.Drawable r2 = r16.getBackground()
            if (r2 == 0) goto L_0x0074
            android.graphics.drawable.Drawable r2 = r16.getBackground()
            boolean r2 = r2 instanceof android.graphics.drawable.ColorDrawable
            if (r2 == 0) goto L_0x009c
        L_0x0074:
            com.google.android.material.shape.o$b r2 = com.google.android.material.shape.C31534o.m127565e(r13, r7, r8, r9)
            com.google.android.material.shape.o r2 = r2.mo90843m()
            android.graphics.drawable.Drawable r3 = r16.getBackground()
            com.google.android.material.shape.j r4 = new com.google.android.material.shape.j
            r4.<init>((com.google.android.material.shape.C31534o) r2)
            boolean r2 = r3 instanceof android.graphics.drawable.ColorDrawable
            if (r2 == 0) goto L_0x0096
            android.graphics.drawable.ColorDrawable r3 = (android.graphics.drawable.ColorDrawable) r3
            int r2 = r3.getColor()
            android.content.res.ColorStateList r2 = android.content.res.ColorStateList.valueOf(r2)
            r4.mo90777o0(r2)
        L_0x0096:
            r4.mo90750Z(r13)
            androidx.core.view.C18196h2.m82502I1(r0, r4)
        L_0x009c:
            int r2 = com.google.android.material.C31076a.C31091o.NavigationView_elevation
            boolean r3 = r1.mo3455C(r2)
            if (r3 == 0) goto L_0x00ac
            int r2 = r1.mo3465g(r2, r12)
            float r2 = (float) r2
            r0.setElevation(r2)
        L_0x00ac:
            int r2 = com.google.android.material.C31076a.C31091o.NavigationView_android_fitsSystemWindows
            boolean r2 = r1.mo3459a(r2, r12)
            r0.setFitsSystemWindows(r2)
            int r2 = com.google.android.material.C31076a.C31091o.NavigationView_android_maxWidth
            int r2 = r1.mo3465g(r2, r12)
            r0.f76096w = r2
            int r2 = com.google.android.material.C31076a.C31091o.NavigationView_subheaderColor
            boolean r3 = r1.mo3455C(r2)
            r4 = 0
            if (r3 == 0) goto L_0x00cb
            android.content.res.ColorStateList r2 = r1.mo3462d(r2)
            goto L_0x00cc
        L_0x00cb:
            r2 = r4
        L_0x00cc:
            int r3 = com.google.android.material.C31076a.C31091o.NavigationView_subheaderTextAppearance
            boolean r5 = r1.mo3455C(r3)
            if (r5 == 0) goto L_0x00d9
            int r3 = r1.mo3479u(r3, r12)
            goto L_0x00da
        L_0x00d9:
            r3 = r12
        L_0x00da:
            r5 = 16842808(0x1010038, float:2.3693715E-38)
            if (r3 != 0) goto L_0x00e5
            if (r2 != 0) goto L_0x00e5
            android.content.res.ColorStateList r2 = r0.mo90376e(r5)
        L_0x00e5:
            int r6 = com.google.android.material.C31076a.C31091o.NavigationView_itemIconTint
            boolean r7 = r1.mo3455C(r6)
            if (r7 == 0) goto L_0x00f2
            android.content.res.ColorStateList r5 = r1.mo3462d(r6)
            goto L_0x00f6
        L_0x00f2:
            android.content.res.ColorStateList r5 = r0.mo90376e(r5)
        L_0x00f6:
            int r6 = com.google.android.material.C31076a.C31091o.NavigationView_itemTextAppearance
            boolean r7 = r1.mo3455C(r6)
            if (r7 == 0) goto L_0x0103
            int r6 = r1.mo3479u(r6, r12)
            goto L_0x0104
        L_0x0103:
            r6 = r12
        L_0x0104:
            int r7 = com.google.android.material.C31076a.C31091o.NavigationView_itemIconSize
            boolean r8 = r1.mo3455C(r7)
            if (r8 == 0) goto L_0x0113
            int r7 = r1.mo3465g(r7, r12)
            r0.setItemIconSize(r7)
        L_0x0113:
            int r7 = com.google.android.material.C31076a.C31091o.NavigationView_itemTextColor
            boolean r8 = r1.mo3455C(r7)
            if (r8 == 0) goto L_0x0120
            android.content.res.ColorStateList r7 = r1.mo3462d(r7)
            goto L_0x0121
        L_0x0120:
            r7 = r4
        L_0x0121:
            if (r6 != 0) goto L_0x012c
            if (r7 != 0) goto L_0x012c
            r7 = 16842806(0x1010036, float:2.369371E-38)
            android.content.res.ColorStateList r7 = r0.mo90376e(r7)
        L_0x012c:
            int r8 = com.google.android.material.C31076a.C31091o.NavigationView_itemBackground
            android.graphics.drawable.Drawable r8 = r1.mo3466h(r8)
            if (r8 != 0) goto L_0x0156
            boolean r9 = r0.mo90394i(r1)
            if (r9 == 0) goto L_0x0156
            android.graphics.drawable.Drawable r8 = r0.mo90377f(r1)
            int r9 = com.google.android.material.C31076a.C31091o.NavigationView_itemRippleColor
            android.content.res.ColorStateList r9 = com.google.android.material.resources.C31500c.m127364b(r13, r1, r9)
            if (r9 == 0) goto L_0x0156
            android.graphics.drawable.Drawable r15 = r0.mo90378g(r1, r4)
            android.graphics.drawable.RippleDrawable r11 = new android.graphics.drawable.RippleDrawable
            android.content.res.ColorStateList r9 = com.google.android.material.ripple.C31511b.m127405d(r9)
            r11.<init>(r9, r4, r15)
            r10.mo90110L(r11)
        L_0x0156:
            int r4 = com.google.android.material.C31076a.C31091o.NavigationView_itemHorizontalPadding
            boolean r9 = r1.mo3455C(r4)
            if (r9 == 0) goto L_0x0165
            int r4 = r1.mo3465g(r4, r12)
            r0.setItemHorizontalPadding(r4)
        L_0x0165:
            int r4 = com.google.android.material.C31076a.C31091o.NavigationView_itemVerticalPadding
            boolean r9 = r1.mo3455C(r4)
            if (r9 == 0) goto L_0x0174
            int r4 = r1.mo3465g(r4, r12)
            r0.setItemVerticalPadding(r4)
        L_0x0174:
            int r4 = com.google.android.material.C31076a.C31091o.NavigationView_dividerInsetStart
            int r4 = r1.mo3465g(r4, r12)
            r0.setDividerInsetStart(r4)
            int r4 = com.google.android.material.C31076a.C31091o.NavigationView_dividerInsetEnd
            int r4 = r1.mo3465g(r4, r12)
            r0.setDividerInsetEnd(r4)
            int r4 = com.google.android.material.C31076a.C31091o.NavigationView_subheaderInsetStart
            int r4 = r1.mo3465g(r4, r12)
            r0.setSubheaderInsetStart(r4)
            int r4 = com.google.android.material.C31076a.C31091o.NavigationView_subheaderInsetEnd
            int r4 = r1.mo3465g(r4, r12)
            r0.setSubheaderInsetEnd(r4)
            int r4 = com.google.android.material.C31076a.C31091o.NavigationView_topInsetScrimEnabled
            boolean r9 = r0.f76087E0
            boolean r4 = r1.mo3459a(r4, r9)
            r0.setTopInsetScrimEnabled(r4)
            int r4 = com.google.android.material.C31076a.C31091o.NavigationView_bottomInsetScrimEnabled
            boolean r9 = r0.f76088F0
            boolean r4 = r1.mo3459a(r4, r9)
            r0.setBottomInsetScrimEnabled(r4)
            int r4 = com.google.android.material.C31076a.C31091o.NavigationView_itemIconPadding
            int r4 = r1.mo3465g(r4, r12)
            int r9 = com.google.android.material.C31076a.C31091o.NavigationView_itemMaxLines
            r11 = 1
            int r9 = r1.mo3473o(r9, r11)
            r0.setItemMaxLines(r9)
            com.google.android.material.navigation.NavigationView$a r9 = new com.google.android.material.navigation.NavigationView$a
            r9.<init>()
            r14.mo2036X(r9)
            r10.mo90108J(r11)
            r10.mo1946m(r13, r14)
            if (r3 == 0) goto L_0x01d1
            r10.mo90123Y(r3)
        L_0x01d1:
            r10.mo90120V(r2)
            r10.mo90114P(r5)
            int r2 = r16.getOverScrollMode()
            r10.mo90119U(r2)
            if (r6 == 0) goto L_0x01e3
            r10.mo90116R(r6)
        L_0x01e3:
            r10.mo90117S(r7)
            r10.mo90109K(r8)
            r10.mo90112N(r4)
            r14.mo2050b(r10)
            androidx.appcompat.view.menu.o r2 = r10.mo1942h(r0)
            android.view.View r2 = (android.view.View) r2
            r0.addView(r2)
            int r2 = com.google.android.material.C31076a.C31091o.NavigationView_menu
            boolean r3 = r1.mo3455C(r2)
            if (r3 == 0) goto L_0x0207
            int r2 = r1.mo3479u(r2, r12)
            r0.mo90396k(r2)
        L_0x0207:
            int r2 = com.google.android.material.C31076a.C31091o.NavigationView_headerLayout
            boolean r3 = r1.mo3455C(r2)
            if (r3 == 0) goto L_0x0216
            int r2 = r1.mo3479u(r2, r12)
            r0.mo90395j(r2)
        L_0x0216:
            r1.mo3458I()
            r16.mo90405p()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.navigation.NavigationView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setCheckedItem(@C0359n0 MenuItem menuItem) {
        MenuItem findItem = this.f76093f.findItem(menuItem.getItemId());
        if (findItem != null) {
            this.f76094g.mo90105G((C0573j) findItem);
            return;
        }
        throw new IllegalArgumentException("Called setCheckedItem(MenuItem) with an item that is not in the current menu.");
    }
}
