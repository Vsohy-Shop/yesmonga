package com.google.android.gms.common.util;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.internal.C40808s;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

@C40473a
@C40974d0
/* renamed from: com.google.android.gms.common.util.b */
public final class C40965b {
    @C40473a
    @C0359n0
    /* renamed from: a */
    public static <T> T[] m166575a(@C0359n0 T[]... tArr) {
        if (tArr.length == 0) {
            return (Object[]) Array.newInstance(tArr.getClass(), 0);
        }
        int i = 0;
        for (T[] length : tArr) {
            i += length.length;
        }
        T[] copyOf = Arrays.copyOf(tArr[0], i);
        int length2 = tArr[0].length;
        for (int i2 = 1; i2 < tArr.length; i2++) {
            T[] tArr2 = tArr[i2];
            int length3 = tArr2.length;
            System.arraycopy(tArr2, 0, copyOf, length2, length3);
            length2 += length3;
        }
        return copyOf;
    }

    @C40473a
    @C0359n0
    /* renamed from: b */
    public static byte[] m166576b(@C0359n0 byte[]... bArr) {
        if (bArr.length == 0) {
            return new byte[0];
        }
        int i = 0;
        for (byte[] length : bArr) {
            i += length.length;
        }
        byte[] copyOf = Arrays.copyOf(bArr[0], i);
        int length2 = bArr[0].length;
        for (int i2 = 1; i2 < bArr.length; i2++) {
            byte[] bArr2 = bArr[i2];
            int length3 = bArr2.length;
            System.arraycopy(bArr2, 0, copyOf, length2, length3);
            length2 += length3;
        }
        return copyOf;
    }

    @C40473a
    /* renamed from: c */
    public static boolean m166577c(@C0359n0 int[] iArr, int i) {
        if (iArr == null) {
            return false;
        }
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    @C40473a
    /* renamed from: d */
    public static <T> boolean m166578d(@C0359n0 T[] tArr, @C0359n0 T t) {
        int i;
        if (tArr != null) {
            i = tArr.length;
        } else {
            i = 0;
        }
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            } else if (!C40808s.m166010b(tArr[i2], t)) {
                i2++;
            } else if (i2 >= 0) {
                return true;
            }
        }
        return false;
    }

    @C40473a
    @C0359n0
    /* renamed from: e */
    public static <T> ArrayList<T> m166579e() {
        return new ArrayList<>();
    }

    @C0363p0
    @C40473a
    /* renamed from: f */
    public static <T> T[] m166580f(@C0359n0 T[] tArr, @C0359n0 T... tArr2) {
        int length;
        int i;
        if (tArr == null) {
            return null;
        }
        if (tArr2 == null || (length = tArr2.length) == 0) {
            return Arrays.copyOf(tArr, tArr.length);
        }
        T[] tArr3 = (Object[]) Array.newInstance(tArr2.getClass().getComponentType(), r3);
        if (length == 1) {
            i = 0;
            for (T t : tArr) {
                if (!C40808s.m166010b(tArr2[0], t)) {
                    tArr3[i] = t;
                    i++;
                }
            }
        } else {
            int i2 = 0;
            for (T t2 : tArr) {
                if (!m166578d(tArr2, t2)) {
                    tArr3[i2] = t2;
                    i2++;
                }
            }
            i = i2;
        }
        if (tArr3 == null) {
            return null;
        }
        if (i == tArr3.length) {
            return tArr3;
        }
        return Arrays.copyOf(tArr3, i);
    }

    @C40473a
    @C0359n0
    /* renamed from: g */
    public static <T> ArrayList<T> m166581g(@C0359n0 T[] tArr) {
        ArrayList<T> arrayList = new ArrayList<>(r0);
        for (T add : tArr) {
            arrayList.add(add);
        }
        return arrayList;
    }

    @C40473a
    @C0359n0
    /* renamed from: h */
    public static int[] m166582h(@C0359n0 Collection<Integer> collection) {
        int i = 0;
        if (collection == null || collection.isEmpty()) {
            return new int[0];
        }
        int[] iArr = new int[collection.size()];
        for (Integer intValue : collection) {
            iArr[i] = intValue.intValue();
            i++;
        }
        return iArr;
    }

    @C0363p0
    @C40473a
    /* renamed from: i */
    public static Integer[] m166583i(@C0359n0 int[] iArr) {
        if (iArr == null) {
            return null;
        }
        int length = iArr.length;
        Integer[] numArr = new Integer[length];
        for (int i = 0; i < length; i++) {
            numArr[i] = Integer.valueOf(iArr[i]);
        }
        return numArr;
    }

    @C40473a
    /* renamed from: j */
    public static void m166584j(@C0359n0 StringBuilder sb, @C0359n0 double[] dArr) {
        int length = dArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(",");
            }
            sb.append(Double.toString(dArr[i]));
        }
    }

    @C40473a
    /* renamed from: k */
    public static void m166585k(@C0359n0 StringBuilder sb, @C0359n0 float[] fArr) {
        int length = fArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(",");
            }
            sb.append(Float.toString(fArr[i]));
        }
    }

    @C40473a
    /* renamed from: l */
    public static void m166586l(@C0359n0 StringBuilder sb, @C0359n0 int[] iArr) {
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(",");
            }
            sb.append(Integer.toString(iArr[i]));
        }
    }

    @C40473a
    /* renamed from: m */
    public static void m166587m(@C0359n0 StringBuilder sb, @C0359n0 long[] jArr) {
        int length = jArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(",");
            }
            sb.append(Long.toString(jArr[i]));
        }
    }

    @C40473a
    /* renamed from: n */
    public static <T> void m166588n(@C0359n0 StringBuilder sb, @C0359n0 T[] tArr) {
        int length = tArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(",");
            }
            sb.append(tArr[i]);
        }
    }

    @C40473a
    /* renamed from: o */
    public static void m166589o(@C0359n0 StringBuilder sb, @C0359n0 boolean[] zArr) {
        int length = zArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(",");
            }
            sb.append(Boolean.toString(zArr[i]));
        }
    }

    @C40473a
    /* renamed from: p */
    public static void m166590p(@C0359n0 StringBuilder sb, @C0359n0 String[] strArr) {
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(",");
            }
            sb.append("\"");
            sb.append(strArr[i]);
            sb.append("\"");
        }
    }
}
