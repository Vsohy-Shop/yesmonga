package com.google.mlkit.vision.barcode.bundled.internal;

import android.content.Context;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C39090y;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzap;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzbc;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzbu;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdc;
import com.google.android.libraries.barhopper.BarhopperV3;
import com.google.android.libraries.barhopper.RecognitionOptions;
import com.google.barhopper.deeplearning.C32459a;
import com.google.barhopper.deeplearning.C32461c;
import com.google.barhopper.deeplearning.C32462d;
import com.google.barhopper.deeplearning.C32464f;
import com.google.barhopper.deeplearning.C32465g;
import com.google.barhopper.deeplearning.C32467i;
import com.google.barhopper.deeplearning.C32468j;
import com.google.barhopper.deeplearning.C32470l;
import com.google.barhopper.deeplearning.C32472n;
import com.google.barhopper.deeplearning.C32473o;
import com.google.photos.vision.barhopper.C34106a;
import com.google.photos.vision.barhopper.C34113d0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.mlkit.vision.barcode.bundled.internal.a */
public final class C34003a extends C39090y {

    /* renamed from: q */
    public static final int[] f82594q = {5, 7, 7, 7, 5, 5};

    /* renamed from: r */
    public static final double[][] f82595r = {new double[]{0.075d, 1.0d}, new double[]{0.1d, 1.0d}, new double[]{0.125d, 1.0d}, new double[]{0.2d, 2.0d}, new double[]{0.2d, 0.5d}, new double[]{0.15d, 1.0d}, new double[]{0.2d, 1.0d}, new double[]{0.25d, 1.0d}, new double[]{0.35d, 2.0d}, new double[]{0.35d, 0.5d}, new double[]{0.35d, 3.0d}, new double[]{0.35d, 0.3333d}, new double[]{0.3d, 1.0d}, new double[]{0.4d, 1.0d}, new double[]{0.5d, 1.0d}, new double[]{0.5d, 2.0d}, new double[]{0.5d, 0.5d}, new double[]{0.5d, 3.0d}, new double[]{0.5d, 0.3333d}, new double[]{0.6d, 1.0d}, new double[]{0.8d, 1.0d}, new double[]{1.0d, 1.0d}, new double[]{0.65d, 2.0d}, new double[]{0.65d, 0.5d}, new double[]{0.65d, 3.0d}, new double[]{0.65d, 0.3333d}, new double[]{1.0d, 1.0d}, new double[]{0.8d, 2.0d}, new double[]{0.8d, 0.5d}, new double[]{0.8d, 3.0d}, new double[]{0.8d, 0.3333d}, new double[]{1.0d, 1.0d}, new double[]{0.95d, 2.0d}, new double[]{0.95d, 0.5d}, new double[]{0.95d, 3.0d}, new double[]{0.95d, 0.3333d}};

    /* renamed from: n */
    public final Context f82596n;

    /* renamed from: o */
    public final RecognitionOptions f82597o;
    @C0363p0

    /* renamed from: p */
    public BarhopperV3 f82598p;

    public C34003a(Context context, zzbc zzbc) {
        RecognitionOptions recognitionOptions = new RecognitionOptions();
        this.f82597o = recognitionOptions;
        this.f82596n = context;
        recognitionOptions.mo87811d(zzbc.mo123175M());
    }

    @C0363p0
    /* renamed from: H0 */
    public static zzap m136807H0(@C0363p0 C34113d0 d0Var, @C0363p0 String str, String str2) {
        String str3 = null;
        if (d0Var == null || str == null) {
            return null;
        }
        Matcher matcher = Pattern.compile(str2).matcher(str);
        int G = d0Var.mo99071G();
        int E = d0Var.mo99069E();
        int B = d0Var.mo99066B();
        int C = d0Var.mo99067C();
        int D = d0Var.mo99068D();
        int F = d0Var.mo99070F();
        boolean J = d0Var.mo99072J();
        if (matcher.find()) {
            str3 = matcher.group(1);
        }
        return new zzap(G, E, B, C, D, F, J, str3);
    }

