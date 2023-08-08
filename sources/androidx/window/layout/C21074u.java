package androidx.window.layout;

import android.graphics.Rect;
import androidx.annotation.RestrictTo;
import androidx.window.core.C20992b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.window.layout.u */
public final class C21074u {
    @C12579k

    /* renamed from: a */
    public final C20992b f54326a;

    public C21074u(@C12579k C20992b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "_bounds");
        this.f54326a = bVar;
    }

    @C12579k
    /* renamed from: a */
    public final Rect mo63020a() {
        return this.f54326a.mo62774i();
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.areEqual((Object) C21074u.class, (Object) obj.getClass())) {
            return false;
        }
        return Intrinsics.areEqual((Object) this.f54326a, (Object) ((C21074u) obj).f54326a);
    }

    public int hashCode() {
        return this.f54326a.hashCode();
    }

    @C12579k
    public String toString() {
        return "WindowMetrics { bounds: " + mo63020a() + " }";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @RestrictTo({RestrictTo.Scope.TESTS})
    public C21074u(@C12579k Rect rect) {
        this(new C20992b(rect));
        Intrinsics.checkNotNullParameter(rect, "bounds");
    }
}
