package androidx.room.util;

import android.annotation.SuppressLint;
import androidx.annotation.C0344h1;
import androidx.annotation.RestrictTo;
import androidx.room.C20305f;
import androidx.room.Index;
import androidx.sqlite.p031db.C20466f;
import com.urbanairship.AirshipConfigOptions;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.C11395k;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.C10861c;
import kotlin.collections.C10930d1;
import kotlin.jvm.C11287e;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11622t;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.json.internal.C12361b;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.room.util.f */
public final class C20383f {
    @C12579k

    /* renamed from: e */
    public static final C20386b f52563e = new C20386b((DefaultConstructorMarker) null);

    /* renamed from: f */
    public static final int f52564f = 0;

    /* renamed from: g */
    public static final int f52565g = 1;

    /* renamed from: h */
    public static final int f52566h = 2;
    @C12579k
    @C11287e

    /* renamed from: a */
    public final String f52567a;
    @C12579k
    @C11287e

    /* renamed from: b */
    public final Map<String, C20384a> f52568b;
    @C12579k
    @C11287e

    /* renamed from: c */
    public final Set<C20388d> f52569c;
    @C12580l
    @C11287e

    /* renamed from: d */
    public final Set<C20390f> f52570d;

    /* renamed from: androidx.room.util.f$b */
    public static final class C20386b {
        public /* synthetic */ C20386b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        @C11384m
        /* renamed from: a */
        public final C20383f mo61208a(@C12579k C20466f fVar, @C12579k String str) {
            Intrinsics.checkNotNullParameter(fVar, "database");
            Intrinsics.checkNotNullParameter(str, "tableName");
            return C20392g.m95178f(fVar, str);
        }

        public C20386b() {
        }
    }

    @C10861c(AnnotationRetention.SOURCE)
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.room.util.f$c */
    public @interface C20387c {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: androidx.room.util.f$d */
    public static final class C20388d {
        @C12579k
        @C11287e

        /* renamed from: a */
        public final String f52579a;
        @C12579k
        @C11287e

        /* renamed from: b */
        public final String f52580b;
        @C12579k
        @C11287e

        /* renamed from: c */
        public final String f52581c;
        @C12579k
        @C11287e

        /* renamed from: d */
        public final List<String> f52582d;
        @C12579k
        @C11287e

        /* renamed from: e */
        public final List<String> f52583e;

        public C20388d(@C12579k String str, @C12579k String str2, @C12579k String str3, @C12579k List<String> list, @C12579k List<String> list2) {
            Intrinsics.checkNotNullParameter(str, "referenceTable");
            Intrinsics.checkNotNullParameter(str2, "onDelete");
            Intrinsics.checkNotNullParameter(str3, "onUpdate");
            Intrinsics.checkNotNullParameter(list, "columnNames");
            Intrinsics.checkNotNullParameter(list2, "referenceColumnNames");
            this.f52579a = str;
            this.f52580b = str2;
            this.f52581c = str3;
            this.f52582d = list;
            this.f52583e = list2;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C20388d)) {
                return false;
            }
            C20388d dVar = (C20388d) obj;
            if (Intrinsics.areEqual((Object) this.f52579a, (Object) dVar.f52579a) && Intrinsics.areEqual((Object) this.f52580b, (Object) dVar.f52580b) && Intrinsics.areEqual((Object) this.f52581c, (Object) dVar.f52581c) && Intrinsics.areEqual((Object) this.f52582d, (Object) dVar.f52582d)) {
                return Intrinsics.areEqual((Object) this.f52583e, (Object) dVar.f52583e);
            }
            return false;
        }

        public int hashCode() {
            return (((((((this.f52579a.hashCode() * 31) + this.f52580b.hashCode()) * 31) + this.f52581c.hashCode()) * 31) + this.f52582d.hashCode()) * 31) + this.f52583e.hashCode();
        }

