package com.carrefour.fid.android.presentation.viewmodels.home.state;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.presentation.models.CurrentCampaignsModel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.presentation.viewmodels.home.state.d */
public interface C26491d {

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.home.state.d$a */
    public static final class C26492a implements C26491d {

        /* renamed from: b */
        public static final int f64758b = 0;
        @C12579k

        /* renamed from: a */
        public final CurrentCampaignsModel f64759a;

        public C26492a(@C12579k CurrentCampaignsModel currentCampaignsModel) {
            Intrinsics.checkNotNullParameter(currentCampaignsModel, "gazStationsModel");
            this.f64759a = currentCampaignsModel;
        }

        /* renamed from: c */
        public static /* synthetic */ C26492a m112896c(C26492a aVar, CurrentCampaignsModel currentCampaignsModel, int i, Object obj) {
            if ((i & 1) != 0) {
                currentCampaignsModel = aVar.f64759a;
            }
            return aVar.mo77042b(currentCampaignsModel);
        }

        @C12579k
        /* renamed from: a */
        public final CurrentCampaignsModel mo77041a() {
            return this.f64759a;
        }

        @C12579k
        /* renamed from: b */
        public final C26492a mo77042b(@C12579k CurrentCampaignsModel currentCampaignsModel) {
            Intrinsics.checkNotNullParameter(currentCampaignsModel, "gazStationsModel");
            return new C26492a(currentCampaignsModel);
        }

        @C12579k
        /* renamed from: d */
        public final CurrentCampaignsModel mo77043d() {
            return this.f64759a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C26492a) && Intrinsics.areEqual((Object) this.f64759a, (Object) ((C26492a) obj).f64759a);
        }

        public int hashCode() {
            return this.f64759a.hashCode();
        }

        @C12579k
        public String toString() {
            CurrentCampaignsModel currentCampaignsModel = this.f64759a;
            return "Available(gazStationsModel=" + currentCampaignsModel + ")";
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.home.state.d$b */
    public static final class C26493b implements C26491d {
        @C12579k

        /* renamed from: a */
        public static final C26493b f64760a = new C26493b();

        /* renamed from: b */
        public static final int f64761b = 0;
    }
}
