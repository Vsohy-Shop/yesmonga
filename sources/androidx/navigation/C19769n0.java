package androidx.navigation;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.C0325c;
import androidx.annotation.RestrictTo;
import androidx.constraintlayout.core.motion.utils.C16717v;
import com.carrefour.fid.android.airship.util.C13758b;
import com.carrefour.fid.android.design.components.extension.C37106a;
import com.urbanairship.analytics.location.C35560b;
import java.io.Serializable;
import kotlin.jvm.C11287e;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11600b;
import kotlin.text.C11622t;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.navigation.n0 */
public abstract class C19769n0<T> {
    @C12579k

    /* renamed from: c */
    public static final C19781l f50610c = new C19781l((DefaultConstructorMarker) null);
    @C12579k
    @C11287e

    /* renamed from: d */
    public static final C19769n0<Integer> f50611d = new C19775f();
    @C12579k
    @C11287e

    /* renamed from: e */
    public static final C19769n0<Integer> f50612e = new C19778i();
    @C12579k
    @C11287e

    /* renamed from: f */
    public static final C19769n0<int[]> f50613f = new C19774e();
    @C12579k
    @C11287e

    /* renamed from: g */
    public static final C19769n0<Long> f50614g = new C19777h();
    @C12579k
    @C11287e

    /* renamed from: h */
    public static final C19769n0<long[]> f50615h = new C19776g();
    @C12579k
    @C11287e

    /* renamed from: i */
    public static final C19769n0<Float> f50616i = new C19773d();
    @C12579k
    @C11287e

    /* renamed from: j */
    public static final C19769n0<float[]> f50617j = new C19772c();
    @C12579k
    @C11287e

    /* renamed from: k */
    public static final C19769n0<Boolean> f50618k = new C19771b();
    @C12579k
    @C11287e

    /* renamed from: l */
    public static final C19769n0<boolean[]> f50619l = new C19770a();
    @C12579k
    @C11287e

    /* renamed from: m */
    public static final C19769n0<String> f50620m = new C19780k();
    @C12579k
    @C11287e

    /* renamed from: n */
    public static final C19769n0<String[]> f50621n = new C19779j();

    /* renamed from: a */
    public final boolean f50622a;
    @C12579k

    /* renamed from: b */
    public final String f50623b = "nav_type";

    /* renamed from: androidx.navigation.n0$a */
    public static final class C19770a extends C19769n0<boolean[]> {
        public C19770a() {
            super(true);
        }

        @C12579k
        /* renamed from: c */
        public String mo58476c() {
            return "boolean[]";
        }

        @C12580l
        /* renamed from: j */
        public boolean[] mo58475b(@C12579k Bundle bundle, @C12579k String str) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(str, "key");
            return (boolean[]) bundle.get(str);
        }

