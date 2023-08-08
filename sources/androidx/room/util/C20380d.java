package androidx.room.util;

import android.annotation.SuppressLint;
import androidx.annotation.C0344h1;
import androidx.annotation.RestrictTo;
import androidx.sqlite.p031db.C20466f;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Set;
import kotlin.collections.C10930d1;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.C11287e;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11622t;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.room.util.d */
public final class C20380d {
    @C12579k

    /* renamed from: d */
    public static final C20381a f52557d = new C20381a((DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: e */
    public static final String[] f52558e = {"tokenize=", "compress=", "content=", "languageid=", "matchinfo=", "notindexed=", "order=", "prefix=", "uncompress="};
    @C12579k
    @C11287e

    /* renamed from: a */
    public final String f52559a;
    @C12579k
    @C11287e

    /* renamed from: b */
    public final Set<String> f52560b;
    @C12579k
    @C11287e

    /* renamed from: c */
    public final Set<String> f52561c;

    /* renamed from: androidx.room.util.d$a */
    public static final class C20381a {
        public /* synthetic */ C20381a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C0344h1
        @C12579k
        @C11384m
        /* renamed from: a */
        public final Set<String> mo61194a(@C12579k String str) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            int i;
            boolean z5;
            Character ch;
            Intrinsics.checkNotNullParameter(str, "createStatement");
            if (str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return C10930d1.m40892k();
            }
            String str2 = str;
            String substring = str.substring(StringsKt__StringsKt.indexOf$default((CharSequence) str2, '(', 0, false, 6, (Object) null) + 1, StringsKt__StringsKt.lastIndexOf$default((CharSequence) str2, ')', 0, false, 6, (Object) null));
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            ArrayList arrayList = new ArrayList();
            ArrayDeque arrayDeque = new ArrayDeque();
            int i2 = -1;
            int i3 = 0;
            int i4 = 0;
            while (i3 < substring.length()) {
                char charAt = substring.charAt(i3);
                int i5 = i4 + 1;
                if (charAt == '\'' || charAt == '\"') {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (!z3 && charAt != '`') {
                    z4 = false;
                } else {
                    z4 = true;
                }
                if (z4) {
                    if (arrayDeque.isEmpty()) {
                        arrayDeque.push(Character.valueOf(charAt));
                    } else {
                        Character ch2 = (Character) arrayDeque.peek();
                        if (ch2 != null && ch2.charValue() == charAt) {
                            arrayDeque.pop();
                        }
                    }
                } else if (charAt == '[') {
                    if (arrayDeque.isEmpty()) {
                        arrayDeque.push(Character.valueOf(charAt));
                    }
                } else if (charAt == ']') {
                    if (!arrayDeque.isEmpty() && (ch = (Character) arrayDeque.peek()) != null && ch.charValue() == '[') {
                        arrayDeque.pop();
                    }
                } else if (charAt == ',' && arrayDeque.isEmpty()) {
                    String substring2 = substring.substring(i2 + 1, i4);
                    Intrinsics.checkNotNullExpressionValue(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                    int length = substring2.length() - 1;
                    int i6 = 0;
                    boolean z6 = false;
                    while (i6 <= length) {
                        if (!z6) {
                            i = i6;
                        } else {
                            i = length;
                        }
                        if (Intrinsics.compare((int) substring2.charAt(i), 32) <= 0) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (!z6) {
                            if (!z5) {
                                z6 = true;
                            } else {
                                i6++;
                            }
                        } else if (!z5) {
                            break;
                        } else {
                            length--;
                        }
                    }
                    arrayList.add(substring2.subSequence(i6, length + 1).toString());
                    i2 = i4;
                }
                i3++;
                i4 = i5;
            }
            String substring3 = substring.substring(i2 + 1);
            Intrinsics.checkNotNullExpressionValue(substring3, "this as java.lang.String).substring(startIndex)");
            arrayList.add(StringsKt__StringsKt.trim(substring3).toString());
            ArrayList arrayList2 = new ArrayList();
            for (Object next : arrayList) {
                String str3 = (String) next;
                String[] a = C20380d.f52558e;
                int length2 = a.length;
                int i7 = 0;
                while (true) {
                    if (i7 >= length2) {
                        z2 = false;
                        break;
                    } else if (C11622t.startsWith$default(str3, a[i7], false, 2, (Object) null)) {
                        z2 = true;
                        break;
                    } else {
                        i7++;
                    }
                }
                if (z2) {
                    arrayList2.add(next);
                }
            }
            return CollectionsKt___CollectionsKt.m40582V5(arrayList2);
        }

        @SuppressLint({"SyntheticAccessor"})
        @C12579k
        @C11384m
        /* renamed from: b */
        public final C20380d mo61195b(@C12579k C20466f fVar, @C12579k String str) {
            Intrinsics.checkNotNullParameter(fVar, "database");
            Intrinsics.checkNotNullParameter(str, "tableName");
            return new C20380d(str, mo61196c(fVar, str), mo61197d(fVar, str));
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x004a, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x004b, code lost:
            kotlin.p010io.C11133b.m42950a(r4, r5);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x004e, code lost:
            throw r0;
         */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.util.Set<java.lang.String> mo61196c(androidx.sqlite.p031db.C20466f r4, java.lang.String r5) {
            /*
                r3 = this;
                java.util.Set r0 = kotlin.collections.C10927c1.m40881d()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "PRAGMA table_info(`"
                r1.append(r2)
                r1.append(r5)
                java.lang.String r5 = "`)"
                r1.append(r5)
                java.lang.String r5 = r1.toString()
                android.database.Cursor r4 = r4.mo60771h3(r5)
                int r5 = r4.getColumnCount()     // Catch:{ all -> 0x0048 }
                if (r5 <= 0) goto L_0x003d
                java.lang.String r5 = "name"
                int r5 = r4.getColumnIndex(r5)     // Catch:{ all -> 0x0048 }
            L_0x002a:
                boolean r1 = r4.moveToNext()     // Catch:{ all -> 0x0048 }
                if (r1 == 0) goto L_0x003d
                java.lang.String r1 = r4.getString(r5)     // Catch:{ all -> 0x0048 }
                java.lang.String r2 = "cursor.getString(nameIndex)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)     // Catch:{ all -> 0x0048 }
                r0.add(r1)     // Catch:{ all -> 0x0048 }
                goto L_0x002a
            L_0x003d:
                kotlin.d2 r5 = kotlin.C11079d2.f28267a     // Catch:{ all -> 0x0048 }
                r5 = 0
                kotlin.p010io.C11133b.m42950a(r4, r5)
                java.util.Set r4 = kotlin.collections.C10927c1.m40878a(r0)
                return r4
            L_0x0048:
                r5 = move-exception
                throw r5     // Catch:{ all -> 0x004a }
            L_0x004a:
                r0 = move-exception
                kotlin.p010io.C11133b.m42950a(r4, r5)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.util.C20380d.C20381a.mo61196c(androidx.sqlite.db.f, java.lang.String):java.util.Set");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x003b, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x003c, code lost:
            kotlin.p010io.C11133b.m42950a(r3, r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x003f, code lost:
            throw r0;
         */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.util.Set<java.lang.String> mo61197d(androidx.sqlite.p031db.C20466f r3, java.lang.String r4) {
            /*
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "SELECT * FROM sqlite_master WHERE `name` = '"
                r0.append(r1)
                r0.append(r4)
                r4 = 39
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                android.database.Cursor r3 = r3.mo60771h3(r4)
                boolean r4 = r3.moveToFirst()     // Catch:{ all -> 0x0039 }
                java.lang.String r0 = "sql"
                if (r4 == 0) goto L_0x002b
                int r4 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0039 }
                java.lang.String r4 = r3.getString(r4)     // Catch:{ all -> 0x0039 }
                goto L_0x002d
            L_0x002b:
                java.lang.String r4 = ""
            L_0x002d:
                r1 = 0
                kotlin.p010io.C11133b.m42950a(r3, r1)
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r0)
                java.util.Set r3 = r2.mo61194a(r4)
                return r3
            L_0x0039:
                r4 = move-exception
                throw r4     // Catch:{ all -> 0x003b }
            L_0x003b:
                r0 = move-exception
                kotlin.p010io.C11133b.m42950a(r3, r4)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.util.C20380d.C20381a.mo61197d(androidx.sqlite.db.f, java.lang.String):java.util.Set");
        }

        public C20381a() {
        }
    }

    public C20380d(@C12579k String str, @C12579k Set<String> set, @C12579k Set<String> set2) {
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(set, "columns");
        Intrinsics.checkNotNullParameter(set2, "options");
        this.f52559a = str;
        this.f52560b = set;
        this.f52561c = set2;
    }

    @C0344h1
    @C12579k
    @C11384m
    /* renamed from: b */
    public static final Set<String> m95149b(@C12579k String str) {
        return f52557d.mo61194a(str);
    }

    @SuppressLint({"SyntheticAccessor"})
    @C12579k
    @C11384m
    /* renamed from: c */
    public static final C20380d m95150c(@C12579k C20466f fVar, @C12579k String str) {
        return f52557d.mo61195b(fVar, str);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20380d)) {
            return false;
        }
        C20380d dVar = (C20380d) obj;
        if (Intrinsics.areEqual((Object) this.f52559a, (Object) dVar.f52559a) && Intrinsics.areEqual((Object) this.f52560b, (Object) dVar.f52560b)) {
            return Intrinsics.areEqual((Object) this.f52561c, (Object) dVar.f52561c);
        }
        return false;
    }

    public int hashCode() {
        return (((this.f52559a.hashCode() * 31) + this.f52560b.hashCode()) * 31) + this.f52561c.hashCode();
    }

    @C12579k
    public String toString() {
        return "FtsTableInfo{name='" + this.f52559a + "', columns=" + this.f52560b + ", options=" + this.f52561c + "'}";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C20380d(@C12579k String str, @C12579k Set<String> set, @C12579k String str2) {
        this(str, set, f52557d.mo61194a(str2));
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(set, "columns");
        Intrinsics.checkNotNullParameter(str2, "createSql");
    }
}
