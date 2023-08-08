package androidx.core.graphics;

import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import androidx.compose.p004ui.graphics.C15332v1;
import androidx.compose.p004ui.graphics.C15402w1;
import androidx.core.graphics.C17594i;

/* renamed from: androidx.core.graphics.h */
public class C17584h {

    @C0376v0(29)
    /* renamed from: androidx.core.graphics.h$a */
    public static class C17585a {
        @C0373u
        /* renamed from: a */
        public static ColorFilter m80561a(int i, Object obj) {
            C15402w1.m67267a();
            return C15332v1.m66723a(i, C17580g.m80549a(obj));
        }
    }

    @C0363p0
    /* renamed from: a */
    public static ColorFilter m80560a(int i, @C0359n0 BlendModeCompat blendModeCompat) {
        if (Build.VERSION.SDK_INT >= 29) {
            Object a = C17594i.C17596b.m80638a(blendModeCompat);
            if (a != null) {
                return C17585a.m80561a(i, a);
            }
            return null;
        }
        PorterDuff.Mode a2 = C17594i.m80637a(blendModeCompat);
        if (a2 != null) {
            return new PorterDuffColorFilter(i, a2);
        }
        return null;
    }
}
