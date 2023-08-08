package androidx.camera.camera2.internal;

import android.content.Context;
import android.graphics.Point;
import android.util.Size;
import android.view.WindowManager;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.camera.camera2.internal.compat.workaround.C1161f;
import androidx.camera.core.impl.C1441c1;
import androidx.camera.core.impl.C1488o1;
import androidx.camera.core.impl.C1491p0;
import androidx.camera.core.impl.C1583y;
import androidx.camera.core.impl.C1586y0;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;

/* renamed from: androidx.camera.camera2.internal.x0 */
public final class C1267x0 implements UseCaseConfigFactory {

    /* renamed from: b */
    public static final Size f3632b = new Size(1920, 1080);

    /* renamed from: a */
    public final WindowManager f3633a;

    /* renamed from: androidx.camera.camera2.internal.x0$a */
    public static /* synthetic */ class C1268a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f3634a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                androidx.camera.core.impl.UseCaseConfigFactory$CaptureType[] r0 = androidx.camera.core.impl.UseCaseConfigFactory.CaptureType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f3634a = r0
                androidx.camera.core.impl.UseCaseConfigFactory$CaptureType r1 = androidx.camera.core.impl.UseCaseConfigFactory.CaptureType.IMAGE_CAPTURE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f3634a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.camera.core.impl.UseCaseConfigFactory$CaptureType r1 = androidx.camera.core.impl.UseCaseConfigFactory.CaptureType.PREVIEW     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f3634a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.camera.core.impl.UseCaseConfigFactory$CaptureType r1 = androidx.camera.core.impl.UseCaseConfigFactory.CaptureType.IMAGE_ANALYSIS     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f3634a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.camera.core.impl.UseCaseConfigFactory$CaptureType r1 = androidx.camera.core.impl.UseCaseConfigFactory.CaptureType.VIDEO_CAPTURE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.internal.C1267x0.C1268a.<clinit>():void");
        }
    }

    public C1267x0(@C0359n0 Context context) {
        this.f3633a = (WindowManager) context.getSystemService("window");
    }

    @C0363p0
    /* renamed from: a */
    public Config mo4721a(@C0359n0 UseCaseConfigFactory.CaptureType captureType) {
        Object obj;
        C1586y0 d0 = C1586y0.m6573d0();
        SessionConfig.C1424b bVar = new SessionConfig.C1424b();
        bVar.mo5171t(1);
        UseCaseConfigFactory.CaptureType captureType2 = UseCaseConfigFactory.CaptureType.PREVIEW;
        if (captureType == captureType2) {
            C1161f.m4879a(bVar);
        }
        d0.mo5545t(C1488o1.f4250k, bVar.mo5166n());
        d0.mo5545t(C1488o1.f4252m, C1263w0.f3619a);
        C1583y.C1584a aVar = new C1583y.C1584a();
        int i = C1268a.f3634a[captureType.ordinal()];
        if (i == 1) {
            aVar.mo5569s(2);
        } else if (i == 2 || i == 3 || i == 4) {
            aVar.mo5569s(1);
        }
        d0.mo5545t(C1488o1.f4251l, aVar.mo5560h());
        Config.C1421a<C1583y.C1585b> aVar2 = C1488o1.f4253n;
        if (captureType == UseCaseConfigFactory.CaptureType.IMAGE_CAPTURE) {
            obj = C1045c2.f3221c;
        } else {
            obj = C1242s0.f3559a;
        }
        d0.mo5545t(aVar2, obj);
        if (captureType == captureType2) {
            d0.mo5545t(C1491p0.f4263i, mo4722b());
        }
        d0.mo5545t(C1491p0.f4260f, Integer.valueOf(this.f3633a.getDefaultDisplay().getRotation()));
        return C1441c1.m6059b0(d0);
    }

    /* renamed from: b */
    public final Size mo4722b() {
        Size size;
        Point point = new Point();
        this.f3633a.getDefaultDisplay().getRealSize(point);
        if (point.x > point.y) {
            size = new Size(point.x, point.y);
        } else {
            size = new Size(point.y, point.x);
        }
        int width = size.getWidth() * size.getHeight();
        Size size2 = f3632b;
        if (width > size2.getWidth() * size2.getHeight()) {
            return size2;
        }
        return size;
    }
}
