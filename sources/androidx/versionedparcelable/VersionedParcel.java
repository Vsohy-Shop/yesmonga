package androidx.versionedparcelable;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.NetworkOnMainThreadException;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseBooleanArray;
import androidx.annotation.C0359n0;
import androidx.annotation.C0376v0;
import androidx.annotation.RestrictTo;
import androidx.collection.C1866a;
import androidx.collection.C1869c;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public abstract class VersionedParcel {

    /* renamed from: d */
    public static final String f53570d = "VersionedParcel";

    /* renamed from: e */
    public static final int f53571e = -1;

    /* renamed from: f */
    public static final int f53572f = -2;

    /* renamed from: g */
    public static final int f53573g = -3;

    /* renamed from: h */
    public static final int f53574h = -4;

    /* renamed from: i */
    public static final int f53575i = -5;

    /* renamed from: j */
    public static final int f53576j = -6;

    /* renamed from: k */
    public static final int f53577k = -7;

    /* renamed from: l */
    public static final int f53578l = -9;

    /* renamed from: m */
    public static final int f53579m = 1;

    /* renamed from: n */
    public static final int f53580n = 2;

    /* renamed from: o */
    public static final int f53581o = 3;

    /* renamed from: p */
    public static final int f53582p = 4;

    /* renamed from: q */
    public static final int f53583q = 5;

    /* renamed from: r */
    public static final int f53584r = 7;

    /* renamed from: s */
    public static final int f53585s = 8;

    /* renamed from: a */
    public final C1866a<String, Method> f53586a;

    /* renamed from: b */
    public final C1866a<String, Method> f53587b;

    /* renamed from: c */
    public final C1866a<String, Class> f53588c;

    public static class ParcelException extends RuntimeException {
        public ParcelException(Throwable th) {
            super(th);
        }
    }

    /* renamed from: androidx.versionedparcelable.VersionedParcel$a */
    public class C20740a extends ObjectInputStream {
        public C20740a(InputStream inputStream) {
            super(inputStream);
        }

        public Class<?> resolveClass(ObjectStreamClass objectStreamClass) throws IOException, ClassNotFoundException {
            Class<?> cls = Class.forName(objectStreamClass.getName(), false, getClass().getClassLoader());
            if (cls != null) {
                return cls;
            }
            return super.resolveClass(objectStreamClass);
        }
    }

    public VersionedParcel(C1866a<String, Method> aVar, C1866a<String, Method> aVar2, C1866a<String, Class> aVar3) {
        this.f53586a = aVar;
        this.f53587b = aVar2;
        this.f53588c = aVar3;
    }

    @C0359n0
    /* renamed from: f */
    public static Throwable m96276f(@C0359n0 Throwable th) {
        while (th.getCause() != null) {
            th = th.getCause();
        }
        return th;
    }

    /* renamed from: A */
    public double[] mo62138A() {
        int L = mo62160L();
        if (L < 0) {
            return null;
        }
        double[] dArr = new double[L];
        for (int i = 0; i < L; i++) {
            dArr[i] = mo62251y();
        }
        return dArr;
    }

    /* renamed from: A0 */
    public final <T> void mo62139A0(Collection<T> collection) {
        if (collection == null) {
            mo62161L0(-1);
            return;
        }
        int size = collection.size();
        mo62161L0(size);
        if (size > 0) {
            int g = mo62207g(collection.iterator().next());
            mo62161L0(g);
            switch (g) {
                case 1:
                    for (T l1 : collection) {
                        mo62224l1(l1);
                    }
                    return;
                case 2:
                    for (T W0 : collection) {
                        mo62183W0(W0);
                    }
                    return;
                case 3:
                    for (T Y0 : collection) {
                        mo62187Y0(Y0);
                    }
                    return;
                case 4:
                    for (T e1 : collection) {
                        mo62204e1(e1);
                    }
                    return;
                case 5:
                    for (T g1 : collection) {
                        mo62209g1(g1);
                    }
                    return;
                case 7:
                    for (T intValue : collection) {
                        mo62161L0(intValue.intValue());
                    }
                    return;
                case 8:
                    for (T floatValue : collection) {
                        mo62153H0(floatValue.floatValue());
                    }
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: B */
    public double[] mo62140B(double[] dArr, int i) {
        if (!mo62148F(i)) {
            return dArr;
        }
        return mo62138A();
    }

    /* renamed from: B0 */
    public final <T> void mo62141B0(Collection<T> collection, int i) {
        mo62214i0(i);
        mo62139A0(collection);
    }

    /* renamed from: C */
    public final Exception mo62142C(int i, String str) {
        return mo62193b(i, str);
    }

    /* renamed from: C0 */
    public abstract void mo62143C0(double d);

    /* renamed from: D */
    public Exception mo62144D(Exception exc, int i) {
        int E;
        if (mo62148F(i) && (E = mo62146E()) != 0) {
            return mo62142C(E, mo62197c0());
        }
        return exc;
    }

    /* renamed from: D0 */
    public void mo62145D0(double d, int i) {
        mo62214i0(i);
        mo62143C0(d);
    }

    /* renamed from: E */
    public final int mo62146E() {
        return mo62160L();
    }

    /* renamed from: E0 */
    public void mo62147E0(double[] dArr) {
        if (dArr != null) {
            mo62161L0(r0);
            for (double C0 : dArr) {
                mo62143C0(C0);
            }
            return;
        }
        mo62161L0(-1);
    }

    /* renamed from: F */
    public abstract boolean mo62148F(int i);

    /* renamed from: F0 */
    public void mo62149F0(double[] dArr, int i) {
        mo62214i0(i);
        mo62147E0(dArr);
    }

    /* renamed from: G */
    public abstract float mo62150G();

    /* renamed from: G0 */
    public void mo62151G0(Exception exc, int i) {
        int i2;
        mo62214i0(i);
        if (exc == null) {
            mo62181V0();
            return;
        }
        if ((exc instanceof Parcelable) && exc.getClass().getClassLoader() == Parcelable.class.getClassLoader()) {
            i2 = -9;
        } else if (exc instanceof SecurityException) {
            i2 = -1;
        } else if (exc instanceof BadParcelableException) {
            i2 = -2;
        } else if (exc instanceof IllegalArgumentException) {
            i2 = -3;
        } else if (exc instanceof NullPointerException) {
            i2 = -4;
        } else if (exc instanceof IllegalStateException) {
            i2 = -5;
        } else if (exc instanceof NetworkOnMainThreadException) {
            i2 = -6;
        } else if (exc instanceof UnsupportedOperationException) {
            i2 = -7;
        } else {
            i2 = 0;
        }
        mo62161L0(i2);
        if (i2 != 0) {
            mo62204e1(exc.getMessage());
            if (i2 == -9) {
                mo62183W0((Parcelable) exc);
            }
        } else if (exc instanceof RuntimeException) {
            throw ((RuntimeException) exc);
        } else {
            throw new RuntimeException(exc);
        }
    }

    /* renamed from: H */
    public float mo62152H(float f, int i) {
        if (!mo62148F(i)) {
            return f;
        }
        return mo62150G();
    }

    /* renamed from: H0 */
    public abstract void mo62153H0(float f);

    /* renamed from: I */
    public float[] mo62154I() {
        int L = mo62160L();
        if (L < 0) {
            return null;
        }
        float[] fArr = new float[L];
        for (int i = 0; i < L; i++) {
            fArr[i] = mo62150G();
        }
        return fArr;
    }

    /* renamed from: I0 */
    public void mo62155I0(float f, int i) {
        mo62214i0(i);
        mo62153H0(f);
    }

    /* renamed from: J */
    public float[] mo62156J(float[] fArr, int i) {
        if (!mo62148F(i)) {
            return fArr;
        }
        return mo62154I();
    }

    /* renamed from: J0 */
    public void mo62157J0(float[] fArr) {
        if (fArr != null) {
            mo62161L0(r0);
            for (float H0 : fArr) {
                mo62153H0(H0);
            }
            return;
        }
        mo62161L0(-1);
    }

    /* renamed from: K */
    public <T extends C20749g> T mo62158K(String str, VersionedParcel versionedParcel) {
        try {
            return (C20749g) mo62202e(str).invoke((Object) null, new Object[]{versionedParcel});
        } catch (IllegalAccessException e) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e);
        } catch (InvocationTargetException e2) {
            if (e2.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e2.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
        }
    }

    /* renamed from: K0 */
    public void mo62159K0(float[] fArr, int i) {
        mo62214i0(i);
        mo62157J0(fArr);
    }

    /* renamed from: L */
    public abstract int mo62160L();

    /* renamed from: L0 */
    public abstract void mo62161L0(int i);

    /* renamed from: M */
    public int mo62162M(int i, int i2) {
        if (!mo62148F(i2)) {
            return i;
        }
        return mo62160L();
    }

    /* renamed from: M0 */
    public void mo62163M0(int i, int i2) {
        mo62214i0(i2);
        mo62161L0(i);
    }

    /* renamed from: N */
    public int[] mo62164N() {
        int L = mo62160L();
        if (L < 0) {
            return null;
        }
        int[] iArr = new int[L];
        for (int i = 0; i < L; i++) {
            iArr[i] = mo62160L();
        }
        return iArr;
    }

    /* renamed from: N0 */
    public void mo62165N0(int[] iArr) {
        if (iArr != null) {
            mo62161L0(r0);
            for (int L0 : iArr) {
                mo62161L0(L0);
            }
            return;
        }
        mo62161L0(-1);
    }

    /* renamed from: O */
    public int[] mo62166O(int[] iArr, int i) {
        if (!mo62148F(i)) {
            return iArr;
        }
        return mo62164N();
    }

    /* renamed from: O0 */
    public void mo62167O0(int[] iArr, int i) {
        mo62214i0(i);
        mo62165N0(iArr);
    }

    /* renamed from: P */
    public <T> List<T> mo62168P(List<T> list, int i) {
        if (!mo62148F(i)) {
            return list;
        }
        return (List) mo62249x(new ArrayList());
    }

    /* renamed from: P0 */
    public <T> void mo62169P0(List<T> list, int i) {
        mo62141B0(list, i);
    }

    /* renamed from: Q */
    public abstract long mo62170Q();

    /* renamed from: Q0 */
    public abstract void mo62171Q0(long j);

    /* renamed from: R */
    public long mo62172R(long j, int i) {
        if (!mo62148F(i)) {
            return j;
        }
        return mo62170Q();
    }

    /* renamed from: R0 */
    public void mo62173R0(long j, int i) {
        mo62214i0(i);
        mo62171Q0(j);
    }

    /* renamed from: S */
    public long[] mo62174S() {
        int L = mo62160L();
        if (L < 0) {
            return null;
        }
        long[] jArr = new long[L];
        for (int i = 0; i < L; i++) {
            jArr[i] = mo62170Q();
        }
        return jArr;
    }

    /* renamed from: S0 */
    public void mo62175S0(long[] jArr) {
        if (jArr != null) {
            mo62161L0(r0);
            for (long Q0 : jArr) {
                mo62171Q0(Q0);
            }
            return;
        }
        mo62161L0(-1);
    }

    /* renamed from: T */
    public long[] mo62176T(long[] jArr, int i) {
        if (!mo62148F(i)) {
            return jArr;
        }
        return mo62174S();
    }

    /* renamed from: T0 */
    public void mo62177T0(long[] jArr, int i) {
        mo62214i0(i);
        mo62175S0(jArr);
    }

    /* renamed from: U */
    public <K, V> Map<K, V> mo62178U(Map<K, V> map, int i) {
        if (!mo62148F(i)) {
            return map;
        }
        int L = mo62160L();
        if (L < 0) {
            return null;
        }
        C1866a aVar = new C1866a();
        if (L == 0) {
            return aVar;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        mo62249x(arrayList);
        mo62249x(arrayList2);
        for (int i2 = 0; i2 < L; i2++) {
            aVar.put(arrayList.get(i2), arrayList2.get(i2));
        }
        return aVar;
    }

    /* renamed from: U0 */
    public <K, V> void mo62179U0(Map<K, V> map, int i) {
        mo62214i0(i);
        if (map == null) {
            mo62161L0(-1);
            return;
        }
        int size = map.size();
        mo62161L0(size);
        if (size != 0) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (Map.Entry next : map.entrySet()) {
                arrayList.add(next.getKey());
                arrayList2.add(next.getValue());
            }
            mo62139A0(arrayList);
            mo62139A0(arrayList2);
        }
    }

    /* renamed from: V */
    public abstract <T extends Parcelable> T mo62180V();

    /* renamed from: V0 */
    public void mo62181V0() {
        mo62161L0(0);
    }

    /* renamed from: W */
    public <T extends Parcelable> T mo62182W(T t, int i) {
        if (!mo62148F(i)) {
            return t;
        }
        return mo62180V();
    }

    /* renamed from: W0 */
    public abstract void mo62183W0(Parcelable parcelable);

    /* renamed from: X */
    public Serializable mo62184X() {
        String c0 = mo62197c0();
        if (c0 == null) {
            return null;
        }
        try {
            return (Serializable) new C20740a(new ByteArrayInputStream(mo62239s())).readObject();
        } catch (IOException e) {
            throw new RuntimeException("VersionedParcelable encountered IOException reading a Serializable object (name = " + c0 + ")", e);
        } catch (ClassNotFoundException e2) {
            throw new RuntimeException("VersionedParcelable encountered ClassNotFoundException reading a Serializable object (name = " + c0 + ")", e2);
        }
    }

    /* renamed from: X0 */
    public void mo62185X0(Parcelable parcelable, int i) {
        mo62214i0(i);
        mo62183W0(parcelable);
    }

    /* renamed from: Y */
    public <T> Set<T> mo62186Y(Set<T> set, int i) {
        if (!mo62148F(i)) {
            return set;
        }
        return (Set) mo62249x(new C1869c());
    }

    /* renamed from: Y0 */
    public final void mo62187Y0(Serializable serializable) {
        if (serializable == null) {
            mo62204e1((String) null);
            return;
        }
        String name = serializable.getClass().getName();
        mo62204e1(name);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(serializable);
            objectOutputStream.close();
            mo62242t0(byteArrayOutputStream.toByteArray());
        } catch (IOException e) {
            throw new RuntimeException("VersionedParcelable encountered IOException writing serializable object (name = " + name + ")", e);
        }
    }

    @C0376v0(api = 21)
    /* renamed from: Z */
    public Size mo62188Z(Size size, int i) {
        if (!mo62148F(i)) {
            return size;
        }
        if (mo62222l()) {
            return new Size(mo62160L(), mo62160L());
        }
        return null;
    }

    /* renamed from: Z0 */
    public void mo62189Z0(Serializable serializable, int i) {
        mo62214i0(i);
        mo62187Y0(serializable);
    }

    /* renamed from: a */
    public abstract void mo62190a();

    @C0376v0(api = 21)
    /* renamed from: a0 */
    public SizeF mo62191a0(SizeF sizeF, int i) {
        if (!mo62148F(i)) {
            return sizeF;
        }
        if (mo62222l()) {
            return new SizeF(mo62150G(), mo62150G());
        }
        return null;
    }

    /* renamed from: a1 */
    public <T> void mo62192a1(Set<T> set, int i) {
        mo62141B0(set, i);
    }

    /* renamed from: b */
    public final Exception mo62193b(int i, String str) {
        switch (i) {
            case -9:
                return (Exception) mo62180V();
            case -7:
                return new UnsupportedOperationException(str);
            case -6:
                return new NetworkOnMainThreadException();
            case -5:
                return new IllegalStateException(str);
            case -4:
                return new NullPointerException(str);
            case -3:
                return new IllegalArgumentException(str);
            case -2:
                return new BadParcelableException(str);
            case -1:
                return new SecurityException(str);
            default:
                return new RuntimeException("Unknown exception code: " + i + " msg " + str);
        }
    }

    /* renamed from: b0 */
    public SparseBooleanArray mo62194b0(SparseBooleanArray sparseBooleanArray, int i) {
        if (!mo62148F(i)) {
            return sparseBooleanArray;
        }
        int L = mo62160L();
        if (L < 0) {
            return null;
        }
        SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray(L);
        for (int i2 = 0; i2 < L; i2++) {
            sparseBooleanArray2.put(mo62160L(), mo62222l());
        }
        return sparseBooleanArray2;
    }

    @C0376v0(api = 21)
    /* renamed from: b1 */
    public void mo62195b1(Size size, int i) {
        boolean z;
        mo62214i0(i);
        if (size != null) {
            z = true;
        } else {
            z = false;
        }
        mo62226m0(z);
        if (size != null) {
            mo62161L0(size.getWidth());
            mo62161L0(size.getHeight());
        }
    }

    /* renamed from: c */
    public abstract VersionedParcel mo62196c();

    /* renamed from: c0 */
    public abstract String mo62197c0();

    @C0376v0(api = 21)
    /* renamed from: c1 */
    public void mo62198c1(SizeF sizeF, int i) {
        boolean z;
        mo62214i0(i);
        if (sizeF != null) {
            z = true;
        } else {
            z = false;
        }
        mo62226m0(z);
        if (sizeF != null) {
            mo62153H0(sizeF.getWidth());
            mo62153H0(sizeF.getHeight());
        }
    }

    /* renamed from: d */
    public final Class mo62199d(Class<? extends C20749g> cls) throws ClassNotFoundException {
        Class cls2 = this.f53588c.get(cls.getName());
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", new Object[]{cls.getPackage().getName(), cls.getSimpleName()}), false, cls.getClassLoader());
        this.f53588c.put(cls.getName(), cls3);
        return cls3;
    }

    /* renamed from: d0 */
    public String mo62200d0(String str, int i) {
        if (!mo62148F(i)) {
            return str;
        }
        return mo62197c0();
    }

    /* renamed from: d1 */
    public void mo62201d1(SparseBooleanArray sparseBooleanArray, int i) {
        mo62214i0(i);
        if (sparseBooleanArray == null) {
            mo62161L0(-1);
            return;
        }
        int size = sparseBooleanArray.size();
        mo62161L0(size);
        for (int i2 = 0; i2 < size; i2++) {
            mo62161L0(sparseBooleanArray.keyAt(i2));
            mo62226m0(sparseBooleanArray.valueAt(i2));
        }
    }

    /* renamed from: e */
    public final Method mo62202e(String str) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        Method method = this.f53586a.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Class<VersionedParcel> cls = VersionedParcel.class;
        Method declaredMethod = Class.forName(str, true, cls.getClassLoader()).getDeclaredMethod("read", new Class[]{cls});
        this.f53586a.put(str, declaredMethod);
        return declaredMethod;
    }

    /* renamed from: e0 */
    public abstract IBinder mo62203e0();

    /* renamed from: e1 */
    public abstract void mo62204e1(String str);

    /* renamed from: f0 */
    public IBinder mo62205f0(IBinder iBinder, int i) {
        if (!mo62148F(i)) {
            return iBinder;
        }
        return mo62203e0();
    }

    /* renamed from: f1 */
    public void mo62206f1(String str, int i) {
        mo62214i0(i);
        mo62204e1(str);
    }

    /* renamed from: g */
    public final <T> int mo62207g(T t) {
        if (t instanceof String) {
            return 4;
        }
        if (t instanceof Parcelable) {
            return 2;
        }
        if (t instanceof C20749g) {
            return 1;
        }
        if (t instanceof Serializable) {
            return 3;
        }
        if (t instanceof IBinder) {
            return 5;
        }
        if (t instanceof Integer) {
            return 7;
        }
        if (t instanceof Float) {
            return 8;
        }
        throw new IllegalArgumentException(t.getClass().getName() + " cannot be VersionedParcelled");
    }

    /* renamed from: g0 */
    public <T extends C20749g> T mo62208g0() {
        String c0 = mo62197c0();
        if (c0 == null) {
            return null;
        }
        return mo62158K(c0, mo62196c());
    }

    /* renamed from: g1 */
    public abstract void mo62209g1(IBinder iBinder);

    /* renamed from: h */
    public final Method mo62210h(Class cls) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        Method method = this.f53587b.get(cls.getName());
        if (method != null) {
            return method;
        }
        Class d = mo62199d(cls);
        System.currentTimeMillis();
        Method declaredMethod = d.getDeclaredMethod("write", new Class[]{cls, VersionedParcel.class});
        this.f53587b.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    /* renamed from: h0 */
    public <T extends C20749g> T mo62211h0(T t, int i) {
        if (!mo62148F(i)) {
            return t;
        }
        return mo62208g0();
    }

    /* renamed from: h1 */
    public void mo62212h1(IBinder iBinder, int i) {
        mo62214i0(i);
        mo62209g1(iBinder);
    }

    /* renamed from: i */
    public boolean mo62213i() {
        return false;
    }

    /* renamed from: i0 */
    public abstract void mo62214i0(int i);

    /* renamed from: i1 */
    public abstract void mo62215i1(IInterface iInterface);

    /* renamed from: j */
    public <T> T[] mo62216j(T[] tArr) {
        int L = mo62160L();
        if (L < 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(L);
        if (L != 0) {
            int L2 = mo62160L();
            if (L < 0) {
                return null;
            }
            if (L2 == 1) {
                while (L > 0) {
                    arrayList.add(mo62208g0());
                    L--;
                }
            } else if (L2 == 2) {
                while (L > 0) {
                    arrayList.add(mo62180V());
                    L--;
                }
            } else if (L2 == 3) {
                while (L > 0) {
                    arrayList.add(mo62184X());
                    L--;
                }
            } else if (L2 == 4) {
                while (L > 0) {
                    arrayList.add(mo62197c0());
                    L--;
                }
            } else if (L2 == 5) {
                while (L > 0) {
                    arrayList.add(mo62203e0());
                    L--;
                }
            }
        }
        return arrayList.toArray(tArr);
    }

    /* renamed from: j0 */
    public void mo62217j0(boolean z, boolean z2) {
    }

    /* renamed from: j1 */
    public void mo62218j1(IInterface iInterface, int i) {
        mo62214i0(i);
        mo62215i1(iInterface);
    }

    /* renamed from: k */
    public <T> T[] mo62219k(T[] tArr, int i) {
        if (!mo62148F(i)) {
            return tArr;
        }
        return mo62216j(tArr);
    }

    /* renamed from: k0 */
    public <T> void mo62220k0(T[] tArr) {
        if (tArr == null) {
            mo62161L0(-1);
            return;
        }
        int length = tArr.length;
        mo62161L0(length);
        if (length > 0) {
            int i = 0;
            int g = mo62207g(tArr[0]);
            mo62161L0(g);
            if (g == 1) {
                while (i < length) {
                    mo62224l1((C20749g) tArr[i]);
                    i++;
                }
            } else if (g == 2) {
                while (i < length) {
                    mo62183W0((Parcelable) tArr[i]);
                    i++;
                }
            } else if (g == 3) {
                while (i < length) {
                    mo62187Y0((Serializable) tArr[i]);
                    i++;
                }
            } else if (g == 4) {
                while (i < length) {
                    mo62204e1((String) tArr[i]);
                    i++;
                }
            } else if (g == 5) {
                while (i < length) {
                    mo62209g1((IBinder) tArr[i]);
                    i++;
                }
            }
        }
    }

    /* renamed from: k1 */
    public <T extends C20749g> void mo62221k1(T t, VersionedParcel versionedParcel) {
        try {
            mo62210h(t.getClass()).invoke((Object) null, new Object[]{t, versionedParcel});
        } catch (IllegalAccessException e) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e);
        } catch (InvocationTargetException e2) {
            if (e2.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e2.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
        }
    }

    /* renamed from: l */
    public abstract boolean mo62222l();

    /* renamed from: l0 */
    public <T> void mo62223l0(T[] tArr, int i) {
        mo62214i0(i);
        mo62220k0(tArr);
    }

    /* renamed from: l1 */
    public void mo62224l1(C20749g gVar) {
        if (gVar == null) {
            mo62204e1((String) null);
            return;
        }
        mo62230n1(gVar);
        VersionedParcel c = mo62196c();
        mo62221k1(gVar, c);
        c.mo62190a();
    }

    /* renamed from: m */
    public boolean mo62225m(boolean z, int i) {
        if (!mo62148F(i)) {
            return z;
        }
        return mo62222l();
    }

    /* renamed from: m0 */
    public abstract void mo62226m0(boolean z);

    /* renamed from: m1 */
    public void mo62227m1(C20749g gVar, int i) {
        mo62214i0(i);
        mo62224l1(gVar);
    }

    /* renamed from: n */
    public boolean[] mo62228n() {
        boolean z;
        int L = mo62160L();
        if (L < 0) {
            return null;
        }
        boolean[] zArr = new boolean[L];
        for (int i = 0; i < L; i++) {
            if (mo62160L() != 0) {
                z = true;
            } else {
                z = false;
            }
            zArr[i] = z;
        }
        return zArr;
    }

    /* renamed from: n0 */
    public void mo62229n0(boolean z, int i) {
        mo62214i0(i);
        mo62226m0(z);
    }

    /* renamed from: n1 */
    public final void mo62230n1(C20749g gVar) {
        try {
            mo62204e1(mo62199d(gVar.getClass()).getName());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(gVar.getClass().getSimpleName() + " does not have a Parcelizer", e);
        }
    }

    /* renamed from: o */
    public boolean[] mo62231o(boolean[] zArr, int i) {
        if (!mo62148F(i)) {
            return zArr;
        }
        return mo62228n();
    }

    /* renamed from: o0 */
    public void mo62232o0(boolean[] zArr) {
        if (zArr != null) {
            mo62161L0(r0);
            for (boolean z : zArr) {
                mo62161L0(z ? 1 : 0);
            }
            return;
        }
        mo62161L0(-1);
    }

    /* renamed from: p */
    public abstract Bundle mo62233p();

    /* renamed from: p0 */
    public void mo62234p0(boolean[] zArr, int i) {
        mo62214i0(i);
        mo62232o0(zArr);
    }

    /* renamed from: q */
    public Bundle mo62235q(Bundle bundle, int i) {
        if (!mo62148F(i)) {
            return bundle;
        }
        return mo62233p();
    }

    /* renamed from: q0 */
    public abstract void mo62236q0(Bundle bundle);

    /* renamed from: r */
    public byte mo62237r(byte b, int i) {
        if (!mo62148F(i)) {
            return b;
        }
        return (byte) (mo62160L() & 255);
    }

    /* renamed from: r0 */
    public void mo62238r0(Bundle bundle, int i) {
        mo62214i0(i);
        mo62236q0(bundle);
    }

    /* renamed from: s */
    public abstract byte[] mo62239s();

    /* renamed from: s0 */
    public void mo62240s0(byte b, int i) {
        mo62214i0(i);
        mo62161L0(b);
    }

    /* renamed from: t */
    public byte[] mo62241t(byte[] bArr, int i) {
        if (!mo62148F(i)) {
            return bArr;
        }
        return mo62239s();
    }

    /* renamed from: t0 */
    public abstract void mo62242t0(byte[] bArr);

    /* renamed from: u */
    public char[] mo62243u(char[] cArr, int i) {
        if (!mo62148F(i)) {
            return cArr;
        }
        int L = mo62160L();
        if (L < 0) {
            return null;
        }
        char[] cArr2 = new char[L];
        for (int i2 = 0; i2 < L; i2++) {
            cArr2[i2] = (char) mo62160L();
        }
        return cArr2;
    }

    /* renamed from: u0 */
    public void mo62244u0(byte[] bArr, int i) {
        mo62214i0(i);
        mo62242t0(bArr);
    }

    /* renamed from: v */
    public abstract CharSequence mo62245v();

    /* renamed from: v0 */
    public abstract void mo62246v0(byte[] bArr, int i, int i2);

    /* renamed from: w */
    public CharSequence mo62247w(CharSequence charSequence, int i) {
        if (!mo62148F(i)) {
            return charSequence;
        }
        return mo62245v();
    }

    /* renamed from: w0 */
    public void mo62248w0(byte[] bArr, int i, int i2, int i3) {
        mo62214i0(i3);
        mo62246v0(bArr, i, i2);
    }

    /* renamed from: x */
    public final <T, S extends Collection<T>> S mo62249x(S s) {
        int L = mo62160L();
        if (L < 0) {
            return null;
        }
        if (L != 0) {
            int L2 = mo62160L();
            if (L < 0) {
                return null;
            }
            if (L2 == 1) {
                while (L > 0) {
                    s.add(mo62208g0());
                    L--;
                }
            } else if (L2 == 2) {
                while (L > 0) {
                    s.add(mo62180V());
                    L--;
                }
            } else if (L2 == 3) {
                while (L > 0) {
                    s.add(mo62184X());
                    L--;
                }
            } else if (L2 == 4) {
                while (L > 0) {
                    s.add(mo62197c0());
                    L--;
                }
            } else if (L2 == 5) {
                while (L > 0) {
                    s.add(mo62203e0());
                    L--;
                }
            }
        }
        return s;
    }

    /* renamed from: x0 */
    public void mo62250x0(char[] cArr, int i) {
        mo62214i0(i);
        if (cArr != null) {
            mo62161L0(r4);
            for (char L0 : cArr) {
                mo62161L0(L0);
            }
            return;
        }
        mo62161L0(-1);
    }

    /* renamed from: y */
    public abstract double mo62251y();

    /* renamed from: y0 */
    public abstract void mo62252y0(CharSequence charSequence);

    /* renamed from: z */
    public double mo62253z(double d, int i) {
        if (!mo62148F(i)) {
            return d;
        }
        return mo62251y();
    }

    /* renamed from: z0 */
    public void mo62254z0(CharSequence charSequence, int i) {
        mo62214i0(i);
        mo62252y0(charSequence);
    }
}
