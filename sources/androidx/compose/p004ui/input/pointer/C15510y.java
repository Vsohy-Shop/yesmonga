package androidx.compose.p004ui.input.pointer;

import android.view.MotionEvent;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.ui.input.pointer.y */
public final class C15510y {

    /* renamed from: a */
    public final long f38587a;
    @C12579k

    /* renamed from: b */
    public final List<C15511z> f38588b;
    @C12579k

    /* renamed from: c */
    public final MotionEvent f38589c;

    public C15510y(long j, @C12579k List<C15511z> list, @C12579k MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(list, "pointers");
        Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
        this.f38587a = j;
        this.f38588b = list;
        this.f38589c = motionEvent;
    }

    @C12579k
    /* renamed from: a */
    public final MotionEvent mo44193a() {
        return this.f38589c;
    }

    @C12579k
    /* renamed from: b */
    public final List<C15511z> mo44194b() {
        return this.f38588b;
    }

    /* renamed from: c */
    public final long mo44195c() {
        return this.f38587a;
    }
}