        @C12579k
        public String toString() {
            return "ForeignKey{referenceTable='" + this.f52579a + "', onDelete='" + this.f52580b + " +', onUpdate='" + this.f52581c + "', columnNames=" + this.f52582d + ", referenceColumnNames=" + this.f52583e + C12361b.f30259j;
        }
    }

    /* renamed from: androidx.room.util.f$e */
    public static final class C20389e implements Comparable<C20389e> {

        /* renamed from: a */
        public final int f52584a;

        /* renamed from: b */
        public final int f52585b;
        @C12579k

        /* renamed from: c */
        public final String f52586c;
        @C12579k

        /* renamed from: d */
        public final String f52587d;

        public C20389e(int i, int i2, @C12579k String str, @C12579k String str2) {
            Intrinsics.checkNotNullParameter(str, "from");
            Intrinsics.checkNotNullParameter(str2, "to");
            this.f52584a = i;
            this.f52585b = i2;
            this.f52586c = str;
            this.f52587d = str2;
        }

        /* renamed from: b */
        public int compareTo(@C12579k C20389e eVar) {
            Intrinsics.checkNotNullParameter(eVar, "other");
            int i = this.f52584a - eVar.f52584a;
            if (i == 0) {
                return this.f52585b - eVar.f52585b;
            }
            return i;
        }

        @C12579k
        /* renamed from: g */
        public final String mo61214g() {
            return this.f52586c;
        }

        /* renamed from: q */
        public final int mo61215q() {
            return this.f52584a;
        }

        /* renamed from: r */
        public final int mo61216r() {
            return this.f52585b;
        }

        @C12579k
        /* renamed from: w */
        public final String mo61217w() {
            return this.f52587d;
        }
    }

    public C20383f(@C12579k String str, @C12579k Map<String, C20384a> map, @C12579k Set<C20388d> set, @C12580l Set<C20390f> set2) {
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(map, "columns");
        Intrinsics.checkNotNullParameter(set, "foreignKeys");
        this.f52567a = str;
        this.f52568b = map;
        this.f52569c = set;
        this.f52570d = set2;
    }

    @C12579k
    @C11384m
    /* renamed from: a */
    public static final C20383f m95160a(@C12579k C20466f fVar, @C12579k String str) {
        return f52563e.mo61208a(fVar, str);
    }

    public boolean equals(@C12580l Object obj) {
        Set<C20390f> set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20383f)) {
            return false;
        }
        C20383f fVar = (C20383f) obj;
        if (!Intrinsics.areEqual((Object) this.f52567a, (Object) fVar.f52567a) || !Intrinsics.areEqual((Object) this.f52568b, (Object) fVar.f52568b) || !Intrinsics.areEqual((Object) this.f52569c, (Object) fVar.f52569c)) {
            return false;
        }
        Set<C20390f> set2 = this.f52570d;
        if (set2 == null || (set = fVar.f52570d) == null) {
            return true;
        }
        return Intrinsics.areEqual((Object) set2, (Object) set);
    }

    public int hashCode() {
        return (((this.f52567a.hashCode() * 31) + this.f52568b.hashCode()) * 31) + this.f52569c.hashCode();
    }

    @C12579k
    public String toString() {
        return "TableInfo{name='" + this.f52567a + "', columns=" + this.f52568b + ", foreignKeys=" + this.f52569c + ", indices=" + this.f52570d + C12361b.f30259j;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C20383f(String str, Map map, Set set, Set set2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, map, set, (i & 8) != 0 ? null : set2);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C20383f(@C12579k String str, @C12579k Map<String, C20384a> map, @C12579k Set<C20388d> set) {
        this(str, map, set, C10930d1.m40892k());
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(map, "columns");
        Intrinsics.checkNotNullParameter(set, "foreignKeys");
    }

    /* renamed from: androidx.room.util.f$a */
    public static final class C20384a {
        @C12579k

        /* renamed from: h */
        public static final C20385a f52571h = new C20385a((DefaultConstructorMarker) null);
        @C12579k
        @C11287e

        /* renamed from: a */
        public final String f52572a;
        @C12579k
        @C11287e

        /* renamed from: b */
        public final String f52573b;
        @C11287e

        /* renamed from: c */
        public final boolean f52574c;
        @C11287e

        /* renamed from: d */
        public final int f52575d;
        @C12580l
        @C11287e

        /* renamed from: e */
        public final String f52576e;
        @C11287e

        /* renamed from: f */
        public final int f52577f;
        @C11287e

        /* renamed from: g */
        public final int f52578g;

        /* renamed from: androidx.room.util.f$a$a */
        public static final class C20385a {
            public /* synthetic */ C20385a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final boolean mo61206a(String str) {
                boolean z;
                if (str.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    return false;
                }
                int i = 0;
                int i2 = 0;
                int i3 = 0;
                while (i < str.length()) {
                    char charAt = str.charAt(i);
                    int i4 = i3 + 1;
                    if (i3 == 0 && charAt != '(') {
                        return false;
                    }
                    if (charAt == '(') {
                        i2++;
                    } else if (charAt == ')' && i2 - 1 == 0 && i3 != str.length() - 1) {
                        return false;
                    }
                    i++;
                    i3 = i4;
                }
                if (i2 == 0) {
                    return true;
                }
                return false;
            }

            @C0344h1
            @SuppressLint({"SyntheticAccessor"})
            @C11384m
            /* renamed from: b */
            public final boolean mo61207b(@C12579k String str, @C12580l String str2) {
                Intrinsics.checkNotNullParameter(str, "current");
                if (Intrinsics.areEqual((Object) str, (Object) str2)) {
                    return true;
                }
                if (!mo61206a(str)) {
                    return false;
                }
                String substring = str.substring(1, str.length() - 1);
                Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                return Intrinsics.areEqual((Object) StringsKt__StringsKt.trim(substring).toString(), (Object) str2);
            }

            public C20385a() {
            }
        }

        public C20384a(@C12579k String str, @C12579k String str2, boolean z, int i, @C12580l String str3, int i2) {
            Intrinsics.checkNotNullParameter(str, "name");
            Intrinsics.checkNotNullParameter(str2, "type");
            this.f52572a = str;
            this.f52573b = str2;
            this.f52574c = z;
            this.f52575d = i;
            this.f52576e = str3;
            this.f52577f = i2;
            this.f52578g = mo61201b(str2);
        }

        @C0344h1
        @SuppressLint({"SyntheticAccessor"})
        @C11384m
        /* renamed from: a */
        public static final boolean m95161a(@C12579k String str, @C12580l String str2) {
            return f52571h.mo61207b(str, str2);
        }

        @C20305f.C20308c
        /* renamed from: c */
        public static /* synthetic */ void m95162c() {
        }

        @C20305f.C20308c
        /* renamed from: b */
        public final int mo61201b(String str) {
            if (str == null) {
                return 5;
            }
            Locale locale = Locale.US;
            Intrinsics.checkNotNullExpressionValue(locale, AirshipConfigOptions.f87117e0);
            String upperCase = str.toUpperCase(locale);
            Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
            if (StringsKt__StringsKt.contains$default((CharSequence) upperCase, (CharSequence) "INT", false, 2, (Object) null)) {
                return 3;
            }
            if (StringsKt__StringsKt.contains$default((CharSequence) upperCase, (CharSequence) "CHAR", false, 2, (Object) null) || StringsKt__StringsKt.contains$default((CharSequence) upperCase, (CharSequence) "CLOB", false, 2, (Object) null) || StringsKt__StringsKt.contains$default((CharSequence) upperCase, (CharSequence) "TEXT", false, 2, (Object) null)) {
                return 2;
            }
            if (StringsKt__StringsKt.contains$default((CharSequence) upperCase, (CharSequence) "BLOB", false, 2, (Object) null)) {
                return 5;
            }
            if (StringsKt__StringsKt.contains$default((CharSequence) upperCase, (CharSequence) "REAL", false, 2, (Object) null) || StringsKt__StringsKt.contains$default((CharSequence) upperCase, (CharSequence) "FLOA", false, 2, (Object) null) || StringsKt__StringsKt.contains$default((CharSequence) upperCase, (CharSequence) "DOUB", false, 2, (Object) null)) {
                return 4;
            }
            return 1;
        }

        /* renamed from: d */
        public final boolean mo61202d() {
            return this.f52575d > 0;
        }

        public boolean equals(@C12580l Object obj) {
            String str;
            boolean z;
            String str2;
            String str3;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C20384a) || this.f52575d != ((C20384a) obj).f52575d) {
                return false;
            }
            C20384a aVar = (C20384a) obj;
            if (!Intrinsics.areEqual((Object) this.f52572a, (Object) aVar.f52572a) || this.f52574c != aVar.f52574c) {
                return false;
            }
            if (this.f52577f == 1 && aVar.f52577f == 2 && (str3 = this.f52576e) != null && !f52571h.mo61207b(str3, aVar.f52576e)) {
                return false;
            }
            if (this.f52577f == 2 && aVar.f52577f == 1 && (str2 = aVar.f52576e) != null && !f52571h.mo61207b(str2, this.f52576e)) {
                return false;
            }
            int i = this.f52577f;
            if (i != 0 && i == aVar.f52577f) {
                if ((str = this.f52576e) == null ? aVar.f52576e == null : f52571h.mo61207b(str, aVar.f52576e)) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    return false;
                }
            }
            if (this.f52578g == aVar.f52578g) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i;
            int hashCode = ((this.f52572a.hashCode() * 31) + this.f52578g) * 31;
            if (this.f52574c) {
                i = 1231;
            } else {
                i = 1237;
            }
            return ((hashCode + i) * 31) + this.f52575d;
        }

        @C12579k
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Column{name='");
            sb.append(this.f52572a);
            sb.append("', type='");
            sb.append(this.f52573b);
            sb.append("', affinity='");
            sb.append(this.f52578g);
            sb.append("', notNull=");
            sb.append(this.f52574c);
            sb.append(", primaryKeyPosition=");
            sb.append(this.f52575d);
            sb.append(", defaultValue='");
            String str = this.f52576e;
            if (str == null) {
                str = "undefined";
            }
            sb.append(str);
            sb.append("'}");
            return sb.toString();
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        @C11395k(message = "Use {@link Column#Column(String, String, boolean, int, String, int)} instead.")
        public C20384a(@C12579k String str, @C12579k String str2, boolean z, int i) {
            this(str, str2, z, i, (String) null, 0);
            Intrinsics.checkNotNullParameter(str, "name");
            Intrinsics.checkNotNullParameter(str2, "type");
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: androidx.room.util.f$f */
    public static final class C20390f {
        @C12579k

        /* renamed from: e */
        public static final C20391a f52588e = new C20391a((DefaultConstructorMarker) null);
        @C12579k

        /* renamed from: f */
        public static final String f52589f = "index_";
        @C12579k
        @C11287e

        /* renamed from: a */
        public final String f52590a;
        @C11287e

        /* renamed from: b */
        public final boolean f52591b;
        @C12579k
        @C11287e

        /* renamed from: c */
        public final List<String> f52592c;
        @C12579k
        @C11287e

        /* renamed from: d */
        public List<String> f52593d;

        /* renamed from: androidx.room.util.f$f$a */
        public static final class C20391a {
            public /* synthetic */ C20391a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public C20391a() {
            }
        }

        public C20390f(@C12579k String str, boolean z, @C12579k List<String> list, @C12579k List<String> list2) {
            Intrinsics.checkNotNullParameter(str, "name");
            Intrinsics.checkNotNullParameter(list, "columns");
            Intrinsics.checkNotNullParameter(list2, "orders");
            this.f52590a = str;
            this.f52591b = z;
            this.f52592c = list;
            this.f52593d = list2;
            Collection collection = list2;
            boolean isEmpty = collection.isEmpty();
            ArrayList arrayList = collection;
            if (isEmpty) {
                int size = list.size();
                ArrayList arrayList2 = new ArrayList(size);
                for (int i = 0; i < size; i++) {
                    arrayList2.add(Index.Order.ASC.name());
                }
                arrayList = arrayList2;
            }
            this.f52593d = (List) arrayList;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C20390f)) {
                return false;
            }
            C20390f fVar = (C20390f) obj;
            if (this.f52591b != fVar.f52591b || !Intrinsics.areEqual((Object) this.f52592c, (Object) fVar.f52592c) || !Intrinsics.areEqual((Object) this.f52593d, (Object) fVar.f52593d)) {
                return false;
            }
            if (C11622t.startsWith$default(this.f52590a, f52589f, false, 2, (Object) null)) {
                return C11622t.startsWith$default(fVar.f52590a, f52589f, false, 2, (Object) null);
            }
            return Intrinsics.areEqual((Object) this.f52590a, (Object) fVar.f52590a);
        }

        public int hashCode() {
            int i;
            if (C11622t.startsWith$default(this.f52590a, f52589f, false, 2, (Object) null)) {
                i = -1184239155;
            } else {
                i = this.f52590a.hashCode();
            }
            return (((((i * 31) + (this.f52591b ? 1 : 0)) * 31) + this.f52592c.hashCode()) * 31) + this.f52593d.hashCode();
        }

        @C12579k
        public String toString() {
            return "Index{name='" + this.f52590a + "', unique=" + this.f52591b + ", columns=" + this.f52592c + ", orders=" + this.f52593d + "'}";
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        @kotlin.C11395k(message = "Use {@link #Index(String, boolean, List, List)}")
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C20390f(@org.jetbrains.annotations.C12579k java.lang.String r5, boolean r6, @org.jetbrains.annotations.C12579k java.util.List<java.lang.String> r7) {
            /*
                r4 = this;
                java.lang.String r0 = "name"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                java.lang.String r0 = "columns"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
                int r0 = r7.size()
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>(r0)
                r2 = 0
            L_0x0014:
                if (r2 >= r0) goto L_0x0022
                androidx.room.Index$Order r3 = androidx.room.Index.Order.ASC
                java.lang.String r3 = r3.name()
                r1.add(r3)
                int r2 = r2 + 1
                goto L_0x0014
            L_0x0022:
                r4.<init>(r5, r6, r7, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.util.C20383f.C20390f.<init>(java.lang.String, boolean, java.util.List):void");
        }
    }
}
