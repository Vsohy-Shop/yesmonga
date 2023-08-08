package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.appcompat.C0387a;
import androidx.appcompat.view.C0535b;
import androidx.appcompat.view.menu.C0568g;
import androidx.core.view.C18196h2;
import androidx.core.view.C18402w3;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class ActionBarContextView extends C0683a {

    /* renamed from: E0 */
    public View f1751E0;

    /* renamed from: F0 */
    public View f1752F0;

    /* renamed from: G0 */
    public LinearLayout f1753G0;

    /* renamed from: H0 */
    public TextView f1754H0;

    /* renamed from: I0 */
    public TextView f1755I0;

    /* renamed from: J0 */
    public int f1756J0;

    /* renamed from: K0 */
    public int f1757K0;

    /* renamed from: L0 */
    public boolean f1758L0;

    /* renamed from: M0 */
    public int f1759M0;

    /* renamed from: x */
    public CharSequence f1760x;

    /* renamed from: y */
    public CharSequence f1761y;

    /* renamed from: z */
    public View f1762z;

    /* renamed from: androidx.appcompat.widget.ActionBarContextView$a */
    public class C0597a implements View.OnClickListener {

        /* renamed from: a */
        public final /* synthetic */ C0535b f1763a;

        public C0597a(C0535b bVar) {
            this.f1763a = bVar;
        }

        public void onClick(View view) {
            this.f1763a.mo1452c();
        }
    }

    public ActionBarContextView(@C0359n0 Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: c */
    public /* bridge */ /* synthetic */ void mo2329c(int i) {
        super.mo2329c(i);
    }

    /* renamed from: d */
    public /* bridge */ /* synthetic */ boolean mo2330d() {
        return super.mo2330d();
    }

    /* renamed from: e */
    public /* bridge */ /* synthetic */ void mo2331e() {
        super.mo2331e();
    }

    /* renamed from: f */
    public boolean mo2332f() {
        ActionMenuPresenter actionMenuPresenter = this.f2254d;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.mo2439E();
        }
        return false;
    }

    /* renamed from: g */
    public /* bridge */ /* synthetic */ boolean mo2333g() {
        return super.mo2333g();
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f1761y;
    }

    public CharSequence getTitle() {
        return this.f1760x;
    }

    /* renamed from: h */
    public boolean mo2340h() {
        ActionMenuPresenter actionMenuPresenter = this.f2254d;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.mo2442H();
        }
        return false;
    }

    /* renamed from: i */
    public /* bridge */ /* synthetic */ boolean mo2341i() {
        return super.mo2341i();
    }

    /* renamed from: m */
    public /* bridge */ /* synthetic */ void mo2342m() {
        super.mo2342m();
    }

    /* renamed from: n */
    public /* bridge */ /* synthetic */ C18402w3 mo2343n(int i, long j) {
        return super.mo2343n(i, j);
    }

    /* renamed from: o */
    public boolean mo2344o() {
        ActionMenuPresenter actionMenuPresenter = this.f2254d;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.mo2451Q();
        }
        return false;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ActionMenuPresenter actionMenuPresenter = this.f2254d;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.mo2439E();
            this.f2254d.mo2440F();
        }
    }

    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        boolean b = C0796u1.m3859b(this);
        if (b) {
            i5 = (i3 - i) - getPaddingRight();
        } else {
            i5 = getPaddingLeft();
        }
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.f1762z;
        if (!(view == null || view.getVisibility() == 8)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1762z.getLayoutParams();
            if (b) {
                i7 = marginLayoutParams.rightMargin;
            } else {
                i7 = marginLayoutParams.leftMargin;
            }
            if (b) {
                i8 = marginLayoutParams.leftMargin;
            } else {
                i8 = marginLayoutParams.rightMargin;
            }
            int k = C0683a.m3328k(i5, i7, b);
            i5 = C0683a.m3328k(k + mo3255l(this.f1762z, k, paddingTop, paddingTop2, b), i8, b);
        }
        int i9 = i5;
        LinearLayout linearLayout = this.f1753G0;
        if (!(linearLayout == null || this.f1752F0 != null || linearLayout.getVisibility() == 8)) {
            i9 += mo3255l(this.f1753G0, i9, paddingTop, paddingTop2, b);
        }
        int i10 = i9;
        View view2 = this.f1752F0;
        if (view2 != null) {
            mo3255l(view2, i10, paddingTop, paddingTop2, b);
        }
        if (b) {
            i6 = getPaddingLeft();
        } else {
            i6 = (i3 - i) - getPaddingRight();
        }
        ActionMenuView actionMenuView = this.f2253c;
        if (actionMenuView != null) {
            mo3255l(actionMenuView, i6, paddingTop, paddingTop2, !b);
        }
    }

    public void onMeasure(int i, int i2) {
        int i3;
        boolean z;
        int i4;
        int i5 = 1073741824;
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        } else if (View.MeasureSpec.getMode(i2) != 0) {
            int size = View.MeasureSpec.getSize(i);
            int i6 = this.f2255e;
            if (i6 <= 0) {
                i6 = View.MeasureSpec.getSize(i2);
            }
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            int i7 = i6 - paddingTop;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i7, Integer.MIN_VALUE);
            View view = this.f1762z;
            if (view != null) {
                int j = mo3254j(view, paddingLeft, makeMeasureSpec, 0);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1762z.getLayoutParams();
                paddingLeft = j - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
            }
            ActionMenuView actionMenuView = this.f2253c;
            if (actionMenuView != null && actionMenuView.getParent() == this) {
                paddingLeft = mo3254j(this.f2253c, paddingLeft, makeMeasureSpec, 0);
            }
            LinearLayout linearLayout = this.f1753G0;
            if (linearLayout != null && this.f1752F0 == null) {
                if (this.f1758L0) {
                    this.f1753G0.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                    int measuredWidth = this.f1753G0.getMeasuredWidth();
                    if (measuredWidth <= paddingLeft) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        paddingLeft -= measuredWidth;
                    }
                    LinearLayout linearLayout2 = this.f1753G0;
                    if (z) {
                        i4 = 0;
                    } else {
                        i4 = 8;
                    }
                    linearLayout2.setVisibility(i4);
                } else {
                    paddingLeft = mo3254j(linearLayout, paddingLeft, makeMeasureSpec, 0);
                }
            }
            View view2 = this.f1752F0;
            if (view2 != null) {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                int i8 = layoutParams.width;
                if (i8 != -2) {
                    i3 = 1073741824;
                } else {
                    i3 = Integer.MIN_VALUE;
                }
                if (i8 >= 0) {
                    paddingLeft = Math.min(i8, paddingLeft);
                }
                int i9 = layoutParams.height;
                if (i9 == -2) {
                    i5 = Integer.MIN_VALUE;
                }
                if (i9 >= 0) {
                    i7 = Math.min(i9, i7);
                }
                this.f1752F0.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i3), View.MeasureSpec.makeMeasureSpec(i7, i5));
            }
            if (this.f2255e <= 0) {
                int childCount = getChildCount();
                int i10 = 0;
                for (int i11 = 0; i11 < childCount; i11++) {
                    int measuredHeight = getChildAt(i11).getMeasuredHeight() + paddingTop;
                    if (measuredHeight > i10) {
                        i10 = measuredHeight;
                    }
                }
                setMeasuredDimension(size, i10);
                return;
            }
            setMeasuredDimension(size, i6);
        } else {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
    }

    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    /* renamed from: p */
    public void mo2350p() {
        if (this.f1762z == null) {
            mo2361t();
        }
    }

    /* renamed from: q */
    public void mo2351q(C0535b bVar) {
        View view = this.f1762z;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.f1759M0, this, false);
            this.f1762z = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.f1762z);
        }
        View findViewById = this.f1762z.findViewById(C0387a.C0394g.action_mode_close_button);
        this.f1751E0 = findViewById;
        findViewById.setOnClickListener(new C0597a(bVar));
        C0568g gVar = (C0568g) bVar.mo1454e();
        ActionMenuPresenter actionMenuPresenter = this.f2254d;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.mo2436B();
        }
        ActionMenuPresenter actionMenuPresenter2 = new ActionMenuPresenter(getContext());
        this.f2254d = actionMenuPresenter2;
        actionMenuPresenter2.mo2449O(true);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        gVar.mo2052c(this.f2254d, this.f2252b);
        ActionMenuView actionMenuView = (ActionMenuView) this.f2254d.mo1942h(this);
        this.f2253c = actionMenuView;
        C18196h2.m82502I1(actionMenuView, (Drawable) null);
        addView(this.f2253c, layoutParams);
    }

    /* renamed from: r */
    public final void mo2352r() {
        int i;
        if (this.f1753G0 == null) {
            LayoutInflater.from(getContext()).inflate(C0387a.C0397j.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f1753G0 = linearLayout;
            this.f1754H0 = (TextView) linearLayout.findViewById(C0387a.C0394g.action_bar_title);
            this.f1755I0 = (TextView) this.f1753G0.findViewById(C0387a.C0394g.action_bar_subtitle);
            if (this.f1756J0 != 0) {
                this.f1754H0.setTextAppearance(getContext(), this.f1756J0);
            }
            if (this.f1757K0 != 0) {
                this.f1755I0.setTextAppearance(getContext(), this.f1757K0);
            }
        }
        this.f1754H0.setText(this.f1760x);
        this.f1755I0.setText(this.f1761y);
        boolean z = !TextUtils.isEmpty(this.f1760x);
        boolean z2 = !TextUtils.isEmpty(this.f1761y);
        TextView textView = this.f1755I0;
        int i2 = 0;
        if (z2) {
            i = 0;
        } else {
            i = 8;
        }
        textView.setVisibility(i);
        LinearLayout linearLayout2 = this.f1753G0;
        if (!z && !z2) {
            i2 = 8;
        }
        linearLayout2.setVisibility(i2);
        if (this.f1753G0.getParent() == null) {
            addView(this.f1753G0);
        }
    }

    /* renamed from: s */
    public boolean mo2353s() {
        return this.f1758L0;
    }

    public void setContentHeight(int i) {
        this.f2255e = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f1752F0;
        if (view2 != null) {
            removeView(view2);
        }
        this.f1752F0 = view;
        if (!(view == null || (linearLayout = this.f1753G0) == null)) {
            removeView(linearLayout);
            this.f1753G0 = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f1761y = charSequence;
        mo2352r();
    }

    public void setTitle(CharSequence charSequence) {
        this.f1760x = charSequence;
        mo2352r();
        C18196h2.m82486E1(this, charSequence);
    }

    public void setTitleOptional(boolean z) {
        if (z != this.f1758L0) {
            requestLayout();
        }
        this.f1758L0 = z;
    }

    public /* bridge */ /* synthetic */ void setVisibility(int i) {
        super.setVisibility(i);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* renamed from: t */
    public void mo2361t() {
        removeAllViews();
        this.f1752F0 = null;
        this.f2253c = null;
        this.f2254d = null;
        View view = this.f1751E0;
        if (view != null) {
            view.setOnClickListener((View.OnClickListener) null);
        }
    }

    public ActionBarContextView(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet) {
        this(context, attributeSet, C0387a.C0389b.actionModeStyle);
    }

    public ActionBarContextView(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0722h1 G = C0722h1.m3539G(context, attributeSet, C0387a.C0400m.ActionMode, i, 0);
        C18196h2.m82502I1(this, G.mo3466h(C0387a.C0400m.ActionMode_background));
        this.f1756J0 = G.mo3479u(C0387a.C0400m.ActionMode_titleTextStyle, 0);
        this.f1757K0 = G.mo3479u(C0387a.C0400m.ActionMode_subtitleTextStyle, 0);
        this.f2255e = G.mo3475q(C0387a.C0400m.ActionMode_height, 0);
        this.f1759M0 = G.mo3479u(C0387a.C0400m.ActionMode_closeItemLayout, C0387a.C0397j.abc_action_mode_close_item_material);
        G.mo3458I();
    }
}
