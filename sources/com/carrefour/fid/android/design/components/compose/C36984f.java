package com.carrefour.fid.android.design.components.compose;

import androidx.compose.runtime.internal.C8567o;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.design.components.compose.f */
public interface C36984f {

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.design.components.compose.f$a */
    public static final class C36985a implements C36984f {

        /* renamed from: e */
        public static final int f92380e = 0;
        @C12579k

        /* renamed from: a */
        public final String f92381a;
        @C12579k

        /* renamed from: b */
        public final String f92382b;
        @C12579k

        /* renamed from: c */
        public final String f92383c;
        @C12579k

        /* renamed from: d */
        public final C11289a<C11079d2> f92384d;

        public C36985a(@C12579k String str, @C12579k String str2, @C12579k String str3, @C12579k C11289a<C11079d2> aVar) {
            Intrinsics.checkNotNullParameter(str, "title");
            Intrinsics.checkNotNullParameter(str2, "message");
            Intrinsics.checkNotNullParameter(str3, "confirmationText");
            Intrinsics.checkNotNullParameter(aVar, "onConfirmationClick");
            this.f92381a = str;
            this.f92382b = str2;
            this.f92383c = str3;
            this.f92384d = aVar;
        }

        /* renamed from: f */
        public static /* synthetic */ C36985a m151700f(C36985a aVar, String str, String str2, String str3, C11289a<C11079d2> aVar2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aVar.f92381a;
            }
            if ((i & 2) != 0) {
                str2 = aVar.f92382b;
            }
            if ((i & 4) != 0) {
                str3 = aVar.f92383c;
            }
            if ((i & 8) != 0) {
                aVar2 = aVar.f92384d;
            }
            return aVar.mo112384e(str, str2, str3, aVar2);
        }

        @C12579k
        /* renamed from: a */
        public final String mo112380a() {
            return this.f92381a;
        }

        @C12579k
        /* renamed from: b */
        public final String mo112381b() {
            return this.f92382b;
        }

        @C12579k
        /* renamed from: c */
        public final String mo112382c() {
            return this.f92383c;
        }

        @C12579k
        /* renamed from: d */
        public final C11289a<C11079d2> mo112383d() {
            return this.f92384d;
        }

