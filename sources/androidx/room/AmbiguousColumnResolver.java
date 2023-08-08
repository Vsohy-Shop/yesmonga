package androidx.room;

import androidx.annotation.RestrictTo;
import com.urbanairship.AirshipConfigOptions;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.C11079d2;
import kotlin.collections.C10927c1;
import kotlin.collections.C10953k0;
import kotlin.collections.C10976s;
import kotlin.collections.C10978t;
import kotlin.collections.C10994x;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.C11384m;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.C11466l;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class AmbiguousColumnResolver {
    @C12579k

    /* renamed from: a */
    public static final AmbiguousColumnResolver f52216a = new AmbiguousColumnResolver();

    /* renamed from: androidx.room.AmbiguousColumnResolver$a */
    public static final class C20232a {
        @C12579k

        /* renamed from: a */
        public final C11466l f52217a;
        @C12579k

        /* renamed from: b */
        public final List<Integer> f52218b;

        public C20232a(@C12579k C11466l lVar, @C12579k List<Integer> list) {
            Intrinsics.checkNotNullParameter(lVar, "resultRange");
            Intrinsics.checkNotNullParameter(list, "resultIndices");
            this.f52217a = lVar;
            this.f52218b = list;
        }

        @C12579k
        /* renamed from: a */
        public final List<Integer> mo60727a() {
            return this.f52218b;
        }

        @C12579k
        /* renamed from: b */
        public final C11466l mo60728b() {
            return this.f52217a;
        }
    }

    /* renamed from: androidx.room.AmbiguousColumnResolver$b */
    public static final class C20233b {
        @C12579k

        /* renamed from: a */
        public final String f52219a;

        /* renamed from: b */
        public final int f52220b;

        public C20233b(@C12579k String str, int i) {
            Intrinsics.checkNotNullParameter(str, "name");
            this.f52219a = str;
            this.f52220b = i;
        }

        /* renamed from: d */
        public static /* synthetic */ C20233b m94659d(C20233b bVar, String str, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = bVar.f52219a;
            }
            if ((i2 & 2) != 0) {
                i = bVar.f52220b;
            }
            return bVar.mo60731c(str, i);
        }

        @C12579k
        /* renamed from: a */
        public final String mo60729a() {
            return this.f52219a;
        }

        /* renamed from: b */
        public final int mo60730b() {
            return this.f52220b;
        }

        @C12579k
        /* renamed from: c */
        public final C20233b mo60731c(@C12579k String str, int i) {
            Intrinsics.checkNotNullParameter(str, "name");
            return new C20233b(str, i);
        }

        /* renamed from: e */
        public final int mo60732e() {
            return this.f52220b;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C20233b)) {
                return false;
            }
            C20233b bVar = (C20233b) obj;
            return Intrinsics.areEqual((Object) this.f52219a, (Object) bVar.f52219a) && this.f52220b == bVar.f52220b;
        }

        @C12579k
        /* renamed from: f */
        public final String mo60734f() {
            return this.f52219a;
        }

        public int hashCode() {
            return (this.f52219a.hashCode() * 31) + Integer.hashCode(this.f52220b);
        }

        @C12579k
        public String toString() {
            return "ResultColumn(name=" + this.f52219a + ", index=" + this.f52220b + ')';
        }
    }

    /* renamed from: androidx.room.AmbiguousColumnResolver$c */
    public static final class C20234c implements Comparable<C20234c> {
        @C12579k

        /* renamed from: d */
        public static final C20235a f52221d = new C20235a((DefaultConstructorMarker) null);
        @C12579k

        /* renamed from: e */
        public static final C20234c f52222e = new C20234c(CollectionsKt__CollectionsKt.m40441E(), Integer.MAX_VALUE, Integer.MAX_VALUE);
        @C12579k

        /* renamed from: a */
        public final List<C20232a> f52223a;

        /* renamed from: b */
        public final int f52224b;

        /* renamed from: c */
        public final int f52225c;

        /* renamed from: androidx.room.AmbiguousColumnResolver$c$a */
        public static final class C20235a {
            public /* synthetic */ C20235a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @C12579k
            /* renamed from: a */
            public final C20234c mo60742a(@C12579k List<C20232a> list) {
                boolean z;
                Intrinsics.checkNotNullParameter(list, "matches");
                Iterable<C20232a> iterable = list;
                int i = 0;
                int i2 = 0;
                for (C20232a aVar : iterable) {
                    i2 += ((aVar.mo60728b().mo23051w() - aVar.mo60728b().mo23049r()) + 1) - aVar.mo60727a().size();
                }
                Iterator it = iterable.iterator();
                if (it.hasNext()) {
                    int r = ((C20232a) it.next()).mo60728b().mo23049r();
                    while (it.hasNext()) {
                        int r2 = ((C20232a) it.next()).mo60728b().mo23049r();
                        if (r > r2) {
                            r = r2;
                        }
                    }
                    Iterator it2 = iterable.iterator();
                    if (it2.hasNext()) {
                        int w = ((C20232a) it2.next()).mo60728b().mo23051w();
                        while (it2.hasNext()) {
                            int w2 = ((C20232a) it2.next()).mo60728b().mo23051w();
                            if (w < w2) {
                                w = w2;
                            }
                        }
                        C11466l lVar = new C11466l(r, w);
                        if (!(lVar instanceof Collection) || !((Collection) lVar).isEmpty()) {
                            Iterator it3 = lVar.iterator();
                            int i3 = 0;
                            while (it3.hasNext()) {
                                int c = ((C10953k0) it3).mo6374c();
                                Iterator it4 = iterable.iterator();
                                int i4 = 0;
                                while (true) {
                                    if (!it4.hasNext()) {
                                        z = false;
                                        break;
                                    }
                                    if (((C20232a) it4.next()).mo60728b().mo23056Q(c)) {
                                        i4++;
                                        continue;
                                    }
                                    if (i4 > 1) {
                                        z = true;
                                        break;
                                    }
                                }
                                if (z && (i3 = i3 + 1) < 0) {
                                    CollectionsKt__CollectionsKt.m40458V();
                                }
                            }
                            i = i3;
                        }
                        return new C20234c(list, i2, i);
                    }
                    throw new NoSuchElementException();
                }
                throw new NoSuchElementException();
            }

            @C12579k
            /* renamed from: b */
            public final C20234c mo60743b() {
                return C20234c.f52222e;
            }

            public C20235a() {
            }
        }

        public C20234c(@C12579k List<C20232a> list, int i, int i2) {
            Intrinsics.checkNotNullParameter(list, "matches");
            this.f52223a = list;
            this.f52224b = i;
            this.f52225c = i2;
        }

        /* renamed from: q */
        public int compareTo(@C12579k C20234c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "other");
            int compare = Intrinsics.compare(this.f52225c, cVar.f52225c);
            if (compare != 0) {
                return compare;
            }
            return Intrinsics.compare(this.f52224b, cVar.f52224b);
        }

        /* renamed from: r */
        public final int mo60739r() {
            return this.f52224b;
        }

        @C12579k
        /* renamed from: w */
        public final List<C20232a> mo60740w() {
            return this.f52223a;
        }

        /* renamed from: y */
        public final int mo60741y() {
            return this.f52225c;
        }
    }

    /* renamed from: b */
    public static /* synthetic */ void m94653b(AmbiguousColumnResolver ambiguousColumnResolver, List list, List list2, int i, C11300l lVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            list2 = new ArrayList();
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        ambiguousColumnResolver.mo60725a(list, list2, i, lVar);
    }

    @C12579k
    @C11384m
    /* renamed from: d */
    public static final int[][] m94654d(@C12579k String[] strArr, @C12579k String[][] strArr2) {
        boolean z;
        String[] strArr3 = strArr;
        String[][] strArr4 = strArr2;
        Intrinsics.checkNotNullParameter(strArr3, "resultColumns");
        Intrinsics.checkNotNullParameter(strArr4, "mappings");
        int length = strArr3.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            z = true;
            if (i2 >= length) {
                break;
            }
            String str = strArr3[i2];
            if (str.charAt(0) == '`' && str.charAt(str.length() - 1) == '`') {
                str = str.substring(1, str.length() - 1);
                Intrinsics.checkNotNullExpressionValue(str, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            Locale locale = Locale.US;
            Intrinsics.checkNotNullExpressionValue(locale, AirshipConfigOptions.f87117e0);
            String lowerCase = str.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            strArr3[i2] = lowerCase;
            i2++;
        }
        int length2 = strArr4.length;
        for (int i3 = 0; i3 < length2; i3++) {
            int length3 = strArr4[i3].length;
            for (int i4 = 0; i4 < length3; i4++) {
                String[] strArr5 = strArr4[i3];
                String str2 = strArr5[i4];
                Locale locale2 = Locale.US;
                Intrinsics.checkNotNullExpressionValue(locale2, AirshipConfigOptions.f87117e0);
                String lowerCase2 = str2.toLowerCase(locale2);
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
                strArr5[i4] = lowerCase2;
            }
        }
        Set d = C10927c1.m40881d();
        for (String[] p0 : strArr4) {
            C10994x.m42362p0(d, p0);
        }
        Set a = C10927c1.m40878a(d);
        List i5 = C10976s.m41417i();
        int length4 = strArr3.length;
        int i6 = 0;
        int i7 = 0;
        while (i6 < length4) {
            String str3 = strArr3[i6];
            int i8 = i7 + 1;
            if (a.contains(str3)) {
                i5.add(new C20233b(str3, i7));
            }
            i6++;
            i7 = i8;
        }
        List<C20233b> a2 = C10976s.m41409a(i5);
        int length5 = strArr4.length;
        ArrayList arrayList = new ArrayList(length5);
        for (int i9 = 0; i9 < length5; i9++) {
            arrayList.add(new ArrayList());
        }
        int length6 = strArr4.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length6) {
            String[] strArr6 = strArr4[i10];
            int i12 = i11 + 1;
            f52216a.mo60726c(a2, strArr6, new AmbiguousColumnResolver$resolve$1$1(strArr6, arrayList, i11));
            if (((List) arrayList.get(i11)).isEmpty()) {
                ArrayList arrayList2 = new ArrayList(strArr6.length);
                int length7 = strArr6.length;
                int i13 = i;
                while (i13 < length7) {
                    String str4 = strArr6[i13];
                    List i14 = C10976s.m41417i();
                    for (C20233b bVar : a2) {
                        if (Intrinsics.areEqual((Object) str4, (Object) bVar.mo60734f())) {
                            i14.add(Integer.valueOf(bVar.mo60732e()));
                        }
                    }
                    List a3 = C10976s.m41409a(i14);
                    if (!a3.isEmpty()) {
                        arrayList2.add(a3);
                        i13++;
                    } else {
                        throw new IllegalStateException(("Column " + str4 + " not found in result").toString());
                    }
                }
                m94653b(f52216a, arrayList2, (List) null, 0, new AmbiguousColumnResolver$resolve$1$2(arrayList, i11), 6, (Object) null);
            }
            i10++;
            i11 = i12;
            i = 0;
        }
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (!(!((List) it.next()).isEmpty())) {
                        z = false;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        if (z) {
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = C20234c.f52221d.mo60743b();
            m94653b(f52216a, arrayList, (List) null, 0, new AmbiguousColumnResolver$resolve$4(objectRef), 6, (Object) null);
            Iterable<C20232a> w = ((C20234c) objectRef.element).mo60740w();
            ArrayList arrayList3 = new ArrayList(C10978t.m41495Y(w, 10));
            for (C20232a a4 : w) {
                arrayList3.add(CollectionsKt___CollectionsKt.m40552P5(a4.mo60727a()));
            }
            Object[] array = arrayList3.toArray(new int[0][]);
            Intrinsics.checkNotNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            return (int[][]) array;
        }
        throw new IllegalStateException("Failed to find matches for all mappings".toString());
    }

    /* renamed from: a */
    public final <T> void mo60725a(List<? extends List<? extends T>> list, List<T> list2, int i, C11300l<? super List<? extends T>, C11079d2> lVar) {
        if (i == list.size()) {
            lVar.invoke(CollectionsKt___CollectionsKt.m40557Q5(list2));
            return;
        }
        for (Object add : (Iterable) list.get(i)) {
            list2.add(add);
            f52216a.mo60725a(list, list2, i + 1, lVar);
            C10994x.m42351L0(list2);
        }
    }

    /* renamed from: c */
    public final void mo60726c(List<C20233b> list, String[] strArr, C11305q<? super Integer, ? super Integer, ? super List<C20233b>, C11079d2> qVar) {
        int i = 0;
        int i2 = 0;
        for (String hashCode : strArr) {
            i2 += hashCode.hashCode();
        }
        int length = strArr.length;
        int i3 = 0;
        for (C20233b f : list.subList(0, length)) {
            i3 += f.mo60734f().hashCode();
        }
        while (true) {
            if (i2 == i3) {
                qVar.invoke(Integer.valueOf(i), Integer.valueOf(length), list.subList(i, length));
            }
            i++;
            length++;
            if (length <= list.size()) {
                i3 = (i3 - list.get(i - 1).mo60734f().hashCode()) + list.get(length - 1).mo60734f().hashCode();
            } else {
                return;
            }
        }
    }
}
