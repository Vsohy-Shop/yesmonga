package androidx.constraintlayout.compose;

import androidx.compose.foundation.layout.C2429z;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.layout.C15605u0;
import androidx.compose.p004ui.platform.C15988w0;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.runtime.C8547h2;
import androidx.compose.runtime.internal.C8567o;
import java.util.ArrayList;
import kotlin.C11079d2;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C2429z
@C8567o(parameters = 0)
public final class ConstraintLayoutScope extends ConstraintLayoutBaseScope {

    /* renamed from: j */
    public static final int f41146j = 8;
    @C12580l

    /* renamed from: f */
    public C16574a f41147f;

    /* renamed from: g */
    public final int f41148g;

    /* renamed from: h */
    public int f41149h = this.f41148g;
    @C12579k

    /* renamed from: i */
    public final ArrayList<C16591e> f41150i = new ArrayList<>();

    @C8547h2
    public static final class ConstrainAsModifier extends C15988w0 implements C15605u0 {
        @C12579k

        /* renamed from: d */
        public final C16591e f41151d;
        @C12579k

        /* renamed from: e */
        public final C11300l<ConstrainScope, C11079d2> f41152e;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public ConstrainAsModifier(@org.jetbrains.annotations.C12579k androidx.constraintlayout.compose.C16591e r2, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11300l<? super androidx.constraintlayout.compose.ConstrainScope, kotlin.C11079d2> r3) {
            /*
                r1 = this;
                java.lang.String r0 = "ref"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                java.lang.String r0 = "constrainBlock"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                boolean r0 = androidx.compose.p004ui.platform.InspectableValueKt.m71063e()
                if (r0 == 0) goto L_0x0016
                androidx.constraintlayout.compose.ConstraintLayoutScope$ConstrainAsModifier$special$$inlined$debugInspectorInfo$1 r0 = new androidx.constraintlayout.compose.ConstraintLayoutScope$ConstrainAsModifier$special$$inlined$debugInspectorInfo$1
                r0.<init>(r2, r3)
                goto L_0x001a
            L_0x0016:
                kotlin.jvm.functions.l r0 = androidx.compose.p004ui.platform.InspectableValueKt.m71060b()
            L_0x001a:
                r1.<init>(r0)
                r1.f41151d = r2
                r1.f41152e = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.compose.ConstraintLayoutScope.ConstrainAsModifier.<init>(androidx.constraintlayout.compose.e, kotlin.jvm.functions.l):void");
        }

        /* renamed from: A */
        public boolean mo17001A(@C12579k C11300l<? super C8767m.C8770c, Boolean> lVar) {
            return C15605u0.C15606a.m69375a(this, lVar);
        }

        /* renamed from: T */
        public boolean mo17002T(@C12579k C11300l<? super C8767m.C8770c, Boolean> lVar) {
            return C15605u0.C15606a.m69376b(this, lVar);
        }

        /* renamed from: Z */
        public <R> R mo17003Z(R r, @C12579k C11304p<? super C8767m.C8770c, ? super R, ? extends R> pVar) {
            return C15605u0.C15606a.m69378d(this, r, pVar);
        }

        public boolean equals(@C12580l Object obj) {
            C11300l<ConstrainScope, C11079d2> lVar = this.f41152e;
            C11300l<ConstrainScope, C11079d2> lVar2 = null;
            ConstrainAsModifier constrainAsModifier = obj instanceof ConstrainAsModifier ? (ConstrainAsModifier) obj : null;
            if (constrainAsModifier != null) {
                lVar2 = constrainAsModifier.f41152e;
            }
            return Intrinsics.areEqual((Object) lVar, (Object) lVar2);
        }

        public int hashCode() {
            return this.f41152e.hashCode();
        }

        @C12579k
        /* renamed from: k3 */
        public C8767m mo17224k3(@C12579k C8767m mVar) {
            return C15605u0.C15606a.m69379e(this, mVar);
        }

        @C12579k
        /* renamed from: r */
        public C16595g mo6431N(@C12579k C16479d dVar, @C12580l Object obj) {
            Intrinsics.checkNotNullParameter(dVar, "<this>");
            return new C16595g(this.f41151d, this.f41152e);
        }

        /* renamed from: w */
        public <R> R mo17009w(R r, @C12579k C11304p<? super R, ? super C8767m.C8770c, ? extends R> pVar) {
            return C15605u0.C15606a.m69377c(this, r, pVar);
        }
    }

