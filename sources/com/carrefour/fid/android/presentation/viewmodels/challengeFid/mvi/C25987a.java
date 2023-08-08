package com.carrefour.fid.android.presentation.viewmodels.challengeFid.mvi;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.loyalty.core.constants.LoyaltyConstantsKt;
import com.carrefour.fid.android.shared.base.C28505u;
import kotlin.C11395k;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.challengeFid.mvi.a */
public final class C25987a {
    @C12579k

    /* renamed from: a */
    public static final C25987a f63511a = new C25987a();

    /* renamed from: b */
    public static final int f63512b = 0;

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.challengeFid.mvi.a$a */
    public static final class C25988a implements C28505u.C28509d {

        /* renamed from: c */
        public static final int f63513c = 0;
        @C12579k

        /* renamed from: b */
        public final String f63514b;

        public C25988a() {
            this((String) null, 1, (DefaultConstructorMarker) null);
        }

        /* renamed from: g */
        public static /* synthetic */ C25988a m111189g(C25988a aVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aVar.f63514b;
            }
            return aVar.mo75410f(str);
        }

        @C12579k
        /* renamed from: e */
        public final String mo75408e() {
            return this.f63514b;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C25988a) && Intrinsics.areEqual((Object) this.f63514b, (Object) ((C25988a) obj).f63514b);
        }

        @C12579k
        /* renamed from: f */
        public final C25988a mo75410f(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, LoyaltyConstantsKt.BUNDLE_KEY_LOYALTY_CARD);
            return new C25988a(str);
        }

        @C12579k
        /* renamed from: h */
        public final String mo75411h() {
            return this.f63514b;
        }

        public int hashCode() {
            return this.f63514b.hashCode();
        }

        @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
        @C12579k
        public C28505u.C28509d reset() {
            return C28505u.C28509d.C28510a.m118428a(this);
        }

        @C12579k
        public String toString() {
            String str = this.f63514b;
            return "UiState(loyaltyCardNumber=" + str + ")";
        }

        public C25988a(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, LoyaltyConstantsKt.BUNDLE_KEY_LOYALTY_CARD);
            this.f63514b = str;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C25988a(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new String() : str);
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.challengeFid.mvi.a$b */
    public interface C25989b extends C28505u.C28507b {

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.challengeFid.mvi.a$b$a */
        public static final class C25990a implements C25989b {
            @C12579k

            /* renamed from: a */
            public static final C25990a f63515a = new C25990a();

            /* renamed from: b */
            public static final int f63516b = 0;
        }
    }
}
