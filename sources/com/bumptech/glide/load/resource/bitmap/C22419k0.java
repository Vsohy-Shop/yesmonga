package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import android.util.Log;
import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import com.bumptech.glide.load.engine.bitmap_recycle.C22162e;
import com.bumptech.glide.util.C22633m;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.bumptech.glide.load.resource.bitmap.k0 */
public final class C22419k0 {

    /* renamed from: a */
    public static final String f57544a = "TransformationUtils";

    /* renamed from: b */
    public static final int f57545b = 6;

    /* renamed from: c */
    public static final Paint f57546c = new Paint(6);

    /* renamed from: d */
    public static final int f57547d = 7;

    /* renamed from: e */
    public static final Paint f57548e = new Paint(7);

    /* renamed from: f */
    public static final Paint f57549f;

    /* renamed from: g */
    public static final Set<String> f57550g;

    /* renamed from: h */
    public static final Lock f57551h;

    /* renamed from: com.bumptech.glide.load.resource.bitmap.k0$a */
    public class C22420a implements C22422c {

        /* renamed from: a */
        public final /* synthetic */ int f57552a;

        public C22420a(int i) {
            this.f57552a = i;
        }

        /* renamed from: a */
        public void mo66439a(Canvas canvas, Paint paint, RectF rectF) {
            int i = this.f57552a;
            canvas.drawRoundRect(rectF, (float) i, (float) i, paint);
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.k0$b */
    public class C22421b implements C22422c {

        /* renamed from: a */
        public final /* synthetic */ float f57553a;

        /* renamed from: b */
        public final /* synthetic */ float f57554b;

        /* renamed from: c */
        public final /* synthetic */ float f57555c;

        /* renamed from: d */
        public final /* synthetic */ float f57556d;

        public C22421b(float f, float f2, float f3, float f4) {
            this.f57553a = f;
            this.f57554b = f2;
            this.f57555c = f3;
            this.f57556d = f4;
        }

        /* renamed from: a */
        public void mo66439a(Canvas canvas, Paint paint, RectF rectF) {
            Path path = new Path();
            float f = this.f57553a;
            float f2 = this.f57554b;
            float f3 = this.f57555c;
            float f4 = this.f57556d;
            path.addRoundRect(rectF, new float[]{f, f, f2, f2, f3, f3, f4, f4}, Path.Direction.CW);
            canvas.drawPath(path, paint);
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.k0$c */
    public interface C22422c {
        /* renamed from: a */
        void mo66439a(Canvas canvas, Paint paint, RectF rectF);
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.k0$d */
    public static final class C22423d implements Lock {
        public void lock() {
        }

        public void lockInterruptibly() throws InterruptedException {
        }

        @C0359n0
        public Condition newCondition() {
            throw new UnsupportedOperationException("Should not be called");
        }

        public boolean tryLock() {
            return true;
        }

        public void unlock() {
        }

        public boolean tryLock(long j, @C0359n0 TimeUnit timeUnit) throws InterruptedException {
            return true;
        }
    }

    static {
        Lock lock;
        HashSet hashSet = new HashSet(Arrays.asList(new String[]{"XT1085", "XT1092", "XT1093", "XT1094", "XT1095", "XT1096", "XT1097", "XT1098", "XT1031", "XT1028", "XT937C", "XT1032", "XT1008", "XT1033", "XT1035", "XT1034", "XT939G", "XT1039", "XT1040", "XT1042", "XT1045", "XT1063", "XT1064", "XT1068", "XT1069", "XT1072", "XT1077", "XT1078", "XT1079"}));
        f57550g = hashSet;
        if (hashSet.contains(Build.MODEL)) {
            lock = new ReentrantLock();
        } else {
            lock = new C22423d();
        }
        f57551h = lock;
        Paint paint = new Paint(7);
        f57549f = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    /* renamed from: a */
    public static void m101794a(@C0359n0 Bitmap bitmap, @C0359n0 Bitmap bitmap2, Matrix matrix) {
        Lock lock = f57551h;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmap2);
            canvas.drawBitmap(bitmap, matrix, f57546c);
            m101798e(canvas);
            lock.unlock();
        } catch (Throwable th) {
            f57551h.unlock();
            throw th;
        }
    }

    /* renamed from: b */
    public static Bitmap m101795b(@C0359n0 C22162e eVar, @C0359n0 Bitmap bitmap, int i, int i2) {
        float f;
        float f2;
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float f3 = 0.0f;
        if (bitmap.getWidth() * i2 > bitmap.getHeight() * i) {
            f2 = ((float) i2) / ((float) bitmap.getHeight());
            f3 = (((float) i) - (((float) bitmap.getWidth()) * f2)) * 0.5f;
            f = 0.0f;
        } else {
            f2 = ((float) i) / ((float) bitmap.getWidth());
            f = (((float) i2) - (((float) bitmap.getHeight()) * f2)) * 0.5f;
        }
        matrix.setScale(f2, f2);
        matrix.postTranslate((float) ((int) (f3 + 0.5f)), (float) ((int) (f + 0.5f)));
        Bitmap f4 = eVar.mo65958f(i, i2, m101804k(bitmap));
        m101813t(bitmap, f4);
        m101794a(bitmap, f4, matrix);
        return f4;
    }

    /* renamed from: c */
    public static Bitmap m101796c(@C0359n0 C22162e eVar, @C0359n0 Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() > i || bitmap.getHeight() > i2) {
            return m101799f(eVar, bitmap, i, i2);
        }
        return bitmap;
    }

    /* renamed from: d */
    public static Bitmap m101797d(@C0359n0 C22162e eVar, @C0359n0 Bitmap bitmap, int i, int i2) {
        int min = Math.min(i, i2);
        float f = (float) min;
        float f2 = f / 2.0f;
        float width = (float) bitmap.getWidth();
        float height = (float) bitmap.getHeight();
        float max = Math.max(f / width, f / height);
        float f3 = width * max;
        float f4 = max * height;
        float f5 = (f - f3) / 2.0f;
        float f6 = (f - f4) / 2.0f;
        RectF rectF = new RectF(f5, f6, f3 + f5, f4 + f6);
        Bitmap g = m101800g(eVar, bitmap);
        Bitmap f7 = eVar.mo65958f(min, min, m101801h(bitmap));
        f7.setHasAlpha(true);
        Lock lock = f57551h;
        lock.lock();
        try {
            Canvas canvas = new Canvas(f7);
            canvas.drawCircle(f2, f2, f2, f57548e);
            canvas.drawBitmap(g, (Rect) null, rectF, f57549f);
            m101798e(canvas);
            lock.unlock();
            if (!g.equals(bitmap)) {
                eVar.mo65956d(g);
            }
            return f7;
        } catch (Throwable th) {
            f57551h.unlock();
            throw th;
        }
    }

    /* renamed from: e */
    public static void m101798e(Canvas canvas) {
        canvas.setBitmap((Bitmap) null);
    }

    /* renamed from: f */
    public static Bitmap m101799f(@C0359n0 C22162e eVar, @C0359n0 Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        float min = Math.min(((float) i) / ((float) bitmap.getWidth()), ((float) i2) / ((float) bitmap.getHeight()));
        int round = Math.round(((float) bitmap.getWidth()) * min);
        int round2 = Math.round(((float) bitmap.getHeight()) * min);
        if (bitmap.getWidth() == round && bitmap.getHeight() == round2) {
            return bitmap;
        }
        Bitmap f = eVar.mo65958f((int) (((float) bitmap.getWidth()) * min), (int) (((float) bitmap.getHeight()) * min), m101804k(bitmap));
        m101813t(bitmap, f);
        if (Log.isLoggable(f57544a, 2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("request: ");
            sb.append(i);
            sb.append("x");
            sb.append(i2);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("toFit:   ");
            sb2.append(bitmap.getWidth());
            sb2.append("x");
            sb2.append(bitmap.getHeight());
            StringBuilder sb3 = new StringBuilder();
            sb3.append("toReuse: ");
            sb3.append(f.getWidth());
            sb3.append("x");
            sb3.append(f.getHeight());
            StringBuilder sb4 = new StringBuilder();
            sb4.append("minPct:   ");
            sb4.append(min);
        }
        Matrix matrix = new Matrix();
        matrix.setScale(min, min);
        m101794a(bitmap, f, matrix);
        return f;
    }

    /* renamed from: g */
    public static Bitmap m101800g(@C0359n0 C22162e eVar, @C0359n0 Bitmap bitmap) {
        Bitmap.Config h = m101801h(bitmap);
        if (h.equals(bitmap.getConfig())) {
            return bitmap;
        }
        Bitmap f = eVar.mo65958f(bitmap.getWidth(), bitmap.getHeight(), h);
        new Canvas(f).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        return f;
    }

    @C0359n0
    /* renamed from: h */
    public static Bitmap.Config m101801h(@C0359n0 Bitmap bitmap) {
        if (Build.VERSION.SDK_INT < 26 || !Bitmap.Config.RGBA_F16.equals(bitmap.getConfig())) {
            return Bitmap.Config.ARGB_8888;
        }
        return Bitmap.Config.RGBA_F16;
    }

    /* renamed from: i */
    public static Lock m101802i() {
        return f57551h;
    }

    /* renamed from: j */
    public static int m101803j(int i) {
        switch (i) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 6:
                return 90;
            case 7:
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    @C0359n0
    /* renamed from: k */
    public static Bitmap.Config m101804k(@C0359n0 Bitmap bitmap) {
        return bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888;
    }

    @C0344h1
    /* renamed from: l */
    public static void m101805l(int i, Matrix matrix) {
        switch (i) {
            case 2:
                matrix.setScale(-1.0f, 1.0f);
                return;
            case 3:
                matrix.setRotate(180.0f);
                return;
            case 4:
                matrix.setRotate(180.0f);
                matrix.postScale(-1.0f, 1.0f);
                return;
            case 5:
                matrix.setRotate(90.0f);
                matrix.postScale(-1.0f, 1.0f);
                return;
            case 6:
                matrix.setRotate(90.0f);
                return;
            case 7:
                matrix.setRotate(-90.0f);
                matrix.postScale(-1.0f, 1.0f);
                return;
            case 8:
                matrix.setRotate(-90.0f);
                return;
            default:
                return;
        }
    }

    /* renamed from: m */
    public static boolean m101806m(int i) {
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            default:
                return false;
        }
    }

    /* renamed from: n */
    public static Bitmap m101807n(@C0359n0 Bitmap bitmap, int i) {
        if (i == 0) {
            return bitmap;
        }
        try {
            Matrix matrix = new Matrix();
            matrix.setRotate((float) i);
            return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        } catch (Exception unused) {
            return bitmap;
        }
    }

    /* renamed from: o */
    public static Bitmap m101808o(@C0359n0 C22162e eVar, @C0359n0 Bitmap bitmap, int i) {
        if (!m101806m(i)) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        m101805l(i, matrix);
        RectF rectF = new RectF(0.0f, 0.0f, (float) bitmap.getWidth(), (float) bitmap.getHeight());
        matrix.mapRect(rectF);
        Bitmap f = eVar.mo65958f(Math.round(rectF.width()), Math.round(rectF.height()), m101804k(bitmap));
        matrix.postTranslate(-rectF.left, -rectF.top);
        f.setHasAlpha(bitmap.hasAlpha());
        m101794a(bitmap, f, matrix);
        return f;
    }

    /* renamed from: p */
    public static Bitmap m101809p(@C0359n0 C22162e eVar, @C0359n0 Bitmap bitmap, float f, float f2, float f3, float f4) {
        return m101812s(eVar, bitmap, new C22421b(f, f2, f3, f4));
    }

    /* renamed from: q */
    public static Bitmap m101810q(@C0359n0 C22162e eVar, @C0359n0 Bitmap bitmap, int i) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        C22633m.m102621a(z, "roundingRadius must be greater than 0.");
        return m101812s(eVar, bitmap, new C22420a(i));
    }

    @Deprecated
    /* renamed from: r */
    public static Bitmap m101811r(@C0359n0 C22162e eVar, @C0359n0 Bitmap bitmap, int i, int i2, int i3) {
        return m101810q(eVar, bitmap, i3);
    }

    /* renamed from: s */
    public static Bitmap m101812s(@C0359n0 C22162e eVar, @C0359n0 Bitmap bitmap, C22422c cVar) {
        Bitmap.Config h = m101801h(bitmap);
        Bitmap g = m101800g(eVar, bitmap);
        Bitmap f = eVar.mo65958f(g.getWidth(), g.getHeight(), h);
        f.setHasAlpha(true);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(g, tileMode, tileMode);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setShader(bitmapShader);
        RectF rectF = new RectF(0.0f, 0.0f, (float) f.getWidth(), (float) f.getHeight());
        Lock lock = f57551h;
        lock.lock();
        try {
            Canvas canvas = new Canvas(f);
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
            cVar.mo66439a(canvas, paint, rectF);
            m101798e(canvas);
            lock.unlock();
            if (!g.equals(bitmap)) {
                eVar.mo65956d(g);
            }
            return f;
        } catch (Throwable th) {
            f57551h.unlock();
            throw th;
        }
    }

    /* renamed from: t */
    public static void m101813t(Bitmap bitmap, Bitmap bitmap2) {
        bitmap2.setHasAlpha(bitmap.hasAlpha());
    }
}
