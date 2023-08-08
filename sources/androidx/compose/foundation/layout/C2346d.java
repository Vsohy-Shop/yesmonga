package androidx.compose.foundation.layout;

import androidx.compose.p004ui.layout.C15531a;
import androidx.compose.p004ui.layout.C15574i0;
import androidx.compose.p004ui.layout.C15611w0;
import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.foundation.layout.d */
public abstract class C2346d {

    @C8567o(parameters = 0)
    /* renamed from: androidx.compose.foundation.layout.d$a */
    public static final class C2347a extends C2346d {

        /* renamed from: b */
        public static final int f6250b = 0;
        @C12579k

        /* renamed from: a */
        public final C11300l<C15574i0, Integer> f6251a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2347a(@C12579k C11300l<? super C15574i0, Integer> lVar) {
            super((DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(lVar, "lineProviderBlock");
            this.f6251a = lVar;
        }

        /* renamed from: d */
        public static /* synthetic */ C2347a m10344d(C2347a aVar, C11300l<C15574i0, Integer> lVar, int i, Object obj) {
            if ((i & 1) != 0) {
                lVar = aVar.f6251a;
            }
            return aVar.mo8028c(lVar);
        }

        /* renamed from: a */
        public int mo8026a(@C12579k C15611w0 w0Var) {
            Intrinsics.checkNotNullParameter(w0Var, "placeable");
            return this.f6251a.invoke(w0Var).intValue();
        }

        @C12579k
        /* renamed from: b */
        public final C11300l<C15574i0, Integer> mo8027b() {
            return this.f6251a;
        }

        @C12579k
        /* renamed from: c */
        public final C2347a mo8028c(@C12579k C11300l<? super C15574i0, Integer> lVar) {
            Intrinsics.checkNotNullParameter(lVar, "lineProviderBlock");
            return new C2347a(lVar);
        }

        @C12579k
        /* renamed from: e */
        public final C11300l<C15574i0, Integer> mo8029e() {
            return this.f6251a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2347a) && Intrinsics.areEqual((Object) this.f6251a, (Object) ((C2347a) obj).f6251a);
        }

        public int hashCode() {
            return this.f6251a.hashCode();
        }

        @C12579k
        public String toString() {
            return "Block(lineProviderBlock=" + this.f6251a + ')';
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: androidx.compose.foundation.layout.d$b */
    public static final class C2348b extends C2346d {

        /* renamed from: b */
        public static final int f6252b = 0;
        @C12579k

        /* renamed from: a */
        public final C15531a f6253a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2348b(@C12579k C15531a aVar) {
            super((DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(aVar, "alignmentLine");
            this.f6253a = aVar;
        }

        /* renamed from: d */
        public static /* synthetic */ C2348b m10349d(C2348b bVar, C15531a aVar, int i, Object obj) {
            if ((i & 1) != 0) {
                aVar = bVar.f6253a;
            }
            return bVar.mo8034c(aVar);
        }

        /* renamed from: a */
        public int mo8026a(@C12579k C15611w0 w0Var) {
            Intrinsics.checkNotNullParameter(w0Var, "placeable");
            return w0Var.mo44325A(this.f6253a);
        }

        @C12579k
        /* renamed from: b */
        public final C15531a mo8033b() {
            return this.f6253a;
        }

        @C12579k
        /* renamed from: c */
        public final C2348b mo8034c(@C12579k C15531a aVar) {
            Intrinsics.checkNotNullParameter(aVar, "alignmentLine");
            return new C2348b(aVar);
        }

        @C12579k
        /* renamed from: e */
        public final C15531a mo8035e() {
            return this.f6253a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2348b) && Intrinsics.areEqual((Object) this.f6253a, (Object) ((C2348b) obj).f6253a);
        }

        public int hashCode() {
            return this.f6253a.hashCode();
        }

        @C12579k
        public String toString() {
            return "Value(alignmentLine=" + this.f6253a + ')';
        }
    }

    public /* synthetic */ C2346d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: a */
    public abstract int mo8026a(@C12579k C15611w0 w0Var);

    public C2346d() {
    }
}
