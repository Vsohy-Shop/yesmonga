package com.carrefour.fid.android.presentation.viewmodels.physicalstore;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.design.components.widgets.C37396r1;
import com.carrefour.fid.android.domain.models.service.models.C38163l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.presentation.viewmodels.physicalstore.c */
public interface C27116c {

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.physicalstore.c$a */
    public static final class C27117a implements C27116c {
        @C12579k

        /* renamed from: a */
        public static final C27117a f65950a = new C27117a();

        /* renamed from: b */
        public static final int f65951b = 0;
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.physicalstore.c$b */
    public static final class C27118b implements C27116c {
        @C12579k

        /* renamed from: a */
        public static final C27118b f65952a = new C27118b();

        /* renamed from: b */
        public static final int f65953b = 0;
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.physicalstore.c$c */
    public static final class C27119c implements C27116c {

        /* renamed from: c */
        public static final int f65954c = 8;
        @C12579k

        /* renamed from: a */
        public final C38163l f65955a;
        @C12579k

        /* renamed from: b */
        public final C37396r1 f65956b;

        public C27119c(@C12579k C38163l lVar, @C12579k C37396r1 r1Var) {
            Intrinsics.checkNotNullParameter(lVar, "store");
            Intrinsics.checkNotNullParameter(r1Var, "storeInfo");
            this.f65955a = lVar;
            this.f65956b = r1Var;
        }

        /* renamed from: d */
        public static /* synthetic */ C27119c m114634d(C27119c cVar, C38163l lVar, C37396r1 r1Var, int i, Object obj) {
            if ((i & 1) != 0) {
                lVar = cVar.f65955a;
            }
            if ((i & 2) != 0) {
                r1Var = cVar.f65956b;
            }
            return cVar.mo78845c(lVar, r1Var);
        }

        @C12579k
        /* renamed from: a */
        public final C38163l mo78843a() {
            return this.f65955a;
        }

        @C12579k
        /* renamed from: b */
        public final C37396r1 mo78844b() {
            return this.f65956b;
        }

        @C12579k
        /* renamed from: c */
        public final C27119c mo78845c(@C12579k C38163l lVar, @C12579k C37396r1 r1Var) {
            Intrinsics.checkNotNullParameter(lVar, "store");
            Intrinsics.checkNotNullParameter(r1Var, "storeInfo");
            return new C27119c(lVar, r1Var);
        }

        @C12579k
        /* renamed from: e */
        public final C38163l mo78846e() {
            return this.f65955a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C27119c)) {
                return false;
            }
            C27119c cVar = (C27119c) obj;
            return Intrinsics.areEqual((Object) this.f65955a, (Object) cVar.f65955a) && Intrinsics.areEqual((Object) this.f65956b, (Object) cVar.f65956b);
        }

        @C12579k
        /* renamed from: f */
        public final C37396r1 mo78848f() {
            return this.f65956b;
        }

        public int hashCode() {
            return (this.f65955a.hashCode() * 31) + this.f65956b.hashCode();
        }

        @C12579k
        public String toString() {
            C38163l lVar = this.f65955a;
            C37396r1 r1Var = this.f65956b;
            return "Ready(store=" + lVar + ", storeInfo=" + r1Var + ")";
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.physicalstore.c$d */
    public static final class C27120d implements C27116c {
        @C12579k

        /* renamed from: a */
        public static final C27120d f65957a = new C27120d();

        /* renamed from: b */
        public static final int f65958b = 0;
    }
}
