package com.carrefour.fid.android.design.components.widgets;

import androidx.compose.runtime.internal.C8567o;
import com.urbanairship.iam.C9127a0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.design.components.widgets.t */
public final class C37409t {

    /* renamed from: c */
    public static final int f94015c = 0;
    @C12579k

    /* renamed from: a */
    public final String f94016a;
    @C12580l

    /* renamed from: b */
    public final String f94017b;

    public C37409t(@C12579k String str, @C12580l String str2) {
        Intrinsics.checkNotNullParameter(str, C9127a0.f24709d);
        this.f94016a = str;
        this.f94017b = str2;
    }

    @C12579k
    /* renamed from: a */
    public final String mo114049a() {
        return this.f94016a;
    }

    @C12580l
    /* renamed from: b */
    public final String mo114050b() {
        return this.f94017b;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C37409t(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2);
    }
}
