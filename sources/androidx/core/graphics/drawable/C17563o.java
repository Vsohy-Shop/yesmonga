package androidx.core.graphics.drawable;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Outline;
import android.graphics.Rect;
import android.view.Gravity;
import androidx.annotation.C0359n0;
import androidx.annotation.C0376v0;

@C0376v0(21)
/* renamed from: androidx.core.graphics.drawable.o */
public class C17563o extends C17564p {
    public C17563o(Resources resources, Bitmap bitmap) {
        super(resources, bitmap);
    }

    /* renamed from: f */
    public void mo51949f(int i, int i2, int i3, Rect rect, Rect rect2) {
        Gravity.apply(i, i2, i3, rect, rect2, 0);
    }

    public void getOutline(@C0359n0 Outline outline) {
        mo51979t();
        outline.setRoundRect(this.f45914h, mo51955c());
    }

    /* renamed from: h */
    public boolean mo51951h() {
        Bitmap bitmap = this.f45907a;
        return bitmap != null && bitmap.hasMipMap();
    }

    /* renamed from: o */
    public void mo51952o(boolean z) {
        Bitmap bitmap = this.f45907a;
        if (bitmap != null) {
            bitmap.setHasMipMap(z);
            invalidateSelf();
        }
    }
}
