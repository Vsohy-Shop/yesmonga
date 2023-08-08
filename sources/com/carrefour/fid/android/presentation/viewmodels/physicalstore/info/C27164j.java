package com.carrefour.fid.android.presentation.viewmodels.physicalstore.info;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.domain.models.service.models.C38163l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.j */
public interface C27164j {

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.j$a */
    public static final class C27165a implements C27164j {
        @C12579k

        /* renamed from: a */
        public static final C27165a f66039a = new C27165a();

        /* renamed from: b */
        public static final int f66040b = 0;
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.j$b */
    public static final class C27166b implements C27164j {
        @C12579k

        /* renamed from: a */
        public static final C27166b f66041a = new C27166b();

        /* renamed from: b */
        public static final int f66042b = 0;
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.j$c */
    public static final class C27167c implements C27164j {

        /* renamed from: b */
        public static final int f66043b = 8;
        @C12579k

        /* renamed from: a */
        public final C38163l f66044a;

        public C27167c(@C12579k C38163l lVar) {
            Intrinsics.checkNotNullParameter(lVar, "store");
            this.f66044a = lVar;
        }

        /* renamed from: c */
        public static /* synthetic */ C27167c m114738c(C27167c cVar, C38163l lVar, int i, Object obj) {
            if ((i & 1) != 0) {
                lVar = cVar.f66044a;
            }
            return cVar.mo78957b(lVar);
        }

        @C12579k
        /* renamed from: a */
        public final C38163l mo78956a() {
            return this.f66044a;
        }

        @C12579k
        /* renamed from: b */
        public final C27167c mo78957b(@C12579k C38163l lVar) {
            Intrinsics.checkNotNullParameter(lVar, "store");
            return new C27167c(lVar);
        }

        @C12579k
        /* renamed from: d */
        public final C38163l mo78958d() {
            return this.f66044a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C27167c) && Intrinsics.areEqual((Object) this.f66044a, (Object) ((C27167c) obj).f66044a);
        }

        public int hashCode() {
            return this.f66044a.hashCode();
        }

        @C12579k
        public String toString() {
            C38163l lVar = this.f66044a;
            return "Ready(store=" + lVar + ")";
        }
    }
}
