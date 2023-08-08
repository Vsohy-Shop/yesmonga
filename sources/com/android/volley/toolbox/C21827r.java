package com.android.volley.toolbox;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;
import androidx.annotation.C0323b0;
import androidx.annotation.C0344h1;
import androidx.annotation.C0363p0;
import com.android.volley.C21755g;
import com.android.volley.C21762l;
import com.android.volley.C21771p;
import com.android.volley.C21776s;
import com.android.volley.ParseError;
import com.android.volley.Request;

/* renamed from: com.android.volley.toolbox.r */
public class C21827r extends Request<Bitmap> {

    /* renamed from: N0 */
    public static final int f56465N0 = 1000;

    /* renamed from: O0 */
    public static final int f56466O0 = 2;

    /* renamed from: P0 */
    public static final float f56467P0 = 2.0f;

    /* renamed from: Q0 */
    public static final Object f56468Q0 = new Object();

    /* renamed from: H0 */
    public final Object f56469H0;
    @C0363p0
    @C0323b0("mLock")

    /* renamed from: I0 */
    public C21771p.C21773b<Bitmap> f56470I0;

    /* renamed from: J0 */
    public final Bitmap.Config f56471J0;

    /* renamed from: K0 */
    public final int f56472K0;

    /* renamed from: L0 */
    public final int f56473L0;

    /* renamed from: M0 */
    public final ImageView.ScaleType f56474M0;

    public C21827r(String str, C21771p.C21773b<Bitmap> bVar, int i, int i2, ImageView.ScaleType scaleType, Bitmap.Config config, @C0363p0 C21771p.C21772a aVar) {
        super(0, str, aVar);
        this.f56469H0 = new Object();
        mo64820z1(new C21755g(1000, 2, 2.0f));
        this.f56470I0 = bVar;
        this.f56471J0 = config;
        this.f56472K0 = i;
        this.f56473L0 = i2;
        this.f56474M0 = scaleType;
    }

    @C0344h1
    /* renamed from: Q1 */
    public static int m100274Q1(int i, int i2, int i3, int i4) {
        double min = Math.min(((double) i) / ((double) i3), ((double) i2) / ((double) i4));
        float f = 1.0f;
        while (true) {
            float f2 = 2.0f * f;
            if (((double) f2) > min) {
                return (int) f;
            }
            f = f2;
        }
    }

    /* renamed from: T1 */
    public static int m100275T1(int i, int i2, int i3, int i4, ImageView.ScaleType scaleType) {
        if (i == 0 && i2 == 0) {
            return i3;
        }
        if (scaleType == ImageView.ScaleType.FIT_XY) {
            if (i == 0) {
                return i3;
            }
            return i;
        } else if (i == 0) {
            return (int) (((double) i3) * (((double) i2) / ((double) i4)));
        } else if (i2 == 0) {
            return i;
        } else {
            double d = ((double) i4) / ((double) i3);
            if (scaleType == ImageView.ScaleType.CENTER_CROP) {
                double d2 = (double) i2;
                if (((double) i) * d < d2) {
                    return (int) (d2 / d);
                }
                return i;
            }
            double d3 = (double) i2;
            if (((double) i) * d > d3) {
                return (int) (d3 / d);
            }
            return i;
        }
    }

    /* renamed from: M1 */
    public void mo20306y(Bitmap bitmap) {
        C21771p.C21773b<Bitmap> bVar;
        synchronized (this.f56469H0) {
            bVar = this.f56470I0;
        }
        if (bVar != null) {
            bVar.mo20311b(bitmap);
        }
    }

    /* renamed from: N1 */
    public final C21771p<Bitmap> mo65059N1(C21762l lVar) {
        Bitmap bitmap;
        byte[] bArr = lVar.f56298b;
        BitmapFactory.Options options = new BitmapFactory.Options();
        if (this.f56472K0 == 0 && this.f56473L0 == 0) {
            options.inPreferredConfig = this.f56471J0;
            bitmap = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        } else {
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            int i = options.outWidth;
            int i2 = options.outHeight;
            int T1 = m100275T1(this.f56472K0, this.f56473L0, i, i2, this.f56474M0);
            int T12 = m100275T1(this.f56473L0, this.f56472K0, i2, i, this.f56474M0);
            options.inJustDecodeBounds = false;
            options.inSampleSize = m100274Q1(i, i2, T1, T12);
            bitmap = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            if (bitmap != null && (bitmap.getWidth() > T1 || bitmap.getHeight() > T12)) {
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, T1, T12, true);
                bitmap.recycle();
                bitmap = createScaledBitmap;
            }
        }
        if (bitmap == null) {
            return C21771p.m100086a(new ParseError(lVar));
        }
        return C21771p.m100087c(bitmap, C21812m.m100215e(lVar));
    }

    /* renamed from: k1 */
    public C21771p<Bitmap> mo20305k1(C21762l lVar) {
        C21771p<Bitmap> N1;
        synchronized (f56468Q0) {
            try {
                N1 = mo65059N1(lVar);
            } catch (OutOfMemoryError e) {
                C21776s.m100099c("Caught OOM for %d byte image, url=%s", Integer.valueOf(lVar.f56298b.length), mo64788L0());
                return C21771p.m100086a(new ParseError((Throwable) e));
            } catch (Throwable th) {
                throw th;
            }
        }
        return N1;
    }

    /* renamed from: q */
    public void mo64811q() {
        super.mo64811q();
        synchronized (this.f56469H0) {
            this.f56470I0 = null;
        }
    }

    /* renamed from: u0 */
    public Request.Priority mo64816u0() {
        return Request.Priority.LOW;
    }

    @Deprecated
    public C21827r(String str, C21771p.C21773b<Bitmap> bVar, int i, int i2, Bitmap.Config config, C21771p.C21772a aVar) {
        this(str, bVar, i, i2, ImageView.ScaleType.CENTER_INSIDE, config, aVar);
    }
}
