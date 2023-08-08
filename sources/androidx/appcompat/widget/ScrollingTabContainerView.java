package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;
import androidx.appcompat.C0387a;
import androidx.appcompat.app.C0441a;
import androidx.appcompat.view.C0534a;
import androidx.appcompat.widget.LinearLayoutCompat;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class ScrollingTabContainerView extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {

    /* renamed from: E0 */
    public static final Interpolator f2023E0 = new DecelerateInterpolator();

    /* renamed from: F0 */
    public static final int f2024F0 = 200;

    /* renamed from: z */
    public static final String f2025z = "ScrollingTabContainerView";

    /* renamed from: a */
    public Runnable f2026a;

    /* renamed from: b */
    public C0649c f2027b;

    /* renamed from: c */
    public LinearLayoutCompat f2028c;

    /* renamed from: d */
    public Spinner f2029d;

    /* renamed from: e */
    public boolean f2030e;

    /* renamed from: f */
    public int f2031f;

    /* renamed from: g */
    public int f2032g;

    /* renamed from: v */
    public int f2033v;

    /* renamed from: w */
    public int f2034w;

    /* renamed from: x */
    public ViewPropertyAnimator f2035x;

    /* renamed from: y */
    public final C0651e f2036y = new C0651e();

    /* renamed from: androidx.appcompat.widget.ScrollingTabContainerView$a */
    public class C0647a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ View f2037a;

        public C0647a(View view) {
            this.f2037a = view;
        }

        public void run() {
            ScrollingTabContainerView.this.smoothScrollTo(this.f2037a.getLeft() - ((ScrollingTabContainerView.this.getWidth() - this.f2037a.getWidth()) / 2), 0);
            ScrollingTabContainerView.this.f2026a = null;
        }
    }

    /* renamed from: androidx.appcompat.widget.ScrollingTabContainerView$b */
    public class C0648b extends BaseAdapter {
        public C0648b() {
        }

        public int getCount() {
            return ScrollingTabContainerView.this.f2028c.getChildCount();
        }

        public Object getItem(int i) {
            return ((C0650d) ScrollingTabContainerView.this.f2028c.getChildAt(i)).mo2911b();
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                return ScrollingTabContainerView.this.mo2888g((C0441a.C0447f) getItem(i), true);
            }
            ((C0650d) view).mo2910a((C0441a.C0447f) getItem(i));
            return view;
        }
    }

    /* renamed from: androidx.appcompat.widget.ScrollingTabContainerView$c */
    public class C0649c implements View.OnClickListener {
        public C0649c() {
        }

        public void onClick(View view) {
            boolean z;
            ((C0650d) view).mo2911b().mo1324g();
            int childCount = ScrollingTabContainerView.this.f2028c.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = ScrollingTabContainerView.this.f2028c.getChildAt(i);
                if (childAt == view) {
                    z = true;
                } else {
                    z = false;
                }
                childAt.setSelected(z);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.ScrollingTabContainerView$d */
    public class C0650d extends LinearLayout {

        /* renamed from: g */
        public static final String f2041g = "androidx.appcompat.app.ActionBar$Tab";

        /* renamed from: a */
        public final int[] f2042a;

        /* renamed from: b */
        public C0441a.C0447f f2043b;

        /* renamed from: c */
        public TextView f2044c;

        /* renamed from: d */
        public ImageView f2045d;

        /* renamed from: e */
        public View f2046e;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C0650d(android.content.Context r6, androidx.appcompat.app.C0441a.C0447f r7, boolean r8) {
            /*
                r4 = this;
                androidx.appcompat.widget.ScrollingTabContainerView.this = r5
                int r5 = androidx.appcompat.C0387a.C0389b.actionBarTabStyle
                r0 = 0
                r4.<init>(r6, r0, r5)
                r1 = 1
                int[] r1 = new int[r1]
                r2 = 16842964(0x10100d4, float:2.3694152E-38)
                r3 = 0
                r1[r3] = r2
                r4.f2042a = r1
                r4.f2043b = r7
                androidx.appcompat.widget.h1 r5 = androidx.appcompat.widget.C0722h1.m3539G(r6, r0, r1, r5, r3)
                boolean r6 = r5.mo3455C(r3)
                if (r6 == 0) goto L_0x0026
                android.graphics.drawable.Drawable r6 = r5.mo3466h(r3)
                r4.setBackgroundDrawable(r6)
            L_0x0026:
                r5.mo3458I()
                if (r8 == 0) goto L_0x0031
                r5 = 8388627(0x800013, float:1.175497E-38)
                r4.setGravity(r5)
            L_0x0031:
                r4.mo2912c()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ScrollingTabContainerView.C0650d.<init>(androidx.appcompat.widget.ScrollingTabContainerView, android.content.Context, androidx.appcompat.app.a$f, boolean):void");
        }

        /* renamed from: a */
        public void mo2910a(C0441a.C0447f fVar) {
            this.f2043b = fVar;
            mo2912c();
        }

        /* renamed from: b */
        public C0441a.C0447f mo2911b() {
            return this.f2043b;
        }

        /* renamed from: c */
        public void mo2912c() {
            C0441a.C0447f fVar = this.f2043b;
            View b = fVar.mo1319b();
            CharSequence charSequence = null;
            if (b != null) {
                ViewParent parent = b.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(b);
                    }
                    addView(b);
                }
                this.f2046e = b;
                TextView textView = this.f2044c;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f2045d;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f2045d.setImageDrawable((Drawable) null);
                    return;
                }
                return;
            }
            View view = this.f2046e;
            if (view != null) {
                removeView(view);
                this.f2046e = null;
            }
            Drawable c = fVar.mo1320c();
            CharSequence f = fVar.mo1323f();
            if (c != null) {
                if (this.f2045d == null) {
                    AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    appCompatImageView.setLayoutParams(layoutParams);
                    addView(appCompatImageView, 0);
                    this.f2045d = appCompatImageView;
                }
                this.f2045d.setImageDrawable(c);
                this.f2045d.setVisibility(0);
            } else {
                ImageView imageView2 = this.f2045d;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.f2045d.setImageDrawable((Drawable) null);
                }
            }
            boolean z = !TextUtils.isEmpty(f);
            if (z) {
                if (this.f2044c == null) {
                    AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), (AttributeSet) null, C0387a.C0389b.actionBarTabTextStyle);
                    appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    appCompatTextView.setLayoutParams(layoutParams2);
                    addView(appCompatTextView);
                    this.f2044c = appCompatTextView;
                }
                this.f2044c.setText(f);
                this.f2044c.setVisibility(0);
            } else {
                TextView textView2 = this.f2044c;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    this.f2044c.setText((CharSequence) null);
                }
            }
            ImageView imageView3 = this.f2045d;
            if (imageView3 != null) {
                imageView3.setContentDescription(fVar.mo1318a());
            }
            if (!z) {
                charSequence = fVar.mo1318a();
            }
            C0757o1.m3709a(this, charSequence);
        }

        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName(f2041g);
        }

        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(f2041g);
        }

        public void onMeasure(int i, int i2) {
            int i3;
            super.onMeasure(i, i2);
            if (ScrollingTabContainerView.this.f2031f > 0 && getMeasuredWidth() > (i3 = ScrollingTabContainerView.this.f2031f)) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
            }
        }

        public void setSelected(boolean z) {
            boolean z2;
            if (isSelected() != z) {
                z2 = true;
            } else {
                z2 = false;
            }
            super.setSelected(z);
            if (z2 && z) {
                sendAccessibilityEvent(4);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.ScrollingTabContainerView$e */
    public class C0651e extends AnimatorListenerAdapter {

        /* renamed from: a */
        public boolean f2048a = false;

        /* renamed from: b */
        public int f2049b;

        public C0651e() {
        }

        /* renamed from: a */
        public C0651e mo2917a(ViewPropertyAnimator viewPropertyAnimator, int i) {
            this.f2049b = i;
            ScrollingTabContainerView.this.f2035x = viewPropertyAnimator;
            return this;
        }

        public void onAnimationCancel(Animator animator) {
            this.f2048a = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f2048a) {
                ScrollingTabContainerView scrollingTabContainerView = ScrollingTabContainerView.this;
                scrollingTabContainerView.f2035x = null;
                scrollingTabContainerView.setVisibility(this.f2049b);
            }
        }

        public void onAnimationStart(Animator animator) {
            ScrollingTabContainerView.this.setVisibility(0);
            this.f2048a = false;
        }
    }

    public ScrollingTabContainerView(@C0359n0 Context context) {
        super(context);
        setHorizontalScrollBarEnabled(false);
        C0534a b = C0534a.m2478b(context);
        setContentHeight(b.mo1750f());
        this.f2032g = b.mo1749e();
        LinearLayoutCompat f = mo2887f();
        this.f2028c = f;
        addView(f, new ViewGroup.LayoutParams(-2, -1));
    }

    /* renamed from: a */
    public void mo2882a(C0441a.C0447f fVar, int i, boolean z) {
        C0650d g = mo2888g(fVar, false);
        this.f2028c.addView(g, i, new LinearLayoutCompat.C0642b(0, -1, 1.0f));
        Spinner spinner = this.f2029d;
        if (spinner != null) {
            ((C0648b) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (z) {
            g.setSelected(true);
        }
        if (this.f2030e) {
            requestLayout();
        }
    }

    /* renamed from: b */
    public void mo2883b(C0441a.C0447f fVar, boolean z) {
        C0650d g = mo2888g(fVar, false);
        this.f2028c.addView(g, new LinearLayoutCompat.C0642b(0, -1, 1.0f));
        Spinner spinner = this.f2029d;
        if (spinner != null) {
            ((C0648b) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (z) {
            g.setSelected(true);
        }
        if (this.f2030e) {
            requestLayout();
        }
    }

    /* renamed from: c */
    public void mo2884c(int i) {
        View childAt = this.f2028c.getChildAt(i);
        Runnable runnable = this.f2026a;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        C0647a aVar = new C0647a(childAt);
        this.f2026a = aVar;
        post(aVar);
    }

    /* renamed from: d */
    public void mo2885d(int i) {
        ViewPropertyAnimator viewPropertyAnimator = this.f2035x;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        if (i == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            ViewPropertyAnimator alpha = animate().alpha(1.0f);
            alpha.setDuration(200);
            alpha.setInterpolator(f2023E0);
            alpha.setListener(this.f2036y.mo2917a(alpha, i));
            alpha.start();
            return;
        }
        ViewPropertyAnimator alpha2 = animate().alpha(0.0f);
        alpha2.setDuration(200);
        alpha2.setInterpolator(f2023E0);
        alpha2.setListener(this.f2036y.mo2917a(alpha2, i));
        alpha2.start();
    }

    /* renamed from: e */
    public final Spinner mo2886e() {
        AppCompatSpinner appCompatSpinner = new AppCompatSpinner(getContext(), (AttributeSet) null, C0387a.C0389b.actionDropDownStyle);
        appCompatSpinner.setLayoutParams(new LinearLayoutCompat.C0642b(-2, -1));
        appCompatSpinner.setOnItemSelectedListener(this);
        return appCompatSpinner;
    }

    /* renamed from: f */
    public final LinearLayoutCompat mo2887f() {
        LinearLayoutCompat linearLayoutCompat = new LinearLayoutCompat(getContext(), (AttributeSet) null, C0387a.C0389b.actionBarTabBarStyle);
        linearLayoutCompat.setMeasureWithLargestChildEnabled(true);
        linearLayoutCompat.setGravity(17);
        linearLayoutCompat.setLayoutParams(new LinearLayoutCompat.C0642b(-2, -1));
        return linearLayoutCompat;
    }

    /* renamed from: g */
    public C0650d mo2888g(C0441a.C0447f fVar, boolean z) {
        C0650d dVar = new C0650d(getContext(), fVar, z);
        if (z) {
            dVar.setBackgroundDrawable((Drawable) null);
            dVar.setLayoutParams(new AbsListView.LayoutParams(-1, this.f2033v));
        } else {
            dVar.setFocusable(true);
            if (this.f2027b == null) {
                this.f2027b = new C0649c();
            }
            dVar.setOnClickListener(this.f2027b);
        }
        return dVar;
    }

    /* renamed from: h */
    public final boolean mo2889h() {
        Spinner spinner = this.f2029d;
        return spinner != null && spinner.getParent() == this;
    }

    /* renamed from: i */
    public final void mo2890i() {
        if (!mo2889h()) {
            if (this.f2029d == null) {
                this.f2029d = mo2886e();
            }
            removeView(this.f2028c);
            addView(this.f2029d, new ViewGroup.LayoutParams(-2, -1));
            if (this.f2029d.getAdapter() == null) {
                this.f2029d.setAdapter(new C0648b());
            }
            Runnable runnable = this.f2026a;
            if (runnable != null) {
                removeCallbacks(runnable);
                this.f2026a = null;
            }
            this.f2029d.setSelection(this.f2034w);
        }
    }

    /* renamed from: j */
    public final boolean mo2891j() {
        if (!mo2889h()) {
            return false;
        }
        removeView(this.f2029d);
        addView(this.f2028c, new ViewGroup.LayoutParams(-2, -1));
        setTabSelected(this.f2029d.getSelectedItemPosition());
        return false;
    }

    /* renamed from: k */
    public void mo2892k() {
        this.f2028c.removeAllViews();
        Spinner spinner = this.f2029d;
        if (spinner != null) {
            ((C0648b) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (this.f2030e) {
            requestLayout();
        }
    }

    /* renamed from: l */
    public void mo2893l(int i) {
        this.f2028c.removeViewAt(i);
        Spinner spinner = this.f2029d;
        if (spinner != null) {
            ((C0648b) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (this.f2030e) {
            requestLayout();
        }
    }

    /* renamed from: m */
    public void mo2894m(int i) {
        ((C0650d) this.f2028c.getChildAt(i)).mo2912c();
        Spinner spinner = this.f2029d;
        if (spinner != null) {
            ((C0648b) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (this.f2030e) {
            requestLayout();
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.f2026a;
        if (runnable != null) {
            post(runnable);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C0534a b = C0534a.m2478b(getContext());
        setContentHeight(b.mo1750f());
        this.f2032g = b.mo1749e();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f2026a;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        ((C0650d) view).mo2911b().mo1324g();
    }

    public void onMeasure(int i, int i2) {
        boolean z;
        int mode = View.MeasureSpec.getMode(i);
        boolean z2 = true;
        if (mode == 1073741824) {
            z = true;
        } else {
            z = false;
        }
        setFillViewport(z);
        int childCount = this.f2028c.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            this.f2031f = -1;
        } else {
            if (childCount > 2) {
                this.f2031f = (int) (((float) View.MeasureSpec.getSize(i)) * 0.4f);
            } else {
                this.f2031f = View.MeasureSpec.getSize(i) / 2;
            }
            this.f2031f = Math.min(this.f2031f, this.f2032g);
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f2033v, 1073741824);
        if (z || !this.f2030e) {
            z2 = false;
        }
        if (z2) {
            this.f2028c.measure(0, makeMeasureSpec);
            if (this.f2028c.getMeasuredWidth() > View.MeasureSpec.getSize(i)) {
                mo2890i();
            } else {
                mo2891j();
            }
        } else {
            mo2891j();
        }
        int measuredWidth = getMeasuredWidth();
        super.onMeasure(i, makeMeasureSpec);
        int measuredWidth2 = getMeasuredWidth();
        if (z && measuredWidth != measuredWidth2) {
            setTabSelected(this.f2034w);
        }
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void setAllowCollapse(boolean z) {
        this.f2030e = z;
    }

    public void setContentHeight(int i) {
        this.f2033v = i;
        requestLayout();
    }

    public void setTabSelected(int i) {
        boolean z;
        this.f2034w = i;
        int childCount = this.f2028c.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = this.f2028c.getChildAt(i2);
            if (i2 == i) {
                z = true;
            } else {
                z = false;
            }
            childAt.setSelected(z);
            if (z) {
                mo2884c(i);
            }
        }
        Spinner spinner = this.f2029d;
        if (spinner != null && i >= 0) {
            spinner.setSelection(i);
        }
    }
}
