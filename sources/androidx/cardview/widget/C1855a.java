package androidx.cardview.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.annotation.C0376v0;
import androidx.cardview.widget.C1863g;

@C0376v0(17)
/* renamed from: androidx.cardview.widget.a */
public class C1855a extends C1858c {

    /* renamed from: androidx.cardview.widget.a$a */
    public class C1856a implements C1863g.C1864a {
        public C1856a() {
        }

        /* renamed from: a */
        public void mo6070a(Canvas canvas, RectF rectF, float f, Paint paint) {
            canvas.drawRoundRect(rectF, f, f, paint);
        }
    }

    /* renamed from: l */
    public void mo6069l() {
        C1863g.f5071s = new C1856a();
    }
}
