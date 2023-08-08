package com.google.android.material.navigation;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.C0327c1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0366r;
import androidx.annotation.C0372t0;
import androidx.annotation.RestrictTo;
import androidx.appcompat.C0387a;
import androidx.appcompat.content.res.C0507a;
import androidx.appcompat.view.menu.C0568g;
import androidx.appcompat.view.menu.C0573j;
import androidx.appcompat.view.menu.C0587o;
import androidx.core.util.C17997q;
import androidx.core.view.C18196h2;
import androidx.core.view.accessibility.C18065l0;
import androidx.transition.C20552c;
import androidx.transition.C20629k0;
import androidx.transition.C20639m0;
import com.google.android.material.C31076a;
import com.google.android.material.animation.C31093a;
import com.google.android.material.badge.C31132a;
import com.google.android.material.internal.C31419n;
import com.google.android.material.motion.C31441a;
import com.google.android.material.shape.C31525j;
import com.google.android.material.shape.C31534o;
import java.util.HashSet;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public abstract class NavigationBarMenuView extends ViewGroup implements C0587o {

    /* renamed from: U0 */
    public static final int f76030U0 = 5;

    /* renamed from: V0 */
    public static final int f76031V0 = -1;

    /* renamed from: W0 */
    public static final int[] f76032W0 = {16842912};

    /* renamed from: X0 */
    public static final int[] f76033X0 = {-16842910};
    @C0327c1

    /* renamed from: E0 */
    public int f76034E0;
    @C0327c1

    /* renamed from: F0 */
    public int f76035F0;

    /* renamed from: G0 */
    public Drawable f76036G0;

    /* renamed from: H0 */
    public int f76037H0;
    @C0359n0

    /* renamed from: I0 */
    public final SparseArray<C31132a> f76038I0 = new SparseArray<>(5);

    /* renamed from: J0 */
    public int f76039J0 = -1;

    /* renamed from: K0 */
    public int f76040K0 = -1;

    /* renamed from: L0 */
    public boolean f76041L0;

    /* renamed from: M0 */
    public int f76042M0;

    /* renamed from: N0 */
    public int f76043N0;

    /* renamed from: O0 */
    public int f76044O0;

    /* renamed from: P0 */
    public C31534o f76045P0;

    /* renamed from: Q0 */
    public boolean f76046Q0 = false;

    /* renamed from: R0 */
    public ColorStateList f76047R0;

    /* renamed from: S0 */
    public NavigationBarPresenter f76048S0;

    /* renamed from: T0 */
    public C0568g f76049T0;
    @C0363p0

    /* renamed from: a */
    public final C20639m0 f76050a;
    @C0359n0

    /* renamed from: b */
    public final View.OnClickListener f76051b;

    /* renamed from: c */
    public final C17997q.C17998a<NavigationBarItemView> f76052c = new C17997q.C18000c(5);
    @C0359n0

    /* renamed from: d */
    public final SparseArray<View.OnTouchListener> f76053d = new SparseArray<>(5);

    /* renamed from: e */
    public int f76054e;
    @C0363p0

    /* renamed from: f */
    public NavigationBarItemView[] f76055f;

    /* renamed from: g */
    public int f76056g = 0;

    /* renamed from: v */
    public int f76057v = 0;
    @C0363p0

    /* renamed from: w */
    public ColorStateList f76058w;
    @C0366r

    /* renamed from: x */
    public int f76059x;

    /* renamed from: y */
    public ColorStateList f76060y;
    @C0363p0

    /* renamed from: z */
    public final ColorStateList f76061z = mo90250e(16842808);

    /* renamed from: com.google.android.material.navigation.NavigationBarMenuView$a */
    public class C31447a implements View.OnClickListener {
        public C31447a() {
        }

        public void onClick(View view) {
            C0573j itemData = ((NavigationBarItemView) view).getItemData();
            if (!NavigationBarMenuView.this.f76049T0.mo2028P(itemData, NavigationBarMenuView.this.f76048S0, 0)) {
                itemData.setChecked(true);
            }
        }
    }

    public NavigationBarMenuView(@C0359n0 Context context) {
        super(context);
        if (isInEditMode()) {
            this.f76050a = null;
        } else {
            C20552c cVar = new C20552c();
            this.f76050a = cVar;
            cVar.mo61848p1(0);
            cVar.mo61718L0((long) C31441a.m127036d(getContext(), C31076a.C31079c.motionDurationLong1, getResources().getInteger(C31076a.C31085i.material_motion_duration_long_1)));
            cVar.mo61722O0(C31441a.m127037e(getContext(), C31076a.C31079c.motionEasingStandard, C31093a.f74426b));
            cVar.mo61835a1(new C31419n());
        }
        this.f76051b = new C31447a();
        C18196h2.m82531R1(this, 1);
    }

    private NavigationBarItemView getNewItem() {
        NavigationBarItemView b = this.f76052c.mo52469b();
        if (b == null) {
            return mo88380g(getContext());
        }
        return b;
    }

    private void setBadgeIfNeeded(@C0359n0 NavigationBarItemView navigationBarItemView) {
        C31132a aVar;
        int id = navigationBarItemView.getId();
        if (mo90277m(id) && (aVar = this.f76038I0.get(id)) != null) {
            navigationBarItemView.setBadge(aVar);
        }
    }

    /* renamed from: c */
    public void mo1858c(@C0359n0 C0568g gVar) {
        this.f76049T0 = gVar;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* renamed from: d */
    public void mo90249d() {
        removeAllViews();
        NavigationBarItemView[] navigationBarItemViewArr = this.f76055f;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                if (navigationBarItemView != null) {
                    this.f76052c.mo52468a(navigationBarItemView);
                    navigationBarItemView.mo90207i();
                }
            }
        }
        if (this.f76049T0.size() == 0) {
            this.f76056g = 0;
            this.f76057v = 0;
            this.f76055f = null;
            return;
        }
        mo90279o();
        this.f76055f = new NavigationBarItemView[this.f76049T0.size()];
        boolean l = mo90276l(this.f76054e, this.f76049T0.mo2020H().size());
        for (int i = 0; i < this.f76049T0.size(); i++) {
            this.f76048S0.mo90307n(true);
            this.f76049T0.getItem(i).setCheckable(true);
            this.f76048S0.mo90307n(false);
            NavigationBarItemView newItem = getNewItem();
            this.f76055f[i] = newItem;
            newItem.setIconTintList(this.f76058w);
            newItem.setIconSize(this.f76059x);
            newItem.setTextColor(this.f76061z);
            newItem.setTextAppearanceInactive(this.f76034E0);
            newItem.setTextAppearanceActive(this.f76035F0);
            newItem.setTextColor(this.f76060y);
            int i2 = this.f76039J0;
            if (i2 != -1) {
                newItem.setItemPaddingTop(i2);
            }
            int i3 = this.f76040K0;
            if (i3 != -1) {
                newItem.setItemPaddingBottom(i3);
            }
            newItem.setActiveIndicatorWidth(this.f76042M0);
            newItem.setActiveIndicatorHeight(this.f76043N0);
            newItem.setActiveIndicatorMarginHorizontal(this.f76044O0);
            newItem.setActiveIndicatorDrawable(mo90251f());
            newItem.setActiveIndicatorResizeable(this.f76046Q0);
            newItem.setActiveIndicatorEnabled(this.f76041L0);
            Drawable drawable = this.f76036G0;
            if (drawable != null) {
                newItem.setItemBackground(drawable);
            } else {
                newItem.setItemBackground(this.f76037H0);
            }
            newItem.setShifting(l);
            newItem.setLabelVisibilityMode(this.f76054e);
            C0573j jVar = (C0573j) this.f76049T0.getItem(i);
            newItem.mo1832d(jVar, 0);
            newItem.setItemPosition(i);
            int itemId = jVar.getItemId();
            newItem.setOnTouchListener(this.f76053d.get(itemId));
            newItem.setOnClickListener(this.f76051b);
            int i4 = this.f76056g;
            if (i4 != 0 && itemId == i4) {
                this.f76057v = i;
            }
            setBadgeIfNeeded(newItem);
            addView(newItem);
        }
        int min = Math.min(this.f76049T0.size() - 1, this.f76057v);
        this.f76057v = min;
        this.f76049T0.getItem(min).setChecked(true);
    }

    @C0363p0
    /* renamed from: e */
    public ColorStateList mo90250e(int i) {
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
        int[] iArr = f76033X0;
        return new ColorStateList(new int[][]{iArr, f76032W0, ViewGroup.EMPTY_STATE_SET}, new int[]{a.getColorForState(iArr, defaultColor), i2, defaultColor});
    }

    @C0363p0
    /* renamed from: f */
    public final Drawable mo90251f() {
        if (this.f76045P0 == null || this.f76047R0 == null) {
            return null;
        }
        C31525j jVar = new C31525j(this.f76045P0);
        jVar.mo90777o0(this.f76047R0);
        return jVar;
    }

    @C0359n0
    /* renamed from: g */
    public abstract NavigationBarItemView mo88380g(@C0359n0 Context context);

    public SparseArray<C31132a> getBadgeDrawables() {
        return this.f76038I0;
    }

    @C0363p0
    public ColorStateList getIconTintList() {
        return this.f76058w;
    }

    @C0363p0
    public ColorStateList getItemActiveIndicatorColor() {
        return this.f76047R0;
    }

    public boolean getItemActiveIndicatorEnabled() {
        return this.f76041L0;
    }

    @C0372t0
    public int getItemActiveIndicatorHeight() {
        return this.f76043N0;
    }

    @C0372t0
    public int getItemActiveIndicatorMarginHorizontal() {
        return this.f76044O0;
    }

    @C0363p0
    public C31534o getItemActiveIndicatorShapeAppearance() {
        return this.f76045P0;
    }

    @C0372t0
    public int getItemActiveIndicatorWidth() {
        return this.f76042M0;
    }

    @C0363p0
    public Drawable getItemBackground() {
        NavigationBarItemView[] navigationBarItemViewArr = this.f76055f;
        if (navigationBarItemViewArr == null || navigationBarItemViewArr.length <= 0) {
            return this.f76036G0;
        }
        return navigationBarItemViewArr[0].getBackground();
    }

    @Deprecated
    public int getItemBackgroundRes() {
        return this.f76037H0;
    }

    @C0366r
    public int getItemIconSize() {
        return this.f76059x;
    }

    @C0372t0
    public int getItemPaddingBottom() {
        return this.f76040K0;
    }

    @C0372t0
    public int getItemPaddingTop() {
        return this.f76039J0;
    }

    @C0327c1
    public int getItemTextAppearanceActive() {
        return this.f76035F0;
    }

    @C0327c1
    public int getItemTextAppearanceInactive() {
        return this.f76034E0;
    }

    @C0363p0
    public ColorStateList getItemTextColor() {
        return this.f76060y;
    }

    public int getLabelVisibilityMode() {
        return this.f76054e;
    }

    @C0363p0
    public C0568g getMenu() {
        return this.f76049T0;
    }

    public int getSelectedItemId() {
        return this.f76056g;
    }

    public int getSelectedItemPosition() {
        return this.f76057v;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @C0363p0
    /* renamed from: h */
    public NavigationBarItemView mo90272h(int i) {
        mo90284s(i);
        NavigationBarItemView[] navigationBarItemViewArr = this.f76055f;
        if (navigationBarItemViewArr == null) {
            return null;
        }
        for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
            if (navigationBarItemView.getId() == i) {
                return navigationBarItemView;
            }
        }
        return null;
    }

    @C0363p0
    /* renamed from: i */
    public C31132a mo90273i(int i) {
        return this.f76038I0.get(i);
    }

    /* renamed from: j */
    public C31132a mo90274j(int i) {
        mo90284s(i);
        C31132a aVar = this.f76038I0.get(i);
        if (aVar == null) {
            aVar = C31132a.m124995d(getContext());
            this.f76038I0.put(i, aVar);
        }
        NavigationBarItemView h = mo90272h(i);
        if (h != null) {
            h.setBadge(aVar);
        }
        return aVar;
    }

    /* renamed from: k */
    public boolean mo90275k() {
        return this.f76046Q0;
    }

    /* renamed from: l */
    public boolean mo90276l(int i, int i2) {
        if (i == -1) {
            if (i2 > 3) {
                return true;
            }
        } else if (i == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public final boolean mo90277m(int i) {
        return i != -1;
    }

    /* renamed from: n */
    public void mo90278n(int i) {
        mo90284s(i);
        C31132a aVar = this.f76038I0.get(i);
        NavigationBarItemView h = mo90272h(i);
        if (h != null) {
            h.mo90213o();
        }
        if (aVar != null) {
            this.f76038I0.remove(i);
        }
    }

    /* renamed from: o */
    public final void mo90279o() {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < this.f76049T0.size(); i++) {
            hashSet.add(Integer.valueOf(this.f76049T0.getItem(i).getItemId()));
        }
        for (int i2 = 0; i2 < this.f76038I0.size(); i2++) {
            int keyAt = this.f76038I0.keyAt(i2);
            if (!hashSet.contains(Integer.valueOf(keyAt))) {
                this.f76038I0.delete(keyAt);
            }
        }
    }

    public void onInitializeAccessibilityNodeInfo(@C0359n0 AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C18065l0.m81936c2(accessibilityNodeInfo).mo52600b1(C18065l0.C18068c.m82100f(1, this.f76049T0.mo2020H().size(), false, 1));
    }

    /* renamed from: p */
    public void mo90281p(SparseArray<C31132a> sparseArray) {
        for (int i = 0; i < sparseArray.size(); i++) {
            int keyAt = sparseArray.keyAt(i);
            if (this.f76038I0.indexOfKey(keyAt) < 0) {
                this.f76038I0.append(keyAt, sparseArray.get(keyAt));
            }
        }
        NavigationBarItemView[] navigationBarItemViewArr = this.f76055f;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setBadge(this.f76038I0.get(navigationBarItemView.getId()));
            }
        }
    }

    /* renamed from: q */
    public void mo90282q(int i) {
        int size = this.f76049T0.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = this.f76049T0.getItem(i2);
            if (i == item.getItemId()) {
                this.f76056g = i;
                this.f76057v = i2;
                item.setChecked(true);
                return;
            }
        }
    }

    /* renamed from: r */
    public void mo90283r() {
        C20639m0 m0Var;
        C0568g gVar = this.f76049T0;
        if (gVar != null && this.f76055f != null) {
            int size = gVar.size();
            if (size != this.f76055f.length) {
                mo90249d();
                return;
            }
            int i = this.f76056g;
            for (int i2 = 0; i2 < size; i2++) {
                MenuItem item = this.f76049T0.getItem(i2);
                if (item.isChecked()) {
                    this.f76056g = item.getItemId();
                    this.f76057v = i2;
                }
            }
            if (!(i == this.f76056g || (m0Var = this.f76050a) == null)) {
                C20629k0.m95932b(this, m0Var);
            }
            boolean l = mo90276l(this.f76054e, this.f76049T0.mo2020H().size());
            for (int i3 = 0; i3 < size; i3++) {
                this.f76048S0.mo90307n(true);
                this.f76055f[i3].setLabelVisibilityMode(this.f76054e);
                this.f76055f[i3].setShifting(l);
                this.f76055f[i3].mo1832d((C0573j) this.f76049T0.getItem(i3), 0);
                this.f76048S0.mo90307n(false);
            }
        }
    }

    /* renamed from: s */
    public final void mo90284s(int i) {
        if (!mo90277m(i)) {
            throw new IllegalArgumentException(i + " is not a valid view id");
        }
    }

    public void setIconTintList(@C0363p0 ColorStateList colorStateList) {
        this.f76058w = colorStateList;
        NavigationBarItemView[] navigationBarItemViewArr = this.f76055f;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView iconTintList : navigationBarItemViewArr) {
                iconTintList.setIconTintList(colorStateList);
            }
        }
    }

    public void setItemActiveIndicatorColor(@C0363p0 ColorStateList colorStateList) {
        this.f76047R0 = colorStateList;
        NavigationBarItemView[] navigationBarItemViewArr = this.f76055f;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView activeIndicatorDrawable : navigationBarItemViewArr) {
                activeIndicatorDrawable.setActiveIndicatorDrawable(mo90251f());
            }
        }
    }

    public void setItemActiveIndicatorEnabled(boolean z) {
        this.f76041L0 = z;
        NavigationBarItemView[] navigationBarItemViewArr = this.f76055f;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView activeIndicatorEnabled : navigationBarItemViewArr) {
                activeIndicatorEnabled.setActiveIndicatorEnabled(z);
            }
        }
    }

    public void setItemActiveIndicatorHeight(@C0372t0 int i) {
        this.f76043N0 = i;
        NavigationBarItemView[] navigationBarItemViewArr = this.f76055f;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView activeIndicatorHeight : navigationBarItemViewArr) {
                activeIndicatorHeight.setActiveIndicatorHeight(i);
            }
        }
    }

    public void setItemActiveIndicatorMarginHorizontal(@C0372t0 int i) {
        this.f76044O0 = i;
        NavigationBarItemView[] navigationBarItemViewArr = this.f76055f;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView activeIndicatorMarginHorizontal : navigationBarItemViewArr) {
                activeIndicatorMarginHorizontal.setActiveIndicatorMarginHorizontal(i);
            }
        }
    }

    public void setItemActiveIndicatorResizeable(boolean z) {
        this.f76046Q0 = z;
        NavigationBarItemView[] navigationBarItemViewArr = this.f76055f;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView activeIndicatorResizeable : navigationBarItemViewArr) {
                activeIndicatorResizeable.setActiveIndicatorResizeable(z);
            }
        }
    }

    public void setItemActiveIndicatorShapeAppearance(@C0363p0 C31534o oVar) {
        this.f76045P0 = oVar;
        NavigationBarItemView[] navigationBarItemViewArr = this.f76055f;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView activeIndicatorDrawable : navigationBarItemViewArr) {
                activeIndicatorDrawable.setActiveIndicatorDrawable(mo90251f());
            }
        }
    }

    public void setItemActiveIndicatorWidth(@C0372t0 int i) {
        this.f76042M0 = i;
        NavigationBarItemView[] navigationBarItemViewArr = this.f76055f;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView activeIndicatorWidth : navigationBarItemViewArr) {
                activeIndicatorWidth.setActiveIndicatorWidth(i);
            }
        }
    }

    public void setItemBackground(@C0363p0 Drawable drawable) {
        this.f76036G0 = drawable;
        NavigationBarItemView[] navigationBarItemViewArr = this.f76055f;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView itemBackground : navigationBarItemViewArr) {
                itemBackground.setItemBackground(drawable);
            }
        }
    }

    public void setItemBackgroundRes(int i) {
        this.f76037H0 = i;
        NavigationBarItemView[] navigationBarItemViewArr = this.f76055f;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView itemBackground : navigationBarItemViewArr) {
                itemBackground.setItemBackground(i);
            }
        }
    }

    public void setItemIconSize(@C0366r int i) {
        this.f76059x = i;
        NavigationBarItemView[] navigationBarItemViewArr = this.f76055f;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView iconSize : navigationBarItemViewArr) {
                iconSize.setIconSize(i);
            }
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void setItemOnTouchListener(int i, @C0363p0 View.OnTouchListener onTouchListener) {
        if (onTouchListener == null) {
            this.f76053d.remove(i);
        } else {
            this.f76053d.put(i, onTouchListener);
        }
        NavigationBarItemView[] navigationBarItemViewArr = this.f76055f;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                if (navigationBarItemView.getItemData().getItemId() == i) {
                    navigationBarItemView.setOnTouchListener(onTouchListener);
                }
            }
        }
    }

    public void setItemPaddingBottom(@C0372t0 int i) {
        this.f76040K0 = i;
        NavigationBarItemView[] navigationBarItemViewArr = this.f76055f;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView itemPaddingBottom : navigationBarItemViewArr) {
                itemPaddingBottom.setItemPaddingBottom(i);
            }
        }
    }

    public void setItemPaddingTop(@C0372t0 int i) {
        this.f76039J0 = i;
        NavigationBarItemView[] navigationBarItemViewArr = this.f76055f;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView itemPaddingTop : navigationBarItemViewArr) {
                itemPaddingTop.setItemPaddingTop(i);
            }
        }
    }

    public void setItemTextAppearanceActive(@C0327c1 int i) {
        this.f76035F0 = i;
        NavigationBarItemView[] navigationBarItemViewArr = this.f76055f;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setTextAppearanceActive(i);
                ColorStateList colorStateList = this.f76060y;
                if (colorStateList != null) {
                    navigationBarItemView.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextAppearanceInactive(@C0327c1 int i) {
        this.f76034E0 = i;
        NavigationBarItemView[] navigationBarItemViewArr = this.f76055f;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setTextAppearanceInactive(i);
                ColorStateList colorStateList = this.f76060y;
                if (colorStateList != null) {
                    navigationBarItemView.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextColor(@C0363p0 ColorStateList colorStateList) {
        this.f76060y = colorStateList;
        NavigationBarItemView[] navigationBarItemViewArr = this.f76055f;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView textColor : navigationBarItemViewArr) {
                textColor.setTextColor(colorStateList);
            }
        }
    }

    public void setLabelVisibilityMode(int i) {
        this.f76054e = i;
    }

    public void setPresenter(@C0359n0 NavigationBarPresenter navigationBarPresenter) {
        this.f76048S0 = navigationBarPresenter;
    }
}
