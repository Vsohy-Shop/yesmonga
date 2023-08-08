package com.bumptech.glide;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import androidx.annotation.C0349j;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0374u0;
import androidx.annotation.C0375v;
import com.bumptech.glide.load.engine.C22234h;
import com.bumptech.glide.request.C22553a;
import com.bumptech.glide.request.C22554b;
import com.bumptech.glide.request.C22556d;
import com.bumptech.glide.request.C22557e;
import com.bumptech.glide.request.C22558f;
import com.bumptech.glide.request.C22560g;
import com.bumptech.glide.request.C22561h;
import com.bumptech.glide.request.RequestCoordinator;
import com.bumptech.glide.request.SingleRequest;
import com.bumptech.glide.request.target.C22580m;
import com.bumptech.glide.request.target.C22584p;
import com.bumptech.glide.request.target.C22586r;
import com.bumptech.glide.signature.C22609a;
import com.bumptech.glide.util.C22621f;
import com.bumptech.glide.util.C22633m;
import com.bumptech.glide.util.C22635o;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: com.bumptech.glide.i */
public class C22090i<TranscodeType> extends C22553a<C22090i<TranscodeType>> implements Cloneable, C22067g<C22090i<TranscodeType>> {

    /* renamed from: y1 */
    public static final C22561h f56724y1 = ((C22561h) ((C22561h) ((C22561h) new C22561h().mo66732A(C22234h.f57125c)).mo66767U0(Priority.LOW)).mo66782c1(true));

    /* renamed from: k1 */
    public final Context f56725k1;

    /* renamed from: l1 */
    public final C22092j f56726l1;

    /* renamed from: m1 */
    public final Class<TranscodeType> f56727m1;

    /* renamed from: n1 */
    public final C22038b f56728n1;

    /* renamed from: o1 */
    public final C22048d f56729o1;
    @C0359n0

    /* renamed from: p1 */
    public C22096k<?, ? super TranscodeType> f56730p1;
    @C0363p0

    /* renamed from: q1 */
    public Object f56731q1;
    @C0363p0

    /* renamed from: r1 */
    public List<C22560g<TranscodeType>> f56732r1;
    @C0363p0

    /* renamed from: s1 */
    public C22090i<TranscodeType> f56733s1;
    @C0363p0

    /* renamed from: t1 */
    public C22090i<TranscodeType> f56734t1;
    @C0363p0

    /* renamed from: u1 */
    public Float f56735u1;

    /* renamed from: v1 */
    public boolean f56736v1;

    /* renamed from: w1 */
    public boolean f56737w1;

    /* renamed from: x1 */
    public boolean f56738x1;

    /* renamed from: com.bumptech.glide.i$a */
    public static /* synthetic */ class C22091a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f56739a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f56740b;

