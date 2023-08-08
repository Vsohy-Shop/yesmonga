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
/* renamed from: com.carrefour.fid.android.presentation.ui.gazStation.k */
public final class C24032k {
    @C12579k

    /* renamed from: a */
    public static final C24034b f60275a = new C24034b((DefaultConstructorMarker) null);

    /* renamed from: b */
    public static final int f60276b = 0;

    /* renamed from: com.carrefour.fid.android.presentation.ui.gazStation.k$a */
    public static final class C24033a implements C19693b0 {
        @C12580l

        /* renamed from: a */
        public final String f60277a;

        /* renamed from: b */
        public final int f60278b;

        public C24033a() {
            this((String) null, 1, (DefaultConstructorMarker) null);
        }

        /* renamed from: c */
        public static /* synthetic */ C24033a m106068c(C24033a aVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aVar.f60277a;
            }
            return aVar.mo70316b(str);
        }

        @C12580l
        /* renamed from: a */
        public final String mo70315a() {
            return this.f60277a;
        }

        @C12579k
        /* renamed from: b */
        public final C24033a mo70316b(@C12580l String str) {
            return new C24033a(str);
        }

        @C12580l
        /* renamed from: d */
        public final String mo70317d() {
            return this.f60277a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C24033a) && Intrinsics.areEqual((Object) this.f60277a, (Object) ((C24033a) obj).f60277a);
        }

        public int getActionId() {
            return this.f60278b;
        }

        @C12579k
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putString("pictureMediaPath", this.f60277a);
            return bundle;
        }

        public int hashCode() {
            String str = this.f60277a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @C12579k
        public String toString() {
            String str = this.f60277a;
            return "ActionServiceStationsCameraFragmentToServiceStationsResultFragment(pictureMediaPath=" + str + ")";
        }

        public C24033a(@C12580l String str) {
            this.f60277a = str;
            this.f60278b = R.id.action_serviceStationsCameraFragment_to_serviceStationsResultFragment;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C24033a(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.gazStation.k$b */
    public static final class C24034b {
        public /* synthetic */ C24034b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ C19693b0 m106072b(C24034b bVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = null;
            }
            return bVar.mo70321a(str);
        }

        @C12579k
        /* renamed from: a */
        public final C19693b0 mo70321a(@C12580l String str) {
            return new C24033a(str);
        }

        public C24034b() {
        }
    }
}
