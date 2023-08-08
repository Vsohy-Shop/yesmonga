package androidx.compose.p004ui.input.pointer;

import android.view.PointerIcon;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.ui.input.pointer.a */
public final class C15461a implements C15496s {
    @C12579k

    /* renamed from: b */
    public final PointerIcon f38472b;

    public C15461a(@C12579k PointerIcon pointerIcon) {
        Intrinsics.checkNotNullParameter(pointerIcon, "pointerIcon");
        this.f38472b = pointerIcon;
    }

    @C12579k
    /* renamed from: a */
    public final PointerIcon mo44020a() {
        return this.f38472b;
    }

    public boolean equals(@C12580l Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        Class<C15461a> cls2 = C15461a.class;
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!Intrinsics.areEqual((Object) cls2, (Object) cls)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.AndroidPointerIcon");
        return Intrinsics.areEqual((Object) this.f38472b, (Object) ((C15461a) obj).f38472b);
    }

    public int hashCode() {
        return this.f38472b.hashCode();
    }

    @C12579k
    public String toString() {
        return "AndroidPointerIcon(pointerIcon=" + this.f38472b + ')';
    }
}
