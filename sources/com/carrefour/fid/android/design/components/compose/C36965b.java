package com.carrefour.fid.android.design.components.compose;

import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.design.components.compose.b */
public interface C36965b {

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.design.components.compose.b$a */
    public static final class C36966a implements C36965b {

        /* renamed from: c */
        public static final int f92346c = 0;

        /* renamed from: a */
        public final int f92347a;
        @C12579k

        /* renamed from: b */
        public final String f92348b;

        public C36966a(int i, @C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "digit");
            this.f92347a = i;
            this.f92348b = str;
        }

        /* renamed from: d */
        public static /* synthetic */ C36966a m151658d(C36966a aVar, int i, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = aVar.f92347a;
            }
            if ((i2 & 2) != 0) {
                str = aVar.f92348b;
            }
            return aVar.mo112322c(i, str);
        }

        /* renamed from: a */
        public final int mo112320a() {
            return this.f92347a;
        }

        @C12579k
        /* renamed from: b */
        public final String mo112321b() {
            return this.f92348b;
        }

        @C12579k
        /* renamed from: c */
        public final C36966a mo112322c(int i, @C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "digit");
            return new C36966a(i, str);
        }

        @C12579k
        /* renamed from: e */
        public final String mo112323e() {
            return this.f92348b;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C36966a)) {
                return false;
            }
            C36966a aVar = (C36966a) obj;
            return this.f92347a == aVar.f92347a && Intrinsics.areEqual((Object) this.f92348b, (Object) aVar.f92348b);
        }

        /* renamed from: f */
        public final int mo112325f() {
            return this.f92347a;
        }

        public int hashCode() {
            return (Integer.hashCode(this.f92347a) * 31) + this.f92348b.hashCode();
        }

        @C12579k
        public String toString() {
            int i = this.f92347a;
            String str = this.f92348b;
            return "OnDigitListValueChanged(index=" + i + ", digit=" + str + ")";
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.design.components.compose.b$b */
    public static final class C36967b implements C36965b {

        /* renamed from: c */
        public static final int f92349c = 0;

        /* renamed from: a */
        public final int f92350a;

        /* renamed from: b */
        public final boolean f92351b;

        public C36967b(int i, boolean z) {
            this.f92350a = i;
            this.f92351b = z;
        }

        /* renamed from: d */
        public static /* synthetic */ C36967b m151664d(C36967b bVar, int i, boolean z, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = bVar.f92350a;
            }
            if ((i2 & 2) != 0) {
                z = bVar.f92351b;
            }
            return bVar.mo112330c(i, z);
        }

        /* renamed from: a */
        public final int mo112328a() {
            return this.f92350a;
        }

        /* renamed from: b */
        public final boolean mo112329b() {
            return this.f92351b;
        }

        @C12579k
        /* renamed from: c */
        public final C36967b mo112330c(int i, boolean z) {
            return new C36967b(i, z);
        }

        /* renamed from: e */
        public final int mo112331e() {
            return this.f92350a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C36967b)) {
                return false;
            }
            C36967b bVar = (C36967b) obj;
            return this.f92350a == bVar.f92350a && this.f92351b == bVar.f92351b;
        }

        /* renamed from: f */
        public final boolean mo112333f() {
            return this.f92351b;
        }

        public int hashCode() {
            int hashCode = Integer.hashCode(this.f92350a) * 31;
            boolean z = this.f92351b;
            if (z) {
                z = true;
            }
            return hashCode + (z ? 1 : 0);
        }

        @C12579k
        public String toString() {
            int i = this.f92350a;
            boolean z = this.f92351b;
            return "OnFocusChanged(index=" + i + ", isFocus=" + z + ")";
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.design.components.compose.b$c */
    public static final class C36968c implements C36965b {
        @C12579k

        /* renamed from: a */
        public static final C36968c f92352a = new C36968c();

        /* renamed from: b */
        public static final int f92353b = 0;
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.design.components.compose.b$d */
    public static final class C36969d implements C36965b {

        /* renamed from: b */
        public static final int f92354b = 0;

        /* renamed from: a */
        public final boolean f92355a;

        public C36969d(boolean z) {
            this.f92355a = z;
        }

        /* renamed from: c */
        public static /* synthetic */ C36969d m151670c(C36969d dVar, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = dVar.f92355a;
            }
            return dVar.mo112337b(z);
        }

        /* renamed from: a */
        public final boolean mo112336a() {
            return this.f92355a;
        }

        @C12579k
        /* renamed from: b */
        public final C36969d mo112337b(boolean z) {
            return new C36969d(z);
        }

        /* renamed from: d */
        public final boolean mo112338d() {
            return this.f92355a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C36969d) && this.f92355a == ((C36969d) obj).f92355a;
        }

        public int hashCode() {
            boolean z = this.f92355a;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        @C12579k
        public String toString() {
            boolean z = this.f92355a;
            return "OnPasswordVisibilityStateChanged(isPasswordVisible=" + z + ")";
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.design.components.compose.b$e */
    public static final class C36970e implements C36965b {

        /* renamed from: b */
        public static final int f92356b = 0;
        @C12579k

        /* renamed from: a */
        public final String f92357a;

        public C36970e(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "digitCode");
            this.f92357a = str;
        }

        /* renamed from: c */
        public static /* synthetic */ C36970e m151674c(C36970e eVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = eVar.f92357a;
            }
            return eVar.mo112343b(str);
        }

        @C12579k
        /* renamed from: a */
        public final String mo112342a() {
            return this.f92357a;
        }

        @C12579k
        /* renamed from: b */
        public final C36970e mo112343b(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "digitCode");
            return new C36970e(str);
        }

        @C12579k
        /* renamed from: d */
        public final String mo112344d() {
            return this.f92357a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C36970e) && Intrinsics.areEqual((Object) this.f92357a, (Object) ((C36970e) obj).f92357a);
        }

        public int hashCode() {
            return this.f92357a.hashCode();
        }

        @C12579k
        public String toString() {
            String str = this.f92357a;
            return "OnValidateButtonClicked(digitCode=" + str + ")";
        }
    }
}
