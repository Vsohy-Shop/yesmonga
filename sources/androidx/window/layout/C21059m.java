package androidx.window.layout;

import android.graphics.Rect;
import androidx.window.core.C20992b;
import androidx.window.layout.C21052l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.window.layout.m */
public final class C21059m implements C21052l {
    @C12579k

    /* renamed from: d */
    public static final C21060a f54297d = new C21060a((DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: a */
    public final C20992b f54298a;
    @C12579k

    /* renamed from: b */
    public final C21061b f54299b;
    @C12579k

    /* renamed from: c */
    public final C21052l.C21057c f54300c;

    /* renamed from: androidx.window.layout.m$a */
    public static final class C21060a {
        public /* synthetic */ C21060a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo62993a(@C12579k C20992b bVar) {
            boolean z;
            Intrinsics.checkNotNullParameter(bVar, "bounds");
            boolean z2 = false;
            if (bVar.mo62770f() == 0 && bVar.mo62765b() == 0) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                if (bVar.mo62766c() == 0 || bVar.mo62768e() == 0) {
                    z2 = true;
                }
                if (!z2) {
                    throw new IllegalArgumentException("Bounding rectangle must start at the top or left window edge for folding features".toString());
                }
                return;
            }
            throw new IllegalArgumentException("Bounds must be non zero".toString());
        }

        public C21060a() {
        }
    }

    /* renamed from: androidx.window.layout.m$b */
    public static final class C21061b {
        @C12579k

        /* renamed from: b */
        public static final C21062a f54301b = new C21062a((DefaultConstructorMarker) null);
        @C12579k

        /* renamed from: c */
        public static final C21061b f54302c = new C21061b("FOLD");
        @C12579k

        /* renamed from: d */
        public static final C21061b f54303d = new C21061b("HINGE");
        @C12579k

        /* renamed from: a */
        public final String f54304a;

        /* renamed from: androidx.window.layout.m$b$a */
        public static final class C21062a {
            public /* synthetic */ C21062a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @C12579k
            /* renamed from: a */
            public final C21061b mo62995a() {
                return C21061b.f54302c;
            }

            @C12579k
            /* renamed from: b */
            public final C21061b mo62996b() {
                return C21061b.f54303d;
            }

            public C21062a() {
            }
        }

        public C21061b(String str) {
            this.f54304a = str;
        }

        @C12579k
        public String toString() {
            return this.f54304a;
        }
    }

    public C21059m(@C12579k C20992b bVar, @C12579k C21061b bVar2, @C12579k C21052l.C21057c cVar) {
        Intrinsics.checkNotNullParameter(bVar, "featureBounds");
        Intrinsics.checkNotNullParameter(bVar2, "type");
        Intrinsics.checkNotNullParameter(cVar, "state");
        this.f54298a = bVar;
        this.f54299b = bVar2;
        this.f54300c = cVar;
        f54297d.mo62993a(bVar);
    }

    @C12579k
    /* renamed from: a */
    public C21052l.C21055b mo62982a() {
        if (this.f54298a.mo62770f() > this.f54298a.mo62765b()) {
            return C21052l.C21055b.f54291d;
        }
        return C21052l.C21055b.f54290c;
    }

    /* renamed from: b */
    public boolean mo62983b() {
        C21061b bVar = this.f54299b;
        C21061b.C21062a aVar = C21061b.f54301b;
        if (Intrinsics.areEqual((Object) bVar, (Object) aVar.mo62996b())) {
            return true;
        }
        if (!Intrinsics.areEqual((Object) this.f54299b, (Object) aVar.mo62995a()) || !Intrinsics.areEqual((Object) getState(), (Object) C21052l.C21057c.f54295d)) {
            return false;
        }
        return true;
    }

    @C12579k
    /* renamed from: c */
    public C21052l.C21053a mo62984c() {
        if (this.f54298a.mo62770f() == 0 || this.f54298a.mo62765b() == 0) {
            return C21052l.C21053a.f54286c;
        }
        return C21052l.C21053a.f54287d;
    }

    @C12579k
    /* renamed from: d */
    public final C21061b mo62989d() {
        return this.f54299b;
    }

    public boolean equals(@C12580l Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        Class<C21059m> cls2 = C21059m.class;
        if (obj == null) {
            cls = null;
        } else {
            cls = obj.getClass();
        }
        if (!Intrinsics.areEqual((Object) cls2, (Object) cls)) {
            return false;
        }
        if (obj != null) {
            C21059m mVar = (C21059m) obj;
            if (Intrinsics.areEqual((Object) this.f54298a, (Object) mVar.f54298a) && Intrinsics.areEqual((Object) this.f54299b, (Object) mVar.f54299b) && Intrinsics.areEqual((Object) getState(), (Object) mVar.getState())) {
                return true;
            }
            return false;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.window.layout.HardwareFoldingFeature");
    }

    @C12579k
    public Rect getBounds() {
        return this.f54298a.mo62774i();
    }

    @C12579k
    public C21052l.C21057c getState() {
        return this.f54300c;
    }

    public int hashCode() {
        return (((this.f54298a.hashCode() * 31) + this.f54299b.hashCode()) * 31) + getState().hashCode();
    }

    @C12579k
    public String toString() {
        return C21059m.class.getSimpleName() + " { " + this.f54298a + ", type=" + this.f54299b + ", state=" + getState() + " }";
    }
}
