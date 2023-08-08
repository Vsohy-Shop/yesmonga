package androidx.compose.p004ui.graphics;

import androidx.compose.p004ui.geometry.C15092d;
import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.geometry.C15096g;
import androidx.compose.p004ui.geometry.C15098i;
import androidx.lifecycle.C19456p0;
import java.util.Arrays;
import kotlin.jvm.C11288f;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__IndentKt;
import org.jetbrains.annotations.C12579k;

@C11288f
@C11363r0({"SMAP\nMatrix.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Matrix.kt\nandroidx/compose/ui/graphics/Matrix\n*L\n1#1,440:1\n39#1:441\n39#1:442\n39#1:443\n42#1,2:444\n42#1,2:446\n42#1,2:448\n42#1,2:450\n42#1,2:452\n42#1,2:454\n42#1,2:456\n42#1,2:458\n42#1,2:460\n42#1,2:462\n42#1,2:464\n42#1,2:466\n42#1,2:468\n42#1,2:470\n42#1,2:472\n42#1,2:474\n39#1:476\n39#1:477\n39#1:478\n39#1:479\n39#1:480\n39#1:481\n39#1:482\n39#1:483\n39#1:484\n39#1:485\n39#1:486\n39#1:487\n39#1:488\n39#1:489\n39#1:490\n39#1:491\n39#1:492\n39#1:493\n39#1:494\n39#1:495\n42#1,2:496\n42#1,2:498\n42#1,2:500\n42#1,2:502\n42#1,2:504\n42#1,2:506\n42#1,2:508\n42#1,2:510\n42#1,2:512\n42#1,2:514\n42#1,2:516\n42#1,2:518\n42#1,2:520\n42#1,2:522\n42#1,2:524\n42#1,2:526\n42#1,2:528\n39#1:530\n39#1:531\n39#1:532\n39#1:533\n39#1:534\n39#1:535\n39#1:536\n39#1:537\n42#1,2:538\n42#1,2:540\n42#1,2:542\n42#1,2:544\n42#1,2:546\n42#1,2:548\n42#1,2:550\n42#1,2:552\n39#1:554\n39#1:555\n39#1:556\n39#1:557\n39#1:558\n39#1:559\n39#1:560\n39#1:561\n42#1,2:562\n42#1,2:564\n42#1,2:566\n42#1,2:568\n42#1,2:570\n42#1,2:572\n42#1,2:574\n42#1,2:576\n39#1:578\n39#1:579\n39#1:580\n39#1:581\n39#1:582\n39#1:583\n39#1:584\n39#1:585\n42#1,2:586\n42#1,2:588\n42#1,2:590\n42#1,2:592\n42#1,2:594\n42#1,2:596\n42#1,2:598\n42#1,2:600\n39#1,5:602\n39#1,5:607\n39#1,5:612\n39#1,5:617\n39#1,5:622\n39#1,5:627\n39#1,5:632\n39#1,5:637\n39#1,5:642\n39#1,5:647\n39#1,5:652\n39#1,5:657\n39#1:662\n39#1:663\n39#1:664\n39#1:665\n39#1:666\n39#1:667\n39#1:668\n39#1:669\n39#1:670\n39#1:671\n39#1:672\n39#1:673\n39#1:674\n39#1:675\n39#1:676\n39#1:677\n42#1,2:678\n42#1,2:680\n42#1,2:682\n42#1,2:684\n*S KotlinDebug\n*F\n+ 1 Matrix.kt\nandroidx/compose/ui/graphics/Matrix\n*L\n51#1:441\n56#1:442\n57#1:443\n112#1:444,2\n113#1:446,2\n114#1:448,2\n115#1:450,2\n116#1:452,2\n117#1:454,2\n118#1:456,2\n119#1:458,2\n120#1:460,2\n121#1:462,2\n122#1:464,2\n123#1:466,2\n124#1:468,2\n125#1:470,2\n126#1:472,2\n127#1:474,2\n132#1:476\n133#1:477\n134#1:478\n135#1:479\n143#1:480\n144#1:481\n145#1:482\n146#1:483\n147#1:484\n148#1:485\n149#1:486\n150#1:487\n151#1:488\n152#1:489\n153#1:490\n154#1:491\n155#1:492\n156#1:493\n157#1:494\n158#1:495\n177#1:496,2\n178#1:498,2\n179#1:500,2\n180#1:502,2\n181#1:504,2\n182#1:506,2\n183#1:508,2\n184#1:510,2\n185#1:512,2\n186#1:514,2\n187#1:516,2\n188#1:518,2\n189#1:520,2\n190#1:522,2\n191#1:524,2\n192#1:526,2\n201#1:528,2\n220#1:530\n221#1:531\n225#1:532\n226#1:533\n230#1:534\n231#1:535\n235#1:536\n236#1:537\n240#1:538,2\n241#1:540,2\n242#1:542,2\n243#1:544,2\n244#1:546,2\n245#1:548,2\n246#1:550,2\n247#1:552,2\n257#1:554\n258#1:555\n262#1:556\n263#1:557\n267#1:558\n268#1:559\n272#1:560\n273#1:561\n277#1:562,2\n278#1:564,2\n279#1:566,2\n280#1:568,2\n281#1:570,2\n282#1:572,2\n283#1:574,2\n284#1:576,2\n294#1:578\n295#1:579\n299#1:580\n300#1:581\n304#1:582\n305#1:583\n309#1:584\n310#1:585\n314#1:586,2\n315#1:588,2\n316#1:590,2\n317#1:592,2\n318#1:594,2\n319#1:596,2\n320#1:598,2\n321#1:600,2\n326#1:602,5\n327#1:607,5\n328#1:612,5\n329#1:617,5\n330#1:622,5\n331#1:627,5\n332#1:632,5\n333#1:637,5\n334#1:642,5\n335#1:647,5\n336#1:652,5\n337#1:657,5\n342#1:662\n343#1:663\n344#1:664\n345#1:665\n346#1:666\n347#1:667\n348#1:668\n349#1:669\n350#1:670\n351#1:671\n352#1:672\n353#1:673\n354#1:674\n355#1:675\n356#1:676\n357#1:677\n358#1:678,2\n359#1:680,2\n360#1:682,2\n361#1:684,2\n*E\n"})
/* renamed from: androidx.compose.ui.graphics.a3 */
public final class C15112a3 {
    @C12579k

