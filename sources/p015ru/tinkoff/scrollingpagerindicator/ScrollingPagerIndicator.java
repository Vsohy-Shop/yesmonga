package p015ru.tinkoff.scrollingpagerindicator;

import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.annotation.C0354l;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;
import p015ru.tinkoff.scrollingpagerindicator.C13101b;

/* renamed from: ru.tinkoff.scrollingpagerindicator.ScrollingPagerIndicator */
public class ScrollingPagerIndicator extends View {

    /* renamed from: E0 */
    public int f32182E0;

    /* renamed from: F0 */
    public final Paint f32183F0;

    /* renamed from: G0 */
    public final ArgbEvaluator f32184G0;
    @C0354l

    /* renamed from: H0 */
    public int f32185H0;
    @C0354l

    /* renamed from: I0 */
    public int f32186I0;

    /* renamed from: J0 */
    public boolean f32187J0;

    /* renamed from: K0 */
    public Runnable f32188K0;

    /* renamed from: L0 */
    public C13099c<?> f32189L0;

    /* renamed from: M0 */
    public boolean f32190M0;

    /* renamed from: a */
    public int f32191a;

    /* renamed from: b */
    public final int f32192b;

    /* renamed from: c */
    public final int f32193c;

    /* renamed from: d */
    public final int f32194d;

    /* renamed from: e */
    public final int f32195e;

    /* renamed from: f */
    public int f32196f;

    /* renamed from: g */
    public int f32197g;

    /* renamed from: v */
    public int f32198v;

    /* renamed from: w */
    public float f32199w;

    /* renamed from: x */
    public float f32200x;

    /* renamed from: y */
    public float f32201y;

    /* renamed from: z */
    public SparseArray<Float> f32202z;

    /* renamed from: ru.tinkoff.scrollingpagerindicator.ScrollingPagerIndicator$a */
    public class C13097a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Object f32203a;

        /* renamed from: b */
        public final /* synthetic */ C13099c f32204b;

        public C13097a(Object obj, C13099c cVar) {
            this.f32203a = obj;
            this.f32204b = cVar;
        }