        /* JADX WARNING: Can't wrap try/catch for region: R(27:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Can't wrap try/catch for region: R(29:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Can't wrap try/catch for region: R(30:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0058 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0062 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x006d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0083 */
        static {
            /*
                com.bumptech.glide.Priority[] r0 = com.bumptech.glide.Priority.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f56740b = r0
                r1 = 1
                com.bumptech.glide.Priority r2 = com.bumptech.glide.Priority.LOW     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f56740b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bumptech.glide.Priority r3 = com.bumptech.glide.Priority.NORMAL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f56740b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.bumptech.glide.Priority r4 = com.bumptech.glide.Priority.HIGH     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f56740b     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.bumptech.glide.Priority r5 = com.bumptech.glide.Priority.IMMEDIATE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                android.widget.ImageView$ScaleType[] r4 = android.widget.ImageView.ScaleType.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f56739a = r4
                android.widget.ImageView$ScaleType r5 = android.widget.ImageView.ScaleType.CENTER_CROP     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r1 = f56739a     // Catch:{ NoSuchFieldError -> 0x004e }
                android.widget.ImageView$ScaleType r4 = android.widget.ImageView.ScaleType.CENTER_INSIDE     // Catch:{ NoSuchFieldError -> 0x004e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r0 = f56739a     // Catch:{ NoSuchFieldError -> 0x0058 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_CENTER     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                int[] r0 = f56739a     // Catch:{ NoSuchFieldError -> 0x0062 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_START     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                int[] r0 = f56739a     // Catch:{ NoSuchFieldError -> 0x006d }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_END     // Catch:{ NoSuchFieldError -> 0x006d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006d }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006d }
            L_0x006d:
                int[] r0 = f56739a     // Catch:{ NoSuchFieldError -> 0x0078 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_XY     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f56739a     // Catch:{ NoSuchFieldError -> 0x0083 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER     // Catch:{ NoSuchFieldError -> 0x0083 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0083 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0083 }
            L_0x0083:
                int[] r0 = f56739a     // Catch:{ NoSuchFieldError -> 0x008f }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.MATRIX     // Catch:{ NoSuchFieldError -> 0x008f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008f }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x008f }
            L_0x008f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.C22090i.C22091a.<clinit>():void");
        }
    }

    @SuppressLint({"CheckResult"})
    public C22090i(@C0359n0 C22038b bVar, C22092j jVar, Class<TranscodeType> cls, Context context) {
        this.f56736v1 = true;
        this.f56728n1 = bVar;
        this.f56726l1 = jVar;
        this.f56727m1 = cls;
        this.f56725k1 = context;
        this.f56730p1 = jVar.mo65717G(cls);
        this.f56729o1 = bVar.mo65483k();
        mo65670E1(jVar.mo65715E());
        mo65688b(jVar.mo65716F());
    }

    @C0349j
    @C0359n0
    /* renamed from: B1 */
    public C22090i<TranscodeType> mo65667B1(Object obj) {
        if (obj == null) {
            return mo65710z1((C22090i) null);
        }
        return mo65710z1(mo65707w1().mo65603s(obj));
    }

    @C0349j
    @C0359n0
    /* renamed from: C1 */
    public C22090i<File> mo65668C1() {
        return new C22090i(File.class, this).mo65688b(f56724y1);
    }

    @C0359n0
    /* renamed from: D1 */
    public final Priority mo65669D1(@C0359n0 Priority priority) {
        int i = C22091a.f56740b[priority.ordinal()];
        if (i == 1) {
            return Priority.NORMAL;
        }
        if (i == 2) {
            return Priority.HIGH;
        }
        if (i == 3 || i == 4) {
            return Priority.IMMEDIATE;
        }
        throw new IllegalArgumentException("unknown priority: " + mo66781c0());
    }

    @SuppressLint({"CheckResult"})
    /* renamed from: E1 */
    public final void mo65670E1(List<C22560g<Object>> list) {
        for (C22560g<Object> q1 : list) {
            mo65701q1(q1);
        }
    }

    @Deprecated
    /* renamed from: F1 */
    public C22556d<TranscodeType> mo65671F1(int i, int i2) {
        return mo65694h2(i, i2);
    }

    @C0359n0
    /* renamed from: H1 */
    public <Y extends C22584p<TranscodeType>> Y mo65672H1(@C0359n0 Y y) {
        return mo65674J1(y, (C22560g) null, C22621f.m102598b());
    }

    /* renamed from: I1 */
    public final <Y extends C22584p<TranscodeType>> Y mo65673I1(@C0359n0 Y y, @C0363p0 C22560g<TranscodeType> gVar, C22553a<?> aVar, Executor executor) {
        C22633m.m102624d(y);
        if (this.f56737w1) {
            C22557e s1 = mo65703s1(y, gVar, aVar, executor);
            C22557e request = y.getRequest();
            if (!s1.mo66713h(request) || mo65676N1(aVar, request)) {
                this.f56726l1.mo65712B(y);
                y.mo65593n(s1);
                this.f56726l1.mo65737a0(y, s1);
                return y;
            }
            if (!((C22557e) C22633m.m102624d(request)).isRunning()) {
                request.mo66714i();
            }
            return y;
        }
        throw new IllegalArgumentException("You must call #load() before calling #into()");
    }

    @C0359n0
    /* renamed from: J1 */
    public <Y extends C22584p<TranscodeType>> Y mo65674J1(@C0359n0 Y y, @C0363p0 C22560g<TranscodeType> gVar, Executor executor) {
        return mo65673I1(y, gVar, this, executor);
    }

    @C0359n0
    /* renamed from: K1 */
    public C22586r<ImageView, TranscodeType> mo65675K1(@C0359n0 ImageView imageView) {
        C22553a aVar;
        C22635o.m102627b();
        C22633m.m102624d(imageView);
        if (!mo66734B0() && mo66816y0() && imageView.getScaleType() != null) {
            switch (C22091a.f56739a[imageView.getScaleType().ordinal()]) {
                case 1:
                    aVar = clone().mo66743G0();
                    break;
                case 2:
                    aVar = clone().mo66745H0();
                    break;
                case 3:
                case 4:
                case 5:
                    aVar = clone().mo66749J0();
                    break;
                case 6:
                    aVar = clone().mo66745H0();
                    break;
            }
        }
        aVar = this;
        return (C22586r) mo65673I1(this.f56729o1.mo65517a(imageView, this.f56727m1), (C22560g) null, aVar, C22621f.m102598b());
    }

    /* renamed from: N1 */
    public final boolean mo65676N1(C22553a<?> aVar, C22557e eVar) {
        return !aVar.mo66809r0() && eVar.mo66706b();
    }

    @C0349j
    @C0359n0
    /* renamed from: O1 */
    public C22090i<TranscodeType> mo65677O1(@C0363p0 C22560g<TranscodeType> gVar) {
        if (mo66801m0()) {
            return mo65699o().mo65677O1(gVar);
        }
        this.f56732r1 = null;
        return mo65701q1(gVar);
    }

    @C0349j
    @C0359n0
    /* renamed from: P1 */
    public C22090i<TranscodeType> mo65602m(@C0363p0 Bitmap bitmap) {
        return mo65687a2(bitmap).mo65688b(C22561h.m102395v1(C22234h.f57124b));
    }

    @C0349j
    @C0359n0
    /* renamed from: Q1 */
    public C22090i<TranscodeType> mo65601j(@C0363p0 Drawable drawable) {
        return mo65687a2(drawable).mo65688b(C22561h.m102395v1(C22234h.f57124b));
    }

    @C0349j
    @C0359n0
    /* renamed from: R1 */
    public C22090i<TranscodeType> mo65598f(@C0363p0 Uri uri) {
        return mo65687a2(uri);
    }

    @C0349j
    @C0359n0
    /* renamed from: S1 */
    public C22090i<TranscodeType> mo65600i(@C0363p0 File file) {
        return mo65687a2(file);
    }

    @C0349j
    @C0359n0
    /* renamed from: T1 */
    public C22090i<TranscodeType> mo65604t(@C0363p0 @C0375v @C0374u0 Integer num) {
        return mo65687a2(num).mo65688b(C22561h.m102386Q1(C22609a.m102563c(this.f56725k1)));
    }

    @C0349j
    @C0359n0
    /* renamed from: U1 */
    public C22090i<TranscodeType> mo65603s(@C0363p0 Object obj) {
        return mo65687a2(obj);
    }

    @C0349j
    @C0359n0
    /* renamed from: V1 */
    public C22090i<TranscodeType> mo65605u(@C0363p0 String str) {
        return mo65687a2(str);
    }

    @C0349j
    @Deprecated
    /* renamed from: W1 */
    public C22090i<TranscodeType> mo65597e(@C0363p0 URL url) {
        return mo65687a2(url);
    }

    @C0349j
    @C0359n0
    /* renamed from: Z1 */
    public C22090i<TranscodeType> mo65599h(@C0363p0 byte[] bArr) {
        C22090i<TranscodeType> a2 = mo65687a2(bArr);
        if (!a2.mo66805o0()) {
            a2 = a2.mo65688b(C22561h.m102395v1(C22234h.f57124b));
        }
        if (!a2.mo66815x0()) {
            return a2.mo65688b(C22561h.m102388S1(true));
        }
        return a2;
    }

    @C0359n0
    /* renamed from: a2 */
    public final C22090i<TranscodeType> mo65687a2(@C0363p0 Object obj) {
        if (mo66801m0()) {
            return mo65699o().mo65687a2(obj);
        }
        this.f56731q1 = obj;
        this.f56737w1 = true;
        return (C22090i) mo66773Y0();
    }

    /* renamed from: b2 */
    public final C22557e mo65689b2(Object obj, C22584p<TranscodeType> pVar, C22560g<TranscodeType> gVar, C22553a<?> aVar, RequestCoordinator requestCoordinator, C22096k<?, ? super TranscodeType> kVar, Priority priority, int i, int i2, Executor executor) {
        Context context = this.f56725k1;
        C22048d dVar = this.f56729o1;
        return SingleRequest.m102218y(context, dVar, obj, this.f56731q1, this.f56727m1, aVar, i, i2, priority, pVar, gVar, this.f56732r1, requestCoordinator, dVar.mo65522f(), kVar.mo65758e(), executor);
    }

    @C0359n0
    /* renamed from: d2 */
    public C22584p<TranscodeType> mo65691d2() {
        return mo65692f2(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @C0359n0
    /* renamed from: f2 */
    public C22584p<TranscodeType> mo65692f2(int i, int i2) {
        return mo65672H1(C22580m.m102495f(this.f56726l1, i, i2));
    }

    @C0359n0
    /* renamed from: g2 */
    public C22556d<TranscodeType> mo65693g2() {
        return mo65694h2(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @C0359n0
    /* renamed from: h2 */
    public C22556d<TranscodeType> mo65694h2(int i, int i2) {
        C22558f fVar = new C22558f(i, i2);
        return (C22556d) mo65674J1(fVar, fVar, C22621f.m102597a());
    }

    @C0349j
    @C0359n0
    @Deprecated
    /* renamed from: i2 */
    public C22090i<TranscodeType> mo65695i2(float f) {
        if (mo66801m0()) {
            return mo65699o().mo65695i2(f);
        }
        if (f < 0.0f || f > 1.0f) {
            throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
        }
        this.f56735u1 = Float.valueOf(f);
        return (C22090i) mo66773Y0();
    }

    @C0349j
    @C0359n0
    /* renamed from: j2 */
    public C22090i<TranscodeType> mo65696j2(@C0363p0 C22090i<TranscodeType> iVar) {
        if (mo66801m0()) {
            return mo65699o().mo65696j2(iVar);
        }
        this.f56733s1 = iVar;
        return (C22090i) mo66773Y0();
    }

    @C0349j
    @C0359n0
    /* renamed from: k2 */
    public C22090i<TranscodeType> mo65697k2(@C0363p0 List<C22090i<TranscodeType>> list) {
        C22090i iVar = null;
        if (list == null || list.isEmpty()) {
            return mo65696j2((C22090i) null);
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            C22090i iVar2 = list.get(size);
            if (iVar2 != null) {
                if (iVar == null) {
                    iVar = iVar2;
                } else {
                    iVar = iVar2.mo65696j2(iVar);
                }
            }
        }
        return mo65696j2(iVar);
    }

    @C0349j
    @C0359n0
    /* renamed from: n2 */
    public C22090i<TranscodeType> mo65698n2(@C0363p0 C22090i<TranscodeType>... iVarArr) {
        if (iVarArr == null || iVarArr.length == 0) {
            return mo65696j2((C22090i) null);
        }
        return mo65697k2(Arrays.asList(iVarArr));
    }

    @C0349j
    @C0359n0
    /* renamed from: o2 */
    public C22090i<TranscodeType> mo65700o2(@C0359n0 C22096k<?, ? super TranscodeType> kVar) {
        if (mo66801m0()) {
            return mo65699o().mo65700o2(kVar);
        }
        this.f56730p1 = (C22096k) C22633m.m102624d(kVar);
        this.f56736v1 = false;
        return (C22090i) mo66773Y0();
    }

    @C0349j
    @C0359n0
    /* renamed from: q1 */
    public C22090i<TranscodeType> mo65701q1(@C0363p0 C22560g<TranscodeType> gVar) {
        if (mo66801m0()) {
            return mo65699o().mo65701q1(gVar);
        }
        if (gVar != null) {
            if (this.f56732r1 == null) {
                this.f56732r1 = new ArrayList();
            }
            this.f56732r1.add(gVar);
        }
        return (C22090i) mo66773Y0();
    }

    @C0349j
    @C0359n0
    /* renamed from: r1 */
    public C22090i<TranscodeType> mo65688b(@C0359n0 C22553a<?> aVar) {
        C22633m.m102624d(aVar);
        return (C22090i) super.mo65688b(aVar);
    }

    /* renamed from: s1 */
    public final C22557e mo65703s1(C22584p<TranscodeType> pVar, @C0363p0 C22560g<TranscodeType> gVar, C22553a<?> aVar, Executor executor) {
        return mo65704t1(new Object(), pVar, gVar, (RequestCoordinator) null, this.f56730p1, aVar.mo66781c0(), aVar.mo66774Z(), aVar.mo66772Y(), aVar, executor);
    }

    /* renamed from: t1 */
    public final C22557e mo65704t1(Object obj, C22584p<TranscodeType> pVar, @C0363p0 C22560g<TranscodeType> gVar, @C0363p0 RequestCoordinator requestCoordinator, C22096k<?, ? super TranscodeType> kVar, Priority priority, int i, int i2, C22553a<?> aVar, Executor executor) {
        C22554b bVar;
        C22554b bVar2;
        if (this.f56734t1 != null) {
            bVar2 = new C22554b(obj, requestCoordinator);
            bVar = bVar2;
        } else {
            Object obj2 = obj;
            bVar = null;
            bVar2 = requestCoordinator;
        }
        C22557e u1 = mo65705u1(obj, pVar, gVar, bVar2, kVar, priority, i, i2, aVar, executor);
        if (bVar == null) {
            return u1;
        }
        int Z = this.f56734t1.mo66774Z();
        int Y = this.f56734t1.mo66772Y();
        if (C22635o.m102648w(i, i2) && !this.f56734t1.mo66737D0()) {
            Z = aVar.mo66774Z();
            Y = aVar.mo66772Y();
        }
        C22090i<TranscodeType> iVar = this.f56734t1;
        C22554b bVar3 = bVar;
        bVar3.mo66822o(u1, iVar.mo65704t1(obj, pVar, gVar, bVar3, iVar.f56730p1, iVar.mo66781c0(), Z, Y, this.f56734t1, executor));
        return bVar3;
    }

    /* JADX WARNING: type inference failed for: r27v0, types: [com.bumptech.glide.request.a, com.bumptech.glide.request.a<?>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: u1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.bumptech.glide.request.C22557e mo65705u1(java.lang.Object r19, com.bumptech.glide.request.target.C22584p<TranscodeType> r20, com.bumptech.glide.request.C22560g<TranscodeType> r21, @androidx.annotation.C0363p0 com.bumptech.glide.request.RequestCoordinator r22, com.bumptech.glide.C22096k<?, ? super TranscodeType> r23, com.bumptech.glide.Priority r24, int r25, int r26, com.bumptech.glide.request.C22553a<?> r27, java.util.concurrent.Executor r28) {
        /*
            r18 = this;
            r11 = r18
            r12 = r19
            r5 = r22
            r13 = r24
            com.bumptech.glide.i<TranscodeType> r0 = r11.f56733s1
            if (r0 == 0) goto L_0x0094
            boolean r1 = r11.f56738x1
            if (r1 != 0) goto L_0x008c
            com.bumptech.glide.k<?, ? super TranscodeType> r1 = r0.f56730p1
            boolean r2 = r0.f56736v1
            if (r2 == 0) goto L_0x0019
            r14 = r23
            goto L_0x001a
        L_0x0019:
            r14 = r1
        L_0x001a:
            boolean r0 = r0.mo66810s0()
            if (r0 == 0) goto L_0x0027
            com.bumptech.glide.i<TranscodeType> r0 = r11.f56733s1
            com.bumptech.glide.Priority r0 = r0.mo66781c0()
            goto L_0x002b
        L_0x0027:
            com.bumptech.glide.Priority r0 = r11.mo65669D1(r13)
        L_0x002b:
            r15 = r0
            com.bumptech.glide.i<TranscodeType> r0 = r11.f56733s1
            int r0 = r0.mo66774Z()
            com.bumptech.glide.i<TranscodeType> r1 = r11.f56733s1
            int r1 = r1.mo66772Y()
            boolean r2 = com.bumptech.glide.util.C22635o.m102648w(r25, r26)
            if (r2 == 0) goto L_0x004e
            com.bumptech.glide.i<TranscodeType> r2 = r11.f56733s1
            boolean r2 = r2.mo66737D0()
            if (r2 != 0) goto L_0x004e
            int r0 = r27.mo66774Z()
            int r1 = r27.mo66772Y()
        L_0x004e:
            r16 = r0
            r17 = r1
            com.bumptech.glide.request.j r10 = new com.bumptech.glide.request.j
            r10.<init>(r12, r5)
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r27
            r5 = r10
            r6 = r23
            r7 = r24
            r8 = r25
            r9 = r26
            r13 = r10
            r10 = r28
            com.bumptech.glide.request.e r10 = r0.mo65689b2(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r0 = 1
            r11.f56738x1 = r0
            com.bumptech.glide.i<TranscodeType> r9 = r11.f56733s1
            r0 = r9
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            r12 = r10
            r10 = r28
            com.bumptech.glide.request.e r0 = r0.mo65704t1(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r1 = 0
            r11.f56738x1 = r1
            r13.mo66839n(r12, r0)
            return r13
        L_0x008c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()"
            r0.<init>(r1)
            throw r0
        L_0x0094:
            java.lang.Float r0 = r11.f56735u1
            if (r0 == 0) goto L_0x00d4
            com.bumptech.glide.request.j r14 = new com.bumptech.glide.request.j
            r14.<init>(r12, r5)
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r27
            r5 = r14
            r6 = r23
            r7 = r24
            r8 = r25
            r9 = r26
            r10 = r28
            com.bumptech.glide.request.e r15 = r0.mo65689b2(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            com.bumptech.glide.request.a r0 = r27.clone()
            java.lang.Float r1 = r11.f56735u1
            float r1 = r1.floatValue()
            com.bumptech.glide.request.a r4 = r0.mo66779b1(r1)
            com.bumptech.glide.Priority r7 = r11.mo65669D1(r13)
            r0 = r18
            r1 = r19
            com.bumptech.glide.request.e r0 = r0.mo65689b2(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r14.mo66839n(r15, r0)
            return r14
        L_0x00d4:
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r27
            r5 = r22
            r6 = r23
            r7 = r24
            r8 = r25
            r9 = r26
            r10 = r28
            com.bumptech.glide.request.e r0 = r0.mo65689b2(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.C22090i.mo65705u1(java.lang.Object, com.bumptech.glide.request.target.p, com.bumptech.glide.request.g, com.bumptech.glide.request.RequestCoordinator, com.bumptech.glide.k, com.bumptech.glide.Priority, int, int, com.bumptech.glide.request.a, java.util.concurrent.Executor):com.bumptech.glide.request.e");
    }

    @C0349j
    /* renamed from: v1 */
    public C22090i<TranscodeType> mo65699o() {
        C22090i<TranscodeType> iVar = (C22090i) super.clone();
        iVar.f56730p1 = iVar.f56730p1.clone();
        if (iVar.f56732r1 != null) {
            iVar.f56732r1 = new ArrayList(iVar.f56732r1);
        }
        C22090i<TranscodeType> iVar2 = iVar.f56733s1;
        if (iVar2 != null) {
            iVar.f56733s1 = iVar2.mo65699o();
        }
        C22090i<TranscodeType> iVar3 = iVar.f56734t1;
        if (iVar3 != null) {
            iVar.f56734t1 = iVar3.mo65699o();
        }
        return iVar;
    }

    /* renamed from: w1 */
    public final C22090i<TranscodeType> mo65707w1() {
        return mo65699o().mo65710z1((C22090i) null).mo65696j2((C22090i) null);
    }

    @C0349j
    @Deprecated
    /* renamed from: x1 */
    public C22556d<File> mo65708x1(int i, int i2) {
        return mo65668C1().mo65694h2(i, i2);
    }

    @C0349j
    @Deprecated
    /* renamed from: y1 */
    public <Y extends C22584p<File>> Y mo65709y1(@C0359n0 Y y) {
        return mo65668C1().mo65672H1(y);
    }

    @C0359n0
    /* renamed from: z1 */
    public C22090i<TranscodeType> mo65710z1(@C0363p0 C22090i<TranscodeType> iVar) {
        if (mo66801m0()) {
            return mo65699o().mo65710z1(iVar);
        }
        this.f56734t1 = iVar;
        return (C22090i) mo66773Y0();
    }

    @SuppressLint({"CheckResult"})
    public C22090i(Class<TranscodeType> cls, C22090i<?> iVar) {
        this(iVar.f56728n1, iVar.f56726l1, cls, iVar.f56725k1);
        this.f56731q1 = iVar.f56731q1;
        this.f56737w1 = iVar.f56737w1;
        mo65688b(iVar);
    }
}
