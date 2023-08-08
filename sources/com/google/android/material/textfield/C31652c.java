package com.google.android.material.textfield;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.material.shape.C31525j;
import com.google.android.material.shape.C31534o;

/* renamed from: com.google.android.material.textfield.c */
public class C31652c extends C31525j {
    @C0359n0

    /* renamed from: T0 */
    public final Paint f76975T0;
    @C0359n0

    /* renamed from: U0 */
    public final RectF f76976U0;

    public C31652c() {
        this((C31534o) null);
    }

    /* renamed from: P0 */
    public boolean mo91744P0() {
        return !this.f76976U0.isEmpty();
    }

    /* renamed from: Q0 */
    public void mo91745Q0() {
        mo91746R0(0.0f, 0.0f, 0.0f, 0.0f);
    }

    /* renamed from: R0 */
    public void mo91746R0(float f, float f2, float f3, float f4) {
        RectF rectF = this.f76976U0;
        if (f != rectF.left || f2 != rectF.top || f3 != rectF.right || f4 != rectF.bottom) {
            rectF.set(f, f2, f3, f4);
            invalidateSelf();
        }
    }

    /* renamed from: S0 */
    public void mo91747S0(@C0359n0 RectF rectF) {
        mo91746R0(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    /* renamed from: T0 */
    public final void mo91748T0() {
        this.f76975T0.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f76975T0.setColor(-1);
        this.f76975T0.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    /* renamed from: s */
    public void mo90785s(@C0359n0 Canvas canvas) {
        if (this.f76976U0.isEmpty()) {
            super.mo90785s(canvas);
            return;
        }
        canvas.save();
        if (Build.VERSION.SDK_INT >= 26) {
            boolean unused = canvas.clipOutRect(this.f76976U0);
        } else {
            canvas.clipRect(this.f76976U0, Region.Op.DIFFERENCE);
        }
        super.mo90785s(canvas);
        canvas.restore();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C31652c(@C0363p0 C31534o oVar) {
        super(oVar == null ? new C31534o() : oVar);
        this.f76975T0 = new Paint(1);
        mo91748T0();
        this.f76976U0 = new RectF();
    }
}