    /* renamed from: b */
    public static final C15113a f37327b = new C15113a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final int f37328c = 0;

    /* renamed from: d */
    public static final int f37329d = 1;

    /* renamed from: e */
    public static final int f37330e = 3;

    /* renamed from: f */
    public static final int f37331f = 4;

    /* renamed from: g */
    public static final int f37332g = 5;

    /* renamed from: h */
    public static final int f37333h = 7;

    /* renamed from: i */
    public static final int f37334i = 10;

    /* renamed from: j */
    public static final int f37335j = 12;

    /* renamed from: k */
    public static final int f37336k = 13;

    /* renamed from: l */
    public static final int f37337l = 14;

    /* renamed from: m */
    public static final int f37338m = 15;
    @C12579k

    /* renamed from: a */
    public final float[] f37339a;

    /* renamed from: androidx.compose.ui.graphics.a3$a */
    public static final class C15113a {
        public /* synthetic */ C15113a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C15113a() {
        }
    }

    public /* synthetic */ C15112a3(float[] fArr) {
        this.f37339a = fArr;
    }

    /* renamed from: a */
    public static final /* synthetic */ C15112a3 m65152a(float[] fArr) {
        return new C15112a3(fArr);
    }

    @C12579k
    /* renamed from: b */
    public static float[] m65153b(@C12579k float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, C19456p0.f49833g);
        return fArr;
    }

    /* renamed from: c */
    public static /* synthetic */ float[] m65154c(float[] fArr, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            fArr = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
        }
        return m65153b(fArr);
    }

    /* renamed from: d */
    public static boolean m65155d(float[] fArr, Object obj) {
        return (obj instanceof C15112a3) && Intrinsics.areEqual((Object) fArr, (Object) ((C15112a3) obj).mo42417y());
    }

    /* renamed from: e */
    public static final boolean m65156e(float[] fArr, float[] fArr2) {
        return Intrinsics.areEqual((Object) fArr, (Object) fArr2);
    }

    /* renamed from: f */
    public static final float m65157f(float[] fArr, int i, int i2) {
        return fArr[(i * 4) + i2];
    }

    /* renamed from: h */
    public static int m65158h(float[] fArr) {
        return Arrays.hashCode(fArr);
    }

    /* renamed from: i */
    public static final void m65159i(float[] fArr) {
        boolean z;
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[6];
        float f8 = fArr[7];
        float f9 = fArr[8];
        float f10 = fArr[9];
        float f11 = fArr[10];
        float f12 = fArr[11];
        float f13 = fArr[12];
        float f14 = fArr[13];
        float f15 = fArr[14];
        float f16 = fArr[15];
        float f17 = (f * f6) - (f2 * f5);
        float f18 = (f * f7) - (f3 * f5);
        float f19 = (f * f8) - (f4 * f5);
        float f20 = (f2 * f7) - (f3 * f6);
        float f21 = (f2 * f8) - (f4 * f6);
        float f22 = (f3 * f8) - (f4 * f7);
        float f23 = (f9 * f14) - (f10 * f13);
        float f24 = (f9 * f15) - (f11 * f13);
        float f25 = (f9 * f16) - (f12 * f13);
        float f26 = (f10 * f15) - (f11 * f14);
        float f27 = (f10 * f16) - (f12 * f14);
        float f28 = (f11 * f16) - (f12 * f15);
        float f29 = (((((f17 * f28) - (f18 * f27)) + (f19 * f26)) + (f20 * f25)) - (f21 * f24)) + (f22 * f23);
        if (f29 == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            float f30 = 1.0f / f29;
            fArr[0] = (((f6 * f28) - (f7 * f27)) + (f8 * f26)) * f30;
            fArr[1] = ((((-f2) * f28) + (f3 * f27)) - (f4 * f26)) * f30;
            fArr[2] = (((f14 * f22) - (f15 * f21)) + (f16 * f20)) * f30;
            fArr[3] = ((((-f10) * f22) + (f11 * f21)) - (f12 * f20)) * f30;
            float f31 = -f5;
            fArr[4] = (((f31 * f28) + (f7 * f25)) - (f8 * f24)) * f30;
            fArr[5] = (((f28 * f) - (f3 * f25)) + (f4 * f24)) * f30;
            float f32 = -f13;
            fArr[6] = (((f32 * f22) + (f15 * f19)) - (f16 * f18)) * f30;
            fArr[7] = (((f22 * f9) - (f11 * f19)) + (f12 * f18)) * f30;
            fArr[8] = (((f5 * f27) - (f6 * f25)) + (f8 * f23)) * f30;
            fArr[9] = ((((-f) * f27) + (f25 * f2)) - (f4 * f23)) * f30;
            fArr[10] = (((f13 * f21) - (f14 * f19)) + (f16 * f17)) * f30;
            fArr[11] = ((((-f9) * f21) + (f19 * f10)) - (f12 * f17)) * f30;
            fArr[12] = (((f31 * f26) + (f6 * f24)) - (f7 * f23)) * f30;
            fArr[13] = (((f * f26) - (f2 * f24)) + (f3 * f23)) * f30;
            fArr[14] = (((f32 * f20) + (f14 * f18)) - (f15 * f17)) * f30;
            fArr[15] = (((f9 * f20) - (f10 * f18)) + (f11 * f17)) * f30;
        }
    }

    /* renamed from: j */
    public static final long m65160j(float[] fArr, long j) {
        boolean z;
        float p = C15094f.m64880p(j);
        float r = C15094f.m64882r(j);
        float f = ((float) 1) / (((fArr[3] * p) + (fArr[7] * r)) + fArr[15]);
        if (Float.isInfinite(f) || Float.isNaN(f)) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            f = 0.0f;
        }
        return C15096g.m64898a(((fArr[0] * p) + (fArr[4] * r) + fArr[12]) * f, f * ((fArr[1] * p) + (fArr[5] * r) + fArr[13]));
    }

    @C12579k
    /* renamed from: k */
    public static final C15098i m65161k(float[] fArr, @C12579k C15098i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "rect");
        long j = m65160j(fArr, C15096g.m64898a(iVar.mo42279t(), iVar.mo42249B()));
        long j2 = m65160j(fArr, C15096g.m64898a(iVar.mo42279t(), iVar.mo42271j()));
        long j3 = m65160j(fArr, C15096g.m64898a(iVar.mo42283x(), iVar.mo42249B()));
        long j4 = m65160j(fArr, C15096g.m64898a(iVar.mo42283x(), iVar.mo42271j()));
        return new C15098i(Math.min(Math.min(C15094f.m64880p(j), C15094f.m64880p(j2)), Math.min(C15094f.m64880p(j3), C15094f.m64880p(j4))), Math.min(Math.min(C15094f.m64882r(j), C15094f.m64882r(j2)), Math.min(C15094f.m64882r(j3), C15094f.m64882r(j4))), Math.max(Math.max(C15094f.m64880p(j), C15094f.m64880p(j2)), Math.max(C15094f.m64880p(j3), C15094f.m64880p(j4))), Math.max(Math.max(C15094f.m64882r(j), C15094f.m64882r(j2)), Math.max(C15094f.m64882r(j3), C15094f.m64882r(j4))));
    }

    /* renamed from: l */
    public static final void m65162l(float[] fArr, @C12579k C15092d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "rect");
        long j = m65160j(fArr, C15096g.m64898a(dVar.mo42229d(), dVar.mo42232g()));
        long j2 = m65160j(fArr, C15096g.m64898a(dVar.mo42229d(), dVar.mo42227b()));
        long j3 = m65160j(fArr, C15096g.m64898a(dVar.mo42230e(), dVar.mo42232g()));
        long j4 = m65160j(fArr, C15096g.m64898a(dVar.mo42230e(), dVar.mo42227b()));
        dVar.mo42238m(Math.min(Math.min(C15094f.m64880p(j), C15094f.m64880p(j2)), Math.min(C15094f.m64880p(j3), C15094f.m64880p(j4))));
        dVar.mo42240o(Math.min(Math.min(C15094f.m64882r(j), C15094f.m64882r(j2)), Math.min(C15094f.m64882r(j3), C15094f.m64882r(j4))));
        dVar.mo42239n(Math.max(Math.max(C15094f.m64880p(j), C15094f.m64880p(j2)), Math.max(C15094f.m64880p(j3), C15094f.m64880p(j4))));
        dVar.mo42237l(Math.max(Math.max(C15094f.m64882r(j), C15094f.m64882r(j2)), Math.max(C15094f.m64882r(j3), C15094f.m64882r(j4))));
    }

    /* renamed from: m */
    public static final void m65163m(float[] fArr) {
        int i = 0;
        while (i < 4) {
            int i2 = 0;
            while (i2 < 4) {
                fArr[(i2 * 4) + i] = i == i2 ? 1.0f : 0.0f;
                i2++;
            }
            i++;
        }
    }

    /* renamed from: n */
    public static final void m65164n(float[] fArr, float f) {
        double d = (((double) f) * 3.141592653589793d) / 180.0d;
        float cos = (float) Math.cos(d);
        float sin = (float) Math.sin(d);
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[5];
        float f5 = fArr[6];
        float f6 = fArr[9];
        float f7 = fArr[10];
        float f8 = fArr[13];
        float f9 = fArr[14];
        fArr[1] = (f2 * cos) - (f3 * sin);
        fArr[2] = (f2 * sin) + (f3 * cos);
        fArr[5] = (f4 * cos) - (f5 * sin);
        fArr[6] = (f4 * sin) + (f5 * cos);
        fArr[9] = (f6 * cos) - (f7 * sin);
        fArr[10] = (f6 * sin) + (f7 * cos);
        fArr[13] = (f8 * cos) - (f9 * sin);
        fArr[14] = (f8 * sin) + (f9 * cos);
    }

    /* renamed from: o */
    public static final void m65165o(float[] fArr, float f) {
        double d = (((double) f) * 3.141592653589793d) / 180.0d;
        float cos = (float) Math.cos(d);
        float sin = (float) Math.sin(d);
        float f2 = fArr[0];
        float f3 = fArr[2];
        float f4 = fArr[4];
        float f5 = fArr[6];
        float f6 = fArr[8];
        float f7 = fArr[10];
        float f8 = fArr[12];
        float f9 = fArr[14];
        fArr[0] = (f2 * cos) + (f3 * sin);
        fArr[2] = ((-f2) * sin) + (f3 * cos);
        fArr[4] = (f4 * cos) + (f5 * sin);
        fArr[6] = ((-f4) * sin) + (f5 * cos);
        fArr[8] = (f6 * cos) + (f7 * sin);
        fArr[10] = ((-f6) * sin) + (f7 * cos);
        fArr[12] = (f8 * cos) + (f9 * sin);
        fArr[14] = ((-f8) * sin) + (f9 * cos);
    }

    /* renamed from: p */
    public static final void m65166p(float[] fArr, float f) {
        double d = (((double) f) * 3.141592653589793d) / 180.0d;
        float cos = (float) Math.cos(d);
        float sin = (float) Math.sin(d);
        float f2 = fArr[0];
        float f3 = fArr[4];
        float f4 = -sin;
        float f5 = fArr[1];
        float f6 = fArr[5];
        float f7 = fArr[2];
        float f8 = fArr[6];
        float f9 = fArr[3];
        float f10 = fArr[7];
        fArr[0] = (cos * f2) + (sin * f3);
        fArr[1] = (cos * f5) + (sin * f6);
        fArr[2] = (cos * f7) + (sin * f8);
        fArr[3] = (cos * f9) + (sin * f10);
        fArr[4] = (f2 * f4) + (f3 * cos);
        fArr[5] = (f5 * f4) + (f6 * cos);
        fArr[6] = (f7 * f4) + (f8 * cos);
        fArr[7] = (f4 * f9) + (cos * f10);
    }

    /* renamed from: q */
    public static final void m65167q(float[] fArr, float f, float f2, float f3) {
        fArr[0] = fArr[0] * f;
        fArr[1] = fArr[1] * f;
        fArr[2] = fArr[2] * f;
        fArr[3] = fArr[3] * f;
        fArr[4] = fArr[4] * f2;
        fArr[5] = fArr[5] * f2;
        fArr[6] = fArr[6] * f2;
        fArr[7] = fArr[7] * f2;
        fArr[8] = fArr[8] * f3;
        fArr[9] = fArr[9] * f3;
        fArr[10] = fArr[10] * f3;
        fArr[11] = fArr[11] * f3;
    }

    /* renamed from: r */
    public static /* synthetic */ void m65168r(float[] fArr, float f, float f2, float f3, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        if ((i & 2) != 0) {
            f2 = 1.0f;
        }
        if ((i & 4) != 0) {
            f3 = 1.0f;
        }
        m65167q(fArr, f, f2, f3);
    }

    /* renamed from: s */
    public static final void m65169s(float[] fArr, int i, int i2, float f) {
        fArr[(i * 4) + i2] = f;
    }

    /* renamed from: t */
    public static final void m65170t(float[] fArr, @C12579k float[] fArr2) {
        Intrinsics.checkNotNullParameter(fArr2, "matrix");
        for (int i = 0; i < 16; i++) {
            fArr[i] = fArr2[i];
        }
    }

    /* renamed from: u */
    public static final void m65171u(float[] fArr, @C12579k float[] fArr2) {
        float[] fArr3 = fArr;
        float[] fArr4 = fArr2;
        Intrinsics.checkNotNullParameter(fArr4, "m");
        float a = C15120b3.m65235b(fArr3, 0, fArr4, 0);
        float a2 = C15120b3.m65235b(fArr3, 0, fArr4, 1);
        float a3 = C15120b3.m65235b(fArr3, 0, fArr4, 2);
        float a4 = C15120b3.m65235b(fArr3, 0, fArr4, 3);
        float a5 = C15120b3.m65235b(fArr3, 1, fArr4, 0);
        float a6 = C15120b3.m65235b(fArr3, 1, fArr4, 1);
        float a7 = C15120b3.m65235b(fArr3, 1, fArr4, 2);
        float a8 = C15120b3.m65235b(fArr3, 1, fArr4, 3);
        float a9 = C15120b3.m65235b(fArr3, 2, fArr4, 0);
        float a10 = C15120b3.m65235b(fArr3, 2, fArr4, 1);
        float a11 = C15120b3.m65235b(fArr3, 2, fArr4, 2);
        float a12 = C15120b3.m65235b(fArr3, 2, fArr4, 3);
        float a13 = C15120b3.m65235b(fArr3, 3, fArr4, 0);
        float a14 = C15120b3.m65235b(fArr3, 3, fArr4, 1);
        float a15 = C15120b3.m65235b(fArr3, 3, fArr4, 2);
        float a16 = C15120b3.m65235b(fArr3, 3, fArr4, 3);
        fArr3[0] = a;
        fArr3[1] = a2;
        fArr3[2] = a3;
        fArr3[3] = a4;
        fArr3[4] = a5;
        fArr3[5] = a6;
        fArr3[6] = a7;
        fArr3[7] = a8;
        fArr3[8] = a9;
        fArr3[9] = a10;
        fArr3[10] = a11;
        fArr3[11] = a12;
        fArr3[12] = a13;
        fArr3[13] = a14;
        fArr3[14] = a15;
        fArr3[15] = a16;
    }

    @C12579k
    /* renamed from: v */
    public static String m65172v(float[] fArr) {
        return StringsKt__IndentKt.trimIndent("\n            |" + fArr[0] + ' ' + fArr[1] + ' ' + fArr[2] + ' ' + fArr[3] + "|\n            |" + fArr[4] + ' ' + fArr[5] + ' ' + fArr[6] + ' ' + fArr[7] + "|\n            |" + fArr[8] + ' ' + fArr[9] + ' ' + fArr[10] + ' ' + fArr[11] + "|\n            |" + fArr[12] + ' ' + fArr[13] + ' ' + fArr[14] + ' ' + fArr[15] + "|\n        ");
    }

    /* renamed from: w */
    public static final void m65173w(float[] fArr, float f, float f2, float f3) {
        float f4 = (fArr[0] * f) + (fArr[4] * f2) + (fArr[8] * f3) + fArr[12];
        float f5 = (fArr[1] * f) + (fArr[5] * f2) + (fArr[9] * f3) + fArr[13];
        float f6 = (fArr[2] * f) + (fArr[6] * f2) + (fArr[10] * f3) + fArr[14];
        fArr[12] = f4;
        fArr[13] = f5;
        fArr[14] = f6;
        fArr[15] = (fArr[3] * f) + (fArr[7] * f2) + (fArr[11] * f3) + fArr[15];
    }

    /* renamed from: x */
    public static /* synthetic */ void m65174x(float[] fArr, float f, float f2, float f3, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        m65173w(fArr, f, f2, f3);
    }

    public boolean equals(Object obj) {
        return m65155d(this.f37339a, obj);
    }

    @C12579k
    /* renamed from: g */
    public final float[] mo42414g() {
        return this.f37339a;
    }

    public int hashCode() {
        return m65158h(this.f37339a);
    }

    @C12579k
    public String toString() {
        return m65172v(this.f37339a);
    }

    /* renamed from: y */
    public final /* synthetic */ float[] mo42417y() {
        return this.f37339a;
    }
}
