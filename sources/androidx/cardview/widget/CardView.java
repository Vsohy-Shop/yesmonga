package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.C0354l;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0372t0;
import androidx.cardview.C1848a;

public class CardView extends FrameLayout {

    /* renamed from: v */
    public static final int[] f5044v = {16842801};

    /* renamed from: w */
    public static final C1861e f5045w;

    /* renamed from: a */
    public boolean f5046a;

    /* renamed from: b */
    public boolean f5047b;

    /* renamed from: c */
    public int f5048c;

    /* renamed from: d */
    public int f5049d;

    /* renamed from: e */
    public final Rect f5050e;

    /* renamed from: f */
    public final Rect f5051f;

    /* renamed from: g */
    public final C1860d f5052g;

    /* renamed from: androidx.cardview.widget.CardView$a */
    public class C1854a implements C1860d {

        /* renamed from: a */
        public Drawable f5053a;

        public C1854a() {
        }

        /* renamed from: a */
        public void mo6062a(int i, int i2, int i3, int i4) {
            CardView.this.f5051f.set(i, i2, i3, i4);
            CardView cardView = CardView.this;
            Rect rect = cardView.f5050e;
            CardView.super.setPadding(i + rect.left, i2 + rect.top, i3 + rect.right, i4 + rect.bottom);
        }

        /* renamed from: b */
        public void mo6063b(Drawable drawable) {
            this.f5053a = drawable;
            CardView.this.setBackgroundDrawable(drawable);
        }

        /* renamed from: c */
        public boolean mo6064c() {
            return CardView.this.getUseCompatPadding();
        }

        /* renamed from: d */
        public Drawable mo6065d() {
            return this.f5053a;
        }

        /* renamed from: e */
        public void mo6066e(int i, int i2) {
            CardView cardView = CardView.this;
            if (i > cardView.f5048c) {
                CardView.super.setMinimumWidth(i);
            }
            CardView cardView2 = CardView.this;
            if (i2 > cardView2.f5049d) {
                CardView.super.setMinimumHeight(i2);
            }
        }

        /* renamed from: f */
        public boolean mo6067f() {
            return CardView.this.getPreventCornerOverlap();
        }

        /* renamed from: g */
        public View mo6068g() {
            return CardView.this;
        }
    }

    static {
        C1857b bVar = new C1857b();
        f5045w = bVar;
        bVar.mo6069l();
    }

    public CardView(@C0359n0 Context context) {
        this(context, (AttributeSet) null);
    }

    @C0359n0
    public ColorStateList getCardBackgroundColor() {
        return f5045w.mo6075e(this.f5052g);
    }

    public float getCardElevation() {
        return f5045w.mo6079i(this.f5052g);
    }

    @C0372t0
    public int getContentPaddingBottom() {
        return this.f5050e.bottom;
    }

    @C0372t0
    public int getContentPaddingLeft() {
        return this.f5050e.left;
    }

    @C0372t0
    public int getContentPaddingRight() {
        return this.f5050e.right;
    }

    @C0372t0
    public int getContentPaddingTop() {
        return this.f5050e.top;
    }

    public float getMaxCardElevation() {
        return f5045w.mo6074d(this.f5052g);
    }

    public boolean getPreventCornerOverlap() {
        return this.f5047b;
    }

    public float getRadius() {
        return f5045w.mo6072b(this.f5052g);
    }

    public boolean getUseCompatPadding() {
        return this.f5046a;
    }

