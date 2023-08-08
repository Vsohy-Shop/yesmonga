package androidx.compose.p004ui.platform;

import android.content.res.Configuration;
import androidx.annotation.RestrictTo;
import androidx.compose.p004ui.C8762h;
import androidx.compose.p004ui.text.input.C16303l0;
import androidx.compose.p004ui.text.input.C16321t0;
import androidx.compose.p004ui.unit.LayoutDirection;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nAndroidComposeView.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidComposeView.android.kt\nandroidx/compose/ui/platform/AndroidComposeView_androidKt\n+ 2 Matrix.kt\nandroidx/compose/ui/graphics/Matrix\n*L\n1#1,1941:1\n42#2,2:1942\n42#2,2:1944\n42#2,2:1946\n42#2,2:1948\n42#2,2:1950\n42#2,2:1952\n42#2,2:1954\n42#2,2:1956\n42#2,2:1958\n42#2,2:1960\n42#2,2:1962\n42#2,2:1964\n42#2,2:1966\n42#2,2:1968\n42#2,2:1970\n42#2,2:1972\n39#2:1974\n39#2:1975\n39#2:1976\n39#2:1977\n*S KotlinDebug\n*F\n+ 1 AndroidComposeView.android.kt\nandroidx/compose/ui/platform/AndroidComposeView_androidKt\n*L\n1838#1:1942,2\n1839#1:1944,2\n1840#1:1946,2\n1841#1:1948,2\n1842#1:1950,2\n1843#1:1952,2\n1844#1:1954,2\n1845#1:1956,2\n1846#1:1958,2\n1847#1:1960,2\n1848#1:1962,2\n1849#1:1964,2\n1850#1:1966,2\n1851#1:1968,2\n1852#1:1970,2\n1853#1:1972,2\n1858#1:1974\n1859#1:1975\n1860#1:1976\n1861#1:1977\n*E\n"})
/* renamed from: androidx.compose.ui.platform.AndroidComposeView_androidKt */
public final class AndroidComposeView_androidKt {
    @C12579k
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})

    /* renamed from: a */
    public static C11300l<? super C16303l0, ? extends C16321t0> f39267a = AndroidComposeView_androidKt$textInputServiceFactory$1.f39268f;

    /* renamed from: c */
    public static final float m70938c(float[] fArr, int i, float[] fArr2, int i2) {
        int i3 = i * 4;
        return (fArr[i3 + 0] * fArr2[0 + i2]) + (fArr[i3 + 1] * fArr2[4 + i2]) + (fArr[i3 + 2] * fArr2[8 + i2]) + (fArr[i3 + 3] * fArr2[12 + i2]);
    }

    @C12579k
    /* renamed from: d */
    public static final LayoutDirection m70939d(@C12579k Configuration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "<this>");
        return m70942g(configuration.getLayoutDirection());
    }

    @C12579k
    /* renamed from: e */
    public static final C11300l<C16303l0, C16321t0> m70940e() {
        return f39267a;
    }

    @C8762h
    /* renamed from: f */
    public static /* synthetic */ void m70941f() {
    }

    /* renamed from: g */
    public static final LayoutDirection m70942g(int i) {
        if (i == 0) {
            return LayoutDirection.Ltr;
        }
        if (i != 1) {
            return LayoutDirection.Ltr;
        }
        return LayoutDirection.Rtl;
    }

    /* renamed from: h */
    public static final void m70943h(float[] fArr, float[] fArr2) {
        float[] fArr3 = fArr;
        float[] fArr4 = fArr2;
        float c = m70938c(fArr4, 0, fArr3, 0);
        float c2 = m70938c(fArr4, 0, fArr3, 1);
        float c3 = m70938c(fArr4, 0, fArr3, 2);
        float c4 = m70938c(fArr4, 0, fArr3, 3);
        float c5 = m70938c(fArr4, 1, fArr3, 0);
        float c6 = m70938c(fArr4, 1, fArr3, 1);
        float c7 = m70938c(fArr4, 1, fArr3, 2);
        float c8 = m70938c(fArr4, 1, fArr3, 3);
        float c9 = m70938c(fArr4, 2, fArr3, 0);
        float c10 = m70938c(fArr4, 2, fArr3, 1);
        float c11 = m70938c(fArr4, 2, fArr3, 2);
        float c12 = m70938c(fArr4, 2, fArr3, 3);
        float c13 = m70938c(fArr4, 3, fArr3, 0);
        float c14 = m70938c(fArr4, 3, fArr3, 1);
        float c15 = m70938c(fArr4, 3, fArr3, 2);
        float c16 = m70938c(fArr4, 3, fArr3, 3);
        fArr3[0] = c;
        fArr3[1] = c2;
        fArr3[2] = c3;
        fArr3[3] = c4;
        fArr3[4] = c5;
        fArr3[5] = c6;
        fArr3[6] = c7;
        fArr3[7] = c8;
        fArr3[8] = c9;
        fArr3[9] = c10;
        fArr3[10] = c11;
        fArr3[11] = c12;
        fArr3[12] = c13;
        fArr3[13] = c14;
        fArr3[14] = c15;
        fArr3[15] = c16;
    }

    /* renamed from: i */
    public static final void m70944i(@C12579k C11300l<? super C16303l0, ? extends C16321t0> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "<set-?>");
        f39267a = lVar;
    }
}
