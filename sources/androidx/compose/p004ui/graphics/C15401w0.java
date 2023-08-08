package androidx.compose.p004ui.graphics;

import android.graphics.BitmapShader;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.os.Build;
import androidx.annotation.C0344h1;
import androidx.compose.p004ui.geometry.C15094f;
import com.urbanairship.iam.C9127a0;
import com.usabilla.sdk.ubform.net.parser.C9874a;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nAndroidShader.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidShader.android.kt\nandroidx/compose/ui/graphics/AndroidShader_androidKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,205:1\n69#2,6:206\n*S KotlinDebug\n*F\n+ 1 AndroidShader.android.kt\nandroidx/compose/ui/graphics/AndroidShader_androidKt\n*L\n141#1:206,6\n*E\n"})
/* renamed from: androidx.compose.ui.graphics.w0 */
public final class C15401w0 {
    @C12579k
    /* renamed from: a */
    public static final Shader m67259a(@C12579k C15403w2 w2Var, int i, int i2) {
        Intrinsics.checkNotNullParameter(w2Var, C9127a0.f24709d);
        return new BitmapShader(C15247k0.m66138b(w2Var), C15414y0.m67300b(i), C15414y0.m67300b(i2));
    }

    @C12579k
    /* renamed from: b */
    public static final Shader m67260b(long j, long j2, @C12579k List<C15240j2> list, @C12580l List<Float> list2, int i) {
        List<C15240j2> list3 = list;
        Intrinsics.checkNotNullParameter(list, C9874a.f27063h);
        m67266h(list, list2);
        int e = m67263e(list);
        return new LinearGradient(C15094f.m64880p(j), C15094f.m64882r(j), C15094f.m64880p(j2), C15094f.m64882r(j2), m67264f(list, e), m67265g(list2, list, e), C15414y0.m67300b(i));
    }

    @C12579k
    /* renamed from: c */
    public static final Shader m67261c(long j, float f, @C12579k List<C15240j2> list, @C12580l List<Float> list2, int i) {
        Intrinsics.checkNotNullParameter(list, C9874a.f27063h);
        m67266h(list, list2);
        int e = m67263e(list);
        return new RadialGradient(C15094f.m64880p(j), C15094f.m64882r(j), f, m67264f(list, e), m67265g(list2, list, e), C15414y0.m67300b(i));
    }

    @C12579k
    /* renamed from: d */
    public static final Shader m67262d(long j, @C12579k List<C15240j2> list, @C12580l List<Float> list2) {
        Intrinsics.checkNotNullParameter(list, C9874a.f27063h);
        m67266h(list, list2);
        int e = m67263e(list);
        return new SweepGradient(C15094f.m64880p(j), C15094f.m64882r(j), m67264f(list, e), m67265g(list2, list, e));
    }

    @C0344h1
    /* renamed from: e */
    public static final int m67263e(@C12579k List<C15240j2> list) {
        boolean z;
        Intrinsics.checkNotNullParameter(list, C9874a.f27063h);
        if (Build.VERSION.SDK_INT >= 26) {
            return 0;
        }
        int G = CollectionsKt__CollectionsKt.m40443G(list);
        int i = 0;
        for (int i2 = 1; i2 < G; i2++) {
            if (C15240j2.m66047A(list.get(i2).mo42833M()) == 0.0f) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                i++;
            }
        }
        return i;
    }

    @C0344h1
    @C12579k
    /* renamed from: f */
    public static final int[] m67264f(@C12579k List<C15240j2> list, int i) {
        boolean z;
        int i2;
        List<C15240j2> list2 = list;
        Intrinsics.checkNotNullParameter(list2, C9874a.f27063h);
        if (Build.VERSION.SDK_INT >= 26) {
            int size = list.size();
            int[] iArr = new int[size];
            for (int i3 = 0; i3 < size; i3++) {
                iArr[i3] = C15258l2.m66193r(list2.get(i3).mo42833M());
            }
            return iArr;
        }
        int[] iArr2 = new int[(list.size() + i)];
        int G = CollectionsKt__CollectionsKt.m40443G(list);
        int size2 = list.size();
        int i4 = 0;
        for (int i5 = 0; i5 < size2; i5++) {
            long M = list2.get(i5).mo42833M();
            if (C15240j2.m66047A(M) == 0.0f) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (i5 == 0) {
                    i2 = i4 + 1;
                    iArr2[i4] = C15258l2.m66193r(C15240j2.m66080w(list2.get(1).mo42833M(), 0.0f, 0.0f, 0.0f, 0.0f, 14, (Object) null));
                } else if (i5 == G) {
                    i2 = i4 + 1;
                    iArr2[i4] = C15258l2.m66193r(C15240j2.m66080w(list2.get(i5 - 1).mo42833M(), 0.0f, 0.0f, 0.0f, 0.0f, 14, (Object) null));
                } else {
                    int i6 = i4 + 1;
                    iArr2[i4] = C15258l2.m66193r(C15240j2.m66080w(list2.get(i5 - 1).mo42833M(), 0.0f, 0.0f, 0.0f, 0.0f, 14, (Object) null));
                    i4 = i6 + 1;
                    iArr2[i6] = C15258l2.m66193r(C15240j2.m66080w(list2.get(i5 + 1).mo42833M(), 0.0f, 0.0f, 0.0f, 0.0f, 14, (Object) null));
                }
                i4 = i2;
            } else {
                iArr2[i4] = C15258l2.m66193r(M);
                i4++;
            }
        }
        return iArr2;
    }

    @C0344h1
    @C12580l
    /* renamed from: g */
    public static final float[] m67265g(@C12580l List<Float> list, @C12579k List<C15240j2> list2, int i) {
        float f;
        float f2;
        float f3;
        boolean z;
        Intrinsics.checkNotNullParameter(list2, C9874a.f27063h);
        if (i != 0) {
            float[] fArr = new float[(list2.size() + i)];
            if (list != null) {
                f = list.get(0).floatValue();
            } else {
                f = 0.0f;
            }
            fArr[0] = f;
            int G = CollectionsKt__CollectionsKt.m40443G(list2);
            int i2 = 1;
            for (int i3 = 1; i3 < G; i3++) {
                long M = list2.get(i3).mo42833M();
                if (list != null) {
                    f3 = list.get(i3).floatValue();
                } else {
                    f3 = ((float) i3) / ((float) CollectionsKt__CollectionsKt.m40443G(list2));
                }
                int i4 = i2 + 1;
                fArr[i2] = f3;
                if (C15240j2.m66047A(M) == 0.0f) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    i2 = i4 + 1;
                    fArr[i4] = f3;
                } else {
                    i2 = i4;
                }
            }
            if (list != null) {
                f2 = list.get(CollectionsKt__CollectionsKt.m40443G(list2)).floatValue();
            } else {
                f2 = 1.0f;
            }
            fArr[i2] = f2;
            return fArr;
        } else if (list != null) {
            return CollectionsKt___CollectionsKt.m40542N5(list);
        } else {
            return null;
        }
    }

    /* renamed from: h */
    public static final void m67266h(List<C15240j2> list, List<Float> list2) {
        if (list2 == null) {
            if (list.size() < 2) {
                throw new IllegalArgumentException("colors must have length of at least 2 if colorStops is omitted.");
            }
        } else if (list.size() != list2.size()) {
            throw new IllegalArgumentException("colors and colorStops arguments must have equal length.");
        }
    }
}
