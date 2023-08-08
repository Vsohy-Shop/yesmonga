package com.carrefour.fid.android.presentation.viewmodels.account.consent;

import androidx.compose.runtime.internal.C8567o;
import androidx.lifecycle.C19456p0;
import com.carrefour.fid.android.shared.base.BaseMVIViewModel;
import com.carrefour.fid.android.shared.base.C28505u;
import dagger.hilt.android.lifecycle.C10245a;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11395k;
import kotlin.DeprecationLevel;
import kotlin.coroutines.C11045c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10245a
@C11076d0(mo22515d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\n\u000b\fB\t\b\u0007¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/viewmodels/account/consent/AccountDataViewModel;", "Lcom/carrefour/fid/android/shared/base/BaseMVIViewModel;", "Lcom/carrefour/fid/android/presentation/viewmodels/account/consent/AccountDataViewModel$a;", "Lcom/carrefour/fid/android/presentation/viewmodels/account/consent/AccountDataViewModel$b;", "intent", "Lkotlin/d2;", "d0", "(Lcom/carrefour/fid/android/presentation/viewmodels/account/consent/AccountDataViewModel$b;Lkotlin/coroutines/c;)Ljava/lang/Object;", "<init>", "()V", "LocationPermissionStatus", "a", "b", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
public final class AccountDataViewModel extends BaseMVIViewModel<C25768a, C25770b> {

    /* renamed from: a */
    public static final int f63113a = 0;

    @C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/viewmodels/account/consent/AccountDataViewModel$LocationPermissionStatus;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public enum LocationPermissionStatus {
        GRANTED,
        DENIED,
        UNKNOWN
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.account.consent.AccountDataViewModel$a */
    public static final class C25768a implements C28505u.C28509d {
        @C12579k

        /* renamed from: d */
        public static final C25769a f63118d = new C25769a((DefaultConstructorMarker) null);

        /* renamed from: e */
        public static final int f63119e = 0;
        @C12579k

        /* renamed from: f */
        public static final C25768a f63120f = new C25768a(false, LocationPermissionStatus.UNKNOWN);

        /* renamed from: b */
        public final boolean f63121b;
        @C12579k

        /* renamed from: c */
        public final LocationPermissionStatus f63122c;

        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.account.consent.AccountDataViewModel$a$a */
        public static final class C25769a {
            public /* synthetic */ C25769a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @C12579k
            /* renamed from: a */
            public final C25768a mo74825a() {
                return C25768a.f63120f;
            }

            public C25769a() {
            }
        }

        public C25768a(boolean z, @C12579k LocationPermissionStatus locationPermissionStatus) {
            Intrinsics.checkNotNullParameter(locationPermissionStatus, "locationPermissionStatus");
            this.f63121b = z;
            this.f63122c = locationPermissionStatus;
        }

        /* renamed from: i */
        public static /* synthetic */ C25768a m110558i(C25768a aVar, boolean z, LocationPermissionStatus locationPermissionStatus, int i, Object obj) {
            if ((i & 1) != 0) {
                z = aVar.f63121b;
            }
            if ((i & 2) != 0) {
                locationPermissionStatus = aVar.f63122c;
            }
            return aVar.mo74820h(z, locationPermissionStatus);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C25768a)) {
                return false;
            }
            C25768a aVar = (C25768a) obj;
            return this.f63121b == aVar.f63121b && this.f63122c == aVar.f63122c;
        }

        /* renamed from: f */
        public final boolean mo74818f() {
            return this.f63121b;
        }

        @C12579k
        /* renamed from: g */
        public final LocationPermissionStatus mo74819g() {
            return this.f63122c;
        }

        @C12579k
        /* renamed from: h */
        public final C25768a mo74820h(boolean z, @C12579k LocationPermissionStatus locationPermissionStatus) {
            Intrinsics.checkNotNullParameter(locationPermissionStatus, "locationPermissionStatus");
            return new C25768a(z, locationPermissionStatus);
        }

        public int hashCode() {
            boolean z = this.f63121b;
            if (z) {
                z = true;
            }
            return ((z ? 1 : 0) * true) + this.f63122c.hashCode();
        }

        /* renamed from: j */
        public final boolean mo74822j() {
            return this.f63121b;
        }

        @C12579k
        /* renamed from: k */
        public final LocationPermissionStatus mo74823k() {
            return this.f63122c;
        }

        @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
        @C12579k
        public C28505u.C28509d reset() {
            return C28505u.C28509d.C28510a.m118428a(this);
        }

        @C12579k
        public String toString() {
            boolean z = this.f63121b;
            LocationPermissionStatus locationPermissionStatus = this.f63122c;
            return "UIState(hasAlreadyAskForPermission=" + z + ", locationPermissionStatus=" + locationPermissionStatus + ")";
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.account.consent.AccountDataViewModel$b */
    public interface C25770b extends C28505u.C28507b {

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.account.consent.AccountDataViewModel$b$a */
        public static final class C25771a implements C25770b {
            @C12579k

            /* renamed from: a */
            public static final C25771a f63123a = new C25771a();

            /* renamed from: b */
            public static final int f63124b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.account.consent.AccountDataViewModel$b$b */
        public static final class C25772b implements C25770b {
            @C12579k

            /* renamed from: a */
            public static final C25772b f63125a = new C25772b();

            /* renamed from: b */
            public static final int f63126b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.account.consent.AccountDataViewModel$b$c */
        public static final class C25773c implements C25770b {
            @C12579k

            /* renamed from: a */
            public static final C25773c f63127a = new C25773c();

            /* renamed from: b */
            public static final int f63128b = 0;
        }
    }

    @Inject
    public AccountDataViewModel() {
        super(C25768a.f63118d.mo74825a(), (CoroutineDispatcher) null, (C19456p0) null, 6, (DefaultConstructorMarker) null);
    }

    @C12580l
    /* renamed from: d0 */
    public Object processIntent(@C12579k C25770b bVar, @C12579k C11045c<? super C11079d2> cVar) {
        if (Intrinsics.areEqual((Object) bVar, (Object) C25770b.C25772b.f63125a)) {
            publishState(C25768a.m110558i((C25768a) getCurrentState(), false, LocationPermissionStatus.DENIED, 1, (Object) null));
        } else if (Intrinsics.areEqual((Object) bVar, (Object) C25770b.C25773c.f63127a)) {
            publishState(C25768a.m110558i((C25768a) getCurrentState(), false, LocationPermissionStatus.GRANTED, 1, (Object) null));
        } else if (Intrinsics.areEqual((Object) bVar, (Object) C25770b.C25771a.f63123a)) {
            publishState(C25768a.m110558i((C25768a) getCurrentState(), true, (LocationPermissionStatus) null, 2, (Object) null));
        }
        return C11079d2.f28267a;
    }
}