    public void onMeasure(int i, int i2) {
        C1861e eVar = f5045w;
        if (!(eVar instanceof C1857b)) {
            int mode = View.MeasureSpec.getMode(i);
            if (mode == Integer.MIN_VALUE || mode == 1073741824) {
                i = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil((double) eVar.mo6082m(this.f5052g)), View.MeasureSpec.getSize(i)), mode);
            }
            int mode2 = View.MeasureSpec.getMode(i2);
            if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
                i2 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil((double) eVar.mo6076f(this.f5052g)), View.MeasureSpec.getSize(i2)), mode2);
            }
            super.onMeasure(i, i2);
            return;
        }
        super.onMeasure(i, i2);
    }

    public void setCardBackgroundColor(@C0354l int i) {
        f5045w.mo6083n(this.f5052g, ColorStateList.valueOf(i));
    }

    public void setCardElevation(float f) {
        f5045w.mo6073c(this.f5052g, f);
    }

    public void setContentPadding(@C0372t0 int i, @C0372t0 int i2, @C0372t0 int i3, @C0372t0 int i4) {
        this.f5050e.set(i, i2, i3, i4);
        f5045w.mo6081k(this.f5052g);
    }

    public void setMaxCardElevation(float f) {
        f5045w.mo6084o(this.f5052g, f);
    }

    public void setMinimumHeight(int i) {
        this.f5049d = i;
        super.setMinimumHeight(i);
    }

    public void setMinimumWidth(int i) {
        this.f5048c = i;
        super.setMinimumWidth(i);
    }

    public void setPadding(int i, int i2, int i3, int i4) {
    }

    public void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.f5047b) {
            this.f5047b = z;
            f5045w.mo6077g(this.f5052g);
        }
    }

    public void setRadius(float f) {
        f5045w.mo6071a(this.f5052g, f);
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f5046a != z) {
            this.f5046a = z;
            f5045w.mo6080j(this.f5052g);
        }
    }

    public CardView(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet) {
        this(context, attributeSet, C1848a.C1849a.cardViewStyle);
    }

    public void setCardBackgroundColor(@C0363p0 ColorStateList colorStateList) {
        f5045w.mo6083n(this.f5052g, colorStateList);
    }

    public CardView(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2;
        ColorStateList valueOf;
        Rect rect = new Rect();
        this.f5050e = rect;
        this.f5051f = new Rect();
        C1854a aVar = new C1854a();
        this.f5052g = aVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1848a.C1853e.CardView, i, C1848a.C1852d.CardView);
        int i3 = C1848a.C1853e.CardView_cardBackgroundColor;
        if (obtainStyledAttributes.hasValue(i3)) {
            valueOf = obtainStyledAttributes.getColorStateList(i3);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(f5044v);
            int color = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            if (fArr[2] > 0.5f) {
                i2 = getResources().getColor(C1848a.C1850b.cardview_light_background);
            } else {
                i2 = getResources().getColor(C1848a.C1850b.cardview_dark_background);
            }
            valueOf = ColorStateList.valueOf(i2);
        }
        ColorStateList colorStateList = valueOf;
        float dimension = obtainStyledAttributes.getDimension(C1848a.C1853e.CardView_cardCornerRadius, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(C1848a.C1853e.CardView_cardElevation, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(C1848a.C1853e.CardView_cardMaxElevation, 0.0f);
        this.f5046a = obtainStyledAttributes.getBoolean(C1848a.C1853e.CardView_cardUseCompatPadding, false);
        this.f5047b = obtainStyledAttributes.getBoolean(C1848a.C1853e.CardView_cardPreventCornerOverlap, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C1848a.C1853e.CardView_contentPadding, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(C1848a.C1853e.CardView_contentPaddingLeft, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(C1848a.C1853e.CardView_contentPaddingTop, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(C1848a.C1853e.CardView_contentPaddingRight, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(C1848a.C1853e.CardView_contentPaddingBottom, dimensionPixelSize);
        float f = dimension2 > dimension3 ? dimension2 : dimension3;
        this.f5048c = obtainStyledAttributes.getDimensionPixelSize(C1848a.C1853e.CardView_android_minWidth, 0);
        this.f5049d = obtainStyledAttributes.getDimensionPixelSize(C1848a.C1853e.CardView_android_minHeight, 0);
        obtainStyledAttributes.recycle();
        f5045w.mo6078h(aVar, context, colorStateList, dimension, dimension2, f);
    }
}
