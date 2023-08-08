package androidx.sqlite.p031db;

import android.content.Context;
import android.database.sqlite.SQLiteException;
import androidx.annotation.C0376v0;
import androidx.sqlite.p031db.C20458c;
import com.urbanairship.iam.events.C9175a;
import com.usabilla.sdk.ubform.telemetry.C10108c;
import java.io.Closeable;
import java.io.File;
import kotlin.jvm.C11287e;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11622t;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.sqlite.db.g */
public interface C20481g extends Closeable {

    /* renamed from: androidx.sqlite.db.g$a */
    public static abstract class C20482a {
        @C12579k

        /* renamed from: b */
        public static final C20483a f52796b = new C20483a((DefaultConstructorMarker) null);
        @C12579k

        /* renamed from: c */
        public static final String f52797c = "SupportSQLite";
        @C11287e

        /* renamed from: a */
        public final int f52798a;

        /* renamed from: androidx.sqlite.db.g$a$a */
        public static final class C20483a {
            public /* synthetic */ C20483a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public C20483a() {
            }
        }

        public C20482a(int i) {
            this.f52798a = i;
        }

        /* renamed from: a */
        public final void mo61407a(String str) {
            int i;
            boolean z;
            boolean z2 = true;
            if (!C11622t.equals(str, ":memory:", true)) {
                int length = str.length() - 1;
                int i2 = 0;
                boolean z3 = false;
                while (i2 <= length) {
                    if (!z3) {
                        i = i2;
                    } else {
                        i = length;
                    }
                    if (Intrinsics.compare((int) str.charAt(i), 32) <= 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z3) {
                        if (!z) {
                            z3 = true;
                        } else {
                            i2++;
                        }
                    } else if (!z) {
                        break;
                    } else {
                        length--;
                    }
                }
                if (str.subSequence(i2, length + 1).toString().length() != 0) {
                    z2 = false;
                }
                if (!z2) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("deleting the database file: ");
                    sb.append(str);
                    try {
                        C20458c.C20459a.m95348c(new File(str));
                    } catch (Exception unused) {
                    }
                }
            }
        }

