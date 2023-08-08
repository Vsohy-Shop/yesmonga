package com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.bonus;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import androidx.navigation.C19693b0;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.cms.data.entities.DataPrimeCmsResponse;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.bonus.f */
public final class C24312f {
    @C12579k

    /* renamed from: a */
    public static final C24314b f60747a = new C24314b((DefaultConstructorMarker) null);

    /* renamed from: b */
    public static final int f60748b = 0;

    /* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.bonus.f$b */
    public static final class C24314b {
        public /* synthetic */ C24314b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ C19693b0 m106872b(C24314b bVar, DataPrimeCmsResponse[] dataPrimeCmsResponseArr, boolean z, int i, Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            return bVar.mo71134a(dataPrimeCmsResponseArr, z);
        }

        @C12579k
        /* renamed from: a */
        public final C19693b0 mo71134a(@C12579k DataPrimeCmsResponse[] dataPrimeCmsResponseArr, boolean z) {
            Intrinsics.checkNotNullParameter(dataPrimeCmsResponseArr, "primeList");
            return new C24313a(dataPrimeCmsResponseArr, z);
        }

        public C24314b() {
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.bonus.f$a */
    public static final class C24313a implements C19693b0 {
        @C12579k

        /* renamed from: a */
        public final DataPrimeCmsResponse[] f60749a;

        /* renamed from: b */
        public final boolean f60750b;

        /* renamed from: c */
        public final int f60751c;

        public C24313a(@C12579k DataPrimeCmsResponse[] dataPrimeCmsResponseArr, boolean z) {
            Intrinsics.checkNotNullParameter(dataPrimeCmsResponseArr, "primeList");
            this.f60749a = dataPrimeCmsResponseArr;
            this.f60750b = z;
            this.f60751c = R.id.action_loyaltyBonusListFragment_to_successCreateCardFragment;
        }

        /* renamed from: d */
        public static /* synthetic */ C24313a m106866d(C24313a aVar, DataPrimeCmsResponse[] dataPrimeCmsResponseArr, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                dataPrimeCmsResponseArr = aVar.f60749a;
            }
            if ((i & 2) != 0) {
                z = aVar.f60750b;
            }
            return aVar.mo71128c(dataPrimeCmsResponseArr, z);
        }

        @C12579k
        /* renamed from: a */
        public final DataPrimeCmsResponse[] mo71126a() {
            return this.f60749a;
        }

        /* renamed from: b */
        public final boolean mo71127b() {
            return this.f60750b;
        }

        @C12579k
        /* renamed from: c */
        public final C24313a mo71128c(@C12579k DataPrimeCmsResponse[] dataPrimeCmsResponseArr, boolean z) {
            Intrinsics.checkNotNullParameter(dataPrimeCmsResponseArr, "primeList");
            return new C24313a(dataPrimeCmsResponseArr, z);
        }

        @C12579k
        /* renamed from: e */
        public final DataPrimeCmsResponse[] mo71129e() {
            return this.f60749a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C24313a)) {
                return false;
            }
            C24313a aVar = (C24313a) obj;
            return Intrinsics.areEqual((Object) this.f60749a, (Object) aVar.f60749a) && this.f60750b == aVar.f60750b;
        }

        /* renamed from: f */
        public final boolean mo71131f() {
            return this.f60750b;
        }

        public int getActionId() {
            return this.f60751c;
        }

        @C12579k
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putBoolean("isFromActiveFid", this.f60750b);
            bundle.putParcelableArray("primeList", (Parcelable[]) this.f60749a);
            return bundle;
        }

        public int hashCode() {
            int hashCode = Arrays.hashCode(this.f60749a) * 31;
            boolean z = this.f60750b;
            if (z) {
                z = true;
            }
            return hashCode + (z ? 1 : 0);
        }

        @C12579k
        public String toString() {
            String arrays = Arrays.toString(this.f60749a);
            boolean z = this.f60750b;
            return "ActionLoyaltyBonusListFragmentToSuccessCreateCardFragment(primeList=" + arrays + ", isFromActiveFid=" + z + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C24313a(DataPrimeCmsResponse[] dataPrimeCmsResponseArr, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(dataPrimeCmsResponseArr, (i & 2) != 0 ? false : z);
        }
    }
}
