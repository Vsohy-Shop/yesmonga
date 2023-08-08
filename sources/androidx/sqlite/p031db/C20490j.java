package androidx.sqlite.p031db;

import java.util.regex.Pattern;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.sqlite.db.j */
public final class C20490j {
    @C12579k

    /* renamed from: j */
    public static final C20491a f52810j = new C20491a((DefaultConstructorMarker) null);

    /* renamed from: k */
    public static final Pattern f52811k = Pattern.compile("\\s*\\d+\\s*(,\\s*\\d+\\s*)?");
    @C12579k

    /* renamed from: a */
    public final String f52812a;

    /* renamed from: b */
    public boolean f52813b;
    @C12580l

    /* renamed from: c */
    public String[] f52814c;
    @C12580l

    /* renamed from: d */
    public String f52815d;
    @C12580l

    /* renamed from: e */
    public Object[] f52816e;
    @C12580l

    /* renamed from: f */
    public String f52817f;
    @C12580l

    /* renamed from: g */
    public String f52818g;
    @C12580l

    /* renamed from: h */
    public String f52819h;
    @C12580l

    /* renamed from: i */
    public String f52820i;

    /* renamed from: androidx.sqlite.db.j$a */
    public static final class C20491a {
        public /* synthetic */ C20491a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        @C11384m
        /* renamed from: a */
        public final C20490j mo61425a(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "tableName");
            return new C20490j(str, (DefaultConstructorMarker) null);
        }

        public C20491a() {
        }
    }

    public /* synthetic */ C20490j(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    @C12579k
    @C11384m
    /* renamed from: c */
    public static final C20490j m95506c(@C12579k String str) {
        return f52810j.mo61425a(str);
    }

    /* renamed from: a */
    public final void mo61415a(StringBuilder sb, String str, String str2) {
        boolean z;
        if (str2 == null || str2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            sb.append(str);
            sb.append(str2);
        }
    }

    /* renamed from: b */
    public final void mo61416b(StringBuilder sb, String[] strArr) {
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            String str = strArr[i];
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(str);
        }
        sb.append(' ');
    }

    @C12579k
    /* renamed from: d */
    public final C20490j mo61417d(@C12580l String[] strArr) {
        this.f52814c = strArr;
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0047, code lost:
        if (r4 != false) goto L_0x0049;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0096  */
    @org.jetbrains.annotations.C12579k
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.sqlite.p031db.C20489i mo61418e() {
        /*
            r5 = this;
            java.lang.String r0 = r5.f52817f
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x000f
            int r0 = r0.length()
            if (r0 != 0) goto L_0x000d
            goto L_0x000f
        L_0x000d:
            r0 = r1
            goto L_0x0010
        L_0x000f:
            r0 = r2
        L_0x0010:
            if (r0 == 0) goto L_0x0025
            java.lang.String r0 = r5.f52818g
            if (r0 == 0) goto L_0x001f
            int r0 = r0.length()
            if (r0 != 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r0 = r1
            goto L_0x0020
        L_0x001f:
            r0 = r2
        L_0x0020:
            if (r0 == 0) goto L_0x0023
            goto L_0x0025
        L_0x0023:
            r0 = r1
            goto L_0x0026
        L_0x0025:
            r0 = r2
        L_0x0026:
            if (r0 == 0) goto L_0x0096
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r3 = 120(0x78, float:1.68E-43)
            r0.<init>(r3)
            java.lang.String r3 = "SELECT "
            r0.append(r3)
            boolean r3 = r5.f52813b
            if (r3 == 0) goto L_0x003d
            java.lang.String r3 = "DISTINCT "
            r0.append(r3)
        L_0x003d:
            java.lang.String[] r3 = r5.f52814c
            if (r3 == 0) goto L_0x0049
            int r4 = r3.length
            if (r4 != 0) goto L_0x0046
            r4 = r2
            goto L_0x0047
        L_0x0046:
            r4 = r1
        L_0x0047:
            if (r4 == 0) goto L_0x004a
        L_0x0049:
            r1 = r2
        L_0x004a:
            if (r1 != 0) goto L_0x0053
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
            r5.mo61416b(r0, r3)
            goto L_0x0058
        L_0x0053:
            java.lang.String r1 = "* "
            r0.append(r1)
        L_0x0058:
            java.lang.String r1 = "FROM "
            r0.append(r1)
            java.lang.String r1 = r5.f52812a
            r0.append(r1)
            java.lang.String r1 = " WHERE "
            java.lang.String r2 = r5.f52815d
            r5.mo61415a(r0, r1, r2)
            java.lang.String r1 = " GROUP BY "
            java.lang.String r2 = r5.f52817f
            r5.mo61415a(r0, r1, r2)
            java.lang.String r1 = " HAVING "
            java.lang.String r2 = r5.f52818g
            r5.mo61415a(r0, r1, r2)
            java.lang.String r1 = " ORDER BY "
            java.lang.String r2 = r5.f52819h
            r5.mo61415a(r0, r1, r2)
            java.lang.String r1 = " LIMIT "
            java.lang.String r2 = r5.f52820i
            r5.mo61415a(r0, r1, r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "StringBuilder(capacity).…builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            androidx.sqlite.db.b r1 = new androidx.sqlite.db.b
            java.lang.Object[] r2 = r5.f52816e
            r1.<init>(r0, r2)
            return r1
        L_0x0096:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "HAVING clauses are only permitted when using a groupBy clause"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.sqlite.p031db.C20490j.mo61418e():androidx.sqlite.db.i");
    }

    @C12579k
    /* renamed from: f */
    public final C20490j mo61419f() {
        this.f52813b = true;
        return this;
    }

    @C12579k
    /* renamed from: g */
    public final C20490j mo61420g(@C12580l String str) {
        this.f52817f = str;
        return this;
    }

    @C12579k
    /* renamed from: h */
    public final C20490j mo61421h(@C12580l String str) {
        this.f52818g = str;
        return this;
    }

    @C12579k
    /* renamed from: i */
    public final C20490j mo61422i(@C12579k String str) {
        boolean z;
        Intrinsics.checkNotNullParameter(str, "limit");
        boolean matches = f52811k.matcher(str).matches();
        boolean z2 = true;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z && !matches) {
            z2 = false;
        }
        if (z2) {
            this.f52820i = str;
            return this;
        }
        throw new IllegalArgumentException(("invalid LIMIT clauses:" + str).toString());
    }

    @C12579k
    /* renamed from: j */
    public final C20490j mo61423j(@C12580l String str) {
        this.f52819h = str;
        return this;
    }

    @C12579k
    /* renamed from: k */
    public final C20490j mo61424k(@C12580l String str, @C12580l Object[] objArr) {
        this.f52815d = str;
        this.f52816e = objArr;
        return this;
    }

    public C20490j(String str) {
        this.f52812a = str;
    }
}
