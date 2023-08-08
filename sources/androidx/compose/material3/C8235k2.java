package androidx.compose.material3;

import androidx.compose.p004ui.unit.C16494m;
import androidx.compose.p004ui.unit.C16496n;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.material3.k2 */
public final class C8235k2 {
    @C12579k

    /* renamed from: d */
    public static final C8236a f20276d = new C8236a((DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: a */
    public final Pair<C16494m, C16494m> f20277a;

    /* renamed from: b */
    public final boolean f20278b;

    /* renamed from: c */
    public final boolean f20279c;

    /* renamed from: androidx.compose.material3.k2$a */
    public static final class C8236a {
        public /* synthetic */ C8236a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12580l
        /* renamed from: a */
        public final C8235k2 mo12759a(@C12579k C8266q qVar, @C12580l C8238l lVar, @C12580l C8238l lVar2) {
            boolean z;
            int i;
            int i2;
            Intrinsics.checkNotNullParameter(qVar, "month");
            if (lVar == null || lVar2 == null || lVar.mo12763X() > qVar.mo12918k() || lVar2.mo12763X() < qVar.mo12921n()) {
                return null;
            }
            boolean z2 = false;
            if (lVar.mo12763X() >= qVar.mo12921n()) {
                z = true;
            } else {
                z = false;
            }
            if (lVar2.mo12763X() <= qVar.mo12918k()) {
                z2 = true;
            }
            if (z) {
                i = (qVar.mo12917j() + lVar.mo12761R1()) - 1;
            } else {
                i = qVar.mo12917j();
            }
            if (z2) {
                i2 = (qVar.mo12917j() + lVar2.mo12761R1()) - 1;
            } else {
                i2 = (qVar.mo12917j() + qVar.mo12920m()) - 1;
            }
            return new C8235k2(new Pair(C16494m.m74570b(C16496n.m74593a(i % 7, i / 7)), C16494m.m74570b(C16496n.m74593a(i2 % 7, i2 / 7))), z, z2);
        }

        public C8236a() {
        }
    }

    public C8235k2(@C12579k Pair<C16494m, C16494m> pair, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(pair, "gridCoordinates");
        this.f20277a = pair;
        this.f20278b = z;
        this.f20279c = z2;
    }

    /* renamed from: a */
    public final boolean mo12756a() {
        return this.f20278b;
    }

    @C12579k
    /* renamed from: b */
    public final Pair<C16494m, C16494m> mo12757b() {
        return this.f20277a;
    }

    /* renamed from: c */
    public final boolean mo12758c() {
        return this.f20279c;
    }
}
