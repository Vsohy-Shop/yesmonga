package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.C0376v0;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.C16944e;

public class MotionButton extends AppCompatButton {

    /* renamed from: d */
    public float f44093d = 0.0f;

    /* renamed from: e */
    public float f44094e = Float.NaN;

    /* renamed from: f */
    public Path f44095f;

    /* renamed from: g */
    public ViewOutlineProvider f44096g;

    /* renamed from: v */
    public RectF f44097v;

    /* renamed from: androidx.constraintlayout.utils.widget.MotionButton$a */
    public class C16920a extends ViewOutlineProvider {
        public C16920a() {
        }

        public void getOutline(View view, Outline outline) {
            int width = MotionButton.this.getWidth();
            int height = MotionButton.this.getHeight();
            outline.setRoundRect(0, 0, width, height, (((float) Math.min(width, height)) * MotionButton.this.f44093d) / 2.0f);
        }
    }

    /* renamed from: androidx.constraintlayout.utils.widget.MotionButton$b */
    public class C16921b extends ViewOutlineProvider {
        public C16921b() {
        }

        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, MotionButton.this.getWidth(), MotionButton.this.getHeight(), MotionButton.this.f44094e);
        }
    }

    public MotionButton(Context context) {
        super(context);
        mo50559d(context, (AttributeSet) null);
    }

    /* renamed from: d */
    public final void mo50559d(Context context, AttributeSet attributeSet) {
        setPadding(0, 0, 0, 0);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C16944e.C16957m.ImageFilterView);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C16944e.C16957m.ImageFilterView_round) {
                    setRound(obtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == C16944e.C16957m.ImageFilterView_roundPercent) {
                    setRoundPercent(obtainStyledAttributes.getFloat(index, 0.0f));
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
    }

    public float getRound() {
        return this.f44094e;
    }

    public float getRoundPercent() {
        return this.f44093d;
    }

    @C0376v0(21)
    public void setRound(float f) {
        boolean z;
        if (Float.isNaN(f)) {
            this.f44094e = f;
            float f2 = this.f44093d;
            this.f44093d = -1.0f;
            setRoundPercent(f2);
            return;
        }
        if (this.f44094e != f) {
            z = true;
        } else {
            z = false;
        }
        this.f44094e = f;
        if (f != 0.0f) {
            if (this.f44095f == null) {
                this.f44095f = new Path();
            }
            if (this.f44097v == null) {
                this.f44097v = new RectF();
            }
            if (this.f44096g == null) {
                C16921b bVar = new C16921b();
                this.f44096g = bVar;
                setOutlineProvider(bVar);
            }
            setClipToOutline(true);
            this.f44097v.set(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
            this.f44095f.reset();
            Path path = this.f44095f;
            RectF rectF = this.f44097v;
            float f3 = this.f44094e;
            path.addRoundRect(rectF, f3, f3, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z) {
            invalidateOutline();
        }
    }

    @C0376v0(21)
    public void setRoundPercent(float f) {
        boolean z;
        if (this.f44093d != f) {
            z = true;
        } else {
            z = false;
        }
        this.f44093d = f;
        if (f != 0.0f) {
            if (this.f44095f == null) {
                this.f44095f = new Path();
            }
            if (this.f44097v == null) {
                this.f44097v = new RectF();
            }
            if (this.f44096g == null) {
                C16920a aVar = new C16920a();
                this.f44096g = aVar;
                setOutlineProvider(aVar);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float min = (((float) Math.min(width, height)) * this.f44093d) / 2.0f;
            this.f44097v.set(0.0f, 0.0f, (float) width, (float) height);
            this.f44095f.reset();
            this.f44095f.addRoundRect(this.f44097v, min, min, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z) {
            invalidateOutline();
        }
    }

    public MotionButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo50559d(context, attributeSet);
    }

    public MotionButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo50559d(context, attributeSet);
    }
}
