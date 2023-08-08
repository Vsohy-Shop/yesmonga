package androidx.camera.core.impl;

import androidx.annotation.C0359n0;
import androidx.camera.core.C1363b4;
import androidx.camera.core.impl.Config;
import androidx.camera.core.internal.C1613f;

/* renamed from: androidx.camera.core.impl.p1 */
public final class C1495p1 implements C1488o1<C1363b4>, C1491p0, C1613f {

    /* renamed from: A */
    public static final Config.C1421a<Integer> f4265A;

    /* renamed from: B */
    public static final Config.C1421a<Integer> f4266B;

    /* renamed from: C */
    public static final Config.C1421a<Integer> f4267C;

    /* renamed from: D */
    public static final Config.C1421a<Integer> f4268D;

    /* renamed from: w */
    public static final Config.C1421a<Integer> f4269w;

    /* renamed from: x */
    public static final Config.C1421a<Integer> f4270x;

    /* renamed from: y */
    public static final Config.C1421a<Integer> f4271y;

    /* renamed from: z */
    public static final Config.C1421a<Integer> f4272z;

    /* renamed from: v */
    public final C1441c1 f4273v;

    static {
        Class cls = Integer.TYPE;
        f4269w = Config.C1421a.m5980a("camerax.core.videoCapture.recordingFrameRate", cls);
        f4270x = Config.C1421a.m5980a("camerax.core.videoCapture.bitRate", cls);
        f4271y = Config.C1421a.m5980a("camerax.core.videoCapture.intraFrameInterval", cls);
        f4272z = Config.C1421a.m5980a("camerax.core.videoCapture.audioBitRate", cls);
        f4265A = Config.C1421a.m5980a("camerax.core.videoCapture.audioSampleRate", cls);
        f4266B = Config.C1421a.m5980a("camerax.core.videoCapture.audioChannelCount", cls);
        f4267C = Config.C1421a.m5980a("camerax.core.videoCapture.audioRecordSource", cls);
        f4268D = Config.C1421a.m5980a("camerax.core.videoCapture.audioMinBufferSize", cls);
    }

    public C1495p1(@C0359n0 C1441c1 c1Var) {
        this.f4273v = c1Var;
    }

    /* renamed from: Z */
    public int mo5302Z() {
        return ((Integer) mo5125b(f4272z)).intValue();
    }

    @C0359n0
    /* renamed from: a */
    public Config mo4458a() {
        return this.f4273v;
    }

    /* renamed from: a0 */
    public int mo5303a0(int i) {
        return ((Integer) mo5131h(f4272z, Integer.valueOf(i))).intValue();
    }

    /* renamed from: b0 */
    public int mo5304b0() {
        return ((Integer) mo5125b(f4266B)).intValue();
    }

    /* renamed from: c0 */
    public int mo5305c0(int i) {
        return ((Integer) mo5131h(f4266B, Integer.valueOf(i))).intValue();
    }

    /* renamed from: d0 */
    public int mo5306d0() {
        return ((Integer) mo5125b(f4268D)).intValue();
    }

    /* renamed from: e0 */
    public int mo5307e0(int i) {
        return ((Integer) mo5131h(f4268D, Integer.valueOf(i))).intValue();
    }

    /* renamed from: f0 */
    public int mo5308f0() {
        return ((Integer) mo5125b(f4267C)).intValue();
    }

    /* renamed from: g0 */
    public int mo5309g0(int i) {
        return ((Integer) mo5131h(f4267C, Integer.valueOf(i))).intValue();
    }

    /* renamed from: h0 */
    public int mo5310h0() {
        return ((Integer) mo5125b(f4265A)).intValue();
    }

    /* renamed from: i0 */
    public int mo5311i0(int i) {
        return ((Integer) mo5131h(f4265A, Integer.valueOf(i))).intValue();
    }

    /* renamed from: j0 */
    public int mo5312j0() {
        return ((Integer) mo5125b(f4270x)).intValue();
    }

    /* renamed from: k0 */
    public int mo5313k0(int i) {
        return ((Integer) mo5131h(f4270x, Integer.valueOf(i))).intValue();
    }

    /* renamed from: l0 */
    public int mo5314l0() {
        return ((Integer) mo5125b(f4271y)).intValue();
    }

    /* renamed from: m0 */
    public int mo5315m0(int i) {
        return ((Integer) mo5131h(f4271y, Integer.valueOf(i))).intValue();
    }

    /* renamed from: n0 */
    public int mo5316n0() {
        return ((Integer) mo5125b(f4269w)).intValue();
    }

    /* renamed from: o */
    public int mo5210o() {
        return 34;
    }

    /* renamed from: o0 */
    public int mo5317o0(int i) {
        return ((Integer) mo5131h(f4269w, Integer.valueOf(i))).intValue();
    }
}
