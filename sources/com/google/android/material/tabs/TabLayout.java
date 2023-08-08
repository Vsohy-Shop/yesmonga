package com.google.android.material.tabs;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.C0324b1;
import androidx.annotation.C0342h;
import androidx.annotation.C0347i0;
import androidx.annotation.C0354l;
import androidx.annotation.C0358n;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0366r;
import androidx.annotation.C0375v;
import androidx.annotation.C0376v0;
import androidx.annotation.RestrictTo;
import androidx.appcompat.content.res.C0507a;
import androidx.appcompat.widget.C0757o1;
import androidx.core.graphics.drawable.C17549d;
import androidx.core.util.C17997q;
import androidx.core.view.C18124b2;
import androidx.core.view.C18196h2;
import androidx.core.view.C18306m0;
import androidx.core.view.C18353r0;
import androidx.core.view.accessibility.C18065l0;
import androidx.core.widget.C18496q;
import androidx.viewpager.widget.C20784a;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.C31076a;
import com.google.android.material.animation.C31093a;
import com.google.android.material.badge.C31132a;
import com.google.android.material.badge.C31135b;
import com.google.android.material.internal.C31432x;
import com.google.android.material.shape.C31530k;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

@ViewPager.C20774e
public class TabLayout extends HorizontalScrollView {

    /* renamed from: A1 */
    public static final int f76711A1 = 2;

    /* renamed from: B1 */
    public static final int f76712B1 = 0;

    /* renamed from: C1 */
    public static final int f76713C1 = 1;

    /* renamed from: D1 */
    public static final int f76714D1 = 2;

    /* renamed from: E1 */
    public static final int f76715E1 = 3;

    /* renamed from: F1 */
    public static final int f76716F1 = 0;

    /* renamed from: G1 */
    public static final int f76717G1 = 1;

    /* renamed from: H1 */
    public static final int f76718H1 = 2;

    /* renamed from: j1 */
    public static final int f76719j1 = C31076a.C31090n.Widget_Design_TabLayout;
    @C0366r(unit = 0)

    /* renamed from: k1 */
    public static final int f76720k1 = 72;
    @C0366r(unit = 0)

    /* renamed from: l1 */
    public static final int f76721l1 = 8;
    @C0366r(unit = 0)

    /* renamed from: m1 */
    public static final int f76722m1 = 48;
    @C0366r(unit = 0)

    /* renamed from: n1 */
    public static final int f76723n1 = 56;
    @C0366r(unit = 0)

    /* renamed from: o1 */
    public static final int f76724o1 = 16;

    /* renamed from: p1 */
    public static final int f76725p1 = -1;

    /* renamed from: q1 */
    public static final int f76726q1 = 300;

    /* renamed from: r1 */
    public static final C17997q.C17998a<C31615i> f76727r1 = new C17997q.C18000c(16);

    /* renamed from: s1 */
    public static final String f76728s1 = "TabLayout";

    /* renamed from: t1 */
    public static final int f76729t1 = 0;

    /* renamed from: u1 */
    public static final int f76730u1 = 1;

    /* renamed from: v1 */
    public static final int f76731v1 = 2;

    /* renamed from: w1 */
    public static final int f76732w1 = 0;

    /* renamed from: x1 */
    public static final int f76733x1 = 1;

    /* renamed from: y1 */
    public static final int f76734y1 = 0;

    /* renamed from: z1 */
    public static final int f76735z1 = 1;

    /* renamed from: E0 */
    public int f76736E0;

    /* renamed from: F0 */
    public PorterDuff.Mode f76737F0;

    /* renamed from: G0 */
    public float f76738G0;

    /* renamed from: H0 */
    public float f76739H0;

    /* renamed from: I0 */
    public final int f76740I0;

    /* renamed from: J0 */
    public int f76741J0;

    /* renamed from: K0 */
    public final int f76742K0;

    /* renamed from: L0 */
    public final int f76743L0;

    /* renamed from: M0 */
    public final int f76744M0;

    /* renamed from: N0 */
    public int f76745N0;

    /* renamed from: O0 */
    public int f76746O0;

    /* renamed from: P0 */
    public int f76747P0;

    /* renamed from: Q0 */
    public int f76748Q0;

    /* renamed from: R0 */
    public int f76749R0;

    /* renamed from: S0 */
    public boolean f76750S0;

    /* renamed from: T0 */
    public boolean f76751T0;

    /* renamed from: U0 */
    public int f76752U0;

    /* renamed from: V0 */
    public int f76753V0;

    /* renamed from: W0 */
    public boolean f76754W0;

    /* renamed from: X0 */
    public C31623c f76755X0;
    @C0363p0

    /* renamed from: Y0 */
    public C31607c f76756Y0;

    /* renamed from: Z0 */
    public final ArrayList<C31607c> f76757Z0;

    /* renamed from: a */
    public final ArrayList<C31615i> f76758a;
    @C0363p0

    /* renamed from: a1 */
    public C31607c f76759a1;
    @C0363p0

    /* renamed from: b */
    public C31615i f76760b;

    /* renamed from: b1 */
    public ValueAnimator f76761b1;
    @C0359n0

    /* renamed from: c */
    public final C31612h f76762c;
    @C0363p0

    /* renamed from: c1 */
    public ViewPager f76763c1;

    /* renamed from: d */
    public int f76764d;
    @C0363p0

    /* renamed from: d1 */
    public C20784a f76765d1;

    /* renamed from: e */
    public int f76766e;

    /* renamed from: e1 */
    public DataSetObserver f76767e1;

    /* renamed from: f */
    public int f76768f;

    /* renamed from: f1 */
    public C31619m f76769f1;

    /* renamed from: g */
    public int f76770g;

    /* renamed from: g1 */
    public C31606b f76771g1;

    /* renamed from: h1 */
    public boolean f76772h1;

    /* renamed from: i1 */
    public final C17997q.C17998a<TabView> f76773i1;

    /* renamed from: v */
    public int f76774v;

    /* renamed from: w */
    public ColorStateList f76775w;

    /* renamed from: x */
    public ColorStateList f76776x;

    /* renamed from: y */
    public ColorStateList f76777y;
    @C0359n0

    /* renamed from: z */
    public Drawable f76778z;

    public final class TabView extends LinearLayout {

        /* renamed from: a */
        public C31615i f76779a;

        /* renamed from: b */
        public TextView f76780b;

        /* renamed from: c */
        public ImageView f76781c;
        @C0363p0

        /* renamed from: d */
        public View f76782d;
        @C0363p0

        /* renamed from: e */
        public C31132a f76783e;
        @C0363p0

        /* renamed from: f */
        public View f76784f;
        @C0363p0

        /* renamed from: g */
        public TextView f76785g;
        @C0363p0

        /* renamed from: v */
        public ImageView f76786v;
        @C0363p0

        /* renamed from: w */
        public Drawable f76787w;

        /* renamed from: x */
        public int f76788x = 2;

        /* renamed from: com.google.android.material.tabs.TabLayout$TabView$a */
        public class C31604a implements View.OnLayoutChangeListener {

            /* renamed from: a */
            public final /* synthetic */ View f76790a;

            public C31604a(View view) {
                this.f76790a = view;
            }

            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                if (this.f76790a.getVisibility() == 0) {
                    TabView.this.mo91392w(this.f76790a);
                }
            }
        }

        public TabView(@C0359n0 Context context) {
            super(context);
            mo91394y(context);
            C18196h2.m82571d2(this, TabLayout.this.f76764d, TabLayout.this.f76766e, TabLayout.this.f76768f, TabLayout.this.f76770g);
            setGravity(17);
            setOrientation(TabLayout.this.f76750S0 ^ true ? 1 : 0);
            setClickable(true);
            C18196h2.m82583g2(this, C18124b2.m82287c(getContext(), 1002));
        }

        /* access modifiers changed from: private */
        @C0363p0
        public C31132a getBadge() {
            return this.f76783e;
        }

        /* access modifiers changed from: private */
        @C0359n0
        public C31132a getOrCreateBadge() {
            if (this.f76783e == null) {
                this.f76783e = C31132a.m124995d(getContext());
            }
            mo91391v();
            C31132a aVar = this.f76783e;
            if (aVar != null) {
                return aVar;
            }
            throw new IllegalStateException("Unable to create badge");
        }

