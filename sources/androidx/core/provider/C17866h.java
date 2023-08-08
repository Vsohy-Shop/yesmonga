package androidx.core.provider;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;
import android.provider.BaseColumns;
import androidx.annotation.C0337f0;
import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;
import androidx.annotation.RestrictTo;
import androidx.core.content.res.C17465i;
import androidx.core.graphics.C17530b1;
import androidx.core.graphics.C17599i2;
import androidx.core.util.C18001r;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: androidx.core.provider.h */
public class C17866h {
    @Deprecated
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})

    /* renamed from: a */
    public static final String f46249a = "font_results";
    @Deprecated
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})

    /* renamed from: b */
    public static final int f46250b = -1;
    @Deprecated
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})

    /* renamed from: c */
    public static final int f46251c = -2;

    /* renamed from: androidx.core.provider.h$a */
    public static final class C17867a implements BaseColumns {

        /* renamed from: a */
        public static final String f46252a = "file_id";

        /* renamed from: b */
        public static final String f46253b = "font_ttc_index";

        /* renamed from: c */
        public static final String f46254c = "font_variation_settings";

        /* renamed from: d */
        public static final String f46255d = "font_weight";

        /* renamed from: e */
        public static final String f46256e = "font_italic";

        /* renamed from: f */
        public static final String f46257f = "result_code";

        /* renamed from: g */
        public static final int f46258g = 0;

        /* renamed from: h */
        public static final int f46259h = 1;

        /* renamed from: i */
        public static final int f46260i = 2;

        /* renamed from: j */
        public static final int f46261j = 3;
    }

    /* renamed from: androidx.core.provider.h$b */
    public static class C17868b {

        /* renamed from: c */
        public static final int f46262c = 0;

        /* renamed from: d */
        public static final int f46263d = 1;

        /* renamed from: e */
        public static final int f46264e = 2;

        /* renamed from: a */
        public final int f46265a;

        /* renamed from: b */
        public final C17869c[] f46266b;

        @Deprecated
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public C17868b(int i, @C0363p0 C17869c[] cVarArr) {
            this.f46265a = i;
            this.f46266b = cVarArr;
        }

        /* renamed from: a */
        public static C17868b m81380a(int i, @C0363p0 C17869c[] cVarArr) {
            return new C17868b(i, cVarArr);
        }

        /* renamed from: b */
        public C17869c[] mo52281b() {
            return this.f46266b;
        }

        /* renamed from: c */
        public int mo52282c() {
            return this.f46265a;
        }
    }

    /* renamed from: androidx.core.provider.h$c */
    public static class C17869c {

        /* renamed from: a */
        public final Uri f46267a;

        /* renamed from: b */
        public final int f46268b;

        /* renamed from: c */
        public final int f46269c;

        /* renamed from: d */
        public final boolean f46270d;

        /* renamed from: e */
        public final int f46271e;

        @Deprecated
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public C17869c(@C0359n0 Uri uri, @C0337f0(from = 0) int i, @C0337f0(from = 1, mo995to = 1000) int i2, boolean z, int i3) {
            this.f46267a = (Uri) C18001r.m81775l(uri);
            this.f46268b = i;
            this.f46269c = i2;
            this.f46270d = z;
            this.f46271e = i3;
        }

        /* renamed from: a */
        public static C17869c m81383a(@C0359n0 Uri uri, @C0337f0(from = 0) int i, @C0337f0(from = 1, mo995to = 1000) int i2, boolean z, int i3) {
            return new C17869c(uri, i, i2, z, i3);
        }

        /* renamed from: b */
        public int mo52283b() {
            return this.f46271e;
        }

        @C0337f0(from = 0)
        /* renamed from: c */
        public int mo52284c() {
            return this.f46268b;
        }

        @C0359n0
        /* renamed from: d */
        public Uri mo52285d() {
            return this.f46267a;
        }

        @C0337f0(from = 1, mo995to = 1000)
        /* renamed from: e */
        public int mo52286e() {
            return this.f46269c;
        }

        /* renamed from: f */
        public boolean mo52287f() {
            return this.f46270d;
        }
    }

    /* renamed from: androidx.core.provider.h$d */
    public static class C17870d {
        @Deprecated
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})

        /* renamed from: a */
        public static final int f46272a = 0;

        /* renamed from: b */
        public static final int f46273b = 0;

        /* renamed from: c */
        public static final int f46274c = -1;

        /* renamed from: d */
        public static final int f46275d = -2;

        /* renamed from: e */
        public static final int f46276e = -3;

        /* renamed from: f */
        public static final int f46277f = -4;

        /* renamed from: g */
        public static final int f46278g = 1;

        /* renamed from: h */
        public static final int f46279h = 2;

        /* renamed from: i */
        public static final int f46280i = 3;

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        @Retention(RetentionPolicy.SOURCE)
        /* renamed from: androidx.core.provider.h$d$a */
        public @interface C17871a {
        }

        /* renamed from: a */
        public void mo51924a(int i) {
        }

        /* renamed from: b */
        public void mo51925b(Typeface typeface) {
        }
    }

    @C0363p0
    /* renamed from: a */
    public static Typeface m81371a(@C0359n0 Context context, @C0363p0 CancellationSignal cancellationSignal, @C0359n0 C17869c[] cVarArr) {
        return C17530b1.m80352d(context, cancellationSignal, cVarArr, 0);
    }

    @C0359n0
    /* renamed from: b */
    public static C17868b m81372b(@C0359n0 Context context, @C0363p0 CancellationSignal cancellationSignal, @C0359n0 C17859f fVar) throws PackageManager.NameNotFoundException {
        return C17857e.m81347e(context, fVar, cancellationSignal);
    }

    @Deprecated
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: c */
    public static Typeface m81373c(Context context, C17859f fVar, @C0363p0 C17465i.C17472g gVar, @C0363p0 Handler handler, boolean z, int i, int i2) {
        return m81376f(context, fVar, i2, z, i, C17465i.C17472g.m80194e(handler), new C17530b1.C17531a(gVar));
    }

    @C0363p0
    @C0344h1
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Deprecated
    /* renamed from: d */
    public static ProviderInfo m81374d(@C0359n0 PackageManager packageManager, @C0359n0 C17859f fVar, @C0363p0 Resources resources) throws PackageManager.NameNotFoundException {
        return C17857e.m81348f(packageManager, fVar, resources);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @C0376v0(19)
    @Deprecated
    /* renamed from: e */
    public static Map<Uri, ByteBuffer> m81375e(Context context, C17869c[] cVarArr, CancellationSignal cancellationSignal) {
        return C17599i2.m80650h(context, cVarArr, cancellationSignal);
    }

    @C0363p0
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: f */
    public static Typeface m81376f(@C0359n0 Context context, @C0359n0 C17859f fVar, int i, boolean z, @C0337f0(from = 0) int i2, @C0359n0 Handler handler, @C0359n0 C17870d dVar) {
        C17847a aVar = new C17847a(dVar, handler);
        if (z) {
            return C17860g.m81364e(context, fVar, aVar, i, i2);
        }
        return C17860g.m81363d(context, fVar, i, (Executor) null, aVar);
    }

    /* renamed from: g */
    public static void m81377g(@C0359n0 Context context, @C0359n0 C17859f fVar, @C0359n0 C17870d dVar, @C0359n0 Handler handler) {
        C17847a aVar = new C17847a(dVar);
        C17860g.m81363d(context.getApplicationContext(), fVar, 0, C17872i.m81392b(handler), aVar);
    }

    @Deprecated
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: h */
    public static void m81378h() {
        C17860g.m81365f();
    }

    @C0344h1
    @RestrictTo({RestrictTo.Scope.TESTS})
    /* renamed from: i */
    public static void m81379i() {
        C17860g.m81365f();
    }
}
