package com.carrefour.fid.android.domain.interactors.user;

import com.carrefour.fid.android.domain.interactors.C37679f;
import com.carrefour.fid.android.domain.models.account.AccountInfo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.domain.interactors.user.e */
public interface C37878e extends C37679f<C37881c, AccountInfo> {

    /* renamed from: com.carrefour.fid.android.domain.interactors.user.e$a */
    public static final class C37879a implements C37881c {
        @C12579k

        /* renamed from: a */
        public static final C37879a f94997a = new C37879a();
    }

    /* renamed from: com.carrefour.fid.android.domain.interactors.user.e$b */
    public static final class C37880b implements C37881c {
        @C12579k

        /* renamed from: a */
        public static final C37880b f94998a = new C37880b();
    }

    /* renamed from: com.carrefour.fid.android.domain.interactors.user.e$c */
    public interface C37881c {
    }

    /* renamed from: com.carrefour.fid.android.domain.interactors.user.e$d */
    public static final class C37882d implements C37881c {
        @C12579k

        /* renamed from: a */
        public final String f94999a;

        /* renamed from: b */
        public final long f95000b;

        public C37882d(@C12579k String str, long j) {
            Intrinsics.checkNotNullParameter(str, "accessToken");
            this.f94999a = str;
            this.f95000b = j;
        }

        /* renamed from: d */
        public static /* synthetic */ C37882d m155133d(C37882d dVar, String str, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                str = dVar.f94999a;
            }
            if ((i & 2) != 0) {
                j = dVar.f95000b;
            }
            return dVar.mo115366c(str, j);
        }

        @C12579k
        /* renamed from: a */
        public final String mo115364a() {
            return this.f94999a;
        }

        /* renamed from: b */
        public final long mo115365b() {
            return this.f95000b;
        }

        @C12579k
        /* renamed from: c */
        public final C37882d mo115366c(@C12579k String str, long j) {
            Intrinsics.checkNotNullParameter(str, "accessToken");
            return new C37882d(str, j);
        }

        @C12579k
        /* renamed from: e */
        public final String mo115367e() {
            return this.f94999a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C37882d)) {
                return false;
            }
            C37882d dVar = (C37882d) obj;
            return Intrinsics.areEqual((Object) this.f94999a, (Object) dVar.f94999a) && this.f95000b == dVar.f95000b;
        }

        /* renamed from: f */
        public final long mo115369f() {
            return this.f95000b;
        }

        public int hashCode() {
            return (this.f94999a.hashCode() * 31) + Long.hashCode(this.f95000b);
        }

        @C12579k
        public String toString() {
            String str = this.f94999a;
            long j = this.f95000b;
            return "SignIn(accessToken=" + str + ", lastModificationDateJWT=" + j + ")";
        }
    }
}
