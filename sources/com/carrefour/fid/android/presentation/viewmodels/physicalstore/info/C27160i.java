package com.carrefour.fid.android.presentation.viewmodels.physicalstore.info;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.domain.models.service.models.StoreService;
import com.carrefour.fid.android.shared.constant.C28531e0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.i */
public interface C27160i {

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.i$a */
    public static final class C27161a implements C27160i {
        @C12579k

        /* renamed from: a */
        public static final C27161a f66033a = new C27161a();

        /* renamed from: b */
        public static final int f66034b = 0;
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.i$b */
    public static final class C27162b implements C27160i {
        @C12579k

        /* renamed from: a */
        public static final C27162b f66035a = new C27162b();

        /* renamed from: b */
        public static final int f66036b = 0;
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.i$c */
    public static final class C27163c implements C27160i {

        /* renamed from: b */
        public static final int f66037b = 8;
        @C12579k

        /* renamed from: a */
        public final List<StoreService> f66038a;

        public C27163c(@C12579k List<StoreService> list) {
            Intrinsics.checkNotNullParameter(list, C28531e0.f69095y);
            this.f66038a = list;
        }

        /* renamed from: c */
        public static /* synthetic */ C27163c m114734c(C27163c cVar, List<StoreService> list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = cVar.f66038a;
            }
            return cVar.mo78951b(list);
        }

        @C12579k
        /* renamed from: a */
        public final List<StoreService> mo78950a() {
            return this.f66038a;
        }

        @C12579k
        /* renamed from: b */
        public final C27163c mo78951b(@C12579k List<StoreService> list) {
            Intrinsics.checkNotNullParameter(list, C28531e0.f69095y);
            return new C27163c(list);
        }

        @C12579k
        /* renamed from: d */
        public final List<StoreService> mo78952d() {
            return this.f66038a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C27163c) && Intrinsics.areEqual((Object) this.f66038a, (Object) ((C27163c) obj).f66038a);
        }

        public int hashCode() {
            return this.f66038a.hashCode();
        }

        @C12579k
        public String toString() {
            List<StoreService> list = this.f66038a;
            return "Ready(services=" + list + ")";
        }
    }
}
