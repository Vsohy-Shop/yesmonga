package com.carrefour.fid.android.presentation.p035ui.gazStation;

import android.os.Bundle;
import androidx.compose.runtime.internal.C8567o;
import androidx.navigation.C19693b0;
import com.carrefour.fid.android.R;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.gazStation.b */
public final class C24020b {
    @C12579k

    /* renamed from: a */
    public static final C24023c f60245a = new C24023c((DefaultConstructorMarker) null);

    /* renamed from: b */
    public static final int f60246b = 0;

    /* renamed from: com.carrefour.fid.android.presentation.ui.gazStation.b$a */
    public static final class C24021a implements C19693b0 {
        @C12579k

        /* renamed from: a */
        public final String f60247a;
        @C12579k

        /* renamed from: b */
        public final String f60248b;

        /* renamed from: c */
        public final int f60249c = R.id.action_baseServiceStationsFragment_to_serviceStationsLandingPageFragment;

        public C24021a(@C12579k String str, @C12579k String str2) {
            Intrinsics.checkNotNullParameter(str, "startDate");
            Intrinsics.checkNotNullParameter(str2, "endDate");
            this.f60247a = str;
            this.f60248b = str2;
        }

        /* renamed from: d */
        public static /* synthetic */ C24021a m106054d(C24021a aVar, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aVar.f60247a;
            }
            if ((i & 2) != 0) {
                str2 = aVar.f60248b;
            }
            return aVar.mo70286c(str, str2);
        }

        @C12579k
        /* renamed from: a */
        public final String mo70284a() {
            return this.f60247a;
        }

        @C12579k
        /* renamed from: b */
        public final String mo70285b() {
            return this.f60248b;
        }

        @C12579k
        /* renamed from: c */
        public final C24021a mo70286c(@C12579k String str, @C12579k String str2) {
            Intrinsics.checkNotNullParameter(str, "startDate");
            Intrinsics.checkNotNullParameter(str2, "endDate");
            return new C24021a(str, str2);
        }

        @C12579k
        /* renamed from: e */
        public final String mo70287e() {
            return this.f60248b;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C24021a)) {
                return false;
            }
            C24021a aVar = (C24021a) obj;
            return Intrinsics.areEqual((Object) this.f60247a, (Object) aVar.f60247a) && Intrinsics.areEqual((Object) this.f60248b, (Object) aVar.f60248b);
        }

        @C12579k
        /* renamed from: f */
        public final String mo70289f() {
            return this.f60247a;
        }

        public int getActionId() {
            return this.f60249c;
        }

        @C12579k
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putString("startDate", this.f60247a);
            bundle.putString("endDate", this.f60248b);
            return bundle;
        }

        public int hashCode() {
            return (this.f60247a.hashCode() * 31) + this.f60248b.hashCode();
        }

        @C12579k
        public String toString() {
            String str = this.f60247a;
            String str2 = this.f60248b;
            return "ActionBaseServiceStationsFragmentToServiceStationsLandingPageFragment(startDate=" + str + ", endDate=" + str2 + ")";
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.gazStation.b$b */
    public static final class C24022b implements C19693b0 {
        @C12580l

        /* renamed from: a */
        public final String f60250a;

        /* renamed from: b */
        public final int f60251b;

        public C24022b() {
            this((String) null, 1, (DefaultConstructorMarker) null);
        }

        /* renamed from: c */
        public static /* synthetic */ C24022b m106060c(C24022b bVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = bVar.f60250a;
            }
            return bVar.mo70293b(str);
        }

        @C12580l
        /* renamed from: a */
        public final String mo70292a() {
            return this.f60250a;
        }

        @C12579k
        /* renamed from: b */
        public final C24022b mo70293b(@C12580l String str) {
            return new C24022b(str);
        }

        @C12580l
        /* renamed from: d */
        public final String mo70294d() {
            return this.f60250a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C24022b) && Intrinsics.areEqual((Object) this.f60250a, (Object) ((C24022b) obj).f60250a);
        }

        public int getActionId() {
            return this.f60251b;
        }

        @C12579k
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putString("pictureMediaPath", this.f60250a);
            return bundle;
        }

        public int hashCode() {
            String str = this.f60250a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @C12579k
        public String toString() {
            String str = this.f60250a;
            return "ActionBaseServiceStationsFragmentToServiceStationsResultFragment(pictureMediaPath=" + str + ")";
        }

        public C24022b(@C12580l String str) {
            this.f60250a = str;
            this.f60251b = R.id.action_baseServiceStationsFragment_to_serviceStationsResultFragment;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C24022b(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.gazStation.b$c */
    public static final class C24023c {
        public /* synthetic */ C24023c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: c */
        public static /* synthetic */ C19693b0 m106064c(C24023c cVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = null;
            }
            return cVar.mo70299b(str);
        }

        @C12579k
        /* renamed from: a */
        public final C19693b0 mo70298a(@C12579k String str, @C12579k String str2) {
            Intrinsics.checkNotNullParameter(str, "startDate");
            Intrinsics.checkNotNullParameter(str2, "endDate");
            return new C24021a(str, str2);
        }

        @C12579k
        /* renamed from: b */
        public final C19693b0 mo70299b(@C12580l String str) {
            return new C24022b(str);
        }

        public C24023c() {
        }
    }
}
