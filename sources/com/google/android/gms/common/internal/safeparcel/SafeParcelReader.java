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
import java.util.ArrayList;
import java.util.List;

public class SafeParcelReader {

    public static class ParseException extends RuntimeException {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public ParseException(@androidx.annotation.C0359n0 java.lang.String r3, @androidx.annotation.C0359n0 android.os.Parcel r4) {
            /*
                r2 = this;
                int r0 = r4.dataPosition()
                int r4 = r4.dataSize()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r3)
                java.lang.String r3 = " Parcel: pos="
                r1.append(r3)
                r1.append(r0)
                java.lang.String r3 = " size="
                r1.append(r3)
                r1.append(r4)
                java.lang.String r3 = r1.toString()
                r2.<init>(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException.<init>(java.lang.String, android.os.Parcel):void");
        }
    }

    @C0359n0
    /* renamed from: A */
    public static ArrayList<Parcel> m166017A(@C0359n0 Parcel parcel, int i) {
        int g0 = m166056g0(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (g0 == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        ArrayList<Parcel> arrayList = new ArrayList<>();
        for (int i2 = 0; i2 < readInt; i2++) {
            int readInt2 = parcel.readInt();
            if (readInt2 != 0) {
                int dataPosition2 = parcel.dataPosition();
                Parcel obtain = Parcel.obtain();
                obtain.appendFrom(parcel, dataPosition2, readInt2);
                arrayList.add(obtain);
                parcel.setDataPosition(dataPosition2 + readInt2);
            } else {
                arrayList.add((Object) null);
            }
        }
        parcel.setDataPosition(dataPosition + g0);
        return arrayList;
    }

    @C0359n0
    /* renamed from: B */
    public static SparseArray<Parcel> m166018B(@C0359n0 Parcel parcel, int i) {
        int g0 = m166056g0(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (g0 == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        SparseArray<Parcel> sparseArray = new SparseArray<>();
        for (int i2 = 0; i2 < readInt; i2++) {
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            if (readInt3 != 0) {
                int dataPosition2 = parcel.dataPosition();
                Parcel obtain = Parcel.obtain();
                obtain.appendFrom(parcel, dataPosition2, readInt3);
                sparseArray.append(readInt2, obtain);
                parcel.setDataPosition(dataPosition2 + readInt3);
            } else {
                sparseArray.append(readInt2, (Object) null);
            }
        }
        parcel.setDataPosition(dataPosition + g0);
        return sparseArray;
    }

    @C0359n0
    /* renamed from: C */
    public static <T extends Parcelable> T m166019C(@C0359n0 Parcel parcel, int i, @C0359n0 Parcelable.Creator<T> creator) {
        int g0 = m166056g0(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (g0 == 0) {
            return null;
        }
        T t = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + g0);
        return t;
    }

    @C0359n0
    /* renamed from: D */
    public static SparseBooleanArray m166020D(@C0359n0 Parcel parcel, int i) {
        int g0 = m166056g0(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (g0 == 0) {
            return null;
        }
        SparseBooleanArray readSparseBooleanArray = parcel.readSparseBooleanArray();
        parcel.setDataPosition(dataPosition + g0);
        return readSparseBooleanArray;
    }

    @C0359n0
    /* renamed from: E */
    public static SparseIntArray m166021E(@C0359n0 Parcel parcel, int i) {
        int g0 = m166056g0(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (g0 == 0) {
            return null;
        }
        SparseIntArray sparseIntArray = new SparseIntArray();
        int readInt = parcel.readInt();
        for (int i2 = 0; i2 < readInt; i2++) {
            sparseIntArray.append(parcel.readInt(), parcel.readInt());
        }
        parcel.setDataPosition(dataPosition + g0);
        return sparseIntArray;
    }

    @C0359n0
    /* renamed from: F */
    public static SparseLongArray m166022F(@C0359n0 Parcel parcel, int i) {
        int g0 = m166056g0(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (g0 == 0) {
            return null;
        }
        SparseLongArray sparseLongArray = new SparseLongArray();
        int readInt = parcel.readInt();
        for (int i2 = 0; i2 < readInt; i2++) {
            sparseLongArray.append(parcel.readInt(), parcel.readLong());
        }
        parcel.setDataPosition(dataPosition + g0);
        return sparseLongArray;
    }

    @C0359n0
    /* renamed from: G */
    public static String m166023G(@C0359n0 Parcel parcel, int i) {
        int g0 = m166056g0(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (g0 == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + g0);
        return readString;
    }

    @C0359n0
    /* renamed from: H */
    public static String[] m166024H(@C0359n0 Parcel parcel, int i) {
        int g0 = m166056g0(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (g0 == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + g0);
        return createStringArray;
    }

    @C0359n0
    /* renamed from: I */
    public static ArrayList<String> m166025I(@C0359n0 Parcel parcel, int i) {
        int g0 = m166056g0(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (g0 == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + g0);
        return createStringArrayList;
    }

    @C0359n0
    /* renamed from: J */
    public static SparseArray<String> m166026J(@C0359n0 Parcel parcel, int i) {
        int g0 = m166056g0(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (g0 == 0) {
            return null;
        }
        SparseArray<String> sparseArray = new SparseArray<>();
        int readInt = parcel.readInt();
        for (int i2 = 0; i2 < readInt; i2++) {
            sparseArray.append(parcel.readInt(), parcel.readString());
        }
        parcel.setDataPosition(dataPosition + g0);
        return sparseArray;
    }

    @C0359n0
    /* renamed from: K */
    public static <T> T[] m166027K(@C0359n0 Parcel parcel, int i, @C0359n0 Parcelable.Creator<T> creator) {
        int g0 = m166056g0(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (g0 == 0) {
            return null;
        }
        T[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + g0);
        return createTypedArray;
    }

    @C0359n0
    /* renamed from: L */
    public static <T> ArrayList<T> m166028L(@C0359n0 Parcel parcel, int i, @C0359n0 Parcelable.Creator<T> creator) {
        int g0 = m166056g0(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (g0 == 0) {
            return null;
        }
        ArrayList<T> createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + g0);
        return createTypedArrayList;
    }

    @C0359n0
    /* renamed from: M */
    public static <T> SparseArray<T> m166029M(@C0359n0 Parcel parcel, int i, @C0359n0 Parcelable.Creator<T> creator) {
        T t;
        int g0 = m166056g0(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (g0 == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        SparseArray<T> sparseArray = new SparseArray<>();
        for (int i2 = 0; i2 < readInt; i2++) {
            int readInt2 = parcel.readInt();
            if (parcel.readInt() != 0) {
                t = creator.createFromParcel(parcel);
            } else {
                t = null;
            }
            sparseArray.append(readInt2, t);
        }
        parcel.setDataPosition(dataPosition + g0);
        return sparseArray;
    }

    /* renamed from: N */
    public static void m166030N(@C0359n0 Parcel parcel, int i) {
        if (parcel.dataPosition() != i) {
            throw new ParseException("Overread allowed size end=" + i, parcel);
        }
    }

    /* renamed from: O */
    public static int m166031O(int i) {
        return (char) i;
    }

    /* renamed from: P */
    public static boolean m166032P(@C0359n0 Parcel parcel, int i) {
        m166064k0(parcel, i, 4);
        if (parcel.readInt() != 0) {
            return true;
        }
        return false;
    }

    @C0359n0
    /* renamed from: Q */
    public static Boolean m166033Q(@C0359n0 Parcel parcel, int i) {
        boolean z;
        int g0 = m166056g0(parcel, i);
        if (g0 == 0) {
            return null;
        }
        m166062j0(parcel, i, g0, 4);
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* renamed from: R */
    public static byte m166034R(@C0359n0 Parcel parcel, int i) {
        m166064k0(parcel, i, 4);
        return (byte) parcel.readInt();
    }

    /* renamed from: S */
    public static char m166035S(@C0359n0 Parcel parcel, int i) {
        m166064k0(parcel, i, 4);
        return (char) parcel.readInt();
    }

    /* renamed from: T */
    public static double m166036T(@C0359n0 Parcel parcel, int i) {
        m166064k0(parcel, i, 8);
        return parcel.readDouble();
    }

    @C0359n0
    /* renamed from: U */
    public static Double m166037U(@C0359n0 Parcel parcel, int i) {
        int g0 = m166056g0(parcel, i);
        if (g0 == 0) {
            return null;
        }
        m166062j0(parcel, i, g0, 8);
        return Double.valueOf(parcel.readDouble());
    }

    /* renamed from: V */
    public static float m166038V(@C0359n0 Parcel parcel, int i) {
        m166064k0(parcel, i, 4);
        return parcel.readFloat();
    }

    @C0359n0
    /* renamed from: W */
    public static Float m166039W(@C0359n0 Parcel parcel, int i) {
        int g0 = m166056g0(parcel, i);
        if (g0 == 0) {
            return null;
        }
        m166062j0(parcel, i, g0, 4);
        return Float.valueOf(parcel.readFloat());
    }

    /* renamed from: X */
    public static int m166040X(@C0359n0 Parcel parcel) {
        return parcel.readInt();
    }

    @C0359n0
    /* renamed from: Y */
    public static IBinder m166041Y(@C0359n0 Parcel parcel, int i) {
        int g0 = m166056g0(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (g0 == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + g0);
        return readStrongBinder;
    }

    /* renamed from: Z */
    public static int m166042Z(@C0359n0 Parcel parcel, int i) {
        m166064k0(parcel, i, 4);
        return parcel.readInt();
    }

    @C0359n0
    /* renamed from: a */
    public static BigDecimal m166043a(@C0359n0 Parcel parcel, int i) {
        int g0 = m166056g0(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (g0 == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        int readInt = parcel.readInt();
        parcel.setDataPosition(dataPosition + g0);
        return new BigDecimal(new BigInteger(createByteArray), readInt);
    }

    @C0359n0
    /* renamed from: a0 */
    public static Integer m166044a0(@C0359n0 Parcel parcel, int i) {
        int g0 = m166056g0(parcel, i);
        if (g0 == 0) {
            return null;
        }
        m166062j0(parcel, i, g0, 4);
        return Integer.valueOf(parcel.readInt());
    }

    @C0359n0
    /* renamed from: b */
    public static BigDecimal[] m166045b(@C0359n0 Parcel parcel, int i) {
        int g0 = m166056g0(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (g0 == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        BigDecimal[] bigDecimalArr = new BigDecimal[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            byte[] createByteArray = parcel.createByteArray();
            bigDecimalArr[i2] = new BigDecimal(new BigInteger(createByteArray), parcel.readInt());
        }
        parcel.setDataPosition(dataPosition + g0);
        return bigDecimalArr;
    }

    /* renamed from: b0 */
    public static void m166046b0(@C0359n0 Parcel parcel, int i, @C0359n0 List list, @C0359n0 ClassLoader classLoader) {
        int g0 = m166056g0(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (g0 != 0) {
            parcel.readList(list, classLoader);
            parcel.setDataPosition(dataPosition + g0);
        }
    }

    @C0359n0
    /* renamed from: c */
    public static BigInteger m166047c(@C0359n0 Parcel parcel, int i) {
        int g0 = m166056g0(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (g0 == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + g0);
        return new BigInteger(createByteArray);
    }

    /* renamed from: c0 */
    public static long m166048c0(@C0359n0 Parcel parcel, int i) {
        m166064k0(parcel, i, 8);
        return parcel.readLong();
    }

    @C0359n0
    /* renamed from: d */
    public static BigInteger[] m166049d(@C0359n0 Parcel parcel, int i) {
        int g0 = m166056g0(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (g0 == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        BigInteger[] bigIntegerArr = new BigInteger[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            bigIntegerArr[i2] = new BigInteger(parcel.createByteArray());
        }
        parcel.setDataPosition(dataPosition + g0);
        return bigIntegerArr;
    }

    @C0359n0
    /* renamed from: d0 */
    public static Long m166050d0(@C0359n0 Parcel parcel, int i) {
        int g0 = m166056g0(parcel, i);
        if (g0 == 0) {
            return null;
        }
        m166062j0(parcel, i, g0, 8);
        return Long.valueOf(parcel.readLong());
    }

    @C0359n0
    /* renamed from: e */
    public static boolean[] m166051e(@C0359n0 Parcel parcel, int i) {
        int g0 = m166056g0(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (g0 == 0) {
            return null;
        }
        boolean[] createBooleanArray = parcel.createBooleanArray();
        parcel.setDataPosition(dataPosition + g0);
        return createBooleanArray;
    }

    @C0359n0
    /* renamed from: e0 */
    public static PendingIntent m166052e0(@C0359n0 Parcel parcel, int i) {
        int g0 = m166056g0(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (g0 == 0) {
            return null;
        }
        PendingIntent readPendingIntentOrNullFromParcel = PendingIntent.readPendingIntentOrNullFromParcel(parcel);
        parcel.setDataPosition(dataPosition + g0);
        return readPendingIntentOrNullFromParcel;
    }

    @C0359n0
    /* renamed from: f */
    public static ArrayList<Boolean> m166053f(@C0359n0 Parcel parcel, int i) {
        boolean z;
        int g0 = m166056g0(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (g0 == 0) {
            return null;
        }
        ArrayList<Boolean> arrayList = new ArrayList<>();
        int readInt = parcel.readInt();
        for (int i2 = 0; i2 < readInt; i2++) {
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            arrayList.add(Boolean.valueOf(z));
        }
        parcel.setDataPosition(dataPosition + g0);
        return arrayList;
    }

    /* renamed from: f0 */
    public static short m166054f0(@C0359n0 Parcel parcel, int i) {
        m166064k0(parcel, i, 4);
        return (short) parcel.readInt();
    }

    @C0359n0
    /* renamed from: g */
    public static Bundle m166055g(@C0359n0 Parcel parcel, int i) {
        int g0 = m166056g0(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (g0 == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + g0);
        return readBundle;
    }

    /* renamed from: g0 */
    public static int m166056g0(@C0359n0 Parcel parcel, int i) {
        return (i & C17673a.f46025c) != -65536 ? (char) (i >> 16) : parcel.readInt();
    }

    @C0359n0
    /* renamed from: h */
    public static byte[] m166057h(@C0359n0 Parcel parcel, int i) {
        int g0 = m166056g0(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (g0 == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + g0);
        return createByteArray;
    }

    /* renamed from: h0 */
    public static void m166058h0(@C0359n0 Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + m166056g0(parcel, i));
    }

    @C0359n0
    /* renamed from: i */
    public static byte[][] m166059i(@C0359n0 Parcel parcel, int i) {
        int g0 = m166056g0(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (g0 == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        byte[][] bArr = new byte[readInt][];
        for (int i2 = 0; i2 < readInt; i2++) {
            bArr[i2] = parcel.createByteArray();
        }
        parcel.setDataPosition(dataPosition + g0);
        return bArr;
    }

    /* renamed from: i0 */
    public static int m166060i0(@C0359n0 Parcel parcel) {
        int X = m166040X(parcel);
        int g0 = m166056g0(parcel, X);
        int dataPosition = parcel.dataPosition();
        if (m166031O(X) == 20293) {
            int i = g0 + dataPosition;
            if (i >= dataPosition && i <= parcel.dataSize()) {
                return i;
            }
            throw new ParseException("Size read is invalid start=" + dataPosition + " end=" + i, parcel);
        }
        throw new ParseException("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(X))), parcel);
    }

    @C0359n0
    /* renamed from: j */
    public static SparseArray<byte[]> m166061j(@C0359n0 Parcel parcel, int i) {
        int g0 = m166056g0(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (g0 == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        SparseArray<byte[]> sparseArray = new SparseArray<>(readInt);
        for (int i2 = 0; i2 < readInt; i2++) {
            sparseArray.append(parcel.readInt(), parcel.createByteArray());
        }
        parcel.setDataPosition(dataPosition + g0);
        return sparseArray;
    }

    /* renamed from: j0 */
    public static void m166062j0(Parcel parcel, int i, int i2, int i3) {
        if (i2 != i3) {
            String hexString = Integer.toHexString(i2);
            throw new ParseException("Expected size " + i3 + " got " + i2 + " (0x" + hexString + ")", parcel);
        }
    }

    @C0359n0
    /* renamed from: k */
    public static char[] m166063k(@C0359n0 Parcel parcel, int i) {
        int g0 = m166056g0(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (g0 == 0) {
            return null;
        }
        char[] createCharArray = parcel.createCharArray();
        parcel.setDataPosition(dataPosition + g0);
        return createCharArray;
    }

    /* renamed from: k0 */
    public static void m166064k0(Parcel parcel, int i, int i2) {
        int g0 = m166056g0(parcel, i);
        if (g0 != i2) {
            String hexString = Integer.toHexString(g0);
            throw new ParseException("Expected size " + i2 + " got " + g0 + " (0x" + hexString + ")", parcel);
        }
    }

    @C0359n0
    /* renamed from: l */
    public static double[] m166065l(@C0359n0 Parcel parcel, int i) {
        int g0 = m166056g0(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (g0 == 0) {
            return null;
        }
        double[] createDoubleArray = parcel.createDoubleArray();
        parcel.setDataPosition(dataPosition + g0);
        return createDoubleArray;
    }

    @C0359n0
    /* renamed from: m */
    public static ArrayList<Double> m166066m(@C0359n0 Parcel parcel, int i) {
        int g0 = m166056g0(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (g0 == 0) {
            return null;
        }
        ArrayList<Double> arrayList = new ArrayList<>();
        int readInt = parcel.readInt();
        for (int i2 = 0; i2 < readInt; i2++) {
            arrayList.add(Double.valueOf(parcel.readDouble()));
        }
        parcel.setDataPosition(dataPosition + g0);
        return arrayList;
    }

    @C0359n0
    /* renamed from: n */
    public static SparseArray<Double> m166067n(@C0359n0 Parcel parcel, int i) {
        int g0 = m166056g0(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (g0 == 0) {
            return null;
        }
        SparseArray<Double> sparseArray = new SparseArray<>();
        int readInt = parcel.readInt();
        for (int i2 = 0; i2 < readInt; i2++) {
            sparseArray.append(parcel.readInt(), Double.valueOf(parcel.readDouble()));
        }
        parcel.setDataPosition(dataPosition + g0);
        return sparseArray;
    }

    @C0359n0
    /* renamed from: o */
    public static float[] m166068o(@C0359n0 Parcel parcel, int i) {
        int g0 = m166056g0(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (g0 == 0) {
            return null;
        }
        float[] createFloatArray = parcel.createFloatArray();
        parcel.setDataPosition(dataPosition + g0);
        return createFloatArray;
    }

    @C0359n0
    /* renamed from: p */
    public static ArrayList<Float> m166069p(@C0359n0 Parcel parcel, int i) {
        int g0 = m166056g0(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (g0 == 0) {
            return null;
        }
        ArrayList<Float> arrayList = new ArrayList<>();
        int readInt = parcel.readInt();
        for (int i2 = 0; i2 < readInt; i2++) {
            arrayList.add(Float.valueOf(parcel.readFloat()));
        }
        parcel.setDataPosition(dataPosition + g0);
        return arrayList;
    }

    @C0359n0
    /* renamed from: q */
    public static SparseArray<Float> m166070q(@C0359n0 Parcel parcel, int i) {
        int g0 = m166056g0(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (g0 == 0) {
            return null;
        }
        SparseArray<Float> sparseArray = new SparseArray<>();
        int readInt = parcel.readInt();
        for (int i2 = 0; i2 < readInt; i2++) {
            sparseArray.append(parcel.readInt(), Float.valueOf(parcel.readFloat()));
        }
        parcel.setDataPosition(dataPosition + g0);
        return sparseArray;
    }

    @C0359n0
    /* renamed from: r */
    public static IBinder[] m166071r(@C0359n0 Parcel parcel, int i) {
        int g0 = m166056g0(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (g0 == 0) {
            return null;
        }
        IBinder[] createBinderArray = parcel.createBinderArray();
        parcel.setDataPosition(dataPosition + g0);
        return createBinderArray;
    }

    @C0359n0
    /* renamed from: s */
    public static ArrayList<IBinder> m166072s(@C0359n0 Parcel parcel, int i) {
        int g0 = m166056g0(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (g0 == 0) {
            return null;
        }
        ArrayList<IBinder> createBinderArrayList = parcel.createBinderArrayList();
        parcel.setDataPosition(dataPosition + g0);
        return createBinderArrayList;
    }

    @C0359n0
    /* renamed from: t */
    public static SparseArray<IBinder> m166073t(@C0359n0 Parcel parcel, int i) {
        int g0 = m166056g0(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (g0 == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        SparseArray<IBinder> sparseArray = new SparseArray<>(readInt);
        for (int i2 = 0; i2 < readInt; i2++) {
            sparseArray.append(parcel.readInt(), parcel.readStrongBinder());
        }
        parcel.setDataPosition(dataPosition + g0);
        return sparseArray;
    }

    @C0359n0
    /* renamed from: u */
    public static int[] m166074u(@C0359n0 Parcel parcel, int i) {
        int g0 = m166056g0(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (g0 == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + g0);
        return createIntArray;
    }

    @C0359n0
    /* renamed from: v */
    public static ArrayList<Integer> m166075v(@C0359n0 Parcel parcel, int i) {
        int g0 = m166056g0(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (g0 == 0) {
            return null;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        int readInt = parcel.readInt();
        for (int i2 = 0; i2 < readInt; i2++) {
            arrayList.add(Integer.valueOf(parcel.readInt()));
        }
        parcel.setDataPosition(dataPosition + g0);
        return arrayList;
    }

    @C0359n0
    /* renamed from: w */
    public static long[] m166076w(@C0359n0 Parcel parcel, int i) {
        int g0 = m166056g0(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (g0 == 0) {
            return null;
        }
        long[] createLongArray = parcel.createLongArray();
        parcel.setDataPosition(dataPosition + g0);
        return createLongArray;
    }

    @C0359n0
    /* renamed from: x */
    public static ArrayList<Long> m166077x(@C0359n0 Parcel parcel, int i) {
        int g0 = m166056g0(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (g0 == 0) {
            return null;
        }
        ArrayList<Long> arrayList = new ArrayList<>();
        int readInt = parcel.readInt();
        for (int i2 = 0; i2 < readInt; i2++) {
            arrayList.add(Long.valueOf(parcel.readLong()));
        }
        parcel.setDataPosition(dataPosition + g0);
        return arrayList;
    }

    @C0359n0
    /* renamed from: y */
    public static Parcel m166078y(@C0359n0 Parcel parcel, int i) {
        int g0 = m166056g0(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (g0 == 0) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        obtain.appendFrom(parcel, dataPosition, g0);
        parcel.setDataPosition(dataPosition + g0);
        return obtain;
    }

    @C0359n0
    /* renamed from: z */
    public static Parcel[] m166079z(@C0359n0 Parcel parcel, int i) {
        int g0 = m166056g0(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (g0 == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        Parcel[] parcelArr = new Parcel[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            int readInt2 = parcel.readInt();
            if (readInt2 != 0) {
                int dataPosition2 = parcel.dataPosition();
                Parcel obtain = Parcel.obtain();
                obtain.appendFrom(parcel, dataPosition2, readInt2);
                parcelArr[i2] = obtain;
                parcel.setDataPosition(dataPosition2 + readInt2);
            } else {
                parcelArr[i2] = null;
            }
        }
        parcel.setDataPosition(dataPosition + g0);
        return parcelArr;
    }
}
