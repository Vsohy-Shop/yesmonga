package androidx.viewpager.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.C0354l;
import androidx.annotation.C0358n;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0375v;
import androidx.core.content.C17318d;

public class PagerTabStrip extends PagerTitleStrip {

    /* renamed from: a1 */
    public static final String f53631a1 = "PagerTabStrip";

    /* renamed from: b1 */
    public static final int f53632b1 = 3;

    /* renamed from: c1 */
    public static final int f53633c1 = 6;

    /* renamed from: d1 */
    public static final int f53634d1 = 16;

    /* renamed from: e1 */
    public static final int f53635e1 = 32;

    /* renamed from: f1 */
    public static final int f53636f1 = 64;

    /* renamed from: g1 */
    public static final int f53637g1 = 1;

    /* renamed from: h1 */
    public static final int f53638h1 = 32;

    /* renamed from: K0 */
    public int f53639K0;

    /* renamed from: L0 */
    public int f53640L0;

    /* renamed from: M0 */
    public int f53641M0;

    /* renamed from: N0 */
    public int f53642N0;

    /* renamed from: O0 */
    public int f53643O0;

    /* renamed from: P0 */
    public int f53644P0;

    /* renamed from: Q0 */
    public final Paint f53645Q0;

    /* renamed from: R0 */
    public final Rect f53646R0;

    /* renamed from: S0 */
    public int f53647S0;

    /* renamed from: T0 */
    public boolean f53648T0;

    /* renamed from: U0 */
    public boolean f53649U0;

    /* renamed from: V0 */
    public int f53650V0;

    /* renamed from: W0 */
    public boolean f53651W0;

    /* renamed from: X0 */
    public float f53652X0;

    /* renamed from: Y0 */
    public float f53653Y0;

    /* renamed from: Z0 */
    public int f53654Z0;

    /* renamed from: androidx.viewpager.widget.PagerTabStrip$a */
    public class C20765a implements View.OnClickListener {
        public C20765a() {
        }

        public void onClick(View view) {
            ViewPager viewPager = PagerTabStrip.this.f53663a;
            viewPager.setCurrentItem(viewPager.getCurrentItem() - 1);
        }
    }

    /* renamed from: androidx.viewpager.widget.PagerTabStrip$b */
    public class C20766b implements View.OnClickListener {
        public C20766b() {
        }

        public void onClick(View view) {
            ViewPager viewPager = PagerTabStrip.this.f53663a;
            viewPager.setCurrentItem(viewPager.getCurrentItem() + 1);
        }
    }

