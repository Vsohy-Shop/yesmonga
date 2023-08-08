package androidx.room.util;

import androidx.annotation.RestrictTo;
import androidx.sqlite.p031db.C20466f;
import kotlin.jvm.C11287e;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.room.util.i */
public final class C20394i {
    @C12579k

    /* renamed from: c */
    public static final C20395a f52594c = new C20395a((DefaultConstructorMarker) null);
    @C12579k
    @C11287e

    /* renamed from: a */
    public final String f52595a;
    @C12580l
    @C11287e

    /* renamed from: b */
    public final String f52596b;

    /* renamed from: androidx.room.util.i$a */
    public static final class C20395a {
        public /* synthetic */ C20395a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x004c, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x004d, code lost:
            kotlin.p010io.C11133b.m42950a(r4, r5);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0050, code lost:
            throw r0;
         */
        @org.jetbrains.annotations.C12579k
        @kotlin.jvm.C11384m
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final androidx.room.util.C20394i mo61224a(@org.jetbrains.annotations.C12579k androidx.sqlite.p031db.C20466f r4, @org.jetbrains.annotations.C12579k java.lang.String r5) {
            /*
                r3 = this;
                java.lang.String r0 = "database"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                java.lang.String r0 = "viewName"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "SELECT name, sql FROM sqlite_master WHERE type = 'view' AND name = '"
                r0.append(r1)
                r0.append(r5)
                r1 = 39
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                android.database.Cursor r4 = r4.mo60771h3(r0)
                boolean r0 = r4.moveToFirst()     // Catch:{ all -> 0x004a }
                r1 = 0
                if (r0 == 0) goto L_0x0040
                androidx.room.util.i r5 = new androidx.room.util.i     // Catch:{ all -> 0x004a }
                r0 = 0
                java.lang.String r0 = r4.getString(r0)     // Catch:{ all -> 0x004a }
                java.lang.String r2 = "cursor.getString(0)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)     // Catch:{ all -> 0x004a }
                r2 = 1
                java.lang.String r2 = r4.getString(r2)     // Catch:{ all -> 0x004a }
                r5.<init>(r0, r2)     // Catch:{ all -> 0x004a }
                goto L_0x0046
            L_0x0040:
                androidx.room.util.i r0 = new androidx.room.util.i     // Catch:{ all -> 0x004a }
                r0.<init>(r5, r1)     // Catch:{ all -> 0x004a }
                r5 = r0
            L_0x0046:
                kotlin.p010io.C11133b.m42950a(r4, r1)
                return r5
            L_0x004a:
                r5 = move-exception
                throw r5     // Catch:{ all -> 0x004c }
            L_0x004c:
                r0 = move-exception
                kotlin.p010io.C11133b.m42950a(r4, r5)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.util.C20394i.C20395a.mo61224a(androidx.sqlite.db.f, java.lang.String):androidx.room.util.i");
        }

        public C20395a() {
        }
    }

    public C20394i(@C12579k String str, @C12580l String str2) {
        Intrinsics.checkNotNullParameter(str, "name");
        this.f52595a = str;
        this.f52596b = str2;
    }

    @C12579k
    @C11384m
    /* renamed from: a */
    public static final C20394i m95181a(@C12579k C20466f fVar, @C12579k String str) {
        return f52594c.mo61224a(fVar, str);
    }

    public boolean equals(@C12580l Object obj) {
        boolean z;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20394i)) {
            return false;
        }
        C20394i iVar = (C20394i) obj;
        if (Intrinsics.areEqual((Object) this.f52595a, (Object) iVar.f52595a)) {
            String str = this.f52596b;
            String str2 = iVar.f52596b;
            if (str != null) {
                z = Intrinsics.areEqual((Object) str, (Object) str2);
            } else if (str2 == null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i;
        int hashCode = this.f52595a.hashCode() * 31;
        String str = this.f52596b;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    @C12579k
    public String toString() {
        return "ViewInfo{name='" + this.f52595a + "', sql='" + this.f52596b + "'}";
    }
}
