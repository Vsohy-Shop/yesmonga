package androidx.compose.p004ui.layout;

import androidx.compose.p004ui.node.C15713n0;
import java.util.List;
import kotlin.C11532s0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.ui.layout.l0 */
public final class C15581l0 {

    /* renamed from: androidx.compose.ui.layout.l0$a */
    public static final class C15582a implements C15560f0 {

        /* renamed from: a */
        public final /* synthetic */ C15579k0 f38734a;

        public C15582a(C15579k0 k0Var) {
            this.f38734a = k0Var;
        }

        @C12579k
        /* renamed from: a */
        public C15564g0 mo6397a(@C12579k C15568h0 h0Var, @C12579k List<? extends C15557e0> list, long j) {
            Intrinsics.checkNotNullParameter(h0Var, "$this$measure");
            Intrinsics.checkNotNullParameter(list, "measurables");
            return this.f38734a.mo44424a(h0Var, C15713n0.m70433a(h0Var), j);
        }

        /* renamed from: b */
        public int mo6398b(@C12579k C15583m mVar, @C12579k List<? extends C15580l> list, int i) {
            Intrinsics.checkNotNullParameter(mVar, "<this>");
            Intrinsics.checkNotNullParameter(list, "measurables");
            return this.f38734a.mo44425b(mVar, C15713n0.m70433a(mVar), i);
        }

        /* renamed from: c */
        public int mo6399c(@C12579k C15583m mVar, @C12579k List<? extends C15580l> list, int i) {
            Intrinsics.checkNotNullParameter(mVar, "<this>");
            Intrinsics.checkNotNullParameter(list, "measurables");
            return this.f38734a.mo44426c(mVar, C15713n0.m70433a(mVar), i);
        }

        /* renamed from: d */
        public int mo6400d(@C12579k C15583m mVar, @C12579k List<? extends C15580l> list, int i) {
            Intrinsics.checkNotNullParameter(mVar, "<this>");
            Intrinsics.checkNotNullParameter(list, "measurables");
            return this.f38734a.mo44427d(mVar, C15713n0.m70433a(mVar), i);
        }

        /* renamed from: e */
        public int mo6401e(@C12579k C15583m mVar, @C12579k List<? extends C15580l> list, int i) {
            Intrinsics.checkNotNullParameter(mVar, "<this>");
            Intrinsics.checkNotNullParameter(list, "measurables");
            return this.f38734a.mo44428e(mVar, C15713n0.m70433a(mVar), i);
        }
    }

    @C12579k
    @C11532s0
    /* renamed from: a */
    public static final C15560f0 m69248a(@C12579k C15579k0 k0Var) {
        Intrinsics.checkNotNullParameter(k0Var, "measurePolicy");
        return new C15582a(k0Var);
    }
}
