package androidx.viewpager.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.text.method.SingleLineTransformationMethod;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.annotation.C0354l;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0379x;
import androidx.core.widget.C18496q;
import androidx.viewpager.widget.ViewPager;
import java.lang.ref.WeakReference;
import java.util.Locale;

@ViewPager.C20774e
public class PagerTitleStrip extends ViewGroup {

    /* renamed from: G0 */
    public static final int[] f53657G0 = {16842804, 16842901, 16842904, 16842927};

    /* renamed from: H0 */
    public static final int[] f53658H0 = {16843660};

    /* renamed from: I0 */
    public static final float f53659I0 = 0.6f;

    /* renamed from: J0 */
    public static final int f53660J0 = 16;

    /* renamed from: E0 */
    public int f53661E0;

    /* renamed from: F0 */
    public int f53662F0;

    /* renamed from: a */
    public ViewPager f53663a;

    /* renamed from: b */
    public TextView f53664b;

    /* renamed from: c */
    public TextView f53665c;

    /* renamed from: d */
    public TextView f53666d;

    /* renamed from: e */
    public int f53667e;

    /* renamed from: f */
    public float f53668f;

    /* renamed from: g */
    public int f53669g;

    /* renamed from: v */
    public int f53670v;

    /* renamed from: w */
    public boolean f53671w;

    /* renamed from: x */
    public boolean f53672x;

    /* renamed from: y */
    public final C20767a f53673y;

    /* renamed from: z */
    public WeakReference<C20784a> f53674z;

    /* renamed from: androidx.viewpager.widget.PagerTitleStrip$a */
    public class C20767a extends DataSetObserver implements ViewPager.C20779j, ViewPager.C20778i {

        /* renamed from: a */
        public int f53675a;

        public C20767a() {
        }

        /* renamed from: a */
        public void mo62298a(ViewPager viewPager, C20784a aVar, C20784a aVar2) {
            PagerTitleStrip.this.mo62286a(aVar, aVar2);
        }

        /* renamed from: d */
        public void mo30672d(int i, float f, int i2) {
            if (f > 0.5f) {
                i++;
            }
            PagerTitleStrip.this.mo62270c(i, f, false);
        }

        /* renamed from: e */
        public void mo30673e(int i) {
            this.f53675a = i;
        }

        /* renamed from: f */
        public void mo30674f(int i) {
            if (this.f53675a == 0) {
                PagerTitleStrip pagerTitleStrip = PagerTitleStrip.this;
                pagerTitleStrip.mo62287b(pagerTitleStrip.f53663a.getCurrentItem(), PagerTitleStrip.this.f53663a.getAdapter());
                PagerTitleStrip pagerTitleStrip2 = PagerTitleStrip.this;
                float f = pagerTitleStrip2.f53668f;
                if (f < 0.0f) {
                    f = 0.0f;
                }
                pagerTitleStrip2.mo62270c(pagerTitleStrip2.f53663a.getCurrentItem(), f, true);
            }
        }

        public void onChanged() {
            PagerTitleStrip pagerTitleStrip = PagerTitleStrip.this;
            pagerTitleStrip.mo62287b(pagerTitleStrip.f53663a.getCurrentItem(), PagerTitleStrip.this.f53663a.getAdapter());
            PagerTitleStrip pagerTitleStrip2 = PagerTitleStrip.this;
            float f = pagerTitleStrip2.f53668f;
            if (f < 0.0f) {
                f = 0.0f;
            }
            pagerTitleStrip2.mo62270c(pagerTitleStrip2.f53663a.getCurrentItem(), f, true);
        }
    }

    /* renamed from: androidx.viewpager.widget.PagerTitleStrip$b */
    public static class C20768b extends SingleLineTransformationMethod {

        /* renamed from: a */
        public Locale f53677a;

        public C20768b(Context context) {
            this.f53677a = context.getResources().getConfiguration().locale;
        }

