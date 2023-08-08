package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.C16944e;

public class MockView extends View {

    /* renamed from: a */
    public Paint f44082a = new Paint();

    /* renamed from: b */
    public Paint f44083b = new Paint();

    /* renamed from: c */
    public Paint f44084c = new Paint();

    /* renamed from: d */
    public boolean f44085d = true;

    /* renamed from: e */
    public boolean f44086e = true;

    /* renamed from: f */
    public String f44087f = null;

    /* renamed from: g */
    public Rect f44088g = new Rect();

    /* renamed from: v */
    public int f44089v = Color.argb(255, 0, 0, 0);

    /* renamed from: w */
    public int f44090w = Color.argb(255, 200, 200, 200);

    /* renamed from: x */
    public int f44091x = Color.argb(255, 50, 50, 50);

    /* renamed from: y */
    public int f44092y = 4;

    public MockView(Context context) {
        super(context);
        mo50557a(context, (AttributeSet) null);
    }

    /* renamed from: a */
    public final void mo50557a(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C16944e.C16957m.MockView);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C16944e.C16957m.MockView_mock_label) {
                    this.f44087f = obtainStyledAttributes.getString(index);
                } else if (index == C16944e.C16957m.MockView_mock_showDiagonals) {
                    this.f44085d = obtainStyledAttributes.getBoolean(index, this.f44085d);
                } else if (index == C16944e.C16957m.MockView_mock_diagonalsColor) {
                    this.f44089v = obtainStyledAttributes.getColor(index, this.f44089v);
                } else if (index == C16944e.C16957m.MockView_mock_labelBackgroundColor) {
                    this.f44091x = obtainStyledAttributes.getColor(index, this.f44091x);
                } else if (index == C16944e.C16957m.MockView_mock_labelColor) {
                    this.f44090w = obtainStyledAttributes.getColor(index, this.f44090w);
                } else if (index == C16944e.C16957m.MockView_mock_showLabel) {
                    this.f44086e = obtainStyledAttributes.getBoolean(index, this.f44086e);
                }
            }
            obtainStyledAttributes.recycle();
        }
        if (this.f44087f == null) {
            try {
                this.f44087f = context.getResources().getResourceEntryName(getId());
            } catch (Exception unused) {
            }
        }
        this.f44082a.setColor(this.f44089v);
        this.f44082a.setAntiAlias(true);
        this.f44083b.setColor(this.f44090w);
        this.f44083b.setAntiAlias(true);
        this.f44084c.setColor(this.f44091x);
        this.f44092y = Math.round(((float) this.f44092y) * (getResources().getDisplayMetrics().xdpi / 160.0f));
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f44085d) {
            width--;
            height--;
            float f = (float) width;
            float f2 = (float) height;
            canvas.drawLine(0.0f, 0.0f, f, f2, this.f44082a);
            Canvas canvas2 = canvas;
            float f3 = f;
            canvas2.drawLine(0.0f, f2, f3, 0.0f, this.f44082a);
            canvas2.drawLine(0.0f, 0.0f, f3, 0.0f, this.f44082a);
            float f4 = f;
            float f5 = f2;
            canvas2.drawLine(f4, 0.0f, f3, f5, this.f44082a);
            float f6 = f2;
            canvas2.drawLine(f4, f6, 0.0f, f5, this.f44082a);
            canvas2.drawLine(0.0f, f6, 0.0f, 0.0f, this.f44082a);
        }
        String str = this.f44087f;
        if (str != null && this.f44086e) {
            this.f44083b.getTextBounds(str, 0, str.length(), this.f44088g);
            float width2 = ((float) (width - this.f44088g.width())) / 2.0f;
            float height2 = (((float) (height - this.f44088g.height())) / 2.0f) + ((float) this.f44088g.height());
            this.f44088g.offset((int) width2, (int) height2);
            Rect rect = this.f44088g;
            int i = rect.left;
            int i2 = this.f44092y;
            rect.set(i - i2, rect.top - i2, rect.right + i2, rect.bottom + i2);
            canvas.drawRect(this.f44088g, this.f44084c);
            canvas.drawText(this.f44087f, width2, height2, this.f44083b);
        }
    }

    public MockView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo50557a(context, attributeSet);
    }

    public MockView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo50557a(context, attributeSet);
    }
}
