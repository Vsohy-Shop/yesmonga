package androidx.window.core;

import android.graphics.Rect;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.window.core.b */
public final class C20992b {

    /* renamed from: a */
    public final int f54154a;

    /* renamed from: b */
    public final int f54155b;

    /* renamed from: c */
    public final int f54156c;

    /* renamed from: d */
    public final int f54157d;

    public C20992b(int i, int i2, int i3, int i4) {
        this.f54154a = i;
        this.f54155b = i2;
        this.f54156c = i3;
        this.f54157d = i4;
    }

    /* renamed from: a */
    public final int mo62764a() {
        return this.f54157d;
    }

    /* renamed from: b */
    public final int mo62765b() {
        return this.f54157d - this.f54155b;
    }

    /* renamed from: c */
    public final int mo62766c() {
        return this.f54154a;
    }

    /* renamed from: d */
    public final int mo62767d() {
        return this.f54156c;
    }

    /* renamed from: e */
    public final int mo62768e() {
        return this.f54155b;
    }

    public boolean equals(@C12580l Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        Class<C20992b> cls2 = C20992b.class;
        if (obj == null) {
            cls = null;
        } else {
            cls = obj.getClass();
        }
        if (!Intrinsics.areEqual((Object) cls2, (Object) cls)) {
            return false;
        }
        if (obj != null) {
            C20992b bVar = (C20992b) obj;
            if (this.f54154a == bVar.f54154a && this.f54155b == bVar.f54155b && this.f54156c == bVar.f54156c && this.f54157d == bVar.f54157d) {
                return true;
            }
            return false;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.window.core.Bounds");
    }

    /* renamed from: f */
    public final int mo62770f() {
        return this.f54156c - this.f54154a;
    }

    /* renamed from: g */
    public final boolean mo62771g() {
        return mo62765b() == 0 || mo62770f() == 0;
    }

    /* renamed from: h */
    public final boolean mo62772h() {
        return mo62765b() == 0 && mo62770f() == 0;
    }

    public int hashCode() {
        return (((((this.f54154a * 31) + this.f54155b) * 31) + this.f54156c) * 31) + this.f54157d;
    }

    @C12579k
    /* renamed from: i */
    public final Rect mo62774i() {
        return new Rect(this.f54154a, this.f54155b, this.f54156c, this.f54157d);
    }

    @C12579k
    public String toString() {
        return C20992b.class.getSimpleName() + " { [" + this.f54154a + ',' + this.f54155b + ',' + this.f54156c + ',' + this.f54157d + "] }";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C20992b(@C12579k Rect rect) {
        this(rect.left, rect.top, rect.right, rect.bottom);
        Intrinsics.checkNotNullParameter(rect, "rect");
    }
}
