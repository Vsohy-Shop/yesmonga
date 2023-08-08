package androidx.compose.p004ui.modifier;

import androidx.compose.runtime.C8410b2;
import androidx.compose.runtime.C8539f2;
import androidx.compose.runtime.C8700z0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nModifierLocalNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModifierLocalNode.kt\nandroidx/compose/ui/modifier/SingleLocalMap\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,220:1\n76#2:221\n102#2,2:222\n*S KotlinDebug\n*F\n+ 1 ModifierLocalNode.kt\nandroidx/compose/ui/modifier/SingleLocalMap\n*L\n44#1:221\n44#1:222,2\n*E\n"})
/* renamed from: androidx.compose.ui.modifier.n */
public final class C15639n extends C15631g {
    @C12579k

    /* renamed from: b */
    public final C15626c<?> f38775b;
    @C12579k

    /* renamed from: c */
    public final C8700z0 f38776c = C8539f2.m30981g((Object) null, (C8410b2) null, 2, (Object) null);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15639n(@C12579k C15626c<?> cVar) {
        super((DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(cVar, "key");
        this.f38775b = cVar;
    }

    /* renamed from: a */
    public boolean mo44508a(@C12579k C15626c<?> cVar) {
        Intrinsics.checkNotNullParameter(cVar, "key");
        if (cVar == this.f38775b) {
            return true;
        }
        return false;
    }

    @C12580l
    /* renamed from: b */
    public <T> T mo44509b(@C12579k C15626c<T> cVar) {
        boolean z;
        Intrinsics.checkNotNullParameter(cVar, "key");
        if (cVar == this.f38775b) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            T e = mo44522e();
            if (e == null) {
                return null;
            }
            return e;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: c */
    public <T> void mo44510c(@C12579k C15626c<T> cVar, T t) {
        boolean z;
        Intrinsics.checkNotNullParameter(cVar, "key");
        if (cVar == this.f38775b) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            mo44523f(t);
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: d */
    public final void mo44521d(@C12580l Object obj) {
        mo44523f(obj);
    }

    /* renamed from: e */
    public final Object mo44522e() {
        return this.f38776c.getValue();
    }

    /* renamed from: f */
    public final void mo44523f(Object obj) {
        this.f38776c.setValue(obj);
    }
}
