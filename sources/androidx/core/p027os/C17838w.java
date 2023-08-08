package androidx.core.p027os;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0368r0;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import androidx.core.p027os.C17772a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.core.os.w */
public final class C17838w {

    @C0376v0(29)
    /* renamed from: androidx.core.os.w$a */
    public static class C17839a {
        @C0373u
        /* renamed from: a */
        public static final <T extends Parcelable> List<T> m81296a(@C0359n0 Parcel parcel, @C0359n0 List<T> list, @C0363p0 ClassLoader classLoader) {
            return parcel.readParcelableList(list, classLoader);
        }
    }

    @C0376v0(30)
    /* renamed from: androidx.core.os.w$b */
    public static class C17840b {
        @C0373u
        /* renamed from: a */
        public static final Parcelable.Creator<?> m81297a(@C0359n0 Parcel parcel, @C0363p0 ClassLoader classLoader) {
            return parcel.readParcelableCreator(classLoader);
        }
    }

    @C0376v0(33)
    /* renamed from: androidx.core.os.w$c */
    public static class C17841c {
        @C0373u
        /* renamed from: a */
        public static <T> T[] m81298a(Parcel parcel, ClassLoader classLoader, Class<T> cls) {
            return parcel.readArray(classLoader, cls);
        }

        @C0373u
        /* renamed from: b */
        public static <T> ArrayList<T> m81299b(Parcel parcel, ClassLoader classLoader, Class<? extends T> cls) {
            return parcel.readArrayList(classLoader, cls);
        }

        @C0373u
        /* renamed from: c */
        public static <V, K> HashMap<K, V> m81300c(Parcel parcel, ClassLoader classLoader, Class<? extends K> cls, Class<? extends V> cls2) {
            return parcel.readHashMap(classLoader, cls, cls2);
        }

        @C0373u
        /* renamed from: d */
        public static <T> void m81301d(@C0359n0 Parcel parcel, @C0359n0 List<? super T> list, @C0363p0 ClassLoader classLoader, @C0359n0 Class<T> cls) {
            parcel.readList(list, classLoader, cls);
        }

        @C0373u
        /* renamed from: e */
        public static <K, V> void m81302e(Parcel parcel, Map<? super K, ? super V> map, ClassLoader classLoader, Class<K> cls, Class<V> cls2) {
            parcel.readMap(map, classLoader, cls, cls2);
        }

        @C0373u
        /* renamed from: f */
        public static <T extends Parcelable> T m81303f(@C0359n0 Parcel parcel, @C0363p0 ClassLoader classLoader, @C0359n0 Class<T> cls) {
            return (Parcelable) parcel.readParcelable(classLoader, cls);
        }

        @C0373u
        /* renamed from: g */
        public static <T> T[] m81304g(@C0359n0 Parcel parcel, @C0363p0 ClassLoader classLoader, @C0359n0 Class<T> cls) {
            return parcel.readParcelableArray(classLoader, cls);
        }

        @C0373u
        /* renamed from: h */
        public static <T> Parcelable.Creator<T> m81305h(Parcel parcel, ClassLoader classLoader, Class<T> cls) {
            return parcel.readParcelableCreator(classLoader, cls);
        }

        @C0373u
        /* renamed from: i */
        public static <T> List<T> m81306i(@C0359n0 Parcel parcel, @C0359n0 List<T> list, @C0363p0 ClassLoader classLoader, @C0359n0 Class<T> cls) {
            return parcel.readParcelableList(list, classLoader, cls);
        }

        @C0373u
        /* renamed from: j */
        public static <T extends Serializable> T m81307j(@C0359n0 Parcel parcel, @C0363p0 ClassLoader classLoader, @C0359n0 Class<T> cls) {
            return (Serializable) parcel.readSerializable(classLoader, cls);
        }

        @C0373u
        /* renamed from: k */
        public static <T> SparseArray<T> m81308k(Parcel parcel, ClassLoader classLoader, Class<? extends T> cls) {
            return parcel.readSparseArray(classLoader, cls);
        }
    }

    @C0363p0
    @SuppressLint({"ArrayReturn", "NullableCollection"})
    @C0368r0(markerClass = {C17772a.C17773a.class})
    /* renamed from: a */
    public static <T> T[] m81283a(@C0359n0 Parcel parcel, @C0363p0 ClassLoader classLoader, @C0359n0 Class<T> cls) {
        if (C17772a.m81155k()) {
            return C17841c.m81298a(parcel, classLoader, cls);
        }
        return parcel.readArray(classLoader);
    }

    @C0363p0
    @SuppressLint({"ConcreteCollection", "NullableCollection"})
    @C0368r0(markerClass = {C17772a.C17773a.class})
    /* renamed from: b */
    public static <T> ArrayList<T> m81284b(@C0359n0 Parcel parcel, @C0363p0 ClassLoader classLoader, @C0359n0 Class<? extends T> cls) {
        if (C17772a.m81155k()) {
            return C17841c.m81299b(parcel, classLoader, cls);
        }
        return parcel.readArrayList(classLoader);
    }