        public CharSequence getTransformation(CharSequence charSequence, View view) {
            CharSequence transformation = super.getTransformation(charSequence, view);
            if (transformation != null) {
                return transformation.toString().toUpperCase(this.f53677a);
            }
            return null;
        }
    }

    public PagerTitleStrip(@C0359n0 Context context) {
        this(context, (AttributeSet) null);
    }

    private static void setSingleLineAllCaps(TextView textView) {
        textView.setTransformationMethod(new C20768b(textView.getContext()));
    }

    /* renamed from: a */
    public void mo62286a(C20784a aVar, C20784a aVar2) {
        if (aVar != null) {
            aVar.mo62418u(this.f53673y);
            this.f53674z = null;
        }
        if (aVar2 != null) {
            aVar2.mo62414m(this.f53673y);
            this.f53674z = new WeakReference<>(aVar2);
        }
        ViewPager viewPager = this.f53663a;
        if (viewPager != null) {
            this.f53667e = -1;
            this.f53668f = -1.0f;
            mo62287b(viewPager.getCurrentItem(), aVar2);
            requestLayout();
        }
    }

    /* renamed from: b */
    public void mo62287b(int i, C20784a aVar) {
        int i2;
        CharSequence charSequence;
        CharSequence charSequence2;
        if (aVar != null) {
            i2 = aVar.mo21373e();
        } else {
            i2 = 0;
        }
        this.f53671w = true;
        CharSequence charSequence3 = null;
        if (i < 1 || aVar == null) {
            charSequence = null;
        } else {
            charSequence = aVar.mo62410g(i - 1);
        }
        this.f53664b.setText(charSequence);
        TextView textView = this.f53665c;
        if (aVar == null || i >= i2) {
            charSequence2 = null;
        } else {
            charSequence2 = aVar.mo62410g(i);
        }
        textView.setText(charSequence2);
        int i3 = i + 1;
        if (i3 < i2 && aVar != null) {
            charSequence3 = aVar.mo62410g(i3);
        }
        this.f53666d.setText(charSequence3);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, (int) (((float) ((getWidth() - getPaddingLeft()) - getPaddingRight())) * 0.8f)), Integer.MIN_VALUE);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.max(0, (getHeight() - getPaddingTop()) - getPaddingBottom()), Integer.MIN_VALUE);
        this.f53664b.measure(makeMeasureSpec, makeMeasureSpec2);
        this.f53665c.measure(makeMeasureSpec, makeMeasureSpec2);
        this.f53666d.measure(makeMeasureSpec, makeMeasureSpec2);
        this.f53667e = i;
        if (!this.f53672x) {
            mo62270c(i, this.f53668f, false);
        }
        this.f53671w = false;
    }

    /* renamed from: c */
    public void mo62270c(int i, float f, boolean z) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = i;
        float f2 = f;
        if (i6 != this.f53667e) {
            mo62287b(i6, this.f53663a.getAdapter());
        } else if (!z && f2 == this.f53668f) {
            return;
        }
        this.f53672x = true;
        int measuredWidth = this.f53664b.getMeasuredWidth();
        int measuredWidth2 = this.f53665c.getMeasuredWidth();
        int measuredWidth3 = this.f53666d.getMeasuredWidth();
        int i7 = measuredWidth2 / 2;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i8 = paddingRight + i7;
        int i9 = (width - (paddingLeft + i7)) - i8;
        float f3 = 0.5f + f2;
        if (f3 > 1.0f) {
            f3 -= 1.0f;
        }
        int i10 = ((width - i8) - ((int) (((float) i9) * f3))) - i7;
        int i11 = measuredWidth2 + i10;
        int baseline = this.f53664b.getBaseline();
        int baseline2 = this.f53665c.getBaseline();
        int baseline3 = this.f53666d.getBaseline();
        int max = Math.max(Math.max(baseline, baseline2), baseline3);
        int i12 = max - baseline;
        int i13 = max - baseline2;
        int i14 = max - baseline3;
        int i15 = measuredWidth3;
        int max2 = Math.max(Math.max(this.f53664b.getMeasuredHeight() + i12, this.f53665c.getMeasuredHeight() + i13), this.f53666d.getMeasuredHeight() + i14);
        int i16 = this.f53670v & 112;
        if (i16 == 16) {
            i5 = (((height - paddingTop) - paddingBottom) - max2) / 2;
        } else if (i16 != 80) {
            i4 = i12 + paddingTop;
            i2 = i13 + paddingTop;
            i3 = paddingTop + i14;
            TextView textView = this.f53665c;
            textView.layout(i10, i2, i11, textView.getMeasuredHeight() + i2);
            int min = Math.min(paddingLeft, (i10 - this.f53669g) - measuredWidth);
            TextView textView2 = this.f53664b;
            textView2.layout(min, i4, measuredWidth + min, textView2.getMeasuredHeight() + i4);
            int max3 = Math.max((width - paddingRight) - i15, i11 + this.f53669g);
            TextView textView3 = this.f53666d;
            textView3.layout(max3, i3, max3 + i15, textView3.getMeasuredHeight() + i3);
            this.f53668f = f;
            this.f53672x = false;
        } else {
            i5 = (height - paddingBottom) - max2;
        }
        i4 = i12 + i5;
        i2 = i13 + i5;
        i3 = i5 + i14;
        TextView textView4 = this.f53665c;
        textView4.layout(i10, i2, i11, textView4.getMeasuredHeight() + i2);
        int min2 = Math.min(paddingLeft, (i10 - this.f53669g) - measuredWidth);
        TextView textView22 = this.f53664b;
        textView22.layout(min2, i4, measuredWidth + min2, textView22.getMeasuredHeight() + i4);
        int max32 = Math.max((width - paddingRight) - i15, i11 + this.f53669g);
        TextView textView32 = this.f53666d;
        textView32.layout(max32, i3, max32 + i15, textView32.getMeasuredHeight() + i3);
        this.f53668f = f;
        this.f53672x = false;
    }

    public int getMinHeight() {
        Drawable background = getBackground();
        if (background != null) {
            return background.getIntrinsicHeight();
        }
        return 0;
    }

    public int getTextSpacing() {
        return this.f53669g;
    }

    public void onAttachedToWindow() {
        C20784a aVar;
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof ViewPager) {
            ViewPager viewPager = (ViewPager) parent;
            C20784a adapter = viewPager.getAdapter();
            viewPager.mo62320U(this.f53673y);
            viewPager.mo62328b(this.f53673y);
            this.f53663a = viewPager;
            WeakReference<C20784a> weakReference = this.f53674z;
            if (weakReference != null) {
                aVar = weakReference.get();
            } else {
                aVar = null;
            }
            mo62286a(aVar, adapter);
            return;
        }
        throw new IllegalStateException("PagerTitleStrip must be a direct child of a ViewPager.");
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ViewPager viewPager = this.f53663a;
        if (viewPager != null) {
            mo62286a(viewPager.getAdapter(), (C20784a) null);
            this.f53663a.mo62320U((ViewPager.C20779j) null);
            this.f53663a.mo62313N(this.f53673y);
            this.f53663a = null;
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f53663a != null) {
            float f = this.f53668f;
            if (f < 0.0f) {
                f = 0.0f;
            }
            mo62270c(this.f53667e, f, true);
        }
    }

    public void onMeasure(int i, int i2) {
        int i3;
        if (View.MeasureSpec.getMode(i) == 1073741824) {
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingTop, -2);
            int size = View.MeasureSpec.getSize(i);
            int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i, (int) (((float) size) * 0.2f), -2);
            this.f53664b.measure(childMeasureSpec2, childMeasureSpec);
            this.f53665c.measure(childMeasureSpec2, childMeasureSpec);
            this.f53666d.measure(childMeasureSpec2, childMeasureSpec);
            if (View.MeasureSpec.getMode(i2) == 1073741824) {
                i3 = View.MeasureSpec.getSize(i2);
            } else {
                i3 = Math.max(getMinHeight(), this.f53665c.getMeasuredHeight() + paddingTop);
            }
            setMeasuredDimension(size, View.resolveSizeAndState(i3, i2, this.f53665c.getMeasuredState() << 16));
            return;
        }
        throw new IllegalStateException("Must measure with an exact width");
    }

    public void requestLayout() {
        if (!this.f53671w) {
            super.requestLayout();
        }
    }

    public void setGravity(int i) {
        this.f53670v = i;
        requestLayout();
    }

    public void setNonPrimaryAlpha(@C0379x(from = 0.0d, mo1016to = 1.0d) float f) {
        int i = ((int) (f * 255.0f)) & 255;
        this.f53661E0 = i;
        int i2 = (i << 24) | (this.f53662F0 & 16777215);
        this.f53664b.setTextColor(i2);
        this.f53666d.setTextColor(i2);
    }

    public void setTextColor(@C0354l int i) {
        this.f53662F0 = i;
        this.f53665c.setTextColor(i);
        int i2 = (this.f53661E0 << 24) | (this.f53662F0 & 16777215);
        this.f53664b.setTextColor(i2);
        this.f53666d.setTextColor(i2);
    }

    public void setTextSize(int i, float f) {
        this.f53664b.setTextSize(i, f);
        this.f53665c.setTextSize(i, f);
        this.f53666d.setTextSize(i, f);
    }

    public void setTextSpacing(int i) {
        this.f53669g = i;
        requestLayout();
    }

    public PagerTitleStrip(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f53667e = -1;
        this.f53668f = -1.0f;
        this.f53673y = new C20767a();
        TextView textView = new TextView(context);
        this.f53664b = textView;
        addView(textView);
        TextView textView2 = new TextView(context);
        this.f53665c = textView2;
        addView(textView2);
        TextView textView3 = new TextView(context);
        this.f53666d = textView3;
        addView(textView3);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f53657G0);
        boolean z = false;
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            C18496q.m83723E(this.f53664b, resourceId);
            C18496q.m83723E(this.f53665c, resourceId);
            C18496q.m83723E(this.f53666d, resourceId);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        if (dimensionPixelSize != 0) {
            setTextSize(0, (float) dimensionPixelSize);
        }
        if (obtainStyledAttributes.hasValue(2)) {
            int color = obtainStyledAttributes.getColor(2, 0);
            this.f53664b.setTextColor(color);
            this.f53665c.setTextColor(color);
            this.f53666d.setTextColor(color);
        }
        this.f53670v = obtainStyledAttributes.getInteger(3, 80);
        obtainStyledAttributes.recycle();
        this.f53662F0 = this.f53665c.getTextColors().getDefaultColor();
        setNonPrimaryAlpha(0.6f);
        this.f53664b.setEllipsize(TextUtils.TruncateAt.END);
        this.f53665c.setEllipsize(TextUtils.TruncateAt.END);
        this.f53666d.setEllipsize(TextUtils.TruncateAt.END);
        if (resourceId != 0) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, f53658H0);
            z = obtainStyledAttributes2.getBoolean(0, false);
            obtainStyledAttributes2.recycle();
        }
        if (z) {
            setSingleLineAllCaps(this.f53664b);
            setSingleLineAllCaps(this.f53665c);
            setSingleLineAllCaps(this.f53666d);
        } else {
            this.f53664b.setSingleLine();
            this.f53665c.setSingleLine();
            this.f53666d.setSingleLine();
        }
        this.f53669g = (int) (context.getResources().getDisplayMetrics().density * 16.0f);
    }
}
