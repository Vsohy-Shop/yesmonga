package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.C2346d;
import androidx.compose.p004ui.layout.C15531a;
import androidx.compose.p004ui.layout.C15574i0;
import androidx.compose.p004ui.layout.C15605u0;
import androidx.compose.p004ui.platform.C15983v0;
import androidx.compose.p004ui.platform.C15988w0;
import androidx.compose.p004ui.unit.C16479d;
import com.carrefour.fid.android.shared.constant.C28534f;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.foundation.layout.v0 */
public abstract class C2414v0 extends C15988w0 implements C15605u0 {

    /* renamed from: androidx.compose.foundation.layout.v0$a */
    public static final class C2415a extends C2414v0 {
        @C12579k

        /* renamed from: d */
        public final C15531a f6362d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2415a(@C12579k C15531a aVar, @C12579k C11300l<? super C15983v0, C11079d2> lVar) {
            super(lVar, (DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(aVar, "alignmentLine");
            Intrinsics.checkNotNullParameter(lVar, "inspectorInfo");
            this.f6362d = aVar;
        }

        @C12579k
        /* renamed from: N */
        public Object mo6431N(@C12579k C16479d dVar, @C12580l Object obj) {
            C2409t0 t0Var;
            Intrinsics.checkNotNullParameter(dVar, "<this>");
            if (obj instanceof C2409t0) {
                t0Var = (C2409t0) obj;
            } else {
                t0Var = null;
            }
            if (t0Var == null) {
                t0Var = new C2409t0(0.0f, false, (C2380m) null, 7, (DefaultConstructorMarker) null);
            }
            t0Var.mo8191i(C2380m.f6293a.mo8122b(new C2346d.C2348b(this.f6362d)));
            return t0Var;
        }

        public boolean equals(@C12580l Object obj) {
            C2415a aVar;
            if (this == obj) {
                return true;
            }
            if (obj instanceof C2415a) {
                aVar = (C2415a) obj;
            } else {
                aVar = null;
            }
            if (aVar == null) {
                return false;
            }
            return Intrinsics.areEqual((Object) this.f6362d, (Object) aVar.f6362d);
        }

        public int hashCode() {
            return this.f6362d.hashCode();
        }

        @C12579k
        /* renamed from: r */
        public final C15531a mo8214r() {
            return this.f6362d;
        }

        @C12579k
        public String toString() {
            return "WithAlignmentLine(line=" + this.f6362d + ')';
        }
    }

    /* renamed from: androidx.compose.foundation.layout.v0$b */
    public static final class C2416b extends C2414v0 {
        @C12579k

        /* renamed from: d */
        public final C11300l<C15574i0, Integer> f6363d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2416b(@C12579k C11300l<? super C15574i0, Integer> lVar, @C12579k C11300l<? super C15983v0, C11079d2> lVar2) {
            super(lVar2, (DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
            Intrinsics.checkNotNullParameter(lVar2, "inspectorInfo");
            this.f6363d = lVar;
        }

        @C12579k
        /* renamed from: N */
        public Object mo6431N(@C12579k C16479d dVar, @C12580l Object obj) {
            C2409t0 t0Var;
            Intrinsics.checkNotNullParameter(dVar, "<this>");
            if (obj instanceof C2409t0) {
                t0Var = (C2409t0) obj;
            } else {
                t0Var = null;
            }
            if (t0Var == null) {
                t0Var = new C2409t0(0.0f, false, (C2380m) null, 7, (DefaultConstructorMarker) null);
            }
            t0Var.mo8191i(C2380m.f6293a.mo8122b(new C2346d.C2347a(this.f6363d)));
            return t0Var;
        }

        public boolean equals(@C12580l Object obj) {
            C2416b bVar;
            if (this == obj) {
                return true;
            }
            if (obj instanceof C2416b) {
                bVar = (C2416b) obj;
            } else {
                bVar = null;
            }
            if (bVar == null) {
                return false;
            }
            return Intrinsics.areEqual((Object) this.f6363d, (Object) bVar.f6363d);
        }

        public int hashCode() {
            return this.f6363d.hashCode();
        }

        @C12579k
        /* renamed from: r */
        public final C11300l<C15574i0, Integer> mo8218r() {
            return this.f6363d;
        }

        @C12579k
        public String toString() {
            return "WithAlignmentLineBlock(block=" + this.f6363d + ')';
        }
    }

    public /* synthetic */ C2414v0(C11300l lVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(lVar);
    }

    @C12580l
    /* renamed from: N */
    public abstract Object mo6431N(@C12579k C16479d dVar, @C12580l Object obj);

    public C2414v0(C11300l<? super C15983v0, C11079d2> lVar) {
        super(lVar);
    }
}