    /* renamed from: c */
    public static boolean m81285c(@C0359n0 Parcel parcel) {
        return parcel.readInt() != 0;
    }

    @C0363p0
    @SuppressLint({"ConcreteCollection", "NullableCollection"})
    @C0368r0(markerClass = {C17772a.C17773a.class})
    /* renamed from: d */
    public static <K, V> HashMap<K, V> m81286d(@C0359n0 Parcel parcel, @C0363p0 ClassLoader classLoader, @C0359n0 Class<? extends K> cls, @C0359n0 Class<? extends V> cls2) {
        if (C17772a.m81155k()) {
            return C17841c.m81300c(parcel, classLoader, cls, cls2);
        }
        return parcel.readHashMap(classLoader);
    }

    @C0368r0(markerClass = {C17772a.C17773a.class})
    /* renamed from: e */
    public static <T> void m81287e(@C0359n0 Parcel parcel, @C0359n0 List<? super T> list, @C0363p0 ClassLoader classLoader, @C0359n0 Class<T> cls) {
        if (C17772a.m81155k()) {
            C17841c.m81301d(parcel, list, classLoader, cls);
        } else {
            parcel.readList(list, classLoader);
        }
    }

    @C0368r0(markerClass = {C17772a.C17773a.class})
    /* renamed from: f */
    public static <K, V> void m81288f(@C0359n0 Parcel parcel, @C0359n0 Map<? super K, ? super V> map, @C0363p0 ClassLoader classLoader, @C0359n0 Class<K> cls, @C0359n0 Class<V> cls2) {
        if (C17772a.m81155k()) {
            C17841c.m81302e(parcel, map, classLoader, cls, cls2);
        } else {
            parcel.readMap(map, classLoader);
        }
    }

    @C0363p0
    @C0368r0(markerClass = {C17772a.C17773a.class})
    /* renamed from: g */
    public static <T extends Parcelable> T m81289g(@C0359n0 Parcel parcel, @C0363p0 ClassLoader classLoader, @C0359n0 Class<T> cls) {
        if (C17772a.m81155k()) {
            return C17841c.m81303f(parcel, classLoader, cls);
        }
        return parcel.readParcelable(classLoader);
    }

    @C0363p0
    @SuppressLint({"ArrayReturn", "NullableCollection"})
    @C0368r0(markerClass = {C17772a.C17773a.class})
    /* renamed from: h */
    public static <T> T[] m81290h(@C0359n0 Parcel parcel, @C0363p0 ClassLoader classLoader, @C0359n0 Class<T> cls) {
        if (C17772a.m81155k()) {
            return C17841c.m81304g(parcel, classLoader, cls);
        }
        return parcel.readParcelableArray(classLoader);
    }

    @C0363p0
    @C0368r0(markerClass = {C17772a.C17773a.class})
    @C0376v0(30)
    /* renamed from: i */
    public static <T> Parcelable.Creator<T> m81291i(@C0359n0 Parcel parcel, @C0363p0 ClassLoader classLoader, @C0359n0 Class<T> cls) {
        if (C17772a.m81155k()) {
            return C17841c.m81305h(parcel, classLoader, cls);
        }
        return C17840b.m81297a(parcel, classLoader);
    }

    @C0368r0(markerClass = {C17772a.C17773a.class})
    @C0359n0
    @C0376v0(api = 29)
    /* renamed from: j */
    public static <T> List<T> m81292j(@C0359n0 Parcel parcel, @C0359n0 List<T> list, @C0363p0 ClassLoader classLoader, @C0359n0 Class<T> cls) {
        if (C17772a.m81155k()) {
            return C17841c.m81306i(parcel, list, classLoader, cls);
        }
        return C17839a.m81296a(parcel, list, classLoader);
    }

    @C0363p0
    @C0368r0(markerClass = {C17772a.C17773a.class})
    /* renamed from: k */
    public static <T extends Serializable> T m81293k(@C0359n0 Parcel parcel, @C0363p0 ClassLoader classLoader, @C0359n0 Class<T> cls) {
        if (C17772a.m81155k()) {
            return C17841c.m81307j(parcel, classLoader, cls);
        }
        return parcel.readSerializable();
    }

    @C0363p0
    @C0368r0(markerClass = {C17772a.C17773a.class})
    /* renamed from: l */
    public static <T> SparseArray<T> m81294l(@C0359n0 Parcel parcel, @C0363p0 ClassLoader classLoader, @C0359n0 Class<? extends T> cls) {
        if (C17772a.m81155k()) {
            return C17841c.m81308k(parcel, classLoader, cls);
        }
        return parcel.readSparseArray(classLoader);
    }

    /* renamed from: m */
    public static void m81295m(@C0359n0 Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }
}