        public void run() {
            int unused = ScrollingPagerIndicator.this.f32182E0 = -1;
            ScrollingPagerIndicator.this.mo30612e(this.f32203a, this.f32204b);
        }
    }

    /* renamed from: ru.tinkoff.scrollingpagerindicator.ScrollingPagerIndicator$b */
    public @interface C13098b {
    }

    /* renamed from: ru.tinkoff.scrollingpagerindicator.ScrollingPagerIndicator$c */
    public interface C13099c<T> {
        /* renamed from: a */
        void mo30641a();

        /* renamed from: b */
        void mo30642b(@C0359n0 ScrollingPagerIndicator scrollingPagerIndicator, @C0359n0 T t);
    }

    public ScrollingPagerIndicator(Context context) {
        this(context, (AttributeSet) null);
    }

    private int getDotCount() {
        if (!this.f32187J0 || this.f32182E0 <= this.f32196f) {
            return this.f32182E0;
        }
        return this.f32191a;
    }

    /* renamed from: b */
    public final void mo30609b(float f, int i) {
        int i2 = this.f32182E0;
        int i3 = this.f32196f;
        if (i2 <= i3) {
            this.f32199w = 0.0f;
        } else if (this.f32187J0 || i2 <= i3) {
            this.f32199w = (mo30622j(this.f32191a / 2) + (((float) this.f32195e) * f)) - (this.f32200x / 2.0f);
        } else {
            this.f32199w = (mo30622j(i) + (((float) this.f32195e) * f)) - (this.f32200x / 2.0f);
            int i4 = this.f32196f / 2;
            float j = mo30622j((getDotCount() - 1) - i4);
            if (this.f32199w + (this.f32200x / 2.0f) < mo30622j(i4)) {
                this.f32199w = mo30622j(i4) - (this.f32200x / 2.0f);
                return;
            }
            float f2 = this.f32199w;
            float f3 = this.f32200x;
            if (f2 + (f3 / 2.0f) > j) {
                this.f32199w = j - (f3 / 2.0f);
            }
        }
    }

    /* renamed from: c */
    public void mo30610c(@C0359n0 ViewPager viewPager) {
        mo30612e(viewPager, new C13112e());
    }

    /* renamed from: d */
    public void mo30611d(@C0359n0 ViewPager2 viewPager2) {
        mo30612e(viewPager2, new C13109d());
    }

    /* renamed from: e */
    public <T> void mo30612e(@C0359n0 T t, @C0359n0 C13099c<T> cVar) {
        mo30621i();
        cVar.mo30642b(this, t);
        this.f32189L0 = cVar;
        this.f32188K0 = new C13097a(t, cVar);
    }

    /* renamed from: f */
    public void mo30613f(@C0359n0 RecyclerView recyclerView) {
        mo30612e(recyclerView, new C13106c());
    }

    /* renamed from: g */
    public void mo30614g(@C0359n0 RecyclerView recyclerView, int i) {
        mo30612e(recyclerView, new C13106c(i));
    }

    @C0354l
    public int getDotColor() {
        return this.f32185H0;
    }

    @C13098b
    public int getOrientation() {
        return this.f32198v;
    }

    @C0354l
    public int getSelectedDotColor() {
        return this.f32186I0;
    }

    public int getVisibleDotCount() {
        return this.f32196f;
    }

    public int getVisibleDotThreshold() {
        return this.f32197g;
    }

    @C0354l
    /* renamed from: h */
    public final int mo30620h(float f) {
        return ((Integer) this.f32184G0.evaluate(f, Integer.valueOf(this.f32185H0), Integer.valueOf(this.f32186I0))).intValue();
    }

    /* renamed from: i */
    public void mo30621i() {
        C13099c<?> cVar = this.f32189L0;
        if (cVar != null) {
            cVar.mo30641a();
            this.f32189L0 = null;
            this.f32188K0 = null;
        }
        this.f32190M0 = false;
    }

    /* renamed from: j */
    public final float mo30622j(int i) {
        return this.f32201y + ((float) (i * this.f32195e));
    }

    /* renamed from: k */
    public final float mo30623k(int i) {
        Float f = this.f32202z.get(i);
        if (f != null) {
            return f.floatValue();
        }
        return 0.0f;
    }

    /* renamed from: l */
    public final void mo30624l(int i) {
        float f;
        if (this.f32182E0 != i || !this.f32190M0) {
            this.f32182E0 = i;
            this.f32190M0 = true;
            this.f32202z = new SparseArray<>();
            if (i < this.f32197g) {
                requestLayout();
                invalidate();
                return;
            }
            if (!this.f32187J0 || this.f32182E0 <= this.f32196f) {
                f = (float) (this.f32194d / 2);
            } else {
                f = 0.0f;
            }
            this.f32201y = f;
            this.f32200x = (float) (((this.f32196f - 1) * this.f32195e) + this.f32194d);
            requestLayout();
            invalidate();
        }
    }

    /* renamed from: m */
    public void mo30625m(int i, float f) {
        int i2;
        if (f < 0.0f || f > 1.0f) {
            throw new IllegalArgumentException("Offset must be [0, 1]");
        } else if (i < 0 || (i != 0 && i >= this.f32182E0)) {
            throw new IndexOutOfBoundsException("page must be [0, adapter.getItemCount())");
        } else {
            if (!this.f32187J0 || ((i2 = this.f32182E0) <= this.f32196f && i2 > 1)) {
                this.f32202z.clear();
                if (this.f32198v == 0) {
                    mo30627o(i, f);
                    int i3 = this.f32182E0;
                    if (i < i3 - 1) {
                        mo30627o(i + 1, 1.0f - f);
                    } else if (i3 > 1) {
                        mo30627o(0, 1.0f - f);
                    }
                } else {
                    mo30627o(i - 1, f);
                    mo30627o(i, 1.0f - f);
                }
                invalidate();
            }
            if (this.f32198v == 0) {
                mo30609b(f, i);
            } else {
                mo30609b(f, i - 1);
            }
            invalidate();
        }
    }

    /* renamed from: n */
    public void mo30626n() {
        Runnable runnable = this.f32188K0;
        if (runnable != null) {
            runnable.run();
            invalidate();
        }
    }

    /* renamed from: o */
    public final void mo30627o(int i, float f) {
        if (this.f32202z != null && getDotCount() != 0) {
            mo30630p(i, 1.0f - Math.abs(f));
        }
    }

    public void onDraw(Canvas canvas) {
        float f;
        float f2;
        int i;
        Canvas canvas2 = canvas;
        int dotCount = getDotCount();
        if (dotCount >= this.f32197g) {
            int i2 = this.f32195e;
            int i3 = this.f32194d;
            float f3 = ((float) (((i3 - this.f32193c) / 2) + i2)) * 0.7f;
            float f4 = (float) (i3 / 2);
            float f5 = ((float) i2) * 0.85714287f;
            float f6 = this.f32199w;
            int i4 = ((int) (f6 - this.f32201y)) / i2;
            int j = (((int) ((f6 + this.f32200x) - mo30622j(i4))) / this.f32195e) + i4;
            if (i4 == 0 && j + 1 > dotCount) {
                j = dotCount - 1;
            }
            while (i4 <= j) {
                float j2 = mo30622j(i4);
                float f7 = this.f32199w;
                if (j2 >= f7) {
                    float f8 = this.f32200x;
                    if (j2 < f7 + f8) {
                        if (!this.f32187J0 || this.f32182E0 <= this.f32196f) {
                            f = mo30623k(i4);
                        } else {
                            float f9 = f7 + (f8 / 2.0f);
                            if (j2 >= f9 - f5 && j2 <= f9) {
                                f = ((j2 - f9) + f5) / f5;
                            } else if (j2 <= f9 || j2 >= f9 + f5) {
                                f = 0.0f;
                            } else {
                                f = 1.0f - ((j2 - f9) / f5);
                            }
                        }
                        int i5 = this.f32193c;
                        float f10 = ((float) i5) + (((float) (this.f32194d - i5)) * f);
                        if (this.f32182E0 > this.f32196f) {
                            if (this.f32187J0 || !(i4 == 0 || i4 == dotCount - 1)) {
                                f2 = f3;
                            } else {
                                f2 = f4;
                            }
                            int width = getWidth();
                            if (this.f32198v == 1) {
                                width = getHeight();
                            }
                            float f11 = this.f32199w;
                            if (j2 - f11 < f2) {
                                float f12 = ((j2 - f11) * f10) / f2;
                                i = this.f32192b;
                                if (f12 > ((float) i)) {
                                    if (f12 < f10) {
                                        f10 = f12;
                                    }
                                }
                            } else {
                                float f13 = (float) width;
                                if (j2 - f11 > f13 - f2) {
                                    float f14 = ((((-j2) + f11) + f13) * f10) / f2;
                                    i = this.f32192b;
                                    if (f14 > ((float) i)) {
                                        if (f14 < f10) {
                                            f10 = f14;
                                        }
                                    }
                                }
                            }
                            f10 = (float) i;
                        }
                        this.f32183F0.setColor(mo30620h(f));
                        if (this.f32198v == 0) {
                            canvas2.drawCircle(j2 - this.f32199w, (float) (getMeasuredHeight() / 2), f10 / 2.0f, this.f32183F0);
                        } else {
                            canvas2.drawCircle((float) (getMeasuredWidth() / 2), j2 - this.f32199w, f10 / 2.0f, this.f32183F0);
                        }
                    }
                }
                i4++;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0073  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r5, int r6) {
        /*
            r4 = this;
            int r0 = r4.f32198v
            r1 = 1073741824(0x40000000, float:2.0)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != 0) goto L_0x0040
            boolean r5 = r4.isInEditMode()
            if (r5 == 0) goto L_0x0019
            int r5 = r4.f32196f
            int r5 = r5 + -1
            int r0 = r4.f32195e
            int r5 = r5 * r0
            int r0 = r4.f32194d
        L_0x0017:
            int r5 = r5 + r0
            goto L_0x002b
        L_0x0019:
            int r5 = r4.f32182E0
            int r0 = r4.f32196f
            if (r5 < r0) goto L_0x0023
            float r5 = r4.f32200x
            int r5 = (int) r5
            goto L_0x002b
        L_0x0023:
            int r5 = r5 + -1
            int r0 = r4.f32195e
            int r5 = r5 * r0
            int r0 = r4.f32194d
            goto L_0x0017
        L_0x002b:
            int r0 = android.view.View.MeasureSpec.getMode(r6)
            int r6 = android.view.View.MeasureSpec.getSize(r6)
            int r3 = r4.f32194d
            if (r0 == r2) goto L_0x003b
            if (r0 == r1) goto L_0x0077
            r6 = r3
            goto L_0x0077
        L_0x003b:
            int r6 = java.lang.Math.min(r3, r6)
            goto L_0x0077
        L_0x0040:
            boolean r6 = r4.isInEditMode()
            if (r6 == 0) goto L_0x0051
            int r6 = r4.f32196f
            int r6 = r6 + -1
            int r0 = r4.f32195e
            int r6 = r6 * r0
            int r0 = r4.f32194d
        L_0x004f:
            int r6 = r6 + r0
            goto L_0x0063
        L_0x0051:
            int r6 = r4.f32182E0
            int r0 = r4.f32196f
            if (r6 < r0) goto L_0x005b
            float r6 = r4.f32200x
            int r6 = (int) r6
            goto L_0x0063
        L_0x005b:
            int r6 = r6 + -1
            int r0 = r4.f32195e
            int r6 = r6 * r0
            int r0 = r4.f32194d
            goto L_0x004f
        L_0x0063:
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            int r3 = r4.f32194d
            if (r0 == r2) goto L_0x0073
            if (r0 == r1) goto L_0x0077
            r5 = r3
            goto L_0x0077
        L_0x0073:
            int r5 = java.lang.Math.min(r3, r5)
        L_0x0077:
            r4.setMeasuredDimension(r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p015ru.tinkoff.scrollingpagerindicator.ScrollingPagerIndicator.onMeasure(int, int):void");
    }

    /* renamed from: p */
    public final void mo30630p(int i, float f) {
        if (f == 0.0f) {
            this.f32202z.remove(i);
        } else {
            this.f32202z.put(i, Float.valueOf(f));
        }
    }

    /* renamed from: q */
    public final void mo30631q(int i) {
        if (!this.f32187J0 || this.f32182E0 < this.f32196f) {
            this.f32202z.clear();
            this.f32202z.put(i, Float.valueOf(1.0f));
            invalidate();
        }
    }

    public void setCurrentPosition(int i) {
        if (i != 0 && (i < 0 || i >= this.f32182E0)) {
            throw new IndexOutOfBoundsException("Position must be [0, adapter.getItemCount()]");
        } else if (this.f32182E0 != 0) {
            mo30609b(0.0f, i);
            mo30631q(i);
        }
    }

    public void setDotColor(@C0354l int i) {
        this.f32185H0 = i;
        invalidate();
    }

    public void setDotCount(int i) {
        mo30624l(i);
    }

    public void setLooped(boolean z) {
        this.f32187J0 = z;
        mo30626n();
        invalidate();
    }

    public void setOrientation(@C13098b int i) {
        this.f32198v = i;
        if (this.f32188K0 != null) {
            mo30626n();
        } else {
            requestLayout();
        }
    }

    public void setSelectedDotColor(@C0354l int i) {
        this.f32186I0 = i;
        invalidate();
    }

    public void setVisibleDotCount(int i) {
        if (i % 2 != 0) {
            this.f32196f = i;
            this.f32191a = i + 2;
            if (this.f32188K0 != null) {
                mo30626n();
            } else {
                requestLayout();
            }
        } else {
            throw new IllegalArgumentException("visibleDotCount must be odd");
        }
    }

    public void setVisibleDotThreshold(int i) {
        this.f32197g = i;
        if (this.f32188K0 != null) {
            mo30626n();
        } else {
            requestLayout();
        }
    }

    public ScrollingPagerIndicator(Context context, @C0363p0 AttributeSet attributeSet) {
        this(context, attributeSet, C13101b.C13102a.scrollingPagerIndicatorStyle);
    }

    public ScrollingPagerIndicator(Context context, @C0363p0 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f32184G0 = new ArgbEvaluator();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C13101b.C13105d.ScrollingPagerIndicator, i, C13101b.C13104c.ScrollingPagerIndicator);
        int color = obtainStyledAttributes.getColor(C13101b.C13105d.ScrollingPagerIndicator_spi_dotColor, 0);
        this.f32185H0 = color;
        this.f32186I0 = obtainStyledAttributes.getColor(C13101b.C13105d.ScrollingPagerIndicator_spi_dotSelectedColor, color);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C13101b.C13105d.ScrollingPagerIndicator_spi_dotSize, 0);
        this.f32193c = dimensionPixelSize;
        this.f32194d = obtainStyledAttributes.getDimensionPixelSize(C13101b.C13105d.ScrollingPagerIndicator_spi_dotSelectedSize, 0);
        int i2 = -1;
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(C13101b.C13105d.ScrollingPagerIndicator_spi_dotMinimumSize, -1);
        this.f32192b = dimensionPixelSize2 <= dimensionPixelSize ? dimensionPixelSize2 : i2;
        this.f32195e = obtainStyledAttributes.getDimensionPixelSize(C13101b.C13105d.ScrollingPagerIndicator_spi_dotSpacing, 0) + dimensionPixelSize;
        this.f32187J0 = obtainStyledAttributes.getBoolean(C13101b.C13105d.ScrollingPagerIndicator_spi_looped, false);
        int i3 = obtainStyledAttributes.getInt(C13101b.C13105d.ScrollingPagerIndicator_spi_visibleDotCount, 0);
        setVisibleDotCount(i3);
        this.f32197g = obtainStyledAttributes.getInt(C13101b.C13105d.ScrollingPagerIndicator_spi_visibleDotThreshold, 2);
        this.f32198v = obtainStyledAttributes.getInt(C13101b.C13105d.ScrollingPagerIndicator_spi_orientation, 0);
        obtainStyledAttributes.recycle();
        Paint paint = new Paint();
        this.f32183F0 = paint;
        paint.setAntiAlias(true);
        if (isInEditMode()) {
            setDotCount(i3);
            mo30625m(i3 / 2, 0.0f);
        }
    }
}
