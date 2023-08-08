package androidx.compose.p004ui.graphics;

import android.graphics.Matrix;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nAndroidMatrixConversions.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidMatrixConversions.android.kt\nandroidx/compose/ui/graphics/AndroidMatrixConversions_androidKt\n+ 2 Matrix.kt\nandroidx/compose/ui/graphics/Matrix\n*L\n1#1,112:1\n39#2:113\n39#2:114\n39#2:115\n39#2:116\n39#2:117\n39#2:118\n39#2:119\n*S KotlinDebug\n*F\n+ 1 AndroidMatrixConversions.android.kt\nandroidx/compose/ui/graphics/AndroidMatrixConversions_androidKt\n*L\n58#1:113\n59#1:114\n60#1:115\n61#1:116\n62#1:117\n63#1:118\n64#1:119\n*E\n"})
/* renamed from: androidx.compose.ui.graphics.l0 */
public final class C15256l0 {
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ba  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m66173a(@org.jetbrains.annotations.C12579k android.graphics.Matrix r23, @org.jetbrains.annotations.C12579k float[] r24) {
        /*
            r0 = r24
            java.lang.String r1 = "$this$setFrom"
            r2 = r23
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r1)
            java.lang.String r1 = "matrix"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r1 = 2
            r3 = r0[r1]
            r4 = 0
            int r5 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            r6 = 1
            r7 = 0
            if (r5 != 0) goto L_0x001a
            r5 = r6
            goto L_0x001b
        L_0x001a:
            r5 = r7
        L_0x001b:
            r8 = 8
            r9 = 6
            if (r5 == 0) goto L_0x006e
            r5 = r0[r9]
            int r5 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r5 != 0) goto L_0x0028
            r5 = r6
            goto L_0x0029
        L_0x0028:
            r5 = r7
        L_0x0029:
            if (r5 == 0) goto L_0x006e
            r5 = 10
            r5 = r0[r5]
            r10 = 1065353216(0x3f800000, float:1.0)
            int r5 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r5 != 0) goto L_0x0037
            r5 = r6
            goto L_0x0038
        L_0x0037:
            r5 = r7
        L_0x0038:
            if (r5 == 0) goto L_0x006e
            r5 = 14
            r5 = r0[r5]
            int r5 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r5 != 0) goto L_0x0044
            r5 = r6
            goto L_0x0045
        L_0x0044:
            r5 = r7
        L_0x0045:
            if (r5 == 0) goto L_0x006e
            r5 = r0[r8]
            int r5 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r5 != 0) goto L_0x004f
            r5 = r6
            goto L_0x0050
        L_0x004f:
            r5 = r7
        L_0x0050:
            if (r5 == 0) goto L_0x006e
            r5 = 9
            r5 = r0[r5]
            int r5 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r5 != 0) goto L_0x005c
            r5 = r6
            goto L_0x005d
        L_0x005c:
            r5 = r7
        L_0x005d:
            if (r5 == 0) goto L_0x006e
            r5 = 11
            r5 = r0[r5]
            int r4 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r4 != 0) goto L_0x0069
            r4 = r6
            goto L_0x006a
        L_0x0069:
            r4 = r7
        L_0x006a:
            if (r4 == 0) goto L_0x006e
            r4 = r6
            goto L_0x006f
        L_0x006e:
            r4 = r7
        L_0x006f:
            if (r4 == 0) goto L_0x00ba
            r4 = r0[r7]
            r5 = r0[r6]
            r10 = 3
            r11 = r0[r10]
            r12 = 4
            r13 = r0[r12]
            r14 = 5
            r15 = r0[r14]
            r16 = r0[r9]
            r17 = 7
            r18 = r0[r17]
            r19 = r0[r8]
            r20 = 12
            r20 = r0[r20]
            r21 = 13
            r21 = r0[r21]
            r22 = 15
            r22 = r0[r22]
            r0[r7] = r4
            r0[r6] = r13
            r0[r1] = r20
            r0[r10] = r5
            r0[r12] = r15
            r0[r14] = r21
            r0[r9] = r11
            r0[r17] = r18
            r0[r8] = r22
            r23.setValues(r24)
            r0[r7] = r4
            r0[r6] = r5
            r0[r1] = r3
            r0[r10] = r11
            r0[r12] = r13
            r0[r14] = r15
            r0[r9] = r16
            r0[r17] = r18
            r0[r8] = r19
            return
        L_0x00ba:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Android does not support arbitrary transforms"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.graphics.C15256l0.m66173a(android.graphics.Matrix, float[]):void");
    }

    /* renamed from: b */
    public static final void m66174b(@C12579k float[] fArr, @C12579k Matrix matrix) {
        float[] fArr2 = fArr;
        Matrix matrix2 = matrix;
        Intrinsics.checkNotNullParameter(fArr2, "$this$setFrom");
        Intrinsics.checkNotNullParameter(matrix2, "matrix");
        matrix2.getValues(fArr2);
        float f = fArr2[0];
        float f2 = fArr2[1];
        float f3 = fArr2[2];
        float f4 = fArr2[3];
        float f5 = fArr2[4];
        float f6 = fArr2[5];
        float f7 = fArr2[6];
        float f8 = fArr2[7];
        float f9 = fArr2[8];
        fArr2[0] = f;
        fArr2[1] = f4;
        fArr2[2] = 0.0f;
        fArr2[3] = f7;
        fArr2[4] = f2;
        fArr2[5] = f5;
        fArr2[6] = 0.0f;
        fArr2[7] = f8;
        fArr2[8] = 0.0f;
        fArr2[9] = 0.0f;
        fArr2[10] = 1.0f;
        fArr2[11] = 0.0f;
        fArr2[12] = f3;
        fArr2[13] = f6;
        fArr2[14] = 0.0f;
        fArr2[15] = f9;
    }
}
