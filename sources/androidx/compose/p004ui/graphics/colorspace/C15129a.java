package androidx.compose.p004ui.graphics.colorspace;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.ui.graphics.colorspace.a */
public abstract class C15129a {
    @C12579k

    /* renamed from: b */
    public static final C15133d f37382b = new C15133d((DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: c */
    public static final C15129a f37383c = new C15130a(new float[]{0.8951f, -0.7502f, 0.0389f, 0.2664f, 1.7135f, -0.0685f, -0.1614f, 0.0367f, 1.0296f});
    @C12579k

    /* renamed from: d */
    public static final C15129a f37384d = new C15132c(new float[]{0.40024f, -0.2263f, 0.0f, 0.7076f, 1.16532f, 0.0f, -0.08081f, 0.0457f, 0.91822f});
    @C12579k

    /* renamed from: e */
    public static final C15129a f37385e = new C15131b(new float[]{0.7328f, -0.7036f, 0.003f, 0.4296f, 1.6975f, 0.0136f, -0.1624f, 0.0061f, 0.9834f});
    @C12579k

    /* renamed from: a */
    public final float[] f37386a;

    /* renamed from: androidx.compose.ui.graphics.colorspace.a$a */
    public static final class C15130a extends C15129a {
        public C15130a(float[] fArr) {
            super(fArr, (DefaultConstructorMarker) null);
        }

        @C12579k
        public String toString() {
            return "Bradford";
        }
    }

    /* renamed from: androidx.compose.ui.graphics.colorspace.a$b */
    public static final class C15131b extends C15129a {
        public C15131b(float[] fArr) {
            super(fArr, (DefaultConstructorMarker) null);
        }

        @C12579k
        public String toString() {
            return "Ciecat02";
        }
    }

    /* renamed from: androidx.compose.ui.graphics.colorspace.a$c */
    public static final class C15132c extends C15129a {
        public C15132c(float[] fArr) {
            super(fArr, (DefaultConstructorMarker) null);
        }

        @C12579k
        public String toString() {
            return "VonKries";
        }
    }

    /* renamed from: androidx.compose.ui.graphics.colorspace.a$d */
    public static final class C15133d {
        public /* synthetic */ C15133d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final C15129a mo42544a() {
            return C15129a.f37383c;
        }

        @C12579k
        /* renamed from: b */
        public final C15129a mo42545b() {
            return C15129a.f37385e;
        }

        @C12579k
        /* renamed from: c */
        public final C15129a mo42546c() {
            return C15129a.f37384d;
        }

        public C15133d() {
        }
    }

    public /* synthetic */ C15129a(float[] fArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(fArr);
    }

    @C12579k
    /* renamed from: d */
    public final float[] mo42540d() {
        return this.f37386a;
    }

    public C15129a(float[] fArr) {
        this.f37386a = fArr;
    }
}
