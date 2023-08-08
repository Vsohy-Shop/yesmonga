package com.airbnb.lottie.model.content;

import android.graphics.Paint;
import androidx.annotation.C0363p0;
import com.airbnb.lottie.C21516j;
import com.airbnb.lottie.animation.content.C21445c;
import com.airbnb.lottie.animation.content.C21463s;
import com.airbnb.lottie.model.animatable.C21543a;
import com.airbnb.lottie.model.animatable.C21544b;
import com.airbnb.lottie.model.animatable.C21546d;
import com.airbnb.lottie.model.layer.C21578a;
import java.util.List;

public class ShapeStroke implements C21562b {

    /* renamed from: a */
    public final String f55656a;
    @C0363p0

    /* renamed from: b */
    public final C21544b f55657b;

    /* renamed from: c */
    public final List<C21544b> f55658c;

    /* renamed from: d */
    public final C21543a f55659d;

    /* renamed from: e */
    public final C21546d f55660e;

    /* renamed from: f */
    public final C21544b f55661f;

    /* renamed from: g */
    public final LineCapType f55662g;

    /* renamed from: h */
    public final LineJoinType f55663h;

    /* renamed from: i */
    public final float f55664i;

    /* renamed from: j */
    public final boolean f55665j;

    public enum LineCapType {
        BUTT,
        ROUND,
        UNKNOWN;

        /* renamed from: g */
        public Paint.Cap mo64355g() {
            int i = C21560a.f55674a[ordinal()];
            if (i == 1) {
                return Paint.Cap.BUTT;
            }
            if (i != 2) {
                return Paint.Cap.SQUARE;
            }
            return Paint.Cap.ROUND;
        }
    }

    public enum LineJoinType {
        MITER,
        ROUND,
        BEVEL;

        /* renamed from: g */
        public Paint.Join mo64356g() {
            int i = C21560a.f55675b[ordinal()];
            if (i == 1) {
                return Paint.Join.BEVEL;
            }
            if (i == 2) {
                return Paint.Join.MITER;
            }
            if (i != 3) {
                return null;
            }
            return Paint.Join.ROUND;
        }
    }

    /* renamed from: com.airbnb.lottie.model.content.ShapeStroke$a */
    public static /* synthetic */ class C21560a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f55674a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f55675b;

        /* JADX WARNING: Can't wrap try/catch for region: R(15:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|20) */
        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|18|20) */
        /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        static {
            /*
                com.airbnb.lottie.model.content.ShapeStroke$LineJoinType[] r0 = com.airbnb.lottie.model.content.ShapeStroke.LineJoinType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f55675b = r0
                r1 = 1
                com.airbnb.lottie.model.content.ShapeStroke$LineJoinType r2 = com.airbnb.lottie.model.content.ShapeStroke.LineJoinType.BEVEL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f55675b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.airbnb.lottie.model.content.ShapeStroke$LineJoinType r3 = com.airbnb.lottie.model.content.ShapeStroke.LineJoinType.MITER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f55675b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.airbnb.lottie.model.content.ShapeStroke$LineJoinType r4 = com.airbnb.lottie.model.content.ShapeStroke.LineJoinType.ROUND     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                com.airbnb.lottie.model.content.ShapeStroke$LineCapType[] r3 = com.airbnb.lottie.model.content.ShapeStroke.LineCapType.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f55674a = r3
                com.airbnb.lottie.model.content.ShapeStroke$LineCapType r4 = com.airbnb.lottie.model.content.ShapeStroke.LineCapType.BUTT     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = f55674a     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.airbnb.lottie.model.content.ShapeStroke$LineCapType r3 = com.airbnb.lottie.model.content.ShapeStroke.LineCapType.ROUND     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r0 = f55674a     // Catch:{ NoSuchFieldError -> 0x004d }
                com.airbnb.lottie.model.content.ShapeStroke$LineCapType r1 = com.airbnb.lottie.model.content.ShapeStroke.LineCapType.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x004d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004d }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004d }
            L_0x004d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.model.content.ShapeStroke.C21560a.<clinit>():void");
        }
    }

    public ShapeStroke(String str, @C0363p0 C21544b bVar, List<C21544b> list, C21543a aVar, C21546d dVar, C21544b bVar2, LineCapType lineCapType, LineJoinType lineJoinType, float f, boolean z) {
        this.f55656a = str;
        this.f55657b = bVar;
        this.f55658c = list;
        this.f55659d = aVar;
        this.f55660e = dVar;
        this.f55661f = bVar2;
        this.f55662g = lineCapType;
        this.f55663h = lineJoinType;
        this.f55664i = f;
        this.f55665j = z;
    }

    /* renamed from: a */
    public C21445c mo64305a(C21516j jVar, C21578a aVar) {
        return new C21463s(jVar, aVar, this);
    }

    /* renamed from: b */
    public LineCapType mo64345b() {
        return this.f55662g;
    }

    /* renamed from: c */
    public C21543a mo64346c() {
        return this.f55659d;
    }

    /* renamed from: d */
    public C21544b mo64347d() {
        return this.f55657b;
    }

    /* renamed from: e */
    public LineJoinType mo64348e() {
        return this.f55663h;
    }

    /* renamed from: f */
    public List<C21544b> mo64349f() {
        return this.f55658c;
    }

    /* renamed from: g */
    public float mo64350g() {
        return this.f55664i;
    }

    /* renamed from: h */
    public String mo64351h() {
        return this.f55656a;
    }

    /* renamed from: i */
    public C21546d mo64352i() {
        return this.f55660e;
    }

    /* renamed from: j */
    public C21544b mo64353j() {
        return this.f55661f;
    }

    /* renamed from: k */
    public boolean mo64354k() {
        return this.f55665j;
    }
}