    /* renamed from: androidx.constraintlayout.compose.ConstraintLayoutScope$a */
    public final class C16574a {

        /* renamed from: a */
        public final /* synthetic */ ConstraintLayoutScope f41153a;

        public C16574a(ConstraintLayoutScope constraintLayoutScope) {
            Intrinsics.checkNotNullParameter(constraintLayoutScope, "this$0");
            this.f41153a = constraintLayoutScope;
        }

        @C12579k
        /* renamed from: a */
        public final C16591e mo48336a() {
            return this.f41153a.mo48331N();
        }

        @C12579k
        /* renamed from: b */
        public final C16591e mo48337b() {
            return this.f41153a.mo48331N();
        }

        @C12579k
        /* renamed from: c */
        public final C16591e mo48338c() {
            return this.f41153a.mo48331N();
        }

        @C12579k
        /* renamed from: d */
        public final C16591e mo48339d() {
            return this.f41153a.mo48331N();
        }

        @C12579k
        /* renamed from: e */
        public final C16591e mo48340e() {
            return this.f41153a.mo48331N();
        }

        @C12579k
        /* renamed from: f */
        public final C16591e mo48341f() {
            return this.f41153a.mo48331N();
        }

        @C12579k
        /* renamed from: g */
        public final C16591e mo48342g() {
            return this.f41153a.mo48331N();
        }

        @C12579k
        /* renamed from: h */
        public final C16591e mo48343h() {
            return this.f41153a.mo48331N();
        }

        @C12579k
        /* renamed from: i */
        public final C16591e mo48344i() {
            return this.f41153a.mo48331N();
        }

        @C12579k
        /* renamed from: j */
        public final C16591e mo48345j() {
            return this.f41153a.mo48331N();
        }

        @C12579k
        /* renamed from: k */
        public final C16591e mo48346k() {
            return this.f41153a.mo48331N();
        }

        @C12579k
        /* renamed from: l */
        public final C16591e mo48347l() {
            return this.f41153a.mo48331N();
        }

        @C12579k
        /* renamed from: m */
        public final C16591e mo48348m() {
            return this.f41153a.mo48331N();
        }

        @C12579k
        /* renamed from: n */
        public final C16591e mo48349n() {
            return this.f41153a.mo48331N();
        }

        @C12579k
        /* renamed from: o */
        public final C16591e mo48350o() {
            return this.f41153a.mo48331N();
        }

        @C12579k
        /* renamed from: p */
        public final C16591e mo48351p() {
            return this.f41153a.mo48331N();
        }
    }

    /* renamed from: J */
    public void mo48256J() {
        super.mo48256J();
        this.f41149h = this.f41148g;
    }

    @C8547h2
    @C12579k
    /* renamed from: M */
    public final C8767m mo48330M(@C12579k C8767m mVar, @C12579k C16591e eVar, @C12579k C11300l<? super ConstrainScope, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(eVar, "ref");
        Intrinsics.checkNotNullParameter(lVar, "constrainBlock");
        return mVar.mo17224k3(new ConstrainAsModifier(eVar, lVar));
    }

    @C12579k
    /* renamed from: N */
    public final C16591e mo48331N() {
        ArrayList<C16591e> arrayList = this.f41150i;
        int i = this.f41149h;
        this.f41149h = i + 1;
        C16591e eVar = (C16591e) CollectionsKt___CollectionsKt.m40559R2(arrayList, i);
        if (eVar != null) {
            return eVar;
        }
        C16591e eVar2 = new C16591e(Integer.valueOf(this.f41149h));
        this.f41150i.add(eVar2);
        return eVar2;
    }

    @C8547h2
    @C12579k
    /* renamed from: O */
    public final C16574a mo48332O() {
        C16574a aVar = this.f41147f;
        if (aVar != null) {
            return aVar;
        }
        C16574a aVar2 = new C16574a(this);
        this.f41147f = aVar2;
        return aVar2;
    }
}
