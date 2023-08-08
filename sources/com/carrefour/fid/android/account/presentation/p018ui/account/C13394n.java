package com.carrefour.fid.android.account.presentation.p018ui.account;

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
/* renamed from: com.carrefour.fid.android.account.presentation.ui.account.n */
public final class C13394n {
    @C12579k

    /* renamed from: a */
    public static final C13396b f32804a = new C13396b((DefaultConstructorMarker) null);

    /* renamed from: b */
    public static final int f32805b = 0;

    /* renamed from: com.carrefour.fid.android.account.presentation.ui.account.n$b */
    public static final class C13396b {
        public /* synthetic */ C13396b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ C19693b0 m57768b(C13396b bVar, NameLastView nameLastView, boolean z, String str, int i, Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            if ((i & 4) != 0) {
                str = null;
            }
            return bVar.mo31787a(nameLastView, z, str);
        }

        @C12579k
        /* renamed from: a */
        public final C19693b0 mo31787a(@C12579k NameLastView nameLastView, boolean z, @C12580l String str) {
            Intrinsics.checkNotNullParameter(nameLastView, "lastView");
            return new C13395a(nameLastView, z, str);
        }

        public C13396b() {
        }
    }

    /* renamed from: com.carrefour.fid.android.account.presentation.ui.account.n$a */
    public static final class C13395a implements C19693b0 {
        @C12579k

        /* renamed from: a */
        public final NameLastView f32806a;

        /* renamed from: b */
        public final boolean f32807b;
        @C12580l

        /* renamed from: c */
        public final String f32808c;

        /* renamed from: d */
        public final int f32809d;

        public C13395a(@C12579k NameLastView nameLastView, boolean z, @C12580l String str) {
            Intrinsics.checkNotNullParameter(nameLastView, "lastView");
            this.f32806a = nameLastView;
            this.f32807b = z;
            this.f32808c = str;
            this.f32809d = C13144b.C13154j.action_updateUserEmailFragment_to_accountUpdateSuccessFragment;
        }

        /* renamed from: e */
        public static /* synthetic */ C13395a m57760e(C13395a aVar, NameLastView nameLastView, boolean z, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                nameLastView = aVar.f32806a;
            }
            if ((i & 2) != 0) {
                z = aVar.f32807b;
            }
            if ((i & 4) != 0) {
                str = aVar.f32808c;
            }
            return aVar.mo31780d(nameLastView, z, str);
        }

        @C12579k
        /* renamed from: a */
        public final NameLastView mo31777a() {
            return this.f32806a;
        }

        /* renamed from: b */
        public final boolean mo31778b() {
            return this.f32807b;
        }

        @C12580l
        /* renamed from: c */
        public final String mo31779c() {
            return this.f32808c;
        }

        @C12579k
        /* renamed from: d */
        public final C13395a mo31780d(@C12579k NameLastView nameLastView, boolean z, @C12580l String str) {
            Intrinsics.checkNotNullParameter(nameLastView, "lastView");
            return new C13395a(nameLastView, z, str);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C13395a)) {
                return false;
            }
            C13395a aVar = (C13395a) obj;
            return this.f32806a == aVar.f32806a && this.f32807b == aVar.f32807b && Intrinsics.areEqual((Object) this.f32808c, (Object) aVar.f32808c);
        }

        @C12579k
        /* renamed from: f */
        public final NameLastView mo31782f() {
            return this.f32806a;
        }

        @C12580l
        /* renamed from: g */
        public final String mo31783g() {
            return this.f32808c;
        }

        public int getActionId() {
            return this.f32809d;
        }

        @C12579k
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putBoolean("isSuccessLogin", this.f32807b);
            Class<NameLastView> cls = NameLastView.class;
            if (Parcelable.class.isAssignableFrom(cls)) {
                NameLastView nameLastView = this.f32806a;
                Intrinsics.checkNotNull(nameLastView, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("lastView", (Parcelable) nameLastView);
            } else if (Serializable.class.isAssignableFrom(cls)) {
                NameLastView nameLastView2 = this.f32806a;
                Intrinsics.checkNotNull(nameLastView2, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("lastView", nameLastView2);
            } else {
                String name = cls.getName();
                throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
            }
            bundle.putString(FirebaseAnalytics.C32531a.f78899m, this.f32808c);
            return bundle;
        }

        /* renamed from: h */
        public final boolean mo31784h() {
            return this.f32807b;
        }

        public int hashCode() {
            int hashCode = this.f32806a.hashCode() * 31;
            boolean z = this.f32807b;
            if (z) {
                z = true;
            }
            int i = (hashCode + (z ? 1 : 0)) * 31;
            String str = this.f32808c;
            return i + (str == null ? 0 : str.hashCode());
        }

        @C12579k
        public String toString() {
            NameLastView nameLastView = this.f32806a;
            boolean z = this.f32807b;
            String str = this.f32808c;
            return "ActionUpdateUserEmailFragmentToAccountUpdateSuccessFragment(lastView=" + nameLastView + ", isSuccessLogin=" + z + ", login=" + str + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C13395a(NameLastView nameLastView, boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(nameLastView, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : str);
        }
    }
}
