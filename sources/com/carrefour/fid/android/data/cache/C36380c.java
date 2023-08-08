package com.carrefour.fid.android.data.cache;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.domain.models.C38039i;
import com.carrefour.fid.android.shared.base.C28484f;
import com.carrefour.fid.android.shared.constant.C28547h2;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.data.cache.c */
public final class C36380c extends C28484f<List<? extends C38039i>> {
    @C12579k

    /* renamed from: h */
    public static final C36381a f89985h = new C36381a((DefaultConstructorMarker) null);

    /* renamed from: i */
    public static final int f89986i = 0;

    /* renamed from: j */
    public static final long f89987j = 14400000;
    @C12579k

    /* renamed from: g */
    public final String f89988g;

    /* renamed from: com.carrefour.fid.android.data.cache.c$a */
    public static final class C36381a {
        public /* synthetic */ C36381a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C36381a() {
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C36380c(List list, String str, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, str, (i & 4) != 0 ? f89987j : j);
    }

    /* renamed from: d */
    public final boolean mo108646d(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, C28547h2.f69320h);
        if (!Intrinsics.areEqual((Object) this.f89988g, (Object) str) || !mo83405c()) {
            return false;
        }
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C36380c(@C12579k List<C38039i> list, @C12579k String str, long j) {
        super(list, j);
        Intrinsics.checkNotNullParameter(list, "data");
        Intrinsics.checkNotNullParameter(str, C28547h2.f69320h);
        this.f89988g = str;
    }
}