        /* renamed from: b */
        public void mo61182b(@C12579k C20466f fVar) {
            Intrinsics.checkNotNullParameter(fVar, "db");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0035, code lost:
            if (r1 != null) goto L_0x0037;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0037, code lost:
            r4 = r1.iterator();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0041, code lost:
            if (r4.hasNext() != false) goto L_0x0043;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0043, code lost:
            r1 = ((android.util.Pair) r4.next()).second;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, "p.second");
            mo61407a((java.lang.String) r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0054, code lost:
            r4 = r4.getPath();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0058, code lost:
            if (r4 != null) goto L_0x005a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x005a, code lost:
            mo61407a(r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x005d, code lost:
            throw r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x002f, code lost:
            r2 = move-exception;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0031 */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0060  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x007d  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x002f A[ExcHandler: all (r2v2 'th' java.lang.Throwable A[CUSTOM_DECLARE]), PHI: r1 
          PHI: (r1v11 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>) = (r1v3 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>), (r1v4 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>), (r1v4 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>) binds: [B:6:0x002a, B:9:0x0031, B:10:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:6:0x002a] */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo61408c(@org.jetbrains.annotations.C12579k androidx.sqlite.p031db.C20466f r4) {
            /*
                r3 = this;
                java.lang.String r0 = "p.second"
                java.lang.String r1 = "db"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Corruption reported by sqlite on database: "
                r1.append(r2)
                r1.append(r4)
                java.lang.String r2 = ".path"
                r1.append(r2)
                boolean r1 = r4.isOpen()
                if (r1 != 0) goto L_0x0029
                java.lang.String r4 = r4.getPath()
                if (r4 == 0) goto L_0x0028
                r3.mo61407a(r4)
            L_0x0028:
                return
            L_0x0029:
                r1 = 0
                java.util.List r1 = r4.mo60777o0()     // Catch:{ SQLiteException -> 0x0031, all -> 0x002f }
                goto L_0x0031
            L_0x002f:
                r2 = move-exception
                goto L_0x0035
            L_0x0031:
                r4.close()     // Catch:{ IOException -> 0x005e, all -> 0x002f }
                goto L_0x005e
            L_0x0035:
                if (r1 == 0) goto L_0x0054
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.util.Iterator r4 = r1.iterator()
            L_0x003d:
                boolean r1 = r4.hasNext()
                if (r1 == 0) goto L_0x005d
                java.lang.Object r1 = r4.next()
                android.util.Pair r1 = (android.util.Pair) r1
                java.lang.Object r1 = r1.second
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
                java.lang.String r1 = (java.lang.String) r1
                r3.mo61407a(r1)
                goto L_0x003d
            L_0x0054:
                java.lang.String r4 = r4.getPath()
                if (r4 == 0) goto L_0x005d
                r3.mo61407a(r4)
            L_0x005d:
                throw r2
            L_0x005e:
                if (r1 == 0) goto L_0x007d
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.util.Iterator r4 = r1.iterator()
            L_0x0066:
                boolean r1 = r4.hasNext()
                if (r1 == 0) goto L_0x0086
                java.lang.Object r1 = r4.next()
                android.util.Pair r1 = (android.util.Pair) r1
                java.lang.Object r1 = r1.second
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
                java.lang.String r1 = (java.lang.String) r1
                r3.mo61407a(r1)
                goto L_0x0066
            L_0x007d:
                java.lang.String r4 = r4.getPath()
                if (r4 == 0) goto L_0x0086
                r3.mo61407a(r4)
            L_0x0086:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.sqlite.p031db.C20481g.C20482a.mo61408c(androidx.sqlite.db.f):void");
        }

        /* renamed from: d */
        public abstract void mo60972d(@C12579k C20466f fVar);

        /* renamed from: e */
        public void mo61183e(@C12579k C20466f fVar, int i, int i2) {
            Intrinsics.checkNotNullParameter(fVar, "db");
            throw new SQLiteException("Can't downgrade database from version " + i + " to " + i2);
        }

        /* renamed from: f */
        public void mo60973f(@C12579k C20466f fVar) {
            Intrinsics.checkNotNullParameter(fVar, "db");
        }

        /* renamed from: g */
        public abstract void mo60974g(@C12579k C20466f fVar, int i, int i2);
    }

    /* renamed from: androidx.sqlite.db.g$c */
    public interface C20487c {
        @C12579k
        /* renamed from: a */
        C20481g mo18120a(@C12579k C20484b bVar);
    }

    @C12579k
    /* renamed from: Z2 */
    C20466f mo18111Z2();

    void close();

    @C12579k
    /* renamed from: d3 */
    C20466f mo18117d3();

    @C12580l
    String getDatabaseName();

    @C0376v0(api = 16)
    void setWriteAheadLoggingEnabled(boolean z);

    /* renamed from: androidx.sqlite.db.g$b */
    public static final class C20484b {
        @C12579k

        /* renamed from: f */
        public static final C20486b f52799f = new C20486b((DefaultConstructorMarker) null);
        @C12579k
        @C11287e

        /* renamed from: a */
        public final Context f52800a;
        @C12580l
        @C11287e

        /* renamed from: b */
        public final String f52801b;
        @C12579k
        @C11287e

        /* renamed from: c */
        public final C20482a f52802c;
        @C11287e

        /* renamed from: d */
        public final boolean f52803d;
        @C11287e

        /* renamed from: e */
        public final boolean f52804e;

        /* renamed from: androidx.sqlite.db.g$b$a */
        public static class C20485a {
            @C12579k

            /* renamed from: a */
            public final Context f52805a;
            @C12580l

            /* renamed from: b */
            public String f52806b;
            @C12580l

            /* renamed from: c */
            public C20482a f52807c;

            /* renamed from: d */
            public boolean f52808d;

            /* renamed from: e */
            public boolean f52809e;

            public C20485a(@C12579k Context context) {
                Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
                this.f52805a = context;
            }

            @C12579k
            /* renamed from: a */
            public C20485a mo61409a(boolean z) {
                this.f52809e = z;
                return this;
            }

            @C12579k
            /* renamed from: b */
            public C20484b mo61410b() {
                boolean z;
                C20482a aVar = this.f52807c;
                if (aVar != null) {
                    boolean z2 = true;
                    if (this.f52808d) {
                        String str = this.f52806b;
                        if (str == null || str.length() == 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            z2 = false;
                        }
                    }
                    if (z2) {
                        return new C20484b(this.f52805a, this.f52806b, aVar, this.f52808d, this.f52809e);
                    }
                    throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.".toString());
                }
                throw new IllegalArgumentException("Must set a callback to create the configuration.".toString());
            }

            @C12579k
            /* renamed from: c */
            public C20485a mo61411c(@C12579k C20482a aVar) {
                Intrinsics.checkNotNullParameter(aVar, C10108c.f27778C);
                this.f52807c = aVar;
                return this;
            }

            @C12579k
            /* renamed from: d */
            public C20485a mo61412d(@C12580l String str) {
                this.f52806b = str;
                return this;
            }

            @C12579k
            /* renamed from: e */
            public C20485a mo61413e(boolean z) {
                this.f52808d = z;
                return this;
            }
        }

        /* renamed from: androidx.sqlite.db.g$b$b */
        public static final class C20486b {
            public /* synthetic */ C20486b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @C12579k
            @C11384m
            /* renamed from: a */
            public final C20485a mo61414a(@C12579k Context context) {
                Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
                return new C20485a(context);
            }

            public C20486b() {
            }
        }

        public C20484b(@C12579k Context context, @C12580l String str, @C12579k C20482a aVar, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
            Intrinsics.checkNotNullParameter(aVar, C10108c.f27778C);
            this.f52800a = context;
            this.f52801b = str;
            this.f52802c = aVar;
            this.f52803d = z;
            this.f52804e = z2;
        }

        @C12579k
        @C11384m
        /* renamed from: a */
        public static final C20485a m95489a(@C12579k Context context) {
            return f52799f.mo61414a(context);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C20484b(Context context, String str, C20482a aVar, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(context, str, aVar, (i & 8) != 0 ? false : z, (i & 16) != 0 ? false : z2);
        }
    }
}