    public PagerTabStrip(@C0359n0 Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: c */
    public void mo62270c(int i, float f, boolean z) {
        Rect rect = this.f53646R0;
        int height = getHeight();
        int left = this.f53665c.getLeft() - this.f53644P0;
        int right = this.f53665c.getRight() + this.f53644P0;
        int i2 = height - this.f53640L0;
        rect.set(left, i2, right, height);
        super.mo62270c(i, f, z);
        this.f53647S0 = (int) (Math.abs(f - 0.5f) * 2.0f * 255.0f);
        rect.union(this.f53665c.getLeft() - this.f53644P0, i2, this.f53665c.getRight() + this.f53644P0, height);
        invalidate(rect);
    }

    public boolean getDrawFullUnderline() {
        return this.f53648T0;
    }

    public int getMinHeight() {
        return Math.max(super.getMinHeight(), this.f53643O0);
    }

    @C0354l
    public int getTabIndicatorColor() {
        return this.f53639K0;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight();
        int left = this.f53665c.getLeft() - this.f53644P0;
        int right = this.f53665c.getRight() + this.f53644P0;
        this.f53645Q0.setColor((this.f53647S0 << 24) | (this.f53639K0 & 16777215));
        float f = (float) height;
        canvas.drawRect((float) left, (float) (height - this.f53640L0), (float) right, f, this.f53645Q0);
        if (this.f53648T0) {
            this.f53645Q0.setColor((this.f53639K0 & 16777215) | -16777216);
            canvas.drawRect((float) getPaddingLeft(), (float) (height - this.f53650V0), (float) (getWidth() - getPaddingRight()), f, this.f53645Q0);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0 && this.f53651W0) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (action == 0) {
            this.f53652X0 = x;
            this.f53653Y0 = y;
            this.f53651W0 = false;
        } else if (action != 1) {
            if (action == 2 && (Math.abs(x - this.f53652X0) > ((float) this.f53654Z0) || Math.abs(y - this.f53653Y0) > ((float) this.f53654Z0))) {
                this.f53651W0 = true;
            }
        } else if (x < ((float) (this.f53665c.getLeft() - this.f53644P0))) {
            ViewPager viewPager = this.f53663a;
            viewPager.setCurrentItem(viewPager.getCurrentItem() - 1);
        } else if (x > ((float) (this.f53665c.getRight() + this.f53644P0))) {
            ViewPager viewPager2 = this.f53663a;
            viewPager2.setCurrentItem(viewPager2.getCurrentItem() + 1);
        }
        return true;
    }

    public void setBackgroundColor(@C0354l int i) {
        boolean z;
        super.setBackgroundColor(i);
        if (!this.f53649U0) {
            if ((i & -16777216) == 0) {
                z = true;
            } else {
                z = false;
            }
            this.f53648T0 = z;
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        boolean z;
        super.setBackgroundDrawable(drawable);
        if (!this.f53649U0) {
            if (drawable == null) {
                z = true;
            } else {
                z = false;
            }
            this.f53648T0 = z;
        }
    }

    public void setBackgroundResource(@C0375v int i) {
        boolean z;
        super.setBackgroundResource(i);
        if (!this.f53649U0) {
            if (i == 0) {
                z = true;
            } else {
                z = false;
            }
            this.f53648T0 = z;
        }
    }

    public void setDrawFullUnderline(boolean z) {
        this.f53648T0 = z;
        this.f53649U0 = true;
        invalidate();
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        int i5 = this.f53641M0;
        if (i4 < i5) {
            i4 = i5;
        }
        super.setPadding(i, i2, i3, i4);
    }

    public void setTabIndicatorColor(@C0354l int i) {
        this.f53639K0 = i;
        this.f53645Q0.setColor(i);
        invalidate();
    }

    public void setTabIndicatorColorResource(@C0358n int i) {
        setTabIndicatorColor(C17318d.m79723f(getContext(), i));
    }

    public void setTextSpacing(int i) {
        int i2 = this.f53642N0;
        if (i < i2) {
            i = i2;
        }
        super.setTextSpacing(i);
    }

    public PagerTabStrip(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint();
        this.f53645Q0 = paint;
        this.f53646R0 = new Rect();
        this.f53647S0 = 255;
        this.f53648T0 = false;
        this.f53649U0 = false;
        int i = this.f53662F0;
        this.f53639K0 = i;
        paint.setColor(i);
        float f = context.getResources().getDisplayMetrics().density;
        this.f53640L0 = (int) ((3.0f * f) + 0.5f);
        this.f53641M0 = (int) ((6.0f * f) + 0.5f);
        this.f53642N0 = (int) (64.0f * f);
        this.f53644P0 = (int) ((16.0f * f) + 0.5f);
        this.f53650V0 = (int) ((1.0f * f) + 0.5f);
        this.f53643O0 = (int) ((f * 32.0f) + 0.5f);
        this.f53654Z0 = ViewConfiguration.get(context).getScaledTouchSlop();
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        setTextSpacing(getTextSpacing());
        setWillNotDraw(false);
        this.f53664b.setFocusable(true);
        this.f53664b.setOnClickListener(new C20765a());
        this.f53666d.setFocusable(true);
        this.f53666d.setOnClickListener(new C20766b());
        if (getBackground() == null) {
            this.f53648T0 = true;
        }
    }
}
