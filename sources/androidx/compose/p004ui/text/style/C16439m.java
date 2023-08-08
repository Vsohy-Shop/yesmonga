package androidx.compose.p004ui.text.style;

import androidx.compose.runtime.C8547h2;
import androidx.compose.runtime.C8585m0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8585m0
/* renamed from: androidx.compose.ui.text.style.m */
public final class C16439m {
    @C12579k

    /* renamed from: c */
    public static final C16440a f40739c = new C16440a((DefaultConstructorMarker) null);

    /* renamed from: d */
    public static final int f40740d = 0;
    @C12579k

    /* renamed from: e */
    public static final C16439m f40741e = new C16439m(1.0f, 0.0f);

    /* renamed from: a */
    public final float f40742a;

    /* renamed from: b */
    public final float f40743b;

    /* renamed from: androidx.compose.ui.text.style.m$a */
    public static final class C16440a {
        public /* synthetic */ C16440a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C8547h2
        /* renamed from: b */
        public static /* synthetic */ void m74225b() {
        }

        @C12579k
        /* renamed from: a */
        public final C16439m mo47699a() {
            return C16439m.f40741e;
        }

        public C16440a() {
        }
    }

    public C16439m() {
        this(0.0f, 0.0f, 3, (DefaultConstructorMarker) null);
    }

    /* renamed from: c */
    public static /* synthetic */ C16439m m74221c(C16439m mVar, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = mVar.f40742a;
        }
        if ((i & 2) != 0) {
            f2 = mVar.f40743b;
        }
        return mVar.mo47693b(f, f2);
    }

    @C12579k
    /* renamed from: b */
    public final C16439m mo47693b(float f, float f2) {
        return new C16439m(f, f2);
    }

    /* renamed from: d */
    public final float mo47694d() {
        return this.f40742a;
    }

    /* renamed from: e */
    public final float mo47695e() {
        return this.f40743b;
    }

    public boolean equals(@C12580l Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16439m)) {
            return false;
        }
        C16439m mVar = (C16439m) obj;
        if (this.f40742a == mVar.f40742a) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        if (this.f40743b == mVar.f40743b) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (Float.hashCode(this.f40742a) * 31) + Float.hashCode(this.f40743b);
    }

    @C12579k
    public String toString() {
        return "TextGeometricTransform(scaleX=" + this.f40742a + ", skewX=" + this.f40743b + ')';
    }

    public C16439m(float f, float f2) {
        this.f40742a = f;
        this.f40743b = f2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16439m(float f, float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 1.0f : f, (i & 2) != 0 ? 0.0f : f2);
    }
}
