package com.carrefour.fid.android.account.presentation.p018ui.forgot;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import androidx.navigation.C19693b0;
import com.carrefour.fid.android.account.C13144b;
import com.carrefour.fid.android.account.presentation.models.NameLastView;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.account.presentation.ui.forgot.a */
public final class C13518a {
    @C12579k

    /* renamed from: a */
    public static final C13520b f33001a = new C13520b((DefaultConstructorMarker) null);

    /* renamed from: b */
    public static final int f33002b = 0;

    /* renamed from: com.carrefour.fid.android.account.presentation.ui.forgot.a$b */
    public static final class C13520b {
        public /* synthetic */ C13520b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ C19693b0 m58045b(C13520b bVar, NameLastView nameLastView, boolean z, String str, int i, Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            if ((i & 4) != 0) {
                str = null;
            }
            return bVar.mo32100a(nameLastView, z, str);
        }

        @C12579k
        /* renamed from: a */
        public final C19693b0 mo32100a(@C12579k NameLastView nameLastView, boolean z, @C12580l String str) {
            Intrinsics.checkNotNullParameter(nameLastView, "lastView");
            return new C13519a(nameLastView, z, str);
        }

        public C13520b() {
        }
    }

    /* renamed from: com.carrefour.fid.android.account.presentation.ui.forgot.a$a */
    public static final class C13519a implements C19693b0 {
        @C12579k

        /* renamed from: a */
        public final NameLastView f33003a;

        /* renamed from: b */
        public final boolean f33004b;
        @C12580l

        /* renamed from: c */
        public final String f33005c;

        /* renamed from: d */
        public final int f33006d;

        public C13519a(@C12579k NameLastView nameLastView, boolean z, @C12580l String str) {
            Intrinsics.checkNotNullParameter(nameLastView, "lastView");
            this.f33003a = nameLastView;
            this.f33004b = z;
            this.f33005c = str;
            this.f33006d = C13144b.C13154j.action_forgotPasswordFragment_to_accountUpdateSuccessFragment;
        }

        /* renamed from: e */
        public static /* synthetic */ C13519a m58037e(C13519a aVar, NameLastView nameLastView, boolean z, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                nameLastView = aVar.f33003a;
            }
            if ((i & 2) != 0) {
                z = aVar.f33004b;
            }
            if ((i & 4) != 0) {
                str = aVar.f33005c;
            }
            return aVar.mo32093d(nameLastView, z, str);
        }

        @C12579k
        /* renamed from: a */
        public final NameLastView mo32090a() {
            return this.f33003a;
        }

        /* renamed from: b */
        public final boolean mo32091b() {
            return this.f33004b;
        }

        @C12580l
        /* renamed from: c */
        public final String mo32092c() {
            return this.f33005c;
        }

        @C12579k
        /* renamed from: d */
        public final C13519a mo32093d(@C12579k NameLastView nameLastView, boolean z, @C12580l String str) {
            Intrinsics.checkNotNullParameter(nameLastView, "lastView");
            return new C13519a(nameLastView, z, str);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C13519a)) {
                return false;
            }
            C13519a aVar = (C13519a) obj;
            return this.f33003a == aVar.f33003a && this.f33004b == aVar.f33004b && Intrinsics.areEqual((Object) this.f33005c, (Object) aVar.f33005c);
        }

        @C12579k
        /* renamed from: f */
        public final NameLastView mo32095f() {
            return this.f33003a;
        }

        @C12580l
        /* renamed from: g */
        public final String mo32096g() {
            return this.f33005c;
        }

        public int getActionId() {
            return this.f33006d;
        }

        @C12579k
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putBoolean("isSuccessLogin", this.f33004b);
            Class<NameLastView> cls = NameLastView.class;
            if (Parcelable.class.isAssignableFrom(cls)) {
                NameLastView nameLastView = this.f33003a;
                Intrinsics.checkNotNull(nameLastView, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("lastView", (Parcelable) nameLastView);
            } else if (Serializable.class.isAssignableFrom(cls)) {
                NameLastView nameLastView2 = this.f33003a;
                Intrinsics.checkNotNull(nameLastView2, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("lastView", nameLastView2);
            } else {
                String name = cls.getName();
                throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
            }
            bundle.putString(FirebaseAnalytics.C32531a.f78899m, this.f33005c);
            return bundle;
        }

        /* renamed from: h */
        public final boolean mo32097h() {
            return this.f33004b;
        }

        public int hashCode() {
            int hashCode = this.f33003a.hashCode() * 31;
            boolean z = this.f33004b;
            if (z) {
                z = true;
            }
            int i = (hashCode + (z ? 1 : 0)) * 31;
            String str = this.f33005c;
            return i + (str == null ? 0 : str.hashCode());
        }

        @C12579k
        public String toString() {
            NameLastView nameLastView = this.f33003a;
            boolean z = this.f33004b;
            String str = this.f33005c;
            return "ActionForgotPasswordFragmentToAccountUpdateSuccessFragment(lastView=" + nameLastView + ", isSuccessLogin=" + z + ", login=" + str + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C13519a(NameLastView nameLastView, boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(nameLastView, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : str);
        }
    }
}
