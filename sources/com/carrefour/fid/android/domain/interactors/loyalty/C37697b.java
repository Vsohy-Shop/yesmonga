package com.carrefour.fid.android.domain.interactors.loyalty;

import com.carrefour.fid.android.domain.interactors.C37679f;
import com.carrefour.fid.android.domain.models.loyalty.C38045b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.domain.interactors.loyalty.b */
public interface C37697b extends C37679f<C37698a, C38045b> {

    /* renamed from: com.carrefour.fid.android.domain.interactors.loyalty.b$a */
    public static final class C37698a {

        /* renamed from: a */
        public final boolean f94561a;

        public C37698a() {
            this(false, 1, (DefaultConstructorMarker) null);
        }

        /* renamed from: c */
        public static /* synthetic */ C37698a m154483c(C37698a aVar, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = aVar.f94561a;
            }
            return aVar.mo114734b(z);
        }

        /* renamed from: a */
        public final boolean mo114733a() {
            return this.f94561a;
        }

        @C12579k
        /* renamed from: b */
        public final C37698a mo114734b(boolean z) {
            return new C37698a(z);
        }

        /* renamed from: d */
        public final boolean mo114735d() {
            return this.f94561a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C37698a) && this.f94561a == ((C37698a) obj).f94561a;
        }

        public int hashCode() {
            boolean z = this.f94561a;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        @C12579k
        public String toString() {
            boolean z = this.f94561a;
            return "Params(isSecuredCardRequired=" + z + ")";
        }

        public C37698a(boolean z) {
            this.f94561a = z;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C37698a(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z);
        }
    }
}
