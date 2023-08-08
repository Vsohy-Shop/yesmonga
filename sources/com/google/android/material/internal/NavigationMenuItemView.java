package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0366r;
import androidx.annotation.RestrictTo;
import androidx.appcompat.C0387a;
import androidx.appcompat.view.menu.C0573j;
import androidx.appcompat.view.menu.C0587o;
import androidx.appcompat.widget.C0757o1;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.content.res.C17465i;
import androidx.core.graphics.drawable.C17549d;
import androidx.core.view.C18019a;
import androidx.core.view.C18196h2;
import androidx.core.view.accessibility.C18065l0;
import androidx.core.widget.C18496q;
import com.google.android.material.C31076a;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class NavigationMenuItemView extends ForegroundLinearLayout implements C0587o.C0588a {

    /* renamed from: j1 */
    public static final int[] f75761j1 = {16842912};

    /* renamed from: Z0 */
    public int f75762Z0;

    /* renamed from: a1 */
    public boolean f75763a1;

    /* renamed from: b1 */
    public boolean f75764b1;

    /* renamed from: c1 */
    public final CheckedTextView f75765c1;

    /* renamed from: d1 */
    public FrameLayout f75766d1;

    /* renamed from: e1 */
    public C0573j f75767e1;

    /* renamed from: f1 */
    public ColorStateList f75768f1;

    /* renamed from: g1 */
    public boolean f75769g1;

    /* renamed from: h1 */
    public Drawable f75770h1;

    /* renamed from: i1 */
    public final C18019a f75771i1;

    /* renamed from: com.google.android.material.internal.NavigationMenuItemView$a */
    public class C31380a extends C18019a {
        public C31380a() {
        }

        /* renamed from: g */
        public void mo19938g(View view, @C0359n0 C18065l0 l0Var) {
            super.mo19938g(view, l0Var);
            l0Var.mo52586X0(NavigationMenuItemView.this.f75764b1);
        }
    }

    public NavigationMenuItemView(@C0359n0 Context context) {
        this(context, (AttributeSet) null);
    }

    private void setActionView(@C0363p0 View view) {
        if (view != null) {
            if (this.f75766d1 == null) {
                this.f75766d1 = (FrameLayout) ((ViewStub) findViewById(C31076a.C31084h.design_menu_item_action_area_stub)).inflate();
            }
            this.f75766d1.removeAllViews();
            this.f75766d1.addView(view);
        }
    }

    /* renamed from: E */
    public final void mo89937E() {
        if (mo89940H()) {
            this.f75765c1.setVisibility(8);
            FrameLayout frameLayout = this.f75766d1;
            if (frameLayout != null) {
                LinearLayoutCompat.C0642b bVar = (LinearLayoutCompat.C0642b) frameLayout.getLayoutParams();
                bVar.width = -1;
                this.f75766d1.setLayoutParams(bVar);
                return;
            }
            return;
        }
        this.f75765c1.setVisibility(0);
        FrameLayout frameLayout2 = this.f75766d1;
        if (frameLayout2 != null) {
            LinearLayoutCompat.C0642b bVar2 = (LinearLayoutCompat.C0642b) frameLayout2.getLayoutParams();
            bVar2.width = -2;
            this.f75766d1.setLayoutParams(bVar2);
        }
    }

    @C0363p0
    /* renamed from: F */
    public final StateListDrawable mo89938F() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(C0387a.C0389b.colorControlHighlight, typedValue, true)) {
            return null;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(f75761j1, new ColorDrawable(typedValue.data));
        stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
        return stateListDrawable;
    }

    /* renamed from: G */
    public void mo89939G() {
        FrameLayout frameLayout = this.f75766d1;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        this.f75765c1.setCompoundDrawables((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    /* renamed from: H */
    public final boolean mo89940H() {
        if (this.f75767e1.getTitle() == null && this.f75767e1.getIcon() == null && this.f75767e1.getActionView() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public void mo1832d(@C0359n0 C0573j jVar, int i) {
        int i2;
        this.f75767e1 = jVar;
        if (jVar.getItemId() > 0) {
            setId(jVar.getItemId());
        }
        if (jVar.isVisible()) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        setVisibility(i2);
        if (getBackground() == null) {
            C18196h2.m82502I1(this, mo89938F());
        }
        setCheckable(jVar.isCheckable());
        setChecked(jVar.isChecked());
        setEnabled(jVar.isEnabled());
        setTitle(jVar.getTitle());
        setIcon(jVar.getIcon());
        setActionView(jVar.getActionView());
        setContentDescription(jVar.getContentDescription());
        C0757o1.m3709a(this, jVar.getTooltipText());
        mo89937E();
    }

    /* renamed from: e */
    public boolean mo1833e() {
        return false;
    }

    /* renamed from: f */
    public boolean mo1834f() {
        return true;
    }

    public C0573j getItemData() {
        return this.f75767e1;
    }

    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        C0573j jVar = this.f75767e1;
        if (jVar != null && jVar.isCheckable() && this.f75767e1.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f75761j1);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.f75764b1 != z) {
            this.f75764b1 = z;
            this.f75771i1.mo52496l(this.f75765c1, 2048);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        this.f75765c1.setChecked(z);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, getPaddingTop(), i, getPaddingBottom());
    }

    public void setIcon(@C0363p0 Drawable drawable) {
        if (drawable != null) {
            if (this.f75769g1) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = C17549d.m80456r(drawable).mutate();
                C17549d.m80453o(drawable, this.f75768f1);
            }
            int i = this.f75762Z0;
            drawable.setBounds(0, 0, i, i);
        } else if (this.f75763a1) {
            if (this.f75770h1 == null) {
                Drawable g = C17465i.m80175g(getResources(), C31076a.C31083g.navigation_empty_icon, getContext().getTheme());
                this.f75770h1 = g;
                if (g != null) {
                    int i2 = this.f75762Z0;
                    g.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.f75770h1;
        }
        C18496q.m83749w(this.f75765c1, drawable, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public void setIconPadding(int i) {
        this.f75765c1.setCompoundDrawablePadding(i);
    }

    public void setIconSize(@C0366r int i) {
        this.f75762Z0 = i;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        boolean z;
        this.f75768f1 = colorStateList;
        if (colorStateList != null) {
            z = true;
        } else {
            z = false;
        }
        this.f75769g1 = z;
        C0573j jVar = this.f75767e1;
        if (jVar != null) {
            setIcon(jVar.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.f75765c1.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.f75763a1 = z;
    }

    public void setShortcut(boolean z, char c) {
    }

    public void setTextAppearance(int i) {
        C18496q.m83723E(this.f75765c1, i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f75765c1.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f75765c1.setText(charSequence);
    }

    public NavigationMenuItemView(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C31380a aVar = new C31380a();
        this.f75771i1 = aVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(C31076a.C31087k.design_navigation_menu_item, this, true);
        setIconSize(context.getResources().getDimensionPixelSize(C31076a.C31082f.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(C31076a.C31084h.design_menu_item_text);
        this.f75765c1 = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        C18196h2.m82474B1(checkedTextView, aVar);
    }
}