        /* renamed from: A */
        public final void mo91368A(@C0363p0 TextView textView, @C0363p0 ImageView imageView) {
            Drawable drawable;
            CharSequence charSequence;
            int i;
            C31615i iVar = this.f76779a;
            CharSequence charSequence2 = null;
            if (iVar == null || iVar.mo91424h() == null) {
                drawable = null;
            } else {
                drawable = C17549d.m80456r(this.f76779a.mo91424h()).mutate();
            }
            if (drawable != null) {
                C17549d.m80453o(drawable, TabLayout.this.f76776x);
                PorterDuff.Mode mode = TabLayout.this.f76737F0;
                if (mode != null) {
                    C17549d.m80454p(drawable, mode);
                }
            }
            C31615i iVar2 = this.f76779a;
            if (iVar2 != null) {
                charSequence = iVar2.mo91430n();
            } else {
                charSequence = null;
            }
            if (imageView != null) {
                if (drawable != null) {
                    imageView.setImageDrawable(drawable);
                    imageView.setVisibility(0);
                    setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                    imageView.setImageDrawable((Drawable) null);
                }
            }
            boolean z = !TextUtils.isEmpty(charSequence);
            if (textView != null) {
                if (z) {
                    textView.setText(charSequence);
                    if (this.f76779a.f76813g == 1) {
                        textView.setVisibility(0);
                    } else {
                        textView.setVisibility(8);
                    }
                    setVisibility(0);
                } else {
                    textView.setVisibility(8);
                    textView.setText((CharSequence) null);
                }
            }
            if (imageView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                if (!z || imageView.getVisibility() != 0) {
                    i = 0;
                } else {
                    i = (int) C31432x.m127010e(getContext(), 8);
                }
                if (TabLayout.this.f76750S0) {
                    if (i != C18353r0.m83081b(marginLayoutParams)) {
                        C18353r0.m83086g(marginLayoutParams, i);
                        marginLayoutParams.bottomMargin = 0;
                        imageView.setLayoutParams(marginLayoutParams);
                        imageView.requestLayout();
                    }
                } else if (i != marginLayoutParams.bottomMargin) {
                    marginLayoutParams.bottomMargin = i;
                    C18353r0.m83086g(marginLayoutParams, 0);
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            }
            C31615i iVar3 = this.f76779a;
            if (iVar3 != null) {
                charSequence2 = iVar3.f76810d;
            }
            if (!z) {
                charSequence = charSequence2;
            }
            C0757o1.m3709a(this, charSequence);
        }

        public void drawableStateChanged() {
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            Drawable drawable = this.f76787w;
            boolean z = false;
            if (drawable != null && drawable.isStateful()) {
                z = false | this.f76787w.setState(drawableState);
            }
            if (z) {
                invalidate();
                TabLayout.this.invalidate();
            }
        }

        public int getContentHeight() {
            View[] viewArr = {this.f76780b, this.f76781c, this.f76784f};
            int i = 0;
            int i2 = 0;
            boolean z = false;
            for (int i3 = 0; i3 < 3; i3++) {
                View view = viewArr[i3];
                if (view != null && view.getVisibility() == 0) {
                    if (z) {
                        i2 = Math.min(i2, view.getTop());
                    } else {
                        i2 = view.getTop();
                    }
                    if (z) {
                        i = Math.max(i, view.getBottom());
                    } else {
                        i = view.getBottom();
                    }
                    z = true;
                }
            }
            return i - i2;
        }

        public int getContentWidth() {
            View[] viewArr = {this.f76780b, this.f76781c, this.f76784f};
            int i = 0;
            int i2 = 0;
            boolean z = false;
            for (int i3 = 0; i3 < 3; i3++) {
                View view = viewArr[i3];
                if (view != null && view.getVisibility() == 0) {
                    if (z) {
                        i2 = Math.min(i2, view.getLeft());
                    } else {
                        i2 = view.getLeft();
                    }
                    if (z) {
                        i = Math.max(i, view.getRight());
                    } else {
                        i = view.getRight();
                    }
                    z = true;
                }
            }
            return i - i2;
        }

        @C0363p0
        public C31615i getTab() {
            return this.f76779a;
        }

        /* renamed from: i */
        public final void mo91373i(@C0363p0 View view) {
            if (view != null) {
                view.addOnLayoutChangeListener(new C31604a(view));
            }
        }

        /* renamed from: j */
        public final float mo91374j(@C0359n0 Layout layout, int i, float f) {
            return layout.getLineWidth(i) * (f / layout.getPaint().getTextSize());
        }

        /* renamed from: k */
        public final void mo91375k(boolean z) {
            setClipChildren(z);
            setClipToPadding(z);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(z);
                viewGroup.setClipToPadding(z);
            }
        }

        @C0359n0
        /* renamed from: l */
        public final FrameLayout mo91376l() {
            FrameLayout frameLayout = new FrameLayout(getContext());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            return frameLayout;
        }

        /* renamed from: m */
        public final void mo91377m(@C0359n0 Canvas canvas) {
            Drawable drawable = this.f76787w;
            if (drawable != null) {
                drawable.setBounds(getLeft(), getTop(), getRight(), getBottom());
                this.f76787w.draw(canvas);
            }
        }

        @C0363p0
        /* renamed from: n */
        public final FrameLayout mo91378n(@C0359n0 View view) {
            if ((view == this.f76781c || view == this.f76780b) && C31135b.f74647a) {
                return (FrameLayout) view.getParent();
            }
            return null;
        }

        /* renamed from: o */
        public final boolean mo91379o() {
            return this.f76783e != null;
        }

        public void onInitializeAccessibilityNodeInfo(@C0359n0 AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            C31132a aVar = this.f76783e;
            if (aVar != null && aVar.isVisible()) {
                CharSequence contentDescription = getContentDescription();
                accessibilityNodeInfo.setContentDescription(contentDescription + ", " + this.f76783e.mo88252o());
            }
            C18065l0 c2 = C18065l0.m81936c2(accessibilityNodeInfo);
            c2.mo52604c1(C18065l0.C18069d.m82106h(0, 1, this.f76779a.mo91427k(), 1, false, isSelected()));
            if (isSelected()) {
                c2.mo52596a1(false);
                c2.mo52556N0(C18065l0.C18066a.f46673j);
            }
            c2.mo52538G1(getResources().getString(C31076a.C31089m.item_view_role_description));
        }

