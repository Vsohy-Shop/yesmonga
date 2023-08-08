package androidx.compose.p004ui.graphics;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PathEffect;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;
import androidx.compose.p004ui.graphics.C15244j4;
import androidx.compose.p004ui.graphics.C15253k4;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.ui.graphics.n0 */
public final class C15271n0 {

    /* renamed from: androidx.compose.ui.graphics.n0$a */
    public /* synthetic */ class C15272a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|20|(2:21|22)|23|25) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004c */
        static {
            /*
                android.graphics.Paint$Style[] r0 = android.graphics.Paint.Style.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                android.graphics.Paint$Style r2 = android.graphics.Paint.Style.STROKE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                $EnumSwitchMapping$0 = r0
                android.graphics.Paint$Cap[] r0 = android.graphics.Paint.Cap.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                android.graphics.Paint$Cap r2 = android.graphics.Paint.Cap.BUTT     // Catch:{ NoSuchFieldError -> 0x0021 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0021 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0021 }
            L_0x0021:
                r2 = 2
                android.graphics.Paint$Cap r3 = android.graphics.Paint.Cap.ROUND     // Catch:{ NoSuchFieldError -> 0x002a }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                r3 = 3
                android.graphics.Paint$Cap r4 = android.graphics.Paint.Cap.SQUARE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r0[r4] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                $EnumSwitchMapping$1 = r0
                android.graphics.Paint$Join[] r0 = android.graphics.Paint.Join.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                android.graphics.Paint$Join r4 = android.graphics.Paint.Join.MITER     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r0[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                android.graphics.Paint$Join r1 = android.graphics.Paint.Join.BEVEL     // Catch:{ NoSuchFieldError -> 0x004c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004c }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004c }
            L_0x004c:
                android.graphics.Paint$Join r1 = android.graphics.Paint.Join.ROUND     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                $EnumSwitchMapping$2 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.graphics.C15271n0.C15272a.<clinit>():void");
        }
    }

    @C12579k
    /* renamed from: a */
    public static final C15211f3 m66286a() {
        return new C15263m0();
    }

    /* renamed from: b */
    public static final float m66287b(@C12579k Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "<this>");
        return ((float) paint.getAlpha()) / 255.0f;
    }

    /* renamed from: c */
    public static final boolean m66288c(@C12579k Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "<this>");
        return paint.isAntiAlias();
    }

    /* renamed from: d */
    public static final long m66289d(@C12579k Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "<this>");
        return C15258l2.m66177b(paint.getColor());
    }

    /* renamed from: e */
    public static final int m66290e(@C12579k Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "<this>");
        if (!paint.isFilterBitmap()) {
            return C15299q2.f37647b.mo42975d();
        }
        return C15299q2.f37647b.mo42973b();
    }

    /* renamed from: f */
    public static final int m66291f(@C12579k Paint paint) {
        int i;
        Intrinsics.checkNotNullParameter(paint, "<this>");
        Paint.Cap strokeCap = paint.getStrokeCap();
        if (strokeCap == null) {
            i = -1;
        } else {
            i = C15272a.$EnumSwitchMapping$1[strokeCap.ordinal()];
        }
        if (i == 1) {
            return C15244j4.f37564b.mo42862a();
        }
        if (i == 2) {
            return C15244j4.f37564b.mo42863b();
        }
        if (i != 3) {
            return C15244j4.f37564b.mo42862a();
        }
        return C15244j4.f37564b.mo42864c();
    }

    /* renamed from: g */
    public static final int m66292g(@C12579k Paint paint) {
        int i;
        Intrinsics.checkNotNullParameter(paint, "<this>");
        Paint.Join strokeJoin = paint.getStrokeJoin();
        if (strokeJoin == null) {
            i = -1;
        } else {
            i = C15272a.$EnumSwitchMapping$2[strokeJoin.ordinal()];
        }
        if (i == 1) {
            return C15253k4.f37575b.mo42880b();
        }
        if (i == 2) {
            return C15253k4.f37575b.mo42879a();
        }
        if (i != 3) {
            return C15253k4.f37575b.mo42880b();
        }
        return C15253k4.f37575b.mo42881c();
    }

    /* renamed from: h */
    public static final float m66293h(@C12579k Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "<this>");
        return paint.getStrokeMiter();
    }

    /* renamed from: i */
    public static final float m66294i(@C12579k Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "<this>");
        return paint.getStrokeWidth();
    }

    /* renamed from: j */
    public static final int m66295j(@C12579k Paint paint) {
        int i;
        Intrinsics.checkNotNullParameter(paint, "<this>");
        Paint.Style style = paint.getStyle();
        if (style == null) {
            i = -1;
        } else {
            i = C15272a.$EnumSwitchMapping$0[style.ordinal()];
        }
        if (i == 1) {
            return C15223h3.f37530b.mo42780b();
        }
        return C15223h3.f37530b.mo42779a();
    }

    @C12579k
    /* renamed from: k */
    public static final Paint m66296k() {
        return new Paint(7);
    }

    /* renamed from: l */
    public static final void m66297l(@C12579k Paint paint, float f) {
        Intrinsics.checkNotNullParameter(paint, "<this>");
        paint.setAlpha((int) ((float) Math.rint((double) (f * 255.0f))));
    }

    /* renamed from: m */
    public static final void m66298m(@C12579k Paint paint, boolean z) {
        Intrinsics.checkNotNullParameter(paint, "<this>");
        paint.setAntiAlias(z);
    }

    /* renamed from: n */
    public static final void m66299n(@C12579k Paint paint, int i) {
        Intrinsics.checkNotNullParameter(paint, "$this$setNativeBlendMode");
        if (Build.VERSION.SDK_INT >= 29) {
            C15316s4.f37699a.mo43006a(paint, i);
        } else {
            paint.setXfermode(new PorterDuffXfermode(C15171d0.m65561c(i)));
        }
    }

    /* renamed from: o */
    public static final void m66300o(@C12579k Paint paint, long j) {
        Intrinsics.checkNotNullParameter(paint, "$this$setNativeColor");
        paint.setColor(C15258l2.m66193r(j));
    }

    /* renamed from: p */
    public static final void m66301p(@C12579k Paint paint, @C12580l C15249k2 k2Var) {
        ColorFilter colorFilter;
        Intrinsics.checkNotNullParameter(paint, "<this>");
        if (k2Var != null) {
            colorFilter = C15214g0.m65963d(k2Var);
        } else {
            colorFilter = null;
        }
        paint.setColorFilter(colorFilter);
    }

    /* renamed from: q */
    public static final void m66302q(@C12579k Paint paint, int i) {
        Intrinsics.checkNotNullParameter(paint, "$this$setNativeFilterQuality");
        paint.setFilterBitmap(!C15299q2.m66448h(i, C15299q2.f37647b.mo42975d()));
    }

    /* renamed from: r */
    public static final void m66303r(@C12579k Paint paint, @C12580l C15242j3 j3Var) {
        PathEffect pathEffect;
        Intrinsics.checkNotNullParameter(paint, "<this>");
        C15286p0 p0Var = (C15286p0) j3Var;
        if (p0Var != null) {
            pathEffect = p0Var.mo42934a();
        } else {
            pathEffect = null;
        }
        paint.setPathEffect(pathEffect);
    }

    /* renamed from: s */
    public static final void m66304s(@C12579k Paint paint, @C12580l Shader shader) {
        Intrinsics.checkNotNullParameter(paint, "<this>");
        paint.setShader(shader);
    }

    /* renamed from: t */
    public static final void m66305t(@C12579k Paint paint, int i) {
        Paint.Cap cap;
        Intrinsics.checkNotNullParameter(paint, "$this$setNativeStrokeCap");
        C15244j4.C15245a aVar = C15244j4.f37564b;
        if (C15244j4.m66129g(i, aVar.mo42864c())) {
            cap = Paint.Cap.SQUARE;
        } else if (C15244j4.m66129g(i, aVar.mo42863b())) {
            cap = Paint.Cap.ROUND;
        } else if (C15244j4.m66129g(i, aVar.mo42862a())) {
            cap = Paint.Cap.BUTT;
        } else {
            cap = Paint.Cap.BUTT;
        }
        paint.setStrokeCap(cap);
    }

    /* renamed from: u */
    public static final void m66306u(@C12579k Paint paint, int i) {
        Paint.Join join;
        Intrinsics.checkNotNullParameter(paint, "$this$setNativeStrokeJoin");
        C15253k4.C15254a aVar = C15253k4.f37575b;
        if (C15253k4.m66165g(i, aVar.mo42880b())) {
            join = Paint.Join.MITER;
        } else if (C15253k4.m66165g(i, aVar.mo42879a())) {
            join = Paint.Join.BEVEL;
        } else if (C15253k4.m66165g(i, aVar.mo42881c())) {
            join = Paint.Join.ROUND;
        } else {
            join = Paint.Join.MITER;
        }
        paint.setStrokeJoin(join);
    }

    /* renamed from: v */
    public static final void m66307v(@C12579k Paint paint, float f) {
        Intrinsics.checkNotNullParameter(paint, "<this>");
        paint.setStrokeMiter(f);
    }

    /* renamed from: w */
    public static final void m66308w(@C12579k Paint paint, float f) {
        Intrinsics.checkNotNullParameter(paint, "<this>");
        paint.setStrokeWidth(f);
    }

    /* renamed from: x */
    public static final void m66309x(@C12579k Paint paint, int i) {
        Paint.Style style;
        Intrinsics.checkNotNullParameter(paint, "$this$setNativeStyle");
        if (C15223h3.m65977f(i, C15223h3.f37530b.mo42780b())) {
            style = Paint.Style.STROKE;
        } else {
            style = Paint.Style.FILL;
        }
        paint.setStyle(style);
    }

    @C12579k
    /* renamed from: y */
    public static final C15211f3 m66310y(@C12579k Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "<this>");
        return new C15263m0(paint);
    }
}
