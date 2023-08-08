package com.carrefour.fid.android.presentation.p035ui.account.consent;

import androidx.annotation.C0324b1;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.domain.models.consent.ChoiceOptIn;
import com.carrefour.fid.android.domain.models.consent.ConsentName;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.presentation.ui.account.consent.l */
public abstract class C22934l {

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.ui.account.consent.l$a */
    public static final class C22935a extends C22934l {

        /* renamed from: c */
        public static final int f58530c = 8;
        @C12579k

        /* renamed from: a */
        public final List<ConsentName> f58531a;
        @C12579k

        /* renamed from: b */
        public final ChoiceOptIn f58532b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22935a(@C12579k List<? extends ConsentName> list, @C12579k ChoiceOptIn choiceOptIn) {
            super((DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(list, "consentNames");
            Intrinsics.checkNotNullParameter(choiceOptIn, "choice");
            this.f58531a = list;
            this.f58532b = choiceOptIn;
        }

        /* renamed from: d */
        public static /* synthetic */ C22935a m103293d(C22935a aVar, List<ConsentName> list, ChoiceOptIn choiceOptIn, int i, Object obj) {
            if ((i & 1) != 0) {
                list = aVar.f58531a;
            }
            if ((i & 2) != 0) {
                choiceOptIn = aVar.f58532b;
            }
            return aVar.mo67446c(list, choiceOptIn);
        }

        @C12579k
        /* renamed from: a */
        public final List<ConsentName> mo67444a() {
            return this.f58531a;
        }

        @C12579k
        /* renamed from: b */
        public final ChoiceOptIn mo67445b() {
            return this.f58532b;
        }

        @C12579k
        /* renamed from: c */
        public final C22935a mo67446c(@C12579k List<? extends ConsentName> list, @C12579k ChoiceOptIn choiceOptIn) {
            Intrinsics.checkNotNullParameter(list, "consentNames");
            Intrinsics.checkNotNullParameter(choiceOptIn, "choice");
            return new C22935a(list, choiceOptIn);
        }

        @C12579k
        /* renamed from: e */
        public final ChoiceOptIn mo67447e() {
            return this.f58532b;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C22935a)) {
                return false;
            }
            C22935a aVar = (C22935a) obj;
            return Intrinsics.areEqual((Object) this.f58531a, (Object) aVar.f58531a) && this.f58532b == aVar.f58532b;
        }

        @C12579k
        /* renamed from: f */
        public final List<ConsentName> mo67449f() {
            return this.f58531a;
        }

        public int hashCode() {
            return (this.f58531a.hashCode() * 31) + this.f58532b.hashCode();
        }

        @C12579k
        public String toString() {
            List<ConsentName> list = this.f58531a;
            ChoiceOptIn choiceOptIn = this.f58532b;
            return "ConsentsChanged(consentNames=" + list + ", choice=" + choiceOptIn + ")";
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.ui.account.consent.l$b */
    public static final class C22936b extends C22934l {

        /* renamed from: b */
        public static final int f58533b = 0;

        /* renamed from: a */
        public final int f58534a;

        public C22936b(@C0324b1 int i) {
            super((DefaultConstructorMarker) null);
            this.f58534a = i;
        }

        /* renamed from: c */
        public static /* synthetic */ C22936b m103299c(C22936b bVar, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = bVar.f58534a;
            }
            return bVar.mo67453b(i);
        }

        /* renamed from: a */
        public final int mo67452a() {
            return this.f58534a;
        }

        @C12579k
        /* renamed from: b */
        public final C22936b mo67453b(@C0324b1 int i) {
            return new C22936b(i);
        }

        /* renamed from: d */
        public final int mo67454d() {
            return this.f58534a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C22936b) && this.f58534a == ((C22936b) obj).f58534a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f58534a);
        }

        @C12579k
        public String toString() {
            int i = this.f58534a;
            return "ErrorReceived(errorMessageRes=" + i + ")";
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.ui.account.consent.l$c */
    public static final class C22937c extends C22934l {

        /* renamed from: b */
        public static final int f58535b = 0;
        @C12579k

        /* renamed from: a */
        public final String f58536a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22937c(@C12579k String str) {
            super((DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(str, "url");
            this.f58536a = str;
        }

        /* renamed from: c */
        public static /* synthetic */ C22937c m103303c(C22937c cVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = cVar.f58536a;
            }
            return cVar.mo67459b(str);
        }

        @C12579k
        /* renamed from: a */
        public final String mo67458a() {
            return this.f58536a;
        }

        @C12579k
        /* renamed from: b */
        public final C22937c mo67459b(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "url");
            return new C22937c(str);
        }

        @C12579k
        /* renamed from: d */
        public final String mo67460d() {
            return this.f58536a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C22937c) && Intrinsics.areEqual((Object) this.f58536a, (Object) ((C22937c) obj).f58536a);
        }

        public int hashCode() {
            return this.f58536a.hashCode();
        }

        @C12579k
        public String toString() {
            String str = this.f58536a;
            return "LinkClicked(url=" + str + ")";
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.ui.account.consent.l$d */
    public static final class C22938d extends C22934l {
        @C12579k

        /* renamed from: a */
        public static final C22938d f58537a = new C22938d();

        /* renamed from: b */
        public static final int f58538b = 0;

        public C22938d() {
            super((DefaultConstructorMarker) null);
        }
    }

    public /* synthetic */ C22934l(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public C22934l() {
    }
}
