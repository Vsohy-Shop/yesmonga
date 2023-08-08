package com.carrefour.fid.android.presentation.p035ui.store;

import android.os.Bundle;
import androidx.compose.runtime.internal.C8567o;
import androidx.navigation.C19693b0;
import com.carrefour.fid.android.R;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.store.a */
public final class C25749a {
    @C12579k

    /* renamed from: a */
    public static final C25751b f63081a = new C25751b((DefaultConstructorMarker) null);

    /* renamed from: b */
    public static final int f63082b = 0;

    /* renamed from: com.carrefour.fid.android.presentation.ui.store.a$a */
    public static final class C25750a implements C19693b0 {

        /* renamed from: a */
        public final int f63083a;

        /* renamed from: b */
        public final int f63084b;

        public C25750a() {
            this(0, 1, (DefaultConstructorMarker) null);
        }

        /* renamed from: c */
        public static /* synthetic */ C25750a m110505c(C25750a aVar, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = aVar.f63083a;
            }
            return aVar.mo74774b(i);
        }

        /* renamed from: a */
        public final int mo74773a() {
            return this.f63083a;
        }

        @C12579k
        /* renamed from: b */
        public final C25750a mo74774b(int i) {
            return new C25750a(i);
        }

        /* renamed from: d */
        public final int mo74775d() {
            return this.f63083a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C25750a) && this.f63083a == ((C25750a) obj).f63083a;
        }

        public int getActionId() {
            return this.f63084b;
        }

        @C12579k
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putInt("sourceGraphId", this.f63083a);
            return bundle;
        }

        public int hashCode() {
            return Integer.hashCode(this.f63083a);
        }

        @C12579k
        public String toString() {
            int i = this.f63083a;
            return "ActionBaseStoreFragmentToFacilitiesFragment(sourceGraphId=" + i + ")";
        }

        public C25750a(int i) {
            this.f63083a = i;
            this.f63084b = R.id.action_baseStoreFragment_to_facilitiesFragment;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C25750a(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? R.id.store_graph : i);
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.store.a$b */
    public static final class C25751b {
        public /* synthetic */ C25751b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ C19693b0 m110509b(C25751b bVar, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = R.id.store_graph;
            }
            return bVar.mo74779a(i);
        }

        @C12579k
        /* renamed from: a */
        public final C19693b0 mo74779a(int i) {
            return new C25750a(i);
        }

        public C25751b() {
        }
    }
}
