package com.google.android.material.navigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.C0327c1;
import androidx.annotation.C0329d0;
import androidx.annotation.C0336f;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0364q;
import androidx.annotation.C0366r;
import androidx.annotation.C0372t0;
import androidx.annotation.C0375v;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.C0543g;
import androidx.appcompat.view.menu.C0568g;
import androidx.appcompat.view.menu.C0587o;
import androidx.appcompat.widget.C0722h1;
import androidx.core.graphics.drawable.C17549d;
import androidx.core.view.C18196h2;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.C31076a;
import com.google.android.material.badge.C31132a;
import com.google.android.material.internal.C31422p;
import com.google.android.material.resources.C31500c;
import com.google.android.material.ripple.C31511b;
import com.google.android.material.shape.C31525j;
import com.google.android.material.shape.C31530k;
import com.google.android.material.shape.C31534o;
import com.google.android.material.theme.overlay.C31683a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public abstract class NavigationBarView extends FrameLayout {

    /* renamed from: v */
    public static final int f76069v = -1;

    /* renamed from: w */
    public static final int f76070w = 0;

    /* renamed from: x */
    public static final int f76071x = 1;

    /* renamed from: y */
    public static final int f76072y = 2;

    /* renamed from: z */
    public static final int f76073z = 1;
    @C0359n0

    /* renamed from: a */
    public final C31458a f76074a;
    @C0359n0

    /* renamed from: b */
    public final NavigationBarMenuView f76075b;
    @C0359n0

    /* renamed from: c */
    public final NavigationBarPresenter f76076c;
    @C0363p0

    /* renamed from: d */
    public ColorStateList f76077d;

    /* renamed from: e */
    public MenuInflater f76078e;

    /* renamed from: f */
    public C31453d f76079f;

    /* renamed from: g */
    public C31452c f76080g;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C31449a();
        @C0363p0

        /* renamed from: c */
        public Bundle f76081c;

        /* renamed from: com.google.android.material.navigation.NavigationBarView$SavedState$a */
        public class C31449a implements Parcelable.ClassLoaderCreator<SavedState> {
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

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        /* renamed from: b */
        public final void mo90366b(@C0359n0 Parcel parcel, ClassLoader classLoader) {
            this.f76081c = parcel.readBundle(classLoader);
        }

        public void writeToParcel(@C0359n0 Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(this.f76081c);
        }

        public SavedState(@C0359n0 Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            mo90366b(parcel, classLoader == null ? getClass().getClassLoader() : classLoader);
        }
    }

    /* renamed from: com.google.android.material.navigation.NavigationBarView$a */
    public class C31450a implements C0568g.C0569a {
        public C31450a() {
        }

        /* renamed from: a */
        public boolean mo1111a(C0568g gVar, @C0359n0 MenuItem menuItem) {
            if (NavigationBarView.this.f76080g != null && menuItem.getItemId() == NavigationBarView.this.getSelectedItemId()) {
                NavigationBarView.this.f76080g.mo90373a(menuItem);
                return true;
            } else if (NavigationBarView.this.f76079f == null || NavigationBarView.this.f76079f.mo58611a(menuItem)) {
                return false;
            } else {
                return true;
            }
        }

        /* renamed from: b */
        public void mo1114b(C0568g gVar) {
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.material.navigation.NavigationBarView$b */
    public @interface C31451b {
    }

    /* renamed from: com.google.android.material.navigation.NavigationBarView$c */
    public interface C31452c {
        /* renamed from: a */
        void mo90373a(@C0359n0 MenuItem menuItem);
    }

    /* renamed from: com.google.android.material.navigation.NavigationBarView$d */
    public interface C31453d {
        /* renamed from: a */
        boolean mo58611a(@C0359n0 MenuItem menuItem);
    }

    public NavigationBarView(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet, @C0336f int i, @C0327c1 int i2) {
        super(C31683a.m128455c(context, attributeSet, i, i2), attributeSet, i);
        NavigationBarPresenter navigationBarPresenter = new NavigationBarPresenter();
        this.f76076c = navigationBarPresenter;
        Context context2 = getContext();
        int[] iArr = C31076a.C31091o.NavigationBarView;
        int i3 = C31076a.C31091o.NavigationBarView_itemTextAppearanceInactive;
        int i4 = C31076a.C31091o.NavigationBarView_itemTextAppearanceActive;
        C0722h1 k = C31422p.m126971k(context2, attributeSet, iArr, i, i2, i3, i4);
        C31458a aVar = new C31458a(context2, getClass(), getMaxItemCount());
        this.f76074a = aVar;
        NavigationBarMenuView d = mo88385d(context2);
        this.f76075b = d;
        navigationBarPresenter.mo90306c(d);
        navigationBarPresenter.mo90305a(1);
        d.setPresenter(navigationBarPresenter);
        aVar.mo2050b(navigationBarPresenter);
        navigationBarPresenter.mo1946m(getContext(), aVar);
        int i5 = C31076a.C31091o.NavigationBarView_itemIconTint;
        if (k.mo3455C(i5)) {
            d.setIconTintList(k.mo3462d(i5));
        } else {
            d.setIconTintList(d.mo90250e(16842808));
        }
        setItemIconSize(k.mo3465g(C31076a.C31091o.NavigationBarView_itemIconSize, getResources().getDimensionPixelSize(C31076a.C31082f.mtrl_navigation_bar_item_default_icon_size)));
        if (k.mo3455C(i3)) {
            setItemTextAppearanceInactive(k.mo3479u(i3, 0));
        }
        if (k.mo3455C(i4)) {
            setItemTextAppearanceActive(k.mo3479u(i4, 0));
        }
        int i6 = C31076a.C31091o.NavigationBarView_itemTextColor;
        if (k.mo3455C(i6)) {
            setItemTextColor(k.mo3462d(i6));
        }
        if (getBackground() == null || (getBackground() instanceof ColorDrawable)) {
            C18196h2.m82502I1(this, mo90314c(context2));
        }
        int i7 = C31076a.C31091o.NavigationBarView_itemPaddingTop;
        if (k.mo3455C(i7)) {
            setItemPaddingTop(k.mo3465g(i7, 0));
        }
        int i8 = C31076a.C31091o.NavigationBarView_itemPaddingBottom;
        if (k.mo3455C(i8)) {
            setItemPaddingBottom(k.mo3465g(i8, 0));
        }
        int i9 = C31076a.C31091o.NavigationBarView_elevation;
        if (k.mo3455C(i9)) {
            setElevation((float) k.mo3465g(i9, 0));
        }
        C17549d.m80453o(getBackground().mutate(), C31500c.m127364b(context2, k, C31076a.C31091o.NavigationBarView_backgroundTint));
        setLabelVisibilityMode(k.mo3474p(C31076a.C31091o.NavigationBarView_labelVisibilityMode, -1));
        int u = k.mo3479u(C31076a.C31091o.NavigationBarView_itemBackground, 0);
        if (u != 0) {
            d.setItemBackgroundRes(u);
        } else {
            setItemRippleColor(C31500c.m127364b(context2, k, C31076a.C31091o.NavigationBarView_itemRippleColor));
        }
        int u2 = k.mo3479u(C31076a.C31091o.NavigationBarView_itemActiveIndicatorStyle, 0);
        if (u2 != 0) {
            setItemActiveIndicatorEnabled(true);
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(u2, C31076a.C31091o.NavigationBarActiveIndicator);
            setItemActiveIndicatorWidth(obtainStyledAttributes.getDimensionPixelSize(C31076a.C31091o.NavigationBarActiveIndicator_android_width, 0));
            setItemActiveIndicatorHeight(obtainStyledAttributes.getDimensionPixelSize(C31076a.C31091o.NavigationBarActiveIndicator_android_height, 0));
            setItemActiveIndicatorMarginHorizontal(obtainStyledAttributes.getDimensionPixelOffset(C31076a.C31091o.NavigationBarActiveIndicator_marginHorizontal, 0));
            setItemActiveIndicatorColor(C31500c.m127363a(context2, obtainStyledAttributes, C31076a.C31091o.NavigationBarActiveIndicator_android_color));
            setItemActiveIndicatorShapeAppearance(C31534o.m127562b(context2, obtainStyledAttributes.getResourceId(C31076a.C31091o.NavigationBarActiveIndicator_shapeAppearance, 0), 0).mo90843m());
            obtainStyledAttributes.recycle();
        }
        int i10 = C31076a.C31091o.NavigationBarView_menu;
        if (k.mo3455C(i10)) {
            mo90317g(k.mo3479u(i10, 0));
        }
        k.mo3458I();
        addView(d);
        aVar.mo2036X(new C31450a());
    }

    private MenuInflater getMenuInflater() {
        if (this.f76078e == null) {
            this.f76078e = new C0543g(getContext());
        }
        return this.f76078e;
    }

    @C0359n0
    /* renamed from: c */
    public final C31525j mo90314c(Context context) {
        C31525j jVar = new C31525j();
        Drawable background = getBackground();
        if (background instanceof ColorDrawable) {
            jVar.mo90777o0(ColorStateList.valueOf(((ColorDrawable) background).getColor()));
        }
        jVar.mo90750Z(context);
        return jVar;
    }

    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: d */
    public abstract NavigationBarMenuView mo88385d(@C0359n0 Context context);

    @C0363p0
    /* renamed from: e */
    public C31132a mo90315e(int i) {
        return this.f76075b.mo90273i(i);
    }

    @C0359n0
    /* renamed from: f */
    public C31132a mo90316f(int i) {
        return this.f76075b.mo90274j(i);
    }

    /* renamed from: g */
    public void mo90317g(int i) {
        this.f76076c.mo90307n(true);
        getMenuInflater().inflate(i, this.f76074a);
        this.f76076c.mo90307n(false);
        this.f76076c.mo1943j(true);
    }

    @C0363p0
    public ColorStateList getItemActiveIndicatorColor() {
        return this.f76075b.getItemActiveIndicatorColor();
    }

    @C0372t0
    public int getItemActiveIndicatorHeight() {
        return this.f76075b.getItemActiveIndicatorHeight();
    }

    @C0372t0
    public int getItemActiveIndicatorMarginHorizontal() {
        return this.f76075b.getItemActiveIndicatorMarginHorizontal();
    }

    @C0363p0
    public C31534o getItemActiveIndicatorShapeAppearance() {
        return this.f76075b.getItemActiveIndicatorShapeAppearance();
    }

    @C0372t0
    public int getItemActiveIndicatorWidth() {
        return this.f76075b.getItemActiveIndicatorWidth();
    }

    @C0363p0
    public Drawable getItemBackground() {
        return this.f76075b.getItemBackground();
    }

    @C0375v
    @Deprecated
    public int getItemBackgroundResource() {
        return this.f76075b.getItemBackgroundRes();
    }

    @C0366r
    public int getItemIconSize() {
        return this.f76075b.getItemIconSize();
    }

    @C0363p0
    public ColorStateList getItemIconTintList() {
        return this.f76075b.getIconTintList();
    }

    @C0372t0
    public int getItemPaddingBottom() {
        return this.f76075b.getItemPaddingBottom();
    }

    @C0372t0
    public int getItemPaddingTop() {
        return this.f76075b.getItemPaddingTop();
    }

    @C0363p0
    public ColorStateList getItemRippleColor() {
        return this.f76077d;
    }

    @C0327c1
    public int getItemTextAppearanceActive() {
        return this.f76075b.getItemTextAppearanceActive();
    }

    @C0327c1
    public int getItemTextAppearanceInactive() {
        return this.f76075b.getItemTextAppearanceInactive();
    }

    @C0363p0
    public ColorStateList getItemTextColor() {
        return this.f76075b.getItemTextColor();
    }

    public int getLabelVisibilityMode() {
        return this.f76075b.getLabelVisibilityMode();
    }

    public abstract int getMaxItemCount();

    @C0359n0
    public Menu getMenu() {
        return this.f76074a;
    }

    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public C0587o getMenuView() {
        return this.f76075b;
    }

    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public NavigationBarPresenter getPresenter() {
        return this.f76076c;
    }

    @C0329d0
    public int getSelectedItemId() {
        return this.f76075b.getSelectedItemId();
    }

    /* renamed from: h */
    public boolean mo90338h() {
        return this.f76075b.getItemActiveIndicatorEnabled();
    }

    /* renamed from: i */
    public void mo90339i(int i) {
        this.f76075b.mo90278n(i);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C31530k.m127554e(this);
    }

    public void onRestoreInstanceState(@C0363p0 Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.mo53419a());
        this.f76074a.mo2033U(savedState.f76081c);
    }

    @C0359n0
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        savedState.f76081c = bundle;
        this.f76074a.mo2035W(bundle);
        return savedState;
    }

    public void setElevation(float f) {
        super.setElevation(f);
        C31530k.m127553d(this, f);
    }

    public void setItemActiveIndicatorColor(@C0363p0 ColorStateList colorStateList) {
        this.f76075b.setItemActiveIndicatorColor(colorStateList);
    }

    public void setItemActiveIndicatorEnabled(boolean z) {
        this.f76075b.setItemActiveIndicatorEnabled(z);
    }

    public void setItemActiveIndicatorHeight(@C0372t0 int i) {
        this.f76075b.setItemActiveIndicatorHeight(i);
    }

    public void setItemActiveIndicatorMarginHorizontal(@C0372t0 int i) {
        this.f76075b.setItemActiveIndicatorMarginHorizontal(i);
    }

    public void setItemActiveIndicatorShapeAppearance(@C0363p0 C31534o oVar) {
        this.f76075b.setItemActiveIndicatorShapeAppearance(oVar);
    }

    public void setItemActiveIndicatorWidth(@C0372t0 int i) {
        this.f76075b.setItemActiveIndicatorWidth(i);
    }

    public void setItemBackground(@C0363p0 Drawable drawable) {
        this.f76075b.setItemBackground(drawable);
        this.f76077d = null;
    }

    public void setItemBackgroundResource(@C0375v int i) {
        this.f76075b.setItemBackgroundRes(i);
        this.f76077d = null;
    }

    public void setItemIconSize(@C0366r int i) {
        this.f76075b.setItemIconSize(i);
    }

    public void setItemIconSizeRes(@C0364q int i) {
        setItemIconSize(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconTintList(@C0363p0 ColorStateList colorStateList) {
        this.f76075b.setIconTintList(colorStateList);
    }

    public void setItemOnTouchListener(int i, @C0363p0 View.OnTouchListener onTouchListener) {
        this.f76075b.setItemOnTouchListener(i, onTouchListener);
    }

    public void setItemPaddingBottom(@C0372t0 int i) {
        this.f76075b.setItemPaddingBottom(i);
    }

    public void setItemPaddingTop(@C0372t0 int i) {
        this.f76075b.setItemPaddingTop(i);
    }

    public void setItemRippleColor(@C0363p0 ColorStateList colorStateList) {
        if (this.f76077d != colorStateList) {
            this.f76077d = colorStateList;
            if (colorStateList == null) {
                this.f76075b.setItemBackground((Drawable) null);
                return;
            }
            this.f76075b.setItemBackground(new RippleDrawable(C31511b.m127402a(colorStateList), (Drawable) null, (Drawable) null));
        } else if (colorStateList == null && this.f76075b.getItemBackground() != null) {
            this.f76075b.setItemBackground((Drawable) null);
        }
    }

    public void setItemTextAppearanceActive(@C0327c1 int i) {
        this.f76075b.setItemTextAppearanceActive(i);
    }

    public void setItemTextAppearanceInactive(@C0327c1 int i) {
        this.f76075b.setItemTextAppearanceInactive(i);
    }

    public void setItemTextColor(@C0363p0 ColorStateList colorStateList) {
        this.f76075b.setItemTextColor(colorStateList);
    }

    public void setLabelVisibilityMode(int i) {
        if (this.f76075b.getLabelVisibilityMode() != i) {
            this.f76075b.setLabelVisibilityMode(i);
            this.f76076c.mo1943j(false);
        }
    }

    public void setOnItemReselectedListener(@C0363p0 C31452c cVar) {
        this.f76080g = cVar;
    }

    public void setOnItemSelectedListener(@C0363p0 C31453d dVar) {
        this.f76079f = dVar;
    }

    public void setSelectedItemId(@C0329d0 int i) {
        MenuItem findItem = this.f76074a.findItem(i);
        if (findItem != null && !this.f76074a.mo2028P(findItem, this.f76076c, 0)) {
            findItem.setChecked(true);
        }
    }
}
