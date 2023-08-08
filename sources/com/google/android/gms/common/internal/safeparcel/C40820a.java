package com.google.android.gms.common.internal.safeparcel;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.util.SparseLongArray;
import androidx.annotation.C0359n0;
import androidx.core.internal.view.C17673a;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

/* renamed from: com.google.android.gms.common.internal.safeparcel.a */
public class C40820a {
    /* renamed from: A */
    public static void m166084A(@C0359n0 Parcel parcel, int i, @C0359n0 SparseArray<Float> sparseArray, boolean z) {
        if (sparseArray != null) {
            int f0 = m166121f0(parcel, i);
            int size = sparseArray.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                parcel.writeInt(sparseArray.keyAt(i2));
                parcel.writeFloat(sparseArray.valueAt(i2).floatValue());
            }
            m166123g0(parcel, f0);
        } else if (z) {
            m166125h0(parcel, i, 0);
        }
    }

    /* renamed from: B */
    public static void m166085B(@C0359n0 Parcel parcel, int i, @C0359n0 IBinder iBinder, boolean z) {
        if (iBinder != null) {
            int f0 = m166121f0(parcel, i);
            parcel.writeStrongBinder(iBinder);
            m166123g0(parcel, f0);
        } else if (z) {
            m166125h0(parcel, i, 0);
        }
    }

    /* renamed from: C */
    public static void m166086C(@C0359n0 Parcel parcel, int i, @C0359n0 IBinder[] iBinderArr, boolean z) {
        if (iBinderArr != null) {
            int f0 = m166121f0(parcel, i);
            parcel.writeBinderArray(iBinderArr);
            m166123g0(parcel, f0);
        } else if (z) {
            m166125h0(parcel, i, 0);
        }
    }

    /* renamed from: D */
    public static void m166087D(@C0359n0 Parcel parcel, int i, @C0359n0 List<IBinder> list, boolean z) {
        if (list != null) {
            int f0 = m166121f0(parcel, i);
            parcel.writeBinderList(list);
            m166123g0(parcel, f0);
        } else if (z) {
            m166125h0(parcel, i, 0);
        }
    }

    /* renamed from: E */
    public static void m166088E(@C0359n0 Parcel parcel, int i, @C0359n0 SparseArray<IBinder> sparseArray, boolean z) {
        if (sparseArray != null) {
            int f0 = m166121f0(parcel, i);
            int size = sparseArray.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                parcel.writeInt(sparseArray.keyAt(i2));
                parcel.writeStrongBinder(sparseArray.valueAt(i2));
            }
            m166123g0(parcel, f0);
        } else if (z) {
            m166125h0(parcel, i, 0);
        }
    }

    /* renamed from: F */
    public static void m166089F(@C0359n0 Parcel parcel, int i, int i2) {
        m166125h0(parcel, i, 4);
        parcel.writeInt(i2);
    }

    /* renamed from: G */
    public static void m166090G(@C0359n0 Parcel parcel, int i, @C0359n0 int[] iArr, boolean z) {
        if (iArr != null) {
            int f0 = m166121f0(parcel, i);
            parcel.writeIntArray(iArr);
            m166123g0(parcel, f0);
        } else if (z) {
            m166125h0(parcel, i, 0);
        }
    }

    /* renamed from: H */
    public static void m166091H(@C0359n0 Parcel parcel, int i, @C0359n0 List<Integer> list, boolean z) {
        if (list != null) {
            int f0 = m166121f0(parcel, i);
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                parcel.writeInt(list.get(i2).intValue());
            }
            m166123g0(parcel, f0);
        } else if (z) {
            m166125h0(parcel, i, 0);
        }
    }

    /* renamed from: I */
    public static void m166092I(@C0359n0 Parcel parcel, int i, @C0359n0 Integer num, boolean z) {
        if (num != null) {
            m166125h0(parcel, i, 4);
            parcel.writeInt(num.intValue());
        } else if (z) {
            m166125h0(parcel, i, 0);
        }
    }

    /* renamed from: J */
    public static void m166093J(@C0359n0 Parcel parcel, int i, @C0359n0 List list, boolean z) {
        if (list != null) {
            int f0 = m166121f0(parcel, i);
            parcel.writeList(list);
            m166123g0(parcel, f0);
        } else if (z) {
            m166125h0(parcel, i, 0);
        }
    }

    /* renamed from: K */
    public static void m166094K(@C0359n0 Parcel parcel, int i, long j) {
        m166125h0(parcel, i, 8);
        parcel.writeLong(j);
    }

    /* renamed from: L */
    public static void m166095L(@C0359n0 Parcel parcel, int i, @C0359n0 long[] jArr, boolean z) {
        if (jArr != null) {
            int f0 = m166121f0(parcel, i);
            parcel.writeLongArray(jArr);
            m166123g0(parcel, f0);
        } else if (z) {
            m166125h0(parcel, i, 0);
        }
    }

    /* renamed from: M */
    public static void m166096M(@C0359n0 Parcel parcel, int i, @C0359n0 List<Long> list, boolean z) {
        if (list != null) {
            int f0 = m166121f0(parcel, i);
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                parcel.writeLong(list.get(i2).longValue());
            }
            m166123g0(parcel, f0);
        } else if (z) {
            m166125h0(parcel, i, 0);
        }
    }

    /* renamed from: N */
    public static void m166097N(@C0359n0 Parcel parcel, int i, @C0359n0 Long l, boolean z) {
        if (l != null) {
            m166125h0(parcel, i, 8);
            parcel.writeLong(l.longValue());
        } else if (z) {
            m166125h0(parcel, i, 0);
        }
    }

    /* renamed from: O */
    public static void m166098O(@C0359n0 Parcel parcel, int i, @C0359n0 Parcel parcel2, boolean z) {
        if (parcel2 != null) {
            int f0 = m166121f0(parcel, i);
            parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            m166123g0(parcel, f0);
        } else if (z) {
            m166125h0(parcel, i, 0);
        }
    }

    /* renamed from: P */
    public static void m166099P(@C0359n0 Parcel parcel, int i, @C0359n0 Parcel[] parcelArr, boolean z) {
        if (parcelArr != null) {
            int f0 = m166121f0(parcel, i);
            parcel.writeInt(r7);
            for (Parcel parcel2 : parcelArr) {
                if (parcel2 != null) {
                    parcel.writeInt(parcel2.dataSize());
                    parcel.appendFrom(parcel2, 0, parcel2.dataSize());
                } else {
                    parcel.writeInt(0);
                }
            }
            m166123g0(parcel, f0);
        } else if (z) {
            m166125h0(parcel, i, 0);
        }
    }

    /* renamed from: Q */
    public static void m166100Q(@C0359n0 Parcel parcel, int i, @C0359n0 List<Parcel> list, boolean z) {
        if (list != null) {
            int f0 = m166121f0(parcel, i);
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                Parcel parcel2 = list.get(i2);
                if (parcel2 != null) {
                    parcel.writeInt(parcel2.dataSize());
                    parcel.appendFrom(parcel2, 0, parcel2.dataSize());
                } else {
                    parcel.writeInt(0);
                }
            }
            m166123g0(parcel, f0);
        } else if (z) {
            m166125h0(parcel, i, 0);
        }
    }

    /* renamed from: R */
    public static void m166101R(@C0359n0 Parcel parcel, int i, @C0359n0 SparseArray<Parcel> sparseArray, boolean z) {
        if (sparseArray != null) {
            int f0 = m166121f0(parcel, i);
            int size = sparseArray.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                parcel.writeInt(sparseArray.keyAt(i2));
                Parcel valueAt = sparseArray.valueAt(i2);
                if (valueAt != null) {
                    parcel.writeInt(valueAt.dataSize());
                    parcel.appendFrom(valueAt, 0, valueAt.dataSize());
                } else {
                    parcel.writeInt(0);
                }
            }
            m166123g0(parcel, f0);
        } else if (z) {
            m166125h0(parcel, i, 0);
        }
    }

    /* renamed from: S */
    public static void m166102S(@C0359n0 Parcel parcel, int i, @C0359n0 Parcelable parcelable, int i2, boolean z) {
        if (parcelable != null) {
            int f0 = m166121f0(parcel, i);
            parcelable.writeToParcel(parcel, i2);
            m166123g0(parcel, f0);
        } else if (z) {
            m166125h0(parcel, i, 0);
        }
    }

    /* renamed from: T */
    public static void m166103T(@C0359n0 Parcel parcel, int i, @C0359n0 PendingIntent pendingIntent, boolean z) {
        if (pendingIntent != null) {
            int f0 = m166121f0(parcel, i);
            PendingIntent.writePendingIntentOrNullToParcel(pendingIntent, parcel);
            m166123g0(parcel, f0);
        } else if (z) {
            m166125h0(parcel, i, 0);
        }
    }

    /* renamed from: U */
    public static void m166104U(@C0359n0 Parcel parcel, int i, short s) {
        m166125h0(parcel, i, 4);
        parcel.writeInt(s);
    }

    /* renamed from: V */
    public static void m166105V(@C0359n0 Parcel parcel, int i, @C0359n0 SparseBooleanArray sparseBooleanArray, boolean z) {
        if (sparseBooleanArray != null) {
            int f0 = m166121f0(parcel, i);
            parcel.writeSparseBooleanArray(sparseBooleanArray);
            m166123g0(parcel, f0);
        } else if (z) {
            m166125h0(parcel, i, 0);
        }
    }

    /* renamed from: W */
    public static void m166106W(@C0359n0 Parcel parcel, int i, @C0359n0 SparseIntArray sparseIntArray, boolean z) {
        if (sparseIntArray != null) {
            int f0 = m166121f0(parcel, i);
            int size = sparseIntArray.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                parcel.writeInt(sparseIntArray.keyAt(i2));
                parcel.writeInt(sparseIntArray.valueAt(i2));
            }
            m166123g0(parcel, f0);
        } else if (z) {
            m166125h0(parcel, i, 0);
        }
    }

    /* renamed from: X */
    public static void m166107X(@C0359n0 Parcel parcel, int i, @C0359n0 SparseLongArray sparseLongArray, boolean z) {
        if (sparseLongArray != null) {
            int f0 = m166121f0(parcel, i);
            int size = sparseLongArray.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                parcel.writeInt(sparseLongArray.keyAt(i2));
                parcel.writeLong(sparseLongArray.valueAt(i2));
            }
            m166123g0(parcel, f0);
        } else if (z) {
            m166125h0(parcel, i, 0);
        }
    }

    /* renamed from: Y */
    public static void m166108Y(@C0359n0 Parcel parcel, int i, @C0359n0 String str, boolean z) {
        if (str != null) {
            int f0 = m166121f0(parcel, i);
            parcel.writeString(str);
            m166123g0(parcel, f0);
        } else if (z) {
            m166125h0(parcel, i, 0);
        }
    }

    /* renamed from: Z */
    public static void m166109Z(@C0359n0 Parcel parcel, int i, @C0359n0 String[] strArr, boolean z) {
        if (strArr != null) {
            int f0 = m166121f0(parcel, i);
            parcel.writeStringArray(strArr);
            m166123g0(parcel, f0);
        } else if (z) {
            m166125h0(parcel, i, 0);
        }
    }

    /* renamed from: a */
    public static int m166110a(@C0359n0 Parcel parcel) {
        return m166121f0(parcel, 20293);
    }

    /* renamed from: a0 */
    public static void m166111a0(@C0359n0 Parcel parcel, int i, @C0359n0 List<String> list, boolean z) {
        if (list != null) {
            int f0 = m166121f0(parcel, i);
            parcel.writeStringList(list);
            m166123g0(parcel, f0);
        } else if (z) {
            m166125h0(parcel, i, 0);
        }
    }

    /* renamed from: b */
    public static void m166112b(@C0359n0 Parcel parcel, int i) {
        m166123g0(parcel, i);
    }

    /* renamed from: b0 */
    public static void m166113b0(@C0359n0 Parcel parcel, int i, @C0359n0 SparseArray<String> sparseArray, boolean z) {
        if (sparseArray != null) {
            int f0 = m166121f0(parcel, i);
            int size = sparseArray.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                parcel.writeInt(sparseArray.keyAt(i2));
                parcel.writeString(sparseArray.valueAt(i2));
            }
            m166123g0(parcel, f0);
        } else if (z) {
            m166125h0(parcel, i, 0);
        }
    }

    /* renamed from: c */
    public static void m166114c(@C0359n0 Parcel parcel, int i, @C0359n0 BigDecimal bigDecimal, boolean z) {
        if (bigDecimal != null) {
            int f0 = m166121f0(parcel, i);
            parcel.writeByteArray(bigDecimal.unscaledValue().toByteArray());
            parcel.writeInt(bigDecimal.scale());
            m166123g0(parcel, f0);
        } else if (z) {
            m166125h0(parcel, i, 0);
        }
    }

    /* renamed from: c0 */
    public static <T extends Parcelable> void m166115c0(@C0359n0 Parcel parcel, int i, @C0359n0 T[] tArr, int i2, boolean z) {
        if (tArr != null) {
            int f0 = m166121f0(parcel, i);
            parcel.writeInt(r7);
            for (T t : tArr) {
                if (t == null) {
                    parcel.writeInt(0);
                } else {
                    m166127i0(parcel, t, i2);
                }
            }
            m166123g0(parcel, f0);
        } else if (z) {
            m166125h0(parcel, i, 0);
        }
    }

    /* renamed from: d */
    public static void m166116d(@C0359n0 Parcel parcel, int i, @C0359n0 BigDecimal[] bigDecimalArr, boolean z) {
        if (bigDecimalArr != null) {
            int f0 = m166121f0(parcel, i);
            int length = bigDecimalArr.length;
            parcel.writeInt(length);
            for (int i2 = 0; i2 < length; i2++) {
                parcel.writeByteArray(bigDecimalArr[i2].unscaledValue().toByteArray());
                parcel.writeInt(bigDecimalArr[i2].scale());
            }
            m166123g0(parcel, f0);
        } else if (z) {
            m166125h0(parcel, i, 0);
        }
    }

    /* renamed from: d0 */
    public static <T extends Parcelable> void m166117d0(@C0359n0 Parcel parcel, int i, @C0359n0 List<T> list, boolean z) {
        if (list != null) {
            int f0 = m166121f0(parcel, i);
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                Parcelable parcelable = (Parcelable) list.get(i2);
                if (parcelable == null) {
                    parcel.writeInt(0);
                } else {
                    m166127i0(parcel, parcelable, 0);
                }
            }
            m166123g0(parcel, f0);
        } else if (z) {
            m166125h0(parcel, i, 0);
        }
    }

    /* renamed from: e */
    public static void m166118e(@C0359n0 Parcel parcel, int i, @C0359n0 BigInteger bigInteger, boolean z) {
        if (bigInteger != null) {
            int f0 = m166121f0(parcel, i);
            parcel.writeByteArray(bigInteger.toByteArray());
            m166123g0(parcel, f0);
        } else if (z) {
            m166125h0(parcel, i, 0);
        }
    }

    /* renamed from: e0 */
    public static <T extends Parcelable> void m166119e0(@C0359n0 Parcel parcel, int i, @C0359n0 SparseArray<T> sparseArray, boolean z) {
        if (sparseArray != null) {
            int f0 = m166121f0(parcel, i);
            int size = sparseArray.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                parcel.writeInt(sparseArray.keyAt(i2));
                Parcelable parcelable = (Parcelable) sparseArray.valueAt(i2);
                if (parcelable == null) {
                    parcel.writeInt(0);
                } else {
                    m166127i0(parcel, parcelable, 0);
                }
            }
            m166123g0(parcel, f0);
        } else if (z) {
            m166125h0(parcel, i, 0);
        }
    }

    /* renamed from: f */
    public static void m166120f(@C0359n0 Parcel parcel, int i, @C0359n0 BigInteger[] bigIntegerArr, boolean z) {
        if (bigIntegerArr != null) {
            int f0 = m166121f0(parcel, i);
            parcel.writeInt(r5);
            for (BigInteger byteArray : bigIntegerArr) {
                parcel.writeByteArray(byteArray.toByteArray());
            }
            m166123g0(parcel, f0);
        } else if (z) {
            m166125h0(parcel, i, 0);
        }
    }

    /* renamed from: f0 */
    public static int m166121f0(Parcel parcel, int i) {
        parcel.writeInt(i | C17673a.f46025c);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    /* renamed from: g */
    public static void m166122g(@C0359n0 Parcel parcel, int i, boolean z) {
        m166125h0(parcel, i, 4);
        parcel.writeInt(z ? 1 : 0);
    }

    /* renamed from: g0 */
    public static void m166123g0(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(dataPosition - i);
        parcel.setDataPosition(dataPosition);
    }

    /* renamed from: h */
    public static void m166124h(@C0359n0 Parcel parcel, int i, @C0359n0 boolean[] zArr, boolean z) {
        if (zArr != null) {
            int f0 = m166121f0(parcel, i);
            parcel.writeBooleanArray(zArr);
            m166123g0(parcel, f0);
        } else if (z) {
            m166125h0(parcel, i, 0);
        }
    }

    /* renamed from: h0 */
    public static void m166125h0(Parcel parcel, int i, int i2) {
        parcel.writeInt(i | (i2 << 16));
    }

    /* renamed from: i */
    public static void m166126i(@C0359n0 Parcel parcel, int i, @C0359n0 List<Boolean> list, boolean z) {
        if (list != null) {
            int f0 = m166121f0(parcel, i);
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                parcel.writeInt(list.get(i2).booleanValue() ? 1 : 0);
            }
            m166123g0(parcel, f0);
        } else if (z) {
            m166125h0(parcel, i, 0);
        }
    }

    /* renamed from: i0 */
    public static void m166127i0(Parcel parcel, Parcelable parcelable, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        parcelable.writeToParcel(parcel, i);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }

    /* renamed from: j */
    public static void m166128j(@C0359n0 Parcel parcel, int i, @C0359n0 Boolean bool, boolean z) {
        if (bool != null) {
            m166125h0(parcel, i, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        } else if (z) {
            m166125h0(parcel, i, 0);
        }
    }

    /* renamed from: k */
    public static void m166129k(@C0359n0 Parcel parcel, int i, @C0359n0 Bundle bundle, boolean z) {
        if (bundle != null) {
            int f0 = m166121f0(parcel, i);
            parcel.writeBundle(bundle);
            m166123g0(parcel, f0);
        } else if (z) {
            m166125h0(parcel, i, 0);
        }
    }

    /* renamed from: l */
    public static void m166130l(@C0359n0 Parcel parcel, int i, byte b) {
        m166125h0(parcel, i, 4);
        parcel.writeInt(b);
    }

    /* renamed from: m */
    public static void m166131m(@C0359n0 Parcel parcel, int i, @C0359n0 byte[] bArr, boolean z) {
        if (bArr != null) {
            int f0 = m166121f0(parcel, i);
            parcel.writeByteArray(bArr);
            m166123g0(parcel, f0);
        } else if (z) {
            m166125h0(parcel, i, 0);
        }
    }

    /* renamed from: n */
    public static void m166132n(@C0359n0 Parcel parcel, int i, @C0359n0 byte[][] bArr, boolean z) {
        if (bArr != null) {
            int f0 = m166121f0(parcel, i);
            parcel.writeInt(r5);
            for (byte[] writeByteArray : bArr) {
                parcel.writeByteArray(writeByteArray);
            }
            m166123g0(parcel, f0);
        } else if (z) {
            m166125h0(parcel, i, 0);
        }
    }

    /* renamed from: o */
    public static void m166133o(@C0359n0 Parcel parcel, int i, @C0359n0 SparseArray<byte[]> sparseArray, boolean z) {
        if (sparseArray != null) {
            int f0 = m166121f0(parcel, i);
            int size = sparseArray.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                parcel.writeInt(sparseArray.keyAt(i2));
                parcel.writeByteArray(sparseArray.valueAt(i2));
            }
            m166123g0(parcel, f0);
        } else if (z) {
            m166125h0(parcel, i, 0);
        }
    }

    /* renamed from: p */
    public static void m166134p(@C0359n0 Parcel parcel, int i, char c) {
        m166125h0(parcel, i, 4);
        parcel.writeInt(c);
    }

    /* renamed from: q */
    public static void m166135q(@C0359n0 Parcel parcel, int i, @C0359n0 char[] cArr, boolean z) {
        if (cArr != null) {
            int f0 = m166121f0(parcel, i);
            parcel.writeCharArray(cArr);
            m166123g0(parcel, f0);
        } else if (z) {
            m166125h0(parcel, i, 0);
        }
    }

    /* renamed from: r */
    public static void m166136r(@C0359n0 Parcel parcel, int i, double d) {
        m166125h0(parcel, i, 8);
        parcel.writeDouble(d);
    }

    /* renamed from: s */
    public static void m166137s(@C0359n0 Parcel parcel, int i, @C0359n0 double[] dArr, boolean z) {
        if (dArr != null) {
            int f0 = m166121f0(parcel, i);
            parcel.writeDoubleArray(dArr);
            m166123g0(parcel, f0);
        } else if (z) {
            m166125h0(parcel, i, 0);
        }
    }

    /* renamed from: t */
    public static void m166138t(@C0359n0 Parcel parcel, int i, @C0359n0 List<Double> list, boolean z) {
        if (list != null) {
            int f0 = m166121f0(parcel, i);
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                parcel.writeDouble(list.get(i2).doubleValue());
            }
            m166123g0(parcel, f0);
        } else if (z) {
            m166125h0(parcel, i, 0);
        }
    }

    /* renamed from: u */
    public static void m166139u(@C0359n0 Parcel parcel, int i, @C0359n0 Double d, boolean z) {
        if (d != null) {
            m166125h0(parcel, i, 8);
            parcel.writeDouble(d.doubleValue());
        } else if (z) {
            m166125h0(parcel, i, 0);
        }
    }

    /* renamed from: v */
    public static void m166140v(@C0359n0 Parcel parcel, int i, @C0359n0 SparseArray<Double> sparseArray, boolean z) {
        if (sparseArray != null) {
            int f0 = m166121f0(parcel, i);
            int size = sparseArray.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                parcel.writeInt(sparseArray.keyAt(i2));
                parcel.writeDouble(sparseArray.valueAt(i2).doubleValue());
            }
            m166123g0(parcel, f0);
        } else if (z) {
            m166125h0(parcel, i, 0);
        }
    }

    /* renamed from: w */
    public static void m166141w(@C0359n0 Parcel parcel, int i, float f) {
        m166125h0(parcel, i, 4);
        parcel.writeFloat(f);
    }

    /* renamed from: x */
    public static void m166142x(@C0359n0 Parcel parcel, int i, @C0359n0 float[] fArr, boolean z) {
        if (fArr != null) {
            int f0 = m166121f0(parcel, i);
            parcel.writeFloatArray(fArr);
            m166123g0(parcel, f0);
        } else if (z) {
            m166125h0(parcel, i, 0);
        }
    }

    /* renamed from: y */
    public static void m166143y(@C0359n0 Parcel parcel, int i, @C0359n0 List<Float> list, boolean z) {
        if (list != null) {
            int f0 = m166121f0(parcel, i);
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                parcel.writeFloat(list.get(i2).floatValue());
            }
            m166123g0(parcel, f0);
        } else if (z) {
            m166125h0(parcel, i, 0);
        }
    }

    /* renamed from: z */
    public static void m166144z(@C0359n0 Parcel parcel, int i, @C0359n0 Float f, boolean z) {
        if (f != null) {
            m166125h0(parcel, i, 4);
            parcel.writeFloat(f.floatValue());
        } else if (z) {
            m166125h0(parcel, i, 0);
        }
    }
}
