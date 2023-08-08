package androidx.sqlite.p031db;

import android.annotation.SuppressLint;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.sqlite.db.b */
public final class C20456b implements C20489i {
    @C12579k

    /* renamed from: c */
    public static final C20457a f52752c = new C20457a((DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: a */
    public final String f52753a;
    @C12580l

    /* renamed from: b */
    public final Object[] f52754b;

    /* renamed from: androidx.sqlite.db.b$a */
    public static final class C20457a {
        public /* synthetic */ C20457a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo61375a(C20488h hVar, int i, Object obj) {
            long j;
            if (obj == null) {
                hVar.mo60800u3(i);
            } else if (obj instanceof byte[]) {
                hVar.mo60791a3(i, (byte[]) obj);
            } else if (obj instanceof Float) {
                hVar.mo60788G0(i, (double) ((Number) obj).floatValue());
            } else if (obj instanceof Double) {
                hVar.mo60788G0(i, ((Number) obj).doubleValue());
            } else if (obj instanceof Long) {
                hVar.mo60790S2(i, ((Number) obj).longValue());
            } else if (obj instanceof Integer) {
                hVar.mo60790S2(i, (long) ((Number) obj).intValue());
            } else if (obj instanceof Short) {
                hVar.mo60790S2(i, (long) ((Number) obj).shortValue());
            } else if (obj instanceof Byte) {
                hVar.mo60790S2(i, (long) ((Number) obj).byteValue());
            } else if (obj instanceof String) {
                hVar.mo60801v2(i, (String) obj);
            } else if (obj instanceof Boolean) {
                if (((Boolean) obj).booleanValue()) {
                    j = 1;
                } else {
                    j = 0;
                }
                hVar.mo60790S2(i, j);
            } else {
                throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
            }
        }

        @SuppressLint({"SyntheticAccessor"})
        @C11384m
        /* renamed from: b */
        public final void mo61376b(@C12579k C20488h hVar, @C12580l Object[] objArr) {
            Intrinsics.checkNotNullParameter(hVar, "statement");
            if (objArr != null) {
                int length = objArr.length;
                int i = 0;
                while (i < length) {
                    Object obj = objArr[i];
                    i++;
                    mo61375a(hVar, i, obj);
                }
            }
        }

        public C20457a() {
        }
    }

    public C20456b(@C12579k String str, @C12580l Object[] objArr) {
        Intrinsics.checkNotNullParameter(str, "query");
        this.f52753a = str;
        this.f52754b = objArr;
    }

    @SuppressLint({"SyntheticAccessor"})
    @C11384m
    /* renamed from: d */
    public static final void m95340d(@C12579k C20488h hVar, @C12580l Object[] objArr) {
        f52752c.mo61376b(hVar, objArr);
    }

    /* renamed from: a */
    public int mo61232a() {
        Object[] objArr = this.f52754b;
        if (objArr != null) {
            return objArr.length;
        }
        return 0;
    }

    @C12579k
    /* renamed from: b */
    public String mo61233b() {
        return this.f52753a;
    }

    /* renamed from: c */
    public void mo61234c(@C12579k C20488h hVar) {
        Intrinsics.checkNotNullParameter(hVar, "statement");
        f52752c.mo61376b(hVar, this.f52754b);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C20456b(@C12579k String str) {
        this(str, (Object[]) null);
        Intrinsics.checkNotNullParameter(str, "query");
    }
}
