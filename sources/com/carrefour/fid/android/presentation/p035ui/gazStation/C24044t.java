package com.carrefour.fid.android.presentation.p035ui.gazStation;

import android.os.Bundle;
import androidx.compose.runtime.internal.C8567o;
import androidx.navigation.C19690a;
import androidx.navigation.C19693b0;
import com.carrefour.fid.android.R;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.gazStation.t */
public final class C24044t {
    @C12579k

    /* renamed from: a */
    public static final C24047c f60289a = new C24047c((DefaultConstructorMarker) null);

    /* renamed from: b */
    public static final int f60290b = 0;

    /* renamed from: com.carrefour.fid.android.presentation.ui.gazStation.t$a */
    public static final class C24045a implements C19693b0 {

        /* renamed from: a */
        public final boolean f60291a;

        /* renamed from: b */
        public final int f60292b;

        public C24045a() {
            this(false, 1, (DefaultConstructorMarker) null);
        }

        /* renamed from: c */
        public static /* synthetic */ C24045a m106089c(C24045a aVar, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = aVar.f60291a;
            }
            return aVar.mo70341b(z);
        }

        /* renamed from: a */
        public final boolean mo70340a() {
            return this.f60291a;
        }

        @C12579k
        /* renamed from: b */
        public final C24045a mo70341b(boolean z) {
            return new C24045a(z);
        }

        /* renamed from: d */
        public final boolean mo70342d() {
            return this.f60291a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C24045a) && this.f60291a == ((C24045a) obj).f60291a;
        }

        public int getActionId() {
            return this.f60292b;
        }

        @C12579k
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putBoolean("isAttachCard", this.f60291a);
            return bundle;
        }

        public int hashCode() {
            boolean z = this.f60291a;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        @C12579k
        public String toString() {
            boolean z = this.f60291a;
            return "ActionServiceStationsLandingPageFragmentToAttachCardFragment(isAttachCard=" + z + ")";
        }

        public C24045a(boolean z) {
            this.f60291a = z;
            this.f60292b = R.id.action_serviceStationsLandingPageFragment_to_attachCardFragment;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C24045a(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? true : z);
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.gazStation.t$b */
    public static final class C24046b implements C19693b0 {

        /* renamed from: a */
        public final boolean f60293a;

        /* renamed from: b */
        public final int f60294b;

        public C24046b() {
            this(false, 1, (DefaultConstructorMarker) null);
        }

        /* renamed from: c */
        public static /* synthetic */ C24046b m106093c(C24046b bVar, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = bVar.f60293a;
            }
            return bVar.mo70347b(z);
        }

        /* renamed from: a */
        public final boolean mo70346a() {
            return this.f60293a;
        }

        @C12579k
        /* renamed from: b */
        public final C24046b mo70347b(boolean z) {
            return new C24046b(z);
        }

        /* renamed from: d */
        public final boolean mo70348d() {
            return this.f60293a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C24046b) && this.f60293a == ((C24046b) obj).f60293a;
        }

        public int getActionId() {
            return this.f60294b;
        }

        @C12579k
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putBoolean("isCreateCard", this.f60293a);
            return bundle;
        }

        public int hashCode() {
            boolean z = this.f60293a;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        @C12579k
        public String toString() {
            boolean z = this.f60293a;
            return "ActionServiceStationsLandingPageFragmentToCreateCardFragment(isCreateCard=" + z + ")";
        }

        public C24046b(boolean z) {
            this.f60293a = z;
            this.f60294b = R.id.action_serviceStationsLandingPageFragment_to_createCardFragment;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C24046b(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? true : z);
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.gazStation.t$c */
    public static final class C24047c {
        public /* synthetic */ C24047c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ C19693b0 m106097b(C24047c cVar, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = true;
            }
            return cVar.mo70352a(z);
        }

        /* renamed from: d */
        public static /* synthetic */ C19693b0 m106098d(C24047c cVar, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = true;
            }
            return cVar.mo70353c(z);
        }

        @C12579k
        /* renamed from: a */
        public final C19693b0 mo70352a(boolean z) {
            return new C24045a(z);
        }

        @C12579k
        /* renamed from: c */
        public final C19693b0 mo70353c(boolean z) {
            return new C24046b(z);
        }

        @C12579k
        /* renamed from: e */
        public final C19693b0 mo70354e() {
            return new C19690a(R.id.action_serviceStationsLandingPageFragment_to_serviceStationsCameraFragment);
        }

        public C24047c() {
        }
    }
}
