package com.carrefour.fid.android.presentation.viewmodels.offer.state;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.presentation.models.OfferModel;
import com.carrefour.fid.android.shared.base.C28505u;
import java.util.List;
import kotlin.C11395k;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.offer.state.b */
public abstract class C26631b implements C28505u.C28509d {

    /* renamed from: b */
    public static final int f65034b = 0;

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.offer.state.b$a */
    public static final class C26632a extends C26631b {
        @C12579k

        /* renamed from: c */
        public static final C26632a f65035c = new C26632a();

        /* renamed from: d */
        public static final int f65036d = 0;

        public C26632a() {
            super((DefaultConstructorMarker) null);
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.offer.state.b$b */
    public static final class C26633b extends C26631b {

        /* renamed from: d */
        public static final int f65037d = 8;
        @C12579k

        /* renamed from: c */
        public final Throwable f65038c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C26633b(@C12579k Throwable th) {
            super((DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(th, "throwable");
            this.f65038c = th;
        }

        /* renamed from: g */
        public static /* synthetic */ C26633b m113215g(C26633b bVar, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = bVar.f65038c;
            }
            return bVar.mo77380f(th);
        }

        @C12579k
        /* renamed from: e */
        public final Throwable mo77378e() {
            return this.f65038c;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C26633b) && Intrinsics.areEqual((Object) this.f65038c, (Object) ((C26633b) obj).f65038c);
        }

        @C12579k
        /* renamed from: f */
        public final C26633b mo77380f(@C12579k Throwable th) {
            Intrinsics.checkNotNullParameter(th, "throwable");
            return new C26633b(th);
        }

        @C12579k
        /* renamed from: h */
        public final Throwable mo77381h() {
            return this.f65038c;
        }

        public int hashCode() {
            return this.f65038c.hashCode();
        }

        @C12579k
        public String toString() {
            Throwable th = this.f65038c;
            return "ErrorEvent(throwable=" + th + ")";
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.offer.state.b$c */
    public static final class C26634c extends C26631b {
        @C12579k

        /* renamed from: c */
        public static final C26634c f65039c = new C26634c();

        /* renamed from: d */
        public static final int f65040d = 0;

        public C26634c() {
            super((DefaultConstructorMarker) null);
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.offer.state.b$d */
    public static final class C26635d extends C26631b {

        /* renamed from: d */
        public static final int f65041d = 8;
        @C12579k

        /* renamed from: c */
        public final List<OfferModel> f65042c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C26635d(@C12579k List<? extends OfferModel> list) {
            super((DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(list, "list");
            this.f65042c = list;
        }

        /* renamed from: g */
        public static /* synthetic */ C26635d m113219g(C26635d dVar, List<OfferModel> list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = dVar.f65042c;
            }
            return dVar.mo77386f(list);
        }

        @C12579k
        /* renamed from: e */
        public final List<OfferModel> mo77384e() {
            return this.f65042c;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C26635d) && Intrinsics.areEqual((Object) this.f65042c, (Object) ((C26635d) obj).f65042c);
        }

        @C12579k
        /* renamed from: f */
        public final C26635d mo77386f(@C12579k List<? extends OfferModel> list) {
            Intrinsics.checkNotNullParameter(list, "list");
            return new C26635d(list);
        }

        @C12579k
        /* renamed from: h */
        public final List<OfferModel> mo77387h() {
            return this.f65042c;
        }

        public int hashCode() {
            return this.f65042c.hashCode();
        }

        @C12579k
        public String toString() {
            List<OfferModel> list = this.f65042c;
            return "OfferList(list=" + list + ")";
        }
    }

    public /* synthetic */ C26631b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
    @C12579k
    public C28505u.C28509d reset() {
        return C28505u.C28509d.C28510a.m118428a(this);
    }

    public C26631b() {
    }
}
