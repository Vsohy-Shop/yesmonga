package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.C16944e;
import androidx.constraintlayout.widget.ConstraintLayout;

public class Placeholder extends View {

    /* renamed from: a */
    public int f44384a = -1;

    /* renamed from: b */
    public View f44385b = null;

    /* renamed from: c */
    public int f44386c = 4;

    public Placeholder(Context context) {
        super(context);
        mo50727a((AttributeSet) null);
    }

    /* renamed from: a */
    public final void mo50727a(AttributeSet attributeSet) {
        super.setVisibility(this.f44386c);
        this.f44384a = -1;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C16944e.C16957m.ConstraintLayout_placeholder);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C16944e.C16957m.ConstraintLayout_placeholder_content) {
                    this.f44384a = obtainStyledAttributes.getResourceId(index, this.f44384a);
                } else if (index == C16944e.C16957m.ConstraintLayout_placeholder_placeholder_emptyVisibility) {
                    this.f44386c = obtainStyledAttributes.getInt(index, this.f44386c);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: b */
    public void mo50728b(ConstraintLayout constraintLayout) {
        if (this.f44385b != null) {
            ConstraintLayout.C16926b bVar = (ConstraintLayout.C16926b) getLayoutParams();
            ConstraintLayout.C16926b bVar2 = (ConstraintLayout.C16926b) this.f44385b.getLayoutParams();
            bVar2.f44293v0.mo49530b2(0);
            ConstraintWidget.DimensionBehaviour H = bVar.f44293v0.mo49468H();
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.FIXED;
            if (H != dimensionBehaviour) {
                bVar.f44293v0.mo49533c2(bVar2.f44293v0.mo49569m0());
            }
            if (bVar.f44293v0.mo49559j0() != dimensionBehaviour) {
                bVar.f44293v0.mo49607y1(bVar2.f44293v0.mo49456D());
            }
            bVar2.f44293v0.mo49530b2(8);
        }
    }

    /* renamed from: c */
    public void mo50729c(ConstraintLayout constraintLayout) {
        if (this.f44384a == -1 && !isInEditMode()) {
            setVisibility(this.f44386c);
        }
        View findViewById = constraintLayout.findViewById(this.f44384a);
        this.f44385b = findViewById;
        if (findViewById != null) {
            ((ConstraintLayout.C16926b) findViewById.getLayoutParams()).f44269j0 = true;
            this.f44385b.setVisibility(0);
            setVisibility(0);
        }
    }

    public View getContent() {
        return this.f44385b;
    }

    public int getEmptyVisibility() {
        return this.f44386c;
    }

    public void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize((float) rect.height());
            int height = rect.height();
            int width = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, 1, rect);
            canvas.drawText("?", ((((float) width) / 2.0f) - (((float) rect.width()) / 2.0f)) - ((float) rect.left), ((((float) height) / 2.0f) + (((float) rect.height()) / 2.0f)) - ((float) rect.bottom), paint);
        }
    }

    public void setContentId(int i) {
        View findViewById;
        if (this.f44384a != i) {
            View view = this.f44385b;
            if (view != null) {
                view.setVisibility(0);
                ((ConstraintLayout.C16926b) this.f44385b.getLayoutParams()).f44269j0 = false;
                this.f44385b = null;
            }
            this.f44384a = i;
            if (i != -1 && (findViewById = ((View) getParent()).findViewById(i)) != null) {
                findViewById.setVisibility(8);
            }
        }
    }

    public void setEmptyVisibility(int i) {
        this.f44386c = i;
    }

    public Placeholder(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo50727a(attributeSet);
    }

    public Placeholder(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo50727a(attributeSet);
    }

    public Placeholder(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        mo50727a(attributeSet);
    }
}
