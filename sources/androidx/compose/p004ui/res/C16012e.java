package androidx.compose.p004ui.res;

import android.content.res.Configuration;
import android.content.res.Resources;
import androidx.compose.p004ui.graphics.vector.C15340c;
import androidx.compose.runtime.internal.C8567o;
import com.usabilla.sdk.ubform.telemetry.C10108c;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.ui.res.e */
public final class C16012e {
    @C12579k

    /* renamed from: a */
    public final HashMap<C16014b, WeakReference<C16013a>> f39701a = new HashMap<>();

    @C8567o(parameters = 0)
    /* renamed from: androidx.compose.ui.res.e$a */
    public static final class C16013a {

        /* renamed from: c */
        public static final int f39702c = 0;
        @C12579k

        /* renamed from: a */
        public final C15340c f39703a;

        /* renamed from: b */
        public final int f39704b;

        public C16013a(@C12579k C15340c cVar, int i) {
            Intrinsics.checkNotNullParameter(cVar, "imageVector");
            this.f39703a = cVar;
            this.f39704b = i;
        }

        /* renamed from: d */
        public static /* synthetic */ C16013a m71834d(C16013a aVar, C15340c cVar, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                cVar = aVar.f39703a;
            }
            if ((i2 & 2) != 0) {
                i = aVar.f39704b;
            }
            return aVar.mo45993c(cVar, i);
        }

        @C12579k
        /* renamed from: a */
        public final C15340c mo45991a() {
            return this.f39703a;
        }

        /* renamed from: b */
        public final int mo45992b() {
            return this.f39704b;
        }

        @C12579k
        /* renamed from: c */
        public final C16013a mo45993c(@C12579k C15340c cVar, int i) {
            Intrinsics.checkNotNullParameter(cVar, "imageVector");
            return new C16013a(cVar, i);
        }

        /* renamed from: e */
        public final int mo45994e() {
            return this.f39704b;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C16013a)) {
                return false;
            }
            C16013a aVar = (C16013a) obj;
            return Intrinsics.areEqual((Object) this.f39703a, (Object) aVar.f39703a) && this.f39704b == aVar.f39704b;
        }

        @C12579k
        /* renamed from: f */
        public final C15340c mo45996f() {
            return this.f39703a;
        }

        public int hashCode() {
            return (this.f39703a.hashCode() * 31) + Integer.hashCode(this.f39704b);
        }

        @C12579k
        public String toString() {
            return "ImageVectorEntry(imageVector=" + this.f39703a + ", configFlags=" + this.f39704b + ')';
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: androidx.compose.ui.res.e$b */
    public static final class C16014b {

        /* renamed from: c */
        public static final int f39705c = 8;
        @C12579k

        /* renamed from: a */
        public final Resources.Theme f39706a;

        /* renamed from: b */
        public final int f39707b;

        public C16014b(@C12579k Resources.Theme theme, int i) {
            Intrinsics.checkNotNullParameter(theme, C10108c.f27794S);
            this.f39706a = theme;
            this.f39707b = i;
        }

        /* renamed from: d */
        public static /* synthetic */ C16014b m71840d(C16014b bVar, Resources.Theme theme, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                theme = bVar.f39706a;
            }
            if ((i2 & 2) != 0) {
                i = bVar.f39707b;
            }
            return bVar.mo46001c(theme, i);
        }

        @C12579k
        /* renamed from: a */
        public final Resources.Theme mo45999a() {
            return this.f39706a;
        }

        /* renamed from: b */
        public final int mo46000b() {
            return this.f39707b;
        }

        @C12579k
        /* renamed from: c */
        public final C16014b mo46001c(@C12579k Resources.Theme theme, int i) {
            Intrinsics.checkNotNullParameter(theme, C10108c.f27794S);
            return new C16014b(theme, i);
        }

        /* renamed from: e */
        public final int mo46002e() {
            return this.f39707b;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C16014b)) {
                return false;
            }
            C16014b bVar = (C16014b) obj;
            return Intrinsics.areEqual((Object) this.f39706a, (Object) bVar.f39706a) && this.f39707b == bVar.f39707b;
        }

        @C12579k
        /* renamed from: f */
        public final Resources.Theme mo46004f() {
            return this.f39706a;
        }

        public int hashCode() {
            return (this.f39706a.hashCode() * 31) + Integer.hashCode(this.f39707b);
        }

        @C12579k
        public String toString() {
            return "Key(theme=" + this.f39706a + ", id=" + this.f39707b + ')';
        }
    }

    /* renamed from: a */
    public final void mo45987a() {
        this.f39701a.clear();
    }

    @C12580l
    /* renamed from: b */
    public final C16013a mo45988b(@C12579k C16014b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "key");
        WeakReference weakReference = this.f39701a.get(bVar);
        if (weakReference != null) {
            return (C16013a) weakReference.get();
        }
        return null;
    }

    /* renamed from: c */
    public final void mo45989c(int i) {
        Iterator<Map.Entry<C16014b, WeakReference<C16013a>>> it = this.f39701a.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<C16014b, WeakReference<C16013a>> next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "it.next()");
            C16013a aVar = (C16013a) ((WeakReference) next.getValue()).get();
            if (aVar == null || Configuration.needNewResources(i, aVar.mo45994e())) {
                it.remove();
            }
        }
    }

    /* renamed from: d */
    public final void mo45990d(@C12579k C16014b bVar, @C12579k C16013a aVar) {
        Intrinsics.checkNotNullParameter(bVar, "key");
        Intrinsics.checkNotNullParameter(aVar, "imageVectorEntry");
        this.f39701a.put(bVar, new WeakReference(aVar));
    }
}
