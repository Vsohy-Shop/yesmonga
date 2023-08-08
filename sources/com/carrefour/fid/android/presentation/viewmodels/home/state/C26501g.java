package com.carrefour.fid.android.presentation.viewmodels.home.state;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.presentation.models.UserCardModel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.presentation.viewmodels.home.state.g */
public interface C26501g {

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.home.state.g$a */
    public static final class C26502a implements C26501g {

        /* renamed from: b */
        public static final int f64773b = 0;
        @C12579k

        /* renamed from: a */
        public final UserCardModel f64774a;

        public C26502a(@C12579k UserCardModel userCardModel) {
            Intrinsics.checkNotNullParameter(userCardModel, "userCardModel");
            this.f64774a = userCardModel;
        }

        /* renamed from: c */
        public static /* synthetic */ C26502a m112910c(C26502a aVar, UserCardModel userCardModel, int i, Object obj) {
            if ((i & 1) != 0) {
                userCardModel = aVar.f64774a;
            }
            return aVar.mo77062b(userCardModel);
        }

        @C12579k
        /* renamed from: a */
        public final UserCardModel mo77061a() {
            return this.f64774a;
        }

        @C12579k
        /* renamed from: b */
        public final C26502a mo77062b(@C12579k UserCardModel userCardModel) {
            Intrinsics.checkNotNullParameter(userCardModel, "userCardModel");
            return new C26502a(userCardModel);
        }

        @C12579k
        /* renamed from: d */
        public final UserCardModel mo77063d() {
            return this.f64774a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C26502a) && Intrinsics.areEqual((Object) this.f64774a, (Object) ((C26502a) obj).f64774a);
        }

        public int hashCode() {
            return this.f64774a.hashCode();
        }

        @C12579k
        public String toString() {
            UserCardModel userCardModel = this.f64774a;
            return "HasLoyaltyCard(userCardModel=" + userCardModel + ")";
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.home.state.g$b */
    public static final class C26503b implements C26501g {
        @C12579k

        /* renamed from: a */
        public static final C26503b f64775a = new C26503b();

        /* renamed from: b */
        public static final int f64776b = 0;
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.home.state.g$c */
    public static final class C26504c implements C26501g {
        @C12579k

        /* renamed from: a */
        public static final C26504c f64777a = new C26504c();

        /* renamed from: b */
        public static final int f64778b = 0;
    }
}