    /* renamed from: O0 */
    public final C34106a mo98918O0(ByteBuffer byteBuffer, zzbu zzbu) {
        BarhopperV3 barhopperV3 = (BarhopperV3) C40843u.m166202l(this.f82598p);
        if (((ByteBuffer) C40843u.m166202l(byteBuffer)).isDirect()) {
            return barhopperV3.mo87774f(zzbu.mo123180X(), zzbu.mo123177M(), byteBuffer, this.f82597o);
        }
        if (byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
            return barhopperV3.mo87776g(zzbu.mo123180X(), zzbu.mo123177M(), byteBuffer.array(), this.f82597o);
        }
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        return barhopperV3.mo87776g(zzbu.mo123180X(), zzbu.mo123177M(), bArr, this.f82597o);
    }

    /* JADX WARNING: type inference failed for: r4v54, types: [com.google.android.gms.internal.mlkit_vision_barcode_bundled.o2] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: V3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzba> mo98919V3(com.google.android.gms.dynamic.C41016d r55, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzbu r56) {
        /*
            r54 = this;
            r0 = r54
            r1 = r56
            int r2 = r56.mo123178Q()
            r3 = -1
            r4 = 0
            if (r2 == r3) goto L_0x005d
            r5 = 17
            if (r2 == r5) goto L_0x0052
            r5 = 35
            if (r2 == r5) goto L_0x0037
            r5 = 842094169(0x32315659, float:1.0322389E-8)
            if (r2 != r5) goto L_0x001a
            goto L_0x0052
        L_0x001a:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            int r1 = r56.mo123178Q()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = 37
            r3.<init>(r4)
            java.lang.String r4 = "Unsupported image format: "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        L_0x0037:
            java.lang.Object r2 = com.google.android.gms.dynamic.C41019f.m166810O0(r55)
            android.media.Image r2 = (android.media.Image) r2
            java.lang.Object r2 = com.google.android.gms.common.internal.C40843u.m166202l(r2)
            android.media.Image r2 = (android.media.Image) r2
            android.media.Image$Plane[] r2 = r2.getPlanes()
            r2 = r2[r4]
            java.nio.ByteBuffer r2 = r2.getBuffer()
            com.google.photos.vision.barhopper.a r2 = r0.mo98918O0(r2, r1)
            goto L_0x0071
        L_0x0052:
            java.lang.Object r2 = com.google.android.gms.dynamic.C41019f.m166810O0(r55)
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
            com.google.photos.vision.barhopper.a r2 = r0.mo98918O0(r2, r1)
            goto L_0x0071
        L_0x005d:
            com.google.android.libraries.barhopper.BarhopperV3 r2 = r0.f82598p
            java.lang.Object r2 = com.google.android.gms.common.internal.C40843u.m166202l(r2)
            com.google.android.libraries.barhopper.BarhopperV3 r2 = (com.google.android.libraries.barhopper.BarhopperV3) r2
            java.lang.Object r5 = com.google.android.gms.dynamic.C41019f.m166810O0(r55)
            android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
            com.google.android.libraries.barhopper.RecognitionOptions r6 = r0.f82597o
            com.google.photos.vision.barhopper.a r2 = r2.mo87777i(r5, r6)
        L_0x0071:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            com.google.mlkit.vision.common.internal.f r6 = com.google.mlkit.vision.common.internal.C34036f.m136944b()
            int r7 = r56.mo123180X()
            int r8 = r56.mo123177M()
            int r9 = r56.mo123179W()
            android.graphics.Matrix r6 = r6.mo98991e(r7, r8, r9)
            java.util.List r2 = r2.mo99065D()
            java.util.Iterator r2 = r2.iterator()
        L_0x0092:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L_0x0474
            java.lang.Object r7 = r2.next()
            com.google.photos.vision.barhopper.s r7 = (com.google.photos.vision.barhopper.C34140s) r7
            int r8 = r7.mo99121C()
            r9 = 8
            r10 = 1
            if (r8 <= 0) goto L_0x0112
            if (r6 == 0) goto L_0x0112
            float[] r8 = new float[r9]
            java.util.List r11 = r7.mo99133P()
            int r12 = r7.mo99121C()
            r13 = r4
        L_0x00b4:
            if (r13 >= r12) goto L_0x00d6
            int r14 = r13 + r13
            java.lang.Object r15 = r11.get(r13)
            com.google.photos.vision.barhopper.g r15 = (com.google.photos.vision.barhopper.C34118g) r15
            int r15 = r15.mo99084B()
            float r15 = (float) r15
            r8[r14] = r15
            int r14 = r14 + r10
            java.lang.Object r15 = r11.get(r13)
            com.google.photos.vision.barhopper.g r15 = (com.google.photos.vision.barhopper.C34118g) r15
            int r15 = r15.mo99085C()
            float r15 = (float) r15
            r8[r14] = r15
            int r13 = r13 + 1
            goto L_0x00b4
        L_0x00d6:
            r6.mapPoints(r8)
            int r11 = r56.mo123179W()
            r13 = r4
        L_0x00de:
            if (r13 >= r12) goto L_0x0112
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.h2 r7 = r7.mo122990i()
            com.google.photos.vision.barhopper.r r7 = (com.google.photos.vision.barhopper.C34139r) r7
            int r14 = r13 + r11
            int r14 = r14 % r12
            int r15 = r13 + r13
            com.google.photos.vision.barhopper.f r9 = com.google.photos.vision.barhopper.C34118g.m137101D()
            r4 = r8[r15]
            int r4 = (int) r4
            r9.mo99075s(r4)
            int r15 = r15 + r10
            r4 = r8[r15]
            int r4 = (int) r4
            r9.mo99076t(r4)
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.o2 r4 = r9.mo122918q()
            com.google.photos.vision.barhopper.g r4 = (com.google.photos.vision.barhopper.C34118g) r4
            r7.mo99119s(r14, r4)
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.o2 r4 = r7.mo122918q()
            r7 = r4
            com.google.photos.vision.barhopper.s r7 = (com.google.photos.vision.barhopper.C34140s) r7
            int r13 = r13 + 1
            r4 = 0
            r9 = 8
            goto L_0x00de
        L_0x0112:
            boolean r4 = r7.mo99137U()
            if (r4 == 0) goto L_0x0135
            com.google.photos.vision.barhopper.o0 r4 = r7.mo99126I()
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzat r9 = new com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzat
            int r11 = r4.mo99115G()
            int r11 = r11 + r3
            java.lang.String r12 = r4.mo99112D()
            java.lang.String r13 = r4.mo99114F()
            java.lang.String r4 = r4.mo99113E()
            r9.<init>(r11, r12, r13, r4)
            r24 = r9
            goto L_0x0137
        L_0x0135:
            r24 = 0
        L_0x0137:
            boolean r4 = r7.mo99139W()
            if (r4 == 0) goto L_0x0152
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.w0 r4 = r7.mo99122D()
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzaw r9 = new com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzaw
            int r11 = r4.mo123105E()
            int r11 = r11 + r3
            java.lang.String r4 = r4.mo123104D()
            r9.<init>(r11, r4)
            r25 = r9
            goto L_0x0154
        L_0x0152:
            r25 = 0
        L_0x0154:
            boolean r4 = r7.mo99140X()
            if (r4 == 0) goto L_0x016e
            com.google.photos.vision.barhopper.i r4 = r7.mo99128K()
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzax r9 = new com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzax
            java.lang.String r11 = r4.mo99093D()
            java.lang.String r4 = r4.mo99094E()
            r9.<init>(r11, r4)
            r26 = r9
            goto L_0x0170
        L_0x016e:
            r26 = 0
        L_0x0170:
            boolean r4 = r7.mo99142Z()
            if (r4 == 0) goto L_0x018f
            com.google.photos.vision.barhopper.q r4 = r7.mo99130M()
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzaz r9 = new com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzaz
            java.lang.String r11 = r4.mo99117E()
            java.lang.String r12 = r4.mo99116D()
            int r4 = r4.mo99118F()
            int r4 = r4 + r3
            r9.<init>(r11, r12, r4)
            r27 = r9
            goto L_0x0191
        L_0x018f:
            r27 = 0
        L_0x0191:
            boolean r4 = r7.mo99141Y()
            if (r4 == 0) goto L_0x01ab
            com.google.photos.vision.barhopper.l r4 = r7.mo99129L()
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzay r9 = new com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzay
            java.lang.String r11 = r4.mo99110D()
            java.lang.String r4 = r4.mo99111E()
            r9.<init>(r11, r4)
            r28 = r9
            goto L_0x01ad
        L_0x01ab:
            r28 = 0
        L_0x01ad:
            boolean r4 = r7.mo99138V()
            if (r4 == 0) goto L_0x01c7
            com.google.photos.vision.barhopper.e r4 = r7.mo99127J()
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzau r9 = new com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzau
            double r11 = r4.mo99073B()
            double r13 = r4.mo99074C()
            r9.<init>(r11, r13)
            r29 = r9
            goto L_0x01c9
        L_0x01c7:
            r29 = 0
        L_0x01c9:
            boolean r4 = r7.mo99134R()
            if (r4 == 0) goto L_0x022b
            com.google.photos.vision.barhopper.f0 r4 = r7.mo99123F()
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzaq r9 = new com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzaq
            java.lang.String r31 = r4.mo99083J()
            java.lang.String r32 = r4.mo99079F()
            java.lang.String r33 = r4.mo99080G()
            java.lang.String r34 = r4.mo99081H()
            java.lang.String r35 = r4.mo99082I()
            com.google.photos.vision.barhopper.d0 r11 = r4.mo99078C()
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdc r12 = r7.mo99131N()
            boolean r12 = r12.mo123194W()
            if (r12 == 0) goto L_0x0200
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdc r12 = r7.mo99131N()
            java.lang.String r12 = r12.mo123202n0()
            goto L_0x0201
        L_0x0200:
            r12 = 0
        L_0x0201:
            java.lang.String r13 = "DTSTART:([0-9TZ]*)"
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzap r36 = m136807H0(r11, r12, r13)
            com.google.photos.vision.barhopper.d0 r4 = r4.mo99077B()
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdc r11 = r7.mo99131N()
            boolean r11 = r11.mo123194W()
            if (r11 == 0) goto L_0x021e
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdc r11 = r7.mo99131N()
            java.lang.String r11 = r11.mo123202n0()
            goto L_0x021f
        L_0x021e:
            r11 = 0
        L_0x021f:
            java.lang.String r12 = "DTEND:([0-9TZ]*)"
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzap r37 = m136807H0(r4, r11, r12)
            r30 = r9
            r30.<init>(r31, r32, r33, r34, r35, r36, r37)
            goto L_0x022d
        L_0x022b:
            r30 = 0
        L_0x022d:
            boolean r4 = r7.mo99135S()
            if (r4 == 0) goto L_0x0357
            com.google.photos.vision.barhopper.h0 r4 = r7.mo99124G()
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzar r9 = new com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzar
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.r0 r11 = r4.mo99086B()
            if (r11 == 0) goto L_0x0265
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzav r12 = new com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzav
            java.lang.String r32 = r11.mo123023E()
            java.lang.String r33 = r11.mo123027I()
            java.lang.String r34 = r11.mo123026H()
            java.lang.String r35 = r11.mo123022D()
            java.lang.String r36 = r11.mo123025G()
            java.lang.String r37 = r11.mo123024F()
            java.lang.String r38 = r11.mo123028J()
            r31 = r12
            r31.<init>(r32, r33, r34, r35, r36, r37, r38)
            r32 = r12
            goto L_0x0267
        L_0x0265:
            r32 = 0
        L_0x0267:
            java.lang.String r33 = r4.mo99087E()
            java.lang.String r34 = r4.mo99088F()
            java.util.List r11 = r4.mo99091I()
            boolean r12 = r11.isEmpty()
            if (r12 == 0) goto L_0x027c
            r35 = 0
            goto L_0x02aa
        L_0x027c:
            int r12 = r11.size()
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzaw[] r12 = new com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzaw[r12]
            r13 = 0
        L_0x0283:
            int r14 = r11.size()
            if (r13 >= r14) goto L_0x02a8
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzaw r14 = new com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzaw
            java.lang.Object r15 = r11.get(r13)
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.w0 r15 = (com.google.android.gms.internal.mlkit_vision_barcode_bundled.C39073w0) r15
            int r15 = r15.mo123105E()
            int r15 = r15 + r3
            java.lang.Object r17 = r11.get(r13)
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.w0 r17 = (com.google.android.gms.internal.mlkit_vision_barcode_bundled.C39073w0) r17
            java.lang.String r8 = r17.mo123104D()
            r14.<init>(r15, r8)
            r12[r13] = r14
            int r13 = r13 + 1
            goto L_0x0283
        L_0x02a8:
            r35 = r12
        L_0x02aa:
            java.util.List r8 = r4.mo99090H()
            boolean r11 = r8.isEmpty()
            if (r11 == 0) goto L_0x02b7
            r36 = 0
            goto L_0x02fb
        L_0x02b7:
            int r11 = r8.size()
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzat[] r11 = new com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzat[r11]
            r12 = 0
        L_0x02be:
            int r13 = r8.size()
            if (r12 >= r13) goto L_0x02f9
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzat r13 = new com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzat
            java.lang.Object r14 = r8.get(r12)
            com.google.photos.vision.barhopper.o0 r14 = (com.google.photos.vision.barhopper.C34135o0) r14
            int r14 = r14.mo99115G()
            int r14 = r14 + r3
            java.lang.Object r15 = r8.get(r12)
            com.google.photos.vision.barhopper.o0 r15 = (com.google.photos.vision.barhopper.C34135o0) r15
            java.lang.String r15 = r15.mo99112D()
            java.lang.Object r17 = r8.get(r12)
            com.google.photos.vision.barhopper.o0 r17 = (com.google.photos.vision.barhopper.C34135o0) r17
            java.lang.String r10 = r17.mo99114F()
            java.lang.Object r17 = r8.get(r12)
            com.google.photos.vision.barhopper.o0 r17 = (com.google.photos.vision.barhopper.C34135o0) r17
            java.lang.String r3 = r17.mo99113E()
            r13.<init>(r14, r15, r10, r3)
            r11[r12] = r13
            int r12 = r12 + 1
            r3 = -1
            r10 = 1
            goto L_0x02be
        L_0x02f9:
            r36 = r11
        L_0x02fb:
            java.util.List r3 = r4.mo99092J()
            r8 = 0
            java.lang.String[] r10 = new java.lang.String[r8]
            java.lang.Object[] r3 = r3.toArray(r10)
            r37 = r3
            java.lang.String[] r37 = (java.lang.String[]) r37
            java.util.List r3 = r4.mo99089G()
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L_0x0318
            r13 = 0
            r38 = 0
            goto L_0x0351
        L_0x0318:
            int r4 = r3.size()
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzao[] r4 = new com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzao[r4]
            r8 = 0
        L_0x031f:
            int r10 = r3.size()
            if (r8 >= r10) goto L_0x034e
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzao r10 = new com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzao
            java.lang.Object r11 = r3.get(r8)
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.p0 r11 = (com.google.android.gms.internal.mlkit_vision_barcode_bundled.C39010p0) r11
            int r11 = r11.mo122996D()
            r12 = -1
            int r11 = r11 + r12
            java.lang.Object r12 = r3.get(r8)
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.p0 r12 = (com.google.android.gms.internal.mlkit_vision_barcode_bundled.C39010p0) r12
            java.util.List r12 = r12.mo122995C()
            r13 = 0
            java.lang.String[] r14 = new java.lang.String[r13]
            java.lang.Object[] r12 = r12.toArray(r14)
            java.lang.String[] r12 = (java.lang.String[]) r12
            r10.<init>(r11, r12)
            r4[r8] = r10
            int r8 = r8 + 1
            goto L_0x031f
        L_0x034e:
            r13 = 0
            r38 = r4
        L_0x0351:
            r31 = r9
            r31.<init>(r32, r33, r34, r35, r36, r37, r38)
            goto L_0x035a
        L_0x0357:
            r13 = 0
            r31 = 0
        L_0x035a:
            boolean r3 = r7.mo99136T()
            if (r3 == 0) goto L_0x03a6
            com.google.photos.vision.barhopper.j0 r3 = r7.mo99125H()
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzas r4 = new com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzas
            java.lang.String r40 = r3.mo99101I()
            java.lang.String r41 = r3.mo99103K()
            java.lang.String r42 = r3.mo99109Q()
            java.lang.String r43 = r3.mo99107O()
            java.lang.String r44 = r3.mo99104L()
            java.lang.String r45 = r3.mo99098F()
            java.lang.String r46 = r3.mo99096D()
            java.lang.String r47 = r3.mo99097E()
            java.lang.String r48 = r3.mo99099G()
            java.lang.String r49 = r3.mo99108P()
            java.lang.String r50 = r3.mo99105M()
            java.lang.String r51 = r3.mo99102J()
            java.lang.String r52 = r3.mo99100H()
            java.lang.String r53 = r3.mo99106N()
            r39 = r4
            r39.<init>(r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53)
            r32 = r4
            goto L_0x03a8
        L_0x03a6:
            r32 = 0
        L_0x03a8:
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzba r3 = new com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzba
            int r4 = r7.mo99143a0()
            r8 = -1
            int r4 = r4 + r8
            switch(r4) {
                case 0: goto L_0x03d9;
                case 1: goto L_0x03d7;
                case 2: goto L_0x03d5;
                case 3: goto L_0x03d3;
                case 4: goto L_0x03d0;
                case 5: goto L_0x03cd;
                case 6: goto L_0x03ca;
                case 7: goto L_0x03c7;
                case 8: goto L_0x03c4;
                case 9: goto L_0x03c1;
                case 10: goto L_0x03be;
                case 11: goto L_0x03bb;
                case 12: goto L_0x03b8;
                case 13: goto L_0x03b5;
                default: goto L_0x03b3;
            }
        L_0x03b3:
            r4 = -1
            goto L_0x03da
        L_0x03b5:
            r4 = 4096(0x1000, float:5.74E-42)
            goto L_0x03da
        L_0x03b8:
            r4 = 2048(0x800, float:2.87E-42)
            goto L_0x03da
        L_0x03bb:
            r4 = 1024(0x400, float:1.435E-42)
            goto L_0x03da
        L_0x03be:
            r4 = 512(0x200, float:7.175E-43)
            goto L_0x03da
        L_0x03c1:
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x03da
        L_0x03c4:
            r4 = 128(0x80, float:1.794E-43)
            goto L_0x03da
        L_0x03c7:
            r4 = 64
            goto L_0x03da
        L_0x03ca:
            r4 = 32
            goto L_0x03da
        L_0x03cd:
            r4 = 16
            goto L_0x03da
        L_0x03d0:
            r4 = 8
            goto L_0x03da
        L_0x03d3:
            r4 = 4
            goto L_0x03da
        L_0x03d5:
            r4 = 2
            goto L_0x03da
        L_0x03d7:
            r4 = 1
            goto L_0x03da
        L_0x03d9:
            r4 = r13
        L_0x03da:
            java.lang.String r10 = r7.mo99132O()
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdc r11 = r7.mo99131N()
            boolean r11 = r11.mo123194W()
            if (r11 == 0) goto L_0x03f3
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdc r11 = r7.mo99131N()
            java.lang.String r11 = r11.mo123202n0()
            r20 = r11
            goto L_0x03f5
        L_0x03f3:
            r20 = 0
        L_0x03f5:
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdc r11 = r7.mo99131N()
            byte[] r21 = r11.mo123204r0()
            java.util.List r11 = r7.mo99133P()
            boolean r12 = r11.isEmpty()
            if (r12 == 0) goto L_0x040a
            r22 = 0
            goto L_0x0437
        L_0x040a:
            int r12 = r11.size()
            android.graphics.Point[] r12 = new android.graphics.Point[r12]
            r14 = r13
        L_0x0411:
            int r15 = r11.size()
            if (r14 >= r15) goto L_0x0435
            android.graphics.Point r15 = new android.graphics.Point
            java.lang.Object r16 = r11.get(r14)
            com.google.photos.vision.barhopper.g r16 = (com.google.photos.vision.barhopper.C34118g) r16
            int r8 = r16.mo99084B()
            java.lang.Object r16 = r11.get(r14)
            com.google.photos.vision.barhopper.g r16 = (com.google.photos.vision.barhopper.C34118g) r16
            int r9 = r16.mo99085C()
            r15.<init>(r8, r9)
            r12[r14] = r15
            int r14 = r14 + 1
            goto L_0x0411
        L_0x0435:
            r22 = r12
        L_0x0437:
            int r7 = r7.mo99120B()
            r8 = -1
            int r7 = r7 + r8
            switch(r7) {
                case 1: goto L_0x0462;
                case 2: goto L_0x045f;
                case 3: goto L_0x045b;
                case 4: goto L_0x0458;
                case 5: goto L_0x0456;
                case 6: goto L_0x0454;
                case 7: goto L_0x0452;
                case 8: goto L_0x044f;
                case 9: goto L_0x044c;
                case 10: goto L_0x0449;
                case 11: goto L_0x0446;
                case 12: goto L_0x0443;
                default: goto L_0x0440;
            }
        L_0x0440:
            r23 = r13
            goto L_0x0464
        L_0x0443:
            r9 = 12
            goto L_0x045c
        L_0x0446:
            r9 = 11
            goto L_0x045c
        L_0x0449:
            r9 = 10
            goto L_0x045c
        L_0x044c:
            r9 = 9
            goto L_0x045c
        L_0x044f:
            r23 = 8
            goto L_0x0464
        L_0x0452:
            r9 = 7
            goto L_0x045c
        L_0x0454:
            r9 = 6
            goto L_0x045c
        L_0x0456:
            r9 = 5
            goto L_0x045c
        L_0x0458:
            r23 = 4
            goto L_0x0464
        L_0x045b:
            r9 = 3
        L_0x045c:
            r23 = r9
            goto L_0x0464
        L_0x045f:
            r23 = 2
            goto L_0x0464
        L_0x0462:
            r23 = 1
        L_0x0464:
            r17 = r3
            r18 = r4
            r19 = r10
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            r5.add(r3)
            r3 = r8
            r4 = r13
            goto L_0x0092
        L_0x0474:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.mlkit.vision.barcode.bundled.internal.C34003a.mo98919V3(com.google.android.gms.dynamic.d, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzbu):java.util.List");
    }

    /* renamed from: d */
    public final void mo98920d() {
        InputStream open;
        if (this.f82598p == null) {
            this.f82598p = new BarhopperV3();
            C32467i B = C32468j.m131390B();
            C32464f B2 = C32465g.m131384B();
            int i = 16;
            int i2 = 0;
            for (int i3 = 0; i3 < 6; i3++) {
                C32461c B3 = C32462d.m131376B();
                B3.mo94472u(i);
                B3.mo94473v(i);
                for (int i4 = 0; i4 < f82594q[i3]; i4++) {
                    double[] dArr = f82595r[i2];
                    float f = (float) (dArr[0] * 320.0d);
                    float sqrt = (float) Math.sqrt(dArr[1]);
                    B3.mo94470s(f / sqrt);
                    B3.mo94471t(f * sqrt);
                    i2++;
                }
                i += i;
                B2.mo94474s(B3);
            }
            B.mo94475s(B2);
            try {
                InputStream open2 = this.f82596n.getAssets().open("mlkit_barcode_models/barcode_ssd_mobilenet_v1_dmp25_quant.tflite");
                try {
                    InputStream open3 = this.f82596n.getAssets().open("mlkit_barcode_models/oned_auto_regressor_mobile.tflite");
                    try {
                        open = this.f82596n.getAssets().open("mlkit_barcode_models/oned_feature_extractor_mobile.tflite");
                        C32470l B4 = C32459a.m131367B();
                        B.mo94476t(zzdc.m161080l0(open2));
                        B4.mo94477s(B);
                        C32472n B5 = C32473o.m131399B();
                        B5.mo94479s(zzdc.m161080l0(open3));
                        B5.mo94480t(zzdc.m161080l0(open));
                        B4.mo94478t(B5);
                        ((BarhopperV3) C40843u.m166202l(this.f82598p)).mo87770b((C32459a) B4.mo122918q());
                        if (open != null) {
                            open.close();
                        }
                        if (open3 != null) {
                            open3.close();
                        }
                        if (open2 != null) {
                            open2.close();
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        if (open3 != null) {
                            open3.close();
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    if (open2 != null) {
                        open2.close();
                    }
                    throw th2;
                }
            } catch (IOException e) {
                throw new IllegalStateException("Failed to open Barcode models", e);
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
        } else {
            return;
        }
        throw th;
    }

    /* renamed from: e */
    public final void mo98921e() {
        BarhopperV3 barhopperV3 = this.f82598p;
        if (barhopperV3 != null) {
            barhopperV3.close();
            this.f82598p = null;
        }
    }
}