        public void onMeasure(int i, int i2) {
            Layout layout;
            int size = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            int tabMaxWidth = TabLayout.this.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i = View.MeasureSpec.makeMeasureSpec(TabLayout.this.f76741J0, Integer.MIN_VALUE);
            }
            super.onMeasure(i, i2);
            if (this.f76780b != null) {
                float f = TabLayout.this.f76738G0;
                int i3 = this.f76788x;
                ImageView imageView = this.f76781c;
                boolean z = true;
                if (imageView == null || imageView.getVisibility() != 0) {
                    TextView textView = this.f76780b;
                    if (textView != null && textView.getLineCount() > 1) {
                        f = TabLayout.this.f76739H0;
                    }
                } else {
                    i3 = 1;
                }
                float textSize = this.f76780b.getTextSize();
                int lineCount = this.f76780b.getLineCount();
                int k = C18496q.m83737k(this.f76780b);
                int i4 = (f > textSize ? 1 : (f == textSize ? 0 : -1));
                if (i4 != 0 || (k >= 0 && i3 != k)) {
                    if (TabLayout.this.f76749R0 == 1 && i4 > 0 && lineCount == 1 && ((layout = this.f76780b.getLayout()) == null || mo91374j(layout, 0, f) > ((float) ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())))) {
                        z = false;
                    }
                    if (z) {
                        this.f76780b.setTextSize(0, f);
                        this.f76780b.setMaxLines(i3);
                        super.onMeasure(i, i2);
                    }
                }
            }
        }

        /* renamed from: p */
        public final void mo91382p() {
            ViewGroup viewGroup;
            if (C31135b.f74647a) {
                viewGroup = mo91376l();
                addView(viewGroup, 0);
            } else {
                viewGroup = this;
            }
            ImageView imageView = (ImageView) LayoutInflater.from(getContext()).inflate(C31076a.C31087k.design_layout_tab_icon, viewGroup, false);
            this.f76781c = imageView;
            viewGroup.addView(imageView, 0);
        }

        public boolean performClick() {
            boolean performClick = super.performClick();
            if (this.f76779a == null) {
                return performClick;
            }
            if (!performClick) {
                playSoundEffect(0);
            }
            this.f76779a.mo91434r();
            return true;
        }

        /* renamed from: q */
        public final void mo91384q() {
            ViewGroup viewGroup;
            if (C31135b.f74647a) {
                viewGroup = mo91376l();
                addView(viewGroup);
            } else {
                viewGroup = this;
            }
            TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(C31076a.C31087k.design_layout_tab_text, viewGroup, false);
            this.f76780b = textView;
            viewGroup.addView(textView);
        }

        /* renamed from: r */
        public final void mo91385r() {
            if (this.f76782d != null) {
                mo91390u();
            }
            this.f76783e = null;
        }

        /* renamed from: s */
        public void mo91386s() {
            setTab((C31615i) null);
            setSelected(false);
        }

        public void setSelected(boolean z) {
            if (isSelected() != z) {
            }
            super.setSelected(z);
            TextView textView = this.f76780b;
            if (textView != null) {
                textView.setSelected(z);
            }
            ImageView imageView = this.f76781c;
            if (imageView != null) {
                imageView.setSelected(z);
            }
            View view = this.f76784f;
            if (view != null) {
                view.setSelected(z);
            }
        }

        public void setTab(@C0363p0 C31615i iVar) {
            if (iVar != this.f76779a) {
                this.f76779a = iVar;
                mo91393x();
            }
        }

        /* renamed from: t */
        public final void mo91389t(@C0363p0 View view) {
            if (mo91379o() && view != null) {
                mo91375k(false);
                C31135b.m125061d(this.f76783e, view, mo91378n(view));
                this.f76782d = view;
            }
        }

        /* renamed from: u */
        public final void mo91390u() {
            if (mo91379o()) {
                mo91375k(true);
                View view = this.f76782d;
                if (view != null) {
                    C31135b.m125067j(this.f76783e, view);
                    this.f76782d = null;
                }
            }
        }

        /* renamed from: v */
        public final void mo91391v() {
            C31615i iVar;
            C31615i iVar2;
            if (mo91379o()) {
                if (this.f76784f != null) {
                    mo91390u();
                } else if (this.f76781c != null && (iVar2 = this.f76779a) != null && iVar2.mo91424h() != null) {
                    View view = this.f76782d;
                    ImageView imageView = this.f76781c;
                    if (view != imageView) {
                        mo91390u();
                        mo91389t(this.f76781c);
                        return;
                    }
                    mo91392w(imageView);
                } else if (this.f76780b == null || (iVar = this.f76779a) == null || iVar.mo91428l() != 1) {
                    mo91390u();
                } else {
                    View view2 = this.f76782d;
                    TextView textView = this.f76780b;
                    if (view2 != textView) {
                        mo91390u();
                        mo91389t(this.f76780b);
                        return;
                    }
                    mo91392w(textView);
                }
            }
        }

        /* renamed from: w */
        public final void mo91392w(@C0359n0 View view) {
            if (mo91379o() && view == this.f76782d) {
                C31135b.m125070m(this.f76783e, view, mo91378n(view));
            }
        }

        /* renamed from: x */
        public final void mo91393x() {
            View view;
            boolean z;
            C31615i iVar = this.f76779a;
            if (iVar != null) {
                view = iVar.mo91423g();
            } else {
                view = null;
            }
            if (view != null) {
                ViewParent parent = view.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(view);
                    }
                    addView(view);
                }
                this.f76784f = view;
                TextView textView = this.f76780b;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f76781c;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f76781c.setImageDrawable((Drawable) null);
                }
                TextView textView2 = (TextView) view.findViewById(16908308);
                this.f76785g = textView2;
                if (textView2 != null) {
                    this.f76788x = C18496q.m83737k(textView2);
                }
                this.f76786v = (ImageView) view.findViewById(16908294);
            } else {
                View view2 = this.f76784f;
                if (view2 != null) {
                    removeView(view2);
                    this.f76784f = null;
                }
                this.f76785g = null;
                this.f76786v = null;
            }
            if (this.f76784f == null) {
                if (this.f76781c == null) {
                    mo91382p();
                }
                if (this.f76780b == null) {
                    mo91384q();
                    this.f76788x = C18496q.m83737k(this.f76780b);
                }
                C18496q.m83723E(this.f76780b, TabLayout.this.f76774v);
                ColorStateList colorStateList = TabLayout.this.f76775w;
                if (colorStateList != null) {
                    this.f76780b.setTextColor(colorStateList);
                }
                mo91368A(this.f76780b, this.f76781c);
                mo91391v();
                mo91373i(this.f76781c);
                mo91373i(this.f76780b);
            } else {
                TextView textView3 = this.f76785g;
                if (!(textView3 == null && this.f76786v == null)) {
                    mo91368A(textView3, this.f76786v);
                }
            }
            if (iVar != null && !TextUtils.isEmpty(iVar.f76810d)) {
                setContentDescription(iVar.f76810d);
            }
            if (iVar == null || !iVar.mo91431o()) {
                z = false;
            } else {
                z = true;
            }
            setSelected(z);
        }

        /* JADX WARNING: type inference failed for: r3v0, types: [android.graphics.drawable.RippleDrawable] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: y */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo91394y(android.content.Context r6) {
            /*
                r5 = this;
                com.google.android.material.tabs.TabLayout r0 = com.google.android.material.tabs.TabLayout.this
                int r0 = r0.f76740I0
                r1 = 0
                if (r0 == 0) goto L_0x001f
                android.graphics.drawable.Drawable r6 = androidx.appcompat.content.res.C0507a.m2346b(r6, r0)
                r5.f76787w = r6
                if (r6 == 0) goto L_0x0021
                boolean r6 = r6.isStateful()
                if (r6 == 0) goto L_0x0021
                android.graphics.drawable.Drawable r6 = r5.f76787w
                int[] r0 = r5.getDrawableState()
                r6.setState(r0)
                goto L_0x0021
            L_0x001f:
                r5.f76787w = r1
            L_0x0021:
                android.graphics.drawable.GradientDrawable r6 = new android.graphics.drawable.GradientDrawable
                r6.<init>()
                r0 = 0
                r6.setColor(r0)
                com.google.android.material.tabs.TabLayout r0 = com.google.android.material.tabs.TabLayout.this
                android.content.res.ColorStateList r0 = r0.f76777y
                if (r0 == 0) goto L_0x0058
                android.graphics.drawable.GradientDrawable r0 = new android.graphics.drawable.GradientDrawable
                r0.<init>()
                r2 = 925353388(0x3727c5ac, float:1.0E-5)
                r0.setCornerRadius(r2)
                r2 = -1
                r0.setColor(r2)
                com.google.android.material.tabs.TabLayout r2 = com.google.android.material.tabs.TabLayout.this
                android.content.res.ColorStateList r2 = r2.f76777y
                android.content.res.ColorStateList r2 = com.google.android.material.ripple.C31511b.m127402a(r2)
                android.graphics.drawable.RippleDrawable r3 = new android.graphics.drawable.RippleDrawable
                com.google.android.material.tabs.TabLayout r4 = com.google.android.material.tabs.TabLayout.this
                boolean r4 = r4.f76754W0
                if (r4 == 0) goto L_0x0050
                r6 = r1
            L_0x0050:
                if (r4 == 0) goto L_0x0053
                goto L_0x0054
            L_0x0053:
                r1 = r0
            L_0x0054:
                r3.<init>(r2, r6, r1)
                r6 = r3
            L_0x0058:
                androidx.core.view.C18196h2.m82502I1(r5, r6)
                com.google.android.material.tabs.TabLayout r6 = com.google.android.material.tabs.TabLayout.this
                r6.invalidate()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.TabView.mo91394y(android.content.Context):void");
        }

        /* renamed from: z */
        public final void mo91395z() {
            setOrientation(TabLayout.this.f76750S0 ^ true ? 1 : 0);
            TextView textView = this.f76785g;
            if (textView == null && this.f76786v == null) {
                mo91368A(this.f76780b, this.f76781c);
            } else {
                mo91368A(textView, this.f76786v);
            }
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$a */
    public class C31605a implements ValueAnimator.AnimatorUpdateListener {
        public C31605a() {
        }

        public void onAnimationUpdate(@C0359n0 ValueAnimator valueAnimator) {
            TabLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$b */
    public class C31606b implements ViewPager.C20778i {

        /* renamed from: a */
        public boolean f76793a;

        public C31606b() {
        }

        /* renamed from: a */
        public void mo62298a(@C0359n0 ViewPager viewPager, @C0363p0 C20784a aVar, @C0363p0 C20784a aVar2) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.f76763c1 == viewPager) {
                tabLayout.mo91288P(aVar2, this.f76793a);
            }
        }

        /* renamed from: b */
        public void mo91398b(boolean z) {
            this.f76793a = z;
        }
    }

    @Deprecated
    /* renamed from: com.google.android.material.tabs.TabLayout$c */
    public interface C31607c<T extends C31615i> {
        /* renamed from: a */
        void mo67964a(T t);

        /* renamed from: b */
        void mo67965b(T t);

        /* renamed from: c */
        void mo67966c(T t);
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$d */
    public @interface C31608d {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.material.tabs.TabLayout$e */
    public @interface C31609e {
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$f */
    public interface C31610f extends C31607c<C31615i> {
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$g */
    public class C31611g extends DataSetObserver {
        public C31611g() {
        }

        public void onChanged() {
            TabLayout.this.mo91278F();
        }

        public void onInvalidated() {
            TabLayout.this.mo91278F();
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$h */
    public class C31612h extends LinearLayout {

        /* renamed from: a */
        public ValueAnimator f76796a;

        /* renamed from: b */
        public int f76797b = -1;

        /* renamed from: c */
        public float f76798c;

        /* renamed from: d */
        public int f76799d = -1;

        /* renamed from: com.google.android.material.tabs.TabLayout$h$a */
        public class C31613a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a */
            public final /* synthetic */ View f76801a;

            /* renamed from: b */
            public final /* synthetic */ View f76802b;

            public C31613a(View view, View view2) {
                this.f76801a = view;
                this.f76802b = view2;
            }

            public void onAnimationUpdate(@C0359n0 ValueAnimator valueAnimator) {
                C31612h.this.mo91408i(this.f76801a, this.f76802b, valueAnimator.getAnimatedFraction());
            }
        }

        /* renamed from: com.google.android.material.tabs.TabLayout$h$b */
        public class C31614b extends AnimatorListenerAdapter {

            /* renamed from: a */
            public final /* synthetic */ int f76804a;

            public C31614b(int i) {
                this.f76804a = i;
            }

            public void onAnimationEnd(Animator animator) {
                C31612h.this.f76797b = this.f76804a;
            }

            public void onAnimationStart(Animator animator) {
                C31612h.this.f76797b = this.f76804a;
            }
        }

        public C31612h(Context context) {
            super(context);
            setWillNotDraw(false);
        }

        /* renamed from: c */
        public void mo91401c(int i, int i2) {
            ValueAnimator valueAnimator = this.f76796a;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f76796a.cancel();
            }
            mo91409j(true, i, i2);
        }

        /* renamed from: d */
        public boolean mo91402d() {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (getChildAt(i).getWidth() <= 0) {
                    return true;
                }
            }
            return false;
        }

        public void draw(@C0359n0 Canvas canvas) {
            int i;
            int height = TabLayout.this.f76778z.getBounds().height();
            if (height < 0) {
                height = TabLayout.this.f76778z.getIntrinsicHeight();
            }
            int i2 = TabLayout.this.f76748Q0;
            if (i2 == 0) {
                i = getHeight() - height;
                height = getHeight();
            } else if (i2 != 1) {
                i = 0;
                if (i2 != 2) {
                    if (i2 != 3) {
                        height = 0;
                    } else {
                        height = getHeight();
                    }
                }
            } else {
                i = (getHeight() - height) / 2;
                height = (getHeight() + height) / 2;
            }
            if (TabLayout.this.f76778z.getBounds().width() > 0) {
                Rect bounds = TabLayout.this.f76778z.getBounds();
                TabLayout.this.f76778z.setBounds(bounds.left, i, bounds.right, height);
                TabLayout tabLayout = TabLayout.this;
                Drawable drawable = tabLayout.f76778z;
                if (tabLayout.f76736E0 != 0) {
                    drawable = C17549d.m80456r(drawable);
                    C17549d.m80452n(drawable, TabLayout.this.f76736E0);
                } else {
                    C17549d.m80453o(drawable, (ColorStateList) null);
                }
                drawable.draw(canvas);
            }
            super.draw(canvas);
        }

        /* renamed from: e */
        public float mo91404e() {
            return ((float) this.f76797b) + this.f76798c;
        }

        /* renamed from: f */
        public final void mo91405f() {
            View childAt = getChildAt(this.f76797b);
            C31623c a = TabLayout.this.f76755X0;
            TabLayout tabLayout = TabLayout.this;
            a.mo91445c(tabLayout, childAt, tabLayout.f76778z);
        }

        /* renamed from: g */
        public void mo91406g(int i, float f) {
            ValueAnimator valueAnimator = this.f76796a;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f76796a.cancel();
            }
            this.f76797b = i;
            this.f76798c = f;
            mo91408i(getChildAt(i), getChildAt(this.f76797b + 1), this.f76798c);
        }

        /* renamed from: h */
        public void mo91407h(int i) {
            Rect bounds = TabLayout.this.f76778z.getBounds();
            TabLayout.this.f76778z.setBounds(bounds.left, 0, bounds.right, i);
            requestLayout();
        }

        /* renamed from: i */
        public final void mo91408i(View view, View view2, float f) {
            boolean z;
            if (view == null || view.getWidth() <= 0) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                C31623c a = TabLayout.this.f76755X0;
                TabLayout tabLayout = TabLayout.this;
                a.mo91444d(tabLayout, view, view2, f, tabLayout.f76778z);
            } else {
                Drawable drawable = TabLayout.this.f76778z;
                drawable.setBounds(-1, drawable.getBounds().top, -1, TabLayout.this.f76778z.getBounds().bottom);
            }
            C18196h2.m82610n1(this);
        }

        /* renamed from: j */
        public final void mo91409j(boolean z, int i, int i2) {
            View childAt = getChildAt(this.f76797b);
            View childAt2 = getChildAt(i);
            if (childAt2 == null) {
                mo91405f();
                return;
            }
            C31613a aVar = new C31613a(childAt, childAt2);
            if (z) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.f76796a = valueAnimator;
                valueAnimator.setInterpolator(C31093a.f74426b);
                valueAnimator.setDuration((long) i2);
                valueAnimator.setFloatValues(new float[]{0.0f, 1.0f});
                valueAnimator.addUpdateListener(aVar);
                valueAnimator.addListener(new C31614b(i));
                valueAnimator.start();
                return;
            }
            this.f76796a.removeAllUpdateListeners();
            this.f76796a.addUpdateListener(aVar);
        }

        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            ValueAnimator valueAnimator = this.f76796a;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                mo91405f();
            } else {
                mo91409j(false, this.f76797b, -1);
            }
        }

        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (View.MeasureSpec.getMode(i) == 1073741824) {
                TabLayout tabLayout = TabLayout.this;
                boolean z = true;
                if (tabLayout.f76746O0 == 1 || tabLayout.f76749R0 == 2) {
                    int childCount = getChildCount();
                    int i3 = 0;
                    for (int i4 = 0; i4 < childCount; i4++) {
                        View childAt = getChildAt(i4);
                        if (childAt.getVisibility() == 0) {
                            i3 = Math.max(i3, childAt.getMeasuredWidth());
                        }
                    }
                    if (i3 > 0) {
                        if (i3 * childCount <= getMeasuredWidth() - (((int) C31432x.m127010e(getContext(), 16)) * 2)) {
                            boolean z2 = false;
                            for (int i5 = 0; i5 < childCount; i5++) {
                                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i5).getLayoutParams();
                                if (layoutParams.width != i3 || layoutParams.weight != 0.0f) {
                                    layoutParams.width = i3;
                                    layoutParams.weight = 0.0f;
                                    z2 = true;
                                }
                            }
                            z = z2;
                        } else {
                            TabLayout tabLayout2 = TabLayout.this;
                            tabLayout2.f76746O0 = 0;
                            tabLayout2.mo91292T(false);
                        }
                        if (z) {
                            super.onMeasure(i, i2);
                        }
                    }
                }
            }
        }

        public void onRtlPropertiesChanged(int i) {
            super.onRtlPropertiesChanged(i);
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$i */
    public static class C31615i {

        /* renamed from: k */
        public static final int f76806k = -1;
        @C0363p0

        /* renamed from: a */
        public Object f76807a;
        @C0363p0

        /* renamed from: b */
        public Drawable f76808b;
        @C0363p0

        /* renamed from: c */
        public CharSequence f76809c;
        @C0363p0

        /* renamed from: d */
        public CharSequence f76810d;

        /* renamed from: e */
        public int f76811e = -1;
        @C0363p0

        /* renamed from: f */
        public View f76812f;
        @C31608d

        /* renamed from: g */
        public int f76813g = 1;
        @C0363p0

        /* renamed from: h */
        public TabLayout f76814h;
        @C0359n0

        /* renamed from: i */
        public TabView f76815i;

        /* renamed from: j */
        public int f76816j = -1;

        @C0359n0
        /* renamed from: A */
        public C31615i mo91416A(@C31608d int i) {
            this.f76813g = i;
            TabLayout tabLayout = this.f76814h;
            if (tabLayout.f76746O0 == 1 || tabLayout.f76749R0 == 2) {
                tabLayout.mo91292T(true);
            }
            mo91420E();
            if (C31135b.f74647a && this.f76815i.mo91379o() && this.f76815i.f76783e.isVisible()) {
                this.f76815i.invalidate();
            }
            return this;
        }

        @C0359n0
        /* renamed from: B */
        public C31615i mo91417B(@C0363p0 Object obj) {
            this.f76807a = obj;
            return this;
        }

        @C0359n0
        /* renamed from: C */
        public C31615i mo91418C(@C0324b1 int i) {
            TabLayout tabLayout = this.f76814h;
            if (tabLayout != null) {
                return mo91419D(tabLayout.getResources().getText(i));
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        @C0359n0
        /* renamed from: D */
        public C31615i mo91419D(@C0363p0 CharSequence charSequence) {
            if (TextUtils.isEmpty(this.f76810d) && !TextUtils.isEmpty(charSequence)) {
                this.f76815i.setContentDescription(charSequence);
            }
            this.f76809c = charSequence;
            mo91420E();
            return this;
        }

        /* renamed from: E */
        public void mo91420E() {
            TabView tabView = this.f76815i;
            if (tabView != null) {
                tabView.mo91393x();
            }
        }

        @C0363p0
        /* renamed from: e */
        public C31132a mo91421e() {
            return this.f76815i.getBadge();
        }

        @C0363p0
        /* renamed from: f */
        public CharSequence mo91422f() {
            TabView tabView = this.f76815i;
            if (tabView == null) {
                return null;
            }
            return tabView.getContentDescription();
        }

        @C0363p0
        /* renamed from: g */
        public View mo91423g() {
            return this.f76812f;
        }

        @C0363p0
        /* renamed from: h */
        public Drawable mo91424h() {
            return this.f76808b;
        }

        /* renamed from: i */
        public int mo91425i() {
            return this.f76816j;
        }

        @C0359n0
        /* renamed from: j */
        public C31132a mo91426j() {
            return this.f76815i.getOrCreateBadge();
        }

        /* renamed from: k */
        public int mo91427k() {
            return this.f76811e;
        }

        @C31608d
        /* renamed from: l */
        public int mo91428l() {
            return this.f76813g;
        }

        @C0363p0
        /* renamed from: m */
        public Object mo91429m() {
            return this.f76807a;
        }

        @C0363p0
        /* renamed from: n */
        public CharSequence mo91430n() {
            return this.f76809c;
        }

        /* renamed from: o */
        public boolean mo91431o() {
            TabLayout tabLayout = this.f76814h;
            if (tabLayout != null) {
                int selectedTabPosition = tabLayout.getSelectedTabPosition();
                if (selectedTabPosition == -1 || selectedTabPosition != this.f76811e) {
                    return false;
                }
                return true;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        /* renamed from: p */
        public void mo91432p() {
            this.f76815i.mo91385r();
        }

        /* renamed from: q */
        public void mo91433q() {
            this.f76814h = null;
            this.f76815i = null;
            this.f76807a = null;
            this.f76808b = null;
            this.f76816j = -1;
            this.f76809c = null;
            this.f76810d = null;
            this.f76811e = -1;
            this.f76812f = null;
        }

        /* renamed from: r */
        public void mo91434r() {
            TabLayout tabLayout = this.f76814h;
            if (tabLayout != null) {
                tabLayout.mo91286N(this);
                return;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        @C0359n0
        /* renamed from: s */
        public C31615i mo91435s(@C0324b1 int i) {
            TabLayout tabLayout = this.f76814h;
            if (tabLayout != null) {
                return mo91436t(tabLayout.getResources().getText(i));
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        @C0359n0
        /* renamed from: t */
        public C31615i mo91436t(@C0363p0 CharSequence charSequence) {
            this.f76810d = charSequence;
            mo91420E();
            return this;
        }

        @C0359n0
        /* renamed from: u */
        public C31615i mo91437u(@C0347i0 int i) {
            return mo91438v(LayoutInflater.from(this.f76815i.getContext()).inflate(i, this.f76815i, false));
        }

        @C0359n0
        /* renamed from: v */
        public C31615i mo91438v(@C0363p0 View view) {
            this.f76812f = view;
            mo91420E();
            return this;
        }

        @C0359n0
        /* renamed from: w */
        public C31615i mo91439w(@C0375v int i) {
            TabLayout tabLayout = this.f76814h;
            if (tabLayout != null) {
                return mo91440x(C0507a.m2346b(tabLayout.getContext(), i));
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        @C0359n0
        /* renamed from: x */
        public C31615i mo91440x(@C0363p0 Drawable drawable) {
            this.f76808b = drawable;
            TabLayout tabLayout = this.f76814h;
            if (tabLayout.f76746O0 == 1 || tabLayout.f76749R0 == 2) {
                tabLayout.mo91292T(true);
            }
            mo91420E();
            if (C31135b.f74647a && this.f76815i.mo91379o() && this.f76815i.f76783e.isVisible()) {
                this.f76815i.invalidate();
            }
            return this;
        }

        @C0359n0
        /* renamed from: y */
        public C31615i mo91441y(int i) {
            this.f76816j = i;
            TabView tabView = this.f76815i;
            if (tabView != null) {
                tabView.setId(i);
            }
            return this;
        }

        /* renamed from: z */
        public void mo91442z(int i) {
            this.f76811e = i;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.material.tabs.TabLayout$j */
    public @interface C31616j {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.material.tabs.TabLayout$k */
    public @interface C31617k {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.material.tabs.TabLayout$l */
    public @interface C31618l {
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$m */
    public static class C31619m implements ViewPager.C20779j {
        @C0359n0

        /* renamed from: a */
        public final WeakReference<TabLayout> f76817a;

        /* renamed from: b */
        public int f76818b;

        /* renamed from: c */
        public int f76819c;

        public C31619m(TabLayout tabLayout) {
            this.f76817a = new WeakReference<>(tabLayout);
        }

        /* renamed from: a */
        public void mo91443a() {
            this.f76819c = 0;
            this.f76818b = 0;
        }

        /* renamed from: d */
        public void mo30672d(int i, float f, int i2) {
            boolean z;
            TabLayout tabLayout = this.f76817a.get();
            if (tabLayout != null) {
                int i3 = this.f76819c;
                boolean z2 = false;
                if (i3 != 2 || this.f76818b == 1) {
                    z = true;
                } else {
                    z = false;
                }
                if (!(i3 == 2 && this.f76818b == 0)) {
                    z2 = true;
                }
                tabLayout.setScrollPosition(i, f, z, z2);
            }
        }

        /* renamed from: e */
        public void mo30673e(int i) {
            this.f76818b = this.f76819c;
            this.f76819c = i;
        }

        /* renamed from: f */
        public void mo30674f(int i) {
            boolean z;
            TabLayout tabLayout = this.f76817a.get();
            if (tabLayout != null && tabLayout.getSelectedTabPosition() != i && i < tabLayout.getTabCount()) {
                int i2 = this.f76819c;
                if (i2 == 0 || (i2 == 2 && this.f76818b == 0)) {
                    z = true;
                } else {
                    z = false;
                }
                tabLayout.mo91287O(tabLayout.mo91367z(i), z);
            }
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$n */
    public static class C31620n implements C31610f {

        /* renamed from: a */
        public final ViewPager f76820a;

        public C31620n(ViewPager viewPager) {
            this.f76820a = viewPager;
        }

        /* renamed from: a */
        public void mo67964a(@C0359n0 C31615i iVar) {
            this.f76820a.setCurrentItem(iVar.mo91427k());
        }

        /* renamed from: b */
        public void mo67965b(C31615i iVar) {
        }

        /* renamed from: c */
        public void mo67966c(C31615i iVar) {
        }
    }

    public TabLayout(@C0359n0 Context context) {
        this(context, (AttributeSet) null);
    }

    @C0366r(unit = 0)
    private int getDefaultHeight() {
        int size = this.f76758a.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i < size) {
                C31615i iVar = this.f76758a.get(i);
                if (iVar != null && iVar.mo91424h() != null && !TextUtils.isEmpty(iVar.mo91430n())) {
                    z = true;
                    break;
                }
                i++;
            } else {
                break;
            }
        }
        if (!z || this.f76750S0) {
            return 48;
        }
        return 72;
    }

    private int getTabMinWidth() {
        int i = this.f76742K0;
        if (i != -1) {
            return i;
        }
        int i2 = this.f76749R0;
        if (i2 == 0 || i2 == 2) {
            return this.f76744M0;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.f76762c.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    @C0359n0
    /* renamed from: r */
    public static ColorStateList m128024r(int i, int i2) {
        return new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i2, i});
    }

    private void setSelectedTabView(int i) {
        boolean z;
        int childCount = this.f76762c.getChildCount();
        if (i < childCount) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = this.f76762c.getChildAt(i2);
                boolean z2 = true;
                if (i2 == i) {
                    z = true;
                } else {
                    z = false;
                }
                childAt.setSelected(z);
                if (i2 != i) {
                    z2 = false;
                }
                childAt.setActivated(z2);
            }
        }
    }

    /* renamed from: A */
    public boolean mo91273A() {
        return this.f76754W0;
    }

    /* renamed from: B */
    public boolean mo91274B() {
        return this.f76750S0;
    }

    /* renamed from: C */
    public final boolean mo91275C() {
        return getTabMode() == 0 || getTabMode() == 2;
    }

    /* renamed from: D */
    public boolean mo91276D() {
        return this.f76751T0;
    }

    @C0359n0
    /* renamed from: E */
    public C31615i mo91277E() {
        C31615i t = mo91361t();
        t.f76814h = this;
        t.f76815i = mo91362u(t);
        if (t.f76816j != -1) {
            t.f76815i.setId(t.f76816j);
        }
        return t;
    }

    /* renamed from: F */
    public void mo91278F() {
        int currentItem;
        mo91280H();
        C20784a aVar = this.f76765d1;
        if (aVar != null) {
            int e = aVar.mo21373e();
            for (int i = 0; i < e; i++) {
                mo91314h(mo91277E().mo91419D(this.f76765d1.mo62410g(i)), false);
            }
            ViewPager viewPager = this.f76763c1;
            if (viewPager != null && e > 0 && (currentItem = viewPager.getCurrentItem()) != getSelectedTabPosition() && currentItem < getTabCount()) {
                mo91286N(mo91367z(currentItem));
            }
        }
    }

    /* renamed from: G */
    public boolean mo91279G(C31615i iVar) {
        return f76727r1.mo52468a(iVar);
    }

    /* renamed from: H */
    public void mo91280H() {
        for (int childCount = this.f76762c.getChildCount() - 1; childCount >= 0; childCount--) {
            mo91285M(childCount);
        }
        Iterator<C31615i> it = this.f76758a.iterator();
        while (it.hasNext()) {
            C31615i next = it.next();
            it.remove();
            next.mo91433q();
            mo91279G(next);
        }
        this.f76760b = null;
    }

    @Deprecated
    /* renamed from: I */
    public void mo91281I(@C0363p0 C31607c cVar) {
        this.f76757Z0.remove(cVar);
    }

    /* renamed from: J */
    public void mo91282J(@C0359n0 C31610f fVar) {
        mo91281I(fVar);
    }

    /* renamed from: K */
    public void mo91283K(@C0359n0 C31615i iVar) {
        if (iVar.f76814h == this) {
            mo91284L(iVar.mo91427k());
            return;
        }
        throw new IllegalArgumentException("Tab does not belong to this TabLayout.");
    }

    /* renamed from: L */
    public void mo91284L(int i) {
        int i2;
        C31615i iVar;
        C31615i iVar2 = this.f76760b;
        if (iVar2 != null) {
            i2 = iVar2.mo91427k();
        } else {
            i2 = 0;
        }
        mo91285M(i);
        C31615i remove = this.f76758a.remove(i);
        if (remove != null) {
            remove.mo91433q();
            mo91279G(remove);
        }
        int size = this.f76758a.size();
        for (int i3 = i; i3 < size; i3++) {
            this.f76758a.get(i3).mo91442z(i3);
        }
        if (i2 == i) {
            if (this.f76758a.isEmpty()) {
                iVar = null;
            } else {
                iVar = this.f76758a.get(Math.max(0, i - 1));
            }
            mo91286N(iVar);
        }
    }

    /* renamed from: M */
    public final void mo91285M(int i) {
        TabView tabView = (TabView) this.f76762c.getChildAt(i);
        this.f76762c.removeViewAt(i);
        if (tabView != null) {
            tabView.mo91386s();
            this.f76773i1.mo52468a(tabView);
        }
        requestLayout();
    }

    /* renamed from: N */
    public void mo91286N(@C0363p0 C31615i iVar) {
        mo91287O(iVar, true);
    }

    /* renamed from: O */
    public void mo91287O(@C0363p0 C31615i iVar, boolean z) {
        int i;
        C31615i iVar2 = this.f76760b;
        if (iVar2 != iVar) {
            if (iVar != null) {
                i = iVar.mo91427k();
            } else {
                i = -1;
            }
            if (z) {
                if ((iVar2 == null || iVar2.mo91427k() == -1) && i != -1) {
                    setScrollPosition(i, 0.0f, true);
                } else {
                    mo91318l(i);
                }
                if (i != -1) {
                    setSelectedTabView(i);
                }
            }
            this.f76760b = iVar;
            if (iVar2 != null) {
                mo91365x(iVar2);
            }
            if (iVar != null) {
                mo91364w(iVar);
            }
        } else if (iVar2 != null) {
            mo91363v(iVar);
            mo91318l(iVar.mo91427k());
        }
    }

    /* renamed from: P */
    public void mo91288P(@C0363p0 C20784a aVar, boolean z) {
        DataSetObserver dataSetObserver;
        C20784a aVar2 = this.f76765d1;
        if (!(aVar2 == null || (dataSetObserver = this.f76767e1) == null)) {
            aVar2.mo62418u(dataSetObserver);
        }
        this.f76765d1 = aVar;
        if (z && aVar != null) {
            if (this.f76767e1 == null) {
                this.f76767e1 = new C31611g();
            }
            aVar.mo62414m(this.f76767e1);
        }
        mo91278F();
    }

    /* renamed from: Q */
    public final void mo91289Q(@C0363p0 ViewPager viewPager, boolean z, boolean z2) {
        ViewPager viewPager2 = this.f76763c1;
        if (viewPager2 != null) {
            C31619m mVar = this.f76769f1;
            if (mVar != null) {
                viewPager2.mo62314O(mVar);
            }
            C31606b bVar = this.f76771g1;
            if (bVar != null) {
                this.f76763c1.mo62313N(bVar);
            }
        }
        C31607c cVar = this.f76759a1;
        if (cVar != null) {
            mo91281I(cVar);
            this.f76759a1 = null;
        }
        if (viewPager != null) {
            this.f76763c1 = viewPager;
            if (this.f76769f1 == null) {
                this.f76769f1 = new C31619m(this);
            }
            this.f76769f1.mo91443a();
            viewPager.mo62329c(this.f76769f1);
            C31620n nVar = new C31620n(viewPager);
            this.f76759a1 = nVar;
            mo91297c(nVar);
            C20784a adapter = viewPager.getAdapter();
            if (adapter != null) {
                mo91288P(adapter, z);
            }
            if (this.f76771g1 == null) {
                this.f76771g1 = new C31606b();
            }
            this.f76771g1.mo91398b(z);
            viewPager.mo62328b(this.f76771g1);
            setScrollPosition(viewPager.getCurrentItem(), 0.0f, true);
        } else {
            this.f76763c1 = null;
            mo91288P((C20784a) null, false);
        }
        this.f76772h1 = z2;
    }

    /* renamed from: R */
    public final void mo91290R() {
        int size = this.f76758a.size();
        for (int i = 0; i < size; i++) {
            this.f76758a.get(i).mo91420E();
        }
    }

    /* renamed from: S */
    public final void mo91291S(@C0359n0 LinearLayout.LayoutParams layoutParams) {
        if (this.f76749R0 == 1 && this.f76746O0 == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
            return;
        }
        layoutParams.width = -2;
        layoutParams.weight = 0.0f;
    }

    /* renamed from: T */
    public void mo91292T(boolean z) {
        for (int i = 0; i < this.f76762c.getChildCount(); i++) {
            View childAt = this.f76762c.getChildAt(i);
            childAt.setMinimumWidth(getTabMinWidth());
            mo91291S((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z) {
                childAt.requestLayout();
            }
        }
    }

    public void addView(View view) {
        mo91317k(view);
    }

    @Deprecated
    /* renamed from: c */
    public void mo91297c(@C0363p0 C31607c cVar) {
        if (!this.f76757Z0.contains(cVar)) {
            this.f76757Z0.add(cVar);
        }
    }

    /* renamed from: d */
    public void mo91298d(@C0359n0 C31610f fVar) {
        mo91297c(fVar);
    }

    /* renamed from: e */
    public void mo91299e(@C0359n0 C31615i iVar) {
        mo91314h(iVar, this.f76758a.isEmpty());
    }

    /* renamed from: f */
    public void mo91300f(@C0359n0 C31615i iVar, int i) {
        mo91301g(iVar, i, this.f76758a.isEmpty());
    }

    /* renamed from: g */
    public void mo91301g(@C0359n0 C31615i iVar, int i, boolean z) {
        if (iVar.f76814h == this) {
            mo91330q(iVar, i);
            mo91316j(iVar);
            if (z) {
                iVar.mo91434r();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
    }

    public int getSelectedTabPosition() {
        C31615i iVar = this.f76760b;
        if (iVar != null) {
            return iVar.mo91427k();
        }
        return -1;
    }

    public int getTabCount() {
        return this.f76758a.size();
    }

    public int getTabGravity() {
        return this.f76746O0;
    }

    @C0363p0
    public ColorStateList getTabIconTint() {
        return this.f76776x;
    }

    public int getTabIndicatorAnimationMode() {
        return this.f76753V0;
    }

    public int getTabIndicatorGravity() {
        return this.f76748Q0;
    }

    public int getTabMaxWidth() {
        return this.f76741J0;
    }

    public int getTabMode() {
        return this.f76749R0;
    }

    @C0363p0
    public ColorStateList getTabRippleColor() {
        return this.f76777y;
    }

    @C0359n0
    public Drawable getTabSelectedIndicator() {
        return this.f76778z;
    }

    @C0363p0
    public ColorStateList getTabTextColors() {
        return this.f76775w;
    }

    /* renamed from: h */
    public void mo91314h(@C0359n0 C31615i iVar, boolean z) {
        mo91301g(iVar, this.f76758a.size(), z);
    }

    /* renamed from: i */
    public final void mo91315i(@C0359n0 TabItem tabItem) {
        C31615i E = mo91277E();
        CharSequence charSequence = tabItem.f76708a;
        if (charSequence != null) {
            E.mo91419D(charSequence);
        }
        Drawable drawable = tabItem.f76709b;
        if (drawable != null) {
            E.mo91440x(drawable);
        }
        int i = tabItem.f76710c;
        if (i != 0) {
            E.mo91437u(i);
        }
        if (!TextUtils.isEmpty(tabItem.getContentDescription())) {
            E.mo91436t(tabItem.getContentDescription());
        }
        mo91299e(E);
    }

    /* renamed from: j */
    public final void mo91316j(@C0359n0 C31615i iVar) {
        TabView tabView = iVar.f76815i;
        tabView.setSelected(false);
        tabView.setActivated(false);
        this.f76762c.addView(tabView, iVar.mo91427k(), mo91331s());
    }

    /* renamed from: k */
    public final void mo91317k(View view) {
        if (view instanceof TabItem) {
            mo91315i((TabItem) view);
            return;
        }
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    /* renamed from: l */
    public final void mo91318l(int i) {
        if (i != -1) {
            if (getWindowToken() == null || !C18196h2.m82539U0(this) || this.f76762c.mo91402d()) {
                setScrollPosition(i, 0.0f, true);
                return;
            }
            int scrollX = getScrollX();
            int o = mo91321o(i, 0.0f);
            if (scrollX != o) {
                mo91366y();
                this.f76761b1.setIntValues(new int[]{scrollX, o});
                this.f76761b1.start();
            }
            this.f76762c.mo91401c(i, this.f76747P0);
        }
    }

    /* renamed from: m */
    public final void mo91319m(int i) {
        if (i != 0) {
            if (i == 1) {
                this.f76762c.setGravity(1);
                return;
            } else if (i != 2) {
                return;
            }
        }
        this.f76762c.setGravity(C18306m0.f46960b);
    }

    /* renamed from: n */
    public final void mo91320n() {
        int i;
        int i2 = this.f76749R0;
        if (i2 == 0 || i2 == 2) {
            i = Math.max(0, this.f76745N0 - this.f76764d);
        } else {
            i = 0;
        }
        C18196h2.m82571d2(this.f76762c, i, 0, 0, 0);
        int i3 = this.f76749R0;
        if (i3 == 0) {
            mo91319m(this.f76746O0);
        } else if (i3 == 1 || i3 == 2) {
            this.f76762c.setGravity(1);
        }
        mo91292T(true);
    }

    /* renamed from: o */
    public final int mo91321o(int i, float f) {
        View childAt;
        View view;
        int i2 = this.f76749R0;
        int i3 = 0;
        if ((i2 != 0 && i2 != 2) || (childAt = this.f76762c.getChildAt(i)) == null) {
            return 0;
        }
        int i4 = i + 1;
        if (i4 < this.f76762c.getChildCount()) {
            view = this.f76762c.getChildAt(i4);
        } else {
            view = null;
        }
        int width = childAt.getWidth();
        if (view != null) {
            i3 = view.getWidth();
        }
        int left = (childAt.getLeft() + (width / 2)) - (getWidth() / 2);
        int i5 = (int) (((float) (width + i3)) * 0.5f * f);
        if (C18196h2.m82553Z(this) == 0) {
            return left + i5;
        }
        return left - i5;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C31530k.m127554e(this);
        if (this.f76763c1 == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                mo91289Q((ViewPager) parent, true, true);
            }
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f76772h1) {
            setupWithViewPager((ViewPager) null);
            this.f76772h1 = false;
        }
    }

    public void onDraw(@C0359n0 Canvas canvas) {
        for (int i = 0; i < this.f76762c.getChildCount(); i++) {
            View childAt = this.f76762c.getChildAt(i);
            if (childAt instanceof TabView) {
                ((TabView) childAt).mo91377m(canvas);
            }
        }
        super.onDraw(canvas);
    }

    public void onInitializeAccessibilityNodeInfo(@C0359n0 AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C18065l0.m81936c2(accessibilityNodeInfo).mo52600b1(C18065l0.C18068c.m82100f(1, getTabCount(), false, 1));
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return mo91275C() && super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0073, code lost:
        if (r0 != 2) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007e, code lost:
        if (r7.getMeasuredWidth() != getMeasuredWidth()) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0080, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008a, code lost:
        if (r7.getMeasuredWidth() < getMeasuredWidth()) goto L_0x0080;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.getContext()
            int r1 = r6.getDefaultHeight()
            float r0 = com.google.android.material.internal.C31432x.m127010e(r0, r1)
            int r0 = java.lang.Math.round(r0)
            int r1 = android.view.View.MeasureSpec.getMode(r8)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            r4 = 0
            r5 = 1
            if (r1 == r2) goto L_0x002e
            if (r1 == 0) goto L_0x001f
            goto L_0x0041
        L_0x001f:
            int r8 = r6.getPaddingTop()
            int r0 = r0 + r8
            int r8 = r6.getPaddingBottom()
            int r0 = r0 + r8
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            goto L_0x0041
        L_0x002e:
            int r1 = r6.getChildCount()
            if (r1 != r5) goto L_0x0041
            int r1 = android.view.View.MeasureSpec.getSize(r8)
            if (r1 < r0) goto L_0x0041
            android.view.View r1 = r6.getChildAt(r4)
            r1.setMinimumHeight(r0)
        L_0x0041:
            int r0 = android.view.View.MeasureSpec.getSize(r7)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            if (r1 == 0) goto L_0x005f
            int r1 = r6.f76743L0
            if (r1 <= 0) goto L_0x0050
            goto L_0x005d
        L_0x0050:
            float r0 = (float) r0
            android.content.Context r1 = r6.getContext()
            r2 = 56
            float r1 = com.google.android.material.internal.C31432x.m127010e(r1, r2)
            float r0 = r0 - r1
            int r1 = (int) r0
        L_0x005d:
            r6.f76741J0 = r1
        L_0x005f:
            super.onMeasure(r7, r8)
            int r7 = r6.getChildCount()
            if (r7 != r5) goto L_0x00ad
            android.view.View r7 = r6.getChildAt(r4)
            int r0 = r6.f76749R0
            if (r0 == 0) goto L_0x0082
            if (r0 == r5) goto L_0x0076
            r1 = 2
            if (r0 == r1) goto L_0x0082
            goto L_0x008d
        L_0x0076:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 == r1) goto L_0x008d
        L_0x0080:
            r4 = r5
            goto L_0x008d
        L_0x0082:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 >= r1) goto L_0x008d
            goto L_0x0080
        L_0x008d:
            if (r4 == 0) goto L_0x00ad
            int r0 = r6.getPaddingTop()
            int r1 = r6.getPaddingBottom()
            int r0 = r0 + r1
            android.view.ViewGroup$LayoutParams r1 = r7.getLayoutParams()
            int r1 = r1.height
            int r8 = android.view.ViewGroup.getChildMeasureSpec(r8, r0, r1)
            int r0 = r6.getMeasuredWidth()
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            r7.measure(r0, r8)
        L_0x00ad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.onMeasure(int, int):void");
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 8 || mo91275C()) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    /* renamed from: p */
    public void mo91329p() {
        this.f76757Z0.clear();
    }

    /* renamed from: q */
    public final void mo91330q(@C0359n0 C31615i iVar, int i) {
        iVar.mo91442z(i);
        this.f76758a.add(i, iVar);
        int size = this.f76758a.size();
        while (true) {
            i++;
            if (i < size) {
                this.f76758a.get(i).mo91442z(i);
            } else {
                return;
            }
        }
    }

    @C0359n0
    /* renamed from: s */
    public final LinearLayout.LayoutParams mo91331s() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        mo91291S(layoutParams);
        return layoutParams;
    }

    @C0376v0(21)
    public void setElevation(float f) {
        super.setElevation(f);
        C31530k.m127553d(this, f);
    }

    public void setInlineLabel(boolean z) {
        if (this.f76750S0 != z) {
            this.f76750S0 = z;
            for (int i = 0; i < this.f76762c.getChildCount(); i++) {
                View childAt = this.f76762c.getChildAt(i);
                if (childAt instanceof TabView) {
                    ((TabView) childAt).mo91395z();
                }
            }
            mo91320n();
        }
    }

    public void setInlineLabelResource(@C0342h int i) {
        setInlineLabel(getResources().getBoolean(i));
    }

    @Deprecated
    public void setOnTabSelectedListener(@C0363p0 C31610f fVar) {
        setOnTabSelectedListener((C31607c) fVar);
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        mo91366y();
        this.f76761b1.addListener(animatorListener);
    }

    public void setScrollPosition(int i, float f, boolean z) {
        setScrollPosition(i, f, z, true);
    }

    public void setSelectedTabIndicator(@C0363p0 Drawable drawable) {
        if (this.f76778z != drawable) {
            if (drawable == null) {
                drawable = new GradientDrawable();
            }
            this.f76778z = drawable;
            int i = this.f76752U0;
            if (i == -1) {
                i = drawable.getIntrinsicHeight();
            }
            this.f76762c.mo91407h(i);
        }
    }

    public void setSelectedTabIndicatorColor(@C0354l int i) {
        this.f76736E0 = i;
        mo91292T(false);
    }

    public void setSelectedTabIndicatorGravity(int i) {
        if (this.f76748Q0 != i) {
            this.f76748Q0 = i;
            C18196h2.m82610n1(this.f76762c);
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i) {
        this.f76752U0 = i;
        this.f76762c.mo91407h(i);
    }

    public void setTabGravity(int i) {
        if (this.f76746O0 != i) {
            this.f76746O0 = i;
            mo91320n();
        }
    }

    public void setTabIconTint(@C0363p0 ColorStateList colorStateList) {
        if (this.f76776x != colorStateList) {
            this.f76776x = colorStateList;
            mo91290R();
        }
    }

    public void setTabIconTintResource(@C0358n int i) {
        setTabIconTint(C0507a.m2345a(getContext(), i));
    }

    public void setTabIndicatorAnimationMode(int i) {
        this.f76753V0 = i;
        if (i == 0) {
            this.f76755X0 = new C31623c();
        } else if (i == 1) {
            this.f76755X0 = new C31621a();
        } else if (i == 2) {
            this.f76755X0 = new C31622b();
        } else {
            throw new IllegalArgumentException(i + " is not a valid TabIndicatorAnimationMode");
        }
    }

    public void setTabIndicatorFullWidth(boolean z) {
        this.f76751T0 = z;
        this.f76762c.mo91405f();
        C18196h2.m82610n1(this.f76762c);
    }

    public void setTabMode(int i) {
        if (i != this.f76749R0) {
            this.f76749R0 = i;
            mo91320n();
        }
    }

    public void setTabRippleColor(@C0363p0 ColorStateList colorStateList) {
        if (this.f76777y != colorStateList) {
            this.f76777y = colorStateList;
            for (int i = 0; i < this.f76762c.getChildCount(); i++) {
                View childAt = this.f76762c.getChildAt(i);
                if (childAt instanceof TabView) {
                    ((TabView) childAt).mo91394y(getContext());
                }
            }
        }
    }

    public void setTabRippleColorResource(@C0358n int i) {
        setTabRippleColor(C0507a.m2345a(getContext(), i));
    }

    public void setTabTextColors(@C0363p0 ColorStateList colorStateList) {
        if (this.f76775w != colorStateList) {
            this.f76775w = colorStateList;
            mo91290R();
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(@C0363p0 C20784a aVar) {
        mo91288P(aVar, false);
    }

    public void setUnboundedRipple(boolean z) {
        if (this.f76754W0 != z) {
            this.f76754W0 = z;
            for (int i = 0; i < this.f76762c.getChildCount(); i++) {
                View childAt = this.f76762c.getChildAt(i);
                if (childAt instanceof TabView) {
                    ((TabView) childAt).mo91394y(getContext());
                }
            }
        }
    }

    public void setUnboundedRippleResource(@C0342h int i) {
        setUnboundedRipple(getResources().getBoolean(i));
    }

    public void setupWithViewPager(@C0363p0 ViewPager viewPager) {
        setupWithViewPager(viewPager, true);
    }

    public boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    /* renamed from: t */
    public C31615i mo91361t() {
        C31615i b = f76727r1.mo52469b();
        if (b == null) {
            return new C31615i();
        }
        return b;
    }

    @C0359n0
    /* renamed from: u */
    public final TabView mo91362u(@C0359n0 C31615i iVar) {
        TabView tabView;
        C17997q.C17998a<TabView> aVar = this.f76773i1;
        if (aVar != null) {
            tabView = aVar.mo52469b();
        } else {
            tabView = null;
        }
        if (tabView == null) {
            tabView = new TabView(getContext());
        }
        tabView.setTab(iVar);
        tabView.setFocusable(true);
        tabView.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(iVar.f76810d)) {
            tabView.setContentDescription(iVar.f76809c);
        } else {
            tabView.setContentDescription(iVar.f76810d);
        }
        return tabView;
    }

    /* renamed from: v */
    public final void mo91363v(@C0359n0 C31615i iVar) {
        for (int size = this.f76757Z0.size() - 1; size >= 0; size--) {
            this.f76757Z0.get(size).mo67966c(iVar);
        }
    }

    /* renamed from: w */
    public final void mo91364w(@C0359n0 C31615i iVar) {
        for (int size = this.f76757Z0.size() - 1; size >= 0; size--) {
            this.f76757Z0.get(size).mo67964a(iVar);
        }
    }

    /* renamed from: x */
    public final void mo91365x(@C0359n0 C31615i iVar) {
        for (int size = this.f76757Z0.size() - 1; size >= 0; size--) {
            this.f76757Z0.get(size).mo67965b(iVar);
        }
    }

    /* renamed from: y */
    public final void mo91366y() {
        if (this.f76761b1 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f76761b1 = valueAnimator;
            valueAnimator.setInterpolator(C31093a.f74426b);
            this.f76761b1.setDuration((long) this.f76747P0);
            this.f76761b1.addUpdateListener(new C31605a());
        }
    }

    @C0363p0
    /* renamed from: z */
    public C31615i mo91367z(int i) {
        if (i < 0 || i >= getTabCount()) {
            return null;
        }
        return this.f76758a.get(i);
    }

    public TabLayout(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet) {
        this(context, attributeSet, C31076a.C31079c.tabStyle);
    }

    public void addView(View view, int i) {
        mo91317k(view);
    }

    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Deprecated
    public void setOnTabSelectedListener(@C0363p0 C31607c cVar) {
        C31607c cVar2 = this.f76756Y0;
        if (cVar2 != null) {
            mo91281I(cVar2);
        }
        this.f76756Y0 = cVar;
        if (cVar != null) {
            mo91297c(cVar);
        }
    }

    public void setScrollPosition(int i, float f, boolean z, boolean z2) {
        int i2;
        int round = Math.round(((float) i) + f);
        if (round >= 0 && round < this.f76762c.getChildCount()) {
            if (z2) {
                this.f76762c.mo91406g(i, f);
            }
            ValueAnimator valueAnimator = this.f76761b1;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f76761b1.cancel();
            }
            if (i < 0) {
                i2 = 0;
            } else {
                i2 = mo91321o(i, f);
            }
            scrollTo(i2, 0);
            if (z) {
                setSelectedTabView(round);
            }
        }
    }

    public void setupWithViewPager(@C0363p0 ViewPager viewPager, boolean z) {
        mo91289Q(viewPager, z, false);
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TabLayout(@androidx.annotation.C0359n0 android.content.Context r12, @androidx.annotation.C0363p0 android.util.AttributeSet r13, int r14) {
        /*
            r11 = this;
            int r4 = f76719j1
            android.content.Context r12 = com.google.android.material.theme.overlay.C31683a.m128455c(r12, r13, r14, r4)
            r11.<init>(r12, r13, r14)
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            r11.f76758a = r12
            android.graphics.drawable.GradientDrawable r12 = new android.graphics.drawable.GradientDrawable
            r12.<init>()
            r11.f76778z = r12
            r12 = 0
            r11.f76736E0 = r12
            r0 = 2147483647(0x7fffffff, float:NaN)
            r11.f76741J0 = r0
            r6 = -1
            r11.f76752U0 = r6
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r11.f76757Z0 = r0
            androidx.core.util.q$b r0 = new androidx.core.util.q$b
            r1 = 12
            r0.<init>(r1)
            r11.f76773i1 = r0
            android.content.Context r7 = r11.getContext()
            r11.setHorizontalScrollBarEnabled(r12)
            com.google.android.material.tabs.TabLayout$h r8 = new com.google.android.material.tabs.TabLayout$h
            r8.<init>(r7)
            r11.f76762c = r8
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r1 = -2
            r0.<init>(r1, r6)
            super.addView(r8, r12, r0)
            int[] r2 = com.google.android.material.C31076a.C31091o.TabLayout
            r9 = 1
            int[] r5 = new int[r9]
            int r10 = com.google.android.material.C31076a.C31091o.TabLayout_tabTextAppearance
            r5[r12] = r10
            r0 = r7
            r1 = r13
            r3 = r14
            android.content.res.TypedArray r13 = com.google.android.material.internal.C31422p.m126970j(r0, r1, r2, r3, r4, r5)
            android.graphics.drawable.Drawable r14 = r11.getBackground()
            boolean r14 = r14 instanceof android.graphics.drawable.ColorDrawable
            if (r14 == 0) goto L_0x0084
            android.graphics.drawable.Drawable r14 = r11.getBackground()
            android.graphics.drawable.ColorDrawable r14 = (android.graphics.drawable.ColorDrawable) r14
            com.google.android.material.shape.j r0 = new com.google.android.material.shape.j
            r0.<init>()
            int r14 = r14.getColor()
            android.content.res.ColorStateList r14 = android.content.res.ColorStateList.valueOf(r14)
            r0.mo90777o0(r14)
            r0.mo90750Z(r7)
            float r14 = androidx.core.view.C18196h2.m82529R(r11)
            r0.mo90775n0(r14)
            androidx.core.view.C18196h2.m82502I1(r11, r0)
        L_0x0084:
            int r14 = com.google.android.material.C31076a.C31091o.TabLayout_tabIndicator
            android.graphics.drawable.Drawable r14 = com.google.android.material.resources.C31500c.m127367e(r7, r13, r14)
            r11.setSelectedTabIndicator((android.graphics.drawable.Drawable) r14)
            int r14 = com.google.android.material.C31076a.C31091o.TabLayout_tabIndicatorColor
            int r14 = r13.getColor(r14, r12)
            r11.setSelectedTabIndicatorColor(r14)
            int r14 = com.google.android.material.C31076a.C31091o.TabLayout_tabIndicatorHeight
            int r14 = r13.getDimensionPixelSize(r14, r6)
            r8.mo91407h(r14)
            int r14 = com.google.android.material.C31076a.C31091o.TabLayout_tabIndicatorGravity
            int r14 = r13.getInt(r14, r12)
            r11.setSelectedTabIndicatorGravity(r14)
            int r14 = com.google.android.material.C31076a.C31091o.TabLayout_tabIndicatorAnimationMode
            int r14 = r13.getInt(r14, r12)
            r11.setTabIndicatorAnimationMode(r14)
            int r14 = com.google.android.material.C31076a.C31091o.TabLayout_tabIndicatorFullWidth
            boolean r14 = r13.getBoolean(r14, r9)
            r11.setTabIndicatorFullWidth(r14)
            int r14 = com.google.android.material.C31076a.C31091o.TabLayout_tabPadding
            int r14 = r13.getDimensionPixelSize(r14, r12)
            r11.f76770g = r14
            r11.f76768f = r14
            r11.f76766e = r14
            r11.f76764d = r14
            int r0 = com.google.android.material.C31076a.C31091o.TabLayout_tabPaddingStart
            int r14 = r13.getDimensionPixelSize(r0, r14)
            r11.f76764d = r14
            int r14 = com.google.android.material.C31076a.C31091o.TabLayout_tabPaddingTop
            int r0 = r11.f76766e
            int r14 = r13.getDimensionPixelSize(r14, r0)
            r11.f76766e = r14
            int r14 = com.google.android.material.C31076a.C31091o.TabLayout_tabPaddingEnd
            int r0 = r11.f76768f
            int r14 = r13.getDimensionPixelSize(r14, r0)
            r11.f76768f = r14
            int r14 = com.google.android.material.C31076a.C31091o.TabLayout_tabPaddingBottom
            int r0 = r11.f76770g
            int r14 = r13.getDimensionPixelSize(r14, r0)
            r11.f76770g = r14
            int r14 = com.google.android.material.C31076a.C31090n.TextAppearance_Design_Tab
            int r14 = r13.getResourceId(r10, r14)
            r11.f76774v = r14
            int[] r0 = androidx.appcompat.C0387a.C0400m.TextAppearance
            android.content.res.TypedArray r14 = r7.obtainStyledAttributes(r14, r0)
            int r0 = androidx.appcompat.C0387a.C0400m.TextAppearance_android_textSize     // Catch:{ all -> 0x01b9 }
            int r0 = r14.getDimensionPixelSize(r0, r12)     // Catch:{ all -> 0x01b9 }
            float r0 = (float) r0     // Catch:{ all -> 0x01b9 }
            r11.f76738G0 = r0     // Catch:{ all -> 0x01b9 }
            int r0 = androidx.appcompat.C0387a.C0400m.TextAppearance_android_textColor     // Catch:{ all -> 0x01b9 }
            android.content.res.ColorStateList r0 = com.google.android.material.resources.C31500c.m127363a(r7, r14, r0)     // Catch:{ all -> 0x01b9 }
            r11.f76775w = r0     // Catch:{ all -> 0x01b9 }
            r14.recycle()
            int r14 = com.google.android.material.C31076a.C31091o.TabLayout_tabTextColor
            boolean r0 = r13.hasValue(r14)
            if (r0 == 0) goto L_0x011e
            android.content.res.ColorStateList r14 = com.google.android.material.resources.C31500c.m127363a(r7, r13, r14)
            r11.f76775w = r14
        L_0x011e:
            int r14 = com.google.android.material.C31076a.C31091o.TabLayout_tabSelectedTextColor
            boolean r0 = r13.hasValue(r14)
            if (r0 == 0) goto L_0x0136
            int r14 = r13.getColor(r14, r12)
            android.content.res.ColorStateList r0 = r11.f76775w
            int r0 = r0.getDefaultColor()
            android.content.res.ColorStateList r14 = m128024r(r0, r14)
            r11.f76775w = r14
        L_0x0136:
            int r14 = com.google.android.material.C31076a.C31091o.TabLayout_tabIconTint
            android.content.res.ColorStateList r14 = com.google.android.material.resources.C31500c.m127363a(r7, r13, r14)
            r11.f76776x = r14
            int r14 = com.google.android.material.C31076a.C31091o.TabLayout_tabIconTintMode
            int r14 = r13.getInt(r14, r6)
            r0 = 0
            android.graphics.PorterDuff$Mode r14 = com.google.android.material.internal.C31432x.m127017l(r14, r0)
            r11.f76737F0 = r14
            int r14 = com.google.android.material.C31076a.C31091o.TabLayout_tabRippleColor
            android.content.res.ColorStateList r14 = com.google.android.material.resources.C31500c.m127363a(r7, r13, r14)
            r11.f76777y = r14
            int r14 = com.google.android.material.C31076a.C31091o.TabLayout_tabIndicatorAnimationDuration
            r0 = 300(0x12c, float:4.2E-43)
            int r14 = r13.getInt(r14, r0)
            r11.f76747P0 = r14
            int r14 = com.google.android.material.C31076a.C31091o.TabLayout_tabMinWidth
            int r14 = r13.getDimensionPixelSize(r14, r6)
            r11.f76742K0 = r14
            int r14 = com.google.android.material.C31076a.C31091o.TabLayout_tabMaxWidth
            int r14 = r13.getDimensionPixelSize(r14, r6)
            r11.f76743L0 = r14
            int r14 = com.google.android.material.C31076a.C31091o.TabLayout_tabBackground
            int r14 = r13.getResourceId(r14, r12)
            r11.f76740I0 = r14
            int r14 = com.google.android.material.C31076a.C31091o.TabLayout_tabContentStart
            int r14 = r13.getDimensionPixelSize(r14, r12)
            r11.f76745N0 = r14
            int r14 = com.google.android.material.C31076a.C31091o.TabLayout_tabMode
            int r14 = r13.getInt(r14, r9)
            r11.f76749R0 = r14
            int r14 = com.google.android.material.C31076a.C31091o.TabLayout_tabGravity
            int r14 = r13.getInt(r14, r12)
            r11.f76746O0 = r14
            int r14 = com.google.android.material.C31076a.C31091o.TabLayout_tabInlineLabel
            boolean r14 = r13.getBoolean(r14, r12)
            r11.f76750S0 = r14
            int r14 = com.google.android.material.C31076a.C31091o.TabLayout_tabUnboundedRipple
            boolean r12 = r13.getBoolean(r14, r12)
            r11.f76754W0 = r12
            r13.recycle()
            android.content.res.Resources r12 = r11.getResources()
            int r13 = com.google.android.material.C31076a.C31082f.design_tab_text_size_2line
            int r13 = r12.getDimensionPixelSize(r13)
            float r13 = (float) r13
            r11.f76739H0 = r13
            int r13 = com.google.android.material.C31076a.C31082f.design_tab_scrollable_min_width
            int r12 = r12.getDimensionPixelSize(r13)
            r11.f76744M0 = r12
            r11.mo91320n()
            return
        L_0x01b9:
            r12 = move-exception
            r14.recycle()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        mo91317k(view);
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        mo91317k(view);
    }

    public void setTabTextColors(int i, int i2) {
        setTabTextColors(m128024r(i, i2));
    }

    public void setSelectedTabIndicator(@C0375v int i) {
        if (i != 0) {
            setSelectedTabIndicator(C0507a.m2346b(getContext(), i));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }
}
