package androidx.compose.p004ui.input.pointer;

import android.view.MotionEvent;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nInternalPointerEvent.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InternalPointerEvent.android.kt\nandroidx/compose/ui/input/pointer/InternalPointerEvent\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,35:1\n116#2,2:36\n33#2,6:38\n118#2:44\n*S KotlinDebug\n*F\n+ 1 InternalPointerEvent.android.kt\nandroidx/compose/ui/input/pointer/InternalPointerEvent\n*L\n30#1:36,2\n30#1:38,6\n30#1:44\n*E\n"})
/* renamed from: androidx.compose.ui.input.pointer.g */
public final class C15476g {
    @C12579k

    /* renamed from: a */
    public final Map<C15506v, C15507w> f38490a;
    @C12579k

    /* renamed from: b */
    public final C15510y f38491b;

    /* renamed from: c */
    public boolean f38492c;

    public C15476g(@C12579k Map<C15506v, C15507w> map, @C12579k C15510y yVar) {
        Intrinsics.checkNotNullParameter(map, "changes");
        Intrinsics.checkNotNullParameter(yVar, "pointerInputEvent");
        this.f38490a = map;
        this.f38491b = yVar;
    }

    @C12579k
    /* renamed from: a */
    public final Map<C15506v, C15507w> mo44049a() {
        return this.f38490a;
    }

    @C12579k
    /* renamed from: b */
    public final MotionEvent mo44050b() {
        return this.f38491b.mo44193a();
    }

    @C12579k
    /* renamed from: c */
    public final C15510y mo44051c() {
        return this.f38491b;
    }

    /* renamed from: d */
    public final boolean mo44052d() {
        return this.f38492c;
    }

    /* renamed from: e */
    public final boolean mo44053e(long j) {
        C15511z zVar;
        List<C15511z> b = this.f38491b.mo44194b();
        int size = b.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                zVar = null;
                break;
            }
            zVar = b.get(i);
            if (C15506v.m68789d(zVar.mo44211o(), j)) {
                break;
            }
            i++;
        }
        C15511z zVar2 = zVar;
        if (zVar2 != null) {
            return zVar2.mo44212p();
        }
        return false;
    }

    /* renamed from: f */
    public final void mo44054f(boolean z) {
        this.f38492c = z;
    }
}
