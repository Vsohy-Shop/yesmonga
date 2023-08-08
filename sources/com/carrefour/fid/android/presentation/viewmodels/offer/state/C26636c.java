package com.carrefour.fid.android.presentation.viewmodels.offer.state;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.presentation.models.OfferModel;
import com.carrefour.fid.android.presentation.viewmodels.offer.state.C26631b;
import com.carrefour.fid.android.shared.base.C28505u;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.offer.state.c */
public final class C26636c implements C28505u.C28509d {
    @C12579k

    /* renamed from: e */
    public static final C26638b f65043e = new C26638b((DefaultConstructorMarker) null);

    /* renamed from: f */
    public static final int f65044f = 8;
    @C12579k

    /* renamed from: g */
    public static final C26636c f65045g = new C26636c(false, (List<? extends OfferModel>) null, (Throwable) null);
    @C12579k

    /* renamed from: h */
    public static final C28505u.C28508c<C26636c, C26631b> f65046h = C26637a.f65050a;

    /* renamed from: b */
    public final boolean f65047b;
    @C12580l

    /* renamed from: c */
    public final List<OfferModel> f65048c;
    @C12580l

    /* renamed from: d */
    public final Throwable f65049d;

    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.offer.state.c$a */
    public static final class C26637a implements C28505u.C28508c<C26636c, C26631b> {

        /* renamed from: a */
        public static final C26637a f65050a = new C26637a();

        @C12579k
        /* renamed from: b */
        public final C26636c mo32307a(@C12579k C26636c cVar, @C12579k C26631b bVar) {
            Intrinsics.checkNotNullParameter(cVar, "previousState");
            Intrinsics.checkNotNullParameter(bVar, "partial");
            if (bVar instanceof C26631b.C26633b) {
                return C26636c.m113225k(cVar, false, (List) null, ((C26631b.C26633b) bVar).mo77381h(), 2, (Object) null);
            } else if (Intrinsics.areEqual((Object) bVar, (Object) C26631b.C26634c.f65039c)) {
                return C26636c.m113225k(cVar, true, (List) null, (Throwable) null, 2, (Object) null);
            } else {
                if (bVar instanceof C26631b.C26635d) {
                    return cVar.mo77396j(false, ((C26631b.C26635d) bVar).mo77387h(), (Throwable) null);
                }
                if (Intrinsics.areEqual((Object) bVar, (Object) C26631b.C26632a.f65035c)) {
                    return C26636c.m113225k(cVar, false, (List) null, (Throwable) null, 3, (Object) null);
                }
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.offer.state.c$b */
    public static final class C26638b {
        public /* synthetic */ C26638b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final C26636c mo77402a() {
            return C26636c.f65045g;
        }

        @C12579k
        /* renamed from: b */
        public final C28505u.C28508c<C26636c, C26631b> mo77403b() {
            return C26636c.f65046h;
        }

        public C26638b() {
        }
    }

    public C26636c(boolean z, @C12580l List<? extends OfferModel> list, @C12580l Throwable th) {
        this.f65047b = z;
        this.f65048c = list;
        this.f65049d = th;
    }

    /* renamed from: k */
    public static /* synthetic */ C26636c m113225k(C26636c cVar, boolean z, List<OfferModel> list, Throwable th, int i, Object obj) {
        if ((i & 1) != 0) {
            z = cVar.f65047b;
        }
        if ((i & 2) != 0) {
            list = cVar.f65048c;
        }
        if ((i & 4) != 0) {
            th = cVar.f65049d;
        }
        return cVar.mo77396j(z, list, th);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26636c)) {
            return false;
        }
        C26636c cVar = (C26636c) obj;
        return this.f65047b == cVar.f65047b && Intrinsics.areEqual((Object) this.f65048c, (Object) cVar.f65048c) && Intrinsics.areEqual((Object) this.f65049d, (Object) cVar.f65049d);
    }

    /* renamed from: g */
    public final boolean mo77391g() {
        return this.f65047b;
    }

    @C12580l
    /* renamed from: h */
    public final List<OfferModel> mo77392h() {
        return this.f65048c;
    }

    public int hashCode() {
        boolean z = this.f65047b;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        List<OfferModel> list = this.f65048c;
        int i2 = 0;
        int hashCode = (i + (list == null ? 0 : list.hashCode())) * 31;
        Throwable th = this.f65049d;
        if (th != null) {
            i2 = th.hashCode();
        }
        return hashCode + i2;
    }

    @C12580l
    /* renamed from: i */
    public final Throwable mo77394i() {
        return this.f65049d;
    }

    public final boolean isLoading() {
        return this.f65047b;
    }

    @C12579k
    /* renamed from: j */
    public final C26636c mo77396j(boolean z, @C12580l List<? extends OfferModel> list, @C12580l Throwable th) {
        return new C26636c(z, list, th);
    }

    @C12580l
    /* renamed from: l */
    public final Throwable mo77397l() {
        return this.f65049d;
    }

    @C12580l
    /* renamed from: m */
    public final List<OfferModel> mo77398m() {
        return this.f65048c;
    }

    @C12579k
    /* renamed from: n */
    public C26636c reset() {
        return m113225k(this, false, (List) null, (Throwable) null, 3, (Object) null);
    }

    @C12579k
    public String toString() {
        boolean z = this.f65047b;
        List<OfferModel> list = this.f65048c;
        Throwable th = this.f65049d;
        return "OfferListUIState(isLoading=" + z + ", offerList=" + list + ", errorEvent=" + th + ")";
    }
}
