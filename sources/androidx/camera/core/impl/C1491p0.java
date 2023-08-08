package androidx.camera.core.impl;

import android.util.Pair;
import android.util.Size;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.camera.core.C1388e;
import androidx.camera.core.C1631k0;
import androidx.camera.core.impl.Config;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

/* renamed from: androidx.camera.core.impl.p0 */
public interface C1491p0 extends C1455g1 {

    /* renamed from: d */
    public static final int f4258d = -1;

    /* renamed from: e */
    public static final Config.C1421a<Integer> f4259e = Config.C1421a.m5980a("camerax.core.imageOutput.targetAspectRatio", C1388e.class);

    /* renamed from: f */
    public static final Config.C1421a<Integer> f4260f = Config.C1421a.m5980a("camerax.core.imageOutput.targetRotation", Integer.TYPE);

    /* renamed from: g */
    public static final Config.C1421a<Size> f4261g;

    /* renamed from: h */
    public static final Config.C1421a<Size> f4262h;

    /* renamed from: i */
    public static final Config.C1421a<Size> f4263i;

    /* renamed from: j */
    public static final Config.C1421a<List<Pair<Integer, Size[]>>> f4264j = Config.C1421a.m5980a("camerax.core.imageOutput.supportedResolutions", List.class);

    /* renamed from: androidx.camera.core.impl.p0$a */
    public interface C1492a<B> {
        @C0359n0
        /* renamed from: d */
        B mo4853d(int i);

        @C0359n0
        /* renamed from: i */
        B mo4856i(@C0359n0 Size size);

        @C0359n0
        /* renamed from: k */
        B mo4858k(@C0359n0 Size size);

        @C0359n0
        /* renamed from: m */
        B mo4860m(@C0359n0 Size size);

        @C0359n0
        /* renamed from: n */
        B mo4861n(int i);

        @C0359n0
        /* renamed from: q */
        B mo4864q(@C0359n0 List<Pair<Integer, Size[]>> list);
    }

    @C1631k0
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.camera.core.impl.p0$b */
    public @interface C1493b {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.camera.core.impl.p0$c */
    public @interface C1494c {
    }

    static {
        Class<Size> cls = Size.class;
        f4261g = Config.C1421a.m5980a("camerax.core.imageOutput.targetResolution", cls);
        f4262h = Config.C1421a.m5980a("camerax.core.imageOutput.defaultResolution", cls);
        f4263i = Config.C1421a.m5980a("camerax.core.imageOutput.maxResolution", cls);
    }

    /* renamed from: A */
    boolean mo5290A() {
        return mo5126c(f4259e);
    }

    /* renamed from: D */
    int mo5291D() {
        return ((Integer) mo5125b(f4259e)).intValue();
    }

    @C0359n0
    /* renamed from: E */
    Size mo5292E() {
        return (Size) mo5125b(f4263i);
    }

    /* renamed from: F */
    int mo5293F(int i) {
        return ((Integer) mo5131h(f4260f, Integer.valueOf(i))).intValue();
    }

    @C0363p0
    /* renamed from: I */
    Size mo5294I(@C0363p0 Size size) {
        return (Size) mo5131h(f4262h, size);
    }

    @C0363p0
    /* renamed from: N */
    Size mo5295N(@C0363p0 Size size) {
        return (Size) mo5131h(f4261g, size);
    }

    @C0363p0
    /* renamed from: j */
    Size mo5296j(@C0363p0 Size size) {
        return (Size) mo5131h(f4263i, size);
    }

    @C0363p0
    /* renamed from: m */
    List<Pair<Integer, Size[]>> mo5297m(@C0363p0 List<Pair<Integer, Size[]>> list) {
        return (List) mo5131h(f4264j, list);
    }

    @C0359n0
    /* renamed from: n */
    List<Pair<Integer, Size[]>> mo5298n() {
        return (List) mo5125b(f4264j);
    }

    @C0359n0
    /* renamed from: w */
    Size mo5299w() {
        return (Size) mo5125b(f4262h);
    }

    /* renamed from: x */
    int mo5300x() {
        return ((Integer) mo5125b(f4260f)).intValue();
    }

    @C0359n0
    /* renamed from: y */
    Size mo5301y() {
        return (Size) mo5125b(f4261g);
    }
}
