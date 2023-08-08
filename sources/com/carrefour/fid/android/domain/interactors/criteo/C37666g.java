package com.carrefour.fid.android.domain.interactors.criteo;

import com.carrefour.fid.android.domain.interactors.C37679f;
import com.carrefour.fid.android.domain.models.criteo.C38006h;
import com.carrefour.fid.android.domain.models.criteo.C38014p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.domain.interactors.criteo.g */
public interface C37666g extends C37679f<C37667a, C38014p> {

    /* renamed from: com.carrefour.fid.android.domain.interactors.criteo.g$a */
    public static final class C37667a {
        @C12579k

        /* renamed from: a */
        public final C38006h f94523a;

        /* renamed from: b */
        public final int f94524b;

        /* renamed from: c */
        public final int f94525c;

        /* renamed from: d */
        public final boolean f94526d;

        /* renamed from: e */
        public final boolean f94527e;

        public C37667a(@C12579k C38006h hVar, int i, int i2, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(hVar, "criteoParametersModel");
            this.f94523a = hVar;
            this.f94524b = i;
            this.f94525c = i2;
            this.f94526d = z;
            this.f94527e = z2;
        }

        /* renamed from: g */
        public static /* synthetic */ C37667a m154411g(C37667a aVar, C38006h hVar, int i, int i2, boolean z, boolean z2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                hVar = aVar.f94523a;
            }
            if ((i3 & 2) != 0) {
                i = aVar.f94524b;
            }
            int i4 = i;
            if ((i3 & 4) != 0) {
                i2 = aVar.f94525c;
            }
            int i5 = i2;
            if ((i3 & 8) != 0) {
                z = aVar.f94526d;
            }
            boolean z3 = z;
            if ((i3 & 16) != 0) {
                z2 = aVar.f94527e;
            }
            return aVar.mo114668f(hVar, i4, i5, z3, z2);
        }

        @C12579k
        /* renamed from: a */
        public final C38006h mo114662a() {
            return this.f94523a;
        }

        /* renamed from: b */
        public final int mo114663b() {
            return this.f94524b;
        }

        /* renamed from: c */
        public final int mo114664c() {
            return this.f94525c;
        }

        /* renamed from: d */
        public final boolean mo114665d() {
            return this.f94526d;
        }

        /* renamed from: e */
        public final boolean mo114666e() {
            return this.f94527e;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C37667a)) {
                return false;
            }
            C37667a aVar = (C37667a) obj;
            return Intrinsics.areEqual((Object) this.f94523a, (Object) aVar.f94523a) && this.f94524b == aVar.f94524b && this.f94525c == aVar.f94525c && this.f94526d == aVar.f94526d && this.f94527e == aVar.f94527e;
        }

        @C12579k
        /* renamed from: f */
        public final C37667a mo114668f(@C12579k C38006h hVar, int i, int i2, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(hVar, "criteoParametersModel");
            return new C37667a(hVar, i, i2, z, z2);
        }

        /* renamed from: h */
        public final int mo114669h() {
            return this.f94525c;
        }

        public int hashCode() {
            int hashCode = ((((this.f94523a.hashCode() * 31) + Integer.hashCode(this.f94524b)) * 31) + Integer.hashCode(this.f94525c)) * 31;
            boolean z = this.f94526d;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i = (hashCode + (z ? 1 : 0)) * 31;
            boolean z3 = this.f94527e;
            if (!z3) {
                z2 = z3;
            }
            return i + (z2 ? 1 : 0);
        }

        /* renamed from: i */
        public final boolean mo114671i() {
            return this.f94526d;
        }

        @C12579k
        /* renamed from: j */
        public final C38006h mo114672j() {
            return this.f94523a;
        }

        /* renamed from: k */
        public final int mo114673k() {
            return this.f94524b;
        }

        /* renamed from: l */
        public final boolean mo114674l() {
            return this.f94527e;
        }

        @C12579k
        public String toString() {
            C38006h hVar = this.f94523a;
            int i = this.f94524b;
            int i2 = this.f94525c;
            boolean z = this.f94526d;
            boolean z2 = this.f94527e;
            return "Params(criteoParametersModel=" + hVar + ", criteoProductsCount=" + i + ", criteoButterflyCount=" + i2 + ", criteoFlagshipEnabled=" + z + ", hasFidCard=" + z2 + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C37667a(C38006h hVar, int i, int i2, boolean z, boolean z2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(hVar, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 0 : i2, (i3 & 8) != 0 ? false : z, z2);
        }
    }
}
