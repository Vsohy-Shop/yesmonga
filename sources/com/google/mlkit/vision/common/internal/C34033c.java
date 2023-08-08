package com.google.mlkit.vision.common.internal;

import android.graphics.Bitmap;
import android.media.Image;
import android.os.SystemClock;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.internal.mlkit_vision_common.C39228m7;
import com.google.android.gms.internal.mlkit_vision_common.C39246o7;
import com.google.android.odml.image.C31843a;
import com.google.android.odml.image.C31845c;
import com.google.android.odml.image.C31847e;
import com.google.android.odml.image.C31848f;
import com.google.android.odml.image.C31850h;
import com.google.mlkit.vision.common.C34025b;
import java.nio.ByteBuffer;

@C40473a
/* renamed from: com.google.mlkit.vision.common.internal.c */
public class C34033c {
    @C40473a
    /* renamed from: a */
    public static int m136925a(@C34025b.C34026a int i) {
        int i2 = 17;
        if (i != 17) {
            i2 = 35;
            if (i != 35) {
                i2 = C34025b.f82645i;
                if (i != 842094169) {
                    return 0;
                }
            }
        }
        return i2;
    }

    @C40473a
    /* renamed from: b */
    public static int m136926b(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 90) {
            return 1;
        }
        if (i == 180) {
            return 2;
        }
        if (i == 270) {
            return 3;
        }
        StringBuilder sb = new StringBuilder(29);
        sb.append("Invalid rotation: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    @C0363p0
    /* renamed from: c */
    public static C34025b m136927c(@C0359n0 C31850h hVar) {
        Integer num;
        int i;
        C31847e eVar = hVar.mo92360a().get(0);
        int b = eVar.mo92357b();
        if (b == 1) {
            Bitmap a = C31843a.m129215a(hVar);
            m136928d(-1, 1, SystemClock.elapsedRealtime(), hVar.getHeight(), hVar.getWidth(), a.getAllocationByteCount(), hVar.mo92362c());
            return C34025b.m136893a(a, hVar.mo92362c());
        } else if (b == 2) {
            ByteBuffer a2 = C31845c.m129218a(hVar);
            int a3 = eVar.mo92356a();
            if (a3 == 4) {
                num = 17;
            } else if (a3 != 5) {
                num = null;
            } else {
                num = Integer.valueOf(C34025b.f82645i);
            }
            if (num == null) {
                return null;
            }
            m136928d(num.intValue(), 3, SystemClock.elapsedRealtime(), hVar.getHeight(), hVar.getWidth(), a2.limit(), hVar.mo92362c());
            return C34025b.m136895c(a2, hVar.getWidth(), hVar.getHeight(), hVar.mo92362c(), num.intValue());
        } else if (b != 3) {
            return null;
        } else {
            Image a4 = C31848f.m129223a(hVar);
            if (a4.getFormat() == 256) {
                i = a4.getPlanes()[0].getBuffer().limit();
            } else {
                i = (a4.getPlanes()[0].getBuffer().limit() * 3) / 2;
            }
            m136928d(a4.getFormat(), 5, SystemClock.elapsedRealtime(), hVar.getHeight(), hVar.getWidth(), i, hVar.mo92362c());
            return C34025b.m136897e(a4, hVar.mo92362c());
        }
    }

    /* renamed from: d */
    public static void m136928d(int i, int i2, long j, int i3, int i4, int i5, int i6) {
        C39246o7.m161292b(C39228m7.m161282b("vision-common"), i, i2, j, i3, i4, i5, i6);
    }
}