        @C12579k
        /* renamed from: e */
        public final C36985a mo112384e(@C12579k String str, @C12579k String str2, @C12579k String str3, @C12579k C11289a<C11079d2> aVar) {
            Intrinsics.checkNotNullParameter(str, "title");
            Intrinsics.checkNotNullParameter(str2, "message");
            Intrinsics.checkNotNullParameter(str3, "confirmationText");
            Intrinsics.checkNotNullParameter(aVar, "onConfirmationClick");
            return new C36985a(str, str2, str3, aVar);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C36985a)) {
                return false;
            }
            C36985a aVar = (C36985a) obj;
            return Intrinsics.areEqual((Object) this.f92381a, (Object) aVar.f92381a) && Intrinsics.areEqual((Object) this.f92382b, (Object) aVar.f92382b) && Intrinsics.areEqual((Object) this.f92383c, (Object) aVar.f92383c) && Intrinsics.areEqual((Object) this.f92384d, (Object) aVar.f92384d);
        }

        @C12579k
        /* renamed from: g */
        public final String mo112386g() {
            return this.f92383c;
        }

        @C12579k
        /* renamed from: h */
        public final String mo112387h() {
            return this.f92382b;
        }

        public int hashCode() {
            return (((((this.f92381a.hashCode() * 31) + this.f92382b.hashCode()) * 31) + this.f92383c.hashCode()) * 31) + this.f92384d.hashCode();
        }

        @C12579k
        /* renamed from: i */
        public final C11289a<C11079d2> mo112389i() {
            return this.f92384d;
        }

        @C12579k
        /* renamed from: j */
        public final String mo112390j() {
            return this.f92381a;
        }

        @C12579k
        public String toString() {
            String str = this.f92381a;
            String str2 = this.f92382b;
            String str3 = this.f92383c;
            C11289a<C11079d2> aVar = this.f92384d;
            return "AlertDialogData(title=" + str + ", message=" + str2 + ", confirmationText=" + str3 + ", onConfirmationClick=" + aVar + ")";
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.design.components.compose.f$b */
    public static final class C36986b implements C36984f {

        /* renamed from: g */
        public static final int f92385g = 0;
        @C12579k

        /* renamed from: a */
        public final String f92386a;
        @C12579k

        /* renamed from: b */
        public final String f92387b;
        @C12579k

        /* renamed from: c */
        public final String f92388c;
        @C12579k

        /* renamed from: d */
        public final String f92389d;
        @C12579k

        /* renamed from: e */
        public final C11289a<C11079d2> f92390e;
        @C12579k

        /* renamed from: f */
        public final C11289a<C11079d2> f92391f;

        public C36986b(@C12579k String str, @C12579k String str2, @C12579k String str3, @C12579k String str4, @C12579k C11289a<C11079d2> aVar, @C12579k C11289a<C11079d2> aVar2) {
            Intrinsics.checkNotNullParameter(str, "title");
            Intrinsics.checkNotNullParameter(str2, "message");
            Intrinsics.checkNotNullParameter(str3, "confirmationText");
            Intrinsics.checkNotNullParameter(str4, "cancellationText");
            Intrinsics.checkNotNullParameter(aVar, "onConfirmationClick");
            Intrinsics.checkNotNullParameter(aVar2, "onCancellationClick");
            this.f92386a = str;
            this.f92387b = str2;
            this.f92388c = str3;
            this.f92389d = str4;
            this.f92390e = aVar;
            this.f92391f = aVar2;
        }

        /* renamed from: h */
        public static /* synthetic */ C36986b m151710h(C36986b bVar, String str, String str2, String str3, String str4, C11289a<C11079d2> aVar, C11289a<C11079d2> aVar2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = bVar.f92386a;
            }
            if ((i & 2) != 0) {
                str2 = bVar.f92387b;
            }
            String str5 = str2;
            if ((i & 4) != 0) {
                str3 = bVar.f92388c;
            }
            String str6 = str3;
            if ((i & 8) != 0) {
                str4 = bVar.f92389d;
            }
            String str7 = str4;
            if ((i & 16) != 0) {
                aVar = bVar.f92390e;
            }
            C11289a<C11079d2> aVar3 = aVar;
            if ((i & 32) != 0) {
                aVar2 = bVar.f92391f;
            }
            return bVar.mo112399g(str, str5, str6, str7, aVar3, aVar2);
        }

        @C12579k
        /* renamed from: a */
        public final String mo112392a() {
            return this.f92386a;
        }

        @C12579k
        /* renamed from: b */
        public final String mo112393b() {
            return this.f92387b;
        }

        @C12579k
        /* renamed from: c */
        public final String mo112394c() {
            return this.f92388c;
        }

        @C12579k
        /* renamed from: d */
        public final String mo112395d() {
            return this.f92389d;
        }

        @C12579k
        /* renamed from: e */
        public final C11289a<C11079d2> mo112396e() {
            return this.f92390e;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C36986b)) {
                return false;
            }
            C36986b bVar = (C36986b) obj;
            return Intrinsics.areEqual((Object) this.f92386a, (Object) bVar.f92386a) && Intrinsics.areEqual((Object) this.f92387b, (Object) bVar.f92387b) && Intrinsics.areEqual((Object) this.f92388c, (Object) bVar.f92388c) && Intrinsics.areEqual((Object) this.f92389d, (Object) bVar.f92389d) && Intrinsics.areEqual((Object) this.f92390e, (Object) bVar.f92390e) && Intrinsics.areEqual((Object) this.f92391f, (Object) bVar.f92391f);
        }

        @C12579k
        /* renamed from: f */
        public final C11289a<C11079d2> mo112398f() {
            return this.f92391f;
        }

        @C12579k
        /* renamed from: g */
        public final C36986b mo112399g(@C12579k String str, @C12579k String str2, @C12579k String str3, @C12579k String str4, @C12579k C11289a<C11079d2> aVar, @C12579k C11289a<C11079d2> aVar2) {
            Intrinsics.checkNotNullParameter(str, "title");
            Intrinsics.checkNotNullParameter(str2, "message");
            Intrinsics.checkNotNullParameter(str3, "confirmationText");
            Intrinsics.checkNotNullParameter(str4, "cancellationText");
            Intrinsics.checkNotNullParameter(aVar, "onConfirmationClick");
            Intrinsics.checkNotNullParameter(aVar2, "onCancellationClick");
            return new C36986b(str, str2, str3, str4, aVar, aVar2);
        }

        public int hashCode() {
            return (((((((((this.f92386a.hashCode() * 31) + this.f92387b.hashCode()) * 31) + this.f92388c.hashCode()) * 31) + this.f92389d.hashCode()) * 31) + this.f92390e.hashCode()) * 31) + this.f92391f.hashCode();
        }

        @C12579k
        /* renamed from: i */
        public final String mo112401i() {
            return this.f92389d;
        }

        @C12579k
        /* renamed from: j */
        public final String mo112402j() {
            return this.f92388c;
        }

        @C12579k
        /* renamed from: k */
        public final String mo112403k() {
            return this.f92387b;
        }

        @C12579k
        /* renamed from: l */
        public final C11289a<C11079d2> mo112404l() {
            return this.f92391f;
        }

        @C12579k
        /* renamed from: m */
        public final C11289a<C11079d2> mo112405m() {
            return this.f92390e;
        }

        @C12579k
        /* renamed from: n */
        public final String mo112406n() {
            return this.f92386a;
        }

        @C12579k
        public String toString() {
            String str = this.f92386a;
            String str2 = this.f92387b;
            String str3 = this.f92388c;
            String str4 = this.f92389d;
            C11289a<C11079d2> aVar = this.f92390e;
            C11289a<C11079d2> aVar2 = this.f92391f;
            return "ConfirmationDialogData(title=" + str + ", message=" + str2 + ", confirmationText=" + str3 + ", cancellationText=" + str4 + ", onConfirmationClick=" + aVar + ", onCancellationClick=" + aVar2 + ")";
        }
    }
}