        @C12579k
        /* renamed from: k */
        public boolean[] mo58479h(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        /* renamed from: l */
        public void mo58480i(@C12579k Bundle bundle, @C12579k String str, @C12580l boolean[] zArr) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(str, "key");
            bundle.putBooleanArray(str, zArr);
        }
    }

    /* renamed from: androidx.navigation.n0$b */
    public static final class C19771b extends C19769n0<Boolean> {
        public C19771b() {
            super(false);
        }

        @C12579k
        /* renamed from: c */
        public String mo58476c() {
            return C16717v.C16719b.f42183f;
        }

        /* renamed from: i */
        public /* bridge */ /* synthetic */ void mo58480i(Bundle bundle, String str, Object obj) {
            mo58487l(bundle, str, ((Boolean) obj).booleanValue());
        }

        @C12580l
        /* renamed from: j */
        public Boolean mo58475b(@C12579k Bundle bundle, @C12579k String str) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(str, "key");
            return (Boolean) bundle.get(str);
        }

        @C12579k
        /* renamed from: k */
        public Boolean mo58479h(@C12579k String str) {
            boolean z;
            Intrinsics.checkNotNullParameter(str, "value");
            if (Intrinsics.areEqual((Object) str, (Object) C13758b.f33436b)) {
                z = true;
            } else if (Intrinsics.areEqual((Object) str, (Object) C13758b.f33438c)) {
                z = false;
            } else {
                throw new IllegalArgumentException("A boolean NavType only accepts \"true\" or \"false\" values.");
            }
            return Boolean.valueOf(z);
        }

        /* renamed from: l */
        public void mo58487l(@C12579k Bundle bundle, @C12579k String str, boolean z) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(str, "key");
            bundle.putBoolean(str, z);
        }
    }

    /* renamed from: androidx.navigation.n0$c */
    public static final class C19772c extends C19769n0<float[]> {
        public C19772c() {
            super(true);
        }

        @C12579k
        /* renamed from: c */
        public String mo58476c() {
            return "float[]";
        }

        @C12580l
        /* renamed from: j */
        public float[] mo58475b(@C12579k Bundle bundle, @C12579k String str) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(str, "key");
            return (float[]) bundle.get(str);
        }

        @C12579k
        /* renamed from: k */
        public float[] mo58479h(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        /* renamed from: l */
        public void mo58480i(@C12579k Bundle bundle, @C12579k String str, @C12580l float[] fArr) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(str, "key");
            bundle.putFloatArray(str, fArr);
        }
    }

    /* renamed from: androidx.navigation.n0$d */
    public static final class C19773d extends C19769n0<Float> {
        public C19773d() {
            super(false);
        }

        @C12579k
        /* renamed from: c */
        public String mo58476c() {
            return C16717v.C16719b.f42180c;
        }

        /* renamed from: i */
        public /* bridge */ /* synthetic */ void mo58480i(Bundle bundle, String str, Object obj) {
            mo58493l(bundle, str, ((Number) obj).floatValue());
        }

        @C12579k
        /* renamed from: j */
        public Float mo58475b(@C12579k Bundle bundle, @C12579k String str) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(str, "key");
            Object obj = bundle.get(str);
            if (obj != null) {
                return Float.valueOf(((Float) obj).floatValue());
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
        }

        @C12579k
        /* renamed from: k */
        public Float mo58479h(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "value");
            return Float.valueOf(Float.parseFloat(str));
        }

        /* renamed from: l */
        public void mo58493l(@C12579k Bundle bundle, @C12579k String str, float f) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(str, "key");
            bundle.putFloat(str, f);
        }
    }

    /* renamed from: androidx.navigation.n0$e */
    public static final class C19774e extends C19769n0<int[]> {
        public C19774e() {
            super(true);
        }

        @C12579k
        /* renamed from: c */
        public String mo58476c() {
            return "integer[]";
        }

        @C12580l
        /* renamed from: j */
        public int[] mo58475b(@C12579k Bundle bundle, @C12579k String str) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(str, "key");
            return (int[]) bundle.get(str);
        }

        @C12579k
        /* renamed from: k */
        public int[] mo58479h(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        /* renamed from: l */
        public void mo58480i(@C12579k Bundle bundle, @C12579k String str, @C12580l int[] iArr) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(str, "key");
            bundle.putIntArray(str, iArr);
        }
    }

    /* renamed from: androidx.navigation.n0$f */
    public static final class C19775f extends C19769n0<Integer> {
        public C19775f() {
            super(false);
        }

        @C12579k
        /* renamed from: c */
        public String mo58476c() {
            return C16717v.C16719b.f42179b;
        }

        /* renamed from: i */
        public /* bridge */ /* synthetic */ void mo58480i(Bundle bundle, String str, Object obj) {
            mo58499l(bundle, str, ((Number) obj).intValue());
        }

        @C12579k
        /* renamed from: j */
        public Integer mo58475b(@C12579k Bundle bundle, @C12579k String str) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(str, "key");
            Object obj = bundle.get(str);
            if (obj != null) {
                return Integer.valueOf(((Integer) obj).intValue());
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
        }

        @C12579k
        /* renamed from: k */
        public Integer mo58479h(@C12579k String str) {
            int i;
            Intrinsics.checkNotNullParameter(str, "value");
            if (C11622t.startsWith$default(str, "0x", false, 2, (Object) null)) {
                String substring = str.substring(2);
                Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
                i = Integer.parseInt(substring, C11600b.m45172a(16));
            } else {
                i = Integer.parseInt(str);
            }
            return Integer.valueOf(i);
        }

        /* renamed from: l */
        public void mo58499l(@C12579k Bundle bundle, @C12579k String str, int i) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(str, "key");
            bundle.putInt(str, i);
        }
    }

    /* renamed from: androidx.navigation.n0$g */
    public static final class C19776g extends C19769n0<long[]> {
        public C19776g() {
            super(true);
        }

        @C12579k
        /* renamed from: c */
        public String mo58476c() {
            return "long[]";
        }

        @C12580l
        /* renamed from: j */
        public long[] mo58475b(@C12579k Bundle bundle, @C12579k String str) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(str, "key");
            return (long[]) bundle.get(str);
        }

        @C12579k
        /* renamed from: k */
        public long[] mo58479h(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        /* renamed from: l */
        public void mo58480i(@C12579k Bundle bundle, @C12579k String str, @C12580l long[] jArr) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(str, "key");
            bundle.putLongArray(str, jArr);
        }
    }

    /* renamed from: androidx.navigation.n0$h */
    public static final class C19777h extends C19769n0<Long> {
        public C19777h() {
            super(false);
        }

        @C12579k
        /* renamed from: c */
        public String mo58476c() {
            return C35560b.f87804W0;
        }

        /* renamed from: i */
        public /* bridge */ /* synthetic */ void mo58480i(Bundle bundle, String str, Object obj) {
            mo58505l(bundle, str, ((Number) obj).longValue());
        }

        @C12579k
        /* renamed from: j */
        public Long mo58475b(@C12579k Bundle bundle, @C12579k String str) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(str, "key");
            Object obj = bundle.get(str);
            if (obj != null) {
                return Long.valueOf(((Long) obj).longValue());
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
        }

        @C12579k
        /* renamed from: k */
        public Long mo58479h(@C12579k String str) {
            String str2;
            long j;
            Intrinsics.checkNotNullParameter(str, "value");
            if (C11622t.endsWith$default(str, C37106a.f92899d, false, 2, (Object) null)) {
                str2 = str.substring(0, str.length() - 1);
                Intrinsics.checkNotNullExpressionValue(str2, "this as java.lang.String…ing(startIndex, endIndex)");
            } else {
                str2 = str;
            }
            if (C11622t.startsWith$default(str, "0x", false, 2, (Object) null)) {
                String substring = str2.substring(2);
                Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
                j = Long.parseLong(substring, C11600b.m45172a(16));
            } else {
                j = Long.parseLong(str2);
            }
            return Long.valueOf(j);
        }

        /* renamed from: l */
        public void mo58505l(@C12579k Bundle bundle, @C12579k String str, long j) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(str, "key");
            bundle.putLong(str, j);
        }
    }

    /* renamed from: androidx.navigation.n0$i */
    public static final class C19778i extends C19769n0<Integer> {
        public C19778i() {
            super(false);
        }

        @C12579k
        /* renamed from: c */
        public String mo58476c() {
            return "reference";
        }

        /* renamed from: i */
        public /* bridge */ /* synthetic */ void mo58480i(Bundle bundle, String str, Object obj) {
            mo58508l(bundle, str, ((Number) obj).intValue());
        }

        @C0325c
        @C12579k
        /* renamed from: j */
        public Integer mo58475b(@C12579k Bundle bundle, @C12579k String str) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(str, "key");
            Object obj = bundle.get(str);
            if (obj != null) {
                return Integer.valueOf(((Integer) obj).intValue());
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
        }

        @C12579k
        /* renamed from: k */
        public Integer mo58479h(@C12579k String str) {
            int i;
            Intrinsics.checkNotNullParameter(str, "value");
            if (C11622t.startsWith$default(str, "0x", false, 2, (Object) null)) {
                String substring = str.substring(2);
                Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
                i = Integer.parseInt(substring, C11600b.m45172a(16));
            } else {
                i = Integer.parseInt(str);
            }
            return Integer.valueOf(i);
        }

        /* renamed from: l */
        public void mo58508l(@C12579k Bundle bundle, @C12579k String str, @C0325c int i) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(str, "key");
            bundle.putInt(str, i);
        }
    }

    /* renamed from: androidx.navigation.n0$j */
    public static final class C19779j extends C19769n0<String[]> {
        public C19779j() {
            super(true);
        }

        @C12579k
        /* renamed from: c */
        public String mo58476c() {
            return "string[]";
        }

        @C12580l
        /* renamed from: j */
        public String[] mo58475b(@C12579k Bundle bundle, @C12579k String str) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(str, "key");
            return (String[]) bundle.get(str);
        }

        @C12580l
        /* renamed from: k */
        public String[] mo58479h(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        /* renamed from: l */
        public void mo58480i(@C12579k Bundle bundle, @C12579k String str, @C12580l String[] strArr) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(str, "key");
            bundle.putStringArray(str, strArr);
        }
    }

    /* renamed from: androidx.navigation.n0$k */
    public static final class C19780k extends C19769n0<String> {
        public C19780k() {
            super(true);
        }

        @C12579k
        /* renamed from: c */
        public String mo58476c() {
            return C16717v.C16719b.f42182e;
        }

        @C12580l
        /* renamed from: j */
        public String mo58475b(@C12579k Bundle bundle, @C12579k String str) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(str, "key");
            return (String) bundle.get(str);
        }

        @C12579k
        /* renamed from: k */
        public String mo58479h(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "value");
            return str;
        }

        /* renamed from: l */
        public void mo58480i(@C12579k Bundle bundle, @C12579k String str, @C12580l String str2) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(str, "key");
            bundle.putString(str, str2);
        }
    }

    /* renamed from: androidx.navigation.n0$l */
    public static final class C19781l {
        public /* synthetic */ C19781l(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        @C11384m
        /* renamed from: a */
        public C19769n0<?> mo58515a(@C12580l String str, @C12580l String str2) {
            boolean z;
            String str3;
            C19769n0<Integer> n0Var = C19769n0.f50611d;
            if (Intrinsics.areEqual((Object) n0Var.mo58476c(), (Object) str)) {
                return n0Var;
            }
            C19769n0<int[]> n0Var2 = C19769n0.f50613f;
            if (Intrinsics.areEqual((Object) n0Var2.mo58476c(), (Object) str)) {
                return n0Var2;
            }
            C19769n0<Long> n0Var3 = C19769n0.f50614g;
            if (Intrinsics.areEqual((Object) n0Var3.mo58476c(), (Object) str)) {
                return n0Var3;
            }
            C19769n0<long[]> n0Var4 = C19769n0.f50615h;
            if (Intrinsics.areEqual((Object) n0Var4.mo58476c(), (Object) str)) {
                return n0Var4;
            }
            C19769n0<Boolean> n0Var5 = C19769n0.f50618k;
            if (Intrinsics.areEqual((Object) n0Var5.mo58476c(), (Object) str)) {
                return n0Var5;
            }
            C19769n0<boolean[]> n0Var6 = C19769n0.f50619l;
            if (Intrinsics.areEqual((Object) n0Var6.mo58476c(), (Object) str)) {
                return n0Var6;
            }
            C19769n0<String> n0Var7 = C19769n0.f50620m;
            if (Intrinsics.areEqual((Object) n0Var7.mo58476c(), (Object) str)) {
                return n0Var7;
            }
            C19769n0<String[]> n0Var8 = C19769n0.f50621n;
            if (Intrinsics.areEqual((Object) n0Var8.mo58476c(), (Object) str)) {
                return n0Var8;
            }
            C19769n0<Float> n0Var9 = C19769n0.f50616i;
            if (Intrinsics.areEqual((Object) n0Var9.mo58476c(), (Object) str)) {
                return n0Var9;
            }
            C19769n0<float[]> n0Var10 = C19769n0.f50617j;
            if (Intrinsics.areEqual((Object) n0Var10.mo58476c(), (Object) str)) {
                return n0Var10;
            }
            C19769n0<Integer> n0Var11 = C19769n0.f50612e;
            if (Intrinsics.areEqual((Object) n0Var11.mo58476c(), (Object) str)) {
                return n0Var11;
            }
            if (str == null || str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return n0Var7;
            }
            try {
                if (!C11622t.startsWith$default(str, ".", false, 2, (Object) null) || str2 == null) {
                    str3 = str;
                } else {
                    str3 = str2 + str;
                }
                Class<Serializable> cls = Serializable.class;
                Class<Parcelable> cls2 = Parcelable.class;
                if (C11622t.endsWith$default(str, HttpUrl.PATH_SEGMENT_ENCODE_SET_URI, false, 2, (Object) null)) {
                    str3 = str3.substring(0, str3.length() - 2);
                    Intrinsics.checkNotNullExpressionValue(str3, "this as java.lang.String…ing(startIndex, endIndex)");
                    Class<?> cls3 = Class.forName(str3);
                    if (cls2.isAssignableFrom(cls3)) {
                        return new C19783n(cls3);
                    }
                    if (cls.isAssignableFrom(cls3)) {
                        return new C19785p(cls3);
                    }
                } else {
                    Class<?> cls4 = Class.forName(str3);
                    if (cls2.isAssignableFrom(cls4)) {
                        return new C19784o(cls4);
                    }
                    if (Enum.class.isAssignableFrom(cls4)) {
                        return new C19782m(cls4);
                    }
                    if (cls.isAssignableFrom(cls4)) {
                        return new C19786q(cls4);
                    }
                }
                throw new IllegalArgumentException(str3 + " is not Serializable or Parcelable.");
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(3:4|5|6) */
        /* JADX WARNING: Can't wrap try/catch for region: R(3:7|8|9) */
        /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
            r0 = androidx.navigation.C19769n0.f50618k;
            r0.mo58479h(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x001c, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x001f, code lost:
            return androidx.navigation.C19769n0.f50620m;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:5:?, code lost:
            r0 = androidx.navigation.C19769n0.f50614g;
            r0.mo58479h(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
            r0 = androidx.navigation.C19769n0.f50616i;
            r0.mo58479h(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0016, code lost:
            return r0;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x000b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0011 */
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        @org.jetbrains.annotations.C12579k
        @kotlin.jvm.C11384m
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final androidx.navigation.C19769n0<java.lang.Object> mo58516b(@org.jetbrains.annotations.C12579k java.lang.String r2) {
            /*
                r1 = this;
                java.lang.String r0 = "value"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                androidx.navigation.n0<java.lang.Integer> r0 = androidx.navigation.C19769n0.f50611d     // Catch:{ IllegalArgumentException -> 0x000b }
                r0.mo58479h(r2)     // Catch:{ IllegalArgumentException -> 0x000b }
                return r0
            L_0x000b:
                androidx.navigation.n0<java.lang.Long> r0 = androidx.navigation.C19769n0.f50614g     // Catch:{ IllegalArgumentException -> 0x0011 }
                r0.mo58479h(r2)     // Catch:{ IllegalArgumentException -> 0x0011 }
                return r0
            L_0x0011:
                androidx.navigation.n0<java.lang.Float> r0 = androidx.navigation.C19769n0.f50616i     // Catch:{ IllegalArgumentException -> 0x0017 }
                r0.mo58479h(r2)     // Catch:{ IllegalArgumentException -> 0x0017 }
                return r0
            L_0x0017:
                androidx.navigation.n0<java.lang.Boolean> r0 = androidx.navigation.C19769n0.f50618k     // Catch:{ IllegalArgumentException -> 0x001d }
                r0.mo58479h(r2)     // Catch:{ IllegalArgumentException -> 0x001d }
                return r0
            L_0x001d:
                androidx.navigation.n0<java.lang.String> r2 = androidx.navigation.C19769n0.f50620m
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.C19769n0.C19781l.mo58516b(java.lang.String):androidx.navigation.n0");
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @C12579k
        @C11384m
        /* renamed from: c */
        public final C19769n0<Object> mo58517c(@C12580l Object obj) {
            C19769n0<Object> n0Var;
            if (obj instanceof Integer) {
                return C19769n0.f50611d;
            }
            if (obj instanceof int[]) {
                return C19769n0.f50613f;
            }
            if (obj instanceof Long) {
                return C19769n0.f50614g;
            }
            if (obj instanceof long[]) {
                return C19769n0.f50615h;
            }
            if (obj instanceof Float) {
                return C19769n0.f50616i;
            }
            if (obj instanceof float[]) {
                return C19769n0.f50617j;
            }
            if (obj instanceof Boolean) {
                return C19769n0.f50618k;
            }
            if (obj instanceof boolean[]) {
                return C19769n0.f50619l;
            }
            if ((obj instanceof String) || obj == null) {
                return C19769n0.f50620m;
            }
            if ((obj instanceof Object[]) && (((Object[]) obj) instanceof String[])) {
                return C19769n0.f50621n;
            }
            if (obj.getClass().isArray()) {
                Class<?> componentType = obj.getClass().getComponentType();
                Intrinsics.checkNotNull(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    Class<?> componentType2 = obj.getClass().getComponentType();
                    if (componentType2 != null) {
                        n0Var = new C19783n<>(componentType2);
                        return n0Var;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.Class<android.os.Parcelable>");
                }
            }
            if (obj.getClass().isArray()) {
                Class<?> componentType3 = obj.getClass().getComponentType();
                Intrinsics.checkNotNull(componentType3);
                if (Serializable.class.isAssignableFrom(componentType3)) {
                    Class<?> componentType4 = obj.getClass().getComponentType();
                    if (componentType4 != null) {
                        n0Var = new C19785p<>(componentType4);
                        return n0Var;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.Class<java.io.Serializable>");
                }
            }
            if (obj instanceof Parcelable) {
                n0Var = new C19784o<>(obj.getClass());
            } else if (obj instanceof Enum) {
                n0Var = new C19782m<>(obj.getClass());
            } else if (obj instanceof Serializable) {
                n0Var = new C19786q<>(obj.getClass());
            } else {
                throw new IllegalArgumentException("Object of type " + obj.getClass().getName() + " is not supported for navigation arguments.");
            }
            return n0Var;
        }

        public C19781l() {
        }
    }

    /* renamed from: androidx.navigation.n0$m */
    public static final class C19782m<D extends Enum<?>> extends C19786q<D> {
        @C12579k

        /* renamed from: p */
        public final Class<D> f50624p;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C19782m(@C12579k Class<D> cls) {
            super(false, cls);
            Intrinsics.checkNotNullParameter(cls, "type");
            if (cls.isEnum()) {
                this.f50624p = cls;
                return;
            }
            throw new IllegalArgumentException((cls + " is not an Enum type.").toString());
        }

        @C12579k
        /* renamed from: c */
        public String mo58476c() {
            String name = this.f50624p.getName();
            Intrinsics.checkNotNullExpressionValue(name, "type.name");
            return name;
        }

        @C12579k
        /* renamed from: m */
        public D mo58518k(@C12579k String str) {
            D d;
            Intrinsics.checkNotNullParameter(str, "value");
            D[] enumConstants = this.f50624p.getEnumConstants();
            Intrinsics.checkNotNullExpressionValue(enumConstants, "type.enumConstants");
            int length = enumConstants.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    d = null;
                    break;
                }
                d = enumConstants[i];
                if (C11622t.equals(((Enum) d).name(), str, true)) {
                    break;
                }
                i++;
            }
            D d2 = (Enum) d;
            if (d2 != null) {
                return d2;
            }
            throw new IllegalArgumentException("Enum value " + str + " not found for type " + this.f50624p.getName() + '.');
        }
    }

    /* renamed from: androidx.navigation.n0$n */
    public static final class C19783n<D extends Parcelable> extends C19769n0<D[]> {
        @C12579k

        /* renamed from: o */
        public final Class<D[]> f50625o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C19783n(@C12579k Class<D> cls) {
            super(true);
            Intrinsics.checkNotNullParameter(cls, "type");
            if (Parcelable.class.isAssignableFrom(cls)) {
                try {
                    this.f50625o = Class.forName("[L" + cls.getName() + ';');
                } catch (ClassNotFoundException e) {
                    throw new RuntimeException(e);
                }
            } else {
                throw new IllegalArgumentException((cls + " does not implement Parcelable.").toString());
            }
        }

        @C12579k
        /* renamed from: c */
        public String mo58476c() {
            String name = this.f50625o.getName();
            Intrinsics.checkNotNullExpressionValue(name, "arrayType.name");
            return name;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !Intrinsics.areEqual((Object) C19783n.class, (Object) obj.getClass())) {
                return false;
            }
            return Intrinsics.areEqual((Object) this.f50625o, (Object) ((C19783n) obj).f50625o);
        }

        public int hashCode() {
            return this.f50625o.hashCode();
        }

        @C12580l
        /* renamed from: j */
        public D[] mo58475b(@C12579k Bundle bundle, @C12579k String str) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(str, "key");
            return (Parcelable[]) bundle.get(str);
        }

        @C12579k
        /* renamed from: k */
        public D[] mo58479h(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        /* renamed from: l */
        public void mo58480i(@C12579k Bundle bundle, @C12579k String str, @C12580l D[] dArr) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(str, "key");
            this.f50625o.cast(dArr);
            bundle.putParcelableArray(str, dArr);
        }
    }

    /* renamed from: androidx.navigation.n0$o */
    public static final class C19784o<D> extends C19769n0<D> {
        @C12579k

        /* renamed from: o */
        public final Class<D> f50626o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C19784o(@C12579k Class<D> cls) {
            super(true);
            Intrinsics.checkNotNullParameter(cls, "type");
            boolean z = true;
            if (!Parcelable.class.isAssignableFrom(cls) && !Serializable.class.isAssignableFrom(cls)) {
                z = false;
            }
            if (z) {
                this.f50626o = cls;
                return;
            }
            throw new IllegalArgumentException((cls + " does not implement Parcelable or Serializable.").toString());
        }

        @C12580l
        /* renamed from: b */
        public D mo58475b(@C12579k Bundle bundle, @C12579k String str) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(str, "key");
            return bundle.get(str);
        }

        @C12579k
        /* renamed from: c */
        public String mo58476c() {
            String name = this.f50626o.getName();
            Intrinsics.checkNotNullExpressionValue(name, "type.name");
            return name;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !Intrinsics.areEqual((Object) C19784o.class, (Object) obj.getClass())) {
                return false;
            }
            return Intrinsics.areEqual((Object) this.f50626o, (Object) ((C19784o) obj).f50626o);
        }

        /* renamed from: h */
        public D mo58479h(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "value");
            throw new UnsupportedOperationException("Parcelables don't support default values.");
        }

        public int hashCode() {
            return this.f50626o.hashCode();
        }

        /* renamed from: i */
        public void mo58480i(@C12579k Bundle bundle, @C12579k String str, D d) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(str, "key");
            this.f50626o.cast(d);
            if (d == null || (d instanceof Parcelable)) {
                bundle.putParcelable(str, (Parcelable) d);
            } else if (d instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) d);
            }
        }
    }

    /* renamed from: androidx.navigation.n0$p */
    public static final class C19785p<D extends Serializable> extends C19769n0<D[]> {
        @C12579k

        /* renamed from: o */
        public final Class<D[]> f50627o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C19785p(@C12579k Class<D> cls) {
            super(true);
            Intrinsics.checkNotNullParameter(cls, "type");
            if (Serializable.class.isAssignableFrom(cls)) {
                try {
                    this.f50627o = Class.forName("[L" + cls.getName() + ';');
                } catch (ClassNotFoundException e) {
                    throw new RuntimeException(e);
                }
            } else {
                throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
            }
        }

        @C12579k
        /* renamed from: c */
        public String mo58476c() {
            String name = this.f50627o.getName();
            Intrinsics.checkNotNullExpressionValue(name, "arrayType.name");
            return name;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !Intrinsics.areEqual((Object) C19785p.class, (Object) obj.getClass())) {
                return false;
            }
            return Intrinsics.areEqual((Object) this.f50627o, (Object) ((C19785p) obj).f50627o);
        }

        public int hashCode() {
            return this.f50627o.hashCode();
        }

        @C12580l
        /* renamed from: j */
        public D[] mo58475b(@C12579k Bundle bundle, @C12579k String str) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(str, "key");
            return (Serializable[]) bundle.get(str);
        }

        @C12579k
        /* renamed from: k */
        public D[] mo58479h(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        /* JADX WARNING: type inference failed for: r4v0, types: [D[], java.lang.Object, java.io.Serializable] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: l */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo58480i(@org.jetbrains.annotations.C12579k android.os.Bundle r2, @org.jetbrains.annotations.C12579k java.lang.String r3, @org.jetbrains.annotations.C12580l D[] r4) {
            /*
                r1 = this;
                java.lang.String r0 = "bundle"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                java.lang.String r0 = "key"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                java.lang.Class<D[]> r0 = r1.f50627o
                r0.cast(r4)
                r2.putSerializable(r3, r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.C19769n0.C19785p.mo58480i(android.os.Bundle, java.lang.String, java.io.Serializable[]):void");
        }
    }

    public C19769n0(boolean z) {
        this.f50622a = z;
    }

    @C12579k
    @C11384m
    /* renamed from: a */
    public static C19769n0<?> m91910a(@C12580l String str, @C12580l String str2) {
        return f50610c.mo58515a(str, str2);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @C12579k
    @C11384m
    /* renamed from: d */
    public static final C19769n0<Object> m91911d(@C12579k String str) {
        return f50610c.mo58516b(str);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @C12579k
    @C11384m
    /* renamed from: e */
    public static final C19769n0<Object> m91912e(@C12580l Object obj) {
        return f50610c.mo58517c(obj);
    }

    @C12580l
    /* renamed from: b */
    public abstract T mo58475b(@C12579k Bundle bundle, @C12579k String str);

    @C12579k
    /* renamed from: c */
    public String mo58476c() {
        return this.f50623b;
    }

    /* renamed from: f */
    public boolean mo58477f() {
        return this.f50622a;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: g */
    public final T mo58478g(@C12579k Bundle bundle, @C12579k String str, @C12579k String str2) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(str, "key");
        Intrinsics.checkNotNullParameter(str2, "value");
        T h = mo58479h(str2);
        mo58480i(bundle, str, h);
        return h;
    }

    /* renamed from: h */
    public abstract T mo58479h(@C12579k String str);

    /* renamed from: i */
    public abstract void mo58480i(@C12579k Bundle bundle, @C12579k String str, T t);

    @C12579k
    public String toString() {
        return mo58476c();
    }

    /* renamed from: androidx.navigation.n0$q */
    public static class C19786q<D extends Serializable> extends C19769n0<D> {
        @C12579k

        /* renamed from: o */
        public final Class<D> f50628o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C19786q(@C12579k Class<D> cls) {
            super(true);
            Intrinsics.checkNotNullParameter(cls, "type");
            if (!Serializable.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
            } else if (true ^ cls.isEnum()) {
                this.f50628o = cls;
            } else {
                throw new IllegalArgumentException((cls + " is an Enum. You should use EnumType instead.").toString());
            }
        }

        @C12579k
        /* renamed from: c */
        public String mo58476c() {
            String name = this.f50628o.getName();
            Intrinsics.checkNotNullExpressionValue(name, "type.name");
            return name;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C19786q)) {
                return false;
            }
            return Intrinsics.areEqual((Object) this.f50628o, (Object) ((C19786q) obj).f50628o);
        }

        public int hashCode() {
            return this.f50628o.hashCode();
        }

        @C12580l
        /* renamed from: j */
        public D mo58475b(@C12579k Bundle bundle, @C12579k String str) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(str, "key");
            return (Serializable) bundle.get(str);
        }

        @C12579k
        /* renamed from: k */
        public D mo58479h(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "value");
            throw new UnsupportedOperationException("Serializables don't support default values.");
        }

        /* renamed from: l */
        public void mo58480i(@C12579k Bundle bundle, @C12579k String str, @C12579k D d) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(str, "key");
            Intrinsics.checkNotNullParameter(d, "value");
            this.f50628o.cast(d);
            bundle.putSerializable(str, d);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C19786q(boolean z, @C12579k Class<D> cls) {
            super(z);
            Intrinsics.checkNotNullParameter(cls, "type");
            if (Serializable.class.isAssignableFrom(cls)) {
                this.f50628o = cls;
                return;
            }
            throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
        }
    }
}
