package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.C2346d;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.layout.C15531a;
import androidx.compose.p004ui.layout.C15611w0;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8547h2;
import androidx.compose.runtime.C8585m0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8585m0
/* renamed from: androidx.compose.foundation.layout.m */
public abstract class C2380m {
    @C12579k

    /* renamed from: a */
    public static final C2383c f6293a = new C2383c((DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: b */
    public static final C2380m f6294b = C2382b.f6298e;
    @C12579k

    /* renamed from: c */
    public static final C2380m f6295c = C2386f.f6301e;
    @C12579k

    /* renamed from: d */
    public static final C2380m f6296d = C2384d.f6299e;

    /* renamed from: androidx.compose.foundation.layout.m$a */
    public static final class C2381a extends C2380m {
        @C12579k

        /* renamed from: e */
        public final C2346d f6297e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2381a(@C12579k C2346d dVar) {
            super((DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(dVar, "alignmentLineProvider");
            this.f6297e = dVar;
        }

        /* renamed from: d */
        public int mo8117d(int i, @C12579k LayoutDirection layoutDirection, @C12579k C15611w0 w0Var, int i2) {
            Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
            Intrinsics.checkNotNullParameter(w0Var, "placeable");
            int a = this.f6297e.mo8026a(w0Var);
            if (a == Integer.MIN_VALUE) {
                return 0;
            }
            int i3 = i2 - a;
            if (layoutDirection == LayoutDirection.Rtl) {
                return i - i3;
            }
            return i3;
        }

        @C12579k
        /* renamed from: e */
        public Integer mo8118e(@C12579k C15611w0 w0Var) {
            Intrinsics.checkNotNullParameter(w0Var, "placeable");
            return Integer.valueOf(this.f6297e.mo8026a(w0Var));
        }

        /* renamed from: f */
        public boolean mo8119f() {
            return true;
        }

        @C12579k
        /* renamed from: g */
        public final C2346d mo8120g() {
            return this.f6297e;
        }
    }

    /* renamed from: androidx.compose.foundation.layout.m$b */
    public static final class C2382b extends C2380m {
        @C12579k

        /* renamed from: e */
        public static final C2382b f6298e = new C2382b();

        public C2382b() {
            super((DefaultConstructorMarker) null);
        }

        /* renamed from: d */
        public int mo8117d(int i, @C12579k LayoutDirection layoutDirection, @C12579k C15611w0 w0Var, int i2) {
            Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
            Intrinsics.checkNotNullParameter(w0Var, "placeable");
            return i / 2;
        }
    }

    /* renamed from: androidx.compose.foundation.layout.m$c */
    public static final class C2383c {
        public /* synthetic */ C2383c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C8547h2
        /* renamed from: d */
        public static /* synthetic */ void m10497d() {
        }

        @C8547h2
        /* renamed from: f */
        public static /* synthetic */ void m10498f() {
        }

        @C8547h2
        /* renamed from: h */
        public static /* synthetic */ void m10499h() {
        }

        @C12579k
        /* renamed from: a */
        public final C2380m mo8121a(@C12579k C15531a aVar) {
            Intrinsics.checkNotNullParameter(aVar, "alignmentLine");
            return new C2381a(new C2346d.C2348b(aVar));
        }

        @C12579k
        /* renamed from: b */
        public final C2380m mo8122b(@C12579k C2346d dVar) {
            Intrinsics.checkNotNullParameter(dVar, "alignmentLineProvider");
            return new C2381a(dVar);
        }

        @C12579k
        /* renamed from: c */
        public final C2380m mo8123c() {
            return C2380m.f6294b;
        }

        @C12579k
        /* renamed from: e */
        public final C2380m mo8124e() {
            return C2380m.f6296d;
        }

        @C12579k
        /* renamed from: g */
        public final C2380m mo8125g() {
            return C2380m.f6295c;
        }

        @C12579k
        /* renamed from: i */
        public final C2380m mo8126i(@C12579k C8734c.C8736b bVar) {
            Intrinsics.checkNotNullParameter(bVar, "horizontal");
            return new C2385e(bVar);
        }

        @C12579k
        /* renamed from: j */
        public final C2380m mo8127j(@C12579k C8734c.C8737c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "vertical");
            return new C2387g(cVar);
        }

        public C2383c() {
        }
    }

    /* renamed from: androidx.compose.foundation.layout.m$d */
    public static final class C2384d extends C2380m {
        @C12579k

        /* renamed from: e */
        public static final C2384d f6299e = new C2384d();

        public C2384d() {
            super((DefaultConstructorMarker) null);
        }

        /* renamed from: d */
        public int mo8117d(int i, @C12579k LayoutDirection layoutDirection, @C12579k C15611w0 w0Var, int i2) {
            Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
            Intrinsics.checkNotNullParameter(w0Var, "placeable");
            if (layoutDirection == LayoutDirection.Ltr) {
                return i;
            }
            return 0;
        }
    }

    /* renamed from: androidx.compose.foundation.layout.m$e */
    public static final class C2385e extends C2380m {
        @C12579k

        /* renamed from: e */
        public final C8734c.C8736b f6300e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2385e(@C12579k C8734c.C8736b bVar) {
            super((DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(bVar, "horizontal");
            this.f6300e = bVar;
        }

        /* renamed from: d */
        public int mo8117d(int i, @C12579k LayoutDirection layoutDirection, @C12579k C15611w0 w0Var, int i2) {
            Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
            Intrinsics.checkNotNullParameter(w0Var, "placeable");
            return this.f6300e.mo17075a(0, i, layoutDirection);
        }

        @C12579k
        /* renamed from: g */
        public final C8734c.C8736b mo8128g() {
            return this.f6300e;
        }
    }

    /* renamed from: androidx.compose.foundation.layout.m$f */
    public static final class C2386f extends C2380m {
        @C12579k

        /* renamed from: e */
        public static final C2386f f6301e = new C2386f();

        public C2386f() {
            super((DefaultConstructorMarker) null);
        }

        /* renamed from: d */
        public int mo8117d(int i, @C12579k LayoutDirection layoutDirection, @C12579k C15611w0 w0Var, int i2) {
            Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
            Intrinsics.checkNotNullParameter(w0Var, "placeable");
            if (layoutDirection == LayoutDirection.Ltr) {
                return 0;
            }
            return i;
        }
    }

    /* renamed from: androidx.compose.foundation.layout.m$g */
    public static final class C2387g extends C2380m {
        @C12579k

        /* renamed from: e */
        public final C8734c.C8737c f6302e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2387g(@C12579k C8734c.C8737c cVar) {
            super((DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(cVar, "vertical");
            this.f6302e = cVar;
        }

        /* renamed from: d */
        public int mo8117d(int i, @C12579k LayoutDirection layoutDirection, @C12579k C15611w0 w0Var, int i2) {
            Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
            Intrinsics.checkNotNullParameter(w0Var, "placeable");
            return this.f6302e.mo17076a(0, i);
        }

        @C12579k
        /* renamed from: g */
        public final C8734c.C8737c mo8129g() {
            return this.f6302e;
        }
    }

    public /* synthetic */ C2380m(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: d */
    public abstract int mo8117d(int i, @C12579k LayoutDirection layoutDirection, @C12579k C15611w0 w0Var, int i2);

    @C12580l
    /* renamed from: e */
    public Integer mo8118e(@C12579k C15611w0 w0Var) {
        Intrinsics.checkNotNullParameter(w0Var, "placeable");
        return null;
    }

    /* renamed from: f */
    public boolean mo8119f() {
        return false;
    }

    public C2380m() {
    }
}
