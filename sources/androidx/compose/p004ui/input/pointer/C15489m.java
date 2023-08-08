package androidx.compose.p004ui.input.pointer;

import androidx.compose.p004ui.layout.C15588o;
import androidx.compose.p004ui.node.C15692h1;
import androidx.compose.runtime.collection.C8423g;
import java.util.Map;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nHitPathTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HitPathTracker.kt\nandroidx/compose/ui/input/pointer/NodeParent\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,538:1\n1182#2:539\n1161#2,2:540\n460#3,11:542\n460#3,11:553\n460#3,11:564\n460#3,11:575\n523#3:586\n48#3:587\n523#3:588\n*S KotlinDebug\n*F\n+ 1 HitPathTracker.kt\nandroidx/compose/ui/input/pointer/NodeParent\n*L\n143#1:539\n143#1:540,2\n152#1:542,11\n182#1:553,11\n201#1:564,11\n212#1:575,11\n228#1:586\n240#1:587\n241#1:588\n*E\n"})
/* renamed from: androidx.compose.ui.input.pointer.m */
public class C15489m {
    @C12579k

    /* renamed from: a */
    public final C8423g<C15487l> f38519a = new C8423g<>(new C15487l[16], 0);

    /* renamed from: a */
    public boolean mo44084a(@C12579k Map<C15506v, C15507w> map, @C12579k C15588o oVar, @C12579k C15476g gVar, boolean z) {
        Intrinsics.checkNotNullParameter(map, "changes");
        Intrinsics.checkNotNullParameter(oVar, "parentCoordinates");
        Intrinsics.checkNotNullParameter(gVar, "internalPointerEvent");
        C8423g<C15487l> gVar2 = this.f38519a;
        int h0 = gVar2.mo15469h0();
        if (h0 <= 0) {
            return false;
        }
        Object[] d0 = gVar2.mo15462d0();
        int i = 0;
        boolean z2 = false;
        do {
            if (((C15487l) d0[i]).mo44084a(map, oVar, gVar, z) || z2) {
                z2 = true;
            } else {
                z2 = false;
            }
            i++;
        } while (i < h0);
        return z2;
    }

    /* renamed from: b */
    public void mo44085b(@C12579k C15476g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "internalPointerEvent");
        int h0 = this.f38519a.mo15469h0();
        while (true) {
            h0--;
            if (-1 >= h0) {
                return;
            }
            if (((C15487l) this.f38519a.mo15462d0()[h0]).mo44091k().mo15476l0()) {
                this.f38519a.mo15437D0(h0);
            }
        }
    }

    /* renamed from: c */
    public final void mo44099c() {
        this.f38519a.mo15490w();
    }

    /* renamed from: d */
    public void mo44086d() {
        C8423g<C15487l> gVar = this.f38519a;
        int h0 = gVar.mo15469h0();
        if (h0 > 0) {
            Object[] d0 = gVar.mo15462d0();
            int i = 0;
            do {
                ((C15487l) d0[i]).mo44086d();
                i++;
            } while (i < h0);
        }
    }

    /* renamed from: e */
    public boolean mo44087e(@C12579k C15476g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "internalPointerEvent");
        C8423g<C15487l> gVar2 = this.f38519a;
        int h0 = gVar2.mo15469h0();
        boolean z = false;
        if (h0 > 0) {
            Object[] d0 = gVar2.mo15462d0();
            int i = 0;
            boolean z2 = false;
            do {
                if (((C15487l) d0[i]).mo44087e(gVar) || z2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                i++;
            } while (i < h0);
            z = z2;
        }
        mo44085b(gVar);
        return z;
    }

    /* renamed from: f */
    public boolean mo44088f(@C12579k Map<C15506v, C15507w> map, @C12579k C15588o oVar, @C12579k C15476g gVar, boolean z) {
        Intrinsics.checkNotNullParameter(map, "changes");
        Intrinsics.checkNotNullParameter(oVar, "parentCoordinates");
        Intrinsics.checkNotNullParameter(gVar, "internalPointerEvent");
        C8423g<C15487l> gVar2 = this.f38519a;
        int h0 = gVar2.mo15469h0();
        if (h0 <= 0) {
            return false;
        }
        Object[] d0 = gVar2.mo15462d0();
        int i = 0;
        boolean z2 = false;
        do {
            if (((C15487l) d0[i]).mo44088f(map, oVar, gVar, z) || z2) {
                z2 = true;
            } else {
                z2 = false;
            }
            i++;
        } while (i < h0);
        return z2;
    }

    @C12579k
    /* renamed from: g */
    public final C8423g<C15487l> mo44100g() {
        return this.f38519a;
    }

    /* renamed from: h */
    public final void mo44101h() {
        int i = 0;
        while (i < this.f38519a.mo15469h0()) {
            C15487l lVar = (C15487l) this.f38519a.mo15462d0()[i];
            if (!C15692h1.m70288c(lVar.mo44092l())) {
                this.f38519a.mo15437D0(i);
                lVar.mo44086d();
            } else {
                i++;
                lVar.mo44101h();
            }
        }
    }
}
