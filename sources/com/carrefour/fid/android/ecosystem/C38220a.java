package com.carrefour.fid.android.ecosystem;

import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.ecosystem.a */
public final class C38220a {

    /* renamed from: d */
    public static final int f96848d = 8;
    @C12579k

    /* renamed from: a */
    public String f96849a;
    @C12579k

    /* renamed from: b */
    public String f96850b = "";

    /* renamed from: c */
    public int f96851c;

    public C38220a(@C12579k String str, @C12580l String str2, int i) {
        Intrinsics.checkNotNullParameter(str, "name");
        this.f96849a = str;
        this.f96851c = i;
        if (str2 != null) {
            this.f96850b = str2;
        }
    }

    @C12579k
    /* renamed from: a */
    public final String mo119641a() {
        return this.f96849a;
    }

    @C12579k
    /* renamed from: b */
    public final String mo119642b() {
        return this.f96850b;
    }

    /* renamed from: c */
    public final int mo119643c() {
        return this.f96851c;
    }

    /* renamed from: d */
    public final void mo119644d(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f96849a = str;
    }

    /* renamed from: e */
    public final void mo119645e(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f96850b = str;
    }

    /* renamed from: f */
    public final void mo119646f(int i) {
        this.f96851c = i;
    }
}
