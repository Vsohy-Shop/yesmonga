package androidx.compose.p004ui.input.pointer;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.ui.input.pointer.b */
public final class C15463b implements C15496s {

    /* renamed from: b */
    public final int f38478b;

    public C15463b(int i) {
        this.f38478b = i;
    }

    /* renamed from: a */
    public final int mo44027a() {
        return this.f38478b;
    }

    public boolean equals(@C12580l Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        Class<C15463b> cls2 = C15463b.class;
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!Intrinsics.areEqual((Object) cls2, (Object) cls)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.AndroidPointerIconType");
        if (this.f38478b != ((C15463b) obj).f38478b) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f38478b;
    }

    @C12579k
    public String toString() {
        return "AndroidPointerIcon(type=" + this.f38478b + ')';
    }
}
